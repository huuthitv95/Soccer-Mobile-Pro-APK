package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.H6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11468H6 implements InterfaceC12527t6, C12402o6.b, C12402o6.a {

    /* JADX INFO: renamed from: a */
    private final C12414p0 f24426a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12527t6.a f24427b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12420p6 f24428c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12456r6 f24429d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC12474s6 f24430e;

    /* JADX INFO: renamed from: f */
    private C12402o6 f24431f;

    public C11468H6(C12414p0 adTools, InterfaceC12527t6.a config, InterfaceC12420p6 fullscreenAdUnitFactory, InterfaceC12456r6 fullscreenAdUnitListener, InterfaceC12474s6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f24426a = adTools;
        this.f24427b = config;
        this.f24428c = fullscreenAdUnitFactory;
        this.f24429d = fullscreenAdUnitListener;
        this.f24430e = listener;
    }

    /* JADX INFO: renamed from: a */
    public final C12414p0 m25981a() {
        return this.f24426a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12527t6.a m25982b() {
        return this.f24427b;
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: c */
    public void mo25278c(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24430e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC12527t6
    public void loadAd() {
        C12402o6 c12402o6Mo27736a = this.f24428c.mo27736a(true, this.f24429d);
        c12402o6Mo27736a.m32947a(this);
        this.f24431f = c12402o6Mo27736a;
    }

    @Override // com.ironsource.InterfaceC12527t6
    /* JADX INFO: renamed from: a */
    public void mo25268a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C12402o6 c12402o6 = this.f24431f;
        if (c12402o6 != null) {
            c12402o6.m32946a(activity, this);
        }
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: b */
    public void mo25276b(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24430e.mo31142b(adInfo);
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: a */
    public void mo25270a(C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f24431f = null;
        this.f24430e.mo31137a();
    }

    @Override // com.ironsource.C12402o6.b
    /* JADX INFO: renamed from: b */
    public void mo25275b(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f24430e.mo31139a(ironSourceError);
    }

    @Override // com.ironsource.C12402o6.a
    /* JADX INFO: renamed from: a */
    public void mo25272a(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f24430e.mo31140a(adInfo);
    }

    @Override // com.ironsource.C12402o6.a
    /* JADX INFO: renamed from: a */
    public void mo25271a(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f24430e.mo31143c(ironSourceError);
    }
}
