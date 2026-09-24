package com.pgl.ssdk;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.pgl.ssdk.ces.C14271a;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.pgl.ssdk.ab */
/* JADX INFO: loaded from: classes7.dex */
public class C14244ab {

    /* JADX INFO: renamed from: a */
    private static int f41220a = -1;

    /* JADX INFO: renamed from: b */
    private static int f41221b = -1;

    /* JADX INFO: renamed from: a */
    public static Application m42806a() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m42807a(Context context, int i, String str) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str));
        return context.createConfigurationContext(configuration).getResources().getString(i);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m42808a(Context context) {
        List<ActivityManager.AppTask> appTasks;
        if (context != null && (appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks()) != null && !appTasks.isEmpty()) {
            for (ActivityManager.AppTask appTask : appTasks) {
                if (appTask.getTaskInfo() != null && m42809a(appTask.getTaskInfo().baseIntent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m42809a(Intent intent) {
        return (intent == null || (intent.getFlags() & 8388608) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m42810b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m42811b(Context context) {
        try {
            if (f41220a == -1 || f41221b == -1) {
                m42823l(context);
            }
            if (m42808a(context)) {
                f41220a++;
            }
            f41221b++;
            if (f41220a != 0) {
                m42824m(context);
                C14271a.meta(160, null, new int[]{f41220a, f41221b});
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m42812c() {
        String path;
        try {
            path = Environment.getDataDirectory().getPath();
        } catch (Throwable unused) {
            path = null;
        }
        return path == null ? "" : path.trim();
    }

    /* JADX INFO: renamed from: c */
    public static String m42813c(Context context) {
        String str;
        try {
            str = context.getApplicationInfo().sourceDir;
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* JADX INFO: renamed from: d */
    public static String m42814d() {
        String absolutePath;
        try {
            absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Throwable unused) {
            absolutePath = null;
        }
        return absolutePath == null ? "" : absolutePath.trim();
    }

    /* JADX INFO: renamed from: d */
    public static String m42815d(Context context) {
        try {
            return m42807a(context, context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).labelRes, "en");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m42816e(Context context) {
        String absolutePath;
        try {
            absolutePath = context.getFilesDir().getAbsolutePath();
        } catch (Throwable unused) {
            absolutePath = null;
        }
        return absolutePath == null ? "" : absolutePath.trim();
    }

    /* JADX INFO: renamed from: f */
    public static String m42817f(Context context) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = null;
        }
        return packageName == null ? "" : packageName.trim();
    }

    /* JADX INFO: renamed from: g */
    public static String m42818g(Context context) {
        String packageResourcePath;
        try {
            packageResourcePath = context.getPackageResourcePath();
        } catch (Throwable unused) {
            packageResourcePath = null;
        }
        return packageResourcePath == null ? "" : packageResourcePath.trim();
    }

    /* JADX INFO: renamed from: h */
    public static int m42819h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m42820i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m42821j(Context context) {
        ResolveInfo resolveInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty() || (resolveInfo = listQueryIntentActivities.get(0)) == null) {
                return false;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(activityInfo.packageName, activityInfo.name));
            return componentEnabledSetting == 0 || componentEnabledSetting == 1;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static int m42822k(Context context) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.net.VpnService");
        intent.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 128).iterator();
        while (it.hasNext()) {
            if (it.next().serviceInfo.packageName.equals(packageName)) {
                i = 1;
                if (i != 1) {
                    return -1;
                }
                return i;
            }
        }
        i = 999999;
        if (i != 1) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    private static void m42823l(Context context) {
        String strM43026a = C14266ax.m43026a(context, "hac_date", (String) null);
        if (!TextUtils.isEmpty(strM43026a)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            if (strM43026a.equals(simpleDateFormat.format(new Date()))) {
                int iM43022a = C14266ax.m43022a(context, "hac", -1);
                int iM43022a2 = C14266ax.m43022a(context, "tac", -1);
                if (iM43022a != -1 && iM43022a2 != -1) {
                    f41220a = iM43022a;
                    f41221b = iM43022a2;
                    return;
                }
            }
        }
        f41220a = 0;
        f41221b = 0;
    }

    /* JADX INFO: renamed from: m */
    private static void m42824m(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        C14266ax.m43029b(context, "hac_date", simpleDateFormat.format(new Date()));
        C14266ax.m43027b(context, "hac", f41220a);
        C14266ax.m43027b(context, "tac", f41221b);
    }
}
