package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.AbstractC4214b;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11494Ie;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3839j4 implements C3792h3.a {

    /* JADX INFO: renamed from: a */
    public final C3746f3 f14865a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3644ag f14866b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3888l7 f14867c;

    /* JADX INFO: renamed from: d */
    public final EndpointRepository f14868d;

    /* JADX INFO: renamed from: e */
    public final C4031rg f14869e;

    /* JADX INFO: renamed from: f */
    public InterfaceC3862k4 f14870f;

    public C3839j4(C3746f3 networkService, InterfaceC3644ag requestBodyBuilder, InterfaceC3888l7 eventTracker, EndpointRepository endpointRepository, C4031rg session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f14865a = networkService;
        this.f14866b = requestBodyBuilder;
        this.f14867c = eventTracker;
        this.f14868d = endpointRepository;
        this.f14869e = session;
    }

    /* JADX INFO: renamed from: a */
    public final void m18184a(C3792h3 c3792h3, C3793h4 c3793h4) {
        c3792h3.m17833a("ad_id", c3793h4.m17846a());
        c3792h3.m17833a("to", c3793h4.m17852g());
        c3792h3.m17833a("cgn", c3793h4.m17847b());
        c3792h3.m17833a("creative", c3793h4.m17848c());
        c3792h3.m17833a(FirebaseAnalytics.Param.LOCATION, c3793h4.m17850e());
        if (c3793h4.m17849d() == EnumC3914ma.BANNER) {
            c3792h3.m17833a("creative", "");
        } else if (c3793h4.m17854i() != null && c3793h4.m17853h() != null) {
            float f = 1000;
            c3792h3.m17833a("total_time", Float.valueOf(c3793h4.m17853h().floatValue() / f));
            c3792h3.m17833a("playback_time", Float.valueOf(c3793h4.m17854i().floatValue() / f));
            C4048sb.m19408a("TotalDuration: " + c3793h4.m17853h() + " PlaybackTime: " + c3793h4.m17854i(), (Throwable) null, 2, (Object) null);
        }
        Boolean boolM17851f = c3793h4.m17851f();
        if (boolM17851f != null) {
            c3792h3.m17833a("retarget_reinstall", boolM17851f);
        }
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17844a(C3792h3 c3792h3, CBError cBError) {
        String message;
        if (cBError == null || (message = cBError.getMessage()) == null) {
            message = "Click failure";
        }
        InterfaceC3862k4 interfaceC3862k4 = this.f14870f;
        if (interfaceC3862k4 != null) {
            interfaceC3862k4.mo18348a(message);
        }
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17845a(C3792h3 c3792h3, JSONObject jSONObject) {
        JSONObject jSONObjectM20013a = AbstractC4171y2.m20013a(jSONObject, C11494Ie.f24627n);
        InterfaceC3862k4 interfaceC3862k4 = this.f14870f;
        if (interfaceC3862k4 != null) {
            interfaceC3862k4.mo18349a(jSONObjectM20013a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18185a(InterfaceC3862k4 interfaceC3862k4, C3793h4 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f14870f = interfaceC3862k4;
        URL endPointUrl = this.f14868d.getEndPointUrl(EndpointRepository.EndPoint.CLICK);
        String strM20171a = AbstractC4214b.m20171a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        C3792h3 c3792h3 = new C3792h3(strM20171a, path, this.f14866b.mo16842a(), EnumC4095ue.NORMAL, this, this.f14867c, this.f14869e);
        c3792h3.f14362s = true;
        m18184a(c3792h3, params);
        this.f14865a.m17614a(c3792h3);
    }
}
