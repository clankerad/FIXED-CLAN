package com.clan.clan.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.clan.clan.Adapter.VenueListTabAdapter;
import com.clan.clan.Adapter.VenueTabAdapter;
import com.clan.clan.Fragments.Tab1Venue;
import com.clan.clan.Fragments.Tab1VenueList;
import com.clan.clan.Fragments.Tab2Venue;
import com.clan.clan.Fragments.Tab2VenueList;
import com.clan.clan.Fragments.Tab3Venue;
import com.clan.clan.Fragments.Tab3VenueList;
import com.clan.clan.Fragments.Tab4Venue;
import com.clan.clan.Fragments.Tab4VenueList;
import com.clan.clan.R;

/**
 * Created by Kresna on 26/02/2018.
 */

public class VenueActivity extends AppCompatActivity{

    private VenueTabAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);

        mSectionsPageAdapter = new VenueTabAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.venue_container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.venue_tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }
    private void setupViewPager(ViewPager viewPager) {
        VenueTabAdapter adapter = new VenueTabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Venue(), "Description");
        adapter.addFragment(new Tab2Venue(), "Menu");
        adapter.addFragment(new Tab3Venue(), "Promo");
        adapter.addFragment(new Tab4Venue(), "Challenge");
        viewPager.setAdapter(adapter);
    }
}
