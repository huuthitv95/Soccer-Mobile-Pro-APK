package com.bytedance.sdk.openadsdk.core.p225ri;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import com.bytedance.sdk.component.utils.C2707ac;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3310ri {

    /* JADX INFO: renamed from: lr */
    private static Boolean f11558lr;

    /* JADX INFO: renamed from: ri */
    private static String f11559ri;

    /* JADX INFO: renamed from: lr */
    public static int m14751lr(Context context) {
        try {
            return !TextUtils.isEmpty(m14753ri(context)) ? 1 : 0;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static int m14752ri() {
        Boolean bool = f11558lr;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ri */
    public static String m14753ri(Context context) {
        String str = f11559ri;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                f11559ri = null;
            } else if (TextUtils.isEmpty(str2) || m14755ri(context, intent) || !arrayList.contains(str2)) {
                f11559ri = (String) arrayList.get(0);
            } else {
                f11559ri = str2;
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("CustomTabsHelper", th.getMessage());
        }
        return f11559ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m14754ri(Context context, String str, CustomTabsIntent customTabsIntent, Uri uri) {
        customTabsIntent.intent.setPackage(str);
        customTabsIntent.launchUrl(context, uri);
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m14755ri(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        return false;
    }
}
