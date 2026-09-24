package com.fyber.inneractive.sdk.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.cellular.C7951a;
import com.ironsource.C11676T3;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.a1 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC9134a1 {
    UNKNOWN(""),
    ETHERNET(C11676T3.f25718a),
    WIFI(C11676T3.f25719b),
    MOBILE_3G(C11676T3.f25718a),
    MOBILE_4G("4g"),
    MOBILE_5G("5g"),
    CELLULAR("Cellular");

    final String key;

    EnumC9134a1(String str) {
        this.key = str;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x006e  */
    /* JADX INFO: renamed from: a */
    public static EnumC9134a1 m21954a() {
        int type;
        EnumC9134a1 enumC9134a1;
        NetworkInfo activeNetworkInfo;
        try {
            type = (!AbstractC9174o.m21996a("android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = ((ConnectivityManager) AbstractC9174o.f21470a.getSystemService("connectivity")).getActiveNetworkInfo()) == null) ? 8 : activeNetworkInfo.getType();
        } catch (Exception unused) {
        }
        if (type == 9) {
            return ETHERNET;
        }
        if (type != 0) {
            if (type == 1) {
                return WIFI;
            }
            if (type != 2 && type != 3 && type != 4 && type != 5) {
                return UNKNOWN;
            }
        }
        C7951a c7951a = IAConfigManager.f17654M.f17668L;
        if (c7951a == null || c7951a.f17701a == null) {
            int iM21975k = AbstractC9162k.m21975k();
            if (iM21975k == 0) {
                enumC9134a1 = UNKNOWN;
            } else if (iM21975k == 3) {
                enumC9134a1 = MOBILE_3G;
            } else if (iM21975k == 18) {
                enumC9134a1 = WIFI;
            } else if (iM21975k == 20) {
                enumC9134a1 = MOBILE_5G;
            } else if (iM21975k != 5 && iM21975k != 6) {
                switch (iM21975k) {
                    default:
                        switch (iM21975k) {
                            case 12:
                            case 14:
                            case 15:
                                break;
                            case 13:
                                enumC9134a1 = MOBILE_4G;
                                break;
                            default:
                                enumC9134a1 = CELLULAR;
                                break;
                        }
                    case 8:
                    case 9:
                    case 10:
                        enumC9134a1 = MOBILE_3G;
                        break;
                }
            } else {
                enumC9134a1 = MOBILE_3G;
            }
        } else {
            enumC9134a1 = c7951a.f17702b;
        }
        if (enumC9134a1 == UNKNOWN) {
            return AbstractC9162k.m21975k() == 13 ? MOBILE_4G : MOBILE_3G;
        }
        return enumC9134a1;
    }

    /* JADX INFO: renamed from: b */
    public final String m21955b() {
        return this.key;
    }
}
