package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.ihz;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2444bu<E extends ihz> implements xha<E> {

    /* JADX INFO: renamed from: fi */
    protected int f6591fi;

    /* JADX INFO: renamed from: ik */
    protected AbstractC2412fi f6592ik;

    /* JADX INFO: renamed from: ka */
    protected xha f6593ka;

    /* JADX INFO: renamed from: lr */
    protected Context f6594lr;

    /* JADX INFO: renamed from: ri */
    protected ihz f6595ri;

    public C2444bu(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        this(context, abstractC2412fi, xhaVar, 0);
    }

    public C2444bu(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar, int i) {
        this.f6591fi = i;
        this.f6594lr = context;
        this.f6592ik = abstractC2412fi;
        this.f6593ka = xhaVar;
        mo8431ka();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: fi, reason: merged with bridge method [inline-methods] */
    public E mo8425ik() {
        return (E) this.f6595ri;
    }

    /* JADX INFO: renamed from: ka */
    protected void mo8431ka() {
        this.f6595ri = new ihz(this.f6594lr, this.f6593ka.m8707kt());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6594lr, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6594lr, 100 - this.f6591fi);
        this.f6595ri.setLayoutParams(layoutParams);
        try {
            this.f6595ri.setGuideText(this.f6593ka.whw());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6595ri.mo8224lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6595ri.mo8225ri();
    }
}
