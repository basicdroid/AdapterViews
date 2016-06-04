package com.training.android.adapterviews.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.training.android.adapterviews.R;
import com.training.android.adapterviews.model.Movie;

import java.util.List;

public class MoviesRecyclerAdapter {

    private Context     mContext;
    private int         mLayoutId;
    private List<Movie> mMovies;

    public MoviesRecyclerAdapter(Context context, int layoutId, List<Movie> movies) {
        mContext = context;
        mLayoutId = layoutId;
        mMovies = movies;
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgMovie;
        public TextView  tvName;
        public TextView  tvGenre;

        public MovieViewHolder(View itemView) {
            super(itemView);

            imgMovie = (ImageView) itemView.findViewById(R.id.imgMovie);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvGenre = (TextView) itemView.findViewById(R.id.tvGenre);
        }
    }
}
