package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.status.b */
/* JADX INFO: compiled from: MBActivityLifecyclePublisher.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12839b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC12838a> f34398a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    private int f34399b = 0;

    /* JADX INFO: renamed from: c */
    private int f34400c = 0;

    /* JADX INFO: renamed from: d */
    private boolean f34401d = true;

    /* JADX INFO: renamed from: e */
    private boolean f34402e = true;

    /* JADX INFO: renamed from: f */
    Handler f34403f = new Handler();

    /* JADX INFO: renamed from: g */
    private final Runnable f34404g = new Runnable() { // from class: com.mbridge.msdk.config.component.status.b$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m35720c();
        }
    };

    public C12839b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m35720c() {
        m35716a();
        m35719b();
    }

    /* JADX INFO: renamed from: a */
    public void m35721a(InterfaceC12838a interfaceC12838a) {
        try {
            this.f34398a.add(interfaceC12838a);
        } catch (Throwable unused) {
            C13219q0.m37816b("LifecyclePublisher", "add subscriber error");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35722b(InterfaceC12838a interfaceC12838a) {
        try {
            this.f34398a.remove(interfaceC12838a);
        } catch (Throwable unused) {
            C13219q0.m37816b("LifecyclePublisher", "remove subscriber error");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m35718a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        m35718a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f34400c--;
        m35718a("LifecycleChanged", "onActivityPaused");
        if (this.f34400c == 0) {
            this.f34403f.postDelayed(this.f34404g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f34400c++;
        m35718a("LifecycleChanged", "onActivityResumed");
        if (this.f34400c == 1) {
            if (!this.f34401d) {
                this.f34403f.removeCallbacks(this.f34404g);
            } else {
                m35718a("916003", "");
                this.f34401d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f34399b++;
        m35718a("LifecycleChanged", "onActivityStarted");
        if (this.f34399b == 1 && this.f34402e) {
            this.f34402e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f34399b--;
        m35718a("LifecycleChanged", "onActivityStopped");
        m35719b();
    }

    /* JADX INFO: renamed from: a */
    private void m35717a(C12710b c12710b) {
        try {
            Iterator<InterfaceC12838a> it = this.f34398a.iterator();
            while (it.hasNext()) {
                it.next().mo35715a(c12710b);
            }
        } catch (Throwable unused) {
            C13219q0.m37816b("LifecyclePublisher", "notifySubscriber error");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m35719b() {
        if (this.f34399b == 0 && this.f34401d) {
            m35718a("916004", "");
            this.f34402e = true;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35718a(String str, String str2) {
        C12710b c12710b = new C12710b();
        c12710b.m34843b(str);
        HashMap map = new HashMap();
        map.put(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND), str2);
        c12710b.m34841a(map);
        m35717a(c12710b);
    }

    /* JADX INFO: renamed from: a */
    private void m35716a() {
        if (this.f34400c == 0) {
            this.f34401d = true;
        }
    }
}
