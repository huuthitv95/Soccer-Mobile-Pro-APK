package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ra */
/* JADX INFO: loaded from: classes6.dex */
public final class C11649Ra {

    /* JADX INFO: renamed from: a */
    public static final C11649Ra f25574a = new C11649Ra();

    /* JADX INFO: renamed from: com.ironsource.Ra$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final boolean f25575a;

        /* JADX INFO: renamed from: b */
        private final long f25576b;

        /* JADX INFO: renamed from: c */
        private final long f25577c;

        public a(boolean z, long j, long j2) {
            this.f25575a = z;
            this.f25576b = j;
            this.f25577c = j2;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m27367a() {
            return this.f25575a;
        }

        /* JADX INFO: renamed from: b */
        public final long m27368b() {
            return this.f25576b;
        }

        /* JADX INFO: renamed from: c */
        public final long m27369c() {
            return this.f25577c;
        }

        /* JADX INFO: renamed from: d */
        public final long m27370d() {
            return this.f25576b;
        }

        /* JADX INFO: renamed from: e */
        public final long m27371e() {
            return this.f25577c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25575a == aVar.f25575a && this.f25576b == aVar.f25576b && this.f25577c == aVar.f25577c;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m27372f() {
            return this.f25575a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.f25575a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f25576b)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f25577c);
        }

        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.f25575a + ", refreshInterval=" + this.f25576b + ", visibilityCheckerInterval=" + this.f25577c + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m27366a(boolean z, long j, long j2) {
            return new a(z, j, j2);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m27365a(a aVar, boolean z, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f25575a;
            }
            if ((i & 2) != 0) {
                j = aVar.f25576b;
            }
            if ((i & 4) != 0) {
                j2 = aVar.f25577c;
            }
            return aVar.m27366a(z, j, j2);
        }
    }

    private C11649Ra() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC12567va m27364a(C12414p0 adTools, C11726W2 bannerContainer, a config, C11500J2 bannerAdProperties, InterfaceC12585wa strategyListener, InterfaceC11572N2 bannerAdUnitFactory, InterfaceC12400o4 timeProvider) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + config.m27372f() + ", refreshInterval: " + config.m27370d());
        if (config.m27372f()) {
            return new C12639za(adTools, bannerContainer, config.m27370d(), config.m27371e(), bannerAdProperties, strategyListener, bannerAdUnitFactory, null, timeProvider, C11455Gb.f24351s.m25905d().mo25846h().mo32195v(), 128, null);
        }
        C11544La c11544La = new C11544La(adTools, bannerContainer, bannerAdUnitFactory);
        c11544La.mo26380a(strategyListener);
        return c11544La;
    }
}
