package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.adexpress.p124ka.C2496lr;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2520fi;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2714co;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.C3215ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.p224qt.InterfaceC3306ka;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3437qt;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3322sf implements jbs.InterfaceC3316ri {

    /* JADX INFO: renamed from: fr */
    private static String f11620fr;

    /* JADX INFO: renamed from: ac */
    private final Runnable f11626ac;

    /* JADX INFO: renamed from: aw */
    private final C3319mj f11627aw;

    /* JADX INFO: renamed from: ay */
    private InterfaceC3312fi.lr<JSONObject> f11628ay;
    private final AtomicBoolean bgr;

    /* JADX INFO: renamed from: bu */
    private int f11629bu;

    /* JADX INFO: renamed from: co */
    private final C3321ri f11630co;
    private final InterfaceC3312fi.lr<Map<String, Integer>> ihz;

    /* JADX INFO: renamed from: mj */
    InterfaceC3312fi.lr<C3437qt> f11631mj;

    /* JADX INFO: renamed from: nr */
    private boolean f11632nr;

    /* JADX INFO: renamed from: qt */
    private Set<String> f11633qt;
    private int slm;

    /* JADX INFO: renamed from: uq */
    private final Set<String> f11634uq;

    /* JADX INFO: renamed from: vr */
    private volatile boolean f11635vr;
    private final InterfaceC3312fi.lr<Set<String>> wjv;

    /* JADX INFO: renamed from: ri */
    public static final String f11624ri = UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) "_", new CharSequence[]{"bus_con_collect", C3571ig.m16438dw()});

    /* JADX INFO: renamed from: lr */
    public static final String f11623lr = UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) "_", new CharSequence[]{"bus_con", C3571ig.m16438dw(), C3571ig.m16496zf(), "timeout"});

    /* JADX INFO: renamed from: ik */
    public static final String f11621ik = UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) "_", new CharSequence[]{"bus_con", C3571ig.m16438dw(), C3571ig.m16496zf(), "alpha"});
    private static final String jbs = C3571ig.m16493uq();

    /* JADX INFO: renamed from: ka */
    public static String f11622ka = "";

    /* JADX INFO: renamed from: fi */
    public static int f11619fi = -2;

    /* JADX INFO: renamed from: di */
    public static String f11618di = "IABTCF_TCString";

    /* JADX INFO: renamed from: sf */
    private static boolean f11625sf = false;
    private static final ConcurrentLinkedQueue<AbstractC3320qt.ri> tan = new ConcurrentLinkedQueue<>();
    static final ConcurrentHashMap<String, Integer> xha = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.sf$ri */
    private static final class ri {

        /* JADX INFO: renamed from: ri */
        static final C3322sf f11649ri = new C3322sf();
    }

    private C3322sf() {
        this.f11633qt = Collections.synchronizedSet(new HashSet());
        this.f11630co = new C3321ri();
        this.f11627aw = new C3319mj(new AbstractC3320qt.ri() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt.ri
            /* JADX INFO: renamed from: lr */
            public void mo14811lr() {
                C3307lr.m14718ri().m14734vr();
                if (C3322sf.tan == null || C3322sf.tan.isEmpty()) {
                    return;
                }
                Iterator it = C3322sf.tan.iterator();
                while (it.hasNext()) {
                    ((AbstractC3320qt.ri) it.next()).mo14811lr();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt.ri
            /* JADX INFO: renamed from: ri */
            public void mo14812ri() {
                AbstractC3320qt.ri[] riVarArr;
                boolean unused = C3322sf.f11625sf = true;
                C3307lr.m14718ri().bgr();
                if (C3322sf.tan == null || C3322sf.tan.size() == 0 || (riVarArr = (AbstractC3320qt.ri[]) C3322sf.tan.toArray()) == null) {
                    return;
                }
                for (AbstractC3320qt.ri riVar : riVarArr) {
                    riVar.mo14812ri();
                }
            }
        });
        this.bgr = new AtomicBoolean(false);
        this.f11635vr = false;
        this.slm = 5000;
        this.f11629bu = 10;
        this.f11626ac = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.7
            @Override // java.lang.Runnable
            public void run() {
                C3322sf.this.m14877ri(2, false);
                C3322sf.this.luy();
            }
        };
        this.ihz = new InterfaceC3312fi.lr<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> mo14757lr(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt < 0 || iOptInt > 100) {
                                map.put(next, 100);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    return map;
                } catch (Exception e) {
                    C2707ac.m10197ik("get applog rate from sp failed:" + e.getMessage(), new Object[0]);
                    return null;
                }
            }
        };
        this.f11634uq = new HashSet();
        this.wjv = new InterfaceC3312fi.lr<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public Set<String> mo14757lr(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            C3322sf.this.f11629bu = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            C3322sf.this.slm = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        Log.i("TTAD.SdkSettings", e.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.f11628ay = new InterfaceC3312fi.lr<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public JSONObject mo14757lr(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    C2707ac.m10196ik("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.f11631mj = new InterfaceC3312fi.lr<C3437qt>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.2
            /* JADX INFO: renamed from: ri */
            private C3437qt.ri m14901ri(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new C3437qt.ri(jSONObject.optInt("retry_times", -1), jSONObject.optInt(SDKConstants.PARAM_A2U_TIME_INTERVAL, -1));
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public C3437qt mo14757lr(String str) {
                C3437qt c3437qt = new C3437qt();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    c3437qt.m15681ri(jSONObject.optInt("enable_strategy", 0) == 1);
                    c3437qt.m15679ri(m14901ri(jSONObject.optJSONObject(BuildConfig.FLAVOR)));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            c3437qt.m15680ri(next, m14901ri(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return c3437qt;
            }
        };
    }

    /* JADX INFO: renamed from: dw */
    public static void m14813dw(String str) {
        if (str == null) {
            str = "";
        }
        String strM14816jm = m14816jm();
        if (strM14816jm == null || !strM14816jm.equals(str)) {
            C3215ik.m13505ri().m13512ri("settings_host_from_meta", str);
            f11620fr = str;
            m14819lr().m14877ri(8, true);
        }
    }

    private String evm() {
        return this.f11627aw.m14808ri("force_language", "");
    }

    /* JADX INFO: renamed from: ik */
    private static SharedPreferences m14814ik(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: jm */
    public static String m14816jm() {
        if (f11620fr == null) {
            String strM13508lr = C3215ik.m13505ri().m13508lr("settings_host_from_meta", "");
            f11620fr = strM13508lr;
            if (strM13508lr == null) {
                f11620fr = "";
            }
        }
        return f11620fr;
    }

    /* JADX INFO: renamed from: lr */
    public static C3322sf m14819lr() {
        return ri.f11649ri;
    }

    /* JADX INFO: renamed from: lr */
    public static String m14820lr(Context context) {
        SharedPreferences sharedPreferencesM14814ik;
        return (context == null || (sharedPreferencesM14814ik = m14814ik(context)) == null) ? "" : sharedPreferencesM14814ik.getString(f11618di, "");
    }

    public static boolean nbc() {
        return f11625sf;
    }

    /* JADX INFO: renamed from: ri */
    public static int m14822ri(Context context) {
        SharedPreferences sharedPreferencesM14814ik;
        if (context == null || (sharedPreferencesM14814ik = m14814ik(context)) == null) {
            return -2;
        }
        int i = sharedPreferencesM14814ik.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
        int i2 = sharedPreferencesM14814ik.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
            return -2;
        }
        return sharedPreferencesM14814ik.getInt(Cookie.IABTCF_GDPR_APPLIES, -1);
    }

    /* JADX INFO: renamed from: ri */
    public static void m14825ri(AbstractC3320qt.ri riVar) {
        ConcurrentLinkedQueue<AbstractC3320qt.ri> concurrentLinkedQueue = tan;
        if (concurrentLinkedQueue.contains(riVar)) {
            return;
        }
        concurrentLinkedQueue.add(riVar);
    }

    /* JADX INFO: renamed from: sz */
    private Set<String> m14826sz() {
        return (Set) this.f11627aw.m14807ri("perf_con_applog_send", this.f11634uq, this.wjv);
    }

    public int aac() {
        int iRi = this.f11627aw.m14805ri("perf_con_webview_cache_count", 0);
        if (iRi < 0) {
            return 0;
        }
        return iRi;
    }

    /* JADX INFO: renamed from: ac */
    public String m14827ac() {
        return this.f11627aw.m14808ri("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    /* JADX INFO: renamed from: ac */
    public boolean m14828ac(String str) {
        return m14883su(str).ihz;
    }

    public long ajz() {
        long jRi = this.f11627aw.m14806ri("req_inter_min", 600000L);
        if (jRi < 0 || jRi > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            return 600000L;
        }
        return jRi;
    }

    public boolean akr() {
        return this.f11627aw.m14805ri("bus_con_video_keep_screen_on", 1) == 1;
    }

    /* JADX INFO: renamed from: aw */
    public int m14829aw(String str) {
        return m14883su(String.valueOf(str)).f11593mj;
    }

    /* JADX INFO: renamed from: aw */
    public Set<String> m14830aw() {
        return m14826sz();
    }

    /* JADX INFO: renamed from: ay */
    public boolean m14831ay() {
        return this.f11627aw.m14810ri(f11624ri, false);
    }

    /* JADX INFO: renamed from: ay */
    public boolean m14832ay(String str) {
        return m14883su(str).ory;
    }

    public int bgr() {
        m14826sz();
        return this.f11629bu;
    }

    public boolean bgr(String str) {
        return m14829aw(str) != 1;
    }

    public int bnj() {
        return this.f11627aw.m14805ri("vbtt", 5);
    }

    /* JADX INFO: renamed from: bu */
    public boolean m14833bu() {
        return this.f11627aw.m14810ri("support_gzip", false);
    }

    /* JADX INFO: renamed from: bu */
    public boolean m14834bu(String str) {
        return str == null || DeviceUtils.m16338qt(C3299nr.m14642ri()) == 0 || m14883su(str).f11582aw == 1;
    }

    public int che() {
        return this.f11627aw.m14805ri("perf_con_close_button_delay_check_time", -1);
    }

    /* JADX INFO: renamed from: co */
    public int m14835co() {
        return this.f11627aw.m14805ri("perf_con_drawable_code", 0);
    }

    /* JADX INFO: renamed from: co */
    public boolean m14836co(String str) {
        try {
            return m14883su(str).wjv != null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: de */
    public void m14837de() {
        InterfaceC3312fi.ri riVarLr = this.f11627aw.m14803lr();
        riVarLr.mo14764ri("settings_url", "");
        riVarLr.mo14766ri();
        m14813dw("");
    }

    /* JADX INFO: renamed from: di */
    public JSONObject m14838di() {
        return (JSONObject) this.f11627aw.m14807ri("digest", null, InterfaceC3312fi.f11567ri);
    }

    /* JADX INFO: renamed from: di */
    public boolean m14839di(String str) {
        return m14883su(str).xha == 1;
    }

    /* JADX INFO: renamed from: dw */
    public String m14840dw() {
        return this.f11627aw.m14808ri("ab_test_param", "");
    }

    public int dzy() {
        int iRi = this.f11627aw.m14805ri("fetch_tpl_timeout_ctrl", 3000);
        if (iRi <= 0) {
            return 3000;
        }
        return iRi;
    }

    /* JADX INFO: renamed from: eb */
    public boolean m14841eb() {
        return this.f11627aw.m14805ri("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    /* JADX INFO: renamed from: eu */
    public Set<String> m14842eu() {
        Set<String> set = (Set) this.f11627aw.m14807ri("ads_url_backup", Collections.EMPTY_SET, InterfaceC3312fi.f11566lr);
        return (set == null || set.size() == 0) ? Collections.EMPTY_SET : set;
    }

    /* JADX INFO: renamed from: fe */
    public String m14843fe() {
        return this.f11627aw.m14808ri("dc", "TX");
    }

    public String feb() {
        return this.f11627aw.m14808ri("policy_url", "");
    }

    /* JADX INFO: renamed from: fi */
    public int m14844fi() {
        return this.f11627aw.m14805ri("max_tpl_cnts", 100);
    }

    /* JADX INFO: renamed from: fi */
    public boolean m14845fi(String str) {
        int i = m14883su(str).f11588fi;
        if (i != 1) {
            return i == 2 && C2724nr.m10255ik(C3299nr.m14642ri()) != 0;
        }
        return C2724nr.m10256ka(C3299nr.m14642ri());
    }

    /* JADX INFO: renamed from: fr */
    public int m14846fr() {
        return this.f11627aw.m14805ri(f11623lr, 10000);
    }

    /* JADX INFO: renamed from: fr */
    public boolean m14847fr(String str) {
        return C3299nr.m14639ka().m14883su(str).f11601vr == 1;
    }

    public String gcp() {
        return this.f11627aw.m14808ri("privacy_app_reg", "");
    }

    public long hcw() {
        return this.f11627aw.m14806ri("duration", 10000L);
    }

    /* JADX INFO: renamed from: hd */
    public Set<String> m14848hd() {
        return (Set) this.f11627aw.m14807ri("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, InterfaceC3312fi.f11566lr);
    }

    public boolean hpn() {
        if (C2496lr.m8822ri(C3299nr.m14642ri())) {
            return this.f11627aw.m14810ri("support_rtl", false);
        }
        return false;
    }

    public boolean hws() {
        return this.f11627aw.m14805ri("perf_con_is_new_net_thread", 0) == 1;
    }

    /* JADX INFO: renamed from: id */
    public long m14849id() {
        return this.f11627aw.m14806ri("perf_con_adlog_expire_time", 0L);
    }

    /* JADX INFO: renamed from: ig */
    public void m14850ig() {
        String strEvm = evm();
        if (TextUtils.isEmpty(strEvm)) {
            return;
        }
        if (strEvm.equals("zh-Hant")) {
            C2714co.m10214ri(C3299nr.m14642ri(), "zh", "tw");
        } else {
            C2714co.m10214ri(C3299nr.m14642ri(), strEvm, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.SdkSettings", th.getMessage());
        }
    }

    public int igq() {
        return this.f11627aw.m14805ri("bus_con_slide_num", 2);
    }

    public boolean igq(String str) {
        Set set = (Set) this.f11627aw.m14807ri("privacy_fields_allowed", Collections.EMPTY_SET, InterfaceC3312fi.f11566lr);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iM16430ay = C3571ig.m16430ay();
        if (iM16430ay != 1) {
            if (iM16430ay != 2 && iM16430ay != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public int ihz() {
        return this.f11627aw.m14805ri("bus_con_behavior_count", 300);
    }

    public int ihz(String str) {
        return m14883su(str).f11589fr;
    }

    /* JADX INFO: renamed from: ik */
    public int m14851ik(int i) {
        return m14883su(String.valueOf(i)).jbs;
    }

    /* JADX INFO: renamed from: ik */
    public synchronized void m14852ik() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f11635vr;
        this.f11630co.m14809ri(this.f11635vr);
        this.f11627aw.m14809ri(this.f11635vr);
        C3313ik.m14774ri(!z);
        this.f11635vr = true;
        Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
        if (!z) {
            C3332vr.m14978lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.3
                @Override // java.lang.Runnable
                public void run() {
                    C3322sf.this.m14877ri(1, C3307lr.m14718ri().xha() || C3307lr.m14718ri().m14728qt());
                    C3322sf.this.luy();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: ik */
    public boolean m14853ik(String str) {
        return m14883su(str).f11590ik == 1;
    }

    public int iph() {
        int iRi = this.f11627aw.m14805ri("bus_con_auto_click_delay", 3000);
        if (iRi <= 0) {
            return 3000;
        }
        return iRi;
    }

    public int jbs(String str) {
        if (str == null) {
            return 1500;
        }
        return m14883su(str).slm;
    }

    public boolean jbs() {
        return this.f11627aw.m14805ri("if_both_open", 0) == 1;
    }

    /* JADX INFO: renamed from: jc */
    public String m14854jc() {
        return this.f11627aw.m14808ri("settings_url", "");
    }

    public JSONObject jxw() {
        return (JSONObject) this.f11627aw.m14807ri("perf_con_thread_pool_config", new JSONObject(), this.f11628ay);
    }

    /* JADX INFO: renamed from: ka */
    public String m14855ka() {
        return this.f11627aw.m14808ri("aes_key", "");
    }

    /* JADX INFO: renamed from: ka */
    public boolean m14856ka(String str) {
        return m14883su(str).f11602zf;
    }

    /* JADX INFO: renamed from: kt */
    public String m14857kt() {
        return this.f11627aw.m14808ri("app_log_url", "");
    }

    /* JADX INFO: renamed from: lr */
    public int m14858lr(int i) {
        return m14883su(String.valueOf(i)).f11592lr;
    }

    /* JADX INFO: renamed from: lr */
    public int m14859lr(String str) {
        Integer num;
        Map map = (Map) this.f11627aw.m14807ri("perf_con_applog_rate", null, this.ihz);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    void luy() {
        C3332vr.m14978lr().removeCallbacks(this.f11626ac);
        C3332vr.m14978lr().postDelayed(this.f11626ac, ajz());
    }

    /* JADX INFO: renamed from: mj */
    public void m14860mj() {
        this.f11627aw.m14803lr().mo14760ri("ab_test_param").mo14766ri();
    }

    /* JADX INFO: renamed from: mj */
    public boolean m14861mj(String str) {
        return str == null || m14883su(str).bgr == 1;
    }

    /* JADX INFO: renamed from: nd */
    public boolean m14862nd() {
        return this.f11627aw.m14804ri("global_rate", 1.0f) == 1.0f;
    }

    /* JADX INFO: renamed from: nh */
    public boolean m14863nh() {
        return this.f11627aw.m14805ri("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    /* JADX INFO: renamed from: nr */
    public JSONObject m14864nr(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.f11627aw.m14808ri("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", m14883su(str).f11595oh);
                return jSONObject2;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                C2707ac.m10197ik("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: nr */
    public boolean m14865nr() {
        return this.f11627aw.m14810ri("ad_revenue_enable", true);
    }

    /* JADX INFO: renamed from: oh */
    public int m14866oh() {
        return this.f11627aw.m14805ri("max", 50);
    }

    public boolean ory() {
        return this.f11627aw.m14805ri("landingpage_new_style", -1) == 1;
    }

    /* JADX INFO: renamed from: pc */
    public JSONObject m14867pc() {
        return (JSONObject) this.f11627aw.m14807ri("video_cache_config", null, InterfaceC3312fi.f11567ri);
    }

    /* JADX INFO: renamed from: pu */
    public C3437qt m14868pu() {
        return (C3437qt) this.f11627aw.m14807ri("perf_con_track_url_strategy", C3437qt.f12460ri, this.f11631mj);
    }

    /* JADX INFO: renamed from: pv */
    public int m14869pv() {
        int iRi = this.f11627aw.m14805ri("fetch_tpl_second", 0);
        if (iRi <= 0) {
            return 0;
        }
        return iRi;
    }

    /* JADX INFO: renamed from: qd */
    public boolean m14870qd() {
        return this.f11627aw.m14801ik();
    }

    /* JADX INFO: renamed from: qh */
    public boolean m14871qh() {
        return this.f11627aw.m14805ri("privacy_debug_unlock", 1) != 0;
    }

    public boolean qmx() {
        int iRi = this.f11630co.m14805ri("perf_con_apm", 100);
        if (iRi == 0) {
            return false;
        }
        return iRi < 0 || iRi >= 100 || iRi > ((int) (Math.random() * 100.0d));
    }

    /* JADX INFO: renamed from: qt */
    public int m14872qt(String str) {
        return m14883su(str).f11598sf;
    }

    /* JADX INFO: renamed from: qt */
    public String m14873qt() {
        return this.f11627aw.m14808ri("ab_test_version", "");
    }

    /* JADX INFO: renamed from: ri */
    public int m14874ri(int i) {
        return m14883su(String.valueOf(i)).hcw;
    }

    /* JADX INFO: renamed from: ri */
    public int m14875ri(String str) {
        if (str == null) {
            return 0;
        }
        return C3299nr.m14639ka().m14883su(str).tan;
    }

    /* JADX INFO: renamed from: ri */
    public void m14876ri() {
        try {
            C3313ik.m14772ri();
            this.f11627aw.m14802ka();
            this.f11630co.m14802ka();
            Context contextM14642ri = C3299nr.m14642ri();
            File file = new File(Build.VERSION.SDK_INT >= 24 ? new File(contextM14642ri.getDataDir(), "shared_prefs") : new File(contextM14642ri.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                String strReplace = file.getName().replace(".xml", "");
                if (Build.VERSION.SDK_INT >= 24) {
                    contextM14642ri.deleteSharedPreferences(strReplace);
                } else {
                    contextM14642ri.getSharedPreferences(strReplace, 0).edit().clear().apply();
                    com.bytedance.sdk.component.utils.xha.m10326ik(file);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14877ri(final int i, boolean z) {
        if (C3307lr.m14718ri().m14724ka()) {
            return;
        }
        if (!C3332vr.m14975fi() && i != 1 && i != 2) {
            if (z) {
                this.f11632nr = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(C3304qt.m14669lr().m14689ka())) {
                return;
            }
            if (this.f11632nr) {
                this.f11632nr = false;
                if (!z) {
                    z = true;
                }
            }
            long jM14898zk = m14898zk();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jAjz = ajz();
            long j = jCurrentTimeMillis - jM14898zk;
            if ((z || j >= jAjz) && this.bgr.compareAndSet(false, true)) {
                dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("setting_req") { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.6
                    @Override // java.lang.Runnable
                    public void run() {
                        C3307lr.m14718ri().m14731ri(new InterfaceC3306ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.6.1
                            @Override // com.bytedance.sdk.openadsdk.core.p224qt.InterfaceC3306ka
                            /* JADX INFO: renamed from: ri */
                            public void mo14717ri(boolean z2) {
                                if (z2) {
                                    new jbs(C3322sf.this, C3322sf.this.f11627aw, C3322sf.this.f11630co).run();
                                } else {
                                    C3322sf.this.bgr.set(false);
                                }
                            }
                        }, i == 6);
                    }
                });
                C3332vr.m14978lr().removeCallbacks(this.f11626ac);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14878ri(long j) {
        this.f11627aw.m14803lr().mo14763ri("last_req_time", j).mo14766ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m14879ri(JSONObject jSONObject, InterfaceC3312fi.ri riVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        C3319mj c3319mj = this.f11627aw;
        String str = jbs;
        String strRi = c3319mj.m14808ri("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strRi) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strRi)) {
            C3332vr.m14978lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(C3322sf.this.f11627aw.m14808ri("dyn_draw_engine_url", C3322sf.jbs), strOptString)) {
                        C2520fi.m9074lr().m9080ik();
                    }
                }
            }, 5000L);
        }
        riVar.mo14764ri("dyn_draw_engine_url", strOptString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jbs.InterfaceC3316ri
    /* JADX INFO: renamed from: ri */
    public void mo14781ri(boolean z) {
        this.bgr.set(false);
        luy();
        if (z) {
            HashMap map = new HashMap();
            Set<String> setM14899zv = m14899zv();
            if (setM14899zv != null && !setM14899zv.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setM14899zv);
            }
            String strM16464nr = C3571ig.m16464nr();
            if (!TextUtils.isEmpty(strM16464nr)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strM16464nr);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, tpb());
            C3324ik.m14919ri(map);
        }
    }

    public boolean rzk() {
        boolean z = this.f11627aw.m14805ri("bus_con_sec_type", Integer.MAX_VALUE) != 0;
        Boolean.valueOf(z);
        return z;
    }

    public int saa() {
        return this.f11627aw.m14805ri("blank_detect_rate", 30);
    }

    public int sez() {
        return this.f11627aw.m14805ri("perf_con_sync_gaid", 0);
    }

    /* JADX INFO: renamed from: sf */
    public int m14880sf() {
        return this.f11627aw.m14805ri("splash_video_load_strategy", 0);
    }

    /* JADX INFO: renamed from: sf */
    public int m14881sf(String str) {
        return m14883su(str).f11585co;
    }

    public boolean siy() {
        int iRi = this.f11627aw.m14805ri("privacy_ad_enable", Integer.MAX_VALUE);
        if (iRi == 1) {
            return true;
        }
        if (iRi == 0) {
            return false;
        }
        int iM16430ay = C3571ig.m16430ay();
        return iM16430ay == 1 || iM16430ay == 2 || iM16430ay == 3;
    }

    public boolean slm() {
        return this.f11627aw.m14810ri("allow_blind_mode_request_ad", false);
    }

    public boolean slm(String str) {
        return m14883su(str).f11600uq == 0;
    }

    public String srn() {
        return this.f11627aw.m14808ri("ads_url", "");
    }

    /* JADX INFO: renamed from: su */
    public float m14882su() {
        return this.f11627aw.m14804ri(f11621ik, 1.0f);
    }

    /* JADX INFO: renamed from: su */
    public C3318lr m14883su(String str) {
        return C3313ik.m14770ri(str);
    }

    /* JADX INFO: renamed from: ta */
    public String m14884ta() {
        return this.f11627aw.m14808ri("dc", "");
    }

    public int tan(String str) {
        return m14883su(str).f11581ac;
    }

    public boolean tan() {
        return this.f11627aw.m14810ri("bus_con_adshow_check_enable", true);
    }

    public String tnn() {
        return this.f11627aw.m14808ri("dyn_draw_engine_url", jbs);
    }

    public String tpb() {
        return this.f11627aw.m14808ri("target_region", "");
    }

    /* JADX INFO: renamed from: tw */
    public boolean m14885tw() {
        return this.f11635vr;
    }

    /* JADX INFO: renamed from: ud */
    public boolean m14886ud() {
        return this.bgr.get();
    }

    /* JADX INFO: renamed from: uq */
    public int m14887uq(String str) {
        return m14883su(str).f11599su;
    }

    /* JADX INFO: renamed from: uq */
    public String m14888uq() {
        return this.f11627aw.m14808ri("bus_con_check_clz", "");
    }

    /* JADX INFO: renamed from: vr */
    public int m14889vr() {
        m14826sz();
        return this.slm;
    }

    /* JADX INFO: renamed from: vr */
    public int m14890vr(String str) {
        return m14883su(str).f11596qt;
    }

    /* JADX INFO: renamed from: vt */
    public String m14891vt() {
        return this.f11627aw.m14808ri("dual_event_url", (String) null);
    }

    public int whw() {
        int iRi = this.f11627aw.m14805ri("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iRi != Integer.MAX_VALUE) {
            return iRi;
        }
        int iM16430ay = C3571ig.m16430ay();
        if (iM16430ay == 1 || iM16430ay == 2) {
            return 2;
        }
        return iM16430ay != 3 ? 0 : 1;
    }

    public int wjv(String str) {
        return m14883su(str).igq;
    }

    public boolean wjv() {
        return this.f11627aw.m14805ri("bus_con_url_check", 1) != 0;
    }

    /* JADX INFO: renamed from: xd */
    public C3311di m14892xd() {
        return (C3311di) this.f11627aw.m14807ri("insert_js_config", C3311di.f11561ri, new InterfaceC3312fi.lr<C3311di>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public C3311di mo14757lr(String str) {
                return new C3311di(str);
            }
        });
    }

    /* JADX INFO: renamed from: xe */
    public int m14893xe() {
        int iRi = this.f11627aw.m14805ri("perf_con_webview_cache_count_v3", 0);
        if (iRi < 0) {
            return 0;
        }
        return iRi;
    }

    public int xha(String str) {
        return m14883su(str).f11594nr;
    }

    public long xha() {
        return this.f11627aw.m14806ri("data_time", 0L);
    }

    public boolean xlq() {
        return this.f11627aw.m14805ri("token_enable", 0) == 1;
    }

    /* JADX INFO: renamed from: xm */
    public boolean m14894xm() {
        return this.f11627aw.m14805ri("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    public String[] yjm() {
        try {
            Set<String> set = this.f11633qt;
            if (set == null || set.size() == 0) {
                JSONArray jSONArray = new JSONArray(this.f11627aw.m14808ri("gecko_hosts", (String) null));
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.f11633qt.add(jSONArray.getString(i));
                    }
                }
                Set<String> setM14791ri = C3319mj.m14791ri(this.f11633qt);
                this.f11633qt = setM14791ri;
                if (setM14791ri != null) {
                    if (setM14791ri.size() == 0) {
                    }
                }
                return null;
            }
            return (String[]) this.f11633qt.toArray(new String[0]);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: zb */
    public boolean m14895zb() {
        return this.f11627aw.m14805ri("read_video_from_cache", 1) == 1;
    }

    /* JADX INFO: renamed from: zf */
    public int m14896zf() {
        return this.f11627aw.m14805ri("loadedCallbackOpportunity", 0);
    }

    /* JADX INFO: renamed from: zf */
    public boolean m14897zf(String str) {
        Set<String> setZxp;
        if (TextUtils.isEmpty(str) || (setZxp = zxp()) == null || setZxp.size() == 0) {
            return false;
        }
        return setZxp.contains(str);
    }

    /* JADX INFO: renamed from: zk */
    public long m14898zk() {
        return this.f11627aw.m14806ri("last_req_time", 0L);
    }

    /* JADX INFO: renamed from: zv */
    public Set<String> m14899zv() {
        return (Set) this.f11627aw.m14807ri("privacy_fields_allowed", Collections.EMPTY_SET, InterfaceC3312fi.f11566lr);
    }

    public Set<String> zxp() {
        return (Set) this.f11627aw.m14807ri("token_adx_ids", Collections.EMPTY_SET, InterfaceC3312fi.f11566lr);
    }

    public int zyn() {
        return this.f11627aw.m14805ri("ivrv_downward", 0);
    }
}
