package com.adjust.sdk;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class FirstSessionDelayManager {

    /* JADX INFO: renamed from: a */
    public final ActivityHandler f285a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f286b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f287c = 0;

    public FirstSessionDelayManager(ActivityHandler activityHandler) {
        this.f285a = activityHandler;
    }

    /* JADX INFO: renamed from: a */
    public final void m842a(Runnable runnable, String str) {
        if (this.f287c != 3) {
            runnable.run();
            return;
        }
        this.f285a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        this.f286b.add(runnable);
    }

    /* JADX INFO: renamed from: a */
    public final void m843a(String str, IRunActivityHandler iRunActivityHandler) {
        if (this.f287c != 3) {
            iRunActivityHandler.run(this.f285a);
            return;
        }
        this.f285a.getAdjustConfig().getLogger().debug("Enqueuing \"" + str + "\" action to be executed after first session delay ends", new Object[0]);
        this.f285a.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
    }
}
