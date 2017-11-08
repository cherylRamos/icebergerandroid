package com.example.foleytim.tabs;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.JsonWriter;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {
Button signOut,pastOrders,newOrders,myBurgers,signUp,signUpOk,paymentViaCard,payByCash,successHome;
Button  pastOrderb1, myburgeraddb1,checkoutPay,mainmenuCreateBurger,mainmenuCheckout,bybCheckOut,pastorderCheckOut;
ImageButton pastOrderHome,mainMenuHome,myBurgerHome,myburgercontentAddToCart,pastOrderContentHome;
ImageButton checkoutCart,myburgers_contentHome,mainmenuCart,bybAddToCart,buildyourburgerback;
ImageButton pastorderAddToCart,pastorderHome,checkoutBack,pastOrderContentCart;
Button signUpCancel,SignUpOk,logInOk,newOrder,nonmembersLogIn,myBurgerContentCheckOut,pastorderb2,pastorderContentCheckOut;
ImageView logo,checkoutHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showNonMembersMenu();
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
        mainmenuCreateBurger = (Button)findViewById(R.id.mainmenuCreateBurger);
       mainMenuHome = (ImageButton)findViewById(R.id.mainMenuHome);
       mainmenuCart = (ImageButton)findViewById(R.id.mainmenuCart);
       mainmenuCheckout = (Button)findViewById(R.id.mainmenuCheckout);
        mainMenuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMain();

                //     go to nonmembers home layout
            }

        });
        mainmenuCreateBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showBuildYourBurger();

                //     go to nonmembers home layout
            }

        });
        mainmenuCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //     add to cart
            }

        });
        mainmenuCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showCheckOut();
            }

        });
    }

    public void showPastOrders() {
        setContentView(R.layout.pastorders);
        pastOrderHome = (ImageButton)findViewById(R.id.pastOrderHome);
        pastOrderb1 = (Button)findViewById(R.id.pastOrderb1);
        pastorderb2 = (Button)findViewById(R.id.pastorderb2);
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
        pastorderb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();

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

            }

        });
    }
    public void showNonMembersMenu() {
        setContentView(R.layout.activity_nonmembers);
        newOrder = (Button)findViewById(R.id.newOrder);
        nonmembersLogIn = (Button)findViewById(R.id.nonmembersLogIn);
        newOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();

            }

        });
        nonmembersLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLogIn();

            }

        });
    }
    public void showPastOrder_content() {
        setContentView(R.layout.pastorder_content);
        pastOrderContentHome = (ImageButton)findViewById(R.id.pastOrderContentHome);
        pastOrderContentCart = (ImageButton)findViewById(R.id.pastOrderContentCart);
        pastorderContentCheckOut = (Button)findViewById(R.id.pastorderContentCheckOut);
        pastorderContentCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCheckOut();

            }

        });
        pastOrderContentCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add to cart

            }

        });
        pastOrderContentHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();

            }

        });
    }
    public void showBuildYourBurger() {

        setContentView(R.layout.buildyourburger);
        bybCheckOut = (Button)findViewById(R.id.bybCheckOut);
        bybAddToCart = (ImageButton)findViewById(R.id.bybAddToCart);
        buildyourburgerback = (ImageButton)findViewById(R.id.buildyourburgerback);
        bybCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCheckOut();
            }

        });
        bybAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //addtocart
            }

        });
        buildyourburgerback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();
            }

        });
    }
    public void showCheckOut() {
        setContentView(R.layout.checkout);
        checkoutBack = (ImageButton)findViewById(R.id.checkoutBack);
        checkoutHome = (ImageView)findViewById(R.id.checkoutHome);
        checkoutPay = (Button)findViewById(R.id.checkoutPay);
        checkoutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMain();
            }

        });
        checkoutBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();
            }

        });
        checkoutPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPayment();
            }

        });
    }

    public void showLogIn() {
        setContentView(R.layout.login);
        signUp = (Button) findViewById(R.id.signUp);
        logInOk = (Button)findViewById(R.id.logInOk);
        final EditText email = (EditText)findViewById(R.id.logInEmail);
        final EditText pwd = (EditText)findViewById(R.id.logInPw);
        //start of enter key pressed

        //end of enter key pressed
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSignUp();
            }

        });
        logInOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new JSONGrabber("method=login&email=" + email.getText() + "&password=" + pwd.getText()) {
                    protected void onPostExecute(JSONObject jsonObject) {
                        Log.d("LOGCAT", jsonObject.toString());
                        try {
                            boolean status = (boolean) jsonObject.get("success");
                            if(status) {
                                //login success

                                showMain();
                            } else {
                                //login failure
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };


            }

        });
    }
    public void showMyBurger_Content() {

        setContentView(R.layout.myburgers_content);
        myburgers_contentHome = (ImageButton)findViewById(R.id.myburgers_contentHome);
        myburgercontentAddToCart = (ImageButton)findViewById(R.id.myburgercontentAddToCart);
        myBurgerContentCheckOut = (Button)findViewById(R.id.myBurgerContentCheckOut);
        myburgercontentAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // showPayment();
            }

        });
        myburgers_contentHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();
            }

        });
        myBurgerContentCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCheckOut();
            }

        });
    }
   public void showNameYourBurger() {
        setContentView(R.layout.nameyourburger);
    }
    public void showPayment() {
        setContentView(R.layout.payment);
        payByCash = (Button)findViewById(R.id.payByCash);
        paymentViaCard = (Button)findViewById(R.id.paymentViaCard);
        payByCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSuccess();
            }

        });
        paymentViaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSuccess();
            }

        });

    }
    public void showSignUp() {
        setContentView(R.layout.signup);
        signUpOk = (Button)findViewById(R.id.signUpOk);
        signUpCancel = (Button)findViewById(R.id.signUpCancel);
        final EditText name = (EditText)findViewById(R.id.signUpName);
        final EditText email = (EditText)findViewById(R.id.signUpEmail);
        final EditText pwd = (EditText)findViewById(R.id.signUpPw);
        //FeedReaderDbHelper mDbHelper = new FeedReaderDbHelper(getContext());

        signUpCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMainMenu();
            }

        });
        signUpOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new JSONGrabber("method=register&name=" + name.getText() + "&email=" + email.getText()+ "&password=" + pwd.getText()) {
                    protected void onPostExecute(JSONObject jsonObject) {
                        Log.d("LOGCAT", jsonObject.toString());
                        try {
                            boolean status = (boolean) jsonObject.get("success");
                            if(status) {
                                //login success

                                showMain();
                            } else {
                                //login failure
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };
                // showMain();
            }

        });
    }
    public void showSuccess() {
        setContentView(R.layout.success);
        successHome = (Button)findViewById(R.id.successHome);
        successHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMain();
            }

        });
    }
    public void showTracker() {
        setContentView(R.layout.tracker);
    }
}

