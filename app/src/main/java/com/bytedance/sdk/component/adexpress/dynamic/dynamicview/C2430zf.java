package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2493ik;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zf */
/* JADX INFO: loaded from: classes3.dex */
public class C2430zf extends C2410di implements InterfaceC2442ik {

    /* JADX INFO: renamed from: ri */
    private boolean f6550ri;

    public C2430zf(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        if (dynamicRootView.getRenderRequest() != null) {
            this.f6550ri = dynamicRootView.getRenderRequest().m8876aw();
        }
        this.xha = this.f6481mj;
        this.f6486vr = new ImageView(context);
        this.f6486vr.setTag(Integer.valueOf(getClickArea()));
        addView(this.f6486vr, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().m8891su()) {
            return;
        }
        this.f6486vr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        Drawable drawableM10303ik;
        super.jbs();
        ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawableM8816ri = C2493ik.m8816ri(getContext(), this.f6475co);
        if (drawableM8816ri != null) {
            ((ImageView) this.f6486vr).setBackground(drawableM8816ri);
        }
        if (this.f6550ri) {
            drawableM10303ik = C2729uq.m10303ik(getContext(), "tt_close_btn");
        } else {
            drawableM10303ik = C2729uq.m10303ik(getContext(), "tt_skip_btn");
            if (drawableM10303ik != null) {
                drawableM10303ik.setAutoMirrored(true);
            }
        }
        if (drawableM10303ik != null) {
            ((ImageView) this.f6486vr).setImageDrawable(drawableM10303ik);
        }
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik
    /* JADX INFO: renamed from: ri */
    public void mo8310ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        setVisibility(i2);
    }
}
