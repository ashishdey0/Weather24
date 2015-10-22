package com.bokaromart.weather24.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.bokaromart.weather24.LeftDrawerActivity;

/**
 * Created by ashdey on 10/4/15.
 */
public class InternetConnectionHandler {
    public static boolean isCheckPerformed = false;
    public static boolean isNetworkAvailable(final Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }

        }
        return false;
    }

    public static boolean checkInternetOnResume(final Context context){
        if(!isNetworkAvailable(context)){
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User clicked OK button
                    //((Activity)context).finish();
                    //System.exit(0);
                }
            });

            AlertDialog dialog = builder.create();
            dialog.setTitle("Internet status");
            dialog.setMessage("No Internet Connection closing");
            dialog.show();
            return false;
        }
        return true;
    }
}
