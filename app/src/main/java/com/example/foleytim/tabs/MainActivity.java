package com.example.foleytim.tabs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
Button signOut,pastOrders,newOrders,myBurgers;
Button  pastOrderb1, myburgeraddb1;
ImageButton pastOrderHome,mainMenuHome,myBurgerHome;
ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showMain();
    }

    public void showMain() {
        setContentView(R.layout.activity_main);

        signOut = (Button)findViewById(R.id.signOut);
        pastOrders = (Button)findViewById(R.id.pastOrders);
        newOrders = (Button)findViewById(R.id.newOrders);
        myBurgers = (Button)findViewById(R.id.myBurgers);

        //signOut button
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showNonMembersMenu();

                //     setContentView(R.layout.signout);
            }

        });
        //newOrders button
        newOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();

                            }

        });
        //pastOrders button
        pastOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPastOrders();

            }

        });
        //myBurgers button
        myBurgers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMyBurgers();
                //     setContentView(R.layout.m);
            }

        });

    }

    public void showMainMenu() {
        setContentView(R.layout.mainmenu);
       mainMenuHome = (ImageButton)findViewById(R.id.mainMenuHome);
        mainMenuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMain();

                //     go to nonmembers home layout
            }

        });
    }

    public void showPastOrders() {
        setContentView(R.layout.pastorders);
        pastOrderHome = (ImageButton)findViewById(R.id.pastOrderHome);
        pastOrderb1 = (Button)findViewById(R.id.pastOrderb1);

        pastOrderHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();

                //     go to nonmembers home layout
            }

        });
        pastOrderb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPastOrder_content();

                //     go to pastorder_content layout
            }

        });

    }

    public void showMyBurgers() {
        setContentView(R.layout.myburger);
        myBurgerHome = (ImageButton)findViewById(R.id.myBurgerHome);
        myburgeraddb1 = (Button)findViewById(R.id.myburgeraddb1);
        myBurgerHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();

                //     go to nonmembers home layout
            }

        });
        myburgeraddb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMyBurger_Content();

                //     go to pastorder_content layout
            }

        });
    }
    public void showNonMembersMenu() {
        setContentView(R.layout.activity_nonmembers);
    }
    public void showPastOrder_content() {
        setContentView(R.layout.pastorder_content);
    }
    public void showBuildYourBurger() {
        setContentView(R.layout.buildyourburger);
    }
    public void showCheckOut() {
        setContentView(R.layout.checkout);
    }
    public void showCustomBurger() {
        setContentView(R.layout.customburger);
    }
    public void showLogIn() {
        setContentView(R.layout.login);
    }
    public void showMyBurger_Content() {
        setContentView(R.layout.myburgers_content);
    }
    public void showMyOrder() {
        setContentView(R.layout.myorder);
    }
    public void showNameYourBurger() {
        setContentView(R.layout.nameyourburger);
    }
    public void showPayment() {
        setContentView(R.layout.payment);
    }
    public void showSignUp() {
        setContentView(R.layout.signup);
    }
    public void showSuccess() {
        setContentView(R.layout.success);
    }
    public void showTracker() {
        setContentView(R.layout.tracker);
    }
}

