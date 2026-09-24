package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.J2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11500J2 extends C12220h0 {

    /* JADX INFO: renamed from: g */
    private final LevelPlayAdSize f24712g;

    /* JADX INFO: renamed from: h */
    private final Boolean f24713h;

    /* JADX INFO: renamed from: i */
    private final Long f24714i;

    public /* synthetic */ C11500J2(UUID uuid, String str, C12135cd c12135cd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, C11405Df c11405Df, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c12135cd, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : c11405Df, (i & 128) != 0 ? null : d);
    }

    /* JADX INFO: renamed from: i */
    public final LevelPlayAdSize m26169i() {
        return this.f24712g;
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m26170j() {
        return this.f24713h;
    }

    /* JADX INFO: renamed from: k */
    public final Long m26171k() {
        return this.f24714i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11500J2(UUID adId, String adUnitId, C12135cd c12135cd, LevelPlayAdSize adSize, Boolean bool, Long l, C11405Df c11405Df, Double d) {
        super(IronSource.EnumC12328a.BANNER, adId, adUnitId, c12135cd, c11405Df, d);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.f24712g = adSize;
        this.f24713h = bool;
        this.f24714i = l;
    }

    public C11500J2() {
        this(C12546u7.f32555a.m33891a(), "", null, null, null, null, null, null, 252, null);
    }
}
