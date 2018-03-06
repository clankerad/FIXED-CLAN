package com.clan.clan.Fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.clan.clan.Activities.VenueActivity;
import com.clan.clan.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Kresna on 27/02/2018.
 */

public class Tab2VenueList extends ListFragment implements AdapterView.OnItemClickListener{
    // Array of strings storing country names
    String[] countries = new String[] {
            "Daeng",
            "MCD",
            "KFC",
            "Upnormal",
            "Indomaret",
            "Alfamart",
            "Nynyo",
            "Nirmala",
            "Kober",
            "Spesial Sambal"
    };

    // Array of integers points to images stored in /res/drawable/
    int[] flags = new int[]{
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground
    };

    // Array of strings to store currencies
    String[] currency = new String[]{
            "Deskripsi Daeng",
            "Deskripsi MCD",
            "Deskripsi KFC",
            "Deskripsi Upnormal",
            "Deskripsi Indomaret",
            "Deskripsi Alfamart",
            "Deskripsi Nynyo",
            "Deskripsi Nirmala",
            "Deskripsi Kober",
            "Deskripsi Spesial Sambal"
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3_lounge,container,false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        // Each row in the list stores country name, currency and flag
        super.onActivityCreated(savedInstanceState);
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 10; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("txt", "Nama Venue : " + countries[i]);
            hm.put("cur", "Deskripsi : " + currency[i]);
            hm.put("flag", Integer.toString(flags[i]));
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = {"flag", "txt", "cur"};

        // Ids of views in listview_layout
        int[] to = {R.id.flag, R.id.txt, R.id.cur};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent Venue = new Intent(getActivity(), VenueActivity.class);
        startActivity(Venue);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}
