package com.Paradox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.androidip.R;

public class LocateActivity extends Activity {
    belocate a;
    /* access modifiers changed from: private */
    public String b = "Locate";

    public static class LocatedDevice implements Parcelable {
        public static final Parcelable.Creator CREATOR = new bf();
        public int a;
        public String b;
        public String c;
        public String d;

        public LocatedDevice() {
            this.a = 0;
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public LocatedDevice(int i, String str, String str2, String str3) {
            this();
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public LocatedDevice(Parcel parcel) {
            this();
            String[] strArr = new String[3];
            this.a = parcel.readInt();
            parcel.readStringArray(strArr);
            this.b = strArr[0];
            this.c = strArr[1];
            this.d = strArr[2];
        }

        public boolean a(LocatedDevice locatedDevice) {
            return this.c.equals(locatedDevice.c) && this.b.equals(locatedDevice.b) && this.a == locatedDevice.a && this.d.equals(locatedDevice.d);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return String.valueOf(this.d) + " " + this.c + " " + this.b + " " + this.a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeStringArray(new String[]{this.b, this.c, this.d});
        }
    }

    @SuppressLint("ResourceType")
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d(this.b, "onCreate");
        boolean requestWindowFeature = requestWindowFeature(7);
        setContentView(R.layout.locate);
		Log.d("MAURO", "locate1");
        if (requestWindowFeature) {
            getWindow().setFeatureInt(7, R.layout.titlebar);
            ((TextView) findViewById(R.id.wtTitle1)).setText(R.string.LocateIPDevices);
        }
        findViewById(R.id.mainLayout).setOnClickListener(new bc(this));
        ((ListView) findViewById(R.id.lvLocatedDevices)).setOnItemClickListener(new bdclicca(this));
        LocatedDevice locatedDevice = null;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            locatedDevice = (LocatedDevice) extras.getParcelable("com.Paradox.IP");
        }
        this.a = new belocate(this, locatedDevice);
        //this.a.execute(new Object[0]);
        this.a.execute();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(this.b, "onDestroy");
        this.a.cancel(true);
    }
}
