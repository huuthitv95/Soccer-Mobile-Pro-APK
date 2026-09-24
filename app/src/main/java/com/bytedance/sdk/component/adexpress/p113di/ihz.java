package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.p123ik.C2489ri;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes9.dex */
public class ihz extends RelativeLayout {

    /* JADX INFO: renamed from: di */
    private AnimatorSet f6280di;

    /* JADX INFO: renamed from: fi */
    private TextView f6281fi;

    /* JADX INFO: renamed from: ik */
    private ImageView f6282ik;
    private AnimatorSet jbs;

    /* JADX INFO: renamed from: ka */
    private TextView f6283ka;

    /* JADX INFO: renamed from: lr */
    private ImageView f6284lr;

    /* JADX INFO: renamed from: mj */
    private AnimatorSet f6285mj;

    /* JADX INFO: renamed from: qt */
    private String f6286qt;

    /* JADX INFO: renamed from: ri */
    private ImageView f6287ri;

    /* JADX INFO: renamed from: sf */
    private int f6288sf;
    private AnimatorSet xha;

    public ihz(Context context) {
        super(context);
        this.f6280di = new AnimatorSet();
        this.xha = new AnimatorSet();
        this.f6285mj = new AnimatorSet();
        this.jbs = new AnimatorSet();
        this.f6288sf = 100;
        mo8226ri(context);
    }

    public ihz(Context context, String str) {
        super(context);
        this.f6280di = new AnimatorSet();
        this.xha = new AnimatorSet();
        this.f6285mj = new AnimatorSet();
        this.jbs = new AnimatorSet();
        this.f6288sf = 100;
        setClipChildren(false);
        this.f6286qt = str;
        mo8226ri(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f6280di;
    }

    /* JADX INFO: renamed from: ik */
    public void m8223ik() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6287ri, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6287ri, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6287ri, "translationY", 0.0f, xha.m8833ri(getContext(), -this.f6288sf));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) xha.m8833ri(getContext(), this.f6288sf));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.ihz.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (ihz.this.f6282ik != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ihz.this.f6282ik.getLayoutParams();
                    layoutParams.height = num.intValue();
                    ihz.this.f6282ik.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f6282ik, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f6282ik, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f6284lr, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f6284lr, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f6284lr, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f6284lr, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.f6284lr, "translationY", 0.0f, xha.m8833ri(getContext(), -this.f6288sf));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.xha.setDuration(50L);
        this.jbs.setDuration(1500L);
        this.f6285mj.setDuration(50L);
        this.xha.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.f6285mj.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.jbs.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.f6280di.playSequentially(this.f6285mj, this.jbs, this.xha);
    }

    /* JADX INFO: renamed from: lr */
    public void mo8224lr() {
        try {
            AnimatorSet animatorSet = this.f6280di;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f6285mj;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.xha;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.jbs;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo8224lr();
    }

    /* JADX INFO: renamed from: ri */
    public void mo8225ri() {
        m8223ik();
        this.f6280di.start();
        this.f6280di.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.di.ihz.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ihz.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.ihz.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ihz.this.f6280di.start();
                    }
                }, 200L);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    protected void mo8226ri(Context context) {
        if (context == null) {
            context = C2490ka.m8811ri();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.f6286qt)) {
            addView(C2489ri.m8801di(context));
            this.f6288sf = (int) (((double) this.f6288sf) * 1.25d);
        } else {
            addView(C2489ri.m8802fi(context));
        }
        this.f6287ri = (ImageView) findViewById(2097610734);
        this.f6284lr = (ImageView) findViewById(2097610735);
        this.f6283ka = (TextView) findViewById(2097610730);
        this.f6282ik = (ImageView) findViewById(2097610733);
        this.f6281fi = (TextView) findViewById(2097610731);
    }

    public void setGuideText(String str) {
        TextView textView = this.f6283ka;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.f6281fi != null) {
            if (TextUtils.isEmpty(str)) {
                this.f6281fi.setText("");
            } else {
                this.f6281fi.setText(str);
            }
        }
    }
}
