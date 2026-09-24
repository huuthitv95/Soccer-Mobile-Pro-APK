package com.ironsource;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.Eb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11419Eb {

    /* JADX INFO: renamed from: d */
    private static final byte[] f24267d = {-128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    private a f24268a;

    /* JADX INFO: renamed from: b */
    private a f24269b;

    /* JADX INFO: renamed from: c */
    private int[] f24270c = new int[16];

    C11419Eb() {
        this.f24268a = new a();
        this.f24269b = new a();
        m25725c();
    }

    /* JADX INFO: renamed from: a */
    private static int m25706a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & i2) | (i4 & (~i2))) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* JADX INFO: renamed from: b */
    private static int m25714b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & (~i4)) | (i2 & i4)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* JADX INFO: renamed from: c */
    private static int m25715c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 ^ i2) ^ i4) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* JADX INFO: renamed from: d */
    private static int m25716d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + (i3 ^ ((~i4) | i2)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m25720a() {
        a aVar = this.f24269b;
        if (!aVar.f24271a) {
            aVar.m25727a(this.f24268a);
            a aVar2 = this.f24269b;
            long j = aVar2.f24273c;
            int i = (int) ((j >>> 3) & 63);
            m25709a(aVar2, f24267d, 0, i < 56 ? 56 - i : 120 - i);
            m25709a(this.f24269b, m25711a(j), 0, 8);
            this.f24269b.f24271a = true;
        }
        return m25712a(this.f24269b.f24272b, 16);
    }

    /* JADX INFO: renamed from: b */
    public String m25721b() {
        return m25708a(m25720a());
    }

    /* JADX INFO: renamed from: c */
    public void m25725c() {
        this.f24268a.m25726a();
        this.f24269b.f24271a = false;
    }

    public String toString() {
        return m25721b();
    }

    /* JADX INFO: renamed from: b */
    public void m25724b(byte[] bArr, int i, int i2) {
        m25709a(this.f24268a, bArr, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void m25723b(byte[] bArr) {
        m25724b(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: b */
    public void m25722b(String str) {
        m25723b(str.getBytes());
    }

    /* JADX INFO: renamed from: com.ironsource.Eb$a */
    private class a {

        /* JADX INFO: renamed from: a */
        private boolean f24271a;

        /* JADX INFO: renamed from: b */
        private int[] f24272b;

        /* JADX INFO: renamed from: c */
        private long f24273c;

        /* JADX INFO: renamed from: d */
        private byte[] f24274d;

        private a() {
            this.f24271a = true;
            this.f24272b = new int[4];
            this.f24274d = new byte[64];
            m25726a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m25726a() {
            int[] iArr = this.f24272b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f24273c = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m25727a(a aVar) {
            byte[] bArr = aVar.f24274d;
            byte[] bArr2 = this.f24274d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = aVar.f24272b;
            int[] iArr2 = this.f24272b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            this.f24271a = aVar.f24271a;
            this.f24273c = aVar.f24273c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m25707a(String str) {
        C11419Eb c11419Eb = new C11419Eb();
        c11419Eb.m25722b(str);
        return c11419Eb.m25721b();
    }

    /* JADX INFO: renamed from: a */
    private void m25709a(a aVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        this.f24269b.f24271a = false;
        if (i2 + i > bArr.length) {
            i2 = bArr.length - i;
        }
        long j = aVar.f24273c;
        int i4 = ((int) (j >>> 3)) & 63;
        aVar.f24273c = j + ((long) (i2 << 3));
        int i5 = 64 - i4;
        if (i2 >= i5) {
            System.arraycopy(bArr, i, aVar.f24274d, i4, i5);
            m25710a(aVar, m25713a(aVar.f24274d, 64, 0));
            while (i5 + 63 < i2) {
                m25710a(aVar, m25713a(bArr, 64, i5));
                i5 += 64;
            }
            i4 = 0;
            i3 = i5;
        }
        if (i3 < i2) {
            for (int i6 = i3; i6 < i2; i6++) {
                aVar.f24274d[(i4 + i6) - i3] = bArr[i6 + i];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25719a(byte[] bArr, int i) {
        m25724b(bArr, 0, i);
    }

    /* JADX INFO: renamed from: a */
    public void m25717a(byte b) {
        m25719a(new byte[]{b}, 1);
    }

    /* JADX INFO: renamed from: a */
    public void m25718a(String str, String str2) throws UnsupportedEncodingException {
        m25723b(str.getBytes(str2));
    }

    /* JADX INFO: renamed from: a */
    private static String m25708a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m25711a(long j) {
        return new byte[]{(byte) (j & 255), (byte) ((j >>> 8) & 255), (byte) ((j >>> 16) & 255), (byte) ((j >>> 24) & 255), (byte) ((j >>> 32) & 255), (byte) ((j >>> 40) & 255), (byte) ((j >>> 48) & 255), (byte) ((j >>> 56) & 255)};
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m25712a(int[] iArr, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 4) {
            int i4 = iArr[i2];
            bArr[i3] = (byte) (i4 & 255);
            bArr[i3 + 1] = (byte) ((i4 >>> 8) & 255);
            bArr[i3 + 2] = (byte) ((i4 >>> 16) & 255);
            bArr[i3 + 3] = (byte) ((i4 >>> 24) & 255);
            i2++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    private int[] m25713a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4 += 4) {
            this.f24270c[i3] = (bArr[i4 + i2] & 255) | ((bArr[(i4 + 1) + i2] & 255) << 8) | ((bArr[(i4 + 2) + i2] & 255) << 16) | ((bArr[(i4 + 3) + i2] & 255) << 24);
            i3++;
        }
        return this.f24270c;
    }

    /* JADX INFO: renamed from: a */
    private static void m25710a(a aVar, int[] iArr) {
        int[] iArr2 = aVar.f24272b;
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int iM25706a = m25706a(i, i2, i3, i4, iArr[0], 7, -680876936);
        int iM25706a2 = m25706a(i4, iM25706a, i2, i3, iArr[1], 12, -389564586);
        int iM25706a3 = m25706a(i3, iM25706a2, iM25706a, i2, iArr[2], 17, 606105819);
        int iM25706a4 = m25706a(i2, iM25706a3, iM25706a2, iM25706a, iArr[3], 22, -1044525330);
        int iM25706a5 = m25706a(iM25706a, iM25706a4, iM25706a3, iM25706a2, iArr[4], 7, -176418897);
        int iM25706a6 = m25706a(iM25706a2, iM25706a5, iM25706a4, iM25706a3, iArr[5], 12, 1200080426);
        int iM25706a7 = m25706a(iM25706a3, iM25706a6, iM25706a5, iM25706a4, iArr[6], 17, -1473231341);
        int iM25706a8 = m25706a(iM25706a4, iM25706a7, iM25706a6, iM25706a5, iArr[7], 22, -45705983);
        int iM25706a9 = m25706a(iM25706a5, iM25706a8, iM25706a7, iM25706a6, iArr[8], 7, 1770035416);
        int iM25706a10 = m25706a(iM25706a6, iM25706a9, iM25706a8, iM25706a7, iArr[9], 12, -1958414417);
        int iM25706a11 = m25706a(iM25706a7, iM25706a10, iM25706a9, iM25706a8, iArr[10], 17, -42063);
        int iM25706a12 = m25706a(iM25706a8, iM25706a11, iM25706a10, iM25706a9, iArr[11], 22, -1990404162);
        int iM25706a13 = m25706a(iM25706a9, iM25706a12, iM25706a11, iM25706a10, iArr[12], 7, 1804603682);
        int iM25706a14 = m25706a(iM25706a10, iM25706a13, iM25706a12, iM25706a11, iArr[13], 12, -40341101);
        int iM25706a15 = m25706a(iM25706a11, iM25706a14, iM25706a13, iM25706a12, iArr[14], 17, -1502002290);
        int iM25706a16 = m25706a(iM25706a12, iM25706a15, iM25706a14, iM25706a13, iArr[15], 22, 1236535329);
        int iM25714b = m25714b(iM25706a13, iM25706a16, iM25706a15, iM25706a14, iArr[1], 5, -165796510);
        int iM25714b2 = m25714b(iM25706a14, iM25714b, iM25706a16, iM25706a15, iArr[6], 9, -1069501632);
        int iM25714b3 = m25714b(iM25706a15, iM25714b2, iM25714b, iM25706a16, iArr[11], 14, 643717713);
        int iM25714b4 = m25714b(iM25706a16, iM25714b3, iM25714b2, iM25714b, iArr[0], 20, -373897302);
        int iM25714b5 = m25714b(iM25714b, iM25714b4, iM25714b3, iM25714b2, iArr[5], 5, -701558691);
        int iM25714b6 = m25714b(iM25714b2, iM25714b5, iM25714b4, iM25714b3, iArr[10], 9, 38016083);
        int iM25714b7 = m25714b(iM25714b3, iM25714b6, iM25714b5, iM25714b4, iArr[15], 14, -660478335);
        int iM25714b8 = m25714b(iM25714b4, iM25714b7, iM25714b6, iM25714b5, iArr[4], 20, -405537848);
        int iM25714b9 = m25714b(iM25714b5, iM25714b8, iM25714b7, iM25714b6, iArr[9], 5, 568446438);
        int iM25714b10 = m25714b(iM25714b6, iM25714b9, iM25714b8, iM25714b7, iArr[14], 9, -1019803690);
        int iM25714b11 = m25714b(iM25714b7, iM25714b10, iM25714b9, iM25714b8, iArr[3], 14, -187363961);
        int iM25714b12 = m25714b(iM25714b8, iM25714b11, iM25714b10, iM25714b9, iArr[8], 20, 1163531501);
        int iM25714b13 = m25714b(iM25714b9, iM25714b12, iM25714b11, iM25714b10, iArr[13], 5, -1444681467);
        int iM25714b14 = m25714b(iM25714b10, iM25714b13, iM25714b12, iM25714b11, iArr[2], 9, -51403784);
        int iM25714b15 = m25714b(iM25714b11, iM25714b14, iM25714b13, iM25714b12, iArr[7], 14, 1735328473);
        int iM25714b16 = m25714b(iM25714b12, iM25714b15, iM25714b14, iM25714b13, iArr[12], 20, -1926607734);
        int iM25715c = m25715c(iM25714b13, iM25714b16, iM25714b15, iM25714b14, iArr[5], 4, -378558);
        int iM25715c2 = m25715c(iM25714b14, iM25715c, iM25714b16, iM25714b15, iArr[8], 11, -2022574463);
        int iM25715c3 = m25715c(iM25714b15, iM25715c2, iM25715c, iM25714b16, iArr[11], 16, 1839030562);
        int iM25715c4 = m25715c(iM25714b16, iM25715c3, iM25715c2, iM25715c, iArr[14], 23, -35309556);
        int iM25715c5 = m25715c(iM25715c, iM25715c4, iM25715c3, iM25715c2, iArr[1], 4, -1530992060);
        int iM25715c6 = m25715c(iM25715c2, iM25715c5, iM25715c4, iM25715c3, iArr[4], 11, 1272893353);
        int iM25715c7 = m25715c(iM25715c3, iM25715c6, iM25715c5, iM25715c4, iArr[7], 16, -155497632);
        int iM25715c8 = m25715c(iM25715c4, iM25715c7, iM25715c6, iM25715c5, iArr[10], 23, -1094730640);
        int iM25715c9 = m25715c(iM25715c5, iM25715c8, iM25715c7, iM25715c6, iArr[13], 4, 681279174);
        int iM25715c10 = m25715c(iM25715c6, iM25715c9, iM25715c8, iM25715c7, iArr[0], 11, -358537222);
        int iM25715c11 = m25715c(iM25715c7, iM25715c10, iM25715c9, iM25715c8, iArr[3], 16, -722521979);
        int iM25715c12 = m25715c(iM25715c8, iM25715c11, iM25715c10, iM25715c9, iArr[6], 23, 76029189);
        int iM25715c13 = m25715c(iM25715c9, iM25715c12, iM25715c11, iM25715c10, iArr[9], 4, -640364487);
        int iM25715c14 = m25715c(iM25715c10, iM25715c13, iM25715c12, iM25715c11, iArr[12], 11, -421815835);
        int iM25715c15 = m25715c(iM25715c11, iM25715c14, iM25715c13, iM25715c12, iArr[15], 16, 530742520);
        int iM25715c16 = m25715c(iM25715c12, iM25715c15, iM25715c14, iM25715c13, iArr[2], 23, -995338651);
        int iM25716d = m25716d(iM25715c13, iM25715c16, iM25715c15, iM25715c14, iArr[0], 6, -198630844);
        int iM25716d2 = m25716d(iM25715c14, iM25716d, iM25715c16, iM25715c15, iArr[7], 10, 1126891415);
        int iM25716d3 = m25716d(iM25715c15, iM25716d2, iM25716d, iM25715c16, iArr[14], 15, -1416354905);
        int iM25716d4 = m25716d(iM25715c16, iM25716d3, iM25716d2, iM25716d, iArr[5], 21, -57434055);
        int iM25716d5 = m25716d(iM25716d, iM25716d4, iM25716d3, iM25716d2, iArr[12], 6, 1700485571);
        int iM25716d6 = m25716d(iM25716d2, iM25716d5, iM25716d4, iM25716d3, iArr[3], 10, -1894986606);
        int iM25716d7 = m25716d(iM25716d3, iM25716d6, iM25716d5, iM25716d4, iArr[10], 15, -1051523);
        int iM25716d8 = m25716d(iM25716d4, iM25716d7, iM25716d6, iM25716d5, iArr[1], 21, -2054922799);
        int iM25716d9 = m25716d(iM25716d5, iM25716d8, iM25716d7, iM25716d6, iArr[8], 6, 1873313359);
        int iM25716d10 = m25716d(iM25716d6, iM25716d9, iM25716d8, iM25716d7, iArr[15], 10, -30611744);
        int iM25716d11 = m25716d(iM25716d7, iM25716d10, iM25716d9, iM25716d8, iArr[6], 15, -1560198380);
        int iM25716d12 = m25716d(iM25716d8, iM25716d11, iM25716d10, iM25716d9, iArr[13], 21, 1309151649);
        int iM25716d13 = m25716d(iM25716d9, iM25716d12, iM25716d11, iM25716d10, iArr[4], 6, -145523070);
        int iM25716d14 = m25716d(iM25716d10, iM25716d13, iM25716d12, iM25716d11, iArr[11], 10, -1120210379);
        int iM25716d15 = m25716d(iM25716d11, iM25716d14, iM25716d13, iM25716d12, iArr[2], 15, 718787259);
        int iM25716d16 = m25716d(iM25716d12, iM25716d15, iM25716d14, iM25716d13, iArr[9], 21, -343485551);
        int[] iArr3 = aVar.f24272b;
        iArr3[0] = iArr3[0] + iM25716d13;
        iArr3[1] = iArr3[1] + iM25716d16;
        iArr3[2] = iArr3[2] + iM25716d15;
        iArr3[3] = iArr3[3] + iM25716d14;
    }
}
