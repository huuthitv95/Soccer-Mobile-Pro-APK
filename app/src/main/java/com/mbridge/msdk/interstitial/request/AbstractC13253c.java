package com.mbridge.msdk.interstitial.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.interstitial.request.c */
/* JADX INFO: compiled from: InterstitialResponseHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13253c extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: a */
    private int f36521a;

    /* JADX INFO: renamed from: a */
    private void m38080a(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            mo38077a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? AbstractC13068b.parseV5CampaignUnit(jSONObject.optJSONObject("data")) : AbstractC13068b.parseCampaignUnit(jSONObject.optJSONObject("data"));
        if (v5CampaignUnit != null && v5CampaignUnit.getListFrames() != null && v5CampaignUnit.getListFrames().size() > 0) {
            List<Frame> listFrames = v5CampaignUnit.getListFrames();
            mo38078a(listFrames);
            saveRequestTime(listFrames.size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            mo38077a(iOptInt, msg);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38081b(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            mo38077a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        String strOptString = jSONObject.optString("version");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        CampaignUnit v5CampaignUnit = "v5".equals(strOptString) ? AbstractC13068b.parseV5CampaignUnit(jSONObjectOptJSONObject) : AbstractC13068b.parseCampaignUnit(jSONObjectOptJSONObject);
        if (v5CampaignUnit != null && v5CampaignUnit.getAds() != null && v5CampaignUnit.getAds().size() > 0) {
            mo38079a(list, v5CampaignUnit);
            saveRequestTime(v5CampaignUnit.getAds().size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            mo38077a(iOptInt, msg);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo38077a(int i, String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo38078a(List<Frame> list);

    /* JADX INFO: renamed from: a */
    public abstract void mo38079a(List<C13837g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        mo38077a(c13113a.f35959a, C13118a.m37208a(c13113a));
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
        int i = this.f36521a;
        if (i == 0) {
            m38081b(c13117a.f35980b, c13112e.f35958c);
        } else if (i == 1) {
            m38080a(c13117a.f35980b, c13112e.f35958c);
        }
    }
}
