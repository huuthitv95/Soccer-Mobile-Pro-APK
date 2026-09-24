package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12282k8 implements InterfaceC12141d1 {

    /* JADX INFO: renamed from: b */
    private static final String f30733b = "k8";

    /* JADX INFO: renamed from: c */
    private static C12282k8 f30734c;

    /* JADX INFO: renamed from: a */
    private final Map<String, InterfaceC11434F8> f30735a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.ironsource.k8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12264j8 f30736a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f30737b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f30738c;

        a(C12264j8 c12264j8, Context context, String str) {
            this.f30736a = c12264j8;
            this.f30737b = context;
            this.f30738c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12282k8.this.f30735a.put(this.f30738c, new C12166e8(this.f30736a, this.f30737b));
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C12282k8 m31929a() {
        if (f30734c == null) {
            f30734c = new C12282k8();
        }
        return f30734c;
    }

    /* JADX INFO: renamed from: b */
    private C12130c8 m31930b(JSONObject jSONObject) {
        C12130c8 c12130c8 = new C12130c8();
        try {
            return m31928a(jSONObject);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return c12130c8;
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m31931d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C11744X3.i.f26391s0);
    }

    /* JADX INFO: renamed from: c */
    public String m31935c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    /* JADX INFO: renamed from: d */
    public void m31937d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.m33642i(f30733b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f30735a.containsKey(string)) {
            Logger.m33642i(f30733b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        InterfaceC11434F8 interfaceC11434F8 = this.f30735a.get(string);
        if (interfaceC11434F8 != null) {
            interfaceC11434F8.mo25788c(jSONObject, str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    private C12130c8 m31928a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(C11744X3.i.f26343O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new C12130c8(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return new C12130c8();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m31934b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f30735a.containsKey(string)) {
                InterfaceC11434F8 interfaceC11434F8 = this.f30735a.get(string);
                String string2 = jSONObject.getString(C11744X3.i.f26397v0);
                if (interfaceC11434F8 != null) {
                    interfaceC11434F8.mo25785a(string2, str, str2);
                    return;
                }
                return;
            }
            Logger.m33642i(f30733b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.m33642i(f30733b, "performWebViewAction fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    /* JADX INFO: renamed from: c */
    public void m31936c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f30735a.containsKey(string)) {
                InterfaceC11434F8 interfaceC11434F8 = this.f30735a.get(string);
                this.f30735a.remove(string);
                if (interfaceC11434F8 != null) {
                    interfaceC11434F8.mo25784a(str, str2);
                    return;
                }
                return;
            }
            Logger.m33642i(f30733b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.m33642i(f30733b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    /* JADX INFO: renamed from: a */
    public void m31932a(InterfaceC12192f8 interfaceC12192f8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            C12130c8 c12130c8M31930b = m31930b(jSONObject);
            if (!this.f30735a.containsKey(string)) {
                C12264j8 c12264j8 = new C12264j8(interfaceC12192f8, context, string, c12130c8M31930b);
                c12264j8.m31868e(IronSourceStorageUtils.getNetworkStorageDir(context));
                c12264j8.mo25787b(jSONObject, str, str2);
                if (m31931d(jSONObject)) {
                    C11613P7.f25510a.m27224d(new a(c12264j8, context, string));
                    return;
                } else {
                    this.f30735a.put(string, c12264j8);
                    return;
                }
            }
            Logger.m33642i(f30733b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        Logger.m33642i(f30733b, "loadWithUrl fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }

    @Override // com.ironsource.InterfaceC12141d1
    /* JADX INFO: renamed from: a */
    public InterfaceC11434F8 mo31278a(String str) {
        if (str.isEmpty() || !this.f30735a.containsKey(str)) {
            return null;
        }
        return this.f30735a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m31933a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.f30735a.containsKey(string)) {
                InterfaceC11434F8 interfaceC11434F8 = this.f30735a.get(string);
                if (interfaceC11434F8 != null) {
                    interfaceC11434F8.mo25786a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.m33642i(f30733b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        Logger.m33642i(f30733b, "removeAdView fail - adViewId is empty");
        throw new Exception("adViewId is empty");
    }
}
