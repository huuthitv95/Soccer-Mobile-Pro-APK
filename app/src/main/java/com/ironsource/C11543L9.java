package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.L9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11543L9 {

    /* JADX INFO: renamed from: a */
    public static final C11543L9 f25039a = new C11543L9();

    /* JADX INFO: renamed from: b */
    private static final C12211g9 f25040b = new C12211g9();

    /* JADX INFO: renamed from: com.ironsource.L9$a */
    public static final class a implements InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    private C11543L9() {
    }

    /* JADX INFO: renamed from: com.ironsource.L9$b */
    public static final class b implements InterfaceC12216ge {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f25041a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12189f5 f25042b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InitListener f25043c;

        b(Context context, C12189f5 c12189f5, InitListener initListener) {
            this.f25041a = context;
            this.f25042b = c12189f5;
            this.f25043c = initListener;
        }

        @Override // com.ironsource.InterfaceC12216ge
        /* JADX INFO: renamed from: a */
        public void mo26373a(C12100ae sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C11543L9.f25039a.m26363a(this.f25041a, sdkConfig.m31106d(), this.f25042b, this.f25043c);
        }

        @Override // com.ironsource.InterfaceC12216ge
        /* JADX INFO: renamed from: a */
        public void mo26374a(C12136ce error, C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            C11543L9.f25039a.m26369a(this.f25043c, this.f25042b, error);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26371a(final Context context, final InitRequest initRequest, final InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        f25040b.m31551a(new Runnable() { // from class: com.ironsource.L9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11543L9.m26370a(initRequest, context, initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26370a(InitRequest initRequest, Context context, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        C12189f5 c12189f5 = new C12189f5();
        C12428pe.f31723a.m33113c(context, new C12252ie(initRequest.getAppKey(), null, ArraysKt.toMutableList(f25040b.m31552a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c12189f5, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m26363a(Context context, C11494Ie c11494Ie, C12189f5 c12189f5, InitListener initListener) {
        String strM32674o = C12367p.m32628h().m32674o();
        C11732W8 c11732w8M26136g = c11494Ie.m26136g();
        Intrinsics.checkNotNullExpressionValue(c11732w8M26136g, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsM34240b = c11494Ie.m26141l().m34240b("IronSource");
        Intrinsics.checkNotNullExpressionValue(networkSettingsM34240b, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsM34240b.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        c11732w8M26136g.m27820a(new InterfaceC11740X.a(interstitialSettings, C11455Gb.f24351s.m25905d().mo25846h()));
        c11732w8M26136g.m27821a(ConfigFile.getConfigFile().getPluginType());
        c11732w8M26136g.m27824b(strM32674o);
        new C11774Z(new C12304lc()).mo28002a(context, c11732w8M26136g, new a());
        m26364a(c11494Ie, c12189f5, initListener);
    }

    /* JADX INFO: renamed from: a */
    private final void m26364a(C11494Ie c11494Ie, C12189f5 c12189f5, final InitListener initListener) {
        C11535L1 c11535l1M25547e;
        C11373C1 c11373c1M26602b = c11494Ie.m26133c().m26602b();
        new C11473Hb().m26007a((c11373c1M26602b == null || (c11535l1M25547e = c11373c1M26602b.m25547e()) == null) ? null : c11535l1M25547e.m26336b(), true);
        String sessionId = C12367p.m32628h().m32674o();
        C12170ec c12170ecM31373a = C12170ec.f30306e.m31373a();
        c12170ecM31373a.m31366a(c11494Ie.m26141l());
        c12170ecM31373a.m31365a(c11494Ie.m26133c());
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        c12170ecM31373a.m31367a(sessionId);
        c12170ecM31373a.m31372g();
        long jM31432a = C12189f5.m31432a(c12189f5);
        C12211g9 c12211g9 = f25040b;
        C11494Ie.a aVarM26138i = c11494Ie.m26138i();
        Intrinsics.checkNotNullExpressionValue(aVarM26138i, "serverResponse.origin");
        c12211g9.m31549a(jM31432a, aVarM26138i);
        c12211g9.m31554b(new Runnable() { // from class: com.ironsource.L9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C11543L9.m26368a(initListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26368a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m26369a(final InitListener initListener, C12189f5 c12189f5, final C12136ce c12136ce) {
        long jM31432a = C12189f5.m31432a(c12189f5);
        C12211g9 c12211g9 = f25040b;
        final C12136ce c12136ceM31553b = c12211g9.m31553b(c12136ce);
        c12211g9.m31550a(c12136ceM31553b, jM31432a);
        c12211g9.m31554b(new Runnable() { // from class: com.ironsource.L9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11543L9.m26367a(c12136ce, initListener, c12136ceM31553b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26367a(C12136ce error, InitListener initListener, C12136ce eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(f25040b.m31547a(eventError));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26372a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        C12367p.m32628h().m32652a(key, arrayList);
    }
}
