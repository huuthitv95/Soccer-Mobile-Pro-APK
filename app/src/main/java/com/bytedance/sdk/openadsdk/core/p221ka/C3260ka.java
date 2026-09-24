package com.bytedance.sdk.openadsdk.core.p221ka;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.C3143fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.utils.C3577ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3260ka extends C3192ik {

    /* JADX INFO: renamed from: di */
    protected String f10981di;

    /* JADX INFO: renamed from: fi */
    protected PAGBannerAdWrapperListener f10982fi;

    /* JADX INFO: renamed from: ik */
    protected wjv f10983ik;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    protected AdSlot f10984ka;

    /* JADX INFO: renamed from: lr */
    protected C3222ac f10985lr;

    /* JADX INFO: renamed from: mj */
    private int f10986mj;

    /* JADX INFO: renamed from: ri */
    protected final Context f10987ri;
    protected boolean xha;

    public C3260ka(Context context, wjv wjvVar, AdSlot adSlot, boolean z) {
        super(context);
        this.f10981di = "banner_ad";
        this.xha = false;
        this.f10986mj = -1;
        this.jbs = false;
        if (wjvVar != null && wjvVar.ajz() != 2) {
            wjvVar.tan(1);
        }
        this.xha = z;
        this.f10987ri = context;
        this.f10983ik = wjvVar;
        this.f10984ka = adSlot;
        mo13799ik();
        AdSlot adSlot2 = this.f10984ka;
        if (adSlot2 != null) {
            m13819ri(adSlot2.getExpressViewAcceptedWidth(), this.f10984ka.getExpressViewAcceptedHeight());
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m13817fi() {
        C3222ac c3222ac = this.f10985lr;
        if (c3222ac != null) {
            c3222ac.tan();
        }
    }

    public C3222ac getCurView() {
        return this.f10985lr;
    }

    /* JADX INFO: renamed from: ik */
    protected void mo13799ik() {
        C3222ac c3222ac = new C3222ac(this.f10987ri, this.f10983ik, this.f10984ka, this.f10981di) { // from class: com.bytedance.sdk.openadsdk.core.ka.ka.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.C3222ac
            /* JADX INFO: renamed from: ik */
            protected C2889fi.ri mo12246ik(int i) {
                return C3260ka.this.m13818ri(super.mo12246ik(i));
            }
        };
        this.f10985lr = c3222ac;
        addView(c3222ac, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.f10982fi;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    /* JADX INFO: renamed from: ka */
    public void mo13800ka() {
        if (this.f10985lr != null) {
            C3304qt.m14669lr().m14682di(this.f10985lr.getClosedListenerKey());
            removeView(this.f10985lr);
            this.f10985lr.mo12245co();
            this.f10985lr = null;
        }
        C3304qt.m14669lr().tan();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10985lr == null) {
            mo13799ik();
        }
        C3577ka.m16533ri(this, this.f10983ik);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: ri */
    protected C2889fi.ri m13818ri(C2889fi.ri riVar) {
        int i;
        if (this.xha && (i = this.f10986mj) >= 0) {
            riVar.f8613lr = i;
        }
        return riVar;
    }

    /* JADX INFO: renamed from: ri */
    protected void m13819ri(float f, float f2) {
        int iM16589lr = C3583qd.m16589lr(this.f10987ri, f);
        int iM16589lr2 = C3583qd.m16589lr(this.f10987ri, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iM16589lr, iM16589lr2);
        }
        layoutParams.width = iM16589lr;
        layoutParams.height = iM16589lr2;
        setLayoutParams(layoutParams);
    }

    public void setCurrentIndex(int i) {
        this.f10986mj = i;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f10982fi = pAGBannerAdWrapperListener;
        C3222ac c3222ac = this.f10985lr;
        if (c3222ac != null) {
            c3222ac.setJsbLandingPageOpenListener(new InterfaceC3338fi() { // from class: com.bytedance.sdk.openadsdk.core.ka.ka.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi
                /* JADX INFO: renamed from: ri */
                public void mo10615ri() {
                    C3260ka.this.f10982fi.onAdClicked();
                }
            });
            this.f10985lr.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.ka.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    if (C3260ka.this.f10983ik == null || !C3260ka.this.f10983ik.zyu() || C3260ka.this.f10982fi == null) {
                        return;
                    }
                    C3260ka.this.f10982fi.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                    if (C3260ka.this.f10982fi != null) {
                        C3260ka.this.f10982fi.onRenderFail(C3260ka.this, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (C3260ka.this.f10985lr != null) {
                        C3260ka.this.f10985lr.setSoundMute(true);
                        if (!C3143fi.m13131ri(C3260ka.this.f10985lr.getDynamicShowType())) {
                            C3260ka.this.m13819ri(f, f2);
                        } else if (C3260ka.this.f10984ka != null) {
                            C3260ka c3260ka = C3260ka.this;
                            c3260ka.m13819ri(c3260ka.f10984ka.getExpressViewAcceptedWidth(), C3260ka.this.f10984ka.getExpressViewAcceptedHeight());
                        }
                    }
                    if (C3260ka.this.jbs) {
                        C3260ka.this.f10985lr.m13573nr();
                    }
                    if (C3260ka.this.f10982fi != null) {
                        C3260ka.this.f10982fi.onRenderSuccess(C3260ka.this, f, f2);
                    }
                }
            });
        }
    }

    public void setIsShow(boolean z) {
        this.jbs = z;
    }
}
