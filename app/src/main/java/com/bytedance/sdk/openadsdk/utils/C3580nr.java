package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C3580nr {
    /* JADX INFO: renamed from: lr */
    private static List<String> m16558lr() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16559ri() {
        Context contextM14642ri = C3299nr.m14642ri();
        if (contextM14642ri != null && C2730vr.m10314ik()) {
            String packageName = contextM14642ri.getPackageName();
            int i = contextM14642ri.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextM14642ri.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listM16558lr = m16558lr();
                for (String str : strArr) {
                    if (str != null) {
                        listM16558lr.remove(str);
                    }
                }
                if (listM16558lr.isEmpty()) {
                    return;
                }
                for (String str2 : listM16558lr) {
                }
            } catch (Throwable unused) {
            }
        }
    }
}
