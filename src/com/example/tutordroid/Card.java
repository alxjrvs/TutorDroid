package com.example.tutordroid;

import java.text.ParseException;

import org.json.JSONException;
import org.json.JSONObject;


public class Card {
	public String name;
	public String cost;
	public String super_types; 
	public String card_types; 
	public String sub_types;
	public String card_text;
	public String colors;
	public String color_indicator;
	public String color_identity;
	public String power;
	public String toughness;
	
	public Card(JSONObject jsonCard) throws JSONException, ParseException {
		name 				= jsonCard.getString("name");
		cost 				= jsonCard.getString("cost");
		super_types 		= jsonCard.getString("super_types");
		card_types 			= jsonCard.getString("card_types");
		sub_types           = jsonCard.getString("sub_types");
		card_text			= jsonCard.getString("card_text");
		colors				= jsonCard.getString("colors");
		color_indicator     = jsonCard.getString("color_indicator");
		color_identity     	= jsonCard.getString("color_identity");
		power				= jsonCard.getString("power");
		toughness			= jsonCard.getString("toughness");	
	}
	
}
