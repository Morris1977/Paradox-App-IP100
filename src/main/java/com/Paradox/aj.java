package com.Paradox;

import java.nio.charset.Charset;

class aj extends ai {
    private ak d = null;

    private aj() {
        super((String) null);
    }

    public aj(int i) {
        super((String) null);
        String str;
        switch (i) {
            case 5:
                this.d = new ap(this, (ap) null);
                str = "windows-1250";
                break;
            case 6:
                this.d = new aq(this, (aq) null);
                str = "windows-1252";
                break;
            case 7:
                this.d = new an(this, (an) null);
                str = "windows-1252";
                break;
            case 8:
                this.d = new as(this, (as) null);
                str = "windows-1254";
                break;
            case 9:
                this.d = new ao(this, (ao) null);
                str = "windows-1250";
                break;
            case 17:
                this.d = new ar(this, (ar) null);
                str = "windows-1250";
                break;
            case 25:
                this.d = new am(this, (am) null);
                str = "windows-1257";
                break;
            default:
                this.d = new al(this, (al) null);
                str = "windows-1252";
                break;
        }
        this.a = Charset.forName(str);
        this.b = this.a.newDecoder();
        this.c = this.a.newEncoder();
    }

    public String a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            switch ((short) (bArr[i] & 255)) {
                case 128:
                    bArr[i] = -37;
                    break;
                case 129:
                    bArr[i] = -39;
                    break;
                case 130:
                    bArr[i] = -38;
                    break;
                case 131:
                    bArr[i] = -36;
                    break;
                case 132:
                    bArr[i] = -5;
                    break;
                case 133:
                    bArr[i] = -7;
                    break;
                case 134:
                    bArr[i] = -6;
                    break;
                case 135:
                    bArr[i] = -44;
                    break;
                case 136:
                    bArr[i] = -46;
                    break;
                case 137:
                    bArr[i] = -45;
                    break;
                case 138:
                    bArr[i] = -80;
                    break;
                case 139:
                    bArr[i] = -12;
                    break;
                case 140:
                    bArr[i] = -14;
                    break;
                case 141:
                    bArr[i] = -13;
                    break;
                case 142:
                    bArr[i] = -10;
                    break;
                case 143:
                    bArr[i] = -65;
                    break;
                case 144:
                    bArr[i] = -54;
                    break;
                case 145:
                    bArr[i] = -56;
                    break;
                case 146:
                    bArr[i] = -55;
                    break;
                case 147:
                    bArr[i] = -53;
                    break;
                case 148:
                    bArr[i] = -22;
                    break;
                case 149:
                    bArr[i] = -24;
                    break;
                case 150:
                    bArr[i] = -23;
                    break;
                case 151:
                    bArr[i] = -21;
                    break;
                case 152:
                    bArr[i] = -59;
                    break;
                case 153:
                    bArr[i] = -60;
                    break;
                case 154:
                    bArr[i] = -27;
                    break;
                case 155:
                    bArr[i] = -30;
                    break;
                case 156:
                    bArr[i] = -32;
                    break;
                case 157:
                    bArr[i] = -31;
                    break;
                case 158:
                    bArr[i] = -28;
                    break;
                case 159:
                    bArr[i] = -86;
                    break;
                case 160:
                    bArr[i] = -86;
                    break;
                case 161:
                    bArr[i] = -18;
                    break;
                case 162:
                    bArr[i] = -20;
                    break;
                case 163:
                    bArr[i] = -19;
                    break;
                case 164:
                    bArr[i] = -17;
                    break;
                case 165:
                    bArr[i] = -95;
                    break;
                case 166:
                    bArr[i] = -47;
                    break;
                case 167:
                    bArr[i] = -15;
                    break;
                case 168:
                    bArr[i] = -47;
                    break;
                case 169:
                    bArr[i] = 32;
                    break;
                case 170:
                    bArr[i] = 32;
                    break;
                case 171:
                    bArr[i] = 32;
                    break;
                case 172:
                    bArr[i] = 32;
                    break;
                case 173:
                    bArr[i] = 32;
                    break;
                case 174:
                    bArr[i] = 32;
                    break;
                case 175:
                    bArr[i] = -58;
                    break;
                case 176:
                    bArr[i] = -89;
                    break;
                case 177:
                    bArr[i] = -79;
                    break;
                case 178:
                    bArr[i] = 32;
                    break;
                case 179:
                    bArr[i] = 32;
                    break;
                case 180:
                    bArr[i] = 32;
                    break;
                case 181:
                    bArr[i] = 32;
                    break;
                case 182:
                    bArr[i] = -125;
                    break;
                case 183:
                    bArr[i] = -93;
                    break;
                case 184:
                    bArr[i] = 32;
                    break;
                case 185:
                    bArr[i] = 32;
                    break;
                case 186:
                    bArr[i] = 32;
                    break;
                case 187:
                    bArr[i] = 32;
                    break;
                case 188:
                    bArr[i] = -74;
                    break;
                case 189:
                    bArr[i] = -67;
                    break;
                case 190:
                    bArr[i] = 32;
                    break;
                case 191:
                    bArr[i] = -68;
                    break;
                case 192:
                    bArr[i] = -8;
                    break;
                case 193:
                    bArr[i] = 32;
                    break;
                case 194:
                    bArr[i] = -48;
                    break;
                case 195:
                    bArr[i] = -33;
                    break;
                case 196:
                    bArr[i] = -25;
                    break;
                case 197:
                    bArr[i] = -82;
                    break;
                case 198:
                    bArr[i] = 32;
                    break;
                case 199:
                    bArr[i] = 32;
                    break;
                case 200:
                    bArr[i] = -75;
                    break;
                case 201:
                    bArr[i] = -8;
                    break;
                case 202:
                    bArr[i] = -1;
                    break;
                case 203:
                    bArr[i] = -61;
                    break;
                case 204:
                    bArr[i] = -94;
                    break;
                case 205:
                    bArr[i] = -29;
                    break;
                case 206:
                    bArr[i] = -43;
                    break;
                case 207:
                    bArr[i] = -11;
                    break;
                case 208:
                    bArr[i] = -73;
                    break;
                case 209:
                    bArr[i] = -88;
                    break;
                case 210:
                    bArr[i] = -80;
                    break;
                case 211:
                    bArr[i] = 32;
                    break;
                case 212:
                    bArr[i] = -76;
                    break;
                case 213:
                    bArr[i] = 126;
                    break;
                case 214:
                    bArr[i] = -9;
                    break;
                case 215:
                    bArr[i] = -85;
                    break;
                case 216:
                    bArr[i] = -69;
                    break;
                case 217:
                    bArr[i] = 32;
                    break;
                case 218:
                    bArr[i] = 92;
                    break;
                case 219:
                    bArr[i] = -41;
                    break;
                case 220:
                    bArr[i] = -82;
                    break;
                case 221:
                    bArr[i] = -87;
                    break;
                case 222:
                    bArr[i] = 32;
                    break;
                case 223:
                    bArr[i] = 32;
                    break;
                default:
                    if (bArr[i] >= 224 && bArr[i] <= 255) {
                        bArr[i] = 32;
                        break;
                    }
            }
            bArr[i] = (byte) (this.d.a((short) (bArr[i] & 255)) & 255);
        }
        return b(bArr);
    }

    public byte[] a(String str) {
        byte[] b = b(str);
        for (int i = 0; i < b.length; i++) {
            switch ((short) (b[i] & 255)) {
                case 92:
                    b[i] = -38;
                    break;
                case 126:
                    b[i] = -43;
                    break;
                case 131:
                    b[i] = -74;
                    break;
                case 161:
                    b[i] = -91;
                    break;
                case 162:
                    b[i] = -52;
                    break;
                case 163:
                    b[i] = -73;
                    break;
                case 167:
                    b[i] = -80;
                    break;
                case 168:
                    b[i] = -47;
                    break;
                case 169:
                    b[i] = -35;
                    break;
                case 170:
                    b[i] = -97;
                    break;
                case 171:
                    b[i] = -41;
                    break;
                case 174:
                    b[i] = -59;
                    break;
                case 176:
                    b[i] = -46;
                    break;
                case 177:
                    b[i] = -79;
                    break;
                case 180:
                    b[i] = -44;
                    break;
                case 181:
                    b[i] = -56;
                    break;
                case 182:
                    b[i] = -68;
                    break;
                case 183:
                    b[i] = -48;
                    break;
                case 186:
                    b[i] = -46;
                    break;
                case 187:
                    b[i] = -40;
                    break;
                case 188:
                    b[i] = -65;
                    break;
                case 189:
                    b[i] = -67;
                    break;
                case 191:
                    b[i] = -113;
                    break;
                case 195:
                    b[i] = -53;
                    break;
                case 196:
                    b[i] = -103;
                    break;
                case 197:
                    b[i] = -104;
                    break;
                case 198:
                    b[i] = -81;
                    break;
                case 200:
                    b[i] = -111;
                    break;
                case 201:
                    b[i] = -110;
                    break;
                case 202:
                    b[i] = -112;
                    break;
                case 203:
                    b[i] = -109;
                    break;
                case 204:
                    b[i] = -94;
                    break;
                case 206:
                    b[i] = -95;
                    break;
                case 207:
                    b[i] = -92;
                    break;
                case 208:
                    b[i] = -62;
                    break;
                case 209:
                    b[i] = -90;
                    break;
                case 210:
                    b[i] = -120;
                    break;
                case 211:
                    b[i] = -119;
                    break;
                case 212:
                    b[i] = -121;
                    break;
                case 213:
                    b[i] = -50;
                    break;
                case 214:
                    b[i] = -114;
                    break;
                case 215:
                    b[i] = -37;
                    break;
                case 217:
                    b[i] = -127;
                    break;
                case 218:
                    b[i] = -126;
                    break;
                case 219:
                    b[i] = Byte.MIN_VALUE;
                    break;
                case 220:
                    b[i] = -125;
                    break;
                case 223:
                    b[i] = -61;
                    break;
                case 224:
                    b[i] = -100;
                    break;
                case 225:
                    b[i] = -99;
                    break;
                case 226:
                    b[i] = -101;
                    break;
                case 227:
                    b[i] = -51;
                    break;
                case 228:
                    b[i] = -98;
                    break;
                case 229:
                    b[i] = -102;
                    break;
                case 231:
                    b[i] = -60;
                    break;
                case 232:
                    b[i] = -107;
                    break;
                case 233:
                    b[i] = -106;
                    break;
                case 234:
                    b[i] = -108;
                    break;
                case 235:
                    b[i] = -105;
                    break;
                case 236:
                    b[i] = -94;
                    break;
                case 237:
                    b[i] = -93;
                    break;
                case 238:
                    b[i] = -95;
                    break;
                case 239:
                    b[i] = -92;
                    break;
                case 241:
                    b[i] = -89;
                    break;
                case 242:
                    b[i] = -116;
                    break;
                case 243:
                    b[i] = -115;
                    break;
                case 244:
                    b[i] = -117;
                    break;
                case 245:
                    b[i] = -49;
                    break;
                case 246:
                    b[i] = -114;
                    break;
                case 247:
                    b[i] = -42;
                    break;
                case 248:
                    b[i] = -64;
                    break;
                case 249:
                    b[i] = -123;
                    break;
                case 250:
                    b[i] = -122;
                    break;
                case 251:
                    b[i] = -124;
                    break;
                case 255:
                    b[i] = -54;
                    break;
            }
            b[i] = (byte) (this.d.b((short) (b[i] & 255)) & 255);
        }
        return b;
    }
}
