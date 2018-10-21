package com.rootmind.onboard;

import android.app.Application;

/**
 * Created by ROOTMIND on 3/30/2016.
 */
public class GlobalProperties extends Application {

    private String gcmTokenID;

    public String getGcmTokenID() {
        return gcmTokenID;
    }

    public void setGcmTokenID(String gcmTokenID) {
        this.gcmTokenID = gcmTokenID;
    }
}
