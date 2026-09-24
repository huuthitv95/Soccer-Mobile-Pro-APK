package com.bytedance.sdk.component.adexpress.p124ka;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.C2490ka;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ka.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2492fi {
    /* JADX INFO: renamed from: ri */
    public static boolean m8814ri(String str) {
        if (C2490ka.m8810lr()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
