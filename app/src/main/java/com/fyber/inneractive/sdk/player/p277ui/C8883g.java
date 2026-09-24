package com.fyber.inneractive.sdk.player.p277ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8883g extends TextureView {

    /* JADX INFO: renamed from: a */
    public final WeakReference f20885a;

    public C8883g(AbstractC8902s abstractC8902s) {
        super(abstractC8902s.getContext());
        this.f20885a = new WeakReference(abstractC8902s);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC8902s abstractC8902s = (AbstractC8902s) AbstractC9195v.m22024a(this.f20885a);
        if (abstractC8902s instanceof C8885i) {
            abstractC8902s = ((C8885i) abstractC8902s).f20888z;
        }
        if (abstractC8902s != null) {
            i = View.MeasureSpec.makeMeasureSpec(abstractC8902s.f20965u.f21454a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(abstractC8902s.f20965u.f21455b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
