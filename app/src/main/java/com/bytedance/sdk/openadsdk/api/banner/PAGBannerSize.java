package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.utils.C3574ik;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class PAGBannerSize {

    /* JADX INFO: renamed from: ik */
    private int f8540ik = 1;

    /* JADX INFO: renamed from: ka */
    private int f8541ka;

    /* JADX INFO: renamed from: lr */
    private int f8542lr;

    /* JADX INFO: renamed from: ri */
    private int f8543ri;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.f8543ri = i;
        this.f8542lr = i2;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        int iM16524ri = C3574ik.m16524ri(context, i, 0);
        if (iM16524ri == C3574ik.f13184ri) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, iM16524ri);
        pAGBannerSize.f8540ik = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int iM16523ri = C3574ik.m16523ri(context, 0);
        if (iM16523ri == C3574ik.f13184ri) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.f8541ka = iM16523ri;
        pAGBannerSize.f8540ik = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.f8541ka = i2;
        pAGBannerSize.f8540ik = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.f8542lr;
    }

    public int getMaxHeight() {
        return this.f8541ka;
    }

    public int getType() {
        return this.f8540ik;
    }

    public int getWidth() {
        return this.f8543ri;
    }
}
