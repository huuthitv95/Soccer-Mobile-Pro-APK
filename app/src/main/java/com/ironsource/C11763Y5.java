package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Y5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11763Y5 implements InterfaceC11438Fc {

    /* JADX INFO: renamed from: a */
    private InterfaceC11780Z5 f26581a;

    /* JADX INFO: renamed from: b */
    private WeakReference<InterfaceC11798a6> f26582b = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.ironsource.Y5$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f26583a = new a();

        /* JADX INFO: renamed from: b */
        public static final String f26584b = "impressions";

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m28010a(InterfaceC11780Z5 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f26581a = loadListener;
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialAdRewarded(String str, int i) {
        InterfaceC11798a6 interfaceC11798a6 = this.f26582b.get();
        if (interfaceC11798a6 != null) {
            interfaceC11798a6.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialClick() {
        InterfaceC11798a6 interfaceC11798a6 = this.f26582b.get();
        if (interfaceC11798a6 != null) {
            interfaceC11798a6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialClose() {
        InterfaceC11798a6 interfaceC11798a6 = this.f26582b.get();
        if (interfaceC11798a6 != null) {
            interfaceC11798a6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC11798a6 interfaceC11798a6;
        if (!Intrinsics.areEqual(str, "impressions") || (interfaceC11798a6 = this.f26582b.get()) == null) {
            return;
        }
        interfaceC11798a6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialInitFailed(String str) {
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialLoadFailed(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC11780Z5 interfaceC11780Z5 = this.f26581a;
        if (interfaceC11780Z5 != null) {
            interfaceC11780Z5.mo26431a(description);
        }
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialLoadSuccess(C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        InterfaceC11780Z5 interfaceC11780Z5 = this.f26581a;
        if (interfaceC11780Z5 != null) {
            interfaceC11780Z5.mo26429a(adInstance);
        }
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialOpen() {
        InterfaceC11798a6 interfaceC11798a6 = this.f26582b.get();
        if (interfaceC11798a6 != null) {
            interfaceC11798a6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialShowFailed(String str) {
        InterfaceC11798a6 interfaceC11798a6 = this.f26582b.get();
        if (interfaceC11798a6 != null) {
            interfaceC11798a6.mo26229a(str);
        }
    }

    @Override // com.ironsource.InterfaceC11438Fc
    public void onInterstitialShowSuccess() {
    }

    /* JADX INFO: renamed from: a */
    public final void m28011a(InterfaceC11798a6 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f26582b = new WeakReference<>(showListener);
    }
}
