package com.iab.omid.library.vungle.attestation;

import android.webkit.WebView;
import com.iab.omid.library.vungle.internal.C11296g;
import com.iab.omid.library.vungle.messagelistener.C11301a;
import com.iab.omid.library.vungle.messagelistener.InterfaceC11302b;
import com.iab.omid.library.vungle.utils.C11312c;
import com.iab.omid.library.vungle.utils.C11313d;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.attestation.f */
/* JADX INFO: loaded from: classes6.dex */
public class C11277f implements InterfaceC11302b {

    /* JADX INFO: renamed from: a */
    private final C11301a f23631a;

    private C11277f(WebView webView) {
        C11301a c11301a = new C11301a(webView, this);
        this.f23631a = c11301a;
        c11301a.m25068a();
    }

    /* JADX INFO: renamed from: a */
    public static C11277f m24958a(WebView webView) {
        return new C11277f(webView);
    }

    /* JADX INFO: renamed from: a */
    private void m24959a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("mechanism");
            String string2 = jSONObject.getString("version");
            Map<String, String> mapM25135b = C11312c.m25135b(jSONObject.getJSONObject("attestationArgs"));
            mapM25135b.put("version", string2);
            C11276e.m24957a(C11296g.m25029b().m25030a().getApplicationContext(), string, new C11272a(mapM25135b));
        } catch (Exception e) {
            C11313d.m25147a("Error processing attestation request", e);
        }
    }

    @Override // com.iab.omid.library.vungle.messagelistener.InterfaceC11302b
    public String getListenerName() {
        return "omidJsAttestationListener";
    }

    @Override // com.iab.omid.library.vungle.messagelistener.InterfaceC11302b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            m24959a(jSONObject);
            return;
        }
        C11313d.m25148b("Unexpected method in AttestationMessageListener: " + str);
    }

    @Override // com.iab.omid.library.vungle.messagelistener.InterfaceC11302b
    public void onWebMessageListenerUnsupported() {
        C11313d.m25148b("The Attestation Webview Listener cannot be supported in this WebView version.");
    }
}
