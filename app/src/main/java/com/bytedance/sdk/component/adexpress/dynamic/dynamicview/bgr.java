package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: loaded from: classes3.dex */
public class bgr extends C2410di {
    public bgr(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6486vr = new ImageView(context);
        this.f6486vr.setTag(Integer.valueOf(getClickArea()));
        if (C2490ka.m8810lr()) {
            this.f6481mj = Math.max(dynamicRootView.getLogoUnionHeight(), this.f6481mj);
        }
        addView(this.f6486vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        if (C2490ka.m8810lr()) {
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        if (this.bgr == null || this.bgr.getRenderRequest() == null || TextUtils.isEmpty(this.bgr.getRenderRequest().igq())) {
            setVisibility(8);
        } else {
            String strIgq = this.bgr.getRenderRequest().igq();
            if (strIgq.equals("logo")) {
                ((ImageView) this.f6486vr).setImageResource(C2729uq.m10305ka(getContext(), "tt_ad_logo"));
            } else {
                InterfaceC2624qt interfaceC2624qtMo9651fi = C2531ri.m9163ri().m9165fi().mo9680ri(strIgq).mo9660ri(this.xha).mo9655lr(this.f6481mj).mo9654ka(this.xha).mo9651fi(this.f6481mj);
                String strBgr = this.bgr.getRenderRequest().bgr();
                if (!TextUtils.isEmpty(strBgr)) {
                    interfaceC2624qtMo9651fi.mo9656lr(strBgr);
                }
                interfaceC2624qtMo9651fi.mo9657ri((ImageView) this.f6486vr);
            }
        }
        ((ImageView) this.f6486vr).setColorFilter(this.f6475co.xha(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
