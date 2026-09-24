package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class jbs implements bgr, Runnable {

    /* JADX INFO: renamed from: di */
    private boolean f13185di;

    /* JADX INFO: renamed from: fi */
    private long f13186fi;

    /* JADX INFO: renamed from: ka */
    private long f13188ka;

    /* JADX INFO: renamed from: lr */
    private final Activity f13189lr;

    /* JADX INFO: renamed from: mj */
    private boolean f13190mj;
    private final InterfaceC3576ri xha;
    private final AtomicBoolean jbs = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ik */
    private final Handler f13187ik = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ri */
    private View f13191ri = m16527ka();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.jbs$ri */
    public interface InterfaceC3576ri {
        /* JADX INFO: renamed from: lr */
        void mo10648lr();

        /* JADX INFO: renamed from: ri */
        View mo10649ri();
    }

    private jbs(Activity activity, int i, InterfaceC3576ri interfaceC3576ri) {
        this.xha = interfaceC3576ri;
        this.f13189lr = activity;
        this.f13188ka = i;
    }

    /* JADX INFO: renamed from: di */
    private void m16525di() {
        Activity activity;
        View childAt;
        if (this.f13185di || (activity = this.f13189lr) == null || activity.isFinishing() || this.f13189lr.isDestroyed()) {
            return;
        }
        if (this.f13191ri == null) {
            this.f13191ri = m16527ka();
        }
        View view = this.f13191ri;
        if (view != null) {
            if (m16528lr(view)) {
                m16530ri(this.f13191ri);
                View view2 = this.f13191ri;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.f13191ri).getChildAt(0)) != null && m16528lr(childAt)) {
                    m16530ri(childAt);
                }
                InterfaceC3576ri interfaceC3576ri = this.xha;
                if (interfaceC3576ri != null) {
                    interfaceC3576ri.mo10648lr();
                }
            }
            xha();
        }
        this.f13185di = true;
    }

    /* JADX INFO: renamed from: fi */
    private void m16526fi() {
        this.f13190mj = false;
        this.f13186fi = SystemClock.elapsedRealtime();
        Handler handler = this.f13187ik;
        if (handler != null) {
            handler.postDelayed(this, this.f13188ka);
        }
    }

    /* JADX INFO: renamed from: ka */
    private View m16527ka() {
        InterfaceC3576ri interfaceC3576ri = this.xha;
        if (interfaceC3576ri != null) {
            return interfaceC3576ri.mo10649ri();
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    private boolean m16528lr(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }

    /* JADX INFO: renamed from: ri */
    public static bgr m16529ri(Activity activity, InterfaceC3576ri interfaceC3576ri) {
        int iChe = C3322sf.m14819lr().che();
        return iChe < 0 ? new bgr() { // from class: com.bytedance.sdk.openadsdk.utils.jbs.1
            @Override // com.bytedance.sdk.openadsdk.utils.bgr
            /* JADX INFO: renamed from: ik */
            public void mo16370ik() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bgr
            /* JADX INFO: renamed from: lr */
            public void mo16371lr() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bgr
            /* JADX INFO: renamed from: ri */
            public void mo16372ri() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bgr
            /* JADX INFO: renamed from: ri */
            public void mo16373ri(long j) {
            }
        } : new jbs(activity, Math.min(iChe, 50) * 1000, interfaceC3576ri);
    }

    /* JADX INFO: renamed from: ri */
    private void m16530ri(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private void xha() {
        ViewParent parent = this.f13191ri.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(this.f13191ri) != viewGroup.getChildCount() - 1) {
                this.f13191ri.bringToFront();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.bgr
    /* JADX INFO: renamed from: ik */
    public void mo16370ik() {
        if (this.f13185di) {
            return;
        }
        this.f13185di = true;
        Handler handler = this.f13187ik;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                C2707ac.m10197ik(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.bgr
    /* JADX INFO: renamed from: lr */
    public void mo16371lr() {
        if (this.f13186fi <= 0 || this.f13185di) {
            return;
        }
        if (!this.f13190mj) {
            this.f13188ka -= SystemClock.elapsedRealtime() - this.f13186fi;
        }
        this.f13190mj = true;
        if (this.f13188ka <= 0) {
            m16525di();
            return;
        }
        Handler handler = this.f13187ik;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                C2707ac.m10197ik(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.bgr
    /* JADX INFO: renamed from: ri */
    public void mo16372ri() {
        if (this.f13186fi == 0 || !this.f13190mj) {
            return;
        }
        m16526fi();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.bgr
    /* JADX INFO: renamed from: ri */
    public void mo16373ri(long j) {
        if (this.jbs.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.f13188ka += j;
            m16526fi();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        m16525di();
    }
}
