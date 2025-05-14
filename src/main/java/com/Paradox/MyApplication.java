package com.Paradox;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.Locale;

public class MyApplication extends Application {
    private static MyApplication apro = null;

    public static Context acon() {
        return apro.getApplicationContext();
    }

    public static void abo(String str) {
        Configuration configuration = new Configuration();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(acon());
        String string = defaultSharedPreferences.getString("force_local", "");
        if (TextUtils.isEmpty(string) && str == null) {
            configuration.locale = Locale.getDefault();
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putString("force_local", Locale.getDefault().toString().substring(0, 2));
            edit.apply();
        } else if (str != null) {
            configuration.locale = new Locale(str);
            SharedPreferences.Editor edit2 = defaultSharedPreferences.edit();
            edit2.putString("force_local", str);
            edit2.apply();
        } else if (!TextUtils.isEmpty(string)) {
            configuration.locale = new Locale(string);
        }
        acon().getResources().updateConfiguration(configuration, (DisplayMetrics) null);
    }

    public static String b() {
        return PreferenceManager.getDefaultSharedPreferences(acon()).getString("force_local", "");
    }

    public void onConfigurationChanged(Configuration configuration) {
        String string = PreferenceManager.getDefaultSharedPreferences(getBaseContext().getApplicationContext()).getString("force_local", "");
        super.onConfigurationChanged(configuration);
        abo(string);
    }

    public void onCreate() {
        apro = this;
        abo((String) null);
        try {
            Class<?> cls = Class.forName("android.os.StrictMode");
            Class<?> cls2 = Class.forName("android.os.StrictMode$ThreadPolicy");
            Object obj = cls2.getField("LAX").get((Object) null);
            cls.getMethod("setThreadPolicy", new Class[]{cls2}).invoke((Object) null, new Object[]{obj});
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onCreate();
    }
}
