package com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.tan.p262ik.C3534ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.lr.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3508lr extends C3507ik {
    public C3508lr(Context context, wjv wjvVar, AdSlot adSlot) {
        super(context, wjvVar, adSlot);
    }

    /* JADX INFO: renamed from: lr */
    public C3534ri m15915lr() {
        if (this.f12731qt != null) {
            return ((tan) this.f12731qt).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri.C3507ik
    /* JADX INFO: renamed from: ri */
    protected void mo15913ri() {
        this.f12731qt = new tan(this.f12730mj, this.f12701lr, this.jbs, this.f12732sf, false);
        this.f12703ri.m13019ri(((tan) this.f12731qt).getVideoController());
        m15911ik();
    }
}
