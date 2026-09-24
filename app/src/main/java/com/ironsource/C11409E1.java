package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.E1 */
/* JADX INFO: loaded from: classes6.dex */
public class C11409E1 {
    /* JADX INFO: renamed from: a */
    public static int m25642a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    /* JADX INFO: renamed from: b */
    public static String m25647b(Context context) {
        try {
            return m25643a(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m25649c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m25652d(Context context, String str) {
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    boolean zEquals = false;
                    while (true) {
                        try {
                            String[] strArr = packageInfo.requestedPermissions;
                            if (i >= strArr.length || zEquals) {
                                break;
                            }
                            zEquals = str.equals(strArr[i]);
                            i++;
                        } catch (Exception e) {
                            e = e;
                            z = zEquals;
                            C12317m4.m32153d().m32155a(e);
                            IronLog.INTERNAL.error(e.toString());
                            return z;
                        }
                    }
                    return zEquals;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static String m25653e(Context context) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            installerPackageName = null;
        }
        return TextUtils.isEmpty(installerPackageName) ? "" : installerPackageName;
    }

    /* JADX INFO: renamed from: f */
    public static long m25654f(Context context) {
        try {
            return m25643a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m25655g(Context context) {
        return context.getPackageName();
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m25645a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                    i++;
                }
            } else {
                List listAsList = Arrays.asList(packageInfo.requestedPermissions);
                while (i < jSONArray.length()) {
                    String string = jSONArray.getString(i);
                    int iIndexOf = listAsList.indexOf(string);
                    if (iIndexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[iIndexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m25650c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static String m25648b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m25651d(Context context) {
        try {
            return m25643a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    static PackageInfo m25643a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(m25655g(context), 0);
    }

    /* JADX INFO: renamed from: a */
    public static String m25644a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m25646a() {
        try {
            Class.forName("kotlin.jvm.internal.Intrinsics");
            return true;
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            Log.d("ApplicationContext", "Kotlin Intrinsics not found");
            return false;
        }
    }
}
