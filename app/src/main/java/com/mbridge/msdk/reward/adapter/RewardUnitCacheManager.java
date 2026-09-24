package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, C14223c> rewardUnitSettings;

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.RewardUnitCacheManager$b */
    private static final class C13606b {

        /* JADX INFO: renamed from: a */
        private static final RewardUnitCacheManager f37426a = new RewardUnitCacheManager();
    }

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }

    public static RewardUnitCacheManager getInstance() {
        return C13606b.f37426a;
    }

    public void add(String str, String str2, C14223c c14223c) {
        try {
            String str3 = str + "_" + str2;
            if (c14223c != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, c14223c);
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    public C14223c get(String str, String str2) {
        try {
            try {
                return this.rewardUnitSettings.remove(str + "_" + str2);
            } catch (Exception e) {
                C13219q0.m37816b(TAG, e.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
