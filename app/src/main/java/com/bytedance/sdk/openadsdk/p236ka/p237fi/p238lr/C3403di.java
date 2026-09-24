package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import android.os.SystemClock;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2008ka;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3403di extends AbstractC3405ik {

    /* JADX INFO: renamed from: ik */
    private long f12142ik;

    /* JADX INFO: renamed from: ka */
    private int f12143ka = 0;

    /* JADX INFO: renamed from: lr */
    private long f12144lr;

    /* JADX INFO: renamed from: ri */
    private final C1996ik f12145ri;

    public C3403di(C1996ik c1996ik) {
        this.f12145ri = c1996ik;
    }

    /* JADX INFO: renamed from: lr */
    public void m15417lr(long j) {
        this.f12142ik = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m15418ri(int i) {
        this.f12143ka = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m15419ri(long j) {
        this.f12144lr = j;
    }

    @Override // com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.AbstractC3405ik
    /* JADX INFO: renamed from: ri */
    public void mo15420ri(C3410ri c3410ri) {
        super.mo15420ri(c3410ri);
        JSONObject jSONObjectM15443ka = c3410ri.m15443ka();
        if (C3606fi.m16703ri("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.f12145ri.m6307fi(), this.f12145ri.m6302bu());
        if (file.exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                jSONObjectM15443ka.put("level", C2008ka.m6442ri(file.getAbsolutePath()));
                jSONObjectM15443ka.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
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
            jSONObject.put("total_duration", this.f12144lr);
            jSONObject.put("buffers_time", this.f12142ik);
            jSONObject.put("video_backup", this.f12143ka);
        } catch (Throwable th) {
            C2707ac.m10196ik("FeedOverModel", th.getMessage());
        }
    }
}
