package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ki */
/* JADX INFO: loaded from: classes6.dex */
public final class C12084ki {

    /* JADX INFO: renamed from: ﮐ */
    private static int[] f29816 = null;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29817 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static b f29818 = null;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29819 = 1;

    /* JADX INFO: renamed from: ﻏ */
    private static b f29820;

    /* JADX INFO: renamed from: ﻐ */
    private static boolean f29821;

    /* JADX INFO: renamed from: ﻛ */
    private static boolean f29822;

    /* JADX INFO: renamed from: ｋ */
    private static boolean f29823;

    /* JADX INFO: renamed from: ﾇ */
    private static boolean f29824;

    /* JADX INFO: renamed from: ﾒ */
    private static boolean f29825;

    /* JADX INFO: renamed from: ｋ */
    static void m30894() {
        f29816 = new int[]{572490813, 2009312423, -73331302, -1107042549, 1549256008, 442818944, 662141075, -2065580501, -433440628, -507300157, -799660937, 339869528, 1904914047, 593073813, -1658930257, -1465407677, 1975646897, -179689267};
    }

    static {
        m30894();
        f29822 = true;
        f29824 = true;
        f29821 = true;
        byte b2 = 0;
        f29825 = false;
        f29823 = false;
        f29818 = new b(b2);
        f29820 = new b(b2);
        int i = f29819 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29817 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static synchronized C11830av m30896() {
        C11830av c11830avMo28485;
        int i = 2 % 2;
        int i2 = f29817 + 7;
        f29819 = i2 % 128;
        int i3 = i2 % 2;
        c11830avMo28485 = AbstractC11823ao.m28472().mo28485();
        int i4 = f29819 + 105;
        f29817 = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return c11830avMo28485;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30901(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f29819 + 109;
        f29817 = i2 % 128;
        int i3 = i2 % 2;
        if (webView != null) {
            if (webView.getHandler() == null) {
                int i4 = f29819 + 17;
                f29817 = i4 % 128;
                int i5 = i4 % 2;
                if (webView.getRootView() == null) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m30900(new int[]{1731581501, -838679401, -962713829, -28957766, -1565506533, -2114013471, -348964882, -1399514943, -1013429029, 1685033041, -177388392, -1151291045}, ImageFormat.getBitsPerPixel(0) + 23).intern());
            sb.append(str);
            sb.append(m30900(new int[]{-363502453, -631260263}, 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            webView.loadUrl(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static WebViewClient m30887(WebView webView) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 26 || !m30896().m28598() || (!m30895(webView.getContext()))) {
            InterfaceC12018hu<WebViewClient> interfaceC12018huM30885 = m30885(webView);
            if (interfaceC12018huM30885 == null) {
                throw new RuntimeException(m30900(new int[]{713715436, -930892904, -1348069734, -2057761997, 507687719, 1887614681, 543828923, -92369980, -2022429800, 73540494, -1182221637, 426603829, 1905047678, 1651970994, -862110120, 1832493485, -1074232263, 267542591}, 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
            }
            WebViewClient webViewClientMo30359 = interfaceC12018huM30885.mo30359();
            int i2 = f29817 + 107;
            f29819 = i2 % 128;
            int i3 = i2 % 2;
            return webViewClientMo30359;
        }
        int i4 = f29817 + 115;
        f29819 = i4 % 128;
        if (i4 % 2 != 0) {
            return webView.getWebViewClient();
        }
        webView.getWebViewClient();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX INFO: renamed from: ｋ */
    public static WebChromeClient m30890(WebView webView) {
        WebChromeClient webChromeClient;
        InterfaceC12018hu<WebChromeClient> interfaceC12018huM30897;
        int i = 2 % 2;
        int i2 = f29817 + 83;
        f29819 = i2 % 128;
        if (i2 % 2 != 0 ? Build.VERSION.SDK_INT < 26 : Build.VERSION.SDK_INT < 91) {
            interfaceC12018huM30897 = m30897(webView);
            if (interfaceC12018huM30897 != null) {
                throw new RuntimeException(m30900(new int[]{713715436, -930892904, -1348069734, -2057761997, 507687719, 1887614681, 543828923, -92369980, 95336683, -341953502, -1952976082, -1605635235, -2104068033, 1753688595, -1972149808, 161784927, -506219821, -923294432}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 35).intern());
            }
            webChromeClient = interfaceC12018huM30897.mo30359();
        } else {
            int i3 = f29817 + 33;
            f29819 = i3 % 128;
            if (i3 % 2 == 0) {
                m30896().m28596();
                throw null;
            }
            if (m30896().m28596() && m30902(webView.getContext())) {
                webChromeClient = webView.getWebChromeClient();
            } else {
                interfaceC12018huM30897 = m30897(webView);
                if (interfaceC12018huM30897 != null) {
                    throw new RuntimeException(m30900(new int[]{713715436, -930892904, -1348069734, -2057761997, 507687719, 1887614681, 543828923, -92369980, 95336683, -341953502, -1952976082, -1605635235, -2104068033, 1753688595, -1972149808, 161784927, -506219821, -923294432}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 35).intern());
                }
                webChromeClient = interfaceC12018huM30897.mo30359();
            }
        }
        int i4 = f29817 + 5;
        f29819 = i4 % 128;
        int i5 = i4 % 2;
        return webChromeClient;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static boolean m30903(WebView webView) {
        int i = 2 % 2;
        int i2 = f29819 + 107;
        f29817 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = m30887(webView) instanceof C12008hk;
        int i4 = f29817 + 43;
        f29819 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static InterfaceC12018hu<WebViewClient> m30885(WebView webView) {
        int i = 2 % 2;
        int i2 = f29817 + 17;
        f29819 = i2 % 128;
        if (i2 % 2 != 0) {
            m30886(webView.getContext());
            InterfaceC12018hu<WebViewClient> interfaceC12018huM30891 = m30891(webView, m30899(), f29818);
            int i3 = f29819 + 41;
            f29817 = i3 % 128;
            int i4 = i3 % 2;
            return interfaceC12018huM30891;
        }
        m30886(webView.getContext());
        m30891(webView, m30899(), f29818);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static InterfaceC12018hu<WebChromeClient> m30897(WebView webView) {
        int i = 2 % 2;
        int i2 = f29819 + 21;
        f29817 = i2 % 128;
        if (i2 % 2 != 0) {
            m30886(webView.getContext());
            int i3 = 52 / 0;
            return m30891(webView, m30888(), f29820);
        }
        m30886(webView.getContext());
        return m30891(webView, m30888(), f29820);
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m30886(Context context) {
        int i = 2 % 2;
        int i2 = f29819 + 41;
        f29817 = i2 % 128;
        int i3 = i2 % 2;
        if (f29822) {
            f29822 = false;
            try {
                WebView webView = new WebView(context);
                C12008hk c12008hk = new C12008hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.2
                });
                webView.setWebViewClient(c12008hk);
                C12005hh c12005hh = new C12005hh(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.4
                });
                webView.setWebChromeClient(c12005hh);
                f29818 = m30889(webView, c12008hk, m30899());
                f29820 = m30889(webView, c12005hh, m30888());
                return;
            } catch (Throwable th) {
                C12080kb.m30845(m30900(new int[]{-2056936911, 1523922972, 944979816, -266843068, -696704963, 1445544646}, 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), m30900(new int[]{-1171205081, -1746562491, -609481060, 1710836426, -238078218, 1278803175, -1622243820, 1517848814, 1695627741, 873323202, 1111216600, 1233647862, -1484232956, -1475271250, 1349963251, 1304271208}, 32 - Color.red(0)).intern(), th, false);
            }
        }
        int i4 = f29817 + 55;
        f29819 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static boolean m30895(Context context) {
        boolean z;
        int i = 2 % 2;
        if (f29824) {
            try {
                f29824 = false;
                WebView webView = new WebView(context);
                C12008hk c12008hk = new C12008hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.3
                });
                webView.setWebViewClient(c12008hk);
                if (c12008hk == webView.getWebViewClient()) {
                    int i2 = f29819 + 67;
                    f29817 = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                f29825 = z;
                int i4 = f29817 + 111;
                f29819 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                C12080kb.m30845(m30900(new int[]{-2056936911, 1523922972, 944979816, -266843068, -696704963, 1445544646}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11).intern(), m30900(new int[]{-1171205081, -1746562491, -609481060, 1710836426, -238078218, 1278803175, 1613663778, -455761501, -1759314491, 1754316502, 858176925, 1113062475, -1076462114, -554492634, 1783347677, 2006115855, -817058923, -2137316585}, 36 - KeyEvent.normalizeMetaState(0)).intern(), th, false);
            }
        }
        return f29825;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static boolean m30902(Context context) {
        int i = 2 % 2;
        if (f29821) {
            boolean z = false;
            f29821 = false;
            WebView webView = new WebView(context);
            C12005hh c12005hh = new C12005hh(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.5
            });
            webView.setWebChromeClient(c12005hh);
            if (c12005hh == webView.getWebChromeClient()) {
                int i2 = f29819;
                int i3 = i2 + 55;
                f29817 = i3 % 128;
                z = i3 % 2 == 0;
                int i4 = i2 + 115;
                f29817 = i4 % 128;
                int i5 = i4 % 2;
            }
            f29823 = z;
        }
        return f29823;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static <T> b m30889(WebView webView, T t, InterfaceC12021hx interfaceC12021hx) {
        int i = 2 % 2;
        b bVar = new b((byte) 0);
        InterfaceC12018hu interfaceC12018huM30892 = m30892(webView, interfaceC12021hx, m30896().m28600(), m30896().m28597());
        if (interfaceC12018huM30892 != null) {
            Object objMo30359 = interfaceC12018huM30892.mo30359();
            if (objMo30359 != t) {
                InterfaceC12018hu interfaceC12018huM30898 = m30898(objMo30359, interfaceC12021hx, m30896().m28601(), m30896().m28599());
                if (interfaceC12018huM30898 != null && interfaceC12018huM30898.mo30359() == t) {
                    bVar.m30907();
                    int i2 = f29817 + 59;
                    f29819 = i2 % 128;
                    int i3 = i2 % 2;
                }
            } else {
                int i4 = f29819 + 17;
                f29817 = i4 % 128;
                int i5 = i4 % 2;
                bVar.m30906();
                return bVar;
            }
        }
        return bVar;
    }

    /* JADX INFO: renamed from: ｋ */
    private static <T> InterfaceC12018hu<T> m30891(WebView webView, InterfaceC12021hx interfaceC12021hx, b bVar) {
        int i = 2 % 2;
        Object obj = null;
        try {
            if (!(!bVar.m30905())) {
                int i2 = f29819 + 11;
                f29817 = i2 % 128;
                if (i2 % 2 != 0) {
                    m30892(webView, interfaceC12021hx, m30896().m28600(), m30896().m28597());
                    bVar.m30908();
                    throw null;
                }
                InterfaceC12018hu<T> interfaceC12018huM30892 = m30892(webView, interfaceC12021hx, m30896().m28600(), m30896().m28597());
                if (!(!bVar.m30908())) {
                    int i3 = f29819 + 53;
                    f29817 = i3 % 128;
                    if (i3 % 2 != 0) {
                        super.hashCode();
                        throw null;
                    }
                    if (interfaceC12018huM30892 != null) {
                        T tMo30359 = interfaceC12018huM30892.mo30359();
                        if (tMo30359 != null && !tMo30359.getClass().equals(interfaceC12018huM30892.mo30360().getType())) {
                            interfaceC12018huM30892 = m30898(tMo30359, interfaceC12021hx, m30896().m28601(), m30896().m28599());
                        }
                        int i4 = f29819 + 17;
                        f29817 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return interfaceC12018huM30892;
                        }
                        throw null;
                    }
                }
                int i5 = f29819 + 79;
                f29817 = i5 % 128;
                int i6 = i5 % 2;
                return interfaceC12018huM30892;
            }
        } catch (Throwable th) {
            C12080kb.m30845(m30900(new int[]{-2056936911, 1523922972, 944979816, -266843068, -696704963, 1445544646}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11).intern(), m30900(new int[]{-1171205081, -1746562491, 1215453270, 737380597, 1490017770, -161656803, 1885117070, 1003413336, -817058923, -2137316585, 755443035, -398138934, 1051570258, -205759848}, 'J' - AndroidCharacter.getMirror('0')).intern(), th, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static <T> InterfaceC12018hu<T> m30892(WebView webView, InterfaceC12021hx interfaceC12021hx, List<String> list, int i) {
        int i2 = 2 % 2;
        int i3 = f29819 + 107;
        f29817 = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC12018hu<T> interfaceC12018huM30893 = m30893((Object) webView, interfaceC12021hx, list, i);
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
        int i6 = f29819 + 113;
        f29817 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 48 / 0;
        }
        return interfaceC12018huM30893;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static <T> InterfaceC12018hu<T> m30898(T t, InterfaceC12021hx interfaceC12021hx, List<String> list, int i) {
        int i2 = 2 % 2;
        int i3 = f29819 + 71;
        f29817 = i3 % 128;
        if (i3 % 2 != 0) {
            m30893(t, interfaceC12021hx, list, i);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        InterfaceC12018hu<T> interfaceC12018huM30893 = m30893(t, interfaceC12021hx, list, i);
        int i4 = f29817 + 89;
        f29819 = i4 % 128;
        int i5 = i4 % 2;
        return interfaceC12018huM30893;
    }

    /* JADX INFO: renamed from: ｋ */
    private static <T> InterfaceC12018hu<T> m30893(Object obj, InterfaceC12021hx interfaceC12021hx, final List<String> list, int i) {
        int i2 = 2 % 2;
        InterfaceC12018hu<T> interfaceC12018huM30450 = C12019hv.m30362().m30363().m30450(obj, interfaceC12021hx, new InterfaceC12011hn() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12011hn
            /* JADX INFO: renamed from: ﻐ */
            public final Field[] mo30294(Object obj2) {
                C12019hv.m30362().m30364();
                return C12014hq.m30305(obj2.getClass(), true, -1, list);
            }
        }, list, i);
        int i3 = f29819 + 71;
        f29817 = i3 % 128;
        int i4 = i3 % 2;
        return interfaceC12018huM30450;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static InterfaceC12021hx m30899() {
        int i = 2 % 2;
        InterfaceC12021hx interfaceC12021hx = new InterfaceC12021hx() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.9
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12021hx
            /* JADX INFO: renamed from: ﻐ */
            public final boolean mo29895(InterfaceC12018hu interfaceC12018hu) {
                return WebViewClient.class.equals(interfaceC12018hu.mo30360().getType());
            }
        };
        int i2 = f29819 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29817 = i2 % 128;
        int i3 = i2 % 2;
        return interfaceC12021hx;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static InterfaceC12021hx m30888() {
        int i = 2 % 2;
        InterfaceC12021hx interfaceC12021hx = new InterfaceC12021hx() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.6
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12021hx
            /* JADX INFO: renamed from: ﻐ */
            public final boolean mo29895(InterfaceC12018hu interfaceC12018hu) {
                return WebChromeClient.class.equals(interfaceC12018hu.mo30360().getType());
            }
        };
        int i2 = f29817 + 89;
        f29819 = i2 % 128;
        int i3 = i2 % 2;
        return interfaceC12021hx;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ki$b */
    static class b {

        /* JADX INFO: renamed from: ﻛ */
        private boolean f29827;

        /* JADX INFO: renamed from: ｋ */
        private boolean f29828;

        private b() {
            this.f29827 = false;
            this.f29828 = false;
        }

        /* synthetic */ b(byte b) {
            this();
        }

        /* JADX INFO: renamed from: ﾒ */
        private boolean m30904() {
            return this.f29827;
        }

        /* JADX INFO: renamed from: ﻛ */
        final void m30906() {
            this.f29827 = true;
        }

        /* JADX INFO: renamed from: ﾇ */
        final boolean m30908() {
            return this.f29828;
        }

        /* JADX INFO: renamed from: ｋ */
        final void m30907() {
            this.f29828 = true;
        }

        /* JADX INFO: renamed from: ﻐ */
        final boolean m30905() {
            return m30904() || m30908();
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30900(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29816.clone();
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
