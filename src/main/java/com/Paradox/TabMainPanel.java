package com.Paradox;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TabActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.androidip.R;

import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

@SuppressLint({"HandlerLeak"})
public class TabMainPanel extends TabActivity {
    private static Context S;
    private static NotificationManager d = null;
    /* access modifiers changed from: private */
    public gr A = null;
    public cn cn1 = null;
    public int valoreant1;
    public static int prova;
    public int cont = 0;
    public int numeroicona = 0;

    public boolean ant = false;
    public boolean antsleep = false;
    public boolean antper = false;
    public boolean ant1 = false;
    public boolean ant1sleep = false;
    public boolean ant1per = false;
    public boolean ant2 = false;
    private ExpandableListView B = null;
    /* access modifiers changed from: private */
    public gm C = null;
    /* access modifiers changed from: private */
    public go D = null;
    /* access modifiers changed from: private */
    public gn E = null;
    /* access modifiers changed from: private */
    public static ViewFlipperCleanupOnHome F = null;
    private static ListView G = null;
    /* access modifiers changed from: private */
    public static e H = null;
    /* access modifiers changed from: private */
    public static ListView I = null;
    /* access modifiers changed from: private */
    public gz J = null;
    /* access modifiers changed from: private */
    public gq K;
    private gc L;
    /* access modifiers changed from: private */
    public ViewFlipperCleanupOnHome M = null;
    private ListView N = null;
    /* access modifiers changed from: private */
    public bjpgm O = null;
    /* access modifiers changed from: private */
    public DraggableListView P = null;
    /* access modifiers changed from: private */
    public bs Q = null;
    /* access modifiers changed from: private */
    public ViewFlipperCleanupOnHome R = null;
    /* access modifiers changed from: private */
    public ae T = null;
    private View.OnClickListener U = new ed(this);
    private View.OnClickListener V = new ep(this);
    private View.OnClickListener W = new fa(this);
    private View.OnClickListener X = new fq(this);
    /* access modifiers changed from: private */
    public View.OnClickListener Y = new fw(this);
    private View.OnClickListener Z = new fx(this);
    ae a = null;
    private View.OnCreateContextMenuListener aa = new fy(this);
    private AdapterView.OnItemClickListener ab = new fz(this);
    /* access modifiers changed from: private */
    public View.OnClickListener ac = new ga(this);
    /* access modifiers changed from: private */
    public View.OnClickListener ad = new eealarm(this);
    /* access modifiers changed from: private */
    public View.OnClickListener aealarm = new efalarm(this);
    /* access modifiers changed from: private */
    public View.OnClickListener af = new egalarm(this);
    /* access modifiers changed from: private */
    public View.OnClickListener ag = new ehalarm(this);
    private boolean ah = false;
    private boolean ai = false;
    private boolean aj = false;
    private int ak = 10000;
    private boolean al = false;
    private Ringtone am = null;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    public Handler an = new ei(this);
    private ExpandableListView.OnChildClickListener ao = new ej(this);
    private View.OnCreateContextMenuListener ap = new ek(this);
    /* access modifiers changed from: private */
    public View.OnCreateContextMenuListener aq = new el(this);
    /* access modifiers changed from: private */
    public TabHost.OnTabChangeListener ar = new em(this);
    private boolean b;
    private Vibrator c = null;
    private Toast e = null;
    private long f = 0;
    /* access modifiers changed from: private */
    public static Site gsit = null;
    /* access modifiers changed from: private */
    public geconnect hgeconnect = new geconnect(this);
    /* access modifiers changed from: private */

    public cq i = null;
    /* access modifiers changed from: private */
    public Thread jth = null;
    private gk k = null;
    /* access modifiers changed from: private */
    public gd l = null;
    /* access modifiers changed from: private */
    public hd m = hd.ALL;
    private hd n = hd.ALL;
    /* access modifiers changed from: private */
    public static int o = gz.d;
    /* access modifiers changed from: private */
    public ReclickableTabHost ptab;
    /* access modifiers changed from: private */
    public int q = 0;
    /* access modifiers changed from: private */
    public ViewFlipperCleanupOnHome r = null;

    public gbdisegna sdis = null;
    /* access modifiers changed from: private */
    public ListView t = (null);
    private hf u = null;
    private hg v = null;
    private ListView w;
    /* access modifiers changed from: private */
    public ViewFlipperCleanupOnHome x = null;
    private a y = null;
    /* access modifiers changed from: private */
    public ListView z = null;

    public static TabMainPanel a(TabMainPanel a) {
        return a;
    }

    private int a(String str, int i2) {
        return getSharedPreferences("ParadoxPrefsFile", 0).getInt(str, i2);
    }

    private String a(CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it = copyOnWriteArrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.c() && gyVar.k()) {
                i2++;
            }
        }
        if (i2 == 0) {
            return "";
        }
        return String.format(getResources().getString(com.androidip.R.string.bypassedZonesCount), new Object[]{Integer.valueOf(i2)});
    }

    private String a(CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2) {
        int size = copyOnWriteArrayList.size();
        if (size <= 0) {
            Log.d("MAURO", "Sono in Tabmain scrivo Loading...");
            return copyOnWriteArrayList2.size() > 0 ? (String) getText(com.androidip.R.string.AllZonesClosed) : (String) getText(com.androidip.R.string.AreaNum);
        }
        if (size == 1) {
            return (String) getText(com.androidip.R.string.OneOpenZone);
        }
        return String.format(getResources().getString(com.androidip.R.string.NumOpenZones), new Object[]{Integer.valueOf(size)});
    }

    public static void a(int i2) {
        if (d != null) {
            d.cancel(i2);
        }
    }

    /* access modifiers changed from: private */
    public void a(int i2, String... strArr) {
        if (this.b) {
            //Log.d("MAURO", "gsit.f() vale : "+ gsit.f());
            getWindow().setFeatureInt(7, com.androidip.R.layout.titlebar);
            ((TextView) findViewById(com.androidip.R.id.wtTitle1)).setText(this.gsit.f());
            if (i2 > 0)
                ((TextView) findViewById(com.androidip.R.id.wtTitle2)).setText(i2);
                else {
                ((TextView) findViewById(com.androidip.R.id.wtTitle2)).setText((CharSequence) null);
            }
            if (strArr.length > 0) {
                ((TextView) findViewById(com.androidip.R.id.wtTitle3)).setText(strArr[0]);
            } else {
                ((TextView) findViewById(com.androidip.R.id.wtTitle3)).setText((CharSequence) null);
            }
        }
    }

    private void a(View view) {
        this.T = this.i.j;
        if (view == null) {
            view = (FrameLayout) findViewById(com.androidip.R.id.frameLayoutPanelAllAreas);
        }
        ImageView imageView = (ImageView) view.findViewById(com.androidip.R.id.ibTP_Arm_All);
        imageView.setTag(this.i.j);
        imageView.setOnClickListener(this.V);
        ImageView imageView2 = (ImageView) view.findViewById(com.androidip.R.id.ibTP_Stay_All);
        imageView2.setTag(this.i.j);
        imageView2.setOnClickListener(this.X);
        ImageView imageView3 = (ImageView) view.findViewById(com.androidip.R.id.ibTP_Disarm_All);
        imageView3.setTag(this.i.j);
        imageView3.setOnClickListener(this.Y);
        ImageView imageView4 = (ImageView) view.findViewById(com.androidip.R.id.ibTP_Instant_All);
        imageView4.setTag(this.i.j);
        if (this.i.j instanceof cn) {
            imageView4.setOnClickListener(this.Z);
        } else if (this.i.j instanceof cb) {
            imageView4.setOnClickListener(this.W);
        }
    }

    private void a(ImageView imageView, int i2, int i3) {
        if (imageView.getBackground() == null) {
            imageView.setImageResource(0);
            imageView.setBackgroundResource(i2);
            AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
            int i4 = 10;
            for (int i5 = 0; i5 < animationDrawable.getNumberOfFrames(); i5++) {
                i4 += animationDrawable.getDuration(i5);
            }
            imageView.postDelayed(new ex(this, imageView, i3), (long) i4);
            animationDrawable.start();
        }
    }

    private void a(ae aeVar) {
        this.T = aeVar;
        FrameLayout frameLayout = (FrameLayout) findViewById(com.androidip.R.id.frameLayoutPanelAllAreas);
        if (aeVar instanceof c) {
            ImageView imageView = (ImageView) frameLayout.findViewById(com.androidip.R.id.ibTP_Arm_All);
            imageView.setTag(aeVar);
            imageView.setOnClickListener(this.ac);
            ImageView imageView2 = (ImageView) frameLayout.findViewById(com.androidip.R.id.ibTP_Stay_All);
            imageView2.setTag(aeVar);
            imageView2.setOnClickListener(this.aealarm);
            ImageView imageView3 = (ImageView) frameLayout.findViewById(com.androidip.R.id.ibTP_Disarm_All);
            imageView3.setTag(aeVar);
            imageView3.setOnClickListener(this.af);
            ImageView imageView4 = (ImageView) frameLayout.findViewById(com.androidip.R.id.ibTP_Instant_All);
            imageView4.setTag(aeVar);
            if (this.i.j instanceof cn) {
                imageView4.setOnClickListener(this.ag);
            } else if (this.i.j instanceof cb) {
                imageView4.setOnClickListener(this.ad);
            }
        }
        b(aeVar);
    }

    /* access modifiers changed from: private */
    public void a(ae aeVar, View.OnClickListener onClickListener, int i2) {
        boolean z2;
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (aeVar.d() || aeVar.c_()) {
            b(false);
            View inflate = layoutInflater.inflate(com.androidip.R.layout.area_in_alarm, (ViewGroup) null);
            this.r.addView(inflate, 1);
            this.r.setOnHomeListener(new eq(this));
            Resources resources = getResources();
            String string = aeVar instanceof ag ? getResources().getString(com.androidip.R.string.System) : aeVar.u();
            ((TextView) inflate.findViewById(com.androidip.R.id.alarmStatus)).setText(!aeVar.c_() ? String.format(resources.getString(com.androidip.R.string.XisinalarmX), new Object[]{string, resources.getString(i2)}) : String.format(resources.getString(com.androidip.R.string.XwasinalarmX), new Object[]{string, resources.getString(i2)}));
            ((TextView) inflate.findViewById(com.androidip.R.id.disarmQuestion)).setText(String.format(resources.getString(com.androidip.R.string.WouldyouliketoDisarmX), new Object[]{string}));
            ImageView imageView = (ImageView) inflate.findViewById(com.androidip.R.id.ibDisarm);
            imageView.setTag(aeVar);
            imageView.setOnClickListener(onClickListener);
            this.v = new hg(this, com.androidip.R.layout.area_zones_in_alarm, aeVar);
            ListView listView = (ListView) inflate.findViewById(com.androidip.R.id.lvAreaZonesInAlarm);
            listView.setAdapter(this.v);
            listView.setOnItemClickListener(new er(this));
            inflate.setOnClickListener(new es(this));
            z2 = true;
        } else {
            View inflate2 = layoutInflater.inflate(com.androidip.R.layout.zone_status, (ViewGroup) null);
            this.r.addView(inflate2, 1);
            this.r.setOnHomeListener(new et(this));
            this.u = new hf(this, com.androidip.R.layout.area_zones, aeVar);
            this.u.a(this.m);
            this.w = (ListView) inflate2.findViewById(com.androidip.R.id.lvAreaZones);
            this.w.setAdapter(this.u);
            View findViewById = inflate2.findViewById(com.androidip.R.id.empty_list_view);
            this.w.setEmptyView(findViewById);
            findViewById.setOnCreateContextMenuListener(this.aa);
            this.w.setOnCreateContextMenuListener(this.aa);
            this.w.setOnItemClickListener(new eu(this));
            findViewById.setOnClickListener(new ev(this));
            View findViewById2 = inflate2.findViewById(com.androidip.R.id.llZoneStatus);
            findViewById2.setOnCreateContextMenuListener(this.aa);
            findViewById2.setOnClickListener(new ew(this));
            z2 = false;
        }
        if (!z2 && !d()) {
            a(true, true);
            a();
        }
        a(aeVar);
        this.r.setDisplayedChild(1);
    }

    @SuppressLint({"NewApi"})
    private void a(ae aeVar, boolean z2, gp gpVar, boolean z3) {
        if (aeVar.d()) {
            gpVar.d.setEnabled(false);
            gpVar.f.setEnabled(false);
            gpVar.e.setEnabled(false);
            gpVar.g.setEnabled(true);
            if (z3) {
                gpVar.d.setAlpha(120);
                gpVar.f.setAlpha(120);
                gpVar.e.setAlpha(120);
                gpVar.g.setAlpha(255);
            }
        } else if (z2) {
            switch (aeVar.A()) {
                case 1:
                    gpVar.d.setEnabled(true);
                    gpVar.e.setEnabled(false);
                    gpVar.f.setEnabled(false);
                    if (z3) {
                        gpVar.d.setAlpha(255);
                        gpVar.e.setAlpha(120);
                        gpVar.f.setAlpha(120);
                        return;
                    }
                    return;
                case 2:
                    gpVar.d.setEnabled(true);
                    gpVar.e.setEnabled(true);
                    gpVar.f.setEnabled(true);
                    if (z3) {
                        gpVar.d.setAlpha(255);
                        gpVar.e.setAlpha(255);
                        gpVar.f.setAlpha(255);
                        return;
                    }
                    return;
                case 3:
                    gpVar.d.setEnabled(true);
                    gpVar.e.setEnabled(true);
                    gpVar.f.setEnabled(false);
                    if (z3) {
                        gpVar.d.setAlpha(255);
                        gpVar.e.setAlpha(255);
                        gpVar.f.setAlpha(120);
                        return;
                    }
                    return;
                case 4:
                    gpVar.d.setEnabled(true);
                    gpVar.e.setEnabled(true);
                    gpVar.f.setEnabled(false);
                    if (z3) {
                        gpVar.d.setAlpha(255);
                        gpVar.e.setAlpha(255);
                        gpVar.f.setAlpha(120);
                        return;
                    }
                    return;
                case 5:
                    gpVar.d.setEnabled(true);
                    gpVar.e.setEnabled(true);
                    gpVar.f.setEnabled(true);
                    if (z3) {
                        gpVar.d.setAlpha(255);
                        gpVar.e.setAlpha(255);
                        gpVar.f.setAlpha(255);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            gpVar.d.setEnabled(true);
            gpVar.f.setEnabled(true);
            gpVar.e.setEnabled(true);
            gpVar.g.setEnabled(true);
            if (z3) {
                gpVar.d.setAlpha(255);
                gpVar.f.setAlpha(255);
                gpVar.e.setAlpha(255);
                gpVar.f.setAlpha(255);
            }
        }
    }


    public void adisegna(com.Paradox.c cVar, gp gpVar) {
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        ImageView imageView3;
        ImageView imageView4;
        TextView textView2;
        Log.d("MAURO", "Sono dentro adisegna ");
        gpVar.a.setText(cVar.u());
        gpVar.b.setText(a(cVar.n(), cVar.o()));
        gpVar.c.setText(a(cVar.m()));
        gpVar.h.setVisibility(View.INVISIBLE);
        gpVar.i.setVisibility(View.INVISIBLE);
        gpVar.j.setVisibility(View.INVISIBLE);
        gpVar.k.setVisibility(View.INVISIBLE);
        gpVar.l.setVisibility(View.INVISIBLE);
        gpVar.m.setVisibility(View.INVISIBLE);
        gpVar.n.setVisibility(View.INVISIBLE);
        gpVar.o.setVisibility(View.INVISIBLE);
        gpVar.r.setText((CharSequence) null);
        gpVar.r.setVisibility(View.INVISIBLE);
        gpVar.d.setImageResource(com.androidip.R.drawable.system_arm_button);
        gpVar.f.setImageResource(com.androidip.R.drawable.system_stay_button);
        gpVar.g.setImageResource(com.androidip.R.drawable.system_disarm_button);
        if (this.i.j instanceof cn) {
            gpVar.e.setImageResource(com.androidip.R.drawable.system_sleep_button);
            gpVar.p.setText(com.androidip.R.string.Sleep);
            a((ae) cVar, false, gpVar, false);
        } else if (this.i.j instanceof cb) {
            gpVar.e.setImageResource(com.androidip.R.drawable.system_instant_button);
            gpVar.p.setText(com.androidip.R.string.Instant);
            a((ae) cVar, true, gpVar, false);
        }
        ant = cVar.i();
        numeroicona = cVar.r();
        if (ant1==true) {
            numeroicona = 1;
            ant = false;
        }
        if (ant1sleep==true) {
            numeroicona = 4;
            ant = false;
        }
        if (ant1per==true) {
            numeroicona = 5;
            ant = false;
        }
        Log.d("MAURO", "Sono dentro adisegna  numeroicona vale : "+ numeroicona);
        switch (numeroicona) {
            case 1:
                gpVar.d.setImageResource(ant ? com.androidip.R.drawable.system_arm_button_edelay_arming : com.androidip.R.drawable.system_arm_button_armed);
                ImageView imageView5 = gpVar.d;
                imageView = gpVar.h;
                textView = gpVar.l;
                if (!cVar.k()) {
                    if (!cVar.i()) {
                        if (!cVar.j()) {
                            imageView2 = imageView5;
                            break;
                        } else {
                            a(gpVar.d, com.androidip.R.drawable.system_arm_button_armed_animation, com.androidip.R.drawable.system_arm_button_armed);
                            imageView2 = imageView5;
                            break;
                        }
                    } else {
                        gpVar.r.setText(getText(com.androidip.R.string.Arming));
                        imageView2 = imageView5;
                        break;
                    }
                } else {
                    gpVar.r.setText(getText(com.androidip.R.string.EntryDelay));
                    imageView2 = imageView5;
                    break;
                }
            case 2:
                gpVar.g.setImageResource(cVar.i() ? com.androidip.R.drawable.system_disarm_button_edelay_arming : com.androidip.R.drawable.system_disarm_button_armed);
                ImageView imageView6 = gpVar.k;
                TextView textView3 = gpVar.o;
                if (!cVar.k() && !cVar.i() && cVar.j()) {
                    a(gpVar.g, com.androidip.R.drawable.system_disarm_button_disarmed_animation, com.androidip.R.drawable.system_disarm_button_armed);
                    imageView = imageView6;
                    imageView2 = null;
                    textView = textView3;
                    break;
                } else {
                    imageView = imageView6;
                    imageView2 = null;
                    textView = textView3;
                    break;
                }
            case 3:
                gpVar.e.setImageResource(ant ? com.androidip.R.drawable.system_instant_button_edelay_arming : com.androidip.R.drawable.system_instant_button_armed);
                imageView3 = gpVar.e;
                imageView4 = gpVar.j;
                textView2 = gpVar.n;
                if (!cVar.k()) {
                    if (!cVar.i()) {
                        if (cVar.j()) {
                            a(gpVar.e, com.androidip.R.drawable.system_instant_button_armed_animation, com.androidip.R.drawable.system_instant_button_armed);
                            imageView = imageView4;
                            textView = textView2;
                            imageView2 = imageView3;
                            break;
                        }
                        imageView = imageView4;
                        textView = textView2;
                        imageView2 = imageView3;
                        break;
                    } else {
                        gpVar.r.setText(getText(com.androidip.R.string.InstantArming));
                        imageView = imageView4;
                        textView = textView2;
                        imageView2 = imageView3;
                        break;
                    }
                } else {
                    gpVar.r.setText(getText(com.androidip.R.string.EntryDelay));
                    imageView = imageView4;
                    textView = textView2;
                    imageView2 = imageView3;
                    break;
                }
            case 4:
                gpVar.e.setImageResource(ant ? com.androidip.R.drawable.system_sleep_button_edelay_arming : com.androidip.R.drawable.system_sleep_button_armed);
                imageView3 = gpVar.e;
                imageView4 = gpVar.j;
                textView2 = gpVar.n;
                if (!cVar.k()) {
                    if (!cVar.i()) {
                        if (cVar.j()) {
                            a(gpVar.e, com.androidip.R.drawable.system_sleep_button_armed_animation, com.androidip.R.drawable.system_sleep_button_armed);
                            imageView = imageView4;
                            textView = textView2;
                            imageView2 = imageView3;
                            break;
                        }
                        imageView = imageView4;
                        textView = textView2;
                        imageView2 = imageView3;
                        break;
                    } else {
                        gpVar.r.setText(getText(com.androidip.R.string.SleepArming));
                        imageView = imageView4;
                        textView = textView2;
                        imageView2 = imageView3;
                        break;
                    }
                } else {
                    gpVar.r.setText(getText(com.androidip.R.string.EntryDelay));
                    imageView = imageView4;
                    textView = textView2;
                    imageView2 = imageView3;
                    break;
                }
            case 5:
                gpVar.f.setImageResource(ant ? com.androidip.R.drawable.system_stay_button_edelay_arming : com.androidip.R.drawable.system_stay_button_armed);
                imageView3 = gpVar.f;
                imageView4 = gpVar.i;
                textView2 = gpVar.m;
                if (!cVar.k()) {
                    if (!cVar.i()) {
                        if (cVar.j()) {
                            a(gpVar.f, com.androidip.R.drawable.system_stay_button_armed_animation, com.androidip.R.drawable.system_stay_button_armed);
                            imageView = imageView4;
                            textView = textView2;
                            imageView2 = imageView3;
                            break;
                        }
                        imageView = imageView4;
                        textView = textView2;
                        imageView2 = imageView3;
                        break;
                    } else {
                        gpVar.r.setText(getText(com.androidip.R.string.StayArming));
                        imageView = imageView4;
                        textView = textView2;
                        imageView2 = imageView3;
                        break;
                    }
                } else {
                    gpVar.r.setText(getText(com.androidip.R.string.EntryDelay));
                    imageView = imageView4;
                    textView = textView2;
                    imageView2 = imageView3;
                    break;
                }
            default:
                return;
        }
        imageView.setSelected(cVar.d());
        AnimationDrawable animationDrawable = (AnimationDrawable) gpVar.q.getBackground();
        gpVar.q.setVisibility(View.INVISIBLE);
        if (cVar.d()) {
            if (!animationDrawable.isRunning()) {
                gpVar.q.setVisibility(View.VISIBLE);
                animationDrawable.start();
            }
            gpVar.t.setBackgroundResource(com.androidip.R.drawable.system_cell_background_alarm);
            textView.setText(getText(com.androidip.R.string.InAlarm));
            if (cVar.c_()) {
                gpVar.r.setText(getText(com.androidip.R.string.WasinAlarm));
            } else {
                gpVar.r.setText(getText(com.androidip.R.string.InAlarm));
            }
        } else {
            if (animationDrawable.isRunning()) {
                animationDrawable.stop();
                gpVar.q.setVisibility(View.INVISIBLE);
            }
            gpVar.t.setBackgroundResource(com.androidip.R.drawable.system_cell_background);
            if (ant) {
                Log.d("MAURO", "scrivo il tempo di uscita cVar.i() vale : "+cVar.i());
                textView.setText(getText(com.androidip.R.string.ExitDelay));
            } else if (cVar.k()) {
                textView.setText(getText(com.androidip.R.string.EntryDelay));
            } else {
                textView.setText(getText(com.androidip.R.string.Current));
            }
        }
        if (gpVar.r.getText() != null) {
            gpVar.r.setVisibility(View.VISIBLE);
        }
        imageView.setVisibility(View.VISIBLE);
        textView.setVisibility(View.VISIBLE);
        Log.d("MAURO", "Lancio da Tab 1 GI : ");
        agicambio(cVar, true, imageView2, gpVar);
        ant1 = false;
        ant1per = false;
        ant1sleep = false;
    }
        //throw new UnsupportedOperationException("Method not decompiled: com.Paradox.TabMainPanel.a(com.Paradox.c, com.Paradox.gp):void");

    private void agicambio(c cVar, boolean z2, ImageView imageView, gp gpVar) {
        if (cVar.i()) {
            if (cVar.b == null) {
                Log.d("MAURO", "Lancio da Tab 2 GI cvar(b) vale : "+ cVar.b);
                cVar.b = new gicambio(this, gpVar.s, cVar, imageView);
            } else {
                Log.d("MAURO", "Lancio da Tab 2 agi1 di gicambio");
                cVar.b.agi1(gpVar.s);
            }
        } else if (!cVar.k()) {
            if (cVar.a != null) {
                cVar.a.a();
                cVar.a = null;
            }
            if (cVar.b != null) {
                Log.d("MAURO", "Sono in Tabmain cVar.k() vale : "+ cVar.k());
                cVar.b.aesco();
                cVar.b = null;
            }
        } else if (cVar.a == null) {
            cVar.a = new ggcambio(this, gpVar.s, cVar);
        } else {
            cVar.a.a(gpVar.s);
        }
    }
    public static void a(String str, String str2, int i2, boolean z2) {
        if (d != null) {
            PendingIntent activity = PendingIntent.getActivity(S, 0, new Intent(), 0);
            Notification notification = new Notification(com.androidip.R.drawable.small_button, str, System.currentTimeMillis());
            notification.flags |= 20;
            if (z2) {
                notification.flags |= 32;
            }
            //notification.setLatestEventInfo(S, str, str2, activity);
            d.notify(i2, notification);
        }
    }

    @SuppressLint("ResourceType")
    private void a(CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2, String str) {
        FrameLayout frameLayout = (FrameLayout) findViewById(com.androidip.R.id.frameLayoutPanelAllAreas);
        if (frameLayout.getVisibility() == View.VISIBLE) {
            e();
            ((TextView) frameLayout.findViewById(com.androidip.R.id.tvAreaName)).setText(str);
            ((TextView) frameLayout.findViewById(com.androidip.R.id.tvGlobalZones)).setText(a(copyOnWriteArrayList, copyOnWriteArrayList2));
            ((TextView) frameLayout.findViewById(com.androidip.R.id.tvAreaName)).startAnimation(AnimationUtils.loadAnimation(getBaseContext(), 17432578));
            ((TextView) frameLayout.findViewById(com.androidip.R.id.tvGlobalZones)).startAnimation(AnimationUtils.loadAnimation(getBaseContext(), 17432578));
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z2) {
        if (z2) {
            Intent intent = new Intent();
            if (this.i.t == 0) {
                setResult(1, intent);
            } else {
                intent.putExtra("errcode", this.i.t);
                setResult(2, intent);
            }
            finish();
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint("ResourceType")
    public void a(boolean z2, boolean z3) {
        FrameLayout frameLayout = (FrameLayout) findViewById(com.androidip.R.id.frameLayoutPanelAllAreas);
        if (z3) {
            frameLayout.setOnClickListener(this.U);
            if (z2) {
                frameLayout.setVisibility(View.VISIBLE);
            }
            a((View) frameLayout);
            ((TextView) frameLayout.findViewById(com.androidip.R.id.tvAreaName)).setAnimation(AnimationUtils.loadAnimation(getBaseContext(), 17432578));
            ((TextView) frameLayout.findViewById(com.androidip.R.id.tvGlobalZones)).setAnimation(AnimationUtils.loadAnimation(getBaseContext(), 17432578));
            return;
        }
        Animation a2 = ViewFlipperCleanupOnHome.a();
        a2.setAnimationListener(new eo(this, frameLayout));
        frameLayout.startAnimation(a2);
    }

    private hd b(String str, int i2) {
        int i3 = getSharedPreferences("ParadoxPrefsFile", 0).getInt(str, i2);
        return i3 == 0 ? hd.OPEN : i3 == 1 ? hd.CLOSED : i3 == 2 ? hd.ALL : i3 == 3 ? hd.BYPASSED : hd.ALL;
    }

    /* access modifiers changed from: private */
    public void balarm(int i2) {
        switch (i2) {
            case 0:
                a(com.androidip.R.string.Info, new String[0]);
                return;
            case 1:
                a(com.androidip.R.string.AlarminMemory, new String[0]);
                return;
            case 2:
                a(com.androidip.R.string.Troubles, new String[0]);
                return;
            case 3:
                a(com.androidip.R.string.Troubles, new String[0]);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    public void b(View view) {
        this.r.setOnHomeListener((bh) null);
        b(this.i.j.d());
        this.v = null;
        this.a = null;
        a();
        c();
    }

    @SuppressLint({"NewApi"})
    private void b(ae aeVar) {

        ImageView imageView;
        int i2;
        int i3;
        FrameLayout frameLayout = (FrameLayout) findViewById(com.androidip.R.id.frameLayoutPanelAllAreas);
        gp gpVar = new gp(this, (gp) null);
        gpVar.d = (ImageView) frameLayout.findViewById(com.androidip.R.id.ibTP_Arm_All);
        gpVar.f = (ImageView) frameLayout.findViewById(com.androidip.R.id.ibTP_Stay_All);
        gpVar.e = (ImageView) frameLayout.findViewById(com.androidip.R.id.ibTP_Instant_All);
        gpVar.g = (ImageView) frameLayout.findViewById(com.androidip.R.id.ibTP_Disarm_All);
        TextView textView = (TextView) frameLayout.findViewById(com.androidip.R.id.tvZoneStat);
        textView.setVisibility(View.GONE);
        if (aeVar.d()) {
            frameLayout.setSelected(true);
            gpVar.d.setEnabled(false);
            gpVar.f.setEnabled(false);
            gpVar.e.setEnabled(false);
            gpVar.g.setEnabled(true);
            gpVar.d.setAlpha(120);
            gpVar.f.setAlpha(120);
            gpVar.e.setAlpha(120);
            gpVar.g.setAlpha(255);
        } else {
            frameLayout.setSelected(false);
            gpVar.d.setEnabled(true);
            gpVar.f.setEnabled(true);
            gpVar.e.setEnabled(true);
            gpVar.g.setEnabled(true);
            gpVar.d.setAlpha(255);
            gpVar.f.setAlpha(255);
            gpVar.e.setAlpha(255);
            gpVar.g.setAlpha(255);
            if (aeVar instanceof c) {
                textView.setVisibility(View.VISIBLE);
            }
        }
        gpVar.d.setImageResource(com.androidip.R.drawable.arm_smallbutton);
        gpVar.f.setImageResource(com.androidip.R.drawable.stay_smallbutton);
        gpVar.g.setImageResource(com.androidip.R.drawable.disarm_smallbutton_not_on);
        if (this.i.j instanceof cn) {
            gpVar.e.setImageResource(com.androidip.R.drawable.sleep_smallbutton);
            if (aeVar instanceof c) {
                a(aeVar, false, gpVar, true);
            }
        } else if (this.i.j instanceof cb) {
            gpVar.e.setImageResource(com.androidip.R.drawable.instant_smallbutton);
            if (aeVar instanceof c) {
                a(aeVar, true, gpVar, true);
            }
        }
        ad adVar = (ad) aeVar;
        gpVar.d.setSelected(false);
        gpVar.f.setSelected(false);
        gpVar.e.setSelected(false);
        gpVar.g.setSelected(false);
        switch (aeVar.A()) {
            case 1:
                imageView = gpVar.d;
                i2 = com.androidip.R.drawable.arm_smallbutton_armed;
                if (!adVar.k()) {
                    if (!adVar.i()) {
                        textView.setText("");
                        textView.setVisibility(View.GONE);
                        i3 = com.androidip.R.drawable.arm_smallbutton_armed_animation;
                        break;
                    } else {
                        textView.setText(getText(com.androidip.R.string.Arming));
                        i3 = 0;
                        break;
                    }
                } else {
                    textView.setText(getText(com.androidip.R.string.EntryDelay));
                    i3 = 0;
                    break;
                }
            case 2:
                imageView = gpVar.g;
                i2 = com.androidip.R.drawable.disarm_smallbutton;
                textView.setText("");
                textView.setVisibility(View.GONE);
                if (!adVar.k() && !adVar.i()) {
                    i3 = com.androidip.R.drawable.disarm_smallbutton_animation;
                    break;
                } else {
                    i3 = 0;
                    break;
                }
            case 3:
                imageView = gpVar.e;
                i2 = com.androidip.R.drawable.instant_smallbutton_armed;
                if (!adVar.k()) {
                    if (!adVar.i()) {
                        textView.setText("");
                        textView.setVisibility(View.GONE);
                        i3 = com.androidip.R.drawable.instant_smallbutton_armed_animation;
                        break;
                    } else {
                        textView.setText(getText(com.androidip.R.string.InstantArming));
                        i3 = 0;
                        break;
                    }
                } else {
                    textView.setText(getText(com.androidip.R.string.EntryDelay));
                    i3 = 0;
                    break;
                }
            case 4:
                imageView = gpVar.e;
                i2 = com.androidip.R.drawable.sleep_smallbutton_armed;
                if (!adVar.k()) {
                    if (!adVar.i()) {
                        textView.setText("");
                        textView.setVisibility(View.GONE);
                        i3 = com.androidip.R.drawable.sleep_smallbutton_armed_animation;
                        break;
                    } else {
                        textView.setText(getText(com.androidip.R.string.SleepArming));
                        i3 = 0;
                        break;
                    }
                } else {
                    textView.setText(getText(com.androidip.R.string.EntryDelay));
                    i3 = 0;
                    break;
                }
            case 5:
                imageView = gpVar.f;
                i2 = com.androidip.R.drawable.small_button;
                if (!adVar.k()) {
                    if (!adVar.i()) {
                        textView.setText("");
                        textView.setVisibility(View.GONE);
                        i3 = com.androidip.R.drawable.small_button;
                        break;
                    } else {
                        textView.setText(getText(com.androidip.R.string.StayArming));
                        i3 = 0;
                        break;
                    }
                } else {
                    textView.setText(getText(com.androidip.R.string.EntryDelay));
                    i3 = 0;
                    break;
                }
            default:
                i3 = 0;
                imageView = null;
                i2 = 0;
                break;
        }
        if (imageView != null) {
            if (i3 <= 0 || !adVar.j()) {
                imageView.setImageResource(i2);
            } else {
                a(imageView, i3, i2);
            }
            if (adVar.i() || adVar.l()) {
                imageView.setSelected(true);
            }
        }
        if ((aeVar instanceof ag) && !((ag) aeVar).f()) {
            gpVar.d.setEnabled(false);
            gpVar.f.setEnabled(false);
            gpVar.e.setEnabled(false);
            gpVar.g.setEnabled(false);
            gpVar.d.setAlpha(120);
            gpVar.f.setAlpha(120);
            gpVar.e.setAlpha(120);
            gpVar.g.setAlpha(120);
        }
    }

    private void b(boolean z2) {
        if (z2) {
            if (!this.ah) {
                this.ah = true;
                SharedPreferences sharedPreferences = getSharedPreferences("ParadoxPrefsFile", 0);
                this.ai = sharedPreferences.getBoolean("Alarm.Vibrate", false);
                this.aj = sharedPreferences.getBoolean("Alarm.PlaySound", false);
            }
            if (this.ai) {
                long[] jArr = new long[7];
                jArr[1] = 200;
                jArr[2] = 500;
                jArr[3] = 200;
                jArr[4] = 500;
                jArr[5] = 200;
                jArr[6] = 500;
                if (this.c == null) {
                    this.c = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    if (this.c != null) {
                        this.c.vibrate(jArr, 1);
                    }
                }
            }
            if (this.aj) {
                Uri defaultUri = RingtoneManager.getDefaultUri(4);
                if (defaultUri == null && (defaultUri = RingtoneManager.getDefaultUri(2)) == null) {
                    defaultUri = RingtoneManager.getDefaultUri(1);
                }
                if (defaultUri != null) {
                    if (this.am == null) {
                        this.am = RingtoneManager.getRingtone(getApplicationContext(), defaultUri);
                    }
                    if (this.am != null && !this.am.isPlaying()) {
                        this.am.play();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this.c != null) {
            this.c.cancel();
            this.c = null;
        }
        if (this.am != null && this.am.isPlaying()) {
            this.am.stop();
        }
    }

    private void c() {
        a((View) null);
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        if (i2 == 0) {
            a(-1, new String[0]);
        } else {
            a(com.androidip.R.string.ZoneStatus, new String[0]);
        }
    }

    /* access modifiers changed from: private */
    public void c(View view) {
        this.r.setOnHomeListener((bh) null);
        this.a = null;
        a();
        if (this.w != null) {
            this.w.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
            unregisterForContextMenu(this.w);
            this.w.setOnItemClickListener((AdapterView.OnItemClickListener) null);
            this.w.getEmptyView().setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
            this.w.getEmptyView().setOnClickListener((View.OnClickListener) null);
            this.w.setEmptyView((View) null);
            this.w.setAdapter((ListAdapter) null);
            this.w = null;
        }
        this.u = null;
        this.T = this.i.j;
        a(true, d());
        c();
        e();
    }

    /* access modifiers changed from: private */
    public void d(View view) {
        a(com.androidip.R.string.Bypass, new String[0]);
        try {
            this.I.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
            this.I.getEmptyView().setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
            this.I.getEmptyView().setOnClickListener((View.OnClickListener) null);
            this.I.getEmptyView().setVisibility(View.GONE);
            this.I.setEmptyView((View) null);
            this.J.unregisterDataSetObserver(this.K);
            this.K = null;
            this.J = null;
        } catch (Exception e2) {
        }
    }

    /* access modifiers changed from: private */
    public boolean d()
    {
        return this.sdis.getCount() > 2;
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.T == null) {
            this.T = this.i.j;
        }
        b(this.T);
    }

    private void f() {
        if (this.r.getDisplayedChild() != 0) {
            if (this.u != null) {
                this.u.notifyDataSetChanged();
            } else if (this.v != null) {
                this.v.notifyDataSetChanged();
                if (this.v.getCount() <= 0) {
                    this.r.setDisplayedChild(0);
                }
            }
        }
    }

    boolean g(TabMainPanel a) {
        if (this.r.getDisplayedChild() != 1) {
            return false;
        }
        this.r.setDisplayedChild(0);
        return true;
    }

    /* access modifiers changed from: private */
    public void htab() {
        int i2 = 0;
        cz czVar = this.i.j;
        if (czVar != null) {
            com.Paradox.h.a().a(czVar.d() ? -1 : 0, 0);
            Object a2 = com.Paradox.h.a();
            if (czVar.S() || czVar.T()) {
                i2 = -2;
            }
            ((com.Paradox.h) a2).a(i2, 1);
            com.Paradox.h.a().a(czVar.p(), 2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
    @SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void itab() throws Throwable {
        String str;
        Log.d("REFRESH", "REFRESH begin!!!!!!!!!!!!!!!!!!!!");
        b(this.i.j.d());
        htab();
        if (this.i.j == null || !this.i.j.T()) {
            a(100);
        } else {
            a(getString(com.androidip.R.string.Troubles), getString(com.androidip.R.string.SystemHasTroubles), 100, false);
        }
        valoreant1 = this.ptab.getCurrentTab();
        Log.d("MAURO", "valoreant1 vale"+valoreant1);
        switch (this.ptab.getCurrentTab()) {
            case 0:
                a();
                this.sdis.notifyDataSetChanged();
                f();
                break;
            case 1:
                jinfo();
                break;
            case 2:
                if (this.J != null) {
                    this.J.notifyDataSetChanged();
                }
                if (this.H != null) {
                    this.H.notifyDataSetChanged();
                    break;
                }
                break;
            case 3:
                if (this.O != null) {
                    this.O.notifyDataSetChanged();
                }
                if (this.Q != null) {
                    this.Q.notifyDataSetChanged();
                    break;
                }
                break;
        }
        if (!this.al && d != null && this.i.j.d()) {
            String str2 = "iParadox - " + ((String) getText(com.androidip.R.string.inalarm));
            String str3 = "";
            try {
                if (this.i == null || this.i.j == null) {
                    str = "";
                } else {
                    Iterator it = ((gy) this.i.j.m().get(0)).b().g.O().iterator();
                    while (it.hasNext()) {
                        c cVar = (c) it.next();
                        if (cVar.d()) {
                            str3 = String.valueOf(str3) + cVar.u();
                            String str4 = "";
                            Iterator it2 = cVar.m().iterator();
                            while (it2.hasNext()) {
                                gy gyVar = (gy) it2.next();
                                if (gyVar.c() && gyVar.d()) {
                                    if (!str4.equals("")) {
                                        str4 = String.valueOf(str4) + ", ";
                                    }
                                    String str5 = String.valueOf(str4) + gyVar.p();
                                    this.al = true;
                                    str4 = str5;
                                }
                            }
                            if (!str4.equals("")) {
                                str3 = String.valueOf(str3) + "(" + str4 + ") ";
                            }
                        }
                    }
                    str = str3;
                }
            } catch (Exception e) {
                str = str3;
            }
            a(str2, str, this.ak, true);
            if (this.al) {
                this.ak++;
            }
        }
        if (!this.i.j.d()) {
            this.al = false;
        }
        Log.d("REFRESH", "!!!!!!!!!!!!!!REFRESH end");
        if (cont == 0) {
        this.hgeconnect.prova(0);
    }
    }
    /* access modifiers changed from: private */
    @SuppressLint("ResourceType")
    public void jinfo() {
        if (this.x != null && this.i != null) {
            Log.d("MAURO", "Sono in INFO");
            View findViewById = this.x.findViewById(com.androidip.R.id.infoList);
            View findViewById2 = findViewById.findViewById(com.androidip.R.id.infoAIM);
            if (findViewById2 != null) {
                ((TextView) findViewById2.findViewById(com.androidip.R.id.tvInfoDesc)).setText(com.androidip.R.string.AlarminMemory);
                Log.d("MAURO", "Sono in INFO e scrivo alarm in memory se non vale null");
                if (this.i.j == null || !this.i.j.S()) {
                    ((TextView) findViewById2.findViewById(com.androidip.R.id.tvInfoDesc2)).setText(com.androidip.R.id.layout_PGM_edit);
                    findViewById2.findViewById(com.androidip.R.id.infoBadge).setVisibility(View.GONE);
                    findViewById2.findViewById(com.androidip.R.id.infoMore).setVisibility(View.GONE);
                    findViewById2.setBackgroundResource(com.androidip.R.drawable.cell_normal);
                    findViewById2.setOnClickListener((View.OnClickListener) null);
                } else {
                    ((TextView) findViewById2.findViewById(com.androidip.R.id.tvInfoDesc2)).setText(com.androidip.R.id.btnEditPGMSave);
                    findViewById2.findViewById(com.androidip.R.id.infoBadge).setVisibility(View.VISIBLE);
                    findViewById2.findViewById(com.androidip.R.id.infoMore).setVisibility(View.VISIBLE);
                    findViewById2.setBackgroundResource(com.androidip.R.drawable.cell);
                    findViewById2.setOnClickListener(new fb(this));
                }
            }
            View findViewById3 = findViewById.findViewById(com.androidip.R.id.infoTrouble);
            if (findViewById3 != null) {
                ((TextView) findViewById3.findViewById(com.androidip.R.id.tvInfoDesc)).setText(com.androidip.R.string.Troubles);
                if (this.i.j == null || !this.i.j.T()) {
                    ((TextView) findViewById3.findViewById(com.androidip.R.id.tvInfoDesc2)).setText(com.androidip.R.string.None);
                    findViewById3.findViewById(com.androidip.R.id.infoBadge).setVisibility(8);
                    findViewById3.findViewById(com.androidip.R.id.infoMore).setVisibility(8);
                    findViewById3.setBackgroundResource(com.androidip.R.drawable.cell_normal);
                    findViewById3.setOnClickListener((View.OnClickListener) null);
                } else {
                    ((TextView) findViewById3.findViewById(com.androidip.R.id.tvInfoDesc2)).setText(com.androidip.R.string.Yes);
                    findViewById3.findViewById(com.androidip.R.id.infoBadge).setVisibility(0);
                    findViewById3.findViewById(com.androidip.R.id.infoMore).setVisibility(0);
                    findViewById3.setBackgroundResource(com.androidip.R.drawable.cell);
                    findViewById3.setOnClickListener(new fc(this));
                }
            }
            if (this.i.j == null || !this.i.j.S()) {
                if (this.x.getDisplayedChild() == 1) {
                    this.x.setDisplayedChild(0);
                    this.y = null;
                    this.z = null;
                }
            } else if (this.y != null) {
                this.y.notifyDataSetChanged();
            } else {
                this.y = new a(this, com.androidip.R.layout.zone_alarm, this.i.j.m(), this.i.j.u, this.sdis.getCount());
                this.z = (ListView) this.x.findViewById(com.androidip.R.id.alarmInMem);
                this.z.setAdapter(this.y);
                this.z.setOnItemClickListener(new fd(this));
            }
            if (this.i.j == null || !this.i.j.T()) {
                if (this.x.getDisplayedChild() == 2 || this.x.getDisplayedChild() == 3) {
                    this.x.setDisplayedChild(0);
                    this.A = null;
                    this.z = null;
                    this.C = null;
                    this.D = null;
                    this.E = null;
                }
            } else if (this.A != null) {
                this.A.notifyDataSetChanged();
                if (this.C != null) {
                    this.C.notifyDataSetChanged();
                }
            } else {
                this.A = new gr(this, com.androidip.R.layout.trouble_parentview, com.androidip.R.layout.trouble_childview, this.i.j);
                this.B = (ExpandableListView) this.x.findViewById(com.androidip.R.id.elvTroubles);
                this.B.setAdapter(this.A);
                this.B.setOnChildClickListener(this.ao);
                this.x.findViewById(com.androidip.R.id.trouble_detail_panel).setOnClickListener(new fe(this));
                this.x.setOnHomeListener(new ff(this));
            }
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        this.F.a(false, new fg(this));
        this.H = new e(this, com.androidip.R.layout.area_bypass_row_select);
        this.H.add(this.i.j);
        Iterator it = this.i.j.O().iterator();
        while (it.hasNext()) {
            ae aeVar = (ae) it.next();
            if (((c) aeVar).c()) {
                this.H.add(aeVar);
            }
        }
        this.L = new gc(this, (gc) null);
        this.H.registerDataSetObserver(this.L);
        this.G = (ListView) this.F.findViewById(com.androidip.R.id.lvBypass_Areas_select);
        if (((ag) this.i.j).e()) {
            registerForContextMenu(this.G);
            this.G.setOnCreateContextMenuListener(this.ap);
        }
        this.G.setAdapter(this.H);
        this.G.setOnItemClickListener(new fh(this));
    }

    /* access modifiers changed from: private */
    public void l() {
        View findViewById = this.R.findViewById(com.androidip.R.id.aboutSys);
        ((TextView) findViewById.findViewById(com.androidip.R.id.tvAbout)).setText(com.androidip.R.string.SystemInformation);
        findViewById.setOnClickListener(new fj(this));
        View findViewById2 = this.R.findViewById(com.androidip.R.id.aboutCon);
        ((TextView) findViewById2.findViewById(com.androidip.R.id.tvAbout)).setText(com.androidip.R.string.ConnectionSettings);
        findViewById2.setOnClickListener(new fl(this));
        View findViewById3 = this.R.findViewById(com.androidip.R.id.aboutApp);
        ((TextView) findViewById3.findViewById(com.androidip.R.id.tvAbout)).setText(com.androidip.R.string.AppInformation);
        findViewById3.setOnClickListener(new fn(this));
    }

    /* access modifiers changed from: private */
    public boolean m() {
        cz czVar = this.i.j;
        if ((czVar instanceof cb) && czVar.B == 2) {
            float parseFloat = Float.parseFloat(String.format(Locale.US, "%02X.%d", new Object[]{Integer.valueOf(czVar.C), Integer.valueOf(czVar.D)}));
            if (parseFloat >= 16.18f && parseFloat < 18.0f) {
                return false;
            }
            if (parseFloat >= 50.0f && parseFloat < 60.2f) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void ntab() throws Throwable {
        if (this.O == null) {
            this.N = (ListView) this.M.findViewById(com.androidip.R.id.lvPGMs);
            Log.d("MAURO", "SONO IN TabMainPanel str vale : ");
            this.O = new bjpgm(this, com.androidip.R.layout.pgm_row, this.i.j.P(), this.i.j.Fcz.d);
            this.N.setAdapter(this.O);
            this.M.findViewById(com.androidip.R.id.btnEditPGM).setOnClickListener(new fr(this));
            this.M.findViewById(com.androidip.R.id.btnEditPGMSave).setOnClickListener(new ft(this));
            this.M.setOnHomeListener(new fu(this));
            return;
        }
        itab();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.a == null) {
            a(this.i.j.n(), this.i.j.o(), (String) getText(com.androidip.R.string.AllAreas));
        } else {
            a(this.a.n(), this.a.o(), this.a.u());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r0.length() <= 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @SuppressLint("ResourceType")
    public void atab(int i, boolean z) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getText(com.androidip.R.string.Notification));
            CharSequence charSequence = null;
            try {
                charSequence = getText(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            builder.setMessage(getText((charSequence == null || charSequence.length() <= 0) ? com.androidip.R.string.UnknownresultcodeCOLON : com.androidip.R.string.UnknownresultcodeCOLON));
            builder.setIcon(17301543);
            builder.setPositiveButton(getText(com.androidip.R.string.OK), (DialogInterface.OnClickListener) new ey(this, z));
            builder.setCancelable(true);
            builder.setOnCancelListener(new ez(this, z));
            builder.create().show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public void btab() {
        try {
            this.jth = new glparte(this, this.an, true, 5000);
            this.k = new gk(this, this.an);
            this.l = new gd(this, this.an);
            //Log.d("MAURO", "Sono in btab1");
            this.i = new cq(this.k);
            this.hgeconnect = new geconnect(this);
            this.hgeconnect.execute(new Site[]{this.gsit});
            //Log.d("MAURO", "Sono in btab2");
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int i2;
        boolean z2 = false;
        switch (menuItem.getGroupId()) {
            case com.androidip.R.id.idMenuAreaBypass:
                if (this.H == null) {
                    return super.onContextItemSelected(menuItem);
                }
                AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
                switch (menuItem.getItemId()) {
                    case com.androidip.R.id.itemBypassOpenZones:
                        this.H.a(adapterContextMenuInfo.position, true, true);
                        return true;
                    case com.androidip.R.id.itemBypassArea:
                        this.H.a(adapterContextMenuInfo.position, true, false);
                        return true;
                    case com.androidip.R.id.itemUnBypasArea:
                        this.H.a(adapterContextMenuInfo.position, false, false);
                        return true;
                    default:
                        return true;
                }
            case com.androidip.R.id.idMenuZonetypes:
                if (this.u == null || this.w == null) {
                    return super.onContextItemSelected(menuItem);
                }
                menuItem.setChecked(!menuItem.isChecked());
                switch (menuItem.getItemId()) {
                    case com.androidip.R.id.itemOpen:
                        this.m = hd.OPEN;
                        break;
                    case com.androidip.R.id.itemClosed:
                        this.m = hd.CLOSED;
                        break;
                    case com.androidip.R.id.itemBypassed:
                        this.m = hd.BYPASSED;
                        break;
                    case com.androidip.R.id.itemAll:
                        this.m = hd.ALL;
                        break;
                    default:
                        return super.onContextItemSelected(menuItem);
                }
                this.u.a(this.m);
                return true;
            case com.androidip.R.id.idMenuZonetypesBypass:
                if (this.J == null) {
                    return super.onContextItemSelected(menuItem);
                }
                int a2 = this.J.a();
                if (!menuItem.isChecked()) {
                    z2 = true;
                }
                menuItem.setChecked(z2);
                switch (menuItem.getItemId()) {
                    case com.androidip.R.id.itemOpen:
                        if (!menuItem.isChecked()) {
                            i2 = a2 & (gz.a ^ -1);
                            break;
                        } else {
                            i2 = a2 | gz.a;
                            break;
                        }
                    case com.androidip.R.id.itemClosed:
                        if (!menuItem.isChecked()) {
                            i2 = a2 & (gz.b ^ -1);
                            break;
                        } else {
                            i2 = a2 | gz.b;
                            break;
                        }
                    case com.androidip.R.id.itemBypassed:
                        if (!menuItem.isChecked()) {
                            i2 = a2 & (gz.c ^ -1);
                            break;
                        } else {
                            i2 = a2 | gz.c;
                            break;
                        }
                    default:
                        return super.onContextItemSelected(menuItem);
                }
                this.o = this.J.a(i2);
                return true;
            default:
                return true;
        }
    }
    public void ridisegna(int i) {
        prova=i;
        //setContentView(com.androidip.R.layout.top_panel);
        this.sdis = new gbdisegna(this, this, com.androidip.R.layout.area_panel);
        //a();
        //this.sdis.notifyDataSetChanged();
        //f();
    }
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        S = this;
        this.gsit = (Site) getIntent().getExtras().getParcelable("com.Paradox.site");
        d = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        this.m = b("zoneView", 0);
        this.n = b("zoneViewBypass", 0);
        this.o = a("zoneViewTypeBypass_mask", gz.d);
        this.b = requestWindowFeature(7);
        setContentView(com.androidip.R.layout.top_panel);
        //Log.d("MAURO", "Sono in TOP PANEL");
        c(0);
        this.r = (ViewFlipperCleanupOnHome) findViewById(com.androidip.R.id.Area_zones);
        this.r.setOnSetDisplayedChildListener(new fv(this));
        this.sdis = new gbdisegna(this, this, com.androidip.R.layout.area_panel);
        //Log.d("MAURO", "Aggiungo Area PANEL");
        this.t = (ListView) this.r.findViewById(com.androidip.R.id.lvPanelAreas);
        this.t.setOnItemClickListener(this.ab);
        this.t.setClickable(true);
        this.t.setItemsCanFocus(true);
        this.t.setAdapter(this.sdis);
        Resources resources = getResources();
        this.ptab = (ReclickableTabHost) getTabHost();
        this.ptab.setEnabled(false);
        this.ptab.addTab(this.ptab.newTabSpec("tbSys").setContent(com.androidip.R.id.layout_tab_one).setIndicator(getText(com.androidip.R.string.System), resources.getDrawable(com.androidip.R.drawable.tab_system_icon_bar)));
        this.ptab.addTab(this.ptab.newTabSpec("tbInf").setContent(com.androidip.R.id.layout_tab_two).setIndicator(getText(com.androidip.R.string.Info), resources.getDrawable(com.androidip.R.drawable.tab_info_icon_bar)));
        this.ptab.addTab(this.ptab.newTabSpec("tbByP").setContent(com.androidip.R.id.layout_tab_three).setIndicator(getText(com.androidip.R.string.Bypass), resources.getDrawable(com.androidip.R.drawable.tab_bypass_icon_bar)));
        this.ptab.addTab(this.ptab.newTabSpec("tbPGM").setContent(com.androidip.R.id.layout_tab_four).setIndicator(getText(com.androidip.R.string.PGM), resources.getDrawable(com.androidip.R.drawable.tab_pgm_icon_bar)));
        this.ptab.addTab(this.ptab.newTabSpec("tbAbout").setContent(com.androidip.R.id.layout_tab_five).setIndicator(getText(com.androidip.R.string.About), resources.getDrawable(com.androidip.R.drawable.tab_about_icon_bar)));
        int i2 = 0;
        //Log.d("MAURO","DISEGNO i2 vale : "+ i2 );
        for (i2 = 0; i2 < this.ptab.getTabWidget().getChildCount(); i2++) {
            this.ptab.getTabWidget().getChildAt(i2).setEnabled(false);
            this.ptab.getTabWidget().getChildAt(i2).setBackgroundResource(com.androidip.R.drawable.tab_indicator_v4);
        }
        //com.Paradox.h.a(this.ptab.getTabWidget());
        com.Paradox.h.a((BadgeTabWidget) this.ptab.getTabWidget());
        btab();
    }

    @SuppressLint("LongLogTag")
    public void onDestroy() {
        super.onDestroy();
        Log.d("TabMainPanel", "onDestroy");
        if (this.e != null) {
            this.e.cancel();
            this.e = null;
        }
        try {
            this.i.a(this.gsit);
        } catch (Exception e2) {
            Log.e("DisconnectTask() threw error:", "");
            e2.printStackTrace();
        }
        try {
            this.jth.interrupt();
        } catch (Exception e3) {
            Log.e("refreshThread.interrupt() threw error:", "");
            e3.printStackTrace();
        }
        b(false);
    }

    @SuppressLint("LongLogTag")
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            switch (this.ptab.getCurrentTab()) {
                case 0:
                    if (g((TabMainPanel) this.a)) {
                        return true;
                    }
                    break;
                case 1:
                    if (this.x != null) {
                        switch (this.x.getDisplayedChild()) {
                            case 1:
                                this.x.setDisplayedChild(0);
                                return true;
                            case 2:
                                this.x.setDisplayedChild(0);
                                return true;
                            case 3:
                                this.x.setDisplayedChild(2);
                                return true;
                        }
                    }
                    break;
                case 2:
                    if (this.F != null && this.F.getDisplayedChild() > 0) {
                        this.F.setDisplayedChild(0);
                        return true;
                    }
                case 3:
                    if (this.M != null && this.M.getDisplayedChild() > 0) {
                        this.M.setDisplayedChild(0);
                        return true;
                    }
                case 4:
                    if (this.R != null && this.R.getDisplayedChild() > 0) {
                        this.R.setDisplayedChild(0);
                        return true;
                    }
            }
            if (this.f < SystemClock.elapsedRealtime() - 3500) {
                this.f = SystemClock.elapsedRealtime();
                this.e = Toast.makeText(this, com.androidip.R.string.exit_press_back_twice_to_change_site, Toast.LENGTH_LONG);
                this.e.show();
                return true;
            }
            Log.d("KeyP", "-----------------------------");
            if (this.e != null) {
                Log.d("KeyP", " kill toast");
                this.e.cancel();
                this.e = null;
                Log.d("KeyP", " killed toast");
            }
            if (this.hgeconnect != null) {
                Log.d("KeyP", " cancel connect");
                this.hgeconnect.d = true;
                this.hgeconnect.cancel(true);
                Log.d("KeyP", " canceled connect");
            }
            try {
                Log.d("KeyP", " module.disconnect>>");
                this.i.a(this.gsit);
                if (this.i.t == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("com.Paradox.site", this.gsit);
                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                    setResult(1, intent);
                }
                Log.d("KeyP", " module.disconnect<<");
            } catch (Exception e2) {
                Log.e("DisconnectTask() threw error:", "");
                e2.printStackTrace();
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void onPause() {
        super.onPause();
        Log.d("TabMainPanel", "onPause");
    }

    public void onRestart() {
        super.onRestart();
        Log.d("TabMainPanel", "onRestart");
    }

    public void onResume() {
        super.onResume();
        Log.d("TabMainPanel", "onResume");
    }

    public void onStart() {
        super.onStart();
        Log.d("TabMainPanel", "onStart");
    }

    public void onStop() {
        super.onStop();
        Log.d("TabMainPanel", "onStop");
        SharedPreferences sharedPreferences = getSharedPreferences("ParadoxPrefsFile", 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("zoneView", this.m.ordinal());
            edit.putInt("zoneViewBypass", this.n.ordinal());
            edit.putInt("zoneViewTypeBypass_mask", this.o);
            edit.commit();
        }
    }

}
