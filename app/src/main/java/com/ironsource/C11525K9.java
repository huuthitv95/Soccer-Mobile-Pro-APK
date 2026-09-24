package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.K9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11525K9 {

    /* JADX INFO: renamed from: a */
    private final int f24819a;

    /* JADX INFO: renamed from: b */
    private final String f24820b;

    /* JADX INFO: renamed from: c */
    private final JSONObject f24821c;

    /* JADX INFO: renamed from: d */
    private final C12520t f24822d;

    /* JADX INFO: renamed from: e */
    private final C12520t f24823e;

    /* JADX INFO: renamed from: f */
    private final C12520t f24824f;

    public C11525K9(int i, String controllerUrl, JSONObject controllerConfig, C12520t bannerConfig, C12520t interstitialConfig, C12520t rewardedConfig) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        this.f24819a = i;
        this.f24820b = controllerUrl;
        this.f24821c = controllerConfig;
        this.f24822d = bannerConfig;
        this.f24823e = interstitialConfig;
        this.f24824f = rewardedConfig;
    }

    /* JADX INFO: renamed from: a */
    public final int m26269a() {
        return this.f24819a;
    }

    /* JADX INFO: renamed from: b */
    public final String m26271b() {
        return this.f24820b;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m26272c() {
        return this.f24821c;
    }

    /* JADX INFO: renamed from: d */
    public final C12520t m26273d() {
        return this.f24822d;
    }

    /* JADX INFO: renamed from: e */
    public final C12520t m26274e() {
        return this.f24823e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11525K9)) {
            return false;
        }
        C11525K9 c11525k9 = (C11525K9) obj;
        return this.f24819a == c11525k9.f24819a && Intrinsics.areEqual(this.f24820b, c11525k9.f24820b) && Intrinsics.areEqual(this.f24821c, c11525k9.f24821c) && Intrinsics.areEqual(this.f24822d, c11525k9.f24822d) && Intrinsics.areEqual(this.f24823e, c11525k9.f24823e) && Intrinsics.areEqual(this.f24824f, c11525k9.f24824f);
    }

    /* JADX INFO: renamed from: f */
    public final C12520t m26275f() {
        return this.f24824f;
    }

    /* JADX INFO: renamed from: g */
    public final C12520t m26276g() {
        return this.f24822d;
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m26277h() {
        return this.f24821c;
    }

    public int hashCode() {
        return (((((((((this.f24819a * 31) + this.f24820b.hashCode()) * 31) + this.f24821c.hashCode()) * 31) + this.f24822d.hashCode()) * 31) + this.f24823e.hashCode()) * 31) + this.f24824f.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m26278i() {
        return this.f24820b;
    }

    /* JADX INFO: renamed from: j */
    public final C12520t m26279j() {
        return this.f24823e;
    }

    /* JADX INFO: renamed from: k */
    public final int m26280k() {
        return this.f24819a;
    }

    /* JADX INFO: renamed from: l */
    public final C12520t m26281l() {
        return this.f24824f;
    }

    public String toString() {
        return "IronSourceAdsInitConfig(logLevel=" + this.f24819a + ", controllerUrl=" + this.f24820b + ", controllerConfig=" + this.f24821c + ", bannerConfig=" + this.f24822d + ", interstitialConfig=" + this.f24823e + ", rewardedConfig=" + this.f24824f + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11525K9 m26270a(int i, String controllerUrl, JSONObject controllerConfig, C12520t bannerConfig, C12520t interstitialConfig, C12520t rewardedConfig) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        Intrinsics.checkNotNullParameter(bannerConfig, "bannerConfig");
        Intrinsics.checkNotNullParameter(interstitialConfig, "interstitialConfig");
        Intrinsics.checkNotNullParameter(rewardedConfig, "rewardedConfig");
        return new C11525K9(i, controllerUrl, controllerConfig, bannerConfig, interstitialConfig, rewardedConfig);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11525K9 m26268a(C11525K9 c11525k9, int i, String str, JSONObject jSONObject, C12520t c12520t, C12520t c12520t2, C12520t c12520t3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c11525k9.f24819a;
        }
        if ((i2 & 2) != 0) {
            str = c11525k9.f24820b;
        }
        if ((i2 & 4) != 0) {
            jSONObject = c11525k9.f24821c;
        }
        if ((i2 & 8) != 0) {
            c12520t = c11525k9.f24822d;
        }
        if ((i2 & 16) != 0) {
            c12520t2 = c11525k9.f24823e;
        }
        if ((i2 & 32) != 0) {
            c12520t3 = c11525k9.f24824f;
        }
        C12520t c12520t4 = c12520t2;
        C12520t c12520t5 = c12520t3;
        return c11525k9.m26270a(i, str, jSONObject, c12520t, c12520t4, c12520t5);
    }
}
