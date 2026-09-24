package com.mbridge.msdk.video.dynview.request.abs;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.request.abs.a */
/* JADX INFO: compiled from: AbsMoreOfferResponseHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13971a extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: a */
    private int f40043a;

    /* JADX INFO: renamed from: b */
    private String f40044b;

    /* JADX INFO: renamed from: a */
    private void m41817a(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            mo41784a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        String strOptString = jSONObject.optString("version");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        CampaignUnit v5CampaignUnit = "v5".equals(strOptString) ? AbstractC13068b.parseV5CampaignUnit(jSONObjectOptJSONObject, this.f40044b) : AbstractC13068b.parseCampaignUnit(jSONObjectOptJSONObject, this.f40044b);
        if (v5CampaignUnit != null && v5CampaignUnit.getAds() != null && v5CampaignUnit.getAds().size() > 0) {
            mo41785a(list, v5CampaignUnit);
            saveRequestTime(v5CampaignUnit.getAds().size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            mo41784a(iOptInt, msg);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo41784a(int i, String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo41785a(List<C13837g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        mo41784a(c13113a.f35959a, C13118a.m37208a(c13113a));
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onSuccess(C13112e<JSONObject> c13112e) {
        C13117a c13117a;
        super.onSuccess(c13112e);
        if (c13112e == null || (c13117a = c13112e.f35957b) == null || this.f40043a != 0) {
            return;
        }
        m41817a(c13117a.f35980b, c13112e.f35958c);
    }
}
