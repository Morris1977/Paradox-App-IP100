package com.Paradox;

import android.os.Handler;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import com.androidip.R;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

public class cq extends cvconn {
    private static /* synthetic */ int[] w;

    public cq(Observer observer) throws Throwable {
        super(observer);
    }

    static /* synthetic */ int[] a() {
        int[] iArr = w;
        if (iArr == null) {
            iArr = new int[de.values().length];
            try {
                iArr[de.ptEVO192.ordinal()] = 11;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[de.ptEVO48.ordinal()] = 9;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[de.ptEVO96.ordinal()] = 10;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[de.ptEVOVHD.ordinal()] = 12;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[de.ptMG5000.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[de.ptMG5050.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[de.ptSP4000.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[de.ptSP5500.ordinal()] = 5;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[de.ptSP6000.ordinal()] = 6;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[de.ptSP65.ordinal()] = 8;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[de.ptSP7000.ordinal()] = 7;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[de.ptUnknown.ordinal()] = 1;
            } catch (NoSuchFieldError e12) {
            }
            w = iArr;
        }
        return iArr;
    }

    public boolean acq(geconnect geconnectVar, Handler handler, Site site) {
        this.g = new jparte(this.i, new cr(this));
        this.an = handler;
        if (super.a(geconnectVar, site)) {
            return true;
        }
        this.g.ajparte();
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(byte[] bArr) {
        Log.d("IDP", "identifyPanel(ENTER)---->");
        if (37 != bArr.length) {
            this.t = R.string.PanelidentificationerrorCOLON;
            Log.d("IDP", "identifyPanel: Panel identification Error");
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        de l = this.j.l(bArr);
        if (de.a == l) {
            this.t = this.j.j;
            Log.d("IDP", "identifyPanel: Panel type unknown");
            return false;
        }
        int i = wrap.get(9) & 255;
        int i2 = wrap.get(10) & 255;
        int i3 = wrap.get(11) & 255;
        String format = String.format(Locale.US, "%02X %02X %02X %02X", Byte.valueOf(wrap.get(12)), Byte.valueOf(wrap.get(13)), Byte.valueOf(wrap.get(14)), Byte.valueOf(wrap.get(15)));
        Log.d("IDP", "identifyPanel: S/N='" + format + "'  panelType=" + l);
        try {
            this.n.c = true;
            String s = String.valueOf((a()[l.ordinal()]));
            switch (a()[l.ordinal()]) {
                case 2:
                    this.j = new cl(format, this.usi);
                    break;
                case 3:
                    //Log.d("IDP", "Prima di cm(format, this.u):" + format);
                    this.j = new cm(format, this.usi);
                    //Log.d("IDP", "Dopo :cm(format, this.u)"+this.j);
                    break;
                case 4:
                    if (i <= 5 && (i != 5 || i2 < 12)) {
                        this.j = new dg(format, this.usi);
                        break;
                    } else {
                        this.j = new dh(format, this.usi);
                        break;
                    }
                case 5:
                    this.j = new di(format, this.usi);
                    break;
                case 6:
                    this.j = new dj(format, this.usi);
                    break;
                case 7:
                    this.j = new dl(format, this.usi);
                    break;
                case 8:
                    this.j = new dk(format, this.usi);
                    break;
                case 9:
                    this.j = new cf(format, this.usi);
                    break;
                case 10:
                default:
                    this.n.c = false;
                    this.t = R.string.UnsupportedpanelCOLON;
                    Log.d("IDP", "identifyPanel: Unsupportedpanel ERROR");
                    return false;
                case 11:
                    if (i <= 2 && (i != 2 || i2 < 112)) {
                        this.j = new cc(format, this.usi);
                        break;
                    } else {
                        this.j = new cd(format, this.usi);
                        break;
                    }
                case 12:
                    this.j = new cg(format, this.usi);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            cz czVar = this.j;
            this.t = R.string.internalError;
            czVar.j = R.string.internalError;
            Log.e("IdentifyPanel", "identifyPanel: EXCEPTION");
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        }
        //this.j.Mcz()="";
        Log.d("IdentifyPanel", "Created " + this.j.Mcz());
        this.j.B = i;
        this.j.C = i2;
        this.j.D = i3;
        this.j.E = format;
        this.j.k = this;
        this.j.addObserver(this.m);
        Log.d("IDP", "<----identifyPanel(EXIT)");
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b(byte[] bArr) throws Throwable {
        boolean z = false;
        this.k.lock();
        i(bArr);
        try {
            if (!this.l.await(10000, TimeUnit.MILLISECONDS)) {
                i(bArr);
                if (!this.l.await(7000, TimeUnit.MILLISECONDS)) {
                    this.t = R.string.RequesttimeoutCOLON;
                    this.k.unlock();
                    return z;
                }
            }
            z = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.k.unlock();
        return z;
    }

    public boolean c(byte[] bArr) {
        boolean z = false;
        this.k.lock();
        try {
            g(bArr);
            if (!this.l.await(10000, TimeUnit.MILLISECONDS)) {
                g(bArr);
                if (!this.l.await(7000, TimeUnit.MILLISECONDS)) {
                    this.t = R.string.RequesttimeoutCOLON;
                    this.k.unlock();
                    return z;
                }
            }
            z = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        }
        this.k.unlock();
        return z;
    }

    public boolean a(geconnect geconnect, Handler an, Site a2) {
        return false;
    }
}
