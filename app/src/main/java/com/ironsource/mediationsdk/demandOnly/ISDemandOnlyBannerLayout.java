package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C12577w2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes6.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private View f31080a;

    /* JADX INFO: renamed from: b */
    private ISBannerSize f31081b;

    /* JADX INFO: renamed from: c */
    private String f31082c;

    /* JADX INFO: renamed from: d */
    private Activity f31083d;

    /* JADX INFO: renamed from: e */
    private boolean f31084e;

    /* JADX INFO: renamed from: f */
    private C12577w2 f31085f;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout$a */
    class RunnableC12334a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f31086a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f31087b;

        RunnableC12334a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f31086a = view;
            this.f31087b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f31086a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f31086a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f31086a;
            iSDemandOnlyBannerLayout.f31080a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f31087b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f31084e = false;
        this.f31083d = activity;
        this.f31081b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f31085f = new C12577w2();
    }

    /* JADX INFO: renamed from: a */
    protected void m32353a() {
        this.f31084e = true;
        this.f31083d = null;
        this.f31081b = null;
        this.f31082c = null;
        this.f31080a = null;
        removeBannerListener();
    }

    public Activity getActivity() {
        return this.f31083d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f31085f.m27812a();
    }

    public View getBannerView() {
        return this.f31080a;
    }

    public C12577w2 getListener() {
        return this.f31085f;
    }

    public String getPlacementName() {
        return this.f31082c;
    }

    public ISBannerSize getSize() {
        return this.f31081b;
    }

    public boolean isDestroyed() {
        return this.f31084e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f31085f.m27815b((Object) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f31085f.m27815b(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f31082c = str;
    }

    /* JADX INFO: renamed from: a */
    void m32354a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC12334a(view, layoutParams));
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f31084e = false;
    }
}
