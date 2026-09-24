package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12277k3 implements InterfaceC12203g1 {

    /* JADX INFO: renamed from: a */
    private final C11573N3 f30724a;

    /* JADX INFO: renamed from: b */
    private final C12624yd f30725b;

    /* JADX INFO: renamed from: c */
    private final IronSource.EnumC12328a f30726c;

    /* JADX INFO: renamed from: com.ironsource.k3$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30727a;

        static {
            int[] iArr = new int[IronSource.EnumC12328a.values().length];
            try {
                iArr[IronSource.EnumC12328a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.EnumC12328a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.EnumC12328a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30727a = iArr;
        }
    }

    public C12277k3(C11573N3 adFormatConfigurations, C12624yd c12624yd, IronSource.EnumC12328a adFormat) {
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f30724a = adFormatConfigurations;
        this.f30725b = c12624yd;
        this.f30726c = adFormat;
    }

    @Override // com.ironsource.InterfaceC12203g1
    /* JADX INFO: renamed from: a */
    public InterfaceC12283k9 mo31515a(InterfaceC12463rd providerName) {
        NetworkSettings networkSettingsM34240b;
        C11652Rd c11652RdM26606f;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        C12624yd c12624yd = this.f30725b;
        if (c12624yd == null || (networkSettingsM34240b = c12624yd.m34240b(providerName.value())) == null) {
            return null;
        }
        int i = a.f30727a[this.f30726c.ordinal()];
        if (i == 1) {
            C11692U2 c11692u2M26603c = this.f30724a.m26603c();
            if (c11692u2M26603c != null) {
                return new C11777Z2(new C12159e1(networkSettingsM34240b, networkSettingsM34240b.getBannerSettings(), this.f30726c), c11692u2M26603c);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (c11652RdM26606f = this.f30724a.m26606f()) != null) {
                return new C11493Id(new C12159e1(networkSettingsM34240b, networkSettingsM34240b.getRewardedVideoSettings(), this.f30726c), c11652RdM26606f);
            }
            return null;
        }
        C11363B9 c11363b9M26604d = this.f30724a.m26604d();
        if (c11363b9M26604d != null) {
            return new C11417E9(new C12159e1(networkSettingsM34240b, networkSettingsM34240b.getInterstitialSettings(), this.f30726c), c11363b9M26604d);
        }
        return null;
    }
}
