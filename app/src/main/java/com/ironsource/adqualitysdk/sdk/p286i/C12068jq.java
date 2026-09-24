package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jq */
/* JADX INFO: loaded from: classes6.dex */
public final class C12068jq {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29704 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29705 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f29706 = {'W', 'e', 'b', 'V', 'i', 'w', 'E', 'x', 't', 'n', 's', 'o', 'r', ' ', 'g', 'C', 'l', 'h', 'm', 'X', 'Y', 'Z', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.END_LIST};

    /* JADX INFO: renamed from: ﻛ */
    private static char f29707 = 5;

    /* JADX INFO: renamed from: ｋ */
    private boolean f29708;

    /* JADX INFO: renamed from: ﾇ */
    private WeakReference<WebView> f29709;

    /* JADX INFO: renamed from: ﾒ */
    private WeakReference<C11834az.b> f29710;

    public C12068jq(WebView webView) {
        this.f29709 = new WeakReference<>(webView);
    }

    /* JADX INFO: renamed from: ﾇ */
    public final WebView m30728() {
        int i = 2 % 2;
        int i2 = f29705 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29704 = i2 % 128;
        int i3 = i2 % 2;
        WebView webView = this.f29709.get();
        int i4 = f29704 + 109;
        f29705 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return webView;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final C11834az.b m30729() {
        int i = 2 % 2;
        int i2 = f29704 + 63;
        int i3 = i2 % 128;
        f29705 = i3;
        if (i2 % 2 == 0) {
            WeakReference<C11834az.b> weakReference = this.f29710;
            if (weakReference == null) {
                return null;
            }
            int i4 = i3 + 107;
            f29704 = i4 % 128;
            int i5 = i4 % 2;
            return weakReference.get();
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m30723(C11834az.b bVar) {
        int i = 2 % 2;
        this.f29710 = new WeakReference<>(bVar);
        int i2 = f29705 + 91;
        f29704 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m30722(C11834az.b bVar) {
        int i = 2 % 2;
        new WeakReference(bVar);
        int i2 = f29705 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29704 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m30725(WebViewClient webViewClient) {
        int i = 2 % 2;
        int i2 = f29705 + 75;
        f29704 = i2 % 128;
        if (i2 % 2 != 0) {
            WebView webViewM30728 = m30728();
            if (webViewM30728 != null) {
                try {
                    C12008hk c12008hk = new C12008hk(C12084ki.m30887(webViewM30728), webViewClient);
                    m30723(c12008hk);
                    webViewM30728.setWebViewClient(c12008hk);
                    this.f29708 = true;
                    int i3 = f29704 + 65;
                    f29705 = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                } catch (Exception e) {
                    C12080kb.m30845(m30724("\u0001\u0002\u0003\u0004\u0000\u0002\u0006\u0007\b\t\u0004\u0006\u000e\u0000\u000e\u0006", 16 - TextUtils.indexOf("", "", 0, 0), (byte) (AndroidCharacter.getMirror('0') - 29)).intern(), m30724("\u0007\u000b\r\f\r\u000e\u000b\u0004\u00ad\u00ad\t\u000e\n\u000e\u0001\u0002\u0003\u0004\u0000\u0002\n\u0014\u0013\u0001\u0004\u0006\u00ad", 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 56)).intern(), (Throwable) e, false);
                }
            }
            this.f29708 = false;
            return;
        }
        m30728();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m30727(WebChromeClient webChromeClient) {
        int i = 2 % 2;
        int i2 = f29704 + 59;
        f29705 = i2 % 128;
        int i3 = i2 % 2;
        WebView webViewM30728 = m30728();
        if (webViewM30728 != null) {
            int i4 = f29704 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f29705 = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    WebChromeClient webChromeClientM30890 = C12084ki.m30890(webViewM30728);
                    if (webChromeClientM30890 == null || (webChromeClientM30890 instanceof WebChromeClient)) {
                        return;
                    }
                    C12005hh c12005hh = new C12005hh(webChromeClientM30890, webChromeClient);
                    m30722(c12005hh);
                    webViewM30728.setWebChromeClient(c12005hh);
                    return;
                }
                C12084ki.m30890(webViewM30728);
                Object obj = null;
                try {
                    super.hashCode();
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception e) {
                C12080kb.m30845(m30724("\u0001\u0002\u0003\u0004\u0000\u0002\u0006\u0007\b\t\u0004\u0006\u000e\u0000\u000e\u0006", 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), m30724("\u0007\u000b\r\f\r\u000e\u000b\u0004~~\t\u000e\n\u000e\u0001\u0002\u0000\u0011\u0016\u0011\r\u0010\u0000\u0010\u0013\u0001\u0004\u0006~", 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (View.resolveSize(0, 0) + 10)).intern(), (Throwable) e, false);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final boolean m30726() {
        int i = 2 % 2;
        int i2 = f29704;
        int i3 = i2 + 21;
        f29705 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f29708;
        int i5 = i2 + 93;
        f29705 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30724(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29706;
            char c = f29707;
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
