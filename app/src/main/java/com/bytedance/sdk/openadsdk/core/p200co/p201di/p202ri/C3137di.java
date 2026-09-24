package com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3224ay;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3287oh;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3136ri;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.xha;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3137di extends xha {

    /* JADX INFO: renamed from: dw */
    private static Boolean f10268dw;

    /* JADX INFO: renamed from: fr */
    private float f10269fr;
    private boolean igq;

    /* JADX INFO: renamed from: su */
    private float f10270su;

    /* JADX INFO: renamed from: zf */
    private final AbstractC3141lr f10271zf;

    public C3137di(Context context, wjv wjvVar, boolean z, C3136ri c3136ri, ViewGroup viewGroup, float f, float f2, boolean z2, String str) {
        super(context, wjvVar, z, c3136ri, viewGroup);
        this.f10271zf = AbstractC3141lr.ri.m13116ri(wjvVar, c3136ri);
        this.f10249uq = str;
        this.f10269fr = f;
        this.f10270su = f2;
        this.igq = z2;
    }

    /* JADX INFO: renamed from: aw */
    private boolean m13106aw() {
        return this.f10234fi != null && bgr() && C3279dw.m14090ik(this.f10234fi);
    }

    private boolean bgr() {
        if (this.f10234fi == null) {
            return false;
        }
        int iM14404go = this.f10234fi.m14404go();
        boolean z = iM14404go == 7 || iM14404go == 8;
        int iM14453nd = this.f10234fi.m14453nd();
        return z && (iM14453nd == 43 || iM14453nd == 44);
    }

    /* JADX INFO: renamed from: ri */
    private JSONObject m13107ri(float f, float f2, boolean z, wjv wjvVar, String str) {
        this.f10229ay = C3239lr.m13710ri(f, f2, z, wjvVar, str);
        if (this.f10229ay == null) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = this.f10229ay.optJSONObject("xSize");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("imageModeRatio", m13109co());
            }
            JSONObject jSONObjectOptJSONObject2 = this.f10229ay.optJSONObject("xAdInfo");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.put("isVideoImageMode", wjv.m14332fi(this.f10234fi));
                jSONObjectOptJSONObject2.put("feed_draw_purePlayable", m13106aw());
                jSONObjectOptJSONObject2.put("isFeedDraw", bgr());
            }
            AbstractC3141lr abstractC3141lr = this.f10271zf;
            if (abstractC3141lr != null) {
                abstractC3141lr.mo13114ri(this.f10229ay);
            }
        } catch (Exception unused) {
        }
        return this.f10229ay;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13108ri(String str) {
        if (f10268dw == null) {
            f10268dw = Boolean.valueOf(C3606fi.m16703ri("express_backup_type", 0) == 1);
        }
        return f10268dw.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || C3224ay.m13589lr(str) || (TextUtils.equals(str, "open_ad") && C3087ri.m12365sf()));
    }

    /* JADX INFO: renamed from: co */
    public float m13109co() {
        if (this.f10234fi == null) {
            return 1.0f;
        }
        int iM14552vz = this.f10234fi.m14552vz();
        if (iM14552vz == 3) {
            return 1.91f;
        }
        if (iM14552vz == 5) {
            return 1.78f;
        }
        if (iM14552vz == 15 || iM14552vz == 173) {
            return 0.5625f;
        }
        if (iM14552vz != 33 && iM14552vz != 50) {
            if (iM14552vz == 1010) {
                return 1.2f;
            }
            if (iM14552vz == 1011) {
                return 6.4f;
            }
            if (iM14552vz == 1012) {
                return 3.2f;
            }
        }
        return 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka, com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ik */
    public int mo8752ik() {
        return 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.xha, com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: lr */
    protected JSONObject mo13078lr() {
        return m13107ri(this.f10269fr, this.f10270su, this.igq, this.f10234fi, this.f10249uq);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.xha, com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: mj */
    protected AbstractViewOnTouchListenerC2318ik mo13079mj() {
        if (this.f10237ik == null) {
            return null;
        }
        return this.f10237ik.xha("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.xha, com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: ri */
    protected JSONObject mo13080ri() {
        AbstractC3141lr abstractC3141lr = this.f10271zf;
        if (abstractC3141lr != null) {
            try {
                return new JSONObject(abstractC3141lr.mo13113ri());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.xha
    /* JADX INFO: renamed from: ri */
    public JSONObject mo13110ri(C3287oh c3287oh) {
        AbstractC3141lr abstractC3141lr = this.f10271zf;
        if (abstractC3141lr != null) {
            return abstractC3141lr.mo13112lr();
        }
        return null;
    }
}
