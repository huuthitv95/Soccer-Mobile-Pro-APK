package com.bytedance.sdk.openadsdk.core.p221ka;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3122ik;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik;
import com.bytedance.sdk.openadsdk.p252ri.p258ri.InterfaceC3514lr;
import com.bytedance.sdk.openadsdk.tan.p262ik.C3534ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3255ik extends C3260ka {
    private int jbs;

    /* JADX INFO: renamed from: mj */
    private InterfaceC3514lr f10964mj;

    /* JADX INFO: renamed from: qt */
    private int f10965qt;

    public C3255ik(Context context, wjv wjvVar, AdSlot adSlot, boolean z) {
        super(context, wjvVar, adSlot, z);
        this.jbs = 1;
        this.f10965qt = -1;
    }

    public C3534ri getVideoModel() {
        if (this.f10985lr != null) {
            return ((tan) this.f10985lr).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p221ka.C3260ka
    /* JADX INFO: renamed from: ik */
    protected void mo13799ik() {
        this.f10985lr = new tan(this.f10987ri, this.f10983ik, this.f10984ka, this.f10981di, this.xha) { // from class: com.bytedance.sdk.openadsdk.core.ka.ik.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
            /* JADX INFO: renamed from: ik */
            protected C2889fi.ri mo12246ik(int i) {
                return C3255ik.this.m13818ri(super.mo12246ik(i));
            }
        };
        C3122ik videoController = ((tan) this.f10985lr).getVideoController();
        if (videoController != null) {
            videoController.m12941ka(this.jbs);
        }
        addView(this.f10985lr, new ViewGroup.LayoutParams(-1, -1));
        if (this.f10982fi != null) {
            setExpressInteractionListener(this.f10982fi);
        }
        if (this.f10985lr != null) {
            ((tan) this.f10985lr).setVideoAdListener(new InterfaceC3502ik() { // from class: com.bytedance.sdk.openadsdk.core.ka.ik.2
                @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik
                /* JADX INFO: renamed from: ik */
                public void mo13804ik(PAGNativeAd pAGNativeAd) {
                    if (C3255ik.this.f10964mj != null) {
                        C3255ik.this.f10964mj.mo13796ri();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik
                /* JADX INFO: renamed from: lr */
                public void mo13805lr(PAGNativeAd pAGNativeAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik
                /* JADX INFO: renamed from: ri */
                public void mo13806ri(int i, int i2) {
                }

                @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik
                /* JADX INFO: renamed from: ri */
                public void mo13807ri(PAGNativeAd pAGNativeAd) {
                    if (C3255ik.this.f10965qt == 3) {
                        C3255ik c3255ik = C3255ik.this;
                        c3255ik.m13803ri(c3255ik.f10964mj);
                    } else if (C3255ik.this.f10965qt == 2) {
                        C3255ik.this.m13802ri();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p221ka.C3260ka
    /* JADX INFO: renamed from: ka */
    public void mo13800ka() {
        C3122ik videoController;
        if ((this.f10985lr instanceof tan) && (videoController = ((tan) this.f10985lr).getVideoController()) != null) {
            this.jbs = videoController.m12944qd();
        }
        super.mo13800ka();
    }

    /* JADX INFO: renamed from: lr */
    public void m13801lr() {
        if (this.f10985lr != null) {
            ((tan) this.f10985lr).m13739bu();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13802ri() {
        if (this.f10985lr != null) {
            ((tan) this.f10985lr).m13741vr();
            this.f10965qt = 2;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13803ri(InterfaceC3514lr interfaceC3514lr) {
        if (this.f10985lr != null) {
            ((tan) this.f10985lr).slm();
            this.f10964mj = interfaceC3514lr;
            this.f10965qt = 3;
        }
    }
}
