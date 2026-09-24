package com.digitalturbine.ignite.authenticator.parsers;

import android.text.TextUtils;
import com.digitalturbine.ignite.authenticator.C4237b;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.parsers.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4261b {
    /* JADX INFO: renamed from: a */
    public static C4237b m20311a(String str) {
        if (TextUtils.isEmpty(str)) {
            C4259a.m20309b("%s : empty one dt", "OneDTParser");
            return new C4237b("", -1L);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject != null && "onedtid".equalsIgnoreCase(jSONObjectOptJSONObject.optString("propertyName", ""))) {
                return new C4237b(jSONObjectOptJSONObject.optString("propertyValue", ""), jSONObjectOptJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e) {
            C4252b.m20297a(EnumC4254d.ONE_DT_PARSE_ERROR, e);
            C4259a.m20309b("%s : failed parse one dt", "OneDTParser");
        }
        return new C4237b("", -1L);
    }
}
