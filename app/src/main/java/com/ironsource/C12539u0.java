package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12539u0 {

    /* JADX INFO: renamed from: a */
    private final AbstractC12432q0 f32507a;

    /* JADX INFO: renamed from: b */
    private final LevelPlayAdInfo f32508b;

    public C12539u0(AbstractC12432q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f32507a = adUnit;
        this.f32508b = levelPlayAdInfo;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC12432q0 m33841a() {
        return this.f32507a;
    }

    /* JADX INFO: renamed from: b */
    public final LevelPlayAdInfo m33843b() {
        return this.f32508b;
    }

    /* JADX INFO: renamed from: c */
    public final LevelPlayAdInfo m33844c() {
        return this.f32508b;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC12432q0 m33845d() {
        return this.f32507a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12539u0)) {
            return false;
        }
        C12539u0 c12539u0 = (C12539u0) obj;
        return Intrinsics.areEqual(this.f32507a, c12539u0.f32507a) && Intrinsics.areEqual(this.f32508b, c12539u0.f32508b);
    }

    public int hashCode() {
        int iHashCode = this.f32507a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f32508b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f32507a + ", adInfo=" + this.f32508b + ")";
    }

    public /* synthetic */ C12539u0(AbstractC12432q0 abstractC12432q0, LevelPlayAdInfo levelPlayAdInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12432q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: a */
    public final C12539u0 m33842a(AbstractC12432q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C12539u0(adUnit, levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12539u0 m33840a(C12539u0 c12539u0, AbstractC12432q0 abstractC12432q0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC12432q0 = c12539u0.f32507a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c12539u0.f32508b;
        }
        return c12539u0.m33842a(abstractC12432q0, levelPlayAdInfo);
    }
}
