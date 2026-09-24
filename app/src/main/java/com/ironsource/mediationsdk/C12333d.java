package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11455Gb;
import com.ironsource.C11540L6;
import com.ironsource.C11648R9;
import com.ironsource.C11724W0;
import com.ironsource.C11767Y9;
import com.ironsource.C12106b2;
import com.ironsource.C12186f2;
import com.ironsource.C12194fa;
import com.ironsource.C12258j2;
import com.ironsource.C12317m4;
import com.ironsource.C12434q2;
import com.ironsource.C12580w5;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC11742X1;
import com.ironsource.InterfaceC12582w7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.demandOnly.InterfaceC12350p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.d */
/* JADX INFO: loaded from: classes6.dex */
public class C12333d {

    /* JADX INFO: renamed from: A */
    public static final boolean f31037A = false;

    /* JADX INFO: renamed from: B */
    private static C12333d f31038B = new C12333d();

    /* JADX INFO: renamed from: c */
    public static final String f31039c = "auctionId";

    /* JADX INFO: renamed from: d */
    public static final String f31040d = "armData";

    /* JADX INFO: renamed from: e */
    public static final String f31041e = "larmData";

    /* JADX INFO: renamed from: f */
    public static final String f31042f = "isAdUnitCapped";

    /* JADX INFO: renamed from: g */
    public static final String f31043g = "settings";

    /* JADX INFO: renamed from: h */
    public static final String f31044h = "waterfall";

    /* JADX INFO: renamed from: i */
    public static final String f31045i = "genericParams";

    /* JADX INFO: renamed from: j */
    public static final String f31046j = "configurations";

    /* JADX INFO: renamed from: k */
    public static final String f31047k = "instances";

    /* JADX INFO: renamed from: l */
    public static final String f31048l = "${AUCTION_LOSS}";

    /* JADX INFO: renamed from: m */
    public static final String f31049m = "${AUCTION_MBR}";

    /* JADX INFO: renamed from: n */
    public static final String f31050n = "${AUCTION_PRICE}";

    /* JADX INFO: renamed from: o */
    public static final String f31051o = "${DYNAMIC_DEMAND_SOURCE}";

    /* JADX INFO: renamed from: p */
    public static final String f31052p = "${INSTANCE}";

    /* JADX INFO: renamed from: q */
    public static final String f31053q = "${INSTANCE_TYPE}";

    /* JADX INFO: renamed from: r */
    public static final String f31054r = "${PLACEMENT_NAME}";

    /* JADX INFO: renamed from: s */
    private static final String f31055s = "adMarkup";

    /* JADX INFO: renamed from: t */
    private static final String f31056t = "dynamicDemandSource";

    /* JADX INFO: renamed from: u */
    private static final String f31057u = "params";

    /* JADX INFO: renamed from: v */
    public static final String f31058v = "dlpl";

    /* JADX INFO: renamed from: w */
    public static final String f31059w = "adUnit";

    /* JADX INFO: renamed from: x */
    public static final String f31060x = "parallelLoad";

    /* JADX INFO: renamed from: y */
    public static final String f31061y = "bidderExclusive";

    /* JADX INFO: renamed from: z */
    public static final String f31062z = "showPriorityEnabled";

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f31063a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    private final InterfaceC12582w7 f31064b = C11455Gb.m25891U().mo25842a();

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f31065a;

        /* JADX INFO: renamed from: b */
        private List<C12434q2> f31066b;

        /* JADX INFO: renamed from: c */
        private C12434q2 f31067c;

        /* JADX INFO: renamed from: d */
        private JSONObject f31068d;

        /* JADX INFO: renamed from: e */
        private JSONObject f31069e;

        /* JADX INFO: renamed from: f */
        private int f31070f;

        /* JADX INFO: renamed from: g */
        private String f31071g;

        /* JADX INFO: renamed from: h */
        private InterfaceC11742X1 f31072h;

        public a(String str) {
            this.f31065a = str;
        }

        /* JADX INFO: renamed from: a */
        public String m32344a() {
            return this.f31065a;
        }

        /* JADX INFO: renamed from: b */
        public JSONObject m32345b() {
            return this.f31069e;
        }

        /* JADX INFO: renamed from: c */
        public int m32346c() {
            return this.f31070f;
        }

        /* JADX INFO: renamed from: d */
        public String m32347d() {
            return this.f31071g;
        }

        /* JADX INFO: renamed from: e */
        public C12434q2 m32348e() {
            return this.f31067c;
        }

        /* JADX INFO: renamed from: f */
        public JSONObject m32349f() {
            return this.f31068d;
        }

        /* JADX INFO: renamed from: g */
        public InterfaceC11742X1 m32350g() {
            return this.f31072h;
        }

        /* JADX INFO: renamed from: h */
        public List<C12434q2> m32351h() {
            return this.f31066b;
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC12350p m32343a(String str) {
            InterfaceC11742X1 interfaceC11742X1 = this.f31072h;
            return interfaceC11742X1 != null ? interfaceC11742X1.mo27855a(str) : new InterfaceC12350p.b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.d$b */
    static class b implements Runnable {

        /* JADX INFO: renamed from: d */
        private static final int f31073d = 15000;

        /* JADX INFO: renamed from: a */
        private String f31074a;

        /* JADX INFO: renamed from: b */
        private String f31075b;

        /* JADX INFO: renamed from: c */
        private String f31076c;

        public b(String str, String str2, String str3) {
            this.f31074a = str;
            this.f31075b = str2;
            this.f31076c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f31074a + ";" + this.f31075b + ";" + this.f31076c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f31076c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(responseCode == 200 || responseCode == 204 ? EnumC12598x5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : EnumC12598x5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put("errorCode", responseCode).put("reason", responseMessage)));
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.d$c */
    private enum c {
        NOT_SECURE,
        SECURE
    }

    /* JADX INFO: renamed from: b */
    public static C12333d m32333b() {
        return f31038B;
    }

    /* JADX INFO: renamed from: a */
    public a m32334a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        JSONObject jSONObjectOptJSONObject = null;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f31067c = new C12434q2(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(f31040d) ? jSONObject2.optJSONObject(f31040d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f31068d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f31069e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f31047k)) {
                aVar.f31072h = new InterfaceC11742X1.a(jSONObject2.optJSONObject(f31047k));
            }
        }
        aVar.f31066b = new ArrayList();
        if (jSONObject.has(f31044h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f31044h);
            for (int i = 0; i < jSONArray.length(); i++) {
                C12434q2 c12434q2 = new C12434q2(jSONArray.getJSONObject(i), i, jSONObjectOptJSONObject);
                if (!c12434q2.m33154n()) {
                    aVar.f31070f = 1002;
                    aVar.f31071g = "waterfall " + i;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f31066b.add(c12434q2);
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public String m32342c(String str) {
        String string = "";
        try {
            if (TextUtils.isEmpty(str) || !C12194fa.m31481a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has("dynamicDemandSource")) {
                return "";
            }
            string = jSONObject2.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + string);
            return string;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception " + e.getMessage());
            return string;
        }
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m32341b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception " + e.getMessage());
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private c m32331a() {
        c cVar = c.SECURE;
        if (Build.VERSION.SDK_INT >= 28) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar;
        }
        return (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    /* JADX INFO: renamed from: a */
    JSONObject m32338a(C12355h c12355h) throws JSONException {
        IronSource.EnumC12328a enumC12328a;
        boolean z;
        List<String> list;
        IronSource.EnumC12328a enumC12328aM32499c = c12355h.m32499c();
        boolean zM32519t = c12355h.m32519t();
        Map<String, Object> mapM32509h = c12355h.m32509h();
        List<String> listM32512l = c12355h.m32512l();
        C12106b2 c12106b2M32505e = c12355h.m32505e();
        int iM32514o = c12355h.m32514o();
        ISBannerSize iSBannerSizeM32507f = c12355h.m32507f();
        C11767Y9 c11767y9M32513n = c12355h.m32513n();
        boolean zM32515p = c12355h.m32515p();
        boolean zM32516q = c12355h.m32516q();
        ArrayList<C12258j2> arrayListM32511k = c12355h.m32511k();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = mapM32509h.keySet().iterator();
        while (true) {
            enumC12328a = enumC12328aM32499c;
            z = zM32519t;
            String strMo27405a = "";
            list = listM32512l;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ISBannerSize iSBannerSize = iSBannerSizeM32507f;
            JSONObject jSONObject3 = new JSONObject();
            C11767Y9 c11767y9 = c11767y9M32513n;
            jSONObject3.put(C11540L6.f25029y0, 2);
            jSONObject3.put(C11540L6.f25002p0, new JSONObject((Map) mapM32509h.get(next)));
            if (c12106b2M32505e != null) {
                strMo27405a = c12106b2M32505e.mo27405a(next);
            }
            jSONObject3.put(C11540L6.f24900B0, strMo27405a);
            jSONObject3.put("ts", zM32516q ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            enumC12328aM32499c = enumC12328a;
            zM32519t = z ? 1 : 0;
            listM32512l = list;
            iSBannerSizeM32507f = iSBannerSize;
            c11767y9M32513n = c11767y9;
        }
        ISBannerSize iSBannerSize2 = iSBannerSizeM32507f;
        C11767Y9 c11767y10 = c11767y9M32513n;
        int i = 2;
        for (String str : list) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(C11540L6.f25029y0, 1);
            jSONObject4.put(C11540L6.f24900B0, c12106b2M32505e != null ? c12106b2M32505e.mo27405a(str) : "");
            jSONObject2.put(str, jSONObject4);
        }
        for (C12258j2 c12258j2 : arrayListM32511k) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(C11540L6.f25029y0, c12258j2.m31790e() ? i : 1);
            Map<String, Object> mapM31791f = c12258j2.m31791f();
            if (!mapM31791f.isEmpty()) {
                jSONObject5.put(C11540L6.f25002p0, new JSONObject(mapM31791f));
            }
            jSONObject5.put(C11540L6.f24900B0, c12106b2M32505e != null ? c12106b2M32505e.mo27405a(c12258j2.m31792g()) : "");
            jSONObject5.put("ts", zM32516q ? 1 : 0);
            if (!c12258j2.m31793h().isEmpty()) {
                jSONObject5.put(f31058v, c12258j2.m31793h());
            }
            jSONObject2.put(c12258j2.m31792g(), jSONObject5);
            i = 2;
        }
        jSONObject.put(C11540L6.f25026x0, jSONObject2);
        if (c12355h.m32521v()) {
            jSONObject.put(C11540L6.f25027x1, 1);
        }
        if (c12355h.m32518s()) {
            jSONObject.put("do", 1);
        }
        new C11648R9().m27351b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectM31405a = new C12186f2(C11724W0.m27784a(enumC12328a)).m31405a();
        m32340a(jSONObjectM31405a, false);
        jSONObjectM31405a.put(C11540L6.f25032z0, iM32514o);
        jSONObjectM31405a.put(C11540L6.f24897A0, m32331a().ordinal());
        if (c11767y10 != null) {
            jSONObjectM31405a.put(C11540L6.f24985j1, c11767y10.m28035i());
        }
        jSONObject.put(C11540L6.f25017u0, jSONObjectM31405a);
        if (iSBannerSize2 != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(C11540L6.f25008r0, iSBannerSize2.getDescription());
            jSONObject6.put(C11540L6.f25014t0, iSBannerSize2.getWidth());
            jSONObject6.put(C11540L6.f25011s0, iSBannerSize2.getHeight());
            jSONObject.put(C11540L6.f25005q0, jSONObject6);
        }
        jSONObject.put(C11540L6.f24990l0, enumC12328a.toString());
        if (c12355h.m32496b() != null) {
            jSONObject.put("adf", c12355h.m32496b());
        }
        if (c12355h.m32502d() != null) {
            jSONObject.put("mediationAdUnitId", c12355h.m32502d());
        }
        if (c12355h.m32520u() != null) {
            jSONObject.put(C11540L6.f24999o0, c12355h.m32520u());
        }
        jSONObject.put(C11540L6.f25020v0, !z ? 1 : 0);
        if (c12355h.m32508g() != null) {
            jSONObject.put(C11540L6.f25015t1, new JSONObject().put(C11540L6.f25018u1, c12355h.m32508g()));
        } else {
            Object objRemove = jSONObjectM31405a.remove(C11540L6.f25015t1);
            if (objRemove != null) {
                jSONObject.put(C11540L6.f25015t1, objRemove);
            }
        }
        if (zM32515p) {
            jSONObject.put(C11540L6.f25009r1, 1);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public String m32337a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f31050n, str4).replace(f31048l, str6).replace(f31049m, str5).replace(f31052p, str2).replace(f31053q, Integer.toString(i)).replace(f31051o, str3).replace(f31054r, str7);
    }

    /* JADX INFO: renamed from: a */
    public String m32336a(String str, int i, C12434q2 c12434q2, String str2, String str3, String str4) {
        String strM33149i = c12434q2.m33149i();
        return m32337a(str, c12434q2.m33143c(), i, m32333b().m32342c(c12434q2.m33151k()), strM33149i, m32333b().m32332a(strM33149i, str2), str3, str4);
    }

    /* JADX INFO: renamed from: a */
    public void m32339a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    /* JADX INFO: renamed from: a */
    public String m32335a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("exception " + e.getMessage());
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private String m32332a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d = Double.parseDouble(str);
        double d2 = Double.parseDouble(str2);
        return d2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "" : String.valueOf(Math.round((d / d2) * 1000.0d) / 1000.0d);
    }

    /* JADX INFO: renamed from: a */
    public void m32340a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(C11540L6.f24991l1)) || !this.f31063a.compareAndSet(false, true)) {
            return;
        }
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.m32739a(z, true, -1)));
    }
}
