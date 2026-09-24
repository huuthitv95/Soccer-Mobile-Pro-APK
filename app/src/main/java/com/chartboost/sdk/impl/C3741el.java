package com.chartboost.sdk.impl;

import com.google.common.net.HttpHeaders;
import com.tiktok.util.UrlConst;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.el */
/* JADX INFO: loaded from: classes3.dex */
public final class C3741el {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.el$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo17596a(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m17594a(String str, a aVar) {
        if (m17595a(str)) {
            C4048sb.m19411b("CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource", (Throwable) null, 2, (Object) null);
            if (aVar != null) {
                aVar.mo17596a(new JSONObject().put("message", "CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource"));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17595a(String str) {
        return (str == null || !StringsKt.contains$default((CharSequence) str, (CharSequence) HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, false, 2, (Object) null) || !StringsKt.contains$default((CharSequence) str, (CharSequence) "'null'", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "http://", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) UrlConst.HTTPS, false, 2, (Object) null)) ? false : true;
    }
}
