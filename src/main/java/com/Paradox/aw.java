package com.Paradox;

class aw extends ai {
    public aw() {
        super("windows-1251");
    }

    public String a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            switch ((short) (bArr[i] & 255)) {
                case 65:
                    bArr[i] = -64;
                    break;
                case 66:
                    bArr[i] = -62;
                    break;
                case 67:
                    bArr[i] = -47;
                    break;
                case 69:
                    bArr[i] = -59;
                    break;
                case 72:
                    bArr[i] = -51;
                    break;
                case 75:
                    bArr[i] = -54;
                    break;
                case 77:
                    bArr[i] = -52;
                    break;
                case 79:
                    bArr[i] = -50;
                    break;
                case 80:
                    bArr[i] = -48;
                    break;
                case 84:
                    bArr[i] = -46;
                    break;
                case 88:
                    bArr[i] = -43;
                    break;
                case 97:
                    bArr[i] = -32;
                    break;
                case 98:
                    bArr[i] = -36;
                    break;
                case 99:
                    bArr[i] = -15;
                    break;
                case 101:
                    bArr[i] = -27;
                    break;
                case 111:
                    bArr[i] = -18;
                    break;
                case 112:
                    bArr[i] = -16;
                    break;
                case 120:
                    bArr[i] = -11;
                    break;
                case 121:
                    bArr[i] = -13;
                    break;
                case 128:
                    bArr[i] = -80;
                    break;
                case 129:
                    bArr[i] = -71;
                    break;
                case 160:
                    bArr[i] = -63;
                    break;
                case 161:
                    bArr[i] = -61;
                    break;
                case 162:
                    bArr[i] = -88;
                    break;
                case 163:
                    bArr[i] = -58;
                    break;
                case 164:
                    bArr[i] = -57;
                    break;
                case 165:
                    bArr[i] = -56;
                    break;
                case 166:
                    bArr[i] = -55;
                    break;
                case 167:
                    bArr[i] = -53;
                    break;
                case 168:
                    bArr[i] = -49;
                    break;
                case 169:
                    bArr[i] = -45;
                    break;
                case 170:
                    bArr[i] = -44;
                    break;
                case 171:
                    bArr[i] = -41;
                    break;
                case 172:
                    bArr[i] = -40;
                    break;
                case 173:
                    bArr[i] = -38;
                    break;
                case 174:
                    bArr[i] = -37;
                    break;
                case 175:
                    bArr[i] = -35;
                    break;
                case 176:
                    bArr[i] = -34;
                    break;
                case 177:
                    bArr[i] = -33;
                    break;
                case 178:
                    bArr[i] = -31;
                    break;
                case 179:
                    bArr[i] = -30;
                    break;
                case 180:
                    bArr[i] = -29;
                    break;
                case 181:
                    bArr[i] = -72;
                    break;
                case 182:
                    bArr[i] = -26;
                    break;
                case 183:
                    bArr[i] = -25;
                    break;
                case 184:
                    bArr[i] = -24;
                    break;
                case 185:
                    bArr[i] = -23;
                    break;
                case 186:
                    bArr[i] = -22;
                    break;
                case 187:
                    bArr[i] = -21;
                    break;
                case 188:
                    bArr[i] = -20;
                    break;
                case 189:
                    bArr[i] = -19;
                    break;
                case 190:
                    bArr[i] = -17;
                    break;
                case 191:
                    bArr[i] = -14;
                    break;
                case 192:
                    bArr[i] = -9;
                    break;
                case 193:
                    bArr[i] = -8;
                    break;
                case 194:
                    bArr[i] = -6;
                    break;
                case 195:
                    bArr[i] = -5;
                    break;
                case 196:
                    bArr[i] = -4;
                    break;
                case 197:
                    bArr[i] = -3;
                    break;
                case 198:
                    bArr[i] = -2;
                    break;
                case 199:
                    bArr[i] = -1;
                    break;
                case 224:
                    bArr[i] = -60;
                    break;
                case 225:
                    bArr[i] = -42;
                    break;
                case 226:
                    bArr[i] = -39;
                    break;
                case 227:
                    bArr[i] = -28;
                    break;
                case 228:
                    bArr[i] = -12;
                    break;
                case 229:
                    bArr[i] = -10;
                    break;
                case 230:
                    bArr[i] = -7;
                    break;
            }
        }
        return b(bArr);
    }

    public byte[] a(String str) {
        byte[] b = b(str);
        for (int i = 0; i < b.length; i++) {
            switch ((short) (b[i] & 255)) {
                case 168:
                    b[i] = -94;
                    break;
                case 176:
                    b[i] = Byte.MIN_VALUE;
                    break;
                case 184:
                    b[i] = -75;
                    break;
                case 185:
                    b[i] = -127;
                    break;
                case 192:
                    b[i] = 65;
                    break;
                case 193:
                    b[i] = -96;
                    break;
                case 194:
                    b[i] = 66;
                    break;
                case 195:
                    b[i] = -95;
                    break;
                case 196:
                    b[i] = -32;
                    break;
                case 197:
                    b[i] = 69;
                    break;
                case 198:
                    b[i] = -93;
                    break;
                case 199:
                    b[i] = -92;
                    break;
                case 200:
                    b[i] = -91;
                    break;
                case 201:
                    b[i] = -90;
                    break;
                case 202:
                    b[i] = 75;
                    break;
                case 203:
                    b[i] = -89;
                    break;
                case 204:
                    b[i] = 77;
                    break;
                case 205:
                    b[i] = 72;
                    break;
                case 206:
                    b[i] = 79;
                    break;
                case 207:
                    b[i] = -88;
                    break;
                case 208:
                    b[i] = 80;
                    break;
                case 209:
                    b[i] = 67;
                    break;
                case 210:
                    b[i] = 84;
                    break;
                case 211:
                    b[i] = -87;
                    break;
                case 212:
                    b[i] = -86;
                    break;
                case 213:
                    b[i] = 88;
                    break;
                case 214:
                    b[i] = -31;
                    break;
                case 215:
                    b[i] = -85;
                    break;
                case 216:
                    b[i] = -84;
                    break;
                case 217:
                    b[i] = -30;
                    break;
                case 218:
                    b[i] = -83;
                    break;
                case 219:
                    b[i] = -82;
                    break;
                case 220:
                    b[i] = 98;
                    break;
                case 221:
                    b[i] = -81;
                    break;
                case 222:
                    b[i] = -80;
                    break;
                case 223:
                    b[i] = -79;
                    break;
                case 224:
                    b[i] = 97;
                    break;
                case 225:
                    b[i] = -78;
                    break;
                case 226:
                    b[i] = -77;
                    break;
                case 227:
                    b[i] = -76;
                    break;
                case 228:
                    b[i] = -29;
                    break;
                case 229:
                    b[i] = 101;
                    break;
                case 230:
                    b[i] = -74;
                    break;
                case 231:
                    b[i] = -73;
                    break;
                case 232:
                    b[i] = -72;
                    break;
                case 233:
                    b[i] = -71;
                    break;
                case 234:
                    b[i] = -70;
                    break;
                case 235:
                    b[i] = -69;
                    break;
                case 236:
                    b[i] = -68;
                    break;
                case 237:
                    b[i] = -67;
                    break;
                case 238:
                    b[i] = 111;
                    break;
                case 239:
                    b[i] = -66;
                    break;
                case 240:
                    b[i] = 112;
                    break;
                case 241:
                    b[i] = 99;
                    break;
                case 242:
                    b[i] = -65;
                    break;
                case 243:
                    b[i] = 121;
                    break;
                case 244:
                    b[i] = -28;
                    break;
                case 245:
                    b[i] = 120;
                    break;
                case 246:
                    b[i] = -27;
                    break;
                case 247:
                    b[i] = -64;
                    break;
                case 248:
                    b[i] = -63;
                    break;
                case 249:
                    b[i] = -26;
                    break;
                case 250:
                    b[i] = -62;
                    break;
                case 251:
                    b[i] = -61;
                    break;
                case 252:
                    b[i] = -60;
                    break;
                case 253:
                    b[i] = -59;
                    break;
                case 254:
                    b[i] = -58;
                    break;
                case 255:
                    b[i] = -57;
                    break;
            }
        }
        return b;
    }
}
