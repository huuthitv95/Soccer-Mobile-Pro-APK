package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.p183ik.C2967ri;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3019lr;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p252ri.p254ik.InterfaceC3496lr;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.mj */
/* JADX INFO: loaded from: classes3.dex */
class C3000mj extends PAGInterstitialAd {

    /* JADX INFO: renamed from: ik */
    private final String f9210ik = C3593su.m16658ri();

    /* JADX INFO: renamed from: ka */
    private final C2983aw f9211ka;

    /* JADX INFO: renamed from: lr */
    private InterfaceC3496lr f9212lr;

    /* JADX INFO: renamed from: ri */
    private final C3289ri f9213ri;

    C3000mj(Context context, C3289ri c3289ri) {
        this.f9213ri = c3289ri;
        this.f9211ka = new C2983aw(context, c3289ri, "fullscreen_interstitial_ad", new C2983aw.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.mj.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.C2983aw.ri
            /* JADX INFO: renamed from: ri */
            public Intent mo11627ri(Context context2, wjv wjvVar, Activity activity) {
                if (wjvVar.zyn()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return wjvVar.m14383di() ? new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.C2983aw.ri
            /* JADX INFO: renamed from: ri */
            public void mo11628ri(Intent intent, Activity activity, wjv wjvVar, boolean z) {
                C3019lr.m11951ri(intent, activity, C3000mj.this.f9211ka.m11620ik(), C3000mj.this.f9213ri, C3000mj.this.f9210ik);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.C2983aw.ri
            /* JADX INFO: renamed from: ri */
            public void mo11629ri(wjv wjvVar) {
                C2993lr.m11711ri(wjvVar, C3000mj.this.f9211ka.m11620ik(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.C2983aw.ri
            /* JADX INFO: renamed from: ri */
            public void mo11630ri(boolean z) {
                if (C3000mj.this.f9212lr == null) {
                    return;
                }
                if (z) {
                    C3197dw.m13337ri().m13356ri(C3000mj.this.f9210ik, C3000mj.this.f9212lr);
                } else {
                    C3197dw.m13337ri().m13354ri(C3000mj.this.f9212lr);
                }
                C3000mj.this.f9212lr = null;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.f9211ka.m11622ri(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.f9211ka.m11621lr();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.f9211ka.m11626ri(d, str, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m11771ri() {
        this.f9211ka.m11623ri();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.f9212lr = new C2967ri(pAGInterstitialAdInteractionCallback, this.f9213ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.f9212lr = new C2967ri(pAGInterstitialAdInteractionListener, this.f9213ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.f9211ka.m11624ri(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.f9211ka.m11625ri(d);
    }
}
