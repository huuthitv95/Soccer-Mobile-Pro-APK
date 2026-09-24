package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12450r0 {

    /* JADX INFO: renamed from: a */
    private final HashMap<String, C11656S0> f31812a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.r0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    /* JADX INFO: renamed from: a */
    public final C11656S0 m33207a(String adUnitId, List<? extends NetworkSettings> providers, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(providers, "providers");
        C11656S0 c11656s0 = this.f31812a.get(adUnitId);
        if (c11656s0 != null) {
            return c11656s0;
        }
        C11656S0 c11656s1 = new C11656S0(providers, i);
        this.f31812a.put(adUnitId, c11656s1);
        return c11656s1;
    }
}
