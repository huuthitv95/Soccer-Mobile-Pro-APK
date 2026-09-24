package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.pgl.ssdk.u */
/* JADX INFO: loaded from: classes7.dex */
public class C14291u {

    /* JADX INFO: renamed from: a */
    private static AccessibilityManager f41342a;

    /* JADX INFO: renamed from: a */
    private static AccessibilityManager m43115a(Context context) {
        if (f41342a == null) {
            f41342a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        return f41342a;
    }

    /* JADX INFO: renamed from: b */
    public static String m43116b(Context context) {
        AccessibilityManager accessibilityManagerM43115a;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (accessibilityManagerM43115a = m43115a(context)) == null || (enabledAccessibilityServiceList = accessibilityManagerM43115a.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < enabledAccessibilityServiceList.size(); i++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(i);
            if (accessibilityServiceInfo != null) {
                String str = String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name);
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ",", (Iterable) arrayList);
    }
}
