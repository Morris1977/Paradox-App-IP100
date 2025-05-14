package com.Paradox;

import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
/* renamed from: com.Paradox.j */
/* loaded from: /tmp/jadx-9784274648555160481.dex */
public class jparte extends Thread {

    private final String a = "RX";
    private Socket b;
    private ac c;

    private OutputStream d;

    public jparte(Socket socket, ac acVar) {
        this.b = socket;
        this.c = acVar;
    }

    public jparte() {

    }

    /* renamed from: a */
    public boolean ajparte() {
        try {
            if (this.b != null) {
                try {
                    this.b.shutdownInput();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    this.b.shutdownOutput();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    this.b.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            if (isAlive() && !Thread.interrupted()) {
                try {
                    interrupt();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            try {
                if (this.d != null) {
                    this.d.close();
                    this.d = null;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                this.b = null;
                return false;
            } catch (Exception e6) {
                e6.printStackTrace();
                return false;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public boolean ajscrivo(byte[] bArr) {
        try {
            this.d.write(bArr, 0, bArr.length);
            Log.d("jparte", "Ho scritto i bytes bArr vale : " + bArr +" lungo  "+ bArr.length);
            this.d.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int ibyte;
        try {
            Log.d("RX", "Thread starting");
            InputStream inputStream = this.b.getInputStream();
            byte[] bArr = new byte[8192];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.b.setSoTimeout(15000);
            this.b.setReceiveBufferSize(bArr.length);
            this.b.setTcpNoDelay(true);
            this.b.setKeepAlive(true);
            this.d = this.b.getOutputStream();
            while (!Thread.interrupted()) {
                try {
                    try {
                        //Log.d("jparte", "Sono dentro 1");
                        System.gc();
                        //Log.d("jparte", "Sono dentro 2");
                        int readbyte = inputStream.read(bArr);
                        //Log.d("jparte", "Sono dentro 3");
                        ibyte = readbyte != -1 ? readbyte : 0;
                        Log.d("jparte", "Ho letto i bytes read vale : " + readbyte);
                        if (readbyte != -1) {
                            Log.d("RX", "Got " + ibyte + " bytes. ret=" + readbyte + "  isConnected()=" + this.b.isConnected() + " isClosed()=" + this.b.isClosed());
                        }
                    } catch (SocketTimeoutException e3) {
                        ibyte = 0;
                    }
                    if (ibyte > 0 && this.c != null) {
                        Log.w("RX>>>>>>>>>>", "call CALLBACK------------------------------>>>>>>");
                        wrap.limit(ibyte);
                        this.c.a(wrap);
                        Log.w("RX<<<<<<<<<<", "called CALLBACK------------------------------<<<<<<<<");
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                } catch (Exception e5) {
                    e5.printStackTrace();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        Log.d("RX", " thread exiting");
        try {
            if (this.c != null) {
                this.c.a(0);
            }
        } catch (Exception e8) {
        }
    }
}
