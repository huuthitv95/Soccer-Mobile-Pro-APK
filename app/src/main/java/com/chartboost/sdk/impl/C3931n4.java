package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3931n4 implements InterfaceC3908m4, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final String f15472a;

    /* JADX INFO: renamed from: b */
    public final String f15473b;

    /* JADX INFO: renamed from: c */
    public final Mediation f15474c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3911m7 f15475d;

    public C3931n4(String adType, String location, Mediation mediation, InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f15472a = adType;
        this.f15473b = location;
        this.f15474c = mediation;
        this.f15475d = eventTracker;
    }

    public /* synthetic */ C3931n4(String str, String str2, Mediation mediation, InterfaceC3911m7 interfaceC3911m7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "missing ad type" : str, (i & 2) != 0 ? "missing location" : str2, (i & 4) != 0 ? null : mediation, interfaceC3911m7);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3908m4
    /* JADX INFO: renamed from: a */
    public void mo18630a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        track((AbstractC3738ei) new C4091ua(InterfaceC3807hi.g.SUCCESS, message, this.f15472a, this.f15473b, this.f15474c, null, 32, null));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3908m4
    /* JADX INFO: renamed from: b */
    public void mo18631b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        track((AbstractC3738ei) new C3796h7(InterfaceC3807hi.g.FAILURE, message, this.f15472a, this.f15473b, this.f15474c));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15475d.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15475d.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15475d.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15475d.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15475d.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f15475d.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15475d.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f15475d.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15475d.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f15475d.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f15475d.mo43989track(event);
    }
}
