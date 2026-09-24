package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.e3 */
/* JADX INFO: loaded from: classes6.dex */
public class C12161e3 extends AbstractC12381n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12161e3(int i, String placementName, boolean z, C12153dd c12153dd) {
        super(i, placementName, z, c12153dd);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC12381n3
    public String toString() {
        return super.toString() + ", placementId: " + m32813b();
    }
}
