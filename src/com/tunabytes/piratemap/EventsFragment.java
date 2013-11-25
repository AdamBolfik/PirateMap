package com.tunabytes.piratemap;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class EventsFragment extends Fragment {

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_events, container, false);
		
		ListView listView = (ListView) rootView.findViewById(R.id.events_list);
		EventAdapter eventAdapter = new EventAdapter();
		listView.setAdapter(eventAdapter);

        return rootView;
    }
	
}
