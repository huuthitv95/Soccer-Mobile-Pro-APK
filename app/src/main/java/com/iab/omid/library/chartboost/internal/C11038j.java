package com.iab.omid.library.chartboost.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.chartboost.adsession.C11021a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.j */
/* JADX INFO: loaded from: classes6.dex */
public class C11038j {

    /* JADX INFO: renamed from: d */
    private static C11038j f23000d = new C11038j();

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f23001a;

    /* JADX INFO: renamed from: b */
    private boolean f23002b = false;

    /* JADX INFO: renamed from: c */
    private boolean f23003c = false;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.j$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C11038j c11038j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c11038j = C11038j.this;
                z = c11038j.f23003c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                c11038j = C11038j.this;
                z = c11038j.f23003c;
                z2 = false;
            }
            c11038j.m23782a(z2, z);
            C11038j.this.f23002b = z2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11038j m23779b() {
        return f23000d;
    }

    /* JADX INFO: renamed from: a */
    public void m23780a() {
        KeyguardManager keyguardManager;
        Context context = this.f23001a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        m23782a(this.f23002b, zIsDeviceLocked);
        this.f23003c = zIsDeviceLocked;
    }

    /* JADX INFO: renamed from: a */
    public void m23781a(Context context) {
        if (context == null) {
            return;
        }
        this.f23001a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public void m23782a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f23003c || this.f23002b)) {
            return;
        }
        Iterator<C11021a> it = C11031c.m23724c().m23727b().iterator();
        while (it.hasNext()) {
            it.next().m23678d().m23808b(z2 || z);
        }
    }
}
