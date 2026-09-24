package com.bytedance.adsdk.ugeno.yoga.p111lr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p106lr.InterfaceC2319lr;
import com.bytedance.adsdk.ugeno.p108ri.C2334mj;
import com.bytedance.adsdk.ugeno.p108ri.xha;
import com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt;
import com.bytedance.adsdk.ugeno.yoga.AbstractC2363sf;
import com.bytedance.adsdk.ugeno.yoga.EnumC2349aw;
import com.bytedance.adsdk.ugeno.yoga.EnumC2351di;
import com.bytedance.adsdk.ugeno.yoga.EnumC2352fi;
import com.bytedance.adsdk.ugeno.yoga.EnumC2353ik;
import com.bytedance.adsdk.ugeno.yoga.EnumC2354ka;
import com.bytedance.adsdk.ugeno.yoga.EnumC2359mj;
import com.bytedance.adsdk.ugeno.yoga.EnumC2361ri;
import com.bytedance.adsdk.ugeno.yoga.bgr;
import com.bytedance.adsdk.ugeno.yoga.jbs;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2356ik extends ViewGroup implements InterfaceC2319lr, xha {

    /* JADX INFO: renamed from: ik */
    private InterfaceC2282ka f6155ik;

    /* JADX INFO: renamed from: ka */
    private C2334mj f6156ka;

    /* JADX INFO: renamed from: lr */
    private final AbstractC2360qt f6157lr;

    /* JADX INFO: renamed from: ri */
    private final Map<View, AbstractC2360qt> f6158ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.lr.ik$lr */
    public static class lr implements com.bytedance.adsdk.ugeno.yoga.xha {
        /* JADX INFO: renamed from: ri */
        private int m8134ri(EnumC2359mj enumC2359mj) {
            if (enumC2359mj == EnumC2359mj.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return enumC2359mj == EnumC2359mj.EXACTLY ? 1073741824 : 0;
        }

        @Override // com.bytedance.adsdk.ugeno.yoga.xha
        /* JADX INFO: renamed from: ri */
        public long mo8135ri(AbstractC2360qt abstractC2360qt, float f, EnumC2359mj enumC2359mj, float f2, EnumC2359mj enumC2359mj2) {
            View view = (View) abstractC2360qt.mo8080qt();
            if (view == null || (view instanceof C2356ik)) {
                return jbs.m8120ri(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f, m8134ri(enumC2359mj)), View.MeasureSpec.makeMeasureSpec((int) f2, m8134ri(enumC2359mj2)));
            return jbs.m8120ri(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.lr.ik$ri */
    public static class ri extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: aw */
        private float f6159aw;
        private float bgr;

        /* JADX INFO: renamed from: bu */
        private float f6160bu;

        /* JADX INFO: renamed from: co */
        private float f6161co;

        /* JADX INFO: renamed from: di */
        private float f6162di;

        /* JADX INFO: renamed from: fi */
        private float f6163fi;

        /* JADX INFO: renamed from: ik */
        private float f6164ik;
        private float jbs;

        /* JADX INFO: renamed from: ka */
        private float f6165ka;

        /* JADX INFO: renamed from: lr */
        SparseArray<String> f6166lr;

        /* JADX INFO: renamed from: mj */
        private float f6167mj;

        /* JADX INFO: renamed from: nr */
        private float f6168nr;

        /* JADX INFO: renamed from: qt */
        private float f6169qt;

        /* JADX INFO: renamed from: ri */
        SparseArray<Float> f6170ri;

        /* JADX INFO: renamed from: sf */
        private float f6171sf;
        private float slm;
        private float tan;

        /* JADX INFO: renamed from: vr */
        private float f6172vr;
        private float xha;

        public ri(int i, int i2) {
            super(i, i2);
            this.f6170ri = new SparseArray<>();
            this.f6166lr = new SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.f6170ri.put(15, Float.valueOf(i));
            }
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.f6170ri.put(16, Float.valueOf(i2));
            }
        }

        public ri(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof ri) {
                ri riVar = (ri) layoutParams;
                this.f6170ri = riVar.f6170ri.clone();
                this.f6166lr = riVar.f6166lr.clone();
                return;
            }
            this.f6170ri = new SparseArray<>();
            this.f6166lr = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.f6170ri.put(15, Float.valueOf(this.width));
            }
            if (layoutParams.height >= 0) {
                this.f6170ri.put(16, Float.valueOf(this.height));
            }
        }

        /* JADX INFO: renamed from: aw */
        public void m8136aw(float f) {
            this.f6163fi = f;
            this.f6170ri.put(19, Float.valueOf(f));
        }

        public void bgr(float f) {
            this.f6162di = f;
            this.f6170ri.put(20, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: bu */
        public void m8137bu(float f) {
            this.tan = f;
            this.f6170ri.put(28, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: co */
        public void m8138co(float f) {
            this.f6165ka = f;
            this.f6170ri.put(18, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: di */
        public void m8139di(float f) {
            this.f6161co = f;
            this.f6170ri.put(14, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: fi */
        public void m8140fi(float f) {
            this.f6171sf = f;
            this.f6170ri.put(9, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: ik */
        public void m8141ik(float f) {
            this.jbs = f;
            this.f6170ri.put(7, Float.valueOf(f));
        }

        public void jbs(float f) {
            this.f6172vr = f;
            this.f6170ri.put(12, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: ka */
        public void m8142ka(float f) {
            this.f6169qt = f;
            this.f6170ri.put(8, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: lr */
        public void m8143lr(float f) {
            this.f6167mj = f;
            this.f6170ri.put(6, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: mj */
        public void m8144mj(float f) {
            this.bgr = f;
            this.f6170ri.put(11, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: qt */
        public void m8145qt(float f) {
            this.slm = f;
            this.f6170ri.put(13, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: ri */
        public void m8146ri(float f) {
            this.xha = f;
            this.f6170ri.put(5, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: sf */
        public void m8147sf(float f) {
            this.f6164ik = f;
            this.f6170ri.put(17, Float.valueOf(f));
        }

        public void slm(float f) {
            this.f6168nr = f;
            this.f6170ri.put(27, Float.valueOf(f));
        }

        /* JADX INFO: renamed from: vr */
        public void m8148vr(float f) {
            this.f6160bu = f;
            this.f6170ri.put(25, Float.valueOf(f));
        }

        public void xha(float f) {
            this.f6159aw = f;
            this.f6170ri.put(10, Float.valueOf(f));
        }
    }

    public C2356ik(Context context) {
        this(context, null, 0);
    }

    public C2356ik(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6156ka = new C2334mj(this);
        AbstractC2360qt abstractC2360qtM8177ri = AbstractC2363sf.m8177ri();
        this.f6157lr = abstractC2360qtM8177ri;
        this.f6158ri = new HashMap();
        abstractC2360qtM8177ri.mo8096ri(this);
        abstractC2360qtM8177ri.mo8095ri((com.bytedance.adsdk.ugeno.yoga.xha) new lr());
        m8127ri((ri) generateDefaultLayoutParams(), abstractC2360qtM8177ri, this);
    }

    /* JADX INFO: renamed from: lr */
    private void m8124lr(AbstractC2360qt abstractC2360qt, int i) {
        if (i == -1) {
            abstractC2360qt.xha(100.0f);
        } else if (i == -2) {
            abstractC2360qt.mo8063fi();
        } else {
            abstractC2360qt.mo8062di(i);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m8125ri(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.f6157lr.mo8062di(size2);
        }
        if (mode == 1073741824) {
            this.f6157lr.mo8072ka(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f6157lr.mo8099sf(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f6157lr.mo8081qt(size);
        }
        this.f6157lr.mo8086ri(Float.NaN, Float.NaN);
    }

    /* JADX INFO: renamed from: ri */
    private void m8126ri(View view, boolean z) {
        try {
            AbstractC2360qt abstractC2360qt = this.f6158ri.get(view);
            if (abstractC2360qt == null) {
                return;
            }
            AbstractC2360qt abstractC2360qtMo8073lr = abstractC2360qt.mo8073lr();
            for (int i = 0; i < abstractC2360qtMo8073lr.mo8082ri(); i++) {
                if (abstractC2360qtMo8073lr.mo8084ri(i).equals(abstractC2360qt)) {
                    abstractC2360qtMo8073lr.mo8074lr(i);
                    break;
                }
            }
            abstractC2360qt.mo8096ri((Object) null);
            this.f6158ri.remove(view);
            if (z) {
                this.f6157lr.mo8086ri(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    protected static void m8127ri(ri riVar, AbstractC2360qt abstractC2360qt, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            abstractC2360qt.mo8091ri(EnumC2353ik.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                abstractC2360qt.mo8076lr(EnumC2354ka.LEFT, rect.left);
                abstractC2360qt.mo8076lr(EnumC2354ka.TOP, rect.top);
                abstractC2360qt.mo8076lr(EnumC2354ka.RIGHT, rect.right);
                abstractC2360qt.mo8076lr(EnumC2354ka.BOTTOM, rect.bottom);
            }
        }
        for (int i = 0; i < riVar.f6170ri.size(); i++) {
            int iKeyAt = riVar.f6170ri.keyAt(i);
            float fFloatValue = riVar.f6170ri.valueAt(i).floatValue();
            if (iKeyAt == 4) {
                abstractC2360qt.mo8069ik(EnumC2361ri.m8174ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                abstractC2360qt.mo8094ri(EnumC2361ri.m8174ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                abstractC2360qt.mo8077lr(EnumC2361ri.m8174ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                abstractC2360qt.mo8059co(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    abstractC2360qt.mo8066ik();
                } else {
                    abstractC2360qt.mo8067ik(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                abstractC2360qt.mo8090ri(EnumC2352fi.m8114ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                abstractC2360qt.mo8085ri(fFloatValue);
            } else if (iKeyAt == 7) {
                abstractC2360qt.mo8075lr(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    abstractC2360qt.xha(100.0f);
                } else if (fFloatValue == -2.0f) {
                    abstractC2360qt.mo8063fi();
                } else {
                    abstractC2360qt.mo8062di(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                abstractC2360qt.mo8092ri(EnumC2354ka.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                abstractC2360qt.mo8089ri(EnumC2351di.m8110ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                abstractC2360qt.mo8092ri(EnumC2354ka.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                abstractC2360qt.mo8092ri(EnumC2354ka.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                abstractC2360qt.mo8092ri(EnumC2354ka.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                abstractC2360qt.jbs(fFloatValue);
            } else if (iKeyAt == 27) {
                abstractC2360qt.mo8079mj(fFloatValue);
            } else if (iKeyAt == 22) {
                abstractC2360qt.mo8076lr(EnumC2354ka.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                abstractC2360qt.mo8076lr(EnumC2354ka.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                abstractC2360qt.mo8076lr(EnumC2354ka.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                abstractC2360qt.mo8076lr(EnumC2354ka.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                abstractC2360qt.mo8068ik(EnumC2354ka.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                abstractC2360qt.mo8068ik(EnumC2354ka.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                abstractC2360qt.mo8068ik(EnumC2354ka.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                abstractC2360qt.mo8068ik(EnumC2354ka.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                abstractC2360qt.mo8087ri(EnumC2349aw.m8101ri(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    abstractC2360qt.mo8064fi(100.0f);
                } else if (fFloatValue == -2.0f) {
                    abstractC2360qt.mo8071ka();
                } else {
                    abstractC2360qt.mo8072ka(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                abstractC2360qt.mo8088ri(bgr.m8105ri(Math.round(fFloatValue)));
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m8128ri(AbstractC2360qt abstractC2360qt) {
        if (abstractC2360qt.mo8073lr() != null) {
            m8128ri(abstractC2360qt.mo8073lr());
        } else {
            abstractC2360qt.mo8086ri(Float.NaN, Float.NaN);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m8129ri(AbstractC2360qt abstractC2360qt, float f, float f2) {
        View view = (View) abstractC2360qt.mo8080qt();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(abstractC2360qt.mo8061di() + f);
            int iRound2 = Math.round(abstractC2360qt.xha() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(abstractC2360qt.mo8078mj()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(abstractC2360qt.jbs()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iMo8082ri = abstractC2360qt.mo8082ri();
        for (int i = 0; i < iMo8082ri; i++) {
            if (equals(view)) {
                m8129ri(abstractC2360qt.mo8084ri(i), f, f2);
            } else if (!(view instanceof C2356ik)) {
                m8129ri(abstractC2360qt.mo8084ri(i), abstractC2360qt.mo8061di() + f, abstractC2360qt.xha() + f2);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m8130ri(AbstractC2360qt abstractC2360qt, int i) {
        if (i == -1) {
            abstractC2360qt.mo8064fi(100.0f);
        } else if (i == -2) {
            abstractC2360qt.mo8071ka();
        } else {
            abstractC2360qt.mo8072ka(i);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC2360qt abstractC2360qtM8177ri;
        this.f6157lr.mo8095ri((com.bytedance.adsdk.ugeno.yoga.xha) null);
        if (view instanceof C2357lr) {
            throw null;
        }
        super.addView(view, i, layoutParams);
        if (this.f6158ri.containsKey(view)) {
            return;
        }
        if (view instanceof C2356ik) {
            abstractC2360qtM8177ri = ((C2356ik) view).getYogaNode();
        } else {
            abstractC2360qtM8177ri = this.f6158ri.containsKey(view) ? this.f6158ri.get(view) : AbstractC2363sf.m8177ri();
            abstractC2360qtM8177ri.mo8096ri(view);
            abstractC2360qtM8177ri.mo8095ri((com.bytedance.adsdk.ugeno.yoga.xha) new lr());
        }
        m8127ri((ri) view.getLayoutParams(), abstractC2360qtM8177ri, view);
        this.f6158ri.put(view, abstractC2360qtM8177ri);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.f6157lr.mo8082ri()));
        } else {
            AbstractC2360qt abstractC2360qt = this.f6157lr;
            abstractC2360qt.mo8093ri(abstractC2360qtM8177ri, abstractC2360qt.mo8082ri());
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ri;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        InterfaceC2282ka interfaceC2282ka = this.f6155ik;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7736lr(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ri(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ri(layoutParams);
    }

    public float getBorderRadius() {
        return this.f6156ka.m8001ri();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getRipple() {
        return this.f6156ka.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getRubIn() {
        return this.f6156ka.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getShine() {
        return this.f6156ka.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.xha
    public float getStretch() {
        return this.f6156ka.getStretch();
    }

    public AbstractC2360qt getYogaNode() {
        return this.f6157lr;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.InterfaceC2319lr
    /* JADX INFO: renamed from: ik */
    public void mo7887ik(View view, int i) {
        m8131ka(view, i);
    }

    /* JADX INFO: renamed from: ka */
    public void m8131ka(View view, int i) {
        int iMo8083ri;
        view.setVisibility(i);
        try {
            AbstractC2360qt abstractC2360qt = this.f6158ri.get(view);
            Object tag = view.getTag(151060224);
            if (i != 0) {
                if (i != 8 || (iMo8083ri = this.f6157lr.mo8083ri(abstractC2360qt)) == -1) {
                    return;
                }
                this.f6157lr.mo8074lr(iMo8083ri);
                view.setTag(151060224, Integer.valueOf(iMo8083ri));
                m8128ri(this.f6157lr);
                return;
            }
            if (tag == null || this.f6157lr.mo8083ri(abstractC2360qt) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.f6157lr.mo8082ri()) {
                this.f6157lr.mo8093ri(this.f6158ri.get(view), iIntValue);
            } else {
                this.f6157lr.mo8093ri(this.f6158ri.get(view), this.f6157lr.mo8082ri());
            }
            m8128ri(this.f6157lr);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.InterfaceC2319lr
    /* JADX INFO: renamed from: lr */
    public void mo7888lr(int i) {
        AbstractC2360qt abstractC2360qt = this.f6157lr;
        if (abstractC2360qt != null) {
            m8124lr(abstractC2360qt, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.InterfaceC2319lr
    /* JADX INFO: renamed from: lr */
    public void mo7889lr(View view, int i) {
        AbstractC2360qt abstractC2360qtM8132ri;
        if (view == null || (abstractC2360qtM8132ri = m8132ri(view)) == null) {
            return;
        }
        m8124lr(abstractC2360qtM8132ri, i);
        view.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f6155ik;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f6155ik;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        InterfaceC2282ka interfaceC2282ka = this.f6155ik;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7738ri(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2282ka interfaceC2282ka = this.f6155ik;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7733di();
        }
        if (!(getParent() instanceof C2356ik)) {
            m8125ri(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        m8129ri(this.f6157lr, 0.0f, 0.0f);
        InterfaceC2282ka interfaceC2282ka2 = this.f6155ik;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7737ri(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(getParent() instanceof C2356ik)) {
            m8125ri(i, i2);
        }
        InterfaceC2282ka interfaceC2282ka = this.f6155ik;
        if (interfaceC2282ka != null) {
            int[] iArrMo7740ri = interfaceC2282ka.mo7740ri(i, i2);
            setMeasuredDimension(iArrMo7740ri[0], iArrMo7740ri[1]);
        } else {
            setMeasuredDimension(Math.round(this.f6157lr.mo8078mj()), Math.round(this.f6157lr.jbs()));
        }
        InterfaceC2282ka interfaceC2282ka2 = this.f6155ik;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7734fi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka = this.f6155ik;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7735lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m8126ri(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m8126ri(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m8126ri(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m8126ri(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m8126ri(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m8126ri(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m8126ri(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC2360qt m8132ri(View view) {
        return this.f6158ri.get(view);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.InterfaceC2319lr
    /* JADX INFO: renamed from: ri */
    public void mo7890ri(int i) {
        AbstractC2360qt abstractC2360qt = this.f6157lr;
        if (abstractC2360qt != null) {
            m8130ri(abstractC2360qt, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.InterfaceC2319lr
    /* JADX INFO: renamed from: ri */
    public void mo7891ri(View view, int i) {
        AbstractC2360qt abstractC2360qtM8132ri;
        if (view == null || (abstractC2360qtM8132ri = m8132ri(view)) == null) {
            return;
        }
        m8130ri(abstractC2360qtM8132ri, i);
        view.requestLayout();
    }

    /* JADX INFO: renamed from: ri */
    public void m8133ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        this.f6155ik = abstractViewOnTouchListenerC2318ik;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f6156ka.m8003ri(i);
    }

    public void setBorderRadius(float f) {
        this.f6156ka.m8002ri(f);
    }

    public void setRipple(float f) {
        C2334mj c2334mj = this.f6156ka;
        if (c2334mj != null) {
            c2334mj.m8000lr(f);
        }
    }

    public void setRubIn(float f) {
        C2334mj c2334mj = this.f6156ka;
        if (c2334mj != null) {
            c2334mj.m7997fi(f);
        }
    }

    public void setShine(float f) {
        C2334mj c2334mj = this.f6156ka;
        if (c2334mj != null) {
            c2334mj.m7998ik(f);
        }
    }

    public void setStretch(float f) {
        C2334mj c2334mj = this.f6156ka;
        if (c2334mj != null) {
            c2334mj.m7999ka(f);
        }
    }
}
