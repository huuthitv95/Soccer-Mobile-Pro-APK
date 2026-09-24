package com.unity3d.mediation.rewarded;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayReward {

    /* JADX INFO: renamed from: a */
    private final String f41495a;

    /* JADX INFO: renamed from: b */
    private final int f41496b;

    public LevelPlayReward(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f41495a = name;
        this.f41496b = i;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = levelPlayReward.f41495a;
        }
        if ((i2 & 2) != 0) {
            i = levelPlayReward.f41496b;
        }
        return levelPlayReward.copy(str, i);
    }

    public final String component1() {
        return this.f41495a;
    }

    public final int component2() {
        return this.f41496b;
    }

    public final LevelPlayReward copy(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LevelPlayReward(name, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return Intrinsics.areEqual(this.f41495a, levelPlayReward.f41495a) && this.f41496b == levelPlayReward.f41496b;
    }

    public final int getAmount() {
        return this.f41496b;
    }

    public final String getName() {
        return this.f41495a;
    }

    public int hashCode() {
        return (this.f41495a.hashCode() * 31) + this.f41496b;
    }

    public String toString() {
        return "LevelPlayReward(name=" + this.f41495a + ", amount=" + this.f41496b + ")";
    }
}
