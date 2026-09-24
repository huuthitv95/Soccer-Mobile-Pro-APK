package com.bytedance.sdk.openadsdk.core.p226sf.p227ri;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.ironsource.C11744X3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sf.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3327lr {

    /* JADX INFO: renamed from: ri */
    private static volatile C3327lr f11667ri;

    /* JADX INFO: renamed from: lr */
    private final ArrayList<String> f11672lr = new ArrayList<>();

    /* JADX INFO: renamed from: ik */
    private final AtomicBoolean f11670ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ka */
    private long f11671ka = System.currentTimeMillis();

    /* JADX INFO: renamed from: fi */
    private long f11669fi = 0;

    /* JADX INFO: renamed from: di */
    private long f11668di = 0;
    private String xha = "";

    /* JADX INFO: renamed from: mj */
    private String f11673mj = "";
    private String jbs = "";

    /* JADX INFO: renamed from: qt */
    private boolean f11674qt = false;

    /* JADX INFO: renamed from: sf */
    private boolean f11675sf = false;

    /* JADX INFO: renamed from: ri */
    private static int m14950ri(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3327lr m14951ri(Application application) {
        if (f11667ri == null) {
            synchronized (C3327lr.class) {
                if (f11667ri == null) {
                    C3327lr c3327lr = new C3327lr();
                    f11667ri = c3327lr;
                    c3327lr.f11674qt = m14953ri((Context) application);
                    f11667ri.f11675sf = m14950ri(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    f11667ri.m14952ri();
                }
            }
        }
        return f11667ri;
    }

    /* JADX INFO: renamed from: ri */
    private void m14952ri() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(C11744X3.i.f26369h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object objValueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.f11672lr.contains(localClassName)) {
                            this.f11672lr.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.f11670ik;
                if (this.f11672lr.size() > 0) {
                    z = false;
                }
                atomicBoolean.set(z);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m14953ri(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: lr */
    public void m14954lr(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f11672lr.contains(localClassName)) {
            this.f11672lr.remove(localClassName);
        }
        if (this.f11672lr.size() == 0) {
            this.f11671ka = System.currentTimeMillis();
            this.f11670ik.set(true);
            this.f11673mj = localClassName;
        }
    }

    /* JADX INFO: renamed from: ri */
    public String m14955ri(String str, long j, int i) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.f11669fi;
        long j3 = jCurrentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.f11670ik.get() && this.f11675sf) {
            i2 |= 2;
        }
        if (!this.f11670ik.get() && this.f11668di >= 5000 && j2 < 1000) {
            i2 = this.f11673mj.equals(this.jbs) ? i2 | 4 : i2 | 8;
        }
        try {
            string = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.f11668di).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.f11670ik).put("alert", this.f11675sf).put(NotificationCompat.CATEGORY_SYSTEM, this.f11674qt).put("actsize", this.f11672lr.size()).put("mutiproc", true ^ ihz.m10229ri(C3299nr.m14642ri())).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.xha = "";
        this.f11668di = 0L;
        this.f11669fi = 0L;
        this.f11671ka = System.currentTimeMillis();
        return string;
    }

    /* JADX INFO: renamed from: ri */
    public void m14956ri(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f11672lr.size() == 0) {
            this.xha = localClassName;
            this.f11669fi = System.currentTimeMillis();
            this.f11668di = System.currentTimeMillis() - this.f11671ka;
            this.f11670ik.set(false);
        }
        if (!this.f11672lr.contains(localClassName)) {
            this.f11672lr.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.jbs = localClassName;
    }
}
