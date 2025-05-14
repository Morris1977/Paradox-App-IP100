package com.a.a.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import com.a.a.a.a.dec.aa;
import com.a.a.a.a.dec.b;
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

public class hlic implements ServiceConnection {
    private static final SecureRandom b = new SecureRandom();
    public String a;
    private byte[] c;
    boolean cont;
    public PublicKey d;
    private final Context e;
    private final o fhlic;
    public Handler g;
    private final String h;
    /* access modifiers changed from: private */
    public final Set i = new HashSet();
    private final Queue j = new LinkedList();

    public hlic(Context context, o oVar, String str) {
        this.e = context;
        this.fhlic = oVar;
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
    public synchronized void a(mlic mlicVar) {
        this.i.remove(mlicVar);
        if (this.i.isEmpty()) {
            c();
        }
    }

    private void b() {
        while (true) {
            mlic mlicVar = (mlic) this.j.poll();
            if (mlicVar != null) {
                Log.i("LicenseChecker", "Calling checkLicense on service for " + mlicVar.c());
                //this.c.a((long) mVar.b(), mVar.c(), new i(this, mVar));
                this.i.add(mlicVar);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void b(mlic mlicVar) {
        this.fhlic.a(291, (p) null);
        if (this.fhlic.a()) {
            mlicVar.a().a(291);
        } else {
            mlicVar.a().b(291);
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
        if (this.fhlic.a() || cont==false ) {
            Log.i("LicenseChecker", "Using cached license response");
            lVar.a(256);
        } else {
            mlic mlicVar = new mlic(this.fhlic, new n(), lVar, d(), this.h, this.a);
            if (this.c == null) {
                Log.i("LicenseChecker", "Binding to licensing service.---------------------");
                try {
                    Intent intent = new Intent(new String(aa.a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=")));
                    intent.setPackage("com.android.vending");
                    if (this.e.bindService(intent, this, 1)) {
                        this.j.offer(mlicVar);
                    } else {
                        Log.e("LicenseChecker", "Could not bind to service.");
                        b(mlicVar);
                    }
                } catch (SecurityException e2) {
                    lVar.c(6);
                } catch (b e3) {
                    e3.printStackTrace();
                }
            } else {
                this.j.offer(mlicVar);
                b();
            }
        }
        return;
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.c = fhlic.a(iBinder);
        b();
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.c = null;
    }
}
