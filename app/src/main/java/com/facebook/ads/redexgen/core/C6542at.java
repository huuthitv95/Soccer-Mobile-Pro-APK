package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.at */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6542at extends WebViewClient {
    public static byte[] A05;
    public final WeakReference<C6902gi> A02;
    public final WeakReference<InterfaceC6539aq> A03;
    public final WeakReference<C6534al> A04;
    public final InterfaceC6538ap A01 = new InterfaceC6538ap() { // from class: com.facebook.ads.redexgen.X.M4
        @Override // com.facebook.ads.redexgen.core.InterfaceC6538ap
        public final boolean AAf(String str) {
            return C6542at.A04(str);
        }
    };
    public WeakReference<InterfaceC6540ar> A00 = new WeakReference<>(null);

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Ascii.f22493FS, Ascii.f22502US, Ascii.DC2, 8, 9, 71, Ascii.f22502US, 17, Ascii.f22493FS, 19, Ascii.SYN, 37, 42, Ascii.ESC, 37, 39, 48, 45, 50, 45, 48, Base64.padSymbol, Ascii.f22492FF, 3, 9, Ascii.f22502US, 2, 4, 9, 67, 4, 3, Ascii.f22491EM, 8, 3, Ascii.f22491EM, 67, Ascii.f22492FF, Ascii.f22500SO, Ascii.f22491EM, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, 127, 114, 56, 127, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, Ascii.ESC, 77, 87, Ascii.f22502US, Ascii.f22490CR, 10, 55, Ascii.f22498RS, 1, Ascii.f22490CR, Ascii.f22502US};
    }

    public C6542at(WeakReference<C6902gi> weakReference, WeakReference<InterfaceC6539aq> weakReference2, WeakReference<C6534al> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C6902gi c6902gi) {
        c6902gi.A08().ABC(A00(11, 11, 104), AbstractC6098Td.A09, new C6099Te(A00(111, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(116, 8, 68);
        C6902gi c6902gi = this.A02.get();
        if (c6902gi != null) {
            if ((C5634M3.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A01.AAf(str)) {
                return true;
            }
            try {
                Uri uri = AbstractC6312XB.A00(str);
                String scheme = uri.getScheme();
                try {
                    boolean zA14 = C6171Up.A14(c6902gi);
                    String strA01 = A00(48, 33, 58);
                    String strA02 = A00(22, 26, 65);
                    String strA03 = A00(105, 6, 36);
                    if (zA14) {
                        if (!C5634M3.A0D.contains(scheme) && !A00(101, 4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE).equals(scheme)) {
                            if (strA03.equalsIgnoreCase(scheme)) {
                                intent = Intent.parseUri(str, 1);
                                intent.setComponent(null);
                                intent.setSelector(null);
                            } else {
                                intent = new Intent(strA02, uri);
                            }
                            intent.addCategory(strA01);
                            if (Build.VERSION.SDK_INT >= 30) {
                                intent.setFlags(268436480);
                            } else {
                                intent.setFlags(268435456);
                            }
                            try {
                                if (!C6297Wu.A0D(c6902gi, intent)) {
                                    A02(str, c6902gi);
                                }
                                return true;
                            } catch (C6295Ws unused) {
                                if (strA03.equals(scheme)) {
                                    String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                    if (!TextUtils.isEmpty(stringExtra)) {
                                        if (!C6297Wu.A0D(c6902gi, new Intent(strA02, AbstractC6312XB.A00(stringExtra)))) {
                                            A02(str, c6902gi);
                                        }
                                        return true;
                                    }
                                }
                                C6099Te c6099Te = new C6099Te(A00(111, 5, 91) + str);
                                c6099Te.A05(1);
                                c6902gi.A08().ABD(A00(11, 11, 104), AbstractC6098Td.A06, c6099Te);
                                return true;
                            }
                        }
                        return false;
                    }
                    if (!C5634M3.A0A || !strA03.equalsIgnoreCase(scheme)) {
                        if ((C5634M3.A0A && AbstractC6338Xb.A04(str)) || !C5634M3.A0D.contains(scheme)) {
                            return C6297Wu.A0D(c6902gi, new Intent(strA02, uri));
                        }
                    } else {
                        Intent uri2 = Intent.parseUri(str, 1);
                        uri2.addCategory(strA01);
                        uri2.setComponent(null);
                        uri2.setSelector(null);
                        if (c6902gi.getPackageManager().resolveActivity(uri2, 65536) != null && C6297Wu.A0D(c6902gi, uri2)) {
                            webView.goBack();
                            return true;
                        }
                    }
                } catch (Exception e) {
                    c6902gi.A08().ABD(strA00, AbstractC6098Td.A2d, new C6099Te(e));
                    c6902gi.A0F().AA2(e.toString());
                }
                return false;
            } catch (SecurityException e2) {
                c6902gi.A08().ABD(strA00, AbstractC6098Td.A2d, new C6099Te(e2));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(WeakReference<InterfaceC6540ar> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C6534al timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC6539aq interfaceC6539aq = this.A03.get();
        if (interfaceC6539aq != null) {
            interfaceC6539aq.AF7(str);
        }
        InterfaceC6540ar interfaceC6540ar = this.A00.get();
        if (interfaceC6540ar != null) {
            interfaceC6540ar.ADB(webView.canGoBack());
            interfaceC6540ar.ADx(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC6539aq listener = this.A03.get();
        if (listener != null) {
            listener.AF9(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C6902gi c6902gi = this.A02.get();
        if (c6902gi != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC6338Xb.A01(i, sb.append(strA00).append(str).toString(), strA00 + str2);
            c6902gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C6902gi c6902gi = this.A02.get();
        if (c6902gi != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC6338Xb.A01(errorCode, sb.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c6902gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C6902gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C6902gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA1();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC6547ay.A0D(AbstractC6098Td.A2e);
        InterfaceC6539aq listener = this.A03.get();
        if (listener != null) {
            listener.AFe();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
