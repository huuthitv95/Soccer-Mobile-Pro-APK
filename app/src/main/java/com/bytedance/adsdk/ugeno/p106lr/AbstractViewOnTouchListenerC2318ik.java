package com.bytedance.adsdk.ugeno.p106lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.C2260fi;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.InterfaceC2324ri;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.C2242qt;
import com.bytedance.adsdk.ugeno.core.C2243ri;
import com.bytedance.adsdk.ugeno.core.C2246sf;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.InterfaceC2229di;
import com.bytedance.adsdk.ugeno.core.InterfaceC2230fi;
import com.bytedance.adsdk.ugeno.core.InterfaceC2240mj;
import com.bytedance.adsdk.ugeno.core.InterfaceC2241nr;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.core.bgr;
import com.bytedance.adsdk.ugeno.core.p088lr.C2234di;
import com.bytedance.adsdk.ugeno.core.p088lr.C2235fi;
import com.bytedance.adsdk.ugeno.core.p088lr.C2236ik;
import com.bytedance.adsdk.ugeno.core.p088lr.C2238lr;
import com.bytedance.adsdk.ugeno.core.p088lr.InterfaceC2237ka;
import com.bytedance.adsdk.ugeno.core.p089ri.AbstractC2244lr;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.core.xha;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2283aw;
import com.bytedance.adsdk.ugeno.p101ka.jbs;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.C2315ri;
import com.bytedance.adsdk.ugeno.p108ri.C2325di;
import com.bytedance.adsdk.ugeno.p108ri.C2327ik;
import com.bytedance.adsdk.ugeno.p108ri.C2328ka;
import com.bytedance.adsdk.ugeno.p108ri.C2335ri;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2345ka;
import com.bytedance.adsdk.ugeno.xha.C2346lr;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.C11744X3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnTouchListenerC2318ik<T extends View> implements View.OnTouchListener, InterfaceC2247vr.lr, InterfaceC2247vr.ri, InterfaceC2282ka {
    protected boolean aac;

    /* JADX INFO: renamed from: ac */
    protected float f5863ac;
    private boolean adz;
    protected float ajz;
    private boolean akr;
    private C2242qt amj;

    /* JADX INFO: renamed from: aw */
    protected float f5864aw;

    /* JADX INFO: renamed from: ay */
    protected boolean f5865ay;
    private String bfa;
    protected float bgr;
    protected float bnj;

    /* JADX INFO: renamed from: bu */
    protected float f5866bu;

    @Deprecated
    private C2238lr bzf;
    private float cem;
    protected Map<Integer, C2226aw> che;

    /* JADX INFO: renamed from: co */
    protected String f5867co;

    /* JADX INFO: renamed from: de */
    private boolean f5868de;

    /* JADX INFO: renamed from: di */
    protected C2320ri<ViewGroup> f5869di;

    /* JADX INFO: renamed from: dw */
    protected float f5870dw;
    protected boolean dzy;

    /* JADX INFO: renamed from: eb */
    protected InterfaceC2240mj f5871eb;

    @Deprecated
    private InterfaceC2237ka.ri eqw;

    /* JADX INFO: renamed from: eu */
    private boolean f5872eu;
    private String evm;
    private GradientDrawable ezp;

    /* JADX INFO: renamed from: fb */
    @Deprecated
    private C2234di f5873fb;

    /* JADX INFO: renamed from: fe */
    protected float f5874fe;
    protected boolean feb;

    /* JADX INFO: renamed from: fi */
    protected T f5875fi;

    /* JADX INFO: renamed from: fn */
    private boolean f5876fn;

    /* JADX INFO: renamed from: fr */
    protected boolean f5877fr;
    protected int gcp;
    protected boolean hcw;

    /* JADX INFO: renamed from: hd */
    protected boolean f5878hd;
    protected float hpn;
    protected float hws;

    /* JADX INFO: renamed from: ib */
    private boolean f5879ib;

    /* JADX INFO: renamed from: id */
    protected float f5880id;

    /* JADX INFO: renamed from: ig */
    protected int f5881ig;
    protected float igq;
    protected float ihz;

    /* JADX INFO: renamed from: ik */
    protected JSONObject f5882ik;
    protected slm iph;
    protected C2246sf jbs;

    /* JADX INFO: renamed from: jc */
    protected float f5883jc;

    /* JADX INFO: renamed from: jg */
    private boolean f5884jg;

    /* JADX INFO: renamed from: jm */
    private boolean f5885jm;
    protected float jxw;

    /* JADX INFO: renamed from: ka */
    protected JSONObject f5886ka;
    private boolean klz;

    /* JADX INFO: renamed from: kt */
    protected boolean f5887kt;
    private boolean lau;

    /* JADX INFO: renamed from: lr */
    protected Context f5888lr;
    protected float luy;

    /* JADX INFO: renamed from: mj */
    protected xha.C2248ri f5889mj;
    private long mvf;
    protected jbs nbc;

    /* JADX INFO: renamed from: nd */
    protected int f5890nd;

    /* JADX INFO: renamed from: nh */
    protected float f5891nh;

    /* JADX INFO: renamed from: nr */
    protected float f5892nr;

    /* JADX INFO: renamed from: oh */
    protected boolean f5893oh;
    protected float ory;

    /* JADX INFO: renamed from: pc */
    protected float f5894pc;

    /* JADX INFO: renamed from: pu */
    protected InterfaceC2229di f5895pu;

    /* JADX INFO: renamed from: pv */
    protected boolean f5896pv;

    /* JADX INFO: renamed from: qd */
    protected String f5897qd;

    /* JADX INFO: renamed from: qh */
    protected float f5898qh;
    protected float qmx;

    /* JADX INFO: renamed from: qt */
    protected boolean f5899qt;

    @Deprecated
    private C2235fi rbz;

    /* JADX INFO: renamed from: ri */
    private boolean f5900ri;
    protected boolean rzk;
    protected C2325di saa;
    protected C2348ri.ri sez;

    /* JADX INFO: renamed from: sf */
    protected String f5901sf;
    protected boolean siy;
    private boolean skk;
    protected float slm;

    @Deprecated
    private C2236ik smj;
    protected ImageView.ScaleType srn;

    /* JADX INFO: renamed from: su */
    protected float f5902su;

    /* JADX INFO: renamed from: sz */
    private C2243ri f5903sz;

    /* JADX INFO: renamed from: ta */
    protected float f5904ta;
    protected float tan;

    /* JADX INFO: renamed from: tn */
    private boolean f5905tn;
    protected float tnn;
    private boolean tpb;

    /* JADX INFO: renamed from: tq */
    private InterfaceC2241nr f5906tq;

    /* JADX INFO: renamed from: tw */
    protected String f5907tw;
    private boolean tyc;
    private JSONObject tyz;

    /* JADX INFO: renamed from: ud */
    protected float f5908ud;

    /* JADX INFO: renamed from: uq */
    protected boolean f5909uq;

    /* JADX INFO: renamed from: vr */
    protected float f5910vr;

    /* JADX INFO: renamed from: vt */
    protected InterfaceC2247vr f5911vt;

    /* JADX INFO: renamed from: vz */
    private C2315ri f5912vz;
    protected boolean whw;
    protected boolean wjv;

    /* JADX INFO: renamed from: xd */
    protected boolean f5913xd;

    /* JADX INFO: renamed from: xe */
    protected ViewGroup.LayoutParams f5914xe;

    /* JADX INFO: renamed from: xh */
    private boolean f5915xh;
    protected C2320ri<ViewGroup> xha;
    private boolean xlq;

    /* JADX INFO: renamed from: xm */
    protected boolean f5916xm;
    private boolean yjg;
    protected C2335ri yjm;

    /* JADX INFO: renamed from: zb */
    protected float f5917zb;

    /* JADX INFO: renamed from: zf */
    protected float f5918zf;

    /* JADX INFO: renamed from: zk */
    protected float f5919zk;

    /* JADX INFO: renamed from: zv */
    private boolean f5920zv;
    private boolean zxp;
    protected float zyn;

    public AbstractViewOnTouchListenerC2318ik(Context context) {
        this(context, null);
    }

    public AbstractViewOnTouchListenerC2318ik(Context context, C2320ri<ViewGroup> c2320ri) {
        this.f5864aw = -2.0f;
        this.bgr = -2.0f;
        this.f5907tw = "solid";
        this.f5890nd = 0;
        this.aac = true;
        this.f5894pc = 0.0f;
        this.ajz = 0.0f;
        this.f5919zk = 0.0f;
        this.luy = 1.0f;
        this.f5908ud = 1.0f;
        this.hpn = 1.0f;
        this.qmx = 0.0f;
        this.f5880id = 0.0f;
        this.hws = 0.0f;
        this.jxw = 0.0f;
        this.f5891nh = 1.0f;
        this.f5885jm = true;
        this.klz = true;
        this.lau = false;
        this.yjg = false;
        this.f5879ib = false;
        this.cem = 12.0f;
        this.f5888lr = context;
        this.f5869di = c2320ri;
        this.che = new HashMap();
        this.ezp = new GradientDrawable();
        this.f5875fi = (T) mo7552ri();
    }

    /* JADX INFO: renamed from: aw */
    private ImageView.ScaleType m7823aw(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.srn = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.srn = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.srn = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.srn = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.srn;
    }

    private boolean bgr(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    /* JADX INFO: renamed from: ik */
    private void m7824ik() {
        if (this.f5900ri) {
            this.f5875fi.setTranslationX(this.ajz);
        }
        if (this.akr) {
            this.f5875fi.setTranslationY(this.f5919zk);
        }
        if (this.f5868de) {
            this.f5875fi.setScaleX(this.f5908ud);
        }
        if (this.f5920zv) {
            this.f5875fi.setScaleY(this.hpn);
        }
        if (this.xlq) {
            this.f5875fi.setRotation(this.qmx);
        }
        if (this.zxp) {
            this.f5875fi.setRotationX(this.f5880id);
        }
        if (this.f5872eu) {
            this.f5875fi.setRotationY(-this.hws);
        }
        if (this.tpb) {
            this.f5875fi.setAlpha(this.f5891nh);
        }
        float f = this.jxw;
        if (f != 0.0f) {
            this.f5875fi.setRotation(f);
        }
        if (this.xlq || this.zxp || this.f5872eu) {
            this.f5875fi.setCameraDistance(10000.0f);
        }
    }

    private void jbs() {
        C2226aw c2226aw;
        if (this.f5911vt == null || !m7853lr(18) || (c2226aw = this.che.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectM7320ik = c2226aw.m7320ik();
        if (jSONObjectM7320ik != null) {
            try {
                jSONObjectM7320ik.put("rotateZ", C2268lr.m7663ri(jSONObjectM7320ik.optString("rotateZ"), this.f5886ka));
            } catch (JSONException unused) {
            }
        }
        this.f5911vt.mo7436ri(c2226aw, this, this);
    }

    @Deprecated
    /* JADX INFO: renamed from: ka */
    private void m7826ka() {
        InterfaceC2237ka interfaceC2237kaM7540ka;
        this.f5875fi.setVisibility(this.f5890nd);
        float f = this.jxw;
        if (f != 0.0f) {
            this.f5875fi.setRotation(f);
        }
        xha.C2248ri c2248ri = this.f5889mj;
        if (c2248ri != null && TextUtils.isEmpty(c2248ri.m7463lr())) {
            this.f5875fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.lr.ik.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (AbstractViewOnTouchListenerC2318ik.this.f5871eb != null) {
                        boolean unused = AbstractViewOnTouchListenerC2318ik.this.klz;
                    }
                }
            });
        } else if (m7853lr(1) && !this.f5876fn) {
            this.f5875fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.lr.ik.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    if (AbstractViewOnTouchListenerC2318ik.this.f5911vt == null || !AbstractViewOnTouchListenerC2318ik.this.klz) {
                        return;
                    }
                    InterfaceC2247vr interfaceC2247vr = AbstractViewOnTouchListenerC2318ik.this.f5911vt;
                    C2226aw c2226aw = AbstractViewOnTouchListenerC2318ik.this.che.get(1);
                    AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = AbstractViewOnTouchListenerC2318ik.this;
                    interfaceC2247vr.mo7436ri(c2226aw, abstractViewOnTouchListenerC2318ik, abstractViewOnTouchListenerC2318ik);
                }
            });
        }
        if (this.f5911vt != null && m7853lr(4)) {
            if (m7853lr(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + m7885xd());
                this.f5915xh = true;
                this.rbz = new C2235fi(this.f5888lr, this.che.get(4), this.che.get(1), this.f5915xh, whw());
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + m7885xd());
                this.rbz = new C2235fi(this.f5888lr, this.che.get(4), this.f5915xh, whw());
            }
        }
        if (this.f5911vt != null && m7853lr(1) && this.f5876fn) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.f5876fn + ", view.id: " + m7885xd());
            this.smj = new C2236ik(this.f5888lr, this.che.get(1));
        }
        jbs();
        if (this.f5911vt != null && m7853lr(3) && (interfaceC2237kaM7540ka = C2260fi.m7537ri().m7540ka()) != null) {
            this.eqw = interfaceC2237kaM7540ka.m7374ri(this.f5888lr, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.lr.ik.3
            };
        }
        if (this.f5911vt != null && m7853lr(9)) {
            C2234di c2234di = new C2234di(this.f5888lr, this.che.get(9), this);
            this.f5873fb = c2234di;
            c2234di.m7365ri(this.f5911vt);
        }
        if (m7853lr(10)) {
            C2238lr c2238lr = new C2238lr(this.f5888lr, this.che.get(10), this);
            this.bzf = c2238lr;
            c2238lr.m7376ri(this.f5911vt);
        }
    }

    /* JADX INFO: renamed from: qt */
    private void m7827qt() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5901sf);
        this.f5875fi.setContentDescription(sb);
    }

    private void rzk() {
        float f = this.siy ? this.tnn : this.zyn;
        float f2 = this.whw ? this.f5904ta : this.zyn;
        float f3 = this.f5916xm ? this.f5874fe : this.zyn;
        float f4 = this.rzk ? this.bnj : this.zyn;
        this.ezp.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    /* JADX INFO: renamed from: xm */
    private void m7828xm() {
        if (TextUtils.equals("dashed", this.f5907tw)) {
            GradientDrawable gradientDrawable = this.ezp;
            float f = this.f5898qh;
            gradientDrawable.setStroke((int) f, this.gcp, 3.0f * f, f);
        } else {
            if (!TextUtils.equals("dotted", this.f5907tw)) {
                this.ezp.setStroke((int) this.f5898qh, this.gcp);
                return;
            }
            GradientDrawable gradientDrawable2 = this.ezp;
            float f2 = this.f5898qh;
            gradientDrawable2.setStroke((int) f2, this.gcp, f2 / 2.0f, f2);
        }
    }

    /* JADX INFO: renamed from: ac */
    public float m7829ac() {
        return this.hws;
    }

    /* JADX INFO: renamed from: aw */
    public void m7830aw() {
        this.f5879ib = this.f5886ka.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.f5879ib);
    }

    /* JADX INFO: renamed from: ay */
    public InterfaceC2247vr m7831ay() {
        return this.f5911vt;
    }

    protected void bgr() {
        this.f5875fi.setPadding((int) (this.f5893oh ? this.igq : this.f5902su), (int) (this.dzy ? this.f5870dw : this.f5902su), (int) (this.f5913xd ? this.f5918zf : this.f5902su), (int) (this.f5896pv ? this.ory : this.f5902su));
    }

    public float bnj() {
        T t = this.f5875fi;
        if (t instanceof com.bytedance.adsdk.ugeno.p108ri.xha) {
            return ((com.bytedance.adsdk.ugeno.p108ri.xha) t).getRubIn();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: bu */
    public float m7832bu() {
        return this.f5908ud;
    }

    /* JADX INFO: renamed from: co */
    public C2335ri m7833co(String str) {
        C2335ri c2335ri = this.yjm;
        if (c2335ri != null && TextUtils.equals(str, c2335ri.m8004fi())) {
            return this.yjm;
        }
        C2325di c2325di = this.saa;
        if (c2325di != null) {
            return c2325di.m7954ri(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: co */
    public JSONObject m7834co() {
        return this.f5886ka;
    }

    /* JADX INFO: renamed from: di */
    public AbstractViewOnTouchListenerC2318ik<T> m7835di(String str) {
        return mo7850lr(str);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: di */
    public void mo7733di() {
        if (this.f5906tq == null || this.f5905tn) {
            return;
        }
        this.f5905tn = true;
    }

    /* JADX INFO: renamed from: di */
    public void m7836di(int i) {
        if (!hcw()) {
            ViewGroup.LayoutParams layoutParams = this.f5875fi.getLayoutParams();
            layoutParams.height = i;
            this.f5875fi.setLayoutParams(layoutParams);
            return;
        }
        T t = this.f5875fi;
        if (t instanceof InterfaceC2319lr) {
            ((InterfaceC2319lr) t).mo7888lr(i);
            return;
        }
        ViewParent viewParent = (ViewGroup) t.getParent();
        if (viewParent instanceof InterfaceC2319lr) {
            ((InterfaceC2319lr) viewParent).mo7889lr(this.f5875fi, i);
        }
    }

    /* JADX INFO: renamed from: dw */
    public ViewGroup.LayoutParams m7837dw() {
        return this.f5914xe;
    }

    public String dzy() {
        return this.f5867co;
    }

    /* JADX INFO: renamed from: fe */
    public float m7838fe() {
        T t = this.f5875fi;
        if (t instanceof com.bytedance.adsdk.ugeno.p108ri.xha) {
            return ((com.bytedance.adsdk.ugeno.p108ri.xha) t).getShine();
        }
        return 0.0f;
    }

    protected void feb() {
    }

    /* JADX INFO: renamed from: fi */
    public AbstractViewOnTouchListenerC2318ik<T> m7839fi(String str) {
        return mo7860ri(str);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: fi */
    public void mo7734fi() {
        if (this.f5906tq == null || this.skk) {
            return;
        }
        this.skk = true;
    }

    /* JADX INFO: renamed from: fi */
    public void m7840fi(int i) {
        if (!hcw()) {
            ViewGroup.LayoutParams layoutParams = this.f5875fi.getLayoutParams();
            layoutParams.width = i;
            this.f5875fi.setLayoutParams(layoutParams);
            return;
        }
        T t = this.f5875fi;
        if (t instanceof InterfaceC2319lr) {
            ((InterfaceC2319lr) t).mo7890ri(i);
            return;
        }
        ViewParent viewParent = (ViewGroup) t.getParent();
        if (viewParent instanceof InterfaceC2319lr) {
            ((InterfaceC2319lr) viewParent).mo7891ri(this.f5875fi, i);
        }
    }

    /* JADX INFO: renamed from: fr */
    public long m7841fr() {
        return this.mvf;
    }

    public boolean hcw() {
        return this.f5899qt;
    }

    /* JADX INFO: renamed from: ig */
    public int m7842ig() {
        return (int) this.bgr;
    }

    protected void igq() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapM8045ri;
        if (TextUtils.isEmpty(this.f5897qd)) {
            if (this.f5878hd) {
                m7875ri(this.sez);
                return;
            } else {
                this.ezp.setColor(this.f5881ig);
                m7848ka(this.f5881ig);
                return;
            }
        }
        if (!this.f5897qd.startsWith("local://")) {
            mo7886zf();
            return;
        }
        String strReplace = this.f5897qd.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.f5887kt ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f5888lr.getResources().openRawResource(C2345ka.m8033lr(this.f5888lr, strReplace)), null, options);
            if (!this.f5887kt || (bitmapM8045ri = C2347mj.m8045ri(this.f5888lr, bitmapDecodeStream, (int) this.f5883jc)) == null) {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.f5888lr.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
            } else {
                bitmapDrawable = new BitmapDrawable(this.f5888lr.getResources(), bitmapM8045ri);
            }
            mo7862ri(bitmapDrawable);
        } catch (Throwable unused) {
        }
    }

    public float ihz() {
        return this.jxw;
    }

    /* JADX INFO: renamed from: ik */
    protected AbstractViewOnTouchListenerC2318ik<T> mo7843ik(String str) {
        if (!TextUtils.isEmpty(this.f5867co) && TextUtils.equals(this.f5867co, str) && this.f5890nd == 0) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ik */
    public void m7844ik(int i) {
        ViewParent viewParent = (ViewGroup) this.f5875fi.getParent();
        if (viewParent instanceof InterfaceC2319lr) {
            ((InterfaceC2319lr) viewParent).mo7887ik(this.f5875fi, i);
        } else {
            this.f5875fi.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m7845ik(JSONObject jSONObject) {
        this.f5882ik = jSONObject;
    }

    public void jbs(String str) {
        this.f5901sf = str;
    }

    /* JADX INFO: renamed from: jc */
    public C2315ri m7846jc() {
        return this.f5912vz;
    }

    /* JADX INFO: renamed from: ka */
    protected AbstractViewOnTouchListenerC2318ik<T> mo7847ka(String str) {
        if (m7833co(str) != null) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ka */
    protected void m7848ka(int i) {
        this.ezp.setShape(0);
        this.ezp.setColor(i);
        rzk();
        m7828xm();
        this.f5875fi.setBackground(this.ezp);
    }

    /* JADX INFO: renamed from: kt */
    protected void mo7732kt() {
    }

    /* JADX INFO: renamed from: lr */
    public AbstractViewOnTouchListenerC2318ik m7849lr(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        return (abstractViewOnTouchListenerC2318ik.m7856oh() == null && (abstractViewOnTouchListenerC2318ik instanceof C2320ri)) ? abstractViewOnTouchListenerC2318ik : m7849lr(abstractViewOnTouchListenerC2318ik.m7856oh());
    }

    /* JADX INFO: renamed from: lr */
    protected AbstractViewOnTouchListenerC2318ik<T> mo7850lr(String str) {
        if (TextUtils.isEmpty(this.f5867co) || !TextUtils.equals(this.f5867co, str)) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        igq();
        bgr();
        m7844ik(this.f5890nd);
        m7824ik();
        m7826ka();
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            jbsVar.m7768ri();
            this.nbc.m7766lr();
            this.nbc.m7763ik();
        }
        this.f5875fi.setOnTouchListener(this);
        m7827qt();
        ViewGroup viewGroup = (ViewGroup) this.f5875fi.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.f5885jm);
        }
        C2335ri c2335ri = this.yjm;
        if (c2335ri != null) {
            c2335ri.m8006ka();
        }
        C2325di c2325di = this.saa;
        if (c2325di != null) {
            c2325di.m7955ri();
        }
        jbs jbsVar2 = this.nbc;
        if (jbsVar2 != null) {
            jbsVar2.m7764ka();
        }
        if (this.f5911vt == null || !m7853lr(22)) {
            return;
        }
        this.f5911vt.mo7436ri(this.che.get(22), this, this);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: lr */
    public void mo7735lr(int i, int i2, int i3, int i4) {
        C2242qt c2242qt = this.amj;
        if (c2242qt != null) {
            c2242qt.m7391ri(i, i2);
        }
        C2335ri c2335ri = this.yjm;
        if (c2335ri != null) {
            c2335ri.m8010ri(i, i2);
        }
        C2325di c2325di = this.saa;
        if (c2325di != null) {
            c2325di.m7956ri(i, i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: lr */
    public void mo7736lr(Canvas canvas) {
        if (this instanceof C2320ri) {
            C2335ri c2335ri = this.yjm;
            if (c2335ri != null) {
                c2335ri.m8008lr(canvas);
            }
            C2325di c2325di = this.saa;
            if (c2325di != null) {
                c2325di.m7953lr(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    protected void m7851lr(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.che == null) {
            return;
        }
        try {
            int iM7331ri = bgr.m7330ri(str).m7331ri();
            C2226aw c2226aw = new C2226aw();
            c2226aw.m7325ri(iM7331ri);
            c2226aw.m7327ri(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iM7331ri == 3) {
                try {
                    this.cem = Float.parseFloat(C2268lr.m7663ri(jSONObject.optString("shakeAmplitude"), this.f5886ka));
                } catch (NumberFormatException unused) {
                    this.cem = 12.0f;
                }
            }
            if (this.f5911vt instanceof AbstractC2244lr) {
                throw null;
            }
            m7861ri(iM7331ri, jSONObject, c2226aw);
        } catch (JSONException unused2) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m7852lr(JSONObject jSONObject) {
        this.f5886ka = jSONObject;
        m7830aw();
    }

    /* JADX INFO: renamed from: lr */
    public boolean m7853lr(int i) {
        Map<Integer, C2226aw> map = this.che;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: mj */
    public AbstractViewOnTouchListenerC2318ik<T> m7854mj(String str) {
        return mo7847ka(str);
    }

    /* JADX INFO: renamed from: mj */
    public void mo7698mj() {
        C2242qt c2242qt = this.amj;
        if (c2242qt != null) {
            c2242qt.m7389lr();
        }
        C2335ri c2335ri = this.yjm;
        if (c2335ri != null) {
            c2335ri.m8005ik();
        }
        C2325di c2325di = this.saa;
        if (c2325di != null) {
            c2325di.m7951ik();
        }
    }

    /* JADX INFO: renamed from: nr */
    public float m7855nr() {
        return this.hpn;
    }

    /* JADX INFO: renamed from: oh */
    public C2320ri m7856oh() {
        return this.f5869di;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C2235fi c2235fi;
        InterfaceC2247vr interfaceC2247vr;
        C2236ik c2236ik;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            mo7732kt();
        } else if (action == 1 || action == 3) {
            feb();
        }
        slm slmVar = this.iph;
        if (slmVar != null) {
            slmVar.mo7435ri(this, motionEvent);
        }
        if (m7853lr(17) && motionEvent.getAction() == 0) {
            this.f5911vt.mo7436ri(this.che.get(17), this, this);
        }
        if (m7853lr(1) && this.f5876fn && (interfaceC2247vr = this.f5911vt) != null && (c2236ik = this.smj) != null) {
            return c2236ik.m7373ri(interfaceC2247vr, this, motionEvent);
        }
        InterfaceC2247vr interfaceC2247vr2 = this.f5911vt;
        if (interfaceC2247vr2 != null && (c2235fi = this.rbz) != null) {
            return c2235fi.m7372ri(interfaceC2247vr2, this, motionEvent, whw());
        }
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            return jbsVar.m7773ri(motionEvent);
        }
        return false;
    }

    public xha.C2248ri ory() {
        return this.f5889mj;
    }

    /* JADX INFO: renamed from: pv */
    public int m7857pv() {
        return (int) this.f5864aw;
    }

    /* JADX INFO: renamed from: qd */
    public boolean m7858qd() {
        return this.aac;
    }

    /* JADX INFO: renamed from: qt */
    public void m7859qt(String str) {
        this.f5867co = str;
    }

    /* JADX INFO: renamed from: ri */
    public T mo7552ri() {
        return null;
    }

    /* JADX INFO: renamed from: ri */
    protected AbstractViewOnTouchListenerC2318ik<T> mo7860ri(String str) {
        if (TextUtils.isEmpty(this.f5901sf) || !TextUtils.equals(this.f5901sf, str)) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: ri */
    public void mo7737ri(int i, int i2, int i3, int i4) {
        if (this.f5906tq == null || this.tyc) {
            return;
        }
        this.tyc = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ri */
    protected void m7861ri(int i, JSONObject jSONObject, C2226aw c2226aw) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            C2226aw c2226aw2 = new C2226aw();
            c2226aw2.m7328ri(jSONObjectOptJSONObject);
            c2226aw2.m7327ri(this);
            c2226aw.m7326ri(c2226aw2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C11744X3.g.f26257e);
        if (jSONObjectOptJSONObject2 != null) {
            C2226aw c2226aw3 = new C2226aw();
            c2226aw3.m7328ri(jSONObjectOptJSONObject2);
            c2226aw3.m7327ri(this);
            c2226aw.m7323lr(c2226aw3);
        }
        c2226aw.m7328ri(jSONObject);
        this.che.put(Integer.valueOf(i), c2226aw);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: ri */
    public void mo7738ri(Canvas canvas) {
        if (this instanceof C2320ri) {
            return;
        }
        C2335ri c2335ri = this.yjm;
        if (c2335ri != null) {
            c2335ri.m8011ri(canvas);
        }
        C2325di c2325di = this.saa;
        if (c2325di != null) {
            c2325di.m7957ri(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: ri */
    public void mo7739ri(Canvas canvas, IAnimation iAnimation) {
        C2242qt c2242qt = this.amj;
        if (c2242qt != null) {
            c2242qt.m7392ri(canvas, iAnimation);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void mo7862ri(Drawable drawable) {
        this.f5875fi.setBackground(drawable);
    }

    /* JADX INFO: renamed from: ri */
    public void m7863ri(ViewGroup.LayoutParams layoutParams) {
        T t = this.f5875fi;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.f5914xe = layoutParams;
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2247vr.lr
    /* JADX INFO: renamed from: ri */
    public void mo7438ri(C2226aw c2226aw) {
        C2320ri<ViewGroup> c2320ri;
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikFi;
        if (c2226aw == null || c2226aw.m7320ik() == null || !TextUtils.equals(c2226aw.m7320ik().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = c2226aw.m7320ik().optString("nodeId");
        m7844ik(8);
        this.xha = (C2320ri) m7849lr(this);
        if (TextUtils.isEmpty(strOptString) || (c2320ri = this.xha) == null || (abstractViewOnTouchListenerC2318ikFi = c2320ri.m7839fi(strOptString)) == null) {
            return;
        }
        abstractViewOnTouchListenerC2318ikFi.m7844ik(8);
    }

    /* JADX INFO: renamed from: ri */
    public void m7864ri(InterfaceC2229di interfaceC2229di) {
        this.f5895pu = interfaceC2229di;
    }

    /* JADX INFO: renamed from: ri */
    public void m7865ri(InterfaceC2230fi interfaceC2230fi) {
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            jbsVar.m7769ri(interfaceC2230fi);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7866ri(InterfaceC2240mj interfaceC2240mj) {
        this.f5871eb = interfaceC2240mj;
    }

    /* JADX INFO: renamed from: ri */
    public void m7867ri(InterfaceC2241nr interfaceC2241nr) {
        this.f5906tq = interfaceC2241nr;
    }

    /* JADX INFO: renamed from: ri */
    public void m7868ri(C2246sf c2246sf) {
        this.jbs = c2246sf;
    }

    /* JADX INFO: renamed from: ri */
    public void m7869ri(slm slmVar) {
        this.iph = slmVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m7870ri(InterfaceC2247vr interfaceC2247vr) {
        this.f5911vt = interfaceC2247vr;
    }

    /* JADX INFO: renamed from: ri */
    public void m7871ri(xha.C2248ri c2248ri) {
        this.f5889mj = c2248ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7872ri(InterfaceC2283aw interfaceC2283aw) {
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            jbsVar.m7770ri(interfaceC2283aw);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7873ri(C2315ri c2315ri) {
        this.f5912vz = c2315ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7874ri(C2320ri c2320ri) {
        this.f5869di = c2320ri;
    }

    /* JADX INFO: renamed from: ri */
    protected void m7875ri(C2348ri.ri riVar) {
        if (riVar == null) {
            return;
        }
        this.ezp.setShape(0);
        if (riVar != null) {
            this.ezp.setOrientation(riVar.f6104ri);
            if (Build.VERSION.SDK_INT >= 29) {
                this.ezp.setColors(riVar.f6103lr, riVar.f6102ik);
            } else {
                this.ezp.setColors(riVar.f6103lr);
            }
        }
        rzk();
        m7828xm();
        this.f5875fi.setBackground(this.ezp);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    b = 0;
                }
                break;
            case -1901681170:
                if (str.equals("onRenderSuccess")) {
                    b = 1;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    b = 2;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b = 3;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    b = 4;
                }
                break;
            case -1375815020:
                if (str.equals("minWidth")) {
                    b = 5;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    b = 6;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    b = 7;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    b = 8;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    b = 9;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    b = 10;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    b = Ascii.f22503VT;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    b = Ascii.f22492FF;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b = Ascii.f22490CR;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b = Ascii.f22500SO;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    b = Ascii.f22499SI;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    b = Ascii.DLE;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    b = 17;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    b = Ascii.DC2;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    b = 19;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b = Ascii.DC4;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = Ascii.NAK;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = Ascii.SYN;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    b = Ascii.ETB;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    b = Ascii.CAN;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    b = Ascii.f22491EM;
                }
                break;
            case -133587431:
                if (str.equals("minHeight")) {
                    b = Ascii.SUB;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    b = Ascii.ESC;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    b = Ascii.f22493FS;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = Ascii.f22494GS;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    b = Ascii.f22498RS;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    b = Ascii.f22502US;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    b = 32;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    b = 33;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    b = 34;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b = 35;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b = 36;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    b = 37;
                }
                break;
            case 314070383:
                if (str.equals("animations")) {
                    b = 38;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    b = 39;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b = 40;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    b = 41;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b = 42;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b = 43;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    b = 44;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b = 45;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b = 46;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    b = 47;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    b = 48;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    b = 49;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b = 50;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    b = 51;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    b = 52;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    b = 53;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    b = 54;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    b = 55;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    b = 56;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    b = 57;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b = 58;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b = 59;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b = 60;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b = Base64.padSymbol;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    b = 62;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    b = 63;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    b = SignedBytes.MAX_POWER_OF_TWO;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b = 65;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    b = 66;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    b = 67;
                }
                break;
        }
        switch (b) {
            case 0:
                this.klz = C2343ik.m8032ri(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 18:
            case 33:
            case 39:
            case 48:
            case 51:
            case 54:
            case 62:
            case 64:
                m7851lr(str, str2);
                break;
            case 2:
                this.f5900ri = true;
                this.ajz = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 3:
                this.akr = true;
                this.f5919zk = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 4:
                this.igq = C2347mj.m8044ri(this.f5888lr, str2);
                this.f5893oh = true;
                break;
            case 5:
                this.f5863ac = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 11:
            case 55:
                if (!C2348ri.m8049ik(str2)) {
                    this.f5881ig = C2348ri.m8055ri(str2, 0);
                    this.f5878hd = false;
                } else {
                    this.f5878hd = true;
                    this.sez = C2348ri.m8051lr(str2);
                }
                break;
            case 12:
                this.nbc = jbs.m7760ri(this, str2);
                break;
            case 13:
                this.tpb = true;
                this.f5891nh = C2343ik.m8029ri(str2, 1.0f);
                break;
            case 14:
                this.tnn = C2347mj.m8044ri(this.f5888lr, str2);
                this.siy = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.bgr = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.bgr = -2.0f;
                } else {
                    this.bgr = C2347mj.m8044ri(this.f5888lr, str2);
                }
                this.yjg = true;
                break;
            case 16:
                this.f5910vr = C2347mj.m8044ri(this.f5888lr, str2);
                break;
            case 17:
                this.f5892nr = C2347mj.m8044ri(this.f5888lr, str2);
                this.f5865ay = true;
                break;
            case 19:
            case 56:
                this.f5897qd = str2;
                break;
            case 20:
                this.xlq = true;
                this.qmx = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 21:
                this.f5868de = true;
                this.f5908ud = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 22:
                this.f5920zv = true;
                this.hpn = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 23:
                this.f5902su = C2347mj.m8044ri(this.f5888lr, str2);
                this.hcw = true;
                break;
            case 24:
                this.bfa = str2;
                break;
            case 25:
                this.tan = C2347mj.m8044ri(this.f5888lr, str2);
                this.f5877fr = true;
                break;
            case 26:
                this.ihz = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 27:
                this.f5901sf = str2;
                break;
            case 28:
                this.tyz = C2346lr.m8039ri(str2, (JSONObject) null);
                break;
            case 29:
                this.f5867co = str2;
                break;
            case 30:
                float fM8029ri = C2343ik.m8029ri(str2, 0.0f);
                this.f5883jc = fM8029ri;
                if (fM8029ri > 0.0f) {
                    this.f5887kt = true;
                }
                break;
            case 31:
                this.f5870dw = C2347mj.m8044ri(this.f5888lr, str2);
                this.dzy = true;
                break;
            case 32:
                this.evm = str2;
                break;
            case 34:
                this.f5917zb = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 35:
                this.f5868de = true;
                this.f5920zv = true;
                float[] fArrM7981ik = C2328ka.m7981ik(str2);
                this.f5908ud = fArrM7981ik[0];
                this.hpn = fArrM7981ik[1];
                break;
            case 36:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.f5864aw = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.f5864aw = -2.0f;
                } else {
                    this.f5864aw = C2347mj.m8044ri(this.f5888lr, str2);
                }
                this.lau = true;
                break;
            case 37:
                this.ory = C2347mj.m8044ri(this.f5888lr, str2);
                this.f5896pv = true;
                break;
            case 38:
                List<C2327ik> listM7988ri = C2328ka.m7988ri(str2, this.f5886ka);
                if (listM7988ri != null && !listM7988ri.isEmpty()) {
                    this.saa = new C2325di(this.f5888lr, this, listM7988ri);
                    break;
                }
                break;
            case 40:
                this.f5904ta = C2347mj.m8044ri(this.f5888lr, str2);
                this.whw = true;
                break;
            case 41:
                this.f5885jm = bgr(str2);
                break;
            case 42:
                this.f5874fe = C2347mj.m8044ri(this.f5888lr, str2);
                this.f5916xm = true;
                break;
            case 43:
                this.bnj = C2347mj.m8044ri(this.f5888lr, str2);
                this.rzk = true;
                break;
            case 44:
                this.f5918zf = C2347mj.m8044ri(this.f5888lr, str2);
                this.f5913xd = true;
                break;
            case 45:
                this.gcp = C2348ri.m8053ri(str2);
                break;
            case 46:
                this.f5907tw = str2;
                break;
            case 47:
                this.f5898qh = C2347mj.m8044ri(this.f5888lr, str2);
                break;
            case 49:
                this.f5866bu = C2347mj.m8044ri(this.f5888lr, str2);
                this.wjv = true;
                break;
            case 50:
                this.f5900ri = true;
                this.akr = true;
                float[] fArrM7981ik2 = C2328ka.m7981ik(str2);
                this.ajz = C2347mj.m8043ri(this.f5888lr, fArrM7981ik2[0]);
                this.f5919zk = C2347mj.m8043ri(this.f5888lr, fArrM7981ik2[1]);
                break;
            case 52:
                try {
                    this.yjm = new C2335ri(this.f5888lr, this, C2328ka.m7987ri(new JSONObject(str2), this.f5886ka));
                } catch (JSONException unused) {
                    return;
                }
                break;
            case 53:
                this.f5903sz = C2243ri.m7394ri(str2, this);
                break;
            case 57:
                this.feb = true;
                this.srn = m7823aw(str2);
                break;
            case 58:
                this.zyn = C2347mj.m8044ri(this.f5888lr, str2);
                break;
            case 59:
                this.zxp = true;
                this.f5880id = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 60:
                this.f5872eu = true;
                this.hws = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 61:
                this.jxw = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 63:
                this.adz = C2343ik.m8032ri(str2, false);
                break;
            case 65:
                if (TextUtils.equals("visible", str2)) {
                    this.f5890nd = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.f5890nd = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.f5890nd = 8;
                }
                this.f5875fi.setVisibility(this.f5890nd);
                break;
            case 66:
                this.slm = C2347mj.m8044ri(this.f5888lr, str2);
                this.f5909uq = true;
                break;
            case 67:
                this.aac = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7876ri(String str, Object... objArr) {
        List<AbstractC2296ik> listM7880sf = m7880sf(str);
        if (listM7880sf == null || listM7880sf.isEmpty()) {
            return;
        }
        for (AbstractC2296ik abstractC2296ik : listM7880sf) {
            abstractC2296ik.m7787ri(this.nbc);
            abstractC2296ik.mo7777ri(objArr);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo7662ri(JSONObject jSONObject) {
        this.f5886ka = jSONObject;
        m7830aw();
        JSONObject jSONObject2 = this.f5882ik;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        C2320ri<ViewGroup> c2320ri = this.f5869di;
        C2320ri.ri riVarMo7551qt = c2320ri instanceof C2320ri ? c2320ri.mo7551qt() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strM7663ri = C2268lr.m7663ri(this.f5882ik.optString(next), jSONObject);
            mo7553ri(next, strM7663ri);
            if (riVarMo7551qt != null) {
                riVarMo7551qt.mo7561ri(this.f5888lr, next, strM7663ri);
            }
        }
        if (riVarMo7551qt != null) {
            m7863ri(riVarMo7551qt.mo7560ri());
        }
        if (this.tyz == null || this.f5886ka == null) {
            return;
        }
        try {
            if (!hcw()) {
                this.f5886ka.put("i18n", this.tyz);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.tyz);
            this.f5886ka.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7877ri(boolean z) {
        this.f5899qt = z;
    }

    /* JADX INFO: renamed from: ri */
    public void m7878ri(boolean z, boolean z2) {
        if (this.f5875fi != null) {
            m7863ri(this.f5914xe);
            if (z) {
                m7840fi((int) this.f5864aw);
            }
            if (z2) {
                m7836di((int) this.bgr);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: ri */
    public int[] mo7740ri(int i, int i2) {
        if (this.f5917zb > 0.0f) {
            if (this.lau) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.f5917zb;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.yjg) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.f5917zb;
                if (f2 != 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.f5906tq != null && !this.f5884jg) {
            this.f5884jg = true;
        }
        return new int[]{i, i2};
    }

    /* JADX INFO: renamed from: sf */
    public T m7879sf() {
        return this.f5875fi;
    }

    /* JADX INFO: renamed from: sf */
    public List<AbstractC2296ik> m7880sf(String str) {
        jbs jbsVar;
        if (TextUtils.isEmpty(str) || (jbsVar = this.nbc) == null) {
            return null;
        }
        return jbsVar.m7767ri(str);
    }

    public boolean siy() {
        return this.adz;
    }

    public float slm() {
        return this.f5919zk;
    }

    public int srn() {
        return this.f5881ig;
    }

    /* JADX INFO: renamed from: su */
    public JSONObject m7881su() {
        return this.f5882ik;
    }

    /* JADX INFO: renamed from: ta */
    public float m7882ta() {
        T t = this.f5875fi;
        if (t instanceof com.bytedance.adsdk.ugeno.p108ri.xha) {
            return ((com.bytedance.adsdk.ugeno.p108ri.xha) t).getStretch();
        }
        return 0.0f;
    }

    public float tan() {
        return this.f5880id;
    }

    public float tnn() {
        T t = this.f5875fi;
        if (t instanceof com.bytedance.adsdk.ugeno.p108ri.xha) {
            return ((com.bytedance.adsdk.ugeno.p108ri.xha) t).getRipple();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: uq */
    public float m7883uq() {
        return this.f5891nh;
    }

    /* JADX INFO: renamed from: vr */
    public float m7884vr() {
        return this.ajz;
    }

    public boolean whw() {
        return this.f5879ib;
    }

    public float wjv() {
        return this.zyn;
    }

    /* JADX INFO: renamed from: xd */
    public String m7885xd() {
        return this.f5901sf;
    }

    public AbstractViewOnTouchListenerC2318ik<T> xha(String str) {
        return mo7843ik(str);
    }

    public void xha() {
        if (this.f5903sz != null) {
            C2242qt c2242qt = new C2242qt(this.f5875fi, this.f5903sz);
            this.amj = c2242qt;
            c2242qt.m7390ri();
        }
        C2335ri c2335ri = this.yjm;
        if (c2335ri != null) {
            c2335ri.m8009ri();
        }
        C2325di c2325di = this.saa;
        if (c2325di != null) {
            c2325di.m7952lr();
        }
        jbs jbsVar = this.nbc;
        if (jbsVar != null) {
            jbsVar.m7762fi();
        }
        if (this.bzf != null && m7853lr(10)) {
            this.bzf.m7375ri();
        }
        if (this.f5873fb != null && m7853lr(9)) {
            this.f5873fb.m7363ri();
        }
        C2235fi c2235fi = this.rbz;
        if (c2235fi != null) {
            c2235fi.m7371ri();
        }
        this.mvf = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: zf */
    protected void mo7886zf() {
        C2260fi.m7537ri().m7541lr().mo7949ri(this.jbs, this.f5897qd, new InterfaceC2324ri.ri() { // from class: com.bytedance.adsdk.ugeno.lr.ik.4
            @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo7699ri(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                if (!AbstractViewOnTouchListenerC2318ik.this.f5887kt) {
                    C2347mj.m8047ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.lr.ik.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AbstractViewOnTouchListenerC2318ik.this.mo7862ri(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapM8045ri = C2347mj.m8045ri(AbstractViewOnTouchListenerC2318ik.this.f5888lr, bitmap, (int) AbstractViewOnTouchListenerC2318ik.this.f5883jc);
                if (bitmapM8045ri != null) {
                    C2347mj.m8047ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.lr.ik.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AbstractViewOnTouchListenerC2318ik.this.mo7862ri(new BitmapDrawable(bitmapM8045ri));
                        }
                    });
                }
            }
        });
    }

    public boolean zyn() {
        return this.f5917zb > 0.0f;
    }
}
