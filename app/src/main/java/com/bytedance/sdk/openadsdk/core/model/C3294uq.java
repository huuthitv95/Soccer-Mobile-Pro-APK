package com.bytedance.sdk.openadsdk.core.model;

import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.uq */
/* JADX INFO: loaded from: classes3.dex */
public class C3294uq {

    /* JADX INFO: renamed from: ri */
    private String f11388ri = MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL;

    /* JADX INFO: renamed from: lr */
    private int f11385lr = 1;

    /* JADX INFO: renamed from: ik */
    private int f11383ik = 1;

    /* JADX INFO: renamed from: ka */
    private int f11384ka = 0;

    /* JADX INFO: renamed from: fi */
    private int f11382fi = 0;

    /* JADX INFO: renamed from: di */
    private int f11381di = 0;
    private int xha = 0;

    /* JADX INFO: renamed from: mj */
    private int f11386mj = 5000;
    private int jbs = 500;

    /* JADX INFO: renamed from: qt */
    private int f11387qt = 0;

    /* JADX INFO: renamed from: ri */
    public static C3294uq m14319ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new C3294uq();
        }
        C3294uq c3294uq = new C3294uq();
        c3294uq.f11388ri = jSONObject.optString("direction", MessengerShareContentUtility.IMAGE_RATIO_HORIZONTAL);
        c3294uq.f11385lr = jSONObject.optInt("auto_loop", 1);
        c3294uq.f11383ik = jSONObject.optInt("allow_manual_loop", 1);
        c3294uq.f11384ka = jSONObject.optInt("unlimited_loop", 0);
        c3294uq.f11382fi = jSONObject.optInt("left_margin", 0);
        c3294uq.f11381di = jSONObject.optInt("right_margin", 0);
        c3294uq.xha = jSONObject.optInt("ad_margin", 0);
        c3294uq.f11386mj = jSONObject.optInt("loop_interval_time", 5000);
        c3294uq.jbs = jSONObject.optInt("flip_speed", 500);
        c3294uq.f11387qt = jSONObject.optInt("stop_auto_loop", 0);
        return c3294uq;
    }

    /* JADX INFO: renamed from: di */
    public int m14320di() {
        return this.f11381di;
    }

    /* JADX INFO: renamed from: fi */
    public int m14321fi() {
        return this.f11382fi;
    }

    /* JADX INFO: renamed from: ik */
    public int m14322ik() {
        return this.f11383ik;
    }

    public int jbs() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ka */
    public int m14323ka() {
        return this.f11384ka;
    }

    /* JADX INFO: renamed from: lr */
    public int m14324lr() {
        return this.f11385lr;
    }

    /* JADX INFO: renamed from: mj */
    public int m14325mj() {
        return this.f11386mj;
    }

    /* JADX INFO: renamed from: qt */
    public int m14326qt() {
        return this.f11387qt;
    }

    /* JADX INFO: renamed from: ri */
    public String m14327ri() {
        return this.f11388ri;
    }

    public int xha() {
        return this.xha;
    }
}
