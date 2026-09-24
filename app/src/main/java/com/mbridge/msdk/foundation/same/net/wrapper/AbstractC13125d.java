package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.d */
/* JADX INFO: compiled from: CommonMBListener.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13125d extends C13110c<JSONObject> {

    /* JADX INFO: renamed from: a */
    private static final String f36051a = "d";

    public AbstractC13125d(String str, String str2) {
        setKey(str);
        setRKE(str2);
    }

    /* JADX INFO: renamed from: a */
    private void m37239a(C13112e<JSONObject> c13112e) {
        if (c13112e.f35957b.f35982d == 204) {
            mo37242a(new JSONObject());
        } else {
            m37240b(c13112e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074 A[DONT_INVERT, PHI: r4
  0x0074: PHI (r4v7 org.json.JSONObject) = 
  (r4v3 org.json.JSONObject)
  (r4v3 org.json.JSONObject)
  (r4v3 org.json.JSONObject)
  (r4v3 org.json.JSONObject)
  (r4v4 org.json.JSONObject)
 binds: [B:21:0x0046, B:23:0x0052, B:25:0x005e, B:29:0x0068, B:27:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #1 {Exception -> 0x0072, blocks: (B:22:0x0048, B:24:0x0054, B:29:0x0068, B:33:0x0076, B:26:0x0060), top: B:40:0x0048, inners: #0 }] */
    /* JADX INFO: renamed from: b */
    private void m37240b(C13112e<JSONObject> c13112e) {
        JSONObject jSONObject = c13112e.f35958c;
        if (jSONObject == null) {
            mo37241a("response result is null");
            return;
        }
        int iOptInt = jSONObject.optInt("status", -9999);
        if (iOptInt == -9999) {
            mo37242a(c13112e.f35958c);
            return;
        }
        if (iOptInt != 1 && iOptInt != 200) {
            String strOptString = c13112e.f35958c.optString(NotificationCompat.CATEGORY_MESSAGE);
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = "error message is null";
            }
            mo37241a(strOptString);
            return;
        }
        JSONObject jSONObjectOptJSONObject = c13112e.f35958c.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            try {
                String strOptString2 = jSONObjectOptJSONObject.optString("r");
                if (!TextUtils.isEmpty(strOptString2)) {
                    String strM37886a = C13229v0.m37886a(strOptString2, "ebmclXzZOhtU2sRlZxGL8A");
                    if (!TextUtils.isEmpty(strM37886a)) {
                        try {
                            jSONObjectOptJSONObject = new JSONObject(strM37886a);
                        } catch (Exception e) {
                            C13219q0.m37817b(f36051a, e.getMessage(), e);
                        }
                        if (jSONObjectOptJSONObject != null) {
                            jSONObjectOptJSONObject.put("rk", getKey());
                        }
                    } else if (jSONObjectOptJSONObject != null) {
                        jSONObjectOptJSONObject.put("rk", getKey());
                    }
                } else if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.put("rk", getKey());
                }
            } catch (Exception e2) {
                C13219q0.m37817b(f36051a, "put rk error", e2);
            }
        } else if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.put("rk", getKey());
        }
        mo37242a(jSONObjectOptJSONObject);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo37241a(String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo37242a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        C13219q0.m37816b(f36051a, "errorCode = " + c13113a.f35959a);
        mo37241a(C13118a.m37208a(c13113a));
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onSuccess(C13112e<JSONObject> c13112e) {
        if (c13112e == null) {
            mo37241a("response is null");
            return;
        }
        super.onSuccess(c13112e);
        if (c13112e.f35957b == null) {
            m37240b(c13112e);
        } else {
            m37239a(c13112e);
        }
    }

    public AbstractC13125d() {
    }
}
