package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p054lr.C1978ri;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.utils.C3599zf;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2932co extends C3192ik {

    /* JADX INFO: renamed from: di */
    private Runnable f8779di;

    /* JADX INFO: renamed from: fi */
    private Runnable f8780fi;

    /* JADX INFO: renamed from: ik */
    private int f8781ik;

    /* JADX INFO: renamed from: ka */
    private long f8782ka;

    /* JADX INFO: renamed from: lr */
    protected boolean f8783lr;

    /* JADX INFO: renamed from: mj */
    private int f8784mj;

    /* JADX INFO: renamed from: ri */
    protected C2952sf f8785ri;
    private boolean xha;

    public C2932co(Context context) {
        super(context);
        this.f8782ka = 10L;
        this.f8783lr = true;
        this.xha = false;
        this.f8784mj = 1;
        m11280ik();
    }

    /* JADX INFO: renamed from: ik */
    private void m11280ik() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    /* JADX INFO: renamed from: ik */
    private void m11281ik(int i) {
        if (this.f8784mj != i) {
            this.f8784mj = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m11282lr(int i) {
        C2952sf c2952sf = this.f8785ri;
        if (c2952sf != null) {
            c2952sf.m11418ri(i);
        }
        if (i == 100 && this.f8783lr) {
            m11285lr();
        }
    }

    public C2952sf getLoadingStyle() {
        return this.f8785ri;
    }

    /* JADX INFO: renamed from: lr */
    public void m11285lr() {
        this.f8781ik = 0;
        C2952sf c2952sf = this.f8785ri;
        if (c2952sf != null) {
            removeView(c2952sf.f8876ri);
            this.f8785ri.m11415ka();
        }
        setVisibility(8);
        this.f8785ri = null;
        Runnable runnable = this.f8780fi;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f8779di;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f8779di = null;
        this.f8780fi = null;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m11281ik(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f8780fi;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f8780fi = null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo11286ri() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.co.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2932co.this.f8785ri != null) {
                    C2932co.this.setVisibility(0);
                }
            }
        });
        if (this.f8780fi == null) {
            this.f8780fi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.co.2
                @Override // java.lang.Runnable
                public void run() {
                    C2932co.this.m11285lr();
                }
            };
        }
        postDelayed(this.f8780fi, this.f8782ka * 1000);
    }

    /* JADX INFO: renamed from: ri */
    public void m11287ri(int i) {
        if (i == 100 || Math.abs(i - this.f8781ik) >= 7) {
            this.f8781ik = i;
            if (C1978ri.m6210ri()) {
                m11282lr(this.f8781ik);
                return;
            }
            if (this.f8779di == null) {
                this.f8779di = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.co.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C2932co c2932co = C2932co.this;
                        c2932co.m11282lr(c2932co.f8781ik);
                    }
                };
            }
            post(this.f8779di);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11288ri(wjv wjvVar) {
        com.bytedance.sdk.openadsdk.core.model.ihz ihzVarM14364ay;
        if (wjvVar != null && (ihzVarM14364ay = wjvVar.m14364ay()) != null) {
            this.f8782ka = ihzVarM14364ay.m14169ri();
        }
        C2952sf c2952sf = new C2952sf(getContext());
        this.f8785ri = c2952sf;
        View viewM11417ri = c2952sf.m11417ri();
        if (viewM11417ri.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewM11417ri.getParent()).removeView(viewM11417ri);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewM11417ri.setLayoutParams(layoutParams);
        if (wjvVar != null) {
            boolean zEvm = wjvVar.evm();
            C3335bu c3335buM11416lr = this.f8785ri.m11416lr();
            if (c3335buM11416lr != null) {
                if (this.xha || zEvm) {
                    c3335buM11416lr.setVisibility(8);
                } else {
                    C3286nr c3286nrM14391fb = (wjvVar.m14391fb() == null || TextUtils.isEmpty(wjvVar.m14391fb().m14220ri())) ? null : wjvVar.m14391fb();
                    if (c3286nrM14391fb == null || TextUtils.isEmpty(c3286nrM14391fb.m14220ri())) {
                        c3335buM11416lr.setVisibility(8);
                    } else {
                        try {
                            C3491ka.m15833ri(c3286nrM14391fb).mo9652ik(1).mo9658ri(new C3492lr(wjvVar, c3286nrM14391fb.m14220ri(), new C3599zf(c3335buM11416lr)));
                        } catch (Throwable unused) {
                            c3335buM11416lr.setVisibility(8);
                        }
                    }
                }
            }
            C3195mj c3195mjM11414ik = this.f8785ri.m11414ik();
            if (c3195mjM11414ik != null) {
                if (this.xha || zEvm) {
                    c3195mjM11414ik.setText("Loading");
                } else if (TextUtils.isEmpty(wjvVar.m14559xh())) {
                    c3195mjM11414ik.setVisibility(8);
                } else {
                    c3195mjM11414ik.setText(wjvVar.m14559xh());
                }
            }
        }
        addView(viewM11417ri);
        m11281ik(getResources().getConfiguration().orientation);
    }

    public void setOnlyLoading(boolean z) {
        this.xha = z;
    }
}
