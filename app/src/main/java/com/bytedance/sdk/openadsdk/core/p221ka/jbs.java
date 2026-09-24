package com.bytedance.sdk.openadsdk.core.p221ka;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3122ik;
import com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3236nr;
import com.bytedance.sdk.openadsdk.core.model.slm;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.widget.C3336co;
import com.bytedance.sdk.openadsdk.core.widget.C3337di;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractC3238ri implements InterfaceC1999ik.ik, InterfaceC1999ik.ka {

    /* JADX INFO: renamed from: aw */
    private InterfaceC3370ik f10968aw;
    private C3120di bgr;

    /* JADX INFO: renamed from: bu */
    private PAGBannerAdWrapperListener f10969bu;

    /* JADX INFO: renamed from: co */
    private C3222ac f10970co;

    /* JADX INFO: renamed from: ri */
    public boolean f10971ri;
    private long slm;

    /* JADX INFO: renamed from: vr */
    private String f10972vr;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.jbs$ri */
    private static class C3259ri {

        /* JADX INFO: renamed from: fi */
        public C3193ka f10976fi;

        /* JADX INFO: renamed from: ik */
        public C3193ka f10977ik;

        /* JADX INFO: renamed from: ka */
        public PAGLogoView f10978ka;

        /* JADX INFO: renamed from: lr */
        public C3336co f10979lr;

        /* JADX INFO: renamed from: ri */
        public FrameLayout f10980ri;

        private C3259ri() {
        }
    }

    public jbs(Context context) {
        super(context);
        this.f10971ri = true;
        this.f10877lr = context;
    }

    /* JADX INFO: renamed from: fi */
    private void m13808fi() {
        C3236nr c3236nrM13836ri = C3261lr.m13836ri(this.f10970co.getExpectExpressWidth(), this.f10970co.getExpectExpressHeight());
        if (this.f10970co.getExpectExpressWidth() <= 0 || this.f10970co.getExpectExpressHeight() <= 0) {
            this.xha = C3583qd.m16580ik(this.f10877lr);
            this.f10878mj = Float.valueOf(this.xha / c3236nrM13836ri.f10866lr).intValue();
        } else {
            this.xha = C3583qd.m16589lr(this.f10877lr, this.f10970co.getExpectExpressWidth());
            this.f10878mj = C3583qd.m16589lr(this.f10877lr, this.f10970co.getExpectExpressHeight());
        }
        if (this.xha > 0 && this.xha > C3583qd.m16580ik(this.f10877lr)) {
            float fM16580ik = C3583qd.m16580ik(this.f10877lr) / this.xha;
            this.xha = C3583qd.m16580ik(this.f10877lr);
            this.f10878mj = Float.valueOf(this.f10878mj * fM16580ik).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xha, this.f10878mj);
        }
        layoutParams.width = this.xha;
        layoutParams.height = this.f10878mj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        m13814ri(c3236nrM13836ri);
    }

    /* JADX INFO: renamed from: lr */
    private C3259ri m13812lr(C3236nr c3236nr) {
        C3259ri c3259ri = new C3259ri();
        c3259ri.f10980ri = new FrameLayout(this.f10877lr);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        c3259ri.f10980ri.setLayoutParams(layoutParams);
        c3259ri.f10979lr = new C3336co(this.f10877lr);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        c3259ri.f10979lr.setLayoutParams(layoutParams2);
        c3259ri.f10980ri.addView(c3259ri.f10979lr);
        int iM16589lr = C3583qd.m16589lr(this.f10877lr, 5.0f);
        if (c3236nr == null || c3236nr.f10867ri != 1) {
            c3259ri.f10977ik = C3337di.m14999lr(getContext());
        } else {
            c3259ri.f10977ik = C3337di.m15000ri(getContext());
        }
        c3259ri.f10977ik.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = GravityCompat.END;
        layoutParams3.setMargins(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
        c3259ri.f10977ik.setLayoutParams(layoutParams3);
        c3259ri.f10980ri.addView(c3259ri.f10977ik);
        c3259ri.f10978ka = PAGLogoView.createPAGLogoViewByMaterial(this.f10877lr, this.f10875ik);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
        c3259ri.f10978ka.setLayoutParams(layoutParams4);
        c3259ri.f10980ri.addView(c3259ri.f10978ka);
        c3259ri.f10976fi = new C3193ka(this.f10877lr);
        int iM16589lr2 = C3583qd.m16589lr(this.f10877lr, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iM16589lr2, iM16589lr2);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = iM16589lr;
        layoutParams5.bottomMargin = iM16589lr;
        c3259ri.f10976fi.setVisibility(8);
        c3259ri.f10976fi.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c3259ri.f10976fi.setLayoutParams(layoutParams5);
        c3259ri.f10980ri.addView(c3259ri.f10976fi);
        return c3259ri;
    }

    /* JADX INFO: renamed from: ri */
    private void m13814ri(C3236nr c3236nr) {
        if (this.f10875ik != null) {
            int iM14552vz = this.f10875ik.m14552vz();
            C3259ri c3259riM13812lr = m13812lr(c3236nr);
            if (c3259riM13812lr == null || c3259riM13812lr.f10980ri == null) {
                return;
            }
            addView(c3259riM13812lr.f10980ri);
            C3193ka c3193ka = c3259riM13812lr.f10977ik;
            PAGLogoView pAGLogoView = c3259riM13812lr.f10978ka;
            C3193ka c3193ka2 = c3259riM13812lr.f10976fi;
            if (c3193ka2 != null && this.f10875ik.wjv()) {
                C3583qd.m16612ri((View) c3193ka2, 0);
                C2751lr.m10463lr().m10469ri((int) C3583qd.m16603ri(C3299nr.m14642ri(), 11.0f, true), c3193ka2, this.f10875ik);
            }
            C3120di videoView = getVideoView();
            if (videoView instanceof C3120di) {
                this.bgr = videoView;
                videoView.setVideoAdLoadListener(this);
                this.bgr.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(c3193ka, FriendlyObstructionPurpose.CLOSE_AD));
                arrayList.add(new Pair(pAGLogoView, FriendlyObstructionPurpose.OTHER));
                arrayList.add(new Pair(c3193ka2, FriendlyObstructionPurpose.OTHER));
                this.bgr.m12812ri(arrayList);
                this.bgr.setAdCreativeClickListener(new C3120di.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.jbs.1
                    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo12820ri(View view, int i) {
                        if (jbs.this.f10969bu != null) {
                            jbs.this.f10969bu.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.jbs.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        TTWebsiteActivity.m10758ri(jbs.this.f10877lr, jbs.this.f10875ik, jbs.this.f10873di);
                    }
                });
            }
            if (c3193ka != null) {
                c3193ka.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.jbs.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        jbs.this.mo13698ri();
                    }
                });
            }
            C3336co c3336co = c3259riM13812lr.f10979lr;
            if (this.f10875ik != null && this.f10875ik.m14525sr() != null && c3336co != null) {
                int iM12545qt = this.f10875ik.m14525sr().m12545qt();
                float fM12554sf = this.f10875ik.m14525sr().m12554sf();
                if (iM12545qt > 0 && fM12554sf > 0.0f) {
                    c3336co.setRatio(iM12545qt / fM12554sf);
                } else if (iM14552vz == 15) {
                    c3336co.setRatio(0.5625f);
                } else if (iM14552vz == 5) {
                    c3336co.setRatio(1.7777778f);
                } else {
                    c3336co.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && c3336co != null) {
                c3336co.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            m13700ri((View) videoView, true);
            m13700ri((View) this, true);
            m13699ri(c3336co);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: g_ */
    public void mo6390g_() {
    }

    public long getVideoProgress() {
        return this.slm;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: h_ */
    public void mo6391h_() {
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: i_ */
    public void mo6392i_() {
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: j_ */
    public void mo6393j_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri
    /* JADX INFO: renamed from: ri */
    public void mo13698ri() {
        if (this.f10874fi != null) {
            this.f10874fi.show();
        } else if (this.f10876ka != null) {
            this.f10876ka.mo14648ri();
        } else {
            TTDelegateActivity.m10599ri(this.f10875ik, this.f10972vr);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ka
    /* JADX INFO: renamed from: ri */
    public void mo6395ri(int i, int i2) {
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ik
    /* JADX INFO: renamed from: ri */
    public void mo6394ri(long j, long j2) {
        this.slm = j;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.AbstractC3238ri
    /* JADX INFO: renamed from: ri */
    protected void mo11556ri(View view, int i, slm slmVar) {
        C3222ac c3222ac = this.f10970co;
        if (c3222ac != null) {
            c3222ac.mo9002ri(view, i, slmVar);
            C3120di c3120di = this.bgr;
            if (c3120di == null || !(c3120di.getNativeVideoController() instanceof C3122ik)) {
                return;
            }
            this.bgr.getNativeVideoController().m12943pv();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13815ri(wjv wjvVar, C3222ac c3222ac, InterfaceC3370ik interfaceC3370ik) {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f10875ik = wjvVar;
        this.f10970co = c3222ac;
        this.f10968aw = interfaceC3370ik;
        this.f10873di = "banner_ad";
        this.f10970co.addView(this, new ViewGroup.LayoutParams(-2, -2));
        m13808fi();
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.f10969bu = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.f10972vr = str;
    }
}
