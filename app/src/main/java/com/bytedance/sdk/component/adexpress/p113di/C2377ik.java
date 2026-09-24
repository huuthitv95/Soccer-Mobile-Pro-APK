package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p124ka.C2497mj;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.bytedance.sdk.component.utils.C2716dw;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2377ik extends FrameLayout {

    /* JADX INFO: renamed from: di */
    private AnimatorSet f6292di;

    /* JADX INFO: renamed from: fi */
    private slm f6293fi;

    /* JADX INFO: renamed from: ik */
    private ImageView f6294ik;

    /* JADX INFO: renamed from: ka */
    private TextView f6295ka;

    /* JADX INFO: renamed from: lr */
    private ImageView f6296lr;

    /* JADX INFO: renamed from: ri */
    private Context f6297ri;

    public C2377ik(Context context) {
        super(context);
        this.f6292di = new AnimatorSet();
        this.f6297ri = context;
        m8228fi();
        m8227di();
    }

    /* JADX INFO: renamed from: di */
    private void m8227di() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6294ik, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6294ik, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f6292di.setDuration(800L);
        this.f6292di.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: fi */
    private void m8228fi() {
        FrameLayout frameLayout = new FrameLayout(this.f6297ri);
        this.f6293fi = new slm(this.f6297ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6297ri, 95.0f), (int) xha.m8833ri(this.f6297ri, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f6293fi, layoutParams);
        this.f6296lr = new ImageView(this.f6297ri);
        int iM10218ri = C2716dw.m10218ri(this.f6297ri, 60.0f);
        this.f6296lr.setImageDrawable(C2497mj.m8823ri(1, null, null, new int[]{iM10218ri, iM10218ri}, Integer.valueOf(C2716dw.m10218ri(this.f6297ri, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6297ri, 75.0f), (int) xha.m8833ri(this.f6297ri, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f6296lr, layoutParams2);
        this.f6294ik = new ImageView(this.f6297ri);
        int iM10218ri2 = C2716dw.m10218ri(this.f6297ri, 50.0f);
        this.f6294ik.setImageDrawable(C2497mj.m8823ri(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iM10218ri2, iM10218ri2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) xha.m8833ri(this.f6297ri, 63.0f), (int) xha.m8833ri(this.f6297ri, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f6294ik, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.f6297ri);
        this.f6295ka = textView;
        textView.setTextColor(-1);
        this.f6295ka.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.f6295ka, layoutParams4);
    }

    /* JADX INFO: renamed from: ik */
    public void m8229ik() {
        this.f6293fi.m8269ri();
    }

    /* JADX INFO: renamed from: ka */
    public void m8230ka() {
        this.f6293fi.m8268lr();
        this.f6293fi.m8267ik();
    }

    /* JADX INFO: renamed from: lr */
    public void m8231lr() {
        this.f6292di.cancel();
    }

    /* JADX INFO: renamed from: ri */
    public void m8232ri() {
        this.f6292di.start();
    }

    public void setGuideText(String str) {
        this.f6295ka.setText(str);
    }
}
