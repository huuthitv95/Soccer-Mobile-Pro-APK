package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.applovin.impl.j8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1594j8 {

    /* JADX INFO: renamed from: f */
    private static final Set f1908f = new HashSet();

    /* JADX INFO: renamed from: a */
    private final boolean f1909a;

    /* JADX INFO: renamed from: b */
    private final C1748l f1910b;

    /* JADX INFO: renamed from: c */
    private Runnable f1911c;

    /* JADX INFO: renamed from: d */
    private final Object f1912d = new Object();

    /* JADX INFO: renamed from: e */
    private final Timer f1913e;

    /* JADX INFO: renamed from: com.applovin.impl.j8$a */
    class a extends TimerTask {

        /* JADX INFO: renamed from: com.applovin.impl.j8$a$a, reason: collision with other inner class name */
        class C15438a implements AppLovinBroadcastManager.Receiver {
            C15438a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                C1594j8.this.m3031c();
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!C1594j8.this.f1910b.m4846o0().isApplicationPaused() || C1594j8.this.f1909a) {
                C1594j8.this.m3031c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C15438a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private C1594j8(long j, boolean z, C1748l c1748l, Runnable runnable) {
        Timer timer = new Timer();
        this.f1913e = timer;
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j);
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f1909a = z;
        this.f1910b = c1748l;
        this.f1911c = runnable;
        f1908f.add(this);
        timer.schedule(m3029b(), j);
    }

    /* JADX INFO: renamed from: a */
    public static C1594j8 m3027a(long j, boolean z, C1748l c1748l, Runnable runnable) {
        return new C1594j8(j, z, c1748l, runnable);
    }

    /* JADX INFO: renamed from: b */
    private TimerTask m3029b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m3031c() {
        Runnable runnable = this.f1911c;
        if (runnable != null) {
            runnable.run();
            m3033a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3033a() {
        synchronized (this.f1912d) {
            this.f1913e.cancel();
            this.f1911c = null;
            f1908f.remove(this);
        }
    }
}
