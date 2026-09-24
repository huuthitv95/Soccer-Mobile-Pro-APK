package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ah */
/* JADX INFO: loaded from: classes6.dex */
final class C11816ah {

    /* JADX INFO: renamed from: ﮐ */
    private static long f27119 = -7431338038024014971L;

    /* JADX INFO: renamed from: ﱟ */
    private static int f27120 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f27121 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static int f27122 = 143;

    /* JADX INFO: renamed from: ﱡ */
    private int f27123;

    /* JADX INFO: renamed from: ﻐ */
    private long f27124;

    /* JADX INFO: renamed from: ﻛ */
    private long f27125;

    /* JADX INFO: renamed from: ｋ */
    private long f27126;

    /* JADX INFO: renamed from: ﾇ */
    private Boolean f27127 = null;

    /* JADX INFO: renamed from: ﾒ */
    private long f27128;

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ long m28421(C11816ah c11816ah, long j) {
        int i = 2 % 2;
        int i2 = f27120 + 25;
        f27121 = i2 % 128;
        int i3 = i2 % 2;
        c11816ah.f27125 = j;
        if (i3 == 0) {
            return j;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ long m28424(C11816ah c11816ah) {
        int i = 2 % 2;
        int i2 = f27120 + 9;
        int i3 = i2 % 128;
        f27121 = i3;
        int i4 = i2 % 2;
        long j = c11816ah.f27124;
        int i5 = i3 + 83;
        f27120 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return j;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ long m28425(C11816ah c11816ah, long j) {
        int i = 2 % 2;
        int i2 = f27121 + 13;
        int i3 = i2 % 128;
        f27120 = i3;
        int i4 = i2 % 2;
        c11816ah.f27126 = j;
        int i5 = i3 + 9;
        f27121 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ long m28426(C11816ah c11816ah) {
        int i = 2 % 2;
        int i2 = f27120;
        int i3 = i2 + 55;
        f27121 = i3 % 128;
        int i4 = i3 % 2;
        long j = c11816ah.f27128;
        int i5 = i2 + 3;
        f27121 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ Boolean m28427(C11816ah c11816ah, Boolean bool) {
        int i = 2 % 2;
        int i2 = f27121;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27120 = i3 % 128;
        int i4 = i3 % 2;
        c11816ah.f27127 = bool;
        int i5 = i2 + 19;
        f27120 = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ long m28429(C11816ah c11816ah, long j) {
        int i = 2 % 2;
        int i2 = f27121;
        int i3 = i2 + 45;
        f27120 = i3 % 128;
        int i4 = i3 % 2;
        c11816ah.f27124 = j;
        int i5 = i2 + 61;
        f27120 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ long m28431(C11816ah c11816ah, long j) {
        int i = 2 % 2;
        int i2 = f27121 + 43;
        int i3 = i2 % 128;
        f27120 = i3;
        int i4 = i2 % 2;
        c11816ah.f27128 = j;
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        int i6 = i3 + 61;
        f27121 = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    C11816ah(int i) {
        this.f27123 = i;
        AbstractC11823ao.m28472().mo28502(new InterfaceC11828at() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.4

            /* JADX INFO: renamed from: ﱟ */
            private static int f27129 = 1;

            /* JADX INFO: renamed from: ﻐ */
            private static char f27130 = 0;

            /* JADX INFO: renamed from: ﻛ */
            private static int f27131 = 0;

            /* JADX INFO: renamed from: ｋ */
            private static int f27132 = 0;

            /* JADX INFO: renamed from: ﾒ */
            private static long f27133 = 8083435856609940465L;

            /* JADX WARN: Code duplicated, block: B:10:0x007c A[PHI: r1 r4
  0x007c: PHI (r1v12 com.ironsource.adqualitysdk.sdk.i.ap) = (r1v5 com.ironsource.adqualitysdk.sdk.i.ap), (r1v14 com.ironsource.adqualitysdk.sdk.i.ap) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r4v5 long) = (r4v0 long), (r4v6 long) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1
  0x0031: PHI (r1v6 com.ironsource.adqualitysdk.sdk.i.ap) = (r1v5 com.ironsource.adqualitysdk.sdk.i.ap), (r1v14 com.ironsource.adqualitysdk.sdk.i.ap) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11828at
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28394() throws UnsupportedEncodingException {
                C11824ap c11824apMo28484;
                long jM28548;
                int i2 = 2 % 2;
                int i3 = f27132 + 59;
                f27129 = i3 % 128;
                if (i3 % 2 == 0) {
                    c11824apMo28484 = AbstractC11823ao.m28472().mo28484();
                    jM28548 = c11824apMo28484.m28548();
                    if (jM28548 == 0) {
                        C11816ah.m28427(C11816ah.this, Boolean.FALSE);
                        jM28548 = c11824apMo28484.m28545();
                        C12080kb.m30845(m28436("勧䜕争긣⼤덷\ue8be柏ⱍ鼓䆾㓷阬⧁됚弪\ud803䤗寈\ue74e【", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "Ᏹ淤∕瀮", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 95966657, "쁴롕Ⰵ\uf29d").intern(), m28436("쪰幝㹍Ң瑧茫뭙Ꭻჷǽ\u2dc7ꯣ\ue3e0柡狋ヱ䕂떱\uf220\ue09a紨锪싷験砃꒳뎻趇䩐궁夷\ue25b芁", (char) View.MeasureSpec.getSize(0), "Ᏹ淤∕瀮", 471556877 - ExpandableListView.getPackedPositionGroup(0L), "ි᭣\ued1c㌤").intern(), (Throwable) null, false);
                    } else {
                        C11816ah.m28427(C11816ah.this, Boolean.TRUE);
                        int i4 = f27129 + 57;
                        f27132 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                } else {
                    c11824apMo28484 = AbstractC11823ao.m28472().mo28484();
                    jM28548 = c11824apMo28484.m28548();
                    if (jM28548 == 0) {
                        C11816ah.m28427(C11816ah.this, Boolean.FALSE);
                        jM28548 = c11824apMo28484.m28545();
                        C12080kb.m30845(m28436("勧䜕争긣⼤덷\ue8be柏ⱍ鼓䆾㓷阬⧁됚弪\ud803䤗寈\ue74e【", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "Ᏹ淤∕瀮", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 95966657, "쁴롕Ⰵ\uf29d").intern(), m28436("쪰幝㹍Ң瑧茫뭙Ꭻჷǽ\u2dc7ꯣ\ue3e0柡狋ヱ䕂떱\uf220\ue09a紨锪싷験砃꒳뎻趇䩐궁夷\ue25b芁", (char) View.MeasureSpec.getSize(0), "Ᏹ淤∕瀮", 471556877 - ExpandableListView.getPackedPositionGroup(0L), "ි᭣\ued1c㌤").intern(), (Throwable) null, false);
                    } else {
                        C11816ah.m28427(C11816ah.this, Boolean.TRUE);
                        int i6 = f27129 + 57;
                        f27132 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
                C11816ah.m28429(C11816ah.this, c11824apMo28484.m28544());
                C11816ah.m28431(C11816ah.this, c11824apMo28484.m28545());
                C11816ah c11816ah = C11816ah.this;
                C11816ah.m28425(c11816ah, jM28548 - C11816ah.m28424(c11816ah));
                C11816ah c11816ah2 = C11816ah.this;
                C11816ah.m28421(c11816ah2, jM28548 - C11816ah.m28426(c11816ah2));
            }

            /* JADX INFO: renamed from: ﻛ */
            private static String m28436(String str, char c, String str2, int i2, String str3) {
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
                    cArr5[2] = (char) (cArr5[2] + ((char) i2));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    C12051j.f29511 = 0;
                    while (C12051j.f29511 < length) {
                        int i3 = (C12051j.f29511 + 2) % 4;
                        int i4 = (C12051j.f29511 + 3) % 4;
                        C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i3]) % 65535);
                        cArr5[i4] = (char) (((cArr4[i4] * 32718) + cArr5[i3]) / 65535);
                        cArr4[i4] = C12051j.f29509;
                        cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i4] ^ cArr3[C12051j.f29511])) ^ f27133) ^ ((long) f27131)) ^ ((long) f27130));
                        C12051j.f29511++;
                    }
                    str4 = new String(cArr6);
                }
                return str4;
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ */
    final boolean m28435(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27121 + 21;
        f27120 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!m28428(jSONObject) && this.f27127 != null) {
                int i3 = f27120 + 75;
                f27121 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    m28433(jSONObject);
                    return true;
                } catch (Exception e) {
                    C12080kb.m30845(m28432("\uf3d1ጹ㉂冟炢韘뜚혻\uf55dᒫ㮮嫌稚餼롑\udf91ﺻ᷉㴅尯捓", 57558 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m28432("\uf3c0\ue8b8앩ꈇ黋笮倬䳕⦓ء\ue2fb\udf92둞部趾橞䜜⏔ᡬ\uf578퇌캈ꬪ蟲粙", TextUtils.indexOf((CharSequence) "", '0', 0) + 6992).intern(), (Throwable) e, false);
                }
            }
            return false;
        }
        m28428(jSONObject);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m28433(JSONObject jSONObject) {
        long jOptLong;
        boolean z;
        int i = 2 % 2;
        try {
            if (jSONObject.optInt(m28432("\uf3f6שּ\ue2ab", 2214 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), 1) == this.f27123 || m28423(jSONObject)) {
                jOptLong = jSONObject.optLong(m28432("\uf3f0\ue7a8", 5209 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern()) + this.f27126;
                jSONObject.put(m28430("\u0003�\u0002", (KeyEvent.getMaxKeyCode() >> 16) + 3, true, 1 - (Process.myPid() >> 22), 257 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), this.f27126);
                z = true;
            } else {
                jOptLong = jSONObject.optLong(m28430("\ufff6\u0006\u0005", TextUtils.indexOf((CharSequence) "", '0', 0) + 4, false, MotionEvent.axisFromString("") + 4, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 253).intern()) + this.f27125;
                jSONObject.put(m28430("\u0001�\u0002", ExpandableListView.getPackedPositionChild(0L) + 4, false, 2 - View.MeasureSpec.getMode(0), 258 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), this.f27125);
                int i2 = f27120 + 61;
                f27121 = i2 % 128;
                int i3 = i2 % 2;
                z = false;
            }
            jSONObject.put(C12035ik.f29407, jOptLong);
            if (!this.f27127.booleanValue()) {
                int i4 = f27121 + 3;
                f27120 = i4 % 128;
                jSONObject.put((i4 % 2 == 0 ? m28430("\u0000\u0001\u0000", 2 / (ViewConfiguration.getMinimumFlingVelocity() >>> 40), true, -TextUtils.indexOf((CharSequence) "", '`'), 3402 / (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1))) : m28430("\u0000\u0001\u0000", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, false, -TextUtils.indexOf((CharSequence) "", '0'), 259 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), false);
            }
            m28434(jSONObject, z);
            m28422(jSONObject, z);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static boolean m28428(JSONObject jSONObject) {
        int i = 2 % 2;
        if (!jSONObject.has(m28430("\u0003�\u0002", ImageFormat.getBitsPerPixel(0) + 4, true, TextUtils.getCapsMode("", 0, 0) + 1, TextUtils.getCapsMode("", 0, 0) + 257).intern())) {
            int i2 = f27120 + 71;
            f27121 = i2 % 128;
            int i3 = i2 % 2;
            if (!jSONObject.has(m28430("\u0001�\u0002", (ViewConfiguration.getEdgeSlop() >> 16) + 3, false, 2 - (ViewConfiguration.getEdgeSlop() >> 16), 257 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                int i4 = f27120 + 39;
                f27121 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 0;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m28434(JSONObject jSONObject, boolean z) {
        long jOptLong;
        int i = 2 % 2;
        if (jSONObject.has(m28430("\u0001\u0000\u0000", 2 - Process.getGidForName(""), false, 2 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 258).intern())) {
            int i2 = f27120 + 91;
            int i3 = i2 % 128;
            f27121 = i3;
            int i4 = i2 % 2;
            if (z) {
                int i5 = i3 + 5;
                f27120 = i5 % 128;
                int i6 = i5 % 2;
                jOptLong = jSONObject.optLong(m28432("\uf3f6\uda5bꂧ", 10666 - ExpandableListView.getPackedPositionChild(0L)).intern()) + this.f27126;
                int i7 = f27121 + 97;
                f27120 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                jOptLong = jSONObject.optLong(m28430("\u0001\u0000\u0000", 3 - (ViewConfiguration.getTapTimeout() >> 16), false, 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 258).intern()) + this.f27125;
            }
            try {
                jSONObject.put(m28430("\u0001\u0000\u0000", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, KeyEvent.keyCodeFromString("") + 258).intern(), jOptLong);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28422(JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(m28430("\n\u000b￫\u0006\f\ufffa\uffff\u0003\ufff8", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 7, 248 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
            if (jSONObjectOptJSONObject != null) {
                int i2 = f27121 + 17;
                f27120 = i2 % 128;
                Long lValueOf = null;
                if (i2 % 2 == 0) {
                    try {
                        super.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    long jOptLong = jSONObjectOptJSONObject.optLong(m28430("\u0000", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, false, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), Drawable.resolveOpacity(0, 0) + 260).intern());
                    if (jOptLong > 0) {
                        int i3 = f27121 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                        f27120 = i3 % 128;
                        int i4 = i3 % 2;
                        lValueOf = Long.valueOf(jOptLong + this.f27126);
                    }
                } else {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(m28430("\u0000", -TextUtils.indexOf((CharSequence) "", '0', 0), true, 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getTrimmedLength("") + 259).intern());
                    if (jOptLong2 > 0) {
                        lValueOf = Long.valueOf(jOptLong2 + this.f27125);
                    }
                }
                if (lValueOf != null) {
                    jSONObjectOptJSONObject.put(m28430("\u0000", View.combineMeasuredStates(0, 0) + 1, true, 1 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionType(0L) + 259).intern(), lValueOf);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private boolean m28423(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27121 + 1;
        f27120 = i2 % 128;
        int i3 = i2 % 2;
        if (Math.abs((this.f27128 - this.f27124) - (jSONObject.optLong(m28430("\ufff6\u0006\u0005", 3 - (ViewConfiguration.getTapTimeout() >> 16), false, 3 - Color.blue(0), View.resolveSizeAndState(0, 0, 0) + 253).intern()) - jSONObject.optLong(m28432("\uf3f0\ue7a8", TextUtils.indexOf("", "", 0, 0) + 5209).intern()))) > 10) {
            return false;
        }
        int i4 = f27121;
        int i5 = i4 + 19;
        f27120 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 113;
        f27120 = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28432(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11997h.f29102) {
            C11997h.f29101 = i;
            char[] cArr2 = new char[cArr.length];
            C11997h.f29103 = 0;
            while (C11997h.f29103 < cArr.length) {
                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f27119);
                C11997h.f29103++;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28430(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f27122);
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
