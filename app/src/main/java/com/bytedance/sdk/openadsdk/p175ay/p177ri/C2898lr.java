package com.bytedance.sdk.openadsdk.p175ay.p177ri;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2898lr {

    /* JADX INFO: renamed from: lr */
    private final wjv f8642lr;

    /* JADX INFO: renamed from: ri */
    private int f8644ri = C2897ik.f8636lr;

    /* JADX INFO: renamed from: ik */
    private final AtomicBoolean f8640ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ka */
    private final AtomicBoolean f8641ka = new AtomicBoolean(true);

    /* JADX INFO: renamed from: fi */
    private final AtomicInteger f8639fi = new AtomicInteger(0);

    /* JADX INFO: renamed from: di */
    private long f8638di = 0;
    private long xha = 0;

    /* JADX INFO: renamed from: mj */
    private final Runnable f8643mj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.ri.lr.3
        @Override // java.lang.Runnable
        public void run() {
            C2898lr.this.m11152ka();
        }
    };

    public C2898lr(wjv wjvVar) {
        this.f8642lr = wjvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public void m11148di() {
        if (this.f8639fi.get() != 1 || this.f8638di == 0) {
            return;
        }
        Handler handlerM11161ri = C2899ri.m11161ri();
        if (handlerM11161ri != null) {
            handlerM11161ri.removeCallbacks(this.f8643mj);
        }
        this.xha += SystemClock.elapsedRealtime() - this.f8638di;
        this.f8638di = 0L;
        this.f8639fi.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public void m11149fi() {
        if (this.f8639fi.get() == 2) {
            this.f8638di = SystemClock.elapsedRealtime();
            Handler handlerM11161ri = C2899ri.m11161ri();
            if (handlerM11161ri != null) {
                handlerM11161ri.postDelayed(this.f8643mj, ((long) this.f8644ri) - this.xha);
            }
            this.f8639fi.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m11152ka() {
        if (this.f8640ik.compareAndSet(false, true)) {
            m11157lr();
            final long jElapsedRealtime = this.xha + (SystemClock.elapsedRealtime() - this.f8638di);
            this.xha = jElapsedRealtime;
            dzy.m16401lr(new AbstractRunnableC2676ik("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.ay.ri.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    String strM16476ri = C3571ig.m16476ri(C2898lr.this.f8642lr);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", C2898lr.this.f8642lr.zyl() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e) {
                        C2707ac.m10196ik("EvTracker", e.getMessage());
                    }
                    C3414ik.m15522lr(C2898lr.this.f8642lr, strM16476ri, C2898lr.this.f8642lr.pwf(), jSONObject);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ik */
    public boolean m11156ik() {
        return this.f8639fi.get() == 3;
    }

    /* JADX INFO: renamed from: lr */
    public void m11157lr() {
        this.f8639fi.set(3);
        Handler handlerM11161ri = C2899ri.m11161ri();
        if (handlerM11161ri != null) {
            handlerM11161ri.removeCallbacks(this.f8643mj);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11158ri() {
        if (this.f8639fi.get() != 0) {
            return;
        }
        this.f8644ri = this.f8642lr.zyl() * 1000;
        this.f8639fi.set(1);
        this.f8638di = SystemClock.elapsedRealtime();
        Handler handlerM11161ri = C2899ri.m11161ri();
        if (handlerM11161ri != null) {
            handlerM11161ri.postDelayed(this.f8643mj, this.f8644ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11159ri(final int i) {
        Handler handlerM11161ri;
        if (this.f8639fi.get() == 3 || (handlerM11161ri = C2899ri.m11161ri()) == null) {
            return;
        }
        handlerM11161ri.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.ri.lr.2
            @Override // java.lang.Runnable
            public void run() {
                if (i == 4 && C2898lr.this.f8641ka.get()) {
                    C2898lr.this.m11149fi();
                    return;
                }
                int i2 = i;
                if (i2 == 8) {
                    C2898lr.this.m11148di();
                } else if (i2 == 5) {
                    C2898lr.this.m11152ka();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m11160ri(boolean z) {
        this.f8641ka.set(z);
    }
}
