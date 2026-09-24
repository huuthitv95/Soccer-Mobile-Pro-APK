package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;

/* JADX INFO: loaded from: classes3.dex */
public class wjv extends C2410di {
    public wjv(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6486vr = new View(context);
        addView(this.f6486vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        this.f6486vr.setBackgroundColor(this.f6475co.m8732zf());
        return true;
    }
}
