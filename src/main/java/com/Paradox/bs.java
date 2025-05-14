package com.Paradox;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidip.R;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class bs extends BaseAdapter {
    m[] a;
    CopyOnWriteArrayList b;
    /* access modifiers changed from: private */
    public Context c;
    private final Resources d;
    private final int e;
    private final LayoutInflater f;
    private List g;

    public bs(Context context, int i, m[] mVarArr, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.c = context;
        this.d = context.getResources();
        this.e = i;
        this.f = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.a = mVarArr;
        this.b = copyOnWriteArrayList;
        a();
    }

    private dz a(CopyOnWriteArrayList copyOnWriteArrayList, m mVar) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            dz dzVar = (dz) it.next();
            if (dzVar.g() == mVar.f()) {
                return dzVar;
            }
        }
        return null;
    }

    private void a() {
        this.g = new CopyOnWriteArrayList();
        for (m a2 : this.a) {
            this.g.add(new bx(this, a(this.b, a2)));
        }
    }

    public void a(TabMainPanel tabMainPanel) {
        if (tabMainPanel != null) {
            try {
                ((InputMethodManager) tabMainPanel.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(tabMainPanel.getCurrentFocus().getWindowToken(), 0);
                tabMainPanel.getWindow().setSoftInputMode(3);
            } catch (Exception e2) {
            }
        }
    }

    public void a(cq cqVar) {
        int i = 0;
        Iterator it = this.g.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                bx bxVar = (bx) it.next();
                bxVar.c();
                m a2 = bxVar.a();
                dz b2 = bxVar.b();
                if (bxVar.d() && (b2.c() instanceof ag) && !((ag) b2.c()).a(b2.g(), a2.b())) {
                    Log.e("PGM update Failed", "");
                }
                i = i2 + 1;
                Log.d("MAURO", "SONO IN bs prima di Fcz");
                cqVar.j.Fcz.d[i2] = a2;
                Log.d("MAURO", "SONO IN bs dopo  Fcz");
                b2.a(a2);
            } else {
                return;
            }
        }
    }

    public boolean a(int i, int i2) {
        if (i == i2) {
            return false;
        }
        try {
            this.g.remove(i);
            this.g.add(i2, (bx) this.g.get(i));
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    public int getCount() {
        return this.g.size();
    }

    public Object getItem(int i) {
        return this.g.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        by byVar;
        if (view == null) {
            view = this.f.inflate(this.e, (ViewGroup) null);
            by byVar2 = new by((by) null);
            byVar2.a = (ImageView) view.findViewById(R.id.ibEditMode);
            byVar2.b = (TextView) view.findViewById(R.id.PGM_Num);
            byVar2.c = (EditText) view.findViewById(R.id.PGM_label);
            byVar2.d = (ImageView) view.findViewById(R.id.btnPGMDelete);
            byVar2.c.addTextChangedListener(new bt(this, byVar2.c));
            byVar2.a.setOnClickListener(new bu(this, byVar2));
            byVar2.d.setOnClickListener(new bv(this, byVar2));
            view.setTag(byVar2);
            byVar = byVar2;
        } else {
            byVar = (by) view.getTag();
        }
        bx bxVar = (bx) getItem(i);
        byVar.a.setTag(bxVar);
        byVar.d.setTag(bxVar);
        byVar.c.setTag(bxVar);
        byVar.b.setEnabled(bxVar.f());
        byVar.c.setEnabled(bxVar.f());
        if (!bxVar.f()) {
            byVar.a.setImageResource(R.drawable.disarm_smallbutton_not_on);
            byVar.d.setVisibility(View.GONE);
        } else if (bxVar.e()) {
            byVar.a.setImageResource(R.drawable.disarm_smallbutton_not_on);
            byVar.d.setVisibility(View.VISIBLE);
        } else {
            byVar.a.setImageResource(R.drawable.disarm_smallbutton_not_on);
            byVar.d.setVisibility(View.GONE);
        }
        //if (bxVar.a().a()) {
        //    byVar.b.setText(String.format(this.d.getString(R.string.PGMNumCOLON), new Object[]{Integer.valueOf(bxVar.g() + 1)}));
        //}
        //else
        //{
        //    cd cdVar = (cd) bxVar.b().c();
        //    byVar.b.setText(String.format(this.d.getString(R.string.UtilitykeyNum), new Object[]{Integer.valueOf((bxVar.b().g() - (cdVar.c() - cdVar.N())) + 1)}));
        //}
        byVar.c.setText(bxVar.h());
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public void notifyDataSetChanged() {
    }
}
