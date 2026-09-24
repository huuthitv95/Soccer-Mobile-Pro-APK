package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: loaded from: classes3.dex */
public class ihz extends xha implements InterfaceC2442ik {

    /* JADX INFO: renamed from: ac */
    private int f6505ac;

    /* JADX INFO: renamed from: lr */
    private int f6506lr;

    /* JADX INFO: renamed from: ri */
    private int[] f6507ri;

    public ihz(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        dynamicRootView.setTimeOutListener(this);
    }

    /* JADX INFO: renamed from: ri */
    private void m8343ri() {
        int iM8833ri = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8701fi());
        this.f6506lr = ((this.f6481mj - iM8833ri) / 2) - this.f6475co.m8718ri();
        this.f6505ac = 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: di */
    public void mo8309di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.f6481mj);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xha, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        ((TextView) this.f6486vr).setText("");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f6486vr).getText())) {
            setMeasuredDimension(0, this.f6481mj);
        } else {
            setMeasuredDimension(this.xha, this.f6481mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik
    /* JADX INFO: renamed from: ri */
    public void mo8310ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        String strM10311ri = C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.f6486vr.setVisibility(0);
            ((TextView) this.f6486vr).setText("| ".concat(String.valueOf(strM10311ri)));
            this.f6486vr.measure(-2, -2);
            this.f6507ri = new int[]{this.f6486vr.getMeasuredWidth() + 1, this.f6486vr.getMeasuredHeight()};
            View view = this.f6486vr;
            int[] iArr = this.f6507ri;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.f6486vr).setGravity(17);
            ((TextView) this.f6486vr).setIncludeFontPadding(false);
            m8343ri();
            this.f6486vr.setPadding(this.f6475co.m8704ik(), this.f6506lr, this.f6475co.m8706ka(), this.f6505ac);
        }
        requestLayout();
    }
}
