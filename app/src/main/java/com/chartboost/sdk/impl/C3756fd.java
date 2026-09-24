package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.fd */
/* JADX INFO: loaded from: classes3.dex */
public final class C3756fd extends AbstractC3805hg {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fd$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f14212b = new a();

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3756fd(Context context, String html, InterfaceC4064t5 callback, InterfaceC3868ka impressionInterface, String str, C3848jd nativeBridgeCommand, InterfaceC3888l7 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        addView(getWebViewContainer());
        callback.mo18757a();
        callback.mo18762d();
    }

    public /* synthetic */ C3756fd(Context context, String str, InterfaceC4064t5 interfaceC4064t5, InterfaceC3868ka interfaceC3868ka, String str2, C3848jd c3848jd, InterfaceC3888l7 interfaceC3888l7, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, interfaceC4064t5, interfaceC3868ka, str2, c3848jd, interfaceC3888l7, (i & 128) != 0 ? a.f14212b : function1);
    }
}
