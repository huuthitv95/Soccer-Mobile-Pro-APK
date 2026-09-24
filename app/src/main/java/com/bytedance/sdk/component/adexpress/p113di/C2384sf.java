package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p123ik.C2489ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2384sf extends FrameLayout {

    /* JADX INFO: renamed from: ik */
    private final C2371co f6368ik;

    /* JADX INFO: renamed from: ka */
    private final RotateAnimation f6369ka;

    /* JADX INFO: renamed from: lr */
    private final ImageView f6370lr;

    /* JADX INFO: renamed from: ri */
    private final TextView f6371ri;

    public C2384sf(Context context) {
        super(context);
        addView(C2489ri.m8804ka(context));
        this.f6371ri = (TextView) findViewById(2097610742);
        this.f6370lr = (ImageView) findViewById(2097610745);
        this.f6368ik = (C2371co) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.f6369ka = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.sf.1
            @Override // java.lang.Runnable
            public void run() {
                C2384sf.this.f6370lr.startAnimation(C2384sf.this.f6369ka);
                C2384sf.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.sf.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2384sf.this.f6368ik.m8210ri(4);
                    }
                }, 100L);
                C2384sf.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.sf.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C2384sf.this.f6368ik.m8210ri(4);
                    }
                }, 300L);
                C2384sf c2384sf = C2384sf.this;
                c2384sf.postDelayed(c2384sf.getHaloAnimation(), 1200L);
            }
        };
    }

    /* JADX INFO: renamed from: lr */
    public void m8264lr() {
        this.f6369ka.cancel();
    }

    /* JADX INFO: renamed from: ri */
    public void m8265ri() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.f6371ri;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
