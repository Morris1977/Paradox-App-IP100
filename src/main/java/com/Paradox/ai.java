package com.Paradox;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

abstract class ai implements af {
    protected Charset a = null;
    protected CharsetDecoder b = null;
    protected CharsetEncoder c = null;

    protected ai(String str) {
        if (str != null) {
            this.a = Charset.forName(str);
            this.b = this.a.newDecoder();
            this.c = this.a.newEncoder();
        }
    }

    /* access modifiers changed from: protected */
    public String b(byte[] bArr) {
        try {
            return this.b.decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public byte[] b(String str) {
        try {
            return this.c.encode(CharBuffer.wrap(str)).array();
        } catch (CharacterCodingException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }
}
