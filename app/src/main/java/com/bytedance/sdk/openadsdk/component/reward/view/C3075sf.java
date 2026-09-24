package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.C2996ik;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.C2997ka;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.bgr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3295vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3190di;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.widget.C3353sf;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3075sf {

    /* JADX INFO: renamed from: ac */
    private int f9644ac;

    /* JADX INFO: renamed from: co */
    bgr f9647co;

    /* JADX INFO: renamed from: di */
    FrameLayout f9648di;

    /* JADX INFO: renamed from: fi */
    ImageView f9649fi;
    private boolean ihz;

    /* JADX INFO: renamed from: ik */
    protected final C3022ri f9650ik;
    PAGLogoView jbs;

    /* JADX INFO: renamed from: ka */
    final wjv f9651ka;

    /* JADX INFO: renamed from: lr */
    final Activity f9652lr;

    /* JADX INFO: renamed from: mj */
    View f9653mj;

    /* JADX INFO: renamed from: nr */
    private final boolean f9654nr;

    /* JADX INFO: renamed from: qt */
    ImageView f9655qt;

    /* JADX INFO: renamed from: sf */
    RelativeLayout f9657sf;
    C3190di slm;
    private final String tan;

    /* JADX INFO: renamed from: uq */
    private C3070ka f9658uq;

    /* JADX INFO: renamed from: vr */
    public C3273ac f9659vr;
    private C3353sf wjv;
    View xha;

    /* JADX INFO: renamed from: ri */
    int f9656ri = 3;

    /* JADX INFO: renamed from: aw */
    protected int f9645aw = 0;
    protected final AtomicBoolean bgr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: bu */
    Runnable f9646bu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                if ((C3075sf.this.f9651ka == null || !C3075sf.this.f9651ka.vgs()) && C3075sf.this.f9649fi != null) {
                    int[] iArr = new int[2];
                    C3075sf.this.f9649fi.getLocationOnScreen(iArr);
                    C3075sf.this.f9650ik.f9394oh.m11867ri(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public C3075sf(C3022ri c3022ri) {
        this.f9650ik = c3022ri;
        this.f9652lr = c3022ri.f9384ig;
        this.f9651ka = c3022ri.f9389lr;
        this.tan = c3022ri.f9381fi;
        this.f9654nr = c3022ri.f9387ka;
    }

    /* JADX INFO: renamed from: nr */
    private void m12300nr() {
        RelativeLayout relativeLayout;
        C3070ka c3070ka = (C3070ka) this.f9650ik.f9396pv.findViewById(slm.bgr);
        this.f9658uq = c3070ka;
        c3070ka.m12288ri(this.f9650ik);
        C3353sf c3353sf = (C3353sf) this.f9650ik.f9396pv.findViewById(slm.f13310vt);
        this.wjv = c3353sf;
        if (c3353sf != null) {
            c3353sf.m15095ri(this.f9650ik.f9389lr, this.f9650ik.f9381fi, null);
        }
        this.jbs = (PAGLogoView) this.f9650ik.f9396pv.findViewById(520093757);
        this.f9655qt = (ImageView) this.f9650ik.f9396pv.findViewById(slm.hqg);
        this.f9649fi = (ImageView) this.f9650ik.f9396pv.findViewById(520093708);
        this.f9648di = (FrameLayout) this.f9650ik.f9396pv.findViewById(slm.f13255aw);
        this.xha = this.f9650ik.f9396pv.findViewById(slm.f13289nr);
        this.f9653mj = this.f9650ik.f9396pv.findViewById(slm.iph);
        this.f9657sf = (RelativeLayout) this.f9650ik.f9396pv.findViewById(slm.ugd);
        bgr bgrVar = this.f9647co;
        if (bgrVar == null || bgrVar.m11841ka() == null || (relativeLayout = this.f9657sf) == null) {
            return;
        }
        relativeLayout.addView(this.f9647co.m11841ka(), new LinearLayout.LayoutParams(-1, -1));
        this.f9647co.m11842lr();
    }

    /* JADX INFO: renamed from: ri */
    private int m12301ri(String str) {
        Resources resources = this.f9652lr.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    /* JADX INFO: renamed from: ri */
    private void m12303ri(AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik) {
        C3583qd.m16615ri((View) this.f9648di, (View.OnTouchListener) abstractViewOnClickListenerC3218ik, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    /* JADX INFO: renamed from: aw */
    public void mo12213aw() {
        try {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f9650ik.f9384ig, C2729uq.jbs(this.f9650ik.f9384ig, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.f9650ik.dzy.mo12214co();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        C3075sf.this.f9650ik.dzy.mo12214co();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.f9650ik.dzy.mo12231ri(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.f9650ik.dzy.mo12214co();
        }
    }

    public void bgr() {
        C3273ac c3273ac = this.f9659vr;
        if (c3273ac != null) {
            c3273ac.m13998di();
        }
        ImageView imageView = this.f9649fi;
        if (imageView != null) {
            imageView.removeCallbacks(this.f9646bu);
        }
    }

    /* JADX INFO: renamed from: bu */
    public void m12304bu() {
        AbstractC3217fi abstractC3217fiM11986fi = this.f9650ik.f9402su.m11986fi();
        View view = this.f9658uq;
        if (view == null) {
            view = this.f9650ik.f9396pv;
        }
        abstractC3217fiM11986fi.onClick(view);
    }

    /* JADX INFO: renamed from: co */
    public void mo12214co() {
        try {
            bgr bgrVar = this.f9647co;
            if (bgrVar != null) {
                bgrVar.m11840ik();
            }
            RelativeLayout relativeLayout = this.f9657sf;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.f9657sf;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: di */
    public FrameLayout mo12215di() {
        return this.f9648di;
    }

    /* JADX INFO: renamed from: di */
    public void mo12216di(int i) {
        C3583qd.m16612ri((View) this.f9649fi, i);
    }

    /* JADX INFO: renamed from: fi */
    void mo12217fi() {
        int iM14551vt = this.f9651ka.m14551vt();
        this.f9656ri = iM14551vt;
        if (iM14551vt == -200) {
            this.f9656ri = C3299nr.m14639ka().m14890vr(String.valueOf(this.f9651ka.m14545ur()));
        }
        if (this.f9656ri != -1 || mo12234ri() || (this.f9650ik.f9391nd instanceof C2997ka) || (this.f9650ik.f9391nd instanceof C2996ik)) {
            return;
        }
        mo12223lr(0);
    }

    /* JADX INFO: renamed from: fi */
    public void mo12218fi(int i) {
        int i2 = this.f9656ri;
        if (i2 == -1 || i != i2 || this.bgr.get()) {
            return;
        }
        mo12223lr(0);
        this.bgr.set(true);
        mo12225mj();
    }

    /* JADX INFO: renamed from: ik */
    public void mo12219ik() {
        this.f9648di.removeAllViews();
    }

    /* JADX INFO: renamed from: ik */
    public void m12305ik(int i) {
        wjv wjvVar = this.f9651ka;
        if (wjvVar != null && wjvVar.biu() && C3279dw.m14090ik(this.f9651ka)) {
            C3583qd.m16612ri((View) this.wjv, i);
        }
    }

    public boolean jbs() {
        ImageView imageView = this.f9649fi;
        return imageView != null && imageView.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ka */
    public void mo12220ka() {
        if (this.f9650ik.f9389lr.biu() && C3279dw.m14090ik(this.f9650ik.f9389lr)) {
            return;
        }
        C3583qd.m16612ri((View) this.f9648di, 8);
        C3583qd.m16612ri((View) this.wjv, 8);
        C3583qd.m16612ri(this.xha, 8);
        C3583qd.m16612ri(this.f9653mj, 8);
        mo12223lr(8);
        C3583qd.m16612ri((View) this.f9649fi, 8);
        C3583qd.m16612ri((View) this.jbs, 8);
        C3583qd.m16612ri((View) this.f9657sf, 8);
        C3583qd.m16612ri((View) this.f9655qt, 8);
    }

    /* JADX INFO: renamed from: ka */
    public void mo12221ka(int i) {
        C3583qd.m16612ri((View) this.jbs, i);
    }

    /* JADX INFO: renamed from: lr */
    public void mo12222lr() {
        if (this.ihz) {
            return;
        }
        this.ihz = true;
        this.f9644ac = this.f9650ik.bnj;
        if (mo12234ri()) {
            bgr bgrVar = new bgr(this.f9650ik);
            this.f9647co = bgrVar;
            bgrVar.m11843ri();
        }
        m12300nr();
        C3273ac c3273ac = new C3273ac(this.f9652lr, this.f9651ka, this.tan, this.f9648di, this.f9650ik.f9397qd, this.f9650ik.f9396pv);
        this.f9659vr = c3273ac;
        c3273ac.m14006ri();
    }

    /* JADX INFO: renamed from: lr */
    public void mo12223lr(int i) {
        wjv wjvVar = this.f9651ka;
        if (wjvVar != null && wjvVar.m14576zz() && C3295vr.m14328ri(this.f9651ka)) {
            C3583qd.m16612ri((View) this.f9658uq, 8);
        } else {
            C3583qd.m16612ri((View) this.f9658uq, i);
        }
    }

    /* JADX INFO: renamed from: lr */
    void mo12224lr(boolean z) {
        ImageView imageView;
        int iM12301ri;
        if (this.f9644ac != 1 && (imageView = this.f9649fi) != null && z) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iM12301ri = m12301ri("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iM12301ri > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iM12301ri;
                }
            }
        }
        if ((this.f9650ik.f9391nd instanceof C2997ka) || (this.f9650ik.f9391nd instanceof C2996ik)) {
            return;
        }
        mo12223lr(0);
    }

    /* JADX INFO: renamed from: mj */
    protected void mo12225mj() {
        C3070ka c3070ka = this.f9658uq;
        if (c3070ka == null) {
            return;
        }
        c3070ka.m12287ri();
    }

    /* JADX INFO: renamed from: qt */
    public View mo12226qt() {
        return this.f9649fi;
    }

    /* JADX INFO: renamed from: ri */
    public void mo12227ri(float f) {
        C3583qd.m16611ri(this.f9649fi, f);
    }

    /* JADX INFO: renamed from: ri */
    public void mo12228ri(int i) {
        if (this.slm == null) {
            this.slm = new C3190di(this.f9650ik.f9384ig);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.slm.setLayoutParams(layoutParams);
            this.slm.setIndeterminateDrawable(C3586sf.m16645ri(this.f9650ik.f9384ig, "tt_video_loading_progress_bar"));
            this.f9650ik.dzy.mo12215di().addView(this.slm);
        }
        this.slm.setVisibility(i);
    }

    /* JADX INFO: renamed from: ri */
    public void mo12229ri(int i, int i2) {
        FrameLayout frameLayout;
        if (this.f9651ka.jxw() == 1 && (frameLayout = this.f9648di) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iM16580ik = C3583qd.m16580ik((Context) this.f9652lr);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9648di.getLayoutParams();
            layoutParams.width = iM16580ik;
            int i3 = (iM16580ik * 9) / 16;
            layoutParams.height = i3;
            this.f9648di.setLayoutParams(layoutParams);
            this.f9645aw = (C3583qd.m16578fi(this.f9652lr) - i3) / 2;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12306ri(int i, com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
        C3273ac c3273ac = this.f9659vr;
        if (c3273ac != null) {
            c3273ac.m14009ri(i, bgrVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo12230ri(View.OnClickListener onClickListener) {
        C3583qd.m16614ri(this.f9648di, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    /* JADX INFO: renamed from: ri */
    public void mo12231ri(Animation animation) {
        RelativeLayout relativeLayout = this.f9657sf;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo12232ri(AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        wjv wjvVar;
        if (this.f9648di != null && (wjvVar = this.f9651ka) != null && wjvVar.m14455nh() != null) {
            if (!this.f9651ka.m14455nh().f11339di || C3273ac.m13971lr(this.f9651ka)) {
                mo12230ri(onClickListener);
            } else {
                mo12230ri((View.OnClickListener) abstractViewOnClickListenerC3218ik);
                m12303ri(abstractViewOnClickListenerC3218ik);
            }
        }
        wjv wjvVar2 = this.f9651ka;
        if (wjvVar2 != null && wjvVar2.jxw() == 1) {
            if (this.f9651ka.m14455nh() != null && (view2 = this.xha) != null) {
                C3583qd.m16612ri(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.xha.getLayoutParams();
                layoutParams.height = this.f9645aw;
                this.xha.setLayoutParams(layoutParams);
                if (this.f9651ka.m14455nh().f11343lr) {
                    this.xha.setOnClickListener(abstractViewOnClickListenerC3218ik);
                    this.xha.setOnTouchListener(onTouchListener);
                } else {
                    this.xha.setOnClickListener(onClickListener);
                }
            }
            if (this.f9651ka.m14455nh() != null && (view = this.f9653mj) != null) {
                C3583qd.m16612ri(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f9653mj.getLayoutParams();
                layoutParams2.height = this.f9645aw;
                this.f9653mj.setLayoutParams(layoutParams2);
                if (this.f9651ka.m14455nh().f11342ka) {
                    this.f9653mj.setOnClickListener(abstractViewOnClickListenerC3218ik);
                    this.f9653mj.setOnTouchListener(onTouchListener);
                } else {
                    this.f9653mj.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.jbs;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        TTWebsiteActivity.m10758ri(C3075sf.this.f9652lr, C3075sf.this.f9651ka, C3075sf.this.tan);
                    } catch (Throwable th) {
                        C2707ac.m10196ik("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.f9655qt;
        if (imageView != null) {
            imageView.setClickable(true);
            C2751lr.m10463lr().m10469ri((int) C3583qd.m16603ri(C3299nr.m14642ri(), 14.0f, true), this.f9655qt, this.f9650ik.f9389lr);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo12233ri(boolean z) {
        int i = 8;
        C3583qd.m16612ri((View) this.jbs, C3279dw.m14090ik(this.f9651ka) ? 8 : 0);
        ImageView imageView = this.f9655qt;
        if (this.f9651ka.m14576zz() && this.f9651ka.wjv()) {
            i = 0;
        }
        C3583qd.m16612ri((View) imageView, i);
        mo12224lr(z);
        if (this.f9654nr) {
            mo12217fi();
        }
    }

    /* JADX INFO: renamed from: ri */
    protected boolean mo12234ri() {
        return true;
    }

    /* JADX INFO: renamed from: sf */
    public View mo12235sf() {
        return this.f9658uq;
    }

    public void slm() {
        C3273ac c3273ac = this.f9659vr;
        if (c3273ac != null) {
            c3273ac.m14004mj();
        }
    }

    /* JADX INFO: renamed from: vr */
    public void mo12236vr() {
        C3273ac c3273ac = this.f9659vr;
        if (c3273ac != null) {
            c3273ac.xha();
        }
    }

    public void xha() {
        if (this.f9655qt.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9655qt.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.f9655qt.setLayoutParams(marginLayoutParams);
        }
    }
}
