package com.example.foleytim.tabs;

import android.os.AsyncTask;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class JSONGrabber extends AsyncTask<String, Void, JSONObject> {
    public JSONGrabber(String url) {
        super();
        this.execute("http://10.140.124.121/iceberger_backend/api.php?" + url);
    }

    @Override
    protected JSONObject doInBackground(String... urls) {
        try {
            URL url = new URL(urls[0]);

            URLConnection conn = url.openConnection();

            HttpURLConnection httpConn = (HttpURLConnection) conn;
            httpConn.setAllowUserInteraction(false);
            httpConn.setInstanceFollowRedirects(true);
            httpConn.setRequestMethod("GET");
            httpConn.connect();

            InputStream is = httpConn.getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();

            String line = "";
            while((line = reader.readLine()) != null) {
                sb.append(line+"\n");
            }

            is.close();

            String output = sb.toString();

            JSONObject recieved = new JSONObject(output);

            return recieved;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
