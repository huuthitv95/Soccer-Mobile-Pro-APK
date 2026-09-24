package com.bytedance.sdk.component.p168ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2697ik<P, R> extends AbstractC2699lr<P, R> {

    /* JADX INFO: renamed from: ik */
    private C2696fi f7718ik;

    /* JADX INFO: renamed from: lr */
    private ri f7719lr;

    /* JADX INFO: renamed from: ri */
    private boolean f7720ri = true;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ri.ik$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        AbstractC2697ik mo10158ri();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ri.ik$ri */
    interface ri {
        /* JADX INFO: renamed from: ri */
        void mo10147ri(Object obj);

        /* JADX INFO: renamed from: ri */
        void mo10148ri(Throwable th);
    }

    /* JADX INFO: renamed from: di */
    private boolean m10149di() {
        if (this.f7720ri) {
            return true;
        }
        C2700mj.m10169ri(new IllegalStateException("Jsb async call already finished: " + mo10153ri() + ", hashcode: " + hashCode()));
        return false;
    }

    /* JADX INFO: renamed from: fi */
    void m10150fi() {
        m10152ka();
    }

    /* JADX INFO: renamed from: ik */
    protected final void m10151ik() {
        m10157ri((Throwable) null);
    }

    /* JADX INFO: renamed from: ka */
    protected void m10152ka() {
        this.f7720ri = false;
        this.f7718ik = null;
    }

    @Override // com.bytedance.sdk.component.p168ri.AbstractC2699lr
    /* JADX INFO: renamed from: ri */
    public /* bridge */ /* synthetic */ String mo10153ri() {
        return super.mo10153ri();
    }

    /* JADX INFO: renamed from: ri */
    protected final void m10154ri(R r) {
        if (m10149di()) {
            this.f7719lr.mo10147ri(r);
            m10152ka();
        }
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo10155ri(P p, C2696fi c2696fi) throws Exception;

    /* JADX INFO: renamed from: ri */
    void m10156ri(P p, C2696fi c2696fi, ri riVar) throws Exception {
        this.f7718ik = c2696fi;
        this.f7719lr = riVar;
        mo10155ri(p, c2696fi);
    }

    /* JADX INFO: renamed from: ri */
    protected final void m10157ri(Throwable th) {
        if (m10149di()) {
            this.f7719lr.mo10148ri(th);
            m10152ka();
        }
    }
}
