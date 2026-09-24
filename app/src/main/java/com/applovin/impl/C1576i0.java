package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.i0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1576i0 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: c */
    private static final Set f1801c = new HashSet();

    /* JADX INFO: renamed from: a */
    private final C1593j7 f1802a;

    /* JADX INFO: renamed from: b */
    private final C1748l f1803b;

    private C1576i0(long j, final boolean z, C1748l c1748l, final Runnable runnable) {
        this.f1802a = C1593j7.m3013a(j, z, c1748l, new Runnable() { // from class: com.applovin.impl.i0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2853a(z, runnable);
            }
        });
        this.f1803b = c1748l;
        f1801c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* JADX INFO: renamed from: a */
    public static C1576i0 m2851a(long j, C1748l c1748l, Runnable runnable) {
        return m2852a(j, false, c1748l, runnable);
    }

    /* JADX INFO: renamed from: a */
    public static C1576i0 m2852a(long j, boolean z, C1748l c1748l, Runnable runnable) {
        return new C1576i0(j, z, c1748l, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2853a(boolean z, Runnable runnable) {
        if (!z) {
            m2854a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2854a() {
        this.f1802a.m3023a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f1801c.remove(this);
    }

    /* JADX INFO: renamed from: b */
    public long m2855b() {
        return this.f1802a.m3024c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f1802a.m3025d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f1802a.m3026e();
        }
    }
}
