package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import com.bytedance.sdk.component.adexpress.p124ka.C2495ka;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2393ka implements dzy {

    /* JADX INFO: renamed from: ik */
    public View f6411ik;

    /* JADX INFO: renamed from: lr */
    C2477ri f6413lr;

    /* JADX INFO: renamed from: ka */
    private Set<ScheduledFuture<?>> f6412ka = new HashSet();

    /* JADX INFO: renamed from: ri */
    public List<ObjectAnimator> f6414ri = mo8287ri();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka$ri */
    public class ri implements Runnable {

        /* JADX INFO: renamed from: lr */
        ScheduledFuture<?> f6420lr;

        /* JADX INFO: renamed from: ri */
        ObjectAnimator f6421ri;

        ri(ObjectAnimator objectAnimator) {
            this.f6421ri = objectAnimator;
        }

        /* JADX INFO: renamed from: ri */
        public void m8298ri(ScheduledFuture<?> scheduledFuture) {
            this.f6420lr = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2531ri.m9163ri().m9166ik() != null) {
                C2531ri.m9163ri().m9166ik().mo9149ik().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka.ri.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ri.this.f6421ri.resume();
                    }
                });
                if (this.f6420lr != null) {
                    AbstractC2393ka.this.f6412ka.remove(this.f6420lr);
                }
            }
        }
    }

    public AbstractC2393ka(View view, C2477ri c2477ri) {
        this.f6411ik = view;
        this.f6413lr = c2477ri;
    }

    /* JADX INFO: renamed from: ik */
    public void m8295ik() {
        List<ObjectAnimator> list = this.f6414ri;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.f6413lr.m8658bu() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        ri riVar = AbstractC2393ka.this.new ri(objectAnimator);
                        ScheduledFuture<?> scheduledFutureM8820ri = C2495ka.m8820ri(riVar, (long) (AbstractC2393ka.this.f6413lr.m8658bu() * 1000.0d), TimeUnit.MILLISECONDS);
                        riVar.m8298ri(scheduledFutureM8820ri);
                        AbstractC2393ka.this.f6412ka.add(scheduledFutureM8820ri);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    /* JADX INFO: renamed from: lr */
    public void mo8296lr() {
        List<ObjectAnimator> list = this.f6414ri;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.f6412ka.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    /* JADX INFO: renamed from: ri */
    ObjectAnimator m8297ri(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f6413lr.bgr() * 1000.0d));
        if (this.f6413lr.m8689vr() > 0) {
            objectAnimator.setRepeatCount(this.f6413lr.m8689vr() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.f6413lr.slm())) {
            if ("alternate".equals(this.f6413lr.slm()) || "alternate-reverse".equals(this.f6413lr.slm())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f6413lr.m8657aw())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f6413lr.slm())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f6413lr.slm())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    AbstractC2393ka.this.f6411ik.setVisibility(0);
                    if (AbstractC2393ka.this.f6411ik.getParent() instanceof C2410di) {
                        ((View) AbstractC2393ka.this.f6411ik.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    /* JADX INFO: renamed from: ri */
    abstract List<ObjectAnimator> mo8287ri();
}
