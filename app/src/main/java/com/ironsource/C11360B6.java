package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.B6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11360B6 implements InterfaceC11450G6 {

    /* JADX INFO: renamed from: a */
    private final C11342A6 f23911a;

    /* JADX INFO: renamed from: b */
    private final C12402o6 f23912b;

    /* JADX INFO: renamed from: c */
    private final boolean f23913c;

    public C11360B6(C11342A6 strategy, C12402o6 c12402o6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f23911a = strategy;
        this.f23912b = c12402o6;
        this.f23913c = z;
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25409a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23911a.m25279d().mo31143c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f23913c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: b */
    public void mo25412b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f23911a.m25273a(this.f23913c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25414c(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f23911a.m25273a(this.f23913c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.InterfaceC11450G6
    public void loadAd() {
        C12402o6 c12402o6Mo27736a = this.f23911a.m25274b().mo27736a(true, this.f23911a.m25277c());
        C11342A6 c11342a6 = this.f23911a;
        c11342a6.m25269a(new C11432F6(c11342a6, c12402o6Mo27736a));
        c12402o6Mo27736a.m32947a(this.f23911a);
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: c */
    public void mo25413c(IronSourceError ironSourceError) {
        this.f23911a.m25273a(this.f23913c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ C11360B6(C11342A6 c11342a6, C12402o6 c12402o6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11342a6, c12402o6, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25410a(IronSourceError ironSourceError) {
        this.f23911a.m25273a(this.f23913c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25408a() {
        this.f23911a.m25273a(this.f23913c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.InterfaceC11450G6
    /* JADX INFO: renamed from: a */
    public void mo25411a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f23911a.m25273a(this.f23913c ? "show success on expired ad" : "show success before load called");
    }
}
