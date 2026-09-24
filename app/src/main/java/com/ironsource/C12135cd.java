package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.cd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12135cd extends AbstractC12381n3 {

    /* JADX INFO: renamed from: e */
    private String f30176e;

    /* JADX INFO: renamed from: f */
    private int f30177f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12135cd(int i, String placementName, boolean z, String rewardName, int i2, C12153dd c12153dd) {
        super(i, placementName, z, c12153dd);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f30177f = i2;
        this.f30176e = rewardName;
    }

    /* JADX INFO: renamed from: e */
    public final int m31268e() {
        return this.f30177f;
    }

    /* JADX INFO: renamed from: f */
    public final String m31269f() {
        return this.f30176e;
    }

    @Override // com.ironsource.AbstractC12381n3
    public String toString() {
        return super.toString() + ", reward name: " + this.f30176e + " , amount: " + this.f30177f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12135cd(AbstractC12381n3 placement) {
        super(placement.m32813b(), placement.m32814c(), placement.m32815d(), placement.m32811a());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f30176e = "";
    }
}
