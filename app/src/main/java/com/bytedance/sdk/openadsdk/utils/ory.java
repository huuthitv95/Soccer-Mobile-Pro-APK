package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.ironsource.C12434q2;
import com.ironsource.mediationsdk.C12333d;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ory {
    /* JADX INFO: renamed from: ri */
    public static void m16564ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, Double d) {
        if (wjvVar == null || wjvVar.iyl() == null) {
            return;
        }
        Map<String, Object> mapIyl = wjvVar.iyl();
        try {
            Object obj = wjvVar.iyl().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapIyl.get(C12434q2.f31742A);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                }
                C3299nr.m14638ik().mo12640ri(strReplace);
            }
        } catch (Throwable unused) {
            C2707ac.m10197ik("report Win error", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16565ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, Double d, String str, String str2) {
        if (wjvVar == null || wjvVar.iyl() == null) {
            return;
        }
        Map<String, Object> mapIyl = wjvVar.iyl();
        try {
            Object obj = wjvVar.iyl().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapIyl.get(C12434q2.f31754z);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace(C12333d.f31050n, String.valueOf(d));
                }
                if (str != null) {
                    strReplace = strReplace.replace(C12333d.f31048l, str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                C3299nr.m14638ik().mo12640ri(strReplace);
            }
        } catch (Throwable unused) {
            C2707ac.m10197ik("report Loss error", new Object[0]);
        }
    }
}
