package com.wsadevv.carmemapp.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by willi on 07/01/2017.
 */

public class FontApplier {
    public void apply(TextView textView, Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"fonts/featherly.ttf");
        textView.setTypeface(typeface);
    }
}
