package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<String> weekForecast = new ArrayList<String>() {{
            add("Today");
            add("Tomorrow");

            add("Weds");
            add("Thurs");
            add("Fri");
            add("Sat");
            add("Today");
            add("Tomorrow");

            add("Weds");
            add("Thurs");
            add("Fri");
            add("Sat");

        }};

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(   getActivity(),R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);
//
//        ListView myList = (ListView) getActivity().findViewById(R.id.listview_forecast);
//        myList.setAdapter(myAdapter);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(myAdapter);

        return rootView;

//        return myList;
    }
}
