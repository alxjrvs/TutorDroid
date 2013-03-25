package com.example.tutordroid;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.example.tutordroid.fragments.CardFragment;
import com.example.tutordroid.fragments.LoadingFragment;
import com.example.tutordroid.fragments.SearchFragment;

public class Tutor extends SherlockFragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		showLoading();
		showSearch();
		
	}

	protected void showLoading() {
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(android.R.id.content, new LoadingFragment());
		ft.commit();
	}
	protected void showSearch() {
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(android.R.id.content, new SearchFragment());
		ft.commit();
	}
	protected void showCard() {
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(android.R.id.content, new CardFragment());
		ft.commit();
	}

}
