package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.C11726W2;
import com.ironsource.C12546u7;
import com.ironsource.C12603xa;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final C12603xa f41482a;

    public static final class Config {
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: a */
        private final LevelPlayAdSize f41483a;

        /* JADX INFO: renamed from: b */
        private final Double f41484b;

        /* JADX INFO: renamed from: c */
        private final String f41485c;

        public static final class Builder {

            /* JADX INFO: renamed from: a */
            private LevelPlayAdSize f41486a;

            /* JADX INFO: renamed from: b */
            private Double f41487b;

            /* JADX INFO: renamed from: c */
            private String f41488c;

            public final Config build() {
                return new Config(this.f41486a, this.f41487b, this.f41488c);
            }

            public final Builder setAdSize(LevelPlayAdSize adSize) {
                Intrinsics.checkNotNullParameter(adSize, "adSize");
                this.f41486a = adSize;
                return this;
            }

            public final Builder setBidFloor(double d) {
                this.f41487b = Double.valueOf(d);
                return this;
            }

            public final Builder setPlacementName(String placementName) {
                Intrinsics.checkNotNullParameter(placementName, "placementName");
                this.f41488c = placementName;
                return this;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public Config(LevelPlayAdSize levelPlayAdSize, Double d, String str) {
            this.f41483a = levelPlayAdSize;
            this.f41484b = d;
            this.f41485c = str;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : levelPlayAdSize, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                levelPlayAdSize = config.f41483a;
            }
            if ((i & 2) != 0) {
                d = config.f41484b;
            }
            if ((i & 4) != 0) {
                str = config.f41485c;
            }
            return config.copy(levelPlayAdSize, d, str);
        }

        public final LevelPlayAdSize component1() {
            return this.f41483a;
        }

        public final Double component2() {
            return this.f41484b;
        }

        public final String component3() {
            return this.f41485c;
        }

        public final Config copy(LevelPlayAdSize levelPlayAdSize, Double d, String str) {
            return new Config(levelPlayAdSize, d, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.areEqual(this.f41483a, config.f41483a) && Intrinsics.areEqual((Object) this.f41484b, (Object) config.f41484b) && Intrinsics.areEqual(this.f41485c, config.f41485c);
        }

        public final LevelPlayAdSize getAdSize() {
            return this.f41483a;
        }

        public final Double getBidFloor() {
            return this.f41484b;
        }

        public final String getPlacementName() {
            return this.f41485c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.f41483a;
            int iHashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d = this.f41484b;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.f41485c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Config(adSize=" + this.f41483a + ", bidFloor=" + this.f41484b + ", placementName=" + this.f41485c + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("context: " + context.getClass().getSimpleName());
        Pair<String, Config> pairM34176a = C12603xa.f33167n.m34176a(context, attributeSet);
        this.f41482a = m43199a(pairM34176a.component1(), pairM34176a.component2());
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId) {
        this(context, adUnitId, Config.Companion.empty());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId, Config config) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f41482a = m43199a(adUnitId, config);
    }

    /* JADX INFO: renamed from: a */
    private final C11726W2 m43198a(Context context) {
        C11726W2 c11726w2 = new C11726W2(context);
        c11726w2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c11726w2;
    }

    /* JADX INFO: renamed from: a */
    private final C12603xa m43199a(String str, Config config) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        C11726W2 c11726w2M43198a = m43198a(context);
        addView(c11726w2M43198a);
        return new C12603xa(C12546u7.f32555a.m33891a(), str, c11726w2M43198a, config, null, 16, null);
    }

    public final void destroy() {
        this.f41482a.m34163b();
    }

    public final String getAdId() {
        String string = this.f41482a.m34165c().toString();
        Intrinsics.checkNotNullExpressionValue(string, "bannerViewInternal.adId.toString()");
        return string;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f41482a.m34167d();
    }

    public final String getAdUnitId() {
        return this.f41482a.m34169e();
    }

    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f41482a.m34171f();
    }

    public final String getPlacementName() {
        return this.f41482a.m34172g();
    }

    public final void loadAd() {
        this.f41482a.m34173i();
    }

    public final void pauseAutoRefresh() {
        this.f41482a.m34174j();
    }

    public final void resumeAutoRefresh() {
        this.f41482a.m34175k();
    }

    public final void setBannerListener(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f41482a.m34162a(levelPlayBannerAdViewListener);
    }
}
