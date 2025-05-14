package com.Paradox;

public class h {
    private static h a;
    private BadgeTabWidget b;

    private h(BadgeTabWidget badgeTabWidget) {
        this.b = badgeTabWidget;
    }

    public static h a() {
        if (a != null) {
            return a;
        }
        throw new RuntimeException("BadgeTabManager has not been initialized with a BadgeTabWidget!");
    }

    public static void a(BadgeTabWidget badgeTabWidget)
    {
        a = new h(badgeTabWidget);
    }

    public void a(int i, int i2) {
        this.b.a(i, i2);
    }
}
