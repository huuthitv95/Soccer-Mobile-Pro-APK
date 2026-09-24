package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.nr */
/* JADX INFO: loaded from: classes3.dex */
class C3001nr implements TTClientBidding {

    /* JADX INFO: renamed from: ri */
    private final C3000mj f9215ri;

    C3001nr(Context context, C3289ri c3289ri) {
        this.f9215ri = new C3000mj(context, c3289ri);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.f9215ri.loss(d, str, str2);
    }

    /* JADX INFO: renamed from: lr */
    public void m11772lr() {
        this.f9215ri.m11771ri();
    }

    /* JADX INFO: renamed from: ri */
    public C3000mj m11773ri() {
        return this.f9215ri;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.f9215ri.win(d);
    }
}
