package com.bytedance.sdk.openadsdk.p252ri.p256lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3503ka implements PAGNativeAdData {

    /* JADX INFO: renamed from: ri */
    private final C3506ri f12689ri;

    public C3503ka(C3506ri c3506ri) {
        this.f12689ri = c3506ri;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        C3506ri c3506ri = this.f12689ri;
        if (c3506ri != null) {
            return c3506ri.m15899sf();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        C3506ri c3506ri = this.f12689ri;
        if (c3506ri != null) {
            return c3506ri.m15889qt();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        C3506ri c3506ri = this.f12689ri;
        if (c3506ri != null) {
            return c3506ri.m15883di();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        C3506ri c3506ri = this.f12689ri;
        if (c3506ri != null) {
            return c3506ri.m15884fi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        C3506ri c3506ri = this.f12689ri;
        if (c3506ri != null) {
            return c3506ri.m15885ik();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return wjv.m14332fi(this.f12689ri.f12717ri) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        C3506ri c3506ri = this.f12689ri;
        if (c3506ri != null) {
            return c3506ri.xha();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        C3506ri c3506ri = this.f12689ri;
        if (c3506ri != null) {
            return c3506ri.m15886ka();
        }
        return null;
    }
}
