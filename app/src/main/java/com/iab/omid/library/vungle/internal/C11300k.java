package com.iab.omid.library.vungle.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.vungle.adsession.C11271a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.k */
/* JADX INFO: loaded from: classes6.dex */
public class C11300k {

    /* JADX INFO: renamed from: d */
    private static C11300k f23693d = new C11300k();

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f23694a;

    /* JADX INFO: renamed from: b */
    private boolean f23695b = false;

    /* JADX INFO: renamed from: c */
    private boolean f23696c = false;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.k$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C11300k c11300k;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c11300k = C11300k.this;
                z = c11300k.f23696c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                c11300k = C11300k.this;
                z = c11300k.f23696c;
                z2 = false;
            }
            c11300k.m25065a(z2, z);
            C11300k.this.f23695b = z2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11300k m25062b() {
        return f23693d;
    }

    /* JADX INFO: renamed from: a */
    public void m25063a() {
        KeyguardManager keyguardManager;
        Context context = this.f23694a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        m25065a(this.f23695b, zIsDeviceLocked);
        this.f23696c = zIsDeviceLocked;
    }

    /* JADX INFO: renamed from: a */
    public void m25064a(Context context) {
        if (context == null) {
            return;
        }
        this.f23694a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public void m25065a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f23696c || this.f23695b)) {
            return;
        }
        Iterator<C11271a> it = C11292c.m25003c().m25006b().iterator();
        while (it.hasNext()) {
            it.next().m24934d().m25100b(z2 || z);
        }
    }
}
