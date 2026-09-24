package com.bytedance.sdk.openadsdk.p266uq.p268ri;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3551lr extends C3552ri {

    /* JADX INFO: renamed from: di */
    private String f13061di;

    /* JADX INFO: renamed from: fi */
    private FrameLayout f13062fi;

    /* JADX INFO: renamed from: ik */
    private InterfaceC2879di f13063ik;

    /* JADX INFO: renamed from: ka */
    private final FrameLayout f13064ka;

    /* JADX INFO: renamed from: lr */
    private volatile boolean f13065lr;

    public C3551lr(Context context, wjv wjvVar, int i, boolean z, FrameLayout frameLayout, String str) {
        super(context, wjvVar, i, z, frameLayout);
        this.f13064ka = frameLayout;
        this.f13061di = str;
        m16299lr(false);
        int iM16580ik = C3583qd.m16580ik(context);
        int iM16578fi = C3583qd.m16578fi(context);
        if (i == 1) {
            if (iM16580ik <= iM16578fi) {
                this.f13081ri.layout(0, 0, iM16580ik, iM16578fi);
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            if (iM16580ik > iM16578fi) {
                this.f13081ri.layout(0, 0, iM16580ik, iM16578fi);
                return;
            }
        }
        this.f13081ri.layout(0, 0, iM16578fi, iM16580ik);
    }

    public String jbs() {
        return this.f13061di;
    }

    /* JADX INFO: renamed from: mj */
    public void m16275mj() {
        super.m16306ri(true, new InterfaceC2879di() { // from class: com.bytedance.sdk.openadsdk.uq.ri.lr.1
            @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di
            /* JADX INFO: renamed from: ri */
            public void mo11086ri() {
                if (C3551lr.this.f13063ik != null) {
                    C3551lr.this.f13063ik.mo11086ri();
                } else {
                    C3551lr.this.f13065lr = true;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.p266uq.p268ri.C3552ri
    /* JADX INFO: renamed from: ri */
    public void mo16276ri() {
        this.f13062fi.setVisibility(0);
        super.mo16276ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m16277ri(FrameLayout frameLayout, InterfaceC2879di interfaceC2879di) {
        this.f13062fi = frameLayout;
        frameLayout.addView(this.f13064ka);
        this.f13063ik = interfaceC2879di;
        if (this.f13065lr) {
            this.f13063ik.mo11086ri();
        }
    }
}
