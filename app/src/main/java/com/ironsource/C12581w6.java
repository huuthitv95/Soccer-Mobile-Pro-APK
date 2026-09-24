package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12581w6 implements InterfaceC12635z6 {

    /* JADX INFO: renamed from: a */
    private final C12545u6 f32696a;

    /* JADX INFO: renamed from: b */
    private final C12402o6 f32697b;

    /* JADX INFO: renamed from: c */
    private C12402o6 f32698c;

    /* JADX INFO: renamed from: d */
    private boolean f32699d;

    public C12581w6(C12545u6 strategy, C12402o6 currentAdUnit, C12402o6 c12402o6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f32696a = strategy;
        this.f32697b = currentAdUnit;
        this.f32698c = c12402o6;
        this.f32699d = z;
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33926a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f32696a.m33886a(new C12617y6(this.f32696a, this.f32697b, this.f32698c));
        this.f32697b.m32946a(activity, this.f32696a);
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: b */
    public void mo33931b(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(this.f32697b, adUnit)) {
            this.f32696a.m33887a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: c */
    public void mo33932c(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.f32697b)) {
            this.f32696a.m33890d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC12635z6
    public void loadAd() {
        Unit unit;
        if (this.f32699d) {
            this.f32696a.m33887a("load called while current ad is loaded");
            return;
        }
        this.f32699d = true;
        LevelPlayAdInfo levelPlayAdInfoM32950e = this.f32697b.m32950e();
        if (levelPlayAdInfoM32950e != null) {
            this.f32696a.m33890d().mo31142b(levelPlayAdInfoM32950e);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f32696a.m33887a("current ad is loaded without ad info");
        } else if (this.f32698c == null) {
            C12402o6 c12402o6Mo27736a = this.f32696a.m33888b().mo27736a(false, this.f32696a.m33889c());
            this.f32698c = c12402o6Mo27736a;
            c12402o6Mo27736a.m32947a(this.f32696a);
        }
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: b */
    public void mo33930b(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.f32698c)) {
            this.f32698c = null;
        } else {
            this.f32696a.m33887a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33929a(C12402o6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.f32697b)) {
            this.f32696a.m33887a("show success when loaded");
        } else {
            this.f32696a.m33887a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C12581w6(C12545u6 c12545u6, C12402o6 c12402o6, C12402o6 c12402o7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12545u6, c12402o6, c12402o7, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33928a(C12402o6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.f32697b)) {
            this.f32696a.m33887a("show failed when loaded");
        } else {
            this.f32696a.m33887a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC12635z6
    /* JADX INFO: renamed from: a */
    public void mo33927a(C12402o6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.f32698c)) {
            this.f32698c = null;
        } else if (Intrinsics.areEqual(adUnit, this.f32697b)) {
            m34048a();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m34048a() {
        InterfaceC12635z6 c12599x6;
        C12402o6 c12402o6 = this.f32698c;
        if (c12402o6 == null) {
            C12545u6 c12545u6 = this.f32696a;
            c12545u6.m33886a(new C12563v6(c12545u6));
        } else {
            if ((c12402o6 != null ? c12402o6.m32950e() : null) != null) {
                C12545u6 c12545u7 = this.f32696a;
                C12402o6 c12402o7 = this.f32698c;
                Intrinsics.checkNotNull(c12402o7);
                c12599x6 = new C12581w6(c12545u7, c12402o7, null, false, 8, null);
            } else {
                C12545u6 c12545u8 = this.f32696a;
                C12402o6 c12402o8 = this.f32698c;
                Intrinsics.checkNotNull(c12402o8);
                c12599x6 = new C12599x6(c12545u8, c12402o8, false);
            }
            this.f32696a.m33886a(c12599x6);
        }
        this.f32696a.m33890d().mo31137a();
    }
}
