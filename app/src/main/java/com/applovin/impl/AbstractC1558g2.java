package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.g2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1558g2 {

    /* JADX INFO: renamed from: g */
    private static volatile ExecutorService f1651g;

    /* JADX INFO: renamed from: a */
    protected final C1748l f1653a;

    /* JADX INFO: renamed from: b */
    protected final C1768p f1654b;

    /* JADX INFO: renamed from: c */
    private final C1548f2.b f1655c;

    /* JADX INFO: renamed from: d */
    private final Map f1656d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e */
    private final Set f1657e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f */
    private static final int f1650f = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: h */
    private static final Object f1652h = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.g2$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.applovin.impl.g2$a$a, reason: collision with other inner class name */
        class C15436a implements Thread.UncaughtExceptionHandler {
            C15436a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                AbstractC1558g2.this.f1653a.m4782Q();
                if (C1768p.m5160a()) {
                    AbstractC1558g2.this.f1653a.m4782Q().m5172a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) AbstractC1558g2.this.f1653a.m4801a(C1831z4.f3814S)).intValue());
            thread.setUncaughtExceptionHandler(new C15436a());
            return thread;
        }
    }

    public AbstractC1558g2(C1748l c1748l, C1548f2.b bVar) {
        this.f1653a = c1748l;
        this.f1654b = c1748l.m4782Q();
        this.f1655c = bVar;
        m2665a();
    }

    /* JADX INFO: renamed from: a */
    private URL m2663a(C1548f2 c1548f2, Map map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = m2670b(c1548f2, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb.append(strEncode);
            sb.append(C11744X3.j.f26434b);
            sb.append(strEncode2);
            if (it.hasNext()) {
                sb.append(C11744X3.j.f26436c);
            }
        }
        return new URL(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m2664a(C1548f2 c1548f2, double d, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (c1548f2 == C1548f2.f1501S0 || c1548f2 == C1548f2.f1499R0 || c1548f2 == C1548f2.f1540i1 || c1548f2 == C1548f2.f1534g1) {
            if (((Boolean) this.f1653a.m4801a(C1831z4.f4031r4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(AbstractC1675o8.m3775d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", AbstractC1675o8.m3774c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", AbstractC1675o8.m3771b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f1653a.m4759B().m4936K());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapM4938N = this.f1653a.m4759B().m4938N();
        JsonUtils.putObject(jSONObject2, C11540L6.f24917H, mapM4938N.get(C11540L6.f24917H));
        JsonUtils.putObject(jSONObject2, C11540L6.f24911F, mapM4938N.get(C11540L6.f24911F));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapM4938N.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapM4938N.get("brand"));
        JsonUtils.putObject(jSONObject2, C11540L6.f24899B, mapM4938N.get(C11540L6.f24899B));
        JsonUtils.putObject(jSONObject2, "brand_name", mapM4938N.get("brand_name"));
        JsonUtils.putObject(jSONObject2, "hardware", mapM4938N.get("hardware"));
        JsonUtils.putObject(jSONObject2, "revision", mapM4938N.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapM4938N.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f1653a.m4860w().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f1653a.m4837j0());
        JsonUtils.putObject(jSONObject2, "compass_random_token", this.f1653a.m4858v());
        JsonUtils.putObject(jSONObject2, "art", StringUtils.emptyIfNull(this.f1653a.m4852s()));
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(C1585j.m2942b()));
        Map mapM4933G = this.f1653a.m4759B().m4933G();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapM4933G.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f1653a.m4801a(C1831z4.f3794P3));
        JsonUtils.putObject(jSONObject2, "app_version", mapM4933G.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapM4933G.get("package_name"));
        JsonUtils.putObject(jSONObject2, "app_version_code", String.valueOf(mapM4933G.get("app_version_code")));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapM4933G.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, C11540L6.f25016u, this.f1653a.m4801a(C1831z4.f4042t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f1653a.m4794X());
        SessionTracker sessionTrackerM4846o0 = this.f1653a.m4846o0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerM4846o0.getCurrentApplicationState().m4425b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerM4846o0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, SDKAnalyticsEvents.PARAMETER_SESSION_ID, sessionTrackerM4846o0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - C1748l.m4755o()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", c1548f2.m2570b());
            JsonUtils.putDouble(jSONObject3, "weight", d);
            JsonUtils.putString(jSONObject3, "level", "DEBUG");
            m2668a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private void m2665a() {
        if (f1651g != null) {
            return;
        }
        synchronized (f1652h) {
            if (f1651g != null) {
                return;
            }
            f1651g = Executors.newFixedThreadPool(1, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m2671b(C1548f2 c1548f2, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (C1768p.m5160a()) {
            this.f1654b.m5171a("HealthEventsReporter", "Reporting " + c1548f2.m2570b() + " with extra parameters collection " + list);
        }
        if (this.f1655c != c1548f2.m2569a()) {
            AbstractC1617m1.m3169a("Health event " + c1548f2.m2570b() + " category: " + c1548f2.m2569a() + " does not match the reporter category: " + this.f1655c, new Object[0]);
        }
        m2675c(c1548f2, list);
        m2676d(c1548f2, list);
    }

    /* JADX INFO: renamed from: a */
    private void m2668a(Map map) {
        if (map == null) {
            return;
        }
        Object objM5142a = this.f1653a.m4773J().m5142a();
        Long lM5149c = this.f1653a.m4773J().m5149c();
        if (objM5142a instanceof AbstractC1736b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((AbstractC1736b) objM5142a).getAdIdNumber()));
            map.put("fs_ad_memory_usage", lM5149c != null ? lM5149c.toString() : "Error");
        } else if (!(objM5142a instanceof AbstractC1482a3)) {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
            map.put("fs_ad_memory_usage", "None");
        } else {
            AbstractC1482a3 abstractC1482a3 = (AbstractC1482a3) objM5142a;
            map.put("fs_ad_network", abstractC1482a3.getNetworkName());
            map.put("fs_ad_creative_id", abstractC1482a3.getCreativeId());
            map.put("fs_ad_memory_usage", lM5149c != null ? lM5149c.toString() : "Error");
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2669a(C1548f2 c1548f2, long j) {
        Long l = (Long) this.f1656d.get(c1548f2);
        return System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j;
    }

    /* JADX INFO: renamed from: b */
    private Map m2670b(C1548f2 c1548f2, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", c1548f2.m2570b());
        if (c1548f2 == C1548f2.f1501S0 || c1548f2 == C1548f2.f1499R0 || c1548f2 == C1548f2.f1540i1 || c1548f2 == C1548f2.f1534g1) {
            if (((Boolean) this.f1653a.m4801a(C1831z4.f4031r4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(AbstractC1675o8.m3775d()), map2);
                CollectionUtils.putStringIfValid("wvv", AbstractC1675o8.m3774c(), map2);
                CollectionUtils.putStringIfValid("wvpn", AbstractC1675o8.m3771b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f1653a.m4759B().m4936K(), map2);
        }
        Map mapM4938N = this.f1653a.m4759B().m4938N();
        map2.put(C11540L6.f24917H, String.valueOf(mapM4938N.get(C11540L6.f24917H)));
        map2.put("country_code", String.valueOf(mapM4938N.get("country_code")));
        map2.put("cc", this.f1653a.m4860w().getCountryCode());
        map2.put("applovin_random_token", this.f1653a.m4837j0());
        map2.put("compass_random_token", this.f1653a.m4858v());
        map2.put(C11540L6.f24899B, Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put(C11540L6.f24911F, Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C1585j.m2942b(), map2);
        map2.put(C11540L6.f25016u, (String) this.f1653a.m4801a(C1831z4.f4042t));
        m2673b(map2);
        m2668a(map2);
        if (map != null) {
            map2.putAll(m2674c(c1548f2, map));
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m2667a(String str, C1548f2 c1548f2, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes("UTF-8");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i = f1650f;
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", c1548f2.m2570b());
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (C1768p.m5160a()) {
                    this.f1654b.m5171a("HealthEventsReporter", c1548f2.m2570b() + " reported with code " + responseCode);
                }
                this.f1656d.put(c1548f2, Long.valueOf(System.currentTimeMillis()));
                AbstractC1701q7.m4060a(httpURLConnection2, this.f1653a);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (C1768p.m5160a()) {
                        this.f1654b.m5176d("HealthEventsReporter", "Failed to report " + c1548f2.m2570b(), th);
                    }
                } finally {
                    AbstractC1701q7.m4060a(httpURLConnection, this.f1653a);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2673b(Map map) {
        PackageInfo packageInfoM4023a = AbstractC1701q7.m4023a(C1748l.m4756p(), 0);
        map.put("package_name", C1748l.m4756p().getPackageName());
        map.put("app_version", packageInfoM4023a != null ? packageInfoM4023a.versionName : "");
        map.put("app_version_code", String.valueOf(packageInfoM4023a != null ? packageInfoM4023a.versionCode : 0));
    }

    /* JADX INFO: renamed from: c */
    private Map m2674c(C1548f2 c1548f2, Map map) {
        HashMap map2 = new HashMap(map);
        if (c1548f2 == C1548f2.f1509W0) {
            map2.remove("details");
        }
        return map2;
    }

    /* JADX INFO: renamed from: c */
    private void m2675c(C1548f2 c1548f2, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (c1548f2.m2569a() == C1548f2.b.AD || c1548f2.m2569a() == C1548f2.b.MEDIATED_AD || c1548f2.m2569a() == C1548f2.b.USER_SESSION || !AbstractC1701q7.m4061a(((Integer) this.f1653a.m4801a(C1831z4.f3678B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) m2663a(c1548f2, map).openConnection();
                try {
                    int i = f1650f;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", c1548f2.m2570b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (C1768p.m5160a()) {
                        this.f1654b.m5171a("HealthEventsReporter", c1548f2.m2570b() + " reported with code " + responseCode + " and extra parameters " + map);
                    }
                    this.f1656d.put(c1548f2, Long.valueOf(System.currentTimeMillis()));
                    AbstractC1701q7.m4060a(httpURLConnection, this.f1653a);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (C1768p.m5160a()) {
                            this.f1654b.m5176d("HealthEventsReporter", "Failed to report " + c1548f2.m2570b() + " with extra parameters " + map, th);
                        }
                        AbstractC1701q7.m4060a(httpURLConnection, this.f1653a);
                    } catch (Throwable th3) {
                        AbstractC1701q7.m4060a(httpURLConnection, this.f1653a);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                httpURLConnection = null;
                th = th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2676d(final C1548f2 c1548f2, List list) {
        final String str = (String) this.f1653a.m4801a(C1831z4.f3686C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dM2568a = c1548f2.m2568a(this.f1653a);
        if (AbstractC1701q7.m4061a(dM2568a)) {
            if (((Boolean) this.f1653a.m4801a(C1831z4.f3734I)).booleanValue()) {
                m2667a(str, c1548f2, m2664a(c1548f2, dM2568a, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final JSONObject jSONObjectM2664a = m2664a(c1548f2, dM2568a, Collections.singletonList((Map) it.next()));
                f1651g.execute(new Runnable() { // from class: com.applovin.impl.g2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m2667a(str, c1548f2, jSONObjectM2664a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2677a(C1548f2 c1548f2, String str) {
        m2678a(c1548f2, str, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m2678a(C1548f2 c1548f2, String str, Map map) {
        map.put("source", str);
        m2682d(c1548f2, map);
    }

    /* JADX INFO: renamed from: a */
    public void m2679a(C1548f2 c1548f2, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f1657e.add(str2)) {
            map.put("source", str);
            m2678a(c1548f2, str, map);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2680a(final C1548f2 c1548f2, final List list, long j) {
        if (m2669a(c1548f2, j)) {
            return;
        }
        try {
            if (AbstractC1701q7.m4113i()) {
                f1651g.execute(new Runnable() { // from class: com.applovin.impl.g2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m2671b(c1548f2, list);
                    }
                });
            } else {
                m2671b(c1548f2, list);
            }
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1654b.m5176d("HealthEventsReporter", "Failed to report " + c1548f2.m2570b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2681a(C1548f2 c1548f2, Map map, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        m2680a(c1548f2, arrayList, j);
    }

    /* JADX INFO: renamed from: d */
    public void m2682d(C1548f2 c1548f2, Map map) {
        m2681a(c1548f2, map, 0L);
    }
}
