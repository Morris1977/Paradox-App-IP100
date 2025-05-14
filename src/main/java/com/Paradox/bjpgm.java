package com.Paradox;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidip.R;

import java.util.ArrayList;
import java.util.List;

public class bjpgm extends BaseAdapter {
    m[] a;
    private Context b;
    private final Resources c;
    private final int d;
    private final LayoutInflater e;
    private List f;
    private final List g;

    public bjpgm(Context context, int i, List list, m[] mVarArr) {
        this.b = context;
        this.c = context.getResources();
        this.d = i;
        this.e = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.a = mVarArr;
        this.g = list;
        a();
    }

    private void a() {
        this.f = new ArrayList();
        for (m mVar : this.a) {
            if (mVar.e()) {
                this.f.add(mVar);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint("ResourceType")
    public void a(dz dzVar, br brVar) {
        Resources resources = this.b.getResources();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        builder.setTitle(resources.getText(R.string.Notification));
        builder.setMessage(resources.getText(R.string.OverridePGMTimer));
        builder.setIcon(17301543);
        builder.setPositiveButton(resources.getText(R.string.OK), new bk(this, dzVar, brVar));
        builder.setNegativeButton(resources.getText(R.string.Cancel), new bl(this));
        builder.setCancelable(true);
        builder.setOnCancelListener(new bm(this));
        builder.create().show();
    }

    public int getCount() {
        return this.f.size();
    }

    public Object getItem(int i) {
        return this.f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        br brVar;
        if (view == null) {
            view = this.e.inflate(this.d, (ViewGroup) null);
            br brVar2 = new br((br) null);
            brVar2.a = (TextView) view.findViewById(R.id.PGM_Num);
            brVar2.b = (TextView) view.findViewById(R.id.PGM_label);
            brVar2.e = (ImageView) view.findViewById(R.id.timer);
            brVar2.c = (ImageView) view.findViewById(R.id.onButton);
            brVar2.d = (ImageView) view.findViewById(R.id.offButton);
            brVar2.f = (ImageView) view.findViewById(R.id.pulseUtilKeyButton);
            brVar2.c.setOnClickListener(new bn(this, brVar2));
            brVar2.d.setOnClickListener(new bo(this, brVar2));
            view.setTag(brVar2);
            brVar = brVar2;
        } else {
            brVar = (br) view.getTag();
        }
        brVar.f.setOnClickListener(new bp(this, brVar));
        m mVar = (m) getItem(i);
        dz dzVar = (dz) this.g.get(mVar.f());
        if (brVar.f.getBackground() == null) {
            brVar.f.setImageResource(R.drawable.momentary_switch);
        }
        if (mVar.a()) {
            brVar.c.setTag(dzVar);
            brVar.d.setTag(dzVar);
            brVar.f.setVisibility(View.GONE);
            brVar.c.setVisibility(View.VISIBLE);
            brVar.d.setVisibility(View.VISIBLE);
            brVar.e.setVisibility(View.VISIBLE);
            brVar.a.setText(String.format(this.c.getString(R.string.PGMNumCOLON), new Object[]{Integer.valueOf(dzVar.g() + 1)}));
            Log.d("MAURO", "Sono in bj 34");
            //brVar.b.setText(dzVar.i());  QUESTO MANDA IN CRASH
            brVar.e.setVisibility(((dzVar.c() instanceof ah) || dzVar.b() <= 0) ? View.GONE : View.VISIBLE);
            switch (dzVar.a()) {
                case 0:
                    brVar.c.setImageResource(R.drawable.pgm_control_on);
                    brVar.d.setImageResource(R.drawable.pgm_control_off);
                    break;
                case 1:
                    brVar.c.setImageResource(R.drawable.pgm_control_green_on);
                    brVar.d.setImageResource(R.drawable.pgm_control_black_off);
                    break;
                case 2:
                    brVar.c.setImageResource(R.drawable.pgm_control_black_on);
                    brVar.d.setImageResource(R.drawable.pgm_control_green_off);
                    break;
            }
        } else {
            brVar.f.setTag(dzVar);
            brVar.f.setVisibility(View.VISIBLE);
            brVar.c.setVisibility(View.GONE);
            brVar.d.setVisibility(View.GONE);
            brVar.e.setVisibility(View.GONE);
            cd cdVar = (cd) dzVar.c();
            brVar.a.setText(String.format(this.c.getString(R.string.UtilitykeyNum), new Object[]{Integer.valueOf((dzVar.g() - (cdVar.c() - cdVar.N())) + 1)}));
            brVar.b.setText(dzVar.i());
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
