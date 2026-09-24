package com.bytedance.sdk.openadsdk.p175ay.p176lr;

import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2892lr {

    /* JADX INFO: renamed from: di */
    private final C2889fi.ri f8622di;

    /* JADX INFO: renamed from: fi */
    private final AtomicBoolean f8623fi;

    /* JADX INFO: renamed from: ik */
    protected final AtomicBoolean f8624ik;
    private volatile boolean jbs = false;

    /* JADX INFO: renamed from: ka */
    private final AtomicLong f8625ka;

    /* JADX INFO: renamed from: lr */
    protected wjv f8626lr;

    /* JADX INFO: renamed from: mj */
    private final Integer f8627mj;

    /* JADX INFO: renamed from: ri */
    protected WeakReference<View> f8628ri;
    private final int xha;

    public AbstractC2892lr(Integer num, View view, wjv wjvVar, int i, C2889fi.ri riVar) {
        this.f8627mj = num;
        this.xha = i;
        this.f8626lr = wjvVar;
        this.f8622di = riVar;
        m11131ri(view);
        this.f8624ik = new AtomicBoolean(false);
        this.f8625ka = new AtomicLong(-1L);
        this.f8623fi = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: ri */
    public static AbstractC2892lr m11122ri(boolean z, Integer num, View view, wjv wjvVar, C2889fi.ri riVar) {
        return z ? new C2893mj(num, view, wjvVar, riVar) : new C2890ik(num, view, wjvVar, riVar);
    }

    /* JADX INFO: renamed from: aw */
    public void m11123aw() {
        this.f8624ik.set(false);
        m11127mj();
    }

    /* JADX INFO: renamed from: co */
    public boolean mo11124co() {
        return this.f8624ik.get();
    }

    /* JADX INFO: renamed from: di */
    public abstract int mo11116di();

    /* JADX INFO: renamed from: fi */
    protected C2894ri m11125fi() {
        WeakReference<View> weakReference = this.f8628ri;
        if (weakReference == null) {
            return new C2894ri(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new C2894ri(0, 0, 0.0f) : new C2894ri(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    /* JADX INFO: renamed from: ik */
    protected abstract boolean mo11117ik();

    public boolean jbs() {
        return this.f8623fi.get();
    }

    /* JADX INFO: renamed from: ka */
    protected void mo11118ka() {
        if (this.f8623fi.compareAndSet(false, true)) {
            C2891ka.m11120ri(this.f8626lr, m11125fi(), this.f8622di);
        }
    }

    /* JADX INFO: renamed from: lr */
    public int m11126lr() {
        if (jbs()) {
            return 1;
        }
        WeakReference<View> weakReference = this.f8628ri;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.jbs) {
            return 3;
        }
        if (m11132sf().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI))) {
            return (m11132sf().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI)) && mo11117ik()) ? 1 : 2;
        }
        m11128qt();
        C2889fi.m11107lr(m11132sf());
        return 3;
    }

    /* JADX INFO: renamed from: lr */
    protected abstract void mo11119lr(int i);

    /* JADX INFO: renamed from: mj */
    public void m11127mj() {
        this.f8625ka.set(-1L);
    }

    /* JADX INFO: renamed from: qt */
    public void m11128qt() {
        this.jbs = true;
        xha.m11135lr(this);
    }

    /* JADX INFO: renamed from: ri */
    public void mo11129ri() {
        if (this.f8624ik.compareAndSet(false, true)) {
            xha.m11137ri(this);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11130ri(int i) {
        if (i == 4) {
            mo11129ri();
            return;
        }
        if (i == 8) {
            m11123aw();
        } else if (i == 9) {
            mo11118ka();
        } else {
            mo11119lr(i);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11131ri(View view) {
        if (view != null) {
            view.setTag(InputDeviceCompat.SOURCE_HDMI, m11132sf());
        }
        this.f8628ri = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: sf */
    public Integer m11132sf() {
        return this.f8627mj;
    }

    public void xha() {
        if (jbs()) {
            return;
        }
        if (!this.f8624ik.get()) {
            m11127mj();
        } else if (!this.f8625ka.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.f8625ka.get() >= this.xha) {
            mo11118ka();
        }
    }
}
