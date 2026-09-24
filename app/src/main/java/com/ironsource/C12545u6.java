package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12545u6 implements InterfaceC12527t6, C12402o6.b, C12402o6.a {

    /* JADX INFO: renamed from: f */
    public static final a f32548f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final String f32549g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* JADX INFO: renamed from: a */
    private final C12414p0 f32550a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12420p6 f32551b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12456r6 f32552c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12474s6 f32553d;

    /* JADX INFO: renamed from: e */
    private InterfaceC12635z6 f32554e;

    /* JADX INFO: renamed from: com.ironsource.u6$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C12545u6(C12414p0 adTools, InterfaceC12420p6 factory, InterfaceC12456r6 fullscreenAdUnitListener, InterfaceC12474s6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f32550a = adTools;
        this.f32551b = factory;
        this.f32552c = fullscreenAdUnitListener;
        this.f32553d = listener;
        this.f32554e = new C12563v6(this);
    }

    /* JADX INFO: renamed from: a */
    public final C12414p0 m33885a() {
        return this.f32550a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12420p6 m33888b() {
        return this.f32551b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC12456r6 m33889c() {
        return this.f32552c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC12474s6 m33890d() {
        return this.f32553d;
    }

    @Override // com.ironsource.InterfaceC12527t6
    public void loadAd() {
        this.f32554e.loadAd();
    }

    /* JADX INFO: renamed from: a */
    public final void m33886a(InterfaceC12635z6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f32554e = state;
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: b */
    public void mo25276b(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f32554e.mo33931b(adUnit, adInfo);
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: c */
    public void mo25278c(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f32554e.mo33932c(adUnit, adInfo);
    }

    @Override // com.ironsource.InterfaceC12527t6
    /* JADX INFO: renamed from: a */
    public void mo25268a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f32554e.mo33926a(activity);
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: b */
    public void mo25275b(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f32554e.mo33930b(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: a */
    public void mo25270a(C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f32554e.mo33927a(adUnit);
    }

    @Override // com.ironsource.C12402o6.a
    /* JADX INFO: renamed from: a */
    public void mo25272a(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f32554e.mo33929a(adUnit, adInfo);
    }

    @Override // com.ironsource.C12402o6.a
    /* JADX INFO: renamed from: a */
    public void mo25271a(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f32554e.mo33928a(adUnit, ironSourceError);
    }

    /* JADX INFO: renamed from: a */
    public final void m33887a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f32550a.m33047e().m34220h().m27985f("Fullscreen ProgressiveOnLoaded Strategy - " + message);
    }
}
