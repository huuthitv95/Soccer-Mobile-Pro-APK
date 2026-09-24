package com.applovin.impl.sdk.network;

import com.applovin.impl.AbstractC1804w4;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.C1748l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.network.a */
/* JADX INFO: loaded from: classes3.dex */
public class C1762a {

    /* JADX INFO: renamed from: a */
    private String f3158a;

    /* JADX INFO: renamed from: b */
    private String f3159b;

    /* JADX INFO: renamed from: c */
    private Map f3160c;

    /* JADX INFO: renamed from: d */
    private Map f3161d;

    /* JADX INFO: renamed from: e */
    private final JSONObject f3162e;

    /* JADX INFO: renamed from: f */
    private String f3163f;

    /* JADX INFO: renamed from: g */
    private final Object f3164g;

    /* JADX INFO: renamed from: h */
    private final int f3165h;

    /* JADX INFO: renamed from: i */
    private int f3166i;

    /* JADX INFO: renamed from: j */
    private final int f3167j;

    /* JADX INFO: renamed from: k */
    private final int f3168k;

    /* JADX INFO: renamed from: l */
    private final boolean f3169l;

    /* JADX INFO: renamed from: m */
    private final boolean f3170m;

    /* JADX INFO: renamed from: n */
    private final boolean f3171n;

    /* JADX INFO: renamed from: o */
    private final boolean f3172o;

    /* JADX INFO: renamed from: p */
    private final AbstractC1804w4.a f3173p;

    /* JADX INFO: renamed from: q */
    private final boolean f3174q;

    /* JADX INFO: renamed from: r */
    private final boolean f3175r;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        String f3176a;

        /* JADX INFO: renamed from: b */
        String f3177b;

        /* JADX INFO: renamed from: c */
        String f3178c;

        /* JADX INFO: renamed from: e */
        Map f3180e;

        /* JADX INFO: renamed from: f */
        JSONObject f3181f;

        /* JADX INFO: renamed from: g */
        Object f3182g;

        /* JADX INFO: renamed from: i */
        int f3184i;

        /* JADX INFO: renamed from: j */
        int f3185j;

        /* JADX INFO: renamed from: k */
        boolean f3186k;

        /* JADX INFO: renamed from: m */
        boolean f3188m;

        /* JADX INFO: renamed from: n */
        boolean f3189n;

        /* JADX INFO: renamed from: o */
        boolean f3190o;

        /* JADX INFO: renamed from: p */
        boolean f3191p;

        /* JADX INFO: renamed from: q */
        AbstractC1804w4.a f3192q;

        /* JADX INFO: renamed from: h */
        int f3183h = 1;

        /* JADX INFO: renamed from: l */
        boolean f3187l = true;

        /* JADX INFO: renamed from: d */
        Map f3179d = new HashMap();

        public a(C1748l c1748l) {
            this.f3184i = ((Integer) c1748l.m4801a(C1831z4.f3849W2)).intValue();
            this.f3185j = ((Integer) c1748l.m4801a(C1831z4.f3841V2)).intValue();
            this.f3188m = ((Boolean) c1748l.m4801a(C1831z4.f4038s3)).booleanValue();
            this.f3189n = ((Boolean) c1748l.m4801a(C1831z4.f3999n5)).booleanValue();
            this.f3192q = AbstractC1804w4.a.m5546a(((Integer) c1748l.m4801a(C1831z4.f4008o5)).intValue());
            this.f3191p = ((Boolean) c1748l.m4801a(C1831z4.f3788O5)).booleanValue();
        }

        /* JADX INFO: renamed from: a */
        public a mo5036a(int i) {
            this.f3183h = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a mo5037a(AbstractC1804w4.a aVar) {
            this.f3192q = aVar;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a mo5038a(Object obj) {
            this.f3182g = obj;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a mo5039a(String str) {
            this.f3178c = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a mo5040a(Map map) {
            this.f3180e = map;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a mo5041a(JSONObject jSONObject) {
            this.f3181f = jSONObject;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a mo5042a(boolean z) {
            this.f3189n = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C1762a mo5043a() {
            return new C1762a(this);
        }

        /* JADX INFO: renamed from: b */
        public a mo5044b(int i) {
            this.f3185j = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a mo5045b(String str) {
            this.f3177b = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a mo5046b(Map map) {
            this.f3179d = map;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a mo5047b(boolean z) {
            this.f3191p = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a mo5048c(int i) {
            this.f3184i = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a mo5049c(String str) {
            this.f3176a = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m5050c(boolean z) {
            this.f3186k = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m5051d(boolean z) {
            this.f3187l = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m5052e(boolean z) {
            this.f3188m = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m5053f(boolean z) {
            this.f3190o = z;
            return this;
        }
    }

    protected C1762a(a aVar) {
        this.f3158a = aVar.f3177b;
        this.f3159b = aVar.f3176a;
        this.f3160c = aVar.f3179d;
        this.f3161d = aVar.f3180e;
        this.f3162e = aVar.f3181f;
        this.f3163f = aVar.f3178c;
        this.f3164g = aVar.f3182g;
        int i = aVar.f3183h;
        this.f3165h = i;
        this.f3166i = i;
        this.f3167j = aVar.f3184i;
        this.f3168k = aVar.f3185j;
        this.f3169l = aVar.f3186k;
        this.f3170m = aVar.f3187l;
        this.f3171n = aVar.f3188m;
        this.f3172o = aVar.f3189n;
        this.f3173p = aVar.f3192q;
        this.f3174q = aVar.f3190o;
        this.f3175r = aVar.f3191p;
    }

    /* JADX INFO: renamed from: a */
    public static a m5013a(C1748l c1748l) {
        return new a(c1748l);
    }

    /* JADX INFO: renamed from: a */
    public String m5014a() {
        return this.f3163f;
    }

    /* JADX INFO: renamed from: a */
    public void m5015a(int i) {
        this.f3166i = i;
    }

    /* JADX INFO: renamed from: a */
    public void m5016a(String str) {
        this.f3163f = str;
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m5017b() {
        return this.f3162e;
    }

    /* JADX INFO: renamed from: b */
    public void m5018b(String str) {
        this.f3158a = str;
    }

    /* JADX INFO: renamed from: c */
    public int m5019c() {
        return this.f3165h - this.f3166i;
    }

    /* JADX INFO: renamed from: c */
    public void m5020c(String str) {
        this.f3159b = str;
    }

    /* JADX INFO: renamed from: d */
    public Object m5021d() {
        return this.f3164g;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC1804w4.a m5022e() {
        return this.f3173p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1762a)) {
            return false;
        }
        C1762a c1762a = (C1762a) obj;
        String str = this.f3158a;
        if (str == null ? c1762a.f3158a != null : !str.equals(c1762a.f3158a)) {
            return false;
        }
        Map map = this.f3160c;
        if (map == null ? c1762a.f3160c != null : !map.equals(c1762a.f3160c)) {
            return false;
        }
        Map map2 = this.f3161d;
        if (map2 == null ? c1762a.f3161d != null : !map2.equals(c1762a.f3161d)) {
            return false;
        }
        String str2 = this.f3163f;
        if (str2 == null ? c1762a.f3163f != null : !str2.equals(c1762a.f3163f)) {
            return false;
        }
        String str3 = this.f3159b;
        if (str3 == null ? c1762a.f3159b != null : !str3.equals(c1762a.f3159b)) {
            return false;
        }
        JSONObject jSONObject = this.f3162e;
        if (jSONObject == null ? c1762a.f3162e != null : !jSONObject.equals(c1762a.f3162e)) {
            return false;
        }
        Object obj2 = this.f3164g;
        if (obj2 == null ? c1762a.f3164g == null : obj2.equals(c1762a.f3164g)) {
            return this.f3165h == c1762a.f3165h && this.f3166i == c1762a.f3166i && this.f3167j == c1762a.f3167j && this.f3168k == c1762a.f3168k && this.f3169l == c1762a.f3169l && this.f3170m == c1762a.f3170m && this.f3171n == c1762a.f3171n && this.f3172o == c1762a.f3172o && this.f3173p == c1762a.f3173p && this.f3174q == c1762a.f3174q && this.f3175r == c1762a.f3175r;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public String m5023f() {
        return this.f3158a;
    }

    /* JADX INFO: renamed from: g */
    public Map m5024g() {
        return this.f3161d;
    }

    /* JADX INFO: renamed from: h */
    public String m5025h() {
        return this.f3159b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f3158a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3163f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3159b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f3164g;
        int iHashCode5 = ((((((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f3165h) * 31) + this.f3166i) * 31) + this.f3167j) * 31) + this.f3168k) * 31) + (this.f3169l ? 1 : 0)) * 31) + (this.f3170m ? 1 : 0)) * 31) + (this.f3171n ? 1 : 0)) * 31) + (this.f3172o ? 1 : 0)) * 31) + this.f3173p.m5548b()) * 31) + (this.f3174q ? 1 : 0)) * 31) + (this.f3175r ? 1 : 0);
        Map map = this.f3160c;
        if (map != null) {
            iHashCode5 = (iHashCode5 * 31) + map.hashCode();
        }
        Map map2 = this.f3161d;
        if (map2 != null) {
            iHashCode5 = (iHashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f3162e;
        if (jSONObject == null) {
            return iHashCode5;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (iHashCode5 * 31) + new String(charArray).hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Map m5026i() {
        return this.f3160c;
    }

    /* JADX INFO: renamed from: j */
    public int m5027j() {
        return this.f3166i;
    }

    /* JADX INFO: renamed from: k */
    public int m5028k() {
        return this.f3168k;
    }

    /* JADX INFO: renamed from: l */
    public int m5029l() {
        return this.f3167j;
    }

    /* JADX INFO: renamed from: m */
    public boolean m5030m() {
        return this.f3172o;
    }

    /* JADX INFO: renamed from: n */
    public boolean m5031n() {
        return this.f3169l;
    }

    /* JADX INFO: renamed from: o */
    public boolean m5032o() {
        return this.f3175r;
    }

    /* JADX INFO: renamed from: p */
    public boolean m5033p() {
        return this.f3170m;
    }

    /* JADX INFO: renamed from: q */
    public boolean m5034q() {
        return this.f3171n;
    }

    /* JADX INFO: renamed from: r */
    public boolean m5035r() {
        return this.f3174q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f3158a + ", backupEndpoint=" + this.f3163f + ", httpMethod=" + this.f3159b + ", httpHeaders=" + this.f3161d + ", body=" + this.f3162e + ", emptyResponse=" + this.f3164g + ", initialRetryAttempts=" + this.f3165h + ", retryAttemptsLeft=" + this.f3166i + ", timeoutMillis=" + this.f3167j + ", retryDelayMillis=" + this.f3168k + ", exponentialRetries=" + this.f3169l + ", retryOnAllErrors=" + this.f3170m + ", retryOnNoConnection=" + this.f3171n + ", encodingEnabled=" + this.f3172o + ", encodingType=" + this.f3173p + ", trackConnectionSpeed=" + this.f3174q + ", gzipBodyEncoding=" + this.f3175r + AbstractJsonLexerKt.END_OBJ;
    }
}
