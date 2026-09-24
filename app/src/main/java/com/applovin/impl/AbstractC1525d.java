package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.applovin.adview.AppLovinFullscreenActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1525d {

    /* JADX INFO: renamed from: com.applovin.impl.d$a */
    class a extends AbstractC1505b {

        /* JADX INFO: renamed from: a */
        private WeakReference f1303a = new WeakReference(null);

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Class f1304b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ b f1305c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C1515c f1306d;

        a(Class cls, b bVar, C1515c c1515c) {
            this.f1304b = cls;
            this.f1305c = bVar;
            this.f1306d = c1515c;
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f1304b.isInstance(activity) && this.f1303a.get() == null) {
                this.f1303a = new WeakReference(activity);
                this.f1305c.mo2130a(activity);
            }
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1304b.isInstance(activity) && !activity.isChangingConfigurations() && this.f1303a.get() == activity) {
                this.f1306d.m2146b(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2130a(Activity activity);
    }

    /* JADX INFO: renamed from: a */
    public static Activity m2242a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m2243a(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        ComponentName componentName;
        if (!AbstractC1677p0.m3813g()) {
            return null;
        }
        try {
            List<ActivityManager.AppTask> appTasks = ((ActivityManager) appLovinFullscreenActivity.getSystemService("activity")).getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                while (it.hasNext()) {
                    ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                    ComponentName componentName2 = taskInfo.topActivity;
                    String name = appLovinFullscreenActivity.getClass().getName();
                    if (componentName2 != null && componentName2.getClassName().equals(name) && (componentName = taskInfo.baseActivity) != null) {
                        return appLovinFullscreenActivity.getPackageManager().getActivityInfo(componentName, 0).taskAffinity;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m2244a(Activity activity) {
        WindowInsetsController insetsController;
        if (!AbstractC1677p0.m3804b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 4866);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.navigationBars());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2245a(Context context, Class cls) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public static void m2246a(Context context, Class cls, C1515c c1515c, b bVar) {
        c1515c.m2144a(new a(cls, bVar, c1515c));
        m2245a(context, cls);
    }

    /* JADX INFO: renamed from: b */
    public static String m2247b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        try {
            return appLovinFullscreenActivity.getPackageManager().getActivityInfo(new ComponentName(appLovinFullscreenActivity, appLovinFullscreenActivity.getClass()), 0).taskAffinity;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2248b(Activity activity) {
        WindowInsetsController insetsController;
        if (!AbstractC1677p0.m3804b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 5380);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.statusBars());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2249c(Activity activity) {
        if (!AbstractC1677p0.m3804b()) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        WindowInsetsController insetsController = activity.getWindow().getInsetsController();
        if (insetsController == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsets.Type.systemBars());
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2250d(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed();
    }

    /* JADX INFO: renamed from: e */
    public static void m2251e(Activity activity) {
        WindowInsetsController insetsController;
        if (!AbstractC1677p0.m3804b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() & (-4611));
        } else {
            insetsController.show(WindowInsets.Type.navigationBars());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2252f(Activity activity) {
        WindowInsetsController insetsController;
        if (!AbstractC1677p0.m3804b() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() & (-5125));
        } else {
            insetsController.show(WindowInsets.Type.statusBars());
        }
    }
}
