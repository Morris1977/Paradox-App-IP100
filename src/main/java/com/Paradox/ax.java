package com.Paradox;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;

import com.androidip.R;

class ax implements AdapterView.OnItemClickListener {
    final /* synthetic */ LanguageSelectActivity a;

    ax(LanguageSelectActivity languageSelectActivity) {
        this.a = languageSelectActivity;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((CheckBox) view.findViewById(R.id.checkBoxLangEnabled)).setChecked(true);
        this.a.a((ay) ((ListView) adapterView).getItemAtPosition(i));
    }
}
