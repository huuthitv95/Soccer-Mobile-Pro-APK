package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.C13008c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f37130g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C13008c.m36588n().m36539c(jSONObject.optInt("webgl"));
            C13008c.m36588n().m36532a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
