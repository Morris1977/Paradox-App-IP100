package com.Paradox;

import android.annotation.SuppressLint;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.Paradox.cn */
/* loaded from: /tmp/jadx-1275642724699090087.dex */
public class cn extends co implements ag {

    /* renamed from: a */
    private static /* synthetic */ int[] a;
    public int valoreant=0;

    public cn(String str, Site site) throws Throwable {
        super(str, site);
        g();
        h();
        r();
        q();
        ((co) this).n = (byte[]) new byte[]{1, 1, 31, -1, 32, Byte.MIN_VALUE, 0, 32, Byte.MIN_VALUE, 1, 32, 8, -108, 32, 7, 48, 32, 7, 80, 32, 7, 112, 32, 3, 16}.clone();
    }

    /* renamed from: v */
    static /* synthetic */ int[] v() {
        int[] iArr = a;
        if (iArr == null) {
            iArr = new int[ddalarm.values().length];
            try {
                iArr[ddalarm.acDisarm.ordinal()] = 5;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ddalarm.acFullArm.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ddalarm.acInstantArm.ordinal()] = 4;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[ddalarm.acSleepArm.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[ddalarm.acStayArm.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            a = iArr;
        }
        return iArr;
    }

    /* renamed from: I */
    public boolean I() {
        short s;
        boolean z;
        short s2;
        boolean z2;
        byte[] t = t();
        int d = d(0);
        Iterator it = m().iterator();
        while (true) {
            if (!it.hasNext()) {
                s = 0;
                z = false;
                break;
            }
            gy gyVar = (gy) it.next();
            if (gyVar.c() && d != gyVar.q()) {
                s = (short) gyVar.n();
                Log.d("RSS: Zone=" + gyVar.o(), "address=" + ((int) s));
                z = true;
                break;
            }
        }
        if (!z) {
            Iterator it2 = this.v.iterator();
            while (it2.hasNext()) {
                dz dzVar = (dz) it2.next();
                if (d != dzVar.j()) {
                    short f = (short) dzVar.f();
                    Log.d("RSS: PGM=" + dzVar.g(), "address=" + ((int) f));
                    s2 = f;
                    z2 = true;
                    break;
                }
            }
        }
        s2 = s;
        z2 = z;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(t);
            if (z2 && s2 > 0) {
                byteArrayOutputStream.write(32);
                byteArrayOutputStream.write((byte) ((s2 >> 8) & 255));
                byteArrayOutputStream.write((byte) (s2 & 255));
            }
            if (this.k.b(byteArrayOutputStream.toByteArray())) {
                return true;
            }
            this.j = this.k.t;
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        }
    }

    /* renamed from: J */
    public boolean J() throws Throwable {
        this.y = 1;
        return K();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean K() throws Throwable {
        boolean z;
        byte[] bArr = {32, 8, -48};
        int d = (0);
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (d != cVar.w() || d != cVar.x()) {
                z = true;
                break;
            }
            while (it.hasNext()) {
            }
        }
        z = false;
        if (!z || this.k.b(bArr)) {
            return true;
        }
        this.j = this.k.t;
        return false;
    }

    /* renamed from: a */
    public int a()
    {
        return 2;
    }

    /* renamed from: a */
    public int a(int i) {
        return d(i);
    }

    /* renamed from: a */
    public int a(int i, df dfVar) {
        return d(i);
    }

    /* renamed from: a */
    public void a(byte[] bArr) {
        Log.d("[processInitialization]", "");
        if (37 != bArr.length) {
            Log.e("EMGSP_0_: Wrong length", "bArr vale :"+bArr.length);
        }
        if (bArr[4] == 0 && bArr[5] == 0 && bArr[6] == 0 && bArr[7] == 0) {
            Log.w("Bogus packet!", "bArr[4] e bArr[5] valgono : "+ bArr[4] +" "+ bArr[5]);
            return;
        }
        byte[] bArr2 = new byte[37];
        bArr2[4] = bArr[4];
        bArr2[5] = bArr[5];
        bArr2[6] = bArr[6];
        bArr2[7] = bArr[7];
        bArr2[8] = bArr[8];
        bArr2[9] = bArr[9];
        bArr2[13] = 85;
        bArr2[14] = 18;
        bArr2[15] = 52;
        bArr2[16] = 86;
        bArr2[33] = 6;
        bArr2[36] = a(bArr2, 36);
        i(bArr2);
    }

    /* renamed from: a */
    public boolean a(int i, int i2) {
        k(b(i, 1 == i2 ? 50 : 51));
        return true;
    }

    /* renamed from: a */
    @SuppressLint("LongLogTag")
    public boolean a(int i, ddalarm ddalarmVar) {
        int i2;
        valoreant = v()[ddalarmVar.ordinal()];
        Log.d("MAURO", "Sono in CN pronto x inserire antifurto v()[ddVar.ordinal()] vale : "+v()[ddalarmVar.ordinal()]);
        switch (v()[ddalarmVar.ordinal()]) {
            case 1:
                i2 = 4;
                Log.d("MAURO", "Inserisco il TOTALE");
                break;
            case 2:
                i2 = 3;
                Log.d("MAURO", "Inserisco NOTTE");
                break;
            case 3:
                i2 = 1;
                break;
            case 4:
            default:
                Log.e("[setAreaArmingLevel(invalid action):" + ddalarmVar, "");
                return false;
            case 5:
                i2 = 5;
                Log.d("MAURO", "DISINSERISCO");
                break;
        }
        j(b(i, i2)); //riga345
        return true;
    }

    /* renamed from: a */
    public boolean a(int i, byte[] bArr) {
        short f;
        short s;
        if (i >= 0) {
            try {
                if (i <= c() && bArr != null) {
                    byte[] bArr2 = new byte[32];
                    Log.d("PGM: pgmIndex=" + i, "");
                    if (i % 2 != 0) {
                        dz dzVar = (dz) this.v.get(i - 1);
                        f = (short) dzVar.f();
                        for (int i2 = 0; i2 < dzVar.h().b().length && i2 < 16; i2++) {
                            bArr2[i2] = dzVar.h().b()[i2];
                        }
                        for (int i3 = 0; i3 < bArr.length; i3++) {
                            if (i3 >= 16) {
                                s = f;
                                break;
                            }
                            bArr2[i3 + 16] = bArr[i3];
                        }
                    } else {
                        f = (short) ((dz) this.v.get(i)).f();
                        dz dzVar2 = (dz) this.v.get(i + 1);
                        for (int i4 = 0; i4 < bArr.length && i4 < 16; i4++) {
                            bArr2[i4] = bArr[i4];
                        }
                        for (int i5 = 0; i5 < dzVar2.h().b().length && i5 < 16; i5++) {
                            bArr2[i5 + 16] = dzVar2.h().b()[i5];
                        }
                    }
                    s = f;
                    Log.d("PGM: address=" + ((int) s), "");
                    byte[] m17b = b(s, bArr2);
                    if (m17b == null) {
                        return false;
                    }
                    b(m17b, 250);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean a(ddalarm ddalarmVar) {
        return false;
    }

    /* renamed from: a */
    @SuppressLint("LongLogTag")
    public boolean a(gy[] gyVarArr, boolean z) {
        if (gyVarArr == null) {
            Log.e("setZoneBypass: Invalid zone array", "");
            return false;
        }
        j(a(gyVarArr, 16));
        for (gy gyVar : gyVarArr) {
            gyVar.k(z);
        }
        return true;
    }

    /* renamed from: a */
    @SuppressLint("LongLogTag")
    byte[] a(gy[] gyVarArr, int i) {
        Log.d("[prepare_MGSP_4_EX_]", "");
        if (gyVarArr == null || gyVarArr.length == 0) {
            Log.e("prepare_MGSP_4_EX_: Invalid zone array", null);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write((byte) (gyVarArr.length * 37));
        for (gy gyVar : gyVarArr) {
            byte[] bArr = new byte[37];
            bArr[0] = 64;
            bArr[2] = (byte) i;
            bArr[3] = (byte) gyVar.o();
            bArr[33] = 6;
            bArr[34] = (byte) this.o;
            bArr[36] = a(bArr, 36);
            try {
                byteArrayOutputStream.write(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a_ */
    public int a_() {
        return 0;
    }

    /* renamed from: b */
    public int b() {
        return 32;
    }

    /* renamed from: b */
    public int b(int i) {
        return d(i);
        //return i;
    }

    /* renamed from: b */
    public void b(byte[] bArr) {
        this.l.lock();
        this.s = true;
        this.m.signalAll();
        this.l.unlock();
    }

    /* renamed from: b */
    byte[] b(int i, int i2) {
        Log.d("[ prepareMGSP_4_]", "");
        byte[] bArr = new byte[38];
        bArr[0] = 37;
        bArr[1] = 64;
        bArr[3] = (byte) i2;
        bArr[4] = (byte) i;
        bArr[34] = 6;
        bArr[35] = (byte) this.o;
        bArr[37] = a(com.Paradox.f.a(bArr, 1, bArr.length), 36);
        return bArr;
    }

    /* renamed from: b */
    byte[] b(short s, byte[] bArr) {
        Log.d("[ prepareWriteToPanel]", "");
        if (32 < bArr.length) {
            Log.e("EMGSP_6_: Data too long", "");
            return null;
        }
        byte[] bArr2 = new byte[37];
        bArr2[0] = 96;
        bArr2[2] = (byte) (s >> 8);
        bArr2[3] = (byte) (s & 255);
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i + 4] = bArr[i];
        }
        bArr2[36] = a(bArr2, 36);
        return bArr2;
    }

    /* renamed from: b_ */
    boolean b_() {
        return super.b_();
    }

    /* renamed from: c */
    public int c() {
        return 16;
    }

    /* renamed from: c */
    protected int c(int i) {
        return d(i);
    }

    /* renamed from: c */
    void c(byte[] bArr) {
        Log.d("[processMMGSP_4_", "");
        this.l.lock();
        if (37 != bArr.length) {
            Log.e("MGSP_4_: Wrong length", "");
        }
        this.m.signalAll();
        this.l.unlock();
    }

    /* renamed from: d */
    public void d(byte[] bArr) {
        Log.d("[processReadFromPane;]", "");
        if (37 != bArr.length) {
            Log.e("EMGSP_5_: Wrong length", "");
        }
        this.l.lock();
        this.z = com.Paradox.f.a(bArr, 4, bArr.length);
        this.m.signalAll();
        this.l.unlock();
    }

    /* renamed from: e */
    void e(byte[] bArr) {
        Log.d(" prepareWriteToPanel]", "");
        if (37 != bArr.length) {
            Log.e("EMGSP_6_: Wrong length", "");
        }
        this.l.lock();
        this.A = true;
        this.m.signalAll();
        this.l.unlock();
    }

    /* renamed from: e */
    public boolean e() {
        return false;
    }

    /* renamed from: f */
    @SuppressLint("LongLogTag")
    void f(byte[] bArr) {
        Log.d("[ prepareStopSerialConnection]", "");
        if (37 != bArr.length) {
            Log.e("EMGSP_5_: Wrong length", "");
        }
        this.l.lock();
        try {
            switch (bArr[2]) {
                case 5:
                    this.s = false;
                    break;
            }
        } catch (Exception e) {
        }
        this.m.signalAll();
        this.l.unlock();
    }

    /* renamed from: f */
    public boolean f() {
        return false;
    }

    /* renamed from: g */
    void g() {
        this.t = new byte[1];
    }

    /* renamed from: g */
    public void g(byte[] bArr) throws Throwable {
        Log.d("[ processCommand]", "");
        switch (bArr[0] & 240) {
            case 0:
                a(bArr);
                return;
            case 16:
                b(bArr);
                return;
            case 64:
                c(bArr);
                return;
            case 80:
                d(bArr);
                return;
            case 96:
                e(bArr);
                return;
            case 112:
                f(bArr);
                return;
            case 224:
                Log.d("[live event]", "");
                return;
            case 240:
                Log.w("[bogus command 0xF_]", "");
                return;
            default:
                super.g(bArr);
                return;
        }
    }

    /* renamed from: h */
    void h() {
        this.u = new CopyOnWriteArrayList();
        for (int i = 0; i < a(); i++) {
            this.u.add(new c(this, i, 784));
        }
    }

    /* renamed from: q */
    void q() {
        for (int i = 0; i < b(); i++) {
            //Log.d("MAURO", "SONO IN cn prima di Fcz");
            m().add(new gy(this, i, ((i / 2) * 32) + 16));
            //Log.d("MAURO", "SONO IN cn dopo di Fcz");
        }
    }

    /* renamed from: r */
    void r() {
        for (int i = 0; i < c(); i++) {
            this.v.add(new dz(this, i, ((i / 2) * 32) + 528));
        }
    }

    /* renamed from: t */
    byte[] t() {
        return new byte[]{32, Byte.MIN_VALUE, 0, 32, Byte.MIN_VALUE, 1, 32, Byte.MIN_VALUE, 2};
    }

}
