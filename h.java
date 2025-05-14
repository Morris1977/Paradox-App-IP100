package com.a.a.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.a.a.a.a.dec.aa;
import com.a.a.a.a.a.b;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class h implements ServiceConnection {
    private static final SecureRandom b = new SecureRandom();
    public String a;
    private e c;
    /* access modifiers changed from: private */
    public PublicKey d;
    private final Context e;
    private final o f;
    /* access modifiers changed from: private */
    public Handler g;
    private final String h;
    /* access modifiers changed from: private */
    public final Set i = new HashSet();
    private final Queue j = new LinkedList();

    public h(Context context, o oVar, String str) {
        this.e = context;
        this.f = oVar;
        this.d = a(str);
        this.h = this.e.getPackageName();
        this.a = a(context, this.h);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
    }

    private static String a(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    private static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(aa.a(str)));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (b e3) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e3);
        } catch (InvalidKeySpecException e4) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e4);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(m mVar) {
        this.i.remove(mVar);
        if (this.i.isEmpty()) {
            c();
        }
    }

    private void b() {
        while (true) {
            m mVar = (m) this.j.poll();
            if (mVar != null) {
                try {
                    Log.i("LicenseChecker", "Calling checkLicense on service for " + mVar.c());
                    this.c.a((long) mVar.b(), mVar.c(), new i(this, mVar));
                    this.i.add(mVar);
                } catch (RemoteException e2) {
                    Log.w("LicenseChecker", "RemoteException in checkLicense call.", e2);
                    b(mVar);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void b(m mVar) {
        this.f.a(291, (p) null);
        if (this.f.a()) {
            mVar.a().a(291);
        } else {
            mVar.a().b(291);
        }
    }

    private void c() {
        if (this.c != null) {
            try {
                this.e.unbindService(this);
            } catch (IllegalArgumentException e2) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.c = null;
        }
    }

    private int d() {
        return b.nextInt();
    }

    public synchronized void a() {
        c();
        this.g.getLooper().quit();
    }

    public synchronized void a(l lVar) {
        if (this.f.a()) {
            Log.i("LicenseChecker", "Using cached license response");
            lVar.a(256);
        } else {
            m mVar = new m(this.f, new n(), lVar, d(), this.h, this.a);
            if (this.c == null) {
                Log.i("LicenseChecker", "Binding to licensing service.");
                try {
                    Intent intent = new Intent(new String(aa.a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=")));
                    intent.setPackage("com.android.vending");
                    if (this.e.bindService(intent, this, 1)) {
                        this.j.offer(mVar);
                    } else {
                        Log.e("LicenseChecker", "Could not bind to service.");
                        b(mVar);
                    }
                } catch (SecurityException e2) {
                    lVar.c(6);
                } catch (b e3) {
                    e3.printStackTrace();
                }
            } else {
                this.j.offer(mVar);
                b();
            }
        }
        return;
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.c = f.a(iBinder);
        b();
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.c = null;
    }
}
