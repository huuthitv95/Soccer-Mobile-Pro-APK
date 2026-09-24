package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.C3274aw;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.p221ka.C3263ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3372lr;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3373ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3423lr;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri.C3508lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3532lr;
import com.bytedance.sdk.openadsdk.tan.p262ik.C3534ri;
import com.bytedance.sdk.openadsdk.utils.C3569fi;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ig */
/* JADX INFO: loaded from: classes3.dex */
public class C3214ig {

    /* JADX INFO: renamed from: ri */
    private static boolean f10655ri;

    /* JADX INFO: renamed from: ri */
    public static Intent m13491ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i) {
        if (context == null || wjvVar == null || !C3279dw.m14092lr(wjvVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String strM14098sf = C3279dw.m14098sf(wjvVar);
        if (!TextUtils.isEmpty(strM14098sf)) {
            if (strM14098sf.contains("?")) {
                strM14098sf = strM14098sf + "&orientation=portrait";
            } else {
                strM14098sf = strM14098sf + "?orientation=portrait";
            }
        }
        wjvVar.m14397fi(strM14098sf);
        wjvVar.m14380di(str);
        wjvVar.m14429ka(i);
        intent.putExtra("meta_index", C3197dw.m13337ri().m13348ri(wjvVar));
        return intent;
    }

    /* JADX INFO: renamed from: ri */
    private static Intent m13492ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, PAGNativeAd pAGNativeAd, C3263ri c3263ri, String str2, boolean z) {
        return m13493ri(context, str, wjvVar, i, pAGNativeAd, c3263ri, str2, z, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    private static Intent m13493ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, PAGNativeAd pAGNativeAd, C3263ri c3263ri, String str2, boolean z, boolean z2, C3088ac c3088ac) {
        Intent intent;
        if (z2 || !C3279dw.m14092lr(wjvVar) || (pAGNativeAd == 0 && c3263ri == null)) {
            intent = (z2 || wjvVar.adz() != 3 || !(wjvVar.m14453nd() == 2 || (wjvVar.m14453nd() == 1 && f10655ri)) || wjvVar.m14357ae()) ? new Intent(context, (Class<?>) TTLandingPageActivity.class) : new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean zM13504ri = m13504ri(wjvVar, z);
            intent.putExtra("ad_pending_download", zM13504ri);
            String strM14098sf = C3279dw.m14098sf(wjvVar);
            if (!TextUtils.isEmpty(strM14098sf)) {
                if (strM14098sf.contains("?")) {
                    str = strM14098sf + "&orientation=portrait";
                } else {
                    str = strM14098sf + "?orientation=portrait";
                }
            }
            wjvVar.m14444lr(zM13504ri);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (z2 && c3088ac != null) {
            wjvVar.m14355ac(c3088ac.m12366lr());
            wjvVar.m14518ri(c3088ac.m12369ri());
        }
        wjvVar.m14397fi(str);
        wjvVar.m14380di(str2);
        wjvVar.m14429ka(i);
        intent.putExtra("meta_index", C3197dw.m13337ri().m13348ri(wjvVar));
        if (wjvVar.m14552vz() == 5 || wjvVar.m14552vz() == 15 || wjvVar.m14552vz() == 50) {
            C3534ri c3534riM13870ik = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof C3534ri.ri) {
                    c3534riM13870ik = ((C3534ri.ri) pAGNativeAd).mo15868di();
                } else if (pAGNativeAd instanceof C3508lr) {
                    c3534riM13870ik = ((C3508lr) pAGNativeAd).m15915lr();
                }
                if (c3534riM13870ik != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, c3534riM13870ik.m16054ri().toString());
                }
            }
            if (c3263ri != null && c3263ri.m13872lr() && (c3534riM13870ik = c3263ri.m13870ik()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, c3534riM13870ik.m16054ri().toString());
            }
            if (c3534riM13870ik != null) {
                intent.putExtra("video_is_auto_play", c3534riM13870ik.f12839ka);
                if (C2730vr.m10314ik()) {
                    c3534riM13870ik.m16054ri().toString();
                }
            }
        }
        return intent;
    }

    /* JADX INFO: renamed from: ri */
    private static C3532lr m13494ri(int i, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        C3532lr c3532lr = new C3532lr();
        c3532lr.m15999ri(C3423lr.ri.f12380ri);
        c3532lr.m15998ri(wjvVar);
        c3532lr.m15994lr(C3571ig.m16476ri(wjvVar));
        c3532lr.m15997ri(i);
        c3532lr.m16000ri(false);
        c3532lr.m15993lr(wjvVar.adz());
        return c3532lr;
    }

    /* JADX INFO: renamed from: ri */
    private static String m13495ri(C3274aw c3274aw, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        return !TextUtils.isEmpty(c3274aw.m14014lr()) ? c3274aw.m14014lr() : m13496ri(wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    private static String m13496ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        return (!wjvVar.m14576zz() || wjvVar.m14525sr() == null) ? wjvVar.smj() : wjvVar.m14525sr().jbs();
    }

    /* JADX INFO: renamed from: ri */
    public static void m13497ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, String str2, boolean z) {
        C2722lr.m10241ri(context, m13492ri(context, str, wjvVar, i, (PAGNativeAd) null, (C3263ri) null, str2, z), null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m13498ri(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, final String str2, boolean z, C3088ac c3088ac) {
        C2722lr.m10241ri(context, m13493ri(context, str, wjvVar, i, null, null, str2, z, true, c3088ac), new C2722lr.lr() { // from class: com.bytedance.sdk.openadsdk.core.ig.1
            @Override // com.bytedance.sdk.component.utils.C2722lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10245ri() {
                C3414ik.m15542ri(wjvVar, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.C2722lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10246ri(Throwable th) {
                C3414ik.m15542ri(wjvVar, str2, -2, (JSONObject) null);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m13499ri(boolean z) {
        f10655ri = z;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13500ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, PAGNativeAd pAGNativeAd, C3263ri c3263ri, String str, InterfaceC3370ik interfaceC3370ik, boolean z, int i2) {
        String strM13496ri;
        C3414ik.m15561ri(m13494ri(-1, wjvVar));
        if (context == null || wjvVar == null || i == -1) {
            C3414ik.m15561ri(m13494ri(1, wjvVar));
            return false;
        }
        C3274aw c3274awLau = wjvVar.lau();
        HashMap map = new HashMap();
        if (wjvVar.m14565yv() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(i2 >= 11));
        }
        if (i2 != 0 && wjvVar.m14576zz()) {
            map.put("dsp_click_type", Integer.valueOf(i2));
        }
        if (c3274awLau == null || TextUtils.isEmpty(c3274awLau.m14016ri())) {
            strM13496ri = m13496ri(wjvVar);
        } else {
            if (m13502ri(context, wjvVar, i, str, z, map)) {
                C3414ik.m15561ri(m13494ri(2, wjvVar));
                C3569fi.m16420ri(wjvVar);
                return true;
            }
            if (c3274awLau.m14012ik() != 2 || wjvVar.m14552vz() == 5 || wjvVar.m14552vz() == 15) {
                strM13496ri = (c3274awLau.m14012ik() != 1 || TextUtils.isEmpty(c3274awLau.m14014lr())) ? m13496ri(wjvVar) : c3274awLau.m14014lr();
            } else if (interfaceC3370ik == null) {
                strM13496ri = m13495ri(c3274awLau, wjvVar);
            } else {
                if (interfaceC3370ik.mo15237ka(wjvVar)) {
                    C3414ik.m15553ri(wjvVar, str, "open_fallback_url", map);
                    C3414ik.m15561ri(m13494ri(3, wjvVar));
                    C3569fi.m16420ri(wjvVar);
                    return true;
                }
                if (interfaceC3370ik.mo15236ik(wjvVar)) {
                    C3414ik.m15553ri(wjvVar, str, "open_fallback_url", map);
                    C3414ik.m15561ri(m13494ri(3, wjvVar));
                    C3569fi.m16420ri(wjvVar);
                    return true;
                }
                strM13496ri = m13495ri(c3274awLau, wjvVar);
                C3414ik.m15561ri(m13494ri(3, wjvVar));
            }
            C3414ik.m15553ri(wjvVar, str, "open_fallback_url", map);
        }
        String str2 = strM13496ri;
        if (wjvVar.m14565yv() != 0 || TextUtils.isEmpty(str2) || !str2.contains("play.google.com/store")) {
            boolean zM13501ri = m13501ri(context, wjvVar, i, pAGNativeAd, c3263ri, str, z, str2);
            if (zM13501ri) {
                C3569fi.m16420ri(wjvVar);
            }
            return zM13501ri;
        }
        String strSubstring = str2.substring(str2.indexOf("?id=") + 4);
        C3414ik.m15561ri(m13494ri(4, wjvVar));
        boolean zM15249ri = C3372lr.m15249ri(context, str2, strSubstring, str, wjvVar);
        if (zM15249ri) {
            C3569fi.m16420ri(wjvVar);
        }
        return zM15249ri;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13501ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, PAGNativeAd pAGNativeAd, C3263ri c3263ri, String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str2) && !C3279dw.m14092lr(wjvVar)) {
            C3414ik.m15561ri(m13494ri(5, wjvVar));
            return false;
        }
        int iAdz = wjvVar.adz();
        if (iAdz == 2 || iAdz == 8) {
            return com.bytedance.sdk.openadsdk.utils.wjv.m16675ri(context, str2, wjvVar, C3423lr.ri.f12380ri, false);
        }
        C2722lr.m10241ri(context, m13492ri(context, str2, wjvVar, i, pAGNativeAd, c3263ri, str, z), null);
        f10655ri = false;
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13502ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, String str, boolean z, Map<String, Object> map) {
        if (wjvVar == null) {
            return false;
        }
        C3274aw c3274awLau = wjvVar.lau();
        if (c3274awLau == null || TextUtils.isEmpty(c3274awLau.m14016ri())) {
            C3211fi.m13462ri(wjvVar, str, c3274awLau == null ? -1 : -2, c3274awLau != null ? c3274awLau.m14013ka() : null);
            return false;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        return C3373ri.m15260ri(context, c3274awLau.m14016ri(), wjvVar, i, map, z);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13503ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i2);
            C3414ik.m15503di(wjvVar, str, jSONObject);
            Intent intentM13491ri = m13491ri(context, wjvVar, str, i);
            if (intentM13491ri == null) {
                return false;
            }
            return C2722lr.m10244ri(context, intentM13491ri, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m13504ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, boolean z) {
        if (z && wjvVar != null && wjvVar.adz() == 4) {
            return C3279dw.m14092lr(wjvVar);
        }
        return false;
    }
}
