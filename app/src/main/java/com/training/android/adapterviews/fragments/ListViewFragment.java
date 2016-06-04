package com.training.android.adapterviews.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.training.android.adapterviews.R;
import com.training.android.adapterviews.adapters.MoviesAdapter;
import com.training.android.adapterviews.controllers.MoviesController;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListViewFragment extends Fragment {

    private MoviesController mController;
    private ListView mListView;

    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mController = new MoviesController();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);
        mListView = (ListView) view.findViewById(R.id.listView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // Creates a new instance of adapter
        MoviesAdapter adapter = new MoviesAdapter(getContext(), R.layout.list_item,
                mController.getMovies());

        // Set the adapter to the adapter view
        mListView.setAdapter(adapter);
    }
}
