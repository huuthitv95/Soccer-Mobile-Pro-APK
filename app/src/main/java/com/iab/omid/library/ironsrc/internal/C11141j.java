package com.iab.omid.library.ironsrc.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.j */
/* JADX INFO: loaded from: classes6.dex */
public class C11141j {

    /* JADX INFO: renamed from: d */
    private static C11141j f23270d = new C11141j();

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f23271a;

    /* JADX INFO: renamed from: b */
    private boolean f23272b = false;

    /* JADX INFO: renamed from: c */
    private boolean f23273c = false;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.j$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C11141j c11141j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c11141j = C11141j.this;
                z = c11141j.f23273c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                c11141j = C11141j.this;
                z = c11141j.f23273c;
                z2 = false;
            }
            c11141j.m24292a(z2, z);
            C11141j.this.f23272b = z2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11141j m24289b() {
        return f23270d;
    }

    /* JADX INFO: renamed from: a */
    public void m24290a() {
        Context context = this.f23271a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m24292a(this.f23272b, zIsDeviceLocked);
        this.f23273c = zIsDeviceLocked;
    }

    /* JADX INFO: renamed from: a */
    public void m24291a(Context context) {
        if (context == null) {
            return;
        }
        this.f23271a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public void m24292a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f23273c || this.f23272b)) {
            return;
        }
        Iterator<C11124a> it = C11134c.m24234c().m24237b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24318b(z2 || z);
        }
    }
}
