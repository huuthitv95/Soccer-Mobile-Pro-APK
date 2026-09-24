package com.bytedance.sdk.openadsdk.p252ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.jbs;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.settings.xha;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.Constants;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3513ri {
    /* JADX INFO: renamed from: ri */
    public static void m15918ri(final AbstractRunnableC2676ik abstractRunnableC2676ik, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                if (!C3332vr.m14975fi()) {
                    PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (!C3307lr.m14718ri().m14733sf() || !C3304qt.m14669lr().m14701sf()) {
                    C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.ri.ri.1.1
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr(Constants.LOAD_AD);
                            c3481ri.m15777ik(adSlot.getCodeId());
                            c3481ri.m15780ka(C3571ig.m16444ik(adSlot.getDurationSlotType()));
                            c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                            c3481ri.xha(C3571ig.m16479ri(adSlot).toString());
                            return c3481ri;
                        }
                    });
                    dzy.m16395ik(abstractRunnableC2676ik);
                } else {
                    PAGLoadListener pAGLoadListener3 = pAGLoadListener;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, jbs.m13550ri(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED));
                    }
                }
            }
        };
        if (C3332vr.m14975fi()) {
            runnable.run();
        } else {
            C3332vr.m14978lr().post(runnable);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15919ri(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!C3332vr.m14975fi() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID) != null) {
            builder.setCreativeId(extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID).toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15920ri(PAGLoadListener pAGLoadListener) {
        if (xha.m14907ri()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15921ri(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
