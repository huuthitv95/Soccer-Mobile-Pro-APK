package com.bytedance.adsdk.ugeno.p090di.p092ri;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.adsdk.ugeno.p090di.C2250ka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2259ri extends LinearLayout {

    /* JADX INFO: renamed from: co */
    private String f5622co;

    /* JADX INFO: renamed from: di */
    private int f5623di;

    /* JADX INFO: renamed from: fi */
    private int f5624fi;

    /* JADX INFO: renamed from: ik */
    protected int f5625ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private List<View> f5626ka;

    /* JADX INFO: renamed from: lr */
    protected int f5627lr;

    /* JADX INFO: renamed from: mj */
    private boolean f5628mj;

    /* JADX INFO: renamed from: qt */
    private float f5629qt;

    /* JADX INFO: renamed from: ri */
    protected Context f5630ri;

    /* JADX INFO: renamed from: sf */
    private float f5631sf;
    private int xha;

    public AbstractC2259ri(Context context) {
        super(context);
        this.f5624fi = SupportMenu.CATEGORY_MASK;
        this.f5623di = -16776961;
        this.xha = 5;
        this.f5627lr = 40;
        this.f5625ik = 20;
        this.f5622co = "row";
        this.f5630ri = context;
        this.f5626ka = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m7529ka() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        float height2 = getHeight();
        float f = this.f5631sf;
        layoutParams.topMargin = (int) (((int) ((height * f) / 100.0f)) - ((height2 * f) / 100.0f));
        float f2 = this.f5629qt;
        layoutParams.leftMargin = (int) (((int) ((width * f2) / 100.0f)) - ((width2 * f2) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.f5626ka.size();
    }

    /* JADX INFO: renamed from: ik */
    public void m7531ik() {
        this.f5626ka.clear();
        removeAllViews();
    }

    /* JADX INFO: renamed from: lr */
    public abstract Drawable mo7528lr(int i);

    /* JADX INFO: renamed from: lr */
    public void m7532lr() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof C2258lr) {
            this.f5625ik = this.f5627lr;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f5627lr, this.f5625ik);
        if (getOrientation() == 1) {
            layoutParams.topMargin = this.xha;
            layoutParams.bottomMargin = this.xha;
        } else {
            layoutParams.leftMargin = this.xha;
            layoutParams.rightMargin = this.xha;
        }
        addView(view, layoutParams);
        view.setBackground(mo7528lr(this.f5623di));
        this.f5626ka.add(view);
    }

    /* JADX INFO: renamed from: ri */
    public void m7533ri() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.di.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                AbstractC2259ri.this.m7529ka();
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m7534ri(int i) {
        if (this instanceof C2258lr) {
            this.f5625ik = this.f5627lr;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f5627lr, this.f5625ik);
        if (getOrientation() == 1) {
            layoutParams.topMargin = this.xha;
            layoutParams.bottomMargin = this.xha;
        } else {
            layoutParams.leftMargin = this.xha;
            layoutParams.rightMargin = this.xha;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f5627lr, this.f5625ik);
        if (getOrientation() == 1) {
            layoutParams2.topMargin = this.xha;
            layoutParams2.bottomMargin = this.xha;
        } else {
            layoutParams2.leftMargin = this.xha;
            layoutParams2.rightMargin = this.xha;
        }
        int iM7474ri = C2250ka.m7474ri(this.f5628mj, this.jbs, this.f5626ka.size());
        int iM7474ri2 = C2250ka.m7474ri(this.f5628mj, i, this.f5626ka.size());
        if (this.f5626ka.size() == 0) {
            iM7474ri2 = 0;
        }
        if (!this.f5626ka.isEmpty() && C2250ka.m7475ri(iM7474ri, this.f5626ka) && C2250ka.m7475ri(iM7474ri2, this.f5626ka)) {
            this.f5626ka.get(iM7474ri).setBackground(mo7528lr(this.f5623di));
            this.f5626ka.get(iM7474ri).setLayoutParams(layoutParams2);
            this.f5626ka.get(iM7474ri2).setBackground(mo7528lr(this.f5624fi));
            this.f5626ka.get(iM7474ri2).setLayoutParams(layoutParams);
            this.jbs = i;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7535ri(int i, int i2) {
        Iterator<View> it = this.f5626ka.iterator();
        while (it.hasNext()) {
            it.next().setBackground(mo7528lr(this.f5623di));
        }
        if (i < 0 || i >= this.f5626ka.size()) {
            i = 0;
        }
        if (this.f5626ka.size() > 0) {
            this.f5626ka.get(i).setBackground(mo7528lr(this.f5624fi));
            this.jbs = i2;
        }
    }

    public void setIndicatorDirection(String str) {
        this.f5622co = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i) {
        this.f5625ik = i;
    }

    public void setIndicatorWidth(int i) {
        this.f5627lr = i;
    }

    public void setIndicatorX(float f) {
        this.f5629qt = f;
    }

    public void setIndicatorY(float f) {
        this.f5631sf = f;
    }

    public void setLoop(boolean z) {
        this.f5628mj = z;
    }

    public void setSelectedColor(int i) {
        this.f5624fi = i;
    }

    public void setUnSelectedColor(int i) {
        this.f5623di = i;
    }
}
