package com.Paradox;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

public class gw {
    public static String a(Context context, Class cls) {
        try {
            return context.getPackageManager().getPackageInfo(new ComponentName(context, cls).getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }
}
