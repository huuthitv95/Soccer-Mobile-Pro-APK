package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p123ik.C2489ri;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends ihz {

    /* JADX INFO: renamed from: ik */
    private AnimatorSet f6405ik;

    /* JADX INFO: renamed from: lr */
    private View f6406lr;

    /* JADX INFO: renamed from: ri */
    private TextView f6407ri;

    public xha(Context context) {
        super(context);
        this.f6405ik = new AnimatorSet();
        m8286lr(context);
    }

    /* JADX INFO: renamed from: ka */
    private void m8285ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6406lr, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6406lr, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f6405ik.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f6405ik.setDuration(1000L);
        this.f6405ik.start();
    }

    /* JADX INFO: renamed from: lr */
    private void m8286lr(Context context) {
        View viewM8807ri = C2489ri.m8807ri(context);
        this.f6406lr = viewM8807ri;
        addView(viewM8807ri);
        setClipChildren(false);
        this.f6407ri = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.p113di.ihz
    /* JADX INFO: renamed from: lr */
    public void mo8224lr() {
        this.f6405ik.cancel();
    }

    @Override // com.bytedance.sdk.component.adexpress.p113di.ihz
    /* JADX INFO: renamed from: ri */
    public void mo8225ri() {
        m8285ka();
    }

    @Override // com.bytedance.sdk.component.adexpress.p113di.ihz
    /* JADX INFO: renamed from: ri */
    protected void mo8226ri(Context context) {
    }

    public void setButtonText(String str) {
        if (this.f6407ri == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f6407ri.setText(str);
    }
}
