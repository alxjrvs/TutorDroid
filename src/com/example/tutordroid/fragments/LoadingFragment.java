package com.example.tutordroid.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.tutordroid.R;

public class LoadingFragment extends SherlockFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	

	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saved) {
		View v = inflater.inflate(R.layout.fragment_loading, group, false);
	        return v;
	    }
}
