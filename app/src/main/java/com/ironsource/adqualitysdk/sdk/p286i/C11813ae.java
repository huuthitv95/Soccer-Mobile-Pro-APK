package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ae */
/* JADX INFO: loaded from: classes6.dex */
public final class C11813ae extends C12069jr {

    /* JADX INFO: renamed from: ﭴ */
    private static int f26981 = 0;

    /* JADX INFO: renamed from: ﮉ */
    private static int f26982 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private int f26988;

    /* JADX INFO: renamed from: ﻛ */
    private int f26989;

    /* JADX INFO: renamed from: ｋ */
    private Handler f26990;

    /* JADX INFO: renamed from: ﾇ */
    private String f26991;

    /* JADX INFO: renamed from: ﾒ */
    private int f26992;

    /* JADX INFO: renamed from: ﮐ */
    private static char[] f26983 = {'s', 235, 235, 237, 235, 236, 243, 242, 219, 217, 233, 232, 244, 248, 240, 232, 237, 222, 223, 239, 235, 243, 223, '9', 's', 's', AbstractJsonLexerKt.COLON, 's', 'k', AbstractJsonLexerKt.COLON, 'o', 'f', 'k', '1', 'k', 'o', 'h', 'E', 130, 130, '^', 229, 268, 268, 270, 247, 239, 262, 264, 245, 252, 269, 261, 265, 265, 222, 223, 262, 263, 266, 262, 255, 263, 262, '6', 'f', 'j', 's', 'd', 'a', 'r', 'l', 'e'};

    /* JADX INFO: renamed from: ﻏ */
    private static boolean f26987 = true;

    /* JADX INFO: renamed from: ﺙ */
    private static boolean f26986 = true;

    /* JADX INFO: renamed from: ﱟ */
    private static int f26984 = 284;

    /* JADX INFO: renamed from: ﱡ */
    private static char[] f26985 = {399, 401, 400, 389, 384, 394, 393, 385, 398, 395, 316, 381, 387, 392, 383, 388, 402};

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ae$b */
    public interface b {
        void onEventGenerated(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ int m28316(C11813ae c11813ae) {
        int i;
        int i2 = 2 % 2;
        int i3 = f26982;
        int i4 = i3 + 9;
        f26981 = i4 % 128;
        if (i4 % 2 != 0) {
            i = c11813ae.f26988;
            c11813ae.f26988 = i;
        } else {
            i = c11813ae.f26988;
            c11813ae.f26988 = i + 1;
        }
        int i5 = i3 + 9;
        f26981 = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ int m28319(C11813ae c11813ae) {
        int i = 2 % 2;
        int i2 = f26981;
        int i3 = i2 + 11;
        f26982 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = c11813ae.f26992;
        c11813ae.f26992 = i5 + 1;
        int i6 = i2 + 19;
        f26982 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ int m28321(C11813ae c11813ae) {
        int i = 2 % 2;
        int i2 = f26981;
        int i3 = i2 + 29;
        f26982 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = c11813ae.f26992;
        int i6 = i2 + 59;
        f26982 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    C11813ae(Context context, C11827as c11827as, int i, String str, long j) {
        super(context, c11827as, j);
        this.f26989 = i;
        this.f26988 = 0;
        this.f26992 = 1;
        this.f26991 = str;
        HandlerThread handlerThread = new HandlerThread(m28320(new int[]{0, 23, 130, 8}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false).intern());
        handlerThread.start();
        this.f26990 = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ｋ */
    private int m28318() {
        int i = 2 % 2;
        int i2 = f26982 + 107;
        int i3 = i2 % 128;
        f26981 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = this.f26988;
        if (i4 == 0) {
            return 1;
        }
        int i5 = i3 + 15;
        f26982 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final synchronized void m28323(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z, final b bVar) throws Throwable {
        try {
            try {
                int i = 2 % 2;
                this.f26990.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.5

                    /* JADX INFO: renamed from: ﮐ */
                    private static int f27003 = 1;

                    /* JADX INFO: renamed from: ﱟ */
                    private static int f27004 = 0;

                    /* JADX INFO: renamed from: ﱡ */
                    private static char[] f27005 = {'t', 'p', '_', 's', 'e', 'a', 'r', 'n', 'm', 'c', 'b', 'k', 'o', 'i', AbstractJsonLexerKt.UNICODE_ESC, 'v'};

                    /* JADX INFO: renamed from: ﺙ */
                    private static char f27006 = 4;

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() throws Exception {
                        int i2 = 2 % 2;
                        if (str.equals(m28327("\u0001\u0002\u0003\u0000\u0007\u0000\u0000\u0003\u0000\u0001\u0006\u0007\u008e", View.resolveSizeAndState(0, 0, 0) + 13, (byte) (View.combineMeasuredStates(0, 0) + 26)).intern())) {
                            int i3 = f27003 + 19;
                            f27004 = i3 % 128;
                            int i4 = i3 % 2;
                            C11813ae.m28316(C11813ae.this);
                            int i5 = f27004 + 43;
                            f27003 = i5 % 128;
                            int i6 = i5 % 2;
                        }
                        int iM28321 = C11813ae.m28321(C11813ae.this);
                        C11813ae.m28319(C11813ae.this);
                        JSONObject jSONObjectM30816 = C12077jz.m30816(jSONObject);
                        jSONObjectM30816.put(m28327("\u0004\u0006\f\b", 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 51)).intern(), str);
                        jSONObjectM30816.put(m28327("\u0005\u0004", 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 74)).intern(), iM28321);
                        String strIntern = m28327("\u0002\u0004\t\r\u0006\b\t\ræ", (ViewConfiguration.getPressedStateDuration() >> 16) + 9, (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)).intern();
                        JSONObject jSONObject3 = jSONObject2;
                        if (jSONObject3 != null) {
                            strIntern = jSONObject3.optString(C12035ik.f29413);
                            jSONObjectM30816.put(C12035ik.f29369, jSONObject2.optString(C12035ik.f29369, null));
                        }
                        if (TextUtils.isEmpty(strIntern)) {
                            strIntern = m28327("\u0004\u000f\u0004\u0005", 4 - (KeyEvent.getMaxKeyCode() >> 16), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 126)).intern();
                        }
                        jSONObjectM30816.put(C12035ik.f29410, strIntern);
                        if (!jSONObjectM30816.has(C12035ik.f29414)) {
                            jSONObjectM30816.put(C12035ik.f29414, strIntern);
                        }
                        final JSONObject jSONObjectMo28325 = C11813ae.this.mo28325(jSONObjectM30816, z, true, str.equals(m28327("\u0001\u0002\u0001\u000e\u0005\u000fv", 7 - TextUtils.getOffsetAfter("", 0), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 2)).intern()));
                        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.5.2
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() {
                                bVar.onEventGenerated(jSONObjectMo28325);
                            }
                        });
                    }

                    /* JADX INFO: renamed from: ｋ */
                    private static String m28327(String str2, int i2, byte b2) {
                        String str3;
                        Object charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (C11970g.f28961) {
                            char[] cArr2 = f27005;
                            char c = f27006;
                            char[] cArr3 = new char[i2];
                            if (i2 % 2 != 0) {
                                i2--;
                                cArr3[i2] = (char) (cArr[i2] - b2);
                            }
                            if (i2 > 1) {
                                C11970g.f28962 = 0;
                                while (C11970g.f28962 < i2) {
                                    C11970g.f28964 = cArr[C11970g.f28962];
                                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                                    if (C11970g.f28964 == C11970g.f28965) {
                                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b2);
                                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b2);
                                    } else {
                                        C11970g.f28963 = C11970g.f28964 / c;
                                        C11970g.f28959 = C11970g.f28964 % c;
                                        C11970g.f28966 = C11970g.f28965 / c;
                                        C11970g.f28960 = C11970g.f28965 % c;
                                        if (C11970g.f28959 == C11970g.f28960) {
                                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                                            int i3 = (C11970g.f28963 * c) + C11970g.f28959;
                                            int i4 = (C11970g.f28966 * c) + C11970g.f28960;
                                            cArr3[C11970g.f28962] = cArr2[i3];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i4];
                                        } else if (C11970g.f28963 == C11970g.f28966) {
                                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                                            int i5 = (C11970g.f28963 * c) + C11970g.f28959;
                                            int i6 = (C11970g.f28966 * c) + C11970g.f28960;
                                            cArr3[C11970g.f28962] = cArr2[i5];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i6];
                                        } else {
                                            int i7 = (C11970g.f28963 * c) + C11970g.f28960;
                                            int i8 = (C11970g.f28966 * c) + C11970g.f28959;
                                            cArr3[C11970g.f28962] = cArr2[i7];
                                            cArr3[C11970g.f28962 + 1] = cArr2[i8];
                                        }
                                    }
                                    C11970g.f28962 += 2;
                                }
                            }
                            str3 = new String(cArr3);
                        }
                        return str3;
                    }
                });
                int i2 = f26982 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f26981 = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28324(final JSONArray jSONArray, final boolean z, final b bVar) {
        int i = 2 % 2;
        this.f26990.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.4

            /* JADX INFO: renamed from: ﮐ */
            private static char f26993 = 5;

            /* JADX INFO: renamed from: ﱡ */
            private static int f26994 = 1;

            /* JADX INFO: renamed from: ﻏ */
            private static int f26995;

            /* JADX INFO: renamed from: ﾒ */
            private static char[] f26996 = {'e', 'v', 'n', 't', 's', 'A', 'a', 'l', 'y', 'i', 'c', 'E', 'G', 'r', 'o', ' ', 'g', 'M', 'f', 'h', 'j', 'k', 'm', 'p', 'q'};

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() throws Exception {
                int i2 = 2 % 2;
                int i3 = f26995 + 65;
                f26994 = i3 % 128;
                int i4 = i3 % 2;
                final JSONObject jSONObjectMo28325 = C11813ae.this.mo28325(null, z, false, false);
                try {
                    jSONObjectMo28325.put(m28326("\u0001\u0002\u0001\u0003\u0004\u0000", ((Process.getThreadPriority(0) + 20) >> 6) + 6, (byte) (36 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), jSONArray);
                } catch (JSONException e) {
                    C12085l.m30922(m28326("\u0007\u0000\u0007\b\r\b\u0005\u000e\u0001\u000e\u0002\u0001\u0003\u0004\n\u0002\u0003\u0001\u000b\b\u0004\rì", 23 - ExpandableListView.getPackedPositionGroup(0L), (byte) (TextUtils.getOffsetBefore("", 0) + Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)).intern(), m28326("\f\u000e\u000e\n\n\u0012\u000b\u000e\u0001\u0005\u0004\b\u0001\u0011\u0014\u0005\u0002\u0001\u0003\u0004\u000f\u0002\u0001\b", 24 - KeyEvent.keyCodeFromString(""), (byte) (91 - View.getDefaultSize(0, 0))).intern(), e);
                }
                C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.4.3
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        bVar.onEventGenerated(jSONObjectMo28325);
                    }
                });
                int i5 = f26995 + 71;
                f26994 = i5 % 128;
                int i6 = i5 % 2;
            }

            /* JADX INFO: renamed from: ｋ */
            private static String m28326(String str, int i2, byte b2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11970g.f28961) {
                    char[] cArr2 = f26996;
                    char c = f26993;
                    char[] cArr3 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr3[i2] = (char) (cArr[i2] - b2);
                    }
                    if (i2 > 1) {
                        C11970g.f28962 = 0;
                        while (C11970g.f28962 < i2) {
                            C11970g.f28964 = cArr[C11970g.f28962];
                            C11970g.f28965 = cArr[C11970g.f28962 + 1];
                            if (C11970g.f28964 == C11970g.f28965) {
                                cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b2);
                                cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b2);
                            } else {
                                C11970g.f28963 = C11970g.f28964 / c;
                                C11970g.f28959 = C11970g.f28964 % c;
                                C11970g.f28966 = C11970g.f28965 / c;
                                C11970g.f28960 = C11970g.f28965 % c;
                                if (C11970g.f28959 == C11970g.f28960) {
                                    C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                                    C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                                    int i3 = (C11970g.f28963 * c) + C11970g.f28959;
                                    int i4 = (C11970g.f28966 * c) + C11970g.f28960;
                                    cArr3[C11970g.f28962] = cArr2[i3];
                                    cArr3[C11970g.f28962 + 1] = cArr2[i4];
                                } else if (C11970g.f28963 == C11970g.f28966) {
                                    C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                                    C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                                    int i5 = (C11970g.f28963 * c) + C11970g.f28959;
                                    int i6 = (C11970g.f28966 * c) + C11970g.f28960;
                                    cArr3[C11970g.f28962] = cArr2[i5];
                                    cArr3[C11970g.f28962 + 1] = cArr2[i6];
                                } else {
                                    int i7 = (C11970g.f28963 * c) + C11970g.f28960;
                                    int i8 = (C11970g.f28966 * c) + C11970g.f28959;
                                    cArr3[C11970g.f28962] = cArr2[i7];
                                    cArr3[C11970g.f28962 + 1] = cArr2[i8];
                                }
                            }
                            C11970g.f28962 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        });
        int i2 = f26981 + 77;
        f26982 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12069jr
    /* JADX INFO: renamed from: ﻛ */
    public final JSONObject mo28325(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        long jM30752;
        long jM30750;
        synchronized (this) {
            jM30752 = C12072ju.m30752();
            jM30750 = C12072ju.m30750();
        }
        JSONObject jSONObjectMo28325 = super.mo28325(jSONObject, z, z2, z3);
        try {
            long jOptLong = jSONObjectMo28325.optLong(C12035ik.f29407);
            jSONObjectMo28325.remove(C12035ik.f29407);
            if (jOptLong != 0) {
                long j = jM30750 - (jM30752 - jOptLong);
                jSONObjectMo28325.put(m28320(new int[]{23, 3, 0, 3}, "\u0001\u0001\u0001", false).intern(), jM30752);
                jSONObjectMo28325.put(m28322(null, TextUtils.indexOf("", "") + 127, null, "\u0083\u0082\u0081").intern(), jM30750);
                jM30752 = jOptLong;
                jM30750 = j;
            }
            jSONObjectMo28325.put(m28320(new int[]{26, 3, 0, 2}, "\u0000\u0001\u0001", false).intern(), jM30752);
            jSONObjectMo28325.put(m28322(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0083\u0082").intern(), jM30750);
            jSONObjectMo28325.put(m28320(new int[]{29, 4, 0, 3}, "\u0001\u0000\u0001\u0001", false).intern(), this.f26991);
            jSONObjectMo28325.put(m28322(null, TextUtils.indexOf("", "", 0) + 127, null, "\u0085\u0084\u0081").intern(), this.f26989);
            jSONObjectMo28325.put(m28322(null, View.MeasureSpec.getMode(0) + 127, null, "\u0087\u0086\u0081").intern(), m28318());
            if (AbstractC11823ao.m28472().mo28474()) {
                jSONObjectMo28325.put(m28320(new int[]{33, 4, 0, 0}, "\u0001\u0000\u0001\u0000", false).intern(), true);
            }
            C11825aq c11825aqMo28486 = AbstractC11823ao.m28472().mo28486();
            if (c11825aqMo28486 != null) {
                String strM28555 = c11825aqMo28486.m28555();
                if (!TextUtils.isEmpty(strM28555)) {
                    jSONObjectMo28325.put(m28320(new int[]{37, 3, 22, 1}, "\u0000\u0001\u0001", false).intern(), strM28555);
                }
            }
            if (z2) {
                m28317(jSONObjectMo28325);
                return jSONObjectMo28325;
            }
        } catch (JSONException e) {
            C12085l.m30922(m28320(new int[]{0, 23, 130, 8}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false).intern(), m28320(new int[]{40, 24, 156, 6}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", true).intern(), e);
        }
        return jSONObjectMo28325;
    }

    /* JADX INFO: renamed from: ﻛ */
    private synchronized void m28317(JSONObject jSONObject) {
        JSONObject jSONObjectM30811;
        String strIntern;
        int i = 2 % 2;
        int i2 = f26981 + 99;
        f26982 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                C12034ij c12034ijM30694 = C12060ji.m30687().m30694();
                jSONObjectM30811 = C12077jz.m30811(c12034ijM30694.m30516(), c12034ijM30694.m30513(), c12034ijM30694.m30514(), c12034ijM30694.m30515());
                strIntern = m28320(new int[]{64, 9, 0, 0}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true).intern();
            } else {
                C12034ij c12034ijM30695 = C12060ji.m30687().m30694();
                jSONObjectM30811 = C12077jz.m30811(c12034ijM30695.m30516(), c12034ijM30695.m30513(), c12034ijM30695.m30514(), c12034ijM30695.m30515());
                strIntern = m28320(new int[]{64, 9, 0, 0}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", false).intern();
            }
            jSONObject.put(strIntern, jSONObjectM30811);
        } catch (JSONException e) {
            C12085l.m30922(m28320(new int[]{0, 23, 130, 8}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false).intern(), m28322(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0083\u0086\u0088\u0091\u0088\u008b\u008a\u0083\u008b\u0090\u008f\u0082\u008a\u0083\u0081\u008c\u008e\u008b\u008d\u0086\u0084\u0085\u0085\u008c\u008b\u0089\u008a\u0089\u0089\u0088").intern(), e);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28320(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f26983, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28322(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f26985;
            int i2 = f26984;
            if (f26986) {
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
            if (f26987) {
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
