package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.FO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5223FO extends AbstractC5926Qq<C5210FB> {
    public int A00;
    public final int A01;
    public final C47457M A04;
    public final C6902gi A05;
    public final ViewOnClickListenerC5560Kr A06;
    public final List<String> A08;
    public final Application.ActivityLifecycleCallbacks A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (activity == this.A00.A05.A0E()) {
                this.A00.A03.removeCallbacks(this.A00.A07);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            this.A00.A03.post(this.A00.A07);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A07 = new RunnableC6767eX(this);

    public C5223FO(C6902gi c6902gi, List<String> screenshotUrls, int i, C47457M c47457m, ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr, int i2) {
        this.A08 = screenshotUrls;
        this.A01 = i;
        this.A05 = c6902gi;
        this.A04 = c47457m;
        this.A06 = viewOnClickListenerC5560Kr;
        this.A00 = i2;
        this.A03.post(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().registerActivityLifecycleCallbacks(this.A02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C5210FB A0F(ViewGroup viewGroup, int i) {
        C5208F9 c5208f9 = new C5208F9(this.A05);
        if (C6171Up.A1D(this.A05)) {
            c5208f9.setOnClickListener(new ViewOnClickListenerC6768eY(this));
        }
        return new C5210FB(c5208f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void A0K(C5210FB c5210fb, int i) {
        String str = this.A08.get(i % this.A08.size());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i2 = this.A01;
        int actualPosition = this.A01;
        marginLayoutParams.setMargins(i2, 0, actualPosition, 0);
        c5210fb.A0p().setLayoutParams(marginLayoutParams);
        c5210fb.A0p().setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    public final int A0B() {
        return this.A08.size() * 1000;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    public final void A0L(C47457M c47457m) {
        super.A0L(c47457m);
        this.A03.removeCallbacks(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().unregisterActivityLifecycleCallbacks(this.A02);
        }
    }

    public final void A0O(int i) {
        this.A00 = i;
    }
}
