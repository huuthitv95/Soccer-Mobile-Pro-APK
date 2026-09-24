package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.C2440sf;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2491di;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.su */
/* JADX INFO: loaded from: classes3.dex */
public class C2426su extends xha implements InterfaceC2442ik {

    /* JADX INFO: renamed from: ac */
    private boolean f6538ac;

    /* JADX INFO: renamed from: lr */
    private boolean f6539lr;

    /* JADX INFO: renamed from: ri */
    private boolean f6540ri;

    public C2426su(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(c2475mj.m8627qt().m8596lr())) {
            dynamicRootView.setTimedown(this.f6481mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: di */
    public void mo8309di() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.f6473aw.m8627qt().m8596lr()) && !TextUtils.equals("skip-with-time-countdown", this.f6473aw.m8627qt().m8596lr())) {
            super.mo8309di();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.f6481mj);
        layoutParams.gravity = 8388627;
        if (C2490ka.m8810lr()) {
            layoutParams.leftMargin = this.jbs;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xha, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        if (C2491di.m8812lr(this.bgr.getRenderRequest().m8884ka())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.f6473aw.m8627qt().m8596lr())) {
            ((TextView) this.f6486vr).setText(String.valueOf((int) Double.parseDouble(this.f6475co.m8717qt())));
            return true;
        }
        ((TextView) this.f6486vr).setText(((int) Double.parseDouble(this.f6475co.m8717qt())) + CmcdData.Factory.STREAMING_FORMAT_SS);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f6486vr).getText())) {
            setMeasuredDimension(0, this.f6481mj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik
    /* JADX INFO: renamed from: ri */
    public void mo8310ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 || this.f6538ac) {
            ((TextView) this.f6486vr).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z && this.bgr.getRenderRequest().m8889ri() && C2491di.m8812lr(this.bgr.getRenderRequest().m8884ka())) {
            if (C2490ka.m8810lr()) {
                ((TextView) this.f6486vr).setText(i + CmcdData.Factory.STREAMING_FORMAT_SS);
            } else {
                ((TextView) this.f6486vr).setText(String.format(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_full_skip"), Integer.valueOf(i)));
            }
            this.f6540ri = true;
            return;
        }
        if (C2490ka.m8810lr() && !"open_ad".equals(this.bgr.getRenderRequest().m8884ka()) && this.bgr.getRenderRequest().m8889ri()) {
            this.f6538ac = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.f6473aw.m8627qt().m8596lr())) {
            ((TextView) this.f6486vr).setText(charSequence);
            return;
        }
        ((TextView) this.f6486vr).setText(((Object) charSequence) + CmcdData.Factory.STREAMING_FORMAT_SS);
        this.f6539lr = true;
        if (this.f6540ri) {
            CharSequence text = ((TextView) this.f6486vr).getText();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C2440sf.m8415lr(text != null ? text.toString() : "", this.f6475co.m8701fi(), true)[0] + com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(C2490ka.m8811ri(), this.f6475co.m8704ik() + this.f6475co.m8706ka())), this.f6481mj);
            layoutParams.gravity = 8388629;
            this.f6486vr.setLayoutParams(layoutParams);
            this.f6540ri = false;
            requestLayout();
        }
    }
}
