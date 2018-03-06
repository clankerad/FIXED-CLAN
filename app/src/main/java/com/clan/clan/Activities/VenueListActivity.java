package com.clan.clan.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.clan.clan.Adapter.VenueListTabAdapter;
import com.clan.clan.Fragments.Tab1VenueList;
import com.clan.clan.Fragments.Tab2VenueList;
import com.clan.clan.Fragments.Tab3VenueList;
import com.clan.clan.Fragments.Tab4VenueList;
import com.clan.clan.R;

/**
 * Created by Kresna on 26/02/2018.
 */

public class VenueListActivity extends AppCompatActivity{

    private VenueListTabAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venuelist);

        mSectionsPageAdapter = new VenueListTabAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.venuelist_container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.venuelist_tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }
    private void setupViewPager(ViewPager viewPager) {
        VenueListTabAdapter adapter = new VenueListTabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1VenueList(), "Coffee Shop");
        adapter.addFragment(new Tab2VenueList(), "Night Club");
        adapter.addFragment(new Tab3VenueList(), "Lounge");
        adapter.addFragment(new Tab4VenueList(), "Karaoke");
        viewPager.setAdapter(adapter);
    }

    public static class PhotoGroup extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_photo_group);
        }
    }
}
