package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3019lr;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p252ri.p253fi.InterfaceC3495ri;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.qt */
/* JADX INFO: loaded from: classes3.dex */
class C3002qt extends PAGRewardedAd {

    /* JADX INFO: renamed from: fi */
    private final C2983aw f9216fi;

    /* JADX INFO: renamed from: ik */
    private InterfaceC3495ri f9217ik;

    /* JADX INFO: renamed from: ka */
    private final String f9218ka = C3593su.m16658ri();

    /* JADX INFO: renamed from: lr */
    private final AdSlot f9219lr;

    /* JADX INFO: renamed from: ri */
    private final C3289ri f9220ri;

    C3002qt(Context context, C3289ri c3289ri, AdSlot adSlot) {
        this.f9220ri = c3289ri;
        this.f9219lr = adSlot;
        this.f9216fi = new C2983aw(context, c3289ri, "rewarded_video", new C2983aw.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.qt.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.C2983aw.ri
            /* JADX INFO: renamed from: ri */
            public Intent mo11627ri(Context context2, wjv wjvVar, Activity activity) {
                if (wjvVar.zyn()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return wjvVar.m14383di() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.C2983aw.ri
            /* JADX INFO: renamed from: ri */
            public void mo11628ri(Intent intent, Activity activity, wjv wjvVar, boolean z) {
                C3019lr.m11951ri(intent, activity, C3002qt.this.f9216fi.m11620ik(), C3002qt.this.f9220ri, C3002qt.this.f9218ka);
                intent.putExtra("media_extra", C3002qt.this.f9219lr.getMediaExtra());
                intent.putExtra("user_id", C3002qt.this.f9219lr.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.C2983aw.ri
            /* JADX INFO: renamed from: ri */
            public void mo11629ri(wjv wjvVar) {
                C2993lr.m11711ri(wjvVar, C3002qt.this.f9216fi.m11620ik(), true);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.C2983aw.ri
            /* JADX INFO: renamed from: ri */
            public void mo11630ri(boolean z) {
                if (C3002qt.this.f9217ik == null) {
                    return;
                }
                if (z) {
                    C3197dw.m13337ri().m13356ri(C3002qt.this.f9218ka, C3002qt.this.f9217ik);
                } else {
                    C3197dw.m13337ri().m13353ri(C3002qt.this.f9217ik);
                }
                C3002qt.this.f9217ik = null;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.f9216fi.m11622ri(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.f9216fi.m11621lr();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.f9216fi.m11626ri(d, str, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m11780ri() {
        this.f9216fi.m11623ri();
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.f9217ik = new C3043sf(pAGRewardedAdInteractionCallback, this.f9220ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.f9217ik = new C3043sf(pAGRewardedAdInteractionListener, this.f9220ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        this.f9216fi.m11624ri(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.f9216fi.m11625ri(d);
    }
}
