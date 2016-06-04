package com.training.android.adapterviews;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.training.android.adapterviews.fragments.GridViewFragment;
import com.training.android.adapterviews.fragments.ListViewFragment;
import com.training.android.adapterviews.fragments.RecyclerViewGridFragment;
import com.training.android.adapterviews.fragments.RecyclerViewListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Fragment fragment = null;

        if (id == R.id.action_listview) {
            fragment = ListViewFragment.newInstance();
        } else if (id == R.id.action_gridview) {
            fragment = GridViewFragment.newInstance();
        } else if (id == R.id.action_recyclerList) {
            fragment = RecyclerViewListFragment.newInstance();
        } else if (id == R.id.action_recyclerGrid) {
            fragment = RecyclerViewGridFragment.newInstance();
        }

        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
