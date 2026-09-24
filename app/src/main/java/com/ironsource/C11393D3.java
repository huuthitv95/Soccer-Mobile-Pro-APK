package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.D3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11393D3 {

    /* JADX INFO: renamed from: com.ironsource.D3$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24200a;

        static {
            int[] iArr = new int[EnumC11483I3.values().length];
            try {
                iArr[EnumC11483I3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11483I3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11483I3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24200a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m25598a(EnumC11483I3 cappingType) {
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        int i = a.f24200a[cappingType.ordinal()];
        if (i == 1 || i == 2) {
            return 3000;
        }
        if (i == 3) {
            return 3001;
        }
        throw new NoWhenBranchMatchedException();
    }
}
