package com.iab.omid.library.fyber.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.fyber.adsession.C11073a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.j */
/* JADX INFO: loaded from: classes6.dex */
public class C11090j {

    /* JADX INFO: renamed from: d */
    private static C11090j f23135d = new C11090j();

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f23136a;

    /* JADX INFO: renamed from: b */
    private boolean f23137b = false;

    /* JADX INFO: renamed from: c */
    private boolean f23138c = false;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.j$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C11090j c11090j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c11090j = C11090j.this;
                z = c11090j.f23138c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                c11090j = C11090j.this;
                z = c11090j.f23138c;
                z2 = false;
            }
            c11090j.m24039a(z2, z);
            C11090j.this.f23137b = z2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11090j m24036b() {
        return f23135d;
    }

    /* JADX INFO: renamed from: a */
    public void m24037a() {
        KeyguardManager keyguardManager;
        Context context = this.f23136a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        m24039a(this.f23137b, zIsDeviceLocked);
        this.f23138c = zIsDeviceLocked;
    }

    /* JADX INFO: renamed from: a */
    public void m24038a(Context context) {
        if (context == null) {
            return;
        }
        this.f23136a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public void m24039a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f23138c || this.f23137b)) {
            return;
        }
        Iterator<C11073a> it = C11083c.m23981c().m23984b().iterator();
        while (it.hasNext()) {
            it.next().m23939d().m24065b(z2 || z);
        }
    }
}
