package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1616m0;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CmpServiceImpl implements AppLovinCmpService, C1692a.a {

    /* JADX INFO: renamed from: a */
    private final C1748l f2553a;

    /* JADX INFO: renamed from: e */
    private AppLovinCmpError f2557e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1690e f2558f;

    /* JADX INFO: renamed from: g */
    private InterfaceC1691f f2559g;

    /* JADX INFO: renamed from: c */
    private final Object f2555c = new Object();

    /* JADX INFO: renamed from: d */
    private EnumC1689d f2556d = EnumC1689d.NONE;

    /* JADX INFO: renamed from: b */
    private final C1692a f2554b = m3920c();

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a */
    class C1686a implements InterfaceC1690e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f2560a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Activity f2561b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a */
        class a implements InterfaceC1691f {
            a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1691f
            /* JADX INFO: renamed from: a */
            public void mo1804a(AppLovinCmpError appLovinCmpError) {
                C1686a.this.f2560a.onCompleted(appLovinCmpError);
            }
        }

        C1686a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f2560a = onCompletedListener;
            this.f2561b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1690e
        /* JADX INFO: renamed from: a */
        public void mo1803a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f2560a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f2561b, new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$b */
    class RunnableC1687b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Activity f2564a;

        RunnableC1687b(Activity activity) {
            this.f2564a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f2554b.m3939b(this.f2564a, CmpServiceImpl.this.m3913a(), CmpServiceImpl.this);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$c */
    class RunnableC1688c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Activity f2566a;

        RunnableC1688c(Activity activity) {
            this.f2566a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f2554b.m3937a(this.f2566a, CmpServiceImpl.this.m3913a(), CmpServiceImpl.this);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$d */
    private enum EnumC1689d {
        NONE,
        LOADING,
        COMPLETED
    }

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$e */
    public interface InterfaceC1690e {
        /* JADX INFO: renamed from: a */
        void mo1803a(AppLovinCmpError appLovinCmpError);
    }

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$f */
    public interface InterfaceC1691f {
        /* JADX INFO: renamed from: a */
        void mo1804a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(C1748l c1748l) {
        this.f2553a = c1748l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C1616m0 m3913a() {
        return new C1616m0(this.f2553a.m4864y().m5344d());
    }

    /* JADX INFO: renamed from: a */
    private void m3915a(Activity activity, InterfaceC1690e interfaceC1690e) {
        boolean z;
        if (!hasSupportedCmp()) {
            if (interfaceC1690e != null) {
                interfaceC1690e.mo1803a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f2555c) {
            if (interfaceC1690e != null) {
                this.f2558f = interfaceC1690e;
            }
            EnumC1689d enumC1689d = this.f2556d;
            EnumC1689d enumC1689d2 = EnumC1689d.NONE;
            if (enumC1689d == enumC1689d2) {
                this.f2556d = EnumC1689d.LOADING;
                z = false;
            } else {
                if (enumC1689d == EnumC1689d.LOADING) {
                    return;
                }
                this.f2556d = enumC1689d2;
                z = true;
            }
            if (z) {
                m3916a(this.f2557e);
                return;
            }
            RunnableC1688c runnableC1688c = new RunnableC1688c(activity);
            if (this.f2554b.m3941d()) {
                AppLovinSdkUtils.runOnUiThread(runnableC1688c);
            } else {
                runnableC1688c.run();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3916a(AppLovinCmpError appLovinCmpError) {
        InterfaceC1690e interfaceC1690e = this.f2558f;
        if (interfaceC1690e == null) {
            return;
        }
        interfaceC1690e.mo1803a(appLovinCmpError);
        this.f2558f = null;
        this.f2557e = null;
    }

    /* JADX INFO: renamed from: b */
    private void m3918b() {
        C1692a c1692a = this.f2554b;
        if (c1692a == null) {
            return;
        }
        c1692a.m3936a();
    }

    /* JADX INFO: renamed from: b */
    private void m3919b(AppLovinCmpError appLovinCmpError) {
        InterfaceC1691f interfaceC1691f = this.f2559g;
        if (interfaceC1691f == null) {
            return;
        }
        interfaceC1691f.mo1804a(appLovinCmpError);
        this.f2559g = null;
    }

    /* JADX INFO: renamed from: c */
    private C1692a m3920c() {
        if (AbstractC1701q7.m4066a("com.google.android.ump.ConsentForm")) {
            return new C1692a(this.f2553a);
        }
        if (!this.f2553a.m4864y().m5350j()) {
            return null;
        }
        C1768p.m5167h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m3921d() {
        if (hasSupportedCmp()) {
            this.f2554b.m3940c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f2554b != null;
    }

    public void loadCmp(Activity activity, InterfaceC1690e interfaceC1690e) {
        m3915a(activity, interfaceC1690e);
    }

    @Override // com.applovin.impl.privacy.cmp.C1692a.a
    public void onFlowHidden(Bundle bundle) {
        m3919b((AppLovinCmpError) null);
        m3918b();
    }

    @Override // com.applovin.impl.privacy.cmp.C1692a.a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        m3918b();
        synchronized (this.f2555c) {
            if (this.f2558f == null) {
                this.f2556d = EnumC1689d.COMPLETED;
                this.f2557e = cmpErrorImpl;
            } else {
                this.f2556d = EnumC1689d.NONE;
                m3916a(cmpErrorImpl);
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.C1692a.a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f2555c) {
            if (this.f2558f == null) {
                this.f2556d = EnumC1689d.COMPLETED;
            } else {
                this.f2556d = EnumC1689d.NONE;
                m3916a((AppLovinCmpError) null);
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.C1692a.a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        m3919b(cmpErrorImpl);
        m3918b();
    }

    public void preloadCmp(Activity activity) {
        m3915a(activity, null);
    }

    public void showCmp(Activity activity, InterfaceC1691f interfaceC1691f) {
        RunnableC1687b runnableC1687b = new RunnableC1687b(activity);
        this.f2559g = interfaceC1691f;
        if (this.f2554b.m3942e()) {
            AppLovinSdkUtils.runOnUiThread(runnableC1687b);
        } else {
            runnableC1687b.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f2553a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2553a.m4782Q().m5171a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f2553a.m4864y().m5350j()) {
            C1768p.m5167h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            m3921d();
            loadCmp(activity, new C1686a(onCompletedListener, activity));
        }
    }

    public String toString() {
        return "[CmpService]";
    }
}
