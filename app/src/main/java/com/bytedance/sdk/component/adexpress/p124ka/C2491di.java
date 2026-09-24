package com.bytedance.sdk.component.adexpress.p124ka;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.C2490ka;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ka.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2491di {
    /* JADX INFO: renamed from: lr */
    public static boolean m8812lr(String str) {
        return C2490ka.m8810lr() && m8813ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m8813ri(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }
}
