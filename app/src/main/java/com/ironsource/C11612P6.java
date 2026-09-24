package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.P6 */
/* JADX INFO: loaded from: classes6.dex */
public class C11612P6 {

    /* JADX INFO: renamed from: a */
    private static final String f25509a = "adunit_data";

    /* JADX INFO: renamed from: a */
    public void m27203a(String str, Object obj) {
        C11558M6.m26488b().m26497b(str, obj);
    }

    /* JADX INFO: renamed from: a */
    public void m27207a(Map<String, Object> map) {
        C11558M6.m26488b().m26494a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m27205a(String str, JSONArray jSONArray) {
        C11558M6.m26488b().m26492a(str, jSONArray);
    }

    /* JADX INFO: renamed from: a */
    public void m27206a(String str, JSONObject jSONObject) {
        C11558M6.m26488b().m26493a(str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m27201a(Context context) {
        C11558M6.m26488b().m26498c(context);
    }

    /* JADX INFO: renamed from: a */
    public void m27204a(String str, Object obj, C11540L6.a aVar) {
        try {
            String strName = aVar.name();
            C11558M6 c11558m6M26488b = C11558M6.m26488b();
            JSONObject jSONObjectOptJSONObject = c11558m6M26488b.m26495b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f25509a);
            if (jSONObjectOptJSONObject == null) {
                c11558m6M26488b.m26497b(f25509a, new JSONObject().put(strName, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                c11558m6M26488b.m26497b(f25509a, jSONObjectOptJSONObject.put(strName, new JSONObject().put(str, obj)));
            } else {
                c11558m6M26488b.m26497b(f25509a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m27202a(String str, C11540L6.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            C11558M6 c11558m6M26488b = C11558M6.m26488b();
            JSONObject jSONObjectOptJSONObject2 = c11558m6M26488b.m26495b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f25509a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            c11558m6M26488b.m26497b(f25509a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
        }
    }
}
