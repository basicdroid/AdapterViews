package com.training.android.adapterviews.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.training.android.adapterviews.R;
import com.training.android.adapterviews.adapters.MoviesRecyclerAdapter;
import com.training.android.adapterviews.controllers.MoviesController;

public class RecyclerViewListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    private MoviesController mController;

    public static RecyclerViewListFragment newInstance() {
        return new RecyclerViewListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mController = new MoviesController();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view_list, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerListView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // Unlike a ListView, a RecyclerView needs a LayoutManager to manage the positioning of its
        // items. You could define your own LayoutManager by extending the RecyclerView.LayoutManager
        // class. However, in most cases, you could simply use one of the predefined LayoutManager
        // subclasses. In our case, since we are to create a ListView, we will be using the
        // LinearLayoutManager.
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(llm);

        // Create a new intance of the adapter
        MoviesRecyclerAdapter adapter = new MoviesRecyclerAdapter(getContext(),
                R.layout.recycler_list_item, mController.getMovies());

        // Set the adapter to the adapter view
        mRecyclerView.setAdapter(adapter);
    }
}
