package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.oa */
/* JADX INFO: loaded from: classes3.dex */
public final class C3959oa extends AbstractC3654b3 implements InterfaceC3911m7 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC3911m7 f15652k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3959oa(String url, InterfaceC3911m7 eventTracker) {
        super(AbstractC3654b3.c.GET, url, EnumC4095ue.NORMAL, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f15652k = eventTracker;
    }

    /* JADX INFO: renamed from: a */
    public final String m18901a(CBError cBError) {
        return "Error " + cBError.getType() + ": " + cBError.getMessage() + " for URL " + m16895e();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public void mo16889a(CBError cBError, C3723e3 c3723e3) {
        String strM18901a;
        C4048sb.m19410b("Impression tracking request failed", cBError != null ? cBError : new Exception("Null CBError"));
        if (c3723e3 == null || (strM18901a = m18902b(c3723e3)) == null) {
            strM18901a = cBError != null ? m18901a(cBError) : "";
        }
        track((AbstractC3738ei) new C3796h7(InterfaceC3807hi.e.IMPRESSION_TRACKER_FAILURE, strM18901a, null, null, null, 28, null));
    }

    /* JADX INFO: renamed from: b */
    public final String m18902b(C3723e3 c3723e3) {
        if (c3723e3.m17475c()) {
            return null;
        }
        return "Server error " + c3723e3.m17474b() + " for URL " + m16895e();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15652k.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15652k.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15652k.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15652k.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15652k.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f15652k.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15652k.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f15652k.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15652k.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15652k.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15652k.mo43989track(event);
    }
}
