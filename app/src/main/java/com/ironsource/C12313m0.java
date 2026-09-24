package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.C12357j;
import com.ironsource.mediationsdk.C12363m;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: renamed from: com.ironsource.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12313m0 extends C12461rb {

    /* JADX INFO: renamed from: b */
    private final C12616y5 f30889b;

    /* JADX INFO: renamed from: c */
    private final C12518sf.b f30890c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC11452G8 f30891d;

    public C12313m0() {
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.BANNER;
        this.f30889b = new C12616y5(enumC12328a, C11426F0.b.MEDIATION, null, null, 12, null);
        C12518sf.b bVarM33683b = C12518sf.m33683b(enumC12328a);
        Intrinsics.checkNotNullExpressionValue(bVarM33683b, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f30890c = bVarM33683b;
        this.f30891d = C11455Gb.f24351s.m25905d().mo25844f();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m32116a(C12313m0 c12313m0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c12313m0.m32120a(str, str2);
    }

    /* JADX INFO: renamed from: c */
    private final ISBannerSize m32117c(LevelPlayAdSize levelPlayAdSize) {
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LARGE)) {
            return new ISBannerSize(C12357j.f31264b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE)) {
            return new ISBannerSize(C12357j.f31265c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD)) {
            return new ISBannerSize(C12357j.f31267e, 0, 0);
        }
        return Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize(C12357j.f31263a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    /* JADX INFO: renamed from: b */
    public final List<LevelPlayAdSize> m32123b() {
        C11666Sa c11666SaMo25856a = this.f30891d.mo25856a();
        if (c11666SaMo25856a != null) {
            return c11666SaMo25856a.m27473k();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m32124d() {
        return C11455Gb.f24351s.m25905d().mo25844f().mo25858c();
    }

    /* JADX INFO: renamed from: a */
    public final String m32120a(String str, String str2) {
        String strM33688a = this.f30890c.m33688a(str, str2);
        Intrinsics.checkNotNullExpressionValue(strM33688a, "logFactory.createLogMessage(message, suffix)");
        return strM33688a;
    }

    /* JADX INFO: renamed from: a */
    public final int m32119a(int i) {
        return C12357j.m32523a(i);
    }

    /* JADX INFO: renamed from: a */
    private final ISBannerSize m32115a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeM32121b = m32121b(fallbackAdSize$mediationsdk_release);
        iSBannerSizeM32121b.setAdaptive(true);
        C12363m.f31310a.m32577a(iSBannerSizeM32121b, new C11663S7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return iSBannerSizeM32121b;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m32122b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float fM32118c = m32118c();
        if (fM32118c != null) {
            return Integer.valueOf(MathKt.roundToInt(fM32118c.floatValue() * C11762Y4.f26580a.m28008a(context)));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final ISBannerSize m32121b(LevelPlayAdSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        boolean zIsAdaptive = size.isAdaptive();
        if (zIsAdaptive) {
            return m32115a(size);
        }
        if (zIsAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return m32117c(size);
    }

    /* JADX INFO: renamed from: c */
    private final Float m32118c() {
        C11666Sa c11666SaMo25856a = this.f30891d.mo25856a();
        Float fValueOf = c11666SaMo25856a != null ? Float.valueOf(c11666SaMo25856a.m27474l()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.f30889b.m34220h().m27985f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }
}
