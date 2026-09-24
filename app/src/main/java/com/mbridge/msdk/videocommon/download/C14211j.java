package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.j */
/* JADX INFO: compiled from: RewardVideoRefactorManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14211j {

    /* JADX INFO: renamed from: a */
    private AtomicBoolean f41039a;

    /* JADX INFO: renamed from: b */
    private AtomicBoolean f41040b;

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.j$b */
    /* JADX INFO: compiled from: RewardVideoRefactorManager.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private static final C14211j f41041a = new C14211j();
    }

    private C14211j() {
    }

    /* JADX INFO: renamed from: a */
    public static C14211j m42542a() {
        return b.f41041a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m42543a(int i) {
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37818c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f41040b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f41040b = new AtomicBoolean(C13223s0.m37831a().m37842a("r_v_r_f_c_r", false));
        } catch (Exception e) {
            this.f41040b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.f41040b.get();
    }

    /* JADX INFO: renamed from: b */
    public boolean m42544b(int i) {
        if (MBridgeConstans.DEBUG) {
            C13219q0.m37818c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f41039a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f41039a = new AtomicBoolean(C13223s0.m37831a().m37842a("r_v_r_f_l", false));
        } catch (Exception e) {
            this.f41039a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.f41039a.get();
    }
}
