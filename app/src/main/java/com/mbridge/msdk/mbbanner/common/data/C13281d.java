package com.mbridge.msdk.mbbanner.common.data;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.net.utils.C13119b;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.data.d */
/* JADX INFO: compiled from: BaseBannerV3Params.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13281d {

    /* JADX INFO: renamed from: a */
    private static final String f36630a = "c";

    /* JADX INFO: renamed from: a */
    public static C13126e m38171a(Context context, String str, String str2, int i, C13278a c13278a) {
        String strM36533b = C13008c.m36588n().m36533b();
        String md5 = SameMD5.getMD5(C13008c.m36588n().m36533b() + C13008c.m36588n().m36538c());
        String strM37881a = C13229v0.m37881a(context, str);
        String strM37102a = C13091b.m37102a(str, "banner");
        String closeIds = BannerUtils.getCloseIds(str);
        C13126e c13126e = new C13126e();
        C13119b.m37209a(c13126e, "app_id", strM36533b);
        C13119b.m37209a(c13126e, MBridgeConstans.PROPERTIES_UNIT_ID, str);
        if (!TextUtils.isEmpty(c13278a.m38158c())) {
            C13119b.m37209a(c13126e, MBridgeConstans.PLACEMENT_ID, c13278a.m38158c());
        }
        C13119b.m37209a(c13126e, "sign", md5);
        C13119b.m37209a(c13126e, "only_impression", "1");
        C13119b.m37209a(c13126e, "ping_mode", "1");
        C13119b.m37209a(c13126e, C13126e.f36057h, strM37881a);
        C13119b.m37209a(c13126e, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        C13119b.m37209a(c13126e, C13126e.f36058i, str2);
        C13119b.m37209a(c13126e, "ad_type", "296");
        C13119b.m37209a(c13126e, TypedValues.CycleType.S_WAVE_OFFSET, i + "");
        C13119b.m37209a(c13126e, C13126e.f36056g, strM37102a);
        C13119b.m37209a(c13126e, "close_id", closeIds);
        C13119b.m37209a(c13126e, AbstractC13068b.JSON_KEY_UNIT_SIZE, c13278a.m38161e() + "");
        C13119b.m37209a(c13126e, "refresh_time", c13278a.m38160d() + "");
        if (!TextUtils.isEmpty(c13278a.m38153a())) {
            C13119b.m37209a(c13126e, "token", c13278a.m38153a() + "");
        }
        if (!TextUtils.isEmpty(c13278a.m38156b())) {
            C13119b.m37209a(c13126e, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, c13278a.m38156b());
        }
        return c13126e;
    }
}
