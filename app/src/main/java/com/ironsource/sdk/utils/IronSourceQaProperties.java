package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a */
    private static IronSourceQaProperties f32393a;

    /* JADX INFO: renamed from: b */
    private static Map<String, String> f32394b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f32393a == null) {
            f32393a = new IronSourceQaProperties();
        }
        return f32393a;
    }

    public static boolean isInitialized() {
        return f32393a != null;
    }

    public Map<String, String> getParameters() {
        return f32394b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f32394b.put(str, str2);
    }
}
