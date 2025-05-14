package com.Paradox;

import static com.Paradox.pcod.CRYPTOR_PDX_256_ECB;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;

import com.a.a.a.a.ai;
import com.androidip.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Observer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class cvconn {
    public static int b = 128;
    public static int c = 1;
    public static int d = 2;
    public static int e = 3;

    public static int fint = 4;
    public Handler an;
    protected jparte g;
    protected oconn h = new oconn();
    protected Socket i = new Socket();
    cz j = new cz("", (Site) null);
    protected final Lock k;
    protected final Condition l;
    protected Observer m;
    public cy n = new cy(this);
    public short o;
    public short pcv;
    public short q;
    public short r;
    public int s;
    public int t = 0;
    public Site usi;
    public ByteArrayOutputStream v;

    public cvconn(Observer observer) throws Throwable {
        this.m = observer;
        this.j.addObserver(this.m);
        this.k = new ReentrantLock();
        this.l = this.k.newCondition();
        this.v = new ByteArrayOutputStream();
    }

    public void a(cu cuVar, short s2) {
        boolean z = true;
        Log.d("PC2M", "_processConnectToModule(ENTER)--->");
        if (25 > cuVar.a()) {
            Log.d("PC2M", "Short reply.");
            return;
        }
        this.k.lock();
        Log.d("PC2M", "_processConnectToModule:Got lock   reply.GET_REP_RR()" + cuVar.d());
        switch (cuVar.d()) {
            case 0:
                if (cuVar.j()) {
                    if (5 > cuVar.g() || (5 == cuVar.g() && 3 > cuVar.h())) {
                        this.t = R.string.AlarmSystemDetectedCOLON;
                        Log.d("PC2M", "_processConnectToModule: Error 1 : Wrong version of IP100: need 5.3 got " + cuVar.g() + "." + cuVar.h());
                        break;
                    }
                } else {
                    cuVar.k();
                }
                if ((s2 & 16) != 0) {
                    //Log.d("cvconn", "Sono Dentro 1");
                    a(f.a(cuVar.b(), 25, 62));
                    this.h.aoco(cuVar.c());
                    this.o = cuVar.e();
                    this.pcv = cuVar.f();
                    this.q = cuVar.g();
                    this.r = cuVar.h();
                    this.s = cuVar.i();
                    this.n.b = true;
                    cy cyVar = this.n;
                    if ((s2 & 32) != 32) {
                        z = false;
                    }
                    cyVar.g = z;
                    break;
                } else {
                    this.t = R.string.UnsupportedmoduleCOLON;
                    Log.d("PC2M", "_processConnectToModule: Error 2");
                    break;
                }
            case 1:
                this.t = R.string.InvalidIPpasswordCOLON;
                break;
            case 2:
            case 4:
                this.t = R.string.UseralreadyconnectedCOLON;
                break;
            default:
                this.t = R.string.ConnectionrefusedCOLON;
                break;
        }
        this.l.signalAll();
        this.k.unlock();
        Log.d("PC2M", "<----_processConnectToModule(EXIT)");
    }

    @SuppressLint("LongLogTag")
    public void a(ByteBuffer byteBuffer) throws Throwable {
        byte[] c2 = new byte[0];
        this.v.write(byteBuffer.array(), this.v.size(), byteBuffer.limit());
        Log.d("cvconn", "Scrivo qualcosa"+ byteBuffer.array());
        ByteBuffer wrap = ByteBuffer.wrap(this.v.toByteArray());
        ct ctVar = new ct(wrap);
        if (16 <= wrap.limit() && 170 == ctVar.d() && ctVar.e() <= wrap.limit() - 16) {
            if (ctVar.h() == 0) {
                if (2 != ctVar.f()) {
                    return;
                }
            } else if (1 != ctVar.f()) {
                return;
            }
            if (ctVar.e() <= 0) {
                c2 = ctVar.c();
            } else if ((ctVar.g() & 1) != 0) {
                c2 = f.a(this.h.c(ctVar.c()), 0, ctVar.e());
            } else {
                c2 = ctVar.c();
            }
            cu cuVar = new cu(c2);
            Log.d("To PC (data decrypted) (size:0x" + Integer.toHexString(c2.length) + ")", ab.a(c2));
            switch (ctVar.h()) {
                case 0:
                    Log.d("Commands", "NEIP_cmdPassThru");
                    new cx(this, f.a(c2, 0, c2.length)).start();
                    return;
                case 240:
                    switch (ctVar.i()) {
                        case 0:
                            a(cuVar, ctVar.g());
                            return;
                        case 3:
                            ecv(c2);
                            return;
                        default:
                            throw new Exception("wrong subcommand reply:" + ctVar.h());
                    }
                case 251:
                    bcv(c2, ctVar.i());
                    return;
                case 255:
                    f(c2);
                    return;
                default:
                    return;
            }
        }
    }

    public void acv(byte[] bArr, int i2) throws Throwable {
        Log.d("", "NEIP_cmdMultiCmd");
        a(new cs(251, i2, bArr));
    }

    public boolean a(Site site) {
        jparte jparteVar = null;
        this.t = 0;
        try {
            if (this.n.b) {
                b();
            }
            if (this.n.d) {
                //Log.d("MAURO", "SONO IN cvconn prima di Fcz");
                ca.a(this.j.Fcz);
                //Log.d("MAURO", "SONO IN cvconn dopo  Fcz");
                site.g(this.j.Fcz.a);
                //Log.d("MAURO", "SONO IN cvconn dopo 2  Fcz");
                cj.a();
                //Log.d("MAURO", "SONO IN cvconn dopo 3  Fcz");
                this.j.R();
                //Log.d("MAURO", "SONO IN cvconn dopo 4  Fcz");
            }
            return jparteVar.ajparte();
        } catch (Exception e2) {
            e2.printStackTrace();
            return jparteVar.ajparte();
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        } finally {
            this.g.ajparte();
        }
    }

    /* JADX INFO: finally extract failed */
    @SuppressLint("LongLogTag")
    public boolean a(cs csVar) throws Throwable {
        int i2 = 4;
        Log.d("Commands", "prepareCommand 2 --->");
        byte[] bArr = null;
        try {
            bArr = this.h.boco(csVar.d());
            //Log.d("occonn", "il byte dopo encrypt vale : "+ bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        ct ctVar = new ct(csVar.d(), true);
        ctVar.a(170);
        ctVar.b(csVar.d().length);
        ctVar.c(csVar.a() == 0 ? 4 : 3);
        //Log.d("MAURO" ,"(a vale)"+ Integer.toHexString(csVar.a()));
        ctVar.d(csVar.c() | 81);
        ctVar.e(csVar.a());
        ctVar.f(csVar.b());
        ctVar.g(14);
        ctVar.h(0);
        ctVar.i(this.h.a().a());
        Log.d("To Panel (packet noencrypt) (size:0x" + Integer.toHexString(ctVar.adi()) + ")", ab.a(ctVar.b()));
        //Log.d("Al pan (pack noencrypt)" ,"(size:0x" + Integer.toHexString(ctVar.adi())+ ")");
        ct ctVar2 = new ct(bArr, true);
        ctVar2.a(170);
        ctVar2.b(csVar.d().length);
        if (csVar.a() != 0) {
            i2 = 3;
        }
        ctVar2.c(i2);
        //Log.d("MAURO" ,"(a2 vale)"+ Integer.toHexString(csVar.a()));
        ctVar2.d(csVar.c() | 81);
        ctVar2.e(csVar.a());
        ctVar2.f(csVar.b());
        ctVar2.g(14);
        ctVar2.h(0);
        ctVar2.i(this.h.a().a());
        Log.d("To Panel (packet encrypted) (size:0x" + Integer.toHexString(ctVar2.adi()) + ")", ab.a(ctVar2.b()));
        this.v.reset();
        try {
            //Log.d("MAURO", "Sono prima di aj che vale :");
            boolean a2 = this.g.ajscrivo(ctVar2.b());
            //Log.d("MAURO", "Sono dopo di aj che vale :");
            Log.d("Commands", "<---prepareCommand");
            return a2;
        } catch (Exception e3) {
            Log.w("Commands", "prepareCommand Threw error on write");
            e3.printStackTrace();
            Log.d("Commands", "<---prepareCommand");
            return false;
        } catch (Throwable th) {
            Log.d("Commands", "<---prepareCommand");
            throw th;
        }
    }

    public boolean a(geconnect geconnectVar, Site site) {
        try {
            this.usi = site;
            this.n.a();
            this.t = 0;
            InetSocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getByName(site.c()), site.d());
            this.i.setReuseAddress(true);
            this.i.connect(inetSocketAddress, 10000);
            Thread.sleep(1);
            this.g.start();
            Thread.sleep(1);
            geconnectVar.age(20);
            try {
                this.n.a = true;
                this.k.lock();
                int i2 = 30;
                geconnectVar.age(30);
                String g2 = site.g();
                this.h.adioconn(CRYPTOR_PDX_256_ECB);
                this.h.aoco(g2.getBytes("UTF-8"));
                site.g();
                a(site.g());
                //Log.d("cvconn", "a(site.g()) vale : "+ a(site.g()));
                if (!this.l.await(5000, TimeUnit.MILLISECONDS)) {
                    i2 = 40;
                    geconnectVar.age(40);
                    if (this.n.a && !this.n.b) {
                        a(site.g());
                        if (!this.l.await(7000, TimeUnit.MILLISECONDS)) {
                            this.t = R.string.Connectiontimeout;
                        }
                    }
                }
                this.k.unlock();
                if (this.t == 0) {
                    ai geVar = null;
                    geconnectVar.age(i2 + 10);
                    if (b(site.hsit())) {
                        Log.d("", "Connected to Panel");
                        geconnectVar.age(100);
                        return true;
                    }
                    Log.d("", "Could not connect to Panel");
                }
                return false;
            } catch (Exception e2) {
                this.t = R.string.Connectiontimeout;
                e2.printStackTrace();
                return false;
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        } catch (IOException e3) {
            this.t = R.string.Connectiontimeout;
            e3.printStackTrace();
            return false;
        } catch (Exception e4) {
            this.t = R.string.Connectiontimeout;
            e4.printStackTrace();
            return false;
        }
    }

    public boolean a(String str) {
        try {
            return a(new cs(240, 0, str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return false;
        } catch (IOException e3) {
            e3.printStackTrace();
            return false;
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        }
    }

    public abstract boolean a(byte[] bArr);

    public void bcv(byte[] bArr, int i2) throws Throwable {
        switch (i2) {
            case 0:
                h(bArr);
                break;
            case 1:
                jcv(bArr);
                break;
            default:
                Log.w("Unknown multicmd type=" + i2, "");
                break;
        }
        this.k.lock();
        this.l.signalAll();
        this.k.unlock();
    }

    public boolean b() throws Throwable {
        try {
            return a(new cs(255));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(String str) throws Throwable {
        Log.d("C2P", "connectToPanel(ENTER)---->");
        byte[] b = this.j.b(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(b);
        byteArrayOutputStream.write(this.j.n);
        this.k.lock();
        this.t = 0;
        boolean d = d(byteArrayOutputStream.toByteArray());
        if (d && !(d = this.l.await(2000L, TimeUnit.MILLISECONDS)) && (d = d(byteArrayOutputStream.toByteArray())) && !(d = this.l.await(4000L, TimeUnit.MILLISECONDS)) && (d = d(byteArrayOutputStream.toByteArray())) && !(d = this.l.await(8000L, TimeUnit.MILLISECONDS))) {
            this.t = R.string.Connectiontimeout;
        }
        this.k.unlock();
        Log.d("C2P", "connectToPanel(EXIT) f=" + d);
        return d;
    }

    public boolean d(byte[] bArr) throws Throwable {
        return a(new cs(240, 3, bArr));
    }

    public void ecv(byte[] bArr) throws Throwable {
        Log.d("PC2P", "_processConnectToPanel(ENTER)---->");
        if (3 <= bArr.length) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            switch (wrap.get(0) & 240) {
                case 16:
                    if (287 <= bArr.length) {
                        this.j.o = wrap.get(3);
                        this.j.p = wrap.get(4);
                        this.j.b_();
                        if (this.j instanceof cn) {
                            jcv(f.a(bArr, 38, bArr.length));
                        } else {
                            if ((bArr[0] & 1) != 0) {
                                Log.d("NEware is connected", "NEware is connected");
                            }
                            h(f.a(bArr, 7, bArr.length));
                        }
                        this.k.lock();
                        this.n.d = true;
                        this.l.signalAll();
                        this.k.unlock();
                        Log.d("PC2P", "start thread _panel.startMonitoring()");
                        try {
                            new cw(this).start();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        Log.d("PC2P", "<----_processConnectToPanel(EXIT)");
                        return;
                    }
                    return;
                case 112:
                    switch (wrap.get(2)) {
                        case 1:
                            this.t = R.string.InvalidusercodeCOLON;
                            break;
                        case 17:
                            this.t = R.string.PanelalreadyconnectedCOLON;
                            break;
                        case 19:
                            this.t = R.string.ConnectiohasbennabortedCOLON;
                            break;
                        default:
                            this.t = R.string.UnknownresultcodeCOLON;
                            break;
                    }
                    this.k.lock();
                    this.l.signalAll();
                    this.k.unlock();
                    return;
                default:
                    return;
            }
        }
    }

    public void f(byte[] bArr) {
        if (1 != bArr[0]) {
            Log.w("Error", "failed to disconnect");
        }
        this.k.lock();
        this.n.a();
        this.l.signalAll();
        this.k.unlock();
    }

    public void g(byte[] bArr) throws Throwable {
        acv(bArr, 0);
    }

    public void h(byte[] bArr) throws Throwable {
        Log.d("", "[_processGenericMulticmd]");
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int length = bArr.length;
        Log.d("Len=" + length, ab.a(bArr));
        this.j.a(true);
        int i2 = length;
        int i3 = 0;
        while (i2 > 0) {
            short s2 = (short) (wrap.get(i3) & 255);
            i2--;
            i3++;
            if (s2 <= i2) {
                byte[] a2 = f.a(wrap.array(), i3, i3 + s2);
                i3 += s2;
                i2 -= s2;
                this.j.g(a2);
            }
        }
        this.j.a(false);
    }

    public void i(byte[] bArr) throws Throwable {
        acv(bArr, 1);
    }

    @SuppressLint("LongLogTag")
    public void jcv1(byte[] bArr) throws Throwable {
        int length = bArr.length;
        Log.d("replyLen=" + length, ab.a(bArr));
        this.j.a(true);
        int i2 = length;
        int i3 = 0;
        while (3 < i2) {
            short s2 = (short) (bArr[i3] & 255);
            byte b2 = (byte) (65535 & ((bArr[i3 + 1] << 8) | (bArr[i3 + 2] & 255)));
            Log.d("_processMGSPMultiread cmdlen=0x" + Integer.toHexString(s2), "address=0x" + Integer.toHexString(b2));
            i3 += 3;
            int i4 = i2 - 3;
            if (s2 <= i4) {
                ((ag) this.j).a((short) b2, f.a(bArr, i3, i3 + s2));
                i3 += s2;
                i2 = i4 - s2;
            } else {
                i2 = i4;
            }
        }
        this.j.a(false);
    }
    @SuppressLint("LongLogTag")
    public void jcv(byte[] bArr) throws Throwable {
        int length = bArr.length;
        Log.d("replyLen=" + length, ab.a(bArr));
        this.j.a(true);
        int i = length;
        int i2 = 0;
        while (3 < i) {
            short s = (short) (bArr[i2] & 255);
            int i3 = 65535 & ((bArr[i2 + 1] << 8) | (bArr[i2 + 2] & 255));
            Log.d("_processMGSPMultiread cmdlen=0x" + Integer.toHexString(s), "address=0x" + Integer.toHexString(i3));
            i2 += 3;
            int i4 = i - 3;
            if (s <= i4) {
                //this.j.a((short) i3, com.Paradox.f.a(bArr, i2, i2 + s));
                ((ag) this.j).a((short) i3, f.a(bArr, i2, i2 + s));
                i2 += s;
                i = i4 - s;
            } else {
                i = i4;
            }
        }
        this.j.a(false);
    }
}
