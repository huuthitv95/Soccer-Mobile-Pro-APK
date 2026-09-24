package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: classes3.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a */
    private final String f2111a;

    /* JADX INFO: renamed from: b */
    private final int f2112b;

    private MaxRewardImpl(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f2111a = str;
        this.f2112b = i;
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f2112b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f2111a;
    }

    public String toString() {
        return "MaxReward{amount=" + this.f2112b + ", label=" + this.f2111a + "}";
    }
}
