package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC12230ha;
import com.ironsource.InterfaceC12212ga;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.ironsource.lifecycle.b */
/* JADX INFO: loaded from: classes6.dex */
public class C12311b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m */
    private static final C12311b f30872m = new C12311b();

    /* JADX INFO: renamed from: n */
    private static AtomicBoolean f30873n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o */
    static final long f30874o = 700;

    /* JADX INFO: renamed from: a */
    private int f30875a = 0;

    /* JADX INFO: renamed from: b */
    private int f30876b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f30877c = true;

    /* JADX INFO: renamed from: d */
    private boolean f30878d = true;

    /* JADX INFO: renamed from: e */
    private EnumC12230ha f30879e = EnumC12230ha.NONE;

    /* JADX INFO: renamed from: f */
    private final List<InterfaceC12212ga> f30880f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    private final Runnable f30881g = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m32100f();
        }
    };

    /* JADX INFO: renamed from: h */
    private final Runnable f30882h = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m32101g();
        }
    };

    /* JADX INFO: renamed from: i */
    private final Runnable f30883i = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m32102h();
        }
    };

    /* JADX INFO: renamed from: j */
    private final Runnable f30884j = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda3
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m32103i();
        }
    };

    /* JADX INFO: renamed from: k */
    private final Runnable f30885k = new Runnable() { // from class: com.ironsource.lifecycle.b$$ExternalSyntheticLambda4
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m32104j();
        }
    };

    /* JADX INFO: renamed from: l */
    private final FragmentC12310a.a f30886l = new a();

    /* JADX INFO: renamed from: com.ironsource.lifecycle.b$a */
    class a implements FragmentC12310a.a {
        a() {
        }

        @Override // com.ironsource.lifecycle.FragmentC12310a.a
        /* JADX INFO: renamed from: a */
        public void mo32094a(Activity activity) {
            C12311b.this.m32108b(activity);
        }

        @Override // com.ironsource.lifecycle.FragmentC12310a.a
        /* JADX INFO: renamed from: b */
        public void mo32095b(Activity activity) {
            C12311b.this.m32111c(activity);
        }

        @Override // com.ironsource.lifecycle.FragmentC12310a.a
        /* JADX INFO: renamed from: c */
        public void mo32096c(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static C12311b m32099d() {
        return f30872m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m32100f() {
        m32097a();
        m32098b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m32101g() {
        Iterator<InterfaceC12212ga> it = this.f30880f.iterator();
        while (it.hasNext()) {
            it.next().mo27940d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m32102h() {
        Iterator<InterfaceC12212ga> it = this.f30880f.iterator();
        while (it.hasNext()) {
            it.next().mo27937a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m32103i() {
        Iterator<InterfaceC12212ga> it = this.f30880f.iterator();
        while (it.hasNext()) {
            it.next().mo27939c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m32104j() {
        Iterator<InterfaceC12212ga> it = this.f30880f.iterator();
        while (it.hasNext()) {
            it.next().mo27938b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m32107a(InterfaceC12212ga interfaceC12212ga) {
        if (!IronsourceLifecycleProvider.m32086a() || interfaceC12212ga == null || this.f30880f.contains(interfaceC12212ga)) {
            return;
        }
        this.f30880f.add(interfaceC12212ga);
    }

    /* JADX INFO: renamed from: b */
    public void m32109b(InterfaceC12212ga interfaceC12212ga) {
        if (this.f30880f.contains(interfaceC12212ga)) {
            this.f30880f.remove(interfaceC12212ga);
        }
    }

    /* JADX INFO: renamed from: c */
    public EnumC12230ha m32110c() {
        return this.f30879e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m32113e() {
        return this.f30879e == EnumC12230ha.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        FragmentC12310a.m32090b(activity);
        FragmentC12310a fragmentC12310aM32088a = FragmentC12310a.m32088a(activity);
        if (fragmentC12310aM32088a != null) {
            fragmentC12310aM32088a.m32093d(this.f30886l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m32105a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m32112d(activity);
    }

    /* JADX INFO: renamed from: c */
    void m32111c(Activity activity) {
        int i = this.f30875a + 1;
        this.f30875a = i;
        if (i == 1 && this.f30878d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f30885k);
            this.f30878d = false;
            this.f30879e = EnumC12230ha.STARTED;
        }
    }

    /* JADX INFO: renamed from: d */
    void m32112d(Activity activity) {
        this.f30875a--;
        m32098b();
    }

    /* JADX INFO: renamed from: b */
    void m32108b(Activity activity) {
        int i = this.f30876b + 1;
        this.f30876b = i;
        if (i == 1) {
            if (this.f30877c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f30884j);
                this.f30877c = false;
                this.f30879e = EnumC12230ha.RESUMED;
                return;
            }
            IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f30881g);
        }
    }

    /* JADX INFO: renamed from: a */
    void m32106a(Context context) {
        Application application;
        if (!f30873n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: renamed from: b */
    private void m32098b() {
        if (this.f30875a == 0 && this.f30877c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f30883i);
            this.f30878d = true;
            this.f30879e = EnumC12230ha.STOPPED;
        }
    }

    /* JADX INFO: renamed from: a */
    void m32105a(Activity activity) {
        int i = this.f30876b - 1;
        this.f30876b = i;
        if (i == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f30881g, 700L);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m32097a() {
        if (this.f30876b == 0) {
            this.f30877c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f30882h);
            this.f30879e = EnumC12230ha.PAUSED;
        }
    }
}
