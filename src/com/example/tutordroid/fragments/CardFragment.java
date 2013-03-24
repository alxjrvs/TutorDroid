package com.example.tutordroid.fragments;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragment;

public class CardFragment extends SherlockFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}

}
