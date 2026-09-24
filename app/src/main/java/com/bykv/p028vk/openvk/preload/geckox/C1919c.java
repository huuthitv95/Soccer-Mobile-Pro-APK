package com.bykv.p028vk.openvk.preload.geckox;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.falconx.loader.C1897a;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.p028vk.openvk.preload.falconx.p032a.C1896a;
import com.bykv.p028vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.p028vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.p028vk.openvk.preload.geckox.net.INetWork;
import com.bykv.p028vk.openvk.preload.geckox.p033a.p034a.AbstractC1903b;
import com.bykv.p028vk.openvk.preload.geckox.p033a.p034a.C1902a;
import com.bykv.p028vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import com.ironsource.C11661S5;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c */
/* JADX INFO: compiled from: GeckoHubUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1919c {

    /* JADX INFO: renamed from: a */
    private static File f4375a;

    /* JADX INFO: renamed from: b */
    private static Context f4376b;

    /* JADX INFO: renamed from: c */
    private static String f4377c;

    /* JADX INFO: renamed from: g */
    private static final Set<String> f4378g = new HashSet(Arrays.asList("js", "css", "html", "ico", "jpeg", "jpg", "png", "gif", "woff", "svg", "ttf", "woff2", "webp", "otf", "sfnt"));

    /* JADX INFO: renamed from: d */
    private Map.Entry<String, JSONObject> f4379d;

    /* JADX INFO: renamed from: e */
    private Map.Entry<String, JSONObject> f4380e;

    /* JADX INFO: renamed from: f */
    private INetWork f4381f;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c$a */
    /* JADX INFO: compiled from: GeckoHubUtil.java */
    static class a {

        /* JADX INFO: renamed from: a */
        private static C1919c f4382a = new C1919c(0);
    }

    private C1919c() {
    }

    /* synthetic */ C1919c(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static int m5983a(ILoader iLoader, String str) {
        if (iLoader == null || str == null) {
            return 0;
        }
        try {
            return new C1897a(f4376b, "f36c832c8dbb162c49b46a7a6dd47fbd", f4375a).m5885a(str + File.separator);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1919c m5984a() {
        return a.f4382a;
    }

    /* JADX INFO: renamed from: a */
    public static C1919c m5985a(Context context) {
        f4376b = context;
        if (f4375a == null) {
            f4375a = new File(f4376b.getCacheDir() + File.separator + "gecko");
        }
        return a.f4382a;
    }

    /* JADX INFO: renamed from: a */
    private static String m5986a(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str).getString("md5");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m5987a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                Map.Entry<String, JSONObject> entry = this.f4379d;
                if (entry == null || !str.equals(entry.getKey())) {
                    String strM6073a = C1965b.m6073a(new C1897a(f4376b, "f36c832c8dbb162c49b46a7a6dd47fbd", f4375a).getInputStream(str + "/manifest.json"));
                    if (TextUtils.isEmpty(strM6073a)) {
                        return null;
                    }
                    this.f4379d = new AbstractMap.SimpleEntry(str, new JSONObject(strM6073a));
                }
                Map.Entry<String, JSONObject> entry2 = this.f4380e;
                if (entry2 == null || !str.equals(entry2.getKey())) {
                    String strM6073a2 = C1965b.m6073a(new C1897a(f4376b, "f36c832c8dbb162c49b46a7a6dd47fbd", f4375a).getInputStream(str + "/md5_url_map.json"));
                    if (TextUtils.isEmpty(strM6073a2)) {
                        return null;
                    }
                    this.f4380e = new AbstractMap.SimpleEntry(str, new JSONObject(strM6073a2));
                }
                JSONObject value = this.f4379d.getValue();
                JSONObject value2 = this.f4380e.getValue();
                String strM5986a = m5986a(str2, value2);
                if (value.has(strM5986a)) {
                    JSONObject jSONObject = value.getJSONObject(strM5986a);
                    m5990a(value, strM5986a, str2);
                    return jSONObject;
                }
                String strM5992b = m5992b(str2);
                if (strM5992b == null) {
                    return null;
                }
                String strM5986a2 = m5986a(strM5992b, value2);
                if (value.has(strM5986a2)) {
                    JSONObject jSONObject2 = value.getJSONObject(strM5986a2);
                    m5990a(value, strM5986a2, str2);
                    return jSONObject2;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m5988a(ILoader iLoader) {
        if (iLoader != null) {
            try {
                iLoader.release();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5989a(String str) {
        f4377c = str;
    }

    /* JADX INFO: renamed from: a */
    private void m5990a(JSONObject jSONObject, String str, String str2) {
        try {
            if ("once".equals(jSONObject.getJSONObject(str).optJSONObject("cacheStrategy").optString("hitStrategy"))) {
                jSONObject.remove(str);
                m5993c(str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1897a m5991b() {
        try {
            return new C1897a(f4376b, "f36c832c8dbb162c49b46a7a6dd47fbd", f4375a);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m5992b(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: c */
    private void m5993c(String str) {
        try {
            if (this.f4381f == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f4381f.syncDoGet(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final WebResourceResponseModel m5994a(ILoader iLoader, String str, String str2) {
        String strOptString;
        try {
            if (iLoader == null) {
                return new WebResourceResponseModel(-1, null);
            }
            if (!TextUtils.isEmpty(str2) && !str2.matches("^https?:\\/\\/www\\.google-analytics\\.com/(?:ga|urchin|analytics)\\.js") && !str2.matches("^https?:\\/\\/www\\.googletagmanager\\.com\\/(gtag\\/js|gtm\\.js)") && !str2.matches("^https?:\\/\\/analytics\\.tiktok\\.com\\/i18n\\/pixel") && !str2.matches("https?:\\/\\/connect\\.facebook\\.net\\/(.*)\\/fbevents\\.js") && !str2.matches("https?:\\/\\/mc\\.yandex\\.ru\\/") && !str2.contains("jsonp") && !str2.contains("Callback") && !str2.contains("analytics.tiktok.com/i18n/pixel") && !str2.contains("google-analytics.com/analytics") && !str2.contains("connect.facebook.net")) {
                JSONObject jSONObjectM5987a = m5987a(str, str2);
                Set<String> set = f4378g;
                String strM5992b = m5992b(str2);
                int iLastIndexOf = strM5992b.lastIndexOf(".");
                int i = set.contains(iLastIndexOf == -1 ? "" : strM5992b.substring(iLastIndexOf + 1)) ? 2 : -1;
                if (jSONObjectM5987a != null && (strOptString = jSONObjectM5987a.optString(C11661S5.c.f25653b, null)) != null) {
                    JSONObject jSONObject = jSONObjectM5987a.has("respHeader") ? jSONObjectM5987a.getJSONObject("respHeader") : null;
                    if (jSONObject == null) {
                        return new WebResourceResponseModel(i, null);
                    }
                    String str3 = str + File.separator + strOptString;
                    InputStream inputStream = !iLoader.exist(str3) ? null : iLoader.getInputStream(str3);
                    if (inputStream == null) {
                        return new WebResourceResponseModel(i, null);
                    }
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject.getString(next));
                    }
                    return new WebResourceResponseModel(i, C1896a.m5881a(inputStream, map));
                }
                return new WebResourceResponseModel(i, null);
            }
            return new WebResourceResponseModel(1, null);
        } catch (Throwable unused) {
            return new WebResourceResponseModel(-1, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5995a(String str, IStatisticMonitor iStatisticMonitor, Set<String> set, INetWork iNetWork) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1910b c1910b = new C1910b(new C1910b.a(f4376b).m5966b("f36c832c8dbb162c49b46a7a6dd47fbd").m5963a("f36c832c8dbb162c49b46a7a6dd47fbd").m5964b().m5965b(str).m5962a("9999999.0.0").m5958a(new C1902a.a().m5904a().m5905a(AbstractC1903b.f4316b).m5906b()).m5961a(f4375a).m5956a().m5967c(f4377c).m5960a(iStatisticMonitor).m5959a(iNetWork).m5957a(SystemClock.elapsedRealtime()), (byte) 0);
        this.f4381f = iNetWork;
        C1900a c1900aM5887a = C1900a.m5887a(c1910b);
        HashMap map = new HashMap();
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(new CheckRequestBodyModel.TargetChannel(it.next()));
        }
        map.put("f36c832c8dbb162c49b46a7a6dd47fbd", linkedList);
        c1900aM5887a.m5895a(map);
    }
}
