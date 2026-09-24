package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka.C1976lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2008ka;
import com.bytedance.sdk.component.utils.C2707ac;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3408mj extends AbstractC3405ik {

    /* JADX INFO: renamed from: ik */
    private long f12158ik;

    /* JADX INFO: renamed from: ka */
    private int f12159ka;

    /* JADX INFO: renamed from: lr */
    private long f12160lr;

    /* JADX INFO: renamed from: ri */
    private final C1996ik f12161ri;

    public C3408mj(C1996ik c1996ik) {
        this.f12161ri = c1996ik;
    }

    /* JADX INFO: renamed from: lr */
    public void m15431lr(long j) {
        this.f12158ik = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15432ri(int i) {
        this.f12159ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15433ri(long j) {
        this.f12160lr = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15420ri(C3410ri c3410ri) throws Throwable {
        if (this.f12161ri.m6332su()) {
            String strM6307fi = this.f12161ri.m6307fi();
            String strM6302bu = this.f12161ri.m6302bu();
            File fileM6204lr = C1976lr.m6204lr(strM6307fi, strM6302bu);
            File fileM6203ik = C1976lr.m6203ik(strM6307fi, strM6302bu);
            if (fileM6203ik.exists()) {
                fileM6204lr = fileM6203ik;
            }
            try {
                c3410ri.m15443ka().put("moov_box_pos", C2008ka.m6441ri(fileM6204lr));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15410ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.f12160lr);
            jSONObject.put("video_cache_size", this.f12158ik);
            jSONObject.put("is_auto_play", this.f12159ka);
        } catch (Throwable th) {
            C2707ac.m10196ik("FeedPlayModel", th.getMessage());
        }
    }
}
