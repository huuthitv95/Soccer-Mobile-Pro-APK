package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2986co {

    /* JADX INFO: renamed from: di */
    private boolean f9115di;

    /* JADX INFO: renamed from: fi */
    private boolean f9116fi;

    /* JADX INFO: renamed from: ik */
    private long f9117ik;

    /* JADX INFO: renamed from: ka */
    private long f9118ka;

    /* JADX INFO: renamed from: lr */
    private long f9119lr;

    /* JADX INFO: renamed from: ri */
    private final ri f9120ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.co$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo10696ri(int i);
    }

    public C2986co(ri riVar) {
        this.f9116fi = true;
        this.f9120ri = riVar;
        int iM16703ri = C3606fi.m16703ri("reward_callback_fallback", 0);
        if (iM16703ri != 0) {
            this.f9116fi = false;
            if (iM16703ri == 2) {
                this.f9115di = true;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m11648ri(wjv wjvVar, boolean z, final int i) {
        C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, C3571ig.m16476ri(wjvVar), z ? "reward_callback" : "reward_fail_callback", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.co.1
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public void m11649ik() {
        this.f9116fi = true;
    }

    /* JADX INFO: renamed from: ka */
    public void m11650ka() {
        if (this.f9120ri != null) {
            long jElapsedRealtime = (this.f9118ka + (this.f9117ik > 0 ? SystemClock.elapsedRealtime() - this.f9117ik : 0L)) / 1000;
            if (this.f9116fi) {
                return;
            }
            if (this.f9115di) {
                this.f9120ri.mo10696ri(jElapsedRealtime < this.f9119lr ? 4 : 1);
            } else if (jElapsedRealtime >= this.f9119lr) {
                this.f9120ri.mo10696ri(1);
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11651lr() {
        if (this.f9116fi) {
            return;
        }
        this.f9117ik = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: ri */
    public void m11652ri() {
        if (!this.f9116fi && this.f9117ik > 0) {
            this.f9118ka += SystemClock.elapsedRealtime() - this.f9117ik;
            this.f9117ik = 0L;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11653ri(long j) {
        if (j <= this.f9119lr) {
            return;
        }
        this.f9119lr = j;
    }
}
