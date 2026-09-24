package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.AbstractC4214b;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3993q0 implements C3792h3.a, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final C3746f3 f15840a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3644ag f15841b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3911m7 f15842c;

    /* JADX INFO: renamed from: d */
    public final C4031rg f15843d;

    /* JADX INFO: renamed from: e */
    public C4141wg f15844e;

    public C3993q0(C3746f3 networkService, InterfaceC3644ag requestBodyBuilder, InterfaceC3911m7 eventTracker, C4031rg session) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f15840a = networkService;
        this.f15841b = requestBodyBuilder;
        this.f15842c = eventTracker;
        this.f15843d = session;
    }

    /* JADX INFO: renamed from: a */
    public final void m19086a(C3792h3 c3792h3, C4141wg c4141wg) {
        c3792h3.m17833a("cached", "0");
        c3792h3.m17833a(FirebaseAnalytics.Param.LOCATION, c4141wg.m19806c());
        int iM19808e = c4141wg.m19808e();
        if (iM19808e >= 0) {
            c3792h3.m17833a("video_cached", Integer.valueOf(iM19808e));
        }
        String strM19804a = c4141wg.m19804a();
        if (strM19804a == null || strM19804a.length() == 0) {
            return;
        }
        c3792h3.m17833a("ad_id", strM19804a);
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17844a(C3792h3 c3792h3, CBError cBError) {
        String message;
        InterfaceC3807hi.i iVar = InterfaceC3807hi.i.REQUEST_ERROR;
        if (cBError == null || (message = cBError.getMessage()) == null) {
            message = "Show failure";
        }
        String str = message;
        C4141wg c4141wg = this.f15844e;
        C4141wg c4141wg2 = null;
        if (c4141wg == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
            c4141wg = null;
        }
        String strM19805b = c4141wg.m19805b();
        C4141wg c4141wg3 = this.f15844e;
        if (c4141wg3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
            c4141wg3 = null;
        }
        String strM19806c = c4141wg3.m19806c();
        C4141wg c4141wg4 = this.f15844e;
        if (c4141wg4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("showParams");
        } else {
            c4141wg2 = c4141wg4;
        }
        track((AbstractC3738ei) new C3796h7(iVar, str, strM19805b, strM19806c, c4141wg2.m19807d()));
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17845a(C3792h3 c3792h3, JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: a */
    public final void m19087a(URL url, C4141wg showParams) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        this.f15844e = showParams;
        String strM20171a = AbstractC4214b.m20171a(url);
        String path = url.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        C3792h3 c3792h3 = new C3792h3(strM20171a, path, this.f15841b.mo16842a(), EnumC4095ue.NORMAL, this, this.f15842c, this.f15843d);
        c3792h3.f13521i = AbstractC3654b3.b.ASYNC;
        m19086a(c3792h3, showParams);
        this.f15840a.m17614a(c3792h3);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15842c.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15842c.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15842c.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15842c.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15842c.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f15842c.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15842c.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f15842c.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15842c.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15842c.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15842c.mo43989track(event);
    }
}
