package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.b6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12110b6 extends AbstractC12312m implements InterfaceC12456r6, InterfaceC12474s6 {

    /* JADX INFO: renamed from: b */
    private final InterfaceC12146d6 f30087b;

    /* JADX INFO: renamed from: c */
    private final C12220h0 f30088c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12527t6 f30089d;

    public /* synthetic */ C12110b6(InterfaceC12146d6 interfaceC12146d6, C12414p0 c12414p0, C12220h0 c12220h0, InterfaceC12527t6.b bVar, InterfaceC12420p6 interfaceC12420p6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC12146d6, c12414p0, c12220h0, (i & 8) != 0 ? new InterfaceC12527t6.b() : bVar, interfaceC12420p6);
    }

    /* JADX INFO: renamed from: a */
    public final void m31138a(Activity activity, C12135cd c12135cd) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f30088c.m31568a(c12135cd);
        this.f30089d.mo25268a(activity);
    }

    @Override // com.ironsource.InterfaceC12474s6
    /* JADX INFO: renamed from: b */
    public void mo31142b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30087b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC12474s6
    /* JADX INFO: renamed from: c */
    public void mo31143c(IronSourceError ironSourceError) {
        InterfaceC12146d6 interfaceC12146d6 = this.f30087b;
        String string = this.f30088c.m31569b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC12146d6.mo27708a(new LevelPlayAdError(ironSourceError, string, this.f30088c.m31570c()));
    }

    @Override // com.ironsource.InterfaceC11516K0
    /* JADX INFO: renamed from: e */
    public void mo26245e() {
        this.f30087b.onAdClicked();
    }

    /* JADX INFO: renamed from: m */
    public final void m31144m() {
        this.f30089d.loadAd();
    }

    @Override // com.ironsource.InterfaceC12474s6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30087b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC12456r6
    public void onClosed() {
        this.f30087b.onAdClosed();
    }

    public C12110b6(InterfaceC12146d6 listener, C12414p0 adTools, C12220h0 adProperties, InterfaceC12527t6.b adUnitStrategyFactory, InterfaceC12420p6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.f30087b = listener;
        this.f30088c = adProperties;
        this.f30089d = adUnitStrategyFactory.m33772a(adTools, adTools.m33041b(adProperties.m31572e(), adProperties.m31570c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC12474s6
    /* JADX INFO: renamed from: a */
    public void mo31139a(IronSourceError ironSourceError) {
        InterfaceC12146d6 interfaceC12146d6 = this.f30087b;
        String string = this.f30088c.m31569b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adId.toString()");
        interfaceC12146d6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.f30088c.m31570c()));
    }

    @Override // com.ironsource.InterfaceC12474s6
    /* JADX INFO: renamed from: a */
    public void mo31140a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f30087b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC12456r6
    /* JADX INFO: renamed from: a */
    public void mo31141a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f30087b.mo27712a(reward);
    }

    @Override // com.ironsource.InterfaceC12474s6
    /* JADX INFO: renamed from: a */
    public void mo31137a() {
        this.f30087b.mo27703a();
    }
}
