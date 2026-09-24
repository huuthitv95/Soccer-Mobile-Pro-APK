package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.AbstractC1505b;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1831z4;
import com.ironsource.C11744X3;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a */
    final C1748l f2865a;

    /* JADX INFO: renamed from: b */
    private final String f2866b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f2867c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f2868d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f2869e = new AtomicInteger();

    /* JADX INFO: renamed from: f */
    private final AtomicLong f2870f = new AtomicLong();

    /* JADX INFO: renamed from: g */
    private final AtomicLong f2871g = new AtomicLong();

    /* JADX INFO: renamed from: h */
    private final AtomicLong f2872h = new AtomicLong();

    /* JADX INFO: renamed from: i */
    private Date f2873i;

    /* JADX INFO: renamed from: j */
    private Date f2874j;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.SessionTracker$a */
    class C1729a extends AbstractC1505b {
        C1729a() {
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.m4420b();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.SessionTracker$b */
    class ComponentCallbacks2C1730b implements ComponentCallbacks2 {
        ComponentCallbacks2C1730b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            SessionTracker.this.f2869e.set(i);
            if (i == 20) {
                SessionTracker.this.m4417a();
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.SessionTracker$c */
    class C1731c extends BroadcastReceiver {
        C1731c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (AbstractC1701q7.m4110h()) {
                    SessionTracker.this.m4420b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.m4417a();
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.SessionTracker$d */
    static /* synthetic */ class C1732d {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f2878a;

        static {
            int[] iArr = new int[EnumC1733e.values().length];
            f2878a = iArr;
            try {
                iArr[EnumC1733e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2878a[EnumC1733e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2878a[EnumC1733e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.SessionTracker$e */
    public enum EnumC1733e {
        STARTED(C11744X3.i.f26361d0),
        PAUSED(C11744X3.i.f26363e0),
        RESUMED("resumed");


        /* JADX INFO: renamed from: a */
        private final String f2883a;

        EnumC1733e(String str) {
            this.f2883a = str;
        }

        /* JADX INFO: renamed from: b */
        public String m4425b() {
            return this.f2883a;
        }
    }

    SessionTracker(C1748l c1748l) {
        this.f2865a = c1748l;
        Application application = (Application) C1748l.m4756p();
        application.registerActivityLifecycleCallbacks(new C1729a());
        application.registerComponentCallbacks(new ComponentCallbacks2C1730b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new C1731c(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4417a() {
        if (this.f2868d.compareAndSet(false, true)) {
            m4421c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m4420b() {
        if (this.f2868d.compareAndSet(true, false)) {
            m4423d();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m4421c() {
        this.f2865a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2865a.m4782Q().m5171a("SessionTracker", "Application Paused");
        }
        this.f2870f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f2867c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f2865a.m4801a(C1831z4.f4086y3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f2865a.m4801a(C1831z4.f3674A3)).longValue());
        if (this.f2873i == null || System.currentTimeMillis() - this.f2873i.getTime() >= millis) {
            this.f2865a.m4768G().trackEvent(C11744X3.i.f26363e0);
            if (zBooleanValue) {
                this.f2873i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f2873i = new Date();
    }

    /* JADX INFO: renamed from: d */
    private void m4423d() {
        this.f2865a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2865a.m4782Q().m5171a("SessionTracker", "Application Resumed");
        }
        this.f2871g.set(System.currentTimeMillis());
        this.f2872h.addAndGet(this.f2871g.get() - this.f2870f.get());
        boolean zBooleanValue = ((Boolean) this.f2865a.m4801a(C1831z4.f4086y3)).booleanValue();
        long jLongValue = ((Long) this.f2865a.m4801a(C1831z4.f4094z3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f2867c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f2874j == null || System.currentTimeMillis() - this.f2874j.getTime() >= millis) {
            this.f2865a.m4768G().trackEvent("resumed");
            if (zBooleanValue) {
                this.f2874j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f2874j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f2870f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f2871g.get();
    }

    public EnumC1733e getCurrentApplicationState() {
        if (this.f2868d.get()) {
            return EnumC1733e.PAUSED;
        }
        return this.f2870f.get() != 0 ? EnumC1733e.RESUMED : EnumC1733e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jM4755o;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = C1732d.f2878a[getCurrentApplicationState().ordinal()];
        if (i == 1) {
            jM4755o = C1748l.m4755o();
        } else if (i == 2) {
            jM4755o = this.f2870f.get();
        } else {
            if (i != 3) {
                return -1L;
            }
            jM4755o = this.f2871g.get();
        }
        return jCurrentTimeMillis - jM4755o;
    }

    public int getLastTrimMemoryLevel() {
        return this.f2869e.get();
    }

    public String getSessionId() {
        return this.f2866b;
    }

    public long getTotalBackgroundDurationMillis() {
        return getCurrentApplicationState() == EnumC1733e.PAUSED ? this.f2872h.get() + getCurrentApplicationStateDurationMillis() : this.f2872h.get();
    }

    public boolean isApplicationPaused() {
        return this.f2868d.get();
    }

    public void pauseForClick() {
        this.f2867c.set(true);
    }

    public void resumeForClick() {
        this.f2867c.set(false);
    }
}
