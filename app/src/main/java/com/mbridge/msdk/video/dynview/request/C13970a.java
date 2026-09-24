package com.mbridge.msdk.video.dynview.request;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.InterfaceC12693j;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.out.Campaign;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.request.a */
/* JADX INFO: compiled from: MOfferReport.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13970a {

    /* JADX INFO: renamed from: a */
    private static final String f40041a = "com.mbridge.msdk.video.dynview.request.a";

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.request.a$a */
    /* JADX INFO: compiled from: MOfferReport.java */
    class a implements InterfaceC12693j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ViewGroup f40042a;

        a(ViewGroup viewGroup) {
            this.f40042a = viewGroup;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            C13227u0.m37860a(campaign, this.f40042a);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            C13227u0.m37860a(campaign, this.f40042a);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            C13227u0.m37863b(campaign, this.f40042a);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m41813a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36901i() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36901i(), false, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m41814a(Context context, CampaignEx campaignEx, String str, View view) {
        if (context == null || campaignEx == null) {
            return;
        }
        m41813a(context, campaignEx);
        C12682a c12682a = new C12682a(context, str);
        if (view instanceof ViewGroup) {
            c12682a.m34632a(new a((ViewGroup) view));
        }
        c12682a.m34633a(campaignEx);
    }

    /* JADX INFO: renamed from: a */
    public static void m41815a(CampaignEx campaignEx, Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000091");
                jSONObject.put("network_type", C13211m0.m37770s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                if (!TextUtils.isEmpty(C13088a.f35856V)) {
                    jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
                }
                if (!TextUtils.isEmpty(C13088a.f35865g)) {
                    jSONObject.put("c", C13088a.f35865g);
                }
                jSONObject.put(CampaignEx.JSON_KEY_HB, 0);
                jSONObject.put("rid_n", str3);
                jSONObject.put("reason", str);
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, C13229v0.m37903b(campaignEx.getRewardTemplateMode().m36781j()));
                }
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b(f40041a, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m41816a(CampaignUnit campaignUnit, int i, int i2, String str) {
        int i3;
        String impressionURL;
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0 || campaignUnit.getAds().get(i) == null) {
            return;
        }
        if (i2 == 0 && campaignUnit.getAds().get(i).mMoreOfferImpShow) {
            return;
        }
        String strM37645a = C13188c1.m37645a(campaignUnit.getAds().get(i).getendcard_url(), "mof_testuid");
        if (TextUtils.isEmpty(strM37645a)) {
            strM37645a = C13188c1.m37645a(campaignUnit.getAds().get(i).getendcard_url(), "mof_uid");
        }
        String str2 = TextUtils.isEmpty(strM37645a) ? str : strM37645a;
        if (i2 == 0) {
            i3 = C12701a.f33766m;
            impressionURL = campaignUnit.getAds().get(i).getImpressionURL();
        } else if (i2 != 1) {
            impressionURL = "";
            i3 = 0;
        } else {
            i3 = C12701a.f33767n;
            impressionURL = campaignUnit.getAds().get(i).getOnlyImpressionURL();
        }
        String str3 = impressionURL;
        int i4 = i3;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        C12682a.m34606a(C13008c.m36588n().m36542d(), campaignUnit.getAds().get(i), str2, str3, false, true, i4);
    }
}
