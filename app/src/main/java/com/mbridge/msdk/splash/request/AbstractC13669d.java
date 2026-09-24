package com.mbridge.msdk.splash.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d */
/* JADX INFO: compiled from: SplashResponseHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13669d extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: c */
    private static final String f38357c = "d";

    /* JADX INFO: renamed from: a */
    private int f38358a;

    /* JADX INFO: renamed from: b */
    private String f38359b;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d$a */
    /* JADX INFO: compiled from: SplashResponseHandler.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f38360a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f38361b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f38362c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f38363d;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SplashResponseHandler.java */
        class RunnableC15564a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignUnit f38365a;

            RunnableC15564a(CampaignUnit campaignUnit) {
                this.f38365a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f38365a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f38365a.getAds().size() > 0) {
                    a aVar = a.this;
                    AbstractC13669d.this.mo40033a(aVar.f38362c, this.f38365a);
                    AbstractC13669d.this.saveRequestTime(this.f38365a.getAds().size());
                } else {
                    CampaignUnit campaignUnit2 = this.f38365a;
                    String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = a.this.f38360a.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    a aVar2 = a.this;
                    AbstractC13669d.this.mo40031a(aVar2.f38363d, msg);
                }
            }
        }

        a(JSONObject jSONObject, String str, List list, int i) {
            this.f38360a = jSONObject;
            this.f38361b = str;
            this.f38362c = list;
            this.f38363d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f38360a.optJSONObject("data");
            C13167a.m37544c().post(new RunnableC15564a("v5".equals(this.f38361b) ? AbstractC13068b.parseV5CampaignUnit(jSONObjectOptJSONObject, AbstractC13669d.this.f38359b) : AbstractC13068b.parseCampaignUnit(jSONObjectOptJSONObject, AbstractC13669d.this.f38359b)));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40035a(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            mo40031a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? AbstractC13068b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f38359b) : AbstractC13068b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f38359b);
        if (v5CampaignUnit != null && v5CampaignUnit.getListFrames() != null && v5CampaignUnit.getListFrames().size() > 0) {
            List<Frame> listFrames = v5CampaignUnit.getListFrames();
            mo40032a(listFrames);
            saveRequestTime(listFrames.size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            mo40031a(iOptInt, msg);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m40036b(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            mo40031a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        C13167a.m37543b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo40031a(int i, String str);

    /* JADX INFO: renamed from: a */
    public void m40037a(String str) {
        this.f38359b = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo40032a(List<Frame> list);

    /* JADX INFO: renamed from: a */
    public abstract void mo40033a(List<C13837g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        C13219q0.m37816b(f38357c, "errorCode = " + c13113a.f35959a);
        mo40031a(c13113a.f35959a, C13118a.m37208a(c13113a));
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
        int i = this.f38358a;
        if (i == 0) {
            m40036b(c13117a.f35980b, c13112e.f35958c);
        } else if (i == 1) {
            m40035a(c13117a.f35980b, c13112e.f35958c);
        }
    }
}
