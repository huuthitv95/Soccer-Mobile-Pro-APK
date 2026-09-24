package com.bytedance.sdk.openadsdk.core.p226sf;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.C11366Bc;
import com.ironsource.C11794a2;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.sf.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3324ik {

    /* JADX INFO: renamed from: ri */
    private static boolean f11651ri;

    /* JADX INFO: renamed from: di */
    public static String m14908di() {
        if (C3299nr.m14639ka().rzk()) {
            return C3325lr.m14921lr().m14925ka();
        }
        return null;
    }

    /* JADX INFO: renamed from: fi */
    public static int m14909fi() {
        if (C3299nr.m14639ka().rzk()) {
            return C3325lr.m14921lr().xha();
        }
        return 6;
    }

    /* JADX INFO: renamed from: ik */
    public static String m14910ik() {
        return C3299nr.m14639ka().rzk() ? C3325lr.m14921lr().m14923fi() : "";
    }

    /* JADX INFO: renamed from: ka */
    public static long m14911ka() {
        if (C3299nr.m14639ka().rzk()) {
            return C3325lr.m14921lr().m14922di();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: lr */
    public static void m14912lr() {
        if (C3299nr.m14639ka().rzk()) {
            C3325lr.m14921lr().m14928ri();
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m14913lr(String str) {
        if (TextUtils.isEmpty(str) || !C3299nr.m14639ka().rzk()) {
            return;
        }
        C3325lr.m14921lr().m14926lr(str);
    }

    /* JADX INFO: renamed from: ri */
    public static Map<String, String> m14914ri(String str, String str2) {
        if (C3299nr.m14639ka().rzk()) {
            return C3325lr.m14921lr().m14927ri(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    /* JADX INFO: renamed from: ri */
    public static void m14915ri() {
        if (!f11651ri && C3299nr.m14639ka().rzk()) {
            C3325lr.m14921lr();
            f11651ri = C3325lr.m14921lr().m14924ik();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14916ri(MotionEvent motionEvent) {
        if (C3299nr.m14639ka().rzk()) {
            C3325lr.m14921lr().m14929ri(motionEvent);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14917ri(wjv wjvVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (C3299nr.m14639ka().rzk()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (wjvVar != null) {
                String strM14424jf = wjvVar.m14424jf();
                boolean zIsEmpty = TextUtils.isEmpty(strM14424jf);
                String strOptString = C11794a2.f26725f;
                if (zIsEmpty) {
                    map.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, C11794a2.f26725f);
                } else {
                    map.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, strM14424jf);
                }
                try {
                    long j = -1;
                    if (wjvVar.ljo() != null) {
                        jOptLong = wjvVar.ljo().optLong("ad_id", -1L);
                        jOptLong2 = wjvVar.ljo().optLong("rit", -1L);
                        jOptLong3 = wjvVar.ljo().optLong("ad_slot_type", -1L);
                        strOptString = wjvVar.ljo().optString("ad_type", C11794a2.f26725f);
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> mapIyl = wjvVar.iyl();
                    if (mapIyl != null && (obj = mapIyl.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j));
                    C3325lr.m14921lr().m14931ri(PglSSManager.REPORT_SCENE_ADSHOW, map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14918ri(String str) {
        if (C3299nr.m14639ka().rzk()) {
            C3325lr.m14921lr().m14930ri(str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14919ri(Map<String, Object> map) {
        if (C3299nr.m14639ka().rzk()) {
            C3325lr.m14921lr().m14932ri(map);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14920ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (!C3299nr.m14639ka().rzk()) {
                jSONObject.put("pglx", "6");
                return;
            }
            m14915ri();
            if (m14909fi() != 0) {
                jSONObject.put("pglx", String.valueOf(m14909fi()));
                return;
            }
            jSONObject.put("sec_did", C3325lr.m14921lr().m14925ka());
            String strM10220ri = C2717fi.m10220ri(jSONObject.toString());
            Map<String, String> mapM14927ri = C3325lr.m14921lr().m14927ri("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strM10220ri != null ? strM10220ri.getBytes() : new byte[0]);
            if (mapM14927ri == null || mapM14927ri.size() <= 0) {
                jSONObject.put("pglx", "8");
            } else {
                for (String str : mapM14927ri.keySet()) {
                    jSONObject.put(str, mapM14927ri.get(str));
                }
                jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                jSONObject.put("pangle_m", strM10220ri);
            }
            jSONObject.put("ec", C3325lr.m14921lr().m14922di());
        } catch (Throwable th) {
            C2707ac.m10196ik("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", C11366Bc.f23952e);
            } catch (JSONException unused) {
            }
        }
    }
}
