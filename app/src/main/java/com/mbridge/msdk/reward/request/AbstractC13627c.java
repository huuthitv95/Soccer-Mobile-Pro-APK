package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.error.C13081a;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c */
/* JADX INFO: compiled from: RewardResponseHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13627c extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: d */
    private static final String f37902d = "c";

    /* JADX INFO: renamed from: a */
    private int f37903a;

    /* JADX INFO: renamed from: b */
    private String f37904b;

    /* JADX INFO: renamed from: c */
    private C13154c f37905c;

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a */
    /* JADX INFO: compiled from: RewardResponseHandler.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f37906a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f37907b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f37908c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f37909d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardResponseHandler.java */
        class RunnableC15563a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignUnit f37911a;

            RunnableC15563a(CampaignUnit campaignUnit) {
                this.f37911a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f37911a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f37911a.getAds().size() > 0) {
                    this.f37911a.setMetricsData(AbstractC13627c.this.f37905c);
                    a aVar = a.this;
                    AbstractC13627c.this.mo39357a(aVar.f37908c, this.f37911a);
                    AbstractC13627c.this.saveRequestTime(this.f37911a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f37911a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f37906a.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar2 = a.this;
                AbstractC13627c abstractC13627c = AbstractC13627c.this;
                abstractC13627c.mo39355a(aVar2.f37909d, msg, abstractC13627c.f37905c);
            }
        }

        a(JSONObject jSONObject, String str, List list, int i) {
            this.f37906a = jSONObject;
            this.f37907b = str;
            this.f37908c = list;
            this.f37909d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f37906a.optJSONObject("data");
            C13167a.m37544c().post(new RunnableC15563a("v5".equals(this.f37907b) ? AbstractC13068b.parseV5CampaignUnit(jSONObjectOptJSONObject, AbstractC13627c.this.f37904b) : AbstractC13068b.parseCampaignUnit(jSONObjectOptJSONObject, AbstractC13627c.this.f37904b)));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39359a(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            m39360a(list, jSONObject, iOptInt, this.f37905c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? AbstractC13068b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f37904b) : AbstractC13068b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f37904b);
        if (v5CampaignUnit != null && v5CampaignUnit.getListFrames() != null && v5CampaignUnit.getListFrames().size() > 0) {
            List<Frame> listFrames = v5CampaignUnit.getListFrames();
            mo39356a(listFrames);
            saveRequestTime(listFrames.size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            mo39355a(iOptInt, msg, this.f37905c);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39360a(List<C13837g> list, JSONObject jSONObject, int i, C13154c c13154c) {
        String strM41106b = "";
        if (list != null && list.size() > 0) {
            for (C13837g c13837g : list) {
                if (c13837g != null) {
                    String strM41105a = c13837g.m41105a();
                    if (!TextUtils.isEmpty(strM41105a) && strM41105a.equals("data_res_type")) {
                        strM41106b = c13837g.m41106b();
                    }
                }
            }
        }
        String strM37032l = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (TextUtils.isEmpty(strM41106b) || !strM41106b.equals("1")) {
            C13082b c13082bM37011a = i == -1 ? C13081a.m37011a(880017, strM37032l) : C13081a.m37011a(880003, strM37032l);
            if (c13154c != null) {
                c13154c.m37422a(c13082bM37011a);
                c13154c.m37433c(false);
                if (TextUtils.isEmpty(strM37032l)) {
                    strM37032l = c13082bM37011a.m37032l();
                }
            }
            mo39355a(i, strM37032l, c13154c);
            return;
        }
        C13082b c13082bM37011a2 = C13081a.m37011a(880018, strM37032l);
        if (c13154c != null) {
            c13154c.m37422a(c13082bM37011a2);
            c13154c.m37433c(true);
            if (TextUtils.isEmpty(strM37032l)) {
                strM37032l = c13082bM37011a2.m37032l();
            }
        }
        mo39355a(i, strM37032l, c13154c);
    }

    /* JADX INFO: renamed from: b */
    private void m39362b(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            m39360a(list, jSONObject, iOptInt, this.f37905c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        C13167a.m37543b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo39355a(int i, String str, C13154c c13154c);

    /* JADX INFO: renamed from: a */
    public void m39363a(C13154c c13154c) {
        this.f37905c = c13154c;
    }

    /* JADX INFO: renamed from: a */
    public void m39364a(String str) {
        this.f37904b = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo39356a(List<Frame> list);

    /* JADX INFO: renamed from: a */
    public abstract void mo39357a(List<C13837g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        C13219q0.m37816b(f37902d, "errorCode = " + c13113a.f35959a);
        C13082b c13082b = new C13082b(c13113a.f35959a, C13118a.m37208a(c13113a));
        c13082b.m37019a("campaign_request_error", c13113a);
        c13082b.m37020a(c13113a.f35960b);
        this.f37905c.m37422a(c13082b);
        mo39355a(c13113a.f35959a, C13118a.m37208a(c13113a), this.f37905c);
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onSuccess(C13112e<JSONObject> c13112e) {
        C13117a c13117a;
        super.onSuccess(c13112e);
        if (c13112e == null || (c13117a = c13112e.f35957b) == null) {
            return;
        }
        int i = this.f37903a;
        if (i == 0) {
            m39362b(c13117a.f35980b, c13112e.f35958c);
        } else if (i == 1) {
            m39359a(c13117a.f35980b, c13112e.f35958c);
        }
    }
}
