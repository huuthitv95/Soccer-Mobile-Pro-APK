package com.google.android.play.core.assetpacks;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.co */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10017co {

    /* JADX INFO: renamed from: a */
    private final Map f22207a = new HashMap();

    C10017co() {
    }

    /* JADX INFO: renamed from: a */
    final synchronized double m22623a(String str) {
        Double d = (Double) this.f22207a.get(str);
        if (d == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return d.doubleValue();
    }

    /* JADX INFO: renamed from: b */
    final synchronized double m22624b(String str, C10036dg c10036dg) {
        double d;
        int i = ((C10007ce) c10036dg).f22156g;
        d = (((double) ((C10007ce) c10036dg).f22155f) + 1.0d) / ((double) i);
        this.f22207a.put(str, Double.valueOf(d));
        return d;
    }

    /* JADX INFO: renamed from: c */
    final synchronized void m22625c(String str) {
        this.f22207a.put(str, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }
}
