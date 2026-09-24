package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.N6 */
/* JADX INFO: loaded from: classes6.dex */
public class C11576N6 {

    /* JADX INFO: renamed from: a */
    private static final String f25232a = "adunit_data";

    /* JADX INFO: renamed from: a */
    public JSONObject m26658a(List<String> list) throws JSONException {
        return m26654a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m26657a(Context context, String[] strArr) throws JSONException {
        return m26656a(m26655a(C11558M6.m26488b().m26495b(context)), strArr);
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m26659a(List<String> list, C11540L6.a aVar) throws JSONException {
        return m26656a(m26653a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) list.toArray(new String[list.size()]));
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m26654a(Context context, List<String> list) throws JSONException {
        return m26656a(m26655a(C11558M6.m26488b().m26495b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m26660a(String[] strArr) throws JSONException {
        return m26656a(m26655a(C11558M6.m26488b().m26495b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m26653a(Context context, C11540L6.a aVar) throws JSONException {
        String strName = aVar.name();
        JSONObject jSONObjectM26495b = C11558M6.m26488b().m26495b(context);
        JSONObject jSONObjectOptJSONObject = jSONObjectM26495b.optJSONObject(f25232a);
        JSONObject jSONObjectM26655a = m26655a(jSONObjectM26495b);
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optJSONObject(strName) != null) {
            JSONObject jSONObject = jSONObjectOptJSONObject.getJSONObject(strName);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectM26655a.putOpt(next, jSONObject.opt(next));
            }
        }
        return jSONObjectM26655a;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m26656a(JSONObject jSONObject, String[] strArr) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m26655a(JSONObject jSONObject) {
        jSONObject.remove(f25232a);
        return jSONObject;
    }
}
