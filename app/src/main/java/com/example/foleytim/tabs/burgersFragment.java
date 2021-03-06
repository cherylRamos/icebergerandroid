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
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class burgersFragment extends Fragment {


    @SuppressLint("StaticFieldLeak")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_burgers, container, false);
        final CartSession cartSess = new CartSession();
        Double total_cost = 0.00;
        TextView myBurgerContentTotal;

        new JSONGrabber("method=getpresetburgers") {

            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            protected void onPostExecute(JSONObject jsonObject) {

                try {

                    JSONArray items = (JSONArray) jsonObject.get("burgers");
                    final LinearLayout list = view.findViewById(R.id.burgers_list);
                    list.removeAllViews();

                    Log.d("LOGCAT_PRESETS", items.toString());

                    for(int i = 0; i < items.length(); ++i) {
                        final JSONObject item = (JSONObject)items.get(i);
                        Double itemcost = 0.00;
                        String spaceonly = "    ";
                      //  final int id = Integer.parseInt(item.get("id").toString());
                        LinearLayout row = new LinearLayout(view.getContext());
                        TextView desc = new TextView(view.getContext());
//                        TextView spaceonly = new TextView(view.getContext());
//                        spaceonly = "   ";
                        ImageButton pic = new ImageButton(view.getContext());
                        if (item.getInt("id") == 23){

                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.i23));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(5);
                         itemcost = 4.00;
                            desc.setText("          "+(String)item.get("name")+"       $"+itemcost +"    "+"       " );
                            desc.setTextSize(20);
                           // btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 24){
                            itemcost = 3.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.i24));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("          "+(String)item.get("name")+"       $"+itemcost +"    "+"       " );
                            desc.setTextSize(20);
                          //  desc.setText((String)item.get("name")+"  $"+itemcost);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 25){
                            itemcost = 3.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.i25));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("          "+(String)item.get("name")+"       $"+itemcost +"    "+"       " );
                            desc.setTextSize(20);
                            //desc.setText((String)item.get("name")+"  $"+itemcost);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 26){
                            itemcost = 6.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.i26));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("          "+(String)item.get("name")+"       $"+itemcost +"    "+"       " );
                            desc.setTextSize(20);
                            //desc.setText((String)item.get("name")+"  $"+itemcost);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 27){
                            itemcost = 2.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.i27));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("          "+(String)item.get("name")+"       $"+itemcost +"    "+"       " );
                            desc.setTextSize(20);
                            // desc.setText((String)item.get("name")+"  $"+itemcost);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 28){
                            itemcost = 6.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.i28));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("          "+(String)item.get("name")+"       $"+itemcost +"    "+"       " );
                            desc.setTextSize(20);
                            //desc.setText((String)item.get("name")+"  $"+itemcost);
                            //pic.setImageDrawable(R.drawable.beefyboi);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                        if (item.getInt("id") == 29){
                            itemcost = 4.00;
                            pic.setImageDrawable(view.getContext().getDrawable(R.drawable.i29));
                            pic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            pic.setAdjustViewBounds(true);
                            pic.setMaxWidth(10);
                            desc.setText("          "+(String)item.get("name")+"       $"+itemcost +"    "+"       " );
                            desc.setTextSize(20);
                            // desc.setText((String)item.get("name")+"  $"+itemcost);
                            //pic.setImageDrawable(R.drawable.beefyboi);
                            //btn.setText((String)item.get("name")+"  $"+itemcost);
                            // btn.setText((String)item.get("name")+"  $"+(String)item.get("cost"))
                        }
                      //  btn.setText((String)item.get("name"));
                        final int id = Integer.parseInt(item.get("id").toString());
                        final String name = item.get("name").toString();
//                        final Double cost = Double.parseDouble(item.get("cost").toString());
                        final TextView subtotal= new TextView(view.getContext());


//                        for(int j = 0; j < items.length(); ++j) {
                        final Double finalItemcost = itemcost;
                        pic.setOnClickListener(new View.OnClickListener() {
// btn.setOnClickListener(new View.OnClickListener() {
                            private Double qty = 0.00;
                            private Double cost = finalItemcost;

                            @Override
                            public void onClick(View view) {
                                TextView myBurgerContentTotal;
                                    Double total_cost;
                                //myBurgerContentTotal.setText = "2.00";
                                ArrayList<List> cart_list = new ArrayList<List>();
                                List<String> list = new ArrayList<String>();
                                list.add(name);
                                if(list.contains(name)){
                                    Log.d("LOGCAT_LIST", "list contains " + name);
                                } else {
                                    Log.d("LOGCAT_LIST", "list does not contains " + name);
                                }

                                qty = qty + 1;
                                total_cost = cost;
                                   total_cost = (cost * qty);
                                subtotal.setText(qty.toString());
                                subtotal.setTextSize(20);
                                cart_list.add(list);

//                                Log.d("LOGCAT_COST", "Start cost");
                                myBurgerContentTotal = (TextView) getActivity().findViewById(R.id.myBurgerContentTotal);
//                                Log.d("LOGCAT_COST", "get double");
                                Double oldCost = Double.parseDouble(myBurgerContentTotal.getText().toString());
//                                Log.d("LOGCAT_COST", oldCost.toString());
                                Double ntotal_cost = oldCost + cost;
                                myBurgerContentTotal.setText(ntotal_cost.toString());

//                                cartSess.updateCartSession(total_cost);

                            }
                        });
//                        }
                        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);
                        //btn.setLayoutParams(btnParams);
                        pic.setLayoutParams(btnParams);
                        LinearLayout.LayoutParams subtotalParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 0f);
                        subtotal.setLayoutParams(subtotalParams);

                        list.addView(row);
                       // list.addView(desc);
                       // list.addView(subtotal);

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
