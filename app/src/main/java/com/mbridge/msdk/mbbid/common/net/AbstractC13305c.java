package com.mbridge.msdk.mbbid.common.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.toolbox.C13117a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbid.common.net.c */
/* JADX INFO: compiled from: BidResponseHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13305c extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: a */
    private static final String f36805a = "c";

    public AbstractC13305c(String str, String str2) {
        this.unitId = str2;
        this.placementId = str;
    }

    /* JADX INFO: renamed from: a */
    private void m38376a(List<C13837g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (200 != iOptInt) {
            mo38372a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        BidResponsedEx bidResponsedEx = BidResponsedEx.parseBidResponsedEx(jSONObject.optJSONObject("data"), this.unitId);
        if (bidResponsedEx != null) {
            mo38373a(bidResponsedEx);
        } else {
            mo38372a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo38372a(int i, String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo38373a(BidResponsedEx bidResponsedEx);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        C13219q0.m37816b(f36805a, "errorCode = " + c13113a.f35959a);
        mo38372a(c13113a.f35959a, C13118a.m37208a(c13113a));
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onSuccess(C13112e<JSONObject> c13112e) {
        C13117a c13117a;
        super.onSuccess(c13112e);
        if (c13112e == null || (c13117a = c13112e.f35957b) == null) {
            return;
        }
        m38376a(c13117a.f35980b, c13112e.f35958c);
    }
}
