package com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.C3143fi;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.C3504lr;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.C3505mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.lr.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3507ik extends C3505mj {

    /* JADX INFO: renamed from: co */
    private boolean f12729co;
    protected AdSlot jbs;

    /* JADX INFO: renamed from: mj */
    protected final Context f12730mj;

    /* JADX INFO: renamed from: qt */
    protected C3222ac f12731qt;

    /* JADX INFO: renamed from: sf */
    protected String f12732sf;

    public C3507ik(Context context, wjv wjvVar, AdSlot adSlot) {
        super(context, wjvVar, 5, true);
        this.f12732sf = "embeded_ad";
        this.f12729co = false;
        this.f12701lr.tan(1);
        this.f12700ka.m15897ri(this);
        this.f12730mj = context;
        this.jbs = adSlot;
        mo15913ri();
        m15906lr();
    }

    /* JADX INFO: renamed from: lr */
    private void m15906lr() {
        C3222ac c3222ac = this.f12731qt;
        if (c3222ac != null) {
            c3222ac.setBackupListener(new InterfaceC2504ik() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.ik.1
                @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik
                /* JADX INFO: renamed from: ri */
                public boolean mo8984ri(ViewGroup viewGroup, int i) {
                    C3509ri c3509ri = new C3509ri(C3507ik.this.f12731qt.getContext());
                    c3509ri.setExtraFuncationHelper(C3507ik.this.f12700ka);
                    c3509ri.m15916ri(C3507ik.this.f12731qt);
                    return true;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15908ri(float f, float f2) {
        C3222ac c3222ac = this.f12731qt;
        if (c3222ac != null && C3143fi.m13131ri(c3222ac.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.f12731qt.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.f12731qt.setLayoutParams(layoutParams);
            return;
        }
        int iM16589lr = C3583qd.m16589lr(this.f12730mj, f);
        int iM16589lr2 = C3583qd.m16589lr(this.f12730mj, f2);
        ViewGroup.LayoutParams layoutParams2 = this.f12731qt.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(iM16589lr, iM16589lr2);
        } else {
            layoutParams2.width = iM16589lr;
            layoutParams2.height = iM16589lr2;
        }
        this.f12731qt.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: fi */
    public void m15910fi() {
        C3222ac c3222ac = this.f12731qt;
        if (c3222ac != null) {
            c3222ac.tan();
        }
    }

    /* JADX INFO: renamed from: ik */
    protected void m15911ik() {
        C3222ac c3222ac = this.f12731qt;
        if (c3222ac != null) {
            c3222ac.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.ik.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (!C3507ik.this.f12731qt.ihz()) {
                        C3507ik.this.m15908ri(f, f2);
                        if (C3507ik.this.f12729co) {
                            C3507ik.this.f12731qt.m13573nr();
                            return;
                        }
                        return;
                    }
                    C3504lr c3504lr = new C3504lr(C3507ik.this.f12730mj, C3507ik.this.f12701lr, 5, C3507ik.this.jbs, C3507ik.this.f12700ka, C3507ik.this.f12703ri);
                    C3507ik c3507ik = C3507ik.this;
                    if (c3507ik instanceof C3508lr) {
                        c3504lr.m15870ri(((tan) c3507ik.m15912ka()).getVideoAdListener());
                    }
                    C3507ik.this.f12700ka.m15895ri((C3221ri) C3507ik.this.f12731qt.getClickCreativeListener());
                    PAGMediaView pAGMediaViewJbs = C3507ik.this.f12700ka.jbs();
                    if (pAGMediaViewJbs == null) {
                        pAGMediaViewJbs = new PAGMediaView(C3507ik.this.f12730mj);
                    }
                    C3507ik.this.f12731qt.addView(pAGMediaViewJbs);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ka */
    public C3222ac m15912ka() {
        return this.f12731qt;
    }

    /* JADX INFO: renamed from: ri */
    protected void mo15913ri() {
        this.f12731qt = new C3222ac(this.f12730mj, this.f12701lr, this.jbs, this.f12732sf);
        m15911ik();
    }

    /* JADX INFO: renamed from: ri */
    public void m15914ri(boolean z) {
        this.f12729co = z;
    }
}
