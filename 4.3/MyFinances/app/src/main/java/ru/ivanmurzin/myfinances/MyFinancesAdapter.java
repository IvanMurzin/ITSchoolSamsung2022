package ru.ivanmurzin.myfinances;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyFinancesAdapter extends RecyclerView.Adapter<MyFinancesAdapter.MyViewHolder> {

    private final List<Finances> list;

    public MyFinancesAdapter(List<Finances> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.recycler_item,
                parent,
                false
        );
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Finances finances = list.get(position);
        holder.fullName.setText(finances.getFullName());
        holder.amount.setText(String.valueOf(finances.getAmount()));
        holder.date.setText(finances.getDate());
        if (!finances.isSign()) holder.sign.setText("-");

        holder.item.setOnLongClickListener(view -> {
            int index = list.indexOf(finances);
            if (index < 0) return false;
            list.remove(finances);
            notifyItemRemoved(index);
            return true;
        });

        holder.item.setOnClickListener(view -> {
            int index = list.indexOf(finances);
            if (index < 0) return;
            list.set(index, Finances.getRandom());
            notifyItemChanged(index);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView fullName;
        private final TextView amount;
        private final TextView sign;
        private final TextView date;
        private final RelativeLayout item;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            fullName = itemView.findViewById(R.id.fullName);
            amount = itemView.findViewById(R.id.amount);
            sign = itemView.findViewById(R.id.sign);
            date = itemView.findViewById(R.id.date);
            item = itemView.findViewById(R.id.item);
        }
    }
}
