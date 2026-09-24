package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2714co {

    /* JADX INFO: renamed from: ri */
    private static Context f7757ri;

    /* JADX INFO: renamed from: lr */
    private static Configuration m10213lr(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10214ri(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            f7757ri = context.createConfigurationContext(m10213lr(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        C2729uq.m10312ri(f7757ri);
    }
}
