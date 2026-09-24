package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.AbstractC4214b;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.za */
/* JADX INFO: loaded from: classes3.dex */
public final class C4201za implements C3792h3.a, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final C3746f3 f17115a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3644ag f17116b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3911m7 f17117c;

    /* JADX INFO: renamed from: d */
    public final EndpointRepository f17118d;

    public C4201za(C3746f3 networkService, InterfaceC3644ag requestBodyBuilder, InterfaceC3911m7 eventTracker, EndpointRepository endpointRepository) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        this.f17115a = networkService;
        this.f17116b = requestBodyBuilder;
        this.f17117c = eventTracker;
        this.f17118d = endpointRepository;
    }

    /* JADX INFO: renamed from: a */
    public final void m20131a() {
        URL endPointUrl = this.f17118d.getEndPointUrl(EndpointRepository.EndPoint.INSTALL);
        String strM20171a = AbstractC4214b.m20171a(endPointUrl);
        String path = endPointUrl.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        C3792h3 c3792h3 = new C3792h3(strM20171a, path, this.f17116b.mo16842a(), EnumC4095ue.NORMAL, this, this.f17117c, (C4031rg) null, 64, (DefaultConstructorMarker) null);
        c3792h3.f14362s = true;
        this.f17115a.m17614a(c3792h3);
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17844a(C3792h3 c3792h3, CBError cBError) {
        String errorDesc;
        if (cBError == null || (errorDesc = cBError.getErrorDesc()) == null) {
            errorDesc = "Install failure";
        }
        track((AbstractC3738ei) new C3796h7(InterfaceC3807hi.f.INSTALL_REQUEST_ERROR, errorDesc, null, null, null, 28, null));
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public void mo17845a(C3792h3 c3792h3, JSONObject jSONObject) {
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f17117c.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17117c.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17117c.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17117c.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17117c.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f17117c.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f17117c.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f17117c.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f17117c.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f17117c.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f17117c.mo43989track(event);
    }
}
