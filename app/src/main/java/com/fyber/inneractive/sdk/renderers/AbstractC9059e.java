package com.fyber.inneractive.sdk.renderers;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.AbstractC8076b0;
import com.fyber.inneractive.sdk.flow.C8124h0;
import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b;
import com.fyber.inneractive.sdk.rtb.watermark.C9111b;
import com.fyber.inneractive.sdk.util.AbstractC9195v;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9059e extends AbstractC8076b0 {

    /* JADX INFO: renamed from: k */
    public InterfaceC9124b f21202k;

    /* JADX INFO: renamed from: c */
    public final ImageView m21861c(ViewGroup viewGroup) {
        C9111b c9111b;
        if (viewGroup == null) {
            return null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f17957a;
        ImageView imageView = ((inneractiveAdSpot instanceof C8124h0) && (c9111b = ((C8124h0) inneractiveAdSpot).f18085m) != null) ? c9111b.f21362a : null;
        if (imageView == null) {
            return null;
        }
        AbstractC9195v.m22027a(imageView);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(imageView);
        return imageView;
    }
}
