package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jn */
/* JADX INFO: loaded from: classes6.dex */
public final class C12065jn {

    /* JADX INFO: renamed from: ﻛ */
    private InterfaceC12066jo f29687;

    /* JADX INFO: renamed from: ﾒ */
    private boolean f29689 = false;

    /* JADX INFO: renamed from: ｋ */
    private Handler f29688 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﻐ */
    private InterfaceC12061jj f29686 = new AbstractC12059jh() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.3
        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C12065jn.m30711(C12065jn.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C12065jn.m30711(C12065jn.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C12065jn.m30712(C12065jn.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C12065jn.m30710(C12065jn.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C12065jn.m30711(C12065jn.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C12065jn.m30711(C12065jn.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C12065jn.m30711(C12065jn.this);
        }
    };

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ boolean m30709(C12065jn c12065jn) {
        c12065jn.f29689 = true;
        return true;
    }

    public C12065jn(InterfaceC12066jo interfaceC12066jo) {
        this.f29687 = interfaceC12066jo;
        AbstractC12058jg.m30663().m30665(this.f29686);
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30714() {
        this.f29688.removeCallbacksAndMessages(null);
        if (this.f29686 != null) {
            AbstractC12058jg.m30663().m30666(this.f29686);
            this.f29686 = null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m30711(C12065jn c12065jn) {
        c12065jn.f29688.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m30712(C12065jn c12065jn, Activity activity) {
        if (c12065jn.f29689) {
            c12065jn.f29689 = false;
            InterfaceC12066jo interfaceC12066jo = c12065jn.f29687;
            if (interfaceC12066jo != null) {
                interfaceC12066jo.mo28390(activity);
            }
        }
        c12065jn.f29688.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m30710(C12065jn c12065jn, final Activity activity) {
        c12065jn.f29688.postDelayed(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jn.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C12065jn.m30709(C12065jn.this);
                if (C12065jn.this.f29687 != null) {
                    C12065jn.this.f29687.mo28389(activity);
                }
            }
        }, 500L);
    }
}
