package com.iab.omid.library.mmadbridge.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.j */
/* JADX INFO: loaded from: classes6.dex */
public class C11192j {

    /* JADX INFO: renamed from: d */
    private static C11192j f23405d = new C11192j();

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f23406a;

    /* JADX INFO: renamed from: b */
    private boolean f23407b = false;

    /* JADX INFO: renamed from: c */
    private boolean f23408c = false;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.j$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C11192j c11192j;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c11192j = C11192j.this;
                z = c11192j.f23408c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                c11192j = C11192j.this;
                z = c11192j.f23408c;
                z2 = false;
            }
            c11192j.m24545a(z2, z);
            C11192j.this.f23407b = z2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11192j m24542b() {
        return f23405d;
    }

    /* JADX INFO: renamed from: a */
    public void m24543a() {
        Context context = this.f23406a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        m24545a(this.f23407b, zIsDeviceLocked);
        this.f23408c = zIsDeviceLocked;
    }

    /* JADX INFO: renamed from: a */
    public void m24544a(Context context) {
        if (context == null) {
            return;
        }
        this.f23406a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public void m24545a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f23408c || this.f23407b)) {
            return;
        }
        Iterator<C11175a> it = C11185c.m24487c().m24490b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m24571b(z2 || z);
        }
    }
}
