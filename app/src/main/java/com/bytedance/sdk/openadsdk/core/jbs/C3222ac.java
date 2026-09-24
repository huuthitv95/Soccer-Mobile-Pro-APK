package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.InterfaceC2241nr;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p125lr.C2501co;
import com.bytedance.sdk.component.adexpress.p125lr.C2502di;
import com.bytedance.sdk.component.adexpress.p125lr.C2506lr;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2503fi;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2504ik;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2507mj;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2513vr;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3302pv;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3276bu;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p200co.C3143fi;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3136ri;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3137di;
import com.bytedance.sdk.openadsdk.core.p200co.p206ik.C3152lr;
import com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3153ri;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.core.xha.p229ri.C3364ri;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p235ik.C3377ik;
import com.bytedance.sdk.openadsdk.p236ka.p241ka.InterfaceC3418fi;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C3222ac extends C3192ik implements InterfaceC2469ka, InterfaceC2507mj, InterfaceC2513vr, C3221ri.ri, InterfaceC3247vr {
    private final SparseArray<AbstractViewOnClickListenerC3218ik.ri> aac;

    /* JADX INFO: renamed from: ac */
    protected HashSet<String> f10714ac;
    private long ajz;

    /* JADX INFO: renamed from: aw */
    public FrameLayout f10715aw;

    /* JADX INFO: renamed from: ay */
    boolean f10716ay;
    protected boolean bgr;
    private C3224ay bnj;

    /* JADX INFO: renamed from: bu */
    boolean f10717bu;

    /* JADX INFO: renamed from: co */
    protected com.bytedance.sdk.openadsdk.core.model.wjv f10718co;

    /* JADX INFO: renamed from: di */
    private C3235mj f10719di;

    /* JADX INFO: renamed from: dw */
    private float f10720dw;
    private boolean dzy;

    /* JADX INFO: renamed from: fe */
    private final Runnable f10721fe;
    private final ViewTreeObserver.OnScrollChangedListener feb;

    /* JADX INFO: renamed from: fi */
    private PAGExpressAdWrapperListener f10722fi;

    /* JADX INFO: renamed from: fr */
    public com.bytedance.sdk.openadsdk.p236ka.xha f10723fr;
    private C3133ka gcp;
    private InterfaceC3418fi hcw;

    /* JADX INFO: renamed from: ig */
    private com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri f10724ig;
    protected C2506lr igq;
    protected ViewGroup ihz;

    /* JADX INFO: renamed from: ik */
    private C3377ik f10725ik;
    protected final Context jbs;

    /* JADX INFO: renamed from: jc */
    private final AtomicBoolean f10726jc;

    /* JADX INFO: renamed from: ka */
    private TTDislikeDialogAbstract f10727ka;

    /* JADX INFO: renamed from: kt */
    private C3232ik f10728kt;

    /* JADX INFO: renamed from: lr */
    private int f10729lr;

    /* JADX INFO: renamed from: mj */
    private String f10730mj;

    /* JADX INFO: renamed from: nd */
    private C2500aw f10731nd;

    /* JADX INFO: renamed from: nr */
    protected int f10732nr;

    /* JADX INFO: renamed from: oh */
    private String f10733oh;
    private float ory;

    /* JADX INFO: renamed from: pc */
    private float f10734pc;

    /* JADX INFO: renamed from: pv */
    private String f10735pv;

    /* JADX INFO: renamed from: qd */
    private boolean f10736qd;

    /* JADX INFO: renamed from: qh */
    private com.bytedance.sdk.openadsdk.core.p200co.p208lr.xha f10737qh;

    /* JADX INFO: renamed from: qt */
    protected String f10738qt;

    /* JADX INFO: renamed from: ri */
    private boolean f10739ri;
    private C2502di rzk;
    private float saa;

    /* JADX INFO: renamed from: sf */
    protected AdSlot f10740sf;
    private InterfaceC2508qt.ri siy;
    protected InterfaceC2504ik slm;
    private C3246uq srn;

    /* JADX INFO: renamed from: su */
    long f10741su;

    /* JADX INFO: renamed from: ta */
    private ThemeStatusBroadcastReceiver f10742ta;
    protected String tan;
    private final Runnable tnn;

    /* JADX INFO: renamed from: tw */
    private com.bytedance.sdk.component.adexpress.p125lr.jbs f10743tw;

    /* JADX INFO: renamed from: uq */
    public boolean f10744uq;

    /* JADX INFO: renamed from: vr */
    protected boolean f10745vr;
    private List<InterfaceC2508qt> whw;
    int wjv;

    /* JADX INFO: renamed from: xd */
    private C3152lr f10746xd;

    /* JADX INFO: renamed from: xe */
    private float f10747xe;
    private jbs xha;

    /* JADX INFO: renamed from: xm */
    private com.bytedance.sdk.component.adexpress.p125lr.slm f10748xm;
    private float yjm;

    /* JADX INFO: renamed from: zb */
    private int f10749zb;

    /* JADX INFO: renamed from: zf */
    public InterfaceC2505ka<? extends View> f10750zf;

    /* JADX INFO: renamed from: zk */
    private com.bytedance.sdk.openadsdk.core.p221ka.jbs f10751zk;
    private final Runnable zyn;

    public C3222ac(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, String str) {
        super(context);
        this.f10739ri = true;
        this.f10729lr = 0;
        this.f10738qt = "embeded_ad";
        this.f10730mj = null;
        this.f10745vr = false;
        this.f10717bu = true;
        this.f10732nr = -1;
        this.f10733oh = "";
        this.f10744uq = false;
        this.f10736qd = true;
        this.wjv = -1;
        this.f10723fr = new com.bytedance.sdk.openadsdk.p236ka.xha();
        this.f10741su = 0L;
        this.f10726jc = new AtomicBoolean(false);
        this.feb = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (C3222ac.this.f10717bu && C3222ac.this.jbs()) {
                    C3222ac.this.igq();
                    C3222ac c3222ac = C3222ac.this;
                    c3222ac.removeCallbacks(c3222ac.zyn);
                    C3222ac c3222ac2 = C3222ac.this;
                    c3222ac2.postDelayed(c3222ac2.zyn, 500L);
                }
            }
        };
        this.zyn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.2
            @Override // java.lang.Runnable
            public void run() {
                if (!C3302pv.m14656ri(C3222ac.this, 0, 5, false)) {
                    C3222ac.this.m13568di(8);
                } else {
                    C3222ac c3222ac = C3222ac.this;
                    c3222ac.m13568di(c3222ac.getVisibility());
                }
            }
        };
        this.tnn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.3
            @Override // java.lang.Runnable
            public void run() {
                C3222ac.this.m13568di(0);
            }
        };
        this.f10721fe = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.4
            @Override // java.lang.Runnable
            public void run() {
                C3222ac.this.m13568di(8);
            }
        };
        this.f10749zb = 8;
        this.aac = new SparseArray<>();
        this.f10747xe = -1.0f;
        this.yjm = -1.0f;
        this.saa = -1.0f;
        this.f10734pc = -1.0f;
        this.ajz = 0L;
        this.f10738qt = str;
        this.jbs = context;
        this.f10718co = wjvVar;
        this.f10740sf = adSlot;
        this.f10744uq = false;
        xha();
    }

    public C3222ac(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        super(context);
        this.f10739ri = true;
        this.f10729lr = 0;
        this.f10738qt = "embeded_ad";
        this.f10730mj = null;
        this.f10745vr = false;
        this.f10717bu = true;
        this.f10732nr = -1;
        this.f10733oh = "";
        this.f10744uq = false;
        this.f10736qd = true;
        this.wjv = -1;
        this.f10723fr = new com.bytedance.sdk.openadsdk.p236ka.xha();
        this.f10741su = 0L;
        this.f10726jc = new AtomicBoolean(false);
        this.feb = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (C3222ac.this.f10717bu && C3222ac.this.jbs()) {
                    C3222ac.this.igq();
                    C3222ac c3222ac = C3222ac.this;
                    c3222ac.removeCallbacks(c3222ac.zyn);
                    C3222ac c3222ac2 = C3222ac.this;
                    c3222ac2.postDelayed(c3222ac2.zyn, 500L);
                }
            }
        };
        this.zyn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.2
            @Override // java.lang.Runnable
            public void run() {
                if (!C3302pv.m14656ri(C3222ac.this, 0, 5, false)) {
                    C3222ac.this.m13568di(8);
                } else {
                    C3222ac c3222ac = C3222ac.this;
                    c3222ac.m13568di(c3222ac.getVisibility());
                }
            }
        };
        this.tnn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.3
            @Override // java.lang.Runnable
            public void run() {
                C3222ac.this.m13568di(0);
            }
        };
        this.f10721fe = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.4
            @Override // java.lang.Runnable
            public void run() {
                C3222ac.this.m13568di(8);
            }
        };
        this.f10749zb = 8;
        this.aac = new SparseArray<>();
        this.f10747xe = -1.0f;
        this.yjm = -1.0f;
        this.saa = -1.0f;
        this.f10734pc = -1.0f;
        this.ajz = 0L;
        this.f10738qt = str;
        this.jbs = context;
        this.f10718co = wjvVar;
        this.f10740sf = adSlot;
        this.f10744uq = z;
        this.f10736qd = z2;
        xha();
    }

    /* JADX INFO: renamed from: aw */
    private void m13551aw() {
        com.bytedance.sdk.openadsdk.core.model.wjv.C3296ri c3296riSez = this.f10718co.sez();
        if (!TextUtils.equals(this.f10738qt, "embeded_ad") || c3296riSez == null) {
            return;
        }
        String strM14595qt = c3296riSez.m14595qt();
        if (TextUtils.isEmpty(strM14595qt)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM14595qt);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.ory = iOptInt2;
            this.f10720dw = iOptInt;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0043  */
    private void bgr() {
        long jOptLong;
        boolean z;
        C2500aw.ri riVar;
        this.hcw = new com.bytedance.sdk.openadsdk.p236ka.tan(1, this.f10738qt, this.f10718co);
        this.f10743tw = new C3223aw(this.hcw, this.f10738qt, this.f10718co, this.f10730mj, this.dzy);
        final boolean zNbc = this.f10718co.nbc();
        try {
            com.bytedance.sdk.openadsdk.core.model.wjv.C3296ri c3296riSez = this.f10718co.sez();
            if (c3296riSez != null) {
                String strJbs = c3296riSez.jbs();
                if (TextUtils.isEmpty(strJbs)) {
                    jOptLong = 0;
                } else {
                    jOptLong = new JSONObject(strJbs).optLong("render_delay_time");
                }
            } else {
                jOptLong = 0;
            }
        } catch (Exception unused) {
        }
        try {
            z = !com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(this.f10718co) && C3299nr.m14639ka().m14829aw(this.f10730mj) == 1;
            try {
                if (!C3322sf.m14819lr().bgr(this.f10730mj) || this.f10718co.m14453nd() == 5 || this.f10718co.m14453nd() == 6 || this.f10718co.m14404go() == 3) {
                    z = true;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            z = false;
        }
        long jMin = Math.min(Math.max(jOptLong, 0L), 10000L);
        int renderTimeout = getRenderTimeout();
        double dM6339di = this.f10718co.m14389eu() != null ? this.f10718co.m14389eu().m6339di() * ((double) this.f10718co.m14389eu().m6365uq()) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        int i = this.wjv;
        this.f10716ay = i != -1 && i < ((int) dM6339di);
        if (C3143fi.m13132ri(this.f10718co) || C3143fi.m13127lr(this.f10718co) || C3137di.m13108ri(this.f10738qt)) {
            C3136ri.ri riVar2 = new C3136ri.ri();
            if (C3143fi.m13132ri(this.f10718co)) {
                riVar2.m13105ri(C3143fi.m13130ri(this.f10718co, this.f10738qt));
            }
            riVar2.m13104ri((InterfaceC2241nr) this.f10743tw);
            riVar2.m13103ri(this.f10720dw);
            riVar2.m13101lr(this.ory);
            riVar2.m13100di(this.dzy);
            riVar = riVar2;
        } else {
            riVar = new C2500aw.ri();
        }
        riVar.m8923fi(zNbc);
        riVar.m8939ri(this.f10738qt).m8931lr(this.f10718co.m14533tn()).m8925ik(this.f10718co.m14541uo()).m8928ka(this.f10718co.yjg()).m8938ri(this.f10743tw).m8927ka(this.f10718co.rmw()).m8935ri(renderTimeout).m8932lr(this.f10718co.nlk()).m8926ik(this.f10736qd).m8930lr(this.f10718co.hws()).m8936ri(jMin).m8924ik(this.f10718co.adz()).m8940ri(C3239lr.m13704lr(this.f10718co)).m8929ka(z).m8921fi(this.wjv).m8941ri(this.f10716ay).m8934ri(dM6339di).m8920di(C3322sf.m14819lr().m14827ac()).m8919di(C3606fi.m16703ri("inject_data_reuse_open", 0)).xha(this.f10718co.ckl().m14197ri()).m8933mj(this.f10718co.ckl().m14196lr()).m8937ri(new InterfaceC2503fi() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.5
            @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2503fi
            /* JADX INFO: renamed from: ri */
            public JSONObject mo8983ri() {
                try {
                    if (C3222ac.this.f10718co == null) {
                        C3222ac.this.f10733oh = "material is null";
                        return null;
                    }
                    if (zNbc) {
                        C3222ac.this.srn = new C3246uq();
                        JSONObject jSONObjectM13711ri = C3239lr.m13711ri(C3222ac.this.f10720dw, C3222ac.this.ory, C3222ac.this.f10745vr, C3222ac.this.f10718co, C3222ac.this.f10738qt, C3222ac.this.srn);
                        C3222ac.this.f10733oh = C3239lr.m13706ri();
                        return jSONObjectM13711ri;
                    }
                    if (!C3143fi.m13132ri(C3222ac.this.f10718co)) {
                        JSONObject jSONObjectM13709ri = C3239lr.m13709ri(C3222ac.this.f10720dw, C3222ac.this.ory, C3222ac.this.f10745vr, C3222ac.this.f10718co);
                        C3222ac.this.mo11542ik(jSONObjectM13709ri);
                        return jSONObjectM13709ri;
                    }
                    C3222ac.this.srn = new C3246uq();
                    JSONObject jSONObjectM13129ri = C3143fi.m13129ri(C3222ac.this.f10718co, C3222ac.this.srn);
                    C3222ac.this.f10733oh = C3143fi.m13128ri();
                    return jSONObjectM13129ri;
                } catch (Throwable unused4) {
                    return null;
                }
            }
        });
        mo11549ri(riVar);
        this.f10731nd = riVar.mo8942ri();
    }

    /* JADX INFO: renamed from: bu */
    private void m13552bu() {
        if (C3137di.m13108ri(this.f10738qt)) {
            C3137di c3137di = new C3137di(this.jbs, this.f10718co, this.f10744uq, (C3136ri) this.f10731nd, this, this.f10720dw, this.ory, this.f10745vr, this.f10738qt);
            com.bytedance.sdk.openadsdk.core.p200co.p208lr.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p200co.p208lr.xha(this.jbs, c3137di, this, this.f10731nd);
            c3137di.m13083ri((InterfaceC3247vr) this);
            this.whw.add(xhaVar);
            return;
        }
        C2502di c2502di = new C2502di(this.jbs, this.f10731nd, new ihz(this, this.f10742ta, this.f10731nd));
        this.rzk = c2502di;
        this.whw.add(c2502di);
    }

    /* JADX INFO: renamed from: dw */
    private void m13553dw() {
        List<InterfaceC2508qt> list = this.whw;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC2508qt> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: renamed from: fr */
    private void m13555fr() {
        if (C3332vr.m14975fi()) {
            return;
        }
        C3228co.m13618ri();
    }

    private boolean hcw() {
        return TextUtils.equals(this.f10738qt, "fullscreen_interstitial_ad") || TextUtils.equals(this.f10738qt, "rewarded_video") || TextUtils.equals("open_ad", this.f10738qt) || C3224ay.m13589lr(this.f10738qt) || TextUtils.equals(this.f10738qt, "embeded_ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void igq() {
        if (this.f10726jc.get()) {
            this.f10723fr.m15724ri(System.currentTimeMillis(), C3302pv.m14654ri(this));
        }
    }

    private void ory() {
        List<InterfaceC2508qt> list = this.whw;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC2508qt> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13561ri(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private void slm() {
        this.f10729lr = this.f10718co.hpn();
        try {
            m13555fr();
            m13563su();
        } catch (Exception e) {
            C2707ac.m10206ri("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = this.f10718co.qmx() == 1;
        this.f10739ri = z;
        if (z) {
            m13552bu();
        }
        Objects.toString(this.whw);
        this.siy = new C2501co(this.whw, this.f10743tw);
    }

    /* JADX INFO: renamed from: su */
    private void m13563su() {
        C3222ac c3222ac;
        C3133ka c3133ka;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f10718co;
        if (wjvVar2 == null || wjvVar2.lji() != 1 || this.f10718co.ajz() == 2) {
            if (!C3137di.m13108ri(this.f10738qt) || (wjvVar = this.f10718co) == null || wjvVar.ajz() == 2) {
                C3364ri c3364ri = new C3364ri();
                int i = this.f10729lr;
                if (i != 0) {
                    if (i == 3) {
                        com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha xhaVar = new com.bytedance.sdk.component.adexpress.dynamic.p116fi.xha();
                        C2506lr c2506lr = new C2506lr(this.jbs.getApplicationContext(), this.f10731nd, this.f10742ta, this.f10744uq, xhaVar, this, c3364ri, new C3229di(this.jbs, this.f10742ta, this.f10744uq, xhaVar, this.f10731nd, c3364ri));
                        this.igq = c2506lr;
                        this.whw.add(c2506lr);
                        return;
                    }
                    if (i == 7) {
                        this.gcp = new C3133ka(this.jbs, this.f10718co, this.f10744uq, (C3136ri) this.f10731nd, this);
                        com.bytedance.sdk.openadsdk.core.p200co.p208lr.xha xhaVar2 = new com.bytedance.sdk.openadsdk.core.p200co.p208lr.xha(this.jbs, this.gcp, this, this.f10731nd);
                        this.f10737qh = xhaVar2;
                        xhaVar2.m13266ri(this);
                        this.whw.add(this.f10737qh);
                        return;
                    }
                    if (i != 9) {
                        if (i != 10) {
                            return;
                        }
                        if (!this.dzy || (c3133ka = this.gcp) == null) {
                            c3222ac = this;
                            c3222ac.gcp = new com.bytedance.sdk.openadsdk.core.p200co.p201di.xha(this.jbs, this.f10718co, this.f10744uq, (C3136ri) this.f10731nd, this);
                        } else {
                            c3133ka.m13084ri(this.f10718co, this.f10744uq, (C3136ri) this.f10731nd, this);
                            c3222ac = this;
                        }
                        com.bytedance.sdk.openadsdk.core.p200co.p208lr.xha xhaVar3 = new com.bytedance.sdk.openadsdk.core.p200co.p208lr.xha(c3222ac.jbs, c3222ac.gcp, this, c3222ac.f10731nd);
                        c3222ac.f10737qh = xhaVar3;
                        xhaVar3.m13266ri(this);
                        c3222ac.whw.add(c3222ac.f10737qh);
                        return;
                    }
                }
                this.bnj = new C3224ay(this.jbs, this.f10731nd, this.f10742ta, this.hcw, this.f10718co);
                com.bytedance.sdk.component.adexpress.p125lr.slm slmVar = new com.bytedance.sdk.component.adexpress.p125lr.slm(this.jbs, this.f10731nd, this.bnj, this);
                this.f10748xm = slmVar;
                this.whw.add(slmVar);
            }
        }
    }

    /* JADX INFO: renamed from: vr */
    private void m13564vr() {
        if (this.f10718co.lji() == 1 && this.f10718co.m14576zz()) {
            m13552bu();
            this.siy = new C2501co(this.whw, this.f10743tw);
            return;
        }
        if (hcw()) {
            slm();
            return;
        }
        try {
            m13555fr();
            this.bnj = new C3224ay(this.jbs, this.f10731nd, this.f10742ta, this.hcw, this.f10718co);
            com.bytedance.sdk.component.adexpress.p125lr.slm slmVar = new com.bytedance.sdk.component.adexpress.p125lr.slm(this.jbs, this.f10731nd, this.bnj, this);
            this.f10748xm = slmVar;
            this.whw.add(slmVar);
        } catch (Exception e) {
            C2707ac.m10206ri("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        m13552bu();
        this.siy = new C2501co(this.whw, this.f10743tw);
    }

    /* JADX INFO: renamed from: zf */
    private boolean m13565zf() {
        return com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(this.f10718co);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2513vr
    /* JADX INFO: renamed from: a_ */
    public void mo9010a_(int i) {
        com.bytedance.sdk.component.adexpress.p125lr.jbs jbsVar = this.f10743tw;
        if (jbsVar != null) {
            if (!this.f10739ri) {
                jbsVar.xha();
            }
            this.f10743tw.mo8993mj();
            ((C3223aw) this.f10743tw).m13581qt();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f10722fi;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.jbs.m13550ri(i), i);
        }
        C3246uq c3246uq = this.srn;
        if (c3246uq != null) {
            c3246uq.m13742ri(this.f10718co, this.f10738qt);
        }
    }

    /* JADX INFO: renamed from: ac */
    public void m13566ac() {
        try {
            FrameLayout frameLayout = this.f10715aw;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.f10715aw);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ay */
    public void m13567ay() {
        C3152lr c3152lr = new C3152lr(this.jbs, this.f10718co);
        this.f10746xd = c3152lr;
        c3152lr.m13163ri(this);
        this.f10746xd.m13162ri(new InterfaceC3153ri() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.7
            @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3153ri
            /* JADX INFO: renamed from: ri */
            public void mo13165ri(View view, int i, InterfaceC2488ik interfaceC2488ik) {
                mo13165ri(view, i, interfaceC2488ik);
            }
        });
    }

    /* JADX INFO: renamed from: co */
    public void mo12245co() {
        try {
            C3232ik c3232ik = this.f10728kt;
            if (c3232ik != null) {
                c3232ik.m13658lr();
            }
            m13578uq();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<InterfaceC2508qt> list = this.whw;
            if (list != null) {
                Iterator<InterfaceC2508qt> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo8978ri();
                }
            }
            C2889fi.m11113ri(this.f10718co);
            C2897ik.m11144lr(this.f10718co);
            this.f10725ik = null;
            this.f10727ka = null;
            this.f10740sf = null;
            this.f10718co = null;
            this.f10722fi = null;
            this.f10719di = null;
            this.slm = null;
            this.xha = null;
            C3152lr c3152lr = this.f10746xd;
            if (c3152lr != null) {
                c3152lr.m13158ka();
            }
        } catch (Throwable th) {
            C2707ac.m10206ri("NativeExpressView", "detach error", th);
        }
    }

    /* JADX INFO: renamed from: di */
    public void mo11539di() {
    }

    /* JADX INFO: renamed from: di */
    public void m13568di(int i) {
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (interfaceC2505ka == null || !(interfaceC2505ka instanceof C3224ay)) {
            return;
        }
        ((C3224ay) interfaceC2505ka).mo8794ri(i);
        this.f10749zb = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        C3235mj c3235mj = this.f10719di;
        if (c3235mj != null) {
            c3235mj.m13524lr(motionEvent.getDeviceId());
            this.f10719di.m13526ri(motionEvent.getSource());
            this.f10719di.m13521ik(motionEvent.getToolType(0));
        }
        jbs jbsVar = this.xha;
        if (jbsVar != null) {
            jbsVar.m13524lr(motionEvent.getDeviceId());
            this.xha.m13526ri(motionEvent.getSource());
            this.xha.m13521ik(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked == 1) {
                i = i2;
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
                i = i2;
            } else {
                this.saa += Math.abs(motionEvent.getX() - this.f10747xe);
                this.f10734pc += Math.abs(motionEvent.getY() - this.yjm);
                this.f10747xe = motionEvent.getX();
                this.yjm = motionEvent.getY();
                i = (System.currentTimeMillis() - this.ajz <= 200 || (this.saa <= 8.0f && this.f10734pc <= 8.0f)) ? 2 : 1;
            }
        } else {
            this.f10747xe = motionEvent.getRawX();
            this.yjm = motionEvent.getRawY();
            this.ajz = System.currentTimeMillis();
            C3324ik.m14916ri(motionEvent);
            i = 0;
        }
        SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray = this.aac;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new AbstractViewOnClickListenerC3218ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: fi */
    public int mo11540fi() {
        return 0;
    }

    /* JADX INFO: renamed from: fi */
    public void m13569fi(int i) {
        if (C3273ac.m13965ik(this.f10718co)) {
            InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
            if (interfaceC2505ka instanceof C3224ay) {
                ((C3224ay) interfaceC2505ka).m13599lr(i);
            }
        }
    }

    public com.bytedance.sdk.openadsdk.p236ka.xha getAdShowTime() {
        return this.f10723fr;
    }

    public C3232ik getBrandBannerController() {
        return this.f10728kt;
    }

    public C3235mj getClickCreativeListener() {
        return this.f10719di;
    }

    public jbs getClickListener() {
        return this.xha;
    }

    public String getClosedListenerKey() {
        return this.f10735pv;
    }

    public int getDynamicShowType() {
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (interfaceC2505ka != null) {
            return interfaceC2505ka.mo8752ik();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.ory).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.f10720dw).intValue();
    }

    public PAGExpressAdWrapperListener getExpressInteractionListener() {
        return this.f10722fi;
    }

    public dzy getJsObject() {
        C3224ay c3224ay = this.bnj;
        if (c3224ay != null) {
            return c3224ay.slm();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        C3237qt c3237qtM13601vr;
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (!(interfaceC2505ka instanceof C3224ay) || (c3237qtM13601vr = ((C3224ay) interfaceC2505ka).m13601vr()) == null) {
            return 0;
        }
        return c3237qtM13601vr.m13697ri();
    }

    protected int getRenderTimeout() {
        return C3299nr.m14639ka().dzy();
    }

    public String getUgenTemplateErrorReason() {
        return this.f10733oh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri.ri
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.p221ka.jbs jbsVar = this.f10751zk;
        if (jbsVar != null) {
            return jbsVar.getVideoProgress();
        }
        return 0L;
    }

    public C2634di getWebView() {
        C3224ay c3224ay = this.bnj;
        if (c3224ay == null) {
            return null;
        }
        return c3224ay.mo8793ri();
    }

    public boolean ihz() {
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        return interfaceC2505ka != null && (interfaceC2505ka instanceof ihz);
    }

    /* JADX INFO: renamed from: ik */
    public long mo11541ik() {
        return 0L;
    }

    /* JADX INFO: renamed from: ik */
    protected C2889fi.ri mo12246ik(int i) {
        return new C2889fi.ri(i);
    }

    /* JADX INFO: renamed from: ik */
    protected void mo11542ik(JSONObject jSONObject) {
    }

    protected boolean jbs() {
        return true;
    }

    /* JADX INFO: renamed from: ka */
    public long mo11543ka() {
        return 0L;
    }

    /* JADX INFO: renamed from: lr */
    public void mo11544lr() {
    }

    /* JADX INFO: renamed from: lr */
    public void mo11880lr(int i) {
    }

    /* JADX INFO: renamed from: lr */
    protected void m13570lr(int i, int i2) {
        int iMin;
        if (TextUtils.equals(this.f10738qt, "banner_ad")) {
            return;
        }
        Integer.valueOf(i);
        Integer.valueOf(i2);
        Integer.valueOf(this.wjv);
        Boolean.valueOf(this.f10716ay);
        String str = this.f10738qt;
        int i3 = this.wjv;
        int i4 = ((i2 < i3 || i3 < 0 || !(this.f10716ay || TextUtils.equals(str, "open_ad"))) && !((i == 0 && TextUtils.equals(this.f10738qt, "open_ad")) || mo11540fi() == 5)) ? 0 : 1;
        if (i2 <= this.wjv) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10718co;
            iMin = (wjvVar == null || wjvVar.m14389eu() == null) ? this.wjv - i2 : (int) (Math.min(this.wjv, this.f10718co.m14389eu().m6339di() * ((double) this.f10718co.m14389eu().m6365uq())) - ((double) i2));
        } else {
            iMin = 0;
        }
        C2506lr c2506lr = this.igq;
        if (c2506lr != null && c2506lr.m9001lr() != null) {
            this.igq.m9001lr().setTime(String.valueOf(i), i4, iMin, false);
        }
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (interfaceC2505ka instanceof C3133ka) {
            ((C3133ka) interfaceC2505ka).setTime(String.valueOf(i), i4, iMin, false);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m13571lr(int i, String str) {
        dzy dzyVarSlm;
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (interfaceC2505ka == null || !(interfaceC2505ka instanceof C3224ay) || (dzyVarSlm = ((C3224ay) interfaceC2505ka).slm()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i);
            jSONObject.put("flag", str);
            dzyVarSlm.mo13455ri("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    protected boolean m13572lr(com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
        return true;
    }

    /* JADX INFO: renamed from: lr */
    public boolean mo11881lr(JSONObject jSONObject) {
        return false;
    }

    /* JADX INFO: renamed from: mj */
    protected boolean mo12247mj() {
        return true;
    }

    /* JADX INFO: renamed from: nr */
    public void m13573nr() {
        C3283ka c3283kaM14473qc;
        C3097ka c3097kaM14188ri;
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (interfaceC2505ka instanceof C3224ay) {
            if (interfaceC2505ka == null) {
                return;
            }
            ((C3224ay) interfaceC2505ka).mo8791mj();
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10718co;
            com.bytedance.sdk.component.utils.jbs.m10234lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ac.6
                @Override // java.lang.Runnable
                public void run() {
                    C3222ac.this.m13569fi(1);
                }
            }, ((long) (wjvVar != null ? wjvVar.m14526su().m14310ka() : 5)) * 1000);
        } else if (interfaceC2505ka instanceof com.bytedance.sdk.openadsdk.core.p200co.p201di.xha) {
            ((com.bytedance.sdk.openadsdk.core.p200co.p201di.xha) interfaceC2505ka).m13125sf();
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f10718co;
        if (wjvVar2 != null && (c3283kaM14473qc = wjvVar2.m14473qc()) != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
            c3097kaM14188ri.m12481ri(0L);
        }
        if ((this.f10750zf instanceof com.bytedance.sdk.openadsdk.core.p200co.p201di.xha) && C3276bu.m14026ri(this.f10718co)) {
            m13576ri(this.f10750zf);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        igq();
        m13553dw();
        getViewTreeObserver().addOnScrollChangedListener(this.feb);
        C3304qt.m14669lr().m14698ri(this.f10735pv, this.f10724ig);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.feb);
        C3304qt.m14669lr().m14682di(this.f10735pv);
        ory();
        m13575ri(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        igq();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        igq();
        C2897ik.m11147ri(this.f10718co, z);
        if (z) {
            C2889fi.m11114ri(this.f10718co, 4);
        } else {
            C2889fi.m11114ri(this.f10718co, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m13575ri(i, true, false);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void onvideoComplate() {
    }

    /* JADX INFO: renamed from: qt */
    public void mo12248qt() {
        C3224ay c3224ay = this.bnj;
        if (c3224ay == null || c3224ay.mo8751fi() == null) {
            return;
        }
        this.bnj.mo8788di();
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m13574ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (!(this.f10750zf instanceof C3224ay)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (wjvVar != null) {
                if (wjvVar.sez() != null && wjvVar.sez().m14582co()) {
                    jSONObject.put("engine_version", wjvVar.sez().m14600sf());
                } else if (wjvVar.m14575zv() != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e) {
            e.getMessage();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo11545ri() {
    }

    /* JADX INFO: renamed from: ri */
    public void mo11546ri(int i) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo11882ri(int i, com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo11547ri(int i, String str) {
    }

    /* JADX INFO: renamed from: ri */
    public void m13575ri(int i, boolean z, boolean z2) {
        this.f10717bu = z;
        removeCallbacks(this.f10721fe);
        removeCallbacks(this.tnn);
        if (i == 0) {
            if (z2) {
                this.tnn.run();
                return;
            } else {
                postDelayed(this.tnn, 50L);
                return;
            }
        }
        if (z2) {
            this.f10721fe.run();
        } else {
            postDelayed(this.f10721fe, 50L);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo9002ri(View view, int i, InterfaceC2488ik interfaceC2488ik) {
        View view2;
        JSONObject jSONObject;
        C2707ac.m10207ri("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i));
        if (i == -1 || interfaceC2488ik == null) {
            return;
        }
        HashMap map = new HashMap();
        if (C3279dw.m14090ik(this.f10718co)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.slm slmVar = (com.bytedance.sdk.openadsdk.core.model.slm) interfaceC2488ik;
        if (C3273ac.m13965ik(this.f10718co)) {
            try {
                JSONObject jSONObject2 = slmVar.f11345aw;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th) {
                C2707ac.m10197ik(th.toString(), new Object[0]);
            }
        }
        C3235mj c3235mj = this.f10719di;
        if (c3235mj != null) {
            c3235mj.m13523ka(getDynamicShowType());
            this.f10719di.m13536ri(map);
        }
        jbs jbsVar = this.xha;
        if (jbsVar != null) {
            jbsVar.m13523ka(getDynamicShowType());
            this.xha.m13536ri(map);
        }
        float f = slmVar.f11354ri;
        float f2 = slmVar.f11351lr;
        float f3 = slmVar.f11349ik;
        float f4 = slmVar.f11350ka;
        boolean z = slmVar.f11355sf;
        SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray = slmVar.f11353qt;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.aac;
        }
        SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray2 = sparseArray;
        String str = slmVar.xha;
        JSONObject jSONObjectM13561ri = null;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectM13561ri = view != this ? m13561ri(view) : null;
            view2 = view;
        }
        if (slmVar != null) {
            slmVar.f11352mj = i;
            if (jSONObjectM13561ri != null && slmVar.jbs == null) {
                slmVar.jbs = jSONObjectM13561ri;
            }
        }
        if (i == 13) {
            int i2 = slmVar.f11356vr;
            if (i2 >= 0) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("switch", i2);
                    mo11551ri(jSONObject4);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        switch (i) {
            case 1:
                FrameLayout frameLayout = this.f10715aw;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10718co;
                if (wjvVar == null || wjvVar.m14558xe() != 1 || z) {
                    jbs jbsVar2 = this.xha;
                    if (jbsVar2 != null) {
                        jbsVar2.m13676ri(slmVar);
                        this.xha.m13535ri(str);
                        this.xha.mo10681ri(view2, f, f2, f3, f4, sparseArray2, z);
                    }
                    if (this.f10722fi != null && !slmVar.bgr) {
                        this.f10722fi.onAdClicked();
                        break;
                    }
                }
                break;
            case 2:
                if (slmVar.f11346co > 0) {
                    C3214ig.m13499ri(true);
                }
                C3235mj c3235mj2 = this.f10719di;
                if (c3235mj2 != null) {
                    c3235mj2.m13684ri(slmVar);
                    this.f10719di.m13535ri(str);
                    if (C3273ac.m13965ik(this.f10718co) && (jSONObject = slmVar.f11345aw) != null) {
                        this.f10719di.m13544ka(jSONObject.optBoolean("is_ceiling_page", false));
                    }
                    this.f10719di.mo10681ri(view2, f, f2, f3, f4, sparseArray2, z);
                }
                if (this.f10722fi != null && !slmVar.bgr) {
                    this.f10722fi.onAdClicked();
                }
                C3214ig.m13499ri(false);
                C2889fi.m11114ri(this.f10718co, 9);
                break;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f10727ka;
                if (tTDislikeDialogAbstract == null) {
                    C3377ik c3377ik = this.f10725ik;
                    if (c3377ik == null) {
                        TTDelegateActivity.m10599ri(this.f10718co, this.f10735pv);
                    } else {
                        c3377ik.mo14648ri();
                    }
                } else {
                    tTDislikeDialogAbstract.show();
                }
                break;
            case 4:
                FrameLayout frameLayout2 = this.f10715aw;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f10718co;
                if (wjvVar2 == null || wjvVar2.m14558xe() != 1 || z) {
                    C3571ig.m16448ik(this.f10718co);
                    if ("embeded_ad".equals(this.f10738qt) && m13565zf() && !this.bgr && C3571ig.m16448ik(this.f10718co)) {
                        C3235mj c3235mj3 = this.f10719di;
                        if (c3235mj3 != null) {
                            c3235mj3.m13684ri(slmVar);
                            this.f10719di.m13535ri(str);
                            this.f10719di.mo10681ri(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    } else {
                        jbs jbsVar3 = this.xha;
                        if (jbsVar3 != null) {
                            jbsVar3.m13676ri(slmVar);
                            this.xha.m13535ri(str);
                            this.xha.mo10681ri(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    }
                    if (this.f10722fi != null && !slmVar.bgr) {
                        this.f10722fi.onAdClicked();
                        break;
                    }
                }
                break;
            case 5:
                mo11884ri(!this.f10744uq, "dynamicClick");
                break;
            case 6:
                mo11545ri();
                break;
            case 7:
                TTWebsiteActivity.m10758ri(this.jbs, this.f10718co, this.f10738qt);
                break;
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void mo11549ri(C2500aw.ri riVar) {
    }

    /* JADX INFO: renamed from: ri */
    public void m13576ri(InterfaceC2505ka interfaceC2505ka) {
        if (this.f10746xd == null) {
            return;
        }
        try {
            if (interfaceC2505ka instanceof com.bytedance.sdk.openadsdk.core.p200co.p201di.xha) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.p200co.p201di.xha) interfaceC2505ka).m13076di().m7879sf();
                this.ihz = viewGroup;
                if (viewGroup != null) {
                    this.f10746xd.m13159lr();
                    View viewM13157ik = this.f10746xd.m13157ik();
                    if (viewM13157ik != null) {
                        ViewGroup viewGroup2 = (ViewGroup) viewM13157ik.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewM13157ik);
                        }
                        this.ihz.addView(viewM13157ik, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo9011ri(InterfaceC2505ka<? extends View> interfaceC2505ka, com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        this.f10726jc.set(true);
        this.f10750zf = interfaceC2505ka;
        Integer.valueOf(interfaceC2505ka.mo8752ik());
        if (this.f10749zb != getWindowVisibility() && mo12247mj()) {
            m13568di(getWindowVisibility());
        }
        if (interfaceC2505ka.mo8752ik() == 3 && (wjvVar = this.f10718co) != null && wjvVar.m14453nd() == 1) {
            this.f10718co.m14374co(0);
        }
        if (interfaceC2505ka.mo8752ik() != 1 || (interfaceC2505ka instanceof C3133ka)) {
            View viewMo8751fi = interfaceC2505ka.mo8751fi();
            if (viewMo8751fi.getParent() != null) {
                ((ViewGroup) viewMo8751fi.getParent()).removeView(viewMo8751fi);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                arrayList.add(getChildAt(i));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof C2634di) {
                    removeView((View) arrayList.get(i2));
                }
            }
            if (C3273ac.m13965ik(this.f10718co)) {
                addView(interfaceC2505ka.mo8751fi(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(interfaceC2505ka.mo8751fi());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f10718co;
        if (wjvVar2 != null) {
            C3521ka.m15945ri(wjvVar2.jbs(), this.f10741su, this.f10738qt, interfaceC2505ka.mo8752ik());
        }
        com.bytedance.sdk.component.adexpress.p125lr.jbs jbsVar = this.f10743tw;
        if (jbsVar != null) {
            ((C3223aw) jbsVar).m13581qt();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f10722fi;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) bgrVar.m8949ik(), (float) bgrVar.m8952ka());
        }
        if ((this.f10750zf instanceof com.bytedance.sdk.openadsdk.core.p200co.p201di.xha) && C3276bu.m14026ri(this.f10718co)) {
            m13567ay();
        }
        if (m13572lr(bgrVar)) {
            C2889fi.m11110ri(this, this.f10718co, mo12246ik(getDynamicShowType()));
        }
        C3246uq c3246uq = this.srn;
        if (c3246uq != null) {
            c3246uq.m13742ri(this.f10718co, this.f10738qt);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13577ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        if (wjvVar == null) {
            return;
        }
        this.f10738qt = str;
        this.f10718co = wjvVar;
        this.f10740sf = adSlot;
        this.f10744uq = z;
        this.f10736qd = z2;
        int iHpn = wjvVar.hpn();
        this.f10729lr = iHpn;
        if (iHpn != 10) {
            return;
        }
        this.dzy = true;
        xha();
        tan();
        this.dzy = false;
    }

    /* JADX INFO: renamed from: ri */
    public void mo11883ri(String str, JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo11884ri(boolean z, String str) {
    }

    /* JADX INFO: renamed from: ri */
    public boolean mo11551ri(JSONObject jSONObject) {
        return false;
    }

    public void setBackupListener(InterfaceC2504ik interfaceC2504ik) {
        this.slm = interfaceC2504ik;
        C2502di c2502di = this.rzk;
        if (c2502di != null) {
            c2502di.m8979ri(interfaceC2504ik);
        }
    }

    public void setBannerClickClosedListener(com.bytedance.sdk.openadsdk.core.p221ka.xha.InterfaceC3266ri interfaceC3266ri) {
        this.f10724ig = interfaceC3266ri;
    }

    public void setClickCreativeListener(C3235mj c3235mj) {
        this.f10719di = c3235mj;
        if (c3235mj != null) {
            c3235mj.m13546ri((C3221ri.ri) this);
        }
    }

    public void setClickListener(jbs jbsVar) {
        this.xha = jbsVar;
    }

    public void setClosedListenerKey(String str) {
        this.f10735pv = str;
        C3232ik c3232ik = this.f10728kt;
        if (c3232ik != null) {
            c3232ik.m13664ri(str);
        }
    }

    public void setDislike(C3377ik c3377ik) {
        AbstractC3238ri abstractC3238ri;
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (interfaceC2505ka != null && (interfaceC2505ka instanceof ihz) && (abstractC3238ri = (AbstractC3238ri) interfaceC2505ka.mo8751fi()) != null) {
            abstractC3238ri.setDislikeInner(c3377ik);
        }
        C3232ik c3232ik = this.f10728kt;
        if (c3232ik != null) {
            c3232ik.m13663ri(c3377ik);
        }
        this.f10725ik = c3377ik;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.f10722fi = pAGExpressAdWrapperListener;
        C3232ik c3232ik = this.f10728kt;
        if (c3232ik != null) {
            c3232ik.m13662ri(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(InterfaceC3338fi interfaceC3338fi) {
        if (this.bnj != null && getJsObject() != null) {
            getJsObject().m13443ri(interfaceC3338fi);
        }
        C3133ka c3133ka = this.gcp;
        if (c3133ka != null) {
            c3133ka.mo13085ri(interfaceC3338fi);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        AbstractC3238ri abstractC3238ri;
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (interfaceC2505ka != null && (interfaceC2505ka instanceof ihz) && (abstractC3238ri = (AbstractC3238ri) interfaceC2505ka.mo8751fi()) != null) {
            abstractC3238ri.setDislikeOuter(tTDislikeDialogAbstract);
        }
        C3232ik c3232ik = this.f10728kt;
        if (c3232ik != null) {
            c3232ik.m13661ri(tTDislikeDialogAbstract);
        }
        this.f10727ka = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z) {
        this.f10744uq = z;
        C2506lr c2506lr = this.igq;
        if (c2506lr != null && c2506lr.m9001lr() != null) {
            this.igq.m9001lr().setSoundMute(z);
        }
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if (interfaceC2505ka instanceof C3133ka) {
            ((C3133ka) interfaceC2505ka).setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        try {
            int i3 = Integer.parseInt(String.valueOf(charSequence));
            m13570lr(i3, i);
            C3152lr c3152lr = this.f10746xd;
            if (c3152lr != null) {
                c3152lr.m13161ri(i3);
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setTimeUpdate(int i) {
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.p221ka.jbs jbsVar) {
        this.f10751zk = jbsVar;
    }

    public void setVideoBusiness(InterfaceC3118lr interfaceC3118lr) {
        C3224ay c3224ay = this.bnj;
        if (c3224ay != null) {
            c3224ay.m13600ri(interfaceC3118lr);
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.p174aw.xha xhaVar) {
        if (this.bnj == null || getJsObject() == null) {
            return;
        }
        getJsObject().m13440ri(xhaVar);
    }

    /* JADX INFO: renamed from: sf */
    public void mo12251sf() {
    }

    public void tan() {
        if (this.f10718co == null) {
            return;
        }
        this.f10741su = SystemClock.elapsedRealtime();
        if (this.f10718co.zyu()) {
            C3232ik c3232ik = this.f10728kt;
            if (c3232ik == null) {
                mo9010a_(106);
                return;
            } else {
                c3232ik.m13660ri((InterfaceC2513vr) this);
                this.f10728kt.m13659ri();
                return;
            }
        }
        this.hcw.mo15598ri();
        InterfaceC2508qt.ri riVar = this.siy;
        if (riVar != null) {
            riVar.mo8975ri(this);
        }
        try {
            this.siy.mo8973ri();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: uq */
    public void m13578uq() {
        C3283ka c3283kaM14473qc;
        C3097ka c3097kaM14188ri;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10718co;
        if (wjvVar == null || (c3283kaM14473qc = wjvVar.m14473qc()) == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
            return;
        }
        c3097kaM14188ri.m12469fi(getVideoProgress());
    }

    public boolean wjv() {
        return this.f10726jc.get();
    }

    protected void xha() {
        this.f10714ac = new HashSet<>();
        this.f10742ta = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f10740sf;
        if (adSlot != null) {
            this.f10720dw = adSlot.getExpressViewAcceptedWidth();
            this.ory = this.f10740sf.getExpressViewAcceptedHeight();
            m13551aw();
            this.f10730mj = this.f10740sf.getCodeId();
            if (TextUtils.equals(this.f10738qt, "fullscreen_interstitial_ad")) {
                this.wjv = this.f10718co.mhp();
            } else if (TextUtils.equals(this.f10738qt, "rewarded_video")) {
                this.wjv = this.f10718co.plm();
            } else if (TextUtils.equals(this.f10738qt, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10718co;
                if (wjvVar == null || wjvVar.m14436lr() < 0) {
                    this.wjv = C3299nr.m14639ka().m14887uq(this.f10730mj);
                } else {
                    this.wjv = this.f10718co.m14436lr();
                }
                if (this.wjv < 0) {
                    this.wjv = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.f10718co.zyu()) {
            this.f10728kt = new C3232ik(this.jbs, this, this.f10718co, this.f10738qt);
            return;
        }
        bgr();
        this.whw = new ArrayList();
        m13564vr();
        com.bytedance.sdk.component.adexpress.p125lr.slm slmVar = this.f10748xm;
        if (slmVar != null) {
            this.bnj = (C3224ay) slmVar.m9009lr();
        }
        dzy jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.m13405di(this.f10738qt);
        }
    }

    public void xha(int i) {
        InterfaceC2505ka<? extends View> interfaceC2505ka = this.f10750zf;
        if ((interfaceC2505ka instanceof com.bytedance.sdk.openadsdk.core.p200co.p201di.xha) && i == 4) {
            ((com.bytedance.sdk.openadsdk.core.p200co.p201di.xha) interfaceC2505ka).m13124qt();
        }
    }
}
