package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.reward.report.C13623a;
import com.mbridge.msdk.videocommon.cache.C14201a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.c */
/* JADX INFO: compiled from: RewardVideoControllerInitTask.java */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC13615c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final Context f37838a;

    /* JADX INFO: renamed from: b */
    private final String f37839b;

    public RunnableC13615c(Context context, String str) {
        this.f37838a = context;
        this.f37839b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM42434c;
        if (this.f37838a == null || TextUtils.isEmpty(this.f37839b)) {
            return;
        }
        try {
            C13623a.m39350a(this.f37838a, this.f37839b);
            C13215o0.m37791a();
            C13215o0.m37793a(C13098e.m37149b(EnumC13096c.MBRIDGE_700_RES));
            C13215o0.m37793a(C13098e.m37149b(EnumC13096c.MBRIDGE_700_HTML));
            C14222b.m42658b().m42668b(this.f37839b);
            if (C13223s0.m37831a().m37842a("c_d_v_w_i", false) || TextUtils.isEmpty(this.f37839b) || (copyOnWriteArrayListM42434c = C14201a.m42411a().m42434c(this.f37839b, 1)) == null || copyOnWriteArrayListM42434c.size() <= 0) {
                return;
            }
            C14203b.getInstance().createUnitCache(this.f37838a, this.f37839b, copyOnWriteArrayListM42434c, 94, (InterfaceC14217a) null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("RewardVideoControllerInitTask", "initRewardVideoController task ", e);
            }
        }
    }
}
