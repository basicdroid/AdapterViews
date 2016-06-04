package com.training.android.adapterviews.adapters;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.training.android.adapterviews.R;
import com.training.android.adapterviews.model.Movie;

import java.util.List;

public class MoviesAdapter {

    private Context     mContext;
    private int         mLayoutId;
    private List<Movie> mMovies;

    public MoviesAdapter(Context context, int resource, List<Movie> movies) {
        /*super(context, resource, movies);*/

        mContext = context;
        mLayoutId = resource;
        mMovies = movies;
    }

    private static class ViewHolder {
        public ImageView imgMovie;
        public TextView  tvName;
        public TextView  tvGenre;

        public ViewHolder(View view) {
            imgMovie = (ImageView) view.findViewById(R.id.imgMovie);
        }
    }
}
