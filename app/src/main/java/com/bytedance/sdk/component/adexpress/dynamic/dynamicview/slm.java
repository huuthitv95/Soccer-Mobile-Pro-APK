package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2478lr;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2493ik;
import com.bytedance.sdk.component.adexpress.p124ka.C2497mj;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: loaded from: classes9.dex */
public class slm extends C2410di implements InterfaceC2478lr {
    public slm(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6486vr = new ImageView(context);
        this.f6486vr.setTag(5);
        addView(this.f6486vr, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().m8891su()) {
            return;
        }
        this.f6486vr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: fi */
    public boolean mo8326fi() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        if (C2490ka.m8810lr()) {
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.bgr.mIsMute);
        if (!C2490ka.m8810lr()) {
            ((ImageView) this.f6486vr).setBackgroundDrawable(C2497mj.m8823ri(0, Integer.valueOf(this.f6475co.m8732zf()), new int[]{this.f6481mj / 2}, null, null, null));
            return true;
        }
        Drawable drawableM8816ri = C2493ik.m8816ri(getContext(), this.f6475co);
        if (drawableM8816ri == null) {
            return true;
        }
        ((ImageView) this.f6486vr).setBackground(drawableM8816ri);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2478lr
    public void setSoundMute(boolean z) {
        ((ImageView) this.f6486vr).setImageResource(z ? C2729uq.m10305ka(getContext(), "tt_reward_full_mute") : C2729uq.m10305ka(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.f6486vr).getDrawable() != null) {
            ((ImageView) this.f6486vr).getDrawable().setAutoMirrored(true);
        }
    }
}
