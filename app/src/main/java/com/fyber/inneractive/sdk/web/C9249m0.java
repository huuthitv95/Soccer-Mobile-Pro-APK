package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.m0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9249m0 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9270v0 f21647a;

    public C9249m0(C9270v0 c9270v0) {
        this.f21647a = c9270v0;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Activity activity = (Activity) AbstractC9195v.m22024a(this.f21647a.f21693q);
        if (activity != null) {
            activity.finish();
        }
        AbstractC9183r.f21478b.postDelayed(new RunnableC9247l0(this), 1000L);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.endsWith("success")) {
            C9270v0 c9270v0 = this.f21647a;
            RunnableC9251n0 runnableC9251n0 = c9270v0.f21692p;
            if (runnableC9251n0 != null) {
                AbstractC9183r.f21478b.removeCallbacks(runnableC9251n0);
                c9270v0.f21692p = null;
            }
            C9270v0 c9270v1 = this.f21647a;
            c9270v1.getClass();
            IAlog.m21945a("%sInternalStoreWebpageController: onWebviewLoaded - load took %d msec", IAlog.m21943a(c9270v1), Long.valueOf(System.currentTimeMillis() - this.f21647a.f21691o));
            this.f21647a.f21688l = true;
            return true;
        }
        if (!str.startsWith("exit")) {
            return false;
        }
        Activity activity = (Activity) AbstractC9195v.m22024a(this.f21647a.f21693q);
        if (activity == null) {
            return true;
        }
        try {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter(TypedValues.AttributesType.S_TARGET);
            boolean zEquals = TextUtils.equals("mail", uri.getAuthority());
            Intent intent = new Intent(zEquals ? "android.intent.action.SENDTO" : "android.intent.action.VIEW", Uri.parse(queryParameter));
            if (zEquals) {
                intent = Intent.createChooser(intent, "Choose an application");
            }
            AbstractC9154h0.m21965a(activity, intent);
        } catch (Throwable th) {
            AbstractC8434z.m20812a(th, null, null);
        }
        return true;
    }
}
