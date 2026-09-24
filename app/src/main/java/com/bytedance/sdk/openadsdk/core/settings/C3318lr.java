package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3318lr {

    /* JADX INFO: renamed from: ac */
    public int f11581ac;

    /* JADX INFO: renamed from: aw */
    public int f11582aw;

    /* JADX INFO: renamed from: ay */
    public int f11583ay;
    public int bgr;

    /* JADX INFO: renamed from: bu */
    public int f11584bu;

    /* JADX INFO: renamed from: co */
    public int f11585co;

    /* JADX INFO: renamed from: di */
    public int f11586di;

    /* JADX INFO: renamed from: dw */
    public boolean f11587dw;

    /* JADX INFO: renamed from: fi */
    public int f11588fi;

    /* JADX INFO: renamed from: fr */
    public int f11589fr;
    public int hcw;
    public int igq;
    public boolean ihz;

    /* JADX INFO: renamed from: ik */
    public int f11590ik;
    public int jbs;

    /* JADX INFO: renamed from: ka */
    public int f11591ka;

    /* JADX INFO: renamed from: lr */
    public int f11592lr;

    /* JADX INFO: renamed from: mj */
    public int f11593mj;

    /* JADX INFO: renamed from: nr */
    public int f11594nr;

    /* JADX INFO: renamed from: oh */
    public JSONObject f11595oh;
    public boolean ory;

    /* JADX INFO: renamed from: qt */
    public int f11596qt;

    /* JADX INFO: renamed from: ri */
    public String f11597ri;

    /* JADX INFO: renamed from: sf */
    public int f11598sf;
    public int slm;

    /* JADX INFO: renamed from: su */
    public int f11599su;
    public int tan;

    /* JADX INFO: renamed from: uq */
    public int f11600uq;

    /* JADX INFO: renamed from: vr */
    public int f11601vr;
    public List<String> wjv;
    public int xha;

    /* JADX INFO: renamed from: zf */
    public boolean f11602zf;

    public C3318lr(String str, int i) {
        this.f11592lr = 1;
        this.f11590ik = 1;
        this.f11591ka = 2;
        this.f11588fi = 1;
        this.f11586di = 100;
        this.xha = 0;
        this.f11593mj = 2;
        this.jbs = 1;
        this.f11596qt = 3;
        this.f11598sf = 30;
        this.f11585co = 30;
        this.f11582aw = 1;
        this.bgr = 1;
        this.f11601vr = 2;
        this.slm = 1500;
        this.f11584bu = 2;
        this.f11594nr = 3500;
        this.tan = 0;
        this.f11581ac = 5;
        this.ihz = false;
        this.f11600uq = 0;
        this.f11583ay = 2;
        this.f11589fr = 0;
        this.f11599su = 0;
        this.igq = 5;
        this.f11602zf = true;
        this.f11587dw = false;
        this.ory = false;
        this.hcw = -1;
        this.f11595oh = new JSONObject();
        this.f11597ri = str;
        this.f11590ik = i;
    }

    public C3318lr(JSONObject jSONObject) {
        this.f11592lr = 1;
        this.f11590ik = 1;
        this.f11591ka = 2;
        this.f11588fi = 1;
        this.f11586di = 100;
        this.xha = 0;
        this.f11593mj = 2;
        this.jbs = 1;
        this.f11596qt = 3;
        this.f11598sf = 30;
        this.f11585co = 30;
        this.f11582aw = 1;
        this.bgr = 1;
        this.f11601vr = 2;
        this.slm = 1500;
        this.f11584bu = 2;
        this.f11594nr = 3500;
        this.tan = 0;
        this.f11581ac = 5;
        this.ihz = false;
        this.f11600uq = 0;
        this.f11583ay = 2;
        this.f11589fr = 0;
        this.f11599su = 0;
        this.igq = 5;
        this.f11602zf = true;
        this.f11587dw = false;
        this.ory = false;
        this.hcw = -1;
        new JSONObject();
        this.f11595oh = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.f11597ri = jSONObject.optString("code_id");
        this.f11592lr = jSONObject.optInt("auto_play", 1);
        this.hcw = jSONObject.optInt("endcard_close_time", -1);
        this.f11590ik = jSONObject.optInt("voice_control", 1);
        this.f11591ka = jSONObject.optInt("rv_preload", 2);
        this.f11588fi = jSONObject.optInt("nv_preload", 1);
        this.f11586di = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.xha = jSONObject.optInt("skip_time_displayed", 0);
        this.f11593mj = jSONObject.optInt("video_skip_result", 2);
        this.jbs = jSONObject.optInt("reg_creative_control", 1);
        this.f11596qt = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.f11598sf = iOptInt;
        if (iOptInt < 0) {
            this.f11598sf = 30;
        }
        this.f11582aw = jSONObject.optInt("voice_control", 2);
        this.bgr = jSONObject.optInt("if_show_win", 1);
        this.f11601vr = jSONObject.optInt("sp_preload", 2);
        this.slm = jSONObject.optInt("stop_time", 1500);
        this.f11584bu = jSONObject.optInt("native_playable_delay", 2);
        this.f11594nr = jSONObject.optInt("time_out_control", -1);
        this.tan = jSONObject.optInt("playable_reward_type", 0);
        this.f11600uq = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.f11581ac = iOptInt2;
        if (iOptInt2 < 0) {
            this.f11581ac = 5;
        }
        m14790ri(jSONObject.optJSONArray("parent_tpl_ids"));
        this.f11583ay = jSONObject.optInt("slot_type", 2);
        this.ihz = jSONObject.optBoolean("close_on_click", false);
        this.f11589fr = jSONObject.optInt("allow_system_back", 0);
        this.f11599su = jSONObject.optInt("splash_skip_time", 0);
        this.igq = jSONObject.optInt("splash_image_count_down_time", 5);
        this.f11587dw = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.ory = jSONObject.optBoolean("splash_close_on_click", false);
        this.f11602zf = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!m14789ri(this.f11590ik)) {
            this.f11590ik = 1;
        }
        if (!m14789ri(this.f11582aw)) {
            this.f11582aw = 1;
        }
        this.f11585co = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m14789ri(int i) {
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ri */
    public void m14790ri(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.wjv = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.wjv.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }
}
