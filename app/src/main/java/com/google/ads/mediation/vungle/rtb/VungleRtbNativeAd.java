package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.p298ui.view.MediaView;
import com.vungle.ads.nativead.NativeVideoListener;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class VungleRtbNativeAd extends UnifiedNativeAdMapper implements NativeAdListener {
    private final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> adLoadCallback;
    private String adMarkup;
    private MediaView mediaView;
    private NativeAd nativeAd;
    private MediationNativeAdCallback nativeAdCallback;
    private final VungleFactory vungleFactory;

    private static class VungleNativeMappedImage extends com.google.android.gms.ads.formats.NativeAd.Image {
        private Uri imageUri;

        public VungleNativeMappedImage(Uri uri) {
            this.imageUri = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.imageUri;
        }
    }

    public VungleRtbNativeAd(MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.adLoadCallback = mediationAdLoadCallback;
        this.vungleFactory = vungleFactory;
    }

    private void mapNativeAd() {
        setHeadline(this.nativeAd.getAdTitle());
        setBody(this.nativeAd.getAdBodyText());
        setCallToAction(this.nativeAd.getAdCallToActionText());
        Double adStarRating = this.nativeAd.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.nativeAd.getAdSponsoredText());
        setHasVideoContent(this.nativeAd.hasVideoContent());
        setMediaView(this.mediaView);
        this.mediaView.setNativeVideoListener(new NativeVideoListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.2
            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoEnd() {
                VungleRtbNativeAd.this.nativeAdCallback.onVideoComplete();
            }

            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoMute() {
                VungleRtbNativeAd.this.nativeAdCallback.onVideoMute();
            }

            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoPause() {
                VungleRtbNativeAd.this.nativeAdCallback.onVideoPause();
            }

            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoPlay() {
                VungleRtbNativeAd.this.nativeAdCallback.onVideoPlay();
            }

            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoUnmute() {
                VungleRtbNativeAd.this.nativeAdCallback.onVideoUnmute();
            }
        });
        String appIcon = this.nativeAd.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(AdPayload.FILE_SCHEME)) {
            setIcon(new VungleNativeMappedImage(Uri.parse(appIcon)));
        }
        setMediaContentAspectRatio(this.nativeAd.getMediaAspectRatio());
        if (VungleMediationAdapter.runtimeGmaSdkListensToAdapterReportedImpressions()) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.nativeAdCallback.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.adLoadCallback.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        mapNativeAd();
        this.nativeAdCallback = this.adLoadCallback.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
    }

    public void render(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        int i;
        final int i2;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        final VideoOptions videoOptions = nativeAdOptions.getVideoOptions();
        final Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
            return;
        }
        final String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            this.adLoadCallback.onFailure(adError2);
            return;
        }
        this.adMarkup = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            i = 3;
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i = 1;
                } else {
                    i2 = 2;
                }
            }
            final String watermark = mediationNativeAdConfiguration.getWatermark();
            VungleInitializer.getInstance().initialize(string, context, new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError adError3) {
                    Log.d(VungleMediationAdapter.TAG, adError3.toString());
                    VungleRtbNativeAd.this.adLoadCallback.onFailure(adError3);
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    VungleRtbNativeAd vungleRtbNativeAd = VungleRtbNativeAd.this;
                    vungleRtbNativeAd.nativeAd = vungleRtbNativeAd.vungleFactory.createNativeAd(context, string2);
                    VungleRtbNativeAd.this.nativeAd.setAdOptionsPosition(i2);
                    VungleRtbNativeAd.this.nativeAd.setAdListener(VungleRtbNativeAd.this);
                    if (videoOptions != null) {
                        VungleRtbNativeAd.this.nativeAd.getVideoOptions().setStartMuted(Boolean.valueOf(videoOptions.getStartMuted()));
                    }
                    VungleRtbNativeAd.this.mediaView = new MediaView(context);
                    if (!TextUtils.isEmpty(watermark)) {
                        VungleRtbNativeAd.this.nativeAd.getAdConfig().setWatermark(watermark);
                    }
                    VungleRtbNativeAd.this.nativeAd.load(VungleRtbNativeAd.this.adMarkup);
                }
            });
        }
        i = 0;
        i2 = i;
        final String watermark2 = mediationNativeAdConfiguration.getWatermark();
        VungleInitializer.getInstance().initialize(string, context, new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.1
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(AdError adError3) {
                Log.d(VungleMediationAdapter.TAG, adError3.toString());
                VungleRtbNativeAd.this.adLoadCallback.onFailure(adError3);
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                VungleRtbNativeAd vungleRtbNativeAd = VungleRtbNativeAd.this;
                vungleRtbNativeAd.nativeAd = vungleRtbNativeAd.vungleFactory.createNativeAd(context, string2);
                VungleRtbNativeAd.this.nativeAd.setAdOptionsPosition(i2);
                VungleRtbNativeAd.this.nativeAd.setAdListener(VungleRtbNativeAd.this);
                if (videoOptions != null) {
                    VungleRtbNativeAd.this.nativeAd.getVideoOptions().setStartMuted(Boolean.valueOf(videoOptions.getStartMuted()));
                }
                VungleRtbNativeAd.this.mediaView = new MediaView(context);
                if (!TextUtils.isEmpty(watermark2)) {
                    VungleRtbNativeAd.this.nativeAd.getAdConfig().setWatermark(watermark2);
                }
                VungleRtbNativeAd.this.nativeAd.load(VungleRtbNativeAd.this.adMarkup);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) throws Throwable {
        super.trackViews(view, map, map2);
        Log.d(VungleMediationAdapter.TAG, "trackViews()");
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (this.nativeAd == null) {
                return;
            }
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (!(childAt instanceof FrameLayout)) {
                Log.d(VungleMediationAdapter.TAG, "Vungle requires a FrameLayout to render the native ad.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ImageView imageView = null;
            View value = null;
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    value = entry.getValue();
                } else if (entry.getKey().equals("3010")) {
                    arrayList.add(this.mediaView);
                }
            }
            if (value instanceof ImageView) {
                imageView = (ImageView) value;
            } else {
                Log.d(VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
            }
            this.nativeAd.registerViewForInteraction((FrameLayout) childAt, this.mediaView, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) throws Throwable {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }
}
