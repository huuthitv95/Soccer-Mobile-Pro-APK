package com.google.ads.mediation.mintegral.mediation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MintegralNativeAd extends UnifiedNativeAdMapper implements OnMBMediaViewListener {
    protected static final double MINTEGRAL_SDK_IMAGE_SCALE = 1.0d;
    protected final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> adLoadCallback;
    protected Campaign campaign;
    private final boolean muted;
    MediationNativeAdCallback nativeCallback;

    public class MBridgeNativeMappedImage extends NativeAd.Image {
        private final Drawable drawable;
        private final Uri imageUri;
        private final double scale;

        public MBridgeNativeMappedImage(Drawable drawable, Uri uri, double d) {
            this.drawable = drawable;
            this.imageUri = uri;
            this.scale = d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.scale;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.imageUri;
        }
    }

    public MintegralNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.muted = MintegralUtils.shouldMuteAudio(mediationNativeAdConfiguration.getMediationExtras());
        this.adLoadCallback = mediationAdLoadCallback;
    }

    public abstract void loadAd(MediationNativeAdConfiguration mediationNativeAdConfiguration);

    protected void mapNativeAd(Campaign campaign, Context context) {
        MintegralNativeAd mintegralNativeAd;
        this.campaign = campaign;
        if (campaign.getAppName() != null) {
            setHeadline(this.campaign.getAppName());
        }
        if (this.campaign.getAppDesc() != null) {
            setBody(this.campaign.getAppDesc());
        }
        if (this.campaign.getAdCall() != null) {
            setCallToAction(this.campaign.getAdCall());
        }
        setStarRating(Double.valueOf(this.campaign.getRating()));
        if (TextUtils.isEmpty(this.campaign.getIconUrl())) {
            mintegralNativeAd = this;
        } else {
            mintegralNativeAd = this;
            setIcon(mintegralNativeAd.new MBridgeNativeMappedImage(null, Uri.parse(this.campaign.getIconUrl()), 1.0d));
        }
        MBMediaView mBMediaView = new MBMediaView(context);
        mBMediaView.setVideoSoundOnOff(!mintegralNativeAd.muted);
        mBMediaView.setNativeAd(mintegralNativeAd.campaign);
        setMediaView(mBMediaView);
        MBAdChoice mBAdChoice = new MBAdChoice(context);
        mBAdChoice.setCampaign(mintegralNativeAd.campaign);
        setAdChoicesContent(mBAdChoice);
        setOverrideClickHandling(true);
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onStartRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.nativeCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
        }
    }

    protected List traversalView(View view) {
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            if (view instanceof MediaView) {
                arrayList.add(view);
                return arrayList;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                        arrayList.addAll(traversalView(viewGroup.getChildAt(i)));
                    } else {
                        arrayList.add(viewGroup.getChildAt(i));
                    }
                }
            } else if (view instanceof View) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }
}
