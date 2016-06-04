package com.training.android.adapterviews.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.training.android.adapterviews.R;
import com.training.android.adapterviews.model.Movie;

import java.util.List;

public class MoviesAdapter extends ArrayAdapter<Movie> {

    private Context     mContext;
    private int         mLayoutId;
    private List<Movie> mMovies;

    public MoviesAdapter(Context context, int resource, List<Movie> movies) {
        super(context, resource, movies);

        mContext = context;
        mLayoutId = resource;
        mMovies = movies;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {
            // Inflate the layout
            convertView = LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);

            // Create the ViewHolder object to initialize all the views in the convert view
            holder = new ViewHolder(convertView);

            // Set the view holder as the tag of the convert view
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Set the movie data
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

        return convertView;
    }

    private static class ViewHolder {
        public ImageView imgMovie;
        public TextView  tvName;
        public TextView  tvGenre;

        public ViewHolder(View view) {
            imgMovie = (ImageView) view.findViewById(R.id.imgMovie);
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvGenre = (TextView) view.findViewById(R.id.tvGenre);
        }
    }
}
