package com.example.spookbook;

import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private Context context;
    private ArrayList<DataSetGet> listBook;

    public Adapter(Context context, ArrayList<DataSetGet> listGame) {
        this.context = context;
        this.listBook = listGame;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final DataSetGet data = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(data.getImage())
                .apply(new RequestOptions().override(75,75))
                .into(holder.ivCover);
        holder.tvTitle.setText(data.getTitle());
        holder.tvAuthor.setText("Author : " + data.getAuthor());

        holder.cvLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.cvLayout.getContext(), "Now showing " + holder.tvTitle.getText().toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra(DetailActivity.EXTRA_TITLE, data.getTitle());
                intent.putExtra(DetailActivity.EXTRA_COVER, data.getImage());
                intent.putExtra(DetailActivity.EXTRA_DESCRIPTION, data.getDescription());
                intent.putExtra(DetailActivity.EXTRA_AUTHOR, data.getAuthor());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cvLayout;
        ImageView ivCover;
        TextView tvTitle, tvAuthor;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            cvLayout = itemView.findViewById(R.id.cv_layout);
            ivCover = itemView.findViewById(R.id.iv_cover);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvAuthor = itemView.findViewById(R.id.tv_author);

        }
    }
}
