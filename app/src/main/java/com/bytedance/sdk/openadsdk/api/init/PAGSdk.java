package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.xha.C2345ka;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.common.C2933di;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3300oh;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.jbs;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.p245mj.C3474ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.tan.C3537ri;
import com.bytedance.sdk.openadsdk.utils.dzy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    public interface PAGInitCallback {
        void fail(int i, String str);

        void success();
    }

    static {
        C3474ri.m15747ri();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && C3332vr.m14977ka() == 0) {
            C3474ri.f12551ri.add(pAGInitCallback);
        }
    }

    public static void closeMultiWebViewFileLock() {
        C3537ri.m16089ri();
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (C2933di.m11291ri()) {
            biddingTokenCallback.onBiddingTokenCollected("");
        } else {
            dzy.m16398ka(new AbstractRunnableC2676ik("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    C3299nr.m14641lr(context);
                    C3474ri.m15754ri(pAGBiddingRequest, new PAGBidCallback() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2.1
                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenCollected(String str) {
                            biddingTokenCallback.onBiddingTokenCollected(str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenFailed(PAGBidError pAGBidError) {
                            biddingTokenCallback.onBiddingTokenCollected("");
                        }
                    });
                    C3369ri.m15224ri().m15233ri(false);
                }
            });
        }
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (C2933di.m11291ri()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, jbs.m13550ri(10009)));
        } else {
            dzy.m16398ka(new AbstractRunnableC2676ik("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // java.lang.Runnable
                public void run() {
                    C3299nr.m14641lr(context);
                    C3474ri.m15754ri(pAGBiddingRequest, pAGBidCallback);
                    C3369ri.m15224ri().m15233ri(false);
                }
            });
        }
    }

    public static String getSDKVersion() {
        return C3300oh.m14646ri() != null ? C3300oh.m14646ri().mo13482ik() : "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public void run() {
                C3474ri.m15751ri(context, pAGConfig, pAGInitCallback);
            }
        });
        C3332vr.xha();
    }

    public static boolean isInitSuccess() {
        return C3332vr.m14977ka() == 1;
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2729uq.m10313ri(str);
        C2345ka.m8037ri(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && C3299nr.m14639ka().m14865nr() && isInitSuccess()) {
            C3521ka.m15942ri().m15959ri(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z) {
        C2933di.m11290ri(z);
    }
}
