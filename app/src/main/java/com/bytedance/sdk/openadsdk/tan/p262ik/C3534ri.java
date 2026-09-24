package com.bytedance.sdk.openadsdk.tan.p262ik;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tan.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3534ri {

    /* JADX INFO: renamed from: di */
    public long f12836di;

    /* JADX INFO: renamed from: fi */
    public long f12837fi;

    /* JADX INFO: renamed from: ik */
    public boolean f12838ik;

    /* JADX INFO: renamed from: ka */
    public boolean f12839ka;

    /* JADX INFO: renamed from: lr */
    public boolean f12840lr;

    /* JADX INFO: renamed from: ri */
    public boolean f12841ri;
    public long xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tan.ik.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: di */
        C3534ri mo15868di();
    }

    /* JADX INFO: renamed from: ri */
    public static C3534ri m16046ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3534ri c3534ri = new C3534ri();
        c3534ri.m16051lr(jSONObject.optBoolean("isCompleted"));
        c3534ri.m16048ik(jSONObject.optBoolean("isFromVideoDetailPage"));
        c3534ri.m16049ka(jSONObject.optBoolean("isFromDetailPage"));
        c3534ri.m16052ri(jSONObject.optLong("duration"));
        c3534ri.m16050lr(jSONObject.optLong("totalPlayDuration"));
        c3534ri.m16047ik(jSONObject.optLong("currentPlayPosition"));
        c3534ri.m16053ri(jSONObject.optBoolean("isAutoPlay"));
        return c3534ri;
    }

    /* JADX INFO: renamed from: ik */
    public C3534ri m16047ik(long j) {
        this.xha = j;
        return this;
    }

    /* JADX INFO: renamed from: ik */
    public C3534ri m16048ik(boolean z) {
        this.f12840lr = z;
        return this;
    }

    /* JADX INFO: renamed from: ka */
    public C3534ri m16049ka(boolean z) {
        this.f12838ik = z;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public C3534ri m16050lr(long j) {
        this.f12836di = j;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public C3534ri m16051lr(boolean z) {
        this.f12841ri = z;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3534ri m16052ri(long j) {
        this.f12837fi = j;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3534ri m16053ri(boolean z) {
        this.f12839ka = z;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m16054ri() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.f12841ri);
            jSONObject.put("isFromVideoDetailPage", this.f12840lr);
            jSONObject.put("isFromDetailPage", this.f12838ik);
            jSONObject.put("duration", this.f12837fi);
            jSONObject.put("totalPlayDuration", this.f12836di);
            jSONObject.put("currentPlayPosition", this.xha);
            jSONObject.put("isAutoPlay", this.f12839ka);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
