package com.bytedance.sdk.component.adexpress.p113di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p123ik.C2489ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2380mj extends ihz {

    /* JADX INFO: renamed from: di */
    private AnimatorSet f6325di;

    /* JADX INFO: renamed from: fi */
    private int f6326fi;

    /* JADX INFO: renamed from: ik */
    private ImageView f6327ik;

    /* JADX INFO: renamed from: ka */
    private ImageView f6328ka;

    /* JADX INFO: renamed from: lr */
    private ImageView f6329lr;

    /* JADX INFO: renamed from: ri */
    private TextView f6330ri;

    public C2380mj(Context context) {
        super(context);
        this.f6325di = new AnimatorSet();
        m8247lr(context);
    }

    /* JADX INFO: renamed from: ka */
    private void m8246ka() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: lr */
    private void m8247lr(Context context) {
        addView(C2489ri.m8805lr(context));
        this.f6329lr = (ImageView) findViewById(2097610751);
        this.f6327ik = (ImageView) findViewById(2097610750);
        this.f6328ka = (ImageView) findViewById(2097610749);
        this.f6330ri = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.f6326fi;
    }

    @Override // com.bytedance.sdk.component.adexpress.p113di.ihz
    /* JADX INFO: renamed from: lr */
    public void mo8224lr() {
        this.f6325di.cancel();
    }

    @Override // com.bytedance.sdk.component.adexpress.p113di.ihz
    /* JADX INFO: renamed from: ri */
    public void mo8225ri() {
        m8246ka();
    }

    @Override // com.bytedance.sdk.component.adexpress.p113di.ihz
    /* JADX INFO: renamed from: ri */
    protected void mo8226ri(Context context) {
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + 195;
        this.f6328ka.setColorFilter(Color.rgb(i2, i2, i2), PorterDuff.Mode.SRC_IN);
        int i3 = ((i + 20) % 60) + 195;
        this.f6327ik.setColorFilter(Color.rgb(i3, i3, i3), PorterDuff.Mode.SRC_IN);
        int i4 = ((i + 40) % 60) + 195;
        this.f6329lr.setColorFilter(Color.rgb(i4, i4, i4), PorterDuff.Mode.SRC_IN);
    }

    public void setButtonText(String str) {
        if (this.f6330ri == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f6330ri.setText(str);
    }
}
