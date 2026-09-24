package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.sdk.j */
/* JADX INFO: loaded from: classes3.dex */
public class C1746j extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: h */
    public static int f2992h = -1;

    /* JADX INFO: renamed from: i */
    private static final Float f2993i = Float.valueOf(15.0f);

    /* JADX INFO: renamed from: a */
    private final AudioManager f2994a;

    /* JADX INFO: renamed from: b */
    private final Context f2995b;

    /* JADX INFO: renamed from: c */
    private final C1748l f2996c;

    /* JADX INFO: renamed from: d */
    private final Set f2997d = new HashSet();

    /* JADX INFO: renamed from: e */
    private final Object f2998e = new Object();

    /* JADX INFO: renamed from: f */
    private boolean f2999f;

    /* JADX INFO: renamed from: g */
    private int f3000g;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.j$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4698a(int i);
    }

    C1746j(C1748l c1748l) {
        this.f2996c = c1748l;
        Context contextM4756p = C1748l.m4756p();
        this.f2995b = contextM4756p;
        this.f2994a = (AudioManager) contextM4756p.getSystemService("audio");
    }

    /* JADX INFO: renamed from: a */
    private Float m4688a() {
        AudioManager audioManager = this.f2994a;
        if (audioManager == null) {
            return f2993i;
        }
        try {
            return Float.valueOf(audioManager.getStreamMaxVolume(3));
        } catch (Throwable th) {
            this.f2996c.m4782Q();
            if (C1768p.m5160a()) {
                this.f2996c.m4782Q().m5172a("AudioSessionManager", "Unable to collect the maximum device volume", th);
            }
            return f2993i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4690a(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: renamed from: b */
    private void m4691b(final int i) {
        if (this.f2999f) {
            return;
        }
        this.f2996c.m4782Q();
        if (C1768p.m5160a()) {
            this.f2996c.m4782Q().m5171a("AudioSessionManager", "Ringer mode is " + i);
        }
        synchronized (this.f2998e) {
            for (final a aVar : this.f2997d) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.mo4698a(i);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m4692d() {
        this.f2996c.m4782Q();
        if (C1768p.m5160a()) {
            this.f2996c.m4782Q().m5171a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f3000g = f2992h;
        this.f2995b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* JADX INFO: renamed from: e */
    private void m4693e() {
        this.f2996c.m4782Q();
        if (C1768p.m5160a()) {
            this.f2996c.m4782Q().m5171a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f2995b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    /* JADX INFO: renamed from: a */
    public void m4694a(a aVar) {
        synchronized (this.f2998e) {
            if (this.f2997d.contains(aVar)) {
                return;
            }
            this.f2997d.add(aVar);
            if (this.f2997d.size() == 1) {
                m4692d();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Float m4695b() {
        AudioManager audioManager = this.f2994a;
        if (audioManager == null) {
            return null;
        }
        try {
            return Float.valueOf(audioManager.getStreamVolume(3) / m4688a().floatValue());
        } catch (Throwable th) {
            this.f2996c.m4782Q();
            if (C1768p.m5160a()) {
                this.f2996c.m4782Q().m5172a("AudioSessionManager", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4696b(a aVar) {
        synchronized (this.f2998e) {
            if (this.f2997d.contains(aVar)) {
                this.f2997d.remove(aVar);
                if (this.f2997d.isEmpty()) {
                    m4693e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m4697c() {
        return this.f2994a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            m4691b(this.f2994a.getRingerMode());
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f2999f = true;
            this.f3000g = this.f2994a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f2999f = false;
            if (this.f3000g != this.f2994a.getRingerMode()) {
                this.f3000g = f2992h;
                m4691b(this.f2994a.getRingerMode());
            }
        }
    }
}
