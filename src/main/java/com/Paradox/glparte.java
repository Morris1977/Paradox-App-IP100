package com.Paradox;

import android.os.Handler;
import android.util.Log;

import com.androidip.R;

import java.lang.ref.WeakReference;

public class glparte extends Thread {
    final /* synthetic */ TabMainPanel a;
    private WeakReference b;
    private int c = 5000;
    public int contgl = 0;

    public glparte(TabMainPanel tabMainPanel, Handler handler, boolean z, int i) {
        this.a = tabMainPanel;
        this.b = new WeakReference(handler);
        this.c = i;
    }

    void bgl() throws Throwable {
        try {
            System.gc();
            Log.d("Main Thread", "WATCHING>>>>>>>>>>>>>>>>>>>>>>>>");
            Thread.sleep(2);
            while (this.a.i.j.y != 1) {
                Thread.sleep(1);
                if (this.a.i.t != 0) {
                    Log.e("Main Thread ERROR", "waiting for SYSTEM_MONITORING_STARTED failed");
                    Log.d("Main Thread", "WATCHING<<<<<<<<<<<<<<<<<<<< exit  error=" + this.a.i.t);
                    if (this.a.i.t != 0) {
                        ((Handler) this.b.get()).sendMessageAtFrontOfQueue(((Handler) this.b.get()).obtainMessage(cq.c | cq.b, Integer.valueOf(this.a.i.t)));
                        return;
                    }
                    return;
                }
            }
            while (!Thread.interrupted()) {
                if (contgl == 1) {
                    this.a.itab();
                    contgl = 2;
                }
                if (!a()) {
                    break;
                }
                System.gc();
            }
            Log.d("Main Thread", "WATCHING<<<<<<<<<<<<<<<<<<<< exit  error=" + this.a.i.t);
            if (this.a.i.t != 0) {
                ((Handler) this.b.get()).sendMessageAtFrontOfQueue(((Handler) this.b.get()).obtainMessage(cq.c | cq.b, Integer.valueOf(this.a.i.t)));
            }
        } catch (InterruptedException e) {
            Log.e("Error", "startMonitoring() INTERRUPTED");
            Log.d("Main Thread", "WATCHING<<<<<<<<<<<<<<<<<<<< exit  error=" + this.a.i.t);
            if (this.a.i.t != 0) {
                ((Handler) this.b.get()).sendMessageAtFrontOfQueue(((Handler) this.b.get()).obtainMessage(cq.c | cq.b, Integer.valueOf(this.a.i.t)));
            }
        } catch (Exception e2) {
            Log.e("Error", "startMonitoring() FAILED");
            e2.printStackTrace();
            Log.d("Main Thread", "WATCHING<<<<<<<<<<<<<<<<<<<< exit  error=" + this.a.i.t);
            if (this.a.i.t != 0) {
                ((Handler) this.b.get()).sendMessageAtFrontOfQueue(((Handler) this.b.get()).obtainMessage(cq.c | cq.b, Integer.valueOf(this.a.i.t)));
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            Log.d("Main Thread", "WATCHING<<<<<<<<<<<<<<<<<<<< exit  error=" + this.a.i.t);
            if (this.a.i.t != 0) {
                ((Handler) this.b.get()).sendMessageAtFrontOfQueue(((Handler) this.b.get()).obtainMessage(cq.c | cq.b, Integer.valueOf(this.a.i.t)));
            }
            throw th2;
        }
    }

    public boolean a() {
        try {
            if (!this.a.i.j.I()) {
                Log.e("Main Thread ERROR", "readSystemStatus error");
                if (this.a.i.t != 0) {
                    return false;
                }
                this.a.i.t = R.string.UnknownresultcodeCOLON;
                return false;
            }
            Thread.sleep((long) this.c);
            return true;
        } catch (InterruptedException e) {
            this.a.i.t = 0;
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            if (this.a.i.t == 0) {
                this.a.i.t = R.string.UnknownresultcodeCOLON;
            }
            Log.e("Update", "exception:");
            e2.printStackTrace();
            return false;
        }
    }

    public void run() {
        try {
            Log.d("glparte", "Sono dentro glparte");
            bgl();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
