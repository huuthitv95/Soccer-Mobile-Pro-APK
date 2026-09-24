package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.A6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11342A6 implements InterfaceC12527t6, C12402o6.b, C12402o6.a {

    /* JADX INFO: renamed from: f */
    public static final a f23836f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final String f23837g = "Fullscreen ProgressiveOnShown Strategy";

    /* JADX INFO: renamed from: a */
    private final C12414p0 f23838a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12420p6 f23839b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12456r6 f23840c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12474s6 f23841d;

    /* JADX INFO: renamed from: e */
    private InterfaceC11450G6 f23842e;

    /* JADX INFO: renamed from: com.ironsource.A6$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C11342A6(C12414p0 adTools, InterfaceC12420p6 factory, InterfaceC12456r6 fullscreenAdUnitListener, InterfaceC12474s6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23838a = adTools;
        this.f23839b = factory;
        this.f23840c = fullscreenAdUnitListener;
        this.f23841d = listener;
        this.f23842e = new C11360B6(this, null, false, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public final C12414p0 m25267a() {
        return this.f23838a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12420p6 m25274b() {
        return this.f23839b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC12456r6 m25277c() {
        return this.f23840c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC12474s6 m25279d() {
        return this.f23841d;
    }

    @Override // com.ironsource.InterfaceC12527t6
    public void loadAd() {
        this.f23842e.loadAd();
    }

    @Override // com.ironsource.InterfaceC12527t6
    /* JADX INFO: renamed from: a */
    public void mo25268a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23842e.mo25409a(activity);
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: b */
    public void mo25276b(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f23842e.mo25414c(adInfo);
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: c */
    public void mo25278c(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f23842e.mo25412b(adInfo);
    }

    /* JADX INFO: renamed from: a */
    public final void m25269a(InterfaceC11450G6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f23842e = state;
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: b */
    public void mo25275b(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f23842e.mo25410a(ironSourceError);
    }

    /* JADX INFO: renamed from: a */
    public final void m25273a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f23838a.m33047e().m34220h().m27985f("Fullscreen ProgressiveOnShown Strategy - " + message);
    }

    @Override // com.ironsource.C12402o6.a
    /* JADX INFO: renamed from: a */
    public void mo25272a(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f23842e.mo25411a(adInfo);
    }

    @Override // com.ironsource.C12402o6.a
    /* JADX INFO: renamed from: a */
    public void mo25271a(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f23842e.mo25413c(ironSourceError);
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: a */
    public void mo25270a(C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f23842e.mo25408a();
    }
}
