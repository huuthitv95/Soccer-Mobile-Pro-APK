package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2009lr;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C1997lr {

    /* JADX INFO: renamed from: aw */
    private int f4631aw;

    /* JADX INFO: renamed from: co */
    private int f4633co;

    /* JADX INFO: renamed from: di */
    private String f4634di;

    /* JADX INFO: renamed from: fi */
    private String f4635fi;

    /* JADX INFO: renamed from: ik */
    private long f4636ik;
    private String jbs;

    /* JADX INFO: renamed from: ka */
    private double f4637ka;

    /* JADX INFO: renamed from: lr */
    private int f4638lr;

    /* JADX INFO: renamed from: mj */
    private String f4639mj;

    /* JADX INFO: renamed from: qt */
    private String f4641qt;

    /* JADX INFO: renamed from: ri */
    private int f4642ri;

    /* JADX INFO: renamed from: sf */
    private double f4643sf;
    private String xha;
    private float bgr = -1.0f;

    /* JADX INFO: renamed from: vr */
    private int f4644vr = 0;
    private int slm = 0;

    /* JADX INFO: renamed from: bu */
    private int f4632bu = 0;

    /* JADX INFO: renamed from: nr */
    private int f4640nr = 0;
    private int tan = 307200;

    /* JADX INFO: renamed from: ac */
    private int f4630ac = 1;

    /* JADX INFO: renamed from: ac */
    public int m6335ac() {
        return this.slm;
    }

    /* JADX INFO: renamed from: aw */
    public String m6336aw() {
        return this.jbs;
    }

    public String bgr() {
        if (TextUtils.isEmpty(this.f4641qt)) {
            this.f4641qt = C2009lr.m6445ri(this.xha);
        }
        return this.f4641qt;
    }

    /* JADX INFO: renamed from: bu */
    public int m6337bu() {
        return this.f4640nr;
    }

    /* JADX INFO: renamed from: co */
    public String m6338co() {
        return this.f4639mj;
    }

    /* JADX INFO: renamed from: di */
    public double m6339di() {
        return this.f4637ka;
    }

    /* JADX INFO: renamed from: di */
    public void m6340di(int i) {
        this.f4632bu = i;
    }

    /* JADX INFO: renamed from: di */
    public void m6341di(String str) {
        this.f4641qt = str;
    }

    /* JADX INFO: renamed from: fi */
    public long m6342fi() {
        return this.f4636ik;
    }

    /* JADX INFO: renamed from: fi */
    public void m6343fi(int i) {
        this.tan = i;
    }

    /* JADX INFO: renamed from: fi */
    public void m6344fi(String str) {
        this.jbs = str;
    }

    public boolean ihz() {
        return this.f4632bu == 0;
    }

    /* JADX INFO: renamed from: ik */
    public int m6345ik() {
        return this.f4638lr;
    }

    /* JADX INFO: renamed from: ik */
    public void m6346ik(int i) {
        this.f4638lr = i;
    }

    /* JADX INFO: renamed from: ik */
    public void m6347ik(String str) {
        this.xha = str;
    }

    public String jbs() {
        return this.f4635fi;
    }

    public void jbs(int i) {
        this.slm = i;
    }

    /* JADX INFO: renamed from: ka */
    public int m6348ka() {
        return this.f4631aw;
    }

    /* JADX INFO: renamed from: ka */
    public void m6349ka(int i) {
        this.f4631aw = i;
    }

    /* JADX INFO: renamed from: ka */
    public void m6350ka(String str) {
        this.f4639mj = str;
    }

    /* JADX INFO: renamed from: lr */
    public int m6351lr() {
        return this.f4642ri;
    }

    /* JADX INFO: renamed from: lr */
    public void m6352lr(int i) {
        this.f4642ri = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m6353lr(String str) {
        this.f4634di = str;
    }

    /* JADX INFO: renamed from: mj */
    public float m6354mj() {
        return this.bgr;
    }

    /* JADX INFO: renamed from: mj */
    public void m6355mj(int i) {
        this.f4644vr = i;
    }

    /* JADX INFO: renamed from: nr */
    public JSONObject m6356nr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", m6351lr());
            jSONObject.put("cover_url", m6357qt());
            jSONObject.put("cover_width", m6345ik());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, m6338co());
            jSONObject.put("file_hash", bgr());
            jSONObject.put("resolution", jbs());
            jSONObject.put("size", m6342fi());
            jSONObject.put("video_duration", m6339di());
            jSONObject.put("video_url", m6364sf());
            jSONObject.put("playable_download_url", m6336aw());
            jSONObject.put("if_playable_loading_show", tan());
            jSONObject.put("remove_loading_page_type", m6335ac());
            jSONObject.put("fallback_endcard_judge", m6359ri());
            jSONObject.put("video_preload_size", m6366vr());
            jSONObject.put("reward_video_cached_type", slm());
            jSONObject.put("execute_cached_type", m6337bu());
            jSONObject.put("endcard_render", m6348ka());
            jSONObject.put("replay_time", m6365uq());
            jSONObject.put("play_speed_ratio", m6354mj());
            if (xha() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                jSONObject.put("start", xha());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: qt */
    public String m6357qt() {
        return this.f4634di;
    }

    /* JADX INFO: renamed from: qt */
    public void m6358qt(int i) {
        this.f4630ac = Math.min(4, Math.max(1, i));
    }

    /* JADX INFO: renamed from: ri */
    public int m6359ri() {
        return this.f4633co;
    }

    /* JADX INFO: renamed from: ri */
    public void m6360ri(double d) {
        this.f4637ka = d;
    }

    /* JADX INFO: renamed from: ri */
    public void m6361ri(int i) {
        this.f4633co = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m6362ri(long j) {
        this.f4636ik = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m6363ri(String str) {
        this.f4635fi = str;
    }

    /* JADX INFO: renamed from: sf */
    public String m6364sf() {
        return this.xha;
    }

    public int slm() {
        return this.f4632bu;
    }

    public int tan() {
        return this.f4644vr;
    }

    /* JADX INFO: renamed from: uq */
    public int m6365uq() {
        return this.f4630ac;
    }

    /* JADX INFO: renamed from: vr */
    public int m6366vr() {
        if (this.tan < 0) {
            this.tan = 307200;
        }
        long j = this.tan;
        long j2 = this.f4636ik;
        if (j > j2) {
            this.tan = (int) j2;
        }
        return this.tan;
    }

    public double xha() {
        return this.f4643sf;
    }

    public void xha(int i) {
        this.f4640nr = i;
    }
}
