package com.ironsource;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12244i6 implements InterfaceC11515K {

    /* JADX INFO: renamed from: a */
    private final Activity f30577a;

    public C12244i6(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f30577a = activity;
    }

    @Override // com.ironsource.InterfaceC11515K
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo25763a(C11356B2 c11356b2) {
        Intrinsics.checkNotNullParameter(c11356b2, "bannerAdInstance");
    }

    @Override // com.ironsource.InterfaceC11515K
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo25764a(C11650Rb c11650Rb) {
        Intrinsics.checkNotNullParameter(c11650Rb, "nativeAdInstance");
    }

    @Override // com.ironsource.InterfaceC11515K
    /* JADX INFO: renamed from: a */
    public void mo25765a(C12208g6 fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.m31544a(this.f30577a);
    }
}
