package com.example.foleytim.tabs;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class fillingFragment extends Fragment {

    @SuppressLint("StaticFieldLeak")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_filling, container, false);
        final CartSession cartSess = new CartSession();
        Double total_cost = 0.00;
        TextView myBurgerContentTotal;
        new JSONGrabber("method=getinventory&category=4") {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            protected void onPostExecute(JSONObject jsonObject) {

                try {

                    JSONArray arr = (JSONArray) jsonObject.get("inventory");
                    JSONObject cat = (JSONObject) arr.get(0);
                    JSONArray items = (JSONArray) cat.get("items");
                    final LinearLayout list = view.findViewById(R.id.filling_list);
                    list.removeAllViews();

                    for(int i = 0; i < items.length(); ++i) {
                        final JSONObject item = (JSONObject)items.get(i);

                        LinearLayout row = new LinearLayout(view.getContext());
//start
                        TextView desc = new TextView(view.getContext());
                        ImageButton pic = new ImageButton(view.getContext());
                        if (item.getInt("id") == 6){

                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.jellyb));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(5);
//                          itemcost = 4.00;
                            //desc.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                            desc.setText("               "+(String)item.get("name")+"          $ "+(String)item.get("cost")+"         ");
                            desc.setTextSize(20);
                            // btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 7){
                            // itemcost = 3.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.coconut));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("               "+(String)item.get("name")+"          $ "+(String)item.get("cost")+"         ");
                            desc.setTextSize(20);
//                            desc.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }

                        if (item.getInt("id") == 8){
//                            itemcost = 6.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.mnms));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("               "+(String)item.get("name")+"          $ "+(String)item.get("cost")+"         ");
                            desc.setTextSize(20);
//                            desc.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 9){
//                            itemcost = 2.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.chochail));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("               "+(String)item.get("name")+"          $ "+(String)item.get("cost")+"         ");
                            desc.setTextSize(20);
//                            desc.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 18){
//                            itemcost = 6.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.chocchips));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("               "+(String)item.get("name")+"          $ "+(String)item.get("cost")+"         ");
                            desc.setTextSize(20);
//                            desc.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                            //pic.setImageDrawable(R.drawable.beefyboi);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 20){
                            // itemcost = 4.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.oreo));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("               "+(String)item.get("name")+"          $ "+(String)item.get("cost")+"         ");
                            desc.setTextSize(20);
//                            desc.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                            //pic.setImageDrawable(R.drawable.beefyboi);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 23){
//                            itemcost = 6.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.timtam));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("               "+(String)item.get("name")+"          $ "+(String)item.get("cost")+"         ");
                            desc.setTextSize(20);
//                            desc.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                            //pic.setImageDrawable(R.drawable.beefyboi);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 32){
                            // itemcost = 4.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.peanuts));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("               "+(String)item.get("name")+"          $ "+(String)item.get("cost")+"         ");
                            desc.setTextSize(20);
//                            desc.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                            //pic.setImageDrawable(R.drawable.beefyboi);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
//end
//                        Button btn = new Button(view.getContext());
//                        btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"));
                        final int id = Integer.parseInt(item.get("id").toString());
                        final String name = item.get("name").toString();
                        final Double cost = Double.parseDouble(item.get("cost").toString());
                        final TextView subtotal= new TextView(view.getContext());


//                        for(int j = 0; j < items.length(); ++j) {
                        pic.setOnClickListener(new View.OnClickListener() {

                            private Double qty = 0.00;


                            @Override
                            public void onClick(View view) {
                                TextView myBurgerContentTotal;
//                                    Double total_cost;
                                //myBurgerContentTotal.setText = "2.00";
                                ArrayList<List> cart_list = new ArrayList<List>();
                                List<String> list = new ArrayList<String>();
                                list.add(name);
                                qty = qty + 1;
                                //total_cost = cost;
//                                    total_cost = (cost * qty);
                                subtotal.setText(qty.toString());
                                subtotal.setTextSize(20);
                                cart_list.add(list);

                                Log.d("LOGCAT_COST", "Start cost");
                                myBurgerContentTotal = (TextView) getActivity().findViewById(R.id.myBurgerContentTotal);
                                Log.d("LOGCAT_COST", "get double");
                                Double oldCost = Double.parseDouble(myBurgerContentTotal.getText().toString());
                                Log.d("LOGCAT_COST", oldCost.toString());
                                Double total_cost = oldCost + cost;
                                myBurgerContentTotal.setText(total_cost.toString());

                                cartSess.updateCartSession(total_cost);

                            }
                        });
//                        }
                        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);
                        pic.setLayoutParams(btnParams);

                        LinearLayout.LayoutParams subtotalParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 0f);
                        subtotal.setLayoutParams(subtotalParams);

                        list.addView(row);

                        row.addView(pic);
                        row.addView(desc);
                        row.addView(subtotal);
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

