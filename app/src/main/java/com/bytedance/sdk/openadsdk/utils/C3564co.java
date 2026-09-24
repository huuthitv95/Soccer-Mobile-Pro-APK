package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.co */
/* JADX INFO: loaded from: classes3.dex */
public class C3564co {
    /* JADX INFO: renamed from: lr */
    private static String m16377lr(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return C3535ri.m16058lr((String) null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m16378ri() {
        return m16377lr("any_door_id", null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16379ri(String str) {
        m16380ri("any_door_id", str);
    }

    /* JADX INFO: renamed from: ri */
    private static void m16380ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C3535ri.m16077ri((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
