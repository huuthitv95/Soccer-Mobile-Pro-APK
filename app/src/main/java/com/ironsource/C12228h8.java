package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12228h8 {

    /* JADX INFO: renamed from: a */
    private InterfaceC12192f8 f30464a;

    /* JADX INFO: renamed from: c */
    private WebView f30466c;

    /* JADX INFO: renamed from: d */
    private String f30467d;

    /* JADX INFO: renamed from: e */
    private String f30468e = "h8";

    /* JADX INFO: renamed from: f */
    private String[] f30469f = {"handleGetViewVisibility"};

    /* JADX INFO: renamed from: g */
    private final String[] f30470g = {C12148d8.f30224h, C12148d8.f30225i, C12148d8.f30223g, "handleGetViewVisibility", C12148d8.f30226j};

    /* JADX INFO: renamed from: b */
    private C12376mg f30465b = new C12376mg();

    /* JADX INFO: renamed from: com.ironsource.h8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f30471a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f30472b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f30473c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ JSONObject f30474d;

        a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f30471a = str;
            this.f30472b = str2;
            this.f30473c = str3;
            this.f30474d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C12228h8.this.m31592b(this.f30471a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f30471a;
                    Log.e(C12228h8.this.f30468e, str);
                    C12228h8.this.m31601a(this.f30472b, str);
                    return;
                }
                if (this.f30471a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C12228h8.this.m31610e(this.f30473c);
                } else if (this.f30471a.equalsIgnoreCase(C12148d8.f30226j) || this.f30471a.equalsIgnoreCase(C12148d8.f30225i)) {
                    C12228h8.this.m31602a(this.f30474d.getString("params"), this.f30473c, this.f30472b);
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f30471a;
                Log.e(C12228h8.this.f30468e, str2);
                C12228h8.this.m31601a(this.f30472b, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h8$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f30476a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f30477b;

        b(String str, String str2) {
            this.f30476a = str;
            this.f30477b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C12228h8.this.f30466c.evaluateJavascript(this.f30476a, null);
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                Log.e(C12228h8.this.f30468e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f30477b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m31593d() {
        if (this.f30464a == null || this.f30465b == null) {
            return;
        }
        m31603a(C12148d8.f30217a, m31597a());
    }

    /* JADX INFO: renamed from: h */
    private boolean m31595h(String str) {
        for (String str2 : this.f30469f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m31598a(WebView webView) {
        this.f30466c = webView;
    }

    /* JADX INFO: renamed from: b */
    public void m31606b() {
        this.f30464a = null;
        this.f30465b = null;
    }

    /* JADX INFO: renamed from: c */
    public String m31607c() {
        return this.f30467d;
    }

    /* JADX INFO: renamed from: e */
    public void m31609e() {
        if (this.f30464a == null || this.f30465b == null) {
            return;
        }
        m31603a(C12148d8.f30218b, m31597a());
    }

    /* JADX INFO: renamed from: f */
    public void m31611f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f30467d);
            m31603a(str, jSONObject);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m31612g(String str) {
        this.f30467d = str;
    }

    /* JADX INFO: renamed from: a */
    public void m31599a(InterfaceC12192f8 interfaceC12192f8) {
        this.f30464a = interfaceC12192f8;
    }

    /* JADX INFO: renamed from: c */
    public void m31608c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("method");
            if (TextUtils.isEmpty(strOptString) || !m31595h(strOptString)) {
                m31603a(jSONObject.optString(C12148d8.f30238v, C12148d8.f30219c), jSONObject);
            } else if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                m31605a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            Log.e(this.f30468e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m31592b(String str) {
        for (String str2 : this.f30470g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m31603a(String str, JSONObject jSONObject) {
        InterfaceC12192f8 interfaceC12192f8 = this.f30464a;
        if (interfaceC12192f8 != null) {
            interfaceC12192f8.mo31468a(str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m31596i(String str) {
        return str.equalsIgnoreCase(C12148d8.f30227k);
    }

    /* JADX INFO: renamed from: a */
    public void m31601a(String str, String str2) {
        InterfaceC12192f8 interfaceC12192f8 = this.f30464a;
        if (interfaceC12192f8 != null) {
            interfaceC12192f8.mo31467a(str, str2, this.f30467d);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m31610e(String str) throws JSONException {
        JSONObject jSONObjectM32788a = this.f30465b.m32788a();
        jSONObjectM32788a.put("adViewId", this.f30467d);
        m31603a(str, jSONObjectM32788a);
    }

    /* JADX INFO: renamed from: a */
    void m31604a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f30464a == null) {
            C12547u8.m33895a(C11703Ud.f25981t, new C12422p8().m33061a(C11341A5.f23834y, "mDelegate is null").m33062a());
        } else {
            C11613P7.f25510a.m27224d(new a(str, str3, str2, jSONObject));
        }
    }

    /* JADX INFO: renamed from: d */
    private void m31594d(String str) {
        C11613P7.f25510a.m27224d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    /* JADX INFO: renamed from: a */
    public void m31600a(String str, int i, boolean z) {
        this.f30465b.m32789a(str, i, z);
        if (m31596i(str)) {
            m31593d();
        }
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m31597a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C12148d8.f30235s, this.f30465b.m32788a());
            jSONObject.put(C12148d8.f30232p, jSONObject2);
            jSONObject.put("adViewId", m31607c());
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31605a(JSONObject jSONObject, String str, String str2) throws JSONException {
        m31602a(m31591a(jSONObject).toString(), str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m31602a(String str, String str2, String str3) throws JSONException {
        if (this.f30466c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f30468e, str4);
            this.f30464a.mo31467a(str3, str4, this.f30467d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            str = "\"" + str + "\"";
        }
        m31594d(m31590a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f30467d);
        m31603a(str2, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    private String m31590a(String str) {
        return String.format(C12148d8.f30237u, str);
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m31591a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f30465b.m32788a());
            return jSONObject2;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            Log.e(this.f30468e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject2;
        }
    }
}
