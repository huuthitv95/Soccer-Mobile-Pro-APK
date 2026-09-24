package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.chartboost.adsession.media.PlayerState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.zd */
/* JADX INFO: loaded from: classes3.dex */
public final class C4204zd implements InterfaceC3642ae {

    /* JADX INFO: renamed from: a */
    public final C3665be f17126a;

    /* JADX INFO: renamed from: b */
    public final C3711de f17127b;

    /* JADX INFO: renamed from: c */
    public C3734ee f17128c;

    /* JADX INFO: renamed from: d */
    public C3672bl f17129d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.zd$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17130a;

        static {
            int[] iArr = new int[EnumC3804hf.values().length];
            try {
                iArr[EnumC3804hf.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3804hf.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3804hf.THIRD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17130a = iArr;
        }
    }

    public C4204zd(C3665be openMeasurementManager, C3711de openMeasurementSessionBuilder) {
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(openMeasurementSessionBuilder, "openMeasurementSessionBuilder");
        this.f17126a = openMeasurementManager;
        this.f17127b = openMeasurementSessionBuilder;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: a */
    public void mo16820a() {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17558g();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyVideoPaused missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: a */
    public void mo16821a(float f) {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17548a(f);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyVolumeChanged missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: a */
    public void mo16822a(float f, float f2) {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17549a(f, f2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyVideoStarted missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20135a(Context context, View trackedView, View rootView, C3672bl.b visibilityTrackerListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedView, "trackedView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(visibilityTrackerListener, "visibilityTrackerListener");
        m20138g();
        C4138wd c4138wdM16928b = this.f17126a.m16928b();
        C3672bl c3672bl = new C3672bl(context, trackedView, rootView, c4138wdM16928b.m19784a(), c4138wdM16928b.m19785b(), c4138wdM16928b.m19789f(), c4138wdM16928b.m19786c(), false, 128, null);
        c3672bl.m16979a(visibilityTrackerListener);
        c3672bl.m16987i();
        this.f17129d = c3672bl;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: a */
    public void mo16823a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17550a(view);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: a */
    public void mo16824a(EnumC3709dc mtype, C3952o3 webview, Integer num, List verificationScriptResourcesList) {
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(webview, "webview");
        Intrinsics.checkNotNullParameter(verificationScriptResourcesList, "verificationScriptResourcesList");
        try {
            m20137b(mtype, webview, num, verificationScriptResourcesList);
        } catch (Exception e) {
            C4048sb.m19407a("OMSDK Session error", e);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: a */
    public void mo16825a(EnumC3804hf quartile) {
        Unit unit;
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            int i = a.f17130a[quartile.ordinal()];
            if (i == 1) {
                c3734ee.m17556e();
            } else if (i == 2) {
                c3734ee.m17557f();
            } else if (i == 3) {
                c3734ee.m17561j();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyVideoProgress missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: a */
    public void mo16826a(PlayerState state) {
        Unit unit;
        Intrinsics.checkNotNullParameter(state, "state");
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17551a(state);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyStateChanged missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20136a(Integer num) {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17563l();
            c3734ee.m17552a(num);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("startAndLoadSession missing tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: a */
    public void mo16827a(boolean z) {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            if (z) {
                c3734ee.m17554c();
            } else {
                c3734ee.m17553b();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyVideoBuffer missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: b */
    public void mo16828b() {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17562k();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyClick missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20137b(EnumC3709dc enumC3709dc, C3952o3 c3952o3, Integer num, List list) {
        this.f17126a.m16931e();
        m20141j();
        C3711de.a aVarM17285a = this.f17127b.m17285a(c3952o3, enumC3709dc, this.f17126a.m16929c(), this.f17126a.m16924a(), list, this.f17126a.m16934h(), this.f17126a.m16930d());
        if (aVarM17285a != null) {
            this.f17128c = new C3734ee(aVarM17285a, this.f17126a.m16933g());
        }
        m20136a(num);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: c */
    public void mo16829c() {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17560i();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyVideoSkipped missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: d */
    public void mo16830d() {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17555d();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyVideoComplete missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: e */
    public void mo16831e() {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17559h();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionNotifyVideoResumed missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3642ae
    /* JADX INFO: renamed from: f */
    public void mo16832f() {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17564m();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("onImpressionDestroyWebview missing om tracker", (Throwable) null, 2, (Object) null);
        }
        this.f17128c = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m20138g() {
        C3672bl c3672bl = this.f17129d;
        if (c3672bl != null) {
            c3672bl.m16980b();
        }
        this.f17129d = null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m20139h() {
        return this.f17126a.m16933g();
    }

    /* JADX INFO: renamed from: i */
    public final void m20140i() {
        Unit unit;
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17547a();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("signalImpressionEvent missing om tracker", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m20141j() {
        C3734ee c3734ee = this.f17128c;
        if (c3734ee != null) {
            c3734ee.m17564m();
        }
        this.f17128c = null;
    }
}
