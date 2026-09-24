package com.bytedance.sdk.openadsdk.core.bgr.p198lr;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3302pv;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.jbs.C3224ay;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3090di;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import com.bytedance.sdk.openadsdk.p236ka.xha;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3120di extends C3192ik implements InterfaceC1999ik.ri, igq.InterfaceC2719ri, C3122ik.ri {

    /* JADX INFO: renamed from: uq */
    private static final Integer f10011uq = 0;
    private static final Integer wjv = 1;

    /* JADX INFO: renamed from: ac */
    private boolean f10012ac;

    /* JADX INFO: renamed from: aw */
    protected int f10013aw;

    /* JADX INFO: renamed from: ay */
    private String f10014ay;
    boolean bgr;

    /* JADX INFO: renamed from: bu */
    private final Context f10015bu;

    /* JADX INFO: renamed from: co */
    protected String f10016co;

    /* JADX INFO: renamed from: di */
    public xha f10017di;

    /* JADX INFO: renamed from: dw */
    private long f10018dw;
    private boolean dzy;
    private final AtomicBoolean feb;

    /* JADX INFO: renamed from: fi */
    public boolean f10019fi;

    /* JADX INFO: renamed from: fr */
    private boolean f10020fr;
    private final Handler hcw;

    /* JADX INFO: renamed from: ig */
    private View f10021ig;
    private boolean igq;
    private String ihz;

    /* JADX INFO: renamed from: ik */
    protected FrameLayout f10022ik;
    protected ImageView jbs;

    /* JADX INFO: renamed from: jc */
    private final AtomicBoolean f10023jc;

    /* JADX INFO: renamed from: ka */
    protected boolean f10024ka;

    /* JADX INFO: renamed from: kt */
    private final Runnable f10025kt;

    /* JADX INFO: renamed from: lr */
    protected C3122ik f10026lr;

    /* JADX INFO: renamed from: mj */
    protected ImageView f10027mj;

    /* JADX INFO: renamed from: nr */
    private ViewGroup f10028nr;

    /* JADX INFO: renamed from: oh */
    private boolean f10029oh;
    private final boolean ory;

    /* JADX INFO: renamed from: pv */
    private final String f10030pv;

    /* JADX INFO: renamed from: qd */
    private InterfaceC1999ik.ik f10031qd;

    /* JADX INFO: renamed from: qt */
    protected ImageView f10032qt;

    /* JADX INFO: renamed from: ri */
    protected final wjv f10033ri;

    /* JADX INFO: renamed from: sf */
    protected boolean f10034sf;
    public lr slm;
    private ViewTreeObserver.OnGlobalLayoutListener srn;

    /* JADX INFO: renamed from: su */
    private boolean f10035su;
    private boolean tan;

    /* JADX INFO: renamed from: vr */
    protected boolean f10036vr;

    /* JADX INFO: renamed from: xd */
    private long f10037xd;
    protected RelativeLayout xha;

    /* JADX INFO: renamed from: zf */
    private boolean f10038zf;
    private final ViewTreeObserver.OnScrollChangedListener zyn;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.lr.di$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        void mo12819ri(boolean z, long j, long j2, long j3, boolean z2);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.lr.di$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo12820ri(View view, int i);
    }

    public C3120di(Context context, wjv wjvVar, xha xhaVar) {
        this(context, wjvVar, false, xhaVar);
    }

    public C3120di(Context context, wjv wjvVar, String str, boolean z, boolean z2, xha xhaVar) {
        this(context, wjvVar, false, str, z, z2, xhaVar);
    }

    public C3120di(Context context, wjv wjvVar, boolean z, xha xhaVar) {
        this(context, wjvVar, z, "embeded_ad", false, false, xhaVar);
    }

    public C3120di(Context context, wjv wjvVar, boolean z, String str, boolean z2, boolean z3, xha xhaVar) {
        super(context);
        this.tan = true;
        this.f10024ka = true;
        this.f10012ac = false;
        this.f10019fi = false;
        this.f10020fr = true;
        this.f10035su = false;
        this.igq = true;
        this.f10034sf = true;
        this.f10016co = "embeded_ad";
        this.f10013aw = 50;
        this.f10038zf = true;
        this.ory = false;
        this.hcw = new igq(C3332vr.m14978lr().getLooper(), this);
        this.dzy = false;
        this.f10030pv = Build.MODEL;
        this.bgr = false;
        this.f10036vr = true;
        this.f10023jc = new AtomicBoolean(false);
        this.f10025kt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.4
            @Override // java.lang.Runnable
            public void run() {
                C3120di c3120di = C3120di.this;
                c3120di.m12799ri(c3120di.f10029oh, C3120di.f10011uq.intValue());
            }
        };
        this.feb = new AtomicBoolean(false);
        this.zyn = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                C3120di.this.m12791nr();
            }
        };
        try {
            if (wjvVar.wzs()) {
                this.f10014ay = CacheDirFactory.getICacheDir(0).mo6273lr();
            }
        } catch (Throwable unused) {
        }
        if (xhaVar != null) {
            this.f10017di = xhaVar;
        }
        this.f10016co = str;
        this.f10015bu = context;
        this.f10033ri = wjvVar;
        this.f10012ac = z;
        setContentDescription("NativeVideoTsView");
        this.f10035su = z2;
        this.igq = z3;
        mo12808lr();
        m12785fi();
    }

    /* JADX INFO: renamed from: ac */
    private void m12781ac() {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik == null) {
            return;
        }
        c3122ik.m12971ka(this.tan);
        this.f10026lr.m12952ri((C3122ik.ri) this);
        this.f10026lr.mo6383ri((InterfaceC1999ik.ri) this);
    }

    /* JADX INFO: renamed from: ay */
    private void m12782ay() {
        this.f10029oh = m12805co();
        dzy.m16411ri(this.f10025kt);
    }

    /* JADX INFO: renamed from: dw */
    private void m12784dw() {
        if (this.f10026lr == null || m12792oh()) {
            return;
        }
        if ((!m12786fr() || C3535ri.m16080ri("sp_multi_native_video_data", "key_video_is_update_flag", false)) && m12786fr()) {
            long jJbs = this.f10026lr.jbs();
            long jXha = this.f10026lr.xha() + jJbs;
            boolean zM16080ri = C3535ri.m16080ri("sp_multi_native_video_data", "key_native_video_complete", false);
            long jM16065ri = C3535ri.m16065ri("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jM16065ri2 = C3535ri.m16065ri("sp_multi_native_video_data", "key_video_total_play_duration", jXha);
            long jM16065ri3 = C3535ri.m16065ri("sp_multi_native_video_data", "key_video_duration", jJbs);
            C3535ri.m16073ri("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.f10026lr.m12978lr(zM16080ri);
            this.f10026lr.m12973lr(jM16065ri);
            this.f10026lr.m12968ik(jM16065ri2);
            this.f10026lr.m12970ka(jM16065ri3);
        }
    }

    /* JADX INFO: renamed from: fi */
    private void m12785fi() {
        addView(m12793ri(this.f10015bu));
        tan();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                C3120di.this.m12791nr();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                C3120di.this.m12791nr();
            }
        });
    }

    /* JADX INFO: renamed from: fr */
    private boolean m12786fr() {
        wjv wjvVar = this.f10033ri;
        if (wjvVar == null) {
            return false;
        }
        return wjvVar.rja();
    }

    private boolean hcw() {
        return 5 == C3299nr.m14639ka().m14858lr(this.f10033ri.m14545ur());
    }

    private void igq() {
        if (m12792oh() || !m12786fr()) {
            return;
        }
        C3535ri.m16073ri("sp_multi_native_video_data", "key_video_isfromvideodetailpage", Boolean.FALSE);
        C3535ri.m16073ri("sp_multi_native_video_data", "key_video_is_from_detail_page", Boolean.FALSE);
    }

    private void ihz() {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik == null) {
            tan();
        } else if ((c3122ik instanceof C3122ik) && !m12792oh()) {
            this.f10026lr.slm();
        }
        if (this.f10026lr == null || !this.f10023jc.get()) {
            return;
        }
        this.f10023jc.set(false);
        mo12808lr();
        if (!m12810mj()) {
            if (this.f10026lr.mo6371aw()) {
                this.f10026lr.mo6371aw();
                m12809lr(true);
                return;
            } else {
                xha();
                C3583qd.m16612ri((View) this.xha, 0);
                return;
            }
        }
        C3583qd.m16612ri((View) this.xha, 8);
        ImageView imageView = this.jbs;
        if (imageView != null) {
            C3583qd.m16612ri((View) imageView, 8);
        }
        wjv wjvVar = this.f10033ri;
        if (wjvVar == null || wjvVar.m14389eu() == null) {
            return;
        }
        C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(this.f10033ri.m14476qf()).mo6270ik(), this.f10033ri);
        c3126lrM14345ri.m6318lr(this.f10033ri.m14533tn());
        c3126lrM14345ri.m6317lr(this.f10028nr.getWidth());
        c3126lrM14345ri.m6311ik(this.f10028nr.getHeight());
        c3126lrM14345ri.m6312ik(this.f10033ri.yjg());
        c3126lrM14345ri.m6326ri(0L);
        c3126lrM14345ri.m6329ri(jbs());
        m12796ri(c3126lrM14345ri);
        this.f10026lr.mo6387ri(c3126lrM14345ri);
        this.f10026lr.m12978lr(false);
    }

    /* JADX INFO: renamed from: ka */
    private void m12788ka() {
        mo6399ri(0L, 0);
        this.f10031qd = null;
    }

    /* JADX INFO: renamed from: lr */
    private RelativeLayout m12790lr(Context context) {
        com.bytedance.sdk.openadsdk.core.p217di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p217di.xha(context);
        xhaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        xhaVar.setVisibility(8);
        C3193ka c3193ka = new C3193ka(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        c3193ka.setLayoutParams(layoutParams);
        c3193ka.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f10027mj = c3193ka;
        C3193ka c3193ka2 = new C3193ka(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        c3193ka2.setLayoutParams(layoutParams2);
        c3193ka2.setVisibility(8);
        c3193ka2.setBackground(C2729uq.m10303ik(context, "tt_new_play_video"));
        this.f10032qt = c3193ka2;
        xhaVar.addView(c3193ka);
        xhaVar.addView(c3193ka2);
        return xhaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nr */
    public void m12791nr() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.hcw;
        if (handler == null || jElapsedRealtime - this.f10037xd <= 500) {
            return;
        }
        this.f10037xd = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    /* JADX INFO: renamed from: oh */
    private boolean m12792oh() {
        return this.f10012ac;
    }

    private boolean ory() {
        return 2 == C3299nr.m14639ka().m14858lr(this.f10033ri.m14545ur());
    }

    /* JADX INFO: renamed from: ri */
    private View m12793ri(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.f10028nr = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.f10022ik = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.f10021ig = view;
        return frameLayout;
    }

    /* JADX INFO: renamed from: ri */
    private void m12795ri(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12796ri(C1996ik c1996ik) {
        try {
            if (this.f10033ri.wzs()) {
                c1996ik.m6327ri(this.f10014ay);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12799ri(boolean z, int i) {
        if (this.f10033ri == null || this.f10026lr == null) {
            return;
        }
        boolean zM12800su = m12800su();
        igq();
        if (zM12800su && this.f10026lr.mo6371aw()) {
            this.f10026lr.mo6371aw();
            m12809lr(true);
            m12788ka();
            return;
        }
        if (!z || !this.f10020fr || this.f10026lr.mo6371aw() || this.f10026lr.wjv()) {
            if (this.f10026lr.mo6388sf() == null || !this.f10026lr.mo6388sf().mo6167di()) {
                return;
            }
            this.f10026lr.mo6377lr();
            mo12814ri(true);
            InterfaceC1999ik.ik ikVar = this.f10031qd;
            if (ikVar != null) {
                ikVar.mo6391h_();
                return;
            }
            return;
        }
        if (this.f10026lr.mo6388sf() == null || !this.f10026lr.mo6388sf().xha()) {
            if (this.tan && this.f10026lr.mo6388sf() == null) {
                if (!this.f10023jc.get()) {
                    this.f10023jc.set(true);
                }
                this.feb.set(false);
                ihz();
                return;
            }
            return;
        }
        if (this.tan || i == 1) {
            C3122ik c3122ik = this.f10026lr;
            if (c3122ik != null) {
                m12815ri(c3122ik.m12963ay(), "changeVideoStatus");
            }
            if ("ALP-AL00".equals(this.f10030pv)) {
                this.f10026lr.mo6375ik();
            } else {
                if (!C3304qt.m14669lr().bgr()) {
                    zM12800su = true;
                }
                this.f10026lr.xha(zM12800su);
            }
            mo12814ri(false);
            InterfaceC1999ik.ik ikVar2 = this.f10031qd;
            if (ikVar2 != null) {
                ikVar2.mo6392i_();
            }
        }
    }

    /* JADX INFO: renamed from: su */
    private boolean m12800su() {
        if (m12792oh() || !m12786fr()) {
            return false;
        }
        return C3535ri.m16080ri("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || C3535ri.m16080ri("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void tan() {
        this.f10026lr = new C3122ik(this.f10015bu, this.f10022ik, this.f10033ri, this.f10016co, !m12792oh(), this.f10035su, this.igq, this.f10017di);
        m12781ac();
        if (this.srn == null) {
            this.srn = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (C3120di.this.f10028nr == null || C3120di.this.f10028nr.getViewTreeObserver() == null || C3120di.this.f10026lr == null) {
                        return;
                    }
                    C3120di.this.f10026lr.m12946ri(C3120di.this.f10028nr.getWidth(), C3120di.this.f10028nr.getHeight());
                    C3120di.this.f10028nr.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    C3120di.this.srn = null;
                }
            };
            this.f10028nr.getViewTreeObserver().addOnGlobalLayoutListener(this.srn);
        }
    }

    /* JADX INFO: renamed from: uq */
    private void m12801uq() {
        this.slm = null;
        if ((this.f10026lr instanceof C3122ik) && !m12792oh()) {
            this.f10026lr.dzy();
        }
        m12817sf();
        mo12814ri(false);
        wjv();
    }

    private void wjv() {
        if (!this.f10023jc.get()) {
            this.f10023jc.set(true);
            C3122ik c3122ik = this.f10026lr;
            if (c3122ik != null) {
                c3122ik.mo6384ri(true, 3);
            }
        }
        this.feb.set(false);
    }

    /* JADX INFO: renamed from: xd */
    private void m12802xd() {
        C3583qd.m16579fi(this.jbs);
        C3583qd.m16579fi(this.xha);
    }

    /* JADX INFO: renamed from: zf */
    private void m12803zf() {
        this.hcw.removeMessages(1);
        C3332vr.m14976ik().removeCallbacks(this.f10025kt);
    }

    /* JADX INFO: renamed from: aw */
    public boolean m12804aw() {
        boolean z = false;
        if (C2724nr.m10255ik(C3299nr.m14642ri()) == 0) {
            return false;
        }
        if (this.f10026lr.mo6388sf() != null && this.f10026lr.mo6388sf().mo6167di()) {
            m12799ri(false, f10011uq.intValue());
            Handler handler = this.hcw;
            z = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z;
    }

    public void bgr() {
        if (getNativeVideoController() == null || !(getNativeVideoController() instanceof C3122ik)) {
            return;
        }
        C3122ik nativeVideoController = getNativeVideoController();
        nativeVideoController.mo6418ri(nativeVideoController.mo6372co(), this);
    }

    /* JADX INFO: renamed from: co */
    boolean m12805co() {
        return C3302pv.m14656ri(this, 50, C3224ay.m13589lr(this.f10016co) ? 1 : 5, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3122ik.ri
    /* JADX INFO: renamed from: di */
    public void mo12806di() {
        InterfaceC1999ik.ik ikVar = this.f10031qd;
        if (ikVar != null) {
            ikVar.mo6390g_();
        }
    }

    public double getCurrentPlayTime() {
        C3122ik c3122ik = this.f10026lr;
        return c3122ik != null ? (c3122ik.mo6373di() * 1.0d) / 1000.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public C3122ik getNativeVideoController() {
        return this.f10026lr;
    }

    /* JADX INFO: renamed from: ik */
    protected void mo12807ik() {
        if (m12804aw()) {
            return;
        }
        m12818vr();
    }

    public boolean jbs() {
        return this.f10024ka;
    }

    /* JADX INFO: renamed from: lr */
    protected void mo12808lr() {
        wjv wjvVar = this.f10033ri;
        if (wjvVar == null) {
            return;
        }
        int iM14545ur = wjvVar.m14545ur();
        int iM14858lr = C3299nr.m14639ka().m14858lr(iM14545ur);
        int iM10255ik = C2724nr.m10255ik(C3299nr.m14642ri());
        if (iM14858lr == 1) {
            this.tan = C3571ig.m16451ka(iM10255ik);
        } else if (iM14858lr == 2) {
            this.tan = C3571ig.m16441fi(iM10255ik) || C3571ig.m16451ka(iM10255ik) || C3571ig.m16437di(iM10255ik);
        } else if (iM14858lr == 3) {
            this.tan = false;
        } else if (iM14858lr == 4) {
            this.bgr = true;
        } else if (iM14858lr == 5) {
            this.tan = C3571ig.m16451ka(iM10255ik) || C3571ig.m16437di(iM10255ik);
        }
        if (this.f10012ac) {
            this.f10024ka = false;
        } else if (!this.f10019fi || !C3224ay.m13589lr(this.f10016co)) {
            this.f10024ka = C3299nr.m14639ka().m14853ik(String.valueOf(iM14545ur));
        }
        if ("open_ad".equals(this.f10016co)) {
            this.tan = true;
            this.f10024ka = true;
        }
        if (C3224ay.m13589lr(this.f10016co)) {
            this.f10024ka = true;
        }
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            c3122ik.m12971ka(this.tan);
        }
        this.f10019fi = true;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
    /* JADX INFO: renamed from: lr */
    public void mo6397lr(long j, int i) {
    }

    /* JADX INFO: renamed from: lr */
    public void m12809lr(boolean z) {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            c3122ik.m12978lr(z);
            C3121fi c3121fiIhz = this.f10026lr.mo6372co();
            if (c3121fiIhz != null) {
                c3121fiIhz.mo6402lr();
                View viewMo6401ik = c3121fiIhz.mo6401ik();
                if (viewMo6401ik != null) {
                    if (viewMo6401ik.getParent() != null) {
                        ((ViewGroup) viewMo6401ik.getParent()).removeView(viewMo6401ik);
                    }
                    viewMo6401ik.setVisibility(0);
                    addView(viewMo6401ik);
                    c3121fiIhz.mo6405ri(this.f10033ri, new WeakReference<>(this.f10015bu), false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: mj */
    public boolean m12810mj() {
        return this.tan;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ihz();
        if (this.f10036vr) {
            getViewTreeObserver().addOnScrollChangedListener(this.zyn);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12801uq();
        if (this.f10036vr) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.zyn);
            }
            ViewGroup viewGroup = this.f10028nr;
            if (viewGroup == null || this.srn == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.srn);
                this.srn = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        ihz();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lr lrVar;
        C3122ik c3122ik;
        if (!this.f10012ac && (lrVar = this.slm) != null && (c3122ik = this.f10026lr) != null) {
            lrVar.mo12819ri(c3122ik.mo6371aw(), this.f10026lr.jbs(), this.f10026lr.m12980oh(), this.f10026lr.mo6373di(), this.tan);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m12801uq();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        C3122ik c3122ik;
        C3122ik c3122ik2;
        C3122ik c3122ik3;
        C3122ik c3122ik4;
        if ("open_ad".equals(this.f10016co)) {
            m12803zf();
            return;
        }
        this.f10020fr = z;
        super.onWindowFocusChanged(z);
        C2897ik.m11147ri(this.f10033ri, z);
        m12784dw();
        if (this.f10036vr) {
            if (m12800su() && (c3122ik4 = this.f10026lr) != null && c3122ik4.mo6371aw()) {
                igq();
                C3583qd.m16612ri((View) this.xha, 8);
                m12809lr(true);
                m12788ka();
                return;
            }
            mo12808lr();
            if (!m12792oh() && m12810mj() && (c3122ik2 = this.f10026lr) != null && !c3122ik2.wjv()) {
                if (this.hcw != null) {
                    if (z && (c3122ik3 = this.f10026lr) != null && !c3122ik3.mo6371aw()) {
                        this.hcw.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        m12803zf();
                        m12799ri(false, f10011uq.intValue());
                        return;
                    }
                }
                return;
            }
            if (m12810mj()) {
                return;
            }
            if (!z && (c3122ik = this.f10026lr) != null && c3122ik.mo6388sf() != null && this.f10026lr.mo6388sf().mo6167di()) {
                m12803zf();
                m12799ri(false, f10011uq.intValue());
            } else if (z) {
                this.hcw.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        C3122ik c3122ik;
        wjv wjvVar;
        C3122ik c3122ik2;
        C3122ik c3122ik3;
        super.onWindowVisibilityChanged(i);
        m12784dw();
        if (m12800su() && (c3122ik3 = this.f10026lr) != null && c3122ik3.mo6371aw()) {
            igq();
            C3583qd.m16612ri((View) this.xha, 8);
            m12809lr(true);
            m12788ka();
            return;
        }
        mo12808lr();
        if (m12792oh() || !m12810mj() || (c3122ik = this.f10026lr) == null || c3122ik.wjv() || (wjvVar = this.f10033ri) == null) {
            return;
        }
        if (this.f10038zf && wjvVar.m14389eu() != null) {
            this.f10033ri.m14389eu();
            C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(this.f10033ri.m14476qf()).mo6270ik(), this.f10033ri);
            c3126lrM14345ri.m6318lr(this.f10033ri.m14533tn());
            c3126lrM14345ri.m6317lr(this.f10028nr.getWidth());
            c3126lrM14345ri.m6311ik(this.f10028nr.getHeight());
            c3126lrM14345ri.m6312ik(this.f10033ri.yjg());
            c3126lrM14345ri.m6326ri(this.f10018dw);
            c3126lrM14345ri.m6329ri(jbs());
            m12796ri(c3126lrM14345ri);
            this.f10026lr.mo6387ri(c3126lrM14345ri);
            this.f10038zf = false;
            C3583qd.m16612ri((View) this.xha, 8);
        }
        if (i != 0 || !this.f10036vr || this.hcw == null || (c3122ik2 = this.f10026lr) == null || c3122ik2.mo6371aw()) {
            return;
        }
        this.hcw.obtainMessage(1).sendToTarget();
    }

    /* JADX INFO: renamed from: qt */
    public void m12811qt() {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            C3121fi c3121fiIhz = c3122ik.mo6372co();
            if (c3121fiIhz != null) {
                c3121fiIhz.mo6403ri();
            }
            m12802xd();
        }
    }

    /* JADX INFO: renamed from: ri */
    public C3090di m12812ri(List<Pair<View, FriendlyObstructionPurpose>> list) {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik instanceof C3122ik) {
            return c3122ik.m12945ri(this, list);
        }
        return null;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
    /* JADX INFO: renamed from: ri */
    public void mo6398ri() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3122ik.ri
    /* JADX INFO: renamed from: ri */
    public void mo12813ri(int i) {
        mo12808lr();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
    /* JADX INFO: renamed from: ri */
    public void mo6399ri(long j, int i) {
        InterfaceC1999ik.ik ikVar = this.f10031qd;
        if (ikVar != null) {
            ikVar.mo6393j_();
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
    /* JADX INFO: renamed from: ri */
    public void mo6400ri(long j, long j2) {
        InterfaceC1999ik.ik ikVar = this.f10031qd;
        if (ikVar != null) {
            ikVar.mo6394ri(j, j2);
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        if (message.what == 1) {
            m12782ay();
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void mo12814ri(boolean z) {
        if (this.jbs == null) {
            ImageView imageView = new ImageView(getContext());
            this.jbs = imageView;
            imageView.setImageResource(C2729uq.m10305ka(C3299nr.m14642ri(), "tt_new_play_video"));
            this.jbs.setScaleType(ImageView.ScaleType.FIT_XY);
            int iM16589lr = C3583qd.m16589lr(getContext(), this.f10013aw);
            int iM16589lr2 = C3583qd.m16589lr(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM16589lr, iM16589lr);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iM16589lr2;
            layoutParams.bottomMargin = iM16589lr2;
            this.f10028nr.addView(this.jbs, layoutParams);
            this.jbs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C3120di.this.m12818vr();
                }
            });
        }
        if (z) {
            this.jbs.setVisibility(0);
        } else {
            this.jbs.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12815ri(boolean z, String str) {
        if (C3224ay.m13589lr(this.f10016co)) {
            z = true;
        }
        this.f10024ka = z;
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            c3122ik.mo6385ri(z, str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m12816ri(long j, boolean z, boolean z2) {
        boolean zMo6387ri = false;
        this.f10028nr.setVisibility(0);
        this.f10018dw = j;
        if (!m12792oh()) {
            return true;
        }
        this.f10026lr.m12987ri(false);
        wjv wjvVar = this.f10033ri;
        if (wjvVar != null && wjvVar.m14389eu() != null) {
            C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(this.f10033ri.m14476qf()).mo6270ik(), this.f10033ri);
            c3126lrM14345ri.m6318lr(this.f10033ri.m14533tn());
            c3126lrM14345ri.m6317lr(this.f10028nr.getWidth());
            c3126lrM14345ri.m6311ik(this.f10028nr.getHeight());
            c3126lrM14345ri.m6312ik(this.f10033ri.yjg());
            c3126lrM14345ri.m6326ri(j);
            c3126lrM14345ri.m6329ri(jbs());
            m12796ri(c3126lrM14345ri);
            if (z2) {
                this.f10026lr.m12974lr(c3126lrM14345ri);
                return true;
            }
            zMo6387ri = this.f10026lr.mo6387ri(c3126lrM14345ri);
        }
        if (((j > 0 && !z && !z2) || (j > 0 && z)) && this.f10026lr != null) {
            C3412vr.ri riVar = new C3412vr.ri();
            riVar.m15466lr(this.f10026lr.mo6373di());
            riVar.m15463ka(this.f10026lr.jbs());
            riVar.m15459ik(this.f10026lr.xha());
            C3413ri.m15485lr(this.f10026lr.mo6372co(), riVar);
        }
        return zMo6387ri;
    }

    public void setAdCreativeClickListener(ri riVar) {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            c3122ik.m12951ri(riVar);
        }
    }

    public void setControllerStatusCallBack(lr lrVar) {
        this.slm = lrVar;
    }

    public void setIsAutoPlay(boolean z) {
        if (this.dzy) {
            return;
        }
        int iM14858lr = C3299nr.m14639ka().m14858lr(this.f10033ri.m14545ur());
        if (z && iM14858lr != 4 && (!C2724nr.m10254fi(this.f10015bu) ? !(!C2724nr.m10253di(this.f10015bu) ? C2724nr.m10256ka(this.f10015bu) : ory() || hcw()) : !ory())) {
            z = false;
        }
        this.tan = z;
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            c3122ik.m12971ka(z);
        }
        if (this.tan) {
            C3583qd.m16612ri((View) this.xha, 8);
        } else {
            xha();
            RelativeLayout relativeLayout = this.xha;
            if (relativeLayout != null) {
                C3583qd.m16612ri((View) relativeLayout, 0);
                wjv wjvVar = this.f10033ri;
                if (wjvVar != null && wjvVar.m14389eu() != null) {
                    C2751lr.m10463lr().m10472ri(this.f10033ri.m14389eu().m6357qt(), this.f10033ri.m14389eu().m6345ik(), this.f10033ri.m14389eu().m6351lr(), this.f10027mj, this.f10033ri);
                }
            }
        }
        this.dzy = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.f10034sf = z;
    }

    public void setNeedSelfManagerVideo(boolean z) {
        this.f10036vr = z;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            c3122ik.m12950ri(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(InterfaceC1999ik.ik ikVar) {
        this.f10031qd = ikVar;
    }

    public void setVideoAdLoadListener(InterfaceC1999ik.ka kaVar) {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            c3122ik.mo12948ri(kaVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.ihz = str;
    }

    public void setVideoPlayCallback(InterfaceC3124lr interfaceC3124lr) {
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik != null) {
            c3122ik.m12953ri(interfaceC3124lr);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            wjv();
        }
    }

    /* JADX INFO: renamed from: sf */
    public void m12817sf() {
        C3121fi c3121fiIhz;
        C3122ik c3122ik = this.f10026lr;
        if (c3122ik == null || (c3121fiIhz = c3122ik.mo6372co()) == null) {
            return;
        }
        c3121fiIhz.mo6403ri();
        View viewMo6401ik = c3121fiIhz.mo6401ik();
        if (viewMo6401ik != null) {
            viewMo6401ik.setVisibility(8);
            if (viewMo6401ik.getParent() != null) {
                ((ViewGroup) viewMo6401ik.getParent()).removeView(viewMo6401ik);
            }
        }
    }

    public void slm() {
        C3283ka c3283kaM14473qc;
        C3097ka c3097kaM14188ri;
        wjv wjvVar = this.f10033ri;
        if (wjvVar == null || (c3283kaM14473qc = wjvVar.m14473qc()) == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
            return;
        }
        c3097kaM14188ri.m12469fi(this.f10018dw);
    }

    /* JADX INFO: renamed from: vr */
    public void m12818vr() {
        if (C2724nr.m10255ik(C3299nr.m14642ri()) != 0 && m12805co()) {
            if (this.f10026lr.mo6388sf() != null) {
                if (this.f10026lr.mo6388sf().xha()) {
                    m12799ri(true, wjv.intValue());
                    mo12808lr();
                    Handler handler = this.hcw;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.f10026lr.mo6388sf().mo6173lr() && !this.f10036vr) {
                    m12811qt();
                    C3122ik c3122ik = this.f10026lr;
                    if (c3122ik instanceof C3122ik) {
                        c3122ik.m12939ig();
                        return;
                    }
                    return;
                }
            }
            if (m12810mj() || this.feb.get()) {
                return;
            }
            this.feb.set(true);
            m12802xd();
            wjv wjvVar = this.f10033ri;
            if (wjvVar != null && wjvVar.m14389eu() != null) {
                m12802xd();
                this.f10033ri.m14389eu();
                C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(this.f10033ri.m14476qf()).mo6270ik(), this.f10033ri);
                c3126lrM14345ri.m6318lr(this.f10033ri.m14533tn());
                c3126lrM14345ri.m6317lr(this.f10028nr.getWidth());
                c3126lrM14345ri.m6311ik(this.f10028nr.getHeight());
                c3126lrM14345ri.m6312ik(this.f10033ri.yjg());
                c3126lrM14345ri.m6326ri(this.f10018dw);
                c3126lrM14345ri.m6329ri(jbs());
                c3126lrM14345ri.m6327ri(CacheDirFactory.getICacheDir(this.f10033ri.m14476qf()).mo6270ik());
                m12796ri(c3126lrM14345ri);
                this.f10026lr.mo6387ri(c3126lrM14345ri);
            }
            Handler handler2 = this.hcw;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            mo12814ri(false);
        }
    }

    public void xha() {
        View view;
        if (this.f10015bu == null || (view = this.f10021ig) == null || view.getParent() == null || this.f10033ri == null || this.xha != null) {
            return;
        }
        ViewParent parent = this.f10021ig.getParent();
        RelativeLayout relativeLayoutM12790lr = m12790lr(this.f10015bu);
        if (parent != null && (parent instanceof ViewGroup)) {
            m12795ri(relativeLayoutM12790lr, (ViewGroup) parent, this.f10021ig);
        }
        this.xha = relativeLayoutM12790lr;
        if (this.f10034sf) {
            C3583qd.m16612ri((View) this.f10032qt, 0);
        }
        if (this.f10033ri.m14389eu() != null && this.f10033ri.m14389eu().m6357qt() != null) {
            C2751lr.m10463lr().m10472ri(this.f10033ri.m14389eu().m6357qt(), this.f10033ri.m14389eu().m6345ik(), this.f10033ri.m14389eu().m6351lr(), this.f10027mj, this.f10033ri);
        }
        ImageView imageView = this.f10032qt;
        if (imageView != null) {
            imageView.setClickable(true);
            this.f10032qt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.di.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    C3120di.this.mo12807ik();
                }
            });
        }
    }
}
