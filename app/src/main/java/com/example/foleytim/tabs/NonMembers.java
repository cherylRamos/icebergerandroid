package com.example.foleytim.tabs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;

public class NonMembers extends AppCompatActivity {
    Button signOut,pastOrders,newOrders,myBurgers;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonmembers);

        signOut = (Button)findViewById(R.id.signOut);
        pastOrders = (Button)findViewById(R.id.pastOrders);
        newOrders = (Button)findViewById(R.id.newOrders);
        myBurgers = (Button)findViewById(R.id.myBurgers);
        //signOut button
//        signOut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                }
//
//        });
        //signOut button
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //     setContentView(R.layout.signout);
            }

        });
        //newOrders button
        newOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.menu);
            }

        });
        //pastOrders button
        pastOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.pastorders);
            }

        });
        //myBurgers button
        myBurgers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.myburgers);
                //     setContentView(R.layout.m);
            }

        });
//        //myBurgers button
//        myBurgers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//
//        });
    }
}
