package com.mbridge.msdk.tracker.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.same.report.C13134c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13713c0;
import com.mbridge.msdk.thrid.okhttp.C13781q;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.EnumC13715d0;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13719h;
import com.mbridge.msdk.tracker.C13818e;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.p */
/* JADX INFO: compiled from: NetworkMonitor.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13846p {

    /* JADX INFO: renamed from: A */
    private volatile long f39467A;

    /* JADX INFO: renamed from: B */
    private volatile long f39468B;

    /* JADX INFO: renamed from: C */
    private volatile long f39469C;

    /* JADX INFO: renamed from: D */
    private volatile long f39470D;

    /* JADX INFO: renamed from: E */
    private volatile long f39471E;

    /* JADX INFO: renamed from: F */
    private volatile long f39472F;

    /* JADX INFO: renamed from: G */
    private volatile long f39473G;

    /* JADX INFO: renamed from: H */
    private volatile long f39474H;

    /* JADX INFO: renamed from: I */
    private volatile List<InetAddress> f39475I;

    /* JADX INFO: renamed from: J */
    private volatile InetSocketAddress f39476J;

    /* JADX INFO: renamed from: K */
    private volatile Proxy f39477K;

    /* JADX INFO: renamed from: L */
    private volatile C13781q f39478L;

    /* JADX INFO: renamed from: M */
    private volatile EnumC13787w f39479M;

    /* JADX INFO: renamed from: N */
    private volatile IOException f39480N;

    /* JADX INFO: renamed from: P */
    private volatile Exception f39482P;

    /* JADX INFO: renamed from: R */
    private long f39484R;

    /* JADX INFO: renamed from: S */
    private long f39485S;

    /* JADX INFO: renamed from: T */
    private long f39486T;

    /* JADX INFO: renamed from: U */
    private long f39487U;

    /* JADX INFO: renamed from: d */
    private volatile String f39491d;

    /* JADX INFO: renamed from: f */
    private volatile long f39493f;

    /* JADX INFO: renamed from: j */
    private volatile String f39497j;

    /* JADX INFO: renamed from: k */
    private volatile String f39498k;

    /* JADX INFO: renamed from: s */
    private volatile long f39506s;

    /* JADX INFO: renamed from: t */
    private volatile long f39507t;

    /* JADX INFO: renamed from: u */
    private volatile IOException f39508u;

    /* JADX INFO: renamed from: v */
    private volatile long f39509v;

    /* JADX INFO: renamed from: w */
    private volatile long f39510w;

    /* JADX INFO: renamed from: y */
    private volatile long f39512y;

    /* JADX INFO: renamed from: z */
    private volatile long f39513z;

    /* JADX INFO: renamed from: a */
    protected volatile String f39488a = "";

    /* JADX INFO: renamed from: b */
    private volatile String f39489b = "";

    /* JADX INFO: renamed from: c */
    private volatile String f39490c = "";

    /* JADX INFO: renamed from: e */
    private volatile String f39492e = "";

    /* JADX INFO: renamed from: g */
    private volatile int f39494g = -1;

    /* JADX INFO: renamed from: h */
    private volatile String f39495h = "";

    /* JADX INFO: renamed from: i */
    private volatile int f39496i = -1;

    /* JADX INFO: renamed from: l */
    private volatile String f39499l = "okhttp";

    /* JADX INFO: renamed from: m */
    private volatile boolean f39500m = false;

    /* JADX INFO: renamed from: n */
    private final AtomicInteger f39501n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o */
    private volatile String f39502o = "";

    /* JADX INFO: renamed from: p */
    private volatile long f39503p = 0;

    /* JADX INFO: renamed from: q */
    private volatile long f39504q = 0;

    /* JADX INFO: renamed from: r */
    private volatile long f39505r = 0;

    /* JADX INFO: renamed from: x */
    private volatile String f39511x = "system";

    /* JADX INFO: renamed from: O */
    private volatile boolean f39481O = false;

    /* JADX INFO: renamed from: Q */
    private volatile boolean f39483Q = false;

    public C13846p(String str, String str2) {
        this.f39491d = "";
        this.f39497j = "un_known";
        this.f39498k = "";
        this.f39497j = str;
        this.f39498k = str2;
        this.f39491d = UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: P */
    private void m41130P() {
        try {
            JSONObject jSONObjectM41136x = m41136x();
            C13818e c13818eM41133a = m41133a(jSONObjectM41136x, "m_request_end");
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("NetworkMonitor_" + m41145H(), "request  end  monitor = " + jSONObjectM41136x.toString());
            }
            C13156d.m37475b().m37496d().m41081d(c13818eM41133a);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("NetworkMonitor", "reportRequestEnd ", th);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m41131Q() {
        try {
            JSONObject jSONObjectM41137z = m41137z();
            C13818e c13818eM41133a = m41133a(jSONObjectM41137z, "m_request_start");
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("NetworkMonitor_" + m41145H(), "request start monitor = " + jSONObjectM41137z.toString());
            }
            C13156d.m37475b().m37496d().m41081d(c13818eM41133a);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("NetworkMonitor", "reportRequestStart ", th);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    private void m41132T() {
        this.f39480N = null;
        this.f39508u = null;
        this.f39482P = null;
        this.f39506s = 0L;
        this.f39507t = 0L;
        this.f39509v = 0L;
        this.f39510w = 0L;
        this.f39512y = 0L;
        this.f39513z = 0L;
        this.f39467A = 0L;
        this.f39468B = 0L;
        this.f39469C = 0L;
        this.f39470D = 0L;
        this.f39471E = 0L;
        this.f39472F = 0L;
        this.f39473G = 0L;
        this.f39474H = 0L;
        this.f39504q = 0L;
        this.f39505r = 0L;
        this.f39500m = false;
        this.f39494g = -1;
        this.f39496i = -1;
        this.f39495h = "";
        this.f39502o = "";
        this.f39503p = 0L;
        this.f39483Q = false;
    }

    /* JADX INFO: renamed from: a */
    private static C13818e m41133a(JSONObject jSONObject, String str) {
        C13818e c13818e = new C13818e(str);
        c13818e.m41002a(0);
        c13818e.m41008b(0);
        c13818e.m41004a(C13134c.m37283d());
        c13818e.m41006a(jSONObject);
        return c13818e;
    }

    /* JADX INFO: renamed from: a */
    private static String m41134a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            str2 = "IOException";
        }
        sb.append(String.format(str, str2));
        sb.append(TextUtils.isEmpty(str3) ? "" : str3.replaceAll("[\\n\\r]", " "));
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m41135a(IOException iOException, long j) {
        if (iOException != null) {
            if (this.f39509v == 0) {
                this.f39509v = j;
            }
            if (this.f39510w == 0) {
                this.f39510w = j;
            }
            if (this.f39512y == 0) {
                this.f39512y = j;
            }
            if (this.f39513z == 0) {
                this.f39513z = j;
            }
            if (this.f39467A == 0) {
                this.f39467A = j;
            }
            if (this.f39468B == 0) {
                this.f39468B = j;
            }
            if (this.f39469C == 0) {
                this.f39469C = j;
            }
            if (this.f39470D == 0) {
                this.f39470D = j;
            }
            if (this.f39471E == 0) {
                this.f39471E = j;
            }
            if (this.f39472F == 0) {
                this.f39472F = j;
            }
            if (this.f39473G == 0) {
                this.f39473G = j;
            }
            if (this.f39474H == 0) {
                this.f39474H = j;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private JSONObject m41136x() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", "m_request_end");
        jSONObject.put("uuid", m41150M());
        jSONObject.put("request_uuid", m41138A());
        jSONObject.put("url", m41149L());
        jSONObject.put("timeout", m41146I());
        jSONObject.put("timeout_connection", m41183e());
        jSONObject.put("timeout_read", m41205s());
        jSONObject.put("timeout_write", m41151N());
        jSONObject.put("scene", m41145H());
        jSONObject.put("lrid", m41200n());
        jSONObject.put("method", m41201o());
        jSONObject.put("adtp", m41172b());
        jSONObject.put("http_stack", m41199m());
        jSONObject.put("retry_count", m41208v() - 1);
        jSONObject.put("request_wait_duration", this.f39493f);
        jSONObject.put("duration", m41195j());
        jSONObject.put("request_duration", m41209w());
        jSONObject.put("response_code", m41142E());
        String strM41191h = m41191h();
        jSONObject.put("dns_result", strM41191h);
        jSONObject.put("dns_status", TextUtils.isEmpty(strM41191h) ? 2 : 1);
        jSONObject.put("is_connection_acquired", m41152O() ? 1 : 0);
        jSONObject.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, m41177c());
        jSONObject.put("port", m41202p());
        jSONObject.put("proxy", m41204r());
        jSONObject.put("protocol", m41203q());
        jSONObject.put("tls_version", m41147J());
        jSONObject.put("content_type", m41186f());
        int iM41144G = m41144G();
        jSONObject.put("result", iM41144G);
        if (iM41144G != 1) {
            jSONObject.put("error_type", m41198l());
            jSONObject.put("reason", m41197k());
        }
        jSONObject.put("dns_duration", m41189g());
        jSONObject.put("connect_duration", m41180d());
        jSONObject.put("request_header_duration", m41210y());
        jSONObject.put("request_body_duration", m41206t());
        jSONObject.put("request_body_size", m41207u());
        jSONObject.put("response_header_duration", m41143F());
        jSONObject.put("response_body_duration", m41140C());
        jSONObject.put("response_body_size", m41141D());
        jSONObject.put("transmission_duration", m41148K());
        jSONObject.put("current_response_body_size", m41139B());
        jSONObject.put("dns_type", m41193i());
        return jSONObject;
    }

    /* JADX INFO: renamed from: z */
    private JSONObject m41137z() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", "m_request_start");
        jSONObject.put("uuid", m41150M());
        jSONObject.put("request_uuid", m41138A());
        jSONObject.put("lrid", m41200n());
        jSONObject.put("url", m41149L());
        jSONObject.put("timeout", m41146I());
        jSONObject.put("timeout_connection", m41183e());
        jSONObject.put("timeout_read", m41205s());
        jSONObject.put("timeout_write", m41151N());
        jSONObject.put("scene", m41145H());
        jSONObject.put("method", m41201o());
        jSONObject.put("adtp", m41172b());
        jSONObject.put("http_stack", m41199m());
        jSONObject.put("retry_count", m41208v() - 1);
        jSONObject.put("request_wait_duration", this.f39493f);
        return jSONObject;
    }

    /* JADX INFO: renamed from: A */
    public String m41138A() {
        return TextUtils.isEmpty(this.f39492e) ? "" : this.f39492e;
    }

    /* JADX INFO: renamed from: B */
    public long m41139B() {
        return this.f39505r;
    }

    /* JADX INFO: renamed from: C */
    public long m41140C() {
        return this.f39474H - this.f39473G;
    }

    /* JADX INFO: renamed from: D */
    public long m41141D() {
        return this.f39504q;
    }

    /* JADX INFO: renamed from: E */
    public int m41142E() {
        return this.f39496i;
    }

    /* JADX INFO: renamed from: F */
    public long m41143F() {
        return this.f39472F - this.f39471E;
    }

    /* JADX INFO: renamed from: G */
    public int m41144G() {
        return this.f39494g;
    }

    /* JADX INFO: renamed from: H */
    public String m41145H() {
        return TextUtils.isEmpty(this.f39497j) ? "un_known" : this.f39497j;
    }

    /* JADX INFO: renamed from: I */
    public long m41146I() {
        return this.f39484R;
    }

    /* JADX INFO: renamed from: J */
    public String m41147J() {
        if (this.f39478L != null) {
            try {
                EnumC13715d0 enumC13715d0M40700c = this.f39478L.m40700c();
                return enumC13715d0M40700c == null ? "" : enumC13715d0M40700c.m40229d();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("NetworkMonitor", "getTlsVersion ", e);
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: K */
    public long m41148K() {
        return this.f39471E - this.f39467A;
    }

    /* JADX INFO: renamed from: L */
    public String m41149L() {
        return TextUtils.isEmpty(this.f39488a) ? "" : this.f39488a;
    }

    /* JADX INFO: renamed from: M */
    public String m41150M() {
        return TextUtils.isEmpty(this.f39491d) ? "" : this.f39491d;
    }

    /* JADX INFO: renamed from: N */
    public long m41151N() {
        return this.f39487U;
    }

    /* JADX INFO: renamed from: O */
    public boolean m41152O() {
        return this.f39500m;
    }

    /* JADX INFO: renamed from: R */
    public void m41153R() {
        this.f39469C = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: S */
    public void m41154S() {
        this.f39467A = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: U */
    public void m41155U() {
        this.f39473G = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: V */
    public void m41156V() {
        this.f39471E = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: W */
    public void m41157W() {
    }

    /* JADX INFO: renamed from: a */
    public void m41158a() {
        this.f39509v = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    public void m41159a(int i) {
        this.f39494g = i;
        if (this.f39483Q) {
            this.f39483Q = false;
            m41130P();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41160a(long j) {
        this.f39492e = UUID.randomUUID().toString();
        this.f39493f = j;
        this.f39501n.addAndGet(1);
        m41132T();
        this.f39483Q = true;
        m41131Q();
    }

    /* JADX INFO: renamed from: a */
    public void m41161a(C13709a0 c13709a0) {
        this.f39472F = SystemClock.elapsedRealtime();
        if (c13709a0 != null) {
            try {
                C13782r c13782rM40171m = c13709a0.m40171m();
                if (c13782rM40171m != null) {
                    String strM40708b = c13782rM40171m.m40708b("Content-Type");
                    if (TextUtils.isEmpty(strM40708b)) {
                        strM40708b = "";
                    }
                    m41176b(strM40708b);
                }
            } catch (Exception e) {
                m41176b("unknown");
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("NetworkMonitor", "responseHeadersEnd ", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41162a(InterfaceC13714d interfaceC13714d) {
        this.f39506s = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    public void m41163a(InterfaceC13719h interfaceC13719h) {
        this.f39500m = !this.f39481O;
        if (!this.f39500m || interfaceC13719h == null) {
            return;
        }
        try {
            this.f39479M = interfaceC13719h.mo40243a();
            C13713c0 c13713c0Mo40245c = interfaceC13719h.mo40245c();
            if (c13713c0Mo40245c != null) {
                this.f39476J = c13713c0Mo40245c.m40223d();
                this.f39477K = c13713c0Mo40245c.m40221b();
            }
            this.f39478L = interfaceC13719h.mo40244b();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("NetworkMonitor", "connectionAcquired ", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41164a(C13781q c13781q) {
        this.f39478L = c13781q;
    }

    /* JADX INFO: renamed from: a */
    public void m41165a(EnumC13787w enumC13787w, IOException iOException) {
        this.f39513z = SystemClock.elapsedRealtime();
        this.f39479M = enumC13787w;
        this.f39480N = iOException;
    }

    /* JADX INFO: renamed from: a */
    public void m41166a(C13789y c13789y) {
        this.f39468B = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: a */
    public void m41167a(IOException iOException) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f39507t = jElapsedRealtime;
        this.f39508u = iOException;
        m41135a(iOException, jElapsedRealtime);
    }

    /* JADX INFO: renamed from: a */
    public void m41168a(Exception exc) {
        this.f39482P = exc;
    }

    /* JADX INFO: renamed from: a */
    public void m41169a(String str) {
        this.f39490c = str;
    }

    /* JADX INFO: renamed from: a */
    public void m41170a(InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f39512y = SystemClock.elapsedRealtime();
        this.f39476J = inetSocketAddress;
        this.f39477K = proxy;
        this.f39481O = true;
    }

    /* JADX INFO: renamed from: a */
    public void m41171a(List<InetAddress> list) {
        this.f39510w = SystemClock.elapsedRealtime();
        this.f39475I = list;
    }

    /* JADX INFO: renamed from: b */
    public String m41172b() {
        return TextUtils.isEmpty(this.f39490c) ? "" : this.f39490c;
    }

    /* JADX INFO: renamed from: b */
    public void m41173b(int i) {
        this.f39496i = i;
    }

    /* JADX INFO: renamed from: b */
    public void m41174b(long j) {
        this.f39470D = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: b */
    public void m41175b(InterfaceC13719h interfaceC13719h) {
    }

    /* JADX INFO: renamed from: b */
    public void m41176b(String str) {
        this.f39502o = str;
    }

    /* JADX INFO: renamed from: c */
    public String m41177c() {
        if (this.f39476J != null) {
            try {
                InetAddress address = this.f39476J.getAddress();
                if (address == null) {
                    return "";
                }
                String hostAddress = address.getHostAddress();
                return TextUtils.isEmpty(hostAddress) ? "" : hostAddress;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("NetworkMonitor", "getAddress ", e);
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: c */
    public void m41178c(long j) {
        this.f39505r = j;
    }

    /* JADX INFO: renamed from: c */
    public void m41179c(String str) {
        this.f39511x = str;
    }

    /* JADX INFO: renamed from: d */
    public long m41180d() {
        return this.f39513z - this.f39512y;
    }

    /* JADX INFO: renamed from: d */
    public void m41181d(long j) {
        this.f39474H = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: d */
    public void m41182d(String str) {
        this.f39495h = str;
    }

    /* JADX INFO: renamed from: e */
    public long m41183e() {
        return this.f39485S;
    }

    /* JADX INFO: renamed from: e */
    public void m41184e(long j) {
        this.f39485S = j;
    }

    /* JADX INFO: renamed from: e */
    public void m41185e(String str) {
        this.f39489b = str;
    }

    /* JADX INFO: renamed from: f */
    public String m41186f() {
        return C13093d.m37127a(this.f39502o);
    }

    /* JADX INFO: renamed from: f */
    public void m41187f(long j) {
        this.f39486T = j;
    }

    /* JADX INFO: renamed from: f */
    public void m41188f(String str) {
        this.f39488a = str;
    }

    /* JADX INFO: renamed from: g */
    public long m41189g() {
        return this.f39510w - this.f39509v;
    }

    /* JADX INFO: renamed from: g */
    public void m41190g(long j) {
        this.f39503p = j;
    }

    /* JADX INFO: renamed from: h */
    public String m41191h() {
        if (this.f39475I == null || this.f39475I.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f39475I.size(); i++) {
            try {
                InetAddress inetAddress = this.f39475I.get(i);
                if (inetAddress != null) {
                    sb.append(inetAddress.getHostAddress());
                    if (i != this.f39475I.size() - 1) {
                        sb.append(",");
                    } else {
                        continue;
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("NetworkMonitor", "getDnsResult ", e);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public void m41192h(long j) {
        this.f39504q = j;
    }

    /* JADX INFO: renamed from: i */
    public String m41193i() {
        return TextUtils.isEmpty(this.f39511x) ? "system" : this.f39511x;
    }

    /* JADX INFO: renamed from: i */
    public void m41194i(long j) {
        this.f39484R = j;
    }

    /* JADX INFO: renamed from: j */
    public long m41195j() {
        return (this.f39507t - this.f39506s) + this.f39493f;
    }

    /* JADX INFO: renamed from: j */
    public void m41196j(long j) {
        this.f39487U = j;
    }

    /* JADX INFO: renamed from: k */
    public String m41197k() {
        try {
            if (this.f39480N != null) {
                String name = this.f39480N.getClass().getName();
                String message = this.f39480N.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    return m41134a("connection: %s ", name, message);
                }
            }
            if (this.f39508u != null) {
                String name2 = this.f39508u.getClass().getName();
                String message2 = this.f39508u.getMessage();
                if (!TextUtils.isEmpty(message2)) {
                    return m41134a("call: %s ", name2, message2);
                }
            }
            if (this.f39482P == null) {
                return "un_known";
            }
            String name3 = this.f39482P.getClass().getName();
            String message3 = this.f39482P.getMessage();
            return !TextUtils.isEmpty(message3) ? m41134a("error: %s ", name3, message3) : "un_known";
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return "un_known";
            }
            C13219q0.m37817b("NetworkMonitor", "getError ", e);
            return "un_known";
        }
    }

    /* JADX INFO: renamed from: l */
    public String m41198l() {
        return this.f39495h;
    }

    /* JADX INFO: renamed from: m */
    public String m41199m() {
        return this.f39499l;
    }

    /* JADX INFO: renamed from: n */
    public String m41200n() {
        return TextUtils.isEmpty(this.f39489b) ? "" : this.f39489b;
    }

    /* JADX INFO: renamed from: o */
    public String m41201o() {
        return TextUtils.isEmpty(this.f39498k) ? "" : this.f39498k;
    }

    /* JADX INFO: renamed from: p */
    public int m41202p() {
        if (this.f39476J != null) {
            return this.f39476J.getPort();
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public String m41203q() {
        return this.f39479M != null ? this.f39479M.toString() : "";
    }

    /* JADX INFO: renamed from: r */
    public String m41204r() {
        Proxy.Type type;
        return (this.f39477K == null || (type = this.f39477K.type()) == null) ? "" : type.toString();
    }

    /* JADX INFO: renamed from: s */
    public long m41205s() {
        return this.f39486T;
    }

    /* JADX INFO: renamed from: t */
    public long m41206t() {
        return this.f39470D - this.f39469C;
    }

    /* JADX INFO: renamed from: u */
    public long m41207u() {
        return this.f39503p;
    }

    /* JADX INFO: renamed from: v */
    public int m41208v() {
        return this.f39501n.getAndAdd(0);
    }

    /* JADX INFO: renamed from: w */
    public long m41209w() {
        return this.f39507t - this.f39506s;
    }

    /* JADX INFO: renamed from: y */
    public long m41210y() {
        return this.f39468B - this.f39467A;
    }
}
