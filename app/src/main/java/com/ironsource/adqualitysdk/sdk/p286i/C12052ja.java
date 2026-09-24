package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ja */
/* JADX INFO: loaded from: classes6.dex */
public final class C12052ja {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29512 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static boolean f29513 = true;

    /* JADX INFO: renamed from: ﱡ */
    private static int f29514 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29515 = 52;

    /* JADX INFO: renamed from: ﻏ */
    private static boolean f29516 = true;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f29517 = {'w', 149, 151, 156, 153, 135, 168, Typography.pound, 166, 155, 'T', AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.END_LIST};

    /* JADX INFO: renamed from: ﻐ */
    private final C12056je f29518;

    /* JADX INFO: renamed from: ﻛ */
    private final int f29519;

    /* JADX INFO: renamed from: ﾇ */
    private final String f29520;

    /* JADX INFO: renamed from: ﾒ */
    private final String f29521;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ja$b */
    public interface b {
        /* JADX INFO: renamed from: ﾇ */
        void mo28401(List<C12054jc> list);
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ja$c */
    public interface c {
        /* JADX INFO: renamed from: ｋ */
        void mo28393(int i);
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ String m30588(C12052ja c12052ja) {
        int i = 2 % 2;
        int i2 = f29514 + 93;
        f29512 = i2 % 128;
        int i3 = i2 % 2;
        String strM30591 = c12052ja.m30591();
        int i4 = f29512 + 99;
        f29514 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM30591;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ C12056je m30589(C12052ja c12052ja) {
        int i = 2 % 2;
        int i2 = f29512 + 81;
        int i3 = i2 % 128;
        f29514 = i3;
        int i4 = i2 % 2;
        C12056je c12056je = c12052ja.f29518;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 57;
        f29512 = i5 % 128;
        int i6 = i5 % 2;
        return c12056je;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ String m30590(C12052ja c12052ja, String str) {
        int i = 2 % 2;
        int i2 = f29512 + 115;
        f29514 = i2 % 128;
        if (i2 % 2 == 0) {
            return c12052ja.m30596(str);
        }
        c12052ja.m30596(str);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m30593(C12052ja c12052ja, C12054jc c12054jc) {
        int i = 2 % 2;
        int i2 = f29514 + 63;
        f29512 = i2 % 128;
        if (i2 % 2 == 0) {
            c12052ja.m30592(c12054jc);
            throw null;
        }
        String strM30592 = c12052ja.m30592(c12054jc);
        int i3 = f29514 + 61;
        f29512 = i3 % 128;
        int i4 = i3 % 2;
        return strM30592;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ int m30594(C12052ja c12052ja) {
        int i = 2 % 2;
        int i2 = f29514;
        int i3 = i2 + 43;
        f29512 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        f29512 = i5 % 128;
        if (i5 % 2 != 0) {
            return 10000;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public C12052ja(String str, String str2, C12056je c12056je) {
        this(str, str2, c12056je, (byte) 0);
    }

    private C12052ja(String str, String str2, C12056je c12056je, byte b2) {
        this.f29520 = str2;
        this.f29519 = 10000;
        this.f29521 = str;
        this.f29518 = c12056je;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static C12054jc m30595(JSONObject jSONObject) {
        int i = 2 % 2;
        C12054jc c12054jc = new C12054jc(jSONObject);
        int i2 = f29512 + 25;
        f29514 = i2 % 128;
        int i3 = i2 % 2;
        return c12054jc;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m30598(final int i, final b bVar) {
        int i2 = 2 % 2;
        C12056je.m30639().post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1

            /* JADX INFO: renamed from: ﮐ */
            private static int f29522 = 0;

            /* JADX INFO: renamed from: ﱟ */
            private static int f29523 = 1;

            /* JADX INFO: renamed from: ﱡ */
            private static byte[] f29524 = {-58, -51, 43, 65, 59, -2, 79, 82, Ascii.f22494GS, -55, Ascii.CAN, Ascii.ESC, -17, -47, 60, 36, 77, 41, 65, Ascii.f22503VT, 76, 63, 39, 40, Ascii.f22493FS, -15, 33, Ascii.DC2, 47, -74, -76, Ascii.DC4, -111, 102, 38, -62, 48, 41, -66, -116, 45, 101, -63, -74, Ascii.CAN, -50, -126, 107, 40, 42, -62, -67, 41, 124, 100, 46, -52, 43, 44, -72, 124, 91, 122, 102, -75, 39, 48, -63, -37};

            /* JADX INFO: renamed from: ﺙ */
            private static int f29525 = -225105468;

            /* JADX INFO: renamed from: ﻏ */
            private static short[] f29526 = null;

            /* JADX INFO: renamed from: ﾇ */
            private static int f29527 = 59;

            /* JADX INFO: renamed from: ﾒ */
            private static int f29528 = 70295226;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                char c2;
                float f;
                long j;
                char c3 = 2;
                int i3 = 2 % 2;
                final ArrayList arrayList = new ArrayList();
                float f2 = 0.0f;
                long j2 = 0;
                int i4 = f29523 + 5;
                f29522 = i4 % 128;
                int i5 = i4 % 2;
                for (String str : C12052ja.m30589(C12052ja.this).m30650(C12052ja.m30590(C12052ja.this, m30602((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 70295226, (short) ((-94) - ExpandableListView.getPackedPositionType(0L)), 225105510 - KeyEvent.keyCodeFromString(""), (byte) ((-55) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) - 60).intern()), i).values()) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        c2 = c3;
                        try {
                            f = f2;
                            try {
                                j = j2;
                                try {
                                    arrayList.add(new C12054jc(jSONObject.getJSONObject(m30602(Color.green(0) - 70295225, (short) ((-16777270) - Color.rgb(0, 0, 0)), Color.rgb(0, 0, 0) + 241882796, (byte) (24 - View.MeasureSpec.getMode(0)), TextUtils.lastIndexOf("", '0', 0, 0) - 59).intern()), jSONObject.optString(m30602(Color.green(0) - 70295217, (short) ((-2) - (ViewConfiguration.getScrollBarSize() >> 8)), 225105585 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) ((-18) - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) - 60).intern())));
                                    int i6 = f29523 + 107;
                                    f29522 = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        int i7 = 4 % 3;
                                    }
                                } catch (Exception unused) {
                                    String strM30588 = C12052ja.m30588(C12052ja.this);
                                    String strIntern = m30602((-70295214) - Process.getGidForName(""), (short) (TextUtils.indexOf("", "", 0) + 76), (Process.myPid() >> 22) + 225105535, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 61).intern();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(m30602((-70295202) - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (TextUtils.getOffsetAfter("", 0) + 12), 225105535 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (byte) ((Process.myTid() >> 22) - 53), TextUtils.getOffsetAfter("", 0) - 60).intern());
                                    sb.append(str);
                                    C12085l.m30921(strM30588, strIntern, sb.toString(), true);
                                }
                            } catch (Exception unused2) {
                                j = j2;
                                String strM30589 = C12052ja.m30588(C12052ja.this);
                                String strIntern2 = m30602((-70295214) - Process.getGidForName(""), (short) (TextUtils.indexOf("", "", 0) + 76), (Process.myPid() >> 22) + 225105535, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 61).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m30602((-70295202) - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (TextUtils.getOffsetAfter("", 0) + 12), 225105535 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (byte) ((Process.myTid() >> 22) - 53), TextUtils.getOffsetAfter("", 0) - 60).intern());
                                sb2.append(str);
                                C12085l.m30921(strM30589, strIntern2, sb2.toString(), true);
                                c3 = c2;
                                f2 = f;
                                j2 = j;
                            }
                        } catch (Exception unused3) {
                            f = f2;
                            j = j2;
                            String strM305810 = C12052ja.m30588(C12052ja.this);
                            String strIntern3 = m30602((-70295214) - Process.getGidForName(""), (short) (TextUtils.indexOf("", "", 0) + 76), (Process.myPid() >> 22) + 225105535, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 61).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m30602((-70295202) - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (TextUtils.getOffsetAfter("", 0) + 12), 225105535 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (byte) ((Process.myTid() >> 22) - 53), TextUtils.getOffsetAfter("", 0) - 60).intern());
                            sb3.append(str);
                            C12085l.m30921(strM305810, strIntern3, sb3.toString(), true);
                            c3 = c2;
                            f2 = f;
                            j2 = j;
                        }
                    } catch (Exception unused4) {
                        c2 = c3;
                    }
                    c3 = c2;
                    f2 = f;
                    j2 = j;
                }
                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1.2
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        bVar.mo28401(arrayList);
                    }
                });
            }

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻐ */
            public final void mo28672(Throwable th) {
                int i3 = 2 % 2;
                super.mo28672(th);
                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1.5
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        bVar.mo28401(new ArrayList());
                    }
                });
                int i4 = f29523 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f29522 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 70 / 0;
                }
            }

            /* JADX INFO: renamed from: ﻛ */
            private static String m30602(int i3, short s, int i4, byte b2, int i5) {
                String string;
                synchronized (C12086m.f29832) {
                    StringBuilder sb = new StringBuilder();
                    int i6 = f29527;
                    int i7 = i5 + i6;
                    int i8 = i7 == -1 ? 1 : 0;
                    if (i8 != 0) {
                        byte[] bArr = f29524;
                        if (bArr != null) {
                            i7 = (byte) (bArr[f29528 + i3] + i6);
                        } else {
                            i7 = (short) (f29526[f29528 + i3] + i6);
                        }
                    }
                    if (i7 > 0) {
                        C12086m.f29836 = ((i3 + i7) - 2) + f29528 + i8;
                        C12086m.f29833 = b2;
                        C12086m.f29837 = (char) (i4 + f29525);
                        sb.append(C12086m.f29837);
                        C12086m.f29834 = C12086m.f29837;
                        C12086m.f29835 = 1;
                        while (C12086m.f29835 < i7) {
                            byte[] bArr2 = f29524;
                            if (bArr2 != null) {
                                int i9 = C12086m.f29836;
                                C12086m.f29836 = i9 - 1;
                                C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i9] + s)) ^ C12086m.f29833));
                            } else {
                                short[] sArr = f29526;
                                int i10 = C12086m.f29836;
                                C12086m.f29836 = i10 - 1;
                                C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i10] + s)) ^ C12086m.f29833));
                            }
                            sb.append(C12086m.f29837);
                            C12086m.f29834 = C12086m.f29837;
                            C12086m.f29835++;
                        }
                    }
                    string = sb.toString();
                }
                return string;
            }
        });
        int i3 = f29512 + 37;
        f29514 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m30599(final c cVar) {
        int i = 2 % 2;
        C12056je.m30639().post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.3

            /* JADX INFO: renamed from: ﻐ */
            private static int f29541 = 1;

            /* JADX INFO: renamed from: ﾇ */
            private static int f29542 = 193;

            /* JADX INFO: renamed from: ﾒ */
            private static int f29543;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                int i2 = 2 % 2;
                final int iM30643 = C12052ja.m30589(C12052ja.this).m30643(C12052ja.m30590(C12052ja.this, m30604("\u0000", View.resolveSize(0, 0) + 1, true, (ViewConfiguration.getPressedStateDuration() >> 16) + 1, 235 - Color.blue(0)).intern()));
                C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.3.4
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        cVar.mo28393(iM30643);
                    }
                });
                int i3 = f29541 + 69;
                f29543 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ｋ */
            private static String m30604(String str, int i2, boolean z, int i3, int i4) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11889d.f28479) {
                    char[] cArr2 = new char[i2];
                    C11889d.f28481 = 0;
                    while (C11889d.f28481 < i2) {
                        C11889d.f28480 = cArr[C11889d.f28481];
                        cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i4);
                        int i5 = C11889d.f28481;
                        cArr2[i5] = (char) (cArr2[i5] - f29542);
                        C11889d.f28481++;
                    }
                    if (i3 > 0) {
                        C11889d.f28478 = i3;
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr2, 0, cArr3, 0, i2);
                        System.arraycopy(cArr3, 0, cArr2, i2 - C11889d.f28478, C11889d.f28478);
                        System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i2 - C11889d.f28478);
                    }
                    if (z) {
                        char[] cArr4 = new char[i2];
                        C11889d.f28481 = 0;
                        while (C11889d.f28481 < i2) {
                            cArr4[C11889d.f28481] = cArr2[(i2 - C11889d.f28481) - 1];
                            C11889d.f28481++;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                }
                return str2;
            }
        });
        int i2 = f29512 + 107;
        f29514 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30601(final C12054jc c12054jc, final AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        C12056je.m30639().post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.2

            /* JADX INFO: renamed from: ﱡ */
            private static int f29535 = 1;

            /* JADX INFO: renamed from: ﻛ */
            private static char[] f29536 = {21, 146, 294, 295, 285, 292, 306, 305, 298, 293, 295, 277, 275, '4', 'n', 'I', 'D', 'n', 'I', 'A', 'a', 'b', 'B', ' ', '1', 'R', 'g', 'J', 'M', 'J', 'C', 'f', 'l', 'J', 'I', 's', 'q', 'p', 'i', 'd', 'f', 'B', 'E', 'h', 'o', 'L', 'C', 'j', 'p', 'I', 'G', 'h', 'f', 'g', 'd', 'k', 'd', '^', AbstractJsonLexerKt.END_OBJ, 266, 282, 285, 288, 291, 290, 251, 255, 288, 286, 287, 284, 291, 271};

            /* JADX INFO: renamed from: ｋ */
            private static int f29537;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                int i2 = 2 % 2;
                if (C12052ja.m30589(C12052ja.this).m30643(C12052ja.m30590(C12052ja.this, m30603(new int[]{0, 1, 0, 1}, "\u0000", true).intern())) <= C12052ja.m30594(C12052ja.this)) {
                    int i3 = f29537 + 85;
                    f29535 = i3 % 128;
                    int i4 = i3 % 2;
                    String strM30593 = C12052ja.m30593(C12052ja.this, c12054jc);
                    if (TextUtils.isEmpty(strM30593)) {
                        C12085l.m30921(C12052ja.m30588(C12052ja.this), m30603(new int[]{1, 12, 193, 10}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000", false).intern(), m30603(new int[]{13, 45, 0, 43}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false).intern(), true);
                        return;
                    }
                    try {
                        String string = c12054jc.m30620().toString();
                        int i5 = f29535 + 83;
                        f29537 = i5 % 128;
                        if (i5 % 2 != 0) {
                            C12085l.m30931(C12052ja.m30588(C12052ja.this), m30603(new int[]{1, 12, 193, 10}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000", true).intern(), m30603(new int[]{58, 15, 184, 0}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false).intern(), string, false);
                        } else {
                            C12085l.m30931(C12052ja.m30588(C12052ja.this), m30603(new int[]{1, 12, 193, 10}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000", false).intern(), m30603(new int[]{58, 15, 184, 0}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false).intern(), string, true);
                        }
                        C12052ja.m30589(C12052ja.this).m30648(strM30593, string);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                AbstractRunnableC12044it abstractRunnableC12044it2 = abstractRunnableC12044it;
                if (abstractRunnableC12044it2 != null) {
                    int i6 = f29537 + 5;
                    f29535 = i6 % 128;
                    int i7 = i6 % 2;
                    C12089p.m30938(abstractRunnableC12044it2);
                }
            }

            /* JADX INFO: renamed from: ﻛ */
            private static String m30603(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
                String str2;
                Object bytes = str;
                if (str != null) {
                    bytes = str.getBytes(C9415C.ISO88591_NAME);
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (C12024i.f29270) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    char[] cArr = new char[i3];
                    System.arraycopy(f29536, i2, cArr, 0, i3);
                    if (bArr != null) {
                        char[] cArr2 = new char[i3];
                        C12024i.f29269 = 0;
                        char c2 = 0;
                        while (C12024i.f29269 < i3) {
                            if (bArr[C12024i.f29269] == 1) {
                                cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c2);
                            } else {
                                cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c2);
                            }
                            c2 = cArr2[C12024i.f29269];
                            C12024i.f29269++;
                        }
                        cArr = cArr2;
                    }
                    if (i5 > 0) {
                        char[] cArr3 = new char[i3];
                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                        int i6 = i3 - i5;
                        System.arraycopy(cArr3, 0, cArr, i6, i5);
                        System.arraycopy(cArr3, i5, cArr, 0, i6);
                    }
                    if (z) {
                        char[] cArr4 = new char[i3];
                        C12024i.f29269 = 0;
                        while (C12024i.f29269 < i3) {
                            cArr4[C12024i.f29269] = cArr[(i3 - C12024i.f29269) - 1];
                            C12024i.f29269++;
                        }
                        cArr = cArr4;
                    }
                    if (i4 > 0) {
                        C12024i.f29269 = 0;
                        while (C12024i.f29269 < i3) {
                            cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                            C12024i.f29269++;
                        }
                    }
                    str2 = new String(cArr);
                }
                return str2;
            }
        });
        int i2 = f29512 + 43;
        f29514 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30600(final C12054jc c12054jc) {
        int i = 2 % 2;
        C12056je.m30639().post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C12052ja.m30589(C12052ja.this).m30646(C12052ja.m30593(C12052ja.this, c12054jc));
            }
        });
        int i2 = f29514 + 27;
        f29512 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private String m30592(C12054jc c12054jc) {
        int i = 2 % 2;
        int i2 = f29512 + 13;
        f29514 = i2 % 128;
        int i3 = i2 % 2;
        String strM30619 = c12054jc.m30619();
        if (i3 != 0) {
            m30596(strM30619);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM30596 = m30596(strM30619);
        int i4 = f29512 + 77;
        f29514 = i4 % 128;
        int i5 = i4 % 2;
        return strM30596;
    }

    /* JADX INFO: renamed from: ﾒ */
    private String m30596(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29520);
        sb.append(str);
        String string = sb.toString();
        int i2 = f29512 + 15;
        f29514 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ｋ */
    private String m30591() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30597(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u008c\u008b\u0085\u008a\u0082\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
        sb.append(this.f29521);
        sb.append(m30597(null, TextUtils.indexOf("", "", 0, 0) + 127, null, "\u008d").intern());
        String string = sb.toString();
        int i2 = f29514 + 109;
        f29512 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30597(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f29517;
            int i2 = f29515;
            if (f29513) {
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
            if (f29516) {
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
