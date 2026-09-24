package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.t8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12529t8 implements InterfaceC11415E7 {
    @Override // com.ironsource.InterfaceC11415E7
    /* JADX INFO: renamed from: a */
    public String mo25662a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put(C11341A5.f23805R, C11341A5.f23806S).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
