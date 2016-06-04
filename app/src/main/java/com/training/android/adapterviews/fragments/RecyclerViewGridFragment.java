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

public class RecyclerViewGridFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public static RecyclerViewGridFragment newInstance() {
        return new RecyclerViewGridFragment();
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

        // TODO: Create the adapter

        // TODO: Set the adapter to the adapter view
    }
}
