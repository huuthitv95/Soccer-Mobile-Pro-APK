package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.al */
/* JADX INFO: loaded from: classes6.dex */
public final class C11820al {

    /* JADX INFO: renamed from: ﭖ */
    private static short[] f27146 = null;

    /* JADX INFO: renamed from: ﭴ */
    private static int f27147 = 1;

    /* JADX INFO: renamed from: ﭸ */
    private static int f27148 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static boolean f27150 = true;

    /* JADX INFO: renamed from: ﻐ */
    private static boolean f27154 = true;

    /* JADX INFO: renamed from: ﾒ */
    private static int f27156 = 134;

    /* JADX INFO: renamed from: ｋ */
    private boolean f27157;

    /* JADX INFO: renamed from: ﾇ */
    private final C11831aw f27158;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f27155 = {207, 248, 245, 244, 217, 251, 233, 235, 201, 249, 250, 243, 211, 234, 239, 231, 216, 252, 173, 166, 192, 238, 242, 232, 179, 237, 253, 241, 246, 255, 178, 236};

    /* JADX INFO: renamed from: ﺙ */
    private static int f27152 = -661357541;

    /* JADX INFO: renamed from: ﮐ */
    private static int f27149 = 32;

    /* JADX INFO: renamed from: ﱡ */
    private static int f27151 = -1410045008;

    /* JADX INFO: renamed from: ﻏ */
    private static byte[] f27153 = {-74, 66, -77, 73, -77, -15, 7, -13, -9, 8, -12, -5, Ascii.f22493FS, Ascii.DLE, -5, Ascii.SYN, Ascii.CAN, -24, -22, -84, 92, 85, -92, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ JSONObject m28445(C11820al c11820al, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        int i2 = f27148 + 41;
        f27147 = i2 % 128;
        if (i2 % 2 != 0) {
            return m28452(iSAdQualityCustomMediationRevenue);
        }
        m28452(iSAdQualityCustomMediationRevenue);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ C11831aw m28447(C11820al c11820al) {
        int i = 2 % 2;
        int i2 = f27147;
        int i3 = i2 + 51;
        f27148 = i3 % 128;
        int i4 = i3 % 2;
        C11831aw c11831aw = c11820al.f27158;
        int i5 = i2 + 81;
        f27148 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return c11831aw;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ boolean m28453(C11820al c11820al) {
        int i = 2 % 2;
        int i2 = f27148 + 85;
        f27147 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = c11820al.f27157;
        if (i3 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ boolean m28455(C11820al c11820al, boolean z) {
        int i = 2 % 2;
        int i2 = f27148 + 45;
        int i3 = i2 % 128;
        f27147 = i3;
        int i4 = i2 % 2;
        c11820al.f27157 = z;
        int i5 = i3 + 29;
        f27148 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return z;
    }

    public C11820al(C11831aw c11831aw) {
        this.f27158 = c11831aw;
        AbstractC12058jg.m30663().m30665(new AbstractC12059jh() { // from class: com.ironsource.adqualitysdk.sdk.i.al.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.al.3.5

                    /* JADX INFO: renamed from: ｋ */
                    private static long f27165 = -3671819755908917909L;

                    /* JADX INFO: renamed from: ﾇ */
                    private static int f27166 = 0;

                    /* JADX INFO: renamed from: ﾒ */
                    private static int f27167 = 1;

                    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() throws Exception {
                        int i = 2 % 2;
                        int i2 = f27166 + 27;
                        f27167 = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 80 / 0;
                            if (C11820al.m28453(C11820al.this)) {
                                int i4 = f27167 + 67;
                                f27166 = i4 % 128;
                                int i5 = i4 % 2;
                                C11820al.m28447(C11820al.this).m28669(m28458("锆ẟ舭㞱뭎Ⳋ큤䗳즍絜\ue6a2樼ῂ荗㓫롗Ⰾ톹䔭컇牒\ue7dc歸Ἒ", 35729 - View.MeasureSpec.getMode(0)).intern());
                                C11820al.m28455(C11820al.this, false);
                            }
                        } else if (C11820al.m28453(C11820al.this)) {
                            int i6 = f27167 + 67;
                            f27166 = i6 % 128;
                            int i7 = i6 % 2;
                            C11820al.m28447(C11820al.this).m28669(m28458("锆ẟ舭㞱뭎Ⳋ큤䗳즍絜\ue6a2樼ῂ荗㓫롗Ⰾ톹䔭컇牒\ue7dc歸Ἒ", 35729 - View.MeasureSpec.getMode(0)).intern());
                            C11820al.m28455(C11820al.this, false);
                        }
                        int i8 = f27167 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                        f27166 = i8 % 128;
                        int i9 = i8 % 2;
                    }

                    /* JADX INFO: renamed from: ﻛ */
                    private static String m28458(String str, int i) {
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
                                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f27165);
                                C11997h.f29103++;
                            }
                            str2 = new String(cArr2);
                        }
                        return str2;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28456(final ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        int i2 = f27147 + 93;
        f27148 = i2 % 128;
        int i3 = i2 % 2;
        if (m28449(iSAdQualityCustomMediationRevenue)) {
            C12089p.m30934(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.al.2

                /* JADX INFO: renamed from: ﻐ */
                private static int f27159 = 1;

                /* JADX INFO: renamed from: ｋ */
                private static char[] f27160 = {'6', 'n', 'q', 's', 't', AbstractJsonLexerKt.STRING_ESC, 'X', 'n', 'N', 'N', 'n', 'l', 'n', 'j', 'e', 'f', 'd', 'i', 'q', 'm', AbstractJsonLexerKt.BEGIN_LIST};

                /* JADX INFO: renamed from: ﾇ */
                private static int f27161;

                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    int i4 = 2 % 2;
                    int i5 = f27161 + 53;
                    f27159 = i5 % 128;
                    int i6 = i5 % 2;
                    C11820al.m28447(C11820al.this).m28664(m28457(new int[]{0, 21, 0, 18}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true).intern(), Collections.singletonList(C11820al.m28445(C11820al.this, iSAdQualityCustomMediationRevenue)));
                    C11820al.m28455(C11820al.this, true);
                    int i7 = f27161 + 79;
                    f27159 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 74 / 0;
                    }
                }

                /* JADX INFO: renamed from: ﻐ */
                private static String m28457(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
                    String str2;
                    Object bytes = str;
                    if (str != null) {
                        bytes = str.getBytes(C9415C.ISO88591_NAME);
                    }
                    byte[] bArr = (byte[]) bytes;
                    synchronized (C12024i.f29270) {
                        int i4 = iArr[0];
                        int i5 = iArr[1];
                        int i6 = iArr[2];
                        int i7 = iArr[3];
                        char[] cArr = new char[i5];
                        System.arraycopy(f27160, i4, cArr, 0, i5);
                        if (bArr != null) {
                            char[] cArr2 = new char[i5];
                            C12024i.f29269 = 0;
                            char c = 0;
                            while (C12024i.f29269 < i5) {
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
                        if (i7 > 0) {
                            char[] cArr3 = new char[i5];
                            System.arraycopy(cArr, 0, cArr3, 0, i5);
                            int i8 = i5 - i7;
                            System.arraycopy(cArr3, 0, cArr, i8, i7);
                            System.arraycopy(cArr3, i7, cArr, 0, i8);
                        }
                        if (z) {
                            char[] cArr4 = new char[i5];
                            C12024i.f29269 = 0;
                            while (C12024i.f29269 < i5) {
                                cArr4[C12024i.f29269] = cArr[(i5 - C12024i.f29269) - 1];
                                C12024i.f29269++;
                            }
                            cArr = cArr4;
                        }
                        if (i6 > 0) {
                            C12024i.f29269 = 0;
                            while (C12024i.f29269 < i5) {
                                cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                                C12024i.f29269++;
                            }
                        }
                        str2 = new String(cArr);
                    }
                    return str2;
                }
            }, AbstractC11823ao.m28472().mo28488());
        }
        int i4 = f27147 + 45;
        f27148 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private boolean m28449(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        int i2 = f27147 + 107;
        f27148 = i2 % 128;
        int i3 = i2 % 2;
        if (iSAdQualityCustomMediationRevenue == null) {
            return false;
        }
        if (iSAdQualityCustomMediationRevenue.getRevenue() < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            C12085l.m30912(m28450(null, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, null, "\u0088\u0086\u0084\u0088\u0092\u0088\u0091\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008d\u008c\u0083\u008b\u008a\u0086\u0089\u0088\u0087\u0082\u0086\u0083\u0085\u0084\u0083\u0082\u0081").intern(), m28450(null, 127 - TextUtils.indexOf("", ""), null, "\u0088\u0092\u008f\u008b\u0090\u009a\u0088\u0084\u0099\u0084\u0083\u0084\u0094\u0088\u0098\u0094\u008e\u0097\u0086\u0083\u0096\u008a\u0094\u0088\u0086\u0084\u0088\u0092\u0088\u0082\u0094\u0095\u0088\u0086\u0084\u0088\u0092\u0088\u0082\u0094\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008c\u0094\u008c\u0083\u008b\u008a\u0086\u0087\u0094\u008e\u0084\u0088\u008a\u0094\u008b\u0093\u0084\u0090\u0089").intern());
            return false;
        }
        if (m28446(iSAdQualityCustomMediationRevenue.getMediationNetwork())) {
            if (m28454(iSAdQualityCustomMediationRevenue.getAdType())) {
                return true;
            }
            C12085l.m30912(m28450(null, 127 - View.resolveSize(0, 0), null, "\u0088\u0086\u0084\u0088\u0092\u0088\u0091\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008d\u008c\u0083\u008b\u008a\u0086\u0089\u0088\u0087\u0082\u0086\u0083\u0085\u0084\u0083\u0082\u0081").intern(), m28450(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u008e\u0088\u008e\u0082\u0090\u009b\u0088\u0082\u0094\u008e\u0084\u0090\u0094\u0083\u0088\u008e\u008f\u0092\u0094\u008e\u0088\u008e\u0082\u0090\u009b\u0088\u0082\u0094\u009f\u0083\u0088\u008e\u008f\u0092\u0094\u009f\u0097\u0090\u008f\u008b\u008f\u008b\u008a\u0082\u0088\u008b\u0084\u008f\u0094\u0088\u0082\u0090\u0094\u008a\u0088\u009d\u009e\u008b\u0094\u008e\u0090\u0094\u008e\u0088\u008b\u0082\u0083\u009d\u009d\u0086\u008a\u0094\u0095\u0088\u0086\u0084\u0088\u0092\u0088\u0082\u0094\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008c\u0094\u008c\u0083\u008b\u008a\u0086\u0087\u0094\u008e\u0084\u0088\u008a\u0094\u008b\u0093\u0084\u0090\u0089").intern());
            return false;
        }
        int i4 = f27148 + 99;
        f27147 = i4 % 128;
        if (i4 % 2 == 0) {
            C12085l.m30912(m28450(null, (ViewConfiguration.getWindowTouchSlop() / 109) * 114, null, "\u0088\u0086\u0084\u0088\u0092\u0088\u0091\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008d\u008c\u0083\u008b\u008a\u0086\u0089\u0088\u0087\u0082\u0086\u0083\u0085\u0084\u0083\u0082\u0081").intern(), m28450(null, 122 - View.MeasureSpec.getSize(0), null, "\u009c\u0082\u0083\u009b\u008b\u0088\u0084\u0094\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008c\u0094\u009a\u0084\u008f\u008a\u008a\u008f\u008c\u0094\u0095\u0088\u0086\u0084\u0088\u0092\u0088\u0082\u0094\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008c\u0094\u008c\u0083\u008b\u008a\u0086\u0087\u0094\u008e\u0084\u0088\u008a\u0094\u008b\u0093\u0084\u0090\u0089").intern());
            return true;
        }
        C12085l.m30912(m28450(null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, "\u0088\u0086\u0084\u0088\u0092\u0088\u0091\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008d\u008c\u0083\u008b\u008a\u0086\u0089\u0088\u0087\u0082\u0086\u0083\u0085\u0084\u0083\u0082\u0081").intern(), m28450(null, View.MeasureSpec.getSize(0) + 127, null, "\u009c\u0082\u0083\u009b\u008b\u0088\u0084\u0094\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008c\u0094\u009a\u0084\u008f\u008a\u008a\u008f\u008c\u0094\u0095\u0088\u0086\u0084\u0088\u0092\u0088\u0082\u0094\u0084\u0083\u008f\u008b\u0090\u008f\u008e\u0088\u008c\u0094\u008c\u0083\u008b\u008a\u0086\u0087\u0094\u008e\u0084\u0088\u008a\u0094\u008b\u0093\u0084\u0090\u0089").intern());
        return false;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static boolean m28446(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        int i = 2 % 2;
        if (iSAdQualityMediationNetwork != null) {
            int i2 = f27148 + 109;
            f27147 = i2 % 128;
            int i3 = i2 % 2;
            String strM28448 = m28448(iSAdQualityMediationNetwork);
            if (i3 == 0) {
                TextUtils.isEmpty(strM28448);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (!TextUtils.isEmpty(strM28448)) {
                return true;
            }
        }
        int i4 = f27148 + 29;
        f27147 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static boolean m28454(ISAdQualityAdType iSAdQualityAdType) {
        int i = 2 % 2;
        int i2 = f27148 + 87;
        f27147 = i2 % 128;
        int i3 = i2 % 2;
        if (iSAdQualityAdType != ISAdQualityAdType.INTERSTITIAL) {
            int i4 = f27148 + 101;
            f27147 = i4 % 128;
            int i5 = i4 % 2;
            if (iSAdQualityAdType != ISAdQualityAdType.VIDEO) {
                int i6 = f27147 + 105;
                f27148 = i6 % 128;
                int i7 = i6 % 2;
                if (iSAdQualityAdType != ISAdQualityAdType.REWARDED_VIDEO && iSAdQualityAdType != ISAdQualityAdType.REWARDED) {
                    return false;
                }
            }
        }
        int i8 = f27148 + 111;
        f27147 = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static JSONObject m28452(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i = 2 % 2;
        C11898di c11898di = new C11898di();
        c11898di.m29960(true);
        c11898di.m29961(Double.valueOf(iSAdQualityCustomMediationRevenue.getRevenue()));
        c11898di.m29962(m28448(iSAdQualityCustomMediationRevenue.getMediationNetwork()));
        c11898di.m29964(iSAdQualityCustomMediationRevenue.getPlacement());
        JSONObject jSONObjectM29963 = c11898di.m29963();
        int i2 = f27148 + 9;
        f27147 = i2 % 128;
        int i3 = i2 % 2;
        return jSONObjectM29963;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28448(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        int i = 2 % 2;
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return m28450(null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0098\u0083\u008c\u008e\u0090").intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            return m28450(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, "\u008e\u008f\u0098\u0082\u008f\u0090 ").intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return m28451(661357542 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) ((-1) - Process.getGidForName("")), (ViewConfiguration.getPressedStateDuration() >> 16) + 1410045112, (byte) (78 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (-26) - TextUtils.indexOf("", "")).intern();
        }
        if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.LEVEL_PLAY) {
            if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
                return m28451(661357546 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (ViewConfiguration.getTouchSlop() >> 8), 1410045105 - Drawable.resolveOpacity(0, 0), (byte) (View.resolveSize(0, 0) - 12), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 24).intern();
            }
            if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.UNITY) {
                if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.SELF_MEDIATED) {
                    if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.OTHER) {
                        return "";
                    }
                    int i2 = f27148 + 105;
                    f27147 = i2 % 128;
                    int i3 = i2 % 2;
                    return m28451(661357560 - TextUtils.getOffsetBefore("", 0), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 1393267903 - Color.rgb(0, 0, 0), (byte) (TextUtils.getOffsetBefore("", 0) - 95), TextUtils.getCapsMode("", 0, 0) - 27).intern();
                }
                int i4 = f27147 + 115;
                f27148 = i4 % 128;
                return i4 % 2 != 0 ? m28450(null, 24007 % (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, "\u008e\u0088\u008b\u0090\u008f\u008e\u0088\u008c \u0097\u0088\u008a").intern() : m28450(null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, "\u008e\u0088\u008b\u0090\u008f\u008e\u0088\u008c \u0097\u0088\u008a").intern();
            }
            int i5 = f27148 + 7;
            f27147 = i5 % 128;
            int i6 = i5 % 2;
            return m28451((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 661357553, (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1410045124, (byte) (19 - View.getDefaultSize(0, 0)), (-25) - MotionEvent.axisFromString("")).intern();
        }
        int i7 = f27147 + 33;
        f27148 = i7 % 128;
        return i7 % 2 != 0 ? m28450(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 94) * 18, null, "\u0087\u008f\u0084\u0083\u008a\u0082\u0088\u009d\u0086\u008a").intern() : m28450(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u0087\u008f\u0084\u0083\u008a\u0082\u0088\u009d\u0086\u008a").intern();
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28450(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f27155;
            int i2 = f27156;
            if (f27150) {
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
            if (f27154) {
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

    /* JADX INFO: renamed from: ﾇ */
    private static String m28451(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f27149;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f27153;
                if (bArr != null) {
                    i5 = (byte) (bArr[f27152 + i] + i4);
                } else {
                    i5 = (short) (f27146[f27152 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f27152 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f27151);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f27153;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f27146;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
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
}
