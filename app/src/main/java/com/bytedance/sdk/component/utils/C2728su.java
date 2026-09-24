package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.C2683ri;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.su */
/* JADX INFO: loaded from: classes3.dex */
public class C2728su {

    /* JADX INFO: renamed from: ri */
    private static final Object f7786ri = new Object();

    /* JADX INFO: renamed from: lr */
    private static final Map<ri, Object> f7784lr = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ik */
    private static final AtomicInteger f7782ik = new AtomicInteger();

    /* JADX INFO: renamed from: ka */
    private static AtomicBoolean f7783ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fi */
    private static volatile int f7781fi = -1;

    /* JADX INFO: renamed from: di */
    private static volatile long f7780di = 0;
    private static volatile int xha = 60000;

    /* JADX INFO: renamed from: mj */
    private static tan f7785mj = null;
    private static final AtomicBoolean jbs = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.su$lr */
    private static class lr extends BroadcastReceiver {
        private lr() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                C2728su.m10290lr(context, intent, C2728su.f7782ik.get() > 0, false);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.su$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo10299ri(Context context, Intent intent, boolean z, int i);
    }

    /* JADX INFO: renamed from: ik */
    private static int m10285ik(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        tan tanVar = f7785mj;
                        return (tanVar == null || !tanVar.m10300ri(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static int m10288lr(Context context) {
        f7781fi = m10285ik(context);
        f7780di = SystemClock.elapsedRealtime();
        return f7781fi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m10289lr(Context context, Intent intent, int i, boolean z) {
        Map<ri, Object> map = f7784lr;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (ri riVar : map.keySet()) {
            if (riVar != null) {
                try {
                    riVar.mo10299ri(context, intent, !z, i);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m10290lr(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            f7781fi = 0;
        } else if (jbs.compareAndSet(false, true)) {
            C2683ri.m10083ri(new Runnable() { // from class: com.bytedance.sdk.component.utils.su.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = C2728su.f7781fi = z2 ? 0 : C2728su.m10288lr(context);
                    C2728su.jbs.set(false);
                    boolean z3 = C2728su.f7781fi == 0;
                    boolean z4 = z;
                    if ((z4 || !z3) && z4) {
                        C2728su.m10289lr(context, intent, C2728su.f7781fi, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public static int m10293ri(Context context, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (f7780di + j > jElapsedRealtime && f7781fi != -1) {
            if (jElapsedRealtime - f7780di >= xha) {
                m10290lr(context, (Intent) null, false, false);
            }
            return f7781fi;
        }
        return m10288lr(context);
    }

    /* JADX INFO: renamed from: ri */
    public static void m10297ri(ri riVar) {
        if (riVar == null) {
            return;
        }
        Map<ri, Object> map = f7784lr;
        map.remove(riVar);
        f7782ik.set(map.size());
    }

    /* JADX INFO: renamed from: ri */
    public static void m10298ri(ri riVar, Context context) {
        if (riVar == null) {
            return;
        }
        if (!f7783ka.get()) {
            try {
                context.registerReceiver(new lr(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                f7783ka.set(true);
            } catch (Throwable unused) {
            }
        }
        Map<ri, Object> map = f7784lr;
        map.put(riVar, f7786ri);
        f7782ik.set(map.size());
    }
}
