package com.Paradox;

import android.annotation.SuppressLint;
import android.util.Log;

import com.androidip.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class cb extends ch implements ag {
    private static /* synthetic */ int[] G;

    public cb(String str, Site site) throws Throwable {
        super(str, site);
        this.b = false;
        g();
        h();
        q();
        r();
        s();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        t().writeTo(byteArrayOutputStream);
        v().writeTo(byteArrayOutputStream);
        B().writeTo(byteArrayOutputStream);
        C().writeTo(byteArrayOutputStream);
        F().writeTo(byteArrayOutputStream);
        this.n = byteArrayOutputStream.toByteArray();
        Log.d("_mc len=" + this.n.length, ab.a(this.n));
    }

    static /* synthetic */ int[] L() {
        int[] iArr = G;
        if (iArr == null) {
            iArr = new int[ddalarm.values().length];
            try {
                iArr[ddalarm.acDisarm.ordinal()] = 5;
                Log.d("MAURO", "Sono in CB DISINSERISCI iArr[dd.acDisarm.ordinal()] vale : "+iArr[ddalarm.acDisarm.ordinal()]);
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ddalarm.acFullArm.ordinal()] = 1;
                Log.d("MAURO", "Sono in CB INSERISCI PIENO iArr[dd.acFullArm.ordinal()] vale : "+iArr[ddalarm.acFullArm.ordinal()]);
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ddalarm.acInstantArm.ordinal()] = 4;
                Log.d("MAURO", "Sono in CB INSERISCI INST. iArr[dd.acInstantArm.ordinal()] vale : "+iArr[ddalarm.acInstantArm.ordinal()]);
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[ddalarm.acSleepArm.ordinal()] = 2;
                Log.d("MAURO", "Sono in CB INSERISCI NOTTE iArr[dd.acSleepArm.ordinal()] vale : "+iArr[ddalarm.acSleepArm.ordinal()]);
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[ddalarm.acStayArm.ordinal()] = 3;
                Log.d("MAURO", "Sono in CB INSERISCI iArr[dd.acStayArm.ordinal()] vale : "+iArr[ddalarm.acStayArm.ordinal()]);
            } catch (NoSuchFieldError e5) {
            }
            G = iArr;
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream B() throws Exception {
        Log.d("", "[_prepare_EVO_Read_Area1To6Status]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(3, 64, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream C() throws Exception {
        Log.d("", "[_prepare_EVO_Read_Area6To8Status]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(4, 64, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: protected */
    public ByteArrayOutputStream D() throws Exception {
        Log.d("", "[prepare_EVO_Read_ModuleTroubles]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(5, 64, true)).writeTo(byteArrayOutputStream);
        a(a(6, 64, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: protected */
    public ByteArrayOutputStream E() throws Exception {
        Log.d("", "[prepare_EVO_Read_EBUSTroubles]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(17, 24, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream F() throws Exception {
        Log.d("", "[prepare_EVO_Read_AreaLabels]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int a = a(cVar.q());
            if (cVar.c() && a != cVar.v()) {
                a(a(cVar.b(), 16, false)).writeTo(byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream G() throws Exception {
        Log.d("", "[_prepare_EVO_Read_AreaDelays]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.c()) {
                a(a((cVar.q() * 107) + 14997, 5, false)).writeTo(byteArrayOutputStream);
                a(a((cVar.q() * 107) + 15019, 1, false)).writeTo(byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream H() throws Exception {
        Log.d("", "[_prepare_EVO_Read_PGMTimer]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(3000, 1, false)).writeTo(byteArrayOutputStream);
        a(a(3010, 1, false)).writeTo(byteArrayOutputStream);
        a(a(3020, 1, false)).writeTo(byteArrayOutputStream);
        a(a(24111, 1, false)).writeTo(byteArrayOutputStream);
        a(a(24121, 1, false)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2 A[Catch:{ IOException -> 0x00c0, Exception -> 0x0188 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f7 A[Catch:{ IOException -> 0x00c0, Exception -> 0x0188 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013e A[Catch:{ IOException -> 0x00c0, Exception -> 0x0188 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean I() {
        Iterator it;
        Iterator it2;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            switch (this.a) {
                case 1:
                    F().writeTo(byteArrayOutputStream);
                    Iterator it3 = this.u.iterator();
                    int i = 0;
                    while (it3.hasNext()) {
                        c cVar = (c) it3.next();
                        if (i < 16) {
                            int m39a = a(cVar.q());
                            if (cVar.c() && m39a != cVar.v()) {
                                a(a(cVar.b(), 16, false)).writeTo(byteArrayOutputStream);
                                i++;
                            }
                        } else {
                            it = m().iterator();
                            while (it.hasNext()) {
                                gy gyVar = (gy) it.next();
                                if (i < 16) {
                                    int a = gyVar.o() < 96 ? a(gyVar.o(), df.zftLabel) : a(gyVar.o(), df.zftLabel2);
                                    if (gyVar.c() && a != gyVar.q()) {
                                        a(a(gyVar.n(), 16, false)).writeTo(byteArrayOutputStream);
                                        i++;
                                    }
                                } else {
                                    it2 = this.w.iterator();
                                    while (it2.hasNext()) {
                                        dm dmVar = (dm) it2.next();
                                        if (i >= 16) {
                                            if (byteArrayOutputStream.size() > 0) {
                                                Log.d("", "MONITORING_READ_LABELS");
                                                this.a++;
                                                break;
                                            }
                                        } else {
                                            int c = c(dmVar.a());
                                            if (dmVar.b && c != dmVar.d()) {
                                                a(a((dmVar.a() * 5) + 31162, 5, false)).writeTo(byteArrayOutputStream);
                                                a(a(dmVar.a, 16, false)).writeTo(byteArrayOutputStream);
                                                i += 2;
                                            }
                                        }
                                    }
                                    if (byteArrayOutputStream.size() > 0) {
                                    }
                                }
                            }
                            it2 = this.w.iterator();
                            while (it2.hasNext()) {
                            }
                            if (byteArrayOutputStream.size() > 0) {
                            }
                        }
                    }
                    it = m().iterator();
                    while (it.hasNext()) {
                    }
                    it2 = this.w.iterator();
                    while (it2.hasNext()) {
                    }
                    if (byteArrayOutputStream.size() > 0) {
                    }
                    break;
                default:
                    if (this.b) {
                        this.b = false;
                        Log.d("_readZoneFlags", ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>_readZoneFlags>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        y().writeTo(byteArrayOutputStream2);
                        if (byteArrayOutputStream2.size() > 0) {
                            this.k.c(byteArrayOutputStream2.toByteArray());
                        }
                        Log.d("_readZoneFlags", "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<_readZoneFlags <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    }
                    x().writeTo(byteArrayOutputStream);
                    B().writeTo(byteArrayOutputStream);
                    C().writeTo(byteArrayOutputStream);
                    z().writeTo(byteArrayOutputStream);
                    Log.d("", "MONITORING_READ_SYSTEMSTATUS");
                    this.a = 1;
                    break;
            }
            if (byteArrayOutputStream.size() > 0) {
                if (this.k.c(byteArrayOutputStream.toByteArray())) {
                    return true;
                }
                this.j = this.k.t;
                return false;
            }
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean J() throws Exception {
        Log.d("startMonitoring()", "Enter >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        this.a = 0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        G().writeTo(byteArrayOutputStream);
        w().writeTo(byteArrayOutputStream);
        H().writeTo(byteArrayOutputStream);
        if (!this.k.c(byteArrayOutputStream.toByteArray())) {
            Log.e("startMonitoring()", "FAILED genericMultiread <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<_module._error=" + this.k.t);
            this.j = this.k.t;
            return false;
        }
        Log.d("startMonitoring()", "SYSTEM_MONITORING_STARTED !!!!<<<<<<<<<<<<<<");
        this.y = 1;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return false;
    }

    public int a() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public int a(int i) {
        int i2 = ((i * 107) + 14955) / 256;
        if (this.t.length > i2) {
            return this.t[i2];
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int a(int i, df dfVar) {
        int a = (dfVar.a() + (i * 16)) / 256;
        if (this.t.length > a) {
            return this.t[a];
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream a(int i, int i2, boolean z) throws Exception {
        Log.d("", "[prepareUploadData] (prepare_EVO_5_())");
        byte[] bArr = new byte[8];
        bArr[0] = 80;
        bArr[1] = 8;
        bArr[6] = 64;
        bArr[7] = -1;
        if (i2 > 71) {
            throw new Exception("prepare_EVO_5_ (invalid length)");
        }
        if (z) {
            bArr[2] = Byte.MIN_VALUE;
        }
        bArr[4] = (byte) (i >> 8);
        bArr[5] = (byte) (i & 255);
        bArr[6] = (byte) (i2 & 255);
        bArr[bArr.length - 1] = a(bArr, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream a(dm dmVar) throws Exception {
        Log.d("", "[prepare_EVO_Read_ModuleInfos]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (dmVar != null) {
            a(a(dmVar.b(), 16, false)).writeTo(byteArrayOutputStream);
            a(a((dmVar.a() * 5) + 31162, 5, false)).writeTo(byteArrayOutputStream);
        }
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byteArrayOutputStream2.write(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(byteArrayOutputStream2);
        return byteArrayOutputStream2;
    }

    public void a(short s, byte[] bArr) throws Throwable {
        super.c((int) s, bArr);
    }

    /* access modifiers changed from: package-private */
    public void a(byte[] bArr) {
        Log.d("", "process_EVO_1");
        this.l.lock();
        this.s = true;
        this.m.signalAll();
        this.l.unlock();
    }

    public boolean a(int i, int i2) {
        k(b(i, 1 == i2 ? 4 : 3));
        return true;
    }

    public boolean a(int i, ddalarm ddalarmVar) {
        int i2;
        boolean z = false;
        try {
            c cVar = (c) this.u.get(i);
            if (cVar == null) {
                return false;
            }
            switch (L()[ddalarmVar.ordinal()]) {
                case 1:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                default:
                    Log.e("Error", "[(setAreaArmingLevel: invalid action): " + ddalarmVar + "]");
                    return false;
            }
            cVar.g(ddalarmVar != ddalarm.acDisarm);
            if (ddalarmVar != ddalarm.acDisarm) {
                z = true;
            }
            cVar.d = z;
            a(cVar);
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(cVar);
            j(a(copyOnWriteArrayList, i2));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean a(int i, byte[] bArr) {
        if (i < 0 || i > c()) {
            this.j = R.string.ActiontimeoutCOLON;
            return false;
        }
        ((dz) this.v.get(i)).a(bArr);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a(c cVar, ddalarm ddalarmVar) {
        if ((this.p & (1 << cVar.q())) == 0) {
            return false;
        }
        if (cVar.r() == 2) {
            return true;
        }
        switch (L()[ddalarmVar.ordinal()]) {
            case 1:
            case 5:
                return true;
            case 2:
            case 4:
                return cVar.r() != 1;
            case 3:
                return cVar.r() == 2;
            default:
                return false;
        }
    }

    public boolean a(ddalarm ddalarmVar) {
        int i;
        switch (L()[ddalarmVar.ordinal()]) {
            case 1:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 6;
                break;
            default:
                Log.e("Error", "[setAreaArmingLevel(invalid action): " + ddalarmVar + "]");
                return false;
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            cVar.g(ddalarmVar != ddalarm.acDisarm);
            cVar.d = ddalarmVar != ddalarm.acDisarm;
            a(cVar);
        }
        j(a(this.u, i));
        return true;
    }

    public boolean a(gy[] gyVarArr, boolean z) {
        if (gyVarArr == null) {
            Log.e("Error", "setZoneBypass: Invalid zone array");
            return false;
        }
        j(a(gyVarArr, 8, z));
        for (gy k : gyVarArr) {
            k.k(z);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public byte[] a(CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        Log.d("", "[prepare_EVO_4_]");
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            Log.e("Error", "EVO_4_: Invalid area array");
            return null;
        }
        byte[] bArr = new byte[16];
        bArr[0] = 15;
        bArr[1] = 64;
        bArr[2] = 15;
        bArr[3] = 0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            int q = ((c) it.next()).q();
            int i2 = (((byte) q) / 2) + 7;
            switch (q % 2) {
                case 0:
                    bArr[i2] = (byte) (bArr[i2] + ((byte) (i * 16)));
                    break;
                case 1:
                    bArr[i2] = (byte) (bArr[i2] + ((byte) (i & 15)));
                    break;
            }
        }
        Log.d("Area command:", ab.a(bArr));
        bArr[15] = a(com.Paradox.f.a(bArr, 1, 14), 14);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public byte[] a(gy[] gyVarArr, int i, boolean z) {
        Log.d("", "[prepare_EVO_D_]");
        if (gyVarArr == null || gyVarArr.length == 0) {
            Log.e("Error", "EVO_D_: Invalid zone array");
            return null;
        }
        byte[] bArr = new byte[72];
        bArr[0] = 71;
        bArr[1] = -48;
        bArr[2] = 71;
        bArr[3] = (byte) i;
        if (!z) {
            i = 0;
        }
        bArr[4] = (byte) i;
        for (gy gyVar : gyVarArr) {
            int o = (gyVar.o() / 8) + 7;
            bArr[o] = (byte) ((1 << (gyVar.o() % 8)) | bArr[o]);
        }
        Log.d("Zone command:", "Zone command:" + ab.a(bArr));
        bArr[71] = a(com.Paradox.f.a(bArr, 1, 70), 70);
        return bArr;
    }

    public int a_() {
        return 128;
    }

    public int b() {
        return 48;
    }

    /* access modifiers changed from: protected */
    public int b(int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void b(byte[] bArr) {
        Log.d("", "[processMonitoring]");
        if (7 != bArr.length) {
            Log.e("", "EVO_4_: Wrong length");
            return;
        }
        this.l.lock();
        Log.d("", "Area command result:" + ab.a(bArr));
        aX();
        this.m.signalAll();
        this.l.unlock();
    }

    /* access modifiers changed from: package-private */
    public byte[] b(int i, int i2) {
        Log.d("", "[prepare_EVO_A_]");
        if (i < 0 || i > this.v.size() - 1) {
            Log.e("Error", "EVO_A_: Invalid pgm index");
            return null;
        }
        byte[] bArr = new byte[72];
        bArr[0] = 71;
        bArr[1] = -92;
        bArr[2] = 71;
        bArr[i + 7] = (byte) i2;
        bArr[71] = a(com.Paradox.f.a(bArr, 1, 70), 70);
        return bArr;
    }

    public int c() {
        return 5;
    }

    /* access modifiers changed from: protected */
    public int c(int i) {
        int i2 = ((i * 5) + 20039) / 256;
        if (this.t.length > i2) {
            return this.t[i2];
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void c(byte[] bArr) {
        Log.d("", "self process_EVO_D");
        this.l.lock();
        if (7 != bArr.length) {
            Log.e("", "process_EVO_D_: Wrong length");
        }
        this.m.signalAll();
        this.l.unlock();
    }

    /* access modifiers changed from: package-private */
    public void d(byte[] bArr) {
        this.l.lock();
        if (7 != bArr.length) {
            Log.e("", "EVO_A_: Wrong length");
        }
        this.m.signalAll();
        this.l.unlock();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint("LongLogTag")
    public void e(byte[] bArr) throws Throwable {
        Log.d("", "[processUploadRAM]");
        this.l.lock();
        int i = ((bArr[4] & 255) << 8) + (bArr[5] & 255);
        int i2 = (bArr[2] & 128) != 0 ? i | 32768 : i;
        if (8 <= bArr.length) {
            int i3 = (bArr[1] & 255) - 7;
            Log.d("A-replyLen=" + bArr.length + "  length=" + i3 + " address=0x" + Integer.toHexString(i2), ab.a(bArr));
            try {
                this.z = com.Paradox.f.a(bArr, 6, i3 + 6);
                Log.d("b-replyLen=" + this.z.length, ab.a(this.z));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.z = (byte[]) bArr.clone();
        }
        c(i2, this.z);
        this.m.signalAll();
        this.l.unlock();
    }

    public boolean e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void f(byte[] bArr) {
        Log.d("", "[prepareStopSerialConnection]");
        this.l.lock();
        this.s = false;
        this.m.signalAll();
        this.l.unlock();
    }

    public boolean f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.t = new byte[128];
    }

    public void g(byte[] bArr) throws Throwable {
        switch (bArr[0] & 240) {
            case 0:
                return;
            case 16:
                a(bArr);
                return;
            case 64:
                b(bArr);
                return;
            case 80:
                e(bArr);
                return;
            case 112:
                if (4 == bArr.length && 5 == (bArr[2] & 255)) {
                    f(bArr);
                    return;
                } else {
                    super.g(bArr);
                    return;
                }
            case 160:
                d(bArr);
                return;
            case 208:
                c(bArr);
                return;
            case 224:
                Log.d("", "[live event]");
                return;
            default:
                super.g(bArr);
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.u = new CopyOnWriteArrayList();
        for (int i = 0; i < a(); i++) {
            this.u.add(new c(this, i, (i * 107) + 14955));
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        int i = 0;
        while (i < b()) {
            this.x.add(new gy(this, i, i < 96 ? (i * 16) + 1072 : ((i - 96) * 16) + 25335));
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        for (int i = 0; i < c(); i++) {
            this.v.add(new dz(this, i, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.w = new CopyOnWriteArrayList();
        for (int i = 0; i < a_(); i++) {
            this.w.add(new dm(this, i, (i * 16) + 20039));
        }
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream t() throws Exception {
        Log.d("", "[_prepare_EVO_Read_BCK]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(40704, 64, false)).writeTo(byteArrayOutputStream);
        a(a(40768, 64, false)).writeTo(byteArrayOutputStream);
        a(a(40832, 64, false)).writeTo(byteArrayOutputStream);
        a(a(40896, 16, false)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream v() throws Exception {
        Log.d("", "[_prepare_EVO_Read_AreaEnabled]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(14808, 1, false)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream w() throws Exception {
        throw new Exception("Abstract function called (prepare_EVO_Read_ZoneAssignment)");
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream x() throws Exception {
        throw new Exception("Abstract function called (prepare_EVO_Read_SystemAndZoneStatus)");
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream y() throws Exception {
        throw new Exception("Abstract function called (prepare_EVO_Read_ZoneFlags)");
    }

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream z() throws Exception {
        Log.d("", "[_prepare_EVO_Read_ModuleAssignment]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(a(16, 64, true)).writeTo(byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
