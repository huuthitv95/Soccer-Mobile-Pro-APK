package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2242qt {

    /* JADX INFO: renamed from: di */
    private int f5552di;

    /* JADX INFO: renamed from: fi */
    private int f5553fi;

    /* JADX INFO: renamed from: ik */
    private AnimatorSet f5554ik = new AnimatorSet();

    /* JADX INFO: renamed from: ka */
    private View f5555ka;

    /* JADX INFO: renamed from: lr */
    private C2243ri f5556lr;

    /* JADX INFO: renamed from: ri */
    Paint f5557ri;
    private String xha;

    public C2242qt(View view, C2243ri c2243ri) {
        this.f5555ka = view;
        this.f5556lr = c2243ri;
        Paint paint = new Paint();
        this.f5557ri = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: lr */
    public void m7389lr() {
        AnimatorSet animatorSet = this.f5554ik;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7390ri() {
        ArrayList arrayList = new ArrayList();
        List<C2243ri.ri> listM7399ik = this.f5556lr.m7399ik();
        if (listM7399ik == null || listM7399ik.size() <= 0) {
            return;
        }
        for (C2243ri.ri riVar : listM7399ik) {
            if (riVar != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(riVar.m7423ri());
                if (TextUtils.equals(riVar.m7411fi(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(riVar.m7411fi(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(riVar.m7411fi());
                }
                objectAnimator.setStartDelay(riVar.m7415ka());
                objectAnimator.setTarget(this.f5555ka);
                if (TextUtils.equals(riVar.m7411fi(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) riVar.m7410di(), (int) riVar.xha());
                    Log.d("UGenAnimation", "playAnimation: from = " + riVar.m7410di() + "; to=" + riVar.xha());
                } else {
                    objectAnimator.setFloatValues(riVar.m7410di(), riVar.xha());
                }
                int iM7401lr = (int) this.f5556lr.m7401lr();
                if (iM7401lr != 0) {
                    objectAnimator.setRepeatCount(iM7401lr);
                } else {
                    objectAnimator.setRepeatCount((int) riVar.m7417lr());
                }
                if (TextUtils.equals(riVar.m7411fi(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strM7397di = this.f5556lr.m7397di();
                if (TextUtils.isEmpty(strM7397di)) {
                    strM7397di = riVar.m7412ik();
                }
                if (TextUtils.equals(strM7397di, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (riVar.m7421mj() != null && riVar.m7421mj().length > 0) {
                    objectAnimator.setFloatValues(riVar.m7421mj());
                }
                if (TextUtils.equals(riVar.m7411fi(), "rotationX")) {
                    this.f5555ka.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.qt.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C2242qt.this.f5555ka.setPivotX(C2242qt.this.f5555ka.getWidth() / 2.0f);
                            C2242qt.this.f5555ka.setPivotY(C2242qt.this.f5555ka.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(riVar.m7411fi(), "ripple")) {
                    this.xha = riVar.m7422qt();
                }
                String strJbs = riVar.jbs();
                strJbs.hashCode();
                switch (strJbs) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.f5556lr.m7400ka() != 0) {
            this.f5554ik.setDuration(this.f5556lr.m7400ka());
        }
        this.f5554ik.setStartDelay(this.f5556lr.m7398fi());
        if (TextUtils.equals(this.f5556lr.m7404ri(), "sequentially")) {
            this.f5554ik.playSequentially(arrayList);
        } else {
            this.f5554ik.playTogether(arrayList);
        }
        this.f5554ik.start();
    }

    /* JADX INFO: renamed from: ri */
    public void m7391ri(int i, int i2) {
        this.f5553fi = i / 2;
        this.f5552di = i2 / 2;
    }

    /* JADX INFO: renamed from: ri */
    public void m7392ri(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.xha)) {
                return;
            }
            this.f5557ri.setColor(C2348ri.m8053ri(this.xha));
            this.f5557ri.setAlpha(90);
            ((ViewGroup) this.f5555ka.getParent()).setClipChildren(true);
            int i = this.f5553fi;
            int i2 = this.f5552di;
            canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * iAnimation.getRipple(), this.f5557ri);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }
}
