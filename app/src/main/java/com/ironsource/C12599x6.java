package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12599x6 implements InterfaceC12635z6 {

    /* JADX INFO: renamed from: a */
    private final C12545u6 f33162a;

    /* JADX INFO: renamed from: b */
    private final C12402o6 f33163b;

    /* JADX INFO: renamed from: c */
    private boolean f33164c;

    public C12599x6(C12545u6 strategy, C12402o6 currentAdUnit, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f33162a = strategy;
        this.f33163b = currentAdUnit;
        this.f33164c = z;
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33926a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f33162a.m33887a("show called while loading");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: b */
    public void mo33931b(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.f33164c) {
            this.f33162a.m33886a(new C12581w6(this.f33162a, this.f33163b, null, false));
            return;
        }
        C12402o6 c12402o6Mo27736a = this.f33162a.m33888b().mo27736a(false, this.f33162a.m33889c());
        this.f33162a.m33886a(new C12581w6(this.f33162a, this.f33163b, c12402o6Mo27736a, true));
        this.f33162a.m33890d().mo31142b(adInfo);
        c12402o6Mo27736a.m32947a(this.f33162a);
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: c */
    public void mo33932c(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f33162a.m33887a("ad info changed while loading");
    }

    @Override // com.ironsource.InterfaceC12635z6
    public void loadAd() {
        if (this.f33164c) {
            this.f33162a.m33887a("load called while loading");
        }
        this.f33164c = true;
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33929a(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f33162a.m33887a("show success while loading");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33928a(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f33162a.m33887a("show failed while loading");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33927a(C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f33162a.m33887a("ad expired while loading");
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: b */
    public void mo33930b(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f33162a.m33886a(new C12563v6(this.f33162a));
        if (this.f33164c) {
            this.f33162a.m33890d().mo31139a(ironSourceError);
        }
    }
}
