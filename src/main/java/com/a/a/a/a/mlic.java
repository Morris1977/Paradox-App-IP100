package com.a.a.a.a;

import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

class mlic {
    private final o a;
    private final l b;
    private final int c;
    private final String d;
    private final String e;
    private final n f;

    mlic(o oVar, n aaVar, l lVar, int i, String str, String str2) {
        this.a = oVar;
        this.f = aaVar;
        this.b = lVar;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    private void a(int i) {
        this.b.c(i);
    }

    private void a(int i, p pVar) {
        this.a.a(i, pVar);
        if (this.a.a()) {
            this.b.a(i);
        } else {
            this.b.b(i);
        }
    }

    private void d() {
        this.b.b(561);
    }

    public l a() {
        return this.b;
    }

    public void a(PublicKey publicKey, int i, String str, IBinder str2) {
        String str3;
        p pVar = null;
        if (i == 0 || i == 1 || i == 2) {
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                instance.verify(a.a(str2));
                if (1 == 0) {
                    Log.e("LicenseValidator", "Signature verification failed.");
                    d();
                    return;
                }
                try {
                    pVar = p.a(str);
                    if (pVar.a != i) {
                        Log.e("LicenseValidator", "Response codes don't match.");
                        d();
                        return;
                    } else if (pVar.b != this.c) {
                        Log.e("LicenseValidator", "Nonce doesn't match.");
                        d();
                        return;
                    } else if (!pVar.c.equals(this.d)) {
                        Log.e("LicenseValidator", "Package name doesn't match.");
                        d();
                        return;
                    } else if (!pVar.d.equals(this.e)) {
                        Log.e("LicenseValidator", "Version codes don't match.");
                        d();
                        return;
                    } else {
                        str3 = pVar.e;
                        if (TextUtils.isEmpty(str3)) {
                            Log.e("LicenseValidator", "User identifier is empty.");
                            d();
                            return;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    Log.e("LicenseValidator", "Could not parse response.");
                    d();
                    return;
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(e3);
            } catch (InvalidKeyException e4) {
                a(5);
                return;
            } catch (SignatureException e5) {
                throw new RuntimeException(e5);
            }
        } else {
            str3 = null;
        }
        switch (i) {
            case 0:
            case 1:
                a(this.f.a(str3), pVar);
                return;
            case 2:
                a(561, pVar);
                return;
            case 3:
                a(3);
                return;
            case 4:
                Log.w("LicenseValidator", "An error has occurred on the licensing server.");
                a(291, pVar);
                return;
            case 5:
                Log.w("LicenseValidator", "Licensing server is refusing to talk to this device, over quota.");
                a(291, pVar);
                return;
            case 257:
                Log.w("LicenseValidator", "Error contacting licensing server.");
                a(291, pVar);
                return;
            case 258:
                a(1);
                return;
            case 259:
                a(2);
                return;
            default:
                Log.e("LicenseValidator", "Unknown response code for license check.");
                d();
                return;
        }
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }
}
