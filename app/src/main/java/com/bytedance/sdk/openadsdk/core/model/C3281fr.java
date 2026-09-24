package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p200co.p215mj.C3180ri;
import com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.fr */
/* JADX INFO: loaded from: classes3.dex */
public class C3281fr {

    /* JADX INFO: renamed from: aw */
    private int f11239aw;
    private int bgr;

    /* JADX INFO: renamed from: co */
    private JSONObject f11241co;

    /* JADX INFO: renamed from: di */
    private int f11242di;

    /* JADX INFO: renamed from: fi */
    private int f11243fi;

    /* JADX INFO: renamed from: ik */
    private int f11244ik;
    private String jbs;

    /* JADX INFO: renamed from: ka */
    private int f11245ka;

    /* JADX INFO: renamed from: nr */
    private C3287oh f11248nr;

    /* JADX INFO: renamed from: ri */
    private int f11250ri;

    /* JADX INFO: renamed from: sf */
    private boolean f11251sf;
    private lr tan;
    private JSONObject xha;

    /* JADX INFO: renamed from: lr */
    private int f11246lr = 10;

    /* JADX INFO: renamed from: mj */
    private int f11247mj = 1;

    /* JADX INFO: renamed from: qt */
    private ri f11249qt = new ri();

    /* JADX INFO: renamed from: vr */
    private int f11252vr = 1;
    private String slm = "Next Ad";

    /* JADX INFO: renamed from: bu */
    private String f11240bu = "Next ad in %1$ds";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.fr$lr */
    public static class lr {

        /* JADX INFO: renamed from: fi */
        private float f11253fi;

        /* JADX INFO: renamed from: ik */
        private String f11254ik;

        /* JADX INFO: renamed from: ka */
        private float f11255ka;

        /* JADX INFO: renamed from: lr */
        private String f11256lr;

        /* JADX INFO: renamed from: ri */
        private int f11257ri;

        /* JADX INFO: renamed from: ri */
        public static lr m14135ri(JSONObject jSONObject) {
            lr lrVar = new lr();
            if (jSONObject == null) {
                return lrVar;
            }
            lrVar.f11257ri = jSONObject.optInt("progress_type", 0);
            lrVar.f11256lr = jSONObject.optString("progress_color");
            lrVar.f11254ik = jSONObject.optString("progress_background_color");
            lrVar.f11255ka = jSONObject.optInt("progress_size", 0);
            lrVar.f11253fi = jSONObject.optInt("bar_radius", 0);
            return lrVar;
        }

        /* JADX INFO: renamed from: fi */
        public float m14136fi() {
            return this.f11253fi;
        }

        /* JADX INFO: renamed from: ik */
        public String m14137ik() {
            return this.f11254ik;
        }

        /* JADX INFO: renamed from: ka */
        public float m14138ka() {
            return this.f11255ka;
        }

        /* JADX INFO: renamed from: lr */
        public String m14139lr() {
            return this.f11256lr;
        }

        /* JADX INFO: renamed from: ri */
        public int m14140ri() {
            return this.f11257ri;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.fr$ri */
    public static class ri {

        /* JADX INFO: renamed from: fi */
        private int f11258fi;

        /* JADX INFO: renamed from: ik */
        private int f11259ik;

        /* JADX INFO: renamed from: ka */
        private int f11260ka;

        /* JADX INFO: renamed from: lr */
        private int f11261lr;

        /* JADX INFO: renamed from: ri */
        private int f11262ri;

        /* JADX INFO: renamed from: ri */
        public static ri m14141ri(JSONObject jSONObject) {
            ri riVar = new ri();
            if (jSONObject == null) {
                return riVar;
            }
            riVar.f11262ri = Math.max(0, jSONObject.optInt("padding_left", 0));
            riVar.f11261lr = Math.max(0, jSONObject.optInt("padding_right", 0));
            riVar.f11259ik = Math.max(0, jSONObject.optInt("padding_top", 0));
            riVar.f11260ka = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            riVar.f11258fi = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return riVar;
        }

        /* JADX INFO: renamed from: fi */
        public int m14142fi() {
            return this.f11258fi;
        }

        /* JADX INFO: renamed from: ik */
        public int m14143ik() {
            return this.f11262ri;
        }

        /* JADX INFO: renamed from: ka */
        public int m14144ka() {
            return this.f11261lr;
        }

        /* JADX INFO: renamed from: lr */
        public int m14145lr() {
            return this.f11259ik;
        }

        /* JADX INFO: renamed from: ri */
        public int m14146ri() {
            return this.f11260ka;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3281fr m14121ri(String str) {
        C3281fr c3281fr = new C3281fr();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c3281fr.f11250ri = jSONObject.optInt("auto_switch");
                c3281fr.f11246lr = jSONObject.optInt("playable_preload_count");
                c3281fr.f11244ik = jSONObject.optInt("disable_on_interaction");
                c3281fr.f11245ka = jSONObject.optInt("ceiling_type");
                c3281fr.f11243fi = jSONObject.optInt("can_loop");
                c3281fr.f11242di = jSONObject.optInt("multi_skip_time", -1);
                c3281fr.f11247mj = jSONObject.optInt("load_more_strategy");
                c3281fr.f11252vr = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                c3281fr.xha = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    C3287oh c3287ohM14224ri = C3287oh.m14224ri(jSONObjectOptJSONObject);
                    c3281fr.f11248nr = c3287ohM14224ri;
                    if (c3287ohM14224ri != null && !TextUtils.isEmpty(c3287ohM14224ri.m14227ik())) {
                        C3183lr.m13301ri().m13310ri(new C3180ri().m13275ri(c3281fr.f11248nr.m14230ri()).m13273lr(c3281fr.f11248nr.m14229lr()).m13269ik(c3281fr.f11248nr.m14227ik()).m13271ka(c3281fr.f11248nr.m14228ka()), "guide");
                    }
                    int iOptInt = c3281fr.xha.optInt("delay_show_time", 5);
                    c3281fr.f11239aw = iOptInt;
                    if (iOptInt < 0) {
                        c3281fr.f11239aw = 5;
                    }
                    int iOptInt2 = c3281fr.xha.optInt("dismiss_after_idle_time", 3);
                    c3281fr.bgr = iOptInt2;
                    if (iOptInt2 <= 0) {
                        c3281fr.bgr = 3;
                    }
                }
                c3281fr.jbs = jSONObject.optString("agg_endcard_url");
                c3281fr.f11251sf = jSONObject.optBoolean("has_more");
                c3281fr.f11241co = jSONObject.optJSONObject("session_params");
                c3281fr.f11249qt = ri.m14141ri(jSONObject.optJSONObject("layout_config"));
                c3281fr.tan = lr.m14135ri(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return c3281fr;
    }

    /* JADX INFO: renamed from: aw */
    public boolean m14122aw() {
        return this.f11251sf;
    }

    public boolean bgr() {
        return this.f11244ik == 1;
    }

    /* JADX INFO: renamed from: bu */
    public lr m14123bu() {
        return this.tan;
    }

    /* JADX INFO: renamed from: co */
    public JSONObject m14124co() {
        return this.f11241co;
    }

    /* JADX INFO: renamed from: di */
    public ri m14125di() {
        return this.f11249qt;
    }

    /* JADX INFO: renamed from: fi */
    public int m14126fi() {
        return this.bgr;
    }

    /* JADX INFO: renamed from: ik */
    public JSONObject m14127ik() {
        C3287oh c3287oh = this.f11248nr;
        if (c3287oh == null) {
            return null;
        }
        return c3287oh.m14226fi();
    }

    public int jbs() {
        return this.f11242di;
    }

    /* JADX INFO: renamed from: ka */
    public int m14128ka() {
        return this.f11239aw;
    }

    /* JADX INFO: renamed from: lr */
    public JSONObject m14129lr() {
        C3287oh c3287oh = this.f11248nr;
        if (c3287oh == null) {
            return null;
        }
        try {
            String strM14228ka = c3287oh.m14228ka();
            if (!TextUtils.isEmpty(strM14228ka)) {
                return new JSONObject(strM14228ka);
            }
            String strM13308ri = C3183lr.m13301ri().m13308ri("guide", this.f11248nr.m14230ri(), this.f11248nr.m14229lr());
            if (TextUtils.isEmpty(strM13308ri)) {
                return null;
            }
            return new JSONObject(strM13308ri);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: mj */
    public int m14130mj() {
        return this.f11247mj;
    }

    /* JADX INFO: renamed from: qt */
    public boolean m14131qt() {
        return this.f11243fi == 1;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m14132ri() {
        return this.f11252vr == 1;
    }

    /* JADX INFO: renamed from: sf */
    public boolean m14133sf() {
        return this.f11245ka == 1;
    }

    public int slm() {
        return this.f11246lr;
    }

    /* JADX INFO: renamed from: vr */
    public boolean m14134vr() {
        return this.f11250ri == 1;
    }

    public String xha() {
        return this.jbs;
    }
}
