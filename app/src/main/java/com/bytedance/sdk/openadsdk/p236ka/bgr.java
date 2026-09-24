package com.bytedance.sdk.openadsdk.p236ka;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.slm;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class bgr {

    /* JADX INFO: renamed from: ri */
    private static volatile bgr f12112ri;

    /* JADX INFO: renamed from: ka */
    private Map<String, Object> f12114ka;

    /* JADX INFO: renamed from: ik */
    private C3395lr f12113ik = C3395lr.m15400ri();

    /* JADX INFO: renamed from: lr */
    private final Handler f12115lr = new Handler(C3332vr.m14978lr().getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.ka.bgr.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 100) {
                return true;
            }
            RunnableC3396ri runnableC3396ri = (message.obj == null || !(message.obj instanceof RunnableC3396ri)) ? null : (RunnableC3396ri) message.obj;
            if (runnableC3396ri == null) {
                return true;
            }
            bgr.this.m15394lr(runnableC3396ri);
            return true;
        }
    });

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.bgr$lr */
    private static class C3395lr {

        /* JADX INFO: renamed from: ri */
        public int f12118ri = 300;

        /* JADX INFO: renamed from: lr */
        public int f12117lr = 6000;

        private C3395lr() {
        }

        /* JADX INFO: renamed from: ri */
        public static C3395lr m15400ri() {
            return new C3395lr();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.bgr$ri */
    private static class RunnableC3396ri implements Serializable, Runnable {

        /* JADX INFO: renamed from: fi */
        public Map<String, Object> f12120fi;

        /* JADX INFO: renamed from: ik */
        public wjv f12121ik;

        /* JADX INFO: renamed from: ka */
        public String f12122ka;

        /* JADX INFO: renamed from: ri */
        public final AtomicInteger f12124ri = new AtomicInteger(0);

        /* JADX INFO: renamed from: lr */
        public final AtomicBoolean f12123lr = new AtomicBoolean(false);

        /* JADX INFO: renamed from: di */
        private final long f12119di = SystemClock.elapsedRealtime();

        public RunnableC3396ri(wjv wjvVar, String str, Map<String, Object> map) {
            this.f12121ik = wjvVar;
            this.f12122ka = str;
            this.f12120fi = map;
        }

        /* JADX INFO: renamed from: ri */
        public static RunnableC3396ri m15401ri(wjv wjvVar, String str, Map<String, Object> map) {
            return new RunnableC3396ri(wjvVar, str, map);
        }

        /* JADX INFO: renamed from: lr */
        public void m15402lr() {
            this.f12124ri.incrementAndGet();
        }

        /* JADX INFO: renamed from: ri */
        public int m15403ri() {
            return this.f12124ri.get();
        }

        /* JADX INFO: renamed from: ri */
        public RunnableC3396ri m15404ri(boolean z) {
            this.f12123lr.set(z);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12121ik == null || TextUtils.isEmpty(this.f12122ka)) {
                return;
            }
            String str = this.f12123lr.get() ? "dpl_success" : "dpl_failed";
            if (this.f12120fi == null) {
                this.f12120fi = new HashMap();
            }
            wjv wjvVar = this.f12121ik;
            if (wjvVar != null && wjvVar.m14565yv() == 0) {
                Map<String, Object> map = this.f12120fi;
                wjv wjvVar2 = this.f12121ik;
                map.put("auto_click", Boolean.valueOf((wjvVar2 == null || wjvVar2.tan()) ? false : true));
            }
            this.f12120fi.put("lifeCycleInit", Boolean.valueOf(slm.m14959ri().m14961ik()));
            this.f12120fi.put("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.f12119di));
            C3414ik.m15553ri(this.f12121ik, this.f12122ka, str, this.f12120fi);
        }
    }

    private bgr() {
    }

    /* JADX INFO: renamed from: ik */
    private void m15393ik(RunnableC3396ri runnableC3396ri) {
        if (runnableC3396ri == null) {
            return;
        }
        this.f12115lr.post(runnableC3396ri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m15394lr(RunnableC3396ri runnableC3396ri) {
        if (runnableC3396ri == null) {
            return;
        }
        boolean zM14962ka = slm.m14959ri().m14962ka();
        boolean zM14964ri = slm.m14959ri().m14964ri(true);
        if (!zM14962ka && zM14964ri) {
            m15396ri(runnableC3396ri);
            return;
        }
        if (runnableC3396ri.f12120fi == null) {
            runnableC3396ri.f12120fi = new HashMap();
        }
        runnableC3396ri.f12120fi.put("is_background", Boolean.valueOf(zM14962ka));
        runnableC3396ri.f12120fi.put("has_focus", Boolean.valueOf(zM14964ri));
        m15393ik(runnableC3396ri.m15404ri(true));
    }

    /* JADX INFO: renamed from: ri */
    public static bgr m15395ri() {
        if (f12112ri == null) {
            synchronized (bgr.class) {
                if (f12112ri == null) {
                    f12112ri = new bgr();
                }
            }
        }
        return f12112ri;
    }

    /* JADX INFO: renamed from: ri */
    private void m15396ri(RunnableC3396ri runnableC3396ri) {
        if (runnableC3396ri == null) {
            return;
        }
        runnableC3396ri.m15402lr();
        if (runnableC3396ri.m15403ri() * this.f12113ik.f12118ri > this.f12113ik.f12117lr) {
            m15393ik(runnableC3396ri.m15404ri(false));
            return;
        }
        Message messageObtainMessage = this.f12115lr.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = runnableC3396ri;
        this.f12115lr.sendMessageDelayed(messageObtainMessage, this.f12113ik.f12118ri);
    }

    /* JADX INFO: renamed from: ri */
    public bgr m15398ri(Map<String, Object> map) {
        this.f12114ka = map;
        return m15395ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m15399ri(wjv wjvVar, String str) {
        Message messageObtainMessage = this.f12115lr.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = RunnableC3396ri.m15401ri(wjvVar, str, this.f12114ka);
        messageObtainMessage.sendToTarget();
    }
}
