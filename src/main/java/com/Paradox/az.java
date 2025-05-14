package com.Paradox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.androidip.R;

class az extends ArrayAdapter {
    /* access modifiers changed from: package-private */
    public final /* synthetic */ LanguageSelectActivity a;
    private final int b;
    private ay[] c = null;
    private final LayoutInflater d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az(LanguageSelectActivity languageSelectActivity, Context context, int i, ay[] ayVarArr) {
        super(context, i, ayVarArr);
        this.a = languageSelectActivity;
        this.b = i;
        this.c = ayVarArr;
        this.d = (LayoutInflater) getContext().getSystemService("layout_inflater");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        bb bbVar;
        if (view == null) {
            view = this.d.inflate(this.b, (ViewGroup) null);
            bb bbVar2 = new bb(this.a, (bb) null);
            bbVar2.a = (TextView) view.findViewById(R.id.tvLangName);
            bbVar2.b = (CheckBox) view.findViewById(R.id.checkBoxLangEnabled);
            view.setTag(bbVar2);
            bbVar = bbVar2;
        } else {
            bbVar = (bb) view.getTag();
        }
        ay ayVar = this.c[i];
        bbVar.a.setText(ayVar.c);
        bbVar.b.setTag(ayVar);
        bbVar.b.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        bbVar.b.setChecked(ayVar.a.equalsIgnoreCase(this.a.a));
        bbVar.b.setOnCheckedChangeListener(new ba(this));
        return view;
    }
}
