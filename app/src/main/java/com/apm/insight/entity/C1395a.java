package com.apm.insight.entity;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.nativecrash.C1441a;
import com.apm.insight.nativecrash.C1442b;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.p023a.C1449b;
import com.ironsource.C11744X3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.entity.a */
/* JADX INFO: compiled from: CrashBody.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1395a {

    /* JADX INFO: renamed from: a */
    private JSONObject f541a;

    /* JADX INFO: renamed from: b */
    private Header f542b;

    public C1395a() {
        JSONObject jSONObject = new JSONObject();
        this.f541a = jSONObject;
        try {
            jSONObject.put("apm_id", "20000001");
        } catch (JSONException unused) {
        }
    }

    public C1395a(JSONObject jSONObject) {
        this.f541a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static C1395a m1077a(long j, Context context, Throwable th) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        C1395a c1395a = new C1395a();
        c1395a.m1095a("isJava", (Object) 1);
        c1395a.m1095a("data", (Object) C1437m.m1412a(th));
        c1395a.m1095a("crash_time", Long.valueOf(j));
        c1395a.m1095a("process_name", (Object) C1425a.m1291b());
        if (!C1425a.m1292b(context)) {
            c1395a.m1095a("remote_process", (Object) 1);
        }
        return c1395a;
    }

    /* JADX INFO: renamed from: a */
    private C1395a m1078a(String str, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject = this.f541a.optJSONObject("custom_long");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            m1095a("custom_long", jSONObjectOptJSONObject);
        }
        try {
            jSONObjectOptJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public static void m1079a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            try {
                jSONObjectOptJSONObject = new JSONObject();
                jSONObject.put(str, jSONObjectOptJSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObjectOptJSONObject.put(str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public static void m1080a(JSONObject jSONObject, Throwable th) {
        try {
            if (jSONObject.opt("npth_err_info") == null) {
                jSONObject.put("npth_err_info", C1437m.m1412a(th));
                return;
            }
            for (int i = 0; i < 5; i++) {
                if (jSONObject.opt("npth_err_info" + i) == null) {
                    jSONObject.put("npth_err_info" + i, C1437m.m1412a(th));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1081a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1082a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        try {
            jSONObject.put(C11744X3.a.f26174k, jSONObject2);
        } catch (Throwable unused) {
        }
        long jOptLong = jSONObject2.optLong("inner_free");
        long jOptLong2 = jSONObject2.optLong("sdcard_free");
        long jOptLong3 = jSONObject2.optLong("inner_free_real");
        String str3 = "1M - 64M";
        if (jOptLong <= 1024) {
            str = "0 - 1K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            str = "1K - 64K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str = "64K - 512K";
        } else if (jOptLong <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str = "512K - 1M";
        } else {
            str = jOptLong <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong3 <= 1024) {
            str2 = "0 - 1K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            str2 = "1K - 64K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str2 = "64K - 512K";
        } else if (jOptLong3 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str2 = "512K - 1M";
        } else {
            str2 = jOptLong3 <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong2 <= 1024) {
            str3 = "0 - 1K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            str3 = "1K - 64K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            str3 = "64K - 512K";
        } else if (jOptLong2 <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            str3 = "512K - 1M";
        } else if (jOptLong2 > 67108864) {
            str3 = "64M - ";
        }
        m1079a(jSONObject, "filters", "inner_free", str);
        m1079a(jSONObject, "filters", "inner_free_real", str2);
        m1079a(jSONObject, "filters", "sdcard_free", str3);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1083a(String str) {
        return ((long) C1442b.m1508c(str)) > C1441a.m1481g();
    }

    /* JADX INFO: renamed from: b */
    public static void m1084b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt == null) {
                    jSONObject.put(next, jSONObject2.opt(next));
                } else if (objOpt instanceof JSONObject) {
                    m1084b(jSONObject.getJSONObject(next), jSONObject2.getJSONObject(next));
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (jSONArrayOptJSONArray.opt(0) instanceof JSONObject)) {
                            m1084b(jSONArray.getJSONObject(0), jSONArrayOptJSONArray.getJSONObject(0));
                        } else {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                jSONArray.put(jSONArrayOptJSONArray.get(i));
                            }
                        }
                    }
                } else {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1085b(String str) {
        return C1442b.m1504a(str) > 960;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1086c(String str) {
        return C1442b.m1507b(str) > 350;
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1087a(int i, String str) {
        try {
            this.f541a.put("miniapp_id", i);
            this.f541a.put("miniapp_version", str);
            return this;
        } catch (JSONException e) {
            e.printStackTrace();
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1088a(long j) {
        try {
            m1095a("app_start_time", Long.valueOf(j));
            m1095a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
            return this;
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1089a(Header header) {
        m1095a("header", header.m1076f());
        this.f542b = header;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1090a(C1449b c1449b) {
        m1095a("activity_trace", c1449b.m1595g());
        m1078a("activity_track", c1449b.m1597i());
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1091a(String str, String str2) {
        Object objOpt = this.f541a.opt("data");
        if (objOpt instanceof JSONArray) {
            m1079a(((JSONArray) objOpt).optJSONObject(0), "filters", str, str2);
            return this;
        }
        m1079a(this.f541a, "filters", str, str2);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1092a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            m1095a("patch_info", (Object) jSONArray);
            return this;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        m1095a("patch_info", (Object) jSONArray);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1093a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (map == null) {
                this.f541a.put("plugin_info", jSONArray);
                return this;
            }
            for (String str : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", str);
                jSONObject.put("version_code", map.get(str));
                jSONArray.put(jSONObject);
            }
            this.f541a.put("plugin_info", jSONArray);
            return this;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1094a(JSONObject jSONObject) {
        m1095a("header", jSONObject);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m1095a(String str, Object obj) {
        try {
            this.f541a.put(str, obj);
        } catch (Exception e) {
            C1373a.m874b((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1096a() {
        Object objOpt = this.f541a.opt("data");
        if (objOpt instanceof JSONArray) {
            return !C1373a.m870a(((JSONArray) objOpt).optJSONObject(0), "logcat");
        }
        return !C1373a.m870a(this.f541a, "logcat");
    }

    /* JADX INFO: renamed from: b */
    public final C1395a m1097b(String str, String str2) {
        Object objOpt = this.f541a.opt("data");
        if (objOpt instanceof JSONArray) {
            m1079a(((JSONArray) objOpt).optJSONObject(0), "custom", str, str2);
            return this;
        }
        m1079a(this.f541a, "custom", str, str2);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C1395a m1098b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException e) {
                    C1373a.m874b((Throwable) e);
                }
            }
            try {
                this.f541a.put("sdk_info", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C1395a m1099b(JSONObject jSONObject) {
        m1082a(this.f541a, jSONObject);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m1100b() {
        m1091a("has_logcat", String.valueOf(m1096a()));
    }

    /* JADX INFO: renamed from: c */
    public final C1395a m1101c(Map<? extends String, ? extends String> map) {
        JSONObject jSONObjectOptJSONObject;
        if (map != null) {
            Object objOpt = this.f541a.opt("data");
            JSONObject jSONObjectOptJSONObject2 = objOpt instanceof JSONArray ? ((JSONArray) objOpt).optJSONObject(0) : this.f541a;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("filters");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                    m1095a("filters", jSONObjectOptJSONObject);
                }
            }
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                try {
                    jSONObjectOptJSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            m1095a("filters", jSONObjectOptJSONObject);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m1102c() {
        return this.f541a;
    }

    /* JADX INFO: renamed from: c */
    public final void m1103c(JSONObject jSONObject) {
        m1084b(this.f541a, jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public final Header m1104d() {
        if (this.f542b == null) {
            Header header = new Header(C1390e.m1032g());
            this.f542b = header;
            m1089a(header);
        }
        return this.f542b;
    }
}
