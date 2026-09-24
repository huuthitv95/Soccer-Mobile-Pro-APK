package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.bytedance.sdk.component.utils.C2729uq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2373fi extends FrameLayout {

    /* JADX INFO: renamed from: lr */
    private AnimatorSet f6270lr;

    /* JADX INFO: renamed from: ri */
    private ImageView f6271ri;

    public C2373fi(Context context) {
        super(context);
        m8214ik();
        m8215ka();
    }

    /* JADX INFO: renamed from: ik */
    private void m8214ik() {
        ImageView imageView = new ImageView(getContext());
        this.f6271ri = imageView;
        imageView.setImageResource(C2729uq.m10305ka(getContext(), "tt_white_hand"));
        int iM8833ri = (int) xha.m8833ri(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM8833ri, iM8833ri);
        layoutParams.gravity = 17;
        addView(this.f6271ri, layoutParams);
    }

    /* JADX INFO: renamed from: ka */
    private void m8215ka() {
        this.f6270lr = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6271ri, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6271ri, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f6270lr.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: lr */
    public void m8216lr() {
        AnimatorSet animatorSet = this.f6270lr;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8217ri() {
        AnimatorSet animatorSet = this.f6270lr;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
