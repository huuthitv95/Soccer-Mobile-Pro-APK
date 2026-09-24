package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12418p4 {

    /* JADX INFO: renamed from: a */
    private final String f31675a;

    /* JADX INFO: renamed from: b */
    private final String f31676b;

    /* JADX INFO: renamed from: c */
    private final String f31677c;

    /* JADX INFO: renamed from: d */
    private final String f31678d;

    public C12418p4() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m33053a() {
        return this.f31675a;
    }

    /* JADX INFO: renamed from: b */
    public final String m33054b() {
        return this.f31676b;
    }

    /* JADX INFO: renamed from: c */
    public final String m33055c() {
        return this.f31677c;
    }

    /* JADX INFO: renamed from: d */
    public final String m33056d() {
        return this.f31678d;
    }

    /* JADX INFO: renamed from: e */
    public final String m33057e() {
        return this.f31678d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12418p4)) {
            return false;
        }
        C12418p4 c12418p4 = (C12418p4) obj;
        return Intrinsics.areEqual(this.f31675a, c12418p4.f31675a) && Intrinsics.areEqual(this.f31676b, c12418p4.f31676b) && Intrinsics.areEqual(this.f31677c, c12418p4.f31677c) && Intrinsics.areEqual(this.f31678d, c12418p4.f31678d);
    }

    /* JADX INFO: renamed from: f */
    public final String m33058f() {
        return this.f31677c;
    }

    /* JADX INFO: renamed from: g */
    public final String m33059g() {
        return this.f31675a;
    }

    /* JADX INFO: renamed from: h */
    public final String m33060h() {
        return this.f31676b;
    }

    public int hashCode() {
        return (((((this.f31675a.hashCode() * 31) + this.f31676b.hashCode()) * 31) + this.f31677c.hashCode()) * 31) + this.f31678d.hashCode();
    }

    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f31675a + ", customRewardedVideoAdapterName=" + this.f31676b + ", customInterstitialAdapterName=" + this.f31677c + ", customBannerAdapterName=" + this.f31678d + ")";
    }

    public C12418p4(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.f31675a = customNetworkAdapterName;
        this.f31676b = customRewardedVideoAdapterName;
        this.f31677c = customInterstitialAdapterName;
        this.f31678d = customBannerAdapterName;
    }

    /* JADX INFO: renamed from: a */
    public final C12418p4 m33052a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new C12418p4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12418p4 m33051a(C12418p4 c12418p4, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12418p4.f31675a;
        }
        if ((i & 2) != 0) {
            str2 = c12418p4.f31676b;
        }
        if ((i & 4) != 0) {
            str3 = c12418p4.f31677c;
        }
        if ((i & 8) != 0) {
            str4 = c12418p4.f31678d;
        }
        return c12418p4.m33052a(str, str2, str3, str4);
    }

    public /* synthetic */ C12418p4(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
