package com.Paradox;

class ci {
    int a;
    final /* synthetic */ ch b;

    private ci(ch chVar) {
        this.b = chVar;
        this.a = 0;
    }

    /* synthetic */ ci(ch chVar, ci ciVar) {
        this(chVar);
    }

    public boolean a(boolean z, boolean z2) {
        if (z == z2) {
            return z;
        }
        this.a++;
        return z2;
    }
}
