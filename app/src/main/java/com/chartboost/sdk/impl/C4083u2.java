package com.chartboost.sdk.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Mediation;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4083u2 extends AbstractC3930n3 {

    /* JADX INFO: renamed from: O */
    public final String f16433O;

    /* JADX INFO: renamed from: P */
    public final String f16434P;

    /* JADX INFO: renamed from: Q */
    public final C4113va f16435Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC3868ka f16436R;

    /* JADX INFO: renamed from: S */
    public final List f16437S;

    /* JADX INFO: renamed from: T */
    public final InterfaceC3911m7 f16438T;

    /* JADX INFO: renamed from: U */
    public final CoroutineDispatcher f16439U;

    /* JADX INFO: renamed from: V */
    public final Function1 f16440V;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u2$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f16441b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4039s2 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C4039s2(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4083u2(Context context, String location, EnumC3709dc mtype, String adUnitParameters, C4001q8 fileCache, C3746f3 c3746f3, InterfaceC3945ni uiPoster, C3861k3 c3861k3, Mediation mediation, String baseUrl, String str, C4113va infoIcon, InterfaceC3642ae openMeasurementImpressionCallback, InterfaceC3971p0 adUnitRendererCallback, InterfaceC3868ka impressionInterface, InterfaceC3856jl webViewTimeoutInterface, List scripts, InterfaceC3911m7 eventTracker, CoroutineDispatcher dispatcher, Function1 cbWebViewFactory) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, c3746f3, c3861k3, mediation, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        this.f16433O = baseUrl;
        this.f16434P = str;
        this.f16435Q = infoIcon;
        this.f16436R = impressionInterface;
        this.f16437S = scripts;
        this.f16438T = eventTracker;
        this.f16439U = dispatcher;
        this.f16440V = cbWebViewFactory;
    }

    public /* synthetic */ C4083u2(Context context, String str, EnumC3709dc enumC3709dc, String str2, C4001q8 c4001q8, C3746f3 c3746f3, InterfaceC3945ni interfaceC3945ni, C3861k3 c3861k3, Mediation mediation, String str3, String str4, C4113va c4113va, InterfaceC3642ae interfaceC3642ae, InterfaceC3971p0 interfaceC3971p0, InterfaceC3868ka interfaceC3868ka, InterfaceC3856jl interfaceC3856jl, List list, InterfaceC3911m7 interfaceC3911m7, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, enumC3709dc, str2, c4001q8, c3746f3, interfaceC3945ni, c3861k3, mediation, str3, str4, c4113va, interfaceC3642ae, interfaceC3971p0, interfaceC3868ka, interfaceC3856jl, list, interfaceC3911m7, (i & 262144) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 524288) != 0 ? a.f16441b : function1);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: b */
    public AbstractC3969ok mo16799b(Context context) {
        AbstractC3969ok abstractC3969ok;
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f16434P;
        if (str == null || StringsKt.isBlank(str)) {
            C4048sb.m19411b("html must not be null or blank", (Throwable) null, 2, (Object) null);
            return null;
        }
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            abstractC3969ok = null;
                                            try {
                                                C3683c9 c3683c9 = new C3683c9(context, this.f16433O, this.f16434P, this.f16435Q, this.f16438T, m18742j(), this.f16436R, this.f16439U, this.f16440V, null, 512, null);
                                                RelativeLayout webViewContainer = c3683c9.getWebViewContainer();
                                                if (webViewContainer != null) {
                                                    c3683c9.m17056a(webViewContainer);
                                                    unit = Unit.INSTANCE;
                                                } else {
                                                    unit = null;
                                                }
                                                if (unit == null) {
                                                    C4048sb.m19411b("webViewContainer null when creating HtmlWebViewBase", (Throwable) null, 2, (Object) null);
                                                }
                                                return c3683c9;
                                            } catch (Exception e) {
                                                e = e;
                                                m18736c("Can't instantiate WebViewBase: " + e);
                                                return abstractC3969ok;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            abstractC3969ok = null;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        abstractC3969ok = null;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    abstractC3969ok = null;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                abstractC3969ok = null;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            abstractC3969ok = null;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        abstractC3969ok = null;
                    }
                } catch (Exception e8) {
                    e = e8;
                    abstractC3969ok = null;
                }
            } catch (Exception e9) {
                e = e9;
                abstractC3969ok = null;
            }
        } catch (Exception e10) {
            e = e10;
            abstractC3969ok = null;
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: w */
    public void mo16800w() {
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: x */
    public void mo18755x() {
        C3952o3 webView;
        super.mo18755x();
        this.f16436R.mo18390u();
        AbstractC3969ok abstractC3969okM18753u = m18753u();
        if (abstractC3969okM18753u == null || (webView = abstractC3969okM18753u.getWebView()) == null) {
            return;
        }
        Iterator it = this.f16437S.iterator();
        while (it.hasNext()) {
            webView.evaluateJavascript((String) it.next(), null);
        }
    }
}
