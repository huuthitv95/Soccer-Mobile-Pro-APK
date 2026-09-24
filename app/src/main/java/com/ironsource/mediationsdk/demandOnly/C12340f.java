package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C11363B9;
import com.ironsource.C11453G9;
import com.ironsource.C12261j5;
import com.ironsource.C12317m4;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC11592O4;
import com.ironsource.InterfaceC11714V7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.C12352e;
import com.ironsource.mediationsdk.C12353f;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.f */
/* JADX INFO: loaded from: classes6.dex */
public class C12340f implements InterfaceC12343i.b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11592O4 f31143a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap<String, C12341g> f31144b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11714V7<ISDemandOnlyInterstitialListener> f31145c;

    public C12340f(List<NetworkSettings> list, C11363B9 c11363b9, C12332c c12332c, InterfaceC11714V7<ISDemandOnlyInterstitialListener> interfaceC11714V7, String str, String str2, InterfaceC11592O4 interfaceC11592O4) {
        String strM32764d = IronSourceUtils.m32764d();
        boolean zM25473j = c11363b9.m25473j();
        C12353f c12353f = new C12353f(c11363b9.m25470g(), strM32764d);
        this.f31144b = new ConcurrentHashMap<>();
        this.f31143a = interfaceC11592O4;
        this.f31145c = interfaceC11714V7;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterM32318a = c12332c.m32318a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (abstractAdapterM32318a != null) {
                    C12341g c12341g = new C12341g(str, str2, networkSettings, this.f31145c.mo27669a(networkSettings.getSubProviderId()), c11363b9.m25468e(), abstractAdapterM32318a, new C12352e(c12353f));
                    c12341g.m32436a(zM25473j);
                    this.f31144b.put(networkSettings.getSubProviderId(), c12341g);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.b
    /* JADX INFO: renamed from: a */
    public void mo32377a(InterfaceC12342h.d dVar) {
        String strMo32397e = dVar.mo32397e();
        String strMo32395b = dVar.mo32395b();
        try {
            C12341g c12341g = this.f31144b.get(strMo32397e);
            if (c12341g == null) {
                this.f31143a.mo26723a(EnumC12598x5.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, strMo32397e);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f31145c.mo27669a(strMo32397e).onInterstitialAdLoadFailed(strMo32397e, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(strMo32395b)) {
                c12341g.mo32393b();
            } else {
                c12341g.mo32390a(new InterfaceC12349o.a(C11453G9.m25865b(C12261j5.m31853b().m31855c(), strMo32395b)));
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f31145c.mo27669a(strMo32397e).onInterstitialAdLoadFailed(strMo32397e, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.b
    /* JADX INFO: renamed from: b */
    public boolean mo32379b(String str) {
        C12341g c12341g = this.f31144b.get(str);
        if (c12341g != null) {
            return c12341g.mo32392a();
        }
        this.f31143a.mo26723a(EnumC12598x5.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.b
    /* JADX INFO: renamed from: a */
    public void mo32378a(String str) {
        try {
            C12341g c12341g = this.f31144b.get(str);
            if (c12341g == null) {
                this.f31143a.mo26723a(EnumC12598x5.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f31145c.mo27669a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            c12341g.mo32394e();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f31145c.mo27669a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, C12341g> m32376a() {
        return this.f31144b;
    }
}
