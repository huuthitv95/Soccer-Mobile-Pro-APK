package com.ironsource.adqualitysdk.sdk.p286i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C12096w extends AbstractC12097x<Activity> implements InterfaceC12061jj {

    /* JADX INFO: renamed from: ﮌ */
    private static int f29958 = 1;

    /* JADX INFO: renamed from: ﮐ */
    private static int f29959;

    /* JADX INFO: renamed from: ﻏ */
    private static int[] f29960;

    /* JADX INFO: renamed from: ﻛ */
    private static String f29961;

    /* JADX INFO: renamed from: ﱟ */
    private boolean f29962;

    /* JADX INFO: renamed from: ﱡ */
    private boolean f29963;

    /* JADX INFO: renamed from: ﺙ */
    private b f29964;

    /* JADX INFO: renamed from: ﻐ */
    private boolean f29965;

    /* JADX INFO: renamed from: ｋ */
    private boolean f29966;

    /* JADX INFO: renamed from: ﾇ */
    private InterfaceC12061jj f29967;

    /* JADX INFO: renamed from: ﾒ */
    private Class f29968;

    /* JADX INFO: renamed from: ﺙ */
    static void m31028() {
        f29960 = new int[]{-1777187970, -1720000473, 1057662828, 988009182, -1053704512, -1374446743, 759789332, -1994177219, -1281276386, -859539712, -1164549831, 879019610, -696904548, 763490074, 1926128281, 2098673799, 349670491, 1536372091};
    }

    /* JADX INFO: renamed from: ﮐ */
    static /* synthetic */ String m31025() {
        int i = 2 % 2;
        int i2 = f29958;
        int i3 = i2 + 85;
        f29959 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = f29961;
        int i4 = i2 + 99;
        f29959 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ */
    static /* synthetic */ boolean m31030(C12096w c12096w) {
        int i = 2 % 2;
        int i2 = f29959 + 33;
        int i3 = i2 % 128;
        f29958 = i3;
        int i4 = i2 % 2;
        boolean z = c12096w.f29963;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 51;
        f29959 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ InterfaceC12061jj m31031(C12096w c12096w) {
        int i = 2 % 2;
        int i2 = f29958 + 103;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC12061jj interfaceC12061jjM31026 = c12096w.m31026();
        int i4 = f29959 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29958 = i4 % 128;
        int i5 = i4 % 2;
        return interfaceC12061jjM31026;
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ boolean m31032(C12096w c12096w, boolean z) {
        int i = 2 % 2;
        int i2 = f29958 + 57;
        int i3 = i2 % 128;
        f29959 = i3;
        int i4 = i2 % 2;
        c12096w.f29963 = z;
        int i5 = i3 + 103;
        f29958 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ boolean m31034(C12096w c12096w) {
        int i = 2 % 2;
        int i2 = f29959 + 13;
        int i3 = i2 % 128;
        f29958 = i3;
        int i4 = i2 % 2;
        boolean z = c12096w.f29965;
        int i5 = i3 + 1;
        f29959 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ boolean m31035(C12096w c12096w, Activity activity) {
        int i = 2 % 2;
        int i2 = f29958 + 1;
        f29959 = i2 % 128;
        if (i2 % 2 != 0) {
            c12096w.m31027(activity);
            throw null;
        }
        boolean zM31027 = c12096w.m31027(activity);
        int i3 = f29959 + 65;
        f29958 = i3 % 128;
        if (i3 % 2 != 0) {
            return zM31027;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ boolean m31036(C12096w c12096w, boolean z) {
        int i = 2 % 2;
        int i2 = f29959 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29958 = i2 % 128;
        int i3 = i2 % 2;
        c12096w.f29962 = z;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ boolean m31039(C12096w c12096w) {
        int i = 2 % 2;
        int i2 = f29958 + 109;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = c12096w.f29966;
        if (i3 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ Class m31040(C12096w c12096w, Class cls) {
        int i = 2 % 2;
        int i2 = f29958 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i3 = i2 % 128;
        f29959 = i3;
        int i4 = i2 % 2;
        c12096w.f29968 = cls;
        int i5 = i3 + 99;
        f29958 = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    /* JADX INFO: renamed from: ﾇ, reason: avoid collision after fix types in other method and contains not printable characters */
    static /* synthetic */ String m44381(Activity activity) {
        int i = 2 % 2;
        int i2 = f29958 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29959 = i2 % 128;
        if (i2 % 2 != 0) {
            m31029(activity);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String strM31029 = m31029(activity);
        int i3 = f29959 + 21;
        f29958 = i3 % 128;
        int i4 = i3 % 2;
        return strM31029;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ boolean m31041(C12096w c12096w) {
        int i = 2 % 2;
        int i2 = f29958 + 37;
        int i3 = i2 % 128;
        f29959 = i3;
        int i4 = i2 % 2;
        boolean z = c12096w.f29962;
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        int i6 = i3 + 57;
        f29958 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 74 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ boolean m31042(C12096w c12096w, boolean z) {
        int i = 2 % 2;
        int i2 = f29958 + 25;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
        c12096w.f29966 = z;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ b m31044(C12096w c12096w) {
        int i = 2 % 2;
        int i2 = f29958 + 89;
        int i3 = i2 % 128;
        f29959 = i3;
        int i4 = i2 % 2;
        b bVar = c12096w.f29964;
        if (i4 != 0) {
            int i5 = 15 / 0;
        }
        int i6 = i3 + 89;
        f29958 = i6 % 128;
        int i7 = i6 % 2;
        return bVar;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ boolean m31045() {
        int i = 2 % 2;
        int i2 = f29958;
        int i3 = i2 + 23;
        f29959 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        f29959 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ boolean m31046(C12096w c12096w, boolean z) {
        int i = 2 % 2;
        int i2 = f29958;
        int i3 = i2 + 7;
        f29959 = i3 % 128;
        int i4 = i3 % 2;
        c12096w.f29965 = z;
        int i5 = i2 + 11;
        f29959 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ﻐ */
    final /* synthetic */ void mo31048(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = f29959 + 19;
        f29958 = i2 % 128;
        int i3 = i2 % 2;
        m31050(activity, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ﻛ */
    final /* synthetic */ void mo31051(Activity activity) {
        int i = 2 % 2;
        int i2 = f29958 + 43;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
        m31047(activity);
        if (i3 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i4 = f29958 + 17;
        f29959 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ﻛ */
    final /* synthetic */ void mo28275(Activity activity, List list) {
        int i = 2 % 2;
        int i2 = f29958 + 7;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
        m31037(activity, (List<WebView>) list);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f29959 + 111;
        f29958 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ﾇ */
    final /* synthetic */ View mo28277(Activity activity) {
        int i = 2 % 2;
        int i2 = f29959 + 73;
        f29958 = i2 % 128;
        Activity activity2 = activity;
        if (i2 % 2 != 0) {
            return m31043(activity2);
        }
        m31043(activity2);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static {
        m31028();
        f29961 = m31033(new int[]{-446270231, 2009058470, 1973488583, -663004667, -591410820, -1303097071, 761841906, 2034352729, 1056000066, -777497828, 1224973016, -378670499, -1173560988, 640979776, -1173560988, 640979776, 1544483763, 920136967, -1854152337, 147954888}, ImageFormat.getBitsPerPixel(0) + 40).intern();
        int i = f29958 + 61;
        f29959 = i % 128;
        int i2 = i % 2;
    }

    C12096w(JSONObject jSONObject, InterfaceC12043is interfaceC12043is) {
        super(interfaceC12043is);
        this.f29966 = false;
        this.f29965 = false;
        this.f29963 = false;
        this.f29962 = false;
        m31052(jSONObject);
    }

    /* JADX INFO: renamed from: ｋ */
    final void m31052(JSONObject jSONObject) {
        int i = 2 % 2;
        b bVar = new b(this, jSONObject);
        m31073((AbstractC12097x.b) bVar);
        this.f29964 = bVar;
        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4

            /* JADX INFO: renamed from: ﻐ */
            private static char[] f29979 = {'A', 'c', 't', 'i', 'v', 'y', 'd', 'H', 'a', 'n', 'l', 'e', 'r', 'E', 'o', ' ', 's', 'g', 'f', AbstractJsonLexerKt.COLON, 'B', 'C', 'D', 'F', 'G'};

            /* JADX INFO: renamed from: ﻛ */
            private static char f29980 = 5;

            /* JADX INFO: renamed from: ｋ */
            private static int f29981 = 1;

            /* JADX INFO: renamed from: ﾇ */
            private static int f29982;

            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                int i2 = 2 % 2;
                try {
                    C12096w c12096w = C12096w.this;
                    C12096w.m31040(c12096w, Class.forName(b.m31064(C12096w.m31044(c12096w))));
                    C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4.5
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C12096w.this.m31053();
                        }
                    });
                    int i3 = f29981 + 71;
                    f29982 = i3 % 128;
                    int i4 = i3 % 2;
                } catch (ClassNotFoundException e) {
                    String strIntern = m31055(17 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u0001\u0002\u0003\u0004\u0000\u0004\u0000\u0007\u0001\u0005\b\t\u0005\u0007\u000b\fx").intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m31055((Process.myPid() >> 22) + 29, (byte) (118 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u000e\r\r\n\n\u0011\r\u0000\u0011\u0001\u000e\u0006\u0004\b\u0012\u0010\u0004\f\u0010\n\u0001\u000e\u0007\u0004\u0011\u0010\r\u0013\u0096").intern());
                    sb.append(b.m31064(C12096w.m31044(C12096w.this)));
                    sb.append(m31055(ExpandableListView.getPackedPositionType(0L) + 2, (byte) (89 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u000f\u0010").intern());
                    sb.append(e.getLocalizedMessage());
                    C12085l.m30929(strIntern, sb.toString());
                }
            }

            /* JADX INFO: renamed from: ﾇ */
            private static String m31055(int i2, byte b2, String str) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C11970g.f28961) {
                    char[] cArr2 = f29979;
                    char c = f29980;
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
        int i2 = f29959 + 27;
        f29958 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m31053() {
        int i = 2 % 2;
        int i2 = f29958 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
        AbstractC12058jg.m30663().m30665(this);
        int i4 = f29959 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29958 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m31049() {
        int i = 2 % 2;
        int i2 = f29959 + 61;
        f29958 = i2 % 128;
        if (i2 % 2 == 0) {
            m31102((InterfaceC12090q) null);
            m31054((InterfaceC12061jj) null);
            AbstractC12058jg.m30663().m30666(this);
            int i3 = 10 / 0;
        } else {
            m31102((InterfaceC12090q) null);
            m31054((InterfaceC12061jj) null);
            AbstractC12058jg.m30663().m30666(this);
        }
        int i4 = f29959 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29958 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m31054(InterfaceC12061jj interfaceC12061jj) {
        int i = 2 % 2;
        int i2 = f29959;
        int i3 = i2 + 93;
        f29958 = i3 % 128;
        int i4 = i3 % 2;
        this.f29967 = interfaceC12061jj;
        int i5 = i2 + 59;
        f29958 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ */
    private InterfaceC12061jj m31026() {
        int i = 2 % 2;
        int i2 = f29959 + 17;
        int i3 = i2 % 128;
        f29958 = i3;
        int i4 = i2 % 2;
        InterfaceC12061jj interfaceC12061jj = this.f29967;
        int i5 = i3 + 31;
        f29959 = i5 % 128;
        if (i5 % 2 == 0) {
            return interfaceC12061jj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static View m31043(Activity activity) {
        int i = 2 % 2;
        int i2 = f29959 + 31;
        f29958 = i2 % 128;
        if (i2 % 2 == 0) {
            activity.findViewById(R.id.content);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        int i3 = f29959 + 85;
        f29958 = i3 % 128;
        int i4 = i3 % 2;
        return viewFindViewById;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ｋ */
    final InterfaceC12090q<WebView, Activity> mo28276() {
        int i = 2 % 2;
        int i2 = f29958 + 93;
        int i3 = i2 % 128;
        f29959 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 81;
        f29958 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12061jj
    /* JADX INFO: renamed from: ﻛ */
    public final void mo28395(final Activity activity) {
        int i = 2 % 2;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12096w.m31031(C12096w.this).mo28395(activity);
                }
            }
        });
        int i2 = f29958 + 39;
        f29959 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12061jj
    /* JADX INFO: renamed from: ｋ */
    public final void mo28396(final Activity activity) {
        int i = 2 % 2;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12096w.m31031(C12096w.this).mo28396(activity);
                }
            }
        });
        int i2 = f29959 + 35;
        f29958 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        int i = 2 % 2;
        m31038(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12096w.m31031(C12096w.this).onActivityCreated(activity, bundle);
                    C12096w.m31045();
                    C12096w.m31046(C12096w.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        C12096w.m31042(C12096w.this, bundle2.getBoolean(C12096w.m31025()));
                        if (C12096w.m31039(C12096w.this)) {
                            C12096w.m31046(C12096w.this, true);
                        }
                        C12096w.m31036(C12096w.this, true);
                        return;
                    }
                    C12096w.m31042(C12096w.this, false);
                }
            }
        });
        int i2 = f29959 + 27;
        f29958 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        int i = 2 % 2;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12096w.m31031(C12096w.this).onActivityStarted(activity);
                }
            }
        });
        int i2 = f29958 + 89;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        int i = 2 % 2;
        m31038(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.6.4
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C12096w.m31031(C12096w.this).onActivityResumed(activity);
                        }
                    });
                    C12096w.m31032(C12096w.this, false);
                    C12096w.m31046(C12096w.this, true);
                    if ((!C12096w.m31039(C12096w.this) || C12096w.m31041(C12096w.this)) && !activity.isFinishing()) {
                        C12096w c12096w = C12096w.this;
                        Activity activity2 = activity;
                        c12096w.m31050(activity2, C12096w.m44381(activity2));
                    }
                    C12096w.m31036(C12096w.this, false);
                }
            }
        });
        int i2 = f29959 + 37;
        f29958 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        int i = 2 % 2;
        m31038(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12096w.m31031(C12096w.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(C12096w.m31025(), C12096w.m31039(C12096w.this));
                    }
                    C12096w.m31032(C12096w.this, true);
                }
            }
        });
        int i2 = f29959 + 5;
        f29958 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        int i = 2 % 2;
        C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.7
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12096w.m31031(C12096w.this).onActivityPaused(activity);
                }
            }
        });
        int i2 = f29959 + 35;
        f29958 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        int i = 2 % 2;
        m31038(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.10.1
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C12096w.m31031(C12096w.this).onActivityStopped(activity);
                        }
                    });
                    if (C12096w.m31034(C12096w.this) && !C12096w.m31030(C12096w.this) && activity.isFinishing()) {
                        C12096w.this.m31047(activity);
                    }
                }
            }
        });
        int i2 = f29959 + 115;
        f29958 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        int i = 2 % 2;
        m31038(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12096w.m31035(C12096w.this, activity)) {
                    C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.w.2.1
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C12096w.m31031(C12096w.this).onActivityDestroyed(activity);
                        }
                    });
                    if (C12096w.m31034(C12096w.this) && C12096w.m31039(C12096w.this) && activity.isFinishing()) {
                        C12096w.this.m31047(activity);
                    }
                }
            }
        });
        int i2 = f29958 + 65;
        f29959 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29958 + 99;
        com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29959 = r1 % 128;
        r1 = r1 % 2;
        com.ironsource.adqualitysdk.sdk.p286i.C12089p.m30938(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.p286i.C12096w.b.m31062(r3.f29964) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.p286i.C12096w.b.m31062(r3.f29964) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        com.ironsource.adqualitysdk.sdk.p286i.C12089p.m30943(r4);
        r4 = com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29959 + 33;
        com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29958 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m31038(com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29958
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29959 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1c
            com.ironsource.adqualitysdk.sdk.i.w$b r1 = r3.f29964
            boolean r1 = com.ironsource.adqualitysdk.sdk.p286i.C12096w.b.m31062(r1)
            r2 = 22
            int r2 = r2 / 0
            r2 = 1
            if (r1 == r2) goto L31
            goto L24
        L1c:
            com.ironsource.adqualitysdk.sdk.i.w$b r1 = r3.f29964
            boolean r1 = com.ironsource.adqualitysdk.sdk.p286i.C12096w.b.m31062(r1)
            if (r1 != 0) goto L31
        L24:
            com.ironsource.adqualitysdk.sdk.p286i.C12089p.m30943(r4)
            int r4 = com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29959
            int r4 = r4 + 33
            int r1 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29958 = r1
            int r4 = r4 % r0
            return
        L31:
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29958
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12096w.f29959 = r2
            int r1 = r1 % r0
            com.ironsource.adqualitysdk.sdk.p286i.C12089p.m30938(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12096w.m31038(com.ironsource.adqualitysdk.sdk.i.it):void");
    }

    /* JADX INFO: renamed from: ｋ */
    private void m31037(Activity activity, List<WebView> list) {
        int i = 2 % 2;
        int i2 = f29959 + 115;
        f29958 = i2 % 128;
        int i3 = i2 % 2;
        C12083kh.m30884(activity, WebView.class, b.m31063(this.f29964), b.m31059(this.f29964), false, false, null, this.f29964.f30028, list);
        int i4 = f29959 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29958 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﱟ */
    private boolean m31027(Activity activity) {
        int i = 2 % 2;
        int i2 = f29959 + 1;
        f29958 = i2 % 128;
        if (i2 % 2 != 0) {
            Class<?> cls = activity.getClass();
            if (this.f29968 == null) {
                return false;
            }
            int i3 = f29958 + 47;
            f29959 = i3 % 128;
            if (i3 % 2 == 0) {
                if (b.m31067(this.f29964)) {
                    return this.f29968.equals(cls);
                }
                boolean zIsAssignableFrom = this.f29968.isAssignableFrom(cls);
                int i4 = f29959 + 23;
                f29958 = i4 % 128;
                int i5 = i4 % 2;
                return zIsAssignableFrom;
            }
            b.m31067(this.f29964);
            throw null;
        }
        activity.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    final void m31050(Activity activity, String str) {
        int i = 2 % 2;
        int i2 = f29959 + 107;
        f29958 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.f29966) {
            this.f29966 = true;
            super.mo31048(activity, str);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C12035ik.f29362, true);
            int i4 = f29958 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29959 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 4;
            }
        } catch (JSONException e) {
            String strIntern = m31033(new int[]{-1451427015, 1745665652, -230284443, -872572860, -2089725085, 1412441511, 860697711, -932376594, 221447278, 211440698}, 17 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m31033(new int[]{-1040936951, 143207795, 1381103703, -285998114, 876741963, -380441735, -1901039547, 362673366, 177653440, -518305205, 972712661, -802968553, 1487864229, -1020494281, -504938823, -749223207}, 32 - Gravity.getAbsoluteGravity(0, 0)).intern());
            sb.append(e.getLocalizedMessage());
            C12085l.m30929(strIntern, sb.toString());
        }
        super.m31074(jSONObject, activity, str);
        int i6 = f29959 + 23;
        f29958 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12097x
    /* JADX INFO: renamed from: ﻐ */
    final AbstractViewOnLayoutChangeListenerC11812ad mo28273() {
        int i = 2 % 2;
        C12099z c12099z = new C12099z();
        int i2 = f29958 + 115;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
        return c12099z;
    }

    /* JADX INFO: renamed from: ﻐ */
    final void m31047(Activity activity) {
        int i = 2 % 2;
        int i2 = f29959 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29958 = i2 % 128;
        int i3 = i2 % 2;
        super.mo31051(activity);
        this.f29966 = false;
        int i4 = f29959 + 43;
        f29958 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ */
    private static String m31029(Activity activity) {
        int i = 2 % 2;
        int i2 = f29958 + 3;
        f29959 = i2 % 128;
        int i3 = i2 % 2;
        String hexString = Integer.toHexString(activity.hashCode());
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        int i5 = f29959 + 71;
        f29958 = i5 % 128;
        int i6 = i5 % 2;
        return hexString;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.w$b */
    public class b extends AbstractC12097x.b {

        /* JADX INFO: renamed from: ﮐ */
        private static int f29998 = 1;

        /* JADX INFO: renamed from: ﱡ */
        private static long f29999 = -7201343465800299390L;

        /* JADX INFO: renamed from: ﺙ */
        private static int f30000;

        /* JADX INFO: renamed from: ﻏ */
        private static char[] f30001 = {Typography.less, 'p', 'g', 'e', 'k', 'a', 'Z', 'i', 'g', 'W', '`', 's', 'j', 'f', 'W', AbstractJsonLexerKt.END_LIST, 'n', 'g', '_', AbstractJsonLexerKt.STRING_ESC, 'c', 'n', 214, 226, 229, 247, 228, 201, 247, 229, 233, Typography.pound, 154, 164, 147, 149, 154, 158, 'y', 159, 132, 'Q', 159, 151, 149, 152, 133, 139, 156, 149, 141, 138, 145, 140, 140, 154, Typography.cent, 'X', 178, 178, 170, 147, 156, 180, Typography.plusMinus, Typography.section, 147, 'f', 203, 195, Typography.degree, 184, 199, 199, 197, 195, 197, 191, 181, 181, 186, 179, Typography.paragraph, 190, 197, 204, 'm', 213, 209, 217, 221, 222, 221, 221, 219, 217, 219, 213, 196, 200, 221, 224, Typography.times, 146, 295, 298, 283, 282, 283, 283, 301, 303, 129, 265, 270, 268, 264, 246, 250, 255, 257, 275, 268, 261, 269};

        /* JADX INFO: renamed from: ﱟ */
        private boolean f30002 = false;

        /* JADX INFO: renamed from: ﻐ */
        private int f30003;

        /* JADX INFO: renamed from: ｋ */
        private String f30004;

        /* JADX INFO: renamed from: ﾇ */
        private boolean f30005;

        /* JADX INFO: renamed from: ﾒ */
        private String f30006;

        /* JADX INFO: renamed from: ﻐ */
        static /* synthetic */ String m31059(b bVar) {
            int i = 2 % 2;
            int i2 = f30000;
            int i3 = i2 + 109;
            f29998 = i3 % 128;
            int i4 = i3 % 2;
            String str = bVar.f30006;
            int i5 = i2 + 87;
            f29998 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ */
        static /* synthetic */ boolean m31062(b bVar) {
            int i = 2 % 2;
            int i2 = f29998;
            int i3 = i2 + 49;
            f30000 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = bVar.f30002;
            int i5 = i2 + 3;
            f30000 = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        static /* synthetic */ int m31063(b bVar) {
            int i = 2 % 2;
            int i2 = f29998 + 101;
            f30000 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = bVar.f30003;
            if (i3 == 0) {
                return i4;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ */
        static /* synthetic */ String m31064(b bVar) {
            int i = 2 % 2;
            int i2 = f29998 + 19;
            int i3 = i2 % 128;
            f30000 = i3;
            int i4 = i2 % 2;
            String str = bVar.f30004;
            int i5 = i3 + 23;
            f29998 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﾒ */
        static /* synthetic */ boolean m31067(b bVar) {
            int i = 2 % 2;
            int i2 = f29998 + 15;
            f30000 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = bVar.f30005;
            if (i3 == 0) {
                return z;
            }
            throw null;
        }

        public b(C12096w c12096w, JSONObject jSONObject) {
            m31061(jSONObject.optString(m31060("惫悊䇬ꊘ\uede7촊믝䠂劗／\ue9e2㨀ҏ넇\udfc2\ue410\uf69e挓", Color.red(0)).intern()));
            m31066(jSONObject.optString(m31065("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{0, 22, 0, 0}).intern()));
            m31058(jSONObject.optInt(m31065(null, true, new int[]{22, 9, 128, 4}).intern(), -1));
            m31057(jSONObject.optBoolean(m31060("爄牡σ臒褊輹颷⳯䁸봈쪽廰ᙽ\uf327ﲯ胨\ue465ℍ⺷다멁", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern()));
            m31056(jSONObject.optBoolean(m31060("\uf588\uf5e9갔䲎붏\u20f5嗾ᡊ쟡ዲ߮橣釹峥ㇱ둪揞軡\ue3d6虴㷄\uf8d7귓", ExpandableListView.getPackedPositionChild(0L) + 1).intern()));
            m31089(jSONObject.optString(m31065(null, true, new int[]{31, 10, 48, 2}).intern()));
            m31095(TextUtils.isEmpty(jSONObject.optString(m31060("断旘\ud869\u1ccdꉅ咙֥ޓ埗暆垧疢ǅ", ViewConfiguration.getScrollDefaultDelay() >> 16).intern())) ? null : Arrays.asList(jSONObject.optString(m31060("断旘\ud869\u1ccdꉅ咙֥ޓ埗暆垧疢ǅ", TextUtils.indexOf("", "", 0)).intern()).split(m31060("翂翮獾⧪罅", ExpandableListView.getPackedPositionType(0L)).intern())));
            m31093(jSONObject.optBoolean(m31060("\ue933\ue946ꏞ䚉ᦗ⼯忨뱆\udb5eᴶී칰赆医㯕ၠ罘脬", TextUtils.getTrimmedLength("")).intern()));
            m31092(jSONObject.optBoolean(m31060("㖒㗧韩힄憄ᬘ컥쑈\u07fb⤕鳩뙹凡有\uaaf9桢ꏾ", (-1) - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), true));
            m31096(!TextUtils.isEmpty(jSONObject.optString(m31065(null, true, new int[]{31, 10, 48, 2}).intern())) || jSONObject.optBoolean(m31065("\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000", true, new int[]{41, 16, 46, 0}).intern()) || jSONObject.optBoolean(m31060("䱳䰆ᢩ⣵\u2ffe鑘㆔訯縞ꙁ掺\uf818⠑\ue854喌☍\uda28㩟螀ᐅ落䱿", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern()));
            m31094(jSONObject.optBoolean(m31065("\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000", true, new int[]{41, 16, 46, 0}).intern()));
            m31087(jSONObject.optBoolean(m31065("\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001", false, new int[]{57, 10, 62, 1}).intern()));
            m31091(jSONObject.optBoolean(m31065("\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000", false, new int[]{67, 19, 87, 0}).intern()));
            m31086(jSONObject.optBoolean(m31065("\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", false, new int[]{86, 17, 109, 4}).intern()));
            m31088(jSONObject.optBoolean(m31065("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", false, new int[]{103, 9, 188, 0}).intern()));
            m31090(C12077jz.m30804(jSONObject.optJSONArray(m31065("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", true, new int[]{112, 13, 158, 0}).intern())));
        }

        /* JADX INFO: renamed from: ﻛ */
        private b m31061(String str) {
            int i = 2 % 2;
            int i2 = f30000;
            int i3 = i2 + 65;
            f29998 = i3 % 128;
            int i4 = i3 % 2;
            this.f30004 = str;
            int i5 = i2 + 47;
            f29998 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        private b m31066(String str) {
            int i = 2 % 2;
            int i2 = f30000;
            int i3 = i2 + 49;
            f29998 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f30006 = str;
                int i4 = i2 + 85;
                f29998 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f30006 = str;
            throw null;
        }

        /* JADX INFO: renamed from: ﻐ */
        private b m31058(int i) {
            int i2 = 2 % 2;
            int i3 = f30000 + 103;
            f29998 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f30003 = i;
                int i4 = 78 / 0;
                return this;
            }
            this.f30003 = i;
            return this;
        }

        /* JADX INFO: renamed from: ﻏ */
        private b m31057(boolean z) {
            int i = 2 % 2;
            int i2 = f29998;
            int i3 = i2 + 67;
            f30000 = i3 % 128;
            int i4 = i3 % 2;
            this.f30005 = z;
            int i5 = i2 + 77;
            f30000 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﮐ */
        private b m31056(boolean z) {
            int i = 2 % 2;
            int i2 = f30000;
            int i3 = i2 + 43;
            f29998 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f30002 = z;
                int i4 = 87 / 0;
            } else {
                this.f30002 = z;
            }
            int i5 = i2 + 95;
            f29998 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        private static String m31060(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11943f.f28848) {
                char[] cArrM30189 = C11943f.m30189(f29999, cArr, i);
                C11943f.f28846 = 4;
                while (C11943f.f28846 < cArrM30189.length) {
                    C11943f.f28847 = C11943f.f28846 - 4;
                    cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29999));
                    C11943f.f28846++;
                }
                str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾇ */
        private static String m31065(String str, boolean z, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f30001, i, cArr, 0, i2);
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
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m31033(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29960.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
