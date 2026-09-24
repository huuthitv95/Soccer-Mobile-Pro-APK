package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Oc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11600Oc {

    /* JADX INFO: renamed from: a */
    private final C11426F0 f25299a;

    public C11600Oc(C11426F0 eventsWrapper) {
        Intrinsics.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.f25299a = eventsWrapper;
    }

    /* JADX INFO: renamed from: a */
    public final void m26768a() {
        this.f25299a.m25748a(EnumC11372C0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    /* JADX INFO: renamed from: b */
    public final void m26773b() {
        this.f25299a.m25748a(EnumC11372C0.PAUSE_AD, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m26774c() {
        this.f25299a.m25748a(EnumC11372C0.RESUME_AD, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m26770a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f25299a.m25748a(EnumC11372C0.OPERATIONAL_LOAD_SUCCESS, map);
    }

    /* JADX INFO: renamed from: a */
    public final void m26771a(long j, int i, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i));
        map.put("reason", reason);
        map.put("duration", Long.valueOf(j));
        this.f25299a.m25748a(EnumC11372C0.OPERATIONAL_LOAD_FAILED, map);
    }

    /* JADX INFO: renamed from: a */
    public final void m26769a(double d) {
        this.f25299a.m25748a(EnumC11372C0.OPERATIONAL_SET_CONFIGURATIONS, MapsKt.mapOf(TuplesKt.m43482to(IronSourceConstants.EVENTS_EXT1, "flooring=" + d)));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m26767a(C11600Oc c11600Oc, LevelPlayReward levelPlayReward, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c11600Oc.m26772a(levelPlayReward, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m26772a(LevelPlayReward reward, String str, String str2) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_REWARD_NAME, reward.getName());
        map.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(reward.getAmount()));
        if (str != null) {
            map.put("placement", str);
        }
        if (str2 != null) {
            map.put("reason", str2);
        }
        this.f25299a.m25748a(EnumC11372C0.OPERATIONAL_GET_REWARD, map);
    }
}
