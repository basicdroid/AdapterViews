package com.training.android.adapterviews.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.training.android.adapterviews.R;
import com.training.android.adapterviews.adapters.MoviesRecyclerAdapter;
import com.training.android.adapterviews.controllers.MoviesController;

public class RecyclerViewGridFragment extends Fragment {

    private RecyclerView mRecyclerView;

    private MoviesController mController;

    public static RecyclerViewGridFragment newInstance() {
        return new RecyclerViewGridFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mController = new MoviesController();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view_grid, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerGridView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // Setup the grid layout manager
        GridLayoutManager glm = new GridLayoutManager(getContext(), 2);
        mRecyclerView.setLayoutManager(glm);
        mRecyclerView.setHasFixedSize(true);

        // Create the adapter
        MoviesRecyclerAdapter adapter = new MoviesRecyclerAdapter(getContext(),
                R.layout.recycler_grid_item, mController.getMovies());

        // Set the adapter to the adapter view
        mRecyclerView.setAdapter(adapter);
    }
}
