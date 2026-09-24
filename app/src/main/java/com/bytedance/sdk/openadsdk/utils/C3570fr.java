package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.component.utils.C2728su;
import com.ironsource.C11676T3;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.fr */
/* JADX INFO: loaded from: classes3.dex */
public class C3570fr {
    /* JADX INFO: renamed from: ri */
    public static String m16421ri(Context context) {
        int iM10293ri = C2728su.m10293ri(context, 0L);
        if (iM10293ri == 2) {
            return "2g";
        }
        if (iM10293ri == 3) {
            return C11676T3.f25718a;
        }
        if (iM10293ri == 4) {
            return C11676T3.f25719b;
        }
        if (iM10293ri != 5) {
            return iM10293ri != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}
