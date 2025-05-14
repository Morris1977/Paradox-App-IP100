package com.Paradox;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.androidip.R;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.Paradox.be */
/* loaded from: /tmp/jadx-2782641171564366566.dex */
class belocate extends AsyncTask {
    final /* synthetic */ LocateActivity a;
    private bg d;
    private ListView e;
    private LocateActivity.LocatedDevice f;
    private final int b = 2000;
    private DatagramSocket c = null;
    private TextView g = null;

    public belocate(LocateActivity locateActivity, LocateActivity.LocatedDevice locatedDevice) {
        this.a = locateActivity;
        this.f = null;
        this.f = locatedDevice;
    }

    /* renamed from: a */
    private int a(LocateActivity.LocatedDevice locatedDevice) {
        for (int i = 0; i < this.d.getCount(); i++) {
            if (((LocateActivity.LocatedDevice) Objects.requireNonNull(this.d.getItem(i))).a(locatedDevice)) {
                return 0;
            }
        }
        this.d.add(locatedDevice);
        return this.d.getCount();
    }
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Long doInBackground(Object... objArr) {
        Long l;
        IOException e;
        UnknownHostException e2;
        SocketException e3;
        DatagramPacket datagramPacket = null;
        Log.d("CheckForPanels", "Execute doInBackground");
        Long l2 = 0L;
        try {
            try {
                try {
                    this.c = new DatagramSocket(10000);
                    this.c.setBroadcast(true);
                    this.c.setReuseAddress(true);
                    byte[] bytes = "paradox?".getBytes();
                    DatagramPacket datagramPacket2 = new DatagramPacket(bytes, bytes.length, ainet(), 10000);
                    this.c.setSoTimeout(2000);
                    this.c.send(datagramPacket2);
                    int i = 0;
                    while (!isCancelled()) {
                        try {
                            byte[] bArr = new byte[1024];
                            datagramPacket = new DatagramPacket(bArr, bArr.length);
                            this.c.receive(datagramPacket);
                        } catch (SocketException e4) {
                            Log.d("CheckForPanels", "SocketException. canceled=" + isCancelled());
                        } //catch (SocketTimeoutException e5) {
                           // Log.d("CheckForPanels", "UDP T/O: canceled=" + isCancelled());
                           // this.c.send(datagramPacket2);
                        //}
                    catch (Exception e6) {
                            l = l2;
                            e6.printStackTrace();
                            if (this.c != null) {
                                this.c.close();
                                this.c.disconnect();
                                this.c = null;
                                return l;
                            }
                            return l;
                        }
                        if (isCancelled()) {
                            Log.d("CheckForPanels", "isCancelled()2 - aborting");
                            if (this.c != null) {
                                this.c.close();
                                this.c.disconnect();
                                this.c = null;
                            }
                            return null;
                        }
                        i++;
                        Log.d("CheckForPanels", " ");
                        Log.d("CheckForPanels", "MAURO");
                        Log.d("CheckForPanels", new String(datagramPacket.getData(), 0, datagramPacket.getData().length - 1, "UTF-8"));
                        Log.d("CheckForPanels", "pktnum=" + i + " RX packet from " + datagramPacket.getAddress().getHostAddress() + " Porta:" + datagramPacket.getPort() + " datalen=" + datagramPacket.getLength());
                        String[] split = new String(datagramPacket.getData(), 0, datagramPacket.getData().length, "UTF-8").split("&");
                        String[] split10 = new String(datagramPacket2.getData(), 0, datagramPacket2.getData().length, "UTF-8").split("&");
                        Log.d("MAURO", "stringa_inviata=" + Arrays.toString(split10));
                        Log.d("MAURO", "stringa_ricevuta=" + Arrays.toString(split));
                                LocateActivity.LocatedDevice locatedDevice = new LocateActivity.LocatedDevice();
                        for (String str : split) {
                            String[] split2 = str.split("=");
                            if (split2 != null && split2.length == 2) {
                                String str2 = split2[0];
                                String str3 = split2[1];
                                if (locatedDevice.d.length() == 0 && str2.equalsIgnoreCase("sitename")) {
                                    locatedDevice.d = str3;
                                } else if (locatedDevice.c.length() == 0 && str2.equalsIgnoreCase("type")) {
                                    locatedDevice.c = str3;
                                } else if (locatedDevice.b.length() == 0 && str2.equalsIgnoreCase("ip")) {
                                    locatedDevice.b = str3;
                                } else if (locatedDevice.a == 0 && str2.equalsIgnoreCase("portne")) {
                                    locatedDevice.a = Integer.parseInt(str3);
                                }
                            }
                        }
                        if (locatedDevice.b != null && locatedDevice.c != null && locatedDevice.a != 0 && locatedDevice.d != null) {
                            l2 = Long.valueOf(l2.longValue() + 1);
                            Log.d("MAURO", "NON HO RICEVUTO NIENTE" );
                            publishProgress(locatedDevice);
                        }
                    }
                    Log.d("CheckForPanels", "isCancelled()1 - aborting");
                    if (this.c != null) {
                        this.c.close();
                        this.c.disconnect();
                        this.c = null;
                    }
                    return null;
                } catch (SocketException e10) {
                    l = l2;
                    e3 = e10;
                }
            } catch (UnknownHostException e11) {
                l = l2;
                e2 = e11;
            } catch (IOException e12) {
                l = l2;
                e = e12;
            }
        } catch (Throwable th) {
            if (this.c != null) {
                this.c.close();
                this.c.disconnect();
                this.c = null;
            }
            try {
                throw th;
            } catch (Throwable ex) {
                throw new RuntimeException(ex);
            }
        } throw new RuntimeException();
    }
    public InetAddress ainet() throws UnknownHostException {
        return InetAddress.getByName("255.255.255.255");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    //@Override // android.os.AsyncTask
    public void onPostExecute(Long l) {
        super.onPostExecute(l);
        Log.d("CheckForPanels", "onPostExecute() result=" + l);
        if (l.longValue() > 0) {
            this.d.notifyDataSetChanged();
        }
        l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    //@Override // android.os.AsyncTask
    /* renamed from: a */
    public void onProgressUpdate(LocateActivity.LocatedDevice... locatedDeviceArr) {
        Log.d("CheckForPanels", "onProgressUpdate:" + locatedDeviceArr[0]);
        int a = a(locatedDeviceArr[0]);
        if (a > 0) {
            this.g.setText(String.format(this.a.getResources().getString(R.string.LocatingIpDevices), Integer.valueOf(a)));
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        Log.d("CheckForPanels", "onCancelled()");
        try {
            if (this.c != null) {
                this.c.close();
                this.c.disconnect();
            }
        } catch (Exception e) {
        }
        this.a.finish();
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("CheckForPanels", "Execute onPreExecute");
        this.d = new bg(this.a, this.a, R.layout.locate_items, this.f);
        this.e = (ListView) this.a.findViewById(R.id.lvLocatedDevices);
        this.e.setAdapter((ListAdapter) this.d);
        this.e.setEmptyView(null);
        this.g = (TextView) this.a.findViewById(R.id.tvSearchInfo);
        this.g.setText(String.format(this.a.getResources().getString(R.string.LocatingIpDevices), 0));
    }
}
