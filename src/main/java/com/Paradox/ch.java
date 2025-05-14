package com.Paradox;

import android.annotation.SuppressLint;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;

public abstract class ch extends cz {
    int a;
    boolean b;

    public ch(String str, Site site) throws Throwable {
        super(str, site);
    }

    private void A(byte[] bArr) {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8009 -> invalid length " + length);
            return;
        }
        int i = 96;
        int i2 = 0;
        while (i < 192) {
            int i3 = (i - 96) / 8;
            gy gyVar = (gy) m().get(i);
            int i4 = 1 << ((i - 96) % 8);
            int i5 = gyVar.d((bArr[i3] & i4) != 0) ? i2 + 1 : i2;
            if (gyVar.f((bArr[i3 + 12] & i4) != 0)) {
                i5++;
            }
            if (gyVar.h()) {
                this.c.e = true;
                gyVar.d(false);
                gyVar.d(true);
                i5++;
            }
            if (gyVar.e((bArr[i3 + 24] & i4) != 0)) {
                i5++;
            }
            if (gyVar.g()) {
                this.c.a = true;
                i5++;
            }
            i++;
            i2 = i5;
        }
        if (i2 > 0) {
            a(96, com.Paradox.f.a(bArr, 36, length), 28, false);
            b(false);
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                cVar.h(false);
                cVar.a();
            }
            m82a(true, "_process_0x8009()");
            return;
        }
        a(96, com.Paradox.f.a(bArr, 36, length), 28, false);
    }

    private void B(byte[] bArr) {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x800a -> invalid length " + length);
        } else {
            a(124, bArr, 64, true);
        }
    }

    private void C(byte[] bArr) throws Throwable {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8010 -> invalid length " + length);
            return;
        }
        ci ciVar = new ci(this, (ci) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            dm dmVar = (dm) it.next();
            if (dmVar.a() <= 254) {
                int a2 = (dmVar.a() + 1) / 8;
                int a3 = (dmVar.a() + 1) % 8;
                if (a2 <= length - 1) {
                    try {
                        dmVar.b = ciVar.a(dmVar.b, (bArr[a2] & (1 << a3)) != 0);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        dmVar.c = ciVar.a(dmVar.c, (bArr[a2 + 32] & (1 << a3)) != 0);
                    } catch (Exception e2) {
                        Log.e("_process_0x8010", "bytePos=" + a2 + " index=" + dmVar.a() + " : " + dmVar.c());
                        e2.printStackTrace();
                    }
                }
            }
        }
        if (byteArrayOutputStream.size() > 0) {
            this.k.g(byteArrayOutputStream.toByteArray());
        }
        if (ciVar.a > 0) {
            m82a(true, "_process_0x8010()  ChangesGlobal=" + ciVar.a);
        }
    }

    private void D(byte[] bArr) {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8011 -> invalid length " + length);
        }
    }

    private void a(int i, byte[] bArr) {
        Log.d("", "[_process_AreaLabels]");
        int length = bArr.length;
        if (16 != length) {
            Log.e("Error", "_process_AreaLabels -> invalid length " + length);
            return;
        }
        try {
            c cVar = (c) this.u.get(i);
            cVar.a(bArr, a(cVar.q()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        int length = bArr.length;
        if (i2 * 2 > length) {
            Log.e("Error", "_process_ZoneAssignment -> invalid length " + length);
        } else if (i + i2 > m().size()) {
            Log.e("Error", "_process_ZoneAssignment -> invalid index");
        } else {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i2) {
                byte b2 = (byte) (bArr[i5 * 2] & 255);
                gy gyVar = (gy) m().get(i5 + i);
                byte b3 = (byte) (b2 & 15);
                if (b3 < 1) {
                    i4 = gyVar.a(false) ? i6 + 1 : i6;
                    Log.e("Error", "_process_ZoneAssignment -> invalid areaNo=" + b3 + "  s/b > 0 ");
                } else {
                    if ((this.p & (1 << (b3 - 1))) != 0) {
                        if (gyVar.a(((b2 >> 4) & 15) != 0)) {
                            i3 = i6 + 1;
                        }
                        i3 = i6;
                    } else {
                        if (gyVar.a(false)) {
                            i3 = i6 + 1;
                        }
                        i3 = i6;
                    }
                    if (b3 - 1 < this.u.size()) {
                        c cVar = (c) this.u.get(b3 - 1);
                        if (gyVar.c() && !cVar.a(gyVar)) {
                            cVar.a(gyVar, false);
                            i3++;
                        }
                    }
                    i4 = gyVar.n((bArr[(i5 * 2) + 1] & 2) != 0) ? i3 + 1 : i3;
                }
                i5++;
                i6 = i4;
            }
            if (i6 > 0) {
                b(false);
                Iterator it = this.u.iterator();
                while (it.hasNext()) {
                    c cVar2 = (c) it.next();
                    if (cVar2.hasChanged()) {
                        cVar2.h(false);
                        cVar2.a();
                    }
                }
                m82a(true, "_process_ZoneAssignment()");
            }
        }
    }

    private void a(int i, byte[] bArr, int i2, boolean z) {
        boolean z2;
        Log.d("_process_ZoneFlags", "index=" + i + " count=" + i2 + " updatearea=" + z + " datalen=0x" + Integer.toHexString(bArr.length));
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2 && i3 + i < m().size()) {
            gy gyVar = (gy) m().get(i3 + i);
            int i5 = gyVar.h((bArr[i3] & 1) != 0) ? i4 + 1 : i4;
            if (gyVar.j()) {
                this.c.i = true;
                this.i.b.b = true;
                i5++;
            }
            if (gyVar.i((bArr[i3] & 2) != 0)) {
                i5++;
            }
            if (gyVar.j((bArr[i3] & 4) != 0)) {
                i5++;
            }
            if (gyVar.k((bArr[i3] & 8) != 0)) {
                i5++;
            }
            if (gyVar.l((bArr[i3] & 16) != 0)) {
                i5++;
            }
            if (gyVar.m((bArr[i3] & 32) != 0)) {
                i5++;
            }
            if (gyVar.b((bArr[i3] & 64) != 0)) {
                i5++;
            }
            if (gyVar.c((bArr[i3] & 128) != 0)) {
                i5++;
            }
            i3++;
            i4 = i5;
        }
        if (this.c.i) {
            Iterator it = m().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((gy) it.next()).j()) {
                        i4++;
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            this.c.i = z2;
            this.i.b.b = z2;
        }
        if (z && i4 > 0) {
            b(false);
            Iterator it2 = this.u.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                cVar.h(false);
                cVar.a();
            }
            m82a(true, "_process_ZoneFlags()");
        }
    }

    public void a(byte[] bArr) {
        c(bArr, 0);
    }

    private void b(int i, byte[] bArr, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2 && i4 + i < this.u.size()) {
            c cVar = (c) this.u.get(i + i4);
            cVar.a();
            if (!cVar.c) {
                byte b2 = bArr[i4 * 6];
                boolean z = (b2 & 16) != 0 && (b2 >> 5) == 0;
                if (cVar.c_() != z) {
                    cVar.b(z);
                    this.b = true;
                }
                boolean z2 = (b2 & 16) != 0;
                if (cVar.d() != z2) {
                    cVar.a(z2, true);
                    this.b = true;
                }
                if ((bArr[(i4 * 6) + 3] & 64) != 0) {
                    cVar.a(d.atPanicAlarm);
                } else if ((b2 & 32) != 0) {
                    cVar.a(d.atSilentAlarm);
                } else if ((b2 & 64) != 0) {
                    cVar.a(d.atAudibleAlarm);
                } else if ((b2 & 128) != 0) {
                    cVar.a(d.atFireAlarm);
                } else {
                    cVar.a(d.atUnknown);
                }
                byte b3 = bArr[(i4 * 6) + 1];
                boolean z3 = (b3 & 2) != 0;
                if (cVar.i() != z3) {
                    cVar.b(z3, true);
                    if (cVar.i()) {
                        cVar.a(System.currentTimeMillis());
                    }
                }
                boolean z4 = (b3 & 4) != 0;
                if (cVar.k() != z4) {
                    cVar.f(z4);
                    if (cVar.k()) {
                        cVar.b(System.currentTimeMillis());
                    }
                }
                boolean z5 = (b3 & 16) != 0;
                if (cVar.g() != z5) {
                    cVar.c(z5);
                    this.b = true;
                }
                boolean z6 = (b3 & 32) != 0;
                if (cVar.h() != z6) {
                    cVar.d(z6);
                    this.b = true;
                    Log.w("area(" + i4 + ")._zoneBypass=" + cVar.h(), "");
                }
                cVar.g(((bArr[(i4 * 6) + 2] & 4) == 0 && (bArr[(i4 * 6) + 3] & 8) == 0) ? false : true);
                byte b4 = bArr[i4 * 6];
                cVar.a((b4 & 4) != 0 ? 5 : (b4 & 8) != 0 ? 3 : ((b4 & 1) != 0 || cVar.i()) ? 1 : 2, true);
                if ((bArr[(i4 * 6) + 2] & 128) != 0) {
                    this.b = true;
                }
                if (cVar.hasChanged()) {
                    cVar.a();
                    i3 = i5 + 1;
                    i4++;
                    i5 = i3;
                }
            }
            i3 = i5;
            i4++;
            i5 = i3;
        }
        if (i5 > 0) {
            m82a(true, "_process_AreaStatus() Changes=" + i5);
        }
    }

    public void b(byte[] bArr) {
        c(bArr, 64);
    }

    @SuppressLint("LongLogTag")
    private void c(int i, byte[] bArr, int i2) throws Throwable {
        int i3;
        int i4;
        boolean z = false;
        if (i2 > bArr.length) {
            Log.e("_process_Module_Troubles -> invalid length=" + bArr.length, "");
        } else if (i + i2 > this.w.size()) {
            Log.e("_process_Module_Troubles -> invalid index", "");
        } else {
            ci ciVar = new ci(this, (ci) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i5 = 0;
            while (i < i2) {
                dm dmVar = (dm) this.w.get(i);
                if (dmVar != null) {
                    dmVar.d = ciVar.a(dmVar.d, (bArr[i] & 1) != 0);
                    dmVar.h = ciVar.a(dmVar.h, (bArr[i] & 32) != 0);
                    dmVar.i = ciVar.a(dmVar.i, (bArr[i] & 64) != 0);
                    dmVar.j = ciVar.a(dmVar.j, (bArr[i] & 128) != 0);
                    if (i5 < 20) {
                        try {
                            i4 = c(dmVar.a());
                        } catch (Exception e) {
                            e.printStackTrace();
                            i4 = 0;
                        }
                        if (dmVar.f() && i4 != dmVar.d()) {
                            try {
                                a(dmVar).writeTo(byteArrayOutputStream);
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            i3 = i5 + 1;
                            i++;
                            i5 = i3;
                        }
                    }
                }
                i3 = i5;
                i++;
                i5 = i3;
            }
            if (byteArrayOutputStream.size() > 0) {
                this.k.g(byteArrayOutputStream.toByteArray());
            }
            this.f.n = (bArr[33] & 2) != 0;
            this.f.o = (bArr[44] & 8) != 0;
            hu huVar = this.i.b;
            if ((bArr[39] & 16) != 0) {
                z = true;
            }
            huVar.a = z;
            if (ciVar.a > 0) {
                m82a(true, "_process_Module_Troubles() ChangesGlobal=" + ciVar.a);
            }
        }
    }

    private void c(byte[] bArr) {
    }

    public void c(byte[] bArr, int i) {
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c((int) bArr[i2], i2 + i);
        }
    }

    private void d(int i, byte[] bArr) {
        try {
            int length = bArr.length;
            if (16 != length || i >= m().size()) {
                Log.e("Error", "_process_ZoneLabels -> invalid length " + length);
                return;
            }
            gy gyVar = (gy) m().get(i);
            gyVar.a(com.Paradox.f.a(bArr, 0, bArr.length), gyVar.o() < 96 ? a(gyVar.o(), df.zftLabel) : a(gyVar.o(), df.zftLabel2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void d(byte[] bArr) {
        c(bArr, 192);
    }

    private void e(int i, byte[] bArr) {
        try {
            int length = bArr.length;
            if (16 != length) {
                Log.e("Error", "_process_ModuleLabels -> invalid length " + length);
                return;
            }
            dm dmVar = (dm) this.w.get(i);
            if (dmVar != null) {
                dmVar.a(bArr, c(dmVar.a()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(byte[] bArr) {
        if (1 != bArr.length) {
            return;
        }
        byte b = 1;
        for (int i = 0; i < this.u.size(); i++) {
            if ((this.p & b) != 0) {
                c cVar = (c) this.u.get(i);
                cVar.a((bArr[0] & b) != 0);
                if (cVar.c()) {
                    this.k.an.obtainMessage(cq.d, cVar).sendToTarget();
                }
            } else {
                ((c) this.u.get(i)).a(false);
            }
            Log.d("", "[_areaEnabled(" + i + ") = " + ((c) this.u.get(i)).c());
            b <<= 1;
        }
    }

    private void f(int i, byte[] bArr) {
        int length = bArr.length;
        if (length < 5) {
            Log.d("Error", "_process_ModuleSerialNo -> invalid length " + length);
            return;
        }
        dm dmVar = (dm) this.w.get(i);
        if (dmVar != null) {
            dmVar.a(String.format(Locale.US, "%02X%02X%02X%02X", new Object[]{Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3])}));
        }
    }

    private void f(byte[] bArr) {
        Log.d("_process_0x01f0 Len=" + bArr.length, ab.a(bArr));
        a(0, bArr, 32);
    }

    private void g(int i, byte[] bArr) {
        try {
            int length = bArr.length;
            if (5 > length) {
                Log.e("Error", "_process_AreaDelay -> invalid length %d" + length);
            } else if (i < this.u.size()) {
                c cVar = (c) this.u.get(i);
                int a2 = a(cVar.q());
                cVar.b((int) bArr[0], a2);
                cVar.a((int) bArr[3], a2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void h(int i, byte[] bArr) {
        int length = bArr.length;
        if (1 > length) {
            Log.e("Error", "_process_PgmTimer -> invalid length " + length);
        } else if (i < this.v.size()) {
            ((dz) this.v.get(i)).b((int) bArr[0]);
        }
    }

    private void m(byte[] bArr) {
        a(32, bArr, 16);
    }

    private void n(byte[] bArr) {
        a(48, bArr, 32);
    }

    private void o(byte[] bArr) {
        a(80, bArr, 16);
    }

    private void p(byte[] bArr) {
        a(96, bArr, 32);
    }

    private void q(byte[] bArr) {
        a(128, bArr, 32);
    }

    private void r(byte[] bArr) {
        a(160, bArr, 32);
    }

    @SuppressLint("LongLogTag")
    private void s(byte[] bArr) {
        boolean z;
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8001 -> invalid length " + length);
            return;
        }
        ci ciVar = new ci(this, (ci) null);
        Log.d("_globalTrouble.communication", "data[13+0]=" + bArr[13]);
        this.c.a = ciVar.a(this.c.a, (bArr[13] & 32) != 0);
        this.c.b = ciVar.a(this.c.b, (bArr[14] & 7) != 0);
        this.c.c = ciVar.a(this.c.c, (bArr[14] & 24) != 0);
        this.c.d = ciVar.a(this.c.d, (bArr[13] & 2) != 0);
        this.c.e = ciVar.a(this.c.e, (bArr[13] & 16) != 0);
        this.c.f = ciVar.a(this.c.f, (bArr[16] & 1) != 0);
        this.c.g = false;
        this.c.h = ciVar.a(this.c.h, (bArr[13] & 128) != 0);
        this.c.j = ciVar.a(this.c.j, (bArr[13] & 8) != 0);
        this.c.l = ciVar.a(this.c.l, (bArr[14] & 128) != 0);
        boolean z2 = (bArr[13] & 4) != 0;
        if (z2 != this.c.k) {
            this.c.k = ciVar.a(this.c.k, z2);
            z = true;
        } else {
            z = z2;
        }
        this.h.a = ciVar.a(this.h.a, this.c.h);
        this.d.a = ciVar.a(this.d.a, (bArr[14] & 2) != 0);
        this.d.b = ciVar.a(this.d.b, (bArr[14] & 1) != 0);
        this.d.c = ciVar.a(this.d.c, (bArr[14] & 4) != 0);
        this.d.j = ciVar.a(this.d.j, (bArr[16] & 32) != 0);
        this.d.k = ciVar.a(this.d.k, (bArr[16] & 64) != 0);
        this.d.l = ciVar.a(this.d.l, (bArr[16] & 128) != 0);
        this.e.a = ciVar.a(this.e.a, (bArr[14] & 16) != 0);
        this.e.b = ciVar.a(this.e.b, (bArr[14] & 8) != 0);
        this.f.a = ciVar.a(this.f.a, (bArr[15] & 1) != 0);
        this.f.b = ciVar.a(this.f.b, (bArr[15] & 2) != 0);
        this.f.c = ciVar.a(this.f.c, (bArr[15] & 4) != 0);
        this.f.d = ciVar.a(this.f.d, (bArr[15] & 8) != 0);
        this.f.e = ciVar.a(this.f.e, (bArr[15] & 16) != 0);
        this.f.f = false;
        this.f.g = false;
        this.f.h = ciVar.a(this.f.h, (bArr[15] & 32) != 0);
        this.g.b = ciVar.a(this.g.b, (bArr[16] & 1) != 0);
        this.i.a.b = ciVar.a(this.i.a.b, (bArr[13] & 8) != 0);
        this.i.a.c.a = ciVar.a(this.i.a.c.a, (bArr[17] & 1) != 0);
        ci ciVar2 = new ci(this, (ci) null);
        int i = 0;
        while (i < 96 && i < m().size()) {
            int i2 = i / 8;
            gy gyVar = (gy) m().get(i);
            int i3 = 1 << (i % 8);
            boolean f = gyVar.f();
            gyVar.d(ciVar2.a(gyVar.f(), (bArr[i2 + 28] & i3) != 0));
            gyVar.f(ciVar2.a(gyVar.h(), (bArr[i2 + 40] & i3) != 0));
            if (gyVar.h()) {
                this.c.e = ciVar.a(this.c.e, true);
                if (!gyVar.f()) {
                    gyVar.d(true);
                    if (!f) {
                        ciVar2.a++;
                    }
                }
            }
            gyVar.e(ciVar2.a(gyVar.g(), (bArr[i2 + 52] & i3) != 0));
            if (gyVar.g()) {
                this.c.a = ciVar.a(this.c.a, true);
            }
            i++;
        }
        if (ciVar2.a > 0) {
            b(false);
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                cVar.h(false);
                cVar.a();
            }
        }
        if (ciVar2.a > 0 || ciVar.a > 0) {
            m82a(true, "_process_0x8001() ChangesZones=" + ciVar2.a + " ChangesGlobal=" + ciVar.a);
        }
        if (z) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                D().writeTo(byteArrayOutputStream);
                E().writeTo(byteArrayOutputStream);
                this.k.g(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    private void t(byte[] bArr) {
        int length = bArr.length;
        if (64 != length) {
            Log.d("Error", "_process_0x8002 -> invalid length " + length);
        } else {
            a(0, bArr, 64, true);
        }
    }

    private void u(byte[] bArr) {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8003 -> invalid length " + length);
            return;
        }
        a(64, bArr, 32, true);
        b(0, com.Paradox.f.a(bArr, 32, length + 2), 6);
    }

    private void v(byte[] bArr) {
        boolean z = false;
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8004 -> invalid length " + length);
            return;
        }
        b(6, com.Paradox.f.a(bArr, 4, (length - 4) - 1), 2);
        ci ciVar = new ci(this, (ci) null);
        if (!((bArr[33] & 1) == 0 && (bArr[33] & 2) == 0)) {
            this.c.d = ciVar.a(this.c.d, true);
        }
        this.i.b.a = ciVar.a(this.i.b.a, (bArr[39] & 16) != 0);
        this.f.o = ciVar.a(this.f.o, (bArr[44] & 8) != 0);
        this.f.n = ciVar.a(this.f.n, (bArr[46] & 2) != 0);
        this.f.i = ciVar.a(this.f.i, (bArr[46] & 4) != 0);
        this.f.j = ciVar.a(this.f.j, (bArr[46] & 8) != 0);
        this.f.k = ciVar.a(this.f.k, (bArr[46] & 16) != 0);
        this.f.l = ciVar.a(this.f.l, (bArr[46] & 32) != 0);
        ho hoVar = this.f;
        boolean z2 = this.f.m;
        if ((bArr[46] & 64) != 0) {
            z = true;
        }
        hoVar.m = ciVar.a(z2, z);
        if (ciVar.a > 0) {
            m82a(true, "_process_0x8004() ChangesGlobal=" + ciVar.a);
        }
    }

    private void w(byte[] bArr) throws Throwable {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8005 -> invalid length " + length);
        } else {
            c(0, com.Paradox.f.a(bArr, 1, length - 1), length - 1);
        }
    }

    private void x(byte[] bArr) throws Throwable {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8006 -> invalid length " + length);
        } else {
            c(63, com.Paradox.f.a(bArr, 0, length - 1), length - 1);
        }
    }

    private void y(byte[] bArr) throws Throwable {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8007 -> invalid length " + length);
        } else {
           c(127, com.Paradox.f.a(bArr, 0, length - 1), length - 1);
        }
    }

    private void z(byte[] bArr) throws Throwable {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x8008 -> invalid length " + length);
        } else {
           c(191, com.Paradox.f.a(bArr, 0, length - 1), length - 1);
        }
    }

    /* access modifiers changed from: protected */
    public abstract ByteArrayOutputStream D() throws Exception;

    /* access modifiers changed from: protected */
    public abstract ByteArrayOutputStream E() throws Exception;

    /* access modifiers changed from: protected */
    public abstract int a(int i);

    /* access modifiers changed from: protected */
    public abstract int a(int i, df dfVar);

    /* access modifiers changed from: package-private */
    public abstract ByteArrayOutputStream a(dm dmVar) throws Exception;

    /* access modifiers changed from: package-private */
    public void b(int i, byte[] bArr) {
        try {
            int length = bArr.length;
            if (1 > length) {
                Log.e("Error", "_process_AreaSpecialDelay -> invalid length " + length);
            } else if (i < this.u.size()) {
                c cVar = (c) this.u.get(i);
                cVar.c(bArr[0], a(cVar.q()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public abstract int c(int i);

    public void c(int i, byte[] bArr) throws Throwable {
        switch (i) {
            case 496:
                f(bArr);
                return;
            case 560:
                m(bArr);
                return;
            case 592:
                n(bArr);
                return;
            case 656:
                o(bArr);
                return;
            case 3000:
            case 3010:
            case 3020:
                h((i - 3000) / 10, bArr);
                return;
            case 14808:
                e(bArr);
                return;
            case 14955:
            case 15062:
            case 15169:
            case 15276:
            case 15383:
            case 15490:
            case 15597:
            case 15704:
                a((i - 14955) / 107, bArr);
                return;
            case 14997:
            case 15104:
            case 15211:
            case 15318:
            case 15425:
            case 15532:
            case 15639:
            case 15746:
                g((i - 14997) / 107, bArr);
                return;
            case 15019:
            case 15126:
            case 15233:
            case 15340:
            case 15447:
            case 15554:
            case 15661:
            case 15768:
                b((i - 15019) / 107, bArr);
                return;
            case 24111:
            case 24121:
                h(((i - 24111) / 10) + 3, bArr);
                return;
            case 24759:
                p(bArr);
                return;
            case 24823:
                q(bArr);
                return;
            case 24887:
                r(bArr);
                return;
            case 32769:
                s(bArr);
                return;
            case 32770:
                t(bArr);
                return;
            case 32771:
                u(bArr);
                return;
            case 32772:
                v(bArr);
                return;
            case 32773:
                w(bArr);
                return;
            case 32774:
                x(bArr);
                return;
            case 32775:
                y(bArr);
                return;
            case 32776:
                z(bArr);
                return;
            case 32777:
                A(bArr);
                return;
            case 32778:
                B(bArr);
                return;
            case 32779:
                h(bArr);
                return;
            case 32784:
                C(bArr);
                return;
            case 32785:
                D(bArr);
                return;
            case 40704:
                a(bArr);
                return;
            case 40768:
                b(bArr);
                return;
            case 40832:
                c(bArr);
                return;
            case 40896:
                d(bArr);
                return;
            default:
                if (i >= 1072 && i <= 2592) {
                    d((i - 1072) / 16, bArr);
                    return;
                } else if (i >= 25335 && i <= 26855) {
                    d(((i - 25335) / 16) + 96, bArr);
                    return;
                } else if (i >= 20039 && i <= 24087) {
                    e((i - 20039) / 16, bArr);
                    return;
                } else if (i < 31162 || i > 32437) {
                    Log.e("Error", "processRead: unknown address = 0x" + Integer.toHexString(i));
                    return;
                } else {
                    f((i - 31162) / 5, bArr);
                    return;
                }
        }
    }

    /* access modifiers changed from: protected */
    public void h(byte[] bArr) {
        int length = bArr.length;
        if (64 != length) {
            Log.e("Error", "_process_0x800b -> invalid length " + length);
        } else {
            a(188, bArr, 4, true);
        }
    }
}
