package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.C11744X3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.a6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C3634a6 implements InterfaceC4052sf {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3764fl f13452a;

    public C3634a6(InterfaceC3764fl webViewFactory) {
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        this.f13452a = webViewFactory;
    }

    public /* synthetic */ C3634a6(InterfaceC3764fl interfaceC3764fl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C3802hd() : interfaceC3764fl);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4052sf
    /* JADX INFO: renamed from: a */
    public AbstractC3860k2 mo16805a(Context context, C4008qf renderableConfig, C4168y adMarkupConfig, EnumC4036s adFormat, InterfaceC4098uh trackerComponent, C3829ih telemetryManager, InterfaceC3991pk viewabilityComponent, Mediation mediation, C4058t c4058t) throws ChartboostError {
        ChartboostError chartboostError;
        ChartboostError invalidAdm;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        try {
            String strM19187l = renderableConfig.m19187l();
            EnumC4180yb enumC4180yb = EnumC4180yb.VAST;
            if (Intrinsics.areEqual(strM19187l, enumC4180yb.m20054b())) {
                return new C3716dj(context, renderableConfig.m19177b(), renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, viewabilityComponent, C3678c4.f13658b.mo17019a().mo18992f(), adFormat, this.f13452a, mediation);
            }
            EnumC4180yb enumC4180yb2 = EnumC4180yb.HTML;
            if (Intrinsics.areEqual(strM19187l, enumC4180yb2.m20054b())) {
                return new C3718dl(renderableConfig.m19177b(), null, adFormat.m19367b() ? EnumC4049sc.INLINE : EnumC4049sc.INTERSTITIAL, null, this.f13452a, renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, viewabilityComponent, null, mediation, c4058t, 2056, null);
            }
            ChartboostError.Load.InvalidAdm invalidAdm2 = new ChartboostError.Load.InvalidAdm("Unsupported markup type: " + renderableConfig.m19187l() + ". Supported types: " + enumC4180yb.m20054b() + ", " + enumC4180yb2.m20054b(), null);
            C4048sb.m19410b(C11744X3.j.f26438d + invalidAdm2.getCode() + "] Skipping unknown renderable config with type " + renderableConfig.m19187l(), invalidAdm2);
            return null;
        } catch (Exception e) {
            if (e instanceof ChartboostError.Load) {
                chartboostError = (ChartboostError.Load) e;
            } else {
                if (e instanceof IllegalArgumentException) {
                    invalidAdm = new ChartboostError.Load.InvalidAdm("Invalid renderable configuration: " + e.getMessage(), e);
                } else if (e instanceof OutOfMemoryError) {
                    chartboostError = ChartboostError.Load.NoStorage.INSTANCE;
                } else {
                    invalidAdm = new ChartboostError.Load.Internal("Failed to create renderable: " + e.getMessage(), e);
                }
                chartboostError = invalidAdm;
            }
            C4048sb.m19410b(C11744X3.j.f26438d + chartboostError.getCode() + "] Failed to create renderable for markup type: " + renderableConfig.m19187l(), chartboostError);
            throw chartboostError;
        }
    }
}
