package com.iab.omid.library.vungle.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.iab.omid.library.vungle.attestation.C11272a;
import com.iab.omid.library.vungle.attestation.C11276e;
import com.iab.omid.library.vungle.utils.C11313d;
import com.ironsource.C11744X3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C11299j {
    /* JADX INFO: renamed from: a */
    private static Map<String, String> m25057a(Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, uri.getQueryParameter(str));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static void m25058a(Map<String, String> map) {
        try {
            C11276e.m24957a(C11296g.m25029b().m25030a().getApplicationContext(), map.get("mechanism"), new C11272a(map));
        } catch (Exception e) {
            C11313d.m25147a("Error processing attestation request in OmidNativeUrlHandler", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25059b(Uri uri) {
        String str;
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                str = "OmidNativeUrlHandler failed to handle url [" + uri.toString() + "] as 'method' not available";
            } else {
                if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                    m25058a(m25057a(uri));
                    return;
                }
                str = "Unknown method in OmidNativeUrlHandler.handle :" + queryParameter;
            }
            C11313d.m25148b(str);
        } catch (Exception e) {
            C11313d.m25147a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + C11744X3.j.f26440e, e);
        }
    }
}
