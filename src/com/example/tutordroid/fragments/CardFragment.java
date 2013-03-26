package com.example.tutordroid.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.tutordroid.Card;
import com.example.tutordroid.R;

public class CardFragment extends SherlockFragment {
	public static Card current_card;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saved) {
		View v = inflater.inflate(R.layout.fragment_card, group, false);
		Card card = current_card;
		setText(v, R.id.name, card.name);
		setText(v, R.id.cost, card.cost);
		setText(v, R.id.super_types, card.super_types);
		setText(v, R.id.card_types, card.card_types);
		setText(v, R.id.sub_types, card.sub_types);
		return v;
		  
	    }
	
	private void bindViews(View v){
	}
	
	public void setText(View v, int id, String text){
	    TextView field = (TextView) v.findViewById(id);
	    field.setText(text);
	  }

}
