package com.bytedance.sdk.openadsdk.core.p221ka;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.C3269mj;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.jbs.jbs;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p252ri.p258ri.InterfaceC3514lr;
import com.bytedance.sdk.openadsdk.tan.p262ik.C3534ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.srn;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3263ri {
    private boolean bgr;

    /* JADX INFO: renamed from: co */
    private xha f11010co;

    /* JADX INFO: renamed from: di */
    private final Context f11011di;

    /* JADX INFO: renamed from: fi */
    private PAGBannerAdWrapperListener f11012fi;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    private wjv f11014ka;

    /* JADX INFO: renamed from: lr */
    protected AdSlot f11015lr;

    /* JADX INFO: renamed from: mj */
    private final boolean f11016mj;

    /* JADX INFO: renamed from: qt */
    private InterfaceC3370ik f11018qt;

    /* JADX INFO: renamed from: ri */
    protected C3260ka f11019ri;

    /* JADX INFO: renamed from: sf */
    private C3222ac f11020sf;
    private long tan;

    /* JADX INFO: renamed from: ik */
    private String f11013ik = "banner_ad";
    private long xha = 0;

    /* JADX INFO: renamed from: aw */
    private final AtomicBoolean f11008aw = new AtomicBoolean(false);

    /* JADX INFO: renamed from: vr */
    private final int f11021vr = 1;
    private final int slm = 0;

    /* JADX INFO: renamed from: bu */
    private int f11009bu = -1;

    /* JADX INFO: renamed from: nr */
    private final View.OnAttachStateChangeListener f11017nr = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (C3263ri.this.f11009bu == 0 || C3263ri.this.jbs) {
                return;
            }
            C3263ri c3263ri = C3263ri.this;
            c3263ri.m13859ri(c3263ri.f11019ri.getCurView(), C3263ri.this.f11014ka);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (C3263ri.this.bgr) {
                C3263ri.this.f11009bu = 0;
            } else {
                C3263ri.this.m13868di();
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.ri$ri */
    private static class ri extends AbstractRunnableC2676ik {

        /* JADX INFO: renamed from: ik */
        WeakReference<C3263ri> f11042ik;

        /* JADX INFO: renamed from: lr */
        wjv f11043lr;

        /* JADX INFO: renamed from: ri */
        boolean f11044ri;

        ri(boolean z, wjv wjvVar, C3263ri c3263ri) {
            super("ReportWindowFocusChangedAdShow");
            this.f11044ri = z;
            this.f11043lr = wjvVar;
            this.f11042ik = new WeakReference<>(c3263ri);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<C3263ri> weakReference = this.f11042ik;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f11042ik.get().m13848lr(this.f11044ri, this.f11043lr);
        }
    }

    public C3263ri(Context context, wjv wjvVar, AdSlot adSlot, xha xhaVar, boolean z) {
        this.bgr = false;
        this.f11011di = context;
        this.f11014ka = wjvVar;
        this.f11015lr = adSlot;
        this.f11010co = xhaVar;
        this.bgr = z;
        m13857ri(context, wjvVar, adSlot);
        this.f11016mj = false;
        this.jbs = false;
    }

    /* JADX INFO: renamed from: co */
    private void m13841co() {
        this.f11014ka.m14489ri(SystemClock.elapsedRealtime());
        this.f11019ri.m13817fi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13847lr(wjv wjvVar) {
        if (this.xha <= 0 || wjvVar == null) {
            return;
        }
        try {
            if (this.f11020sf != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.xha);
                this.xha = 0L;
                C3414ik.m15564ri(strValueOf, wjvVar, this.f11013ik, this.f11020sf.getAdShowTime());
            }
        } catch (Exception e) {
            C2707ac.m10196ik("PAGBannerAdImpl", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13848lr(boolean z, wjv wjvVar) {
        try {
            if (z) {
                this.xha = System.currentTimeMillis();
            } else {
                if (this.xha <= 0 || this.f11020sf == null) {
                    return;
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.xha);
                this.xha = 0L;
                C3414ik.m15564ri(strValueOf, wjvVar, this.f11013ik, this.f11020sf.getAdShowTime());
            }
        } catch (Exception e) {
            C2707ac.m10196ik("PAGBannerAdImpl", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: qt */
    public void m13852qt() {
        m13841co();
    }

    /* JADX INFO: renamed from: ri */
    private C3269mj m13855ri(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof C3269mj) {
                    return (C3269mj) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private InterfaceC3370ik m13856ri(wjv wjvVar) {
        if (wjvVar.adz() == 4) {
            return C3371ka.m15240ri(this.f11011di, this.f11013ik);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private void m13857ri(Context context, wjv wjvVar, AdSlot adSlot) {
        if (wjvVar.m14389eu() != null) {
            C3255ik c3255ik = new C3255ik(context, wjvVar, adSlot, this.bgr);
            this.f11019ri = c3255ik;
            c3255ik.addOnAttachStateChangeListener(this.f11017nr);
        } else {
            C3260ka c3260ka = new C3260ka(context, wjvVar, adSlot, this.bgr);
            this.f11019ri = c3260ka;
            c3260ka.addOnAttachStateChangeListener(this.f11017nr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13858ri(View view, C3222ac c3222ac, wjv wjvVar, String str, xha.InterfaceC3266ri interfaceC3266ri) {
        C3304qt.m14669lr().m14698ri(str, interfaceC3266ri);
        this.xha = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (c3222ac != null) {
                jSONObject.put("dynamic_show_type", c3222ac.getDynamicShowType());
                c3222ac.m13574ri(jSONObject, wjvVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            C3414ik.m15558ri(wjvVar, this.f11013ik, jSONObject, (JSONObject) null);
            C2897ik.m11145ri(wjvVar);
        } catch (JSONException unused2) {
            C2707ac.m10196ik("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.f11012fi;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, wjvVar.adz());
        }
        if (wjvVar.m14384du()) {
            C3571ig.m16481ri(wjvVar, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13859ri(final C3222ac c3222ac, final wjv wjvVar) {
        C3263ri c3263ri;
        wjv wjvVar2;
        final C3222ac c3222ac2;
        C3269mj c3269mj;
        if (c3222ac == null || wjvVar == null) {
            return;
        }
        this.f11014ka = wjvVar;
        this.f11018qt = m13856ri(wjvVar);
        this.f11020sf = c3222ac;
        final String strM16658ri = C3593su.m16658ri();
        final xha.InterfaceC3266ri interfaceC3266riM13866sf = m13866sf();
        c3222ac.setClosedListenerKey(strM16658ri);
        c3222ac.setBannerClickClosedListener(interfaceC3266riM13866sf);
        c3222ac.setBackupListener(new InterfaceC2504ik() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.2
            @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik
            /* JADX INFO: renamed from: ri */
            public boolean mo8984ri(ViewGroup viewGroup, int i) {
                try {
                    c3222ac.m13566ac();
                    if (!C3263ri.this.f11014ka.m14576zz()) {
                        C3261lr c3261lr = new C3261lr(c3222ac.getContext());
                        c3261lr.setClosedListenerKey(strM16658ri);
                        c3261lr.m13839ri(C3263ri.this.f11014ka, c3222ac, C3263ri.this.f11018qt);
                        c3261lr.setAdInteractionListener(C3263ri.this.f11012fi);
                        return true;
                    }
                    jbs jbsVar = new jbs(c3222ac.getContext());
                    jbsVar.setClosedListenerKey(strM16658ri);
                    jbsVar.m13815ri(C3263ri.this.f11014ka, c3222ac, C3263ri.this.f11018qt);
                    jbsVar.setAdInteractionListener(C3263ri.this.f11012fi);
                    c3222ac.setVastVideoHelper(jbsVar);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (this.f11016mj) {
            boolean zM13885ri = this.f11010co.m13885ri();
            srn.InterfaceC3591lr interfaceC3591lr = new srn.InterfaceC3591lr() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.4
                @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
                /* JADX INFO: renamed from: lr */
                public void mo13024lr() {
                    C3263ri c3263ri2 = C3263ri.this;
                    c3263ri2.m13847lr(c3263ri2.f11014ka);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
                /* JADX INFO: renamed from: ri */
                public void mo13025ri() {
                    if (C3263ri.this.f11009bu != 0) {
                        C3263ri.this.m13852qt();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
                /* JADX INFO: renamed from: ri */
                public void mo13026ri(View view, boolean z) {
                    if (!z) {
                        C2897ik.m11146ri(C3263ri.this.f11014ka, 8);
                        return;
                    }
                    C2897ik.m11146ri(C3263ri.this.f11014ka, 4);
                    if (C3263ri.this.f11008aw.compareAndSet(false, true)) {
                        C3263ri.this.m13858ri(view, c3222ac, wjvVar, strM16658ri, interfaceC3266riM13866sf);
                    }
                    if (C3263ri.this.f11019ri == null || C3263ri.this.f11019ri.getCurView() == null) {
                        return;
                    }
                    C3263ri.this.f11019ri.getCurView().mo12248qt();
                    C3263ri.this.f11019ri.getCurView().m13573nr();
                    C3263ri.this.f11019ri.setIsShow(true);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
                /* JADX INFO: renamed from: ri */
                public void mo13027ri(boolean z) {
                    C3263ri.this.m13864ri(z, wjvVar);
                }
            };
            c3263ri = this;
            wjvVar2 = wjvVar;
            srn.m16656ri(c3222ac, true, 1, zM13885ri, interfaceC3591lr, null);
            c3222ac2 = c3222ac;
            c3269mj = null;
        } else {
            C3269mj c3269mjM13855ri = m13855ri(c3222ac);
            if (c3269mjM13855ri == null) {
                c3269mjM13855ri = new C3269mj(this.f11011di, c3222ac, this.f11010co.m13885ri());
                c3222ac.addView(c3269mjM13855ri);
            }
            c3269mjM13855ri.setAdType(1);
            c3222ac2 = c3222ac;
            c3269mjM13855ri.setCallback(new C3269mj.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.3
                @Override // com.bytedance.sdk.openadsdk.core.C3269mj.ri
                /* JADX INFO: renamed from: lr */
                public void mo13020lr() {
                    C3263ri c3263ri2 = C3263ri.this;
                    c3263ri2.m13847lr(c3263ri2.f11014ka);
                }

                @Override // com.bytedance.sdk.openadsdk.core.C3269mj.ri
                /* JADX INFO: renamed from: ri */
                public void mo13021ri() {
                    if (C3263ri.this.f11009bu != 0) {
                        C3263ri.this.m13852qt();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.C3269mj.ri
                /* JADX INFO: renamed from: ri */
                public void mo13022ri(View view) {
                    if (C3263ri.this.f11008aw.compareAndSet(false, true)) {
                        C3263ri.this.m13858ri(view, c3222ac2, wjvVar, strM16658ri, interfaceC3266riM13866sf);
                    }
                    if (C3263ri.this.f11019ri == null || C3263ri.this.f11019ri.getCurView() == null) {
                        return;
                    }
                    C3263ri.this.f11019ri.getCurView().mo12248qt();
                    C3263ri.this.f11019ri.getCurView().m13573nr();
                    C3263ri.this.f11019ri.setIsShow(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.C3269mj.ri
                /* JADX INFO: renamed from: ri */
                public void mo13023ri(boolean z) {
                    C3263ri.this.m13864ri(z, wjvVar);
                }
            });
            c3269mj = c3269mjM13855ri;
            c3263ri = this;
            wjvVar2 = wjvVar;
        }
        Context contextM10240ri = c3222ac2 != null ? C2722lr.m10240ri(c3222ac2) : null;
        if (contextM10240ri == null) {
            contextM10240ri = c3263ri.f11011di;
        }
        jbs jbsVar = new jbs(contextM10240ri, wjvVar2, c3263ri.f11013ik, 2);
        jbsVar.m13528ri(c3222ac2);
        jbsVar.m13533ri(this);
        jbsVar.m13534ri(c3263ri.f11018qt);
        jbsVar.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.5
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i) {
                if (C3263ri.this.f11012fi != null) {
                    C3263ri.this.f11012fi.onAdClicked();
                }
            }
        });
        c3222ac2.setClickListener(jbsVar);
        C3235mj c3235mj = new C3235mj(c3263ri.f11011di, wjvVar2, c3263ri.f11013ik, 2);
        c3235mj.m13528ri((View) c3222ac2);
        c3235mj.m13533ri(this);
        c3235mj.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.6
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i) {
                if (C3263ri.this.f11012fi != null) {
                    C3263ri.this.f11012fi.onAdClicked();
                }
            }
        });
        C3222ac c3222ac3 = c3263ri.f11020sf;
        if (c3222ac3 instanceof tan) {
            c3235mj.m13529ri(((tan) c3222ac3).getVideoController());
        }
        c3235mj.m13534ri(c3263ri.f11018qt);
        c3222ac2.setClickCreativeListener(c3235mj);
        if (c3263ri.f11016mj) {
            return;
        }
        c3269mj.setNeedCheckingShow(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13864ri(boolean z, wjv wjvVar) {
        if (z && this.f11014ka.nhl() && !this.f11014ka.igq()) {
            this.f11014ka.xha(true);
            wjv wjvVar2 = this.f11014ka;
            C3414ik.m15548ri(wjvVar2, this.f11013ik, wjvVar2.wzv());
        }
        dzy.m16402lr(new ri(z, wjvVar, this), 10);
    }

    /* JADX INFO: renamed from: sf */
    private xha.InterfaceC3266ri m13866sf() {
        return new xha.InterfaceC3266ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.7
            /* JADX INFO: renamed from: ri */
            private View m13879ri(boolean z) {
                C3192ik c3192ik = new C3192ik(C3263ri.this.f11011di);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                c3192ik.setBackgroundColor(-1);
                c3192ik.setLayoutParams(layoutParams);
                View view = new View(C3263ri.this.f11011di);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                c3192ik.addView(view, layoutParams2);
                C3192ik c3192ik2 = new C3192ik(C3263ri.this.f11011di);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z) {
                    c3192ik2.setBackground(C2729uq.m10303ik(C3263ri.this.f11011di, "tt_ad_closed_background_300_250"));
                } else {
                    c3192ik2.setBackground(C2729uq.m10303ik(C3263ri.this.f11011di, "tt_ad_closed_background_320_50"));
                }
                c3192ik.addView(c3192ik2, layoutParams3);
                PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(C3263ri.this.f11011di, C3263ri.this.f11014ka);
                pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z) {
                    int iM16589lr = C3583qd.m16589lr(C3263ri.this.f11011di, 16.0f);
                    layoutParams4.width = C3583qd.m16589lr(C3263ri.this.f11011di, 77.0f);
                    layoutParams4.height = C3583qd.m16589lr(C3263ri.this.f11011di, 14.0f);
                    layoutParams4.leftMargin = iM16589lr;
                    layoutParams4.topMargin = iM16589lr;
                } else {
                    int iM16589lr2 = C3583qd.m16589lr(C3263ri.this.f11011di, 8.0f);
                    layoutParams4.width = C3583qd.m16589lr(C3263ri.this.f11011di, 45.0f);
                    layoutParams4.height = C3583qd.m16589lr(C3263ri.this.f11011di, 8.18f);
                    layoutParams4.leftMargin = iM16589lr2;
                    layoutParams4.topMargin = iM16589lr2;
                }
                c3192ik2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                C3195mj c3195mj = new C3195mj(C3263ri.this.f11011di);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                c3195mj.setAlpha(0.5f);
                c3195mj.setLines(1);
                c3195mj.setText(C2729uq.m10311ri(C3263ri.this.f11011di, "tt_ad_is_closed"));
                if (z) {
                    c3195mj.setTextSize(18.0f);
                } else {
                    c3195mj.setTextSize(12.0f);
                }
                c3192ik2.addView(c3195mj, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.m10758ri(C3263ri.this.f11011di, C3263ri.this.f11014ka, C3263ri.this.f11013ik);
                    }
                };
                pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                c3195mj.setOnClickListener(onClickListener);
                return c3192ik;
            }

            @Override // com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri
            /* JADX INFO: renamed from: ri */
            public void mo13880ri() {
                int width = C3263ri.this.f11020sf.getWidth();
                int height = C3263ri.this.f11020sf.getHeight();
                View viewM13879ri = m13879ri(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                C3263ri.this.f11020sf.m13578uq();
                C3263ri.this.f11020sf.removeAllViews();
                C3263ri.this.f11020sf.addView(viewM13879ri, new ViewGroup.LayoutParams(width, height));
                C3263ri.this.f11020sf.setClickCreativeListener(null);
                C3263ri.this.f11020sf.setClickListener(null);
                if (C3263ri.this.f11012fi != null) {
                    C3263ri.this.f11012fi.onAdDismissed();
                }
                C3263ri.this.jbs = true;
            }
        };
    }

    /* JADX INFO: renamed from: di */
    public void m13868di() {
        this.f11009bu = 1;
        this.f11019ri.mo13800ka();
    }

    /* JADX INFO: renamed from: fi */
    public void m13869fi() {
        this.xha = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ik */
    public C3534ri m13870ik() {
        C3260ka c3260ka = this.f11019ri;
        if (c3260ka instanceof C3255ik) {
            return ((C3255ik) c3260ka).getVideoModel();
        }
        return null;
    }

    public void jbs() {
        C3260ka c3260ka = this.f11019ri;
        if (c3260ka instanceof C3255ik) {
            ((C3255ik) c3260ka).m13802ri();
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m13871ka() {
        m13847lr(this.f11014ka);
        this.xha = 0L;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m13872lr() {
        return this.f11019ri instanceof C3255ik;
    }

    /* JADX INFO: renamed from: mj */
    public void m13873mj() {
        C3260ka c3260ka = this.f11019ri;
        if (c3260ka instanceof C3255ik) {
            ((C3255ik) c3260ka).m13801lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public View m13874ri() {
        C3578lr.m16536ri(this.f11014ka);
        IPBroadcastReceiver.m15814lr(this.f11011di, this.f11014ka);
        return this.f11019ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m13875ri(int i) {
        C3260ka c3260ka = this.f11019ri;
        if (c3260ka != null) {
            c3260ka.setCurrentIndex(i);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13876ri(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        C3262mj c3262mj = new C3262mj(pAGBannerAdInteractionCallback);
        this.f11012fi = c3262mj;
        this.f11019ri.setExpressInteractionListener(c3262mj);
    }

    /* JADX INFO: renamed from: ri */
    public void m13877ri(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        C3262mj c3262mj = new C3262mj(pAGBannerAdInteractionListener);
        this.f11012fi = c3262mj;
        this.f11019ri.setExpressInteractionListener(c3262mj);
    }

    /* JADX INFO: renamed from: ri */
    public void m13878ri(final InterfaceC3514lr interfaceC3514lr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.tan > 500) {
            this.tan = jCurrentTimeMillis;
            C3260ka c3260ka = this.f11019ri;
            if (c3260ka instanceof C3255ik) {
                c3260ka.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ka.ri.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((C3255ik) C3263ri.this.f11019ri).m13803ri(interfaceC3514lr);
                    }
                }, 500L);
            }
        }
    }

    public void xha() {
        if (this.f11019ri != null) {
            try {
                m13868di();
                this.f11019ri.removeOnAttachStateChangeListener(this.f11017nr);
            } catch (Throwable unused) {
            }
        }
    }
}
