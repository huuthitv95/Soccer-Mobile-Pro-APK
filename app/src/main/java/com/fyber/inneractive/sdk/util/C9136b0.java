package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.renderers.C9057d;
import com.fyber.inneractive.sdk.renderers.C9070n;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9136b0 {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f21435a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f21436b;

    /* JADX INFO: renamed from: c */
    public Context f21437c;

    /* JADX INFO: renamed from: d */
    public C9206y f21438d;

    /* JADX INFO: renamed from: a */
    public static void m21956a(C9136b0 c9136b0, Context context, Intent intent) {
        boolean zIsKeyguardLocked;
        synchronized (c9136b0) {
            try {
                zIsKeyguardLocked = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.m21945a("%sFailed to get lock screen status", IAlog.m21943a(c9136b0));
                zIsKeyguardLocked = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                c9136b0.f21436b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !zIsKeyguardLocked) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                c9136b0.f21436b = false;
            }
            IAlog.m21945a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.m21943a(c9136b0), Boolean.valueOf(c9136b0.f21436b), Integer.valueOf(c9136b0.f21435a.size()));
            for (InterfaceC9133a0 interfaceC9133a0 : c9136b0.f21435a) {
                boolean z = c9136b0.f21436b;
                C9070n c9070n = (C9070n) interfaceC9133a0;
                c9070n.getClass();
                IAlog.m21945a("%sgot onLockScreenStateChanged with: %s", IAlog.m21943a(c9070n), Boolean.valueOf(z));
                if (z) {
                    c9070n.m21877d(false);
                    C9057d c9057d = c9070n.f21230y;
                    if (c9057d != null && c9057d.f21197g) {
                        c9057d.f21197g = false;
                        AbstractC9183r.f21478b.removeCallbacks(c9057d.f21200j);
                    }
                } else {
                    c9070n.m21875N();
                    C9057d c9057d2 = c9070n.f21230y;
                    if (c9057d2 != null && !c9057d2.f21198h && !c9057d2.f21197g && c9057d2.f21196f != 0) {
                        c9057d2.f21196f = 0L;
                        c9057d2.f21197g = true;
                        c9057d2.m21860a();
                    }
                }
            }
        }
    }
}
