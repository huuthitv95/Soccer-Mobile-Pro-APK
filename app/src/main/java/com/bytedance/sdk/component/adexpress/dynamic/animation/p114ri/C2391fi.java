package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2391fi extends AbstractC2393ka {
    public C2391fi(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    /* JADX INFO: renamed from: ik */
    private void m8288ik(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "translationY", 0.0f, -xha.m8833ri(C2490ka.m8811ri(), this.f6413lr.m8656ac())).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.fi.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C2391fi.this.f6411ik.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(m8297ri(duration));
    }

    /* JADX INFO: renamed from: ka */
    private void m8289ka(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "translationY", 0.0f, -xha.m8833ri(C2490ka.m8811ri(), this.f6413lr.m8656ac())).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(m8297ri(duration));
    }

    /* JADX INFO: renamed from: lr */
    private void m8290lr(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "translationY", 0.0f, -xha.m8833ri(C2490ka.m8811ri(), this.f6413lr.m8656ac())).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.fi.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C2391fi.this.f6411ik.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(m8297ri(duration));
    }

    /* JADX INFO: renamed from: ri */
    private void m8291ri(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "translationY", 0.0f, -xha.m8833ri(C2490ka.m8811ri(), this.f6413lr.m8656ac())).setDuration(((int) (this.f6413lr.m8682qt() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        this.f6413lr.m8661di(this.f6413lr.m8689vr() * 2);
        list.add(m8297ri(duration));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        byte b;
        ArrayList arrayList = new ArrayList();
        switch (this.f6413lr.ihz()) {
            case "both":
                b = 0;
                break;
            case "none":
                b = 3;
                break;
            case "forwards":
                b = 1;
                break;
            case "backwards":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            m8291ri(arrayList);
            return arrayList;
        }
        if (b == 1) {
            m8289ka(arrayList);
            return arrayList;
        }
        if (b != 2) {
            m8288ik(arrayList);
            return arrayList;
        }
        m8290lr(arrayList);
        return arrayList;
    }
}
