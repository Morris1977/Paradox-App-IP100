package com.Paradox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.a.a.a.a.hlic;
import com.a.a.a.a.l;
import com.a.a.a.a.q;
import com.androidip.R;

import java.util.List;

public class ParadoxActivity extends Activity {
    private static final byte[] f = {-46, 102, 30, Byte.MIN_VALUE, -103, -57, 74, -64, 51, -1, -95, -45, 77, -117, -36, -113, -11, 45, -64, 89};
    /* access modifiers changed from: private */
    public static int j = 256;
    ParadoxActivity aprova;
    BroadcastReceiver bprova = new dn(this);
    View.OnClickListener cprova = new dr(this);
    Dialog dprova;
    /* access modifiers changed from: private */
    public String eprova = "MainActivity";
    /* access modifiers changed from: private */
    public l g;
    /* access modifiers changed from: private */
    public hlic hlic;
    /* access modifiers changed from: private */
    public Handler i;
    private Toast k;
    private long l = 0;
    /* access modifiers changed from: private */
    public ecimp m;
    /* access modifiers changed from: private */
    public dw nprova;
    /* access modifiers changed from: private */
    public boolean o = false;
    /* access modifiers changed from: private */
    public boolean p = true;
    private final View.OnCreateContextMenuListener q = new Cdo(this);
    private final AdapterView.OnItemClickListener rinizio = new dp(this);
    /* access modifiers changed from: private */
    public View.OnClickListener s = new dq(this);

    @SuppressLint("ResourceType")
    private void cinizio() throws Throwable {
        boolean requestWindowFeature = requestWindowFeature(7);
        setContentView(R.layout.sitelist);
        if (requestWindowFeature) {
           getWindow().setFeatureInt(7,R.layout.titlebar );
           ((TextView) findViewById(R.id.wtTitle1)).setText(R.string.MySites);
        }
        this.m = new ecimp(this);
        this.m.a();
        List c2 = this.m.c();
        if (c2.size() <= 0) {
            c2.add(this.m.a(new Site(eb.ADD_BUTTON)));
        }
        this.nprova = new dw(this, this, R.layout.sitelist_row, c2);
        ListView listView = (ListView) findViewById(R.id.Sitelist);
        listView.setOnItemClickListener(this.rinizio);
        listView.setItemsCanFocus(false);
        listView.setAdapter(this.nprova);
        listView.setOnCreateContextMenuListener(this.q);
        findViewById(R.id.networkInfo).setOnClickListener(new ds(this));
        registerReceiver(this.bprova, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        if (!aciao()) {
            this.p = false;
            this.k = Toast.makeText(this, R.drawable.addsite_button, 1);
            this.k.show();
        }
    }

    /* access modifiers changed from: private */
    public void cinizio(Site site) {
        Intent intent = new Intent(this, EditSiteActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.Paradox.site", site);
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
    }

    private void d() {
        this.hlic.a(this.g);
    }

    private void d(Site site) throws Throwable {
        if (site.o() != eb.ADD_BUTTON) {
            if (this.nprova.getCount() >= j) {
                if (this.nprova.getPosition(site) == this.nprova.getCount() - 1) {
                    site.b(true);
                    this.m.b(site);
                } else {
                    this.m.c(site);
                    this.nprova.remove(site);
                    Site site2 = (Site) this.nprova.getItem(this.nprova.getCount() - 1);
                    if (site2.o() != eb.ADD_BUTTON) {
                        site2.b(false);
                        this.m.b(site2);
                        this.nprova.add(this.m.a(new Site(eb.ADD_BUTTON)));
                    }
                }
                this.nprova.notifyDataSetChanged();
                return;
            }
            this.m.c(site);
            this.nprova.remove(site);
        }
    }

    private void e(Site site) throws Throwable {
        Site site2 = (Site) this.nprova.getItem(this.nprova.getCount() - 1);
        if (this.nprova.getCount() < j) {
            site.b(false);
            site.a(site2.a());
            if (this.m.b(site)) {
                this.nprova.remove(site2);
                this.nprova.add(site);
                this.nprova.add(this.m.a(new Site(eb.ADD_BUTTON)));
            }
        } else if (site2.o() == eb.ADD_BUTTON) {
            site2.b(false);
            site.a(site2.a());
            this.m.b(site);
            this.nprova.remove(site2);
            this.nprova.add(site);
        }
    }

    public void atab(Site site) {
        Intent intent = new Intent(this, TabMainPanel.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.Paradox.site", site);
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
    }

    public boolean aciao() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            return (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) || (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected());
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @SuppressLint("ResourceType")
    public Dialog bciao(Site site) {
        this.dprova = new Dialog(this);
        this.dprova.getWindow().setSoftInputMode(5);
        this.dprova.requestWindowFeature(1);
        this.dprova.setContentView(R.layout.custom_connect_dialog);
        ((TextView) this.dprova.findViewById(R.id.cnxTitle1)).setText(site.f());
        if (site.p()) {
            ((TextView) this.dprova.findViewById(R.id.cnxTitle2)).setText(site.b());
        } else {
            ((TextView) this.dprova.findViewById(R.id.cnxTitle2)).setText(site.c());
        }
        TextView textView = (TextView) this.dprova.findViewById(R.id.modulePW);
        if (site.g().length() <= 0) {
            textView.setImeOptions(268435461);
        } else {
            textView.setVisibility(8);
            this.dprova.findViewById(R.id.modulePWLabel).setVisibility(8);
        }
        TextView textView2 = (TextView) this.dprova.findViewById(R.id.panelPW);
        textView2.setImeOptions(268435462);
        textView2.setTag(site);
        CheckBox checkBox = (CheckBox) this.dprova.findViewById(R.id.rememberMe);
        checkBox.setChecked(site.j());
        checkBox.setTag(site);
        Button button = (Button) this.dprova.findViewById(R.id.connect);
        button.setTag(site);
        checkBox.setOnClickListener(new dt(this));
        button.setOnClickListener(new du(this));
        return this.dprova;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Bundle extras;
        LocateActivity.LocatedDevice locatedDevice = null;
        int i4 = 0;
        super.onActivityResult(i2, i3, intent);
        if (i3 == 0 || i3 == 1) {
            if (this.dprova != null) {
                this.dprova.cancel();
                this.dprova = null;
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                this.m.b((Site) extras.getParcelable("com.Paradox.site"));
            }
        } else if (i3 == 2) {
            int intExtra = intent.getIntExtra("errcode", 0);
            if (this.dprova != null && intExtra != 0) {
                TextView textView = (TextView) this.dprova.findViewById(R.id.modulePW);
                TextView textView2 = (TextView) this.dprova.findViewById(R.id.panelPW);
                if (intExtra == R.string.InvalidIPpasswordCOLON) {
                    this.dprova.findViewById(R.id.modulePWLabel).setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView.requestFocus();
                } else if (intExtra == R.string.InvalidusercodeCOLON) {
                    this.dprova.findViewById(R.id.modulePWLabel).setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                    textView2.requestFocus();
                }
            }
        } else if (i3 == 7) {
            Log.d(this.eprova, "onActivityResult: GOT_IP");
            Bundle extras2 = intent.getExtras();
            Log.d("MAURO", "VERIFICO LICENZA");
            boolean contatore = false;
            if ((extras2 != null && (locatedDevice = (LocateActivity.LocatedDevice) extras2.getParcelable("com.Paradox.IP")) != null) || (contatore==false)) {
                Site site = new Site();
                site.b(locatedDevice.b);
                site.b((long) locatedDevice.a);
                site.c(locatedDevice.c);
                site.d(locatedDevice.d);
                site.e("");
                site.fsite("");
                site.c(0);
                site.a("");
                site.a(true);
                try {
                    e(site);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
                new hn(this, this.aprova, this.o, this.p, site);
            }
        } else if (i3 == 4) {
            Log.d(this.eprova, "onActivityResult: CANCEL");
        } else if (i3 == 5) {
            Log.d(this.eprova, "onActivityResult: DELETE");
            Site site2 = (Site) intent.getExtras().getParcelable("com.Paradox.site");
            while (i4 < this.nprova.getCount()) {
                if (site2.a() == ((Site) this.nprova.getItem(i4)).a()) {
                    try {
                        d((Site) this.nprova.getItem(i4));
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                    return;
                }
                i4++;
            }
        } else if (i3 == 6 || i3 == 3) {
            Log.d(this.eprova, "onActivityResult: SAVE + CONNECT");
            Site site3 = (Site) intent.getExtras().getParcelable("com.Paradox.site");
            while (true) {
                if (i4 >= this.nprova.getCount()) {
                    break;
                } else {
                    assert site3 != null;
                    if (site3.a() == ((Site) this.nprova.getItem(i4)).a()) {
                        Site site4 = (Site) this.nprova.getItem(i4);
                        assert site4 != null;
                        if (site4.o() == eb.ADD_BUTTON) {
                            try {
                                e(site3);
                            } catch (Throwable e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            site4.b(site3.c());
                            site4.e(site3.g());
                            site4.b((long) site3.d());
                            site4.c(site3.e());
                            site4.d(site3.f());
                            site4.fsite(site3.hsit());
                            site4.a(site3.j());
                            site4.a(site3.b());
                            site4.c((long) site3.i());
                            site4.d((long) site3.l());
                            site4.hsi(site3.m());
                            site4.e((long) site3.n());
                            this.m.b(site4);
                            this.nprova.notifyDataSetChanged();
                            break;
                        }
                    } else {
                        i4++;
                    }
                }
            }
            if (i3 == 6) {
                new hn(this, this.aprova, this.o, this.p, site3);
            }
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Site site = (Site) this.nprova.getItem((int) ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).id);
        switch (menuItem.getItemId()) {
            case R.id.itemEdit:
                cinizio(site);
                return true;
            case R.id.itemNewSite:
                try {
                    e(new Site(eb.ADD_BUTTON));
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
                return true;
            case R.id.itemDelete:
                try {
                    d(site);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
                return true;
            case R.id.itemLocate:
                startActivityForResult(new Intent(this, LocateActivity.class), 0);
                return true;
            case R.id.itemConnect:
                new hn(this, this.aprova, this.o, this.p, site);
                return true;
            case R.id.itemRememberMe:
                site.a(!site.j());
                if (!site.j()) {
                    site.fsite("");
                }
                this.m.b(site);
                return true;
            default:
                return super.onContextItemSelected(menuItem);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.aprova = this;
        Settings.Secure.getString(getContentResolver(), "android_id");
        this.i = new Handler();
        this.g = new dv(this, (dv) null);
        this.hlic = new hlic(this, new q(), "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApiMOcfsFgCcXSrwIcjSoj17wxDBWoAOxf0n63zR6ntXS86ckF95vlzKZMpzkuIheOb5+trjIRkSC4FbjdGNLs1mbvQTKFPnMjSlgaVbdM2x/rfHLmM/1DRAdja0uarMRVL9DFMrMYLxiVU8H1BZRm5ChcPmSkWPYRi+VjSgZ1gGOfeQwz6VaH/UuJCpzf5Tk3KaeYA1bYVAt1NJLDONB/+vwmxNLB9WQcDGYGgNxChB5FdIMMSgMmAy8Cka9d5l6EX65GR3Au/sHBL4VBuKYzgzICD644nrz1027UeZ1FPUYtAoFj4lLnOoDqPi0gE4CGkgr2F0l8Ze8+Vv9I82ERQIDAQAB");
        this.o = false;
        d();
        try {
            cinizio();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressLint("ResourceType")
    public boolean onCreateOptionsMenu(Menu menu) {
        int i2 = 17301520;
        getMenuInflater().inflate(R.menu.options, menu);
        SharedPreferences sharedPreferences = getSharedPreferences("ParadoxPrefsFile", 0);
        boolean z = sharedPreferences.getBoolean("Alarm.Vibrate", false);
        boolean z2 = sharedPreferences.getBoolean("Alarm.PlaySound", false);
        menu.findItem(R.id.itemVibrate).setIcon(z ? 17301520 : 17301519);
        MenuItem findItem = menu.findItem(R.id.itemPlaySound);
        if (!z2) {
            i2 = 17301519;
        }
        findItem.setIcon(i2);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.hlic.a();
        Log.d(this.eprova, "onDestroy");
        this.m.b();
    }

    @SuppressLint("ResourceType")
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (this.l < SystemClock.elapsedRealtime() - 3500) {
                this.l = SystemClock.elapsedRealtime();
                this.k = Toast.makeText(this, R.string.exit_press_back_twice_to_exit, 1);
                this.k.show();
                return true;
            } else if (this.k != null) {
                this.k.cancel();
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z = false;
        SharedPreferences sharedPreferences = getSharedPreferences("ParadoxPrefsFile", 0);
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        boolean z2 = sharedPreferences.getBoolean("Alarm.Vibrate", false);
        boolean z3 = sharedPreferences.getBoolean("Alarm.PlaySound", false);
        switch (menuItem.getItemId()) {
            case R.id.itemVibrate:
                if (!z2) {
                    z = true;
                }
                edit.putBoolean("Alarm.Vibrate", z);
                break;
            case R.id.itemPlaySound:
                if (!z3) {
                    z = true;
                }
                edit.putBoolean("Alarm.PlaySound", z);
                break;
            case R.id.itemLanguage:
                startActivity(new Intent(this, LanguageSelectActivity.class));
                break;
            case R.id.AppInfo:
                this.k = Toast.makeText(this, "iParadox " + gw.a(getApplicationContext(), getClass()), Toast.LENGTH_LONG);
                this.k.show();
                break;
        }
        edit.commit();
        return true;
    }

    public void onPause() {
        Log.d(this.eprova, "onPause");
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        int i2 = 17301520;
        SharedPreferences sharedPreferences = getSharedPreferences("ParadoxPrefsFile", 0);
        boolean z = sharedPreferences.getBoolean("Alarm.Vibrate", false);
        boolean z2 = sharedPreferences.getBoolean("Alarm.PlaySound", false);
        menu.findItem(R.id.itemVibrate).setIcon(z ? 17301520 : 17301519);
        MenuItem findItem = menu.findItem(R.id.itemPlaySound);
        if (!z2) {
            i2 = 17301519;
        }
        findItem.setIcon(i2);
        return true;
    }

    public void onRestart() {
        super.onRestart();
        Log.d(this.eprova, "onRestart");
    }

    public void onResume() {
        Log.d(this.eprova, "onResume");
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        Log.d(this.eprova, "onStart");
    }

    public void onStop() {
        super.onStop();
        Log.d(this.eprova, "onStop");
    }
}
