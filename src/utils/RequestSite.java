package utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.util.ByteArrayBuffer;

import android.util.Log;


public class RequestSite {
	public String response;
	
	public void getSiteResponse(String url_string){
		try{
			Log.i("uri", url_string);
			URL aURL = new URL(url_string);
			final HttpURLConnection connection = (HttpURLConnection) aURL.openConnection();
			InputStream aInputStream = connection.getInputStream();
			BufferedInputStream aBufferedInputStream = new BufferedInputStream(aInputStream);
			ByteArrayBuffer aByteArrayBuffer = new ByteArrayBuffer(50);
			int current = 0;
			while ((current = aBufferedInputStream.read()) != -1) {
				aByteArrayBuffer.append((byte) current);
			}
			response = new String(aByteArrayBuffer.toByteArray());               
		} catch (IOException e) {
			Log.d("IOException", e.toString());
		} 
	}

}
