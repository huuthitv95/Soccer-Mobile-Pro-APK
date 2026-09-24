package com.mbridge.msdk.video.dynview.p292ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.util.draw.C13977a;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.b */
/* JADX INFO: compiled from: MBridgeUIAnim.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13975b {

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.b$a */
    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f40067a;

        a(View view) {
            this.f40067a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view = this.f40067a;
            if (view == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).removeAllViews();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f40067a;
            if (view == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).removeAllViews();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.b$b */
    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f40069a;

        b(List list) {
            this.f40069a = list;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            List list = this.f40069a;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (View view : this.f40069a) {
                if (view != null) {
                    view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    view.requestLayout();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.b$c */
    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f40071a;

        c(View view) {
            this.f40071a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f40071a;
            if (view != null) {
                view.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f40071a.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.b$d */
    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f40073a;

        d(View view) {
            this.f40073a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f40073a;
            if (view != null) {
                view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f40073a.requestLayout();
                if (this.f40073a.getVisibility() != 0) {
                    this.f40073a.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.b$e */
    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f40075a;

        e(View view) {
            this.f40075a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f40075a.getLayoutParams();
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f40075a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.b$f */
    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    class f implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f40077a;

        f(View view) {
            this.f40077a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f40077a.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f40077a.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: a */
    private ObjectAnimator m41841a(View view, float f2, float f3, float f4, long j) {
        return ObjectAnimator.ofPropertyValuesHolder(view, m41845b(View.SCALE_X, f2), m41845b(View.SCALE_Y, f3), m41846c(View.ROTATION_X, f4)).setDuration(j);
    }

    /* JADX INFO: renamed from: a */
    private ObjectAnimator m41842a(View view, float f2, float f3, long j) {
        return ObjectAnimator.ofPropertyValuesHolder(view, m41843a(View.SCALE_X, f2), m41843a(View.SCALE_Y, f3)).setDuration(j);
    }

    /* JADX INFO: renamed from: a */
    private PropertyValuesHolder m41843a(Property property, float f2) {
        float f3 = f2 - 0.4f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f2), Keyframe.ofFloat(0.1f, f3), Keyframe.ofFloat(0.2f, f3), Keyframe.ofFloat(0.3f, f2), Keyframe.ofFloat(0.4f, f2), Keyframe.ofFloat(0.5f, f2), Keyframe.ofFloat(0.6f, f2), Keyframe.ofFloat(0.7f, f2), Keyframe.ofFloat(0.8f, f2), Keyframe.ofFloat(0.9f, f2), Keyframe.ofFloat(1.0f, f2));
    }

    /* JADX INFO: renamed from: a */
    private void m41844a(View view, int i, int i2, long j) {
        ValueAnimator valueAnimatorOfInt = view.getLayoutParams().width == 0 ? ValueAnimator.ofInt(i, i2) : ValueAnimator.ofInt(i2, i);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new e(view));
        ValueAnimator valueAnimatorOfFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new f(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: b */
    private PropertyValuesHolder m41845b(Property property, float f2) {
        float f3 = f2 - 0.2f;
        float f4 = f2 + 0.3f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f2), Keyframe.ofFloat(0.1f, f2 - 0.4f), Keyframe.ofFloat(0.2f, f3), Keyframe.ofFloat(0.3f, f4), Keyframe.ofFloat(0.4f, f3), Keyframe.ofFloat(0.5f, f4), Keyframe.ofFloat(0.6f, f2 - 0.1f), Keyframe.ofFloat(0.7f, f4), Keyframe.ofFloat(0.8f, f2), Keyframe.ofFloat(0.9f, 0.1f + f2), Keyframe.ofFloat(1.0f, f2));
    }

    /* JADX INFO: renamed from: c */
    private PropertyValuesHolder m41846c(Property property, float f2) {
        float f3 = (-2.0f) * f2;
        float f4 = f2 * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f3), Keyframe.ofFloat(0.2f, f3), Keyframe.ofFloat(0.3f, f4), Keyframe.ofFloat(0.4f, f3), Keyframe.ofFloat(0.5f, f4), Keyframe.ofFloat(0.6f, f3), Keyframe.ofFloat(0.7f, f4), Keyframe.ofFloat(0.8f, f3), Keyframe.ofFloat(0.9f, f4), Keyframe.ofFloat(1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: a */
    public ObjectAnimator m41847a(View view) {
        ObjectAnimator objectAnimatorM41848a = m41848a(view, 2.0f, 1000L);
        objectAnimatorM41848a.setRepeatCount(-1);
        return objectAnimatorM41848a;
    }

    /* JADX INFO: renamed from: a */
    public ObjectAnimator m41848a(View view, float f2, long j) {
        return ObjectAnimator.ofPropertyValuesHolder(view, m41846c(View.ROTATION, f2)).setDuration(j);
    }

    /* JADX INFO: renamed from: a */
    public void m41849a(View view, int i, int i2, int i3, int i4, long j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new c(view));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i3, i4);
        valueAnimatorOfInt2.addUpdateListener(new d(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.setDuration(j);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: a */
    public void m41850a(View view, long j) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(j);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41851a(List<View> list, int i, int i2, long j) {
        ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(j);
        duration.addUpdateListener(new b(list));
        duration.start();
    }

    /* JADX INFO: renamed from: a */
    public void m41852a(Map<String, Bitmap> map, C13942c c13942c, View view) {
        if (view != null) {
            C13977a.m41865a().m41867a(map, c13942c, view);
        }
    }

    /* JADX INFO: renamed from: b */
    public ObjectAnimator m41853b(View view) {
        ObjectAnimator objectAnimatorM41841a = m41841a(view, 1.0f, 1.0f, 5.0f, 2000L);
        objectAnimatorM41841a.setRepeatCount(-1);
        return objectAnimatorM41841a;
    }

    /* JADX INFO: renamed from: b */
    public void m41854b(View view, long j) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(j).setListener(new a(view));
        }
    }

    /* JADX INFO: renamed from: c */
    public ObjectAnimator m41855c(View view) {
        ObjectAnimator objectAnimatorM41842a = m41842a(view, 1.0f, 1.0f, 2000L);
        objectAnimatorM41842a.setRepeatCount(-1);
        return objectAnimatorM41842a;
    }

    /* JADX INFO: renamed from: c */
    public void m41856c(View view, long j) {
        if (view == null) {
            return;
        }
        m41844a(view, 0, C13229v0.m37930g(view.getContext().getApplicationContext()), j);
    }
}
