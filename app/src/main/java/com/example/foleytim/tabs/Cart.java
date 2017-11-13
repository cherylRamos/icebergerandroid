package com.example.foleytim.tabs;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramosmac on 13/11/2017.
 */

public class Cart {

    private static List<JSONObject> cart = new ArrayList<>();

    public static  void addToCart(JSONObject item) {
        cart.add(item);
    }
}
