package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.ironsource.qd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12445qd {

    /* JADX INFO: renamed from: a */
    private final C11707V0 f31792a;

    /* JADX INFO: renamed from: b */
    private final List<C12533tc> f31793b;

    /* JADX INFO: renamed from: c */
    private final AbstractC12593x0 f31794c;

    /* JADX INFO: renamed from: d */
    private final IronSource.EnumC12328a f31795d;

    /* JADX INFO: renamed from: com.ironsource.qd$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31796a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31796a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qd$b */
    public static final class b extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ NetworkSettings f31798c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AdapterBaseInterface f31799d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ AdData f31800e;

        b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f31798c = networkSettings;
            this.f31799d = adapterBaseInterface;
            this.f31800e = adData;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            C12445qd c12445qd = C12445qd.this;
            NetworkSettings networkSettings = this.f31798c;
            AdapterBaseInterface networkAdapter = this.f31799d;
            Intrinsics.checkNotNullExpressionValue(networkAdapter, "networkAdapter");
            c12445qd.m33196a(networkSettings, networkAdapter, this.f31800e);
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo27961a(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            C12445qd.this.f31792a.m33047e().m34220h().m27986g("initProvider - exception while calling networkAdapter.init with " + this.f31798c.getProviderName() + " - " + t);
        }
    }

    public C12445qd(C11707V0 adUnitTools, LevelPlay.AdFormat adFormat, List<C12533tc> providers, AbstractC12593x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f31792a = adUnitTools;
        this.f31793b = providers;
        this.f31794c = adUnitData;
        this.f31795d = m33195a(adFormat);
    }

    /* JADX INFO: renamed from: a */
    public final void m33200a() {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f31792a, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<C12533tc> it = this.f31793b.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsM33799f = it.next().m33799f();
            AdapterBaseInterface adapterBaseInterfaceM32322b = C12332c.m32303b().m32322b(networkSettingsM33799f, this.f31795d, uuidRandomUUID);
            if (m33199a(networkSettingsM33799f, adapterBaseInterfaceM32322b)) {
                C12536tf.m33823a(C12536tf.f32480a, new b(networkSettingsM33799f, adapterBaseInterfaceM32322b, this.f31794c.mo26466a(networkSettingsM33799f)), 0L, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m33196a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        m33198a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        m33198a("Done initializing provider %s on thread %s", networkSettings);
    }

    /* JADX INFO: renamed from: a */
    private final void m33198a(String str, NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        C11707V0 c11707v0 = this.f31792a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        ironLog.verbose(C12414p0.m33033a(c11707v0, str2, (String) null, 2, (Object) null));
    }

    /* JADX INFO: renamed from: a */
    private final boolean m33199a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        C11707V0 c11707v0 = this.f31792a;
        IronSource.EnumC12328a enumC12328a = this.f31795d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        if (c11707v0.m33238a(adapterBaseInterface, enumC12328a, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit(networkSettings.isBidder(this.f31795d));
    }

    /* JADX INFO: renamed from: a */
    private final IronSource.EnumC12328a m33195a(LevelPlay.AdFormat adFormat) {
        int i = a.f31796a[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.EnumC12328a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.EnumC12328a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.EnumC12328a.BANNER;
        }
        if (i == 4) {
            return IronSource.EnumC12328a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
