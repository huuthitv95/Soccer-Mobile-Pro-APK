package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h0 */
/* JADX INFO: loaded from: classes6.dex */
public class C12220h0 {

    /* JADX INFO: renamed from: a */
    private final IronSource.EnumC12328a f30446a;

    /* JADX INFO: renamed from: b */
    private final UUID f30447b;

    /* JADX INFO: renamed from: c */
    private final String f30448c;

    /* JADX INFO: renamed from: d */
    private C12135cd f30449d;

    /* JADX INFO: renamed from: e */
    private final C11405Df f30450e;

    /* JADX INFO: renamed from: f */
    private final Double f30451f;

    /* JADX INFO: renamed from: com.ironsource.h0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30452a;

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
            f30452a = iArr;
        }
    }

    public C12220h0(IronSource.EnumC12328a adFormat, UUID adId, String adUnitId, C12135cd c12135cd, C11405Df c11405Df, Double d) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f30446a = adFormat;
        this.f30447b = adId;
        this.f30448c = adUnitId;
        this.f30449d = c12135cd;
        this.f30450e = c11405Df;
        this.f30451f = d;
    }

    /* JADX INFO: renamed from: a */
    public final IronSource.EnumC12328a m31567a() {
        return this.f30446a;
    }

    /* JADX INFO: renamed from: b */
    public final UUID m31569b() {
        return this.f30447b;
    }

    /* JADX INFO: renamed from: c */
    public final String m31570c() {
        return this.f30448c;
    }

    /* JADX INFO: renamed from: d */
    public final Double m31571d() {
        return this.f30451f;
    }

    /* JADX INFO: renamed from: e */
    public final LevelPlay.AdFormat m31572e() {
        int i = a.f30452a[this.f30446a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public final C12135cd m31573f() {
        return this.f30449d;
    }

    /* JADX INFO: renamed from: g */
    public final C11405Df m31574g() {
        return this.f30450e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m31575h() {
        return CollectionsKt.listOf((Object[]) new IronSource.EnumC12328a[]{IronSource.EnumC12328a.REWARDED_VIDEO, IronSource.EnumC12328a.INTERSTITIAL}).contains(this.f30446a);
    }

    /* JADX INFO: renamed from: a */
    public final void m31568a(C12135cd c12135cd) {
        this.f30449d = c12135cd;
    }

    public /* synthetic */ C12220h0(IronSource.EnumC12328a enumC12328a, UUID uuid, String str, C12135cd c12135cd, C11405Df c11405Df, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC12328a, uuid, str, (i & 8) != 0 ? null : c12135cd, (i & 16) != 0 ? null : c11405Df, (i & 32) != 0 ? null : d);
    }
}
