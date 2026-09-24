package com.bytedance.adsdk.ugeno.p101ka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2292ka {

    /* JADX INFO: renamed from: ri */
    private static Map<String, C2303lr> f5801ri = new HashMap();

    /* JADX INFO: renamed from: ri */
    public static C2303lr m7774ri(String str) {
        return f5801ri.get(str);
    }

    /* JADX INFO: renamed from: ri */
    public static void m7775ri(List<C2303lr> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C2303lr c2303lr : list) {
            if (c2303lr != null) {
                f5801ri.put(c2303lr.m7796ri(), c2303lr);
            }
        }
    }
}
