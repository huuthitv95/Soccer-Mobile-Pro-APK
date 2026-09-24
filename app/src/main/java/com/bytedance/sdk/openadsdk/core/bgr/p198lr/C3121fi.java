package com.bytedance.sdk.openadsdk.core.bgr.p198lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1991lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1992ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.SurfaceHolderCallbackC1989ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.TextureViewSurfaceTextureListenerC1990ka;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3098lr;
import com.bytedance.sdk.openadsdk.core.p200co.C3143fi;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.C3333ac;
import com.bytedance.sdk.openadsdk.core.widget.C3346ri;
import com.bytedance.sdk.openadsdk.core.widget.tan;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import com.facebook.internal.security.CertificateUtil;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3121fi implements InterfaceC1992ri, InterfaceC2000lr<wjv>, igq.InterfaceC2719ri, C3221ri.ri, C3333ac.lr, tan.InterfaceC3355ri {

    /* JADX INFO: renamed from: ac */
    int f10045ac;

    /* JADX INFO: renamed from: aw */
    C3346ri f10046aw;

    /* JADX INFO: renamed from: ay */
    int f10047ay;
    TextView bgr;

    /* JADX INFO: renamed from: bu */
    int f10048bu;

    /* JADX INFO: renamed from: co */
    View f10049co;

    /* JADX INFO: renamed from: di */
    View f10050di;

    /* JADX INFO: renamed from: dw */
    boolean f10051dw;
    boolean dzy;

    /* JADX INFO: renamed from: fi */
    ImageView f10052fi;

    /* JADX INFO: renamed from: fr */
    wjv f10053fr;
    InterfaceC1999ik hcw;

    /* JADX INFO: renamed from: ig */
    private long f10054ig;
    C3333ac igq;
    boolean ihz;

    /* JADX INFO: renamed from: ik */
    ViewGroup f10055ik;
    View jbs;

    /* JADX INFO: renamed from: ka */
    InterfaceC1991lr f10056ka;

    /* JADX INFO: renamed from: lr */
    protected final int f10057lr;

    /* JADX INFO: renamed from: mj */
    ImageView f10058mj;

    /* JADX INFO: renamed from: nr */
    int f10059nr;

    /* JADX INFO: renamed from: oh */
    C3221ri f10060oh;
    InterfaceC3370ik ory;

    /* JADX INFO: renamed from: pv */
    private C3120di.ri f10061pv;

    /* JADX INFO: renamed from: qd */
    private final String f10062qd;

    /* JADX INFO: renamed from: qt */
    View f10063qt;

    /* JADX INFO: renamed from: ri */
    protected final int f10064ri;

    /* JADX INFO: renamed from: sf */
    ImageView f10065sf;
    TextView slm;

    /* JADX INFO: renamed from: su */
    Context f10066su;
    int tan;

    /* JADX INFO: renamed from: uq */
    boolean f10067uq;

    /* JADX INFO: renamed from: vr */
    TextView f10068vr;
    int wjv;

    /* JADX INFO: renamed from: xd */
    C3221ri f10069xd;
    View xha;

    /* JADX INFO: renamed from: zf */
    InterfaceC3125ri f10070zf;

    public C3121fi(Context context, ViewGroup viewGroup, boolean z, int i, wjv wjvVar, InterfaceC1999ik interfaceC1999ik) {
        this(context, viewGroup, z, i, wjvVar, interfaceC1999ik, true);
    }

    public C3121fi(Context context, ViewGroup viewGroup, boolean z, int i, wjv wjvVar, InterfaceC1999ik interfaceC1999ik, boolean z2) {
        this.f10064ri = 228;
        this.f10057lr = 160;
        this.ihz = true;
        this.f10051dw = true;
        this.dzy = true;
        this.f10062qd = Build.MODEL;
        if (this instanceof C3123ka) {
            return;
        }
        this.f10066su = C3299nr.m14642ri().getApplicationContext();
        m12840ka(z2);
        this.f10055ik = viewGroup;
        this.ihz = z;
        this.f10047ay = i;
        this.hcw = interfaceC1999ik;
        this.f10053fr = wjvVar;
        m12839ka(8);
        mo12853ri(context, this.f10055ik);
        mo12838ka();
        m12831co();
    }

    /* JADX INFO: renamed from: di */
    private void m12821di(int i) {
        C3583qd.m16612ri(this.f10049co, i);
    }

    /* JADX INFO: renamed from: fi */
    private int m12822fi(int i) {
        if (this.tan <= 0 || this.f10045ac <= 0) {
            return 0;
        }
        int iM16589lr = C3583qd.m16589lr(this.f10066su, 228.0f);
        int iM16589lr2 = C3583qd.m16589lr(this.f10066su, 160.0f);
        int i2 = (int) (this.f10045ac * ((i * 1.0f) / this.tan));
        if (i2 > iM16589lr) {
            return iM16589lr;
        }
        return i2 < iM16589lr2 ? iM16589lr2 : i2;
    }

    /* JADX INFO: renamed from: fr */
    private boolean m12823fr() {
        return wjv.m14332fi(this.f10053fr) && (!C3143fi.m13131ri(this.f10053fr.hpn()) ? this.f10053fr.sez() == null : this.f10053fr.m14575zv() == null) && this.f10053fr.m14540ud() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12825ri(final int i, final String str, final wjv wjvVar) {
        C3414ik.m15533ri(new AbstractRunnableC2676ik("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("description", i + CertificateUtil.DELIMITER + str);
                    jSONObject.put("url", C3121fi.this.f10053fr.m14391fb().m14220ri());
                } catch (Throwable unused) {
                }
                C3414ik.m15522lr(C3121fi.this.f10053fr, C3121fi.this.f10053fr != null ? C3571ig.m16444ik(wjvVar.lji()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: ac */
    public void m12827ac() {
        ImageView imageView = this.f10065sf;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C3346ri c3346ri = this.f10046aw;
        if (c3346ri != null) {
            c3346ri.setImageBitmap(null);
        }
    }

    /* JADX INFO: renamed from: aw */
    public InterfaceC1991lr m12828aw() {
        return this.f10056ka;
    }

    /* JADX INFO: renamed from: ay */
    boolean m12829ay() {
        return (this.f10047ay & 4) != 4 || this.ihz;
    }

    void bgr() {
        if (this.f10070zf == null || this.igq != null) {
            return;
        }
        System.currentTimeMillis();
        C3333ac c3333ac = new C3333ac();
        this.igq = c3333ac;
        c3333ac.m14992ri(this.f10066su, this.f10055ik);
        this.igq.m14993ri(this.f10070zf, this);
        System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: bu */
    public void m12830bu() {
        C3583qd.m16577di(this.f10050di);
        C3583qd.m16577di(this.xha);
        if (this.f10052fi.getVisibility() == 0) {
            C3583qd.m16612ri((View) this.f10052fi, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX INFO: renamed from: co */
    void m12831co() {
        String str;
        int i;
        String str2;
        int i2;
        InterfaceC3370ik interfaceC3370ik;
        InterfaceC3370ik interfaceC3370ik2;
        C3221ri c3221ri;
        String str3 = this.f10051dw ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.f10053fr.m14472qa()) {
            str2 = "rewarded_video";
            i2 = 7;
        } else {
            if (!this.f10053fr.m14467pg()) {
                if (this.f10053fr.svc()) {
                    str2 = "banner_ad";
                    i2 = 2;
                } else {
                    str = str3;
                    i = 1;
                }
                if (this.f10053fr.adz() == 4) {
                    this.ory = C3371ka.m15240ri(this.f10066su, str);
                }
                C3221ri c3221ri2 = new C3221ri(this.f10066su, this.f10053fr, str, i);
                this.f10060oh = c3221ri2;
                c3221ri2.m13546ri(this);
                this.f10060oh.m13545lr(true);
                if (this.f10051dw) {
                    this.f10060oh.m13547ri(true);
                } else {
                    this.f10060oh.m13547ri(false);
                    this.f10060oh.m13543ik(true);
                }
                this.f10060oh.m13529ri(this.hcw);
                this.f10060oh.m13520fi(true);
                this.f10060oh.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.1
                    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo11528ri(View view, int i3) {
                        if (C3121fi.this.f10061pv != null) {
                            C3121fi.this.f10061pv.mo12820ri(view, i3);
                        }
                    }
                });
                interfaceC3370ik = this.ory;
                if (interfaceC3370ik != null && (c3221ri = this.f10060oh) != null) {
                    c3221ri.m13534ri(interfaceC3370ik);
                }
                if (m12823fr()) {
                    C3221ri c3221ri3 = new C3221ri(this.f10066su, this.f10053fr, str, i) { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.2
                        @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri
                        /* JADX INFO: renamed from: ik */
                        public boolean mo12867ik() {
                            if (C3121fi.this.f10063qt != null && C3121fi.this.f10063qt.getVisibility() == 0) {
                                return true;
                            }
                            if (C3121fi.this.f10049co != null && C3121fi.this.f10049co.getVisibility() == 0) {
                                return true;
                            }
                            if (C3121fi.this.f10046aw == null || C3121fi.this.f10046aw.getVisibility() != 0) {
                                return C3121fi.this.bgr != null && C3121fi.this.bgr.getVisibility() == 0;
                            }
                            return true;
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri
                        /* JADX INFO: renamed from: lr */
                        public boolean mo12868lr() {
                            boolean zM14995ri = C3121fi.this.igq != null ? C3121fi.this.igq.m14995ri() : false;
                            C3121fi.this.f10052fi.getVisibility();
                            return zM14995ri || C3121fi.this.f10052fi.getVisibility() == 0;
                        }
                    };
                    this.f10069xd = c3221ri3;
                    c3221ri3.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.3
                        @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
                        /* JADX INFO: renamed from: ri */
                        public void mo11528ri(View view, int i3) {
                            if (C3121fi.this.f10061pv != null) {
                                C3121fi.this.f10061pv.mo12820ri(view, i3);
                            }
                        }
                    });
                    this.f10069xd.m13545lr(true);
                    this.f10069xd.m13547ri(this.f10051dw);
                    this.f10069xd.m13529ri(this.hcw);
                    this.f10069xd.m13520fi(true);
                    interfaceC3370ik2 = this.ory;
                    if (interfaceC3370ik2 != null) {
                        this.f10069xd.m13534ri(interfaceC3370ik2);
                    }
                    this.f10069xd.m13546ri(this);
                }
            }
            str2 = "fullscreen_interstitial_ad";
            i2 = 5;
        }
        str = str2;
        i = i2;
        if (this.f10053fr.adz() == 4) {
            this.ory = C3371ka.m15240ri(this.f10066su, str);
        }
        C3221ri c3221ri4 = new C3221ri(this.f10066su, this.f10053fr, str, i);
        this.f10060oh = c3221ri4;
        c3221ri4.m13546ri(this);
        this.f10060oh.m13545lr(true);
        if (this.f10051dw) {
            this.f10060oh.m13547ri(true);
        } else {
            this.f10060oh.m13547ri(false);
            this.f10060oh.m13543ik(true);
        }
        this.f10060oh.m13529ri(this.hcw);
        this.f10060oh.m13520fi(true);
        this.f10060oh.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.1
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i3) {
                if (C3121fi.this.f10061pv != null) {
                    C3121fi.this.f10061pv.mo12820ri(view, i3);
                }
            }
        });
        interfaceC3370ik = this.ory;
        if (interfaceC3370ik != null) {
            c3221ri.m13534ri(interfaceC3370ik);
        }
        if (m12823fr()) {
            C3221ri c3221ri5 = new C3221ri(this.f10066su, this.f10053fr, str, i) { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.2
                @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri
                /* JADX INFO: renamed from: ik */
                public boolean mo12867ik() {
                    if (C3121fi.this.f10063qt != null && C3121fi.this.f10063qt.getVisibility() == 0) {
                        return true;
                    }
                    if (C3121fi.this.f10049co != null && C3121fi.this.f10049co.getVisibility() == 0) {
                        return true;
                    }
                    if (C3121fi.this.f10046aw == null || C3121fi.this.f10046aw.getVisibility() != 0) {
                        return C3121fi.this.bgr != null && C3121fi.this.bgr.getVisibility() == 0;
                    }
                    return true;
                }

                @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri
                /* JADX INFO: renamed from: lr */
                public boolean mo12868lr() {
                    boolean zM14995ri = C3121fi.this.igq != null ? C3121fi.this.igq.m14995ri() : false;
                    C3121fi.this.f10052fi.getVisibility();
                    return zM14995ri || C3121fi.this.f10052fi.getVisibility() == 0;
                }
            };
            this.f10069xd = c3221ri5;
            c3221ri5.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.3
                @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
                /* JADX INFO: renamed from: ri */
                public void mo11528ri(View view, int i3) {
                    if (C3121fi.this.f10061pv != null) {
                        C3121fi.this.f10061pv.mo12820ri(view, i3);
                    }
                }
            });
            this.f10069xd.m13545lr(true);
            this.f10069xd.m13547ri(this.f10051dw);
            this.f10069xd.m13529ri(this.hcw);
            this.f10069xd.m13520fi(true);
            interfaceC3370ik2 = this.ory;
            if (interfaceC3370ik2 != null) {
                this.f10069xd.m13534ri(interfaceC3370ik2);
            }
            this.f10069xd.m13546ri(this);
        }
    }

    /* JADX INFO: renamed from: di */
    public void mo12832di() {
    }

    /* JADX INFO: renamed from: fi */
    public void mo12833fi() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri.ri
    public long getVideoProgress() {
        if (this.f10054ig <= 0) {
            wjv wjvVar = this.f10053fr;
            if (wjvVar != null && wjvVar.m14389eu() != null) {
                this.f10054ig = (long) (this.f10053fr.m14389eu().m6339di() * 1000.0d);
            }
            InterfaceC1999ik interfaceC1999ik = this.hcw;
            if (interfaceC1999ik != null) {
                this.f10054ig = interfaceC1999ik.jbs();
            }
        }
        return this.f10054ig;
    }

    public boolean ihz() {
        return this.ihz;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr
    /* JADX INFO: renamed from: ik */
    public View mo6401ik() {
        return this.f10055ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m12834ik(int i) {
        C3583qd.m16612ri((View) this.f10055ik, 0);
        InterfaceC1991lr interfaceC1991lr = this.f10056ka;
        if (interfaceC1991lr != null) {
            interfaceC1991lr.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m12835ik(int i, int i2) {
        this.tan = i;
        this.f10045ac = i2;
    }

    /* JADX INFO: renamed from: ik */
    public void m12836ik(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.f10055ik.getParent() == null) {
            viewGroup.addView(this.f10055ik);
        }
        m12839ka(0);
    }

    /* JADX INFO: renamed from: ik */
    public void mo12837ik(boolean z) {
    }

    public void jbs() {
        m12839ka(8);
        if (m12829ay()) {
            this.f10056ka.setVisibility(8);
        }
        ImageView imageView = this.f10058mj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        m12839ka(8);
        C3583qd.m16612ri(this.f10063qt, 8);
        C3583qd.m16612ri((View) this.f10065sf, 8);
        C3583qd.m16612ri(this.f10049co, 8);
        C3583qd.m16612ri((View) this.f10046aw, 8);
        C3583qd.m16612ri((View) this.bgr, 8);
        C3583qd.m16612ri((View) this.f10068vr, 8);
        C3333ac c3333ac = this.igq;
        if (c3333ac != null) {
            c3333ac.m14994ri(true);
        }
    }

    /* JADX INFO: renamed from: ka */
    void mo12838ka() {
        this.f10056ka.mo6281ri(this);
        this.f10052fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C3121fi.this.slm()) {
                    if (C3121fi.this.slm == null || C3121fi.this.slm.getVisibility() != 0) {
                        C3121fi.this.f10070zf.mo6418ri(C3121fi.this, view);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ka */
    public void m12839ka(int i) {
        this.wjv = i;
        C3583qd.m16612ri((View) this.f10055ik, i);
    }

    /* JADX INFO: renamed from: ka */
    public void m12840ka(boolean z) {
        this.f10051dw = z;
        if (z) {
            C3221ri c3221ri = this.f10060oh;
            if (c3221ri != null) {
                c3221ri.m13547ri(true);
            }
            C3221ri c3221ri2 = this.f10069xd;
            if (c3221ri2 != null) {
                c3221ri2.m13547ri(true);
                return;
            }
            return;
        }
        C3221ri c3221ri3 = this.f10060oh;
        if (c3221ri3 != null) {
            c3221ri3.m13547ri(false);
        }
        C3221ri c3221ri4 = this.f10069xd;
        if (c3221ri4 != null) {
            c3221ri4.m13547ri(false);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr
    /* JADX INFO: renamed from: lr */
    public void mo6402lr() {
        C3583qd.m16579fi(this.f10050di);
        C3583qd.m16579fi(this.xha);
        ImageView imageView = this.f10058mj;
        if (imageView != null) {
            C3583qd.m16579fi(imageView);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m12841lr(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f10055ik.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.f10055ik.setLayoutParams(layoutParams);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1992ri
    /* JADX INFO: renamed from: lr */
    public void mo6282lr(SurfaceTexture surfaceTexture) {
        InterfaceC1999ik interfaceC1999ik = this.hcw;
        if (interfaceC1999ik != null) {
            interfaceC1999ik.mo6382ri(surfaceTexture);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1992ri
    /* JADX INFO: renamed from: lr */
    public void mo6283lr(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f10056ka.getHolder()) {
            return;
        }
        this.f10067uq = false;
        if (slm()) {
            this.f10070zf.mo6412lr(this, surfaceHolder);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void mo12842lr(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: lr */
    public void mo12843lr(boolean z) {
    }

    /* JADX INFO: renamed from: lr */
    public void m12844lr(boolean z, boolean z2) {
        ImageView imageView = this.f10052fi;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(C3586sf.m16645ri(this.f10066su, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(C3586sf.m16645ri(this.f10066su, "tt_stop_movebar_textpage"));
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public boolean mo12845lr(int i) {
        return false;
    }

    /* JADX INFO: renamed from: mj */
    public void mo12846mj() {
        C3583qd.m16579fi(this.f10050di);
    }

    /* JADX INFO: renamed from: nr */
    public void m12847nr() {
        C3583qd.m16612ri((View) this.f10055ik, 0);
        InterfaceC1991lr interfaceC1991lr = this.f10056ka;
        if (interfaceC1991lr != null) {
            C3583qd.m16612ri(interfaceC1991lr.getView(), 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.C3333ac.lr
    /* JADX INFO: renamed from: qt */
    public boolean mo12848qt() {
        return false;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr
    /* JADX INFO: renamed from: ri */
    public void mo6403ri() {
        mo12861ri(false, this.ihz);
        tan();
    }

    /* JADX INFO: renamed from: ri */
    public void mo12849ri(int i) {
    }

    /* JADX INFO: renamed from: ri */
    public void m12850ri(int i, int i2) {
        if (i == -1) {
            i = C3583qd.m16580ik(this.f10066su);
        }
        if (i <= 0) {
            return;
        }
        this.f10048bu = i;
        if (ihz() || mo12848qt() || (this.f10047ay & 8) == 8) {
            this.f10059nr = i2;
        } else {
            this.f10059nr = m12822fi(i);
        }
        m12841lr(this.f10048bu, this.f10059nr);
    }

    /* JADX INFO: renamed from: ri */
    public void mo12851ri(long j) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo12852ri(long j, long j2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    void mo12853ri(Context context, View view) {
        System.currentTimeMillis();
        wjv wjvVar = this.f10053fr;
        if ((wjvVar == null || ((!wjvVar.m14462ny() && !this.f10053fr.svc()) || C3322sf.m14819lr().akr())) && view != null) {
            view.setKeepScreenOn(true);
        }
        InterfaceC1999ik interfaceC1999ik = this.hcw;
        View surfaceHolderCallbackC1989ik = (interfaceC1999ik == null || !interfaceC1999ik.mo6389vr()) ? new SurfaceHolderCallbackC1989ik(this.f10066su) : new TextureViewSurfaceTextureListenerC1990ka(this.f10066su);
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(surfaceHolderCallbackC1989ik, 0, layoutParams);
        }
        C3583qd.m16612ri(surfaceHolderCallbackC1989ik, 8);
        this.f10056ka = (InterfaceC1991lr) surfaceHolderCallbackC1989ik;
        this.f10052fi = (ImageView) view.findViewById(slm.bzf);
        this.f10050di = view.findViewById(slm.evm);
        this.xha = view.findViewById(slm.f13266fb);
        this.f10058mj = (ImageView) view.findViewById(slm.f13301sz);
        this.jbs = view.findViewById(slm.f13281jm);
        System.currentTimeMillis();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1992ri
    /* JADX INFO: renamed from: ri */
    public void mo6284ri(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f10067uq = true;
        if (slm()) {
            this.f10070zf.mo6416ri(this, surfaceTexture);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr
    /* JADX INFO: renamed from: ri */
    public void mo6404ri(Drawable drawable) {
        ViewGroup viewGroup = this.f10055ik;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1992ri
    /* JADX INFO: renamed from: ri */
    public void mo6285ri(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f10056ka.getHolder()) {
            return;
        }
        this.f10067uq = true;
        if (slm()) {
            this.f10070zf.mo6417ri(this, surfaceHolder);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1992ri
    /* JADX INFO: renamed from: ri */
    public void mo6286ri(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.f10056ka.getHolder()) {
            return;
        }
        slm();
    }

    /* JADX INFO: renamed from: ri */
    void m12854ri(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.jbs) == null || view2.getParent() == null || this.f10063qt != null) {
            return;
        }
        this.f10063qt = this.jbs;
        this.f10065sf = (ImageView) view.findViewById(slm.ezp);
        this.f10049co = view.findViewById(slm.adz);
        this.f10046aw = (C3346ri) view.findViewById(slm.f13283kt);
        this.bgr = (TextView) view.findViewById(slm.feb);
        this.f10068vr = (TextView) view.findViewById(slm.zyn);
        this.slm = (TextView) view.findViewById(slm.tnn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.tan.InterfaceC3355ri
    /* JADX INFO: renamed from: ri */
    public void mo12855ri(View view, boolean z) {
    }

    /* JADX INFO: renamed from: ri */
    public void mo12856ri(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: ri */
    public void m12857ri(InterfaceC2001ri interfaceC2001ri) {
        if (interfaceC2001ri instanceof InterfaceC3125ri) {
            this.f10070zf = (InterfaceC3125ri) interfaceC2001ri;
            bgr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12858ri(PAGNativeAd pAGNativeAd) {
        C3221ri c3221ri = this.f10060oh;
        if (c3221ri != null) {
            c3221ri.m13530ri(pAGNativeAd);
        }
        C3221ri c3221ri2 = this.f10069xd;
        if (c3221ri2 != null) {
            c3221ri2.m13530ri(pAGNativeAd);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12859ri(C3120di.ri riVar) {
        this.f10061pv = riVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x021b  */
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method */
    public void mo12958ri(wjv wjvVar, WeakReference<Context> weakReference, boolean z) {
        final wjv wjvVar2;
        String strM14535tq;
        wjv wjvVar3;
        wjv wjvVar4;
        if (wjvVar == null) {
            return;
        }
        mo12861ri(false, this.ihz);
        m12854ri(this.f10055ik, C3299nr.m14642ri());
        View view = this.f10063qt;
        if (view != null) {
            C3583qd.m16612ri(view, 0);
        }
        ImageView imageView = this.f10065sf;
        if (imageView != null) {
            C3583qd.m16612ri((View) imageView, 0);
        }
        C3583qd.m16612ri(this.f10049co, 0);
        if (this.f10065sf == null || (wjvVar4 = this.f10053fr) == null || wjvVar4.m14389eu() == null || this.f10053fr.m14389eu().m6357qt() == null) {
            wjvVar2 = wjvVar;
        } else {
            wjvVar2 = wjvVar;
            C2751lr.m10463lr().m10472ri(this.f10053fr.m14389eu().m6357qt(), this.f10053fr.m14389eu().m6345ik(), this.f10053fr.m14389eu().m6351lr(), this.f10065sf, wjvVar2);
        }
        if (!TextUtils.isEmpty(wjvVar2.tpb())) {
            strM14535tq = wjvVar2.tpb();
        } else if (TextUtils.isEmpty(wjvVar2.m14559xh())) {
            strM14535tq = !TextUtils.isEmpty(wjvVar2.m14535tq()) ? wjvVar2.m14535tq() : "";
        } else {
            strM14535tq = wjvVar2.m14559xh();
        }
        if (this.f10046aw != null && (wjvVar3 = this.f10053fr) != null && wjvVar3.m14391fb() != null && this.f10053fr.m14391fb().m14220ri() != null) {
            C3583qd.m16612ri((View) this.f10046aw, 0);
            C3583qd.m16612ri((View) this.bgr, 4);
            wjv wjvVar5 = this.f10053fr;
            if (wjvVar5 == null || !wjvVar5.m14576zz()) {
                C2751lr.m10463lr().m10470ri(this.f10053fr.m14391fb(), this.f10046aw, wjvVar2);
            } else {
                C3491ka.m15833ri(this.f10053fr.m14391fb()).mo9652ik(1).mo9658ri(new C3492lr(wjvVar2, this.f10053fr.m14391fb().m14220ri(), new com.bytedance.sdk.component.p145fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.5
                    @Override // com.bytedance.sdk.component.p145fi.slm
                    /* JADX INFO: renamed from: ri */
                    public void mo8254ri(int i, String str, Throwable th) {
                        C3121fi.this.m12825ri(i, str, wjvVar2);
                    }

                    @Override // com.bytedance.sdk.component.p145fi.slm
                    /* JADX INFO: renamed from: ri */
                    public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                        Object objMo9673lr = interfaceC2630sf.mo9673lr();
                        if (objMo9673lr != null) {
                            if (objMo9673lr instanceof Bitmap) {
                                if (C3121fi.this.f10046aw != null) {
                                    C3121fi.this.f10046aw.setImageBitmap((Bitmap) objMo9673lr);
                                }
                            } else if ((objMo9673lr instanceof Drawable) && C3121fi.this.f10046aw != null) {
                                if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(objMo9673lr)) {
                                    cc$$ExternalSyntheticApiModelOutline0.m17094m(objMo9673lr).start();
                                }
                                C3121fi.this.f10046aw.setImageDrawable((Drawable) objMo9673lr);
                            }
                            C3414ik.m15522lr(C3121fi.this.f10053fr, C3121fi.this.f10053fr != null ? C3571ig.m16444ik(wjvVar2.lji()) : null, "load_vast_icon_success", (JSONObject) null);
                        }
                    }
                }));
                if (this.f10053fr.m14525sr() != null && this.f10053fr.m14525sr().m12541lr() != null) {
                    this.f10053fr.m14525sr().m12541lr().m12425lr(0L);
                }
            }
            wjv wjvVar6 = this.f10053fr;
            if (wjvVar6 != null && wjvVar6.m14576zz()) {
                try {
                    this.f10046aw.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            wjv wjvVar7 = this.f10053fr;
            if (wjvVar7 != null && wjvVar7.m14525sr() != null && this.f10053fr.m14525sr().m12541lr() != null) {
                final C3098lr c3098lrM12541lr = this.f10053fr.m14525sr().m12541lr();
                C3346ri c3346ri = this.f10046aw;
                if (c3346ri != null) {
                    c3346ri.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.6
                        @Override // java.lang.Runnable
                        public void run() {
                            C3098lr c3098lr;
                            if (C3121fi.this.f10046aw == null || !C3121fi.this.f10046aw.isShown() || (c3098lr = c3098lrM12541lr) == null) {
                                return;
                            }
                            c3098lr.m12425lr(C3121fi.this.getVideoProgress());
                        }
                    });
                }
            }
            if (m12823fr()) {
                this.f10046aw.setOnClickListener(this.f10069xd);
                this.f10046aw.setOnTouchListener(this.f10069xd);
            } else {
                this.f10046aw.setOnClickListener(this.f10060oh);
                this.f10046aw.setOnTouchListener(this.f10060oh);
            }
        } else if (!TextUtils.isEmpty(strM14535tq)) {
            C3583qd.m16612ri((View) this.f10046aw, 4);
            C3583qd.m16612ri((View) this.bgr, 0);
            TextView textView = this.bgr;
            if (textView != null) {
                textView.setText(strM14535tq.substring(0, 1));
                if (m12823fr()) {
                    this.bgr.setOnClickListener(this.f10069xd);
                    this.bgr.setOnTouchListener(this.f10069xd);
                } else {
                    this.bgr.setOnClickListener(this.f10060oh);
                    this.bgr.setOnTouchListener(this.f10060oh);
                }
            }
        }
        if (this.f10068vr != null && !TextUtils.isEmpty(strM14535tq)) {
            this.f10068vr.setText(strM14535tq);
            this.f10068vr.setTag(570425345, "VAST_TITLE");
        }
        C3583qd.m16612ri((View) this.f10068vr, 0);
        C3583qd.m16612ri((View) this.slm, 0);
        String strSkk = wjvVar2.skk();
        if (TextUtils.isEmpty(strSkk)) {
            int iAdz = wjvVar2.adz();
            if (iAdz == 2 || iAdz == 3) {
                strSkk = C2729uq.m10311ri(this.f10066su, "tt_video_mobile_go_detail");
            } else if (iAdz == 4) {
                strSkk = C2729uq.m10311ri(this.f10066su, "tt_video_download_apk");
            } else if (iAdz == 5) {
                strSkk = C2729uq.m10311ri(this.f10066su, "tt_video_dial_phone");
            } else if (iAdz != 8) {
                strSkk = C2729uq.m10311ri(this.f10066su, "tt_video_mobile_go_detail");
            } else {
                strSkk = C2729uq.m10311ri(this.f10066su, "tt_video_mobile_go_detail");
            }
        }
        TextView textView2 = this.slm;
        if (textView2 != null) {
            textView2.setText(strSkk);
            this.slm.setOnClickListener(this.f10060oh);
            this.slm.setOnTouchListener(this.f10060oh);
        }
        if (this.dzy) {
            return;
        }
        m12821di(4);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr
    /* JADX INFO: renamed from: ri */
    public /* bridge */ /* synthetic */ void mo6405ri(wjv wjvVar, WeakReference weakReference, boolean z) {
        mo12958ri(wjvVar, (WeakReference<Context>) weakReference, z);
    }

    /* JADX INFO: renamed from: ri */
    public void mo12860ri(String str) {
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr
    /* JADX INFO: renamed from: ri */
    public void mo6406ri(boolean z) {
        this.dzy = z;
    }

    /* JADX INFO: renamed from: ri */
    public void mo12861ri(boolean z, boolean z2) {
        C3583qd.m16612ri((View) this.f10052fi, 8);
    }

    /* JADX INFO: renamed from: ri */
    public void mo12862ri(boolean z, boolean z2, boolean z3) {
        C3583qd.m16612ri((View) this.f10052fi, (!z || this.f10050di.getVisibility() == 0) ? 8 : 0);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m12863ri(int i, C1997lr c1997lr, boolean z) {
        C3333ac c3333ac = this.igq;
        return c3333ac == null || c3333ac.m14996ri(i, c1997lr, z);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.InterfaceC1992ri
    /* JADX INFO: renamed from: ri */
    public boolean mo6287ri(SurfaceTexture surfaceTexture) {
        this.f10067uq = false;
        if (!slm()) {
            return true;
        }
        this.f10070zf.mo6411lr(this, surfaceTexture);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.C3333ac.lr
    /* JADX INFO: renamed from: sf */
    public void mo12864sf() {
        mo12861ri(true, false);
    }

    boolean slm() {
        return this.f10070zf != null;
    }

    void tan() {
        try {
            C3583qd.m16612ri(this.f10063qt, 8);
            C3583qd.m16612ri((View) this.f10065sf, 8);
            C3583qd.m16612ri(this.f10049co, 8);
            C3583qd.m16612ri((View) this.f10046aw, 8);
            C3583qd.m16612ri((View) this.bgr, 8);
            C3583qd.m16612ri((View) this.f10068vr, 8);
            C3583qd.m16612ri((View) this.slm, 8);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: uq */
    public boolean m12865uq() {
        return this.f10067uq;
    }

    /* JADX INFO: renamed from: vr */
    public void m12866vr() {
        C3333ac c3333ac = this.igq;
        if (c3333ac != null) {
            c3333ac.m14994ri(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.tan.InterfaceC3355ri
    public boolean wjv() {
        C3333ac c3333ac = this.igq;
        return c3333ac != null && c3333ac.m14995ri();
    }

    public void xha() {
        wjv wjvVar;
        C3583qd.m16577di(this.f10050di);
        C3583qd.m16577di(this.xha);
        if (this.f10058mj != null && (wjvVar = this.f10053fr) != null && wjvVar.m14389eu() != null && this.f10053fr.m14389eu().m6357qt() != null) {
            C3583qd.m16577di(this.f10058mj);
            C2751lr.m10463lr().m10472ri(this.f10053fr.m14389eu().m6357qt(), this.f10053fr.m14389eu().m6345ik(), this.f10053fr.m14389eu().m6351lr(), this.f10058mj, this.f10053fr);
        }
        if (this.f10052fi.getVisibility() == 0) {
            C3583qd.m16612ri((View) this.f10052fi, 8);
        }
    }
}
