package com.ironsource;

import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ed */
/* JADX INFO: loaded from: classes6.dex */
public final class C11421Ed implements InterfaceC11559M7, InterfaceC11559M7.a {

    /* JADX INFO: renamed from: a */
    private final Map<String, LevelPlayReward> f24278a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private final Map<String, LevelPlayReward> f24279b = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC11559M7.a
    /* JADX INFO: renamed from: a */
    public void mo25733a(String placement, String rewardName, int i) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f24278a.put(placement, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.InterfaceC11559M7.a
    /* JADX INFO: renamed from: b */
    public void mo25735b(String adUnitId, String rewardName, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f24279b.put(adUnitId, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.InterfaceC11559M7
    /* JADX INFO: renamed from: a */
    public LevelPlayReward mo25732a(String str, String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        LevelPlayReward levelPlayRewardMo25731a = mo25731a(str);
        if (levelPlayRewardMo25731a != null) {
            return levelPlayRewardMo25731a;
        }
        LevelPlayReward levelPlayRewardMo25734b = mo25734b(adUnitId);
        return levelPlayRewardMo25734b == null ? m25730a() : levelPlayRewardMo25734b;
    }

    @Override // com.ironsource.InterfaceC11559M7
    /* JADX INFO: renamed from: b */
    public LevelPlayReward mo25734b(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return this.f24279b.get(adUnitId);
    }

    @Override // com.ironsource.InterfaceC11559M7
    /* JADX INFO: renamed from: a */
    public LevelPlayReward mo25731a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f24278a.get(str);
    }

    /* JADX INFO: renamed from: a */
    private final LevelPlayReward m25730a() {
        return new LevelPlayReward("", 0);
    }
}
