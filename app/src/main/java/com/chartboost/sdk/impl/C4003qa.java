package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.qa */
/* JADX INFO: loaded from: classes3.dex */
public final class C4003qa {

    /* JADX INFO: renamed from: a */
    public final Context f15900a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3945ni f15901b;

    /* JADX INFO: renamed from: c */
    public final C4001q8 f15902c;

    /* JADX INFO: renamed from: d */
    public final C3861k3 f15903d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3855jk f15904e;

    /* JADX INFO: renamed from: f */
    public final Mediation f15905f;

    /* JADX INFO: renamed from: g */
    public final C3746f3 f15906g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3642ae f15907h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3911m7 f15908i;

    public C4003qa(Context context, InterfaceC3945ni uiPoster, C4001q8 fileCache, C3861k3 templateProxy, InterfaceC3855jk videoRepository, Mediation mediation, C3746f3 networkService, InterfaceC3642ae openMeasurementImpressionCallback, InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(templateProxy, "templateProxy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f15900a = context;
        this.f15901b = uiPoster;
        this.f15902c = fileCache;
        this.f15903d = templateProxy;
        this.f15904e = videoRepository;
        this.f15905f = mediation;
        this.f15906g = networkService;
        this.f15907h = openMeasurementImpressionCallback;
        this.f15908i = eventTracker;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC3930n3 m19154a(String location, C3651b0 adUnit, String adTypeTraitsName, String html, InterfaceC3971p0 adUnitRendererImpressionCallback, InterfaceC3868ka impressionInterface, InterfaceC3856jl webViewTimeoutInterface, C3848jd nativeBridgeCommand) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        if (adUnit.m16856C().length() > 0) {
            return new C3809hk(this.f15900a, location, adUnit.m16875q(), adTypeTraitsName, this.f15901b, this.f15902c, this.f15903d, this.f15904e, adUnit.m16855B(), this.f15905f, C3678c4.f13658b.mo17019a().mo18998l(), this.f15906g, html, this.f15907h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.f15908i, null, 524288, null);
        }
        return adUnit.m16879u() == EnumC4184yf.HTML ? new C4083u2(this.f15900a, location, adUnit.m16875q(), adTypeTraitsName, this.f15902c, this.f15906g, this.f15901b, this.f15903d, this.f15905f, adUnit.m16863e(), adUnit.m16868j(), adUnit.m16872n(), this.f15907h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, adUnit.m16882x(), this.f15908i, null, null, 786432, null) : new C3631a3(this.f15900a, location, adUnit.m16875q(), adTypeTraitsName, this.f15902c, this.f15906g, this.f15901b, this.f15903d, this.f15905f, html, this.f15907h, adUnitRendererImpressionCallback, impressionInterface, webViewTimeoutInterface, nativeBridgeCommand, this.f15908i);
    }
}
