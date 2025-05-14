package com.Paradox;

import android.os.Build;
import java.nio.ByteBuffer;

class av extends ai {
    public av() {
        super("ISO-8859-8");
    }

    private String c(String str) {
        return str;
    }

    private byte[] c(byte[] bArr) {
        byte[] bArr2 = (byte[]) bArr.clone();
        int length = bArr.length - 1;
        int i = 0;
        while (i < bArr.length) {
            bArr2[i] = bArr[length];
            i++;
            length--;
        }
        return bArr2;
    }

    public String a(byte[] bArr) {
        boolean z;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            short s = (short) (bArr[i3] & 255);
            if (s >= 160 && s <= 186) {
                bArr[i3] = (byte) (bArr[i3] + 64);
            } else if ((s < 32 || s > 62) && ((s < 65 || s > 90) && (s < 97 || s > 122))) {
                bArr[i3] = 32;
            }
            short s2 = (short) (bArr[i3] & 255);
            if (s2 < 224 || s2 > 250) {
                i++;
            } else {
                i2++;
            }
        }
        if (i > 0 && i2 <= 0) {
            return b(bArr);
        }
        if (i2 > 0 && i <= 0) {
            return b(c(bArr));
        }
        String str = "";
        ByteBuffer allocate = ByteBuffer.allocate(16);
        ByteBuffer allocate2 = ByteBuffer.allocate(16);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            short s3 = (short) (bArr[i4] & 255);
            if (s3 < 224 || s3 > 250) {
                allocate2.put(bArr[i4]);
                z = false;
            } else {
                z = true;
                allocate.put(bArr[i4]);
            }
            if (!z && allocate.position() > 0) {
                str = String.valueOf(new StringBuilder(b(f.a(allocate.array(), 0, allocate.position()))).reverse().toString()) + str;
                allocate.clear();
            } else if (z && allocate2.position() > 0) {
                String b = b(f.a(allocate2.array(), 0, allocate2.position()));
                if (Build.VERSION.SDK_INT < 4) {
                    b = c(b);
                }
                str = String.valueOf(b) + str;
                allocate2.clear();
            }
        }
        if (allocate.position() > 0) {
            return String.valueOf(new StringBuilder(b(f.a(allocate.array(), 0, allocate.position()))).reverse().toString()) + str;
        }
        if (allocate2.position() <= 0) {
            return str;
        }
        String b2 = b(f.a(allocate2.array(), 0, allocate2.position()));
        if (Build.VERSION.SDK_INT < 4) {
            b2 = c(b2);
        }
        return String.valueOf(b2) + str;
    }

    public byte[] a(String str) {
        byte[] b = b(str);
        for (int i = 0; i < b.length; i++) {
            short s = (short) (b[i] & 255);
            if ((s < 32 || s > 62) && ((s < 65 || s > 90) && (s < 97 || s > 122))) {
                if (s < 224 || s > 250) {
                    b[i] = 32;
                } else {
                    b[i] = (byte) (b[i] - 64);
                }
            }
        }
        return b;
    }
}
