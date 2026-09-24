package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.AbstractC4214b;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11494Ie;
import com.ironsource.C12538u;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.z4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4195z4 implements C3792h3.a {

    /* JADX INFO: renamed from: a */
    public final C3746f3 f17093a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3644ag f17094b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3888l7 f17095c;

    /* JADX INFO: renamed from: d */
    public final EndpointRepository f17096d;

    /* JADX INFO: renamed from: e */
    public final C4031rg f17097e;

    /* JADX INFO: renamed from: f */
    public InterfaceC3633a5 f17098f;

    public C4195z4(C3746f3 networkService, InterfaceC3644ag requestBodyBuilder, InterfaceC3888l7 eventTracker, EndpointRepository endpointRepository, C4031rg session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f17093a = networkService;
        this.f17094b = requestBodyBuilder;
        this.f17095c = eventTracker;
        this.f17096d = endpointRepository;
        this.f17097e = session;
    }

    /* JADX INFO: renamed from: a */
    public final void m20104a(InterfaceC3633a5 interfaceC3633a5, C4173y4 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f17098f = interfaceC3633a5;
        URL endPointUrl = this.f17096d.getEndPointUrl(EndpointRepository.EndPoint.VIDEO_COMPLETE);
        String strM20171a = AbstractC4214b.m20171a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        C3792h3 c3792h3 = new C3792h3(strM20171a, path, this.f17094b.mo16842a(), EnumC4095ue.NORMAL, this, this.f17095c, this.f17097e);
        m20105a(c3792h3, params);
        this.f17093a.m17614a(c3792h3);
    }

    /* JADX INFO: renamed from: a */
    public final void m20105a(C3792h3 c3792h3, C4173y4 c4173y4) {
        c3792h3.m17833a(FirebaseAnalytics.Param.LOCATION, c4173y4.m20023c());
        c3792h3.m17833a(C12538u.f32489j, Integer.valueOf(c4173y4.m20024d()));
        c3792h3.m17833a("currency-name", c4173y4.m20025e());
        c3792h3.m17833a("ad_id", c4173y4.m20021a());
        c3792h3.m17833a("force_close", Boolean.FALSE);
        c3792h3.m17833a("cgn", c4173y4.m20022b());
        if (c4173y4.m20027g() == null || c4173y4.m20026f() == null) {
            return;
        }
        float f = 1000;
        c3792h3.m17833a("total_time", Float.valueOf(c4173y4.m20026f().floatValue() / f));
        c3792h3.m17833a("playback_time", Float.valueOf(c4173y4.m20027g().floatValue() / f));
        C4048sb.m19408a("TotalDuration: " + c4173y4.m20026f() + " PlaybackTime: " + c4173y4.m20027g(), (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17844a(C3792h3 c3792h3, CBError cBError) {
        String message;
        if (cBError == null || (message = cBError.getMessage()) == null) {
            message = "Click failure";
        }
        InterfaceC3633a5 interfaceC3633a5 = this.f17098f;
        if (interfaceC3633a5 != null) {
            interfaceC3633a5.mo16803a(message);
        }
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17845a(C3792h3 c3792h3, JSONObject jSONObject) {
        JSONObject jSONObjectM20013a = AbstractC4171y2.m20013a(jSONObject, C11494Ie.f24627n);
        InterfaceC3633a5 interfaceC3633a5 = this.f17098f;
        if (interfaceC3633a5 != null) {
            interfaceC3633a5.mo16804a(jSONObjectM20013a);
        }
    }
}
