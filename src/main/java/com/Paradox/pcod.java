package com.Paradox;

public enum pcod {
    CRYPTOR_NONE(0),
    CRYPTOR_PDX_256_ECB(1),
    CRYPTOR_OLD_MODULE(238);
    
    private int d;

    private pcod(int i)
    {
        this.d = i;
    }

    public int a()
    {
        return this.d;
    }
}
