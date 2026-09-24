package com.bytedance.adsdk.ugeno.p090di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.p090di.p091lr.C2252ik;
import com.bytedance.adsdk.ugeno.p090di.p091lr.C2253ka;
import com.bytedance.adsdk.ugeno.p090di.p091lr.C2254lr;
import com.bytedance.adsdk.ugeno.p090di.p091lr.C2255ri;
import com.bytedance.adsdk.ugeno.p090di.p092ri.AbstractC2259ri;
import com.bytedance.adsdk.ugeno.p090di.p092ri.C2257ik;
import com.bytedance.adsdk.ugeno.p090di.p092ri.C2258lr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p107mj.AbstractC2322lr;
import com.bytedance.adsdk.ugeno.p107mj.C2321ik;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2256ri<T> extends FrameLayout implements C2321ik.ka {
    private static final Interpolator igq = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.di.ri.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* JADX INFO: renamed from: ac */
    private int f5596ac;

    /* JADX INFO: renamed from: aw */
    private boolean f5597aw;

    /* JADX INFO: renamed from: ay */
    private ri f5598ay;
    private boolean bgr;

    /* JADX INFO: renamed from: bu */
    private boolean f5599bu;

    /* JADX INFO: renamed from: co */
    private boolean f5600co;

    /* JADX INFO: renamed from: di */
    private int f5601di;

    /* JADX INFO: renamed from: dw */
    private final Runnable f5602dw;

    /* JADX INFO: renamed from: fi */
    private int f5603fi;

    /* JADX INFO: renamed from: fr */
    private InterfaceC2249ik f5604fr;
    private int ihz;

    /* JADX INFO: renamed from: ik */
    protected Context f5605ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private int f5606ka;

    /* JADX INFO: renamed from: lr */
    protected C2321ik f5607lr;

    /* JADX INFO: renamed from: mj */
    private int f5608mj;

    /* JADX INFO: renamed from: nr */
    private int f5609nr;

    /* JADX INFO: renamed from: qt */
    private String f5610qt;

    /* JADX INFO: renamed from: ri */
    protected List<T> f5611ri;

    /* JADX INFO: renamed from: sf */
    private float f5612sf;
    private boolean slm;

    /* JADX INFO: renamed from: su */
    private Scroller f5613su;
    private int tan;

    /* JADX INFO: renamed from: uq */
    private FrameLayout f5614uq;

    /* JADX INFO: renamed from: vr */
    private boolean f5615vr;
    private AbstractC2259ri wjv;
    private int xha;

    /* JADX INFO: renamed from: zf */
    private final Runnable f5616zf;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.ri$ik */
    public class ik extends C2321ik {
        public ik(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: ri */
        private MotionEvent m7521ri(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!AbstractC2256ri.this.f5615vr) {
                return false;
            }
            try {
                if (AbstractC2256ri.this.ihz != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(m7521ri(motionEvent));
                m7521ri(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!AbstractC2256ri.this.f5615vr) {
                return false;
            }
            try {
                return AbstractC2256ri.this.ihz == 1 ? super.onTouchEvent(m7521ri(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.ri$lr */
    private class lr extends Scroller {
        public lr(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, AbstractC2256ri.this.f5601di);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, AbstractC2256ri.this.f5601di);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.ri$ri */
    class ri extends AbstractC2322lr {
        ri() {
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.AbstractC2322lr
        /* JADX INFO: renamed from: ri */
        public float mo7522ri(int i) {
            if (AbstractC2256ri.this.f5612sf <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / AbstractC2256ri.this.f5612sf;
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.AbstractC2322lr
        /* JADX INFO: renamed from: ri */
        public int mo7523ri() {
            if (AbstractC2256ri.this.bgr) {
                return 1024;
            }
            return AbstractC2256ri.this.f5611ri.size();
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.AbstractC2322lr
        /* JADX INFO: renamed from: ri */
        public int mo7524ri(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.AbstractC2322lr
        /* JADX INFO: renamed from: ri */
        public Object mo7525ri(ViewGroup viewGroup, int i) {
            View viewM7511ri = AbstractC2256ri.this.m7511ri(i, C2250ka.m7474ri(AbstractC2256ri.this.bgr, i, AbstractC2256ri.this.f5611ri.size()));
            viewGroup.addView(viewM7511ri);
            return viewM7511ri;
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.AbstractC2322lr
        /* JADX INFO: renamed from: ri */
        public void mo7526ri(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.p107mj.AbstractC2322lr
        /* JADX INFO: renamed from: ri */
        public boolean mo7527ri(View view, Object obj) {
            return view == obj;
        }
    }

    public AbstractC2256ri(Context context) {
        super(context);
        this.f5611ri = new CopyOnWriteArrayList();
        this.f5606ka = 2000;
        this.f5603fi = 500;
        this.f5601di = 500;
        this.xha = 0;
        this.f5608mj = -1;
        this.jbs = -1;
        this.f5610qt = Constants.NORMAL;
        this.f5612sf = 1.0f;
        this.f5600co = true;
        this.f5597aw = true;
        this.bgr = true;
        this.f5615vr = true;
        this.f5609nr = 0;
        this.tan = 0;
        this.f5596ac = 0;
        this.ihz = 0;
        this.f5616zf = new Runnable() { // from class: com.bytedance.adsdk.ugeno.di.ri.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = AbstractC2256ri.this.f5607lr.getCurrentItem() + 1;
                if (AbstractC2256ri.this.bgr) {
                    if (currentItem >= 1024) {
                        AbstractC2256ri.this.f5607lr.m7926ri(512, false);
                        return;
                    } else {
                        AbstractC2256ri.this.f5607lr.m7926ri(currentItem, true);
                        return;
                    }
                }
                AbstractC2322lr adapter = AbstractC2256ri.this.f5607lr.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.mo7523ri()) {
                        AbstractC2256ri.this.f5607lr.m7926ri(0, false);
                    } else {
                        AbstractC2256ri.this.f5607lr.m7926ri(currentItem, true);
                    }
                }
            }
        };
        this.f5602dw = new Runnable() { // from class: com.bytedance.adsdk.ugeno.di.ri.3
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC2256ri.this.f5597aw) {
                    int currentItem = AbstractC2256ri.this.f5607lr.getCurrentItem() + 1;
                    if (AbstractC2256ri.this.bgr) {
                        if (currentItem >= 1024) {
                            AbstractC2256ri.this.f5607lr.m7926ri(512, false);
                        } else {
                            AbstractC2256ri.this.f5607lr.m7926ri(currentItem, true);
                        }
                        AbstractC2256ri abstractC2256ri = AbstractC2256ri.this;
                        abstractC2256ri.postDelayed(abstractC2256ri.f5602dw, AbstractC2256ri.this.f5606ka);
                        return;
                    }
                    AbstractC2322lr adapter = AbstractC2256ri.this.f5607lr.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.mo7523ri()) {
                            AbstractC2256ri.this.f5607lr.m7926ri(0, false);
                            AbstractC2256ri abstractC2256ri2 = AbstractC2256ri.this;
                            abstractC2256ri2.postDelayed(abstractC2256ri2.f5602dw, AbstractC2256ri.this.f5606ka);
                        } else {
                            AbstractC2256ri.this.f5607lr.m7926ri(currentItem, true);
                            AbstractC2256ri abstractC2256ri3 = AbstractC2256ri.this;
                            abstractC2256ri3.postDelayed(abstractC2256ri3.f5602dw, AbstractC2256ri.this.f5606ka);
                        }
                    }
                }
            }
        };
        this.f5605ik = context;
        this.f5614uq = new FrameLayout(context);
        this.f5607lr = m7517ri();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f5614uq.addView(this.f5607lr, layoutParams);
        addView(this.f5614uq);
    }

    /* JADX INFO: renamed from: ri */
    private void m7486ri(int i, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t = this.f5611ri.get(C2250ka.m7474ri(true, i, this.f5611ri.size()));
            if (t == null) {
                return;
            }
            if (t instanceof AbstractViewOnTouchListenerC2318ik) {
                viewFindViewWithTag = ((AbstractViewOnTouchListenerC2318ik) t).m7879sf();
            } else if (t instanceof View) {
                viewFindViewWithTag = (View) t;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }

    private boolean xha() {
        return this.f5611ri.size() <= 2 && this.bgr;
    }

    /* JADX INFO: renamed from: aw */
    public void m7488aw(int i) {
        m7519ri(this.f5610qt, this.xha, this.f5608mj, this.jbs, true);
        if (this.f5598ay == null) {
            this.f5598ay = new ri();
            this.f5607lr.m7929ri((C2321ik.ka) this);
            this.f5607lr.setAdapter(this.f5598ay);
        }
        if (this.bgr) {
            if (i >= 1024) {
                this.f5607lr.m7926ri(512, false);
                return;
            } else {
                this.f5607lr.m7926ri(i, true);
                return;
            }
        }
        if (i < 0 || i >= this.f5611ri.size()) {
            return;
        }
        this.f5607lr.m7926ri(i, true);
    }

    @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik.ka
    /* JADX INFO: renamed from: co */
    public void mo7489co(int i) {
        if (i == 1 && this.slm) {
            m7491di();
        }
        InterfaceC2249ik interfaceC2249ik = this.f5604fr;
        if (interfaceC2249ik != null) {
            interfaceC2249ik.mo7471ri(this.bgr, i);
        }
    }

    /* JADX INFO: renamed from: di */
    public AbstractC2256ri m7490di(int i) {
        this.wjv.setUnSelectedColor(i);
        return this;
    }

    /* JADX INFO: renamed from: di */
    public void m7491di() {
        removeCallbacks(this.f5602dw);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5597aw) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.slm) {
                    m7495fi();
                }
            } else if (action == 0) {
                m7491di();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: fi */
    public AbstractC2256ri m7492fi(float f) {
        this.f5612sf = f;
        return this;
    }

    /* JADX INFO: renamed from: fi */
    public AbstractC2256ri m7493fi(int i) {
        this.wjv.setSelectedColor(i);
        return this;
    }

    /* JADX INFO: renamed from: fi */
    public AbstractC2256ri m7494fi(boolean z) {
        this.slm = z;
        return this;
    }

    /* JADX INFO: renamed from: fi */
    public void m7495fi() {
        removeCallbacks(this.f5602dw);
        postDelayed(this.f5602dw, this.f5606ka);
    }

    public AbstractC2322lr getAdapter() {
        return this.f5607lr.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5607lr.getCurrentItem();
    }

    public C2321ik getViewPager() {
        return this.f5607lr;
    }

    /* JADX INFO: renamed from: ik */
    public AbstractC2256ri m7496ik(float f) {
        this.wjv.setIndicatorX(f);
        return this;
    }

    /* JADX INFO: renamed from: ik */
    public AbstractC2256ri m7497ik(int i) {
        this.f5601di = i;
        if (this.f5613su == null) {
            this.f5613su = new lr(this.f5605ik, igq);
        }
        this.f5607lr.setScroller(this.f5613su);
        return this;
    }

    /* JADX INFO: renamed from: ik */
    public AbstractC2256ri m7498ik(String str) {
        this.f5610qt = str;
        m7519ri(str, this.xha, this.f5608mj, this.jbs, true);
        return this;
    }

    /* JADX INFO: renamed from: ik */
    public AbstractC2256ri m7499ik(boolean z) {
        this.f5600co = z;
        return this;
    }

    /* JADX INFO: renamed from: ik */
    public void m7500ik() {
        m7519ri(this.f5610qt, this.xha, this.f5608mj, this.jbs, true);
        if (this.f5598ay == null) {
            this.f5598ay = new ri();
            this.f5607lr.m7929ri((C2321ik.ka) this);
            this.f5607lr.setAdapter(this.f5598ay);
        }
        int i = this.f5609nr;
        if (i < 0 || i >= this.f5611ri.size()) {
            this.f5609nr = 0;
        }
        int i2 = this.bgr ? this.f5609nr + 512 : this.f5609nr;
        this.f5607lr.m7926ri(i2, true);
        if (!this.bgr) {
            mo7520sf(i2);
        }
        if (this.f5597aw) {
            m7495fi();
        }
    }

    public AbstractC2256ri jbs(int i) {
        this.jbs = i;
        m7519ri(this.f5610qt, this.xha, this.f5608mj, i, true);
        return this;
    }

    /* JADX INFO: renamed from: ka */
    public AbstractC2256ri m7501ka(float f) {
        this.wjv.setIndicatorY(f);
        return this;
    }

    /* JADX INFO: renamed from: ka */
    public AbstractC2256ri m7502ka(int i) {
        this.f5606ka = i;
        m7495fi();
        return this;
    }

    /* JADX INFO: renamed from: ka */
    public AbstractC2256ri m7503ka(boolean z) {
        this.wjv.setLoop(z);
        if (this.bgr != z) {
            int iM7474ri = C2250ka.m7474ri(z, this.f5607lr.getCurrentItem(), this.f5611ri.size());
            this.bgr = z;
            ri riVar = this.f5598ay;
            if (riVar != null) {
                riVar.m7939ik();
                this.f5607lr.setCurrentItem(iM7474ri);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ka */
    public void m7504ka() {
        m7491di();
        if (this.f5598ay != null) {
            this.f5607lr.m7918lr((C2321ik.ka) this);
            this.f5607lr.setAdapter(null);
            this.f5598ay = null;
            this.f5607lr.removeAllViews();
            this.f5611ri.clear();
            this.wjv.m7531ik();
        }
    }

    /* JADX INFO: renamed from: lr */
    public AbstractC2256ri m7505lr() {
        this.wjv.m7533ri();
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public AbstractC2256ri m7506lr(float f) {
        this.wjv.setIndicatorHeight((int) f);
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public AbstractC2256ri m7507lr(int i) {
        this.f5603fi = i;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public AbstractC2256ri m7508lr(String str) {
        this.wjv.setIndicatorDirection(str);
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public AbstractC2256ri m7509lr(boolean z) {
        this.f5615vr = z;
        return this;
    }

    /* JADX INFO: renamed from: mj */
    public AbstractC2256ri<T> m7510mj(int i) {
        this.f5608mj = i;
        m7519ri(this.f5610qt, this.xha, i, this.jbs, true);
        return this;
    }

    /* JADX INFO: renamed from: qt */
    public abstract View mo7476qt(int i);

    /* JADX INFO: renamed from: ri */
    public View m7511ri(int i, int i2) {
        if (this.f5611ri.size() == 0) {
            return new View(getContext());
        }
        View viewMo7476qt = mo7476qt(i2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewMo7476qt instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (xha()) {
            viewMo7476qt.setTag("two_items_tag");
        }
        if (viewMo7476qt.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewMo7476qt.getParent()).removeView(viewMo7476qt);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewMo7476qt, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (xha()) {
            frameLayout.setTag(Integer.valueOf(i));
        }
        return frameLayout;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC2256ri m7512ri(float f) {
        this.wjv.setIndicatorWidth((int) f);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC2256ri m7513ri(int i) {
        this.ihz = i;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC2256ri<T> m7514ri(T t) {
        if (t != null) {
            this.f5611ri.add(t);
            if (this.f5600co) {
                this.wjv.m7532lr();
            }
        }
        ri riVar = this.f5598ay;
        if (riVar != null) {
            riVar.m7939ik();
            this.wjv.m7535ri(this.f5609nr, this.f5607lr.getCurrentItem());
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC2256ri m7515ri(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.wjv = new C2257ik(this.f5605ik);
        } else {
            this.wjv = new C2258lr(this.f5605ik);
        }
        addView(this.wjv, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractC2256ri m7516ri(boolean z) {
        this.f5597aw = z;
        m7495fi();
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2321ik m7517ri() {
        return new ik(getContext());
    }

    @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik.ka
    /* JADX INFO: renamed from: ri */
    public void mo7518ri(int i, float f, int i2) {
        InterfaceC2249ik interfaceC2249ik = this.f5604fr;
        if (interfaceC2249ik != null) {
            boolean z = this.bgr;
            interfaceC2249ik.mo7472ri(z, C2250ka.m7474ri(z, i, this.f5611ri.size()), f, i2);
        }
        if (xha()) {
            m7486ri(i, findViewWithTag(Integer.valueOf(i)));
            if (f > 0.0f) {
                int i3 = i + 1;
                m7486ri(i3, findViewWithTag(Integer.valueOf(i3)));
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7519ri(String str, int i, int i2, int i3, boolean z) {
        ri riVar = this.f5598ay;
        if (riVar != null) {
            riVar.m7939ik();
        }
        this.f5607lr.setPageMargin(i);
        if (i2 > 0 || i3 > 0) {
            if (this.ihz == 1) {
                this.f5607lr.setPadding(0, i2 + i, 0, i3 + i);
            } else {
                this.f5607lr.setPadding(i2 + i, 0, i3 + i, 0);
            }
            this.f5614uq.setClipChildren(false);
            this.f5607lr.setClipChildren(false);
            this.f5607lr.setClipToPadding(false);
        }
        if (this.ihz == 1) {
            C2253ka c2253ka = new C2253ka();
            c2253ka.m7479ri(str);
            this.f5607lr.m7930ri(true, (C2321ik.fi) c2253ka);
            this.f5607lr.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.f5607lr.m7930ri(false, (C2321ik.fi) new C2252ik());
        } else if (TextUtils.equals(str, "cube")) {
            this.f5607lr.m7930ri(false, (C2321ik.fi) new C2255ri());
        } else if (TextUtils.equals(str, "fade")) {
            this.f5607lr.m7930ri(false, (C2321ik.fi) new C2254lr());
        } else {
            this.f5607lr.m7930ri(false, (C2321ik.fi) null);
        }
        this.f5607lr.setOffscreenPageLimit((int) this.f5612sf);
    }

    public void setOnPageChangeListener(InterfaceC2249ik interfaceC2249ik) {
        this.f5604fr = interfaceC2249ik;
    }

    public void setTwoItems(boolean z) {
        this.f5599bu = z;
    }

    @Override // com.bytedance.adsdk.ugeno.p107mj.C2321ik.ka
    /* JADX INFO: renamed from: sf */
    public void mo7520sf(int i) {
        int i2;
        if (this.f5604fr != null) {
            int iM7474ri = C2250ka.m7474ri(this.bgr, i, this.f5611ri.size());
            i2 = i;
            this.f5604fr.mo7473ri(this.bgr, iM7474ri, i2, iM7474ri == 0, iM7474ri == this.f5611ri.size() - 1);
        } else {
            i2 = i;
        }
        if (this.f5600co) {
            this.wjv.m7534ri(i2);
        }
    }

    public AbstractC2256ri xha(int i) {
        this.xha = i;
        m7519ri(this.f5610qt, i, this.f5608mj, this.jbs, true);
        return this;
    }
}
