package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2421nr extends C2410di {

    /* JADX INFO: renamed from: ri */
    public C2419lr f6527ri;

    public C2421nr(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    protected GradientDrawable getDrawable() {
        C2419lr c2419lr = new C2419lr();
        this.f6527ri = c2419lr;
        return c2419lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        return super.jbs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: ri */
    protected GradientDrawable mo8332ri(GradientDrawable.Orientation orientation, int[] iArr) {
        C2419lr c2419lr = new C2419lr(orientation, iArr);
        this.f6527ri = c2419lr;
        return c2419lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: ri */
    protected C2419lr mo8333ri(Bitmap bitmap) {
        C2424ri c2424ri = new C2424ri(bitmap, this.f6527ri);
        this.f6527ri = c2424ri;
        return c2424ri;
    }
}
