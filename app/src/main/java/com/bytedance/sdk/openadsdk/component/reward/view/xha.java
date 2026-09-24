package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3007bu;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3040vr;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: fi */
    private boolean f9663fi;

    /* JADX INFO: renamed from: ik */
    private boolean f9664ik;

    /* JADX INFO: renamed from: ka */
    private C3007bu f9665ka;

    /* JADX INFO: renamed from: lr */
    private RFEndCardBackUpLayout f9666lr;

    /* JADX INFO: renamed from: ri */
    private final C3022ri f9667ri;

    public xha(C3022ri c3022ri) {
        this.f9667ri = c3022ri;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m12307fi() {
        return this.f9663fi;
    }

    /* JADX INFO: renamed from: ik */
    public void m12308ik() {
        C3007bu c3007bu = this.f9665ka;
        if (c3007bu != null) {
            c3007bu.m11855ri();
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m12309ka() {
        C3007bu c3007bu = this.f9665ka;
        if (c3007bu != null) {
            c3007bu.m11854lr();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m12310lr() {
        this.f9663fi = true;
        C3583qd.m16612ri((View) this.f9666lr, 0);
    }

    /* JADX INFO: renamed from: ri */
    public void m12311ri() {
        if (this.f9664ik) {
            return;
        }
        this.f9664ik = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.f9667ri.f9396pv.findViewById(slm.f13264eb);
        this.f9666lr = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.f9667ri);
        }
        if (this.f9667ri.f9389lr.m14576zz()) {
            this.f9665ka = new C3007bu(this.f9667ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12312ri(int i) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.f9666lr;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i);
    }

    /* JADX INFO: renamed from: ri */
    public void m12313ri(AbstractC3217fi abstractC3217fi) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.f9666lr;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        C3583qd.m16614ri(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.xha.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        C3007bu c3007bu = this.f9665ka;
        if (c3007bu != null) {
            c3007bu.m11856ri(abstractC3217fi);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m12314ri(C3040vr c3040vr) {
        this.f9663fi = true;
        C3007bu c3007bu = this.f9665ka;
        if (c3007bu == null || !c3007bu.m11857ri(c3040vr)) {
            return false;
        }
        C3583qd.m16612ri((View) this.f9666lr, 0);
        return true;
    }
}
