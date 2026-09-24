package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2232ka {

    /* JADX INFO: renamed from: ri */
    private static Map<String, C2233lr> f5515ri = new HashMap();

    /* JADX INFO: renamed from: ri */
    public static C2233lr m7359ri(String str) {
        return f5515ri.get(str);
    }

    /* JADX INFO: renamed from: ri */
    public static void m7360ri(List<C2233lr> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C2233lr c2233lr : list) {
            if (c2233lr != null) {
                f5515ri.put(c2233lr.m7362ri(), c2233lr);
            }
        }
    }
}
