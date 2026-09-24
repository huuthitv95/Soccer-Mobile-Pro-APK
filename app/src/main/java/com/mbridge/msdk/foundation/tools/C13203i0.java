package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;
import com.mbridge.msdk.foundation.controller.C13008c;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.i0 */
/* JADX INFO: compiled from: ResourceUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13203i0 {
    /* JADX INFO: renamed from: a */
    public static int m37707a(Context context, String str, String str2) {
        String packageName = "";
        try {
            try {
                packageName = C13008c.m36588n().m36550i();
            } catch (Exception unused) {
                C13219q0.m37816b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (C13182a1.m37596a(packageName) && context != null) {
                packageName = context.getPackageName();
            }
            if (C13182a1.m37596a(packageName) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, packageName);
        } catch (Exception unused2) {
            C13219q0.m37816b("ResourceUtil", "Resource not found resName:" + str);
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37709a(int i) {
        return (i == -1 || ((-16777216) & i) == 0 || (i & 16711680) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static Resources m37708a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e) {
                C13219q0.m37816b("ResourceUtil", "Resource error:" + e.getMessage());
            }
        }
        return null;
    }
}
