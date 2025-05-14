package com.Paradox;

import android.annotation.SuppressLint;
import android.os.Message;
import android.util.Log;

import com.androidip.R;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Locale;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.Paradox.cz */
/* loaded from: /tmp/jadx-9052772160526582527.dex */
public class cz extends Observable implements ad, ae {

    /* renamed from: F */
    bz Fcz;

    /* renamed from: o */
    protected int o;

    /* renamed from: p */
    protected int p;

    /* renamed from: z */
    protected byte[] z;

    /* renamed from: c */
    public hp c = new hp();

    /* renamed from: d */
    hq d = new hq();

    /* renamed from: e */
    hm e = new hm();

    /* renamed from: f */
    ho f = new ho();

    /* renamed from: g */
    hv g = new hv();

    /* renamed from: h */
    hw h = new hw();

    /* renamed from: i */
    hr i = new hr();

    /* renamed from: l */
    final Lock l = new ReentrantLock();

    /* renamed from: m */
    final Condition m = this.l.newCondition();

    /* renamed from: A */
    boolean A = false;

    /* renamed from: G */
    private boolean G = false;

    /* renamed from: H */
    private int H = 0;

    /* renamed from: I */
    private final ExecutorService I = Executors.newSingleThreadExecutor();

    /* renamed from: J */
    private String J = "";

    /* renamed from: K */
    private boolean K = false;

    /* renamed from: y */
    protected int y = 0;

    /* renamed from: j */
    public int j = 0;

    /* renamed from: D */
    public int D = 0;

    /* renamed from: C */
    public int C = 0;

    /* renamed from: B */
    public int B = 0;

    /* renamed from: r */
    boolean r = false;

    /* renamed from: E */
    public String E = "";

    /* renamed from: q */
    de q = de.a;

    /* renamed from: k */
    cq k = null;

    /* renamed from: t */
    protected byte[] t = null;

    /* renamed from: u */
    protected CopyOnWriteArrayList u = new CopyOnWriteArrayList();

    /* renamed from: v */
    protected CopyOnWriteArrayList v = new CopyOnWriteArrayList();

    /* renamed from: w */
    protected CopyOnWriteArrayList w = null;

    /* renamed from: n */
    protected byte[] n = null;

    /* renamed from: x */
    protected CopyOnWriteArrayList x = new CopyOnWriteArrayList();

    /* renamed from: a */
    private CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    /* renamed from: s */
    protected boolean s = false;

    public cz(String str, Site site) throws Throwable {
        a(str, site);
    }


    /* renamed from: a */
    private void a(ExecutorService executorService) {
        Log.d("SHUT1", "");
        executorService.shutdown();
        Log.d("SHUT2", "");
        try {
            Log.d("SHUT3", "");
            if (!executorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                Log.d("SHUT4", "");
                executorService.shutdownNow();
                Log.d("SHUT5", "");
                if (executorService.awaitTermination(10L, TimeUnit.SECONDS)) {
                    Log.d("SHUT6", "");
                } else {
                    Log.d("Pool did not terminate", "");
                }
            }
        } catch (InterruptedException e) {
            Log.d("SHUT7", "");
            executorService.shutdownNow();
            Log.d("SHUT8", "");
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void acz(byte[] bArr) {
        Log.d("MAURO", "Sono in cz 1");
        try {
            this.l.lock();
            Log.d("MAURO", "Sono in cz 2");
            this.k.g(bArr);
            if (this.m.await(10000L, TimeUnit.MILLISECONDS)) {
                aZ();
            } else {
                Log.w("Timed out", "(1)_sendAsyncControlCommand()");
                this.k.g(bArr);
                if (this.m.await(7000L, TimeUnit.MILLISECONDS)) {
                    aZ();
                } else {
                    Log.w("Timed out", "(2)_sendAsyncControlCommand()");
                    aY();
                    aX();
                    Message message = new Message();
                    message.what = cq.c;
                    message.arg1 = R.string.ActiontimeoutCOLON;
                    this.k.an.sendMessage(message);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            this.l.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void b(byte[] bArr) {
        try {
            this.l.lock();
            this.k.g(bArr);
            if (!this.m.await(10000L, TimeUnit.MILLISECONDS)) {
                Log.w("Timed out", "(1)_sendAsyncControlCommandEx()");
                this.k.g(bArr);
                if (!this.m.await(7000L, TimeUnit.MILLISECONDS)) {
                    Log.w("Timed out", "(2)_sendAsyncControlCommandEx()");
                    Message message = new Message();
                    message.what = cq.c;
                    message.arg1 = R.string.ActiontimeoutCOLON;
                    this.k.an.sendMessage(message);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            this.l.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void c(byte[] bArr, int i) {
        try {
            this.l.lock();
            if (i > 0) {
                try {
                    Log.d("SLEEP...", "");
                    Thread.sleep(i);
                    Log.d("...SLEEP", "");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Log.d("PGM:", ab.a(bArr));
            cs csVar = new cs(0, bArr);
            this.k.a(csVar);
            if (!this.m.await(10000L, TimeUnit.MILLISECONDS)) {
                Log.w("Timed out", "(1)_prepareAsyncControlCommand()");
                this.k.a(csVar);
                if (!this.m.await(7000L, TimeUnit.MILLISECONDS)) {
                    Log.w("Timed out", "(2)_prepareAsyncControlCommand()");
                    Message message = new Message();
                    message.what = cq.c;
                    message.arg1 = R.string.ActiontimeoutCOLON;
                    this.k.an.sendMessage(message);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (InterruptedException e3) {
            e3.printStackTrace();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            this.l.unlock();
        }
    }

    /* renamed from: A */
    public int A() {
        if (this.u.size() == 0) {
            return 0;
        }
        int r = ((c) this.u.get(0)).r();
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.c() && (cVar.i() || cVar.r() != r)) {
                return 0;
            }
        }
        return r;
    }

    /* renamed from: I */
    boolean I() {
        return false;
    }

    /* renamed from: J */
    boolean J() throws Throwable {
        return false;
    }

    /* renamed from: K */
    boolean K() throws Throwable {
        return false;
    }

    /* renamed from: M */
    public String Mcz() {
        return "Unknown";
    }

    /* renamed from: O */
    public CopyOnWriteArrayList O() {
        return this.u;
    }

    /* renamed from: P */
    public CopyOnWriteArrayList P() {
        return this.v;
    }

    /* renamed from: Q */
    @SuppressLint("LongLogTag")
    public boolean Q() {
        if (this.G) {
            this.H++;
            Log.d("notifyObserversBatchBLOCK(panel)", "_notifyObserversBatchCount=" + this.H);
        }
        return this.G;
    }

    /* renamed from: R */
    public void R() {
        a(this.I);
    }

    /* renamed from: S */
    public boolean S() {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.c() && (gyVar.e() || gyVar.d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: T */
    public boolean T() {
        return U() || V() || W() || X() || Y() || Z() || ab() || ac() || ad() || ae() || af() || aa();
    }

    /* renamed from: U */
    boolean U() {
        return this.c.a;
    }

    /* renamed from: V */
    boolean V() {
        return this.c.b || this.d.a();
    }

    /* renamed from: W */
    boolean W() {
        return this.c.c && this.e.a();
    }

    /* renamed from: X */
    boolean X() {
        return this.c.d && this.f.a();
    }

    /* renamed from: Y */
    boolean Y() {
        return this.c.e;
    }

    /* renamed from: Z */
    boolean Z() {
        return this.c.f && (aJ() || aK() || aL());
    }

    /* renamed from: a */
    byte a(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        short s = 0;
        for (int i2 = 0; i2 < i - 1; i2++) {
            s = (short) (s + wrap.get(i2));
        }
        return (byte) (s & 255);
    }

    /* renamed from: a */
    protected int a(int i) throws Exception {
        if (i < 0 || i > this.u.size()) {
            throw new Exception("areaBlockCounter: Invalid area index");
        }
        return 0;
    }

    /* renamed from: a */
    protected int a(int i, df dfVar) throws Exception {
        if (i < 0 || i > this.x.size()) {
            throw new Exception("zoneBlockCounter: Invalid zone index");
        }
        return 0;
    }

    /* renamed from: a */
    void a(c cVar) {
        if (cVar != null) {
            cVar.c = true;
        }
    }

    /* renamed from: a */
    void a(String str, Site site) throws Throwable {
        this.E = str;
        if (this instanceof ag) {
            //Log.d("MAURO", "SONO IN CZ prima di Fcz");
            this.Fcz = ca.a((ag) this, String.format(Locale.US, "%s.%d", this.E, Long.valueOf(site.a())));
            //Log.d("MAURO", "SONO IN CZ dopo 1 di Fcz");
            if (this.Fcz != null) {
                cj.a(site.l());
                //Log.d("MAURO", "SONO IN CZ dopo 2 di Fcz");
            }
        }
    }

    /* renamed from: a */
    @SuppressLint("LongLogTag")
    public void a(boolean z) {
        this.G = z;
        if (this.H > 0) {
            Log.d("notifyObserversBatchRELEASE(panel)", "_notifyObserversBatchCount=" + this.H);
            m82a(true, "_notifyObserversBatchCount=" + this.H);
            this.H = 0;
        }
    }

    /* renamed from: a */
    boolean a(c cVar, ddalarm ddalarmVar) {
        return true;
    }

    /* renamed from: a */
    public boolean a(String str) {
        if (!hasChanged() || Q()) {
            return false;
        }
        Log.d("Observed(panel)", "notifyObserversIfChanged(" + str + ")...NOTIFY");
        notifyObservers();
        Log.d("Observed(panel)", "notifyObserversIfChanged...NOTIFIED!!!");
        return true;
    }

    /* renamed from: a */
    public boolean m82a(boolean z, String str) {
        String str2 = String.valueOf(str) + " forced=" + z + " hasChanges=" + hasChanged();
        if (z) {
            setChanged();
            return a(str2);
        } else if (hasChanged()) {
            return a(str2);
        } else {
            return false;
        }
    }

    /* renamed from: aA */
    boolean aA() {
        return this.f.g;
    }

    /* renamed from: aB */
    boolean aB() {
        return this.f.h;
    }

    /* renamed from: aC */
    boolean aC() {
        return this.f.i;
    }

    /* renamed from: aD */
    boolean aD() {
        return this.f.j;
    }

    /* renamed from: aE */
    boolean aE() {
        return this.f.k;
    }

    /* renamed from: aF */
    boolean aF() {
        return this.f.l;
    }

    /* renamed from: aG */
    boolean aG() {
        return this.f.m;
    }

    /* renamed from: aH */
    boolean aH() {
        return this.f.n;
    }

    /* renamed from: aI */
    boolean aI() {
        return this.f.o;
    }

    /* renamed from: aJ */
    boolean aJ() {
        return this.g.a;
    }

    /* renamed from: aK */
    boolean aK() {
        return this.g.b;
    }

    /* renamed from: aL */
    boolean aL() {
        return this.g.c;
    }

    /* renamed from: aM */
    boolean aM() {
        return this.h.a;
    }

    /* renamed from: aN */
    boolean aN() {
        return this.i.b.a;
    }

    /* renamed from: aO */
    boolean aO() {
        return this.i.b.b;
    }

    /* renamed from: aP */
    boolean aP() {
        return this.i.a.a;
    }

    /* renamed from: aQ */
    boolean aQ() {
        return this.i.a.b;
    }

    /* renamed from: aR */
    boolean aR() {
        return this.i.a.c.a;
    }

    /* renamed from: aS */
    boolean aS() {
        return this.i.a.c.c;
    }

    /* renamed from: aT */
    boolean aT() {
        return this.i.a.c.e;
    }

    /* renamed from: aU */
    boolean aU() {
        return this.i.a.c.d;
    }

    /* renamed from: aV */
    boolean aV() {
        return this.i.a.c.f;
    }

    /* renamed from: aW */
    boolean aW() {
        return this.i.a.c.b;
    }

    /* renamed from: aX */
    void aX() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c = false;
        }
    }

    /* renamed from: aY */
    void aY() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.i()) {
                cVar.b(false, false);
            }
            cVar.s();
        }
    }

    /* renamed from: aZ */
    void aZ() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((c) it.next()).t();
        }
    }

    /* renamed from: aa */
    boolean aa() {
        return this.c.l;
    }

    /* renamed from: ab */
    boolean ab() {
        return this.c.g;
    }

    /* renamed from: ac */
    boolean ac() {
        return this.c.h;
    }

    /* renamed from: ad */
    boolean ad() {
        return this.c.i;
    }

    /* renamed from: ae */
    boolean ae() {
        return this.c.j && (aP() || aQ() || aR() || aS() || aT() || aU() || aV() || aW());
    }

    /* renamed from: af */
    boolean af() {
        return this.c.k;
    }

    /* renamed from: ag */
    boolean ag() {
        return this.d.a;
    }

    /* renamed from: ah */
    boolean ah() {
        return this.d.b;
    }

    /* renamed from: ai */
    boolean ai() {
        return this.d.c;
    }

    /* renamed from: aj */
    boolean aj() {
        return this.d.d;
    }

    /* renamed from: ak */
    boolean ak() {
        return this.d.e;
    }

    /* renamed from: al */
    boolean al() {
        return this.d.f;
    }

    /* renamed from: am */
    boolean am() {
        return this.d.g;
    }

    /* renamed from: an */
    boolean an() {
        return this.d.h;
    }

    /* renamed from: ao */
    boolean ao() {
        return this.d.i;
    }

    /* renamed from: ap */
    boolean ap() {
        return this.d.j;
    }

    /* renamed from: aq */
    boolean aq() {
        return this.d.k;
    }

    /* renamed from: ar */
    boolean ar() {
        return this.d.l;
    }

    /* renamed from: as */
    boolean as() {
        return this.e.a;
    }

    /* renamed from: at */
    boolean at() {
        return this.e.b;
    }

    /* renamed from: au */
    boolean au() {
        return this.f.a;
    }

    /* renamed from: av */
    boolean av() {
        return this.f.b;
    }

    /* renamed from: aw */
    boolean aw() {
        return this.f.c;
    }

    /* renamed from: ax */
    boolean ax() {
        return this.f.d;
    }

    /* renamed from: ay */
    boolean ay() {
        return this.f.e;
    }

    /* renamed from: az */
    boolean az() {
        return this.f.f;
    }

    /* renamed from: b */
    protected int b(int i) throws Exception {
        if (i < 0 || i > this.v.size()) {
            throw new Exception("pgmBlockCounter: Invalid pgm index");
        }
        return 0;
    }

    /* renamed from: b */
    void b(boolean z) {
        this.a.clear();
        this.b.clear();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.c()) {
                if (gyVar.f()) {
                    this.a.add(gyVar);
                } else {
                    this.b.add(gyVar);
                }
            }
        }
        setChanged();
        m82a(z, "updateZoneStatusArray()");
    }

    /* renamed from: b */
    void b(byte[] bArr, int i) {
        try {
            Log.d("POOL1 execute(id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName(), "");
            this.I.execute(new da(this, bArr, i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    byte[] b(String str) {
        byte[] bArr = new byte[3];
        try {
            byte[] bArr2 = new byte[5];
            int length = str.length() - 1;
            int parseInt = Integer.parseInt(str);
            while (true) {
                int i = length;
                if (i <= -1) {
                    bArr[0] = bArr2[0];
                    bArr[1] = bArr2[1];
                    bArr[2] = bArr2[2];
                    return bArr;
                }
                int i2 = i / 2;
                byte b = (byte) (parseInt % 10);
                if (b == 0) {
                    b = 10;
                }
                parseInt /= 10;
                if ((i + 1) % 2 == 0) {
                    bArr2[i2] = b;
                } else {
                    bArr2[i2] = (byte) ((b << 4) | bArr2[i2]);
                }
                length = i - 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[5];
        }
    }

    /* renamed from: b_ */
    boolean b_() {
        for (int i = 0; i < this.u.size(); i++) {
            ((c) this.u.get(i)).a((this.p & (i + 1)) != 0);
        }
        return true;
    }

    /* renamed from: c */
    protected int c(int i) throws Exception {
        if (i < 0 || i > this.w.size()) {
            throw new Exception("moduleBlockCounter: Invalid module index");
        }
        return 0;
    }

    /* renamed from: c */
    void c(int i, int i2) {
        if (this.t.length > i2) {
            this.t[i2] = (byte) i;
        }
    }

    /* renamed from: c */
    public void ccz(String str) {
        this.J = str;
    }

    /* renamed from: c_ */
    public boolean c_() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).c_()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    int d(int i) {
        if (this.t.length > i) {
            return this.t[i];
        }
        return 0;
    }

    /* renamed from: d */
    public boolean d() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public void g(byte[] bArr) throws Throwable {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        switch (wrap.get(0)) {
            case 112:
                if (4 == bArr.length && 4 == wrap.get(1)) {
                    wrap.get(2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: i */
    public boolean i() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean i(byte[] bArr) {
        boolean z;
        try {
            z = this.k.a(new cs(0, bArr));
        } catch (IOException e) {
            e.printStackTrace();
            z = false;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        if (!z) {
            this.j = this.k.t;
        }
        return z;
    }

    /* renamed from: j */
    void j(byte[] bArr) {
        try {
            Log.e("POOL2 execute(id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName(), "");
            this.I.execute(new db(this, bArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public boolean j() {
        if (this.K) {
            this.K = false;
            return true;
        }
        return this.K;
    }

    /* renamed from: k */
    void k(byte[] bArr) {
        try {
            Log.e("POOL3 execute(id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName(), "");
            this.I.execute(new dc(this, bArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    public boolean k() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (!((c) it.next()).k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public de l(byte[] bArr) {
        de deVar = de.a;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        //Log.d("MAURO in CZ ", "(wrap.get(6) & 255)) vale : " + (wrap.get(6) & 255));
        switch ((short) (wrap.get(6) & 255)) {
            case 161:
                switch ((short) (wrap.get(7) & 255)) {
                    case 34:
                    case 51:
                    case 89:
                        return de.ptEVO48;
                    case 35:
                    case 90:
                        return de.ptEVO192;
                    case 109:
                        return de.ptEVOVHD;
                    default:
                        this.j = R.string.UnsupportedpanelCOLON;
                        return deVar;
                }
            case 164:
                switch ((short) (wrap.get(7) & 255)) {
                    case 30:
                    case 80:
                        return de.ptSP5500;
                    case 31:
                    case 81:
                        return de.ptSP6000;
                    case 32:
                    case 82:
                        return de.ptSP7000;
                    default:
                        this.j = R.string.UnsupportedpanelCOLON;
                        return deVar;
                }
            case 165:
                switch ((short) (wrap.get(7) & 255)) {
                    case 36:
                        return de.ptMG5000;
                    case 37:
                    default:
                        this.j = R.string.UnsupportedpanelCOLON;
                        return deVar;
                    case 38:
                        return de.ptMG5050;
                }
            case 174:
                switch ((short) (wrap.get(7) & 255)) {
                    case 83:
                        return de.ptSP4000;
                    case 84:
                        return de.ptSP65;
                    default:
                        this.j = R.string.UnsupportedpanelCOLON;
                        return deVar;
                }
            default:
                this.j = R.string.UnsupportedpanelCOLON;
                return deVar;
        }
    }

    /* renamed from: l */
    public boolean l() {
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final CopyOnWriteArrayList m() {
        return this.x;
    }

    /* renamed from: n */
    public final CopyOnWriteArrayList n() {
        return this.a;
    }

    /* renamed from: o */
    public final CopyOnWriteArrayList o() {
        return this.b;
    }

    /* renamed from: p */
    public int p() {
        Iterator it = this.x.iterator();
        int i = 0;
        while (it.hasNext()) {
            gy gyVar = (gy) it.next();
            if (gyVar.c() && gyVar.k()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public String u() {
        return this.J.length() == 0 ? "System" : this.J;
    }
}
