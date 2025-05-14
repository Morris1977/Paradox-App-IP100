package com.a.a.a.a;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class p {
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public long f;
    public String g;

    public static p a(String str) {
        String substring;
        int indexOf = str.indexOf(58);
        if (-1 == indexOf) {
            substring = "";
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = indexOf >= str.length() ? "" : str.substring(indexOf + 1);
            str = substring2;
        }
        String[] split = TextUtils.split(str, Pattern.quote("|"));
        if (split.length < 6) {
            throw new IllegalArgumentException("Wrong number of fields.");
        }
        p pVar = new p();
        pVar.g = substring;
        pVar.a = Integer.parseInt(split[0]);
        pVar.b = Integer.parseInt(split[1]);
        pVar.c = split[2];
        pVar.d = split[3];
        pVar.e = split[4];
        pVar.f = Long.parseLong(split[5]);
        return pVar;
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, Long.valueOf(this.f)});
    }
}
