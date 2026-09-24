package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import androidx.webkit.ProxyConfig;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.common.net.HttpHeaders;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.r0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1704r0 {

    /* JADX INFO: renamed from: f */
    private static final List f2679f = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a */
    private final C1748l f2680a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2681b;

    /* JADX INFO: renamed from: c */
    private final C1530d4 f2682c;

    /* JADX INFO: renamed from: d */
    private d f2683d;

    /* JADX INFO: renamed from: e */
    private final Set f2684e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: com.applovin.impl.r0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private long f2685a;

        /* JADX INFO: renamed from: b */
        private long f2686b;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m4145a(long j) {
            this.f2685a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m4147b(long j) {
            this.f2686b = j;
        }

        /* JADX INFO: renamed from: a */
        public long m4149a() {
            return this.f2685a;
        }

        /* JADX INFO: renamed from: b */
        public long m4150b() {
            return this.f2686b;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.r0$c */
    private class c implements Consumer {

        /* JADX INFO: renamed from: a */
        private final String f2687a;

        /* JADX INFO: renamed from: b */
        private final C1762a f2688b;

        /* JADX INFO: renamed from: c */
        private final String f2689c;

        /* JADX INFO: renamed from: d */
        private final Object f2690d;

        /* JADX INFO: renamed from: e */
        private final boolean f2691e;

        /* JADX INFO: renamed from: f */
        private final b f2692f;

        /* JADX INFO: renamed from: g */
        private final e f2693g;

        private c(String str, C1762a c1762a, String str2, Object obj, boolean z, b bVar, e eVar) {
            this.f2687a = str;
            this.f2688b = c1762a;
            this.f2689c = str2;
            this.f2690d = obj;
            this.f2691e = z;
            this.f2692f = bVar;
            this.f2693g = eVar;
        }

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x017e: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:60:0x017d */
        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C1530d4.d dVar) {
            MalformedURLException malformedURLException;
            int iM2387c;
            int i;
            long jM2389e = dVar.m2389e();
            Object objM4134a = null;
            try {
                try {
                    iM2387c = dVar.m2387c();
                    try {
                        if (iM2387c > 0) {
                            try {
                                if (iM2387c < 200 || iM2387c >= 400) {
                                    this.f2693g.mo3137a(this.f2687a, iM2387c, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f2692f;
                                    if (bVar != null) {
                                        bVar.m4145a(jM2389e);
                                    }
                                    C1704r0.this.m4137a(this.f2689c, this.f2687a, iM2387c, jM2389e);
                                    byte[] bArrM2388d = dVar.m2388d();
                                    if (AbstractC1701q7.m4111h(C1748l.m4756p()) && (!this.f2691e || AbstractC1804w4.m5541b(bArrM2388d) != AbstractC1804w4.a.V2)) {
                                        C1704r0.this.f2680a.m4856u().m4707a(bArrM2388d != null ? new String(dVar.m2388d(), Charset.forName("UTF-8")) : "", this.f2687a, this.f2688b.m5017b() != null ? this.f2688b.m5017b().toString() : "");
                                    }
                                    if (bArrM2388d == null) {
                                        this.f2693g.mo3139a(this.f2687a, this.f2690d, iM2387c);
                                        return;
                                    }
                                    String str = new String(dVar.m2388d(), Charset.forName("UTF-8"));
                                    b bVar2 = this.f2692f;
                                    if (bVar2 != null) {
                                        bVar2.m4147b(bArrM2388d.length);
                                        if (this.f2688b.m5035r()) {
                                            C1704r0.this.f2683d = new d(this.f2688b.m5023f(), bArrM2388d.length, jM2389e);
                                        }
                                    }
                                    if (this.f2691e) {
                                        String strM5543b = AbstractC1804w4.m5543b(bArrM2388d, C1704r0.this.f2680a);
                                        if (strM5543b == null) {
                                            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f2687a));
                                            if (((Boolean) C1704r0.this.f2680a.m4801a(C1831z4.f3772M5)).booleanValue()) {
                                                CollectionUtils.putStringIfValid("details", str, mapHashMap);
                                            }
                                            C1704r0.this.f2680a.m4764E().m2682d(C1548f2.f1549l1, mapHashMap);
                                        }
                                        str = strM5543b;
                                    }
                                    try {
                                        this.f2693g.mo3139a(this.f2687a, C1704r0.this.m4134a(str, this.f2690d), iM2387c);
                                        return;
                                    } catch (Throwable th) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f2687a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                        C1768p unused = C1704r0.this.f2681b;
                                        if (C1768p.m5160a()) {
                                            C1704r0.this.f2681b.m5172a("ConnectionManager", str2, th);
                                        }
                                        C1704r0.this.f2680a.m4764E().m4332a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f2687a)));
                                        this.f2693g.mo3137a(this.f2687a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e) {
                                    e = e;
                                }
                            } catch (MalformedURLException e2) {
                                malformedURLException = e2;
                                iM2387c = i;
                            }
                        } else {
                            try {
                                C1704r0.this.m4138a(this.f2689c, this.f2687a, iM2387c, jM2389e, (Throwable) null);
                                this.f2693g.mo3137a(this.f2687a, iM2387c, null, null);
                                return;
                            } catch (MalformedURLException e3) {
                                e = e3;
                                iM2387c = iM2387c;
                            }
                        }
                    } catch (MalformedURLException e4) {
                        e = e4;
                    }
                    malformedURLException = e;
                } catch (MalformedURLException e5) {
                    malformedURLException = e5;
                    iM2387c = 0;
                }
            } catch (Throwable th2) {
                int iM2386b = dVar.m2386b();
                try {
                    byte[] bArrM2390f = dVar.m2390f();
                    String str3 = new String(bArrM2390f);
                    if (bArrM2390f != null) {
                        if (this.f2691e) {
                            str3 = AbstractC1804w4.m5543b(bArrM2390f, C1704r0.this.f2680a);
                        }
                        objM4134a = C1704r0.this.m4134a(str3, this.f2690d);
                    }
                } catch (Throwable unused2) {
                }
                C1704r0.this.m4138a(this.f2689c, this.f2687a, iM2386b, jM2389e, th2);
                this.f2693g.mo3137a(this.f2687a, iM2386b, th2.getMessage(), objM4134a);
                return;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.f2690d != null) {
                C1704r0.this.m4138a(this.f2689c, this.f2687a, iM2387c, jM2389e, malformedURLException2);
                this.f2693g.mo3137a(this.f2687a, -901, malformedURLException2.getMessage(), null);
            } else {
                C1704r0.this.m4137a(this.f2689c, this.f2687a, iM2387c, jM2389e);
                this.f2693g.mo3139a(this.f2687a, this.f2690d, -901);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.r0$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private final long f2695a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b */
        private final String f2696b;

        /* JADX INFO: renamed from: c */
        private final long f2697c;

        /* JADX INFO: renamed from: d */
        private final long f2698d;

        public d(String str, long j, long j2) {
            this.f2696b = str;
            this.f2697c = j;
            this.f2698d = j2;
        }

        /* JADX INFO: renamed from: a */
        public long m4152a() {
            return this.f2698d;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m4153a(Object obj) {
            return obj instanceof d;
        }

        /* JADX INFO: renamed from: b */
        public long m4154b() {
            return this.f2697c;
        }

        /* JADX INFO: renamed from: c */
        public long m4155c() {
            return this.f2695a;
        }

        /* JADX INFO: renamed from: d */
        public String m4156d() {
            return this.f2696b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.m4153a(this) || m4155c() != dVar.m4155c() || m4154b() != dVar.m4154b() || m4152a() != dVar.m4152a()) {
                return false;
            }
            String strM4156d = m4156d();
            String strM4156d2 = dVar.m4156d();
            return strM4156d != null ? strM4156d.equals(strM4156d2) : strM4156d2 == null;
        }

        public int hashCode() {
            long jM4155c = m4155c();
            long jM4154b = m4154b();
            int i = ((((int) (jM4155c ^ (jM4155c >>> 32))) + 59) * 59) + ((int) (jM4154b ^ (jM4154b >>> 32)));
            long jM4152a = m4152a();
            String strM4156d = m4156d();
            return (((i * 59) + ((int) ((jM4152a >>> 32) ^ jM4152a))) * 59) + (strM4156d == null ? 43 : strM4156d.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + m4155c() + ", urlHostAndPathString=" + m4156d() + ", responseSizeBytes=" + m4154b() + ", connectionTimeMillis=" + m4152a() + ")";
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.r0$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo3137a(String str, int i, String str2, Object obj);

        /* JADX INFO: renamed from: a */
        void mo3139a(String str, Object obj, int i);
    }

    public C1704r0(C1748l c1748l) {
        this.f2680a = c1748l;
        this.f2681b = c1748l.m4782Q();
        C1530d4 c1530d4 = new C1530d4(c1748l);
        this.f2682c = c1530d4;
        c1530d4.m2355a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Object m4134a(String str, Object obj) {
        if (obj != null) {
            if (str != null && str.length() >= 3) {
                if (obj instanceof JSONObject) {
                    return new JSONObject(str);
                }
                if (obj instanceof C1702q8) {
                    return C1712r8.m4289a(str, this.f2680a);
                }
                if (!(obj instanceof String)) {
                    if (C1768p.m5160a()) {
                        this.f2681b.m5174b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
                    }
                }
            }
            return obj;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4137a(String str, String str2, int i, long j) {
        if (C1768p.m5160a()) {
            this.f2681b.m5175d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + AbstractC1714s0.m4327g(this.f2680a) + " to " + m4140c(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4138a(String str, String str2, int i, long j, Throwable th) {
        if (C1768p.m5160a()) {
            this.f2681b.m5172a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + AbstractC1714s0.m4327g(this.f2680a) + " to " + m4140c(str2), th);
        }
    }

    /* JADX INFO: renamed from: c */
    private String m4140c(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    /* JADX INFO: renamed from: a */
    public d m4141a() {
        return this.f2683d;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fd A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #2 {all -> 0x0134, blocks: (B:38:0x00fb, B:42:0x0124, B:51:0x0162, B:53:0x0172, B:57:0x0193, B:72:0x01e3, B:75:0x01f2, B:77:0x01fd, B:59:0x0197, B:62:0x019f, B:67:0x01b6, B:69:0x01bc, B:70:0x01d1, B:54:0x0180, B:80:0x0206, B:82:0x021e, B:83:0x022c, B:41:0x0120, B:64:0x01b0), top: B:111:0x00fb, inners: #3 }] */
    /* JADX INFO: renamed from: a */
    public void m4142a(C1762a c1762a, b bVar, e eVar) {
        Throwable th;
        byte[] bytes;
        byte[] bArrM4071a;
        if (c1762a == null) {
            throw new IllegalArgumentException("No request specified");
        }
        String strM5023f = c1762a.m5023f();
        String strM5025h = c1762a.m5025h();
        if (strM5023f == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (strM5025h == null) {
            throw new IllegalArgumentException("No method specified");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (!strM5023f.toLowerCase().startsWith(ProxyConfig.MATCH_HTTP)) {
            String str = "Requested postback submission to non HTTP endpoint " + strM5023f + "; skipping...";
            C1768p.m5167h("ConnectionManager", str);
            eVar.mo3137a(strM5023f, AppLovinErrorCodes.INVALID_URL, str, null);
            return;
        }
        String httpsString = StringUtils.toHttpsString(strM5023f);
        HashMap map = new HashMap(2);
        boolean zM5030m = c1762a.m5030m();
        AbstractC1804w4.a aVarM5546a = ((Boolean) this.f2680a.m4801a(C1831z4.f4032r5)).booleanValue() ? AbstractC1804w4.a.m5546a(((Integer) this.f2680a.m4801a(C1831z4.f4008o5)).intValue()) : c1762a.m5022e();
        long jM4020a = AbstractC1701q7.m4020a(this.f2680a);
        if ((c1762a.m5026i() != null && !c1762a.m5026i().isEmpty()) || c1762a.m5019c() > 0) {
            Map mapM5026i = c1762a.m5026i();
            Boolean bool = (Boolean) this.f2680a.m4801a(C1831z4.f3979l3);
            if (mapM5026i != null && c1762a.m5019c() > 0) {
                mapM5026i.put("current_retry_attempt", String.valueOf(c1762a.m5019c()));
            }
            if (zM5030m) {
                String strM4035a = AbstractC1701q7.m4035a(mapM5026i, bool.booleanValue());
                String strM5542b = AbstractC1804w4.m5542b(strM4035a, jM4020a, aVarM5546a, this.f2680a);
                if (StringUtils.isValidString(strM4035a) && TextUtils.isEmpty(strM5542b)) {
                    CollectionUtils.putStringIfValid("query", strM4035a, map);
                }
                httpsString = StringUtils.appendQueryParameter(httpsString, "p", strM5542b);
            } else {
                httpsString = StringUtils.appendQueryParameters(httpsString, mapM5026i, bool.booleanValue());
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Boolean boolEndsWith = StringUtils.endsWith(StringUtils.getHostAndPath(httpsString), f2679f);
            if (C1768p.m5160a()) {
                try {
                    C1768p c1768p = this.f2681b;
                    StringBuilder sb = new StringBuilder("Sending ");
                    sb.append(strM5025h);
                    sb.append(" request to id=#");
                    sb.append(httpsString.hashCode());
                    sb.append(" \"");
                    sb.append(boolEndsWith.booleanValue() ? httpsString : StringUtils.getHostAndPath(httpsString));
                    sb.append("\"...");
                    c1768p.m5175d("ConnectionManager", sb.toString());
                } catch (Throwable th2) {
                    th = th2;
                    strM5025h = strM5025h;
                }
            }
            C1530d4.c.a aVarM2376a = new C1530d4.c.a().m2378a(httpsString).m2384b(strM5025h).m2380a(c1762a.m5024g()).m2376a(c1762a.m5029l());
            if (c1762a.m5017b() != null) {
                if (zM5030m != 0) {
                    bytes = AbstractC1804w4.m5535a(c1762a.m5017b().toString(), jM4020a, aVarM5546a, this.f2680a);
                    if (bytes == null) {
                        CollectionUtils.putStringIfValid("body", c1762a.m5017b().toString(), map);
                    }
                } else {
                    bytes = c1762a.m5017b().toString().getBytes("UTF-8");
                }
                byte[] bArr = bytes;
                if ((zM5030m == 0 || aVarM5546a != AbstractC1804w4.a.V2) && c1762a.m5032o() && bArr != null && bArr.length > ((Integer) this.f2680a.m4801a(C1831z4.f3780N5)).intValue()) {
                    try {
                        bArrM4071a = AbstractC1701q7.m4071a(bArr);
                    } catch (Throwable th3) {
                        if (C1768p.m5160a()) {
                            this.f2681b.m5172a("ConnectionManager", "Failed to gzip POST body for request " + m4140c(httpsString), th3);
                        }
                        this.f2680a.m4764E().m4332a("ConnectionManager", "gzip", th3, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(httpsString)));
                        bArrM4071a = null;
                    }
                    aVarM2376a.m2379a("Content-Type", "application/json; charset=utf-8");
                    if (!c1762a.m5032o() && bArrM4071a != null) {
                        aVarM2376a.m2379a(HttpHeaders.CONTENT_ENCODING, "gzip");
                        aVarM2376a.m2382a(bArrM4071a);
                    } else if (bArr != null) {
                        aVarM2376a.m2382a(bArr);
                    }
                } else {
                    bArrM4071a = null;
                    aVarM2376a.m2379a("Content-Type", "application/json; charset=utf-8");
                    if (!c1762a.m5032o()) {
                        if (bArr != null) {
                            aVarM2376a.m2382a(bArr);
                        }
                    } else if (bArr != null) {
                        aVarM2376a.m2382a(bArr);
                    }
                }
                m4138a(strM5025h, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                eVar.mo3137a(httpsString, 0, th.getMessage(), null);
            }
            if (!map.isEmpty()) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(httpsString));
                if (((Boolean) this.f2680a.m4801a(C1831z4.f3772M5)).booleanValue()) {
                    CollectionUtils.putStringIfValid("details", new JSONObject(map).toString(), mapHashMap);
                }
                this.f2680a.m4764E().m2678a(C1548f2.f1546k1, UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ",", (Iterable) map.keySet()), mapHashMap);
            }
            String str2 = httpsString;
            try {
                httpsString = str2;
                try {
                    this.f2682c.m2356a(aVarM2376a.m2377a(new c(str2, c1762a, strM5025h, c1762a.m5021d(), zM5030m, bVar, eVar)).m2381a(this.f2680a.m4853s0().m2611c()).m2383a());
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    m4138a(strM5025h, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                    eVar.mo3137a(httpsString, 0, th.getMessage(), null);
                }
            } catch (Throwable th5) {
                th = th5;
                httpsString = str2;
                th = th;
                m4138a(strM5025h, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                eVar.mo3137a(httpsString, 0, th.getMessage(), null);
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m4143a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f2684e.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public void m4144b(String str) {
        if (((Boolean) this.f2680a.m4801a(C1831z4.f4078x3)).booleanValue()) {
            String hostAndPath = StringUtils.getHostAndPath(str);
            if (TextUtils.isEmpty(hostAndPath)) {
                return;
            }
            this.f2684e.add(hostAndPath);
        }
    }
}
