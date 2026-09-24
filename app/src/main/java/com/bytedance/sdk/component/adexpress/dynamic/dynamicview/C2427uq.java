package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uq */
/* JADX INFO: loaded from: classes3.dex */
public class C2427uq extends C2410di implements InterfaceC2442ik {

    /* JADX INFO: renamed from: ac */
    private int f6545ac;

    /* JADX INFO: renamed from: lr */
    private int f6546lr;

    /* JADX INFO: renamed from: ri */
    private int f6547ri;

    public C2427uq(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        m8353ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m8353ri() {
        List<C2475mj> listM8638sf = this.f6473aw.m8638sf();
        if (listM8638sf == null || listM8638sf.size() <= 0) {
            return;
        }
        for (C2475mj c2475mj : listM8638sf) {
            if (c2475mj.m8627qt().m8599ri() == 21) {
                this.f6547ri = (int) (this.xha - com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, c2475mj.m8625mj()));
            }
            if (c2475mj.m8627qt().m8599ri() == 20) {
                this.f6546lr = (int) (this.xha - com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, c2475mj.m8625mj()));
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: di */
    public void mo8309di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.jbs;
        layoutParams.topMargin = this.f6483qt;
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
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8704ik()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8708lr()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8706ka()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8718ri()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6545ac == 0) {
            setMeasuredDimension(this.f6546lr, this.f6481mj);
        } else {
            setMeasuredDimension(this.f6547ri, this.f6481mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik
    /* JADX INFO: renamed from: ri */
    public void mo8310ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        this.f6545ac = i;
    }
}
