package com.example.foleytim.tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class sauceFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       final View view = inflater.inflate(R.layout.fragment_sauce, container, false);
        new JSONGrabber("method=getinventory&category=3") {
            protected void onPostExecute(JSONObject jsonObject) {
                try {
                    JSONArray arr = (JSONArray) jsonObject.get("inventory");
                    JSONObject cat = (JSONObject) arr.get(0);
                    JSONArray items = (JSONArray) cat.get("items");
                    LinearLayout list = view.findViewById(R.id.sauce_list);
                    list.removeAllViews();
                    for(int i = 0; i < items.length(); ++i) {
                        JSONObject item = (JSONObject)items.get(i);

                        Button btn = new Button(view.getContext());
                        btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"));

                        list.addView(btn);

                        Log.d("LOGCAT", item.toString());
                    }
//                    boolean status = (boolean) jsonObject.get("success");

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        };
        return view;
    }

}
