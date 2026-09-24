package com.bytedance.adsdk.ugeno.p107mj;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2321ik extends ViewGroup {
    private int aac;

    /* JADX INFO: renamed from: ac */
    private float f5951ac;

    /* JADX INFO: renamed from: aw */
    private Scroller f5952aw;

    /* JADX INFO: renamed from: ay */
    private boolean f5953ay;
    private boolean bgr;
    private boolean bnj;

    /* JADX INFO: renamed from: bu */
    private Drawable f5954bu;

    /* JADX INFO: renamed from: co */
    private ClassLoader f5955co;

    /* JADX INFO: renamed from: dw */
    private boolean f5956dw;
    private float dzy;

    /* JADX INFO: renamed from: fe */
    private EdgeEffect f5957fe;
    private int feb;

    /* JADX INFO: renamed from: fr */
    private boolean f5958fr;
    private ka gcp;
    private int hcw;

    /* JADX INFO: renamed from: ig */
    private float f5959ig;
    private int igq;
    private float ihz;

    /* JADX INFO: renamed from: ik */
    AbstractC2322lr f5960ik;
    private final Rect jbs;

    /* JADX INFO: renamed from: jc */
    private int f5961jc;

    /* JADX INFO: renamed from: ka */
    int f5962ka;

    /* JADX INFO: renamed from: kt */
    private int f5963kt;

    /* JADX INFO: renamed from: mj */
    private final lr f5964mj;

    /* JADX INFO: renamed from: nd */
    private fi f5965nd;

    /* JADX INFO: renamed from: nr */
    private int f5966nr;

    /* JADX INFO: renamed from: oh */
    private int f5967oh;
    private int ory;

    /* JADX INFO: renamed from: pc */
    private int f5968pc;

    /* JADX INFO: renamed from: pv */
    private float f5969pv;

    /* JADX INFO: renamed from: qd */
    private int f5970qd;

    /* JADX INFO: renamed from: qh */
    private ka f5971qh;

    /* JADX INFO: renamed from: qt */
    private int f5972qt;

    /* JADX INFO: renamed from: ri */
    private int f5973ri;
    private List<ka> rzk;
    private final Runnable saa;

    /* JADX INFO: renamed from: sf */
    private Parcelable f5974sf;
    private boolean siy;
    private int slm;
    private VelocityTracker srn;

    /* JADX INFO: renamed from: su */
    private boolean f5975su;

    /* JADX INFO: renamed from: ta */
    private EdgeEffect f5976ta;
    private int tan;
    private boolean tnn;

    /* JADX INFO: renamed from: tw */
    private List<Object> f5977tw;

    /* JADX INFO: renamed from: uq */
    private int f5978uq;

    /* JADX INFO: renamed from: vr */
    private di f5979vr;
    private boolean whw;
    private int wjv;

    /* JADX INFO: renamed from: xd */
    private float f5980xd;

    /* JADX INFO: renamed from: xe */
    private ArrayList<View> f5981xe;
    private final ArrayList<lr> xha;

    /* JADX INFO: renamed from: xm */
    private int f5982xm;

    /* JADX INFO: renamed from: zb */
    private int f5983zb;

    /* JADX INFO: renamed from: zf */
    private boolean f5984zf;
    private int zyn;

    /* JADX INFO: renamed from: lr */
    static final int[] f5950lr = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: fi */
    private static final Comparator<lr> f5949fi = new Comparator<lr>() { // from class: com.bytedance.adsdk.ugeno.mj.ik.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(lr lrVar, lr lrVar2) {
            return lrVar.f5996lr - lrVar2.f5996lr;
        }
    };

    /* JADX INFO: renamed from: di */
    private static final Interpolator f5948di = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.mj.ik.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final mj yjm = new mj();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$di */
    private class di extends DataSetObserver {
        di() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            C2321ik.this.m7917lr();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C2321ik.this.m7917lr();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$fi */
    public interface fi {
        /* JADX INFO: renamed from: ri */
        void mo7478ri(View view, float f);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$ik */
    public static class ik extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: di */
        int f5987di;

        /* JADX INFO: renamed from: fi */
        int f5988fi;

        /* JADX INFO: renamed from: ik */
        float f5989ik;

        /* JADX INFO: renamed from: ka */
        boolean f5990ka;

        /* JADX INFO: renamed from: lr */
        public int f5991lr;

        /* JADX INFO: renamed from: ri */
        public boolean f5992ri;

        public ik() {
            super(-1, -1);
            this.f5989ik = 0.0f;
        }

        public ik(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5989ik = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2321ik.f5950lr);
            this.f5991lr = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$ka */
    public interface ka {
        /* JADX INFO: renamed from: co */
        void mo7489co(int i);

        /* JADX INFO: renamed from: ri */
        void mo7518ri(int i, float f, int i2);

        /* JADX INFO: renamed from: sf */
        void mo7520sf(int i);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$lr */
    static class lr {

        /* JADX INFO: renamed from: fi */
        float f5993fi;

        /* JADX INFO: renamed from: ik */
        boolean f5994ik;

        /* JADX INFO: renamed from: ka */
        float f5995ka;

        /* JADX INFO: renamed from: lr */
        int f5996lr;

        /* JADX INFO: renamed from: ri */
        Object f5997ri;

        lr() {
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$mj */
    static class mj implements Comparator<View> {
        mj() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            ik ikVar = (ik) view.getLayoutParams();
            ik ikVar2 = (ik) view2.getLayoutParams();
            if (ikVar.f5992ri != ikVar2.f5992ri) {
                return ikVar.f5992ri ? 1 : -1;
            }
            return ikVar.f5988fi - ikVar2.f5988fi;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$ri */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ri {
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$xha */
    public static class xha extends AbstractC2323ri {
        public static final Parcelable.Creator<xha> CREATOR = new Parcelable.ClassLoaderCreator<xha>() { // from class: com.bytedance.adsdk.ugeno.mj.ik.xha.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public xha createFromParcel(Parcel parcel) {
                return new xha(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public xha createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new xha(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public xha[] newArray(int i) {
                return new xha[i];
            }
        };

        /* JADX INFO: renamed from: ik */
        Parcelable f5998ik;

        /* JADX INFO: renamed from: ka */
        ClassLoader f5999ka;

        /* JADX INFO: renamed from: lr */
        int f6000lr;

        xha(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f6000lr = parcel.readInt();
            this.f5998ik = parcel.readParcelable(classLoader);
            this.f5999ka = classLoader;
        }

        public xha(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f6000lr + "}";
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.AbstractC2323ri, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6000lr);
            parcel.writeParcelable(this.f5998ik, i);
        }
    }

    public C2321ik(Context context) {
        super(context);
        this.xha = new ArrayList<>();
        this.f5964mj = new lr();
        this.jbs = new Rect();
        this.f5972qt = -1;
        this.f5974sf = null;
        this.f5955co = null;
        this.f5951ac = -3.4028235E38f;
        this.ihz = Float.MAX_VALUE;
        this.igq = 1;
        this.f5970qd = -1;
        this.bnj = true;
        this.siy = false;
        this.saa = new Runnable() { // from class: com.bytedance.adsdk.ugeno.mj.ik.3
            @Override // java.lang.Runnable
            public void run() {
                C2321ik.this.setScrollState(0);
                C2321ik.this.m7912ik();
            }
        };
        this.f5968pc = 0;
        m7922ri();
    }

    /* JADX INFO: renamed from: di */
    private void m7892di() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((ik) getChildAt(i).getLayoutParams()).f5992ri) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: di */
    private void m7893di(int i) {
        ka kaVar = this.f5971qh;
        if (kaVar != null) {
            kaVar.mo7489co(i);
        }
        List<ka> list = this.rzk;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ka kaVar2 = this.rzk.get(i2);
                if (kaVar2 != null) {
                    kaVar2.mo7489co(i);
                }
            }
        }
        ka kaVar3 = this.gcp;
        if (kaVar3 != null) {
            kaVar3.mo7489co(i);
        }
    }

    /* JADX INFO: renamed from: fi */
    private void m7894fi(int i) {
        ka kaVar = this.f5971qh;
        if (kaVar != null) {
            kaVar.mo7520sf(i);
        }
        List<ka> list = this.rzk;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ka kaVar2 = this.rzk.get(i2);
                if (kaVar2 != null) {
                    kaVar2.mo7520sf(i);
                }
            }
        }
        ka kaVar3 = this.gcp;
        if (kaVar3 != null) {
            kaVar3.mo7520sf(i);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ik */
    private void m7895ik(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: ik */
    private static boolean m7896ik(View view) {
        return view.getClass().getAnnotation(ri.class) != null;
    }

    private lr jbs() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.slm / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        lr lrVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.xha.size()) {
            lr lrVar2 = this.xha.get(i2);
            if (!z && lrVar2.f5996lr != (i = i3 + 1)) {
                lrVar2 = this.f5964mj;
                lrVar2.f5993fi = f + f3 + f2;
                lrVar2.f5996lr = i;
                lrVar2.f5995ka = this.f5960ik.mo7522ri(lrVar2.f5996lr);
                i2--;
            }
            lr lrVar3 = lrVar2;
            f = lrVar3.f5993fi;
            float f4 = lrVar3.f5995ka + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i2 == this.xha.size() - 1) {
                return lrVar3;
            }
            int i4 = lrVar3.f5996lr;
            float f5 = lrVar3.f5995ka;
            i2++;
            i3 = i4;
            f3 = f5;
            lrVar = lrVar3;
            z = false;
        }
        return lrVar;
    }

    /* JADX INFO: renamed from: ka */
    private boolean m7897ka(int i) {
        if (this.xha.size() == 0) {
            if (this.bnj) {
                return false;
            }
            this.whw = false;
            m7924ri(0, 0.0f, 0);
            if (this.whw) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        lr lrVarJbs = jbs();
        int clientWidth = getClientWidth();
        int i2 = this.slm;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = lrVarJbs.f5996lr;
        float f2 = ((i / f) - lrVarJbs.f5993fi) / (lrVarJbs.f5995ka + (i2 / f));
        this.whw = false;
        m7924ri(i4, f2, (int) (i3 * f2));
        if (this.whw) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: lr */
    private void m7898lr(int i, float f, int i2) {
        ka kaVar = this.f5971qh;
        if (kaVar != null) {
            kaVar.mo7518ri(i, f, i2);
        }
        List<ka> list = this.rzk;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ka kaVar2 = this.rzk.get(i3);
                if (kaVar2 != null) {
                    kaVar2.mo7518ri(i, f, i2);
                }
            }
        }
        ka kaVar3 = this.gcp;
        if (kaVar3 != null) {
            kaVar3.mo7518ri(i, f, i2);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m7899lr(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f5983zb : 0, null);
        }
    }

    /* JADX INFO: renamed from: lr */
    private boolean m7900lr(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f5980xd - f;
        this.f5980xd = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f5951ac * clientWidth;
        float f4 = this.ihz * clientWidth;
        boolean z3 = false;
        lr lrVar = this.xha.get(0);
        ArrayList<lr> arrayList = this.xha;
        lr lrVar2 = arrayList.get(arrayList.size() - 1);
        if (lrVar.f5996lr != 0) {
            f3 = lrVar.f5993fi * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (lrVar2.f5996lr != this.f5960ik.mo7523ri() - 1) {
            f4 = lrVar2.f5993fi * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f5957fe.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f5976ta.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f5980xd += scrollX - i;
        scrollTo(i, getScrollY());
        m7897ka(i);
        return z3;
    }

    /* JADX INFO: renamed from: mj */
    private boolean m7901mj() {
        this.f5970qd = -1;
        m7902qt();
        this.f5957fe.onRelease();
        this.f5976ta.onRelease();
        return this.f5957fe.isFinished() || this.f5976ta.isFinished();
    }

    /* JADX INFO: renamed from: qt */
    private void m7902qt() {
        this.f5984zf = false;
        this.f5956dw = false;
        VelocityTracker velocityTracker = this.srn;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.srn = null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private int m7903ri(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.feb || Math.abs(i2) <= this.f5961jc) {
            i += (int) (f + (i >= this.f5962ka ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.xha.size() <= 0) {
            return i;
        }
        lr lrVar = this.xha.get(0);
        ArrayList<lr> arrayList = this.xha;
        return Math.max(lrVar.f5996lr, Math.min(i, arrayList.get(arrayList.size() - 1).f5996lr));
    }

    /* JADX INFO: renamed from: ri */
    private Rect m7904ri(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX INFO: renamed from: ri */
    private void m7905ri(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.xha.isEmpty()) {
            if (!this.f5952aw.isFinished()) {
                this.f5952aw.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        lr lrVarM7915lr = m7915lr(this.f5962ka);
        int iMin = (int) ((lrVarM7915lr != null ? Math.min(lrVarM7915lr.f5993fi, this.ihz) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            m7909ri(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7906ri(int i, boolean z, int i2, boolean z2) {
        lr lrVarM7915lr = m7915lr(i);
        int clientWidth = lrVarM7915lr != null ? (int) (getClientWidth() * Math.max(this.f5951ac, Math.min(lrVarM7915lr.f5993fi, this.ihz))) : 0;
        if (z) {
            m7925ri(clientWidth, 0, i2);
            if (z2) {
                m7894fi(i);
                return;
            }
            return;
        }
        if (z2) {
            m7894fi(i);
        }
        m7909ri(false);
        scrollTo(clientWidth, 0);
        m7897ka(clientWidth);
    }

    /* JADX INFO: renamed from: ri */
    private void m7907ri(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5970qd) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5980xd = motionEvent.getX(i);
            this.f5970qd = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.srn;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7908ri(lr lrVar, int i, lr lrVar2) {
        lr lrVar3;
        lr lrVar4;
        int iMo7523ri = this.f5960ik.mo7523ri();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.slm / clientWidth : 0.0f;
        if (lrVar2 != null) {
            int i2 = lrVar2.f5996lr;
            if (i2 < lrVar.f5996lr) {
                float fMo7522ri = lrVar2.f5993fi + lrVar2.f5995ka + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= lrVar.f5996lr && i4 < this.xha.size()) {
                    lr lrVar5 = this.xha.get(i4);
                    while (true) {
                        lrVar4 = lrVar5;
                        if (i3 <= lrVar4.f5996lr || i4 >= this.xha.size() - 1) {
                            break;
                        }
                        i4++;
                        lrVar5 = this.xha.get(i4);
                    }
                    while (i3 < lrVar4.f5996lr) {
                        fMo7522ri += this.f5960ik.mo7522ri(i3) + f;
                        i3++;
                    }
                    lrVar4.f5993fi = fMo7522ri;
                    fMo7522ri += lrVar4.f5995ka + f;
                    i3++;
                }
            } else if (i2 > lrVar.f5996lr) {
                int size = this.xha.size() - 1;
                float fMo7522ri2 = lrVar2.f5993fi;
                while (true) {
                    i2--;
                    if (i2 < lrVar.f5996lr || size < 0) {
                        break;
                    }
                    lr lrVar6 = this.xha.get(size);
                    while (true) {
                        lrVar3 = lrVar6;
                        if (i2 >= lrVar3.f5996lr || size <= 0) {
                            break;
                        }
                        size--;
                        lrVar6 = this.xha.get(size);
                    }
                    while (i2 > lrVar3.f5996lr) {
                        fMo7522ri2 -= this.f5960ik.mo7522ri(i2) + f;
                        i2--;
                    }
                    fMo7522ri2 -= lrVar3.f5995ka + f;
                    lrVar3.f5993fi = fMo7522ri2;
                }
            }
        }
        int size2 = this.xha.size();
        float fMo7522ri3 = lrVar.f5993fi;
        int i5 = lrVar.f5996lr - 1;
        this.f5951ac = lrVar.f5996lr == 0 ? lrVar.f5993fi : -3.4028235E38f;
        int i6 = iMo7523ri - 1;
        this.ihz = lrVar.f5996lr == i6 ? (lrVar.f5993fi + lrVar.f5995ka) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            lr lrVar7 = this.xha.get(i7);
            while (i5 > lrVar7.f5996lr) {
                fMo7522ri3 -= this.f5960ik.mo7522ri(i5) + f;
                i5--;
            }
            fMo7522ri3 -= lrVar7.f5995ka + f;
            lrVar7.f5993fi = fMo7522ri3;
            if (lrVar7.f5996lr == 0) {
                this.f5951ac = fMo7522ri3;
            }
            i7--;
            i5--;
        }
        float fMo7522ri4 = lrVar.f5993fi + lrVar.f5995ka + f;
        int i8 = lrVar.f5996lr + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            lr lrVar8 = this.xha.get(i9);
            while (i8 < lrVar8.f5996lr) {
                fMo7522ri4 += this.f5960ik.mo7522ri(i8) + f;
                i8++;
            }
            if (lrVar8.f5996lr == i6) {
                this.ihz = (lrVar8.f5995ka + fMo7522ri4) - 1.0f;
            }
            lrVar8.f5993fi = fMo7522ri4;
            fMo7522ri4 += lrVar8.f5995ka + f;
            i9++;
            i8++;
        }
        this.siy = false;
    }

    /* JADX INFO: renamed from: ri */
    private void m7909ri(boolean z) {
        boolean z2 = this.f5968pc == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f5952aw.isFinished()) {
                this.f5952aw.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f5952aw.getCurrX();
                int currY = this.f5952aw.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m7897ka(currX);
                    }
                }
            }
        }
        this.f5975su = false;
        for (int i = 0; i < this.xha.size(); i++) {
            lr lrVar = this.xha.get(i);
            if (lrVar.f5994ik) {
                lrVar.f5994ik = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.saa);
            } else {
                this.saa.run();
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m7910ri(float f, float f2) {
        if (f >= this.hcw || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.hcw)) && f2 < 0.0f;
        }
        return true;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f5958fr != z) {
            this.f5958fr = z;
        }
    }

    private void xha() {
        if (this.aac != 0) {
            ArrayList<View> arrayList = this.f5981xe;
            if (arrayList == null) {
                this.f5981xe = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f5981xe.add(getChildAt(i));
            }
            Collections.sort(this.f5981xe, yjm);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        lr lrVarM7921ri;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (lrVarM7921ri = m7921ri(childAt)) != null && lrVarM7921ri.f5996lr == this.f5962ka) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        lr lrVarM7921ri;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (lrVarM7921ri = m7921ri(childAt)) != null && lrVarM7921ri.f5996lr == this.f5962ka) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        ik ikVar = (ik) layoutParams;
        ikVar.f5992ri |= m7896ik(view);
        if (!this.f5953ay) {
            super.addView(view, i, layoutParams);
        } else {
            if (ikVar != null && ikVar.f5992ri) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            ikVar.f5990ka = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f5960ik == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f5951ac));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.ihz));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ik) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.bgr = true;
        if (this.f5952aw.isFinished() || !this.f5952aw.computeScrollOffset()) {
            m7909ri(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f5952aw.getCurrX();
        int currY = this.f5952aw.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m7897ka(currX)) {
                this.f5952aw.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m7932ri(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        lr lrVarM7921ri;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (lrVarM7921ri = m7921ri(childAt)) != null && lrVarM7921ri.f5996lr == this.f5962ka && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC2322lr abstractC2322lr;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC2322lr = this.f5960ik) != null && abstractC2322lr.mo7523ri() > 1)) {
            if (!this.f5957fe.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f5951ac * width);
                this.f5957fe.setSize(height, width);
                zDraw = this.f5957fe.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f5976ta.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.ihz + 1.0f)) * width2);
                this.f5976ta.setSize(height2, width2);
                zDraw |= this.f5976ta.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f5957fe.finish();
            this.f5976ta.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5954bu;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: fi */
    boolean m7911fi() {
        AbstractC2322lr abstractC2322lr = this.f5960ik;
        if (abstractC2322lr == null || this.f5962ka >= abstractC2322lr.mo7523ri() - 1) {
            return false;
        }
        m7926ri(this.f5962ka + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ik();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ik(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC2322lr getAdapter() {
        return this.f5960ik;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.aac == 2) {
            i2 = (i - 1) - i2;
        }
        return ((ik) this.f5981xe.get(i2).getLayoutParams()).f5987di;
    }

    public int getCurrentItem() {
        return this.f5962ka;
    }

    public int getOffscreenPageLimit() {
        return this.igq;
    }

    public int getPageMargin() {
        return this.slm;
    }

    /* JADX INFO: renamed from: ik */
    void m7912ik() {
        m7923ri(this.f5962ka);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX INFO: renamed from: ik */
    public boolean m7913ik(int i) {
        boolean zM7914ka;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1) {
                zM7914ka = m7914ka();
            } else if (i == 66 || i == 2) {
                zM7914ka = m7911fi();
            } else {
                zM7914ka = false;
            }
        } else if (i == 17) {
            zM7914ka = (viewFindFocus == null || m7904ri(this.jbs, viewFindNextFocus).left < m7904ri(this.jbs, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m7914ka();
        } else if (i == 66) {
            int i2 = m7904ri(this.jbs, viewFindNextFocus).left;
            int i3 = m7904ri(this.jbs, viewFindFocus).left;
            if (viewFindFocus == null || i2 > i3) {
                zM7914ka = viewFindNextFocus.requestFocus();
            } else {
                zM7914ka = m7911fi();
            }
        } else {
            zM7914ka = false;
        }
        if (zM7914ka) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM7914ka;
    }

    /* JADX INFO: renamed from: ka */
    boolean m7914ka() {
        int i = this.f5962ka;
        if (i <= 0) {
            return false;
        }
        m7926ri(i - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: lr */
    lr m7915lr(int i) {
        for (int i2 = 0; i2 < this.xha.size(); i2++) {
            lr lrVar = this.xha.get(i2);
            if (lrVar.f5996lr == i) {
                return lrVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    lr m7916lr(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m7921ri(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* JADX INFO: renamed from: lr */
    void m7917lr() {
        int iMo7523ri = this.f5960ik.mo7523ri();
        this.f5973ri = iMo7523ri;
        boolean z = this.xha.size() < (this.igq * 2) + 1 && this.xha.size() < iMo7523ri;
        int iMax = this.f5962ka;
        int i = 0;
        while (i < this.xha.size()) {
            lr lrVar = this.xha.get(i);
            int iMo7524ri = this.f5960ik.mo7524ri(lrVar.f5997ri);
            if (iMo7524ri != -1) {
                if (iMo7524ri == -2) {
                    this.xha.remove(i);
                    i--;
                    this.f5960ik.mo7526ri((ViewGroup) this, lrVar.f5996lr, lrVar.f5997ri);
                    if (this.f5962ka == lrVar.f5996lr) {
                        iMax = Math.max(0, Math.min(this.f5962ka, iMo7523ri - 1));
                    }
                } else if (lrVar.f5996lr != iMo7524ri) {
                    if (lrVar.f5996lr == this.f5962ka) {
                        iMax = iMo7524ri;
                    }
                    lrVar.f5996lr = iMo7524ri;
                }
                z = true;
            }
            i++;
        }
        Collections.sort(this.xha, f5949fi);
        if (z) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ik ikVar = (ik) getChildAt(i2).getLayoutParams();
                if (!ikVar.f5992ri) {
                    ikVar.f5989ik = 0.0f;
                }
            }
            m7927ri(iMax, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m7918lr(ka kaVar) {
        List<ka> list = this.rzk;
        if (list != null) {
            list.remove(kaVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bnj = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.saa);
        Scroller scroller = this.f5952aw;
        if (scroller != null && !scroller.isFinished()) {
            this.f5952aw.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.slm <= 0 || this.f5954bu == null || this.xha.size() <= 0 || this.f5960ik == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f3 = width;
        float f4 = this.slm / f3;
        int i = 0;
        lr lrVar = this.xha.get(0);
        float f5 = lrVar.f5993fi;
        int size = this.xha.size();
        int i2 = lrVar.f5996lr;
        int i3 = this.xha.get(size - 1).f5996lr;
        while (i2 < i3) {
            while (i2 > lrVar.f5996lr && i < size) {
                i++;
                lrVar = this.xha.get(i);
            }
            if (i2 == lrVar.f5996lr) {
                f2 = (lrVar.f5993fi + lrVar.f5995ka) * f3;
                f = lrVar.f5993fi + lrVar.f5995ka + f4;
            } else {
                float fMo7522ri = this.f5960ik.mo7522ri(i2);
                float f6 = (f5 + fMo7522ri) * f3;
                f = f5 + fMo7522ri + f4;
                f2 = f6;
            }
            if (this.slm + f2 > scrollX) {
                this.f5954bu.setBounds(Math.round(f2), this.f5966nr, Math.round(this.slm + f2), this.tan);
                this.f5954bu.draw(canvas);
            }
            if (f2 > scrollX + width) {
                return;
            }
            i2++;
            f5 = f;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m7901mj();
            return false;
        }
        if (action != 0) {
            if (this.f5984zf) {
                return true;
            }
            if (this.f5956dw) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f5969pv = x;
            this.f5980xd = x;
            float y = motionEvent.getY();
            this.f5959ig = y;
            this.dzy = y;
            this.f5970qd = motionEvent.getPointerId(0);
            this.f5956dw = false;
            this.bgr = true;
            this.f5952aw.computeScrollOffset();
            if (this.f5968pc != 2 || Math.abs(this.f5952aw.getFinalX() - this.f5952aw.getCurrX()) <= this.zyn) {
                m7909ri(false);
                this.f5984zf = false;
            } else {
                this.f5952aw.abortAnimation();
                this.f5975su = false;
                m7912ik();
                this.f5984zf = true;
                m7895ik(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f5970qd;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.f5980xd;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f5959ig);
                if (f != 0.0f && !m7910ri(this.f5980xd, f) && m7933ri(this, false, (int) f, (int) x2, (int) y2)) {
                    this.f5980xd = x2;
                    this.dzy = y2;
                    this.f5956dw = true;
                    return false;
                }
                int i2 = this.f5967oh;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.f5984zf = true;
                    m7895ik(true);
                    setScrollState(1);
                    this.f5980xd = f > 0.0f ? this.f5969pv + this.f5967oh : this.f5969pv - this.f5967oh;
                    this.dzy = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.f5956dw = true;
                }
                if (this.f5984zf && m7900lr(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m7907ri(motionEvent);
        }
        if (this.srn == null) {
            this.srn = VelocityTracker.obtain();
        }
        this.srn.addMovement(motionEvent);
        return this.f5984zf;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        lr lrVarM7921ri;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ik ikVar = (ik) childAt.getLayoutParams();
                if (ikVar.f5992ri) {
                    int i9 = ikVar.f5991lr & 7;
                    int i10 = ikVar.f5991lr & 112;
                    if (i9 != 1) {
                        if (i9 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i9 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i10 != 16) {
                            if (i10 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i10 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i11 = paddingLeft + scrollX;
                            childAt.layout(i11, paddingTop, childAt.getMeasuredWidth() + i11, paddingTop + childAt.getMeasuredHeight());
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i12 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i12;
                        int i13 = paddingLeft + scrollX;
                        childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, paddingTop + childAt.getMeasuredHeight());
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i14;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, paddingTop + childAt.getMeasuredHeight());
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i16 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i16;
                    int i17 = paddingLeft + scrollX;
                    childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, paddingTop + childAt.getMeasuredHeight());
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i18 = (i5 - paddingLeft) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                ik ikVar2 = (ik) childAt2.getLayoutParams();
                if (!ikVar2.f5992ri && (lrVarM7921ri = m7921ri(childAt2)) != null) {
                    float f = i18;
                    int i20 = ((int) (lrVarM7921ri.f5993fi * f)) + paddingLeft;
                    if (ikVar2.f5990ka) {
                        ikVar2.f5990ka = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * ikVar2.f5989ik), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f5966nr = paddingTop;
        this.tan = i6 - paddingBottom;
        this.f5982xm = i7;
        if (this.bnj) {
            z2 = false;
            m7906ri(this.f5962ka, false, 0, false);
        } else {
            z2 = false;
        }
        this.bnj = z2;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        ik ikVar;
        ik ikVar2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.hcw = Math.min(measuredWidth / 10, this.ory);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (ikVar2 = (ik) childAt.getLayoutParams()) != null && ikVar2.f5992ri) {
                int i8 = ikVar2.f5991lr & 7;
                int i9 = ikVar2.f5991lr & 112;
                boolean z3 = (i9 == 48 || i9 == 80) ? true : z;
                if (i8 != 3 && i8 != 5) {
                    z2 = z;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (ikVar2.width != -2) {
                    i4 = ikVar2.width != -1 ? ikVar2.width : paddingLeft;
                    i10 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                if (ikVar2.height != -2) {
                    i5 = ikVar2.height != -1 ? ikVar2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i10), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
            z = false;
        }
        this.f5978uq = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.wjv = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f5953ay = true;
        m7912ik();
        this.f5953ay = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((ikVar = (ik) childAt2.getLayoutParams()) == null || !ikVar.f5992ri)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * ikVar.f5989ik), 1073741824), this.wjv);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        lr lrVarM7921ri;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (lrVarM7921ri = m7921ri(childAt)) != null && lrVarM7921ri.f5996lr == this.f5962ka && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xha)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xha xhaVar = (xha) parcelable;
        super.onRestoreInstanceState(xhaVar.m7944ri());
        if (this.f5960ik != null) {
            m7927ri(xhaVar.f6000lr, false, true);
            return;
        }
        this.f5972qt = xhaVar.f6000lr;
        this.f5974sf = xhaVar.f5998ik;
        this.f5955co = xhaVar.f5999ka;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        xha xhaVar = new xha(super.onSaveInstanceState());
        xhaVar.f6000lr = this.f5962ka;
        AbstractC2322lr abstractC2322lr = this.f5960ik;
        if (abstractC2322lr != null) {
            xhaVar.f5998ik = abstractC2322lr.m7940lr();
        }
        return xhaVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.slm;
            m7905ri(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC2322lr abstractC2322lr;
        int iFindPointerIndex;
        if (this.tnn) {
            return true;
        }
        boolean zM7901mj = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC2322lr = this.f5960ik) == null || abstractC2322lr.mo7523ri() == 0) {
            return false;
        }
        if (this.srn == null) {
            this.srn = VelocityTracker.obtain();
        }
        this.srn.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f5952aw.abortAnimation();
            this.f5975su = false;
            m7912ik();
            float x = motionEvent.getX();
            this.f5969pv = x;
            this.f5980xd = x;
            float y = motionEvent.getY();
            this.f5959ig = y;
            this.dzy = y;
            this.f5970qd = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.f5980xd = motionEvent.getX(actionIndex);
                            this.f5970qd = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        m7907ri(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f5970qd);
                        if (iFindPointerIndex2 != -1) {
                            this.f5980xd = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.f5984zf) {
                    m7906ri(this.f5962ka, true, 0, false);
                    zM7901mj = m7901mj();
                }
            } else if (!this.f5984zf) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.f5970qd);
                if (iFindPointerIndex3 == -1) {
                    zM7901mj = m7901mj();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x2 - this.f5980xd);
                    float y2 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y2 - this.dzy);
                    if (fAbs > this.f5967oh && fAbs > fAbs2) {
                        this.f5984zf = true;
                        m7895ik(true);
                        float f = this.f5969pv;
                        this.f5980xd = x2 - f > 0.0f ? f + this.f5967oh : f - this.f5967oh;
                        this.dzy = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f5984zf) {
                        zM7901mj = m7900lr(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.f5984zf && (iFindPointerIndex = motionEvent.findPointerIndex(this.f5970qd)) != -1) {
                zM7901mj = m7900lr(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.f5984zf) {
            VelocityTracker velocityTracker = this.srn;
            velocityTracker.computeCurrentVelocity(1000, this.f5963kt);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f5970qd);
            this.f5975su = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            lr lrVarJbs = jbs();
            float f2 = clientWidth;
            float f3 = this.slm / f2;
            int i = lrVarJbs.f5996lr;
            float f4 = ((scrollX / f2) - lrVarJbs.f5993fi) / (lrVarJbs.f5995ka + f3);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.f5970qd);
            if (iFindPointerIndex4 != -1) {
                m7928ri(m7903ri(i, f4, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.f5969pv)), true, true, xVelocity);
                zM7901mj = m7901mj();
            }
        }
        if (zM7901mj) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f5953ay) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: renamed from: ri */
    float m7919ri(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: ri */
    lr m7920ri(int i, int i2) {
        lr lrVar = new lr();
        lrVar.f5996lr = i;
        lrVar.f5997ri = this.f5960ik.mo7525ri((ViewGroup) this, i);
        lrVar.f5995ka = this.f5960ik.mo7522ri(i);
        if (i2 < 0 || i2 >= this.xha.size()) {
            this.xha.add(lrVar);
            return lrVar;
        }
        this.xha.add(i2, lrVar);
        return lrVar;
    }

    /* JADX INFO: renamed from: ri */
    lr m7921ri(View view) {
        for (int i = 0; i < this.xha.size(); i++) {
            lr lrVar = this.xha.get(i);
            if (this.f5960ik.mo7527ri(view, lrVar.f5997ri)) {
                return lrVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    void m7922ri() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f5952aw = new Scroller(context, f5948di);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5967oh = viewConfiguration.getScaledPagingTouchSlop();
        this.f5961jc = (int) (400.0f * f);
        this.f5963kt = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5957fe = new EdgeEffect(context);
        this.f5976ta = new EdgeEffect(context);
        this.feb = (int) (25.0f * f);
        this.zyn = (int) (2.0f * f);
        this.ory = (int) (f * 16.0f);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[PHI: r7 r10 r15
  0x00f6: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00eb, B:59:0x00d5, B:53:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00f6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00eb, B:59:0x00d5, B:53:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00f6: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00eb, B:59:0x00d5, B:53:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ri */
    void m7923ri(int i) {
        lr lrVarM7915lr;
        String hexString;
        lr lrVarM7920ri;
        lr lrVarM7921ri;
        lr lrVar;
        int i2 = this.f5962ka;
        if (i2 != i) {
            lrVarM7915lr = m7915lr(i2);
            this.f5962ka = i;
        } else {
            lrVarM7915lr = null;
        }
        if (this.f5960ik == null) {
            xha();
            return;
        }
        if (this.f5975su) {
            xha();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.igq;
        int iMax = Math.max(0, this.f5962ka - i3);
        int iMo7523ri = this.f5960ik.mo7523ri();
        int iMin = Math.min(iMo7523ri - 1, this.f5962ka + i3);
        if (iMo7523ri != this.f5973ri) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f5973ri + ", found: " + iMo7523ri + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f5960ik.getClass());
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.xha.size()) {
                lrVarM7920ri = this.xha.get(i4);
                if (lrVarM7920ri.f5996lr >= this.f5962ka) {
                    if (lrVarM7920ri.f5996lr != this.f5962ka) {
                        break;
                    } else {
                        break;
                    }
                }
                i4++;
            }
            lrVarM7920ri = null;
            break;
        }
        if (lrVarM7920ri == null && iMo7523ri > 0) {
            lrVarM7920ri = m7920ri(this.f5962ka, i4);
        }
        if (lrVarM7920ri != null) {
            int i5 = i4 - 1;
            lr lrVar2 = i5 >= 0 ? this.xha.get(i5) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - lrVarM7920ri.f5995ka) + (getPaddingLeft() / clientWidth);
            float f = 0.0f;
            for (int i6 = this.f5962ka - 1; i6 >= 0; i6--) {
                if (f >= paddingLeft && i6 < iMax) {
                    if (lrVar2 == null) {
                        break;
                    }
                    if (i6 == lrVar2.f5996lr && !lrVar2.f5994ik) {
                        this.xha.remove(i5);
                        this.f5960ik.mo7526ri((ViewGroup) this, i6, lrVar2.f5997ri);
                        i5--;
                        i4--;
                        if (i5 >= 0) {
                            lrVar = this.xha.get(i5);
                        } else {
                            lrVar = null;
                        }
                        lrVar2 = lrVar;
                    }
                } else {
                    if (lrVar2 == null || i6 != lrVar2.f5996lr) {
                        f += m7920ri(i6, i5 + 1).f5995ka;
                        i4++;
                        if (i5 >= 0) {
                            lrVar = this.xha.get(i5);
                        } else {
                            lrVar = null;
                        }
                    } else {
                        f += lrVar2.f5995ka;
                        i5--;
                        if (i5 >= 0) {
                            lrVar = this.xha.get(i5);
                        } else {
                            lrVar = null;
                        }
                    }
                    lrVar2 = lrVar;
                }
            }
            float f2 = lrVarM7920ri.f5995ka;
            int i7 = i4 + 1;
            if (f2 < 2.0f) {
                lr lrVar3 = i7 < this.xha.size() ? this.xha.get(i7) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i8 = this.f5962ka;
                while (true) {
                    i8++;
                    if (i8 >= iMo7523ri) {
                        break;
                    }
                    if (f2 >= paddingRight && i8 > iMin) {
                        if (lrVar3 == null) {
                            break;
                        }
                        if (i8 == lrVar3.f5996lr && !lrVar3.f5994ik) {
                            this.xha.remove(i7);
                            this.f5960ik.mo7526ri((ViewGroup) this, i8, lrVar3.f5997ri);
                            if (i7 < this.xha.size()) {
                                lrVar3 = this.xha.get(i7);
                            }
                        }
                    } else if (lrVar3 == null || i8 != lrVar3.f5996lr) {
                        lr lrVarM7920ri2 = m7920ri(i8, i7);
                        i7++;
                        f2 += lrVarM7920ri2.f5995ka;
                        lrVar3 = i7 < this.xha.size() ? this.xha.get(i7) : null;
                    } else {
                        f2 += lrVar3.f5995ka;
                        i7++;
                        if (i7 < this.xha.size()) {
                            lrVar3 = this.xha.get(i7);
                        }
                    }
                }
            }
            m7908ri(lrVarM7920ri, i4, lrVarM7915lr);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            ik ikVar = (ik) childAt.getLayoutParams();
            ikVar.f5987di = i9;
            if (!ikVar.f5992ri && ikVar.f5989ik == 0.0f && (lrVarM7921ri = m7921ri(childAt)) != null) {
                ikVar.f5989ik = lrVarM7921ri.f5995ka;
                ikVar.f5988fi = lrVarM7921ri.f5996lr;
            }
        }
        xha();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            lr lrVarM7916lr = viewFindFocus != null ? m7916lr(viewFindFocus) : null;
            if (lrVarM7916lr == null || lrVarM7916lr.f5996lr != this.f5962ka) {
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt2 = getChildAt(i10);
                    lr lrVarM7921ri2 = m7921ri(childAt2);
                    if (lrVarM7921ri2 != null && lrVarM7921ri2.f5996lr == this.f5962ka && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX INFO: renamed from: ri */
    protected void m7924ri(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.f5982xm > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                ik ikVar = (ik) childAt.getLayoutParams();
                if (ikVar.f5992ri) {
                    int i4 = ikVar.f5991lr & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        m7898lr(i, f, i2);
        if (this.f5965nd != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((ik) childAt2.getLayoutParams()).f5992ri) {
                    this.f5965nd.mo7478ri(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.whw = true;
    }

    /* JADX INFO: renamed from: ri */
    void m7925ri(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f5952aw;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.bgr ? this.f5952aw.getCurrX() : this.f5952aw.getStartX();
            this.f5952aw.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m7909ri(false);
            m7912ik();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fM7919ri = f2 + (m7919ri(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fM7919ri / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i5) / ((f * this.f5960ik.mo7522ri(this.f5962ka)) + this.slm)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.bgr = false;
        this.f5952aw.startScroll(i4, scrollY, i5, i6, iMin);
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ri */
    public void m7926ri(int i, boolean z) {
        this.f5975su = false;
        m7927ri(i, z, false);
    }

    /* JADX INFO: renamed from: ri */
    void m7927ri(int i, boolean z, boolean z2) {
        m7928ri(i, z, z2, 0);
    }

    /* JADX INFO: renamed from: ri */
    void m7928ri(int i, boolean z, boolean z2, int i2) {
        AbstractC2322lr abstractC2322lr = this.f5960ik;
        if (abstractC2322lr == null || abstractC2322lr.mo7523ri() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f5962ka == i && this.xha.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f5960ik.mo7523ri()) {
            i = this.f5960ik.mo7523ri() - 1;
        }
        int i3 = this.igq;
        int i4 = this.f5962ka;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.xha.size(); i5++) {
                this.xha.get(i5).f5994ik = true;
            }
        }
        boolean z3 = this.f5962ka != i;
        if (!this.bnj) {
            m7923ri(i);
            m7906ri(i, z, i2, z3);
        } else {
            this.f5962ka = i;
            if (z3) {
                m7894fi(i);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7929ri(ka kaVar) {
        if (this.rzk == null) {
            this.rzk = new ArrayList();
        }
        this.rzk.add(kaVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m7930ri(boolean z, fi fiVar) {
        m7931ri(z, fiVar, 2);
    }

    /* JADX INFO: renamed from: ri */
    public void m7931ri(boolean z, fi fiVar, int i) {
        boolean z2 = fiVar != null;
        boolean z3 = z2 != (this.f5965nd != null);
        this.f5965nd = fiVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.aac = z ? 2 : 1;
            this.f5983zb = i;
        } else {
            this.aac = 0;
        }
        if (z3) {
            m7912ik();
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7932ri(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? m7914ka() : m7913ik(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? m7911fi() : m7913ik(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return m7913ik(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return m7913ik(1);
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    protected boolean m7933ri(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m7933ri(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public void setAdapter(AbstractC2322lr abstractC2322lr) {
        AbstractC2322lr abstractC2322lr2 = this.f5960ik;
        if (abstractC2322lr2 != null) {
            abstractC2322lr2.m7942ri((DataSetObserver) null);
            for (int i = 0; i < this.xha.size(); i++) {
                lr lrVar = this.xha.get(i);
                this.f5960ik.mo7526ri((ViewGroup) this, lrVar.f5996lr, lrVar.f5997ri);
            }
            this.xha.clear();
            m7892di();
            this.f5962ka = 0;
            scrollTo(0, 0);
        }
        this.f5960ik = abstractC2322lr;
        this.f5973ri = 0;
        if (abstractC2322lr != null) {
            if (this.f5979vr == null) {
                this.f5979vr = new di();
            }
            this.f5960ik.m7942ri((DataSetObserver) this.f5979vr);
            this.f5975su = false;
            boolean z = this.bnj;
            this.bnj = true;
            this.f5973ri = this.f5960ik.mo7523ri();
            int i2 = this.f5972qt;
            if (i2 >= 0) {
                m7927ri(i2, false, true);
                this.f5972qt = -1;
                this.f5974sf = null;
                this.f5955co = null;
            } else if (z) {
                requestLayout();
            } else {
                m7912ik();
            }
        }
        List<Object> list = this.f5977tw;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f5977tw.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f5977tw.get(i3);
        }
    }

    public void setCurrentItem(int i) {
        this.f5975su = false;
        m7927ri(i, !this.bnj, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.igq) {
            this.igq = i;
            m7912ik();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(ka kaVar) {
        this.f5971qh = kaVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.slm;
        this.slm = i;
        int width = getWidth();
        m7905ri(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5954bu = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i) {
        if (this.f5968pc == i) {
            return;
        }
        this.f5968pc = i;
        if (this.f5965nd != null) {
            m7899lr(i != 0);
        }
        m7893di(i);
    }

    public void setScroller(Scroller scroller) {
        this.f5952aw = scroller;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5954bu;
    }
}
