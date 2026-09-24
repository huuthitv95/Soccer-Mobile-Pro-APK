package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.k */
/* JADX INFO: loaded from: classes3.dex */
public class C1595k {

    /* JADX INFO: renamed from: a */
    private final C1748l f1916a;

    /* JADX INFO: renamed from: b */
    private final String f1917b;

    /* JADX INFO: renamed from: com.applovin.impl.k$a */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a */
        private final String f1922a;

        a(String str) {
            this.f1922a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f1922a;
        }
    }

    public C1595k(String str, C1748l c1748l) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f1917b = str;
        this.f1916a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private String m3034a(C1831z4 c1831z4) {
        for (String str : this.f1916a.m4821c(c1831z4)) {
            if (this.f1917b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m3035a() {
        if (m3037c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f1917b.substring(m3038d().length()), 0), "UTF-8"));
                this.f1916a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1916a.m4782Q().m5171a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e) {
                this.f1916a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1916a.m4782Q().m5172a("AdToken", "Unable to decode token '" + this.f1917b + "' into JSON", e);
                }
                this.f1916a.m4764E().m4329a("AdToken", "decodeFullAdResponseStr", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.f1916a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1916a.m4782Q().m5172a("AdToken", "Unable to process ad response from token '" + this.f1917b + "'", e2);
            }
            this.f1916a.m4764E().m4329a("AdToken", "decodeFullAdResponse", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m3036b() {
        return this.f1917b;
    }

    /* JADX INFO: renamed from: c */
    public a m3037c() {
        if (m3034a(C1831z4.f4075x0) != null) {
            return a.REGULAR;
        }
        return m3034a(C1831z4.f4083y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    /* JADX INFO: renamed from: d */
    public String m3038d() {
        String strM3034a = m3034a(C1831z4.f4075x0);
        if (!TextUtils.isEmpty(strM3034a)) {
            return strM3034a;
        }
        String strM3034a2 = m3034a(C1831z4.f4083y0);
        if (TextUtils.isEmpty(strM3034a2)) {
            return null;
        }
        return strM3034a2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1595k)) {
            return false;
        }
        String str = this.f1917b;
        String str2 = ((C1595k) obj).f1917b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        String str = this.f1917b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.f1917b) + ", type=" + m3037c() + AbstractJsonLexerKt.END_OBJ;
    }
}
