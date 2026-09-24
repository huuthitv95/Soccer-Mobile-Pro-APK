package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2493ik;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends C2410di {
    public jbs(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        if (C2490ka.m8810lr()) {
            this.f6486vr = new ImageView(context);
        } else {
            this.f6486vr = new com.bytedance.sdk.component.adexpress.p113di.jbs(context);
        }
        this.f6486vr.setTag(3);
        addView(this.f6486vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        if (C2490ka.m8810lr()) {
            Drawable drawableM8816ri = C2493ik.m8816ri(getContext(), this.f6475co);
            if (drawableM8816ri != null) {
                this.f6486vr.setBackground(drawableM8816ri);
            }
            int iM10305ka = C2729uq.m10305ka(getContext(), "tt_close_btn");
            if (iM10305ka > 0) {
                ((ImageView) this.f6486vr).setImageResource(iM10305ka);
            }
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iM8833ri = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8696bu());
        if (this.f6486vr instanceof com.bytedance.sdk.component.adexpress.p113di.jbs) {
            ((com.bytedance.sdk.component.adexpress.p113di.jbs) this.f6486vr).setRadius((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8727vr()));
            ((com.bytedance.sdk.component.adexpress.p113di.jbs) this.f6486vr).setStrokeWidth(iM8833ri);
            ((com.bytedance.sdk.component.adexpress.p113di.jbs) this.f6486vr).setStrokeColor(this.f6475co.slm());
            ((com.bytedance.sdk.component.adexpress.p113di.jbs) this.f6486vr).setBgColor(this.f6475co.m8732zf());
            ((com.bytedance.sdk.component.adexpress.p113di.jbs) this.f6486vr).setDislikeColor(this.f6475co.xha());
            ((com.bytedance.sdk.component.adexpress.p113di.jbs) this.f6486vr).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, 1.0f));
        }
        return true;
    }
}
