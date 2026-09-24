package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.network.C8373f;
import com.fyber.inneractive.sdk.network.RunnableC8362c;
import com.fyber.inneractive.sdk.serverapi.extradata.C9119d;
import com.fyber.inneractive.sdk.util.HandlerC9143d1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C8050x implements InterfaceC8027r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAConfigManager f17887a;

    public C8050x(IAConfigManager iAConfigManager) {
        this.f17887a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.config.InterfaceC8027r
    public final void onGlobalConfigChanged(C8040s c8040s, C8021o c8021o) {
        C8373f c8373f = this.f17887a.f17662F;
        c8373f.getClass();
        int iM20443a = IAConfigManager.f17654M.f17688t.f17862b.m20443a("send_events_batch_interval", 30, -1);
        int i = iM20443a >= 0 ? iM20443a : 30;
        String property = System.getProperty("fyber.marketplace.use_batch_interval");
        if (property != null && !Boolean.getBoolean(property)) {
            i = 0;
        }
        c8373f.f18647f = true;
        c8373f.f18646e = i;
        HandlerC9143d1 handlerC9143d1 = c8373f.f18645d;
        if (handlerC9143d1 != null && handlerC9143d1.hasMessages(12312329)) {
            c8373f.f18645d.removeMessages(12312329);
        }
        long j = c8373f.f18646e * 1000;
        HandlerC9143d1 handlerC9143d2 = c8373f.f18645d;
        if (handlerC9143d2 != null) {
            handlerC9143d2.post(new RunnableC8362c(c8373f, 12312329, j));
        }
        IAConfigManager iAConfigManager = this.f17887a;
        C9119d c9119d = iAConfigManager.f17664H;
        C8021o c8021o2 = iAConfigManager.f17688t.f17862b;
        JSONObject jSONObject = new JSONObject();
        String strM20445a = c8021o2.m20445a(CampaignEx.JSON_KEY_AD_K, (String) null);
        if (strM20445a != null) {
            try {
                jSONObject = new JSONObject(strM20445a);
            } catch (JSONException unused) {
            }
        }
        c9119d.getClass();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, Integer.valueOf(jSONObject.optInt(next, 0)));
        }
        c9119d.f21373e.clear();
        c9119d.f21373e.putAll(map);
    }
}
