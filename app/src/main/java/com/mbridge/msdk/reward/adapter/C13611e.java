package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C12538u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.net.utils.C13119b;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.e */
/* JADX INFO: compiled from: RewardVideoRequestParams.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13611e {

    /* JADX INFO: renamed from: a */
    private final String f37710a;

    /* JADX INFO: renamed from: b */
    private final String f37711b;

    /* JADX INFO: renamed from: c */
    private final boolean f37712c;

    /* JADX INFO: renamed from: d */
    private final C14223c f37713d;

    /* JADX INFO: renamed from: e */
    private final String f37714e;

    public C13611e(String str, String str2, boolean z, C14223c c14223c, String str3) {
        this.f37710a = str;
        this.f37711b = str2;
        this.f37712c = z;
        this.f37713d = c14223c;
        this.f37714e = str3;
    }

    /* JADX INFO: renamed from: a */
    public C13126e m39150a(boolean z, String str, int i, String str2, String str3, String str4, String str5, boolean z2, int i2) {
        int iM42716e;
        int iM42706b;
        String strM36533b = C13008c.m36588n().m36533b();
        String md5 = SameMD5.getMD5(C13008c.m36588n().m36533b() + C13008c.m36588n().m36538c());
        int i3 = z ? 2 : 3;
        C14223c c14223c = this.f37713d;
        if (c14223c != null) {
            iM42716e = c14223c.m42716e();
            iM42706b = this.f37713d.m42706b();
        } else {
            iM42716e = 0;
            iM42706b = 0;
        }
        String strM37102a = C13091b.m37102a(this.f37711b, C12538u.f32489j);
        int i4 = this.f37712c ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94;
        C13126e c13126e = new C13126e();
        C13119b.m37209a(c13126e, "app_id", strM36533b);
        C13119b.m37209a(c13126e, MBridgeConstans.PROPERTIES_UNIT_ID, this.f37711b);
        if (!TextUtils.isEmpty(this.f37710a)) {
            C13119b.m37209a(c13126e, MBridgeConstans.PLACEMENT_ID, this.f37710a);
        }
        if (C13884b.m41421a()) {
            C13119b.m37209a(c13126e, "ttc_ids", str4 == null ? "" : str4);
            C13119b.m37209a(c13126e, "install_ids", str3 == null ? "" : str3);
        }
        C13119b.m37209a(c13126e, "sign", md5);
        C13119b.m37209a(c13126e, "req_type", String.valueOf(i3));
        C13119b.m37209a(c13126e, "ad_num", String.valueOf(iM42716e));
        if (this.f37712c) {
            iM42706b = 1;
        }
        C13119b.m37209a(c13126e, "tnum", String.valueOf(iM42706b));
        C13119b.m37209a(c13126e, "only_impression", "1");
        C13119b.m37209a(c13126e, "ping_mode", "1");
        C13119b.m37209a(c13126e, C13126e.f36056g, strM37102a);
        String str6 = C13126e.f36057h;
        if (str == null) {
            str = "";
        }
        C13119b.m37209a(c13126e, str6, str);
        C13119b.m37209a(c13126e, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        String str7 = C13126e.f36058i;
        if (str2 == null) {
            str2 = "";
        }
        C13119b.m37209a(c13126e, str7, str2);
        C13119b.m37209a(c13126e, "ad_type", String.valueOf(i4));
        C13119b.m37209a(c13126e, TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(i));
        if (!TextUtils.isEmpty(str5)) {
            C13119b.m37209a(c13126e, "token", str5);
        }
        if (this.f37712c) {
            if (i2 == C13088a.f35843I || i2 == C13088a.f35842H) {
                C13119b.m37209a(c13126e, "ivrwd", "1");
            } else {
                C13119b.m37209a(c13126e, "ivrwd", "0");
            }
        }
        C14223c c14223c2 = this.f37713d;
        if (c14223c2 != null && !TextUtils.isEmpty(c14223c2.m42699a())) {
            C13119b.m37209a(c13126e, "u_stid", this.f37713d.m42699a());
        }
        C14221a c14221aM42670c = C14222b.m42658b().m42670c();
        if (c14221aM42670c != null && !TextUtils.isEmpty(c14221aM42670c.m42633a())) {
            C13119b.m37209a(c13126e, "r_stid", c14221aM42670c.m42633a());
        }
        C13119b.m37209a(c13126e, "rw_plus", z2 ? "1" : "0");
        String strM37921d = C13229v0.m37921d(this.f37711b);
        if (!TextUtils.isEmpty(strM37921d)) {
            C13119b.m37209a(c13126e, "j", strM37921d);
        }
        String str8 = this.f37714e;
        C13119b.m37209a(c13126e, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str8 != null ? str8 : "");
        return c13126e;
    }
}
