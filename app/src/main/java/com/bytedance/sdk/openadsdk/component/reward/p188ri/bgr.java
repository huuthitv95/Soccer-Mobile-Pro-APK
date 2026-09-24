package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3343mj;
import com.bytedance.sdk.openadsdk.core.widget.xha;

/* JADX INFO: loaded from: classes3.dex */
public class bgr {

    /* JADX INFO: renamed from: di */
    private xha f9283di;

    /* JADX INFO: renamed from: fi */
    private final C3022ri f9284fi;

    /* JADX INFO: renamed from: ik */
    private final Context f9285ik;

    /* JADX INFO: renamed from: ka */
    private final int f9286ka;

    /* JADX INFO: renamed from: lr */
    private final wjv f9287lr;

    /* JADX INFO: renamed from: ri */
    C3343mj f9288ri;
    private AnimatorSet xha;

    public bgr(C3022ri c3022ri) {
        this.f9285ik = c3022ri.srn;
        this.f9287lr = c3022ri.f9389lr;
        this.f9286ka = c3022ri.bnj;
        this.f9284fi = c3022ri;
    }

    /* JADX INFO: renamed from: ik */
    public void m11840ik() {
        AnimatorSet animatorSet = this.xha;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: ka */
    public View m11841ka() {
        return this.f9283di;
    }

    /* JADX INFO: renamed from: lr */
    public void m11842lr() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bgr.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (bgr.this.f9288ri != null) {
                    bgr.this.f9288ri.setProgress(iIntValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(3000L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bgr.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (bgr.this.f9288ri != null) {
                    bgr.this.f9288ri.setProgress(iIntValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.xha = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.xha.start();
    }

    /* JADX INFO: renamed from: ri */
    public void m11843ri() {
        try {
            if (C3279dw.m14090ik(this.f9287lr)) {
                return;
            }
            xha xhaVar = new xha(this.f9285ik);
            this.f9283di = xhaVar;
            this.f9288ri = xhaVar.getLoadingProgressBar();
            C3195mj downloadButton = this.f9283di.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.f9284fi.f9402su.m11986fi());
            }
            this.f9283di.m15117ri(this.f9287lr, this.f9286ka);
        } catch (Throwable unused) {
        }
    }
}
