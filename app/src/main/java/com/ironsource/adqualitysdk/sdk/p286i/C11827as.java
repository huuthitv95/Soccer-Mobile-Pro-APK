package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.drawable.Drawable;
import com.google.android.exoplayer2.C9415C;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.as */
/* JADX INFO: loaded from: classes6.dex */
public final class C11827as {

    /* JADX INFO: renamed from: ﭖ */
    private static int f27246 = 1;

    /* JADX INFO: renamed from: ﭴ */
    private static boolean f27247 = true;

    /* JADX INFO: renamed from: ﭸ */
    private static boolean f27248 = true;

    /* JADX INFO: renamed from: ﮉ */
    private static int f27249 = 0;

    /* JADX INFO: renamed from: ﮐ */
    private static int f27250 = 115;

    /* JADX INFO: renamed from: ﺙ */
    private static char[] f27251 = {193, 194, 199, 210, 198, 184};

    /* JADX INFO: renamed from: ﱟ */
    private ISAdQualityDeviceIdType f27252;

    /* JADX INFO: renamed from: ｋ */
    private String f27257 = "";

    /* JADX INFO: renamed from: ﾇ */
    private String f27258 = m28563(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern();

    /* JADX INFO: renamed from: ﻐ */
    private boolean f27255 = true;

    /* JADX INFO: renamed from: ﾒ */
    private String f27259 = "";

    /* JADX INFO: renamed from: ﻛ */
    private boolean f27256 = false;

    /* JADX INFO: renamed from: ﱡ */
    private Map<String, String> f27253 = new HashMap();

    /* JADX INFO: renamed from: ﻏ */
    private boolean f27254 = false;

    /* JADX INFO: renamed from: ﾒ */
    public final String m28578() {
        int i = 2 % 2;
        int i2 = f27249 + 63;
        f27246 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f27257;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m28570(String str) {
        int i = 2 % 2;
        int i2 = f27249;
        int i3 = i2 + 99;
        f27246 = i3 % 128;
        int i4 = i3 % 2;
        this.f27257 = str;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 107;
        f27246 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final synchronized String m28576() {
        String str;
        int i = 2 % 2;
        int i2 = f27246;
        int i3 = i2 + 101;
        f27249 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        str = this.f27258;
        int i4 = i2 + 81;
        f27249 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    public final synchronized void m28572(String str) {
        int i = 2 % 2;
        int i2 = f27249;
        int i3 = i2 + 91;
        f27246 = i3 % 128;
        int i4 = i3 % 2;
        this.f27258 = str;
        int i5 = i2 + 31;
        f27246 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final boolean m28568() {
        int i = 2 % 2;
        int i2 = f27249 + 43;
        f27246 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.f27255;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m28579(boolean z) {
        int i = 2 % 2;
        int i2 = f27246 + 91;
        f27249 = i2 % 128;
        int i3 = i2 % 2;
        this.f27255 = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final String m28569() {
        int i = 2 % 2;
        int i2 = f27249;
        int i3 = i2 + 29;
        f27246 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f27259;
        int i5 = i2 + 57;
        f27246 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m28577(String str) {
        int i = 2 % 2;
        int i2 = f27249;
        int i3 = i2 + 83;
        f27246 = i3 % 128;
        int i4 = i3 % 2;
        this.f27259 = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27246 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    public final boolean m28575() {
        boolean z;
        int i = 2 % 2;
        int i2 = f27246 + 1;
        int i3 = i2 % 128;
        f27249 = i3;
        if (i2 % 2 != 0) {
            z = this.f27256;
            int i4 = 62 / 0;
        } else {
            z = this.f27256;
        }
        int i5 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27246 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28574(boolean z) {
        int i = 2 % 2;
        int i2 = f27249 + 5;
        f27246 = i2 % 128;
        int i3 = i2 % 2;
        this.f27256 = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ */
    public final ISAdQualityDeviceIdType m28565() {
        int i = 2 % 2;
        int i2 = f27246 + 67;
        int i3 = i2 % 128;
        f27249 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = this.f27252;
        int i4 = i3 + 31;
        f27246 = i4 % 128;
        int i5 = i4 % 2;
        return iSAdQualityDeviceIdType;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28571(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i = 2 % 2;
        int i2 = f27249 + 15;
        int i3 = i2 % 128;
        f27246 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.f27252 = iSAdQualityDeviceIdType;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 7;
        f27249 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final Map<String, String> m28566() {
        Map<String, String> map;
        int i = 2 % 2;
        int i2 = f27246;
        int i3 = i2 + 35;
        f27249 = i3 % 128;
        if (i3 % 2 != 0) {
            map = this.f27253;
            int i4 = 16 / 0;
        } else {
            map = this.f27253;
        }
        int i5 = i2 + 17;
        f27249 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28573(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = f27246 + 107;
        int i3 = i2 % 128;
        f27249 = i3;
        int i4 = i2 % 2;
        this.f27253 = map;
        if (i4 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i3 + 49;
        f27246 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final boolean m28564() {
        int i = 2 % 2;
        int i2 = f27249;
        int i3 = i2 + 55;
        f27246 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f27254;
        int i5 = i2 + 69;
        f27246 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻏ */
    public final void m28567() {
        int i = 2 % 2;
        int i2 = f27246 + 57;
        int i3 = i2 % 128;
        f27249 = i3;
        this.f27254 = i2 % 2 == 0;
        int i4 = i3 + 61;
        f27246 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28563(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f27251;
            int i2 = f27250;
            if (f27248) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f27247) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
