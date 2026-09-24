package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dl */
/* JADX INFO: loaded from: classes6.dex */
public final class C11901dl {

    /* JADX INFO: renamed from: ﮌ */
    private static int f28600 = 1;

    /* JADX INFO: renamed from: ﮐ */
    private static char[] f28601 = {'s', AbstractJsonLexerKt.UNICODE_ESC, 'p', 'e', 'r', 'a', 'b', 't', 'c', 'm', 'v', 'n', 'h', 'o', 'd', 'w'};

    /* JADX INFO: renamed from: ﺙ */
    private static int f28602 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static char f28603 = 4;

    /* JADX INFO: renamed from: ﱟ */
    private Map<String, C11902dm> f28604;

    /* JADX INFO: renamed from: ﱡ */
    private Map<String, C11906dq> f28605;

    /* JADX INFO: renamed from: ﻐ */
    private String f28606;

    /* JADX INFO: renamed from: ﻛ */
    private List<String> f28607;

    /* JADX INFO: renamed from: ｋ */
    private boolean f28608;

    /* JADX INFO: renamed from: ﾇ */
    private String f28609;

    /* JADX INFO: renamed from: ﾒ */
    private List<C11905dp> f28610;

    public C11901dl(final String str, String str2, JSONObject jSONObject) {
        this.f28606 = C11914dy.m30142(str2);
        this.f28609 = C11914dy.m30142(jSONObject.optString(m30017("\u0001\u0002\u0003\u0000v", 6 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3)).intern()));
        this.f28608 = jSONObject.optBoolean(m30017("\u0006\u0007\u0003\u0004\u0005\u0006\u000b\u0004", 8 - View.MeasureSpec.getMode(0), (byte) (89 - ExpandableListView.getPackedPositionGroup(0L))).intern());
        this.f28607 = m30016(C12077jz.m30805(jSONObject.optJSONArray(m30017("\u000b\u0001\n\u0005\u0000\u0007£", 6 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (48 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern()), new C12077jz.a<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.a
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo28537(JSONArray jSONArray, int i) {
                return C11914dy.m30142(jSONArray.optString(i));
            }
        }));
        this.f28610 = m30016(C12077jz.m30805(jSONObject.optJSONArray(m30017("\u0001\u0000\u0005\u0003¶", 5 - TextUtils.indexOf("", ""), (byte) (View.MeasureSpec.getSize(0) + 70)).intern()), new C12077jz.a<C11905dp>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.a
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ C11905dp mo28537(JSONArray jSONArray, int i) {
                return new C11905dp(jSONArray.optJSONObject(i));
            }
        }));
        this.f28604 = m30018(C12077jz.m30810(jSONObject.optJSONObject(m30017("\u0002\u000b\u0007\u000f\u0004\u0003", Color.red(0) + 6, (byte) (56 - (Process.myTid() >> 22))).intern()), new C12077jz.c<C11902dm>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.c
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ C11902dm mo28541(JSONObject jSONObject2, String str3) {
                return new C11902dm(jSONObject2.optJSONObject(str3));
            }
        }));
        this.f28605 = m30018(C12077jz.m30810(jSONObject.optJSONObject(m30017("\u000b\u0001\u0004\u000f\u000e\u000fá", TextUtils.lastIndexOf("", '0', 0, 0) + 8, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 110)).intern()), new C12077jz.c<C11906dq>() { // from class: com.ironsource.adqualitysdk.sdk.i.dl.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.c
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ C11906dq mo28541(JSONObject jSONObject2, String str3) {
                return new C11906dq(str, str3, jSONObject2.optJSONObject(str3));
            }
        }));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 71;
        com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28602 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> java.util.List<T> m30016(java.util.List<T> r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28600
            int r2 = r1 + 67
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28602 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L15
            r2 = 83
            int r2 = r2 / 0
            if (r4 == 0) goto L1f
            goto L17
        L15:
            if (r4 == 0) goto L1f
        L17:
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28602 = r2
            int r1 = r1 % r0
            return r4
        L1f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11901dl.m30016(java.util.List):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r0 = 66 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r4 = new java.util.HashMap();
        r1 = com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28602 + 75;
        com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28600 = r1 % 128;
     */
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <K, V> java.util.Map<K, V> m30018(java.util.Map<K, V> r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28602
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28600 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L14
            int r1 = r2 / r2
            if (r4 == 0) goto L17
            goto L16
        L14:
            if (r4 == 0) goto L17
        L16:
            return r4
        L17:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28602
            int r1 = r1 + 75
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11901dl.f28600 = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L2a
            r0 = 66
            int r0 = r0 / r2
        L2a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11901dl.m30018(java.util.Map):java.util.Map");
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m30024() {
        int i = 2 % 2;
        int i2 = f28602 + 79;
        int i3 = i2 % 128;
        f28600 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f28606;
        int i4 = i3 + 25;
        f28602 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m30021() {
        int i = 2 % 2;
        int i2 = f28600 + 105;
        f28602 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28609;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final boolean m30023() {
        int i = 2 % 2;
        int i2 = f28600 + 101;
        int i3 = i2 % 128;
        f28602 = i3;
        int i4 = i2 % 2;
        boolean z = this.f28608;
        int i5 = i3 + 69;
        f28600 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final List<String> m30022() {
        List<String> list;
        int i = 2 % 2;
        int i2 = f28602;
        int i3 = i2 + 17;
        f28600 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.f28607;
            int i4 = 53 / 0;
        } else {
            list = this.f28607;
        }
        int i5 = i2 + 7;
        f28600 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final Map<String, C11906dq> m30025() {
        int i = 2 % 2;
        int i2 = f28600 + 115;
        f28602 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28605;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final List<C11905dp> m30019() {
        int i = 2 % 2;
        int i2 = f28600 + 45;
        f28602 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f28610;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final Map<String, C11902dm> m30020() {
        int i = 2 % 2;
        int i2 = f28602 + 47;
        f28600 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f28604;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30017(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f28601;
            char c = f28603;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                C11970g.f28962 = 0;
                while (C11970g.f28962 < i) {
                    C11970g.f28964 = cArr[C11970g.f28962];
                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                    if (C11970g.f28964 == C11970g.f28965) {
                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                    } else {
                        C11970g.f28963 = C11970g.f28964 / c;
                        C11970g.f28959 = C11970g.f28964 % c;
                        C11970g.f28966 = C11970g.f28965 / c;
                        C11970g.f28960 = C11970g.f28965 % c;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                            int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                            int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                            cArr3[C11970g.f28962] = cArr2[i6];
                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                        }
                    }
                    C11970g.f28962 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
