package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2396qt extends AbstractC2393ka {

    /* JADX INFO: renamed from: di */
    private float f6424di;

    /* JADX INFO: renamed from: fi */
    private float f6425fi;

    /* JADX INFO: renamed from: ka */
    private ri f6426ka;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.qt$ri */
    private class ri {

        /* JADX INFO: renamed from: lr */
        private View f6429lr;

        public ri(View view) {
            this.f6429lr = view;
        }

        /* JADX INFO: renamed from: ri */
        public void m8302ri(int i) {
            if (!ViewHierarchyConstants.DIMENSION_TOP_KEY.equals(C2396qt.this.f6413lr.m8683ri())) {
                ViewGroup.LayoutParams layoutParams = this.f6429lr.getLayoutParams();
                layoutParams.height = i;
                this.f6429lr.setLayoutParams(layoutParams);
                this.f6429lr.requestLayout();
                return;
            }
            if (C2396qt.this.f6411ik instanceof ViewGroup) {
                for (int i2 = 0; i2 < ((ViewGroup) C2396qt.this.f6411ik).getChildCount(); i2++) {
                    ((ViewGroup) C2396qt.this.f6411ik).getChildAt(i2).setTranslationY(i - C2396qt.this.f6425fi);
                }
            }
            C2396qt.this.f6411ik.setTranslationY(C2396qt.this.f6425fi - i);
        }
    }

    public C2396qt(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        int i;
        String str;
        if ((this.f6411ik instanceof ImageView) && (this.f6411ik.getParent() instanceof AbstractC2412fi)) {
            this.f6411ik = (View) this.f6411ik.getParent();
        }
        this.f6411ik.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "alpha", 0.0f, 1.0f).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        this.f6426ka = new ri(this.f6411ik);
        final int i2 = this.f6411ik.getLayoutParams().height;
        this.f6425fi = i2;
        this.f6424di = this.f6411ik.getLayoutParams().width;
        if ("left".equals(this.f6413lr.m8683ri()) || "right".equals(this.f6413lr.m8683ri())) {
            i = (int) this.f6424di;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.f6426ka, str, 0, i).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        arrayList.add(m8297ri(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.qt.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C2396qt.this.f6426ka.m8302ri(i2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }
        });
        return arrayList;
    }
}
