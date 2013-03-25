package utils;

import android.os.AsyncTask;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.example.tutordroid.Card;
import com.google.gson.Gson;

public class GetCardFromApi extends AsyncTask<String, String, String> {
	public String result;
	
	@Override
	protected String doInBackground(String...urls){
		String url_string = urls[0];
		Log.i("IncomingUrl", url_string);
		RequestSite result = new RequestSite();
		result.getSiteResponse(url_string);
		String response = result.response;
		Log.i("Response String", response);
		Gson gson = new Gson();
		Card shownCard = gson.fromJson(response, Card.class);
		return response;
		
	} 
	
	protected void onPostExecute(Card shownCard) {
		FragmentTransaction ft = getSherlockActivity().getSupportFragmentManager.beginTransaction();
	}
	
	//Don't forget to Override the onPostExecute

}
