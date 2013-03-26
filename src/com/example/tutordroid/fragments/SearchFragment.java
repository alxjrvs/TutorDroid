package com.example.tutordroid.fragments;

import utils.CardCallback;
import utils.GetCardFromApi;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.tutordroid.Card;
import com.example.tutordroid.R;

public class SearchFragment extends SherlockFragment implements OnClickListener, CardCallback {
	private EditText cardname;
	private Button searchbutton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saved) {
		View v = inflater.inflate(R.layout.fragment_search, group, false);
	       bindViews(v);
	        return v;
	    }
	
	private void bindViews(View v){
		cardname = (EditText) v.findViewById(R.id.card_input_box);
		searchbutton = (Button) v.findViewById(R.id.card_search_button);
		searchbutton.setOnClickListener(this);
	}
	
	public void onCardTaskComplete(Card shownCard){
		Log.i("Card", shownCard.name.toString());
		FragmentTransaction ft = getSherlockActivity().getSupportFragmentManager().beginTransaction();
		CardFragment.current_card = shownCard;
		ft.replace(android.R.id.content, new CardFragment());
		ft.commit();
	}
	
	@Override
	public void onClick(View v) {
		if (v == searchbutton) {
			search();
		}
	}
	
	private void search() {
		GetCardFromApi request = new GetCardFromApi(this);
		String url =  "http://fm-tutor.herokuapp.com/cards/" + Uri.encode( cardname.getText().toString() ) + ".json";
		request.execute(url);
	}
}
