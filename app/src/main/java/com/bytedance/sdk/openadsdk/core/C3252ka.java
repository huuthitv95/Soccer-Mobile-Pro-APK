package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
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
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.bytedance.sdk.openadsdk.wjv.InterfaceC3609lr;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.C11540L6;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3252ka extends C3359xd {

    /* JADX INFO: renamed from: ri */
    private static volatile ArrayList<String> f10928ri;

    /* JADX INFO: renamed from: lr */
    private int f10929lr = 12288;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka$ri */
    private static class ri extends JSONObject {

        /* JADX INFO: renamed from: ri */
        private ArrayList<String> f10941ri;

        public ri(boolean z) {
            if (z) {
                this.f10941ri = new ArrayList<>();
            }
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, double d) throws JSONException {
            ArrayList<String> arrayList = this.f10941ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, d);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, int i) throws JSONException {
            ArrayList<String> arrayList = this.f10941ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, i);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, long j) throws JSONException {
            ArrayList<String> arrayList = this.f10941ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, j);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, Object obj) throws JSONException {
            ArrayList<String> arrayList = this.f10941ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, obj);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, boolean z) throws JSONException {
            ArrayList<String> arrayList = this.f10941ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, z);
        }

        @Override // org.json.JSONObject
        public JSONObject putOpt(String str, Object obj) throws JSONException {
            ArrayList<String> arrayList = this.f10941ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.putOpt(str, obj);
        }

        /* JADX INFO: renamed from: ri */
        public ArrayList<String> m13769ri() {
            return this.f10941ri;
        }
    }

    private void jbs(final String str) {
        try {
            C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ka.2
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("bidding_token");
                    c3481ri.m15774fi("new");
                    c3481ri.xha(C3252ka.this.m13767sf(str).toString());
                    return c3481ri;
                }
            });
        } catch (Throwable th) {
            C2707ac.m10196ik("BiddingTokenGenerator", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: mj */
    private void m13761mj(final String str) {
        try {
            C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ka.1
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("bidding_token");
                    c3481ri.m15774fi("new");
                    c3481ri.xha(C3252ka.this.m13767sf(str).toString());
                    return c3481ri;
                }
            });
        } catch (Throwable th) {
            C2707ac.m10196ik("BiddingTokenGenerator", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: qt */
    private void m13762qt(final String str) {
        try {
            C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ka.3
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("bidding_token");
                    c3481ri.m15774fi("new");
                    c3481ri.xha(C3252ka.this.m13767sf(str).toString());
                    return c3481ri;
                }
            });
        } catch (Throwable th) {
            C2707ac.m10196ik("BiddingTokenGenerator", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13765ri(final int i, final int i2, final String str, final String str2) {
        C3521ka.m15952ri("bid_tok_len_over_lim", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.ka.4
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("len_bef_rm", i);
                jSONObject.put("len_af_rm", i2);
                jSONObject.put("len_lm", C3252ka.this.f10929lr);
                jSONObject.put("re_f_key", str2);
                jSONObject.put("adx_id", str);
                return C3531ka.m15967lr().m15985ri("bid_tok_len_over_lim").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private static void m13766ri(JSONObject jSONObject, PAGBiddingRequest pAGBiddingRequest, String str) throws Throwable {
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
            jSONObject.put("user_data", C3112ay.m12609ri(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
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
        jSONObject.put("adx_id", str);
        jSONObject.put("target_region", C3299nr.m14639ka().tpb());
        C3369ri.m15224ri().m15232ri(jSONObject);
        if (pAGBiddingRequest != null) {
            jSONObject.put("banner", m15121ri(pAGBiddingRequest));
        }
        C3322sf c3322sfM14639ka = C3299nr.m14639ka();
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
        C3366lr.m15165ri().m15176ri(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sf */
    public JSONObject m13767sf(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.C3359xd, com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ri */
    public void mo13490ri(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        int length;
        String adxId = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            C3571ig.m16468qt("getBiddingToken");
            if (pAGBiddingRequest != null && pAGBiddingRequest.getAdxId() != null) {
                adxId = pAGBiddingRequest.getAdxId();
            }
            jbs(adxId);
            String strM14884ta = C3299nr.m14639ka().m14884ta();
            String str = null;
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
                m13761mj(adxId);
                return;
            }
            if (C3307lr.m14718ri().m14733sf() && C3304qt.m14669lr().m14701sf()) {
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, jbs.m13550ri(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED)));
                m13761mj(adxId);
                m15126ri(3, pAGBiddingRequest);
                return;
            }
            C3324ik.m14915ri();
            ri riVar = new ri(f10928ri == null);
            m13766ri(riVar, pAGBiddingRequest, adxId);
            ArrayList<String> arrayListM13769ri = riVar.m13769ri();
            if (arrayListM13769ri != null) {
                f10928ri = arrayListM13769ri;
            }
            JSONObject jSONObjectRi = m15122ri(riVar);
            int i = -1;
            int size = f10928ri != null ? f10928ri.size() - 1 : -1;
            while (true) {
                length = jSONObjectRi.toString().getBytes().length;
                if (length > this.f10929lr) {
                    if (i < 0) {
                        i = length;
                    }
                    if (size < 0) {
                        break;
                    }
                    str = f10928ri.get(size);
                    riVar.remove(str);
                    size--;
                    jSONObjectRi = m15122ri(riVar);
                } else {
                    break;
                }
            }
            if (jSONObjectRi.length() > 0) {
                jSONObjectRi.put("target_region", C3299nr.m14639ka().tpb());
            }
            pAGBidCallback.onBiddingTokenCollected(jSONObjectRi.toString());
            m13762qt(adxId);
            if (i >= 0) {
                m13765ri(i, length, adxId, str);
            }
        } catch (Throwable unused) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
            m15126ri(4, pAGBiddingRequest);
            m13761mj("");
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m13768ri() {
        JSONObject jSONObject = (JSONObject) C3606fi.m16706ri("bid_tok_con", (Object) null, InterfaceC3609lr.f13375ri);
        if (jSONObject == null) {
            return false;
        }
        this.f10929lr = jSONObject.optInt("en_m_l", this.f10929lr);
        return jSONObject.optInt(C12364a.f31324j, 0) == 1;
    }
}
