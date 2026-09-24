package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a */
/* JADX INFO: compiled from: BannerResponseHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13293a extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: b */
    private static final String f36729b = "a";

    /* JADX INFO: renamed from: a */
    private String f36730a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a */
    /* JADX INFO: compiled from: BannerResponseHandler.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f36731a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36732b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36733c;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BannerResponseHandler.java */
        class RunnableC15554a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignUnit f36735a;

            RunnableC15554a(CampaignUnit campaignUnit) {
                this.f36735a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f36735a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f36735a.getAds().size() > 0) {
                    AbstractC13293a.this.mo38223a(this.f36735a);
                    if (!TextUtils.isEmpty(AbstractC13293a.this.f36730a)) {
                        AbstractC13293a.this.saveHbState(1);
                    }
                    AbstractC13293a.this.saveRequestTime(this.f36735a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f36735a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f36731a.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar = a.this;
                AbstractC13293a.this.mo38222a(aVar.f36733c, msg);
            }
        }

        a(JSONObject jSONObject, String str, int i) {
            this.f36731a = jSONObject;
            this.f36732b = str;
            this.f36733c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f36731a.optJSONObject("data");
            C13167a.m37544c().post(new RunnableC15554a("v5".equals(this.f36732b) ? AbstractC13068b.parseV5CampaignUnit(jSONObjectOptJSONObject, AbstractC13293a.this.f36730a) : AbstractC13068b.parseCampaignUnit(jSONObjectOptJSONObject, AbstractC13293a.this.f36730a)));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo38222a(int i, String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo38223a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        C13219q0.m37818c(f36729b, "onFailed errorCode = " + c13113a.f35959a);
        mo38222a(c13113a.f35959a, C13118a.m37208a(c13113a));
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onSuccess(C13112e<JSONObject> c13112e) {
        super.onSuccess(c13112e);
        m38294a(c13112e.f35957b.f35980b, c13112e.f35958c);
    }

    /* JADX INFO: renamed from: a */
    public void m38295a(String str) {
        this.f36730a = str;
    }

    /* JADX INFO: renamed from: a */
    private void m38294a(List<C13837g> list, JSONObject jSONObject) {
        C13219q0.m37818c(f36729b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            C13167a.m37543b().execute(new a(jSONObject, jSONObject.optString("version"), iOptInt));
            return;
        }
        mo38222a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
