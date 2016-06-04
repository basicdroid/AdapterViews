package com.training.android.adapterviews.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.training.android.adapterviews.R;
import com.training.android.adapterviews.model.Movie;

import java.util.List;

public class MoviesRecyclerAdapter extends RecyclerView.Adapter<MoviesRecyclerAdapter.MovieViewHolder> {

    private Context     mContext;
    private int         mLayoutId;
    private List<Movie> mMovies;

    public MoviesRecyclerAdapter(Context context, int layoutId, List<Movie> movies) {
        mContext = context;
        mLayoutId = layoutId;
        mMovies = movies;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie = mMovies.get(position);

        if (movie != null) {
            if (holder.imgMovie != null) {
                holder.imgMovie.setImageResource(movie.getImageId());
            }
            if (holder.tvName != null) {
                holder.tvName.setText(movie.getName());
            }
            if (holder.tvGenre != null) {
                holder.tvGenre.setText(movie.getGenre());
            }
        }
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
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
