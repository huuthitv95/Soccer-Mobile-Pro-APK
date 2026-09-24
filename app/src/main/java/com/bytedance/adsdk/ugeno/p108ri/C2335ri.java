package com.bytedance.adsdk.ugeno.p108ri;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri;
import com.bytedance.adsdk.ugeno.p108ri.p109lr.C2330ik;
import com.bytedance.adsdk.ugeno.p108ri.p109lr.C2331ka;
import com.bytedance.adsdk.ugeno.p108ri.p109lr.C2332lr;
import com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2335ri extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: di */
    private int f6048di = 1;

    /* JADX INFO: renamed from: fi */
    private int f6049fi;

    /* JADX INFO: renamed from: ik */
    private ValueAnimator f6050ik;
    private InterfaceC2329lr jbs;

    /* JADX INFO: renamed from: ka */
    private Context f6051ka;

    /* JADX INFO: renamed from: lr */
    private C2327ik f6052lr;

    /* JADX INFO: renamed from: mj */
    private String f6053mj;

    /* JADX INFO: renamed from: ri */
    private AbstractViewOnTouchListenerC2318ik f6054ri;
    private AbstractC2340ri xha;

    public C2335ri(Context context, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, C2327ik c2327ik) {
        this.f6054ri = abstractViewOnTouchListenerC2318ik;
        this.f6052lr = c2327ik;
        this.f6051ka = context;
    }

    /* JADX INFO: renamed from: fi */
    public String m8004fi() {
        return this.f6053mj;
    }

    /* JADX INFO: renamed from: ik */
    public void m8005ik() {
        ValueAnimator valueAnimator = this.f6050ik;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ka */
    public ValueAnimator m8006ka() {
        AbstractC2333ri c2330ik;
        C2327ik c2327ik = this.f6052lr;
        if (c2327ik == null || this.f6054ri == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapM7968lr = c2327ik.m7968lr();
        ArrayList arrayList = new ArrayList();
        if (mapM7968lr != null && !mapM7968lr.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapM7968lr.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String strM7960ik = EnumC2326fi.m7959ri(key).m7960ik();
                    strM7960ik.hashCode();
                    switch (strM7960ik) {
                        case "int":
                            c2330ik = new C2330ik(this.f6051ka, this.f6054ri, key, entry.getValue());
                            break;
                        case "float":
                            c2330ik = new C2332lr(this.f6051ka, this.f6054ri, key, entry.getValue());
                            break;
                        case "point":
                            c2330ik = new C2331ka(this.f6051ka, this.f6054ri, key, entry.getValue());
                            break;
                        default:
                            c2330ik = null;
                            break;
                    }
                    if (c2330ik != null) {
                        arrayList.addAll(c2330ik.mo7993fi());
                    }
                }
            }
        }
        JSONObject jSONObjectM7974ri = this.f6052lr.m7974ri();
        if (jSONObjectM7974ri != null) {
            AbstractC2340ri abstractC2340riM8024ri = AbstractC2340ri.ri.m8024ri(this.f6054ri, jSONObjectM7974ri);
            this.xha = abstractC2340riM8024ri;
            if (abstractC2340riM8024ri != null) {
                arrayList.addAll(abstractC2340riM8024ri.mo8014ik());
            }
        }
        final View viewM7879sf = this.f6054ri.m7879sf();
        if (viewM7879sf == null) {
            return null;
        }
        final C2327ik.ri riVarXha = this.f6052lr.xha();
        if (riVarXha != null) {
            viewM7879sf.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewM7879sf.getWidth();
                    int height = viewM7879sf.getHeight();
                    viewM7879sf.setPivotX(C2328ka.m7986ri(riVarXha.f6032ri, width));
                    viewM7879sf.setPivotY(C2328ka.m7986ri(riVarXha.f6031lr, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewM7879sf, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.f6049fi = C2328ka.m7984ri(this.f6052lr.m7967ka());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.f6052lr.m7965ik());
        int i = this.f6049fi;
        if (i != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i);
        }
        this.f6048di = this.f6052lr.m7973qt();
        this.f6053mj = this.f6052lr.jbs();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.f6052lr.m7963di());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(C2328ka.m7985ri(this.f6052lr.m7964fi()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(C2328ka.m7982lr(this.f6052lr.m7972mj()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.f6050ik = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: lr */
    public void m8007lr() {
        ValueAnimator valueAnimator = this.f6050ik;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m8008lr(Canvas canvas) {
        AbstractC2340ri abstractC2340ri = this.xha;
        if (abstractC2340ri != null) {
            abstractC2340ri.mo8016lr(canvas);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        InterfaceC2329lr interfaceC2329lr = this.jbs;
        if (interfaceC2329lr != null) {
            interfaceC2329lr.mo7793lr();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        InterfaceC2329lr interfaceC2329lr = this.jbs;
        if (interfaceC2329lr != null) {
            interfaceC2329lr.mo7794ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8009ri() {
        ValueAnimator valueAnimator = this.f6050ik;
        if (valueAnimator == null || this.f6048di == 0 || this.f6049fi == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ri */
    public void m8010ri(int i, int i2) {
        AbstractC2340ri abstractC2340ri = this.xha;
        if (abstractC2340ri != null) {
            abstractC2340ri.mo8017ri(i, i2);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8011ri(Canvas canvas) {
        AbstractC2340ri abstractC2340ri = this.xha;
        if (abstractC2340ri != null) {
            abstractC2340ri.mo8018ri(canvas);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8012ri(InterfaceC2329lr interfaceC2329lr) {
        this.jbs = interfaceC2329lr;
    }
}
