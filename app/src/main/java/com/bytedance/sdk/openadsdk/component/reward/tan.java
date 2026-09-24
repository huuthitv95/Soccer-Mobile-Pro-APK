package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;

/* JADX INFO: loaded from: classes3.dex */
class tan implements TTClientBidding {

    /* JADX INFO: renamed from: ri */
    private final C3002qt f9572ri;

    tan(Context context, C3289ri c3289ri, AdSlot adSlot) {
        this.f9572ri = new C3002qt(context, c3289ri, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.f9572ri.loss(d, str, str2);
    }

    /* JADX INFO: renamed from: lr */
    public void m12209lr() {
        this.f9572ri.m11780ri();
    }

    /* JADX INFO: renamed from: ri */
    public C3002qt m12210ri() {
        return this.f9572ri;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.f9572ri.win(d);
    }
}
