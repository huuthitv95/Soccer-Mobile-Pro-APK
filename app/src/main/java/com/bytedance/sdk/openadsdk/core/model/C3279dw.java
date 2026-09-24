package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.dw */
/* JADX INFO: loaded from: classes3.dex */
public class C3279dw {

    /* JADX INFO: renamed from: aw */
    private int f11219aw;
    private int bgr;

    /* JADX INFO: renamed from: bu */
    private String f11220bu;

    /* JADX INFO: renamed from: co */
    private int f11221co;

    /* JADX INFO: renamed from: di */
    private String f11222di;

    /* JADX INFO: renamed from: fi */
    private String f11223fi;

    /* JADX INFO: renamed from: ik */
    private boolean f11224ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private int f11225ka;

    /* JADX INFO: renamed from: lr */
    private int f11226lr;

    /* JADX INFO: renamed from: mj */
    private int f11227mj;

    /* JADX INFO: renamed from: nr */
    private String f11228nr;

    /* JADX INFO: renamed from: qt */
    private boolean f11229qt;

    /* JADX INFO: renamed from: ri */
    private int f11230ri;

    /* JADX INFO: renamed from: sf */
    private int f11231sf;
    private String slm;

    /* JADX INFO: renamed from: vr */
    private int f11232vr;
    private int xha;

    public C3279dw(JSONObject jSONObject) {
        this.f11221co = 5;
        this.f11219aw = 5;
        this.bgr = 10;
        this.f11232vr = 20;
        this.slm = "Next Ad";
        this.f11220bu = "Next ad in %1$ds";
        this.f11228nr = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.f11224ik = jSONObject.optBoolean("is_playable");
        this.f11225ka = jSONObject.optInt("playable_type", 0);
        this.f11223fi = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.f11222di = jSONObjectOptJSONObject.optString("playable_url", "");
            this.xha = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.f11226lr = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.f11230ri = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iM14096ri = m14096ri(this.f11225ka);
            this.f11227mj = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iM14096ri);
            this.jbs = jSONObjectOptJSONObject.optInt("playable_js_timeout", iM14096ri);
            this.f11229qt = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.f11221co = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.f11219aw = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.bgr = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.f11232vr = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.f11220bu = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.slm = jSONObjectOptJSONObject.optString("next_ad_text");
            this.f11228nr = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.f11231sf = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.f11231sf = 0;
        }
    }

    /* JADX INFO: renamed from: ac */
    public static boolean m14081ac(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        return c3279dwM14102zf != null && c3279dwM14102zf.m14109qt();
    }

    /* JADX INFO: renamed from: aw */
    public static boolean m14082aw(wjv wjvVar) {
        return true;
    }

    /* JADX INFO: renamed from: ay */
    public static String m14083ay(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return null;
        }
        return c3279dwM14102zf.m14103di();
    }

    public static boolean bgr(wjv wjvVar) {
        C1997lr c1997lrM14389eu = wjvVar.m14389eu();
        return c1997lrM14389eu != null && c1997lrM14389eu.m6335ac() == 1;
    }

    /* JADX INFO: renamed from: bu */
    public static long m14084bu(wjv wjvVar) {
        return Math.max(m14094nr(wjvVar), tan(wjvVar));
    }

    /* JADX INFO: renamed from: co */
    public static String m14085co(wjv wjvVar) {
        if (wjvVar == null) {
            return null;
        }
        C3279dw c3279dwM14537tw = wjvVar.m14537tw();
        if (c3279dwM14537tw != null && c3279dwM14537tw.f11224ik) {
            String str = c3279dwM14537tw.f11222di;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (wjvVar.m14453nd() == 20) {
            return wjvVar.smj();
        }
        if (wjvVar.m14389eu() != null) {
            return wjvVar.m14389eu().m6338co();
        }
        return null;
    }

    /* JADX INFO: renamed from: di */
    public static boolean m14086di(wjv wjvVar) {
        return m14088fi(wjvVar) && m14087dw(wjvVar) == 1;
    }

    /* JADX INFO: renamed from: dw */
    private static int m14087dw(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 0;
        }
        return c3279dwM14102zf.f11225ka;
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m14088fi(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        return c3279dwM14102zf != null && wjvVar.m14534tp() && c3279dwM14102zf.f11224ik && !TextUtils.isEmpty(m14085co(wjvVar));
    }

    /* JADX INFO: renamed from: fr */
    public static int m14089fr(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 0;
        }
        return c3279dwM14102zf.m14107lr();
    }

    public static int igq(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 0;
        }
        return c3279dwM14102zf.m14106ka();
    }

    public static int ihz(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 0;
        }
        return c3279dwM14102zf.m14110ri();
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m14090ik(wjv wjvVar) {
        return m14092lr(wjvVar) && m14087dw(wjvVar) == 1;
    }

    public static int jbs(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 0;
        }
        return c3279dwM14102zf.f11231sf;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m14091ka(wjv wjvVar) {
        return m14090ik(wjvVar) && !xha(wjvVar);
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m14092lr(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        return (c3279dwM14102zf == null || !c3279dwM14102zf.f11224ik || TextUtils.isEmpty(m14085co(wjvVar))) ? false : true;
    }

    /* JADX INFO: renamed from: mj */
    public static boolean m14093mj(wjv wjvVar) {
        C3279dw c3279dwM14537tw = wjvVar.m14537tw();
        return c3279dwM14537tw != null && wjvVar.m14534tp() && c3279dwM14537tw.f11224ik && c3279dwM14537tw.f11226lr == 1;
    }

    /* JADX INFO: renamed from: nr */
    public static long m14094nr(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 5L;
        }
        return c3279dwM14102zf.m14108mj();
    }

    /* JADX INFO: renamed from: qt */
    public static String m14095qt(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return null;
        }
        return c3279dwM14102zf.f11223fi;
    }

    /* JADX INFO: renamed from: ri */
    private static int m14096ri(int i) {
        return i == 1 ? 10 : 5;
    }

    /* JADX INFO: renamed from: ri */
    public static int m14097ri(wjv wjvVar) {
        int i;
        C3279dw c3279dwM14537tw = wjvVar.m14537tw();
        if (c3279dwM14537tw != null && (i = c3279dwM14537tw.f11230ri) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: sf */
    public static String m14098sf(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return null;
        }
        return c3279dwM14102zf.f11222di;
    }

    public static boolean slm(wjv wjvVar) {
        return false;
    }

    /* JADX INFO: renamed from: su */
    public static int m14099su(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 0;
        }
        return c3279dwM14102zf.m14105ik();
    }

    public static long tan(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 5L;
        }
        return c3279dwM14102zf.jbs();
    }

    /* JADX INFO: renamed from: uq */
    public static String m14100uq(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return null;
        }
        return c3279dwM14102zf.m14104fi();
    }

    /* JADX INFO: renamed from: vr */
    public static int m14101vr(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return 0;
        }
        return c3279dwM14102zf.xha;
    }

    public static String wjv(wjv wjvVar) {
        C3279dw c3279dwM14102zf = m14102zf(wjvVar);
        if (c3279dwM14102zf == null) {
            return null;
        }
        return c3279dwM14102zf.xha();
    }

    public static boolean xha(wjv wjvVar) {
        C3279dw c3279dwM14537tw = wjvVar.m14537tw();
        return c3279dwM14537tw != null && c3279dwM14537tw.f11224ik && c3279dwM14537tw.f11226lr == 1;
    }

    /* JADX INFO: renamed from: zf */
    private static C3279dw m14102zf(wjv wjvVar) {
        if (wjvVar == null) {
            return null;
        }
        return wjvVar.m14537tw();
    }

    /* JADX INFO: renamed from: di */
    public String m14103di() {
        return this.f11220bu;
    }

    /* JADX INFO: renamed from: fi */
    public String m14104fi() {
        return this.slm;
    }

    /* JADX INFO: renamed from: ik */
    public int m14105ik() {
        return this.bgr;
    }

    public int jbs() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ka */
    public int m14106ka() {
        return this.f11232vr;
    }

    /* JADX INFO: renamed from: lr */
    public int m14107lr() {
        return this.f11219aw;
    }

    /* JADX INFO: renamed from: mj */
    public int m14108mj() {
        return this.f11227mj;
    }

    /* JADX INFO: renamed from: qt */
    public boolean m14109qt() {
        return this.f11229qt;
    }

    /* JADX INFO: renamed from: ri */
    public int m14110ri() {
        return this.f11221co;
    }

    public String xha() {
        return this.f11228nr;
    }
}
