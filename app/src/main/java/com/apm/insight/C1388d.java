package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.apm.insight.entity.C1396b;
import com.apm.insight.nativecrash.C1442b;
import com.apm.insight.p020j.C1411b;
import com.apm.insight.p021k.C1423j;
import com.apm.insight.p022l.C1437m;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C12460ra;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.d */
/* JADX INFO: compiled from: MonitorCrashHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1388d {

    /* JADX INFO: renamed from: a */
    protected static MonitorCrash f495a;

    /* JADX INFO: renamed from: c */
    private static volatile ConcurrentHashMap<String, C1388d> f496c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private MonitorCrash f497b;

    private C1388d(MonitorCrash monitorCrash) {
        this.f497b = monitorCrash;
        C1396b.m1112a(this);
        C1411b.m1191c();
        C1423j.m1280e();
    }

    /* JADX INFO: renamed from: a */
    static C1388d m994a(String str) {
        return f496c.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static Object m995a() {
        return f495a;
    }

    /* JADX INFO: renamed from: a */
    static void m997a(Context context, final MonitorCrash monitorCrash) {
        f495a = monitorCrash;
        C1388d c1388d = new C1388d(monitorCrash);
        final C1442b c1442bM1012a = C1390e.m1012a();
        Npth.init(context, new ICommonParams() { // from class: com.apm.insight.d.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                JSONObject jSONObjectM999d = C1388d.this.m999d();
                HashMap map = new HashMap();
                if (jSONObjectM999d != null) {
                    Iterator<String> itKeys = jSONObjectM999d.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObjectM999d.opt(next));
                    }
                }
                return map;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? c1442bM1012a.m1512d() : monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    static void m998a(MonitorCrash monitorCrash) {
        C1388d c1388d = new C1388d(monitorCrash);
        if (monitorCrash.mConfig != null) {
            f496c.put(monitorCrash.mConfig.mAid, c1388d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public JSONObject m999d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f497b.mConfig.mPackageName == null) {
                Context contextM1032g = C1390e.m1032g();
                PackageInfo packageInfo = contextM1032g.getPackageManager().getPackageInfo(contextM1032g.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.f497b.mConfig.mVersionInt == -1) {
                        this.f497b.mConfig.mVersionInt = packageInfo.versionCode;
                    }
                    if (this.f497b.mConfig.mVersionStr == null) {
                        this.f497b.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f497b.mConfig.mDeviceId) || "0".equals(this.f497b.mConfig.mDeviceId)) {
            this.f497b.mConfig.mDeviceId = C1390e.m1024c().m1639a();
        }
        try {
            jSONObject.put(C12460ra.f31825b, String.valueOf(this.f497b.mConfig.mAid));
            jSONObject.put("update_version_code", this.f497b.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f497b.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f497b.mConfig.mVersionStr);
            jSONObject.put("channel", this.f497b.mConfig.mChannel);
            jSONObject.put("package", C1373a.m858a(this.f497b.mConfig.mPackageName));
            jSONObject.put("device_id", this.f497b.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f497b.mConfig.mUID);
            jSONObject.put("ssid", this.f497b.mConfig.mSSID);
            jSONObject.put(C11540L6.f24911F, C11744X3.f26142d);
            jSONObject.put("so_list", C1373a.m858a(this.f497b.mConfig.mSoList));
            jSONObject.put("thread_list", C1373a.m858a(this.f497b.mConfig.mThreadList));
            jSONObject.put("single_upload", 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m1000a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        return m1001a(stackTraceElementArr, th, null);
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m1001a(StackTraceElement[] stackTraceElementArr, Throwable th, String str) {
        if (this.f497b.mConfig.mPackageName == null) {
            return new JSONArray().put(new C1437m.a(0, stackTraceElementArr.length).m1432a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        JSONArray jSONArrayM1416a = C1437m.m1416a(stackTraceElementArr, this.f497b.mConfig.mPackageName);
        if (str != null && this.f497b.mConfig.mThreadList != null && C1373a.m868a(jSONArrayM1416a)) {
            for (String str2 : this.f497b.mConfig.mThreadList) {
                if (TextUtils.equals(str2, str)) {
                    jSONArrayM1416a.put(new C1437m.a(0, stackTraceElementArr.length).m1432a());
                }
            }
        }
        return jSONArrayM1416a;
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m1002a(String[] strArr) {
        return this.f497b.config().mPackageName == null ? new JSONArray().put(new C1437m.a(0, strArr.length).m1432a()) : C1437m.m1417a(strArr, this.f497b.mConfig.mPackageName);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m1003a(CrashType crashType, JSONArray jSONArray) {
        Map<? extends String, ? extends String> userData;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", m999d());
            jSONObject.put("line_num", jSONArray);
            if (crashType != null) {
                jSONObject.put("custom", (this.f497b.mCustomData == null || (userData = this.f497b.mCustomData.getUserData(crashType)) == null) ? null : new JSONObject(userData));
                jSONObject.put("filters", new JSONObject(this.f497b.mTagMap));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1004a(Object obj) {
        return this.f497b == obj;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1005a(String str, String str2) {
        if (this.f497b.config().mPackageName == null) {
            return true;
        }
        return C1396b.m1114a(str, C1373a.m858a(this.f497b.mConfig.mSoList), str2, C1373a.m858a(this.f497b.mConfig.mThreadList));
    }

    /* JADX INFO: renamed from: b */
    public final String m1006b() {
        return this.f497b.mConfig.mAid;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m1007c() {
        return m999d();
    }
}
