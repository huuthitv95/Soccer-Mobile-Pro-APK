package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.AbstractC8076b0;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8121g;
import com.fyber.inneractive.sdk.flow.C8124h0;
import com.fyber.inneractive.sdk.flow.C8172q0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8263d;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.measurement.tracker.EnumC8279d;
import com.fyber.inneractive.sdk.mraid.EnumC8329f0;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.p278ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.response.C9088f;
import com.fyber.inneractive.sdk.rtb.watermark.C9111b;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.AbstractC9208z;
import com.fyber.inneractive.sdk.util.C9136b0;
import com.fyber.inneractive.sdk.util.C9155h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9133a0;
import com.fyber.inneractive.sdk.web.C9248m;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.ironsource.C11341A5;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C9070n extends AbstractC8076b0 implements InterfaceC8263d, InterfaceC9133a0 {

    /* JADX INFO: renamed from: A */
    public ViewOnAttachStateChangeListenerC9067k f21214A;

    /* JADX INFO: renamed from: B */
    public ImageView f21215B;

    /* JADX INFO: renamed from: l */
    public InneractiveAdViewUnitController f21217l;

    /* JADX INFO: renamed from: m */
    public IAmraidWebViewController f21218m;

    /* JADX INFO: renamed from: n */
    public C9064h f21219n;

    /* JADX INFO: renamed from: p */
    public ViewGroup f21221p;

    /* JADX INFO: renamed from: q */
    public C9068l f21222q;

    /* JADX INFO: renamed from: s */
    public RunnableC9065i f21224s;

    /* JADX INFO: renamed from: y */
    public C9057d f21230y;

    /* JADX INFO: renamed from: z */
    public ViewOnLayoutChangeListenerC9066j f21231z;

    /* JADX INFO: renamed from: k */
    public long f21216k = 0;

    /* JADX INFO: renamed from: o */
    public boolean f21220o = false;

    /* JADX INFO: renamed from: r */
    public long f21223r = 0;

    /* JADX INFO: renamed from: t */
    public int f21225t = 0;

    /* JADX INFO: renamed from: u */
    public long f21226u = 0;

    /* JADX INFO: renamed from: v */
    public boolean f21227v = false;

    /* JADX INFO: renamed from: w */
    public boolean f21228w = true;

    /* JADX INFO: renamed from: x */
    public boolean f21229x = false;

    /* JADX INFO: renamed from: a */
    public static C9155h1 m21869a(int i, int i2, InterfaceC8041s0 interfaceC8041s0) {
        int iM21987a;
        int iM21987a2;
        C8016l0 c8016l0;
        IAlog.m21945a("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i <= 0 || i2 <= 0) {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (interfaceC8041s0 != null && (c8016l0 = ((C8028r0) interfaceC8041s0).f17813c) != null) {
                unitDisplayType = c8016l0.f17798b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                iM21987a = AbstractC9174o.m21987a(EnumC9069m.RECTANGLE_WIDTH.value);
                iM21987a2 = AbstractC9174o.m21987a(EnumC9069m.RECTANGLE_HEIGHT.value);
            } else if (AbstractC9162k.m21977m()) {
                iM21987a = AbstractC9174o.m21987a(EnumC9069m.BANNER_TABLET_WIDTH.value);
                iM21987a2 = AbstractC9174o.m21987a(EnumC9069m.BANNER_TABLET_HEIGHT.value);
            } else {
                iM21987a = AbstractC9174o.m21987a(EnumC9069m.BANNER_WIDTH.value);
                iM21987a2 = AbstractC9174o.m21987a(EnumC9069m.BANNER_HEIGHT.value);
            }
        } else {
            iM21987a = AbstractC9174o.m21987a(i);
            iM21987a2 = AbstractC9174o.m21987a(i2);
        }
        IAlog.m21949e("View layout params: final scaled width and height: %d, %d", Integer.valueOf(iM21987a), Integer.valueOf(iM21987a2));
        return new C9155h1(iM21987a, iM21987a2);
    }

    /* JADX INFO: renamed from: I */
    public final void m21870I() {
        if (this.f21224s != null) {
            IAlog.m21945a("%scancelling refreen runnable", IAlog.m21943a(this));
            AbstractC9183r.f21478b.removeCallbacks(this.f21224s);
            this.f21224s = null;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m21871J() {
        C9057d c9057d = this.f21230y;
        if (c9057d != null) {
            c9057d.f21197g = false;
            AbstractC9183r.f21478b.removeCallbacks(c9057d.f21200j);
        }
        if (this.f21218m != null) {
            m21870I();
            AbstractC8236x abstractC8236x = this.f17958b;
            if (abstractC8236x != null) {
                ((C8172q0) abstractC8236x).destroy();
            }
            this.f21218m = null;
            this.f17958b = null;
            ViewGroup viewGroup = this.f21221p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f21222q);
            }
            C9068l c9068l = this.f21222q;
            if (c9068l != null) {
                c9068l.removeAllViews();
                this.f21222q = null;
            }
        }
        this.f21227v = false;
    }

    /* JADX INFO: renamed from: K */
    public final int m21872K() {
        C8016l0 c8016l0;
        int iIntValue;
        int i = this.f21225t;
        if (i == -1) {
            IAlog.m21945a("%sreturning disable value for banner refresh", IAlog.m21943a(this));
            return 0;
        }
        if (i <= 0) {
            InterfaceC8041s0 interfaceC8041s0 = this.f17957a.getAdContent().f18376d;
            if (interfaceC8041s0 != null && (c8016l0 = ((C8028r0) interfaceC8041s0).f17813c) != null) {
                Integer num = c8016l0.f17797a;
                IAlog.m21945a("%sreturning refreshConfig = %d", IAlog.m21943a(this), num);
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            IAlog.m21945a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.m21943a(this));
            return 0;
        }
        IAlog.m21945a("%sreturning overriden refresh interval = %d", IAlog.m21943a(this), Integer.valueOf(this.f21225t));
        iIntValue = this.f21225t;
        return iIntValue * 1000;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m21873L() {
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x == null) {
            return false;
        }
        C8172q0 c8172q0 = (C8172q0) abstractC8236x;
        return (c8172q0.f18376d == null || ((C8028r0) c8172q0.f18376d).f17813c == null || ((C8028r0) c8172q0.f18376d).f17813c.f17798b == null || !((C8028r0) c8172q0.f18376d).f17813c.f17798b.isFullscreenUnit()) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public final void m21874M() {
        InneractiveAdViewUnitController inneractiveAdViewUnitController;
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f21565b == null) {
            return;
        }
        IAlog.m21945a("%srefreshing ad", IAlog.m21943a(this));
        if ((!this.f21218m.m22078p() || this.f21218m.f21585N == EnumC8329f0.RESIZED) && (inneractiveAdViewUnitController = this.f21217l) != null) {
            this.f21223r = 0L;
            inneractiveAdViewUnitController.refreshAd();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m21875N() {
        C9248m c9248m;
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController == null || (c9248m = iAmraidWebViewController.f21565b) == null || !c9248m.getIsVisible() || this.f21223r == 0 || this.f21218m.m22078p() || this.f21218m.f21585N == EnumC8329f0.RESIZED) {
            return;
        }
        if (!this.f21228w) {
            if (this.f21216k < System.currentTimeMillis() - this.f21223r) {
                this.f21226u = 1L;
            } else {
                this.f21226u = this.f21216k - (System.currentTimeMillis() - this.f21223r);
            }
        }
        IAlog.m21945a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.m21943a(this), Long.valueOf(this.f21226u));
        m21876a(false, this.f21226u);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: a */
    public final void mo20656a(int i) {
        this.f21225t = i;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: a */
    public final void mo20657a(ViewGroup viewGroup) {
        C9111b c9111b;
        int i;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C9068l c9068l;
        InneractiveAdSpot inneractiveAdSpot = this.f17957a;
        if (inneractiveAdSpot == null) {
            IAlog.m21950f("%sYou must set the spot to render before calling renderAd", IAlog.m21943a(this));
            return;
        }
        this.f21220o = false;
        this.f17961e = false;
        if (viewGroup != null) {
            this.f21221p = viewGroup;
            this.f21217l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.f21229x) {
            m21871J();
            if (!(this.f17957a.getAdContent() instanceof C8172q0)) {
                IAlog.m21950f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f17957a.getAdContent());
                return;
            }
            this.f17958b = (C8172q0) this.f17957a.getAdContent();
        }
        AbstractC8236x abstractC8236x = this.f17958b;
        IAmraidWebViewController iAmraidWebViewController = abstractC8236x != null ? ((C8172q0) abstractC8236x).f18206i : null;
        this.f21218m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.f21219n == null) {
                this.f21219n = new C9064h(this);
            }
            iAmraidWebViewController.setListener(this.f21219n);
            InneractiveAdRequest inneractiveAdRequest = ((C8172q0) this.f17958b).f18373a;
            int i2 = -1;
            if (m21873L()) {
                C9068l c9068l2 = new C9068l(this.f21221p.getContext(), 1.5f);
                this.f21222q = c9068l2;
                IAmraidWebViewController iAmraidWebViewController2 = this.f21218m;
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                C9248m c9248m = iAmraidWebViewController2.f21565b;
                if (c9248m != null) {
                    c9068l2.addView(c9248m, layoutParams);
                    AbstractC9166l0.f21461a.m21982a(c9068l2.getContext(), iAmraidWebViewController2.f21565b, iAmraidWebViewController2);
                    C9248m c9248m2 = iAmraidWebViewController2.f21565b;
                    if (c9248m2 != null) {
                        c9248m2.setTapListener(iAmraidWebViewController2);
                    }
                }
                this.f21221p.addView(this.f21222q, new ViewGroup.LayoutParams(-2, -2));
            } else {
                this.f21222q = new C9068l(this.f21221p.getContext(), 0.0f);
                C8172q0 c8172q0 = (C8172q0) this.f17958b;
                C9088f c9088f = (C9088f) c8172q0.f18374b;
                C9155h1 c9155h1M21869a = m21869a(c9088f.f21305e, c9088f.f21306f, c8172q0.f18376d);
                this.f21218m.setAdDefaultSize(c9155h1M21869a.f21454a, c9155h1M21869a.f21455b);
                IAmraidWebViewController iAmraidWebViewController3 = this.f21218m;
                View view = iAmraidWebViewController3.f21565b;
                if (view != null || AbstractC9174o.f21470a == null) {
                    ViewParent parent = view != null ? view.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    RelativeLayout.LayoutParams layoutParamsM22023a = AbstractC9195v.m22023a(c9155h1M21869a.f21454a, c9155h1M21869a.f21455b, 13);
                    IAmraidWebViewController iAmraidWebViewController4 = this.f21218m;
                    C9068l c9068l3 = this.f21222q;
                    C9248m c9248m3 = iAmraidWebViewController4.f21565b;
                    if (c9248m3 != null) {
                        c9068l3.addView(c9248m3, layoutParamsM22023a);
                        AbstractC9166l0.f21461a.m21982a(c9068l3.getContext(), iAmraidWebViewController4.f21565b, iAmraidWebViewController4);
                        C9248m c9248m4 = iAmraidWebViewController4.f21565b;
                        if (c9248m4 != null) {
                            c9248m4.setTapListener(iAmraidWebViewController4);
                        }
                    }
                    this.f21221p.addView(this.f21222q);
                    C9068l c9068l4 = this.f21222q;
                    ViewGroup.LayoutParams layoutParams2 = c9068l4.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = -2;
                    c9068l4.setLayoutParams(layoutParams2);
                    InneractiveAdSpot inneractiveAdSpot2 = this.f17957a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && (viewGroup2 = this.f21221p) != null) {
                        Context context = viewGroup2.getContext();
                        C8121g c8121g = new C8121g(context, false, this.f17957a.getAdContent().f18373a, this.f17957a.getAdContent().f18374b, this.f17957a.getAdContent().f18375c);
                        ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(C7809R.layout.ia_layout_fyber_ad_identifier_relative, this.f21221p, false);
                        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
                        IFyberAdIdentifier iFyberAdIdentifier = c8121g.f18072d;
                        iFyberAdIdentifier.f21412k = corner;
                        iFyberAdIdentifier.mo21932a(viewGroup4);
                        viewGroup4.setVisibility(0);
                        IAmraidWebViewController iAmraidWebViewController5 = this.f21218m;
                        if (iAmraidWebViewController5 == null) {
                            viewGroup3 = null;
                        } else {
                            viewGroup3 = iAmraidWebViewController5.f21565b;
                            if (viewGroup3 != null && viewGroup3.getParent() != null) {
                                viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            }
                        }
                        if (viewGroup3 != null && mo20491x() != null) {
                            ViewGroup.LayoutParams layoutParams3 = mo20491x().getLayoutParams();
                            IAmraidWebViewController iAmraidWebViewController6 = this.f21218m;
                            viewGroup3.addView(viewGroup4, layoutParams3);
                            iAmraidWebViewController6.m22069a(viewGroup4, EnumC8279d.IdentifierView);
                        }
                    }
                    InneractiveAdSpot inneractiveAdSpot3 = this.f17957a;
                    if (inneractiveAdSpot3 != null && (inneractiveAdSpot3 instanceof C8124h0) && this.f21218m != null && this.f21222q != null && view != null && (c9111b = ((C8124h0) inneractiveAdSpot3).f18085m) != null) {
                        ImageView imageView = c9111b.f21362a;
                        this.f21215B = imageView;
                        if (imageView != null) {
                            if (m21873L()) {
                                i = -1;
                            } else {
                                i2 = c9155h1M21869a.f21454a;
                                i = c9155h1M21869a.f21455b;
                            }
                            if (this.f21231z == null) {
                                ViewOnLayoutChangeListenerC9066j viewOnLayoutChangeListenerC9066j = new ViewOnLayoutChangeListenerC9066j(this);
                                this.f21231z = viewOnLayoutChangeListenerC9066j;
                                view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC9066j);
                            }
                            if (this.f21214A == null) {
                                ViewOnAttachStateChangeListenerC9067k viewOnAttachStateChangeListenerC9067k = new ViewOnAttachStateChangeListenerC9067k(this);
                                this.f21214A = viewOnAttachStateChangeListenerC9067k;
                                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC9067k);
                            }
                            this.f21215B.setLayoutParams(AbstractC9195v.m22023a(i2, i, 13));
                            this.f21222q.addView(this.f21215B);
                            IAmraidWebViewController iAmraidWebViewController7 = this.f21218m;
                            C9155h1 c9155h1 = new C9155h1(i2, i);
                            iAmraidWebViewController7.f21612o0 = c9111b;
                            iAmraidWebViewController7.f21613p0 = c9155h1;
                            ImageView imageView2 = c9111b.f21362a;
                            if (imageView2 != null) {
                                iAmraidWebViewController7.m22069a(imageView2, EnumC8279d.Watermark);
                            }
                        }
                    }
                } else if (this.f21229x) {
                    FrameLayout frameLayout = new FrameLayout(this.f21221p.getContext());
                    frameLayout.setBackgroundResource(C7809R.color.ia_blank_background);
                    this.f21221p.removeAllViews();
                    this.f21221p.addView(frameLayout, new FrameLayout.LayoutParams(c9155h1M21869a.f21454a, c9155h1M21869a.f21455b, 17));
                } else {
                    this.f21229x = true;
                    iAmraidWebViewController3.f21565b = iAmraidWebViewController3.m22058a(((C8172q0) this.f17958b).f18375c);
                    try {
                        iAmraidWebViewController3.mo22063h();
                        iAmraidWebViewController3.f21565b.loadDataWithBaseURL(iAmraidWebViewController3.f21579p, iAmraidWebViewController3.f21580q, "text/html", C11341A5.f23802O, null);
                    } catch (Throwable unused) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f21221p.getContext());
                        frameLayout2.setBackgroundResource(C7809R.color.ia_blank_background);
                        this.f21221p.removeAllViews();
                        this.f21221p.addView(frameLayout2, new FrameLayout.LayoutParams(c9155h1M21869a.f21454a, c9155h1M21869a.f21455b, 17));
                    }
                }
            }
            AbstractC8236x abstractC8236x2 = this.f17958b;
            C9088f c9088f2 = abstractC8236x2 != null ? (C9088f) ((C8172q0) abstractC8236x2).f18374b : null;
            if (c9088f2 != null && (c9068l = this.f21222q) != null) {
                C9057d c9057d = new C9057d(c9088f2, c9068l, new C9063g(this));
                this.f21230y = c9057d;
                c9057d.f21198h = false;
                c9057d.f21194d = 1;
                c9057d.f21195e = 0.0f;
                int i3 = c9088f2.f21319s;
                if (i3 >= 1) {
                    c9057d.f21194d = Math.min(i3, 100);
                }
                float f = c9088f2.f21320t;
                if (f >= -1.0f) {
                    c9057d.f21195e = f;
                }
                if (c9057d.f21195e >= 0.0f) {
                    IAlog.m21945a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    c9057d.f21193c = 0.0f;
                    c9057d.f21196f = System.currentTimeMillis();
                    c9057d.f21197g = true;
                    c9057d.m21860a();
                }
            }
        } else {
            IAlog.m21950f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", abstractC8236x);
        }
        C9136b0 c9136b0 = AbstractC9208z.f21514a;
        if (c9136b0.f21435a.contains(this)) {
            return;
        }
        c9136b0.f21435a.add(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m21876a(boolean z, long j) {
        IAmraidWebViewController iAmraidWebViewController;
        C9248m c9248m;
        if (!TextUtils.isEmpty(this.f17957a.getMediationNameString()) || j == 0 || (this.f17957a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.f21225t == -1 || (iAmraidWebViewController = this.f21218m) == null || (c9248m = iAmraidWebViewController.f21565b) == null) {
            return;
        }
        if (!c9248m.getIsVisible()) {
            IAlog.m21945a("%sstartRefreshTimer called but ad is not visible", IAlog.m21943a(this));
            return;
        }
        this.f21223r = System.currentTimeMillis();
        this.f21216k = z ? this.f21216k : j;
        IAlog.m21945a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.m21943a(this), Long.valueOf(j), Long.valueOf(this.f21216k));
        if (j <= 1) {
            m21874M();
            return;
        }
        RunnableC9065i runnableC9065i = this.f21224s;
        if (runnableC9065i != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC9065i);
        }
        m21870I();
        RunnableC9065i runnableC9065i2 = new RunnableC9065i(this);
        this.f21224s = runnableC9065i2;
        AbstractC9183r.f21478b.postDelayed(runnableC9065i2, j);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: a */
    public final boolean mo20658a(AbstractC8236x abstractC8236x) {
        return abstractC8236x instanceof C8172q0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: b */
    public final boolean mo20659b(View view) {
        return view != null && view.equals(this.f21221p);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.m22078p() || this.f21218m.f21585N == EnumC8329f0.RESIZED) ? false : true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: d */
    public final int mo20660d() {
        return this.f21218m.f21601d0;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: d */
    public final void mo20485d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.m22069a(view, EnumC8279d.ProgressOverlay);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21877d(boolean z) {
        if (this.f21224s != null) {
            this.f21228w = z;
            m21870I();
            this.f21226u = this.f21216k - (System.currentTimeMillis() - this.f21223r);
            IAlog.m21945a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.m21943a(this), Long.valueOf(this.f21226u), Long.valueOf(this.f21216k));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        C9248m c9248m;
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController != null && (c9248m = iAmraidWebViewController.f21565b) != null) {
            ViewOnLayoutChangeListenerC9066j viewOnLayoutChangeListenerC9066j = this.f21231z;
            if (viewOnLayoutChangeListenerC9066j != null) {
                c9248m.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC9066j);
            }
            ViewOnAttachStateChangeListenerC9067k viewOnAttachStateChangeListenerC9067k = this.f21214A;
            if (viewOnAttachStateChangeListenerC9067k != null) {
                c9248m.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC9067k);
            }
        }
        this.f21215B = null;
        m21870I();
        m21871J();
        this.f21219n = null;
        AbstractC9208z.f21514a.f21435a.remove(this);
        RunnableC9065i runnableC9065i = this.f21224s;
        if (runnableC9065i != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC9065i);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: e */
    public final void mo20486e(View view) {
        AbstractC8280e abstractC8280e;
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController == null || (abstractC8280e = iAmraidWebViewController.f21622I) == null) {
            return;
        }
        try {
            AdSession adSession = abstractC8280e.f18458a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: l */
    public final void mo20661l() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: n */
    public final int mo20662n() {
        return this.f21218m.f21602e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: p */
    public final void mo20663p() {
        C9248m c9248m;
        IAlog.m21945a("%sgot onAdRefreshFailed", IAlog.m21943a(this));
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController == null || (c9248m = iAmraidWebViewController.f21565b) == null) {
            return;
        }
        if (!c9248m.getIsVisible() || AbstractC9208z.f21514a.f21436b || this.f21218m.m22078p() || this.f21218m.f21585N == EnumC8329f0.RESIZED) {
            IAlog.m21945a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.m21943a(this));
            this.f21226u = 1L;
            return;
        }
        IAlog.m21945a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.m21943a(this));
        long jM21872K = m21872K();
        this.f21216k = jM21872K;
        if (jM21872K != 0) {
            m21876a(false, 10000L);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: q */
    public final void mo20664q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: s */
    public final void mo20665s() {
        C9057d c9057d = this.f21230y;
        if (c9057d != null) {
            c9057d.f21197g = false;
            AbstractC9183r.f21478b.removeCallbacks(c9057d.f21200j);
        }
        C9068l c9068l = this.f21222q;
        if (c9068l != null) {
            c9068l.removeAllViews();
            this.f21222q = null;
        }
        ViewGroup viewGroup = this.f21221p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f21221p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: x */
    public final View mo20491x() {
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.f21565b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: y */
    public final int mo20492y() {
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f21565b == null || !iAmraidWebViewController.m22078p()) ? AbstractC9174o.m22001c(this.f21218m.f21602e0) : AbstractC9174o.m22001c(this.f21218m.f21565b.getHeight());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: z */
    public final int mo20493z() {
        IAmraidWebViewController iAmraidWebViewController = this.f21218m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f21565b == null || !iAmraidWebViewController.m22078p()) ? AbstractC9174o.m22001c(this.f21218m.f21601d0) : AbstractC9174o.m22001c(this.f21218m.f21565b.getWidth());
        }
        return -1;
    }
}
