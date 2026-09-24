package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.interstitial.controller.C13250a;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MBInterstitialHandler {
    private C13250a mController;
    private String unitId;

    public MBInterstitialHandler(Context context, Map<String, Object> map) {
        if (this.mController == null) {
            this.mController = new C13250a();
        }
        if (map != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            this.unitId = str;
            if (!TextUtils.isEmpty(str)) {
                String strM37926e = C13229v0.m37926e(str);
                if (!TextUtils.isEmpty(strM37926e)) {
                    C13229v0.m37922d(str, strM37926e);
                }
            }
        }
        this.mController.m38066a(context, map);
        if (C13008c.m36588n().m36542d() != null || context == null) {
            return;
        }
        C13008c.m36588n().m36535b(context);
    }

    public String getCreativeIdWithUnitId() {
        C13250a c13250a = this.mController;
        return c13250a != null ? c13250a.m38063a() : "";
    }

    public String getRequestId() {
        C13250a c13250a = this.mController;
        return c13250a != null ? c13250a.m38067b() : "";
    }

    public void preload() {
        try {
            C13250a c13250a = this.mController;
            if (c13250a != null) {
                c13250a.m38068f();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialListener(InterstitialListener interstitialListener) {
        try {
            C13250a c13250a = this.mController;
            if (c13250a != null) {
                c13250a.m38064a(interstitialListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show() {
        try {
            this.mController.m38070j();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
