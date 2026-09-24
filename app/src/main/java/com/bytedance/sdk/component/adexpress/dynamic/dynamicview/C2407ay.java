package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ay */
/* JADX INFO: loaded from: classes3.dex */
public class C2407ay extends C2410di {

    /* JADX INFO: renamed from: ri */
    private int f6448ri;

    public C2407ay(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6448ri = 0;
        this.f6486vr = new com.bytedance.sdk.component.adexpress.p113di.wjv(context, null);
        this.f6486vr.setTag(Integer.valueOf(getClickArea()));
        addView(this.f6486vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: di */
    public void mo8309di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.f6481mj);
        layoutParams.topMargin = this.f6483qt;
        layoutParams.leftMargin = this.jbs + this.f6448ri;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iM8833ri = (int) ((com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8701fi()) * 5.0f) + com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8704ik() + com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8706ka())));
        if (this.xha > iM8833ri && 4 == this.f6475co.m8709mj()) {
            this.f6448ri = (this.xha - iM8833ri) / 2;
        }
        this.xha = iM8833ri;
        return new FrameLayout.LayoutParams(this.xha, this.f6481mj);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        double dM8694aw = this.f6475co.m8694aw();
        if (C2490ka.m8810lr() && (dM8694aw < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dM8694aw > 5.0d || (this.bgr != null && this.bgr.getRenderRequest() != null && this.bgr.getRenderRequest().m8888qt() != 4))) {
            this.f6486vr.setVisibility(8);
            return true;
        }
        double d = (dM8694aw < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dM8694aw > 5.0d) ? 5.0d : dM8694aw;
        this.f6486vr.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.p113di.wjv) this.f6486vr).m8284ri(d, this.f6475co.xha(), (int) this.f6475co.m8701fi(), ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8708lr())) + ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8718ri())) + ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8701fi())));
        return true;
    }
}
