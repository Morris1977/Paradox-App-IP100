package com.Paradox;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class q extends SQLiteOpenHelper {
    public q(Context context) {
        super(context, "Paradox", (SQLiteDatabase.CursorFactory) null, 6);
    }

    private boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            Cursor query = sQLiteDatabase.query("SiteList", new String[]{"_id", "cfgfname"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            query.moveToFirst();
            while (!query.isAfterLast()) {
                query.getLong(0);
                String string = query.getString(1);
                if (string != null && string.trim().length() > 0) {
                    MyApplication.acon().deleteFile(string);
                }
                query.moveToNext();
            }
            query.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table SiteList( _id integer primary key autoincrement, siteId VARCHAR, ipAddress VARCHAR, ipPort INTEGER, label VARCHAR, ipPassword VARCHAR, panelPassword VARCHAR, useSiteId INTEGER, rememberPP INTEGER, ipdevicetype VARCHAR, cfgfname VARCHAR, langId INTEGER, SMSPhoneNo VARCHAR, SMSRetryConnect INTEGER);");
        Log.i(q.class.getName(), "Created db table");
        Log.i("Forced Update Feature", "Created db table2");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.w(q.class.getName(), "Upgrading site database from version " + i + " to " + i2);
        if (i < 5) {
            a(sQLiteDatabase);
            try {
                sQLiteDatabase.execSQL("ALTER TABLE SiteList ADD COLUMN langId INTEGER");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i2 == 6) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE SiteList ADD COLUMN SMSPhoneNo VARCHAR");
                sQLiteDatabase.execSQL("ALTER TABLE SiteList ADD COLUMN SMSRetryConnect INTEGER");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
