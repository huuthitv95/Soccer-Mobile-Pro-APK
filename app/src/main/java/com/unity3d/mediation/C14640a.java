package com.unity3d.mediation;

import com.ironsource.mediationsdk.IronSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.unity3d.mediation.a */
/* JADX INFO: loaded from: classes7.dex */
public final class C14640a {

    /* JADX INFO: renamed from: a */
    public static final C14640a f41480a = new C14640a();

    /* JADX INFO: renamed from: com.unity3d.mediation.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41481a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41481a = iArr;
        }
    }

    private C14640a() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final IronSource.EnumC12328a m43197a(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = a.f41481a[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.EnumC12328a.BANNER;
        }
        if (i == 2) {
            return IronSource.EnumC12328a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.EnumC12328a.REWARDED_VIDEO;
        }
        if (i == 4) {
            return IronSource.EnumC12328a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
