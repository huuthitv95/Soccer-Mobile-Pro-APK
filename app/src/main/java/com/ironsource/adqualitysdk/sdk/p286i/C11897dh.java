package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dh */
/* JADX INFO: loaded from: classes6.dex */
public final class C11897dh {

    /* JADX INFO: renamed from: טּ */
    private static int f28530 = 0;

    /* JADX INFO: renamed from: ףּ */
    private static int f28532 = 1;

    /* JADX INFO: renamed from: ﭴ */
    private static char f28533 = 6;

    /* JADX INFO: renamed from: ﭖ */
    private Map<String, C11901dl> f28537;

    /* JADX INFO: renamed from: ﮐ */
    private String f28538;

    /* JADX INFO: renamed from: ﱟ */
    private String f28539;

    /* JADX INFO: renamed from: ﱡ */
    private C11903dn f28540;

    /* JADX INFO: renamed from: ﺙ */
    private String f28541;

    /* JADX INFO: renamed from: ﻏ */
    private C11907dr f28542;

    /* JADX INFO: renamed from: ﻐ */
    private String f28543;

    /* JADX INFO: renamed from: ﻛ */
    private String f28544;

    /* JADX INFO: renamed from: ｋ */
    private String f28545;

    /* JADX INFO: renamed from: ﾇ */
    private JSONObject f28546;

    /* JADX INFO: renamed from: ﾒ */
    private C11907dr f28547;

    /* JADX INFO: renamed from: ﮉ */
    private static char[] f28535 = {'n', 'a', 'm', 'e', 'd', 'i', 's', 'p', 'l', 'y', 'N', 'v', 'r', 'o', 'S', 'k', 'g', 'b', 'C', 't', 'E', ' ', 'c', 'f', 'w', 'V', 'J', 'T', 'A', 'q', AbstractJsonLexerKt.UNICODE_ESC, 'x', 'z', AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ};

    /* JADX INFO: renamed from: ﭸ */
    private static long f28534 = 0;

    /* JADX INFO: renamed from: ﮌ */
    private static int f28536 = 0;

    /* JADX INFO: renamed from: סּ */
    private static char f28531 = 26200;

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ String m29938(C11897dh c11897dh) {
        int i = 2 % 2;
        int i2 = f28532 + 37;
        int i3 = i2 % 128;
        f28530 = i3;
        int i4 = i2 % 2;
        String str = c11897dh.f28544;
        if (i4 != 0) {
            int i5 = 40 / 0;
        }
        int i6 = i3 + 61;
        f28532 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 80 / 0;
        }
        return str;
    }

    public C11897dh(String str, C11907dr c11907dr) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f28546 = jSONObject;
            this.f28547 = c11907dr;
            this.f28544 = jSONObject.optString(m29937("\u0001\u0002\u0003\u0004", TextUtils.lastIndexOf("", '0', 0, 0) + 5, (byte) (164 - AndroidCharacter.getMirror('0'))).intern());
            this.f28545 = this.f28546.optString(m29937("\u0005\u0000\u0007\b\u0007\u0002\n\u000b\u0002\u0003s", View.MeasureSpec.getSize(0) + 11, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 15)).intern());
            this.f28543 = this.f28546.optString(m29937("\t\u0005\u0012\f\u0001\u0011ª", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, (byte) (60 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern());
            this.f28541 = this.f28546.optString(m29937("\u0003\u0000\u0002\f\u0003\u0010", 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((Process.myPid() >> 22) + 68)).intern());
            this.f28538 = this.f28546.optString(m29935("钇러䥴侵擋㑐", (char) (28458 - TextUtils.lastIndexOf("", '0', 0)), "\u0000\u0000\u0000\u0000", ViewConfiguration.getEdgeSlop() >> 16, "ⲫ⻃⮯륯").intern());
            if (this.f28546.has(m29937("\u000e\n\u000e\f\u0002\u0007\u0013\f\u0006\f\u0012\u0007", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, (byte) (109 - Color.green(0))).intern())) {
                m29936(this.f28546.optJSONObject(m29937("\u000e\n\u000e\f\u0002\u0007\u0013\f\u0006\f\u0012\u0007", 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 109)).intern()));
            }
        } catch (Throwable th) {
            C11875cm.m29607(this.f28544, m29937("\u0012\u000e\r\u000e\u000f\u0012\u0012\u0010\u0004\u0002\u0017\u0001\u0004\f\u0016\u0017\f\u0001\u0001\u0004\u0017\u0014\u000e\r\u0016\u0017\f\u0001\u001d\u000bÕ", ((byte) KeyEvent.getModifierMetaStateMask()) + 32, (byte) (TextUtils.indexOf("", "", 0, 0) + 110)).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m29936(JSONObject jSONObject) {
        Iterator<String> itKeys;
        int i = 2 % 2;
        int i2 = f28532 + 75;
        f28530 = i2 % 128;
        if (i2 % 2 != 0) {
            itKeys = jSONObject.keys();
            int i3 = 97 / 0;
        } else {
            itKeys = jSONObject.keys();
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f28547.m30053(next, jSONObject.opt(next));
            int i4 = f28532 + 7;
            f28530 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final String m29944() {
        int i = 2 % 2;
        int i2 = f28532;
        int i3 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28530 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f28544;
        int i5 = i2 + 89;
        f28530 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m29945() {
        String str;
        int i = 2 % 2;
        int i2 = f28532 + 77;
        int i3 = i2 % 128;
        f28530 = i3;
        if (i2 % 2 != 0) {
            str = this.f28545;
            int i4 = 0 / 0;
        } else {
            str = this.f28545;
        }
        int i5 = i3 + 35;
        f28532 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final String m29943() {
        int i = 2 % 2;
        int i2 = f28532 + 53;
        int i3 = i2 % 128;
        f28530 = i3;
        int i4 = i2 % 2;
        String str = this.f28543;
        int i5 = i3 + 101;
        f28532 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m29942() {
        int i = 2 % 2;
        int i2 = f28530;
        int i3 = i2 + 111;
        f28532 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f28541;
        int i4 = i2 + 79;
        f28532 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final String m29946() {
        int i = 2 % 2;
        int i2 = f28530 + 21;
        int i3 = i2 % 128;
        f28532 = i3;
        int i4 = i2 % 2;
        String str = this.f28538;
        int i5 = i3 + 29;
        f28530 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final C11907dr m29940() {
        int i = 2 % 2;
        int i2 = f28530 + 71;
        f28532 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f28542 == null) {
            C11907dr c11907dr = new C11907dr(C12077jz.m30810(this.f28546.optJSONObject(m29937("\u0013\u0010\u0006\f\u0012\u0007", 6 - Color.blue(0), (byte) (95 - (ViewConfiguration.getScrollBarSize() >> 8))).intern()), new C12077jz.c<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.3

                /* JADX INFO: renamed from: ﮐ */
                private static int f28548 = 1;

                /* JADX INFO: renamed from: ﻐ */
                private static int f28549 = 0;

                /* JADX INFO: renamed from: ｋ */
                private static long f28550 = 7311909585647688051L;

                /* JADX INFO: renamed from: ﾇ */
                private static int f28551;

                /* JADX INFO: renamed from: ﾒ */
                private static char f28552;

                @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.c
                /* JADX INFO: renamed from: ﾒ */
                public final Object mo28541(JSONObject jSONObject, String str) {
                    String strOptString;
                    int i4 = 2 % 2;
                    int i5 = f28549 + 25;
                    f28548 = i5 % 128;
                    Object obj = null;
                    try {
                        if (i5 % 2 == 0) {
                            strOptString = jSONObject.optString(str);
                            int i6 = 12 / 0;
                            if (jSONObject.opt(str) instanceof String) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(m29948("\ue13d", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35612), "\ud973⩍ἇ敹", (-784214397) - (ViewConfiguration.getKeyRepeatDelay() >> 16), "菢䇖᳑王").intern());
                                sb.append(strOptString);
                                sb.append(m29948("\ue13d", (char) (35612 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\ud973⩍ἇ敹", (-784214397) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "菢䇖᳑王").intern());
                                strOptString = sb.toString();
                            }
                        } else {
                            strOptString = jSONObject.optString(str);
                            if (jSONObject.opt(str) instanceof String) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m29948("\ue13d", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 35612), "\ud973⩍ἇ敹", (-784214397) - (ViewConfiguration.getKeyRepeatDelay() >> 16), "菢䇖᳑王").intern());
                                sb2.append(strOptString);
                                sb2.append(m29948("\ue13d", (char) (35612 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\ud973⩍ἇ敹", (-784214397) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "菢䇖᳑王").intern());
                                strOptString = sb2.toString();
                            }
                        }
                        String strM29938 = C11897dh.m29938(C11897dh.this);
                        AbstractC11919ec abstractC11919ecM30115 = new C11910du(strM29938, strOptString).m30115(C11909dt.m30067(strM29938, strOptString, strOptString));
                        int i7 = f28549 + 45;
                        f28548 = i7 % 128;
                        if (i7 % 2 != 0) {
                            return abstractC11919ecM30115;
                        }
                        super.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        String strM29939 = C11897dh.m29938(C11897dh.this);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m29948("洕覱ಸ⺌信弬郃\ue754⃮톥\ue18a觶⨹喷", (char) (37474 - (ViewConfiguration.getEdgeSlop() >> 16)), "\ud973⩍ἇ敹", ViewConfiguration.getMinimumFlingVelocity() >> 16, "ࣛ餫戗\udd92").intern());
                        sb3.append(str);
                        sb3.append(m29948("ᣰﷆ斲誹㧕㷥㽔분", (char) KeyEvent.getDeadChar(0, 0), "\ud973⩍ἇ敹", (Process.getThreadPriority(0) + 20) >> 6, "꧷觑}问").intern());
                        sb3.append(jSONObject.optString(str));
                        C11875cm.m29607(strM29939, sb3.toString(), th);
                        return null;
                    }
                }

                /* JADX INFO: renamed from: ｋ */
                private static String m29948(String str, char c, String str2, int i4, String str3) {
                    String str4;
                    Object charArray = str3;
                    if (str3 != null) {
                        charArray = str3.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    Object charArray2 = str2;
                    if (str2 != null) {
                        charArray2 = str2.toCharArray();
                    }
                    char[] cArr2 = (char[]) charArray2;
                    Object charArray3 = str;
                    if (str != null) {
                        charArray3 = str.toCharArray();
                    }
                    char[] cArr3 = (char[]) charArray3;
                    synchronized (C12051j.f29510) {
                        char[] cArr4 = (char[]) cArr.clone();
                        char[] cArr5 = (char[]) cArr2.clone();
                        cArr4[0] = (char) (c ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i4));
                        int length = cArr3.length;
                        char[] cArr6 = new char[length];
                        C12051j.f29511 = 0;
                        while (C12051j.f29511 < length) {
                            int i5 = (C12051j.f29511 + 2) % 4;
                            int i6 = (C12051j.f29511 + 3) % 4;
                            C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i5]) % 65535);
                            cArr5[i6] = (char) (((cArr4[i6] * 32718) + cArr5[i5]) / 65535);
                            cArr4[i6] = C12051j.f29509;
                            cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i6] ^ cArr3[C12051j.f29511])) ^ f28550) ^ ((long) f28551)) ^ ((long) f28552));
                            C12051j.f29511++;
                        }
                        str4 = new String(cArr6);
                    }
                    return str4;
                }
            }), this.f28547, true);
            this.f28542 = c11907dr;
            c11907dr.m30054(C12077jz.m30805(this.f28546.optJSONArray(m29937("\u0003\u0004\u0005\u000e\u0000\u000f¤", 7 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (49 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern()), new C12077jz.a<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.5
                @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.a
                /* JADX INFO: renamed from: ﾒ */
                public final /* synthetic */ String mo28537(JSONArray jSONArray, int i4) {
                    return C11914dy.m30142(jSONArray.optString(i4));
                }
            }));
            int i4 = f28532 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f28530 = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.f28542;
    }

    /* JADX INFO: renamed from: ﱡ */
    public final C11903dn m29941() {
        int i = 2 % 2;
        int i2 = f28532 + 5;
        f28530 = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.f28540 == null) {
                this.f28540 = new C11903dn(this.f28546.optJSONObject(m29937("\u001b\u0000\r\u001d\u0000\u0004\u0019\u001b\u0098", 9 - (ViewConfiguration.getTapTimeout() >> 16), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37)).intern()));
                int i3 = f28532 + 19;
                f28530 = i3 % 128;
                int i4 = i3 % 2;
            }
            return this.f28540;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: ﮐ */
    public final Map<String, C11901dl> m29939() {
        int i = 2 % 2;
        int i2 = f28532 + 39;
        f28530 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
            if (this.f28537 == null) {
                this.f28537 = C12077jz.m30810(this.f28546.optJSONObject(m29935("툖酨ꄗ㱤鎙떛悽舻\ud8de", (char) (Process.myTid() >> 22), "\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString("") + 1314791558, "蘑帠鍎啚").intern()), new C12077jz.c<C11901dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.4
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.c
                    /* JADX INFO: renamed from: ﾒ */
                    public final /* synthetic */ C11901dl mo28541(JSONObject jSONObject, String str) {
                        return new C11901dl(C11897dh.m29938(C11897dh.this), str, jSONObject.optJSONObject(str));
                    }
                });
                int i4 = f28530 + 113;
                f28532 = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (this.f28537 == null) {
            this.f28537 = C12077jz.m30810(this.f28546.optJSONObject(m29935("툖酨ꄗ㱤鎙떛悽舻\ud8de", (char) (Process.myTid() >> 22), "\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString("") + 1314791558, "蘑帠鍎啚").intern()), new C12077jz.c<C11901dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.4
                @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.c
                /* JADX INFO: renamed from: ﾒ */
                public final /* synthetic */ C11901dl mo28541(JSONObject jSONObject, String str) {
                    return new C11901dl(C11897dh.m29938(C11897dh.this), str, jSONObject.optJSONObject(str));
                }
            });
            int i6 = f28530 + 113;
            f28532 = i6 % 128;
            int i7 = i6 % 2;
        }
        return this.f28537;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final String m29947(String str) {
        int i = 2 % 2;
        if (this.f28539 == null) {
            int i2 = f28530 + 27;
            f28532 = i2 % 128;
            int i3 = i2 % 2;
            Map<String, String> mapM30806 = C12077jz.m30806(this.f28546.optJSONObject(m29937("\n\u0000\u0015!\u0010\u0019\u000f\u0004\u0001\u0012\u001b\u0001\u0012\f\u0001\u0011\u0006\f", 18 - TextUtils.getTrimmedLength(""), (byte) (8 - (ViewConfiguration.getTouchSlop() >> 8))).intern()));
            if (mapM30806 != null) {
                ArrayList<String> arrayList = new ArrayList(mapM30806.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(String str2, String str3) {
                        return C12081kc.m30858(str2, str3);
                    }
                });
                String str2 = null;
                for (String str3 : arrayList) {
                    if (C12081kc.m30858(str, str3) >= 0) {
                        str2 = mapM30806.get(str3);
                    }
                    int i4 = f28530 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f28532 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 / 5;
                    }
                }
                this.f28539 = str2;
            }
        }
        return this.f28539;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29937(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f28535;
            char c = f28533;
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

    /* JADX INFO: renamed from: ﻛ */
    private static String m29935(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28534) ^ ((long) f28536)) ^ ((long) f28531));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
