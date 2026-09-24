package com.mbridge.msdk.video.p291bt.component;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.Report.C13345a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.bt.component.c */
/* JADX INFO: compiled from: HandlerH5MessageManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13892c {

    /* JADX INFO: renamed from: a */
    private String f39704a;

    /* JADX INFO: renamed from: b */
    int f39705b;

    /* JADX INFO: renamed from: c */
    int f39706c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.component.c$b */
    /* JADX INFO: compiled from: HandlerH5MessageManager.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private static C13892c f39707a = new C13892c();
    }

    private C13892c() {
        this.f39704a = "handlerNativeResult";
        this.f39705b = 0;
        this.f39706c = 1;
    }

    /* JADX INFO: renamed from: a */
    public static C13892c m41509a() {
        return b.f39707a;
    }

    /* JADX INFO: renamed from: a */
    public void m41510a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            jSONObject.put("message", str);
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            C13219q0.m37813a("HandlerH5MessageManager", e.getMessage());
        } catch (Throwable th) {
            C13219q0.m37813a("HandlerH5MessageManager", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41511a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String strOptString = jSONObject.optString("uniqueIdentifier");
                    String strOptString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                        int iOptInt = 0;
                        if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.toString())) {
                            iOptInt = jSONObjectOptJSONObject.optInt("type", 0);
                        }
                        m41510a(this.f39705b, "receivedMessage", obj);
                        if (strOptString.equalsIgnoreCase("reporter")) {
                            C13345a.m38594a().m38596a(obj, strOptString2, jSONArrayOptJSONArray, iOptInt);
                            return;
                        } else {
                            if (strOptString.equalsIgnoreCase("MediaPlayer")) {
                                C13891b.m41504a().m41505a(obj, strOptString2, jSONArrayOptJSONArray, iOptInt);
                                return;
                            }
                            return;
                        }
                    }
                    m41510a(this.f39706c, "module or method is null", obj);
                    return;
                }
            } catch (Exception e) {
                C13219q0.m37813a("HandlerH5MessageManager", e.getMessage());
                m41510a(this.f39706c, e.getMessage(), obj);
                return;
            } catch (Throwable th) {
                C13219q0.m37813a("HandlerH5MessageManager", th.getMessage());
                m41510a(this.f39706c, th.getMessage(), obj);
                return;
            }
        }
        m41510a(this.f39706c, "params is null", obj);
    }
}
