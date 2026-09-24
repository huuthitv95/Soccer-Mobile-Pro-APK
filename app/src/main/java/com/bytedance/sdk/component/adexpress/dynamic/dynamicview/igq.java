package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2491di;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class igq extends C2410di implements InterfaceC2442ik {

    /* JADX INFO: renamed from: ac */
    private int f6501ac;
    private int ihz;

    /* JADX INFO: renamed from: lr */
    boolean f6502lr;

    /* JADX INFO: renamed from: ri */
    int f6503ri;

    /* JADX INFO: renamed from: uq */
    private boolean f6504uq;

    public igq(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.ihz = 0;
        setTag(Integer.valueOf(getClickArea()));
        m8342ri();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().m8891su()) {
            return;
        }
        if (this.f6486vr != null) {
            this.f6486vr.setVisibility(8);
        }
        setVisibility(8);
    }

    /* JADX INFO: renamed from: ri */
    private void m8342ri() {
        List<C2475mj> listM8638sf = this.f6473aw.m8638sf();
        if (listM8638sf == null || listM8638sf.size() <= 0) {
            return;
        }
        for (C2475mj c2475mj : listM8638sf) {
            if (TextUtils.equals("skip-with-time-skip-btn", c2475mj.m8627qt().m8596lr())) {
                this.f6501ac = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, c2475mj.m8625mj() + (C2490ka.m8810lr() ? c2475mj.m8608aw() : 0));
                this.f6503ri = this.xha - this.f6501ac;
                break;
            }
        }
        this.ihz = this.xha - this.f6503ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: di */
    public void mo8309di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.f6502lr) {
            layoutParams.leftMargin = this.jbs;
        } else {
            layoutParams.leftMargin = this.jbs + this.ihz;
        }
        if (this.f6504uq && this.f6475co != null) {
            layoutParams.leftMargin = ((this.jbs + this.ihz) - ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8704ik()))) - ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8706ka()));
        }
        if (C2490ka.m8810lr()) {
            layoutParams.topMargin = this.f6483qt - ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8708lr()));
        } else {
            layoutParams.topMargin = this.f6483qt;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        if (C2491di.m8812lr(this.bgr.getRenderRequest().m8884ka())) {
            return true;
        }
        super.jbs();
        setPadding((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8704ik()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8708lr()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8706ka()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8718ri()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6504uq && this.f6475co != null) {
            setMeasuredDimension(this.f6501ac + ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8704ik())) + ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8706ka())), this.f6481mj);
        } else if (this.f6502lr) {
            setMeasuredDimension(this.xha, this.f6481mj);
        } else {
            setMeasuredDimension(this.f6503ri, this.f6481mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik
    /* JADX INFO: renamed from: ri */
    public void mo8310ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 && this.f6504uq != z2) {
            this.f6504uq = z2;
            mo8309di();
            return;
        }
        if (z && this.f6502lr != z) {
            this.f6502lr = z;
            mo8309di();
        }
        this.f6502lr = z;
    }
}
