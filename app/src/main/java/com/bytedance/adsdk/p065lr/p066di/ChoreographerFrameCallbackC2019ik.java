package com.bytedance.adsdk.p065lr.p066di;

import android.view.Choreographer;
import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.di.ik */
/* JADX INFO: loaded from: classes3.dex */
public class ChoreographerFrameCallbackC2019ik extends AbstractC2022ri implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: qt */
    private xha f4751qt;

    /* JADX INFO: renamed from: lr */
    private float f4749lr = 1.0f;

    /* JADX INFO: renamed from: ik */
    private boolean f4747ik = false;

    /* JADX INFO: renamed from: ka */
    private long f4748ka = 0;

    /* JADX INFO: renamed from: fi */
    private float f4746fi = 0.0f;

    /* JADX INFO: renamed from: di */
    private float f4745di = 0.0f;
    private int xha = 0;

    /* JADX INFO: renamed from: mj */
    private float f4750mj = -2.1474836E9f;
    private float jbs = 2.1474836E9f;

    /* JADX INFO: renamed from: ri */
    protected boolean f4752ri = false;

    /* JADX INFO: renamed from: sf */
    private boolean f4753sf = false;

    /* JADX INFO: renamed from: ac */
    private boolean m6567ac() {
        return m6579qt() < 0.0f;
    }

    private void ihz() {
        if (this.f4751qt == null) {
            return;
        }
        float f = this.f4745di;
        if (f < this.f4750mj || f > this.jbs) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f4750mj), Float.valueOf(this.jbs), Float.valueOf(this.f4745di)));
        }
    }

    private float tan() {
        xha xhaVar = this.f4751qt;
        if (xhaVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / xhaVar.m7182co()) / Math.abs(this.f4749lr);
    }

    /* JADX INFO: renamed from: aw */
    public void m6568aw() {
        m6578nr();
        m6592ka();
    }

    public void bgr() {
        this.f4752ri = true;
        m6569bu();
        this.f4748ka = 0L;
        if (m6567ac() && xha() == m6585vr()) {
            m6580ri(slm());
        } else if (!m6567ac() && xha() == slm()) {
            m6580ri(m6585vr());
        }
        m6590fi();
    }

    /* JADX INFO: renamed from: bu */
    protected void m6569bu() {
        if (isRunning()) {
            m6574ka(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        mo6575lr();
        m6578nr();
    }

    /* JADX INFO: renamed from: co */
    public void m6570co() {
        m6578nr();
        m6593lr(m6567ac());
    }

    /* JADX INFO: renamed from: di */
    public float m6571di() {
        xha xhaVar = this.f4751qt;
        if (xhaVar == null) {
            return 0.0f;
        }
        return (this.f4745di - xhaVar.m7183di()) / (this.f4751qt.xha() - this.f4751qt.m7183di());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        m6569bu();
        if (this.f4751qt == null || !isRunning()) {
            return;
        }
        C2023fi.m6599ri("LottieValueAnimator#doFrame");
        long j2 = this.f4748ka;
        float fTan = (j2 != 0 ? j - j2 : 0L) / tan();
        float f = this.f4746fi;
        if (m6567ac()) {
            fTan = -fTan;
        }
        float f2 = f + fTan;
        boolean zM6557ik = C2018fi.m6557ik(f2, m6585vr(), slm());
        float f3 = this.f4746fi;
        float fM6558lr = C2018fi.m6558lr(f2, m6585vr(), slm());
        this.f4746fi = fM6558lr;
        if (this.f4753sf) {
            fM6558lr = (float) Math.floor(fM6558lr);
        }
        this.f4745di = fM6558lr;
        this.f4748ka = j;
        if (!this.f4753sf || this.f4746fi != f3) {
            m6591ik();
        }
        if (!zM6557ik) {
            if (getRepeatCount() == -1 || this.xha < getRepeatCount()) {
                m6594ri();
                this.xha++;
                if (getRepeatMode() == 2) {
                    this.f4747ik = !this.f4747ik;
                    jbs();
                } else {
                    float fSlm = m6567ac() ? slm() : m6585vr();
                    this.f4746fi = fSlm;
                    this.f4745di = fSlm;
                }
                this.f4748ka = j;
            } else {
                float fM6585vr = this.f4749lr < 0.0f ? m6585vr() : slm();
                this.f4746fi = fM6585vr;
                this.f4745di = fM6585vr;
                m6578nr();
                m6593lr(m6567ac());
            }
        }
        ihz();
        C2023fi.m6596lr("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fM6585vr;
        float fSlm;
        float fM6585vr2;
        if (this.f4751qt == null) {
            return 0.0f;
        }
        if (m6567ac()) {
            fM6585vr = slm() - this.f4745di;
            fSlm = slm();
            fM6585vr2 = m6585vr();
        } else {
            fM6585vr = this.f4745di - m6585vr();
            fSlm = slm();
            fM6585vr2 = m6585vr();
        }
        return fM6585vr / (fSlm - fM6585vr2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m6571di());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        xha xhaVar = this.f4751qt;
        if (xhaVar == null) {
            return 0L;
        }
        return (long) xhaVar.m7184fi();
    }

    /* JADX INFO: renamed from: ik */
    public void m6572ik(float f) {
        this.f4749lr = f;
    }

    /* JADX INFO: renamed from: ik */
    public void m6573ik(boolean z) {
        this.f4753sf = z;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f4752ri;
    }

    public void jbs() {
        m6572ik(-m6579qt());
    }

    /* JADX INFO: renamed from: ka */
    protected void m6574ka(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f4752ri = false;
        }
    }

    @Override // com.bytedance.adsdk.p065lr.p066di.AbstractC2022ri
    /* JADX INFO: renamed from: lr */
    void mo6575lr() {
        super.mo6575lr();
        m6593lr(m6567ac());
    }

    /* JADX INFO: renamed from: lr */
    public void m6576lr(float f) {
        m6581ri(this.f4750mj, f);
    }

    /* JADX INFO: renamed from: mj */
    public void m6577mj() {
        this.f4751qt = null;
        this.f4750mj = -2.1474836E9f;
        this.jbs = 2.1474836E9f;
    }

    /* JADX INFO: renamed from: nr */
    protected void m6578nr() {
        m6574ka(true);
    }

    /* JADX INFO: renamed from: qt */
    public float m6579qt() {
        return this.f4749lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m6580ri(float f) {
        if (this.f4746fi == f) {
            return;
        }
        float fM6558lr = C2018fi.m6558lr(f, m6585vr(), slm());
        this.f4746fi = fM6558lr;
        if (this.f4753sf) {
            fM6558lr = (float) Math.floor(fM6558lr);
        }
        this.f4745di = fM6558lr;
        this.f4748ka = 0L;
        m6591ik();
    }

    /* JADX INFO: renamed from: ri */
    public void m6581ri(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        xha xhaVar = this.f4751qt;
        float fM7183di = xhaVar == null ? -3.4028235E38f : xhaVar.m7183di();
        xha xhaVar2 = this.f4751qt;
        float fXha = xhaVar2 == null ? Float.MAX_VALUE : xhaVar2.xha();
        float fM6558lr = C2018fi.m6558lr(f, fM7183di, fXha);
        float fM6558lr2 = C2018fi.m6558lr(f2, fM7183di, fXha);
        if (fM6558lr == this.f4750mj && fM6558lr2 == this.jbs) {
            return;
        }
        this.f4750mj = fM6558lr;
        this.jbs = fM6558lr2;
        m6580ri((int) C2018fi.m6558lr(this.f4745di, fM6558lr, fM6558lr2));
    }

    /* JADX INFO: renamed from: ri */
    public void m6582ri(int i) {
        m6581ri(i, (int) this.jbs);
    }

    /* JADX INFO: renamed from: ri */
    public void m6583ri(xha xhaVar) {
        boolean z = this.f4751qt == null;
        this.f4751qt = xhaVar;
        if (z) {
            m6581ri(Math.max(this.f4750mj, xhaVar.m7183di()), Math.min(this.jbs, xhaVar.xha()));
        } else {
            m6581ri((int) xhaVar.m7183di(), (int) xhaVar.xha());
        }
        float f = this.f4745di;
        this.f4745di = 0.0f;
        this.f4746fi = 0.0f;
        m6580ri((int) f);
        m6591ik();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f4747ik) {
            return;
        }
        this.f4747ik = false;
        jbs();
    }

    /* JADX INFO: renamed from: sf */
    public void m6584sf() {
        this.f4752ri = true;
        m6595ri(m6567ac());
        m6580ri((int) (m6567ac() ? slm() : m6585vr()));
        this.f4748ka = 0L;
        this.xha = 0;
        m6569bu();
    }

    public float slm() {
        xha xhaVar = this.f4751qt;
        if (xhaVar == null) {
            return 0.0f;
        }
        float f = this.jbs;
        return f == 2.1474836E9f ? xhaVar.xha() : f;
    }

    /* JADX INFO: renamed from: vr */
    public float m6585vr() {
        xha xhaVar = this.f4751qt;
        if (xhaVar == null) {
            return 0.0f;
        }
        float f = this.f4750mj;
        return f == -2.1474836E9f ? xhaVar.m7183di() : f;
    }

    public float xha() {
        return this.f4745di;
    }
}
