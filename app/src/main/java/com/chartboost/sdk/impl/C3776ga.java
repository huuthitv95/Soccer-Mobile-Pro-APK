package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ga */
/* JADX INFO: loaded from: classes3.dex */
public final class C3776ga implements InterfaceC3799ha, InterfaceC3911m7 {

    /* JADX INFO: renamed from: a */
    public final C3651b0 f14302a;

    /* JADX INFO: renamed from: b */
    public final String f14303b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3628a0 f14304c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3971p0 f14305d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3891la f14306e;

    /* JADX INFO: renamed from: f */
    public final C3950o1 f14307f;

    /* JADX INFO: renamed from: g */
    public final C4131w6 f14308g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3642ae f14309h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC3911m7 f14310i;

    /* JADX INFO: renamed from: j */
    public boolean f14311j;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ga$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14312a;

        static {
            int[] iArr = new int[EnumC3937na.values().length];
            try {
                iArr[EnumC3937na.DISPLAYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3937na.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14312a = iArr;
        }
    }

    public C3776ga(C3651b0 adUnit, String location, AbstractC3628a0 adType, InterfaceC3971p0 adUnitRendererImpressionCallback, InterfaceC3891la impressionIntermediateCallback, C3950o1 appRequest, C4131w6 downloader, InterfaceC3642ae openMeasurementImpressionCallback, InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(impressionIntermediateCallback, "impressionIntermediateCallback");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f14302a = adUnit;
        this.f14303b = location;
        this.f14304c = adType;
        this.f14305d = adUnitRendererImpressionCallback;
        this.f14306e = impressionIntermediateCallback;
        this.f14307f = appRequest;
        this.f14308g = downloader;
        this.f14309h = openMeasurementImpressionCallback;
        this.f14310i = eventTracker;
        this.f14311j = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m17794a() {
        C4048sb.m19411b("Dismissing impression", (Throwable) null, 2, (Object) null);
        this.f14306e.mo18496a(EnumC3937na.DISMISSING);
        m17796b();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3799ha
    /* JADX INFO: renamed from: a */
    public void mo17795a(EnumC3937na state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f14311j = true;
        this.f14309h.mo16826a(PlayerState.NORMAL);
        int i = a.f14312a[state.ordinal()];
        if (i == 1) {
            m17794a();
        } else if (i == 2) {
            m17796b();
            track((AbstractC3738ei) new C3954o5(InterfaceC3807hi.i.CLOSE_BEFORE_TEMPLATE_SHOW_ERROR, "onClose with state Loaded", this.f14304c.m16771b(), this.f14303b, null, null, 48, null));
        }
        this.f14305d.mo18588a(this.f14307f);
    }

    /* JADX INFO: renamed from: b */
    public final void m17796b() {
        C4048sb.m19411b("Removing impression", (Throwable) null, 2, (Object) null);
        this.f14306e.mo18496a(EnumC3937na.NONE);
        this.f14306e.mo18499n();
        this.f14308g.m19755c();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3799ha
    /* JADX INFO: renamed from: c */
    public void mo17797c() {
        this.f14305d.mo18595a(this.f14302a.m16871m());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f14310i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f14310i.clearFromStorage(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14310i.mo43985clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3799ha
    /* JADX INFO: renamed from: f */
    public void mo17798f(boolean z) {
        this.f14311j = z;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f14310i.persist(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14310i.mo43986persist(event);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        return this.f14310i.refresh(c3692ci);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14310i.mo43987refresh(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        return this.f14310i.store(c4076th);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f14310i.mo43988store(ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        return this.f14310i.track(abstractC3738ei);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f14310i.mo43989track(event);
    }
}
