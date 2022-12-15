package ru.ivanmurzin.newsapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import ru.ivanmurzin.newsapplication.CommentActivity;
import ru.ivanmurzin.newsapplication.R;
import ru.ivanmurzin.newsapplication.databinding.ListItemBinding;
import ru.ivanmurzin.newsapplication.model.News;

public class MyNewsAdapter extends ArrayAdapter<News> {
    private final News[] data;

    public MyNewsAdapter(@NonNull Context context, News[] data) {
        super(context, R.layout.list_item);
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        News news = data[position];
        ListItemBinding binding = ListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        binding.newsText.setText(news.getText());
        binding.likeCount.setText(String.valueOf(news.getLikes()));
        binding.commentCount.setText(String.valueOf(news.getComments()));
        binding.repostCount.setText(String.valueOf(news.getReposts()));
        binding.newsImage.setImageResource(news.getImageResourceId());

        binding.likeIcon.setImageResource(news.isLiked() ? R.drawable.liked : R.drawable.not_liked);

        binding.likeLayout.setOnClickListener(view -> {
            news.like();
            notifyDataSetInvalidated();
        });
        binding.commentLayout.setOnClickListener(view -> {
            getContext().startActivity(new Intent(getContext(), CommentActivity.class));
        });
        binding.repostLayout.setOnClickListener(view -> {
            Toast.makeText(getContext(), "Reposts: " + news.getReposts(), Toast.LENGTH_SHORT).show();
        });
        return binding.getRoot();
    }
}
