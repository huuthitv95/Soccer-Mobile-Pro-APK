package com.bytedance.adsdk.p065lr;

import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C2012ac {

    /* JADX INFO: renamed from: lr */
    private boolean f4665lr;

    /* JADX INFO: renamed from: ri */
    private final Map<String, String> f4666ri;

    /* JADX INFO: renamed from: lr */
    public final String m6451lr(String str, String str2) {
        if (this.f4665lr && this.f4666ri.containsKey(str2)) {
            return this.f4666ri.get(str2);
        }
        String strM6453ri = m6453ri(str, str2);
        if (this.f4665lr) {
            this.f4666ri.put(str2, strM6453ri);
        }
        return strM6453ri;
    }

    /* JADX INFO: renamed from: ri */
    public String m6452ri(String str) {
        return str;
    }

    /* JADX INFO: renamed from: ri */
    public String m6453ri(String str, String str2) {
        return m6452ri(str2);
    }
}
