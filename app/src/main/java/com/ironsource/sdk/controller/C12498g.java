package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.C12317m4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.g */
/* JADX INFO: loaded from: classes6.dex */
final class C12498g {

    /* JADX INFO: renamed from: c */
    private static final String f32098c = "com.ironsource.sdk.controller.g";

    /* JADX INFO: renamed from: d */
    private static final String f32099d = "functionName";

    /* JADX INFO: renamed from: e */
    private static final String f32100e = "params";

    /* JADX INFO: renamed from: f */
    private static final String f32101f = "hash";

    /* JADX INFO: renamed from: a */
    private final C12493b f32102a;

    /* JADX INFO: renamed from: b */
    private final C12510s f32103b;

    C12498g(C12493b c12493b, C12510s c12510s) {
        this.f32102a = c12493b;
        this.f32103b = c12510s;
    }

    /* JADX INFO: renamed from: a */
    private void m33449a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            m33450a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        Logger.m33642i(f32098c, "messageHandler failed with exception " + exc.getMessage());
    }

    /* JADX INFO: renamed from: b */
    private void m33452b(String str, String str2, String str3) {
        this.f32102a.m33357a(m33448a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.m33642i(f32098c, "messageHandler(" + str + " " + str3 + ")");
            if (this.f32103b.m33485a(str, str2, str3)) {
                m33451a(str, str2);
            } else {
                m33452b(str, str2, str3);
            }
        } catch (Exception e) {
            m33449a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33451a(String str, String str2) throws Exception {
        this.f32102a.m33358a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private void m33450a(String str) {
        this.f32102a.m33359b(str);
    }

    /* JADX INFO: renamed from: a */
    private String m33448a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f32101f, SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }
}
