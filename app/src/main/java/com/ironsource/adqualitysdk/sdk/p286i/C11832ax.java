package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ax */
/* JADX INFO: loaded from: classes6.dex */
public final class C11832ax {

    /* JADX INFO: renamed from: ﮐ */
    private static boolean f27409 = true;

    /* JADX INFO: renamed from: ﱟ */
    private static boolean f27410 = true;

    /* JADX INFO: renamed from: ﱡ */
    private static int f27411 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static int f27412 = 1;

    /* JADX INFO: renamed from: ﻏ */
    private static int f27413 = 19;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f27414 = {137, 129, 133, 'x', 't', 134, 130, 139, 'v', 135, AbstractJsonLexerKt.UNICODE_ESC, Ascii.MAX, 138, 'V', 'W', '|', 'y', 'z', 'X', '3', AbstractJsonLexerKt.BEGIN_OBJ, 136, 'w'};

    /* JADX INFO: renamed from: ｋ */
    private static long f27415 = -2336866029017824931L;

    /* JADX INFO: renamed from: ﻐ */
    private String f27416;

    /* JADX INFO: renamed from: ﾇ */
    private e f27417;

    /* JADX INFO: renamed from: ﾒ */
    private List<String> f27418;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ax$e */
    enum e {
        f27427,
        f27424,
        f27425,
        f27423;


        /* JADX INFO: renamed from: ﱡ */
        private static int f27420 = 0;

        /* JADX INFO: renamed from: ﺙ */
        private static int f27421 = 1;

        /* JADX INFO: renamed from: ﻏ */
        private static int f27422;

        /* JADX INFO: renamed from: ﾇ */
        static void m28689() {
            f27422 = 40;
        }

        public static e valueOf(String str) {
            int i = 2 % 2;
            int i2 = f27421 + 89;
            f27420 = i2 % 128;
            int i3 = i2 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            int i4 = f27421 + 33;
            f27420 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return eVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f27420 + 37;
            f27421 = i2 % 128;
            int i3 = i2 % 2;
            e[] eVarArr = (e[]) values().clone();
            int i4 = f27421 + 89;
            f27420 = i4 % 128;
            if (i4 % 2 == 0) {
                return eVarArr;
            }
            throw null;
        }

        static {
            m28689();
            int i = f27421 + 57;
            f27420 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m28688(String str, int i, boolean z, int i2, int i3) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11889d.f28479) {
                char[] cArr2 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    C11889d.f28480 = cArr[C11889d.f28481];
                    cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                    int i4 = C11889d.f28481;
                    cArr2[i4] = (char) (cArr2[i4] - f27422);
                    C11889d.f28481++;
                }
                if (i2 > 0) {
                    C11889d.f28478 = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                    System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
                }
                if (z) {
                    char[] cArr4 = new char[i];
                    C11889d.f28481 = 0;
                    while (C11889d.f28481 < i) {
                        cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                        C11889d.f28481++;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    public C11832ax(JSONObject jSONObject) {
        this.f27417 = m28683(jSONObject.optString(m28684("ꌼꍈ༣ጜFงᇖд", TextUtils.getOffsetAfter("", 0) + 1).intern()));
        this.f27418 = m28685(jSONObject.optString(m28682(null, Color.green(0) + 127, null, "\u0082\u0081").intern()));
        this.f27416 = m28681(jSONObject.optString(m28682(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u0082\u0087\u0086\u0085\u0084\u0083").intern()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    /* JADX INFO: renamed from: ﾇ */
    private static e m28683(String str) {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        byte b = 0;
        if (iHashCode != 92611485) {
            if (iHashCode != 93621297) {
                if (iHashCode == 96946943 && str.equals(m28682(null, ExpandableListView.getPackedPositionChild(0L) + 128, null, "\u008a\u0089\u0085\u0088\u0084").intern())) {
                    int i2 = f27411 + 93;
                    f27412 = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    b = -1;
                }
            } else if (str.equals(m28682(null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, "\u008d\u0087\u008c\u0084\u008b").intern())) {
                int i4 = f27411 + 29;
                f27412 = i4 % 128;
                int i5 = i4 % 2;
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals(m28684("䤞䥿ꋰᬥ佤ꏏ᧰䬅䰏", 1 - TextUtils.getOffsetAfter("", 0)).intern())) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            return e.f27423;
        }
        if (b != 1) {
            return b != 2 ? e.f27427 : e.f27425;
        }
        return e.f27424;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static List<String> m28685(String str) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i2 = f27412 + 45;
        f27411 = i2 % 128;
        return i2 % 2 != 0 ? Arrays.asList(str.split(m28684("侲侞\uee89荾ﺗ", 1 >>> KeyEvent.getDeadChar(0, 1)).intern())) : Arrays.asList(str.split(m28684("侲侞\uee89荾ﺗ", 1 - KeyEvent.getDeadChar(0, 0)).intern()));
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m28681(String str) {
        int i = 2 % 2;
        int i2 = f27412 + 91;
        f27411 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i4 = f27412 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27411 = i4 % 128;
        if (i4 % 2 != 0) {
            if (str.equals(m28684("ퟟힱ⽤↥搻⹌⍳恀", Color.alpha(0)).intern())) {
                return null;
            }
        } else if (str.equals(m28684("ퟟힱ⽤↥搻⹌⍳恀", Color.alpha(0) + 1).intern())) {
            return null;
        }
        int i5 = f27412 + 13;
        f27411 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ax$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: ﾇ */
        static final /* synthetic */ int[] f27419;

        static {
            int[] iArr = new int[e.valuesCustom().length];
            f27419 = iArr;
            try {
                iArr[e.f27427.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27419[e.f27423.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27419[e.f27425.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27419[e.f27424.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.p286i.C12081kc.m30858(r6, r5.f27418.get(0)) < 0) goto L20;
     */
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m28686(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11832ax.f27411
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11832ax.f27412 = r2
            int r1 = r1 % r0
            r1 = 0
            int[] r2 = com.ironsource.adqualitysdk.sdk.p286i.C11832ax.AnonymousClass5.f27419     // Catch: java.lang.Exception -> L88
            com.ironsource.adqualitysdk.sdk.i.ax$e r3 = r5.f27417     // Catch: java.lang.Exception -> L88
            int r3 = r3.ordinal()     // Catch: java.lang.Exception -> L88
            r2 = r2[r3]     // Catch: java.lang.Exception -> L88
            r3 = 1
            if (r2 == r3) goto L87
            if (r2 == r0) goto L80
            r4 = 3
            if (r2 == r4) goto L24
            r4 = 4
            if (r2 == r4) goto L5f
            goto Laf
        L24:
            java.util.List<java.lang.String> r2 = r5.f27418     // Catch: java.lang.Exception -> L88
            int r2 = r2.size()     // Catch: java.lang.Exception -> L88
            if (r2 <= 0) goto L5f
            int r2 = com.ironsource.adqualitysdk.sdk.p286i.C11832ax.f27412
            int r2 = r2 + 109
            int r4 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11832ax.f27411 = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L46
            java.util.List<java.lang.String> r2 = r5.f27418     // Catch: java.lang.Exception -> L88
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L88
            int r6 = com.ironsource.adqualitysdk.sdk.p286i.C12081kc.m30858(r6, r2)     // Catch: java.lang.Exception -> L88
            if (r6 >= 0) goto L55
            goto L54
        L46:
            java.util.List<java.lang.String> r2 = r5.f27418     // Catch: java.lang.Exception -> L88
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L88
            int r6 = com.ironsource.adqualitysdk.sdk.p286i.C12081kc.m30858(r6, r2)     // Catch: java.lang.Exception -> L88
            if (r6 >= 0) goto L55
        L54:
            return r3
        L55:
            int r6 = com.ironsource.adqualitysdk.sdk.p286i.C11832ax.f27411
            int r6 = r6 + 91
            int r2 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11832ax.f27412 = r2
            int r6 = r6 % r0
            return r1
        L5f:
            java.util.List<java.lang.String> r2 = r5.f27418     // Catch: java.lang.Exception -> L88
            int r2 = r2.size()     // Catch: java.lang.Exception -> L88
            if (r2 <= 0) goto Laf
            java.util.List<java.lang.String> r2 = r5.f27418     // Catch: java.lang.Exception -> L88
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L88
            int r6 = com.ironsource.adqualitysdk.sdk.p286i.C12081kc.m30858(r6, r2)     // Catch: java.lang.Exception -> L88
            if (r6 < 0) goto L76
            return r3
        L76:
            int r6 = com.ironsource.adqualitysdk.sdk.p286i.C11832ax.f27412
            int r6 = r6 + 49
            int r2 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11832ax.f27411 = r2
            int r6 = r6 % r0
            return r1
        L80:
            java.util.List<java.lang.String> r0 = r5.f27418     // Catch: java.lang.Exception -> L88
            boolean r6 = r0.contains(r6)     // Catch: java.lang.Exception -> L88
            return r6
        L87:
            return r3
        L88:
            r6 = move-exception
            int r0 = android.graphics.Color.alpha(r1)
            int r0 = r0 + 127
            java.lang.String r2 = "\u0092\u0090\u0091\u0082\u0087\u008e\u0084\u008c\u008b\u0085\u0086\u0090\u008f\u0083\u0087\u008a\u0089\u0084\u0082\u0082\u0087\u008e"
            r3 = 0
            java.lang.String r0 = m28682(r3, r0, r3, r2)
            java.lang.String r0 = r0.intern()
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r2 = r2 >> 16
            int r2 = 127 - r2
            java.lang.String r4 = "\u0084\u008c\u008b\u0085\u0086\u0090\u008f\u0097\u008c\u0096\u0087\u0095\u0086\u0094\u0082\u0090\u0094\u0083\u0087\u0083\u0083\u0093"
            java.lang.String r2 = m28682(r3, r2, r3, r4)
            java.lang.String r2 = r2.intern()
            com.ironsource.adqualitysdk.sdk.p286i.C12080kb.m30845(r0, r2, r6, r1)
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11832ax.m28686(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m28687() {
        int i = 2 % 2;
        int i2 = f27411;
        int i3 = i2 + 111;
        f27412 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f27416;
        int i4 = i2 + 9;
        f27412 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28684(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f27415, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f27415));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28682(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f27414;
            int i2 = f27413;
            if (f27410) {
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
            if (f27409) {
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
