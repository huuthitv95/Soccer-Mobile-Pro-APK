package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2007ik;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.component.xha.C2744ri;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.common.C2945ik;
import com.bytedance.sdk.openadsdk.core.jbs.C3228co;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.C3317ka;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3566dw;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3579mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3584qt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.C11540L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.xd */
/* JADX INFO: loaded from: classes3.dex */
public class C3359xd implements hcw {

    /* JADX INFO: renamed from: lr */
    private static final Map<Integer, String> f11876lr = new HashMap<Integer, String>(59) { // from class: com.bytedance.sdk.openadsdk.core.xd.1
        {
            put(1, "is_init");
            put(2, "abtest");
            put(3, "language");
            put(4, "ad_sdk_version");
            put(5, "package_name");
            put(6, "user_data");
            put(7, "ts");
            put(8, "ipv4");
            put(9, "ipv6");
            put(10, "adx_id");
            put(11, "target_region");
            put(12, C11540L6.f24947V0);
            put(13, "banner");
            put(14, "app_reg");
            put(15, "apk-sign");
            put(16, "screen_scale");
            put(17, "app_set_id_scope");
            put(18, "app_set_id");
            put(19, "installed_source");
            put(20, "app_running_time");
            put(21, "js_render_ver");
            put(22, "js_render_v3_ver");
            put(23, "gp_v_name");
            put(24, "gp_v_code");
            put(25, "vendor");
            put(26, C11540L6.f24899B);
            put(27, "user_agent_device");
            put(28, "user_agent_webview");
            put(29, "sys_compiling_time");
            put(30, "screen_height");
            put(31, "screen_width");
            put(32, "rom_version");
            put(33, "carrier_name");
            put(34, "os_version");
            put(35, "conn_type");
            put(36, "boot");
            put(37, "oem_store");
            put(38, "board");
            put(39, "timezone");
            put(40, "device_city");
            put(41, "cpu_num");
            put(42, "density");
            put(43, "bt_time");
            put(44, "bt_id");
            put(45, "sec_did");
            put(46, "X-Armors");
            put(47, "url");
            put(48, "pangle_m");
            put(49, "ec");
            put(50, "pglx");
            put(51, C11540L6.f25016u);
            put(52, "bp");
            put(53, "t_ver");
            put(54, "is_fold");
            put(55, CampaignEx.JSON_KEY_AAB);
            put(56, "abi");
            put(57, "is_multi");
            put(58, "w_ver");
            put(59, "feature_data");
        }
    };

    /* JADX INFO: renamed from: ri */
    private final AtomicReference<JSONObject> f11878ri = new AtomicReference<>();

    /* JADX INFO: renamed from: ik */
    private int f11877ik = 0;

    /* JADX INFO: renamed from: di */
    public static boolean m15118di(String str) {
        return "TX".equals(str);
    }

    private static void jbs(final String str) {
        try {
            C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.xd.5
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("bidding_token");
                    c3481ri.xha(C3359xd.m15123sf(str).toString());
                    return c3481ri;
                }
            });
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAdManagerImpl", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: mj */
    private static void m15119mj(final String str) {
        try {
            C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.xd.4
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("bidding_token");
                    c3481ri.xha(C3359xd.m15123sf(str).toString());
                    return c3481ri;
                }
            });
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAdManagerImpl", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: qt */
    private static void m15120qt(final String str) {
        try {
            C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.xd.6
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("bidding_token");
                    c3481ri.xha(C3359xd.m15123sf(str).toString());
                    return c3481ri;
                }
            });
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAdManagerImpl", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m15121ri(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m15122ri(JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new C3213fr(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
        C3330su.m14971ri(jSONObjectEncryptType4);
        return jSONObjectEncryptType4 != null ? jSONObjectEncryptType4 : new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sf */
    public static JSONObject m15123sf(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: fi */
    public int mo13479fi() {
        return C3304qt.m14669lr().m14696qt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: fi, reason: merged with bridge method [inline-methods] */
    public C3359xd mo13487lr(String str) {
        C3304qt.m14669lr().m14686ik(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ik */
    public hcw mo13480ik(int i) {
        C3304qt.m14669lr().m14685ik(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ik */
    public hcw mo13481ik(String str) {
        C3304qt.m14669lr().m14694mj(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ik */
    public String mo13482ik() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ka */
    public int mo13483ka() {
        return this.f11877ik;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ka */
    public hcw mo13484ka(int i) {
        C3304qt.m14669lr().m14690ka(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C3359xd mo13489ri(String str) {
        C3304qt.m14669lr().m14697ri(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: lr */
    public hcw mo13485lr() {
        C2730vr.m10318ri("PangleSDK-7911");
        C2007ik.m6440ri("PangleSDK-7911");
        C2707ac.m10204ri("PangleSDK-7911");
        C2730vr.m10316ri();
        C2744ri.m10407ri();
        C2007ik.m6438ri();
        C2707ac.m10203ri();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: lr */
    public hcw mo13486lr(int i) {
        this.f11877ik = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ri */
    public hcw mo13488ri(int i) {
        C3304qt.m14669lr().m14684fi(i);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    protected void m15126ri(int i, PAGBiddingRequest pAGBiddingRequest) {
        try {
            String strM14702uq = C3304qt.m14669lr().m14702uq();
            String str = "";
            String adxId = pAGBiddingRequest != null ? pAGBiddingRequest.getAdxId() : "";
            boolean zXlq = C3299nr.m14639ka().xlq();
            Set<String> setZxp = C3299nr.m14639ka().zxp();
            JSONArray jSONArray = new JSONArray();
            if (setZxp != null) {
                Iterator<String> it = setZxp.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            String strM14884ta = C3322sf.m14819lr().m14884ta();
            int iMo13479fi = mo13479fi();
            int iM14977ka = C3332vr.m14977ka();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_adx_id", strM14702uq);
            jSONObject.put("bidding_adx_id", adxId);
            jSONObject.put("token_enable", zXlq ? 1 : 0);
            if (!TextUtils.isEmpty(strM14884ta)) {
                str = strM14884ta;
            }
            jSONObject.put("setting_dc", str);
            jSONObject.put("setting_token_adx_ids", jSONArray);
            jSONObject.put("init_pa_consent", iMo13479fi);
            jSONObject.put("init_state", iM14977ka);
            jSONObject.put("reason", i);
            if (!C3332vr.m14975fi()) {
                LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.f11878ri, null, jSONObject);
                return;
            }
            C3521ka.m15951ri("biddingtoken_error", false, 1, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.xd.2
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    return C3531ka.m15967lr().m15985ri("biddingtoken_error").m15980lr(jSONObject.toString());
                }
            });
            final JSONObject andSet = this.f11878ri.getAndSet(null);
            if (andSet != null) {
                C3521ka.m15951ri("biddingtoken_error", false, 1, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.xd.3
                    @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                    /* JADX INFO: renamed from: ri */
                    public InterfaceC3530ik mo11574ri() throws Exception {
                        return C3531ka.m15967lr().m15985ri("biddingtoken_error").m15980lr(andSet.toString());
                    }
                });
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ri */
    public void mo13490ri(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            C3571ig.m16468qt("getBiddingToken");
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            try {
                m15119mj(adxId);
                String strM14884ta = C3299nr.m14639ka().m14884ta();
                int size = 2;
                AdSlot adSlotBuild = null;
                if (!C3307lr.m14718ri().m14721di()) {
                    pAGBidError = new PAGBidError(40060, jbs.m13550ri(40060));
                } else if (C3307lr.m14718ri().m14724ka()) {
                    pAGBidError = new PAGBidError(10007, jbs.m13550ri(10007));
                } else if (!C3307lr.m14718ri().jbs()) {
                    pAGBidError = new PAGBidError(10008, jbs.m13550ri(10008));
                } else if (TextUtils.isEmpty(strM14884ta)) {
                    pAGBidError = new PAGBidError(10011, jbs.m13550ri(10011));
                    m15126ri(5, pAGBiddingRequest);
                } else if (!m15118di(strM14884ta) || C3299nr.m14639ka().m14897zf(adxId)) {
                    pAGBidError = null;
                } else {
                    pAGBidError = new PAGBidError(GamesActivityResultCodes.RESULT_NETWORK_FAILURE, jbs.m13550ri(GamesActivityResultCodes.RESULT_NETWORK_FAILURE));
                    m15126ri(2, pAGBiddingRequest);
                }
                if (pAGBidError != null) {
                    pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                    m15120qt(adxId);
                    return;
                }
                if (C3307lr.m14718ri().m14733sf() && C3304qt.m14669lr().m14701sf()) {
                    pAGBidCallback.onBiddingTokenFailed(new PAGBidError(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, jbs.m13550ri(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED)));
                    m15120qt(adxId);
                    m15126ri(3, pAGBiddingRequest);
                    return;
                }
                C3324ik.m14915ri();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_init", C3332vr.m14975fi() ? 1 : 0);
                String strM14873qt = C3299nr.m14639ka().m14873qt();
                String strM14840dw = C3299nr.m14639ka().m14840dw();
                if (strM14873qt != null && strM14840dw != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("version", strM14873qt);
                    jSONObject2.put("param", strM14840dw);
                    jSONObject.put("abtest", jSONObject2);
                }
                jSONObject.put("language", C3089aw.m12375lr());
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("package_name", C3571ig.m16435di());
                if (pAGBiddingRequest != null) {
                    if (!TextUtils.isEmpty(pAGBiddingRequest.getSlotId())) {
                        adSlotBuild = new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build();
                    }
                    jSONObject.put("user_data", C3112ay.m12609ri(adSlotBuild));
                }
                jSONObject.put("ts", System.currentTimeMillis() / 1000);
                String strM16058lr = C3535ri.m16058lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                if (strM16058lr.isEmpty()) {
                    String strM16058lr2 = C3535ri.m16058lr("ttopenadsdk", "key_ipv4", "");
                    if (!strM16058lr2.isEmpty()) {
                        jSONObject.put("ipv4", strM16058lr2);
                    }
                } else {
                    jSONObject.put("ipv6", strM16058lr);
                }
                jSONObject.put("adx_id", adxId);
                Object objTpb = C3299nr.m14639ka().tpb();
                jSONObject.put("target_region", objTpb);
                if (jSONObject.toString().getBytes().length <= 2680) {
                    C3322sf c3322sfM14639ka = C3299nr.m14639ka();
                    C3369ri.m15224ri().m15232ri(jSONObject);
                    if (pAGBiddingRequest != null) {
                        jSONObject.put("banner", m15121ri(pAGBiddingRequest));
                    }
                    jSONObject.put("app_reg", C3307lr.m14718ri().m14721di() ? 1 : 0);
                    Context contextM14642ri = C3299nr.m14642ri();
                    jSONObject.put("apk-sign", C2945ik.xha());
                    jSONObject.put("screen_scale", C3583qd.m16576di(contextM14642ri));
                    jSONObject.put("app_set_id_scope", C3317ka.m14784lr());
                    jSONObject.put("app_set_id", C3317ka.m14782ik());
                    jSONObject.put("installed_source", C3317ka.m14783ka());
                    jSONObject.put("app_running_time", (System.currentTimeMillis() - C3332vr.m14979ri()) / 1000);
                    jSONObject.put("js_render_ver", C3228co.m13615ik());
                    jSONObject.put("js_render_v3_ver", C3228co.m13616ka());
                    jSONObject.put("gp_v_name", DeviceUtils.m16321fi(contextM14642ri));
                    jSONObject.put("gp_v_code", DeviceUtils.m16319di(contextM14642ri));
                    jSONObject.put("vendor", Build.MANUFACTURER);
                    jSONObject.put(C11540L6.f24899B, Build.MODEL);
                    jSONObject.put("user_agent_device", C3571ig.m16457lr());
                    jSONObject.put("user_agent_webview", C3571ig.m16449ka());
                    jSONObject.put("sys_compiling_time", C3089aw.m12376lr(contextM14642ri));
                    jSONObject.put("screen_height", C3583qd.m16578fi(contextM14642ri));
                    jSONObject.put("screen_width", C3583qd.m16580ik(contextM14642ri));
                    jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.igq.m16516ri());
                    jSONObject.put("carrier_name", C3566dw.m16386ri());
                    jSONObject.put("os_version", Build.VERSION.RELEASE);
                    jSONObject.put("conn_type", C3571ig.m16460mj(contextM14642ri));
                    if (c3322sfM14639ka.igq("boot")) {
                        jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                    }
                    C3571ig.m16487ri(jSONObject);
                    jSONObject.put("board", Build.BOARD);
                    jSONObject.put("timezone", C3571ig.m16492su());
                    jSONObject.put("device_city", C3571ig.wjv());
                    jSONObject.put("cpu_num", C3584qt.m16631lr());
                    jSONObject.put("density", C3583qd.m16598mj(contextM14642ri));
                    DeviceUtils.m16346ri(jSONObject);
                    C3324ik.m14920ri(jSONObject);
                    C3579mj.m16555ri(jSONObject, contextM14642ri);
                    jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.ihz.m10229ri(contextM14642ri));
                    C3579mj.m16547lr(jSONObject, contextM14642ri);
                    size = f11876lr.size();
                }
                while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                    jSONObject.remove(f11876lr.get(Integer.valueOf(size)));
                    size--;
                }
                C3366lr.m15165ri().m15176ri(jSONObject);
                JSONObject jSONObjectM15122ri = m15122ri(jSONObject);
                while (size > 0 && jSONObjectM15122ri.toString().getBytes().length > 12288) {
                    jSONObject.remove(f11876lr.get(Integer.valueOf(size)));
                    jSONObjectM15122ri = m15122ri(jSONObject);
                    size--;
                }
                if (jSONObjectM15122ri.length() > 0) {
                    jSONObjectM15122ri.put("target_region", objTpb);
                }
                if (C2730vr.m10314ik()) {
                    Objects.toString(jSONObjectM15122ri);
                    int length = jSONObjectM15122ri.toString().getBytes().length;
                }
                Objects.toString(jSONObjectM15122ri);
                pAGBidCallback.onBiddingTokenCollected(jSONObjectM15122ri.toString());
                jbs(adxId);
            } catch (Throwable unused) {
                str = adxId;
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
                m15126ri(4, pAGBiddingRequest);
                m15120qt(str);
            }
        } catch (Throwable unused2) {
        }
    }
}
