package com.bytedance.sdk.openadsdk.core.p222lr;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.vungle.ads.internal.Constants;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3268ri implements wjv.InterfaceC3358ri {

    /* JADX INFO: renamed from: ik */
    private final boolean f11061ik;

    /* JADX INFO: renamed from: lr */
    private final AdSlot f11062lr;

    /* JADX INFO: renamed from: ri */
    private final wjv.InterfaceC3358ri f11063ri;

    public C3268ri(wjv.InterfaceC3358ri interfaceC3358ri, AdSlot adSlot, boolean z) {
        this.f11063ri = interfaceC3358ri;
        this.f11062lr = adSlot;
        this.f11061ik = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
    /* JADX INFO: renamed from: ri */
    public void mo10890ri(final int i, final String str) {
        AdSlot adSlot;
        if (this.f11063ri != null) {
            if (dzy.m16391di() || !((adSlot = this.f11062lr) == null || adSlot.getDurationSlotType() == 5 || C3606fi.m16703ri("getads_callback_async", 0) != 1)) {
                this.f11063ri.mo10890ri(i, str);
            } else {
                dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lr.ri.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3268ri.this.f11063ri.mo10890ri(i, str);
                    }
                });
            }
            if (!this.f11061ik || this.f11062lr == null) {
                return;
            }
            C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.lr.ri.2
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr(Constants.LOAD_AD);
                    c3481ri.m15777ik(C3268ri.this.f11062lr.getCodeId());
                    c3481ri.m15780ka(C3571ig.m16444ik(C3268ri.this.f11062lr.getDurationSlotType()));
                    c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                    c3481ri.xha(C3571ig.m16479ri(C3268ri.this.f11062lr).toString());
                    return c3481ri;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
    /* JADX INFO: renamed from: ri */
    public void mo10891ri(final C3289ri c3289ri, final C3282ik c3282ik) {
        AdSlot adSlot;
        if (this.f11063ri != null) {
            if (dzy.m16391di() || !((adSlot = this.f11062lr) == null || adSlot.getDurationSlotType() == 5 || C3606fi.m16703ri("getads_callback_async", 0) != 1)) {
                this.f11063ri.mo10891ri(c3289ri, c3282ik);
            } else {
                dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lr.ri.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C3268ri.this.f11063ri.mo10891ri(c3289ri, c3282ik);
                    }
                });
            }
            if (!this.f11061ik || this.f11062lr == null) {
                return;
            }
            C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.lr.ri.4
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr(Constants.LOAD_AD);
                    c3481ri.m15777ik(C3268ri.this.f11062lr.getCodeId());
                    c3481ri.m15780ka(C3571ig.m16444ik(C3268ri.this.f11062lr.getDurationSlotType()));
                    c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                    c3481ri.xha(C3571ig.m16479ri(C3268ri.this.f11062lr).toString());
                    return c3481ri;
                }
            });
        }
    }
}
