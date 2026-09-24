package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.jbs.C2972lr;
import com.bytedance.sdk.openadsdk.component.jbs.C2974ri;
import com.bytedance.sdk.openadsdk.component.p181di.C2959lr;
import com.bytedance.sdk.openadsdk.component.p186mj.C2981ri;
import com.bytedance.sdk.openadsdk.component.p189ri.C3079lr;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.jbs.jbs;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3240ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.ironsource.C11744X3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2977lr extends C2965ik {

    /* JADX INFO: renamed from: aw */
    private final C2959lr f9066aw;
    private C2972lr bgr;

    /* JADX INFO: renamed from: vr */
    private boolean f9067vr;

    public C2977lr(Activity activity, wjv wjvVar, FrameLayout frameLayout, C3078ri c3078ri, int i, boolean z, C2981ri c2981ri, C2959lr c2959lr) {
        super(activity, wjvVar, frameLayout, c3078ri, i, z, c2981ri);
        this.f9066aw = c2959lr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.C2965ik
    /* JADX INFO: renamed from: fi */
    public void mo11515fi() {
        C2972lr c2972lr = this.bgr;
        if (c2972lr != null) {
            c2972lr.m13573nr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.C2965ik
    /* JADX INFO: renamed from: ik */
    public void mo11516ik() {
        super.mo11516ik();
        C2972lr c2972lr = this.bgr;
        if (c2972lr != null) {
            c2972lr.mo12245co();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.C2965ik
    /* JADX INFO: renamed from: ka */
    public int mo11517ka() {
        return this.bgr.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.C2965ik
    /* JADX INFO: renamed from: lr */
    public void mo11518lr() {
        this.bgr.tan();
    }

    @Override // com.bytedance.sdk.openadsdk.component.C2965ik
    /* JADX INFO: renamed from: ri */
    public JSONObject mo11519ri(JSONObject jSONObject) {
        return this.bgr.m13574ri(jSONObject, this.f8977lr);
    }

    @Override // com.bytedance.sdk.openadsdk.component.C2965ik
    /* JADX INFO: renamed from: ri */
    public void mo11520ri() {
        jbs jbsVarM12326ri = C3079lr.m12326ri(this.f8977lr, this.f8981ri, this.f8971co, this.bgr);
        jbsVarM12326ri.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.lr.2
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i) {
                C2977lr.this.f8973fi.mo10539fi();
            }
        });
        this.bgr.setClickListener(jbsVarM12326ri);
        C3235mj c3235mjM12324lr = C3079lr.m12324lr(this.f8977lr, this.f8981ri, this.f8971co, this.bgr);
        this.bgr.setClickCreativeListener(c3235mjM12324lr);
        c3235mjM12324lr.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.lr.3
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i) {
                C2977lr.this.f8973fi.mo10539fi();
            }
        });
        this.bgr.setBackupListener(new InterfaceC2504ik() { // from class: com.bytedance.sdk.openadsdk.component.lr.4
            @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik
            /* JADX INFO: renamed from: ri */
            public boolean mo8984ri(ViewGroup viewGroup, int i) {
                StringBuilder sb = new StringBuilder("isUseBackup() called with: view = [");
                sb.append(viewGroup);
                sb.append("], errCode = [");
                sb.append(i);
                sb.append(C11744X3.j.f26440e);
                try {
                    ((C3222ac) viewGroup).m13566ac();
                    new C2974ri(C2977lr.this.f8981ri).m11557ri((C3222ac) C2977lr.this.bgr);
                    return true;
                } catch (Exception e) {
                    Log.e("AppOpenAdExpressManager", "", e);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.C2965ik
    /* JADX INFO: renamed from: ri */
    public void mo11523ri(int i, boolean z) {
        Integer.valueOf(i);
        Boolean.valueOf(z);
        super.mo11523ri(i, z);
        C2972lr c2972lr = this.bgr;
        if (c2972lr != null) {
            c2972lr.setTime(String.valueOf(i), (int) (this.f8971co.m11605ik() / 1000), i, false);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11580ri(long j, long j2) {
        C2972lr c2972lr = this.bgr;
        if (c2972lr != null) {
            c2972lr.m11548ri(j, j2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.C2965ik
    /* JADX INFO: renamed from: ri */
    public void mo11524ri(ViewGroup viewGroup) {
        Pair<Float, Float> pairM13721ri = C3240ri.m13721ri(this.f8981ri.getWindow(), this.xha);
        C2972lr c2972lr = new C2972lr(this.f8981ri, this.f8977lr, new AdSlot.Builder().setCodeId(String.valueOf(this.f8977lr.m14545ur())).setExpressViewAcceptedSize(((Float) pairM13721ri.first).floatValue(), ((Float) pairM13721ri.second).floatValue()).build(), "open_ad", this.f8973fi, this.f9066aw, this.f8971co);
        this.bgr = c2972lr;
        c2972lr.setTopListener(this.f8973fi);
        this.bgr.setExpressVideoListenerProxy(this.f8973fi);
        this.bgr.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.lr.1
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
                C2977lr.this.f8973fi.mo10541ka();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (C2977lr.this.bgr.ihz()) {
                    C2977lr.this.f9067vr = true;
                    C2977lr c2977lr = C2977lr.this;
                    C2977lr.super.mo11524ri((ViewGroup) c2977lr.f8976ka);
                    C2977lr.super.mo11520ri();
                    C2977lr.super.mo11518lr();
                    return;
                }
                if (C2977lr.this.f8977lr.ory()) {
                    C2977lr.this.f8973fi.mo10540ik();
                    return;
                }
                if (!C2977lr.this.f8975ik) {
                    C2977lr.this.f8973fi.mo10540ik();
                    return;
                }
                C2977lr c2977lr2 = C2977lr.this;
                if (!c2977lr2.m11526ri(c2977lr2.bgr.getVideoFrameLayout())) {
                    C2977lr.this.f8973fi.mo10541ka();
                } else {
                    C2977lr.this.bgr.setVideoManager(C2977lr.this.xha());
                    C2977lr.this.f8973fi.mo10540ik();
                }
            }
        });
        this.f8977lr.tan(1);
        this.f8976ka.addView(this.bgr, new FrameLayout.LayoutParams(-1, -1));
    }
}
