package com.apm.insight.entity;

import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1388d;
import com.apm.insight.CrashType;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.C1447a;
import com.ironsource.C12460ra;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.entity.b */
/* JADX INFO: compiled from: CustomBody.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1396b {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<C1388d> f543a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.entity.b$a */
    /* JADX INFO: compiled from: CustomBody.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo927a(JSONObject jSONObject);
    }

    static {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static File m1105a(File file) {
        return new File(file, "all_data.json");
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1106a() {
        C1388d next;
        JSONArray jSONArray = new JSONArray();
        Iterator<C1388d> it = f543a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.m1007c());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1107a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        for (C1388d c1388d : f543a) {
            if (c1388d != null && c1388d.m1004a(obj)) {
                jSONArray.put(c1388d.m1003a(CrashType.JAVA, (JSONArray) null));
                break;
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1108a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr) {
        for (C1388d c1388d : f543a) {
            if (c1388d != null && c1388d.m1004a(obj)) {
                JSONArray jSONArrayM1000a = c1388d.m1000a(stackTraceElementArr, th);
                JSONArray jSONArray = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C12460ra.f31825b, c1388d.m1006b());
                    jSONObject.put("lines", jSONArrayM1000a);
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
                return jSONArray;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1109a(String str) {
        C1388d next;
        JSONArray jSONArray = new JSONArray();
        String[] strArrSplit = str.split("\n");
        Iterator<C1388d> it = f543a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (C1447a.m1536b(next.m1006b())) {
                JSONArray jSONArrayM1002a = next.m1002a(strArrSplit);
                if (!C1373a.m868a(jSONArrayM1002a)) {
                    jSONArray.put(next.m1003a(CrashType.ANR, jSONArrayM1002a));
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1110a(String str, String str2, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("header")) != null && C1447a.m1538c(String.valueOf(jSONObjectOptJSONObject.opt(C12460ra.f31825b)))) {
                if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("package"))) {
                    jSONArray2.put(jSONObjectOptJSONObject2);
                } else if (m1114a(str, jSONObjectOptJSONObject.optJSONArray("so_list"), str2, jSONObjectOptJSONObject.optJSONArray("so_list"))) {
                    jSONArray2.put(jSONObjectOptJSONObject2);
                }
            }
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1111a(Throwable th, Thread thread, File file) {
        C1388d next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTraceElementArrM1428b = C1437m.m1428b(th);
        Iterator<C1388d> it = f543a.iterator();
        while (true) {
            if (!it.hasNext() || (next = it.next()) == null) {
                break;
            }
            if (C1447a.m1533a(next.m1006b())) {
                JSONArray jSONArrayM1001a = next.m1001a(stackTraceElementArrM1428b, th, thread != null ? thread.getName() : null);
                if (!C1373a.m868a(jSONArrayM1001a)) {
                    jSONArray.put(next.m1003a(CrashType.JAVA, jSONArrayM1001a));
                }
            } else {
                C1373a.m861a((Object) ("not enable javaCrash aid: " + next.m1006b()));
            }
        }
        if (C1373a.m868a(jSONArray)) {
            return null;
        }
        try {
            C1430f.m1329a(new File(file, "all_data.json"), jSONArray);
        } catch (IOException unused) {
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static void m1112a(C1388d c1388d) {
        f543a.add(c1388d);
    }

    /* JADX INFO: renamed from: a */
    public static void m1113a(JSONObject jSONObject, JSONArray jSONArray, a aVar) {
        JSONObject jSONObjectOptJSONObject;
        C1373a.m861a((Object) "uploadFromFile with allData ".concat(String.valueOf(jSONArray)));
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length() && (jSONObjectOptJSONObject = jSONArray.optJSONObject(i)) != null; i++) {
            if (C1373a.m855a(jSONObjectOptJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                C1395a.m1084b(jSONObject2, jSONObject);
                C1395a.m1084b(jSONObject2, jSONObjectOptJSONObject);
                aVar.mo927a(jSONObject2);
            } else {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        if (jSONArray2.length() == 0) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        C1395a.m1084b(jSONObject3, jSONObject);
        try {
            jSONObject3.put("all_data", jSONArray2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        aVar.mo927a(jSONObject3);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1114a(String str, JSONArray jSONArray, String str2, JSONArray jSONArray2) {
        if (!C1373a.m868a(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (str.contains(jSONArray.optString(i))) {
                    return true;
                }
            }
        }
        if (!C1373a.m868a(jSONArray2)) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String strOptString = jSONArray2.optString(i2);
                if (strOptString != null && strOptString.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m1115b(Object obj) {
        for (C1388d c1388d : f543a) {
            if (c1388d != null && c1388d.m1004a(obj)) {
                return c1388d.m1006b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m1116b() {
        C1388d next;
        JSONArray jSONArray = new JSONArray();
        Iterator<C1388d> it = f543a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.m1003a((CrashType) null, (JSONArray) null));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: c */
    public static int m1117c() {
        return f543a.size();
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m1118d() {
        C1388d next;
        ArrayList arrayList = new ArrayList();
        Iterator<C1388d> it = f543a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next.m1006b());
        }
        return arrayList;
    }
}
