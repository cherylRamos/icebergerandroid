package com.example.foleytim.tabs;



        import android.app.Activity;
        import android.content.SharedPreferences;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.List;


public class CartSession extends Activity {
    static SharedPreferences sp;
    ArrayList<List> cart_list;
    Double total;
    TextView totalTextView;

    public CartSession() {
        super();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //ArrayList<List> cart_list,
    public void updateCartSession( Double total){
try {
            SharedPreferences.Editor e=sp.edit();

            e.putString("cart_total",total.toString());
           // e.putString("cart_list",cart_list.toString());
            e.commit();


    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}