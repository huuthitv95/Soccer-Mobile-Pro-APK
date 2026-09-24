package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.C11341A5;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.l */
/* JADX INFO: compiled from: SameCommonReporter.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13150l {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f36123a;

    /* JADX INFO: renamed from: b */
    private final String f36124b;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.l$b */
    /* JADX INFO: compiled from: SameCommonReporter.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final Map<String, String> f36125a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final String f36126b;

        public b(String str) {
            this.f36126b = str;
        }

        /* JADX INFO: renamed from: a */
        public C13150l m37405a() {
            return new C13150l(this);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m37401a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, m37400a(map.get(str)));
            }
        } catch (Exception e) {
            C13219q0.m37816b("SameCommonReporter", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37402b(String str) {
        if (TextUtils.isEmpty(this.f36124b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", this.f36124b);
            m37401a(this.f36123a, jSONObject);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Throwable th) {
            C13219q0.m37816b("SameCommonReporter", th.getMessage());
        }
    }

    private C13150l(b bVar) {
        this.f36124b = bVar.f36126b;
        this.f36123a = bVar.f36125a;
    }

    /* JADX INFO: renamed from: a */
    private String m37400a(String str) {
        try {
            return URLEncoder.encode(str, C11341A5.f23802O);
        } catch (Exception unused) {
            return str;
        }
    }
}
