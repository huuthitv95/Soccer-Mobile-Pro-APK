package com.mbridge.msdk.mbnative.service.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b */
/* JADX INFO: compiled from: NativeResponseHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13344b extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: a */
    private int f37026a;

    /* JADX INFO: renamed from: b */
    private String f37027b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b$a */
    /* JADX INFO: compiled from: NativeResponseHandler.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f37028a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f37029b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f37030c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f37031d;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeResponseHandler.java */
        class RunnableC15556a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignUnit f37033a;

            RunnableC15556a(CampaignUnit campaignUnit) {
                this.f37033a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f37033a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f37033a.getAds().size() <= 0) {
                    a aVar = a.this;
                    AbstractC13344b.this.mo38479a(aVar.f37031d, aVar.f37028a.optString(NotificationCompat.CATEGORY_MESSAGE));
                } else {
                    a aVar2 = a.this;
                    AbstractC13344b.this.mo38482a(aVar2.f37030c, this.f37033a);
                    AbstractC13344b.this.saveRequestTime(this.f37033a.getAds().size());
                }
            }
        }

        a(JSONObject jSONObject, String str, List list, int i) {
            this.f37028a = jSONObject;
            this.f37029b = str;
            this.f37030c = list;
            this.f37031d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f37028a.optJSONObject("data");
            C13167a.m37544c().post(new RunnableC15556a("v5".equals(this.f37029b) ? AbstractC13068b.parseV5CampaignUnit(jSONObjectOptJSONObject) : AbstractC13068b.parseCampaignUnit(jSONObjectOptJSONObject)));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo38479a(int i, String str);

    /* JADX INFO: renamed from: a */
    public void m38592a(String str) {
        this.f37027b = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo38481a(List<Frame> list);

    /* JADX INFO: renamed from: a */
    public abstract void mo38482a(List<C13837g> list, CampaignUnit campaignUnit);

    /* JADX INFO: renamed from: b */
    public String m38593b() {
        return this.f37027b;
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        mo38479a(c13113a.f35959a, C13118a.m37208a(c13113a));
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
        int i = this.f37026a;
        if (i == 0) {
            m38589b(c13117a.f35980b, c13112e.f35958c);
        } else if (i == 1) {
            m38588a(c13117a.f35980b, c13112e.f35958c);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38589b(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            mo38479a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        C13167a.m37543b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    /* JADX INFO: renamed from: a */
    public void m38591a(int i) {
        this.f37026a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m38590a() {
        return this.f37026a;
    }

    /* JADX INFO: renamed from: a */
    private void m38588a(List<C13837g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = AbstractC13068b.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
            } else {
                campaignUnit = AbstractC13068b.parseCampaignUnit(jSONObject.optJSONObject("data"));
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                mo38481a(campaignUnit.getListFrames());
                saveRequestTime(campaignUnit.getListFrames().size());
                return;
            } else {
                mo38479a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
        }
        mo38479a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
