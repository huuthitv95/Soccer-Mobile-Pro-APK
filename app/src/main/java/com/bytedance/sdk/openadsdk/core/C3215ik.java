package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3215ik {

    /* JADX INFO: renamed from: ri */
    private static volatile C3215ik f10658ri;

    private C3215ik() {
    }

    /* JADX INFO: renamed from: ri */
    public static C3215ik m13505ri() {
        if (f10658ri == null) {
            synchronized (C3215ik.class) {
                if (f10658ri == null) {
                    f10658ri = new C3215ik();
                }
            }
        }
        return f10658ri;
    }

    /* JADX INFO: renamed from: lr */
    public int m13506lr(String str, int i) {
        return C3535ri.m16063ri("ttopenadsdk", str, i);
    }

    /* JADX INFO: renamed from: lr */
    public Long m13507lr(String str, long j) {
        return Long.valueOf(C3535ri.m16065ri("ttopenadsdk", str, j));
    }

    /* JADX INFO: renamed from: lr */
    public String m13508lr(String str, String str2) {
        return C3535ri.m16058lr("ttopenadsdk", str, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m13509ri(String str) {
        C3535ri.m16072ri("ttopenadsdk", str);
    }

    /* JADX INFO: renamed from: ri */
    public void m13510ri(String str, int i) {
        C3535ri.m16074ri("ttopenadsdk", str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ri */
    public void m13511ri(String str, long j) {
        C3535ri.m16075ri("ttopenadsdk", str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ri */
    public void m13512ri(String str, String str2) {
        C3535ri.m16077ri("ttopenadsdk", str, str2);
    }
}
