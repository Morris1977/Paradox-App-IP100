package com.Paradox;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

class bdclicca implements AdapterView.OnItemClickListener {
    final /* synthetic */ LocateActivity a;

    bdclicca(LocateActivity locateActivity) {
        this.a = locateActivity;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Log.d(this.a.b, "Clicked " + i);
        Intent intent = new Intent();
        intent.putExtra("com.Paradox.IP", (LocateActivity.LocatedDevice) ((ListView) adapterView).getAdapter().getItem(i));
        this.a.setResult(7, intent);
        this.a.finish();
    }
}
