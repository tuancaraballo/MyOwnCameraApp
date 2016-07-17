package com.tuananhcaraballo.myowncameraapp;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by Antuan on 7/15/16.
 */
public class Camera {

    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }
    public Camera(){

    }
}
