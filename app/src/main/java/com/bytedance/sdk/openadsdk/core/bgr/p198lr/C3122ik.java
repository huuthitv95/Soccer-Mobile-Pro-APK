package com.bytedance.sdk.openadsdk.core.bgr.p198lr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka.C1977ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1991lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1998ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3117ik;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.AbstractC3127ri;
import com.bytedance.sdk.openadsdk.core.jbs.C3224ay;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3090di;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.EnumC3106ri;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import com.bytedance.sdk.openadsdk.p236ka.xha;
import com.bytedance.sdk.openadsdk.p269vr.C3601ik;
import com.bytedance.sdk.openadsdk.p269vr.C3602ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3122ik extends AbstractC3127ri {
    private InterfaceC3124lr bnj;
    private long dzy;

    /* JADX INFO: renamed from: fe */
    private int f10083fe;
    private WeakReference<InterfaceC1999ik.ka> feb;
    private int gcp;

    /* JADX INFO: renamed from: ig */
    private final boolean f10084ig;

    /* JADX INFO: renamed from: jc */
    private final boolean f10085jc;

    /* JADX INFO: renamed from: kt */
    private boolean f10086kt;

    /* JADX INFO: renamed from: pv */
    private long f10087pv;

    /* JADX INFO: renamed from: qd */
    private final String f10088qd;

    /* JADX INFO: renamed from: qh */
    private final C2728su.ri f10089qh;
    private final Runnable rzk;
    private int siy;
    private final boolean srn;

    /* JADX INFO: renamed from: ta */
    private xha f10090ta;
    private int tnn;

    /* JADX INFO: renamed from: tw */
    private boolean f10091tw;
    private final InterfaceC2004ri.ri whw;

    /* JADX INFO: renamed from: xm */
    private int f10092xm;
    private WeakReference<ri> zyn;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.lr.ik$ri */
    public interface ri {
        /* JADX INFO: renamed from: di */
        void mo12806di();

        /* JADX INFO: renamed from: ri */
        void mo12813ri(int i);
    }

    public C3122ik(Context context, ViewGroup viewGroup, wjv wjvVar, String str, boolean z, boolean z2, boolean z3, xha xhaVar) {
        super(context, wjvVar, viewGroup);
        this.dzy = 0L;
        this.f10087pv = 0L;
        this.f10086kt = true;
        this.tnn = 0;
        this.f10083fe = 0;
        this.whw = new InterfaceC2004ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1
            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: fi */
            public void mo6422fi(InterfaceC2004ri interfaceC2004ri) {
                C3097ka c3097kaM14188ri;
                C3283ka c3283kaM14473qc = C3122ik.this.f10158mj.m14473qc();
                if (c3283kaM14473qc != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                    c3097kaM14188ri.m12471ik(C3122ik.this.jbs);
                }
                if (C3122ik.this.f10170zf != null) {
                    C3122ik.this.f10170zf.m12403ri(1);
                }
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ik */
            public void mo6423ik(InterfaceC2004ri interfaceC2004ri) {
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ka */
            public void mo6424ka(InterfaceC2004ri interfaceC2004ri) {
                C3097ka c3097kaM14188ri;
                C3283ka c3283kaM14473qc = C3122ik.this.f10158mj.m14473qc();
                if (c3283kaM14473qc != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                    c3097kaM14188ri.m12475lr(C3122ik.this.jbs);
                }
                C2889fi.m11114ri(C3122ik.this.f10158mj, 3);
                if (C3122ik.this.f10170zf != null) {
                    C3122ik.this.f10170zf.m12403ri(0);
                }
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: lr */
            public void mo6425lr(InterfaceC2004ri interfaceC2004ri) {
                C3122ik.this.f10155ik.removeCallbacks(C3122ik.this.rzk);
                C3122ik.this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C3122ik.this.feb != null && C3122ik.this.feb.get() != null) {
                            C3122ik.this.feb.get();
                        }
                        if (C3122ik.this.xha != null) {
                            C3122ik.this.xha.mo6402lr();
                        }
                    }
                });
                if (C3122ik.this.f10084ig) {
                    return;
                }
                C3122ik c3122ik = C3122ik.this;
                c3122ik.m12985ri(c3122ik.f10090ta);
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: lr */
            public void mo6426lr(InterfaceC2004ri interfaceC2004ri, int i) {
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6427ri(InterfaceC2004ri interfaceC2004ri) {
                C3097ka c3097kaM14188ri;
                C3122ik.this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C2889fi.m11114ri(C3122ik.this.f10158mj, 5);
                            C2897ik.m11146ri(C3122ik.this.f10158mj, 5);
                            if (C3122ik.this.f10170zf != null) {
                                C3122ik.this.f10170zf.m12403ri(9);
                            }
                        } catch (Exception unused) {
                        }
                        C3122ik.this.srn();
                    }
                });
                C3283ka c3283kaM14473qc = C3122ik.this.f10158mj.m14473qc();
                if (c3283kaM14473qc == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
                    return;
                }
                c3097kaM14188ri.m12473ka(C3122ik.this.jbs);
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6428ri(InterfaceC2004ri interfaceC2004ri, int i) {
                C3122ik.this.f10147ay = false;
                C3122ik.this.f10155ik.removeCallbacks(C3122ik.this.rzk);
                C3122ik.this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        C3122ik.this.xha.mo6402lr();
                    }
                });
                C2889fi.m11114ri(C3122ik.this.f10158mj, 0);
                if (C3122ik.this.f10170zf != null) {
                    C3122ik.this.f10170zf.m12403ri(5);
                }
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6429ri(InterfaceC2004ri interfaceC2004ri, int i, int i2) {
                jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        C3122ik.this.m12897kt();
                    }
                });
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6430ri(InterfaceC2004ri interfaceC2004ri, int i, int i2, int i3) {
                C3122ik.this.f10147ay = true;
                C3122ik.this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C3122ik.this.xha != null) {
                            C3122ik.this.xha.m12830bu();
                            C3122ik.this.f10155ik.postDelayed(C3122ik.this.rzk, 8000L);
                        }
                    }
                });
                C2889fi.m11114ri(C3122ik.this.f10158mj, 2);
                if (C3122ik.this.f10170zf != null) {
                    C3122ik.this.f10170zf.m12403ri(4);
                }
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6431ri(InterfaceC2004ri interfaceC2004ri, long j) {
                C3122ik.this.f10147ay = false;
                C3122ik.this.f10155ik.removeCallbacks(C3122ik.this.rzk);
                C3122ik.this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C3122ik.this.xha != null) {
                            C3122ik.this.xha.mo6402lr();
                        }
                        if (!C3122ik.this.f10168vr || C3122ik.this.zyn == null || C3122ik.this.zyn.get() == null) {
                            return;
                        }
                        ((ri) C3122ik.this.zyn.get()).mo12806di();
                    }
                });
                C3122ik.this.m12990xd();
                C2889fi.m11114ri(C3122ik.this.f10158mj, 0);
                if (C3122ik.this.f10170zf != null) {
                    C3122ik.this.f10170zf.m12399ik();
                }
                C3122ik c3122ik = C3122ik.this;
                c3122ik.m12985ri(c3122ik.f10090ta);
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6432ri(InterfaceC2004ri interfaceC2004ri, final long j, final long j2) {
                if (Math.abs(j - C3122ik.this.jbs) < 50) {
                    return;
                }
                C3122ik c3122ik = C3122ik.this;
                c3122ik.m12985ri(c3122ik.f10090ta);
                C3122ik.this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        C3122ik.this.m12982ri(j, j2);
                        C3122ik.this.m12899lr(j, j2);
                    }
                });
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6433ri(InterfaceC2004ri interfaceC2004ri, final C1998ri c1998ri) {
                C3097ka c3097kaM14188ri;
                String unused = C3122ik.this.f10164ri;
                c1998ri.m6369ri();
                c1998ri.m6368lr();
                c1998ri.m6367ik();
                C3122ik.this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int iM6369ri = c1998ri.m6369ri();
                        int iM6368lr = c1998ri.m6368lr();
                        if (!C3122ik.this.igq() || iM6368lr == -1004) {
                            if (C3122ik.this.m12895ka(iM6369ri, iM6368lr)) {
                                String unused2 = C3122ik.this.f10164ri;
                                C3122ik.this.xha.mo12958ri(C3122ik.this.f10158mj, (WeakReference<Context>) null, false);
                                C3122ik.this.m12978lr(true);
                                C3122ik.this.mo6374fi();
                            }
                            if (C3122ik.this.xha != null) {
                                C3122ik.this.xha.mo6402lr();
                            }
                            if (C3122ik.this.igq != null) {
                                C3122ik.this.igq.mo6397lr(C3122ik.this.f10087pv, C1977ri.m6207ri(C3122ik.this.jbs, C3122ik.this.f10160oh));
                            }
                            if (C3122ik.this.feb == null || C3122ik.this.feb.get() == null || C3122ik.this.igq()) {
                                return;
                            }
                            ((InterfaceC1999ik.ka) C3122ik.this.feb.get()).mo6395ri(iM6369ri, iM6368lr);
                        }
                    }
                });
                C3122ik.this.m12983ri(c1998ri);
                C3283ka c3283kaM14473qc = C3122ik.this.f10158mj.m14473qc();
                if (c3283kaM14473qc != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                    c3097kaM14188ri.m12484ri(EnumC3106ri.GENERAL_LINEAR_AD_ERROR);
                }
                C2889fi.m11114ri(C3122ik.this.f10158mj, 6);
                C2897ik.m11144lr(C3122ik.this.f10158mj);
                if (C3122ik.this.f10170zf != null) {
                    C3122ik.this.f10170zf.m12403ri(14);
                }
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6434ri(InterfaceC2004ri interfaceC2004ri, boolean z4) {
                C3122ik.this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C3122ik.this.xha != null) {
                            C3122ik.this.xha.mo6402lr();
                        }
                    }
                });
            }
        };
        this.f10092xm = 0;
        this.rzk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.4
            @Override // java.lang.Runnable
            public void run() {
                if (C3122ik.this.xha != null) {
                    C3122ik.this.xha.mo12958ri(C3122ik.this.f10158mj, (WeakReference<Context>) null, false);
                    C3122ik.this.xha.mo6402lr();
                    C3122ik.this.m12978lr(true);
                    String unused = C3122ik.this.f10164ri;
                }
            }
        };
        this.f10089qh = new C2728su.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.6
            @Override // com.bytedance.sdk.component.utils.C2728su.ri
            /* JADX INFO: renamed from: ri */
            public void mo10299ri(Context context2, Intent intent, boolean z4, final int i) {
                dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3122ik.this.m12876di(i);
                    }
                });
            }
        };
        this.f10091tw = false;
        this.gcp = C2724nr.m10255ik(context);
        m12987ri(z);
        this.f10088qd = str;
        try {
            this.tnn = viewGroup.getWidth();
            this.f10083fe = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        m12916ri(context);
        this.f10084ig = true;
        this.srn = z2;
        this.f10085jc = z3;
        if (xhaVar != null) {
            this.f10090ta = xhaVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public void m12876di(int i) {
        m12881fi(i);
        if (i == 4) {
            this.f10148bu = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1991lr feb() {
        if (this.f10165sf.getResources().getConfiguration().orientation != 1 || this.xha == null) {
            return null;
        }
        return this.xha.m12828aw();
    }

    /* JADX INFO: renamed from: fi */
    private void m12881fi(int i) {
        if (this.gcp == i) {
            return;
        }
        this.gcp = i;
        if (i != 4 && i != 0) {
            this.f10159nr = false;
        }
        if (!this.f10159nr && !mo6371aw() && this.srn) {
            m12890ik(2, i);
        }
        WeakReference<ri> weakReference = this.zyn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zyn.get().mo12813ri(this.gcp);
    }

    /* JADX INFO: renamed from: ik */
    private void m12888ik(C1996ik c1996ik) {
        c1996ik.m6315ka(0);
        this.f10150di.m6182ri(c1996ik);
        this.dzy = System.currentTimeMillis();
        this.xha.m12834ik(8);
        this.xha.m12834ik(0);
        m12986ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.3
            @Override // java.lang.Runnable
            public void run() {
                if (C3122ik.this.f10150di == null) {
                    return;
                }
                C3122ik.this.dzy = System.currentTimeMillis();
                C3122ik.this.xha.m12839ka(0);
                C3122ik.this.f10150di.m6185ri(true, C3122ik.this.jbs, C3122ik.this.slm);
            }
        });
        if (this.f10168vr) {
            slm();
        }
    }

    /* JADX INFO: renamed from: ik */
    private boolean m12890ik(int i, int i2) {
        if (i2 == 0) {
            mo6377lr();
            this.f10148bu = true;
            if (this.xha != null) {
                this.xha.mo12958ri(this.f10158mj, (WeakReference<Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.xha != null) {
                this.xha.mo6403ri();
            }
            mo6377lr();
            this.f10148bu = true;
            this.f10159nr = false;
            if (this.xha != null) {
                return this.xha.m12863ri(i, this.f10158mj.m14389eu(), this.f10085jc);
            }
        } else if (i2 == 4) {
            this.f10148bu = false;
            if (this.xha != null) {
                this.xha.m12866vr();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: jc */
    private void m12893jc() {
        Boolean.valueOf(this.f10146aw);
        if (this.f10150di != null) {
            if (this.f10150di.xha()) {
                if (this.f10146aw) {
                    m12962ac();
                } else {
                    m12977lr(this.f10169xd);
                }
                Boolean.valueOf(this.f10146aw);
            } else {
                this.f10150di.m6185ri(false, this.jbs, this.slm);
            }
        }
        if (this.f10145ac.get()) {
            m12991zf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public boolean m12895ka(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kt */
    public void m12897kt() {
        int i;
        int i2;
        try {
            if (feb() != null && this.f10150di != null && this.f10153fr != null) {
                int iKa = this.f10150di.mo6170ka();
                int iFi = this.f10150di.mo6168fi();
                final int width = this.f10153fr.getWidth();
                final int height = this.f10153fr.getHeight();
                if (width > 0 && height > 0 && iFi > 0 && iKa > 0) {
                    if (iKa == iFi) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (iKa > iFi) {
                        i2 = (int) ((((double) width) * 1.0d) / ((double) ((iKa * 1.0f) / iFi)));
                        i = width;
                    } else {
                        i = (int) ((((double) height) * 1.0d) / ((double) ((iFi * 1.0f) / iKa)));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    if (i <= width && i > 0) {
                        width = i;
                    }
                    this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (C3122ik.this.feb() instanceof TextureView) {
                                    ((TextureView) C3122ik.this.feb()).setLayoutParams(layoutParams);
                                    String unused = C3122ik.this.f10164ri;
                                } else if (C3122ik.this.feb() instanceof SurfaceView) {
                                    ((SurfaceView) C3122ik.this.feb()).setLayoutParams(layoutParams);
                                    String unused2 = C3122ik.this.f10164ri;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = C3122ik.this.f10164ri;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.f10165sf);
            Objects.toString(feb());
            C3117ik c3117ik = this.f10150di;
            C3117ik c3117ik2 = this.f10150di;
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12899lr(long j, long j2) {
        C3097ka c3097kaM14188ri;
        this.f10158mj.m14430ka(j);
        this.jbs = j;
        this.f10160oh = j2;
        this.xha.mo12852ri(j, j2);
        this.xha.mo12849ri(C1977ri.m6207ri(j, j2));
        try {
            if (this.igq != null) {
                this.igq.mo6400ri(j, j2);
            }
        } catch (Throwable th) {
            C2707ac.m10206ri(this.f10164ri, "onProgressUpdate error: ", th);
        }
        C3283ka c3283kaM14473qc = this.f10158mj.m14473qc();
        if (c3283kaM14473qc == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
            return;
        }
        c3097kaM14188ri.m12482ri(j, j2, this.f10170zf);
    }

    /* JADX INFO: renamed from: ri */
    private void m12916ri(Context context) {
        C3122ik c3122ik;
        ViewGroup c3602ka = this.f10168vr ? new C3602ka(context) : new C3601ik(context);
        if (this.f10168vr) {
            c3122ik = this;
            c3122ik.xha = new C3121fi(context, c3602ka, true, 17, this.f10158mj, c3122ik, m12989uq());
        } else {
            c3122ik = this;
            c3122ik.xha = new C3123ka(context, c3602ka, true, 17, c3122ik.f10158mj, c3122ik, false);
        }
        c3122ik.xha.m12857ri(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void srn() {
        this.f10092xm++;
        if (this.xha == null) {
            return;
        }
        this.xha.mo6402lr();
        if (this.igq != null) {
            this.igq.mo6399ri(this.f10087pv, C1977ri.m6207ri(this.jbs, this.f10160oh));
        }
        this.f10087pv = System.currentTimeMillis() - this.dzy;
        if (this.f10086kt) {
            this.xha.mo12958ri(this.f10158mj, (WeakReference<Context>) null, true);
        }
        if (!this.ihz) {
            this.ihz = true;
            m12899lr(this.f10160oh, this.f10160oh);
            long j = this.f10160oh;
            this.jbs = j;
            this.f10163qt = j;
            m12976lr(this.f10090ta);
        }
        if (!this.f10168vr && this.tan) {
            mo6407fi(this.xha, null);
        }
        this.bgr = true;
    }

    /* JADX INFO: renamed from: di */
    public void m12938di(boolean z) {
        this.f10086kt = z;
    }

    public void dzy() {
        if (this.f10091tw && this.f10167uq) {
            this.f10091tw = false;
            C2728su.m10297ri(this.f10089qh);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: fi */
    public void mo6374fi() {
        if (this.f10150di != null) {
            this.f10150di.m6166co();
            this.f10150di = null;
        }
        if (this.f10086kt) {
            if ("embeded_ad".equals(this.f10088qd)) {
                this.xha.m12827ac();
            } else {
                this.xha.mo12958ri(this.f10158mj, (WeakReference<Context>) null, true);
            }
            this.f10155ik.removeCallbacksAndMessages(null);
            this.f10149co.clear();
            if (this.f10168vr) {
                dzy();
            }
        }
    }

    /* JADX INFO: renamed from: ig */
    public void m12939ig() {
        if (this.f10150di != null) {
            m12978lr(false);
            ory();
            this.f10145ac.set(false);
            this.ihz = false;
            m12985ri(this.f10090ta);
            this.f10150di.jbs();
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ik */
    public void mo6375ik() {
        if (this.xha != null) {
            this.xha.mo6403ri();
        }
        if (this.xha != null) {
            this.xha.m12847nr();
        }
        m12893jc();
    }

    /* JADX INFO: renamed from: ik */
    public void m12940ik(int i) {
        m12881fi(i);
        if (i == 4) {
            this.f10148bu = false;
            mo6375ik();
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ka */
    public void mo6376ka() {
        mo6384ri(true, 3);
    }

    /* JADX INFO: renamed from: ka */
    public void m12941ka(int i) {
        this.siy = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m12942lr(int i, int i2) {
        m12946ri(i, i2);
        if (this.xha == null || i <= 0 || i2 <= 0) {
            return;
        }
        this.xha.m12835ik(i, i2);
        this.xha.m12850ri(i, i2);
        m12897kt();
    }

    /* JADX INFO: renamed from: pv */
    public void m12943pv() {
        if (this.f10170zf != null) {
            this.f10170zf.m12403ri(13);
        }
    }

    /* JADX INFO: renamed from: qd */
    public int m12944qd() {
        return this.siy;
    }

    /* JADX INFO: renamed from: ri */
    public C3090di m12945ri(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.f10158mj.m14564yj()) {
            return null;
        }
        if (this.f10170zf == null) {
            this.f10170zf = C3090di.m12390ri();
        }
        this.f10170zf.m12405ri(view, this.f10158mj);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    this.f10170zf.m12406ri((View) pair.first, pair.second == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) pair.second);
                }
            }
        }
        return this.f10170zf;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6380ri() {
        if (this.f10150di != null) {
            this.f10150di.jbs();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12946ri(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.tnn = i;
        this.f10083fe = i2;
    }

    /* JADX INFO: renamed from: ri */
    public final void m12947ri(int i, boolean z) {
        if (z || this.hcw) {
            if (z) {
                this.hcw = false;
            }
            if (this.ihz || !this.f10145ac.get()) {
                return;
            }
            C3412vr.ri riVar = new C3412vr.ri();
            riVar.m15466lr(mo6373di());
            riVar.m15463ka(jbs());
            riVar.m15459ik(xha());
            riVar.m15458ik(i);
            riVar.m15462ka(mo6378mj());
            C3413ri.m15493ri(this.xha, riVar, this.f10090ta);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p199ri.AbstractC3127ri
    /* JADX INFO: renamed from: ri */
    public void mo12948ri(InterfaceC1999ik.ka kaVar) {
        this.feb = new WeakReference<>(kaVar);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: ri */
    public void mo6418ri(InterfaceC2000lr interfaceC2000lr, View view) {
        if (this.f10150di == null) {
            return;
        }
        if (this.f10150di.mo6167di()) {
            mo6377lr();
            this.xha.m12844lr(true, false);
            this.xha.mo12832di();
        } else {
            if (this.f10150di.xha()) {
                xha(false);
                if (this.xha != null) {
                    this.xha.m12844lr(false, false);
                    return;
                }
                return;
            }
            if (this.xha != null) {
                this.xha.m12836ik(this.f10153fr);
            }
            m12966fi(this.jbs);
            if (this.xha != null) {
                this.xha.m12844lr(false, false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p199ri.AbstractC3127ri
    /* JADX INFO: renamed from: ri */
    public void mo12949ri(InterfaceC2000lr interfaceC2000lr, View view, boolean z) {
        m12969ik(!this.tan);
        if (this.f10165sf instanceof Activity) {
            if (this.xha != null) {
                this.xha.mo12842lr(this.f10153fr);
                this.xha.mo12837ik(false);
            }
            m12981ri(1);
            InterfaceC1999ik.lr lrVar = this.f10166su != null ? this.f10166su.get() : null;
            if (lrVar != null) {
                lrVar.mo6396ri(this.tan);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12950ri(PAGNativeAd pAGNativeAd) {
        if (!this.f10168vr || this.xha == null) {
            return;
        }
        this.xha.m12858ri(pAGNativeAd);
    }

    /* JADX INFO: renamed from: ri */
    public void m12951ri(final C3120di.ri riVar) {
        if (!this.f10168vr || this.xha == null) {
            return;
        }
        this.xha.m12859ri(new C3120di.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ik.2
            @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di.ri
            /* JADX INFO: renamed from: ri */
            public void mo12820ri(View view, int i) {
                C3120di.ri riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.mo12820ri(view, i);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m12952ri(ri riVar) {
        this.zyn = new WeakReference<>(riVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m12953ri(InterfaceC3124lr interfaceC3124lr) {
        this.bnj = interfaceC3124lr;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6384ri(boolean z, int i) {
        if (!this.ihz && this.f10145ac.get()) {
            if (z) {
                m12947ri(i, false);
                this.ihz = false;
            } else {
                m12965dw();
            }
        }
        mo6374fi();
        if (this.f10170zf != null) {
            this.f10170zf.m12400ka();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p199ri.AbstractC3127ri, com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public boolean mo6387ri(C1996ik c1996ik) {
        super.mo6387ri(c1996ik);
        if (this.f10150di != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(c1996ik.slm())) {
            return false;
        }
        m12978lr(false);
        c1996ik.slm();
        c1996ik.m6319lr(C3606fi.m16703ri("player_force_raw_url", 0) == 1);
        int i = this.siy + 1;
        this.siy = i;
        c1996ik.f4616fi = i;
        m12974lr(c1996ik);
        ory();
        if (this.f10170zf != null) {
            this.f10170zf.m12409ri(false, 0.0f);
        }
        if (!C3224ay.m13589lr(this.f10088qd) || this.jbs <= 0) {
            this.jbs = c1996ik.m6324qt();
        }
        if (C3224ay.m13589lr(this.f10088qd) && this.jbs == this.f10160oh) {
            this.jbs = 0L;
        }
        if (c1996ik.m6324qt() <= 0) {
            this.ihz = false;
            this.f10145ac.set(false);
        } else {
            this.jbs = c1996ik.m6324qt();
            this.f10163qt = Math.max(this.f10163qt, this.jbs);
        }
        if (this.xha != null) {
            this.xha.mo6403ri();
            if (this.f10092xm == 0) {
                this.xha.xha();
            }
            this.xha.m12835ik(c1996ik.m6321mj(), c1996ik.jbs());
            this.xha.m12836ik(this.f10153fr);
            this.xha.m12850ri(c1996ik.m6321mj(), c1996ik.jbs());
        }
        if (this.f10150di == null) {
            this.f10150di = new C3117ik();
            this.f10150di.mo6183ri(this.whw);
        }
        m12979nr();
        this.f10087pv = 0L;
        try {
            m12888ik(c1996ik);
            return true;
        } catch (Exception e) {
            m12983ri(new C1998ri(-10, 0, e.getMessage()));
            C2707ac.m10196ik(this.f10164ri, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e)));
            return false;
        }
    }

    public void slm() {
        if (this.f10091tw || !this.f10167uq) {
            return;
        }
        Context applicationContext = C3299nr.m14642ri().getApplicationContext();
        this.f10091tw = true;
        C2728su.m10298ri(this.f10089qh, applicationContext);
    }

    public void xha(boolean z) {
        if (this.xha != null) {
            this.xha.mo6403ri();
        }
        if (this.xha != null && z) {
            this.xha.m12847nr();
        }
        m12893jc();
    }
}
