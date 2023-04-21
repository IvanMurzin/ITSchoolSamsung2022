package ru.ivanmurzin.rickandmorty.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.ivanmurzin.rickandmorty.R;
import ru.ivanmurzin.rickandmorty.model.response.Character;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private List<Character> data;

    public Adapter(List<Character> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.character_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        final Character character = data.get(position);
        holder.name.setText(character.name);
        holder.status.setText(character.status);
        holder.species.setText(character.species);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class Holder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView status;
        public TextView species;

        public Holder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            status = itemView.findViewById(R.id.status);
            species = itemView.findViewById(R.id.species);
        }
    }
}
