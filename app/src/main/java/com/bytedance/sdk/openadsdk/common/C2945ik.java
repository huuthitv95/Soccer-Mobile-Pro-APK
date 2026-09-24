package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2720ik;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2945ik {

    /* JADX INFO: renamed from: ri */
    private static String f8840ri;

    /* JADX INFO: renamed from: di */
    public static String m11347di() {
        return C2724nr.xha(C3299nr.m14642ri());
    }

    /* JADX INFO: renamed from: fi */
    public static String m11348fi() {
        return C3304qt.m14669lr().m14693mj();
    }

    /* JADX INFO: renamed from: ik */
    public static String m11349ik() {
        return BuildConfig.VERSION_NAME;
    }

    /* JADX INFO: renamed from: ka */
    public static String m11350ka() {
        return C3571ig.m16461mj();
    }

    /* JADX INFO: renamed from: lr */
    public static String m11351lr() {
        return "1371";
    }

    /* JADX INFO: renamed from: ri */
    public static String m11352ri() {
        return "open_news";
    }

    /* JADX INFO: renamed from: ri */
    public static String m11353ri(Context context) {
        return C3089aw.m12377ri(context);
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m11354ri(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(CertificateUtil.DELIMITER)) != null && strArrSplit.length >= 20) {
            for (String str2 : strArrSplit) {
                if (!"00".equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String xha() {
        try {
            if (!TextUtils.isEmpty(f8840ri)) {
                return f8840ri;
            }
            String strM14673ri = C3304qt.m14673ri("sdk_app_sha1", 259200000L);
            f8840ri = strM14673ri;
            if (m11354ri(strM14673ri)) {
                return f8840ri;
            }
            String strM10231ri = C2720ik.m10231ri(C3299nr.m14642ri());
            f8840ri = strM10231ri;
            if (m11354ri(strM10231ri)) {
                String upperCase = f8840ri.toUpperCase();
                f8840ri = upperCase;
                C3304qt.m14677ri("sdk_app_sha1", upperCase);
                return f8840ri;
            }
            return "";
        } catch (Exception unused) {
        }
    }
}
