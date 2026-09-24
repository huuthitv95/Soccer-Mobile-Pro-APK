package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.p116fi.C2440sf;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.igq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2383ri extends TextSwitcher implements ViewSwitcher.ViewFactory, igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: aw */
    private int f6356aw;
    private Handler bgr;

    /* JADX INFO: renamed from: co */
    private int f6357co;

    /* JADX INFO: renamed from: di */
    private TextView f6358di;

    /* JADX INFO: renamed from: fi */
    private Context f6359fi;

    /* JADX INFO: renamed from: ik */
    private int f6360ik;
    private float jbs;

    /* JADX INFO: renamed from: ka */
    private final int f6361ka;

    /* JADX INFO: renamed from: lr */
    private List<String> f6362lr;

    /* JADX INFO: renamed from: mj */
    private int f6363mj;

    /* JADX INFO: renamed from: qt */
    private int f6364qt;

    /* JADX INFO: renamed from: ri */
    Animation.AnimationListener f6365ri;

    /* JADX INFO: renamed from: sf */
    private int f6366sf;
    private int xha;

    public C2383ri(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.f6362lr = new ArrayList();
        this.f6360ik = 0;
        this.f6361ka = 1;
        this.bgr = new igq(Looper.getMainLooper(), this);
        this.f6365ri = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.di.ri.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (C2383ri.this.f6358di != null) {
                    C2383ri.this.f6358di.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.f6359fi = context;
        this.f6363mj = i;
        this.jbs = f;
        this.f6364qt = i2;
        this.f6356aw = i3;
        m8256ik();
    }

    /* JADX INFO: renamed from: ik */
    private void m8256ik() {
        setFactory(this);
    }

    /* JADX INFO: renamed from: lr */
    public void m8258lr() {
        List<String> list = this.f6362lr;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.f6360ik;
        this.f6360ik = i + 1;
        this.f6366sf = i;
        setText(this.f6362lr.get(i));
        if (this.f6360ik > this.f6362lr.size() - 1) {
            this.f6360ik = 0;
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f6358di = textView;
        textView.setTextColor(this.f6363mj);
        this.f6358di.setTextSize(this.jbs);
        this.f6358di.setMaxLines(this.f6364qt);
        this.f6358di.setTextAlignment(this.f6356aw);
        return this.f6358di;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bgr.sendEmptyMessageDelayed(1, this.xha);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.bgr.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C2440sf.m8415lr(this.f6362lr.get(this.f6366sf), this.jbs, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8259ri() {
        int i = this.f6357co;
        if (i == 1) {
            setInAnimation(getContext(), C2729uq.jbs(this.f6359fi, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), C2729uq.jbs(this.f6359fi, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), C2729uq.jbs(this.f6359fi, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), C2729uq.jbs(this.f6359fi, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.f6365ri);
            getOutAnimation().setAnimationListener(this.f6365ri);
        }
        this.bgr.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        if (message.what != 1) {
            return;
        }
        m8258lr();
        this.bgr.sendEmptyMessageDelayed(1, this.xha);
    }

    public void setAnimationDuration(int i) {
        this.xha = i;
    }

    public void setAnimationText(List<String> list) {
        this.f6362lr = list;
    }

    public void setAnimationType(int i) {
        this.f6357co = i;
    }

    public void setMaxLines(int i) {
        this.f6364qt = i;
    }

    public void setTextColor(int i) {
        this.f6363mj = i;
    }

    public void setTextSize(float f) {
        this.jbs = f;
    }
}
