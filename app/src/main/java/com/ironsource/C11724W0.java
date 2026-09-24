package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.W0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11724W0 {

    /* JADX INFO: renamed from: a */
    public static final C11724W0 f26071a = new C11724W0();

    /* JADX INFO: renamed from: com.ironsource.W0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26072a;

        static {
            int[] iArr = new int[IronSource.EnumC12328a.values().length];
            try {
                iArr[IronSource.EnumC12328a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.EnumC12328a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.EnumC12328a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.EnumC12328a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26072a = iArr;
        }
    }

    private C11724W0() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final C11540L6.a m27784a(IronSource.EnumC12328a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i = a.f26072a[adUnit.ordinal()];
        if (i == 1) {
            return C11540L6.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return C11540L6.a.INTERSTITIAL;
        }
        if (i == 3) {
            return C11540L6.a.BANNER;
        }
        if (i == 4) {
            return C11540L6.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
