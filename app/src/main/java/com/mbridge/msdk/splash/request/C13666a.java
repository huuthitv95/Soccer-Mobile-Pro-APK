package com.mbridge.msdk.splash.request;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.net.utils.C13119b;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.request.a */
/* JADX INFO: compiled from: BaseSplashV3Params.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13666a {
    /* JADX INFO: renamed from: a */
    public static C13126e m40030a(Context context, MBridgeIds mBridgeIds, C13671f c13671f) {
        String strM36533b = C13008c.m36588n().m36533b();
        String md5 = SameMD5.getMD5(C13008c.m36588n().m36533b() + C13008c.m36588n().m36538c());
        C13126e c13126e = new C13126e();
        String strM37102a = C13091b.m37102a(mBridgeIds.getUnitId(), "splash");
        String strM37881a = C13229v0.m37881a(context, mBridgeIds.getUnitId());
        C13119b.m37209a(c13126e, "app_id", strM36533b);
        C13119b.m37209a(c13126e, MBridgeConstans.PROPERTIES_UNIT_ID, mBridgeIds.getUnitId());
        if (!TextUtils.isEmpty(mBridgeIds.getPlacementId())) {
            C13119b.m37209a(c13126e, MBridgeConstans.PLACEMENT_ID, mBridgeIds.getPlacementId());
        }
        C13119b.m37209a(c13126e, "sign", md5);
        C13119b.m37209a(c13126e, "req_type", c13671f.m40046d() + "");
        C13119b.m37209a(c13126e, "ad_num", "1");
        C13119b.m37209a(c13126e, "tnum", "1");
        C13119b.m37209a(c13126e, "only_impression", "1");
        C13119b.m37209a(c13126e, "ping_mode", "1");
        C13119b.m37209a(c13126e, C13126e.f36056g, strM37102a);
        C13119b.m37209a(c13126e, C13126e.f36057h, strM37881a);
        C13119b.m37209a(c13126e, C13126e.f36058i, c13671f.m40048e());
        C13119b.m37209a(c13126e, "ad_type", "297");
        C13119b.m37209a(c13126e, TypedValues.CycleType.S_WAVE_OFFSET, c13671f.m40044c() + "");
        C13119b.m37209a(c13126e, AbstractC13068b.JSON_KEY_UNIT_SIZE, c13671f.m40042b() + "x" + c13671f.m40039a());
        return c13126e;
    }
}
