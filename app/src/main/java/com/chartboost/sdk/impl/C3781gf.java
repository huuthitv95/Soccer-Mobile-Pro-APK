package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.gf */
/* JADX INFO: loaded from: classes3.dex */
public final class C3781gf implements InterfaceC3758ff, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final C3643af f14327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3911m7 f14328b;

    public C3781gf(C3643af repository, InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f14327a = repository;
        this.f14328b = eventTracker;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3758ff
    /* JADX INFO: renamed from: a */
    public void mo17728a(DataUseConsent dataUseConsent) {
        String privacyStandardName;
        if (dataUseConsent == null || (privacyStandardName = dataUseConsent.getPrivacyStandardName()) == null || privacyStandardName.length() == 0) {
            try {
                track((AbstractC3738ei) new C3954o5(InterfaceC3807hi.d.PERSISTENCE_ERROR, "", "", "", null, null, 48, null));
            } catch (Exception unused) {
            }
            C4048sb.m19411b("addDataUseConsent failed", (Throwable) null, 2, (Object) null);
            return;
        }
        if ((dataUseConsent instanceof GDPR) || (dataUseConsent instanceof CCPA) || (dataUseConsent instanceof COPPA) || (dataUseConsent instanceof LGPD) || (dataUseConsent instanceof Custom)) {
            this.f14327a.m16839b(dataUseConsent);
            return;
        }
        try {
            InterfaceC3807hi.d dVar = InterfaceC3807hi.d.SUBCLASSING_ERROR;
            String name = dataUseConsent.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            track((AbstractC3738ei) new C3796h7(dVar, name, "", "", null, 16, null));
        } catch (Exception unused2) {
        }
        C4048sb.m19417e("Attempt to addDataUseConsent. Context and DataUseConsent cannot be null.", null, 2, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f14328b.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f14328b.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14328b.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f14328b.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14328b.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f14328b.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14328b.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f14328b.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f14328b.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f14328b.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14328b.mo43989track(event);
    }
}
