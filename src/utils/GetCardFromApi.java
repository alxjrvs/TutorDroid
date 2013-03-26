package utils;

import java.text.ParseException;

import org.json.JSONException;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.util.Log;

import com.example.tutordroid.Card;

public class GetCardFromApi extends AsyncTask<String, String, Card> {
	public Card shownCard;
	public CardCallback callback;

	public GetCardFromApi(CardCallback callback){
		this.callback = callback;
	}
	
	@Override
	protected Card doInBackground(String...urls)  {
		String url_string = urls[0];
		Log.i("IncomingUrl", url_string);
		RequestSite result = new RequestSite();
		result.getSiteResponse(url_string);
		String response = result.response;
		Log.i("Response String", response);
		JSONObject jsonCard = null;
		try {
			jsonCard = new JSONObject(response);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Card shownCard = null;
		try {
			shownCard = new Card(jsonCard);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shownCard;
	} 
	
	protected void onPostExecute(Card shownCard) {
		if (callback != null){
            callback.onCardTaskComplete(shownCard);
        }
	}
}
