package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ad */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractViewOnLayoutChangeListenerC11812ad<T> extends AbstractC12098y<WebView, T> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﮉ */
    private static int f26948 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static int f26949;

    /* JADX INFO: renamed from: ﺙ */
    private static int[] f26950 = {1744796226, -450852452, 2014668702, -1227941146, 2045799694, -209853617, 1023477377, 1147173089, -198831909, -2105953951, -205746147, -833695448, 2021654314, 1921580409, 1495977678, 1742103526, -1554017922, -568195793};

    /* JADX INFO: renamed from: ﮐ */
    private C12067jp f26951;

    /* JADX INFO: renamed from: ﱡ */
    private Map<WebView, C12070js> f26952 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻏ */
    private List<InterfaceC12062jk> f26953 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ */
    private String f26954;

    /* JADX INFO: renamed from: ﻛ */
    private List<String> f26955;

    /* JADX INFO: renamed from: ｋ */
    private C12070js f26956;

    /* JADX INFO: renamed from: ﾇ */
    private boolean f26957;

    /* JADX INFO: renamed from: ﾒ */
    private boolean f26958;

    /* JADX INFO: renamed from: ｋ */
    abstract T mo28200(WebView webView);

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ List m28287(AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad) {
        int i = 2 % 2;
        int i2 = f26948 + 71;
        int i3 = i2 % 128;
        f26949 = i3;
        int i4 = i2 % 2;
        List<String> list = abstractViewOnLayoutChangeListenerC11812ad.f26955;
        int i5 = i3 + 9;
        f26948 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m28292(AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad, WebView webView) {
        int i = 2 % 2;
        int i2 = f26948 + 71;
        f26949 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        abstractViewOnLayoutChangeListenerC11812ad.m28288(webView);
        if (i3 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f26949 + 37;
        f26948 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ boolean m28293(AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad) {
        int i = 2 % 2;
        int i2 = f26948 + 7;
        f26949 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = abstractViewOnLayoutChangeListenerC11812ad.f26957;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ C11834az.b m28294(AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad) {
        int i = 2 % 2;
        int i2 = f26948 + 51;
        f26949 = i2 % 128;
        if (i2 % 2 == 0) {
            return abstractViewOnLayoutChangeListenerC11812ad.m28297();
        }
        abstractViewOnLayoutChangeListenerC11812ad.m28297();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ JSONObject m28299(String str) {
        int i = 2 % 2;
        int i2 = f26948 + 113;
        f26949 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM28291 = m28291(str);
        int i4 = f26949 + 59;
        f26948 = i4 % 128;
        if (i4 % 2 != 0) {
            return jSONObjectM28291;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12098y, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﻛ */
    public final /* synthetic */ void mo28227(JSONObject jSONObject, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f26949 + 115;
        f26948 = i2 % 128;
        int i3 = i2 % 2;
        m28306(jSONObject, (WebView) obj, obj2);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12098y, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ｋ */
    public final /* synthetic */ void mo28229(JSONObject jSONObject, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = f26949 + 41;
        f26948 = i2 % 128;
        int i3 = i2 % 2;
        m28290(jSONObject, (WebView) obj, obj2);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = f26948 + 43;
        f26949 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    final void m28302(String str, List<String> list, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        this.f26958 = z;
        this.f26951 = new C12067jp(str, z3);
        this.f26957 = z2;
        this.f26955 = list;
        int i2 = f26948 + 87;
        f26949 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28303() {
        int i = 2 % 2;
        int i2 = f26948 + 9;
        f26949 = i2 % 128;
        int i3 = i2 % 2;
        for (WebView webView : this.f26952.keySet()) {
            webView.removeOnLayoutChangeListener(this);
            C12070js c12070js = this.f26952.get(webView);
            Iterator<InterfaceC12062jk> it = this.f26953.iterator();
            while (it.hasNext()) {
                int i4 = f26948 + 49;
                f26949 = i4 % 128;
                int i5 = i4 % 2;
                c12070js.m30738(it.next());
                int i6 = f26948 + 27;
                f26949 = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = f26949 + 85;
            f26948 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 3;
            }
        }
        this.f26953.clear();
        this.f26956 = null;
        this.f26952.clear();
        int i10 = f26948 + 13;
        f26949 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final WebView m28300() {
        int i = 2 % 2;
        int i2 = f26948;
        int i3 = i2 + 69;
        f26949 = i3 % 128;
        int i4 = i3 % 2;
        C12070js c12070js = this.f26956;
        if (c12070js != null) {
            int i5 = i2 + 95;
            f26949 = i5 % 128;
            if (i5 % 2 == 0) {
                return c12070js.m30739();
            }
            int i6 = 30 / 0;
            return c12070js.m30739();
        }
        int i7 = i2 + 11;
        f26949 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private C11834az.b m28297() {
        int i = 2 % 2;
        int i2 = f26948;
        int i3 = i2 + 107;
        f26949 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            C12070js c12070js = this.f26956;
            if (c12070js == null) {
                int i4 = i2 + 83;
                f26949 = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            C11834az.b bVarM30735 = c12070js.m30735();
            int i6 = f26948 + 91;
            f26949 = i6 % 128;
            if (i6 % 2 == 0) {
                return bVarM30735;
            }
            throw null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006b A[PHI: r0
  0x006b: PHI (r0v7 com.ironsource.adqualitysdk.sdk.i.js) = (r0v6 com.ironsource.adqualitysdk.sdk.i.js), (r0v12 com.ironsource.adqualitysdk.sdk.i.js) binds: [B:15:0x0069, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ */
    public final void m28305(WebView webView) {
        C12070js c12070jsM30734;
        int i = 2 % 2;
        int i2 = f26948 + 77;
        int i3 = i2 % 128;
        f26949 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (webView != null) {
            int i4 = i3 + 31;
            f26948 = i4 % 128;
            if (i4 % 2 == 0) {
                this.f26952.containsKey(webView);
                super.hashCode();
                throw null;
            }
            if (this.f26952.containsKey(webView)) {
                return;
            }
            int i5 = f26949 + 11;
            f26948 = i5 % 128;
            if (i5 % 2 == 0) {
                c12070jsM30734 = C12070js.m30734(webView, m28298(new int[]{1485334185, -856498753, -981725285, 821310668, 1318695091, -517082689}, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE >>> (ViewConfiguration.getMaximumDrawingCacheSize() + 46)).intern());
                if (this.f26956 == null) {
                    this.f26956 = c12070jsM30734;
                }
            } else {
                c12070jsM30734 = C12070js.m30734(webView, m28298(new int[]{1485334185, -856498753, -981725285, 821310668, 1318695091, -517082689}, 9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                if (this.f26956 == null) {
                    this.f26956 = c12070jsM30734;
                }
            }
            this.f26952.put(webView, c12070jsM30734);
            InterfaceC12062jk interfaceC12062jkM28295 = m28295();
            this.f26953.add(interfaceC12062jkM28295);
            c12070jsM30734.m30740(interfaceC12062jkM28295);
            m28288(webView);
            webView.addOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WebView webView;
        int i9 = 2 % 2;
        int i10 = f26948;
        int i11 = i10 + 39;
        f26949 = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                int i12 = 23 / 0;
                if (!(view instanceof WebView)) {
                    return;
                }
            } else if (!(view instanceof WebView)) {
                return;
            }
            int i13 = i10 + 77;
            f26949 = i13 % 128;
            if (i13 % 2 != 0) {
                webView = (WebView) view;
                int i14 = 80 / 0;
                if (!this.f26952.containsKey(webView)) {
                    return;
                }
            } else {
                webView = (WebView) view;
                if (!this.f26952.containsKey(webView)) {
                    return;
                }
            }
            int i15 = f26948 + 75;
            f26949 = i15 % 128;
            if (i15 % 2 == 0) {
                m28288(webView);
            } else {
                m28288(webView);
                throw null;
            }
        } catch (Throwable th) {
            C12080kb.m30845(m28298(new int[]{-1222378178, -876583080, 1814351834, -1442738548, -451326607, -1966318288, -1006451602, 496656659}, 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m28298(new int[]{-1195931978, -334175702, 1427798232, -335683535, 1830190642, -1540871820, -251372157, 849098424, 962893223, 189155157, -1839734926, 1283557719}, 22 - ImageFormat.getBitsPerPixel(0)).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28301(List<WebView> list) {
        int i = 2 % 2;
        int i2 = f26948 + 41;
        f26949 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
            if (list == null) {
                return;
            }
        } else if (list == null) {
            return;
        }
        Iterator<WebView> it = list.iterator();
        while (it.hasNext()) {
            int i4 = f26949 + 85;
            f26948 = i4 % 128;
            if (i4 % 2 != 0) {
                m28305(it.next());
                int i5 = f26949 + 39;
                f26948 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                m28305(it.next());
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ad$3, reason: invalid class name */
    final class AnonymousClass3 implements InterfaceC12062jk {

        /* JADX INFO: renamed from: ﻐ */
        private static int f26959 = 1;

        /* JADX INFO: renamed from: ﻛ */
        private static int f26960 = 0;

        /* JADX INFO: renamed from: ﾇ */
        private static long f26961 = -2180627017938305695L;

        /* JADX INFO: renamed from: ﾒ */
        private static long f26962 = 9054291176946501344L;

        AnonymousClass3() {
        }

        /* JADX INFO: renamed from: ﾇ */
        static /* synthetic */ void m28309(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z) {
            int i = 2 % 2;
            int i2 = f26960 + 9;
            f26959 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass3.m28308(webView, str, z);
            int i4 = f26959 + 43;
            f26960 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12062jk
        /* JADX INFO: renamed from: ﾇ */
        public final void mo28314(WebView webView, String str, String str2) {
            int i = 2 % 2;
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (strSubstring.equals(m28307("菤莗片ﳙ鯲轒ٹ瘁掲緒", 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                AbstractViewOnLayoutChangeListenerC11812ad.m28292(AbstractViewOnLayoutChangeListenerC11812ad.this, webView);
                return;
            }
            if (strSubstring.equals(m28307("옍왾抈籂돝龝蛢㏨䮝洚", 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                JSONObject jSONObjectM28299 = AbstractViewOnLayoutChangeListenerC11812ad.m28299(strSubstring2);
                AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad = AbstractViewOnLayoutChangeListenerC11812ad.this;
                abstractViewOnLayoutChangeListenerC11812ad.m28306(jSONObjectM28299, webView, abstractViewOnLayoutChangeListenerC11812ad.mo28200(webView));
                int i2 = f26960 + 3;
                f26959 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 61 / 0;
                    return;
                }
                return;
            }
            if (strSubstring.equals(m28310("蚓ꤕ\ud980ࠀ㢅欄", 12162 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                JSONObject jSONObjectM282910 = AbstractViewOnLayoutChangeListenerC11812ad.m28299(strSubstring2);
                AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad2 = AbstractViewOnLayoutChangeListenerC11812ad.this;
                abstractViewOnLayoutChangeListenerC11812ad2.mo28232(jSONObjectM282910, webView, AbstractViewOnLayoutChangeListenerC11812ad.m28294(abstractViewOnLayoutChangeListenerC11812ad2), AbstractViewOnLayoutChangeListenerC11812ad.this.mo28200(webView));
            } else {
                if (strSubstring.equals(m28310("蚓湱坈㰬┕ૺ", 59621 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    JSONObject jSONObjectM282911 = AbstractViewOnLayoutChangeListenerC11812ad.m28299(strSubstring2);
                    jSONObjectM282911.remove(C12035ik.f29407);
                    AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad3 = AbstractViewOnLayoutChangeListenerC11812ad.this;
                    abstractViewOnLayoutChangeListenerC11812ad3.mo28230(jSONObjectM282911, webView, abstractViewOnLayoutChangeListenerC11812ad3.mo28200(webView));
                    return;
                }
                if (strSubstring.equals(m28310("蚓헕\u2000罀쮅⛁", 21313 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    JSONObject jSONObjectM282912 = AbstractViewOnLayoutChangeListenerC11812ad.m28299(strSubstring2);
                    C12080kb.m30839(jSONObjectM282912.optString(m28310("蚔Ȩ迕", 33961 - KeyEvent.getDeadChar(0, 0)).intern()), jSONObjectM282912.optString(m28310("蚅\uf707斧투䃓", 29077 - Color.argb(0, 0, 0, 0)).intern()), jSONObjectM282912.optString(m28307("⑦␃ˢ씲擕\ufff1㾓톆鲙൱", Color.rgb(0, 0, 0) + 16777217).intern()), jSONObjectM282912.optString(m28310("蚅띕\ue51dᏁ䆗", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12743).intern()));
                }
                int i4 = f26960 + 53;
                f26959 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12062jk
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28312(final WebView webView, final String str, final boolean z) {
            int i = 2 % 2;
            C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.3.1
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    if (AbstractViewOnLayoutChangeListenerC11812ad.m28293(AbstractViewOnLayoutChangeListenerC11812ad.this)) {
                        if (AbstractViewOnLayoutChangeListenerC11812ad.m28287(AbstractViewOnLayoutChangeListenerC11812ad.this) == null || AbstractViewOnLayoutChangeListenerC11812ad.m28287(AbstractViewOnLayoutChangeListenerC11812ad.this).isEmpty()) {
                            AnonymousClass3.m28309(AnonymousClass3.this, webView, str, z);
                            return;
                        }
                        Iterator it = AbstractViewOnLayoutChangeListenerC11812ad.m28287(AbstractViewOnLayoutChangeListenerC11812ad.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m28309(AnonymousClass3.this, webView, str, z);
                                return;
                            }
                        }
                    }
                }
            });
            int i2 = f26959 + 55;
            f26960 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12062jk
        /* JADX INFO: renamed from: ｋ */
        public final void mo28313(WebView webView) {
            int i = 2 % 2;
            int i2 = f26959 + 39;
            f26960 = i2 % 128;
            if (i2 % 2 != 0) {
                AbstractViewOnLayoutChangeListenerC11812ad.m28292(AbstractViewOnLayoutChangeListenerC11812ad.this, webView);
                int i3 = 47 / 0;
            } else {
                AbstractViewOnLayoutChangeListenerC11812ad.m28292(AbstractViewOnLayoutChangeListenerC11812ad.this, webView);
            }
            int i4 = f26960 + 43;
            f26959 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
        }

        /* JADX INFO: renamed from: ﾇ */
        private void m28308(final WebView webView, final String str, final boolean z) {
            int i = 2 % 2;
            C12089p.m30943(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.3.4
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo28200 = AbstractViewOnLayoutChangeListenerC11812ad.this.mo28200(webView);
                    C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ad.3.4.4

                        /* JADX INFO: renamed from: ﮐ */
                        private static char f26972 = 63581;

                        /* JADX INFO: renamed from: ﱟ */
                        private static int f26973 = 0;

                        /* JADX INFO: renamed from: ﱡ */
                        private static int f26974 = 1;

                        /* JADX INFO: renamed from: ﺙ */
                        private static char f26975 = 25689;

                        /* JADX INFO: renamed from: ﾇ */
                        private static char f26976 = 45748;

                        /* JADX INFO: renamed from: ﾒ */
                        private static char f26977 = 28145;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            int i2 = 2 % 2;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(C12035ik.f29396, str);
                                jSONObject.put(C12035ik.f29398, m28315("⏸䘁䙢↯", TextUtils.getOffsetAfter("", 0) + 3).intern());
                                jSONObject.put(C12035ik.f29408, originalUrl);
                                if (z) {
                                    int i3 = f26974 + 45;
                                    f26973 = i3 % 128;
                                    jSONObject.put(i3 % 2 != 0 ? C12035ik.f29409 : C12035ik.f29409, true);
                                }
                                int i4 = f26974 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                                f26973 = i4 % 128;
                                int i5 = i4 % 2;
                            } catch (JSONException e) {
                                String strIntern = m28315("焻藸壭윁쀍祉皕꿞\udc1f䏃ወ蜎縉죴떓\ud96f", Process.getGidForName("") + 17).intern();
                                StringBuilder sb = new StringBuilder();
                                sb.append(m28315("㥶ጂ䘣쁇퇒⍣ꊳ㢚쁽氏⫵㌧膁砛坕\ued9c↽빙䄷㩎\uec99猬灢懶\ue8fd㹟\udfc6冟", View.MeasureSpec.getMode(0) + 27).intern());
                                sb.append(e.getLocalizedMessage());
                                C12085l.m30929(strIntern, sb.toString());
                            }
                            AbstractViewOnLayoutChangeListenerC11812ad.this.mo28226(jSONObject, webView, AbstractViewOnLayoutChangeListenerC11812ad.m28294(AbstractViewOnLayoutChangeListenerC11812ad.this), objMo28200);
                        }

                        /* JADX INFO: renamed from: ﾇ */
                        private static String m28315(String str2, int i2) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (C12078k.f29776) {
                                char[] cArr2 = new char[cArr.length];
                                C12078k.f29775 = 0;
                                char[] cArr3 = new char[2];
                                while (C12078k.f29775 < cArr.length) {
                                    cArr3[0] = cArr[C12078k.f29775];
                                    cArr3[1] = cArr[C12078k.f29775 + 1];
                                    int i3 = 58224;
                                    for (int i4 = 0; i4 < 16; i4++) {
                                        char c = cArr3[1];
                                        char c2 = cArr3[0];
                                        char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f26975)) ^ ((c2 >>> 5) + f26972)));
                                        cArr3[1] = c3;
                                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f26977) ^ ((c3 + i3) ^ ((c3 << 4) + f26976))));
                                        i3 -= 40503;
                                    }
                                    cArr2[C12078k.f29775] = cArr3[0];
                                    cArr2[C12078k.f29775 + 1] = cArr3[1];
                                    C12078k.f29775 += 2;
                                }
                                str3 = new String(cArr2, 0, i2);
                            }
                            return str3;
                        }
                    });
                }
            });
            int i2 = f26960 + 67;
            f26959 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12062jk
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28311(WebView webView, String str) {
            int i = 2 % 2;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C12035ik.f29405, str);
                jSONObject.put(C12035ik.f29401, C12035ik.f29400);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C12035ik.f29406, jSONObject);
                AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad = AbstractViewOnLayoutChangeListenerC11812ad.this;
                abstractViewOnLayoutChangeListenerC11812ad.mo28228(jSONObject2, webView, this, abstractViewOnLayoutChangeListenerC11812ad.mo28200(webView));
                int i2 = f26959 + 37;
                f26960 = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                C12080kb.m30845(m28307("霋靜\ue621鹺생ᬥ據拦㢨\ue9a5铫핎籧\uf304腱\udbed矣욤뿱\ue075", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern(), m28307("糷粲\ueb02\uda2e秊ᘑ\u209e褁Ǚ\ue4d4킻\uec0c鞚︙씠\ue29b鰕쮛ﯰ\ud901ꪄ씃\uf06c쾏뜕\ude81\ue6a6숚뷏ꠂ鬷뢍쨅", 1 - ExpandableListView.getPackedPositionType(0L)).intern(), (Throwable) e, false);
            }
        }

        /* JADX INFO: renamed from: ﾇ */
        private static String m28307(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11943f.f28848) {
                char[] cArrM30189 = C11943f.m30189(f26961, cArr, i);
                C11943f.f28846 = 4;
                while (C11943f.f28846 < cArrM30189.length) {
                    C11943f.f28847 = C11943f.f28846 - 4;
                    cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f26961));
                    C11943f.f28846++;
                }
                str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m28310(String str, int i) {
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
                    cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f26962);
                    C11997h.f29103++;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private InterfaceC12062jk m28295() {
        int i = 2 % 2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        int i2 = f26949 + 65;
        f26948 = i2 % 128;
        if (i2 % 2 != 0) {
            return anonymousClass3;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28288(WebView webView) {
        int i = 2 % 2;
        int i2 = f26949 + 107;
        f26948 = i2 % 128;
        int i3 = i2 % 2;
        C12070js c12070js = this.f26952.get(webView);
        if (this.f26958) {
            int i4 = f26948 + 69;
            f26949 = i4 % 128;
            int i5 = i4 % 2;
            if (c12070js.m30736()) {
                if (!C12084ki.m30903(webView)) {
                    c12070js.m30741();
                }
                m28289(webView);
            }
        }
        int i6 = f26948 + 93;
        f26949 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m28289(WebView webView) {
        int i = 2 % 2;
        int i2 = f26949 + 3;
        f26948 = i2 % 128;
        int i3 = i2 % 2;
        this.f26951.m30721(webView);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static JSONObject m28291(String str) {
        int i = 2 % 2;
        int i2 = f26948 + 107;
        f26949 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strDecode = URLDecoder.decode(str, m28298(new int[]{-1527038340, -2009275168, 1655900764, -1212129633}, (ViewConfiguration.getTapTimeout() >> 16) + 5).intern());
            if (!TextUtils.isEmpty(strDecode)) {
                return new JSONObject(strDecode);
            }
        } catch (Exception e) {
            C12085l.m30922(m28298(new int[]{-1222378178, -876583080, 1814351834, -1442738548, -451326607, -1966318288, -1006451602, 496656659}, 16 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m28298(new int[]{-1195931978, -334175702, -1194960438, 648090826, -1839165238, -1852402956, -889475191, 1782537489, 853760359, 1069576083}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17).intern(), e);
        }
        JSONObject jSONObject = new JSONObject();
        int i4 = f26949 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f26948 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m28304(String str) {
        int i = 2 % 2;
        int i2 = f26948 + 7;
        f26949 = i2 % 128;
        int i3 = i2 % 2;
        this.f26954 = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12098y
    /* JADX INFO: renamed from: ﻐ */
    public final String mo28218(T t) {
        String str;
        int i = 2 % 2;
        int i2 = f26948 + 3;
        int i3 = i2 % 128;
        f26949 = i3;
        if (i2 % 2 != 0) {
            str = this.f26954;
            int i4 = 61 / 0;
        } else {
            str = this.f26954;
        }
        int i5 = i3 + 3;
        f26948 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m28296(JSONObject jSONObject, WebView webView) {
        int i = 2 % 2;
        if (webView != null) {
            try {
                String str = C12035ik.f29368;
                boolean z = false;
                if (webView.getWindowToken() != null) {
                    int i2 = f26949 + 97;
                    f26948 = i2 % 128;
                    if (i2 % 2 != 0) {
                        z = true;
                    }
                }
                jSONObject.put(str, z);
                int i3 = f26949 + 7;
                f26948 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m28306(JSONObject jSONObject, WebView webView, T t) {
        int i = 2 % 2;
        int i2 = f26949 + 47;
        f26948 = i2 % 128;
        if (i2 % 2 != 0) {
            m28296(jSONObject, webView);
            super.mo28227(jSONObject, webView, (Object) t);
        } else {
            m28296(jSONObject, webView);
            super.mo28227(jSONObject, webView, (Object) t);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m28290(JSONObject jSONObject, WebView webView, T t) {
        int i = 2 % 2;
        int i2 = f26948 + 47;
        f26949 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObject.remove(C12035ik.f29407);
            super.mo28229(jSONObject, webView, t);
            int i3 = 59 / 0;
        } else {
            jSONObject.remove(C12035ik.f29407);
            super.mo28229(jSONObject, webView, t);
        }
        int i4 = f26948 + 13;
        f26949 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28298(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f26950.clone();
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
