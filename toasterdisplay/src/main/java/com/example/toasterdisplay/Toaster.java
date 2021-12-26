package com.example.toasterdisplay;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static String ToastDisplay(Context context,String str){
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
        return str;
    }
}
