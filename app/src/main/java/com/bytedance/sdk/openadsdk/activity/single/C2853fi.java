package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.C2994di;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3019lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3577ka;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2853fi extends AbstractC2859mj implements igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: ac */
    private static String f8274ac;

    /* JADX INFO: renamed from: fi */
    private static String f8275fi;
    private static String ihz;

    /* JADX INFO: renamed from: ka */
    private static String f8276ka;

    /* JADX INFO: renamed from: uq */
    private static String f8277uq;

    /* JADX INFO: renamed from: ay */
    private int f8278ay;

    /* JADX INFO: renamed from: dw */
    private JSONObject f8279dw;

    /* JADX INFO: renamed from: fr */
    private C2858lr.fi f8280fr;
    private boolean hcw;
    private boolean igq;

    /* JADX INFO: renamed from: ik */
    protected AbstractC2998lr f8281ik;

    /* JADX INFO: renamed from: lr */
    protected final igq f8282lr;
    private int ory;

    /* JADX INFO: renamed from: ri */
    public boolean f8283ri;

    /* JADX INFO: renamed from: su */
    private boolean f8284su;
    private Bundle wjv;

    /* JADX INFO: renamed from: zf */
    private long f8285zf;

    public C2853fi(C2858lr c2858lr, wjv wjvVar, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(c2858lr, wjvVar, i, i2, z2);
        this.f8282lr = new igq(Looper.getMainLooper(), this);
        this.f8278ay = 0;
        this.hcw = true;
        this.slm = z;
        this.f8465aw = c2858lr.m10932fi();
        this.f8283ri = z3;
        m10780ri(wjvVar, this.wjv);
    }

    private boolean aac() {
        if (this.f8468di.m14383di()) {
            return this.jbs.jbs.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: dw */
    private void m10774dw() {
        if (this.f8284su) {
            return;
        }
        this.f8284su = true;
        if (this.f8465aw) {
            this.xha.m10954ri(mo10791ri(), m11005ig());
        } else {
            this.xha.m10953ri(mo10791ri());
        }
        this.f8281ik.m11743fr();
    }

    /* JADX INFO: renamed from: ri */
    private void m10779ri(C3022ri c3022ri, C3022ri c3022ri2) {
        if (!this.f8465aw || m11005ig() || c3022ri == null || c3022ri2 == null) {
            return;
        }
        try {
            this.f8285zf = c3022ri2.ihz.bgr();
            if (this.f8468di.siy()) {
                this.f8285zf = c3022ri2.m11997di();
            }
            this.ory = c3022ri2.ihz.m12123ay();
            this.f8279dw = C3571ig.m16480ri(this.f8468di, c3022ri2.ihz.m12124bu(), c3022ri2.ihz.m12144nr());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m10780ri(wjv wjvVar, Bundle bundle) {
        Activity activityKt = m11010kt();
        this.jbs = new C3022ri(activityKt, this.f8282lr, wjvVar, this, 2, this.xha.m10944lr());
        this.jbs.luy = this.slm;
        this.jbs.hpn = this.f8283ri;
        this.jbs.qmx = this.jbs.f9410xe && !this.f8283ri;
        this.jbs.f9410xe = this.xha.m10929di();
        this.jbs.yjm = this.f8465aw;
        this.jbs.saa = this.xha.m10938ka();
        if (!this.f8283ri) {
            this.jbs.f9395pc = this.xha.m10926ay();
        }
        this.jbs.ajz = this;
        this.jbs.f9378dw = this.xha.m10970uq();
        C3019lr.m11954ri(this.jbs, activityKt.getIntent(), bundle);
        this.f8281ik = C2994di.m11714ri(this.jbs);
        this.jbs.f9391nd = this.f8281ik;
        Objects.toString(this.f8281ik);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m10782ri(final boolean z, boolean z2, final Runnable runnable) {
        if (!this.jbs.f9387ka || this.xha.m10927bu()) {
            return false;
        }
        if (!z2 && this.xha.m10925aw()) {
            return false;
        }
        if (!C3299nr.m14639ka().m14861mj(String.valueOf(this.jbs.f9377di))) {
            if (!z2) {
                return false;
            }
            if (runnable == null && z) {
                feb();
                return true;
            }
        }
        this.jbs.f9375bu.set(true);
        if (z) {
            this.jbs.wjv.m11957di();
        }
        final DialogC3342lr dialogC3342lr = new DialogC3342lr(this.jbs.f9384ig);
        this.f8281ik.f9195co = dialogC3342lr;
        if (z) {
            this.f8281ik.f9195co.m15019ri(f8276ka).m15017lr(f8275fi).m15016ik(f8274ac);
        } else {
            this.f8281ik.f9195co.m15019ri(ihz).m15017lr(f8277uq).m15016ik(f8274ac);
        }
        this.f8281ik.f9195co.m15018ri(new DialogC3342lr.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.fi.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr.lr
            /* JADX INFO: renamed from: lr */
            public void mo10702lr() {
                dialogC3342lr.dismiss();
                C2853fi.this.xha.m10943lr(true);
                C2853fi.this.jbs.f9375bu.set(false);
                C2853fi.this.jbs.wjv.m11963lr(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z) {
                    C2853fi.this.m10790mj();
                } else {
                    C2853fi.this.jbs.f9402su.m11985di();
                    C2853fi.this.feb();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr.lr
            /* JADX INFO: renamed from: ri */
            public void mo10703ri() {
                if (z) {
                    C2853fi.this.jbs.wjv.m11969ri(1000);
                }
                dialogC3342lr.dismiss();
                C2853fi.this.jbs.f9375bu.set(false);
            }
        }).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: xe */
    public void m10783xe() {
        C2858lr.fi fiVar = new C2858lr.fi(7, this.jbs);
        fiVar.f8430ka = this.jbs.zyn;
        this.xha.m10942lr(this, fiVar);
    }

    private void yjm() {
        try {
            m10784zf();
        } catch (Throwable unused) {
            feb();
        }
        m10774dw();
        if (!C3273ac.m13958di(this.f8468di) || this.f8283ri) {
            return;
        }
        m11014nd();
    }

    /* JADX INFO: renamed from: zf */
    private void m10784zf() {
        if (this.igq) {
            return;
        }
        this.igq = true;
        if (!this.f8283ri) {
            this.jbs.f9395pc = this.xha.m10926ay();
        }
        this.jbs.f9396pv.m12295ri(this.f8281ik);
        this.f8281ik.mo11750ri(this, this.f8282lr);
        this.f8281ik.m11747qt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: a_ */
    protected void mo10764a_() {
        if (this.xha != null && this.xha.m10936ik()) {
            super.mo10764a_();
            return;
        }
        final View viewMo12226qt = this.jbs.dzy.mo12226qt();
        if (viewMo12226qt != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.fi.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C2853fi.this.jbs.ory.m12072ac()) {
                        boolean zM11820aw = C2853fi.this.jbs.hcw.m11820aw();
                        C2853fi.this.jbs.ory.m12078di(zM11820aw);
                        C2853fi.this.jbs.dzy.mo12216di(8);
                        View view2 = viewMo12226qt;
                        if (view2 instanceof C3193ka) {
                            ((C3193ka) view2).setImageResource(C2729uq.m10305ka(C2853fi.this.jbs.srn, "tt_close_btn"));
                        }
                        C2853fi.this.jbs.f9386jc.sendEmptyMessageDelayed(600, 5000L);
                        if (!wjv.m14334ik(C2853fi.this.jbs.f9389lr)) {
                            return;
                        }
                        if (wjv.m14334ik(C2853fi.this.jbs.f9389lr) && zM11820aw) {
                            return;
                        }
                    }
                    C2853fi.this.jbs.ory.ihz();
                    C2853fi.this.jbs.hcw.m11831sf();
                    C2853fi.this.jbs.f9402su.m11985di();
                    if (C3279dw.m14091ka(C2853fi.this.jbs.f9389lr) && C2853fi.this.m10782ri(true, true, (Runnable) null)) {
                        return;
                    }
                    C2853fi.this.feb();
                }
            };
            viewMo12226qt.setOnClickListener(onClickListener);
            viewMo12226qt.setTag(viewMo12226qt.getId(), onClickListener);
        }
        this.jbs.f9394oh.m11869ri(new InterfaceC3061lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.fi.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ik */
            public void mo10616ik(View view) {
                View view2 = viewMo12226qt;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ka */
            public void mo10617ka(View view) {
                C2853fi c2853fi = C2853fi.this;
                c2853fi.m11013lr(c2853fi.jbs);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: lr */
            public void mo10618lr(View view) {
                C2853fi.this.mo10768e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10619ri(View view) {
                C2853fi c2853fi = C2853fi.this;
                if (c2853fi.m10782ri(C3279dw.m14090ik(c2853fi.jbs.f9389lr), false, (Runnable) null) || C2853fi.this.m10790mj()) {
                    return;
                }
                if (!C3279dw.m14088fi(C2853fi.this.jbs.f9389lr)) {
                    if (!C3273ac.m13987ri(C2853fi.this.jbs.f9389lr) || C2853fi.this.jbs.f9373aw.get()) {
                        C2853fi.this.feb();
                        return;
                    } else {
                        C2853fi.this.feb();
                        return;
                    }
                }
                if (C3279dw.m14093mj(C2853fi.this.jbs.f9389lr)) {
                    C2853fi.this.jbs.wjv.jbs();
                    return;
                }
                View view2 = viewMo12226qt;
                if (view2 != null) {
                    view2.performClick();
                } else {
                    C2853fi.this.feb();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10620ri(View view, String str) {
                C2853fi.this.mo10773ri(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ac */
    public void mo10785ac() {
        super.mo10785ac();
        AbstractC2998lr abstractC2998lr = this.f8281ik;
        if (abstractC2998lr != null) {
            abstractC2998lr.ihz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: aw */
    public final void mo10786aw() {
        super.mo10786aw();
        if (this.jbs == null || C2722lr.m10243ri(m11010kt())) {
            return;
        }
        this.jbs.ory.m12082fr();
        C3577ka.m16532ri(m11010kt(), this.jbs.f9389lr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ay */
    public C3022ri mo10787ay() {
        return this.jbs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: b_ */
    protected boolean mo10765b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    public final void bgr() {
        super.bgr();
        AbstractC2998lr abstractC2998lr = this.f8281ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11746nr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: bu */
    public void mo10557bu() {
        bnj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: c_ */
    protected boolean mo10766c_() {
        return this.jbs.f9387ka;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: co */
    public void mo10558co() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: d_ */
    public String mo10767d_() {
        return this.jbs.f9381fi;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: e_ */
    public void mo10768e_() {
        this.jbs.f9413zf.m11912ri(this.f8281ik);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: f_ */
    public boolean mo10769f_() {
        return this.jbs.zyn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: fi */
    public void mo10561fi() {
        C2707ac.m10205ri("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.f8473qt + ",scene = " + this);
        if (this.xha != null) {
            this.xha.m10958ri(this);
        }
    }

    public void ihz() {
        if (m11005ig()) {
            return;
        }
        C2858lr.fi fiVar = new C2858lr.fi(8, this.jbs);
        fiVar.f8430ka = this.jbs.zyn;
        if (this.xha != null) {
            this.xha.m10959ri(this, fiVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ik */
    public final void mo10788ik() {
        AbstractC2998lr abstractC2998lr;
        super.mo10788ik();
        if (this.jbs == null || (abstractC2998lr = this.f8281ik) == null) {
            return;
        }
        abstractC2998lr.m11754vr();
        this.jbs.tnn = true;
        if (aac()) {
            this.jbs.f9394oh.m11873ri(this.jbs.f9389lr.nlk());
        }
        this.jbs.dzy.mo12236vr();
        this.jbs.ory.m12075bu();
        this.jbs.wjv.m11958fi();
        if (this.f8281ik.m11756lr()) {
            this.jbs.ihz.m12156ri(this.f8281ik);
            this.jbs.ihz.m12162ri(false, this, this.f8278ay != 0);
        }
        this.f8278ay++;
        if (this.jbs.f9374ay != null) {
            this.jbs.f9374ay.xha();
        }
        this.jbs.f9382fr.m12022ri(this.f8282lr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ik */
    public void mo10789ik(boolean z) {
        long j = this.hcw ? this.jbs.gcp : 0L;
        if (this.jbs != null && this.jbs.f9402su != null) {
            this.jbs.f9402su.m11991lr(z);
            this.jbs.f9402su.m11988ik(z);
            if (z && j > 0) {
                this.jbs.gcp = j;
            }
        }
        if (z) {
            this.hcw = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ka */
    public void mo10770ka() {
        super.mo10770ka();
        AbstractC2998lr abstractC2998lr = this.f8281ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.tan();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ka */
    public void mo10565ka(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10611lr(boolean z) {
        if (!z || this.jbs.f9410xe) {
            return;
        }
        bnj();
    }

    /* JADX INFO: renamed from: mj */
    public boolean m10790mj() {
        if (this.f8283ri || this.xha == null || !this.xha.m10924ac()) {
            return false;
        }
        try {
            C3414ik.m15532ri(System.currentTimeMillis(), this.f8468di, this.jbs.f9381fi, "skip", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.fi.3
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: lr */
                public JSONObject mo10797lr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", C2853fi.this.f8285zf);
                        jSONObject.put("percent", C2853fi.this.ory);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ri */
                public JSONObject mo10798ri() {
                    if (C2853fi.this.f8279dw != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", C2853fi.this.jbs.f9400ri);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
        }
        this.xha.m10962ri(this, true, false, false, 4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void ory() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public final C3072mj mo10791ri() {
        return this.jbs.f9396pv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo10792ri(Activity activity) {
        super.mo10792ri(activity);
        if (this.jbs == null) {
            return;
        }
        this.jbs.f9382fr.m12021ri();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public final void mo10793ri(Activity activity, Bundle bundle) {
        this.wjv = bundle;
        super.mo10793ri(activity, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.bytedance.sdk.openadsdk.core.model.wjv] */
    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo10794ri(Activity activity, C2858lr.fi fiVar) {
        C3022ri c3022ri;
        this.f8280fr = fiVar;
        Intent intent = activity.getIntent();
        this.f8476vr = intent.getStringExtra("media_extra");
        this.bgr = intent.getStringExtra("user_id");
        try {
            if (ihz == null) {
                ihz = C2729uq.m10311ri(this.jbs.srn, "tt_reward_msg");
                f8276ka = C2729uq.m10311ri(this.jbs.srn, "tt_msgPlayable");
                f8274ac = C2729uq.m10311ri(this.jbs.srn, "tt_negtiveBtnBtnText");
                f8277uq = C2729uq.m10311ri(this.jbs.srn, "tt_postiveBtnText");
                f8275fi = C2729uq.m10311ri(this.jbs.srn, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.EndCardScene", th.getMessage());
        }
        if (fiVar != null && (c3022ri = fiVar.f8429ik) != null) {
            this.jbs.gcp = c3022ri.gcp;
            this.jbs.zyn = c3022ri.zyn;
            if ((this.f8465aw || this.slm) && !m11005ig()) {
                this.jbs.f9401sf.set(c3022ri.f9401sf.get());
            }
            this.jbs.ihz.m12159ri(c3022ri.ihz.m12129fi());
            m10779ri(this.jbs, c3022ri);
        }
        if (this.f8465aw || this.slm) {
            try {
                m10784zf();
            } catch (Throwable unused) {
                feb();
            }
        }
        if (this.jbs != null && this.xha != null) {
            this.jbs.f9414zk = this.xha.f8411ri;
        }
        m10774dw();
        mo10764a_();
        mo10581sf();
        if (!this.f8283ri || this.xha == null || this.xha.m10949ri() == null) {
            return;
        }
        this.xha.m10949ri().m14395fi(this.jbs != null ? this.jbs.jbs.get() : -1);
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public final void mo6180ri(Message message) {
        AbstractC2998lr abstractC2998lr = this.f8281ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11749ri(message);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo10795ri(AbstractC2859mj abstractC2859mj, AbstractC2859mj abstractC2859mj2, C2858lr.fi fiVar) {
        super.mo10795ri(abstractC2859mj, abstractC2859mj2, fiVar);
        C2707ac.m10205ri("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.f8473qt + ",scene = " + this + ",newScene = " + abstractC2859mj2 + ",oldScene = " + abstractC2859mj + ",isPlayable = " + this.slm);
        boolean z = this.f8473qt == abstractC2859mj2.f8473qt + 1;
        if (abstractC2859mj != null && this.jbs != null) {
            this.jbs.zyn = fiVar.f8430ka;
        }
        if (z) {
            C2707ac.m10205ri("TTAD.EndCardScene", "preload index =" + this.f8473qt + ",new index =" + abstractC2859mj2.f8473qt + ",isPlayableProxy = " + this.slm);
            yjm();
        }
        if (abstractC2859mj == null && this.f8283ri) {
            C2707ac.m10205ri("TTAD.EndCardScene", "preload agg-endcard =" + this.f8473qt + ",new index =" + abstractC2859mj2.f8473qt + ",isPlayableProxy = " + this.slm);
            yjm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo10773ri(String str) {
        this.jbs.zyn = !this.jbs.zyn;
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.jbs.zyn);
        sb.append(" mLastVolume=");
        sb.append(this.jbs.f9378dw.m11090ri());
        this.jbs.ihz.m12163ri(this.jbs.zyn, str);
        this.jbs.ory.m12081fi(this.jbs.zyn);
        this.jbs.wjv.m11964lr(this.jbs.zyn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10613ri(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.xha == null || m11005ig()) {
            return;
        }
        if (this.xha != null && this.xha.m10933fr() == null) {
            if (this.xha.m10936ik()) {
                if (this.tan != null && this.tan.m11431ri(C3279dw.m14090ik(this.jbs.f9389lr), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fi.4
                    @Override // java.lang.Runnable
                    public void run() {
                        C2853fi.this.m10783xe();
                    }
                })) {
                    return;
                }
            } else if (m10782ri(C3279dw.m14090ik(this.jbs.f9389lr), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.fi.5
                @Override // java.lang.Runnable
                public void run() {
                    C2853fi.this.m10783xe();
                }
            })) {
                return;
            }
        }
        m10783xe();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10576ri(boolean z) {
        if (this.xha != null) {
            this.xha.m10960ri(this, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public boolean mo10580ri(long j, boolean z) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: sf */
    public final void mo10581sf() {
        if (this.xha == null) {
            return;
        }
        this.jbs.f9409xd.m11902ri(this.f8280fr.f8432ri.getBoolean("isSkip", false), this.f8280fr.f8432ri.getBoolean("force", false), this.f8280fr.f8432ri.getBoolean("isFromLandingPage", false), this.f8281ik, this.f8280fr.f8431lr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public final View slm() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    public void tan() {
        super.tan();
        AbstractC2998lr abstractC2998lr = this.f8281ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11738ac();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: uq */
    public boolean mo10796uq() {
        return this.jbs != null && this.jbs.ihz.m12170xd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: vr */
    public final void mo10584vr() {
    }

    public boolean wjv() {
        return this.jbs.ory.igq();
    }
}
