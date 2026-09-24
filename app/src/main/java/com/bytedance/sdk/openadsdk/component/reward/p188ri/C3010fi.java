package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj;
import com.bytedance.sdk.openadsdk.activity.single.C2853fi;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.component.reward.view.C3069ik;
import com.bytedance.sdk.openadsdk.component.reward.view.jbs;
import com.bytedance.sdk.openadsdk.component.reward.view.xha;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.jbs.C3232ik;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3139ik;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3423lr;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3010fi {

    /* JADX INFO: renamed from: ik */
    private ri f9324ik;

    /* JADX INFO: renamed from: lr */
    private final xha f9325lr;

    /* JADX INFO: renamed from: ri */
    private final C3022ri f9326ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.fi$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11047ri(boolean z, boolean z2, boolean z3, AbstractC2998lr abstractC2998lr, int i);
    }

    public C3010fi(C3022ri c3022ri) {
        this.f9326ri = c3022ri;
        this.f9325lr = new xha(c3022ri);
    }

    /* JADX INFO: renamed from: di */
    private int m11885di() {
        C3022ri c3022ri = this.f9326ri;
        if (c3022ri != null && c3022ri.f9389lr != null) {
            int iVtj = this.f9326ri.f9389lr.vtj();
            if (C3299nr.m14639ka() == null) {
                return -1;
            }
            int iM14874ri = C3299nr.m14639ka().m14874ri(this.f9326ri.f9389lr.m14545ur());
            if (!m11890ri(iVtj) && !m11890ri(iM14874ri)) {
                return Math.min(m11886lr(iVtj), m11886lr(iM14874ri));
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: lr */
    private int m11886lr(int i) {
        if (i <= 1000) {
            return 1000;
        }
        return (i / 1000) * 1000;
    }

    /* JADX INFO: renamed from: lr */
    private boolean m11887lr(boolean z) {
        C3069ik c3069ikM12263ri;
        if (!C3273ac.m13965ik(this.f9326ri.f9389lr) || (c3069ikM12263ri = this.f9326ri.f9374ay.m12263ri()) == null || c3069ikM12263ri.f9592ka != 0 || z) {
            return true;
        }
        this.f9326ri.f9394oh.m11861ik(false);
        return false;
    }

    /* JADX INFO: renamed from: ri */
    private void m11889ri(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        HashMap map = new HashMap();
        if (this.f9326ri.ory.igq()) {
            i2 = 1;
        } else {
            i2 = !this.f9326ri.ory.bgr() ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i2));
        C3414ik.m15559ri(this.f9326ri.f9389lr, this.f9326ri.f9381fi, z, z2, z3, this.f9326ri.f9384ig.isFinishing(), i, map);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m11890ri(int i) {
        return i < 0 || i > 20000;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m11891fi() {
        return this.f9325lr.m12307fi();
    }

    /* JADX INFO: renamed from: ik */
    public void m11892ik() {
        this.f9325lr.m12309ka();
    }

    /* JADX INFO: renamed from: ka */
    public void m11893ka() {
        m11900ri(true);
    }

    /* JADX INFO: renamed from: lr */
    public void m11894lr() {
        this.f9325lr.m12308ik();
    }

    /* JADX INFO: renamed from: lr */
    public boolean m11895lr(AbstractC2998lr abstractC2998lr) {
        boolean z;
        this.f9326ri.xha = m11885di();
        int i = this.f9326ri.xha;
        if (this.f9326ri.f9389lr.m14356ac()) {
            return false;
        }
        if (this.f9326ri.xha != -1) {
            if (this.f9326ri.xha >= 0) {
                this.f9326ri.f9393nr.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = this.f9326ri.xha;
                this.f9326ri.f9386jc.sendMessage(messageObtain);
                if (!C3279dw.xha(this.f9326ri.f9389lr)) {
                    z = true;
                }
            }
            z = false;
        } else if (this.f9326ri.ajz == null && C3279dw.m14093mj(this.f9326ri.f9389lr) && this.f9326ri.ory.m12073aw()) {
            abstractC2998lr.m11753uq();
            z = false;
        } else {
            abstractC2998lr.m11739aw();
            z = true;
        }
        if (!(this.f9326ri.ory.m12072ac() ? false : z) || this.f9326ri.aac == null || !this.f9326ri.xha()) {
            return true;
        }
        this.f9326ri.aac.mo16373ri(this.f9326ri.xha);
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public void m11896ri() {
        this.f9325lr.m12311ri();
    }

    /* JADX INFO: renamed from: ri */
    void m11897ri(AbstractC2998lr abstractC2998lr) {
        if (wjv.m14334ik(this.f9326ri.f9389lr)) {
            this.f9326ri.ory.m12097ri(8);
            this.f9326ri.hcw.m11830ri(0);
            this.f9326ri.hcw.xha();
        } else {
            this.f9326ri.hcw.m11830ri(8);
            this.f9326ri.ory.m12097ri(0);
            this.f9326ri.ory.ory();
        }
        this.f9326ri.dzy.mo12221ka(8);
        this.f9326ri.dzy.xha();
        if (wjv.m14334ik(this.f9326ri.f9389lr)) {
            this.f9326ri.f9386jc.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        this.f9326ri.ory.m12107ri(this.f9326ri.zyn, true);
        this.f9326ri.ory.m12083ik(true);
        this.f9326ri.ory.m12090lr(true);
        dzy dzyVarJbs = this.f9326ri.ory.jbs();
        if (dzyVarJbs != null) {
            dzyVarJbs.mo13455ri("prerender_page_show", (JSONObject) null);
        }
        if (!C3279dw.m14092lr(this.f9326ri.f9389lr)) {
            this.f9326ri.f9394oh.m11861ik(false);
        }
        C2634di c2634diM12091mj = this.f9326ri.ory.m12091mj();
        if (c2634diM12091mj == null || c2634diM12091mj.getWebView() == null) {
            return;
        }
        c2634diM12091mj.m9768aw();
        c2634diM12091mj.getWebView().resumeTimers();
    }

    /* JADX INFO: renamed from: ri */
    public void m11898ri(ri riVar) {
        this.f9324ik = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m11899ri(AbstractC3217fi abstractC3217fi) {
        this.f9325lr.m12313ri(abstractC3217fi);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ri */
    public void m11900ri(boolean z) {
        if (!wjv.m14336ka(this.f9326ri.f9389lr)) {
            this.f9326ri.ory.m12106ri(false, 408, "end_card_timeout");
        }
        this.f9326ri.ory.m12088lr(C3139ik.m13115ri() ? 1 : 0);
        this.f9326ri.ory.m12097ri(8);
        this.f9326ri.hcw.m11830ri(8);
        this.f9326ri.dzy.mo12221ka(8);
        if (!this.f9326ri.f9389lr.m14576zz()) {
            AbstractC2859mj abstractC2859mj = this.f9326ri.ajz;
            if (abstractC2859mj != null) {
                this.f9325lr.m12312ri(abstractC2859mj.m11008jc().m10948qt());
            }
            this.f9325lr.m12310lr();
        } else if (!this.f9325lr.m12314ri(this.f9326ri.ihz)) {
            this.f9326ri.f9384ig.finish();
        }
        this.f9326ri.dzy.xha();
        if (z) {
            m11895lr(this.f9326ri.f9391nd);
        }
        this.f9326ri.f9394oh.m11861ik(false);
        this.f9326ri.f9402su.m11995ri(this.f9326ri.f9389lr.m14472qa());
    }

    /* JADX INFO: renamed from: ri */
    public void m11901ri(boolean z, AbstractC2998lr abstractC2998lr) {
        this.f9326ri.f9407vr.set(z);
        abstractC2998lr.m11742co();
        this.f9326ri.f9389lr.m14576zz();
        this.f9326ri.f9394oh.m11863ka(false);
        this.f9326ri.f9394oh.m11861ik(false);
        this.f9326ri.ory.wjv();
        if (this.f9326ri.dzy.f9659vr != null) {
            this.f9326ri.dzy.f9659vr.m13999fi();
        }
        this.f9326ri.dzy.mo12219ik();
        if (this.f9326ri.f9374ay != null) {
            this.f9326ri.f9374ay.m12255di();
        }
        if (this.f9326ri.wjv != null) {
            this.f9326ri.wjv.m11960ik(C3020mj.f9356lr);
        }
        if (!TextUtils.isEmpty(wjv.m14346ri(this.f9326ri.srn, this.f9326ri.f9389lr))) {
            com.bytedance.sdk.openadsdk.utils.wjv.m16675ri(this.f9326ri.f9384ig, C3279dw.m14085co(this.f9326ri.f9389lr), this.f9326ri.f9389lr, C3423lr.ri.f12377ik, true);
            return;
        }
        if (wjv.m14334ik(this.f9326ri.f9389lr) && this.f9326ri.hcw != null) {
            this.f9326ri.hcw.m11822di();
        }
        if (wjv.m14350ri(this.f9326ri.f9389lr) || ((!wjv.m14334ik(this.f9326ri.f9389lr) && this.f9326ri.ory.m12079dw()) || !wjv.m14351ri(this.f9326ri.f9389lr, this.f9326ri.ory.m12073aw(), this.f9326ri.ory.m12093oh(), this.f9326ri.hcw.m11821co(), this.f9326ri.ory.m12074ay()))) {
            m11893ka();
            return;
        }
        if (!wjv.m14336ka(this.f9326ri.f9389lr) && !wjv.m14334ik(this.f9326ri.f9389lr)) {
            this.f9326ri.ory.m12106ri(true, 0, (String) null);
        }
        m11895lr(abstractC2998lr);
        m11897ri(abstractC2998lr);
    }

    /* JADX INFO: renamed from: ri */
    public void m11902ri(boolean z, boolean z2, boolean z3, AbstractC2998lr abstractC2998lr, int i) {
        if (this.f9326ri != null) {
            C3366lr.m15165ri().m15173ri("videoForceBreak", this.f9326ri.f9389lr);
            C2897ik.m11144lr(this.f9326ri.f9389lr);
        }
        Objects.toString(abstractC2998lr);
        if (this.f9326ri.f9384ig.isFinishing() || abstractC2998lr == null) {
            return;
        }
        this.f9326ri.dzy.mo12214co();
        if (z2) {
            this.f9326ri.f9376co.set(true);
        }
        if (this.f9326ri.f9412zb && !this.f9326ri.f9373aw.get() && !C3273ac.m13950aw(this.f9326ri.f9389lr) && !C3273ac.m13991sf(this.f9326ri.f9389lr) && (!C3273ac.m13971lr(this.f9326ri.f9389lr) || !this.f9326ri.f9376co.get() || !this.f9326ri.bgr.get())) {
            if ((C3273ac.m13971lr(this.f9326ri.f9389lr) && z3) || !m11887lr(z2)) {
                return;
            }
            if (C3273ac.m13971lr(this.f9326ri.f9389lr) || C3273ac.m13968ka(this.f9326ri.f9389lr) || C3273ac.xha(this.f9326ri.f9389lr)) {
                this.f9326ri.f9394oh.m11861ik(false);
                abstractC2998lr.m11739aw();
                return;
            }
        }
        if (this.f9326ri.f9384ig.isDestroyed() || this.f9326ri.f9384ig.isFinishing()) {
            return;
        }
        if (this.f9326ri.f9389lr.vgs()) {
            jbs jbsVar = this.f9326ri.f9374ay;
            C3232ik brandBannerController = (jbsVar == null || jbsVar.m12263ri() == null) ? null : jbsVar.m12263ri().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.m13658lr();
            }
            this.f9326ri.f9384ig.finish();
            return;
        }
        ri riVar = this.f9324ik;
        if (riVar != null) {
            riVar.mo11047ri(z, z2, z3, abstractC2998lr, i);
            return;
        }
        this.f9326ri.ihz.m12121ac();
        this.f9326ri.ory.m12110uq();
        this.f9326ri.f9399qt.set(false);
        if (!this.f9326ri.yjm || !(this.f9326ri.ajz instanceof C2853fi) || this.f9326ri.ajz.m11005ig()) {
            this.f9326ri.f9401sf.set(false);
        }
        this.f9326ri.f9413zf.m11911ri();
        this.f9326ri.f9394oh.m11873ri(this.f9326ri.f9389lr.nlk());
        if (this.f9326ri.jbs.getAndSet(true)) {
            return;
        }
        if (!C3279dw.m14092lr(this.f9326ri.f9389lr) || !this.f9326ri.luy) {
            m11901ri(z, abstractC2998lr);
            return;
        }
        m11889ri(z, z2, z3, i);
        this.f9326ri.dzy.mo12221ka(8);
        this.f9326ri.f9394oh.m11861ik(true);
        this.f9326ri.wjv.m11967qt();
        C3332vr.m14976ik().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.fi.1
            @Override // java.lang.Runnable
            public void run() {
                C3010fi.this.f9326ri.dzy.mo12219ik();
                if (C3010fi.this.f9326ri.f9374ay != null) {
                    C3010fi.this.f9326ri.f9374ay.m12255di();
                }
            }
        });
    }
}
