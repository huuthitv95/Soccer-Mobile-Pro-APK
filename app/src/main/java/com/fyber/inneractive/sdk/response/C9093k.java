package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.EnumC8397n;
import com.fyber.inneractive.sdk.network.InterfaceC8400o;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C9093k implements InterfaceC9092j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8400o f21336a;

    public C9093k(InterfaceC8400o interfaceC8400o) {
        this.f21336a = interfaceC8400o;
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC9092j
    /* JADX INFO: renamed from: a */
    public final String mo20333a() {
        return this.f21336a.mo20775a().toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m21896a(Map map, EnumC8397n enumC8397n) {
        String lowerCase = enumC8397n.m20774a().toLowerCase(Locale.US);
        String str = (String) map.get(lowerCase);
        IAlog.m21949e("%s%s extracted from response header: %s", IAlog.m21943a(this), lowerCase, str);
        IAlog.m21948d("%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC9092j
    /* JADX INFO: renamed from: a */
    public final void mo20335a(AbstractC9084b abstractC9084b) {
        float f;
        Long lValueOf;
        abstractC9084b.f21280a.f21291A = false;
        IAConfigManager.f17654M.f17691w.f17893f = false;
        ImpressionData impressionData = new ImpressionData();
        Map mapMo20776b = this.f21336a.mo20776b();
        String strM21896a = m21896a(mapMo20776b, EnumC8397n.RETURNED_AD_TYPE);
        m21896a(mapMo20776b, EnumC8397n.ERROR_CODE);
        String strM21896a2 = m21896a(mapMo20776b, EnumC8397n.SESSION_ID);
        String strM21896a3 = m21896a(mapMo20776b, EnumC8397n.CONTENT_ID);
        m21896a(mapMo20776b, EnumC8397n.PUBLISHER_ID);
        String strM21896a4 = m21896a(mapMo20776b, EnumC8397n.WIDTH);
        String strM21896a5 = m21896a(mapMo20776b, EnumC8397n.HEIGHT);
        String strM21896a6 = m21896a(mapMo20776b, EnumC8397n.SDK_IMPRESSION_URL);
        String strM21896a7 = m21896a(mapMo20776b, EnumC8397n.SDK_CLICK_URL);
        String strM21896a8 = m21896a(mapMo20776b, EnumC8397n.AD_TIMEOUT);
        String strM21896a9 = m21896a(mapMo20776b, EnumC8397n.AD_COMPLETION_URL);
        abstractC9084b.f21281b = m21896a(mapMo20776b, EnumC8397n.AD_UNIT_ID);
        m21896a(mapMo20776b, EnumC8397n.AD_UNIT_TYPE);
        String strM21896a10 = m21896a(mapMo20776b, EnumC8397n.AD_UNIT_DISPLAY_TYPE);
        String strM21896a11 = m21896a(mapMo20776b, EnumC8397n.AD_NETWORK);
        String strM21896a12 = m21896a(mapMo20776b, EnumC8397n.AD_NETWORK_ID);
        String strM21896a13 = m21896a(mapMo20776b, EnumC8397n.CREATIVE_ID);
        String strM21896a14 = m21896a(mapMo20776b, EnumC8397n.AD_DOMAIN);
        String strM21896a15 = m21896a(mapMo20776b, EnumC8397n.APP_BUNDLE);
        String strM21896a16 = m21896a(mapMo20776b, EnumC8397n.CAMPAIGN_ID);
        String strM21896a17 = m21896a(mapMo20776b, EnumC8397n.CPM_VALUE);
        String strM21896a18 = m21896a(mapMo20776b, EnumC8397n.CPM_CURRENCY);
        impressionData.setCpmValue(strM21896a17);
        impressionData.setCurrency(strM21896a18);
        String strM21896a19 = m21896a(mapMo20776b, EnumC8397n.BANNER_MRC_PERCENT);
        String strM21896a20 = m21896a(mapMo20776b, EnumC8397n.BANNER_MRC_DURATION);
        String strM21896a21 = m21896a(mapMo20776b, EnumC8397n.BANNER_MRC_IMPRESSION_URL);
        String strM21896a22 = m21896a(mapMo20776b, EnumC8397n.INTERSTITIAL_SKIP_MODE);
        String strM21896a23 = m21896a(mapMo20776b, EnumC8397n.IGNITE_INSTALL_URL);
        String strM21896a24 = m21896a(mapMo20776b, EnumC8397n.IGNITE_MODE);
        String strM21896a25 = m21896a(mapMo20776b, EnumC8397n.APP_BUNDLE_LAUNCHER);
        String strM21896a26 = m21896a(mapMo20776b, EnumC8397n.BRAND_BIDDER_SHOW_ENDCARD);
        String strM21896a27 = m21896a(mapMo20776b, EnumC8397n.BRAND_BIDDER_CTA_TEXT);
        String strM21896a28 = m21896a(mapMo20776b, EnumC8397n.MRAID_VIDEO_SIGNAL);
        String strM21896a29 = m21896a(mapMo20776b, EnumC8397n.CREATIVE_TYPE);
        if (abstractC9084b.mo21888b()) {
            abstractC9084b.f21280a.f21316p = mapMo20776b;
        }
        abstractC9084b.f21280a.m21892a(strM21896a8);
        impressionData.setImpressionId(strM21896a2);
        impressionData.setDemandSource(strM21896a11);
        AbstractC9087e abstractC9087e = abstractC9084b.f21280a;
        abstractC9087e.f21304d = strM21896a3;
        abstractC9087e.getClass();
        abstractC9084b.f21280a.f21324x = strM21896a15;
        if (!TextUtils.isEmpty(strM21896a12)) {
            if (TextUtils.isEmpty(strM21896a12)) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(strM21896a12);
                } catch (NumberFormatException unused) {
                    lValueOf = null;
                }
            }
            impressionData.setDemandId(lValueOf);
        }
        if (!TextUtils.isEmpty(strM21896a)) {
            abstractC9084b.f21280a.f21307g = Integer.valueOf(strM21896a).intValue();
        }
        if (!TextUtils.isEmpty(strM21896a4)) {
            abstractC9084b.f21280a.f21305e = Integer.valueOf(strM21896a4).intValue();
        }
        if (!TextUtils.isEmpty(strM21896a5)) {
            abstractC9084b.f21280a.f21306f = Integer.valueOf(strM21896a5).intValue();
        }
        AbstractC9087e abstractC9087e2 = abstractC9084b.f21280a;
        abstractC9087e2.f21311k = strM21896a6;
        abstractC9087e2.f21312l = strM21896a7;
        abstractC9087e2.f21315o = strM21896a9;
        abstractC9087e2.f21313m = abstractC9084b.f21281b;
        try {
            abstractC9087e2.f21314n = UnitDisplayType.fromValue(strM21896a10);
        } catch (IllegalArgumentException unused2) {
            abstractC9084b.f21280a.f21314n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(strM21896a13)) {
            impressionData.setCreativeId(strM21896a13);
        }
        if (!TextUtils.isEmpty(strM21896a14)) {
            impressionData.setAdvertiserDomain(strM21896a14);
        }
        if (!TextUtils.isEmpty(strM21896a16)) {
            impressionData.setCampaignId(strM21896a16);
        }
        impressionData.setCountry(AbstractC9162k.m21973i());
        AbstractC9087e abstractC9087e3 = abstractC9084b.f21280a;
        abstractC9087e3.f21318r = impressionData;
        abstractC9087e3.f21319s = AbstractC9195v.m22022a(strM21896a19, 0);
        AbstractC9087e abstractC9087e4 = abstractC9084b.f21280a;
        if (TextUtils.isEmpty(strM21896a20)) {
            f = -1.0f;
        } else {
            try {
                f = Float.parseFloat(strM21896a20);
            } catch (NumberFormatException unused3) {
                f = -1.0f;
            }
        }
        abstractC9087e4.f21320t = f;
        AbstractC9087e abstractC9087e5 = abstractC9084b.f21280a;
        abstractC9087e5.f21321u = strM21896a21;
        abstractC9087e5.f21322v = AbstractC9195v.m22022a(strM21896a22, -1);
        if (!TextUtils.isEmpty(strM21896a23)) {
            abstractC9084b.f21280a.f21294D = strM21896a23;
        }
        if (!TextUtils.isEmpty(strM21896a24)) {
            AbstractC9087e abstractC9087e6 = abstractC9084b.f21280a;
            EnumC8253m enumC8253mM20653a = EnumC8253m.m20653a(strM21896a24);
            if (enumC8253mM20653a == null) {
                abstractC9087e6.getClass();
                enumC8253mM20653a = EnumC8253m.NONE;
            }
            abstractC9087e6.f21295E = enumC8253mM20653a;
        }
        if (!TextUtils.isEmpty(strM21896a25)) {
            abstractC9084b.f21280a.f21296F = strM21896a25;
        }
        if (!TextUtils.isEmpty(strM21896a26)) {
            abstractC9084b.f21280a.f21292B = strM21896a26;
        }
        if (!TextUtils.isEmpty(strM21896a27)) {
            abstractC9084b.f21280a.f21293C = strM21896a27;
        }
        abstractC9084b.f21280a.f21297G = "1".equals(strM21896a28) || Boolean.parseBoolean(strM21896a28);
        abstractC9084b.f21280a.f21300J = CreativeType.fromValue(strM21896a29);
    }
}
