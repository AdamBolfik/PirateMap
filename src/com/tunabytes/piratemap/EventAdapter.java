package com.tunabytes.piratemap;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EventAdapter extends BaseAdapter{

	ArrayList<Event> eventList = new ArrayList<Event>();
	
	public EventAdapter(){
	eventList.add(new Event("9/18/14", "Armstrong Greet Thingy", "Say hello to people."));
	eventList.add(new Event("9/20/14", "ACM meeting", "sign up and junk"));
	eventList.add(new Event("10/2/14", "Praise Adam", "do as he says"));
	eventList.add(new Event("10/5/14", "Worship Adam", "he is right and just"));
	eventList.add(new Event("10/6/14", "Subliminal text", "listen to it"));
	eventList.add(new Event("10/8/14", "More Headings", "I love reading!"));
	eventList.add(new Event("10/10/14", "Stuff", "glah ha ja ma"));
	eventList.add(new Event("11/11/14", "More Stuff", "sin gra tu be"));
	eventList.add(new Event("11/12/14", "I'm", "spanglish"));
	eventList.add(new Event("11/13/14", "Tired", "france sucks"));
	eventList.add(new Event("11/14/14", "Of", "information"));
	eventList.add(new Event("11/15/14", "Typing", "typo-ism"));
	eventList.add(new Event("11/16/14", "this", "siht"));
	eventList.add(new Event("12/17/14", "header", "infosdfasdg"));
	eventList.add(new Event("12/18/14", "header", "infomatics"));
	eventList.add(new Event("12/19/14", "header", "information"));
	eventList.add(new Event("12/20/14", "header", "infodfgadfh"));
	eventList.add(new Event("12/21/14", "header", "infoadfhsdghg"));
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return eventList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return getItem(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		if(view == null){
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			view = inflater.inflate(R.layout.event_list_item, parent, false);
		}
		
		Event event = eventList.get(position);
		
		TextView headerTextView = (TextView) view.findViewById(R.id.header_view);
		headerTextView.setText(event.getHeader());
		
		TextView infoTextView = (TextView) view.findViewById(R.id.info_view);
		infoTextView.setText(event.getInfo());
		
		return view;
	}
	

}
