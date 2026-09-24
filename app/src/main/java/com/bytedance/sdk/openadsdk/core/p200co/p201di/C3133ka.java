package com.bytedance.sdk.openadsdk.core.p200co.p201di;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.C2228co;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.jbs.p098ka.C2275ik;
import com.bytedance.adsdk.ugeno.jbs.p099lr.C2278lr;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka;
import com.bytedance.sdk.component.adexpress.p124ka.C2491di;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2507mj;
import com.bytedance.sdk.component.adexpress.p125lr.bgr;
import com.bytedance.sdk.component.adexpress.p125lr.xha;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3137di;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p209di.C3160lr;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p211ik.C3166lr;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3133ka implements slm, InterfaceC2247vr, InterfaceC2469ka, InterfaceC2505ka<View> {
    protected static int ihz = 24;

    /* JADX INFO: renamed from: aw */
    protected AbstractViewOnTouchListenerC2318ik f10228aw;

    /* JADX INFO: renamed from: ay */
    protected JSONObject f10229ay;
    protected float bgr;

    /* JADX INFO: renamed from: bu */
    protected float f10230bu;

    /* JADX INFO: renamed from: co */
    protected AbstractViewOnTouchListenerC2318ik f10231co;

    /* JADX INFO: renamed from: di */
    protected C3136ri f10232di;

    /* JADX INFO: renamed from: fi */
    protected wjv f10234fi;

    /* JADX INFO: renamed from: fr */
    private xha f10235fr;

    /* JADX INFO: renamed from: ik */
    protected AbstractViewOnTouchListenerC2318ik<View> f10237ik;
    protected InterfaceC3247vr jbs;

    /* JADX INFO: renamed from: ka */
    protected JSONObject f10238ka;

    /* JADX INFO: renamed from: lr */
    protected Context f10239lr;

    /* JADX INFO: renamed from: mj */
    protected InterfaceC2507mj f10240mj;

    /* JADX INFO: renamed from: nr */
    protected long f10241nr;

    /* JADX INFO: renamed from: oh */
    private C3131fi f10242oh;

    /* JADX INFO: renamed from: qt */
    protected bgr f10245qt;

    /* JADX INFO: renamed from: ri */
    protected C2228co f10246ri;
    protected float slm;

    /* JADX INFO: renamed from: su */
    private boolean f10248su;
    protected long tan;

    /* JADX INFO: renamed from: uq */
    protected String f10249uq;

    /* JADX INFO: renamed from: vr */
    protected float f10250vr;

    /* JADX INFO: renamed from: xd */
    private C3222ac f10251xd;
    protected FrameLayout xha;

    /* JADX INFO: renamed from: ac */
    protected boolean f10227ac = true;
    private long igq = 0;

    /* JADX INFO: renamed from: zf */
    private float f10252zf = 0.0f;

    /* JADX INFO: renamed from: dw */
    private float f10233dw = 0.0f;
    private float ory = 0.0f;
    private float hcw = 0.0f;
    public SparseArray<AbstractViewOnClickListenerC3218ik.ri> wjv = new SparseArray<>();
    private String dzy = "";

    /* JADX INFO: renamed from: pv */
    private final AbstractRunnableC2676ik f10243pv = new AbstractRunnableC2676ik("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.co.di.ka.1
        @Override // java.lang.Runnable
        public void run() {
            C3133ka c3133ka = C3133ka.this;
            c3133ka.f10238ka = c3133ka.mo13080ri();
            C3133ka c3133ka2 = C3133ka.this;
            c3133ka2.f10229ay = c3133ka2.mo13078lr();
            C3133ka.this.f10242oh = new C3131fi(C3133ka.this.f10239lr, C3133ka.this.f10234fi, C3133ka.this.f10249uq, C3133ka.this.f10229ay);
            if (C3133ka.this.f10251xd != null) {
                C3133ka c3133ka3 = C3133ka.this;
                c3133ka3.dzy = c3133ka3.f10251xd.getUgenTemplateErrorReason();
            } else {
                C3133ka.this.dzy = "expressView is null";
            }
            C3332vr.m14976ik().post(C3133ka.this.f10236ig);
        }
    };

    /* JADX INFO: renamed from: ig */
    private final Runnable f10236ig = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.di.ka.2
        @Override // java.lang.Runnable
        public void run() {
            if (C3133ka.this.f10235fr != null) {
                C3133ka c3133ka = C3133ka.this;
                c3133ka.m13067lr(c3133ka.f10235fr);
            }
        }
    };

    /* JADX INFO: renamed from: qd */
    private boolean f10244qd = false;

    /* JADX INFO: renamed from: sf */
    protected AtomicBoolean f10247sf = new AtomicBoolean(false);

    static {
        if (C3299nr.m14642ri() != null) {
            ihz = C3299nr.m14640lr();
        }
    }

    public C3133ka(Context context, wjv wjvVar, boolean z, C3136ri c3136ri, ViewGroup viewGroup) {
        this.f10239lr = context;
        this.f10248su = z;
        this.f10246ri = new C2228co(context);
        this.f10234fi = wjvVar;
        this.f10232di = c3136ri;
        this.xha = new FrameLayout(context);
        if (viewGroup instanceof C3222ac) {
            this.f10251xd = (C3222ac) viewGroup;
        }
        this.f10249uq = c3136ri.m8884ka();
    }

    private void jbs() {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7839fi;
        if (this.f10237ik == null) {
            return;
        }
        if (this.f10234fi.wzs() && (abstractViewOnTouchListenerC2318ikM7839fi = this.f10237ik.m7839fi("tvskip")) != 0) {
            abstractViewOnTouchListenerC2318ikM7839fi.m7844ik(8);
        }
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7839fi2 = this.f10237ik.m7839fi("skip");
        if (abstractViewOnTouchListenerC2318ikM7839fi2 != 0 && (abstractViewOnTouchListenerC2318ikM7839fi2 instanceof C2275ik)) {
            if (!C3322sf.m14819lr().bgr(String.valueOf(this.f10234fi.m14545ur())) || this.f10234fi.m14453nd() == 5 || this.f10234fi.m14453nd() == 6 || this.f10234fi.m14404go() == 3) {
                ((C2275ik) abstractViewOnTouchListenerC2318ikM7839fi2).bgr("local://tt_close_btn");
                abstractViewOnTouchListenerC2318ikM7839fi2.mo7550lr();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m13067lr(xha xhaVar) {
        if (this instanceof C3137di) {
            this.f10232di.m8881fi().xha(1);
        } else {
            this.f10232di.m13093oh().mo7386ri();
        }
        if (this.f10238ka == null) {
            xhaVar.mo8981ri(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + this.dzy);
            return;
        }
        if (this.f10229ay == null) {
            xhaVar.mo8981ri(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int iMo13077ka = mo13077ka();
        if (this.f10246ri.m7355ri()) {
            List<String> listM7341lr = this.f10246ri.m7341lr();
            if (listM7341lr == null) {
                xhaVar.mo8981ri(138, "unknow widget");
                return;
            }
            xhaVar.mo8981ri(138, "unknow widget;" + listM7341lr.toString());
            return;
        }
        if (iMo13077ka != 0) {
            xhaVar.mo8981ri(iMo13077ka, "ugen render fail");
            return;
        }
        if (this.f10237ik == null) {
            xhaVar.mo8981ri(138, "ugen render error");
            return;
        }
        C3134lr c3134lr = new C3134lr();
        this.f10245qt = c3134lr;
        c3134lr.m8968ri(true);
        this.f10245qt.m8965ri(mo8752ik());
        setSoundMute(this.f10248su);
        jbs();
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikMo13079mj = mo13079mj();
        this.f10231co = abstractViewOnTouchListenerC2318ikMo13079mj;
        if (abstractViewOnTouchListenerC2318ikMo13079mj != null && (abstractViewOnTouchListenerC2318ikMo13079mj instanceof C3160lr)) {
            ((C3134lr) this.f10245qt).m13089ri((FrameLayout) ((C3160lr) abstractViewOnTouchListenerC2318ikMo13079mj).m13200ka());
        }
        C3131fi c3131fi = this.f10242oh;
        if (c3131fi != null) {
            c3131fi.m13060ri();
        }
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM13076di = m13076di();
        this.f10228aw = abstractViewOnTouchListenerC2318ikM13076di;
        if (abstractViewOnTouchListenerC2318ikM13076di != null && (abstractViewOnTouchListenerC2318ikM13076di instanceof C2278lr)) {
            ((C3134lr) this.f10245qt).m13088lr((FrameLayout) abstractViewOnTouchListenerC2318ikM13076di.m7879sf());
        }
        if (C3279dw.m14090ik(this.f10234fi)) {
            AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikXha = xha();
            if (abstractViewOnTouchListenerC2318ikXha instanceof C3166lr) {
                ((C3134lr) this.f10245qt).m13087ik(((C3166lr) abstractViewOnTouchListenerC2318ikXha).m13212ka());
            }
        }
        int iM7857pv = this.f10237ik.m7857pv();
        int iM7842ig = this.f10237ik.m7842ig();
        this.xha.removeAllViews();
        this.xha.addView(this.f10237ik.m7879sf(), new FrameLayout.LayoutParams(iM7857pv, iM7842ig));
        float fM13092dw = this.f10232di.m13092dw();
        float fOry = this.f10232di.ory();
        float fM16589lr = C3583qd.m16589lr(this.f10239lr, fM13092dw);
        float fM16589lr2 = C3583qd.m16589lr(this.f10239lr, fOry);
        if (mo8752ik() != 7) {
            this.xha.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        } else if (fOry <= 0.0f) {
            this.xha.setLayoutParams(new FrameLayout.LayoutParams((int) fM16589lr, -2));
        } else {
            this.xha.setLayoutParams(new FrameLayout.LayoutParams((int) fM16589lr, (int) fM16589lr2));
        }
        if (fOry <= 0.0f || fM13092dw <= 0.0f) {
            this.xha.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int iM16581ik = C3583qd.m16581ik(this.f10239lr, this.xha.getMeasuredWidth());
            int iM16581ik2 = C3583qd.m16581ik(this.f10239lr, this.xha.getMeasuredHeight());
            this.f10245qt.m8963ri(iM16581ik);
            this.f10245qt.m8955lr(iM16581ik2);
        } else {
            this.f10245qt.m8963ri(fM13092dw);
            this.f10245qt.m8955lr(fOry);
        }
        if (this.f10247sf.get()) {
            xhaVar.mo8981ri(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
        } else {
            this.f10246ri.m7351ri(this.f10237ik, "renderDidFinish", new Object[0]);
            xhaVar.mo8982ri(this.xha, this.f10245qt);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m13068lr(CharSequence charSequence, boolean z, int i, boolean z2) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7839fi;
        View viewM7879sf;
        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f10237ik;
        if (abstractViewOnTouchListenerC2318ik == null || (abstractViewOnTouchListenerC2318ikM7839fi = abstractViewOnTouchListenerC2318ik.m7839fi("skip")) == 0 || (viewM7879sf = abstractViewOnTouchListenerC2318ikM7839fi.m7879sf()) == null) {
            return;
        }
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        viewM7879sf.setVisibility(i2);
    }

    /* JADX INFO: renamed from: ri */
    private void m13072ri(C2226aw c2226aw) {
        JSONObject jSONObjectM13058ka;
        boolean zM13063ri;
        int i;
        String str;
        C3131fi c3131fi;
        C3131fi c3131fi2;
        C3131fi c3131fi3;
        if (this.f10240mj == null) {
            return;
        }
        String strOptString = c2226aw.m7320ik().optString("type");
        if ("swiperLeft".equals(strOptString) && (c3131fi3 = this.f10242oh) != null) {
            c3131fi3.m13059lr();
            return;
        }
        if ("swiperRight".equals(strOptString) && (c3131fi2 = this.f10242oh) != null) {
            c3131fi2.m13057ik();
            return;
        }
        int i2 = 2;
        if (!"swiperClick".equals(strOptString) || (c3131fi = this.f10242oh) == null) {
            jSONObjectM13058ka = null;
            zM13063ri = false;
            i = 0;
        } else {
            zM13063ri = c3131fi.m13063ri(c2226aw);
            jSONObjectM13058ka = this.f10242oh.m13058ka();
            i = 2;
        }
        strOptString.hashCode();
        switch (strOptString) {
            case "privacy":
                i2 = 7;
                break;
            case "feedback":
                i2 = 3;
                break;
            case "mute":
                i2 = 5;
                break;
            case "skip":
                i2 = 6;
                break;
            case "video":
                i2 = 4;
                break;
            case "creative":
                break;
            default:
                i2 = i;
                break;
        }
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikM7324ri = c2226aw.m7324ri();
        com.bytedance.sdk.openadsdk.core.model.slm.C3292ri c3292riM14293ri = new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14290ri(this.wjv).m14293ri(c2226aw.m7322lr() != 1 || this.f10227ac);
        if (abstractViewOnTouchListenerC2318ikM7324ri == null) {
            str = "";
        } else {
            str = abstractViewOnTouchListenerC2318ikM7324ri.dzy() + "_" + abstractViewOnTouchListenerC2318ikM7324ri.m7885xd();
        }
        this.f10240mj.mo9002ri(c2226aw.m7324ri().m7879sf(), i2, c3292riM14293ri.m14291ri(str).m14286lr(zM13063ri).m14285lr(jSONObjectM13058ka).m14294ri());
    }

    /* JADX INFO: renamed from: ri */
    private void m13074ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7839fi;
        int i2;
        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f10237ik;
        if (abstractViewOnTouchListenerC2318ik == null || (abstractViewOnTouchListenerC2318ikM7839fi = abstractViewOnTouchListenerC2318ik.m7839fi("countdown")) == 0) {
            return;
        }
        View viewM7879sf = abstractViewOnTouchListenerC2318ikM7839fi.m7879sf();
        if (viewM7879sf instanceof TextView) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                C2707ac.m10197ik("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (z2 || i2 <= 0 || this.f10244qd) {
                viewM7879sf.setVisibility(8);
                return;
            }
            viewM7879sf.setVisibility(0);
            if (!z && this.f10232di.m8889ri() && C2491di.m8812lr(this.f10232di.m8884ka())) {
                ((TextView) viewM7879sf).setText(String.format(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_full_skip"), Integer.valueOf(i)));
                return;
            }
            if (!"open_ad".equals(this.f10232di.m8884ka()) && this.f10232di.m8889ri()) {
                this.f10244qd = true;
                viewM7879sf.setVisibility(8);
            } else {
                ((TextView) viewM7879sf).setText(((Object) charSequence) + CmcdData.Factory.STREAMING_FORMAT_SS);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13075ri(JSONObject jSONObject) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7839fi;
        if (this.f10237ik == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (abstractViewOnTouchListenerC2318ikM7839fi = this.f10237ik.m7839fi(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            abstractViewOnTouchListenerC2318ikM7839fi.m7844ik(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            abstractViewOnTouchListenerC2318ikM7839fi.m7844ik(8);
        }
    }

    /* JADX INFO: renamed from: di */
    public AbstractViewOnTouchListenerC2318ik m13076di() {
        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f10237ik;
        if (abstractViewOnTouchListenerC2318ik == null) {
            return null;
        }
        return abstractViewOnTouchListenerC2318ik.m7835di("PlayableComponent");
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: fi */
    public View mo8751fi() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ik */
    public int mo8752ik() {
        return this.f10234fi.hpn();
    }

    /* JADX INFO: renamed from: ka */
    protected int mo13077ka() {
        this.f10246ri.m7349ri((InterfaceC2247vr) this);
        this.f10246ri.m7348ri((slm) this);
        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ikM7345ri = this.f10246ri.m7345ri(this.f10238ka);
        this.f10237ik = abstractViewOnTouchListenerC2318ikM7345ri;
        C3131fi c3131fi = this.f10242oh;
        if (c3131fi != null && abstractViewOnTouchListenerC2318ikM7345ri != null) {
            c3131fi.m13061ri(abstractViewOnTouchListenerC2318ikM7345ri);
        }
        if (!(this instanceof C3137di)) {
            this.f10232di.m13093oh().mo7385lr();
            this.f10232di.m13093oh().mo7384ik();
        }
        this.f10246ri.m7342lr(this.f10229ay);
        return 0;
    }

    /* JADX INFO: renamed from: lr */
    protected JSONObject mo13078lr() {
        return this.f10232di.hcw();
    }

    /* JADX INFO: renamed from: mj */
    protected AbstractViewOnTouchListenerC2318ik mo13079mj() {
        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f10237ik;
        if (abstractViewOnTouchListenerC2318ik == null) {
            return null;
        }
        return abstractViewOnTouchListenerC2318ik.m7839fi("video");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void onvideoComplate() {
    }

    /* JADX INFO: renamed from: ri */
    protected JSONObject mo13080ri() {
        return this.f10232di.m8883ik();
    }

    /* JADX INFO: renamed from: ri */
    public void mo13081ri(long j, long j2) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2247vr
    /* JADX INFO: renamed from: ri */
    public void mo7436ri(C2226aw c2226aw, InterfaceC2247vr.lr lrVar, InterfaceC2247vr.ri riVar) {
        if (c2226aw == null) {
            return;
        }
        if (c2226aw.m7322lr() == 1 || c2226aw.m7322lr() == 4) {
            m13072ri(c2226aw);
        }
        if (c2226aw.m7322lr() == 10) {
            m13075ri(c2226aw.m7320ik());
        }
        if (lrVar == null || c2226aw.m7321ka() == null) {
            return;
        }
        lrVar.mo7438ri(c2226aw.m7321ka());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    @Override // com.bytedance.adsdk.ugeno.core.slm
    /* JADX INFO: renamed from: ri */
    public void mo7435ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = 0;
        int i3 = 1;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.ory += Math.abs(motionEvent.getX() - this.f10252zf);
                    this.hcw += Math.abs(motionEvent.getY() - this.f10233dw);
                    this.f10252zf = motionEvent.getX();
                    this.f10233dw = motionEvent.getY();
                    if (System.currentTimeMillis() - this.igq > 200) {
                        float f = this.ory;
                        int i4 = ihz;
                        if (f <= i4 && this.hcw <= i4) {
                            i3 = 2;
                        }
                    } else {
                        i3 = 2;
                    }
                    if (Math.abs(motionEvent.getRawX() - this.bgr) >= ihz || Math.abs(motionEvent.getRawY() - this.f10250vr) >= ihz) {
                        this.f10227ac = false;
                    }
                    i = i3;
                }
                this.wjv.put(motionEvent.getActionMasked(), new AbstractViewOnClickListenerC3218ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
            }
            this.slm = motionEvent.getRawX();
            this.f10230bu = motionEvent.getRawY();
            if (Math.abs(this.slm - this.bgr) >= ihz || Math.abs(this.f10230bu - this.f10250vr) >= ihz) {
                this.f10227ac = false;
            }
            this.tan = System.currentTimeMillis();
            i2 = -1;
        } else {
            this.f10241nr = System.currentTimeMillis();
            this.bgr = motionEvent.getRawX();
            this.f10250vr = motionEvent.getRawY();
            this.f10227ac = true;
            this.ory = 0.0f;
            this.hcw = 0.0f;
            this.igq = System.currentTimeMillis();
            C3324ik.m14916ri(motionEvent);
            this.f10252zf = motionEvent.getX();
            this.f10233dw = motionEvent.getY();
        }
        i = i2;
        this.wjv.put(motionEvent.getActionMasked(), new AbstractViewOnClickListenerC3218ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2247vr
    /* JADX INFO: renamed from: ri */
    public void mo7437ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
    }

    /* JADX INFO: renamed from: ri */
    public void m13082ri(InterfaceC2507mj interfaceC2507mj) {
        this.f10240mj = interfaceC2507mj;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
    /* JADX INFO: renamed from: ri */
    public void mo8759ri(xha xhaVar) {
        this.f10235fr = xhaVar;
        dzy.m16396ik((Runnable) this.f10243pv);
    }

    /* JADX INFO: renamed from: ri */
    public void m13083ri(InterfaceC3247vr interfaceC3247vr) {
        this.jbs = interfaceC3247vr;
    }

    /* JADX INFO: renamed from: ri */
    public void m13084ri(wjv wjvVar, boolean z, C3136ri c3136ri, ViewGroup viewGroup) {
        this.f10234fi = wjvVar;
        this.f10232di = c3136ri;
        this.f10249uq = c3136ri.m8884ka();
        if (viewGroup instanceof C3222ac) {
            this.f10251xd = (C3222ac) viewGroup;
        }
        this.f10248su = z;
    }

    /* JADX INFO: renamed from: ri */
    public void mo13085ri(InterfaceC3338fi interfaceC3338fi) {
        C3131fi c3131fi = this.f10242oh;
        if (c3131fi != null) {
            c3131fi.m13062ri(interfaceC3338fi);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13086ri(boolean z) {
        this.f10247sf.set(z);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setSoundMute(boolean z) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7839fi;
        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f10237ik;
        if (abstractViewOnTouchListenerC2318ik == null || (abstractViewOnTouchListenerC2318ikM7839fi = abstractViewOnTouchListenerC2318ik.m7839fi(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z) {
            ((C2275ik) abstractViewOnTouchListenerC2318ikM7839fi).bgr("local://tt_reward_full_mute");
        } else {
            ((C2275ik) abstractViewOnTouchListenerC2318ikM7839fi).bgr("local://tt_reward_full_unmute");
        }
        abstractViewOnTouchListenerC2318ikM7839fi.mo7550lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.f10237ik == null) {
            return;
        }
        boolean z2 = i == 1;
        m13074ri(charSequence, z2, i2, z);
        m13068lr(charSequence, z2, i2, z);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setTimeUpdate(int i) {
    }

    public AbstractViewOnTouchListenerC2318ik xha() {
        return null;
    }
}
