package com.training.android.adapterviews.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.training.android.adapterviews.R;
import com.training.android.adapterviews.controllers.MoviesController;

public class GridViewFragment extends Fragment {

    private GridView mGridView;

    private MoviesController mController;

    public static GridViewFragment newInstance() {
        return new GridViewFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mController = new MoviesController();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid_view, container, false);
        mGridView = (GridView) view.findViewById(R.id.gridView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // Create the adapter
    }
}
