package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.click.C7930d;
import com.fyber.inneractive.sdk.click.C7933g;
import com.fyber.inneractive.sdk.click.C7934h;
import com.fyber.inneractive.sdk.click.C7935i;
import com.fyber.inneractive.sdk.click.C7938l;
import com.fyber.inneractive.sdk.click.C7944r;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.util.AbstractC9161j1;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.activities.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C7817g extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f17491a;

    public C7817g(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f17491a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f17491a.f17475f.setImageDrawable(webView.canGoBack() ? AbstractC9174o.m22003d(C7809R.drawable.ia_ib_left_arrow) : AbstractC9174o.m22003d(C7809R.drawable.ia_ib_unleft_arrow));
        this.f17491a.f17476g.setImageDrawable(webView.canGoForward() ? AbstractC9174o.m22003d(C7809R.drawable.ia_ib_right_arrow) : AbstractC9174o.m22003d(C7809R.drawable.ia_ib_unright_arrow));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f17491a.f17476g.setImageDrawable(AbstractC9174o.m22003d(C7809R.drawable.ia_ib_unright_arrow));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m21950f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC8434z.m20811a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f17491a;
        if (inneractiveInternalBrowserActivity.f17474e == webView) {
            inneractiveInternalBrowserActivity.f17474e = null;
        }
        if (webView != null) {
            AbstractC9195v.m22027a(webView);
            webView.destroy();
        }
        this.f17491a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (AbstractC9161j1.m21972a(str)) {
            WebView webView2 = this.f17491a.f17474e;
            if (webView2 != null) {
                webView2.loadUrl("chrome://crash");
            }
            return true;
        }
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f17491a;
        String str2 = InneractiveInternalBrowserActivity.URL_EXTRA;
        inneractiveInternalBrowserActivity.getClass();
        C7933g c7933g = new C7933g(new C7818h(inneractiveInternalBrowserActivity), null, EnumC9150g.VIDEO_CTA);
        C7944r c7944r = new C7944r(false, inneractiveInternalBrowserActivity.f17471b);
        c7944r.f17649j.addAll(Arrays.asList(c7933g, new C7930d(), new C7934h(), new C7938l(), new C7935i(false, TextUtils.isEmpty(str) ? null : Uri.parse(str).getScheme())));
        c7944r.m20373a(inneractiveInternalBrowserActivity.getApplicationContext(), str, new C7819i(inneractiveInternalBrowserActivity), null, false, EnumC8253m.NONE, "");
        return !str.startsWith(ProxyConfig.MATCH_HTTP);
    }
}
