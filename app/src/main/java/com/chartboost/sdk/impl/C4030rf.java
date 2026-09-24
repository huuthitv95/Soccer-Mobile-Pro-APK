package com.chartboost.sdk.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.rf */
/* JADX INFO: loaded from: classes3.dex */
public final class C4030rf {

    /* JADX INFO: renamed from: a */
    public static final C4030rf f16185a = new C4030rf();

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.rf$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16186a;

        static {
            int[] iArr = new int[C4008qf.b.values().length];
            try {
                iArr[C4008qf.b.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C4008qf.b.ASPECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C4008qf.b.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16186a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3933n6 m19343a(C4008qf c4008qf, int i, int i2) {
        return new C3933n6(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final C3933n6 m19344a(C4008qf c4008qf, InterfaceC3680c6 interfaceC3680c6, int i, int i2) {
        Pair pairM43482to;
        Integer numM19191p = c4008qf.m19191p();
        int iMo17043a = numM19191p != null ? interfaceC3680c6.mo17043a(numM19191p.intValue()) : i;
        Integer numM19184i = c4008qf.m19184i();
        int iMo17043a2 = numM19184i != null ? interfaceC3680c6.mo17043a(numM19184i.intValue()) : i2;
        if (iMo17043a2 == 0 || iMo17043a == 0) {
            return m19343a(c4008qf, i, i2);
        }
        float f = iMo17043a / iMo17043a2;
        float f2 = i;
        float f3 = i2;
        if (f > f2 / f3) {
            pairM43482to = TuplesKt.m43482to(Integer.valueOf(i), Integer.valueOf((int) (f2 / f)));
        } else {
            pairM43482to = TuplesKt.m43482to(Integer.valueOf((int) (f3 * f)), Integer.valueOf(i2));
        }
        return new C3933n6(((Number) pairM43482to.component1()).intValue(), ((Number) pairM43482to.component2()).intValue());
    }

    /* JADX INFO: renamed from: b */
    public final C3933n6 m19345b(C4008qf c4008qf, InterfaceC3680c6 densityProvider, int i, int i2) {
        Intrinsics.checkNotNullParameter(c4008qf, "<this>");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        int i3 = a.f16186a[c4008qf.m19183h().ordinal()];
        if (i3 == 1) {
            return m19343a(c4008qf, i, i2);
        }
        if (i3 == 2) {
            return m19344a(c4008qf, densityProvider, i, i2);
        }
        if (i3 == 3) {
            return m19346c(c4008qf, densityProvider, i, i2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final C3933n6 m19346c(C4008qf c4008qf, InterfaceC3680c6 interfaceC3680c6, int i, int i2) {
        Integer numM19191p = c4008qf.m19191p();
        if (numM19191p != null) {
            i = interfaceC3680c6.mo17043a(numM19191p.intValue());
        }
        Integer numM19184i = c4008qf.m19184i();
        if (numM19184i != null) {
            i2 = interfaceC3680c6.mo17043a(numM19184i.intValue());
        }
        return new C3933n6(i, i2);
    }
}
