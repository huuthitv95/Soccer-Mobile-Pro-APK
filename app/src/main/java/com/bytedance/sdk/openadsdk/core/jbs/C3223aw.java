package com.bytedance.sdk.openadsdk.core.jbs;

import com.bytedance.adsdk.ugeno.core.C2227bu;
import com.bytedance.adsdk.ugeno.core.InterfaceC2241nr;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi;
import com.bytedance.sdk.openadsdk.utils.dzy;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C3223aw implements InterfaceC2241nr, com.bytedance.sdk.component.adexpress.p125lr.jbs {

    /* JADX INFO: renamed from: di */
    private boolean f10760di;

    /* JADX INFO: renamed from: fi */
    private long f10761fi;

    /* JADX INFO: renamed from: ik */
    private final com.bytedance.sdk.openadsdk.core.model.wjv f10762ik;

    /* JADX INFO: renamed from: ka */
    private final String f10763ka;

    /* JADX INFO: renamed from: lr */
    private final String f10764lr;

    /* JADX INFO: renamed from: ri */
    private final InterfaceC3418fi f10765ri;

    public C3223aw(InterfaceC3418fi interfaceC3418fi, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str2, boolean z) {
        this.f10765ri = interfaceC3418fi;
        this.f10764lr = str;
        this.f10763ka = str2;
        this.f10762ik = wjvVar;
        this.f10760di = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: di */
    public void mo8985di() {
        this.f10765ri.mo15592ri(true);
        this.f10765ri.mo15602co();
        dzy.m16402lr(new AbstractRunnableC2676ik("native_success") { // from class: com.bytedance.sdk.openadsdk.core.jbs.aw.2
            @Override // java.lang.Runnable
            public void run() {
                C3414ik.m15522lr(C3223aw.this.f10762ik, C3223aw.this.f10764lr, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: di */
    public void mo8986di(int i) {
        final String str;
        System.currentTimeMillis();
        if (i == 3) {
            this.f10765ri.xha("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.f10765ri.xha("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.f10765ri.mo15592ri(true);
        dzy.m16402lr(new AbstractRunnableC2676ik("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.jbs.aw.1
            @Override // java.lang.Runnable
            public void run() {
                C3414ik.m15522lr(C3223aw.this.f10762ik, C3223aw.this.f10764lr, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: fi */
    public void mo8987fi() {
        this.f10765ri.mo15597lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: fi */
    public void mo8988fi(int i) {
        if (i == 3) {
            this.f10765ri.mo15608ka("dynamic_sub_render2_end");
        } else {
            this.f10765ri.mo15608ka("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2241nr
    /* JADX INFO: renamed from: ik */
    public void mo7384ik() {
        this.f10765ri.mo15605fi("ugen_sub_render_start");
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: ik */
    public void mo8989ik(int i) {
        if (i == 3) {
            this.f10765ri.mo15608ka("dynamic_sub_analysis2_end");
        } else {
            this.f10765ri.mo15608ka("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    public void jbs() {
        this.f10765ri.mo15597lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: ka */
    public void mo8990ka() {
        this.f10765ri.mo15598ri();
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: ka */
    public void mo8991ka(int i) {
        if (i == 3) {
            this.f10765ri.mo15608ka("dynamic_sub_render2_start");
        } else {
            this.f10765ri.mo15608ka("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2241nr
    /* JADX INFO: renamed from: lr */
    public void mo7385lr() {
        this.f10765ri.mo15605fi("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: lr */
    public void mo8992lr(int i) {
        if (i == 3) {
            this.f10765ri.mo15608ka("dynamic_sub_analysis2_start");
        } else {
            this.f10765ri.mo15608ka("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: mj */
    public void mo8993mj() {
        this.f10765ri.bgr();
    }

    /* JADX INFO: renamed from: qt */
    public void m13581qt() {
        this.f10765ri.mo15591qt();
        this.f10765ri.mo15593sf();
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2241nr
    /* JADX INFO: renamed from: ri */
    public void mo7386ri() {
        this.f10765ri.mo15610ri("ugen_render_start", this.f10760di);
        this.f10765ri.mo15605fi("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: ri */
    public void mo8994ri(int i) {
        this.f10761fi = System.currentTimeMillis();
        if (i == 3) {
            this.f10765ri.mo15607ik("dynamic_render2_start");
        } else {
            this.f10765ri.mo15607ik("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: ri */
    public void mo8995ri(int i, int i2, String str, boolean z) {
        if (!z) {
            this.f10765ri.mo15592ri(true);
        }
        if (i == 3) {
            this.f10765ri.mo15609lr(i2, "dynamic_render2_error");
        } else {
            this.f10765ri.mo15609lr(i2, "dynamic_render_error");
        }
        C3241sf.m13724ri("NDR", i2, str, this.f10764lr, this.f10763ka, this.f10762ik);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: ri */
    public void mo8996ri(int i, String str) {
        this.f10765ri.mo15599ri(i, str);
        C3241sf.m13724ri("Web", i, str, this.f10764lr, this.f10763ka, this.f10762ik);
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2241nr
    /* JADX INFO: renamed from: ri */
    public void mo7387ri(C2227bu c2227bu) {
        if (c2227bu.m7333ri() == 0) {
            this.f10765ri.mo15605fi("ugen_sub_render_end");
            this.f10765ri.mo15604di("ugen_render_success");
        } else {
            this.f10765ri.mo15606ik(c2227bu.m7333ri(), "ugen_render_error");
            C3241sf.m13724ri("UGen", c2227bu.m7333ri(), c2227bu.m7332lr(), this.f10764lr, this.f10763ka, this.f10762ik);
        }
        this.f10765ri.mo15592ri(true);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    /* JADX INFO: renamed from: ri */
    public void mo8997ri(boolean z) {
        this.f10765ri.mo15584lr(z ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    public void xha() {
        this.f10765ri.mo15601aw();
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.jbs
    public void xha(int i) {
        Integer.valueOf(i);
        this.f10765ri.mo15603ri(i);
    }
}
