package com.mbridge.msdk.advanced.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.request.d */
/* JADX INFO: compiled from: NativeAdvancedResponseHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12667d extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: c */
    private static final String f33553c = "d";

    /* JADX INFO: renamed from: a */
    private int f33554a;

    /* JADX INFO: renamed from: b */
    private String f33555b;

    /* JADX INFO: renamed from: a */
    private void m34546a(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            mo34543a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        CampaignUnit v5CampaignUnit = "v5".equals(jSONObject.optString("version")) ? AbstractC13068b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f33555b) : AbstractC13068b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f33555b);
        if (v5CampaignUnit != null && v5CampaignUnit.getListFrames() != null && v5CampaignUnit.getListFrames().size() > 0) {
            List<Frame> listFrames = v5CampaignUnit.getListFrames();
            mo34544a(listFrames);
            saveRequestTime(listFrames.size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            mo34543a(iOptInt, msg);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m34547b(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            mo34543a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        String strOptString = jSONObject.optString("version");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        CampaignUnit v5CampaignUnit = "v5".equals(strOptString) ? AbstractC13068b.parseV5CampaignUnit(jSONObjectOptJSONObject, this.f33555b) : AbstractC13068b.parseCampaignUnit(jSONObjectOptJSONObject, this.f33555b);
        if (v5CampaignUnit != null && v5CampaignUnit.getAds() != null && v5CampaignUnit.getAds().size() > 0) {
            mo34545a(list, v5CampaignUnit);
            saveRequestTime(v5CampaignUnit.getAds().size());
        } else {
            String msg = v5CampaignUnit != null ? v5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            }
            mo34543a(iOptInt, msg);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo34543a(int i, String str);

    /* JADX INFO: renamed from: a */
    public void m34548a(String str) {
        this.f33555b = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo34544a(List<Frame> list);

    /* JADX INFO: renamed from: a */
    public abstract void mo34545a(List<C13837g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        C13219q0.m37816b(f33553c, "errorCode = " + c13113a.f35959a);
        mo34543a(c13113a.f35959a, C13118a.m37208a(c13113a));
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
        int i = this.f33554a;
        if (i == 0) {
            m34547b(c13117a.f35980b, c13112e.f35958c);
        } else if (i == 1) {
            m34546a(c13117a.f35980b, c13112e.f35958c);
        }
    }
}
