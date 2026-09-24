package com.chartboost.sdk.impl;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w3 */
/* JADX INFO: loaded from: classes3.dex */
public class C4128w3 {
    /* JADX INFO: renamed from: a */
    public C4106v3 m19742a(Context context) {
        String strSubstring;
        String strSubstring2;
        if (m19745c(context)) {
            C4048sb.m19407a("Permission READ_PHONE_STATE not granted", null);
            return null;
        }
        TelephonyManager telephonyManagerM19744b = m19744b(context);
        if (!m19743a(telephonyManagerM19744b)) {
            return null;
        }
        String simOperator = telephonyManagerM19744b.getSimOperator();
        if (TextUtils.isEmpty(simOperator)) {
            strSubstring = null;
            strSubstring2 = null;
        } else {
            strSubstring = simOperator.substring(0, 3);
            strSubstring2 = simOperator.substring(3);
        }
        return new C4106v3(simOperator, strSubstring, strSubstring2, telephonyManagerM19744b.getNetworkOperatorName(), telephonyManagerM19744b.getNetworkCountryIso(), telephonyManagerM19744b.getPhoneType());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19743a(TelephonyManager telephonyManager) {
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() != 5) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final TelephonyManager m19744b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (TelephonyManager) context.getSystemService("phone");
        } catch (Exception e) {
            C4048sb.m19410b("Unable to retrieve TELEPHONY_SERVICE", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19745c(Context context) {
        return context != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == -1;
    }
}
