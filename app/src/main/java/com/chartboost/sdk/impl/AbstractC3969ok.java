package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ok */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3969ok extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public C3952o3 f15767a;

    /* JADX INFO: renamed from: b */
    public WebChromeClient f15768b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f15769c;

    /* JADX INFO: renamed from: d */
    public EnumC3849je f15770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3969ok(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setFocusableInTouchMode(true);
        requestFocus();
    }

    /* JADX INFO: renamed from: a */
    public void mo17055a() {
        Unit unit;
        C3952o3 c3952o3 = this.f15767a;
        if (c3952o3 == null) {
            C4048sb.m19408a("Webview is null on destroyWebview", (Throwable) null, 2, (Object) null);
            return;
        }
        RelativeLayout relativeLayout = this.f15769c;
        if (relativeLayout != null) {
            relativeLayout.removeView(c3952o3);
            removeView(relativeLayout);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("webViewContainer is null destroyWebview", (Throwable) null, 2, (Object) null);
        }
        C3952o3 c3952o4 = this.f15767a;
        if (c3952o4 != null) {
            c3952o4.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            c3952o4.onPause();
            c3952o4.removeAllViews();
            c3952o4.destroy();
        }
        removeAllViews();
    }

    public final EnumC3849je getLastOrientation() {
        return this.f15770d;
    }

    public final WebChromeClient getWebChromeClient() {
        return this.f15768b;
    }

    public final C3952o3 getWebView() {
        return this.f15767a;
    }

    public final RelativeLayout getWebViewContainer() {
        return this.f15769c;
    }

    public final void setLastOrientation(EnumC3849je enumC3849je) {
        this.f15770d = enumC3849je;
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f15768b = webChromeClient;
    }

    public final void setWebView(C3952o3 c3952o3) {
        this.f15767a = c3952o3;
    }

    public final void setWebViewContainer(RelativeLayout relativeLayout) {
        this.f15769c = relativeLayout;
    }
}
