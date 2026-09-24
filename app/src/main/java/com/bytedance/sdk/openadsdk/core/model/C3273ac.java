package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.p028vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.p124ka.C2498ri;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p145fi.InterfaceC2622mj;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.common.C2932co;
import com.bytedance.sdk.openadsdk.common.C2934fi;
import com.bytedance.sdk.openadsdk.common.C2952sf;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.srn;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.InterfaceC3398co;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.ac */
/* JADX INFO: loaded from: classes9.dex */
public class C3273ac implements Handler.Callback {
    private C3195mj aac;

    /* JADX INFO: renamed from: ac */
    private C3335bu f11097ac;
    private ValueAnimator ajz;

    /* JADX INFO: renamed from: aw */
    C3221ri f11098aw;

    /* JADX INFO: renamed from: ay */
    private FrameLayout f11099ay;
    C3220lr bgr;

    /* JADX INFO: renamed from: bu */
    private View f11100bu;

    /* JADX INFO: renamed from: co */
    InterfaceC1999ik.ri f11101co;

    /* JADX INFO: renamed from: di */
    RelativeLayout f11102di;

    /* JADX INFO: renamed from: dw */
    private long f11103dw;
    private final View dzy;
    private C3348fi feb;

    /* JADX INFO: renamed from: fi */
    View f11105fi;

    /* JADX INFO: renamed from: fr */
    private C2932co f11106fr;
    private FrameLayout gcp;
    private final Activity hcw;

    /* JADX INFO: renamed from: ig */
    private InterfaceC3370ik f11107ig;
    private ImageView igq;
    private TextView ihz;

    /* JADX INFO: renamed from: ik */
    TextView f11108ik;
    ObjectAnimator jbs;

    /* JADX INFO: renamed from: ka */
    FrameLayout f11110ka;

    /* JADX INFO: renamed from: kt */
    private boolean f11111kt;

    /* JADX INFO: renamed from: lr */
    FrameLayout f11112lr;

    /* JADX INFO: renamed from: mj */
    FrameLayout f11113mj;

    /* JADX INFO: renamed from: nd */
    private AtomicBoolean f11114nd;

    /* JADX INFO: renamed from: nr */
    private TextView f11115nr;

    /* JADX INFO: renamed from: oh */
    private String f11116oh;

    /* JADX INFO: renamed from: pc */
    private lr f11117pc;

    /* JADX INFO: renamed from: pv */
    private int f11118pv;

    /* JADX INFO: renamed from: qd */
    private C3393aw f11119qd;

    /* JADX INFO: renamed from: qh */
    private C3222ac f11120qh;

    /* JADX INFO: renamed from: qt */
    ValueAnimator f11121qt;

    /* JADX INFO: renamed from: ri */
    ImageView f11122ri;
    private C3193ka rzk;

    /* JADX INFO: renamed from: sf */
    ObjectAnimator f11123sf;
    private int siy;
    private View slm;
    private boolean srn;

    /* JADX INFO: renamed from: su */
    private View f11124su;
    private TextView tan;
    private ILoader tnn;

    /* JADX INFO: renamed from: ud */
    private final boolean f11127ud;

    /* JADX INFO: renamed from: uq */
    private dzy f11128uq;

    /* JADX INFO: renamed from: vr */
    private Handler f11129vr;
    private int whw;
    private C2634di wjv;

    /* JADX INFO: renamed from: xd */
    private final InterfaceC3118lr f11130xd;

    /* JADX INFO: renamed from: xe */
    private LinearLayout.LayoutParams f11131xe;
    final wjv xha;

    /* JADX INFO: renamed from: xm */
    private C2934fi f11132xm;

    /* JADX INFO: renamed from: zb */
    private C3335bu f11133zb;

    /* JADX INFO: renamed from: zf */
    private View f11134zf;
    private String zyn;
    private final AtomicBoolean ory = new AtomicBoolean(false);

    /* JADX INFO: renamed from: jc */
    private final AtomicBoolean f11109jc = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fe */
    private volatile int f11104fe = 0;

    /* JADX INFO: renamed from: ta */
    private volatile int f11125ta = 0;
    private volatile int bnj = 0;

    /* JADX INFO: renamed from: tw */
    private float f11126tw = -1.0f;
    private final AtomicBoolean yjm = new AtomicBoolean(false);
    private long saa = -1;

    /* JADX INFO: renamed from: zk */
    private final AtomicBoolean f11135zk = new AtomicBoolean(false);
    private long luy = 0;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.ac$lr */
    /* JADX INFO: loaded from: classes3.dex */
    public static class lr implements InterfaceC3398co {

        /* JADX INFO: renamed from: ik */
        private final String f11168ik;

        /* JADX INFO: renamed from: ka */
        private final WeakReference<C3273ac> f11169ka;

        /* JADX INFO: renamed from: lr */
        private final wjv f11170lr;

        /* JADX INFO: renamed from: ri */
        private final int f11171ri;

        public lr(int i, wjv wjvVar, String str, C3273ac c3273ac) {
            this.f11171ri = i;
            this.f11170lr = wjvVar;
            this.f11168ik = str;
            this.f11169ka = new WeakReference<>(c3273ac);
        }

        @Override // com.bytedance.sdk.openadsdk.p236ka.InterfaceC3398co
        /* JADX INFO: renamed from: ri */
        public void mo10656ri(int i) {
            C3273ac c3273ac = this.f11169ka.get();
            if (c3273ac != null) {
                C3414ik.ri.m15569ri(this.f11171ri, c3273ac.bnj, c3273ac.f11125ta, c3273ac.f11104fe - c3273ac.f11125ta, this.f11170lr, this.f11168ik, i);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.ac$ri */
    /* JADX INFO: loaded from: classes3.dex */
    private static class ri implements InterfaceC2622mj {
        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2622mj
        /* JADX INFO: renamed from: ri */
        public Bitmap mo8253ri(Bitmap bitmap) {
            return C2498ri.m8826ri(C3299nr.m14642ri(), bitmap, 25);
        }
    }

    public C3273ac(Activity activity, final wjv wjvVar, String str, FrameLayout frameLayout, InterfaceC3118lr interfaceC3118lr, View view) {
        this.hcw = activity;
        this.xha = wjvVar;
        this.f11116oh = str;
        this.f11130xd = interfaceC3118lr;
        this.dzy = view;
        this.f11118pv = C3571ig.m16470ri(str);
        if (wjvVar != null) {
            this.zyn = wjvVar.mvf();
        }
        this.f11127ud = wjvVar.zyn() && m13961fi(wjvVar);
        if (!TextUtils.isEmpty(this.zyn)) {
            this.tnn = C3611lr.m16744ri().m16746lr();
            int iM16747ri = C3611lr.m16744ri().m16747ri(this.tnn, this.zyn);
            this.siy = iM16747ri;
            this.whw = iM16747ri > 0 ? 2 : 0;
        }
        boolean zM13968ka = m13968ka(wjvVar);
        boolean zXha = xha(wjvVar);
        boolean zM13971lr = m13971lr(wjvVar);
        if (zM13971lr) {
            this.f11116oh = "landingpage_split_screen";
        } else if (zM13968ka) {
            this.f11116oh = "landingpage_direct";
        } else if (zXha) {
            this.f11116oh = "aggregate_page";
        } else if (m13965ik(wjvVar)) {
            this.f11116oh = "landingpage_split_ceiling";
        }
        this.f11098aw = new C3221ri(C3299nr.m14642ri(), wjvVar, this.f11116oh, C3571ig.m16470ri(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.f11098aw.m13536ri(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.f11098aw.m13528ri(viewFindViewById);
        C3220lr c3220lr = new C3220lr(activity, wjvVar, this.f11116oh, C3571ig.m16470ri(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.ac.1
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr
            /* JADX INFO: renamed from: ri */
            public boolean mo13539ri(C3277co c3277co, Map<String, Object> map2) {
                if (C3273ac.m13978qt(wjvVar) && C3273ac.this.feb != null) {
                    C3273ac.this.feb.m15071ri(c3277co);
                    C3273ac.this.feb.m15074ri(map2);
                    if (C3273ac.jbs(C3273ac.this.xha) || C3273ac.this.f11111kt) {
                        return true;
                    }
                }
                return super.mo13539ri(c3277co, map2);
            }
        };
        this.bgr = c3220lr;
        c3220lr.m13536ri(map);
        this.bgr.m13528ri(viewFindViewById);
        this.f11113mj = frameLayout;
        if (zM13971lr || zM13968ka || zXha) {
            try {
                this.f11129vr = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e) {
                Log.e("LandingPageModel", "LandingPageModel: ", e);
                return;
            }
        }
        if (wjvVar.zyn()) {
            return;
        }
        if (zM13968ka || zXha) {
            Handler handler = this.f11129vr;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    /* JADX INFO: renamed from: ac */
    private void m13946ac() {
        C2634di c2634di = this.wjv;
        if (c2634di == null || c2634di.getWebView() == null) {
            return;
        }
        this.f11104fe = this.wjv.f7432ri;
        this.f11125ta = this.wjv.f7425lr;
        this.bnj = this.wjv.f7422ik;
        if (this.wjv.m9777lr()) {
            this.f11130xd.mo10585zb();
            this.f11103dw = System.currentTimeMillis();
        }
        if (this.wjv.m9776ka()) {
            m13949aw();
        }
        if (this.wjv.m9774ik()) {
            m13949aw();
            int iM16469ri = C3571ig.m16469ri(this.wjv.getWebView());
            lr lrVar = this.f11117pc;
            if (lrVar != null) {
                lrVar.mo10656ri(iM16469ri != 1 ? 0 : 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: aw */
    public void m13949aw() {
        this.ory.get();
        this.f11109jc.get();
        if (this.ory.get() || this.f11109jc.get()) {
            return;
        }
        this.ory.set(true);
        m14008ri(0);
        long jElapsedRealtime = this.saa == -1 ? 0L : SystemClock.elapsedRealtime() - this.saa;
        if (m13965ik(this.xha)) {
            C3414ik.m15509ik(this.xha, this.f11116oh, jElapsedRealtime);
        }
        C3414ik.m15547ri(this.xha, this.f11116oh, System.currentTimeMillis() - this.f11103dw, true);
        bgr();
    }

    /* JADX INFO: renamed from: aw */
    public static boolean m13950aw(wjv wjvVar) {
        if (wjvVar != null) {
            return m13961fi(wjvVar) || m13958di(wjvVar);
        }
        return false;
    }

    static /* synthetic */ int bgr(C3273ac c3273ac) {
        int i = c3273ac.f11125ta;
        c3273ac.f11125ta = i + 1;
        return i;
    }

    private void bgr() {
        this.f11102di.setVisibility(8);
        if (m13968ka(this.xha) || xha(this.xha) || !m14001ka() || m13965ik(this.xha)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.f11123sf = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.f11123sf.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C3273ac.this.f11099ay.getLayoutParams();
                layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                C3273ac.this.m14007ri((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                C3273ac.this.f11099ay.setLayoutParams(layoutParams);
            }
        });
        this.f11123sf.start();
    }

    /* JADX INFO: renamed from: bu */
    private void m13953bu() {
        C2952sf loadingStyle;
        C2932co c2932co = this.f11106fr;
        if (c2932co != null && (loadingStyle = c2932co.getLoadingStyle()) != null) {
            this.f11133zb = loadingStyle.m11416lr();
            this.aac = loadingStyle.m11414ik();
        }
        C3193ka c3193ka = this.rzk;
        if (c3193ka != null) {
            c3193ka.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C3273ac.this.rzk.getTag() != null) {
                        if (C3273ac.this.rzk.getTag().equals(1)) {
                            C3273ac.this.m14003lr(3);
                        } else if (C3273ac.this.rzk.getTag().equals(2)) {
                            C3273ac.this.m14003lr(4);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: co */
    static /* synthetic */ int m13954co(C3273ac c3273ac) {
        int i = c3273ac.f11104fe;
        c3273ac.f11104fe = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: co */
    private void m13955co() {
        dzy dzyVar = new dzy(this.hcw);
        this.f11128uq = dzyVar;
        dzyVar.m13451ri(this.f11130xd);
        this.f11128uq.m13422lr(this.wjv).m13447ri(C3239lr.m13712ri(this.xha)).m13411ik(this.xha.m14533tn()).m13416ka(this.xha.yjg()).m13442ri(this.xha).m13421lr(xha(this.xha) ? this.f11118pv : -1).m13432ri(this.xha.m14407hd()).m13423lr(this.f11116oh).m13408fi(this.xha.m14541uo()).m13435ri(this.wjv).m13443ri(new InterfaceC3338fi() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi
            /* JADX INFO: renamed from: ri */
            public void mo10615ri() {
                if (C3273ac.xha(C3273ac.this.xha) && (C3273ac.this.hcw instanceof InterfaceC3118lr)) {
                    ((InterfaceC3118lr) C3273ac.this.hcw).mo10614xd();
                } else if (C3273ac.this.feb != null) {
                    C3273ac.this.feb.m15066ik();
                }
            }
        });
    }

    /* JADX INFO: renamed from: co */
    public static boolean m13956co(wjv wjvVar) {
        return wjvVar != null && wjvVar.m14453nd() == 8 && wjvVar.aac() == 1;
    }

    /* JADX INFO: renamed from: di */
    public static boolean m13958di(wjv wjvVar) {
        C3293su c3293suDob;
        return (wjvVar == null || (c3293suDob = wjvVar.dob()) == null || c3293suDob.m14301ri() != 2) ? false : true;
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m13961fi(wjv wjvVar) {
        C3293su c3293suDob;
        return wjvVar != null && wjvVar.adz() == 3 && !C3279dw.m14092lr(wjvVar) && (wjvVar.m14406gz() == 0.0f || wjvVar.m14406gz() == 100.0f) && (c3293suDob = wjvVar.dob()) != null && c3293suDob.m14301ri() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public boolean m13964ik(int i) {
        return i == 1 || i == 2 || i == 4 || i == 5;
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m13965ik(wjv wjvVar) {
        return wjvVar != null && wjvVar.adz() == 3 && wjvVar.m14567zb() == 38 && wjvVar.bbu() == 1;
    }

    public static boolean jbs(wjv wjvVar) {
        return (wjvVar == null || wjvVar.ecl() == 1 || !m13978qt(wjvVar)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m13967ka(int i) {
        C3583qd.m16612ri((View) this.f11133zb, i);
        C3583qd.m16612ri((View) this.aac, i);
        if (this.f11109jc.get()) {
            C3583qd.m16612ri((View) this.f11115nr, i);
            C3583qd.m16612ri((View) this.tan, i);
            C3583qd.m16612ri((View) this.f11097ac, i);
            C3583qd.m16612ri((View) this.ihz, 0);
        }
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m13968ka(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        if (m13991sf(wjvVar)) {
            return true;
        }
        return wjvVar.adz() == 3 && (wjvVar.m14453nd() == 5 || m13961fi(wjvVar)) && !C3279dw.m14092lr(wjvVar) && (wjvVar.m14406gz() == 0.0f || wjvVar.m14406gz() == 100.0f);
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m13971lr(wjv wjvVar) {
        return wjvVar != null && wjvVar.adz() == 3 && wjvVar.m14453nd() == 6 && !C3279dw.m14092lr(wjvVar) && wjvVar.bbu() == 1 && (wjvVar.m14406gz() == 0.0f || wjvVar.m14406gz() == 100.0f);
    }

    /* JADX INFO: renamed from: mj */
    public static boolean m13973mj(wjv wjvVar) {
        return m13968ka(wjvVar) && !m13991sf(wjvVar);
    }

    /* JADX INFO: renamed from: nr */
    private void m13975nr() {
        if (m14001ka()) {
            this.f11124su.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.igq, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.jbs = duration;
            duration.setRepeatMode(2);
            this.jbs.setRepeatCount(-1);
            this.jbs.start();
            this.f11124su.setClickable(true);
            this.f11124su.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C3273ac.this.f11111kt) {
                        C3273ac.this.bgr.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    C3273ac.this.f11121qt = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    C3273ac.this.f11121qt.setDuration(200L);
                    C3273ac.this.f11121qt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C3273ac.this.f11099ay.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            C3273ac.this.m14007ri((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            C3273ac.this.f11099ay.setLayoutParams(layoutParams);
                        }
                    });
                    if (C3273ac.this.bgr.m13515di()) {
                        C3273ac.this.f11124su.performClick();
                        C3273ac.this.f11111kt = true;
                    }
                    C3273ac.this.f11121qt.start();
                    C3273ac.this.f11124su.setVisibility(8);
                    return true;
                }
            });
            this.f11124su.setOnClickListener(this.bgr);
        }
        if (!tan()) {
            this.f11113mj.setVisibility(8);
            this.f11112lr.setVisibility(0);
            this.f11122ri.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f11122ri.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C3414ik.m15518lr(C3273ac.this.xha, C3273ac.this.f11116oh);
                }
            });
            wjv wjvVar = this.xha;
            if (wjvVar != null && wjvVar.rbz() != null && this.xha.rbz().size() > 0 && this.xha.rbz().get(0) != null && !TextUtils.isEmpty(this.xha.rbz().get(0).m14220ri())) {
                C2751lr.m10463lr().m10471ri(this.xha.rbz().get(0), this.f11122ri, this.xha, new com.bytedance.sdk.component.p145fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.7
                    @Override // com.bytedance.sdk.component.p145fi.slm
                    /* JADX INFO: renamed from: ri */
                    public void mo8254ri(int i, String str, Throwable th) {
                        if (C3273ac.this.f11129vr != null) {
                            C3273ac.this.f11129vr.removeMessages(101);
                        }
                        C3273ac.this.m14005qt();
                    }

                    @Override // com.bytedance.sdk.component.p145fi.slm
                    /* JADX INFO: renamed from: ri */
                    public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                        if (C3273ac.this.f11129vr != null) {
                            C3273ac.this.f11129vr.removeMessages(101);
                        }
                    }
                });
            }
        }
        try {
            String strM14220ri = this.xha.rbz().get(0).m14220ri();
            C3491ka.m15835ri().mo9680ri(strM14220ri).mo9660ri(this.xha.rbz().get(0).m14217lr()).mo9655lr(this.xha.rbz().get(0).m14215ik()).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9652ik(1).mo9663ri(new ri()).mo9658ri(new C3492lr(this.xha, strM14220ri, new com.bytedance.sdk.component.p145fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.8
                @Override // com.bytedance.sdk.component.p145fi.slm
                /* JADX INFO: renamed from: ri */
                public void mo8254ri(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.p145fi.slm
                /* JADX INFO: renamed from: ri */
                public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                    Drawable bitmapDrawable;
                    try {
                        Object objMo9673lr = interfaceC2630sf.mo9673lr();
                        if (objMo9673lr != null && interfaceC2630sf.mo9671ik() != null) {
                            if (objMo9673lr instanceof Bitmap) {
                                bitmapDrawable = new BitmapDrawable(C3299nr.m14642ri().getResources(), (Bitmap) objMo9673lr);
                            } else if (objMo9673lr instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(objMo9673lr)) {
                                    cc$$ExternalSyntheticApiModelOutline0.m17094m(objMo9673lr).start();
                                }
                                bitmapDrawable = (Drawable) objMo9673lr;
                            } else {
                                bitmapDrawable = null;
                            }
                            if (!C3273ac.this.tan()) {
                                C3273ac.this.f11112lr.setBackground(bitmapDrawable);
                                return;
                            }
                            C3273ac.this.f11110ka.setBackground(bitmapDrawable);
                            View viewSlm = C3273ac.this.f11130xd.slm();
                            if (viewSlm == null || !(viewSlm.getParent() instanceof View)) {
                                return;
                            }
                            View view = (View) viewSlm.getParent();
                            view.setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: qt */
    public static boolean m13978qt(wjv wjvVar) {
        if (wjvVar != null) {
            return wjvVar.m14453nd() == 19 || wjvVar.m14453nd() == 20;
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13987ri(wjv wjvVar) {
        if (wjvVar == null || m13991sf(wjvVar) || m13958di(wjvVar) || m13961fi(wjvVar)) {
            return false;
        }
        return m13968ka(wjvVar) || m13971lr(wjvVar) || xha(wjvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m13988ri(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.luy < 100) {
            return false;
        }
        this.luy = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    /* JADX INFO: renamed from: sf */
    private void m13990sf() {
        C3273ac c3273ac;
        C2634di c2634di = this.wjv;
        if (c2634di == null || c2634di.getWebView() == null) {
            c3273ac = this;
        } else {
            C3349ik.m15077ri(C3299nr.m14642ri()).m15081ri(false).m15080lr(false).m15082ri(this.wjv.getWebView());
            C2634di c2634di2 = this.wjv;
            if (c2634di2 != null && c2634di2.getWebView() != null) {
                this.f11117pc = new lr(this.siy, this.xha, this.f11116oh, this);
                if (this.wjv.m9775k_() && (this.wjv.getWebViewClient() instanceof C3348fi)) {
                    C3393aw c3393awM15068lr = ((C3348fi) this.wjv.getWebViewClient()).m15068lr();
                    this.f11119qd = c3393awM15068lr;
                    if (c3393awM15068lr != null) {
                        c3393awM15068lr.m15385ri(this.f11117pc);
                        this.f11119qd.m15370lr(true);
                    }
                } else {
                    this.f11119qd = new C3393aw(this.xha, this.wjv.getWebView(), this.f11117pc, this.whw).m15370lr(true);
                }
                this.f11119qd.m15388ri(this.f11116oh);
                C2934fi c2934fiM16472ri = C3571ig.m16472ri(this.xha, this.wjv, this.hcw, this.f11116oh);
                this.f11132xm = c2934fiM16472ri;
                if (c2934fiM16472ri != null) {
                    c2934fiM16472ri.m11318ri(this.f11116oh);
                }
                C3571ig.m16482ri(this.xha, this.wjv);
            }
            m13955co();
            if (this.wjv.m9775k_()) {
                m13946ac();
            }
            this.wjv.setLandingPage(true);
            this.wjv.setTag(this.f11116oh);
            this.wjv.setMaterialMeta(this.xha.m14452nb());
            c3273ac = this;
            C3348fi c3348fi = new C3348fi(C3299nr.m14642ri(), this.f11128uq, this.xha.m14533tn(), this.f11132xm, this.f11119qd, true) { // from class: com.bytedance.sdk.openadsdk.core.model.ac.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C3273ac.this.m13949aw();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    C3273ac.this.f11130xd.mo10585zb();
                    C3273ac.this.f11103dw = System.currentTimeMillis();
                    if (!C3273ac.m13971lr(C3273ac.this.xha) || C3273ac.this.f11129vr == null || wjv.m14332fi(C3273ac.this.xha)) {
                        return;
                    }
                    C3273ac.this.f11129vr.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    Integer.valueOf(i);
                    String strKa = m15061ka(str2);
                    if (this.f11804di != null) {
                        this.f11804di.m15381ri(webView, i, str, str2, m15061ka(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z = strKa != null && strKa.startsWith("image");
                    boolean z2 = strKa != null && strKa.startsWith("mp4");
                    if (z || z2 || C3273ac.this.ory.get()) {
                        return;
                    }
                    C3273ac.this.m13995vr();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        C3273ac.this.m13995vr();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(C3273ac.this.zyn)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        C3273ac.m13954co(C3273ac.this);
                        WebResourceResponseModel webResourceResponseModelM16748ri = C3611lr.m16744ri().m16748ri(C3273ac.this.tnn, C3273ac.this.zyn, str);
                        if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getWebResourceResponse() != null) {
                            C3273ac.bgr(C3273ac.this);
                            return webResourceResponseModelM16748ri.getWebResourceResponse();
                        }
                        if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getMsg() == 2) {
                            C3273ac.m13994vr(C3273ac.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        C2707ac.m10206ri("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!C3273ac.m13965ik(C3273ac.this.xha) || C3571ig.m16469ri(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(C3273ac.this.hcw, (Class<?>) TTCeilingLandingPageActivity.class);
                    C3273ac.this.xha.m14397fi(str);
                    intent.putExtra("meta_index", C3197dw.m13337ri().m13348ri(C3273ac.this.xha));
                    C2722lr.m10241ri(this.f11807ka, intent, null);
                    return true;
                }
            };
            c3273ac.feb = c3348fi;
            c3273ac.wjv.setWebViewClient(c3348fi);
            c3273ac.feb.m15072ri(c3273ac.xha);
            c3273ac.feb.m15073ri(c3273ac.f11116oh);
            c3273ac.feb.m15070ri(c3273ac.f11130xd);
            c3273ac.wjv.setWebChromeClient(new C3350ka(c3273ac.f11128uq, c3273ac.f11119qd, c3273ac.f11132xm) { // from class: com.bytedance.sdk.openadsdk.core.model.ac.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (C3273ac.this.hcw != null && !C3273ac.this.hcw.isFinishing() && i == 100) {
                        C3273ac.this.m13949aw();
                    }
                    if (C3273ac.this.f11106fr != null) {
                        C3273ac.this.f11106fr.m11287ri(i);
                    }
                }
            });
            if (c3273ac.f11107ig == null) {
                c3273ac.f11107ig = C3371ka.m15240ri(C3299nr.m14642ri(), c3273ac.f11116oh);
            }
            c3273ac.wjv.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (C3273ac.this.f11107ig != null) {
                        C3273ac.this.f11107ig.mo15239ri(C3273ac.this.xha);
                    }
                }
            });
            C2634di c2634di3 = c3273ac.wjv;
            c2634di3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.tan.m16659ri(c2634di3.getWebView(), BuildConfig.VERSION_CODE));
            c3273ac.wjv.setMixedContentMode(0);
            c3273ac.wjv.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (C3273ac.this.f11119qd != null) {
                        C3273ac.this.f11119qd.m15372lr(i2);
                    }
                }
            });
            c3273ac.wjv.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (C3273ac.this.jbs()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            C3273ac.this.f11126tw = motionEvent.getY();
                        } else if (action == 1) {
                            if (C3583qd.m16624ri(C3273ac.this.f11126tw, motionEvent.getY(), C3273ac.this.hcw)) {
                                C3273ac.this.m14003lr(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (C3273ac.this.f11127ud && motionEvent.getAction() == 1 && C3273ac.this.f11130xd != null) {
                        C3273ac.this.m13988ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C3273ac.this.f11130xd.mo10571qh();
                            }
                        });
                    }
                    if ((!C3273ac.this.f11111kt || C3273ac.m13978qt(C3273ac.this.xha)) && !C3273ac.xha(C3273ac.this.xha)) {
                        C3273ac.this.bgr.onTouch(view, motionEvent);
                    }
                    if ((!C3273ac.this.f11111kt || C3273ac.m13978qt(C3273ac.this.xha)) && !C3273ac.xha(C3273ac.this.xha) && motionEvent.getAction() == 1 && C3273ac.this.bgr.m13515di()) {
                        C3273ac.this.wjv.getWebView().performClick();
                        C3273ac.this.f11111kt = true;
                    }
                    if (C3273ac.this.f11119qd != null) {
                        C3273ac.this.f11119qd.m15379ri(motionEvent);
                    }
                    if (C3273ac.this.f11132xm == null) {
                        return false;
                    }
                    C3273ac.this.f11132xm.m11314ri(motionEvent);
                    return false;
                }
            });
            c3273ac.wjv.getWebView().setOnClickListener(c3273ac.bgr);
            C3414ik.m15537ri(c3273ac.xha, c3273ac.f11116oh, c3273ac.whw);
            if (!c3273ac.wjv.m9775k_()) {
                C2707ac.m10205ri("LandingPageModel", "loadUrlWithRefer url  = " + c3273ac.xha.smj());
                C3594uq.m16663ri(c3273ac.wjv, c3273ac.xha.smj());
            }
            c3273ac.srn = true;
        }
        C2634di c2634di4 = c3273ac.wjv;
        if (c2634di4 == null || c3273ac.f11106fr == null || c2634di4.m9774ik()) {
            return;
        }
        c3273ac.f11106fr.mo11286ri();
    }

    /* JADX INFO: renamed from: sf */
    public static boolean m13991sf(wjv wjvVar) {
        return wjvVar != null && wjvVar.m14453nd() == 19;
    }

    private void slm() {
        if ((m13968ka(this.xha) || xha(this.xha)) && (this.hcw instanceof InterfaceC3118lr)) {
            this.f11130xd.mo10585zb();
            this.f11130xd.mo10557bu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tan() {
        return wjv.m14332fi(this.xha);
    }

    /* JADX INFO: renamed from: vr */
    static /* synthetic */ int m13994vr(C3273ac c3273ac) {
        int i = c3273ac.bnj;
        c3273ac.bnj = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: vr */
    public void m13995vr() {
        LinearLayout.LayoutParams layoutParams;
        if (this.ory.get()) {
            return;
        }
        slm();
        this.f11109jc.set(true);
        m14008ri(-1);
        this.f11130xd.mo10558co();
        C2932co c2932co = this.f11106fr;
        if (c2932co != null) {
            c2932co.m11285lr();
        }
        if (xha(this.xha)) {
            C3414ik.m15531ri(System.currentTimeMillis(), this.xha, this.f11116oh, "show_agg_backup");
            View view = this.f11100bu;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f11100bu.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.f11100bu.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.f11102di;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.slm.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.slm.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.slm.setLayoutParams(layoutParams3);
        if (this.xha.m14391fb() != null && !TextUtils.isEmpty(this.xha.m14391fb().m14220ri())) {
            C2751lr.m10463lr().m10472ri(this.xha.m14391fb().m14220ri(), this.xha.m14391fb().m14217lr(), this.xha.m14391fb().m14215ik(), this.f11097ac, this.xha);
        }
        this.f11115nr.setText(this.xha.tpb());
        this.tan.setText(this.xha.m14535tq());
        if (this.ihz != null) {
            m14002lr();
            this.ihz.setClickable(true);
            this.ihz.setOnClickListener(this.f11098aw);
            this.ihz.setOnTouchListener(this.f11098aw);
        }
        if (!m13965ik(this.xha) || (layoutParams = this.f11131xe) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            m13967ka(8);
        } else {
            m13967ka(0);
        }
    }

    public static boolean xha(wjv wjvVar) {
        return wjvVar != null && wjvVar.m14453nd() == 33;
    }

    /* JADX INFO: renamed from: di */
    public void m13998di() {
        C2634di c2634di;
        C3393aw c3393aw = this.f11119qd;
        if (c3393aw != null && (c2634di = this.wjv) != null) {
            c3393aw.m15384ri(c2634di);
        }
        Handler handler = this.f11129vr;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.ajz;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.ajz.cancel();
        }
        ValueAnimator valueAnimator2 = this.f11121qt;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.f11121qt.cancel();
        }
        ObjectAnimator objectAnimator = this.f11123sf;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f11123sf.cancel();
        }
        C2932co c2932co = this.f11106fr;
        if (c2932co != null) {
            c2932co.m11285lr();
        }
        ObjectAnimator objectAnimator2 = this.jbs;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        C2634di c2634di2 = this.wjv;
        if (c2634di2 != null) {
            srn.m14966ri(c2634di2.getWebView());
        }
        this.wjv = null;
        dzy dzyVar = this.f11128uq;
        if (dzyVar != null) {
            dzyVar.m13403co();
        }
        C3393aw c3393aw2 = this.f11119qd;
        if (c3393aw2 != null) {
            c3393aw2.m15369ka(true);
        }
        if (!TextUtils.isEmpty(this.zyn) && this.srn) {
            C3414ik.ri.m15570ri(this.f11125ta, this.f11104fe, this.xha);
        }
        C3611lr.m16744ri().m16749ri(this.tnn);
    }

    /* JADX INFO: renamed from: fi */
    public void m13999fi() {
        FrameLayout frameLayout = this.f11099ay;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.f11134zf;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long jM14165ka;
        wjv wjvVar;
        wjv wjvVar2;
        if (message.what == 100) {
            int i = message.arg1;
            if (!m13968ka(this.xha) || (wjvVar2 = this.xha) == null || wjvVar2.m14364ay() == null) {
                jM14165ka = (!xha(this.xha) || (wjvVar = this.xha) == null || wjvVar.m14364ay() == null) ? 20L : this.xha.m14364ay().m14165ka();
            } else {
                jM14165ka = this.xha.m14364ay().m14167lr();
            }
            InterfaceC1999ik.ri riVar = this.f11101co;
            if (riVar != null) {
                riVar.mo6400ri(((long) i) * 1000, jM14165ka * 1000);
            }
            long j = i;
            if (j >= jM14165ka) {
                InterfaceC1999ik.ri riVar2 = this.f11101co;
                if (riVar2 != null) {
                    riVar2.mo6399ri(jM14165ka * 1000, 100);
                }
            } else if (j < jM14165ka && this.f11129vr != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i + 1;
                this.f11129vr.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (message.what == 101) {
            m14005qt();
        }
        return true;
    }

    /* JADX INFO: renamed from: ik */
    public void m14000ik() {
        if (tan()) {
            try {
                String strM6357qt = this.xha.m14389eu().m6357qt();
                C3491ka.m15835ri().mo9680ri(strM6357qt).mo9660ri(this.xha.m14389eu().m6345ik()).mo9655lr(this.xha.m14389eu().m6351lr()).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9652ik(2).mo9663ri(new ri()).mo9658ri(new C3492lr(this.xha, strM6357qt, new com.bytedance.sdk.component.p145fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.4
                    @Override // com.bytedance.sdk.component.p145fi.slm
                    /* JADX INFO: renamed from: ri */
                    public void mo8254ri(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.p145fi.slm
                    /* JADX INFO: renamed from: ri */
                    public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                        try {
                            Object objMo9673lr = interfaceC2630sf.mo9673lr();
                            if (objMo9673lr != null && interfaceC2630sf.mo9671ik() != null) {
                                BitmapDrawable bitmapDrawable = objMo9673lr instanceof Bitmap ? new BitmapDrawable(C3299nr.m14642ri().getResources(), (Bitmap) objMo9673lr) : null;
                                View viewSlm = C3273ac.this.f11130xd.slm();
                                if (bitmapDrawable == null || viewSlm == null || !(viewSlm.getParent() instanceof View)) {
                                    return;
                                }
                                View view = (View) viewSlm.getParent();
                                view.setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th) {
                            C2707ac.m10196ik("LandingPageModel", th.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    public boolean jbs() {
        AtomicBoolean atomicBoolean;
        return (!m13965ik(this.xha) || (atomicBoolean = this.f11114nd) == null || atomicBoolean.get()) ? false : true;
    }

    /* JADX INFO: renamed from: ka */
    public boolean m14001ka() {
        return this.xha.m14552vz() == 15 || this.xha.m14552vz() == 16;
    }

    /* JADX INFO: renamed from: lr */
    protected void m14002lr() {
        wjv wjvVar = this.xha;
        if (wjvVar == null || TextUtils.isEmpty(wjvVar.skk())) {
            return;
        }
        this.ihz.setText(this.xha.skk());
    }

    /* JADX INFO: renamed from: lr */
    public void m14003lr(int i) {
        C3222ac c3222ac = this.f11120qh;
        if (c3222ac != null) {
            c3222ac.m13569fi(i);
        }
    }

    /* JADX INFO: renamed from: mj */
    public void m14004mj() {
        C3393aw c3393aw = this.f11119qd;
        if (c3393aw != null) {
            c3393aw.m15375mj();
        }
    }

    /* JADX INFO: renamed from: qt */
    public void m14005qt() {
        if ("landingpage_split_screen".equals(this.f11116oh) && C3606fi.m16710ri("default_split_style", false) && this.f11135zk.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.10
                @Override // java.lang.Runnable
                public void run() {
                    C3273ac.this.ajz = ValueAnimator.ofFloat(1.0f, 0.0f);
                    C3273ac.this.ajz.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (C3273ac.this.f11134zf != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C3273ac.this.f11134zf.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                C3273ac.this.f11134zf.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    C3273ac.this.ajz.setDuration(500L);
                    C3273ac.this.ajz.start();
                    if (C3273ac.this.f11124su != null) {
                        C3273ac.this.f11124su.setVisibility(8);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14006ri() {
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        C2634di c2634di = (C2634di) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13307uq);
        this.wjv = c2634di;
        if (c2634di == null || wjv.m14350ri(this.xha)) {
            C3583qd.m16612ri((View) this.wjv, 8);
        } else if (!this.wjv.m9775k_()) {
            this.wjv.m9773fi();
        }
        this.f11099ay = (FrameLayout) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ihz);
        this.f11106fr = (C2932co) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13300su);
        this.f11124su = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.wjv);
        this.igq = (ImageView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13256ay);
        this.f11134zf = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.dzy);
        this.f11112lr = (FrameLayout) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.tan);
        this.f11122ri = (ImageView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13253ac);
        this.f11102di = (RelativeLayout) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13270fr);
        this.f11108ik = (TextView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13316yj);
        this.f11110ka = (FrameLayout) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13259co);
        View viewFindViewById = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.igq);
        this.slm = viewFindViewById;
        if (viewFindViewById == null) {
            this.slm = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13276ig);
        }
        this.f11100bu = this.hcw.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13319zf);
        this.f11115nr = (TextView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ory);
        this.tan = (TextView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.hcw);
        this.f11097ac = (C3335bu) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13263dw);
        this.ihz = (TextView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13290oh);
        if (this.f11108ik != null && this.xha.m14364ay() != null) {
            this.f11108ik.setText(this.xha.m14364ay().m14162fi());
        }
        this.f11105fi = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13312xd);
        this.rzk = (C3193ka) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13285mf);
        if ((m13968ka(this.xha) || m13971lr(this.xha) || xha(this.xha) || m13965ik(this.xha)) && this.xha.m14364ay() != null) {
            View view2 = this.f11105fi;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            C3332vr.m14976ik().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.11
                @Override // java.lang.Runnable
                public void run() {
                    if (C3273ac.this.ory.get()) {
                        return;
                    }
                    C3414ik.m15547ri(C3273ac.this.xha, C3273ac.this.f11116oh, System.currentTimeMillis() - C3273ac.this.f11103dw, false);
                    C3273ac.this.m13995vr();
                }
            }, (xha(this.xha) ? this.xha.m14364ay().m14163ik() : this.xha.m14364ay().m14169ri()) * 1000);
        }
        m13990sf();
        if (m13971lr(this.xha)) {
            m13975nr();
            if (!m14001ka()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11099ay.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.f11099ay.setLayoutParams(layoutParams);
            }
        }
        if ((m13968ka(this.xha) || xha(this.xha)) && (view = this.f11134zf) != null) {
            view.setVisibility(8);
        }
        C2932co c2932co = this.f11106fr;
        if (c2932co != null) {
            c2932co.m11288ri(this.xha);
        }
        if (m13965ik(this.xha)) {
            m13953bu();
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        lValueOf.getClass();
        C3414ik.ri.m15571ri(jElapsedRealtime2 - jElapsedRealtime, this.xha, this.f11116oh, this.tnn, this.zyn);
    }

    /* JADX INFO: renamed from: ri */
    public void m14007ri(float f) {
        try {
            this.f11130xd.mo10584vr();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14008ri(int i) {
        InterfaceC3118lr interfaceC3118lr = this.f11130xd;
        if (interfaceC3118lr != null) {
            interfaceC3118lr.mo10561fi();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14009ri(final int i, com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
        float f;
        int iM14304di;
        if ((i != 3 && !m13964ik(i)) || this.gcp == null || bgrVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f11114nd;
        if (atomicBoolean != null) {
            if (i == 1) {
                return;
            }
            if (i == 5 && atomicBoolean.get()) {
                return;
            }
        }
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11134zf.getLayoutParams();
        this.f11131xe = (LinearLayout.LayoutParams) this.f11099ay.getLayoutParams();
        final float f2 = layoutParams.weight;
        tan tanVarM14526su = this.xha.m14526su();
        if (m13964ik(i)) {
            if (tanVarM14526su != null) {
                iM14304di = tanVarM14526su.m14306fi();
                f = iM14304di;
            } else {
                f = 30.0f;
            }
        } else if (tanVarM14526su != null) {
            iM14304di = tanVarM14526su.m14304di();
            f = iM14304di;
        } else {
            f = 70.0f;
        }
        final float f3 = f;
        Float.valueOf(f2);
        Float.valueOf(f3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.gcp.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        final int i2 = layoutParams3.height;
        final int i3 = layoutParams3.width;
        final int i4 = layoutParams3.leftMargin;
        final int i5 = layoutParams3.topMargin;
        final int iM16589lr = C3583qd.m16589lr(this.hcw, (float) bgrVar.xha());
        final int iM16589lr2 = C3583qd.m16589lr(this.hcw, (float) bgrVar.m8960mj());
        final int iM16589lr3 = C3583qd.m16589lr(this.hcw, (float) bgrVar.m8947fi());
        final int iM16589lr4 = C3583qd.m16589lr(this.hcw, (float) bgrVar.m8945di());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11121qt = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f11121qt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LinearLayout.LayoutParams layoutParams4 = layoutParams;
                float f4 = f2;
                layoutParams4.weight = f4 + ((f3 - f4) * fFloatValue);
                C3273ac.this.f11131xe.weight = 100.0f - layoutParams.weight;
                if (C3273ac.this.f11134zf != null) {
                    C3273ac.this.f11134zf.setLayoutParams(layoutParams);
                }
                if (C3273ac.this.f11099ay != null) {
                    C3273ac.this.f11099ay.setLayoutParams(C3273ac.this.f11131xe);
                }
                if (C3273ac.this.f11131xe.weight < 30.0f) {
                    C3273ac.this.m13967ka(8);
                } else {
                    C3273ac.this.m13967ka(0);
                }
                FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                int i6 = i3;
                layoutParams5.width = i6 + ((int) ((iM16589lr - i6) * fFloatValue));
                FrameLayout.LayoutParams layoutParams6 = layoutParams3;
                int i7 = i2;
                layoutParams6.height = i7 + ((int) ((iM16589lr2 - i7) * fFloatValue));
                FrameLayout.LayoutParams layoutParams7 = layoutParams3;
                int i8 = i4;
                layoutParams7.leftMargin = i8 + ((int) ((iM16589lr3 - i8) * fFloatValue));
                FrameLayout.LayoutParams layoutParams8 = layoutParams3;
                int i9 = i5;
                layoutParams8.topMargin = i9 + ((int) ((iM16589lr4 - i9) * fFloatValue));
                if (C3273ac.this.gcp != null) {
                    C3273ac.this.gcp.setLayoutParams(layoutParams3);
                }
                C3273ac.this.m14007ri(0.0f);
                if (fFloatValue == 1.0f) {
                    if (C3273ac.this.rzk != null) {
                        C3583qd.m16612ri((View) C3273ac.this.rzk, 0);
                        if (C3273ac.this.m13964ik(i)) {
                            C3273ac.this.rzk.setImageDrawable(C2729uq.m10303ik(C3273ac.this.hcw, "tt_ad_zoom_down"));
                            C3273ac.this.rzk.setTag(1);
                        } else {
                            C3273ac.this.rzk.setImageDrawable(C2729uq.m10303ik(C3273ac.this.hcw, "tt_ad_zoom_up"));
                            C3273ac.this.rzk.setTag(2);
                        }
                    }
                    if (C3273ac.this.f11114nd == null) {
                        C3273ac.this.f11114nd = new AtomicBoolean();
                    }
                    C3273ac.this.f11114nd.set(C3273ac.this.m13964ik(i));
                }
            }
        });
        C3414ik.m15513ka(this.xha, this.f11116oh, i);
        this.f11121qt.start();
        if (this.yjm.compareAndSet(false, true)) {
            this.saa = SystemClock.elapsedRealtime();
        }
        C3393aw c3393aw = this.f11119qd;
        if (c3393aw != null) {
            c3393aw.m15392ri(true, SystemClock.elapsedRealtime());
        }
        C3583qd.m16612ri((View) this.rzk, 8);
    }

    /* JADX INFO: renamed from: ri */
    public void m14010ri(InterfaceC1999ik.ri riVar) {
        this.f11101co = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m14011ri(C3222ac c3222ac, FrameLayout frameLayout) {
        this.f11120qh = c3222ac;
        this.gcp = frameLayout;
    }

    public void xha() {
        dzy dzyVar = this.f11128uq;
        if (dzyVar != null) {
            dzyVar.m13459sf();
        }
        C3393aw c3393aw = this.f11119qd;
        if (c3393aw != null) {
            c3393aw.xha();
        }
    }
}
