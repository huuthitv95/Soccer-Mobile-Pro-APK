package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C11613P7;
import com.ironsource.C12317m4;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.t */
/* JADX INFO: loaded from: classes6.dex */
class C12511t {

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.t$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AudioManager f32211a;

        a(AudioManager audioManager) {
            this.f32211a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12511t.m33488a(this.f32211a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.t$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AudioManager f32212a;

        b(AudioManager audioManager) {
            this.f32212a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12511t.m33490b(this.f32212a);
        }
    }

    C12511t() {
    }

    /* JADX INFO: renamed from: a */
    public static void m33487a(Activity activity) {
        C11613P7.f25510a.m27219b(new a((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: renamed from: b */
    public static void m33489b(Activity activity) {
        C11613P7.f25510a.m27219b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static void m33488a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m33490b(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
