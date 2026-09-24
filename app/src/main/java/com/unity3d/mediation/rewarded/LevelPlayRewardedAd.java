package com.unity3d.mediation.rewarded;

import android.app.Activity;
import com.ironsource.C11426F0;
import com.ironsource.C11455Gb;
import com.ironsource.C11717Va;
import com.ironsource.C11775Z0;
import com.ironsource.C12128c6;
import com.ironsource.C12303lb;
import com.ironsource.C12414p0;
import com.ironsource.C12546u7;
import com.ironsource.InterfaceC12400o4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayRewardedAd {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final String f41497a;

    /* JADX INFO: renamed from: b */
    private final C12303lb f41498b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isPlacementCapped(String placementName) {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            return C11717Va.f26021o.m27727a(placementName, LevelPlay.AdFormat.REWARDED);
        }
    }

    public static final class Config implements C11717Va.b {
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a */
        private final Double f41499a;

        public static final class Builder {

            /* JADX INFO: renamed from: a */
            private Double f41500a;

            public final Config build() {
                return new Config(this.f41500a);
            }

            public final Builder setBidFloor(double d) {
                this.f41500a = Double.valueOf(d);
                return this;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Config(Double d) {
            this.f41499a = d;
        }

        public /* synthetic */ Config(Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = config.f41499a;
            }
            return config.copy(d);
        }

        public final Double component1() {
            return this.f41499a;
        }

        public final Config copy(Double d) {
            return new Config(d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.areEqual((Object) this.f41499a, (Object) ((Config) obj).f41499a);
        }

        @Override // com.ironsource.C11717Va.b
        public Double getBidFloor() {
            return this.f41499a;
        }

        public int hashCode() {
            Double d = this.f41499a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        public String toString() {
            return "Config(bidFloor=" + this.f41499a + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId) {
        this(adUnitId, Config.Companion.empty());
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public LevelPlayRewardedAd(String adUnitId, C11717Va.c payload) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + payload.m27731d());
        this.f41497a = adUnitId;
        this.f41498b = new C12303lb(adUnitId, payload.m27731d(), payload.m27729b(), payload.m27728a(), payload.m27734g(), payload.m27732e(), payload.m27733f(), payload.m27730c());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId, Config config) {
        this(adUnitId, new C11717Va.c(new C12414p0(IronSource.EnumC12328a.REWARDED_VIDEO, C11426F0.b.MEDIATION), new C12128c6(), C11455Gb.f24351s.m25905d(), new InterfaceC12400o4.a(), C12546u7.f32555a, config, new C11775Z0()));
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    public static /* synthetic */ LevelPlayReward getReward$default(LevelPlayRewardedAd levelPlayRewardedAd, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return levelPlayRewardedAd.getReward(str);
    }

    @JvmStatic
    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayRewardedAd levelPlayRewardedAd, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayRewardedAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.f41498b.m32079a();
    }

    public final String getAdUnitId() {
        return this.f41497a;
    }

    public final LevelPlayReward getReward() {
        return getReward$default(this, null, 1, null);
    }

    public final LevelPlayReward getReward(String str) {
        return this.f41498b.m32078a(str);
    }

    public final boolean isAdReady() {
        return this.f41498b.m32082b();
    }

    public final void loadAd() {
        this.f41498b.m32083c();
    }

    public final void setListener(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        this.f41498b.m32081a(levelPlayRewardedAdListener);
    }

    public final void showAd(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    public final void showAd(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f41498b.m32080a(activity, str);
    }
}
