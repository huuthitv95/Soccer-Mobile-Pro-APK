package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2493ik;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2423qt extends C2410di {
    public C2423qt(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        if (C2490ka.m8810lr()) {
            this.f6486vr = new ImageView(context);
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.xha = this.f6481mj;
        } else {
            this.f6486vr = new TextView(context);
        }
        this.f6486vr.setTag(3);
        addView(this.f6486vr, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().m8886mj() && dynamicRootView.getRenderRequest().m8891su()) {
                return;
            }
            this.f6486vr.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        if (C2490ka.m8810lr()) {
            Drawable drawableM8816ri = C2493ik.m8816ri(getContext(), this.f6475co);
            if (drawableM8816ri != null) {
                ((ImageView) this.f6486vr).setBackground(drawableM8816ri);
            }
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iM10305ka = C2729uq.m10305ka(getContext(), "tt_reward_full_feedback");
            if (iM10305ka > 0) {
                ((ImageView) this.f6486vr).setImageResource(iM10305ka);
            }
        }
        return true;
    }
}
