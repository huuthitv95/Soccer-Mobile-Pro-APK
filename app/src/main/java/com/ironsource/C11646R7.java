package com.ironsource;

import com.ironsource.lifecycle.C12311b;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.R7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11646R7 implements InterfaceC11607P1 {
    @Override // com.ironsource.InterfaceC11607P1
    /* JADX INFO: renamed from: a */
    public void mo26714a(InterfaceC12212ga observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        C12311b.m32099d().m32107a(observer);
    }

    @Override // com.ironsource.InterfaceC11607P1
    /* JADX INFO: renamed from: b */
    public void mo26715b(InterfaceC12212ga observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        C12311b.m32099d().m32109b(observer);
    }
}
