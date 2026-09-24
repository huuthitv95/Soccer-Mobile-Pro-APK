package com.applovin.impl.sdk.network;

import com.applovin.impl.AbstractC1804w4;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.network.d */
/* JADX INFO: loaded from: classes3.dex */
public class C1765d {

    /* JADX INFO: renamed from: a */
    private String f3208a;

    /* JADX INFO: renamed from: b */
    private String f3209b;

    /* JADX INFO: renamed from: c */
    private String f3210c;

    /* JADX INFO: renamed from: d */
    private String f3211d;

    /* JADX INFO: renamed from: e */
    private Map f3212e;

    /* JADX INFO: renamed from: f */
    private Map f3213f;

    /* JADX INFO: renamed from: g */
    private Map f3214g;

    /* JADX INFO: renamed from: h */
    private AbstractC1804w4.a f3215h;

    /* JADX INFO: renamed from: i */
    private boolean f3216i;

    /* JADX INFO: renamed from: j */
    private boolean f3217j;

    /* JADX INFO: renamed from: k */
    private boolean f3218k;

    /* JADX INFO: renamed from: l */
    private boolean f3219l;

    /* JADX INFO: renamed from: m */
    private String f3220m;

    /* JADX INFO: renamed from: n */
    private int f3221n;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private String f3222a;

        /* JADX INFO: renamed from: b */
        private String f3223b;

        /* JADX INFO: renamed from: c */
        private String f3224c;

        /* JADX INFO: renamed from: d */
        private String f3225d;

        /* JADX INFO: renamed from: e */
        private Map f3226e;

        /* JADX INFO: renamed from: f */
        private Map f3227f;

        /* JADX INFO: renamed from: g */
        private Map f3228g;

        /* JADX INFO: renamed from: h */
        private AbstractC1804w4.a f3229h;

        /* JADX INFO: renamed from: i */
        private boolean f3230i;

        /* JADX INFO: renamed from: j */
        private boolean f3231j;

        /* JADX INFO: renamed from: k */
        private boolean f3232k;

        /* JADX INFO: renamed from: l */
        private boolean f3233l;

        /* JADX INFO: renamed from: a */
        public b m5105a(AbstractC1804w4.a aVar) {
            this.f3229h = aVar;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m5106a(String str) {
            this.f3225d = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m5107a(Map map) {
            this.f3227f = map;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m5108a(boolean z) {
            this.f3230i = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C1765d m5109a() {
            return new C1765d(this);
        }

        /* JADX INFO: renamed from: b */
        public b m5110b(String str) {
            this.f3222a = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m5111b(Map map) {
            this.f3226e = map;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m5112b(boolean z) {
            this.f3233l = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m5113c(String str) {
            this.f3223b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m5114c(Map map) {
            this.f3228g = map;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m5115c(boolean z) {
            this.f3231j = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m5116d(String str) {
            this.f3224c = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m5117d(boolean z) {
            this.f3232k = z;
            return this;
        }
    }

    private C1765d(b bVar) {
        this.f3208a = UUID.randomUUID().toString();
        this.f3209b = bVar.f3223b;
        this.f3210c = bVar.f3224c;
        this.f3211d = bVar.f3225d;
        this.f3212e = bVar.f3226e;
        this.f3213f = bVar.f3227f;
        this.f3214g = bVar.f3228g;
        this.f3215h = bVar.f3229h;
        this.f3216i = bVar.f3230i;
        this.f3217j = bVar.f3231j;
        this.f3218k = bVar.f3232k;
        this.f3219l = bVar.f3233l;
        this.f3220m = bVar.f3222a;
        this.f3221n = 0;
    }

    C1765d(JSONObject jSONObject, C1748l c1748l) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f3208a = string;
        this.f3209b = string3;
        this.f3220m = string2;
        this.f3210c = string4;
        this.f3211d = string5;
        this.f3212e = mapSynchronizedMap;
        this.f3213f = mapSynchronizedMap2;
        this.f3214g = mapSynchronizedMap3;
        this.f3215h = AbstractC1804w4.a.m5546a(jSONObject.optInt("encodingType", AbstractC1804w4.a.DEFAULT.m5548b()));
        this.f3216i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f3217j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f3218k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f3219l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f3221n = i;
    }

    /* JADX INFO: renamed from: b */
    public static b m5076b() {
        return new b();
    }

    /* JADX INFO: renamed from: a */
    void m5077a() {
        Map map = CollectionUtils.map(this.f3212e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f3212e = map;
    }

    /* JADX INFO: renamed from: c */
    int m5078c() {
        return this.f3221n;
    }

    /* JADX INFO: renamed from: d */
    String m5079d() {
        return this.f3211d;
    }

    /* JADX INFO: renamed from: e */
    String m5080e() {
        return this.f3220m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3208a.equals(((C1765d) obj).f3208a);
    }

    /* JADX INFO: renamed from: f */
    AbstractC1804w4.a m5081f() {
        return this.f3215h;
    }

    /* JADX INFO: renamed from: g */
    Map m5082g() {
        return this.f3213f;
    }

    /* JADX INFO: renamed from: h */
    String m5083h() {
        return this.f3209b;
    }

    public int hashCode() {
        return this.f3208a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    Map m5084i() {
        return this.f3212e;
    }

    /* JADX INFO: renamed from: j */
    Map m5085j() {
        return this.f3214g;
    }

    /* JADX INFO: renamed from: k */
    String m5086k() {
        return this.f3210c;
    }

    /* JADX INFO: renamed from: l */
    void m5087l() {
        this.f3221n++;
    }

    /* JADX INFO: renamed from: m */
    public boolean m5088m() {
        return this.f3218k;
    }

    /* JADX INFO: renamed from: n */
    boolean m5089n() {
        return this.f3216i;
    }

    /* JADX INFO: renamed from: o */
    boolean m5090o() {
        return this.f3217j;
    }

    /* JADX INFO: renamed from: p */
    boolean m5091p() {
        return this.f3219l;
    }

    /* JADX INFO: renamed from: q */
    JSONObject m5092q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f3208a);
        jSONObject.put("communicatorRequestId", this.f3220m);
        jSONObject.put("httpMethod", this.f3209b);
        jSONObject.put("targetUrl", this.f3210c);
        jSONObject.put("backupUrl", this.f3211d);
        jSONObject.put("encodingType", this.f3215h);
        jSONObject.put("isEncodingEnabled", this.f3216i);
        jSONObject.put("gzipBodyEncoding", this.f3217j);
        jSONObject.put("isAllowedPreInitEvent", this.f3218k);
        jSONObject.put("attemptNumber", this.f3221n);
        if (this.f3212e != null) {
            jSONObject.put("parameters", new JSONObject(this.f3212e));
        }
        if (this.f3213f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f3213f));
        }
        if (this.f3214g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f3214g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f3208a + "', communicatorRequestId='" + this.f3220m + "', httpMethod='" + this.f3209b + "', targetUrl='" + this.f3210c + "', backupUrl='" + this.f3211d + "', attemptNumber=" + this.f3221n + ", isEncodingEnabled=" + this.f3216i + ", isGzipBodyEncoding=" + this.f3217j + ", isAllowedPreInitEvent=" + this.f3218k + ", shouldFireInWebView=" + this.f3219l + AbstractJsonLexerKt.END_OBJ;
    }
}
