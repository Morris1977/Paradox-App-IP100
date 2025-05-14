package com.Paradox;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Iterator;

public abstract class co extends cz {
    public co(String str, Site site) throws Throwable {
        super(str, site);
    }

    private void A(byte[] bArr) {
        b(10, bArr);
    }

    private void B(byte[] bArr) {
        b(12, bArr);
    }

    private void C(byte[] bArr) {
        b(14, bArr);
    }

    private void D(byte[] bArr) {
        int i = 0;
        if (32 == bArr.length) {
            while (true) {
                int i2 = i;
                if (i2 < 2) {
                    try {
                        //Log.d("MAURO", "Sono in CO");
                        ((c) this.u.get(i2)).a(f.a(bArr, i2 * 16, (i2 * 16) + 16), a(0));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @SuppressLint("LongLogTag")
    private void E(byte[] bArr) {
        if (32 == bArr.length) {
            c cVar = (c) this.u.get(0);
            c cVar2 = (c) this.u.get(1);
            cVar.a();
            cVar2.a();
            int i = 0;
            int i2 = 0;
            while (i < 11) {
                gy gyVar = (gy) m().get(i);
                gyVar.a();
                gyVar.a(bArr[i * 3] != 0);
                switch (bArr[(i * 3) + 1]) {
                    case 1:
                        if (!cVar.c()) {
                            gyVar.a(false);
                        }
                        cVar.a(gyVar, false);
                        break;
                    case 2:
                        if (!cVar2.c()) {
                            gyVar.a(false);
                        }
                        cVar2.a(gyVar, false);
                        break;
                    case 3:
                        if (!cVar.c() && !cVar2.c()) {
                            gyVar.a(false);
                        }
                        cVar.a(gyVar, false);
                        cVar2.a(gyVar, false);
                        break;
                }
                try {
                    gyVar.n((bArr[(i * 3) + 2] & 2) != 0);
                } catch (Exception e) {
                    Log.e("Error: index OUT OF RANGE: " + ((i * 3) + 2), "_process_0x0730");
                }
                i++;
                i2 = gyVar.hasChanged() ? i2 + 1 : i2;
            }
            if (cVar.hasChanged() || cVar2.hasChanged()) {
                i2++;
            }
            if (i2 > 0) {
                b(false);
                if (cVar.hasChanged()) {
                    cVar.h(false);
                    cVar.a();
                }
                if (cVar2.hasChanged()) {
                    cVar2.h(false);
                    cVar2.a();
                }
                a(true, "_process_ZoneAssignment() part 1");
            }
        }
    }

    private void F(byte[] bArr) {
        if (32 == bArr.length) {
            c cVar = (c) this.u.get(0);
            c cVar2 = (c) this.u.get(1);
            cVar.a();
            cVar2.a();
            int i = 0;
            int i2 = 0;
            while (i < 10) {
                gy gyVar = (gy) m().get(i + 11);
                gyVar.a();
                gyVar.a(bArr[(i * 3) + 1] != 0);
                switch (bArr[(i * 3) + 2]) {
                    case 1:
                        if (!cVar.c()) {
                            gyVar.a(false);
                        }
                        cVar.a(gyVar, false);
                        break;
                    case 2:
                        if (!cVar2.c()) {
                            gyVar.a(false);
                        }
                        cVar2.a(gyVar, false);
                        break;
                    case 3:
                        if (!cVar.c() && !cVar2.c()) {
                            gyVar.a(false);
                        }
                        cVar.a(gyVar, false);
                        cVar2.a(gyVar, false);
                        break;
                }
                gyVar.n((bArr[(i * 3) + 3] & 2) != 0);
                i++;
                i2 = gyVar.hasChanged() ? i2 + 1 : i2;
            }
            gy gyVar2 = (gy) m().get(21);
            gyVar2.a();
            gyVar2.a(bArr[31] != 0);
            if (gyVar2.hasChanged()) {
                i2++;
            }
            if (i2 > 0) {
                b(false);
                if (cVar.hasChanged()) {
                    cVar.h(false);
                    cVar.a();
                }
                if (cVar2.hasChanged()) {
                    cVar2.h(false);
                    cVar2.a();
                }
                a(true, "_process_ZoneAssignment() part 2");
            }
        }
    }

    private void G(byte[] bArr) {
        if (32 == bArr.length) {
            c cVar = (c) this.u.get(0);
            c cVar2 = (c) this.u.get(1);
            cVar.a();
            cVar2.a();
            gy gyVar = (gy) m().get(21);
            gyVar.a();
            switch (bArr[0]) {
                case 1:
                    cVar.a(gyVar, false);
                    break;
                case 2:
                    cVar.a(gyVar, false);
                    cVar2.a(gyVar, false);
                    break;
                case 3:
                    cVar.a(gyVar, false);
                    cVar2.a(gyVar, false);
                    break;
            }
            gyVar.n((bArr[1] & 2) != 0);
            int i = gyVar.hasChanged() ? 1 : 0;
            int i2 = 0;
            while (true) {
                int i3 = i;
                if (i2 >= 10) {
                    if (cVar.hasChanged()) {
                        i3++;
                    }
                    if (cVar2.hasChanged()) {
                        i3++;
                    }
                    if (i3 > 0) {
                        b(false);
                        if (cVar.hasChanged()) {
                            cVar.h(false);
                            cVar.a();
                        }
                        if (cVar2.hasChanged()) {
                            cVar2.h(false);
                            cVar2.a();
                        }
                        a(true, "_process_ZoneAssignment() part 3");
                        return;
                    }
                    return;
                }
                gy gyVar2 = (gy) m().get(i2 + 22);
                gyVar2.a();
                gyVar2.a(bArr[(i2 * 3) + 2] != 0);
                switch (bArr[(i2 * 3) + 3]) {
                    case 1:
                        if (!cVar.c()) {
                            gyVar2.a(false);
                        }
                        cVar.a(gyVar2, false);
                        break;
                    case 2:
                        if (!cVar2.c()) {
                            gyVar2.a(false);
                        }
                        cVar2.a(gyVar2, false);
                        break;
                    case 3:
                        if (!cVar.c() && !cVar2.c()) {
                            gyVar2.a(false);
                        }
                        cVar.a(gyVar2, false);
                        cVar2.a(gyVar2, false);
                        break;
                }
                gyVar2.n((bArr[(i2 * 3) + 4] & 2) != 0);
                i = gyVar2.hasChanged() ? i3 + 1 : i3;
                i2++;
            }
        }
    }

    private void H(byte[] bArr) {
        if (32 == bArr.length) {
            c cVar = (c) this.u.get(1);
            this.k.an.obtainMessage(cq.d, (c) this.u.get(0)).sendToTarget();
            this.r = (bArr[0] & 1) != 0;
            cVar.a(this.r);
            if (this.r) {
                this.k.an.obtainMessage(cq.d, cVar).sendToTarget();
            }
        }
    }

    private void I(byte[] bArr) {
        if (32 == bArr.length) {
            int d = d(0);
            c cVar = (c) this.u.get(0);
            cVar.a((int) bArr[0], d);
            cVar.b((int) bArr[22], d);
            c cVar2 = (c) this.u.get(1);
            cVar2.a((int) bArr[1], d);
            cVar2.b((int) bArr[23], d);
        }
    }

    private void J(byte[] bArr) {
        if (1 == bArr.length) {
            c((int) bArr[0], 0);
            Log.d("block counter " + bArr[0], "");
        }
    }

    private void K(byte[] bArr) {
        if (32 == bArr.length) {
            cp cpVar = new cp(this, (cp) null);
            this.c.a = cpVar.a(this.c.a, (bArr[0] & 1) != 0);
            this.c.b = cpVar.a(this.c.b, (bArr[0] & 2) != 0);
            this.c.c = cpVar.a(this.c.c, (bArr[0] & 4) != 0);
            this.c.d = cpVar.a(this.c.d, (bArr[0] & 8) != 0);
            this.c.e = cpVar.a(this.c.e, (bArr[0] & 16) != 0);
            this.c.f = cpVar.a(this.c.f, (bArr[0] & 32) != 0);
            this.c.g = cpVar.a(this.c.g, (bArr[0] & 64) != 0);
            this.c.h = cpVar.a(this.c.h, (bArr[0] & 128) != 0);
            this.c.i = cpVar.a(this.c.i, (bArr[1] & 1) != 0);
            this.c.j = cpVar.a(this.c.j, (bArr[1] & 2) != 0);
            this.h.a = cpVar.a(this.h.a, this.c.h);
            this.d.a = cpVar.a(this.d.a, (bArr[2] & 1) != 0);
            this.d.b = cpVar.a(this.d.b, (bArr[2] & 2) != 0);
            this.d.c = cpVar.a(this.d.c, (bArr[2] & 4) != 0);
            this.d.d = cpVar.a(this.d.d, (bArr[2] & 8) != 0);
            this.d.e = cpVar.a(this.d.e, (bArr[2] & 16) != 0);
            this.d.f = cpVar.a(this.d.f, (bArr[2] & 32) != 0);
            this.d.g = cpVar.a(this.d.g, (bArr[2] & 64) != 0);
            this.d.h = cpVar.a(this.d.h, (bArr[2] & 128) != 0);
            this.d.i = cpVar.a(this.d.i, (bArr[1] & 4) != 0);
            this.e.a = cpVar.a(this.e.a, (bArr[3] & 1) != 0);
            this.e.b = cpVar.a(this.e.b, (bArr[3] & 2) != 0);
            this.f.a = cpVar.a(this.f.a, (bArr[4] & 1) != 0);
            this.f.b = cpVar.a(this.f.b, (bArr[4] & 2) != 0);
            this.f.c = cpVar.a(this.f.c, (bArr[4] & 4) != 0);
            this.f.f = cpVar.a(this.f.f, (bArr[4] & 8) != 0);
            this.f.g = cpVar.a(this.f.g, (bArr[4] & 16) != 0);
            this.f.h = cpVar.a(this.f.h, (bArr[4] & 32) != 0);
            this.f.i = cpVar.a(this.f.i, (bArr[4] & 64) != 0);
            this.f.j = cpVar.a(this.f.j, (bArr[4] & 128) != 0);
            this.f.m = cpVar.a(this.f.m, (bArr[1] & 16) != 0);
            this.f.n = cpVar.a(this.f.n, (bArr[1] & 32) != 0);
            this.f.o = cpVar.a(this.f.o, (bArr[1] & 64) != 0);
            this.g.a = cpVar.a(this.g.a, (bArr[23] == 0 && bArr[24] == 0) ? false : true);
            this.g.b = cpVar.a(this.g.b, (bArr[25] == 0 && bArr[26] == 0) ? false : true);
            this.i.b.a = cpVar.a(this.i.b.a, (bArr[1] & 128) != 0);
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = 0;
                byte b = 1;
                while (i3 < 8) {
                    gy gyVar = (gy) m().get((i2 * 8) + i3);
                    gyVar.a();
                    gyVar.d((bArr[i2 + 15] & b) != 0);
                    gyVar.f((bArr[i2 + 19] & b) != 0);
                    if (gyVar.h()) {
                        gyVar.d(true);
                    }
                    gyVar.g((bArr[i2 + 27] & b) != 0);
                    b = (byte) (b << 1);
                    i3++;
                    i = gyVar.hasChanged() ? i + 1 : i;
                }
            }
            int i4 = 0;
            while (i4 < 2) {
                int i5 = 0;
                byte b2 = 1;
                while (i5 < 8 && (i4 * 8) + i5 < c()) {
                    int i6 = ((dz) this.v.get((i4 * 8) + i5)).a((bArr[i4 + 23] & b2) != 0) ? i + 1 : i;
                    i5++;
                    b2 = (byte) (b2 << 1);
                    i = i6;
                }
                i4++;
            }
            if (i > 0) {
                b(false);
                Iterator it = this.u.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).h(false);
                }
            }
            if (i > 0 || cpVar.a > 0) {
                a(true, "panel status 0");
            }
        }
    }

    private void L(byte[] bArr) {
        if (32 == bArr.length) {
            cp cpVar = new cp(this, (cp) null);
            this.g.c = cpVar.a(this.g.c, (bArr[28] & 15) != 0);
            this.i.b.b = cpVar.a(this.i.b.b, (bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0) ? false : true);
            int i = 0;
            int i2 = 0;
            while (i < 4) {
                int i3 = 0;
                byte b = 1;
                int i4 = i2;
                while (i3 < 8) {
                    gy gyVar = (gy) m().get((i * 8) + i3);
                    gyVar.a();
                    gyVar.e((bArr[i + 9] & b) != 0);
                    gyVar.h((bArr[i] & b) != 0);
                    b = (byte) (b << 1);
                    i3++;
                    i4 = gyVar.hasChanged() ? i4 + 1 : i4;
                }
                i++;
                i2 = i4;
            }
            int i5 = 0;
            while (i5 < 2) {
                int i6 = 0;
                byte b2 = 1;
                int i7 = i2;
                while (i6 < 8 && (i5 * 8) + i6 < c()) {
                    int i8 = ((dz) this.v.get((i5 * 8) + i6)).b((bArr[i5 + 4] & b2) != 0) ? i7 + 1 : i7;
                    i6++;
                    b2 = (byte) (b2 << 1);
                    i7 = i8;
                }
                i5++;
                i2 = i7;
            }
            this.i.a.a = cpVar.a(this.i.a.a, (bArr[4] == 0 && bArr[5] == 0) ? false : true);
            this.i.a.b = cpVar.a(this.i.a.b, (bArr[6] == 0 && bArr[7] == 0) ? false : true);
            this.i.a.c.c = cpVar.a(this.i.a.c.c, ((bArr[8] & 1) == 0 && (bArr[8] & 2) == 0) ? false : true);
            this.i.a.c.a = cpVar.a(this.i.a.c.a, ((bArr[8] & 4) == 0 && (bArr[8] & 8) == 0 && (bArr[8] & 16) == 0 && (bArr[8] & 32) == 0 && (bArr[8] & 64) == 0 && (bArr[8] & 128) == 0 && (bArr[25] & 1) == 0 && (bArr[25] & 2) == 0) ? false : true);
            this.i.a.c.f = cpVar.a(this.i.a.c.f, (bArr[25] & 2) != 0);
            this.i.a.c.e = cpVar.a(this.i.a.c.e, (bArr[25] & 4) != 0);
            this.i.a.c.d = cpVar.a(this.i.a.c.d, (bArr[25] & 8) != 0);
            this.i.a.c.b = cpVar.a(this.i.a.c.b, ((bArr[25] & 128) == 0 && (bArr[28] & 1) == 0 && (bArr[28] & 2) == 0 && (bArr[28] & 4) == 0) ? false : true);
            Iterator it = this.u.iterator();
            int i9 = i2;
            while (it.hasNext()) {
                c cVar = (c) it.next();
                cVar.a();
                byte b3 = bArr[(cVar.q() * 4) + 14];
                cVar.c((b3 & 4) != 0);
                cVar.f((b3 & 2) != 0);
                cVar.b((b3 & 1) != 0, true);
                byte b4 = bArr[(cVar.q() * 4) + 13];
                cVar.a((b4 & 16) != 0, true);
                cVar.b((b4 & 16) != 0 && (b4 >> 5) == 0);
                if ((b4 & 128) != 0) {
                    cVar.a(d.atFireAlarm);
                } else if ((b4 & 64) != 0) {
                    cVar.a(d.atAudibleAlarm);
                } else if ((b4 & 32) != 0) {
                    cVar.a(d.atSilentAlarm);
                } else {
                    cVar.a(d.atUnknown);
                }
                cVar.a((b4 & 4) != 0 ? 5 : (b4 & 2) != 0 ? 4 : ((b4 & 1) != 0 || cVar.i()) ? 1 : 2, true);
                if (cVar.hasChanged()) {
                    i9++;
                }
            }
            if (i9 > 0 || cpVar.a > 0) {
                a(true, "panel status 2");
            }
        }
    }

    private void a(boolean b, String s) {
    }

    private void M(byte[] bArr) {
        if (32 == bArr.length) {
            Iterator it = m().iterator();
            int i = 0;
            while (it.hasNext()) {
                gy gyVar = (gy) it.next();
                byte b = bArr[gyVar.o()];
                gyVar.a();
                gyVar.c((b & 128) != 0);
                gyVar.b((b & 64) != 0);
                gyVar.k((b & 8) != 0);
                if (gyVar.hasChanged()) {
                    i++;
                }
            }
            if (i > 0) {
                a(true, "panel status 2");
            }
        }
    }

    private void N(byte[] bArr) {
        if (32 == bArr.length) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < c() && i2 < 32) {
                    ((dz) this.v.get(i2)).a((bArr[i2] & 32) != 0 ? 1 : 2);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private void O(byte[] bArr) {
        if (32 != bArr.length) {
        }
    }

    private void a(int i, byte[] bArr) {
        int i2 = 0;
        if (32 == bArr.length) {
            while (true) {
                int i3 = i2;
                if (i3 < 2) {
                    try {
                       ((gy) m().get(i3 + i)).a(com.Paradox.f.a(bArr, i3 * 16, (i3 * 16) + 16), a(0, df.zftLabel));
                        ((gy) m().get(i3 + i)).a(com.Paradox.f.a(bArr, i3 * 16, (i3 * 16) + 16), a(0, df.zftLabel));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void a(byte[] bArr) {
        a(0, bArr);
    }

    private void b(int i, byte[] bArr) {
        int i2 = 0;
        if (32 == bArr.length) {
            while (true) {
                int i3 = i2;
                if (i3 < 2) {
                    try {
                        ((dz) this.v.get(i3 + i)).a(com.Paradox.f.a(bArr, i3 * 16, (i3 * 16) + 16), b(0));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void b(byte[] bArr) {
        a(2, bArr);
    }

    private void c(byte[] bArr) {
        a(4, bArr);
    }

    public void d(byte[] bArr) {
        a(6, bArr);
    }

    private void e(byte[] bArr) {
        a(8, bArr);
    }

    private void f(byte[] bArr) {
        a(10, bArr);
    }

    private void h(byte[] bArr) {
        a(12, bArr);
    }

    private void m(byte[] bArr) {
        a(14, bArr);
    }

    private void n(byte[] bArr) {
        a(16, bArr);
    }

    private void o(byte[] bArr) {
        a(18, bArr);
    }

    private void p(byte[] bArr) {
        a(20, bArr);
    }

    private void q(byte[] bArr) {
        a(22, bArr);
    }

    private void r(byte[] bArr) {
        a(24, bArr);
    }

    private void s(byte[] bArr) {
        a(26, bArr);
    }

    private void t(byte[] bArr) {
        a(28, bArr);
    }

    private void u(byte[] bArr) {
        a(30, bArr);
    }

    private void v(byte[] bArr) {
        b(0, bArr);
    }

    private void w(byte[] bArr) {
        b(2, bArr);
    }

    private void x(byte[] bArr) {
        b(4, bArr);
    }

    private void y(byte[] bArr) {
        b(6, bArr);
    }

    private void z(byte[] bArr) {
        b(8, bArr);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i);

    /* access modifiers changed from: protected */
    public abstract int a(int i, df dfVar);

    public void a(short s, byte[] bArr) throws Throwable {
        short s2 = (short) (65535 & s);
        switch (s2) {
            case 16:
                a(bArr);
                return;
            case 48:
                b(bArr);
                return;
            case 80:
                c(bArr);
                return;
            case 112:
                d(bArr);
                return;
            case 144:
                e(bArr);
                return;
            case 176:
                f(bArr);
                return;
            case 208:
                h(bArr);
                return;
            case 240:
                m(bArr);
                return;
            case 272:
                n(bArr);
                return;
            case 304:
                o(bArr);
                return;
            case 336:
                p(bArr);
                return;
            case 368:
                q(bArr);
                return;
            case 400:
                r(bArr);
                return;
            case 432:
                s(bArr);
                return;
            case 464:
                t(bArr);
                return;
            case 496:
                u(bArr);
                return;
            case 528:
                v(bArr);
                return;
            case 560:
                w(bArr);
                return;
            case 592:
                x(bArr);
                return;
            case 624:
                y(bArr);
                return;
            case 656:
                z(bArr);
                return;
            case 688:
                A(bArr);
                return;
            case 720:
                B(bArr);
                return;
            case 752:
                C(bArr);
                return;
            case 784:
                D(bArr);
                return;
            case 1840:
                E(bArr);
                return;
            case 1872:
                F(bArr);
                return;
            case 1904:
                G(bArr);
                return;
            case 2196:
                H(bArr);
                return;
            case 2256:
                I(bArr);
                return;
            case 8191:
                J(bArr);
                return;
            case (short) 32768:
                K(bArr);
                return;
            case (short) 32769:
                L(bArr);
                return;
            case (short) 32770:
                M(bArr);
                return;
            case (short) 32775:
                N(bArr);
                return;
            case (short) 32776:
                O(bArr);
                return;
            default:
                Log.e("Error", "processRead: unknown address = 0x" + Integer.toHexString(s2));
                return;
        }
    }

    /* access modifiers changed from: protected */
    public abstract int b(int i);

    /* access modifiers changed from: protected */
    public abstract int c();
}
