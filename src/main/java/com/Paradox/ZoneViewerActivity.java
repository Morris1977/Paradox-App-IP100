package com.Paradox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.androidip.R;

public class ZoneViewerActivity extends Activity {
    c a = null;
    he b = null;
    ListView c = null;

    @SuppressLint("ResourceType")
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.zone_status);
        this.b = new he(this, this, R.layout.zone_item);
    }
}
