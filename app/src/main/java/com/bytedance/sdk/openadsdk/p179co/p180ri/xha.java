package com.bytedance.sdk.openadsdk.p179co.p180ri;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.p168ri.AbstractC2698ka;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC2698ka<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lr */
    private final String f8743lr;

    /* JADX INFO: renamed from: ri */
    private final dzy f8744ri;

    public xha(String str, dzy dzyVar) {
        this.f8744ri = dzyVar;
        this.f8743lr = str;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11228ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10186ri("appInfo", new xha("appInfo", dzyVar));
        c2705vr.m10186ri("adInfo", new xha("adInfo", dzyVar));
        c2705vr.m10186ri("sendLog", new xha("sendLog", dzyVar));
        c2705vr.m10186ri("playable_style", new xha("playable_style", dzyVar));
        c2705vr.m10186ri("getTemplateInfo", new xha("getTemplateInfo", dzyVar));
        c2705vr.m10186ri("getTeMaiAds", new xha("getTeMaiAds", dzyVar));
        c2705vr.m10186ri(C11744X3.i.f26382o, new xha(C11744X3.i.f26382o, dzyVar));
        c2705vr.m10186ri("getScreenSize", new xha("getScreenSize", dzyVar));
        c2705vr.m10186ri("getCloseButtonInfo", new xha("getCloseButtonInfo", dzyVar));
        c2705vr.m10186ri("getVolume", new xha("getVolume", dzyVar));
        c2705vr.m10186ri("removeLoading", new xha("removeLoading", dzyVar));
        c2705vr.m10186ri("sendReward", new xha("sendReward", dzyVar));
        c2705vr.m10186ri("subscribe_app_ad", new xha("subscribe_app_ad", dzyVar));
        c2705vr.m10186ri("download_app_ad", new xha("download_app_ad", dzyVar));
        c2705vr.m10186ri("cancel_download_app_ad", new xha("cancel_download_app_ad", dzyVar));
        c2705vr.m10186ri("unsubscribe_app_ad", new xha("unsubscribe_app_ad", dzyVar));
        c2705vr.m10186ri("landscape_click", new xha("landscape_click", dzyVar));
        c2705vr.m10186ri("clickEvent", new xha("clickEvent", dzyVar));
        c2705vr.m10186ri("renderDidFinish", new xha("renderDidFinish", dzyVar));
        c2705vr.m10186ri("dynamicTrack", new xha("dynamicTrack", dzyVar));
        c2705vr.m10186ri("skipVideo", new xha("skipVideo", dzyVar));
        c2705vr.m10186ri(FyberMediationAdapter.KEY_MUTE_VIDEO, new xha(FyberMediationAdapter.KEY_MUTE_VIDEO, dzyVar));
        c2705vr.m10186ri("changeVideoState", new xha("changeVideoState", dzyVar));
        c2705vr.m10186ri("getCurrentVideoState", new xha("getCurrentVideoState", dzyVar));
        c2705vr.m10186ri("send_temai_product_ids", new xha("send_temai_product_ids", dzyVar));
        c2705vr.m10186ri("getMaterialMeta", new xha("getMaterialMeta", dzyVar));
        c2705vr.m10186ri("endcard_load", new xha("endcard_load", dzyVar));
        c2705vr.m10186ri("pauseWebView", new xha("pauseWebView", dzyVar));
        c2705vr.m10186ri("pauseWebViewTimers", new xha("pauseWebViewTimers", dzyVar));
        c2705vr.m10186ri("webview_time_track", new xha("webview_time_track", dzyVar));
        c2705vr.m10186ri("openPrivacy", new xha("openPrivacy", dzyVar));
        c2705vr.m10186ri("openAdLandPageLinks", new xha("openAdLandPageLinks", dzyVar));
        c2705vr.m10186ri("getNativeSiteCustomData", new xha("getNativeSiteCustomData", dzyVar));
        c2705vr.m10186ri("close", new xha("close", dzyVar));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        dzy.C3209lr c3209lr = new dzy.C3209lr();
        c3209lr.f10640ri = NotificationCompat.CATEGORY_CALL;
        c3209lr.f10637ik = this.f8743lr;
        c3209lr.f10638ka = jSONObject;
        return this.f8744ri.m13449ri(c3209lr, 3);
    }
}
