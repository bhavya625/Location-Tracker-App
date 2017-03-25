package com.bhavya.locationtracker;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by bhavya on 7/9/2016.
 */
public class UserPreferences {
    public static final String SP_NAME = "userSharedPreferences";
    SharedPreferences userSharedPreferences;

    public UserPreferences(Context context) {
        userSharedPreferences = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
    }

    public void storeUserPreferences(Data data) {
        SharedPreferences.Editor spEditor = userSharedPreferences.edit();
        spEditor.putInt("frequencyValue", data.frequencyValue);
        spEditor.putInt("resultValue", data.resultValue);
        spEditor.commit();
    }
}
