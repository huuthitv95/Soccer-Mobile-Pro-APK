package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.ironsource.C11341A5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4019r4 extends AbstractC3969ok {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r4$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f16114b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3952o3 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C3952o3(it);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r4$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final b f16115b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebChromeClient invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new WebChromeClient();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.r4$c */
    public static final class c extends Lambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3868ka f16116b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC3868ka interfaceC3868ka) {
            super(2);
            this.f16116b = interfaceC3868ka;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4042s5 invoke(InterfaceC4064t5 cb, InterfaceC3888l7 et) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            Intrinsics.checkNotNullParameter(et, "et");
            return new C4042s5(cb, et, this.f16116b, (C3920mg) C3678c4.f13658b.mo17019a().mo18988b().get());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4019r4(Context context, String html, InterfaceC4064t5 callback, InterfaceC3868ka impressionInterface, String str, InterfaceC3888l7 eventTracker, Function1 cbWebViewFactory, Function1 cbWebChromeClientFactory, Function2 cbWebViewClientFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.checkNotNullParameter(cbWebChromeClientFactory, "cbWebChromeClientFactory");
        Intrinsics.checkNotNullParameter(cbWebViewClientFactory, "cbWebViewClientFactory");
        setFocusable(false);
        C3957o8 c3957o8M18892a = C3957o8.m18892a();
        setWebViewContainer((RelativeLayout) c3957o8M18892a.m18893a(new RelativeLayout(context)));
        setWebView((C3952o3) cbWebViewFactory.invoke(context));
        C4187yi.f17062b.m20066a(context);
        try {
            WebView.setWebContentsDebuggingEnabled(false);
        } catch (RuntimeException e) {
            C4048sb.m19416e("Exception while enabling webview debugging", e);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        C3952o3 webView = getWebView();
        if (webView != null) {
            webView.getSettings().setSupportZoom(false);
            webView.setLayoutParams(layoutParams);
            webView.setBackgroundColor(0);
            webView.setWebViewClient((WebViewClient) c3957o8M18892a.m18893a(cbWebViewClientFactory.invoke(callback, eventTracker)));
            RelativeLayout webViewContainer = getWebViewContainer();
            if (webViewContainer != null) {
                webViewContainer.setLayoutParams(layoutParams);
                webView.setWebChromeClient((WebChromeClient) cbWebChromeClientFactory.invoke(webViewContainer));
                webViewContainer.addView(webView);
            }
            webView.loadDataWithBaseURL(str, html, "text/html", C11341A5.f23802O, null);
        }
    }

    public /* synthetic */ AbstractC4019r4(Context context, String str, InterfaceC4064t5 interfaceC4064t5, InterfaceC3868ka interfaceC3868ka, String str2, InterfaceC3888l7 interfaceC3888l7, Function1 function1, Function1 function2, Function2 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC3868ka interfaceC3868ka2;
        Function2 cVar;
        Function1 function4 = (i & 64) != 0 ? a.f16114b : function1;
        Function1 function5 = (i & 128) != 0 ? b.f16115b : function2;
        if ((i & 256) != 0) {
            interfaceC3868ka2 = interfaceC3868ka;
            cVar = new c(interfaceC3868ka2);
        } else {
            interfaceC3868ka2 = interfaceC3868ka;
            cVar = function3;
        }
        this(context, str, interfaceC4064t5, interfaceC3868ka2, str2, interfaceC3888l7, function4, function5, cVar);
    }
}
