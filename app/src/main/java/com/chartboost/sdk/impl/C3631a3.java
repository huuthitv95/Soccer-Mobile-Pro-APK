package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.a3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3631a3 extends AbstractC3930n3 {

    /* JADX INFO: renamed from: O */
    public final String f13448O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC3868ka f13449P;

    /* JADX INFO: renamed from: Q */
    public final C3848jd f13450Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC3911m7 f13451R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3631a3(Context context, String location, EnumC3709dc mtype, String adUnitParameters, C4001q8 fileCache, C3746f3 c3746f3, InterfaceC3945ni uiPoster, C3861k3 c3861k3, Mediation mediation, String str, InterfaceC3642ae openMeasurementImpressionCallback, InterfaceC3971p0 adUnitRendererCallback, InterfaceC3868ka impressionInterface, InterfaceC3856jl webViewTimeoutInterface, C3848jd nativeBridgeCommand, InterfaceC3911m7 eventTracker) {
        super(context, location, mtype, adUnitParameters, uiPoster, fileCache, c3746f3, c3861k3, mediation, str, openMeasurementImpressionCallback, adUnitRendererCallback, webViewTimeoutInterface, eventTracker, null, 16384, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(adUnitParameters, "adUnitParameters");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f13448O = str;
        this.f13449P = impressionInterface;
        this.f13450Q = nativeBridgeCommand;
        this.f13451R = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: b */
    public AbstractC3969ok mo16799b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13450Q.m18227a(this.f13449P);
        String str = this.f13448O;
        if (str == null || StringsKt.isBlank(str)) {
            C4048sb.m19411b("templateHtml must not be null or blank", (Throwable) null, 2, (Object) null);
            return null;
        }
        try {
            return new C3756fd(context, this.f13448O, m18742j(), this.f13449P, m18740h(), this.f13450Q, this.f13451R, null, 128, null);
        } catch (Exception e) {
            m18736c("Can't instantiate MraidWebViewBase: " + e);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3, com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.mo43989track(event);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3930n3
    /* JADX INFO: renamed from: w */
    public void mo16800w() {
    }
}
