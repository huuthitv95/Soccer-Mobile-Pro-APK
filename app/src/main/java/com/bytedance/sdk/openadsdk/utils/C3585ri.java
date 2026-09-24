package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.adexpress.InterfaceC2514ri;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3435lr;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3437qt;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3585ri implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ik */
    public static long f13229ik;

    /* JADX INFO: renamed from: lr */
    public static long f13230lr;

    /* JADX INFO: renamed from: ri */
    public static boolean f13231ri;
    private volatile WeakReference<Activity> bgr;
    private final ka jbs;

    /* JADX INFO: renamed from: mj */
    private final ka f13237mj;

    /* JADX INFO: renamed from: ka */
    private final AtomicBoolean f13236ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fi */
    private final ri f13235fi = new ri();

    /* JADX INFO: renamed from: di */
    private final di f13234di = new di();
    private final fi xha = new fi();

    /* JADX INFO: renamed from: qt */
    private int f13238qt = 0;

    /* JADX INFO: renamed from: sf */
    private volatile CopyOnWriteArrayList<WeakReference<InterfaceC2514ri>> f13239sf = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: co */
    private HandlerThread f13233co = null;

    /* JADX INFO: renamed from: aw */
    private Handler f13232aw = null;

    /* JADX INFO: renamed from: vr */
    private final LinkedList<Activity> f13240vr = new LinkedList<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri$di */
    class di implements Runnable {
        di() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3332vr.m14978lr().removeMessages(1001);
            C3299nr.m14642ri();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri$fi */
    class fi implements Runnable {
        fi() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerM14978lr = C3332vr.m14978lr();
                Message messageObtain = Message.obtain(handlerM14978lr, C3585ri.this.f13235fi);
                messageObtain.what = 1001;
                handlerM14978lr.sendMessageDelayed(messageObtain, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri$ik */
    private static class ik extends ka {
        private ik() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.C3585ri.ka, java.lang.Runnable
        public void run() {
            super.run();
            C3569fi.m16418ri();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri$ka */
    private static class ka implements Runnable {
        private ka() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3437qt c3437qtM14868pu = C3322sf.m14819lr().m14868pu();
            if (c3437qtM14868pu == null || c3437qtM14868pu.m15682ri() || !C2724nr.m10258mj(C3299nr.m14642ri())) {
                return;
            }
            C3435lr.m15669ri(C3089aw.m12377ri(C3299nr.m14642ri()));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri$lr */
    private static class lr extends ka {
        private lr() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.C3585ri.ka, java.lang.Runnable
        public void run() {
            super.run();
            C3366lr.m15165ri().m15172lr();
            C3569fi.m16416lr();
            C3087ri.m12360ri(3);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri$ri */
    static class ri implements Runnable {
        ri() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dzy.m16401lr(new AbstractRunnableC2676ik("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ri$xha */
    public class xha implements Runnable {

        /* JADX INFO: renamed from: ik */
        private long f13247ik;

        /* JADX INFO: renamed from: ka */
        private boolean f13248ka;

        /* JADX INFO: renamed from: lr */
        private long f13249lr;

        public xha(long j, long j2, boolean z) {
            this.f13249lr = j;
            this.f13247ik = j2;
            this.f13248ka = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f13248ka) {
                C3521ka.m15942ri().m15956ri(this.f13249lr / 1000, this.f13247ik / 1000);
            }
        }
    }

    public C3585ri() {
        this.f13237mj = new lr();
        this.jbs = new ik();
        m16635ik();
    }

    /* JADX INFO: renamed from: ik */
    private void m16635ik() {
        this.f13233co = C2723mj.m10251ri("lifecycle", 10);
        this.f13232aw = new Handler(this.f13233co.getLooper());
    }

    /* JADX INFO: renamed from: ri */
    private void m16637ri(Runnable runnable) {
        if (!this.f13233co.isAlive()) {
            m16635ik();
        }
        this.f13232aw.postDelayed(runnable, 1000L);
    }

    /* JADX INFO: renamed from: lr */
    public Activity m16638lr() {
        if (this.f13240vr.isEmpty()) {
            return null;
        }
        return this.f13240vr.getFirst();
    }

    /* JADX INFO: renamed from: lr */
    public boolean m16639lr(InterfaceC2514ri interfaceC2514ri) {
        return this.f13239sf.remove(new WeakReference(interfaceC2514ri));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f13240vr.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f13239sf != null && this.f13239sf.size() > 0) {
            for (WeakReference<InterfaceC2514ri> weakReference : this.f13239sf) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().mo8795ri(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.bgr != null && this.bgr.get() == activity) {
            this.bgr = null;
        }
        this.f13240vr.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.f13238qt - 1;
        this.f13238qt = i;
        if (i < 0) {
            this.f13238qt = 0;
        }
        if (ApmHelper.isIsInit()) {
            m16637ri(this.xha);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m16637ri(this.f13234di);
        if (!f13231ri) {
            f13230lr = System.currentTimeMillis();
            f13231ri = true;
        }
        this.bgr = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (C3583qd.m16595lr() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (!decorView.isAttachedToWindow()) {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ri.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (C3583qd.m16587ka(activity)) {
                                C3583qd.m16623ri(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                } else if (C3583qd.m16587ka(activity)) {
                    C3583qd.m16623ri(true);
                }
            }
        } catch (Throwable th) {
            C2707ac.m10207ri("TTAD.ActivityLifecycle", th);
        }
        this.f13238qt++;
        if (this.f13236ka.get()) {
            this.f13232aw.removeCallbacks(this.jbs);
            this.f13232aw.removeCallbacks(this.f13237mj);
            m16637ri(this.jbs);
        }
        this.f13236ka.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.f13238qt <= 0) {
            this.f13236ka.set(true);
        }
        if (m16641ri()) {
            f13231ri = false;
            C3332vr.f11697lr.set(false);
            f13229ik = System.currentTimeMillis();
            this.f13232aw.removeCallbacks(this.jbs);
            this.f13232aw.removeCallbacks(this.f13237mj);
            m16637ri(this.f13237mj);
        }
        m16637ri(new xha(f13230lr, f13229ik, m16641ri()));
    }

    /* JADX INFO: renamed from: ri */
    public void m16640ri(InterfaceC2514ri interfaceC2514ri) {
        this.f13239sf.add(new WeakReference<>(interfaceC2514ri));
    }

    /* JADX INFO: renamed from: ri */
    public boolean m16641ri() {
        return this.f13236ka.get();
    }

    /* JADX INFO: renamed from: ri */
    public boolean m16642ri(boolean z) {
        Window window;
        if (this.bgr == null) {
            return z;
        }
        try {
            Activity activity = this.bgr.get();
            if (activity != null && (window = activity.getWindow()) != null) {
                return window.getDecorView().hasWindowFocus();
            }
            return z;
        } catch (Throwable unused) {
            return z;
        }
    }
}
