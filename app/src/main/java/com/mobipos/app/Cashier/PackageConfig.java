package com.mobipos.app.Cashier;

import android.app.Activity;

import com.mobipos.app.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by folio on 12/15/2017.
 */

public class PackageConfig {

    public static String get_categories="cashier-get-categories.php";
    public static String get_items="cashier-get-items.php";

    public static int[] images={R.drawable.ic_filter_list_black_24dp,R.drawable.ic_view_list_black_24dp,R.drawable.ic_announcement_black_24dp,R.drawable.ic_account_box_black_24dp};
    public static String[] inventory_title={"Category","Items","Stock Alert","Account"};

    public static String[] categoryArrayId;
    public static String[] categoryArrayName;

    public static String[] itemArrayId;
    public static String[] itemArrayName;
    public static String[] itemArrayMeasurement;
    public static String[] price_id;
    public static String[] price;
    public static String[] stockData;


    public static ArrayList<String> orders_items;

    public static String order_no;
    public static String date;

    ;




}