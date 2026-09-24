package com.applovin.impl.sdk;

import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NativeCrashReporter implements C1739c.a {

    /* JADX INFO: renamed from: b */
    private static boolean f2859b;

    /* JADX INFO: renamed from: c */
    private static boolean f2860c;

    /* JADX INFO: renamed from: d */
    private static final NativeCrashReporter f2861d = new NativeCrashReporter();

    /* JADX INFO: renamed from: a */
    private final HashMap f2862a = new HashMap();

    private NativeCrashReporter() {
    }

    /* JADX INFO: renamed from: a */
    public static void m4413a(C1748l c1748l) {
        if (c1748l == null) {
            return;
        }
        if (!((Boolean) c1748l.m4801a(C1831z4.f4055u4)).booleanValue() && !AbstractC1701q7.m4117k(C1748l.m4756p())) {
            if (f2860c) {
                try {
                    C1739c c1739cM4832h = c1748l.m4832h();
                    NativeCrashReporter nativeCrashReporter = f2861d;
                    c1739cM4832h.m4594b((C1739c.a) nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th) {
                    c1748l.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l.m4782Q().m5172a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    c1748l.m4764E().m4329a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (m4415a()) {
            List listM4821c = c1748l.m4821c(C1831z4.f4063v4);
            int[] iArr = new int[listM4821c.size()];
            for (int i = 0; i < listM4821c.size(); i++) {
                try {
                    iArr[i] = Integer.parseInt((String) listM4821c.get(i));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(C1748l.m4756p().getCacheDir(), "al-reports");
            if (file.exists()) {
                m4414a(file, c1748l);
            } else if (!file.mkdir()) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5174b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = f2861d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) c1748l.m4801a(C1831z4.f4071w4)).booleanValue());
                if (((Boolean) c1748l.m4801a(C1831z4.f4079x4)).booleanValue()) {
                    c1748l.m4832h().m4591a((C1739c.a) nativeCrashReporter2);
                }
            } catch (Throwable th2) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                c1748l.m4764E().m4329a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00a6, please report this as an issue */
    /* JADX INFO: renamed from: a */
    private static void m4414a(File file, C1748l c1748l) throws Throwable {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            String strM4986f = c1748l.m4771I().m4986f(file2);
            if (StringUtils.isValidString(strM4986f)) {
                String[] strArrSplit = strM4986f.split("@@@@@");
                if (strArrSplit.length == 3) {
                    try {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[1];
                        JSONArray jSONArray = new JSONArray(strArrSplit[2]);
                        if (jSONArray.length() == 0) {
                            c1748l.m4764E().m2678a(C1548f2.f1522c1, str2, CollectionUtils.hashMap("error_message", str));
                        } else {
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
                                if (jSONObject != null) {
                                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
                                    mapHashMap.put("source", str2);
                                    mapHashMap.putAll(JsonUtils.toStringMap(jSONObject));
                                    arrayList.add(mapHashMap);
                                }
                            }
                            c1748l.m4764E().m2680a(C1548f2.f1522c1, arrayList, 0L);
                        }
                    } catch (Throwable th) {
                        c1748l.m4782Q();
                        if (C1768p.m5160a()) {
                            c1748l.m4782Q().m5172a("NativeCrashReporter", "Failed to symbolicate native crash report", th);
                        }
                    }
                } else {
                    c1748l.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l.m4782Q().m5174b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                    }
                }
            } else {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5174b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
                }
            }
            try {
                if (!file2.delete()) {
                    c1748l.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l.m4782Q().m5174b("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath());
                    }
                }
            } catch (Throwable th2) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath(), th2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4415a() {
        if (!f2859b) {
            f2859b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f2860c = true;
            } catch (Throwable th) {
                C1768p.m5162b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return f2860c;
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z);

    private native void updateAdInfo(String str);

    @Override // com.applovin.impl.sdk.C1739c.a
    /* JADX INFO: renamed from: a */
    public void mo4416a(List list) {
        try {
            updateAdInfo(new JSONArray((Collection) list).toString());
        } catch (Throwable unused) {
        }
    }
}
