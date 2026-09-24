package com.chartboost.sdk.impl;

import android.app.Activity;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.v9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4112v9 implements InterfaceC3650b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4068t9 f16572a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4096uf f16573b;

    /* JADX INFO: renamed from: c */
    public final C3920mg f16574c;

    /* JADX INFO: renamed from: d */
    public final C4021r6 f16575d;

    /* JADX INFO: renamed from: e */
    public int f16576e;

    public C4112v9(InterfaceC4068t9 view, InterfaceC4096uf rendererActivityBridge, C3920mg sdkConfiguration, C4021r6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.f16572a = view;
        this.f16573b = rendererActivityBridge;
        this.f16574c = sdkConfiguration;
        this.f16575d = displayMeasurement;
        this.f16576e = -1;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3650b
    /* JADX INFO: renamed from: a */
    public void mo16851a() {
        try {
            CBImpressionActivity activity = this.f16572a.getActivity();
            if (AbstractC3872ke.m18422a((Activity) activity)) {
                return;
            }
            int requestedOrientation = activity.getRequestedOrientation();
            int i = this.f16576e;
            if (requestedOrientation != i) {
                C4048sb.m19411b("restoreOriginalOrientation: " + i, (Throwable) null, 2, (Object) null);
                activity.setRequestedOrientation(this.f16576e);
            }
        } catch (Exception e) {
            C4048sb.m19410b("restoreOriginalOrientation: ", e);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3650b
    /* JADX INFO: renamed from: a */
    public void mo16852a(int i, boolean z) {
        int i2;
        try {
            CBImpressionActivity activity = this.f16572a.getActivity();
            if (AbstractC3872ke.m18422a((Activity) activity)) {
                return;
            }
            m19681i();
            if (i != 0) {
                i2 = 1;
                if (i != 1) {
                    i2 = z ? -1 : activity.getResources().getConfiguration().orientation;
                }
            } else {
                i2 = 0;
            }
            activity.setRequestedOrientation(i2);
        } catch (Exception e) {
            C4048sb.m19410b("applyOrientationProperties: ", e);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3650b
    /* JADX INFO: renamed from: a */
    public void mo16853a(AbstractC3969ok viewBase) {
        Intrinsics.checkNotNullParameter(viewBase, "viewBase");
        this.f16572a.attachViewToActivity(viewBase);
    }

    /* JADX INFO: renamed from: b */
    public void m19674b() {
        try {
            this.f16573b.mo19599e();
        } catch (Exception e) {
            C4048sb.m19407a("Cannot perform onStop", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m19675c() {
        this.f16573b.mo19593a(this, this.f16572a.getActivity());
        this.f16572a.setFullscreen();
        m19681i();
    }

    /* JADX INFO: renamed from: d */
    public void m19676d() {
        try {
            this.f16573b.mo19598c();
        } catch (Exception e) {
            C4048sb.m19407a("Cannot perform onStop", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m19677e() {
        try {
            this.f16573b.mo19597b();
        } catch (Exception e) {
            C4048sb.m19407a("Cannot perform onPause", e);
        }
        try {
            AbstractC3872ke.m18420a(this.f16572a.getActivity(), this.f16574c);
        } catch (Exception e2) {
            C4048sb.m19407a("Cannot lock the orientation in activity", e2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m19678f() {
        try {
            this.f16573b.mo19593a(this, this.f16572a.getActivity());
        } catch (Exception e) {
            C4048sb.m19407a("Cannot setActivityRendererInterface", e);
        }
        try {
            this.f16573b.onResume();
        } catch (Exception e2) {
            C4048sb.m19407a("Cannot perform onResume", e2);
        }
        this.f16572a.setFullscreen();
        try {
            AbstractC3872ke.m18421a(this.f16572a.getActivity(), this.f16574c, this.f16575d);
        } catch (Exception e3) {
            C4048sb.m19407a("Cannot lock the orientation in activity", e3);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3650b
    public void finishActivity() {
        this.f16572a.finishActivity();
    }

    /* JADX INFO: renamed from: g */
    public void m19679g() {
        try {
            this.f16573b.onStart();
        } catch (Exception e) {
            C4048sb.m19407a("Cannot perform onResume", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m19680h() {
        try {
            if (this.f16572a.isActivityHardwareAccelerated()) {
                return;
            }
            C4048sb.m19411b("The activity passed down is not hardware accelerated, so Chartboost cannot show ads", (Throwable) null, 2, (Object) null);
            this.f16573b.mo19596a(CBError.Impression.HARDWARE_ACCELERATION_DISABLED);
            this.f16572a.finishActivity();
        } catch (Exception e) {
            C4048sb.m19410b("onAttachedToWindow", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m19681i() {
        try {
            this.f16576e = this.f16572a.getActivity().getRequestedOrientation();
        } catch (Exception e) {
            C4048sb.m19410b("saveOriginalOrientation: ", e);
        }
    }
}
