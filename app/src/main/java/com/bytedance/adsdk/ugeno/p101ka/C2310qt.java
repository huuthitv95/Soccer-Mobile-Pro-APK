package com.bytedance.adsdk.ugeno.p101ka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2310qt {

    /* JADX INFO: renamed from: ri */
    private static Map<String, xha> f5841ri = new HashMap();

    /* JADX INFO: renamed from: ri */
    public static xha m7804ri(String str) {
        return f5841ri.get(str);
    }

    /* JADX INFO: renamed from: ri */
    public static void m7805ri(List<xha> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (xha xhaVar : list) {
            if (xhaVar != null) {
                f5841ri.put(xhaVar.m7811ri(), xhaVar);
            }
        }
    }
}
