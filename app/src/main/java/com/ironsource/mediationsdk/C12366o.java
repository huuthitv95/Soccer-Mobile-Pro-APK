package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C12595x2;
import com.ironsource.InterfaceC12621ya;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.o */
/* JADX INFO: loaded from: classes6.dex */
public class C12366o extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private ISBannerSize f31349a;

    /* JADX INFO: renamed from: b */
    private String f31350b;

    /* JADX INFO: renamed from: c */
    private boolean f31351c;

    /* JADX INFO: renamed from: d */
    private a f31352d;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.o$a */
    public interface a {
        void onWindowFocusChanged(boolean z);
    }

    public C12366o(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f31351c = false;
        this.f31349a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* JADX INFO: renamed from: a */
    protected void m32580a() {
        this.f31351c = true;
        this.f31349a = null;
        this.f31350b = null;
        this.f31352d = null;
        C12595x2.m34097a().m34118a((InterfaceC12621ya) null);
    }

    /* JADX INFO: renamed from: b */
    public boolean m32581b() {
        return this.f31351c;
    }

    /* JADX INFO: renamed from: c */
    protected C12366o m32582c() {
        C12366o c12366o = new C12366o(getContext(), this.f31349a);
        c12366o.f31350b = this.f31350b;
        return c12366o;
    }

    public ISBannerSize getSize() {
        return this.f31349a;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.f31352d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f31349a = iSBannerSize;
    }

    public C12366o(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f31351c = false;
        this.f31349a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public C12366o(Context context) {
        super(context);
        this.f31351c = false;
    }
}
