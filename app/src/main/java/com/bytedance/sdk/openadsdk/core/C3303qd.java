package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.qd */
/* JADX INFO: loaded from: classes3.dex */
public class C3303qd {

    /* JADX INFO: renamed from: ri */
    private static volatile C3303qd f11511ri;

    /* JADX INFO: renamed from: lr */
    private Map<String, Map<String, String>> f11512lr = new ConcurrentHashMap();

    private C3303qd() {
    }

    /* JADX INFO: renamed from: ri */
    public static C3303qd m14658ri() {
        if (f11511ri == null) {
            synchronized (C3303qd.class) {
                if (f11511ri == null) {
                    f11511ri = new C3303qd();
                }
            }
        }
        return f11511ri;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m14659ik(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f11512lr;
        if (map2 == null || !map2.containsKey(str) || (map = this.f11512lr.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m14660lr(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f11512lr;
        if (map2 == null || !map2.containsKey(str) || (map = this.f11512lr.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    /* JADX INFO: renamed from: ri */
    public String m14661ri(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.f11512lr;
        if (map2 == null || !map2.containsKey(str) || (map = this.f11512lr.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m14662ri(String str) {
        Map<String, Map<String, String>> map = this.f11512lr;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.f11512lr.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.f11512lr.remove(str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14663ri(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.f11512lr;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.f11512lr.put(str, concurrentHashMap);
    }
}
