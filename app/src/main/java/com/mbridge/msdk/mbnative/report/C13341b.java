package com.mbridge.msdk.mbnative.report;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13078l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13200h;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.listener.C13339a;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.report.b */
/* JADX INFO: compiled from: NativeReportUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13341b {

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.report.b$a */
    /* JADX INFO: compiled from: NativeReportUtils.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f37019a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f37020b;

        a(Context context, CampaignEx campaignEx) {
            this.f37019a = context;
            this.f37020b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j.m36706a(C13017g.m36693a(this.f37019a)).m36709b(this.f37020b.getId());
            } catch (Exception unused) {
                C13219q0.m37816b("NativeReportUtils", "campain can't insert db");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m38566a(CampaignEx campaignEx, Context context, String str, C13339a c13339a) {
        if (campaignEx == null) {
            return;
        }
        C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
        boolean z = c13635gM39714b == null || c13635gM39714b.m39539n() == 1;
        if (!campaignEx.isReport()) {
            campaignEx.setReport(true);
            m38565a(campaignEx, context, str);
            m38567a(campaignEx, context, str, c13339a, z);
            m38568a(m38564a(campaignEx), campaignEx, context, str);
            m38570b(campaignEx, context, str);
            m38569b(campaignEx);
        }
        if (c13339a != null && !campaignEx.isCallBackImpression()) {
            if (!z) {
                try {
                    c13339a.onLoggingImpression(campaignEx.getType());
                } catch (Exception e) {
                    Log.e("NativeReportUtils", e.getMessage());
                }
            }
            campaignEx.setCallBackImpression(true);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m38569b(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        C13078l c13078l = new C13078l();
        c13078l.m36936a(0);
        C13200h.m37698a(arrayList, c13078l);
    }

    /* JADX INFO: renamed from: b */
    private static synchronized void m38570b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls != null && pv_urls.size() > 0) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        CampaignEx campaignEx2 = campaignEx;
                        Context context2 = context;
                        String str2 = str;
                        C12682a.m34605a(context2, campaignEx2, str2, it.next(), false, true);
                        context = context2;
                        campaignEx = campaignEx2;
                        str = str2;
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37813a("NativeReportUtils", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m38565a(CampaignEx campaignEx, Context context, String str) {
        C13008c.m36588n().m36527a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            C13167a.m37543b().execute(new a(context, campaignEx));
            C12682a.m34606a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, C12701a.f33766m);
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().m36915p() != null) {
            C12682a.m34607a(context, campaignEx, str, campaignEx.getNativeVideoTracking().m36915p(), false, false);
        }
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m38567a(CampaignEx campaignEx, Context context, String str, C13339a c13339a, boolean z) {
        Map<String, Long> map;
        if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = NativeController.f36827d0) != null && !map.containsKey(campaignEx.getOnlyImpressionURL())) {
            if (z && c13339a != null) {
                try {
                    c13339a.onLoggingImpression(campaignEx.getAdType());
                } catch (Exception e) {
                    Log.e("NativeReportUtils", e.getMessage());
                }
            }
            NativeController.f36827d0.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            C12682a.m34606a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, C12701a.f33767n);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m38568a(List<String> list, CampaignEx campaignEx, Context context, String str) {
        CampaignEx campaignEx2;
        Context context2;
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            String str3 = list.get(i);
            if (TextUtils.isEmpty(str3)) {
                campaignEx2 = campaignEx;
                context2 = context;
                str2 = str;
            } else {
                campaignEx2 = campaignEx;
                context2 = context;
                str2 = str;
                C12682a.m34605a(context2, campaignEx2, str2, str3, false, false);
            }
            i++;
            context = context2;
            campaignEx = campaignEx2;
            str = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m38564a(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        if (campaignEx != null) {
            String ad_url_list = campaignEx.getAd_url_list();
            if (!TextUtils.isEmpty(ad_url_list)) {
                try {
                    JSONArray jSONArray = new JSONArray(ad_url_list);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add((String) jSONArray.get(i));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
