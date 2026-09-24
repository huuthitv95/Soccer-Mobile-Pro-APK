package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2384sf;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2455nr implements xha<C2384sf> {

    /* JADX INFO: renamed from: ri */
    private final C2384sf f6614ri;

    public C2455nr(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        C2384sf c2384sf = new C2384sf(context);
        this.f6614ri = c2384sf;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, xhaVar.m8700fe() > 0 ? xhaVar.m8700fe() : C2490ka.m8810lr() ? 0 : 120);
        c2384sf.setLayoutParams(layoutParams);
        c2384sf.setClipChildren(false);
        c2384sf.setText(xhaVar.whw());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C2384sf mo8425ik() {
        return this.f6614ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        C2384sf c2384sf = this.f6614ri;
        if (c2384sf != null) {
            c2384sf.m8264lr();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        C2384sf c2384sf = this.f6614ri;
        if (c2384sf != null) {
            c2384sf.m8265ri();
        }
    }
}
