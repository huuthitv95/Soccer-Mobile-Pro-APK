package com.bytedance.sdk.openadsdk.slm.p261ri;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.C11540L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3531ka<T extends C3531ka> implements InterfaceC3530ik {

    /* JADX INFO: renamed from: aw */
    private String f12803aw;

    /* JADX INFO: renamed from: co */
    private String f12804co;

    /* JADX INFO: renamed from: ik */
    private String f12807ik;
    private String jbs;

    /* JADX INFO: renamed from: lr */
    private String f12809lr;

    /* JADX INFO: renamed from: qt */
    private String f12811qt;

    /* JADX INFO: renamed from: ri */
    private String f12812ri;

    /* JADX INFO: renamed from: sf */
    private String f12813sf;
    private String xha;

    /* JADX INFO: renamed from: ka */
    private final String f12808ka = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: fi */
    private long f12806fi = System.currentTimeMillis() / 1000;

    /* JADX INFO: renamed from: di */
    private int f12805di = 0;

    /* JADX INFO: renamed from: mj */
    private int f12810mj = 0;

    private C3531ka() {
        try {
            this.f12803aw = C3593su.m16658ri();
        } catch (Throwable unused) {
            this.f12803aw = com.unity3d.ads.BuildConfig.FLAVOR;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static C3531ka<C3531ka> m15967lr() {
        return new C3531ka<>();
    }

    private T slm() {
        return this;
    }

    /* JADX INFO: renamed from: vr */
    private JSONObject m15968vr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11540L6.f24911F, 1);
            jSONObject.put(C11540L6.f24899B, Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", C3571ig.m16435di());
            jSONObject.put(C11540L6.f24966d0, C3571ig.m16449ka());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: aw */
    public String m15969aw() {
        return this.f12811qt;
    }

    public String bgr() {
        return this.f12804co;
    }

    /* JADX INFO: renamed from: co */
    public String m15970co() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: di */
    public T m15971di(String str) {
        this.jbs = str;
        return (T) slm();
    }

    /* JADX INFO: renamed from: di */
    public String m15972di() {
        return this.f12807ik;
    }

    /* JADX INFO: renamed from: fi */
    public T m15973fi(String str) {
        this.xha = str;
        return (T) slm();
    }

    /* JADX INFO: renamed from: fi */
    public String m15974fi() {
        return this.f12809lr;
    }

    /* JADX INFO: renamed from: ik */
    public T m15975ik(String str) {
        this.f12809lr = str;
        return (T) slm();
    }

    /* JADX INFO: renamed from: ik */
    public String m15976ik() {
        return this.f12812ri;
    }

    public int jbs() {
        return this.f12805di;
    }

    /* JADX INFO: renamed from: ka */
    public T m15977ka(String str) {
        this.f12807ik = str;
        return (T) slm();
    }

    /* JADX INFO: renamed from: ka */
    public String m15978ka() {
        return this.f12813sf;
    }

    /* JADX INFO: renamed from: lr */
    public T m15979lr(int i) {
        this.f12810mj = i;
        return (T) slm();
    }

    /* JADX INFO: renamed from: lr */
    public T m15980lr(String str) {
        this.f12813sf = str;
        return (T) slm();
    }

    /* JADX INFO: renamed from: mj */
    public long m15981mj() {
        return this.f12806fi;
    }

    /* JADX INFO: renamed from: mj */
    public T m15982mj(String str) {
        this.f12804co = str;
        return (T) slm();
    }

    /* JADX INFO: renamed from: qt */
    public String m15983qt() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ri */
    public T m15984ri(int i) {
        this.f12805di = i;
        return (T) slm();
    }

    /* JADX INFO: renamed from: ri */
    public T m15985ri(String str) {
        this.f12812ri = str;
        return (T) slm();
    }

    @Override // com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik
    /* JADX INFO: renamed from: ri */
    public JSONObject mo15966ri() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", xha());
            jSONObject2.put("app_version", C3571ig.m16461mj());
            jSONObject2.put("timestamp", m15981mj());
            jSONObject2.put("conn_type", C2724nr.m10257lr(C3299nr.m14642ri()));
            jSONObject2.put("appid", TextUtils.isEmpty(C3304qt.m14669lr().m14689ka()) ? "" : C3304qt.m14669lr().m14689ka());
            jSONObject2.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, m15968vr());
            if (!TextUtils.isEmpty(m15976ik())) {
                jSONObject2.put("type", m15976ik());
            }
            jSONObject2.put("error_code", m15986sf());
            if (!TextUtils.isEmpty(m15970co())) {
                jSONObject2.put("error_msg", m15970co());
            }
            if (!TextUtils.isEmpty(m15974fi())) {
                jSONObject2.put("rit", m15974fi());
            }
            if (!TextUtils.isEmpty(m15972di())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, m15972di());
            }
            if (jbs() > 0) {
                jSONObject2.put("adtype", jbs());
            }
            if (!TextUtils.isEmpty(m15983qt())) {
                jSONObject2.put("req_id", m15983qt());
            }
            if (!TextUtils.isEmpty(m15969aw())) {
                jSONObject2.put("extra", m15969aw());
            }
            String strM15978ka = m15978ka();
            if (TextUtils.isEmpty(strM15978ka)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strM15978ka);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.f12803aw + "-" + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strM15978ka)) {
                jSONObject2.put("event_extra", strM15978ka);
            }
            if (!TextUtils.isEmpty(bgr())) {
                jSONObject2.put("duration", bgr());
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: sf */
    public int m15986sf() {
        return this.f12810mj;
    }

    public T xha(String str) {
        this.f12811qt = str;
        return (T) slm();
    }

    public String xha() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }
}
