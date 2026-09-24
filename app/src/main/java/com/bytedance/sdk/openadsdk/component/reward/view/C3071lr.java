package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3071lr extends C3192ik {

    /* JADX INFO: renamed from: di */
    private AbstractC2859mj f9629di;

    /* JADX INFO: renamed from: fi */
    private float f9630fi;

    /* JADX INFO: renamed from: ik */
    private C3192ik f9631ik;

    /* JADX INFO: renamed from: ka */
    private float f9632ka;

    /* JADX INFO: renamed from: lr */
    private final boolean f9633lr;

    /* JADX INFO: renamed from: ri */
    private final boolean f9634ri;
    private boolean xha;

    public C3071lr(Context context, boolean z, boolean z2, final int i) {
        super(context);
        this.f9634ri = z;
        this.f9633lr = z2;
        if (z) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lr.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.f9631ik = new C3192ik(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f9631ik, layoutParams);
        this.f9631ik.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lr.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
            }
        });
        this.f9631ik.setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AbstractC2859mj abstractC2859mj;
        C3022ri c3022riMo10787ay;
        super.onAttachedToWindow();
        if (this.xha || (abstractC2859mj = this.f9629di) == null || (c3022riMo10787ay = abstractC2859mj.mo10787ay()) == null) {
            return;
        }
        c3022riMo10787ay.f9402su.m11991lr(true);
        this.xha = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AbstractC2859mj abstractC2859mj;
        C3022ri c3022riMo10787ay;
        super.onDetachedFromWindow();
        if (!this.xha || (abstractC2859mj = this.f9629di) == null || (c3022riMo10787ay = abstractC2859mj.mo10787ay()) == null) {
            return;
        }
        c3022riMo10787ay.f9402su.m11991lr(false);
        this.xha = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p217di.C3192ik, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f9633lr) {
            float f = this.f9632ka;
            if (f > 0.0f) {
                int iMax = Math.max(0, (size - ((int) (size2 * f))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f2 = this.f9630fi;
                if (f2 > 0.0f) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f2))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.f9634ri) {
            float f3 = this.f9632ka;
            if (f3 > 0.0f) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f3), 1073741824);
            } else {
                float f4 = this.f9630fi;
                if (f4 > 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f4), 1073741824);
                }
            }
        } else {
            float f5 = this.f9632ka;
            if (f5 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f5))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f6 = this.f9630fi;
                if (f6 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f6))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        AbstractC2859mj abstractC2859mj;
        C3022ri c3022riMo10787ay;
        super.onWindowFocusChanged(z);
        if (this.xha == z || (abstractC2859mj = this.f9629di) == null || (c3022riMo10787ay = abstractC2859mj.mo10787ay()) == null) {
            return;
        }
        c3022riMo10787ay.f9402su.m11991lr(z);
    }

    /* JADX INFO: renamed from: ri */
    public void m12292ri() {
        C3192ik c3192ik = this.f9631ik;
        if (c3192ik != null) {
            c3192ik.removeAllViews();
        } else {
            removeAllViews();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12293ri(C3072mj c3072mj, FrameLayout.LayoutParams layoutParams) {
        C3192ik c3192ik = this.f9631ik;
        if (c3192ik != null) {
            c3192ik.addView(c3072mj, layoutParams);
        } else {
            addView(c3072mj, layoutParams);
        }
    }

    public void setScene(AbstractC2859mj abstractC2859mj) {
        this.f9629di = abstractC2859mj;
    }

    public void setWidthAndHeightRatio(float f) {
        this.f9632ka = f;
    }

    public void setWidthOrHeightInParentRatio(float f) {
        this.f9630fi = f;
    }
}
