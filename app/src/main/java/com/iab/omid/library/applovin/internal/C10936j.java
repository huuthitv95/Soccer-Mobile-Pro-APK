package com.iab.omid.library.applovin.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.applovin.adsession.C10919a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.j */
/* JADX INFO: loaded from: classes6.dex */
public class C10936j {

    /* JADX INFO: renamed from: d */
    private static C10936j f22730d = new C10936j();

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f22731a;

    /* JADX INFO: renamed from: b */
    private boolean f22732b = false;

    /* JADX INFO: renamed from: c */
    private boolean f22733c = false;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.j$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C10936j c10936j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c10936j = C10936j.this;
                z = c10936j.f22733c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                c10936j = C10936j.this;
                z = c10936j.f22733c;
                z2 = false;
            }
            c10936j.m23282a(z2, z);
            C10936j.this.f22732b = z2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C10936j m23279b() {
        return f22730d;
    }

    /* JADX INFO: renamed from: a */
    public void m23280a() {
        Context context = this.f22731a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m23282a(this.f22732b, zIsDeviceLocked);
        this.f22733c = zIsDeviceLocked;
    }

    /* JADX INFO: renamed from: a */
    public void m23281a(Context context) {
        if (context == null) {
            return;
        }
        this.f22731a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public void m23282a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f22733c || this.f22732b)) {
            return;
        }
        Iterator<C10919a> it = C10929c.m23224c().m23227b().iterator();
        while (it.hasNext()) {
            it.next().m23182d().m23308b(z2 || z);
        }
    }
}
