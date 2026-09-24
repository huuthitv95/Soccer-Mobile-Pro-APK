package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.hg */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3805hg extends AbstractC4019r4 {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hg$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f14414b = new a();

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

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hg$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3848jd f14415b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3741el f14416c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3848jd c3848jd, C3741el c3741el) {
            super(1);
            this.f14415b = c3848jd;
            this.f14416c = c3741el;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebChromeClient invoke(View container) {
            Intrinsics.checkNotNullParameter(container, "container");
            return new C3815i3(container, this.f14415b, this.f14416c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3805hg(Context context, String html, InterfaceC4064t5 callback, InterfaceC3868ka impressionInterface, String str, C3848jd nativeBridgeCommand, C3741el webViewCorsErrorHandler, InterfaceC3888l7 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, eventTracker, cbWebViewFactory, new b(nativeBridgeCommand, webViewCorsErrorHandler), null, 256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(webViewCorsErrorHandler, "webViewCorsErrorHandler");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
    }

    public /* synthetic */ AbstractC3805hg(Context context, String str, InterfaceC4064t5 interfaceC4064t5, InterfaceC3868ka interfaceC3868ka, String str2, C3848jd c3848jd, C3741el c3741el, InterfaceC3888l7 interfaceC3888l7, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, interfaceC4064t5, interfaceC3868ka, str2, c3848jd, (i & 64) != 0 ? new C3741el() : c3741el, interfaceC3888l7, (i & 256) != 0 ? a.f14414b : function1);
    }
}
