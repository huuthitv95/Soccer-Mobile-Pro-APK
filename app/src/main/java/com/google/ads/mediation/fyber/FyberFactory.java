package com.google.ads.mediation.fyber;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FyberFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m43475d2 = {"Lcom/google/ads/mediation/fyber/FyberFactory;", "", "<init>", "()V", "createRewardedAdSpot", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;", "createInneractiveFullscreenUnitController", "Lcom/fyber/inneractive/sdk/external/InneractiveFullscreenUnitController;", "createNativeAdUnitController", "Lcom/fyber/inneractive/sdk/external/NativeAdUnitController;", "createNativeAdVideoContentController", "Lcom/fyber/inneractive/sdk/external/NativeAdVideoContentController;", "dtexchange_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
public final class FyberFactory {
    public static final FyberFactory INSTANCE = new FyberFactory();

    private FyberFactory() {
    }

    @JvmStatic
    public static final InneractiveFullscreenUnitController createInneractiveFullscreenUnitController() {
        return new InneractiveFullscreenUnitController();
    }

    @JvmStatic
    public static final NativeAdUnitController createNativeAdUnitController() {
        return new NativeAdUnitController();
    }

    @JvmStatic
    public static final NativeAdVideoContentController createNativeAdVideoContentController() {
        return new NativeAdVideoContentController();
    }

    @JvmStatic
    public static final InneractiveAdSpot createRewardedAdSpot() {
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        Intrinsics.checkNotNullExpressionValue(inneractiveAdSpotCreateSpot, "createSpot(...)");
        return inneractiveAdSpotCreateSpot;
    }
}
