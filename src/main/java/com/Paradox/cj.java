package com.Paradox;

import java.util.ArrayList;
import java.util.List;

class cj {
    private static ai a = null;

    public static final String a(byte[] bArr) {
        try {
            return a.a((byte[]) bArr.clone()).trim();
        } catch (Exception e) {
            e.printStackTrace();
            return "????";
        }
    }

    public static void a() {
        a = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(int i) {
        try {
            switch (i) {
                case 13:
                    a = new au();
                    break;
                case 14:
                    a = new av();
                    break;
                case 15:
                case 16:
                case 30:
                    a = new aw();
                    break;
                case 19:
                    a = new at();
                    break;
                default:
                    a = new aj(i);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                a = new aj(i);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return a != null;
    }

    public static final byte[] a(String str) {
        try {
            return a.a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ck(31, "Latin (default)"));
        arrayList.add(new ck(0, "English"));
        arrayList.add(new ck(1, "Français"));
        arrayList.add(new ck(2, "Español"));
        arrayList.add(new ck(3, "Italiano"));
        arrayList.add(new ck(4, "Svenskt"));
        arrayList.add(new ck(5, "Polski"));
        arrayList.add(new ck(6, "Português"));
        arrayList.add(new ck(7, "Deutsch"));
        arrayList.add(new ck(8, "Türkçe"));
        arrayList.add(new ck(9, "Magyar"));
        arrayList.add(new ck(10, "ÄŒeskÃ¡"));
        arrayList.add(new ck(11, "Nederlands"));
        arrayList.add(new ck(12, "Hrvatski"));
        arrayList.add(new ck(13, "ελληνικά"));
        arrayList.add(new ck(14, "עברית"));
        arrayList.add(new ck(15, "Pусский"));
        arrayList.add(new ck(16, "български"));
        arrayList.add(new ck(17, "Română"));
        arrayList.add(new ck(18, "Slovenských"));
        arrayList.add(new ck(19, "中国的"));
        arrayList.add(new ck(20, "Cрпски"));
        arrayList.add(new ck(21, "Melayu"));
        arrayList.add(new ck(22, "slovenski"));
        arrayList.add(new ck(23, "Lietuvos"));
        arrayList.add(new ck(24, "suomi"));
        arrayList.add(new ck(25, "Eestis"));
        arrayList.add(new ck(26, "Français Canada"));
        arrayList.add(new ck(27, "Nederlands"));
        arrayList.add(new ck(28, "Latvijas"));
        arrayList.add(new ck(29, "العربية"));
        arrayList.add(new ck(30, "Македонска"));
        return arrayList;
    }

    static int c() {
        String b = MyApplication.b();
        if (b == null || b.length() == 0) {
            return 31;
        }
        if (b.equalsIgnoreCase("en")) {
            return 0;
        }
        if (b.equalsIgnoreCase("fr")) {
            return 1;
        }
        if (b.equalsIgnoreCase("es")) {
            return 2;
        }
        if (b.equalsIgnoreCase("pt")) {
            return 6;
        }
        if (b.equalsIgnoreCase("he") || b.equalsIgnoreCase("iw")) {
            return 14;
        }
        if (b.equalsIgnoreCase("ro")) {
            return 17;
        }
        if (b.equalsIgnoreCase("zh")) {
            return 19;
        }
        if (b.equalsIgnoreCase("zh-rCN")) {
            return 19;
        }
        if (b.equalsIgnoreCase("bg")) {
            return 16;
        }
        if (b.equalsIgnoreCase("et")) {
            return 25;
        }
        if (b.equalsIgnoreCase("ru")) {
            return 15;
        }
        if (b.equalsIgnoreCase("el")) {
            return 13;
        }
        if (b.equalsIgnoreCase("hu")) {
            return 9;
        }
        if (b.equalsIgnoreCase("tr")) {
            return 8;
        }
        if (b.equalsIgnoreCase("pl")) {
            return 5;
        }
        if (b.equalsIgnoreCase("de")) {
            return 7;
        }
        return b.equalsIgnoreCase("mk") ? 30 : 31;
    }
}
