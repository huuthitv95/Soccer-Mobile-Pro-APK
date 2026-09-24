package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.C3613R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.hl */
/* JADX INFO: loaded from: classes3.dex */
public final class C3810hl extends AbstractC3814i2 {

    /* JADX INFO: renamed from: h */
    public static final b f14517h = new b(null);

    /* JADX INFO: renamed from: f */
    public final String f14518f;

    /* JADX INFO: renamed from: g */
    public final WebView f14519g;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hl$a */
    public static final class a extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0 f14520a;

        public a(Function0 function0) {
            this.f14520a = function0;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Function0 function0 = this.f14520a;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hl$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3810hl(Context context, AttributeSet attributeSet, int i, String persistentCtaContentDescription, final Function0 function0) {
        super(context, attributeSet, i, function0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(persistentCtaContentDescription, "persistentCtaContentDescription");
        this.f14518f = persistentCtaContentDescription;
        WebView webView = new WebView(context);
        webView.setId(View.generateViewId());
        webView.setLayoutParams(new ConstraintLayout.LayoutParams(m20090a(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE), m20090a(60)));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new a(function0));
        webView.setFocusable(true);
        webView.setClickable(true);
        webView.setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.hl$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3810hl.m17935a(function0, view);
            }
        });
        this.f14519g = webView;
        setContentDescription(persistentCtaContentDescription);
        addView(webView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(webView.getId(), 1, 0, 1);
        constraintSet.connect(webView.getId(), 2, 0, 2);
        constraintSet.connect(webView.getId(), 3, 0, 3);
        constraintSet.connect(webView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3810hl(Context context, AttributeSet attributeSet, int i, String str, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            str = context.getString(C3613R.string.persistent_cta_description, "Advertisement");
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        this(context, attributeSet, i, str, (i2 & 16) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m17935a(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3814i2
    /* JADX INFO: renamed from: a */
    public void mo17936a(C3976p5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strM19024b = config.m19024b();
        if (strM19024b != null) {
            this.f14519g.loadDataWithBaseURL(null, strM19024b, "text/html", "UTF-8", null);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3814i2
    /* JADX INFO: renamed from: a */
    public void mo17937a(InterfaceC4101uk tracker, EnumC4057sk purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.mo18913a(this, purpose);
        tracker.mo18913a(this.f14519g, purpose);
    }

    public final WebView getWebView() {
        return this.f14519g;
    }

    public final void setContentUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f14519g.loadUrl(url);
    }
}
