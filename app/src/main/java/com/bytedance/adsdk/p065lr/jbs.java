package com.bytedance.adsdk.p065lr;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p066di.ChoreographerFrameCallbackC2019ik;
import com.bytedance.adsdk.p065lr.p067fi.C2049uq;
import com.bytedance.adsdk.p065lr.p068ik.C2054di;
import com.bytedance.adsdk.p065lr.p068ik.C2056ik;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.C2065lr;
import com.bytedance.adsdk.p065lr.p073lr.C2123lr;
import com.bytedance.adsdk.p065lr.p073lr.C2124ri;
import com.bytedance.adsdk.p065lr.p074ri.C2142ri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends Drawable implements Animatable, Drawable.Callback {

    /* JADX INFO: renamed from: ac */
    private C2065lr f5052ac;

    /* JADX INFO: renamed from: aw */
    private String f5053aw;

    /* JADX INFO: renamed from: ay */
    private boolean f5054ay;
    private InterfaceC2114ka bgr;

    /* JADX INFO: renamed from: bu */
    private boolean f5055bu;

    /* JADX INFO: renamed from: co */
    private C2123lr f5056co;

    /* JADX INFO: renamed from: di */
    private boolean f5057di;

    /* JADX INFO: renamed from: dw */
    private Canvas f5058dw;
    private Rect dzy;

    /* JADX INFO: renamed from: fi */
    private final ChoreographerFrameCallbackC2019ik f5059fi;

    /* JADX INFO: renamed from: fr */
    private tan f5060fr;
    private RectF hcw;

    /* JADX INFO: renamed from: ig */
    private RectF f5061ig;
    private final Matrix igq;
    private int ihz;

    /* JADX INFO: renamed from: ik */
    C2012ac f5062ik;
    private EnumC2112lr jbs;

    /* JADX INFO: renamed from: jc */
    private View f5063jc;

    /* JADX INFO: renamed from: ka */
    private xha f5064ka;

    /* JADX INFO: renamed from: kt */
    private boolean f5065kt;

    /* JADX INFO: renamed from: lr */
    C2053ik f5066lr;

    /* JADX INFO: renamed from: mj */
    private boolean f5067mj;

    /* JADX INFO: renamed from: nr */
    private boolean f5068nr;

    /* JADX INFO: renamed from: oh */
    private Paint f5069oh;
    private Rect ory;

    /* JADX INFO: renamed from: pv */
    private RectF f5070pv;

    /* JADX INFO: renamed from: qd */
    private Matrix f5071qd;

    /* JADX INFO: renamed from: qt */
    private final ArrayList<InterfaceC2113ri> f5072qt;

    /* JADX INFO: renamed from: ri */
    String f5073ri;

    /* JADX INFO: renamed from: sf */
    private final ValueAnimator.AnimatorUpdateListener f5074sf;
    private Map<String, Typeface> slm;
    private Matrix srn;

    /* JADX INFO: renamed from: su */
    private boolean f5075su;
    private boolean tan;

    /* JADX INFO: renamed from: uq */
    private boolean f5076uq;

    /* JADX INFO: renamed from: vr */
    private C2124ri f5077vr;
    private boolean wjv;

    /* JADX INFO: renamed from: xd */
    private Rect f5078xd;
    private boolean xha;

    /* JADX INFO: renamed from: zf */
    private Bitmap f5079zf;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.jbs$lr */
    private enum EnumC2112lr {
        NONE,
        PLAY,
        RESUME
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.jbs$ri */
    private interface InterfaceC2113ri {
        /* JADX INFO: renamed from: ri */
        void mo6992ri(xha xhaVar);
    }

    public jbs() {
        ChoreographerFrameCallbackC2019ik choreographerFrameCallbackC2019ik = new ChoreographerFrameCallbackC2019ik();
        this.f5059fi = choreographerFrameCallbackC2019ik;
        this.f5057di = true;
        this.xha = false;
        this.f5067mj = false;
        this.jbs = EnumC2112lr.NONE;
        this.f5072qt = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.jbs.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (jbs.this.f5052ac != null) {
                    jbs.this.f5052ac.mo6758ri(jbs.this.f5059fi.m6571di());
                }
            }
        };
        this.f5074sf = animatorUpdateListener;
        this.f5068nr = false;
        this.tan = true;
        this.ihz = 255;
        this.f5060fr = tan.AUTOMATIC;
        this.f5075su = false;
        this.igq = new Matrix();
        this.f5065kt = false;
        choreographerFrameCallbackC2019ik.addUpdateListener(animatorUpdateListener);
    }

    private C2124ri dzy() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f5077vr == null) {
            C2124ri c2124ri = new C2124ri(getCallback(), this.f5066lr);
            this.f5077vr = c2124ri;
            String str = this.f5073ri;
            if (str != null) {
                c2124ri.m7023ri(str);
            }
        }
        return this.f5077vr;
    }

    private void hcw() {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            return;
        }
        this.f5075su = this.f5060fr.m7172ri(Build.VERSION.SDK_INT, xhaVar.m7199ri(), xhaVar.m7188lr());
    }

    /* JADX INFO: renamed from: ig */
    private void m6919ig() {
        if (this.f5058dw != null) {
            return;
        }
        this.f5058dw = new Canvas();
        this.f5061ig = new RectF();
        this.f5071qd = new Matrix();
        this.srn = new Matrix();
        this.ory = new Rect();
        this.hcw = new RectF();
        this.f5069oh = new C2142ri();
        this.f5078xd = new Rect();
        this.dzy = new Rect();
        this.f5070pv = new RectF();
    }

    /* JADX INFO: renamed from: lr */
    private void m6921lr(int i, int i2) {
        Bitmap bitmap = this.f5079zf;
        if (bitmap == null || bitmap.getWidth() < i || this.f5079zf.getHeight() < i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f5079zf = bitmapCreateBitmap;
            this.f5058dw.setBitmap(bitmapCreateBitmap);
            this.f5065kt = true;
            return;
        }
        if (this.f5079zf.getWidth() > i || this.f5079zf.getHeight() > i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f5079zf, 0, 0, i, i2);
            this.f5079zf = bitmapCreateBitmap2;
            this.f5058dw.setBitmap(bitmapCreateBitmap2);
            this.f5065kt = true;
        }
    }

    /* JADX INFO: renamed from: oh */
    private boolean m6922oh() {
        return this.f5057di || this.xha;
    }

    /* JADX INFO: renamed from: pv */
    private Context m6923pv() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: qd */
    private boolean m6924qd() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    /* JADX INFO: renamed from: ri */
    private void m6926ri(Context context) {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            return;
        }
        C2065lr c2065lr = new C2065lr(this, C2049uq.m6674ri(xhaVar), xhaVar.m7180aw(), xhaVar, context);
        this.f5052ac = c2065lr;
        if (this.wjv) {
            c2065lr.mo6759ri(true);
        }
        this.f5052ac.m6757lr(this.tan);
    }

    /* JADX INFO: renamed from: ri */
    private void m6927ri(Canvas canvas) {
        C2065lr c2065lr = this.f5052ac;
        xha xhaVar = this.f5064ka;
        if (c2065lr == null || xhaVar == null) {
            return;
        }
        this.igq.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.igq.preScale(bounds.width() / xhaVar.m7187ka().width(), bounds.height() / xhaVar.m7187ka().height());
            this.igq.preTranslate(bounds.left, bounds.top);
        }
        c2065lr.mo6791ri(canvas, this.igq, this.ihz);
    }

    /* JADX INFO: renamed from: ri */
    private void m6928ri(Canvas canvas, C2065lr c2065lr) {
        if (this.f5064ka == null || c2065lr == null) {
            return;
        }
        m6919ig();
        canvas.getMatrix(this.f5071qd);
        canvas.getClipBounds(this.ory);
        m6929ri(this.ory, this.hcw);
        this.f5071qd.mapRect(this.hcw);
        m6931ri(this.hcw, this.ory);
        if (this.tan) {
            this.f5061ig.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c2065lr.mo6710ri(this.f5061ig, (Matrix) null, false);
        }
        this.f5071qd.mapRect(this.f5061ig);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        m6930ri(this.f5061ig, fWidth, fHeight);
        if (!m6924qd()) {
            this.f5061ig.intersect(this.ory.left, this.ory.top, this.ory.right, this.ory.bottom);
        }
        int iCeil = (int) Math.ceil(this.f5061ig.width());
        int iCeil2 = (int) Math.ceil(this.f5061ig.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        m6921lr(iCeil, iCeil2);
        if (this.f5065kt) {
            this.igq.set(this.f5071qd);
            this.igq.preScale(fWidth, fHeight);
            this.igq.postTranslate(-this.f5061ig.left, -this.f5061ig.top);
            this.f5079zf.eraseColor(0);
            c2065lr.mo6791ri(this.f5058dw, this.igq, this.ihz);
            this.f5071qd.invert(this.srn);
            this.srn.mapRect(this.f5070pv, this.f5061ig);
            m6931ri(this.f5070pv, this.dzy);
        }
        this.f5078xd.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f5079zf, this.f5078xd, this.dzy, this.f5069oh);
    }

    /* JADX INFO: renamed from: ri */
    private void m6929ri(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: ri */
    private void m6930ri(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    /* JADX INFO: renamed from: ri */
    private void m6931ri(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: xd */
    private C2123lr m6932xd() {
        C2123lr c2123lr = this.f5056co;
        if (c2123lr != null && !c2123lr.m7018ri(m6923pv())) {
            this.f5056co = null;
        }
        if (this.f5056co == null) {
            this.f5056co = new C2123lr(getCallback(), this.f5053aw, this.bgr, this.f5064ka.slm());
        }
        return this.f5056co;
    }

    /* JADX INFO: renamed from: ac */
    public int m6933ac() {
        return this.f5059fi.getRepeatMode();
    }

    /* JADX INFO: renamed from: aw */
    public void m6934aw() {
        if (this.f5052ac == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.7
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar) {
                    jbs.this.m6934aw();
                }
            });
            return;
        }
        hcw();
        if (m6922oh() || ihz() == 0) {
            if (isVisible()) {
                this.f5059fi.bgr();
                this.jbs = EnumC2112lr.NONE;
            } else {
                this.jbs = EnumC2112lr.RESUME;
            }
        }
        if (m6922oh()) {
            return;
        }
        m6948ik((int) (slm() < 0.0f ? bgr() : m6990vr()));
        this.f5059fi.m6570co();
        if (isVisible()) {
            return;
        }
        this.jbs = EnumC2112lr.NONE;
    }

    /* JADX INFO: renamed from: ay */
    public C2012ac m6935ay() {
        return this.f5062ik;
    }

    public float bgr() {
        return this.f5059fi.m6585vr();
    }

    /* JADX INFO: renamed from: bu */
    public void m6936bu() {
        this.f5059fi.removeAllUpdateListeners();
        this.f5059fi.addUpdateListener(this.f5074sf);
    }

    /* JADX INFO: renamed from: co */
    public void m6937co() {
        this.f5072qt.clear();
        this.f5059fi.m6570co();
        if (isVisible()) {
            return;
        }
        this.jbs = EnumC2112lr.NONE;
    }

    /* JADX INFO: renamed from: di */
    public C2127qt m6938di(String str) {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            return null;
        }
        return xhaVar.slm().get(str);
    }

    /* JADX INFO: renamed from: di */
    public tan m6939di() {
        return this.f5075su ? tan.SOFTWARE : tan.HARDWARE;
    }

    /* JADX INFO: renamed from: di */
    public void m6940di(boolean z) {
        this.f5067mj = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C2023fi.m6599ri("Drawable#draw");
        try {
            if (this.f5075su) {
                m6928ri(canvas, this.f5052ac);
            } else {
                m6927ri(canvas);
            }
        } catch (Throwable unused) {
        }
        this.f5065kt = false;
        C2023fi.m6596lr("Drawable#draw");
    }

    /* JADX INFO: renamed from: dw */
    public float m6941dw() {
        return this.f5059fi.m6571di();
    }

    /* JADX INFO: renamed from: fi */
    public Bitmap m6942fi(String str) {
        C2123lr c2123lrM6932xd = m6932xd();
        if (c2123lrM6932xd != null) {
            return c2123lrM6932xd.m7015ri(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: fi */
    public void m6943fi(int i) {
        this.f5059fi.setRepeatCount(i);
    }

    /* JADX INFO: renamed from: fi */
    public void m6944fi(boolean z) {
        this.f5054ay = z;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m6945fi() {
        return this.f5068nr;
    }

    /* JADX INFO: renamed from: fr */
    public boolean m6946fr() {
        return this.slm == null && this.f5062ik == null && this.f5064ka.bgr().size() > 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.ihz;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            return -1;
        }
        return xhaVar.m7187ka().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            return -1;
        }
        return xhaVar.m7187ka().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void igq() {
        this.f5072qt.clear();
        this.f5059fi.cancel();
        if (isVisible()) {
            return;
        }
        this.jbs = EnumC2112lr.NONE;
    }

    public int ihz() {
        return this.f5059fi.getRepeatCount();
    }

    /* JADX INFO: renamed from: ik */
    public void m6947ik(float f) {
        this.f5059fi.m6572ik(f);
    }

    /* JADX INFO: renamed from: ik */
    public void m6948ik(final int i) {
        if (this.f5064ka == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.4
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar) {
                    jbs.this.m6948ik(i);
                }
            });
        } else {
            this.f5059fi.m6580ri(i);
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m6949ik(final String str) {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.13
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar2) {
                    jbs.this.m6949ik(str);
                }
            });
            return;
        }
        C2054di c2054diM7185ik = xhaVar.m7185ik(str);
        if (c2054diM7185ik != null) {
            m6959lr((int) (c2054diM7185ik.f4795ri + c2054diM7185ik.f4794lr));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* JADX INFO: renamed from: ik */
    public void m6950ik(boolean z) {
        this.f5076uq = z;
        xha xhaVar = this.f5064ka;
        if (xhaVar != null) {
            xhaVar.m7190lr(z);
        }
    }

    /* JADX INFO: renamed from: ik */
    public boolean m6951ik() {
        return this.tan;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f5065kt) {
            return;
        }
        this.f5065kt = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m6989uq();
    }

    public boolean jbs() {
        return this.f5054ay;
    }

    /* JADX INFO: renamed from: ka */
    public String m6952ka() {
        return this.f5053aw;
    }

    /* JADX INFO: renamed from: ka */
    public void m6953ka(final float f) {
        if (this.f5064ka == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.5
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar) {
                    jbs.this.m6953ka(f);
                }
            });
            return;
        }
        C2023fi.m6599ri("Drawable#setProgress");
        this.f5059fi.m6580ri(this.f5064ka.m7193ri(f));
        C2023fi.m6596lr("Drawable#setProgress");
    }

    /* JADX INFO: renamed from: ka */
    public void m6954ka(int i) {
        this.f5059fi.setRepeatMode(i);
    }

    /* JADX INFO: renamed from: ka */
    public void m6955ka(final String str) {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.2
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar2) {
                    jbs.this.m6955ka(str);
                }
            });
            return;
        }
        C2054di c2054diM7185ik = xhaVar.m7185ik(str);
        if (c2054diM7185ik != null) {
            int i = (int) c2054diM7185ik.f4795ri;
            m6973ri(i, ((int) c2054diM7185ik.f4794lr) + i);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m6956ka(boolean z) {
        if (this.wjv == z) {
            return;
        }
        this.wjv = z;
        C2065lr c2065lr = this.f5052ac;
        if (c2065lr != null) {
            c2065lr.mo6759ri(z);
        }
    }

    /* JADX INFO: renamed from: lr */
    public C2065lr m6957lr() {
        return this.f5052ac;
    }

    /* JADX INFO: renamed from: lr */
    public void m6958lr(final float f) {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.11
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar2) {
                    jbs.this.m6958lr(f);
                }
            });
        } else {
            this.f5059fi.m6576lr(C2018fi.m6560ri(xhaVar.m7183di(), this.f5064ka.xha(), f));
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m6959lr(final int i) {
        if (this.f5064ka == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.10
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar) {
                    jbs.this.m6959lr(i);
                }
            });
        } else {
            this.f5059fi.m6576lr(i + 0.99f);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m6960lr(Animator.AnimatorListener animatorListener) {
        this.f5059fi.removeListener(animatorListener);
    }

    /* JADX INFO: renamed from: lr */
    public void m6961lr(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5059fi.removeUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: lr */
    public void m6962lr(final String str) {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.12
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar2) {
                    jbs.this.m6962lr(str);
                }
            });
            return;
        }
        C2054di c2054diM7185ik = xhaVar.m7185ik(str);
        if (c2054diM7185ik != null) {
            m6972ri((int) c2054diM7185ik.f4795ri);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* JADX INFO: renamed from: lr */
    public void m6963lr(boolean z) {
        this.f5068nr = z;
    }

    /* JADX INFO: renamed from: mj */
    public C2126nr m6964mj() {
        xha xhaVar = this.f5064ka;
        if (xhaVar != null) {
            return xhaVar.m7186ik();
        }
        return null;
    }

    /* JADX INFO: renamed from: mj */
    public void m6965mj(boolean z) {
        this.f5059fi.m6573ik(z);
    }

    /* JADX INFO: renamed from: nr */
    public void m6966nr() {
        this.f5059fi.removeAllListeners();
    }

    public RectF ory() {
        return this.f5061ig;
    }

    /* JADX INFO: renamed from: qt */
    public void m6967qt() {
        if (this.f5059fi.isRunning()) {
            this.f5059fi.cancel();
            if (!isVisible()) {
                this.jbs = EnumC2112lr.NONE;
            }
        }
        this.f5064ka = null;
        this.f5052ac = null;
        this.f5056co = null;
        this.f5059fi.m6577mj();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ri */
    public Bitmap m6968ri(String str, Bitmap bitmap) {
        C2123lr c2123lrM6932xd = m6932xd();
        if (c2123lrM6932xd == null) {
            return null;
        }
        Bitmap bitmapM7016ri = c2123lrM6932xd.m7016ri(str, bitmap);
        invalidateSelf();
        return bitmapM7016ri;
    }

    /* JADX INFO: renamed from: ri */
    public Typeface m6969ri(C2056ik c2056ik) {
        Map<String, Typeface> map = this.slm;
        if (map != null) {
            String strM6707ri = c2056ik.m6707ri();
            if (map.containsKey(strM6707ri)) {
                return map.get(strM6707ri);
            }
            String strM6706lr = c2056ik.m6706lr();
            if (map.containsKey(strM6706lr)) {
                return map.get(strM6706lr);
            }
            String str = c2056ik.m6707ri() + "-" + c2056ik.m6704ik();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C2124ri c2124riDzy = dzy();
        if (c2124riDzy != null) {
            return c2124riDzy.m7021ri(c2056ik);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public View m6970ri() {
        return this.f5063jc;
    }

    /* JADX INFO: renamed from: ri */
    public void m6971ri(final float f) {
        xha xhaVar = this.f5064ka;
        if (xhaVar == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.9
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar2) {
                    jbs.this.m6971ri(f);
                }
            });
        } else {
            m6972ri((int) C2018fi.m6560ri(xhaVar.m7183di(), this.f5064ka.xha(), f));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6972ri(final int i) {
        if (this.f5064ka == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.8
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar) {
                    jbs.this.m6972ri(i);
                }
            });
        } else {
            this.f5059fi.m6582ri(i);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6973ri(final int i, final int i2) {
        if (this.f5064ka == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.3
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar) {
                    jbs.this.m6973ri(i, i2);
                }
            });
        } else {
            this.f5059fi.m6581ri(i, i2 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6974ri(Animator.AnimatorListener animatorListener) {
        this.f5059fi.addListener(animatorListener);
    }

    /* JADX INFO: renamed from: ri */
    public void m6975ri(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5059fi.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: ri */
    public void m6976ri(View view) {
        this.f5063jc = view;
    }

    /* JADX INFO: renamed from: ri */
    public void m6977ri(C2012ac c2012ac) {
        this.f5062ik = c2012ac;
    }

    /* JADX INFO: renamed from: ri */
    public void m6978ri(C2053ik c2053ik) {
        this.f5066lr = c2053ik;
        C2124ri c2124ri = this.f5077vr;
        if (c2124ri != null) {
            c2124ri.m7022ri(c2053ik);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6979ri(InterfaceC2114ka interfaceC2114ka) {
        this.bgr = interfaceC2114ka;
        C2123lr c2123lr = this.f5056co;
        if (c2123lr != null) {
            c2123lr.m7017ri(interfaceC2114ka);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6980ri(tan tanVar) {
        this.f5060fr = tanVar;
        hcw();
    }

    /* JADX INFO: renamed from: ri */
    public void m6981ri(Boolean bool) {
        this.f5057di = bool.booleanValue();
    }

    /* JADX INFO: renamed from: ri */
    public void m6982ri(String str) {
        this.f5053aw = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m6983ri(Map<String, Typeface> map) {
        if (map == this.slm) {
            return;
        }
        this.slm = map;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ri */
    public void m6984ri(boolean z) {
        if (z != this.tan) {
            this.tan = z;
            C2065lr c2065lr = this.f5052ac;
            if (c2065lr != null) {
                c2065lr.m6757lr(z);
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m6985ri(boolean z, Context context) {
        if (this.f5055bu == z) {
            return;
        }
        this.f5055bu = z;
        if (this.f5064ka != null) {
            m6926ri(context);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m6986ri(xha xhaVar, Context context) {
        if (this.f5064ka == xhaVar) {
            return false;
        }
        this.f5065kt = true;
        m6967qt();
        this.f5064ka = xhaVar;
        m6926ri(context);
        this.f5059fi.m6583ri(xhaVar);
        m6953ka(this.f5059fi.getAnimatedFraction());
        Iterator it = new ArrayList(this.f5072qt).iterator();
        while (it.hasNext()) {
            InterfaceC2113ri interfaceC2113ri = (InterfaceC2113ri) it.next();
            if (interfaceC2113ri != null) {
                interfaceC2113ri.mo6992ri(xhaVar);
            }
            it.remove();
        }
        this.f5072qt.clear();
        xhaVar.m7190lr(this.f5076uq);
        hcw();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.ihz = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            if (this.jbs == EnumC2112lr.PLAY) {
                m6987sf();
                return visible;
            }
            if (this.jbs == EnumC2112lr.RESUME) {
                m6934aw();
                return visible;
            }
        } else {
            if (this.f5059fi.isRunning()) {
                m6991zf();
                this.jbs = EnumC2112lr.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.jbs = EnumC2112lr.NONE;
            }
        }
        return visible;
    }

    /* JADX INFO: renamed from: sf */
    public void m6987sf() {
        if (this.f5052ac == null) {
            this.f5072qt.add(new InterfaceC2113ri() { // from class: com.bytedance.adsdk.lr.jbs.6
                @Override // com.bytedance.adsdk.p065lr.jbs.InterfaceC2113ri
                /* JADX INFO: renamed from: ri */
                public void mo6992ri(xha xhaVar) {
                    jbs.this.m6987sf();
                }
            });
            return;
        }
        hcw();
        if (m6922oh() || ihz() == 0) {
            if (isVisible()) {
                this.f5059fi.m6584sf();
                this.jbs = EnumC2112lr.NONE;
            } else {
                this.jbs = EnumC2112lr.PLAY;
            }
        }
        if (m6922oh()) {
            return;
        }
        m6948ik((int) (slm() < 0.0f ? bgr() : m6990vr()));
        this.f5059fi.m6570co();
        if (isVisible()) {
            return;
        }
        this.jbs = EnumC2112lr.NONE;
    }

    public float slm() {
        return this.f5059fi.m6579qt();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m6987sf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m6937co();
    }

    /* JADX INFO: renamed from: su */
    public xha m6988su() {
        return this.f5064ka;
    }

    public int tan() {
        return (int) this.f5059fi.xha();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: renamed from: uq */
    public boolean m6989uq() {
        ChoreographerFrameCallbackC2019ik choreographerFrameCallbackC2019ik = this.f5059fi;
        if (choreographerFrameCallbackC2019ik == null) {
            return false;
        }
        return choreographerFrameCallbackC2019ik.isRunning();
    }

    /* JADX INFO: renamed from: vr */
    public float m6990vr() {
        return this.f5059fi.slm();
    }

    boolean wjv() {
        if (isVisible()) {
            return this.f5059fi.isRunning();
        }
        return this.jbs == EnumC2112lr.PLAY || this.jbs == EnumC2112lr.RESUME;
    }

    public void xha(String str) {
        this.f5073ri = str;
        C2124ri c2124riDzy = dzy();
        if (c2124riDzy != null) {
            c2124riDzy.m7023ri(str);
        }
    }

    public void xha(boolean z) {
        this.xha = z;
    }

    public boolean xha() {
        return this.f5075su;
    }

    /* JADX INFO: renamed from: zf */
    public void m6991zf() {
        this.f5072qt.clear();
        this.f5059fi.m6568aw();
        if (isVisible()) {
            return;
        }
        this.jbs = EnumC2112lr.NONE;
    }
}
