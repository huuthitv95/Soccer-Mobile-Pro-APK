package com.bytedance.sdk.openadsdk.p179co.p180ri;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.p168ri.AbstractC2701nr;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.ironsource.C11744X3;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.co.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2917mj extends AbstractC2701nr<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ri */
    public static final HashSet<String> f8725ri = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", C11744X3.i.f26382o, "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", FyberMediationAdapter.KEY_MUTE_VIDEO, "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));

    /* JADX INFO: renamed from: lr */
    private final dzy f8726lr;

    public C2917mj(dzy dzyVar) {
        this.f8726lr = dzyVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11214ri(C2705vr c2705vr, dzy dzyVar) {
        c2705vr.m10189ri(f8725ri, new C2917mj(dzyVar));
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2698ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public JSONObject mo10166ri(String str, JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        dzy.C3209lr c3209lr = new dzy.C3209lr();
        c3209lr.f10640ri = NotificationCompat.CATEGORY_CALL;
        c3209lr.f10637ik = str;
        c3209lr.f10638ka = jSONObject;
        return this.f8726lr.m13449ri(c3209lr, 3);
    }
}
