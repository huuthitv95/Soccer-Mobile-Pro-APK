package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.external.b */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8055b implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        SharedPreferences sharedPreferences = AbstractC9174o.f21470a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences == null || !sharedPreferences.contains("IAConfigFQE")) {
            IAConfigManager.m20379e();
            new C8428w(EnumC8424u.FIRST_OPENED, (InneractiveAdRequest) null, (AbstractC9087e) null).m20808a((String) null);
        }
    }
}
