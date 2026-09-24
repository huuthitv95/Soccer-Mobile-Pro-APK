package com.bytedance.sdk.openadsdk.wjv;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.core.C3112ay;
import com.bytedance.sdk.openadsdk.core.C3213fr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.settings.jbs;
import com.bytedance.sdk.openadsdk.p230di.C3367ri;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3549ik;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.ironsource.mediationsdk.metadata.C12364a;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.wjv.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3606fi {

    /* JADX INFO: renamed from: ka */
    private static volatile C3608ka f13356ka;

    /* JADX INFO: renamed from: lr */
    public static String f13357lr;

    /* JADX INFO: renamed from: ik */
    private static final AtomicBoolean f13355ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ri */
    public static final ConcurrentHashMap<String, Object> f13358ri = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: di */
    public static int m16696di() {
        if (m16700lr()) {
            return m16704ri("ad_load_and_render_opt", "webview_preload_cache_v3", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: fi */
    public static int m16697fi() {
        if (m16700lr()) {
            return m16704ri("ad_load_and_render_opt", "webview_preload_cache", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m16698ik() {
        return m16700lr() && m16704ri("ad_load_and_render_opt", "thread_switch_opt", 0) == 1;
    }

    public static boolean jbs() {
        return m16703ri("iv_rv_listen_new_arch", 0) == 1;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m16699ka() {
        return m16700lr() && m16704ri("ad_load_and_render_opt", "sync_barrier_switch_opt", 0) == 1;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16700lr() {
        return m16704ri("ad_load_and_render_opt", C12364a.f31324j, 0) == 1;
    }

    /* JADX INFO: renamed from: mj */
    public static boolean m16701mj() {
        return m16703ri("no_call_close", 0) == 1;
    }

    /* JADX INFO: renamed from: qt */
    public static boolean m16702qt() {
        return m16703ri("iv_rv_top_bar_listen_new", 0) == 1;
    }

    /* JADX INFO: renamed from: ri */
    public static int m16703ri(String str, int i) {
        C3608ka c3608kaM16711sf = m16711sf();
        return c3608kaM16711sf != null ? c3608kaM16711sf.m16733ri(str, i) : i;
    }

    /* JADX INFO: renamed from: ri */
    public static int m16704ri(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = f13358ri;
            Object obj = concurrentHashMap.get(str3);
            if (obj != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
            try {
                String strM16735ri = m16711sf().m16735ri(str, "");
                if (!TextUtils.isEmpty(strM16735ri)) {
                    int iOptInt = new JSONObject(strM16735ri).optInt(str2, i);
                    concurrentHashMap.put(str3, Integer.valueOf(iOptInt));
                    return iOptInt;
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("StrategyUtils", th.getMessage());
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ri */
    public static C3608ka m16705ri(final Context context, final String str) {
        if (f13356ka == null) {
            synchronized (C3606fi.class) {
                if (f13356ka == null) {
                    try {
                        C3608ka c3608ka = new C3608ka(new InterfaceC3605di() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.1
                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: di */
                            public JSONObject mo16687di() {
                                try {
                                    JSONObject jSONObjectM14777ri = jbs.m14777ri(C2728su.m10293ri(C3299nr.m14642ri(), 0L));
                                    if (!jSONObjectM14777ri.has("app_id")) {
                                        if (!TextUtils.isEmpty(str)) {
                                            jSONObjectM14777ri.put("app_id", str);
                                        } else {
                                            if (TextUtils.isEmpty(C3304qt.m14669lr().m14689ka())) {
                                                return null;
                                            }
                                            jSONObjectM14777ri.put("app_id", C3304qt.m14669lr().m14689ka());
                                        }
                                    }
                                    return C3112ay.m12608ri(PangleEncryptConstant.CryptDataScene.STRATEGY, jSONObjectM14777ri);
                                } catch (Throwable th) {
                                    C2707ac.m10196ik("StrategyUtils", th.getMessage());
                                    return null;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: fi */
                            public String mo16688fi() {
                                String strM16477ri = C3571ig.m16477ri("/api/ad/union/sdk/strategies/adn", false, true);
                                C3606fi.f13357lr = strM16477ri;
                                return strM16477ri;
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: ik */
                            public String mo16689ik() {
                                if (ihz.m10229ri(mo16691lr())) {
                                    return "pag_adn_strategy_center";
                                }
                                return "pag_adn_strategy_center_" + ihz.m10225ik(mo16691lr());
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: ka */
                            public Handler mo16690ka() {
                                return C3332vr.m14978lr();
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: lr */
                            public Context mo16691lr() {
                                Context context2 = context;
                                return context2 != null ? context2 : C3299nr.m14642ri();
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: mj */
                            public boolean mo16692mj() {
                                return C3307lr.m14718ri().m14722fi();
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: ri */
                            public HandlerThread mo16693ri(String str2, int i) {
                                return C2723mj.m10251ri(str2, i);
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: ri */
                            public ExecutorService mo16694ri() {
                                return dzy.m16392fi();
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            /* JADX INFO: renamed from: ri */
                            public JSONObject mo16695ri(JSONObject jSONObject) {
                                String strM12606ri = C3112ay.m12606ri(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
                                if (!TextUtils.isEmpty(strM12606ri)) {
                                    try {
                                        return new JSONObject(strM12606ri);
                                    } catch (Throwable unused) {
                                    }
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3605di
                            public Map<String, String> xha() {
                                HashMap map = new HashMap();
                                map.put("User-Agent", C3571ig.m16449ka());
                                String strM16058lr = C3535ri.m16058lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                                if (!strM16058lr.isEmpty()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ipv6", strM16058lr);
                                    } catch (JSONException unused) {
                                    }
                                    JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new C3213fr(PangleEncryptConstant.CryptDataScene.UNKNOWN));
                                    if (jSONObjectEncryptType4 != null) {
                                        map.put("transfer-param", jSONObjectEncryptType4.optString("message"));
                                        if (jSONObjectEncryptType4.optInt("cypher") == 4) {
                                            map.put("cypher", "4");
                                        } else {
                                            map.put("cypher", ExifInterface.GPS_MEASUREMENT_3D);
                                        }
                                    }
                                }
                                try {
                                    map.put("x-pangle-target-idc", C3322sf.m14819lr().tpb());
                                } catch (Throwable unused2) {
                                }
                                return map;
                            }
                        });
                        f13356ka = c3608ka;
                        c3608ka.m16737ri(new InterfaceC3610ri() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.2
                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3610ri
                            /* JADX INFO: renamed from: lr */
                            public void mo16712lr() {
                                C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.2.2
                                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                    /* JADX INFO: renamed from: ri */
                                    public C3481ri mo10650ri() {
                                        C3481ri c3481ri = new C3481ri();
                                        c3481ri.m15784lr("strategy_fetch");
                                        return c3481ri;
                                    }
                                });
                                C3367ri.m15193ri().m15206lr();
                                C3549ik.m16251ri().m16258lr();
                                C3594uq.m16661lr();
                                HashMap map = new HashMap();
                                String strM16707ri = C3606fi.m16707ri(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
                                if (!TextUtils.isEmpty(strM16707ri)) {
                                    map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strM16707ri);
                                }
                                C3324ik.m14919ri(map);
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3610ri
                            /* JADX INFO: renamed from: ri */
                            public void mo16713ri() {
                                C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.2.1
                                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                    /* JADX INFO: renamed from: ri */
                                    public C3481ri mo10650ri() {
                                        C3481ri c3481ri = new C3481ri();
                                        c3481ri.m15784lr("strategy_fetch");
                                        return c3481ri;
                                    }
                                });
                            }

                            @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3610ri
                            /* JADX INFO: renamed from: ri */
                            public void mo16714ri(int i, String str2) {
                                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.wjv.fi.2.3
                                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                    /* JADX INFO: renamed from: ri */
                                    public C3481ri mo10650ri() {
                                        C3481ri c3481ri = new C3481ri();
                                        c3481ri.m15784lr("strategy_fetch");
                                        return c3481ri;
                                    }
                                });
                                C3594uq.m16664ri(C3606fi.f13357lr);
                            }
                        });
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }
        }
        return f13356ka;
    }

    /* JADX INFO: renamed from: ri */
    public static <T> T m16706ri(String str, T t, InterfaceC3609lr.ri<T> riVar) {
        C3608ka c3608kaM16711sf = m16711sf();
        return c3608kaM16711sf != null ? (T) c3608kaM16711sf.m16734ri(str, t, riVar) : t;
    }

    /* JADX INFO: renamed from: ri */
    public static String m16707ri(String str, String str2) {
        C3608ka c3608kaM16711sf = m16711sf();
        return c3608kaM16711sf != null ? c3608kaM16711sf.m16735ri(str, str2) : str2;
    }

    /* JADX INFO: renamed from: ri */
    public static String m16708ri(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str4 = str + "_" + str2;
            ConcurrentHashMap<String, Object> concurrentHashMap = f13358ri;
            Object obj = concurrentHashMap.get(str4);
            if (obj != null && (obj instanceof String)) {
                return (String) obj;
            }
            try {
                String strM16735ri = m16711sf().m16735ri(str, "");
                if (!TextUtils.isEmpty(strM16735ri)) {
                    String strOptString = new JSONObject(strM16735ri).optString(str2, str3);
                    concurrentHashMap.put(str4, strOptString);
                    return strOptString;
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("StrategyUtils", th.getMessage());
            }
        }
        return str3;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16709ri() {
        C3608ka c3608kaM16711sf;
        if (C3307lr.m14718ri().m14722fi() || (c3608kaM16711sf = m16711sf()) == null || f13355ik.getAndSet(true)) {
            return;
        }
        c3608kaM16711sf.m16736ri();
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16710ri(String str, boolean z) {
        C3608ka c3608kaM16711sf = m16711sf();
        return c3608kaM16711sf != null ? c3608kaM16711sf.m16738ri(str, z) : z;
    }

    /* JADX INFO: renamed from: sf */
    private static C3608ka m16711sf() {
        return m16705ri(C3299nr.m14642ri(), C3304qt.m14669lr().m14689ka());
    }

    public static boolean xha() {
        return m16703ri("jsb_opt_enable", 0) == 1;
    }
}
