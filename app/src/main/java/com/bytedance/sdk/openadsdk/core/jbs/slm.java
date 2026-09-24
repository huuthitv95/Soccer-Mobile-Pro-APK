package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class slm extends C3120di implements View.OnClickListener {

    /* JADX INFO: renamed from: bu */
    private boolean f10886bu;

    public slm(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, com.bytedance.sdk.openadsdk.p236ka.xha xhaVar, boolean z) {
        super(context, wjvVar, false, str, false, false, xhaVar);
        this.f10886bu = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z);
    }

    /* JADX INFO: renamed from: nr */
    private void m13725nr() {
        C3583qd.m16612ri((View) this.xha, 0);
        C3583qd.m16612ri((View) this.f10027mj, 0);
        C3583qd.m16612ri((View) this.f10032qt, 8);
    }

    private void tan() {
        xha();
        if (this.xha != null) {
            if (this.xha.getVisibility() == 0) {
                return;
            } else {
                C2751lr.m10463lr().m10472ri(this.f10033ri.m14389eu().m6357qt(), this.f10033ri.m14389eu().m6345ik(), this.f10033ri.m14389eu().m6351lr(), this.f10027mj, this.f10033ri);
            }
        }
        m13725nr();
    }

    /* JADX INFO: renamed from: fi */
    protected void m13726fi() {
        xha();
        C3583qd.m16612ri((View) this.xha, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di
    /* JADX INFO: renamed from: ik */
    protected void mo12807ik() {
        if (this.f10886bu) {
            super.mo12807ik();
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m13727ka() {
        if (this.f10032qt != null) {
            C3583qd.m16612ri((View) this.f10032qt, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di
    /* JADX INFO: renamed from: lr */
    protected void mo12808lr() {
        if (!this.f10019fi || !C3224ay.m13589lr(this.f10016co)) {
            this.f10024ka = false;
        }
        super.mo12808lr();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.jbs != null && this.jbs.getVisibility() == 0) {
            C3583qd.m16579fi(this.xha);
        }
        mo12807ik();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (this.jbs == null || this.jbs.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            tan();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        if (this.jbs == null || this.jbs.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            tan();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13728ri(int i, int i2) {
        if (this.f10026lr != null) {
            this.f10026lr.m12942lr(i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di
    /* JADX INFO: renamed from: ri */
    protected void mo12814ri(boolean z) {
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.f10886bu = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        if (this.f10026lr != null) {
            this.f10026lr.m12967fi(z);
        }
    }

    public void setShowAdInteractionView(boolean z) {
        C3121fi c3121fiIhz;
        if (this.f10026lr == null || (c3121fiIhz = this.f10026lr.mo6372co()) == null) {
            return;
        }
        c3121fiIhz.mo6406ri(z);
    }
}
