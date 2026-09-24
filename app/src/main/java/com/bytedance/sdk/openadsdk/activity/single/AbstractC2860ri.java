package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.C2994di;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3010fi;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3019lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.view.C3069ik;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3119ri;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.p236ka.C3423lr;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3577ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3595vr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2860ri extends AbstractC2859mj implements igq.InterfaceC2719ri, C3010fi.ri {

    /* JADX INFO: renamed from: ac */
    private int f8485ac;

    /* JADX INFO: renamed from: ay */
    private boolean f8486ay;

    /* JADX INFO: renamed from: dw */
    private boolean f8487dw;

    /* JADX INFO: renamed from: fi */
    protected boolean f8488fi;

    /* JADX INFO: renamed from: fr */
    private long f8489fr;
    private boolean igq;
    private Bundle ihz;

    /* JADX INFO: renamed from: ik */
    protected int f8490ik;

    /* JADX INFO: renamed from: ka */
    protected boolean f8491ka;

    /* JADX INFO: renamed from: lr */
    protected AbstractC2998lr f8492lr;

    /* JADX INFO: renamed from: ri */
    protected final igq f8493ri;

    /* JADX INFO: renamed from: su */
    private long f8494su;

    /* JADX INFO: renamed from: uq */
    private int f8495uq;
    private boolean wjv;

    /* JADX INFO: renamed from: zf */
    private CountDownTimer f8496zf;

    public AbstractC2860ri(C2858lr c2858lr, wjv wjvVar, int i, int i2, boolean z) {
        super(c2858lr, wjvVar, i, i2, z);
        this.f8493ri = new igq(Looper.getMainLooper(), this);
        this.f8485ac = 1;
        this.f8495uq = 0;
        this.wjv = false;
        this.f8491ka = false;
        aac();
    }

    private void aac() {
        this.igq = C3279dw.m14090ik(this.f8468di) && this.f8468di.biu();
        if (this.igq) {
            this.f8494su = ((long) this.f8468di.m14405gy()) * 1000;
        }
    }

    private void ajz() {
        AbstractC2998lr abstractC2998lr;
        if (this.f8468di.m14383di() || (abstractC2998lr = this.f8492lr) == null) {
            return;
        }
        abstractC2998lr.mo11718ri(this.jbs.dzy.mo12215di());
        this.f8492lr.m11740ay();
    }

    /* JADX INFO: renamed from: pc */
    private void m11032pc() {
        if (this.f8468di.m14383di() && !this.wjv) {
            this.wjv = true;
            mo10791ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ri.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] fArrM12024ri = AbstractC2860ri.this.xha.m10969su() ? new float[]{C3583qd.m16581ik(AbstractC2860ri.this.jbs.f9384ig, AbstractC2860ri.this.jbs.f9396pv.getWidth()), C3583qd.m16581ik(AbstractC2860ri.this.jbs.f9384ig, AbstractC2860ri.this.jbs.f9396pv.getHeight())} : AbstractC2860ri.this.jbs.f9382fr.m12024ri(AbstractC2860ri.this.f8485ac);
                    if (AbstractC2860ri.this.jbs.igq.m11879ri()) {
                        AbstractC2860ri.this.jbs.igq.m11877ri(AbstractC2860ri.this.f8468di);
                    } else {
                        AbstractC2860ri.this.jbs.igq.m11878ri(fArrM12024ri);
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.sdk.openadsdk.activity.single.ri$2] */
    /* JADX INFO: renamed from: ri */
    private void m11035ri(long j) {
        this.f8496zf = new CountDownTimer(j, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.single.ri.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                C2858lr c2858lrJc = AbstractC2860ri.this.m11008jc();
                AbstractC2860ri abstractC2860ri = AbstractC2860ri.this;
                c2858lrJc.m10959ri(abstractC2860ri, abstractC2860ri.m11043ri(8));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                AbstractC2860ri.this.f8494su = j2;
            }
        }.start();
    }

    /* JADX INFO: renamed from: ri */
    private void m11036ri(Activity activity, wjv wjvVar, Bundle bundle) {
        this.jbs = new C3022ri(activity, this.f8493ri, wjvVar, this, 1, this.xha.m10944lr(), this.jbs);
        this.jbs.f9410xe = this.xha.m10929di();
        this.jbs.yjm = this.f8465aw;
        this.jbs.qmx = this.jbs.f9410xe && C3273ac.m13961fi(wjvVar);
        this.jbs.saa = this.xha.m10938ka();
        this.jbs.f9395pc = this.xha.m10926ay();
        this.jbs.ajz = this;
        this.jbs.f9378dw = this.xha.m10970uq();
        Intent intent = activity.getIntent();
        C3019lr.m11954ri(this.jbs, intent, bundle);
        if (intent != null) {
            C3019lr.m11952ri(intent, this.jbs);
            wjvVar.m14489ri(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.jbs.f9398qh) {
            mo10771lr();
        }
        this.f8492lr = C2994di.m11714ri(this.jbs);
        this.jbs.f9391nd = this.f8492lr;
        this.jbs.f9409xd.m11898ri(this);
        if (this.jbs.f9410xe) {
            this.jbs.ihz.m12158ri(new C3119ri.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.ri.1
                @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3119ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo10536ri(int i) {
                    if (AbstractC2860ri.this.xha == null) {
                        return;
                    }
                    AbstractC2860ri.this.xha.m10941lr(AbstractC2860ri.this, i);
                }
            });
            if (!this.xha.m10969su()) {
                this.xha.m10926ay().setShowSound(wjv.m14332fi(wjvVar));
            }
        }
        C3595vr.m16669ri(this.jbs);
        Objects.toString(this.f8492lr);
    }

    /* JADX INFO: renamed from: ri */
    private void m11037ri(C3220lr c3220lr) {
        if (c3220lr != null) {
            HashMap map = new HashMap();
            try {
                int i = this.f8475sf + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            c3220lr.m13536ri(map);
        }
    }

    private boolean saa() {
        if (this.f8468di.m14383di()) {
            return this.jbs.jbs.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: xe */
    private void m11038xe() {
        this.jbs.f9396pv.m12295ri(this.f8492lr);
        this.f8492lr.mo11750ri(this, this.f8493ri);
        this.f8492lr.m11747qt();
    }

    private void yjm() {
        this.f8492lr.m11743fr();
        this.f8490ik = (int) this.jbs.ihz.m12147qd();
        if (this.jbs.f9410xe) {
            m11037ri(this.jbs.f9402su.m11986fi());
            m11037ri(this.jbs.f9402su.m11989ka());
        }
        mo10764a_();
        ajz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ac */
    public void mo10785ac() {
        super.mo10785ac();
        AbstractC2998lr abstractC2998lr = this.f8492lr;
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
    public void bgr() {
        super.bgr();
        if (this.igq) {
            this.f8489fr = System.currentTimeMillis();
            CountDownTimer countDownTimer = this.f8496zf;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        AbstractC2998lr abstractC2998lr = this.f8492lr;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11746nr();
        if (this.jbs.f9374ay != null) {
            this.jbs.f9374ay.m12261mj();
        }
        if (this.xha.m10969su()) {
            this.jbs.f9374ay.m12266ri(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: bu */
    public void mo10557bu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: co */
    public void mo10558co() {
        if (this.xha == null) {
            return;
        }
        this.xha.m10942lr(this, m11043ri(10));
    }

    /* JADX INFO: renamed from: di */
    protected final void m11039di() {
        Message message = new Message();
        message.what = 400;
        if (this.f8468di.m14472qa()) {
            mo10610lr(10000);
        }
        this.f8493ri.sendMessageDelayed(message, 2000L);
    }

    /* JADX INFO: renamed from: dw */
    public void m11040dw() {
        if (this.jbs != null && this.jbs.ihz.jbs()) {
            this.jbs.ihz.ihz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: fi */
    public void mo10561fi() {
        int i = this.f8473qt;
        if (this.xha != null) {
            this.xha.m10958ri(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: fr */
    public boolean mo11004fr() {
        return this.jbs.f9374ay.jbs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    public boolean hcw() {
        return this.f8468di.hpn() == 10 && !mo11004fr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    public void igq() {
        C3069ik c3069ikM12263ri;
        super.igq();
        if (this.jbs == null || (c3069ikM12263ri = this.jbs.f9374ay.m12263ri()) == null || !c3069ikM12263ri.wjv()) {
            return;
        }
        mo10585zb();
    }

    public void ihz() {
        if (this.f8486ay) {
            return;
        }
        this.f8486ay = true;
        whw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ik */
    public void mo10788ik() {
        AbstractC2998lr abstractC2998lr;
        super.mo10788ik();
        if (this.jbs == null || (abstractC2998lr = this.f8492lr) == null) {
            return;
        }
        abstractC2998lr.m11754vr();
        this.jbs.tnn = true;
        if (saa()) {
            this.jbs.f9394oh.m11873ri(this.jbs.f9389lr.nlk());
        }
        this.jbs.dzy.mo12236vr();
        this.jbs.ory.m12075bu();
        this.jbs.wjv.m11958fi();
        if (this.f8492lr.m11756lr()) {
            this.jbs.ihz.m12156ri(this.f8492lr);
            if (this.jbs.ihz.m12128fe()) {
                mo10580ri(this.jbs.ihz.m12169vr(), true);
            } else if (this.jbs.ihz.xha() && this.xha.m10969su()) {
                mo10772pv();
            } else {
                this.jbs.ihz.m12162ri(false, this, this.f8495uq != 0);
            }
        }
        this.f8495uq++;
        m11032pc();
        if (this.jbs.f9374ay != null) {
            this.jbs.f9374ay.xha();
        }
        this.jbs.f9382fr.m12022ri(this.f8493ri);
        if (this.xha.m10969su()) {
            this.jbs.f9374ay.m12266ri(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.igq) {
            long j = this.f8489fr;
            if (j != 0 && jCurrentTimeMillis - j > this.f8494su) {
                m11008jc().m10959ri(this, m11043ri(8));
                return;
            }
            if (j != 0) {
                this.f8494su -= jCurrentTimeMillis - j;
            }
            m11035ri(this.f8494su);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ik */
    public void mo10789ik(boolean z) {
        if (this.jbs == null || this.jbs.f9402su == null) {
            return;
        }
        this.jbs.f9402su.m11991lr(z);
        this.jbs.f9402su.m11988ik(z);
    }

    public com.bytedance.sdk.openadsdk.p236ka.xha jbs() {
        if (!this.f8468di.m14383di()) {
            com.bytedance.sdk.openadsdk.p236ka.xha xhaVar = new com.bytedance.sdk.openadsdk.p236ka.xha();
            xhaVar.m15724ri(System.currentTimeMillis(), 1.0f);
            return xhaVar;
        }
        if (this.jbs != null && this.jbs.f9374ay != null && this.jbs.f9374ay.m12263ri() != null) {
            return this.jbs.f9374ay.m12263ri().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.p236ka.xha xhaVar2 = new com.bytedance.sdk.openadsdk.p236ka.xha();
        xhaVar2.m15724ri(System.currentTimeMillis(), 1.0f);
        return xhaVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ka */
    public void mo10770ka() {
        super.mo10770ka();
        AbstractC2998lr abstractC2998lr = this.f8492lr;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.tan();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ka */
    public void mo10565ka(boolean z) {
        if (this.xha != null) {
            this.xha.m10963ri(this, z);
        }
    }

    /* JADX INFO: renamed from: lr */
    protected abstract void mo10771lr();

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: lr */
    public void mo10611lr(boolean z) {
    }

    /* JADX INFO: renamed from: mj */
    public Map<String, Object> m11041mj() {
        HashMap map = new HashMap();
        if (this.jbs != null && this.jbs.f9374ay != null && this.f8468di != null && this.f8468di.ajz() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.jbs.f9374ay.m12274sf()));
            JSONObject jSONObjectM12264ri = this.jbs.f9374ay.m12264ri((JSONObject) null);
            if (jSONObjectM12264ri != null) {
                Iterator<String> itKeys = jSONObjectM12264ri.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectM12264ri.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: nr */
    protected final void m11042nr() {
        this.f8493ri.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: oh */
    public boolean mo11015oh() {
        return this.jbs.f9374ay.m12262qt() && !mo11004fr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void ory() {
        this.f8491ka = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj, com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: qt */
    public void mo10572qt() {
        super.mo10572qt();
        if (this.f8468di.m14383di()) {
            this.jbs.f9374ay.m12253aw();
        }
    }

    /* JADX INFO: renamed from: ri */
    protected C2858lr.fi m11043ri(int i) {
        C2858lr.fi fiVar = new C2858lr.fi(i, this.jbs);
        fiVar.f8430ka = this.jbs.zyn;
        return fiVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public final C3072mj mo10791ri() {
        return this.jbs.f9396pv;
    }

    /* JADX INFO: renamed from: ri */
    public void m11044ri(float f) {
        if (this.xha == null) {
            return;
        }
        this.xha.m10950ri(f);
        if (this.f8486ay || this.f8468di.m14453nd() == 43 || f < this.f8468di.tnn() / 100.0f) {
            return;
        }
        AbstractC2859mj abstractC2859mjM10933fr = this.xha.m10933fr();
        if (abstractC2859mjM10933fr instanceof AbstractC2860ri) {
            ((AbstractC2860ri) abstractC2859mjM10933fr).ihz();
        }
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
        this.ihz = bundle;
        super.mo10793ri(activity, bundle);
        mo10575ri(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo10794ri(Activity activity, C2858lr.fi fiVar) {
        try {
            this.f8485ac = this.f8468di.bbu();
            m11036ri(activity, this.f8468di, this.ihz);
            if (this.jbs.f9410xe && this.f8468di.biu()) {
                this.jbs.zyn = fiVar.f8430ka;
            }
            if (this.jbs.f9410xe && this.f8473qt > 0) {
                this.jbs.zyn = fiVar.f8430ka;
            }
            m11038xe();
            yjm();
            if (C3273ac.m13961fi(this.f8468di)) {
                m11014nd();
            }
        } catch (Throwable th) {
            C2707ac.m10206ri("TTAD.AdScene", "onCreate: ", th);
            C3521ka.m15939lr();
            feb();
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        AbstractC2998lr abstractC2998lr = this.f8492lr;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11749ri(message);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo10795ri(AbstractC2859mj abstractC2859mj, AbstractC2859mj abstractC2859mj2, C2858lr.fi fiVar) {
        super.mo10795ri(abstractC2859mj, abstractC2859mj2, fiVar);
        if (abstractC2859mj == this && (abstractC2859mj2 instanceof C2853fi)) {
            if (fiVar.f8431lr == 3) {
                this.jbs.ihz.m12150ri(!this.jbs.ihz.m12132ig() ? 1 : 0, 2);
            } else if (fiVar.f8431lr == 6) {
                this.jbs.ihz.m12150ri(!this.jbs.ihz.m12132ig() ? 1 : 0, !this.jbs.ihz.m12132ig() ? 1 : 0);
            } else if (fiVar.f8431lr == 5 && !wjv.m14332fi(this.jbs.f9389lr) && fiVar.f8428fi) {
                this.jbs.ihz.m12160ri("skip", true);
            }
            this.jbs.f9394oh.m11873ri(false);
            this.jbs.f9394oh.m11863ka(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo11018ri(wjv wjvVar, int i, int i2) {
        super.mo11018ri(wjvVar, i, i2);
        aac();
        this.wjv = false;
        this.f8487dw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10613ri(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.xha == null) {
            return;
        }
        this.xha.m10942lr(this, m11043ri(7));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: ri */
    public void mo11019ri(Map<String, Object> map, float f, float f2) {
        super.mo11019ri(map, f, f2);
        this.xha.m10964ri(map, this, f, f2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10576ri(boolean z) {
        int i = this.f8473qt;
    }

    /* JADX INFO: renamed from: ri */
    public final void m11045ri(boolean z, int i) {
        m11046ri(z, false, i);
    }

    /* JADX INFO: renamed from: ri */
    public final void m11046ri(boolean z, boolean z2, int i) {
        this.jbs.f9409xd.m11902ri(z, z2, false, this.jbs.f9391nd, i);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.C3010fi.ri
    /* JADX INFO: renamed from: ri */
    public void mo11047ri(boolean z, boolean z2, boolean z3, AbstractC2998lr abstractC2998lr, int i) {
        m11021ri(z, z2, z3, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public boolean mo10580ri(long j, boolean z) {
        if (this.jbs == null) {
            return false;
        }
        this.jbs.f9374ay.m12260lr(false);
        this.f8488fi = false;
        com.bytedance.sdk.openadsdk.p236ka.xha xhaVarJbs = jbs();
        if (xha() == null) {
            return false;
        }
        this.jbs.ihz.m12154ri(xha(), xhaVarJbs);
        Map<String, Object> mapM11041mj = this.f8468di.m14383di() ? m11041mj() : null;
        InterfaceC1999ik.ri riVar = new InterfaceC1999ik.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.ri.4
            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
            /* JADX INFO: renamed from: lr */
            public void mo6397lr(long j2, int i) {
                AbstractC2860ri.this.jbs.ihz.m12166sf();
                if (AbstractC2860ri.this.jbs.dzy.f9659vr != null) {
                    AbstractC2860ri.this.jbs.dzy.f9659vr.m14005qt();
                }
                if (AbstractC2860ri.this.jbs.ihz.m12126di()) {
                    AbstractC2860ri.this.m11039di();
                    return;
                }
                AbstractC2860ri.this.jbs.ihz.m12121ac();
                if (AbstractC2860ri.this.f8468di.m14383di()) {
                    AbstractC2860ri.this.jbs.f9374ay.m12273ri(true);
                }
                C2858lr c2858lr = AbstractC2860ri.this.xha;
                AbstractC2860ri abstractC2860ri = AbstractC2860ri.this;
                c2858lr.m10959ri(abstractC2860ri, abstractC2860ri.m11043ri(3));
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
            /* JADX INFO: renamed from: ri */
            public void mo6398ri() {
                AbstractC2860ri.this.jbs.ihz.m12166sf();
                AbstractC2860ri.this.m11042nr();
                C2858lr c2858lr = AbstractC2860ri.this.xha;
                AbstractC2860ri abstractC2860ri = AbstractC2860ri.this;
                c2858lr.m10959ri(abstractC2860ri, abstractC2860ri.m11043ri(6));
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
            /* JADX INFO: renamed from: ri */
            public void mo6399ri(long j2, int i) {
                boolean z2 = AbstractC2860ri.this.f8488fi;
                if (AbstractC2860ri.this.f8488fi) {
                    return;
                }
                AbstractC2860ri.this.f8488fi = true;
                boolean zM14383di = AbstractC2860ri.this.f8468di.m14383di();
                AbstractC2860ri.this.f8493ri.removeMessages(300);
                AbstractC2860ri.this.m11042nr();
                AbstractC2860ri.this.jbs.ihz.m12153ri(j2, j2);
                if (zM14383di) {
                    AbstractC2860ri.this.jbs.f9374ay.m12260lr(true);
                } else {
                    AbstractC2860ri.this.jbs.slm.set(true);
                }
                if (AbstractC2860ri.this.jbs.f9389lr.m14453nd() == 36 && AbstractC2860ri.this.jbs.f9385ik) {
                    AbstractC2860ri.this.jbs.f9406uq.m11944ik().mo15239ri(AbstractC2860ri.this.jbs.f9389lr);
                    C3595vr.m16667lr();
                }
                if (!zM14383di && AbstractC2860ri.this.jbs.f9389lr.ovz()) {
                    AbstractC2860ri.this.jbs.f9389lr.m14531ta(1);
                    AbstractC2860ri.this.jbs.dzy.m12304bu();
                }
                if (AbstractC2860ri.this.jbs.f9389lr.m14453nd() == 21 && !AbstractC2860ri.this.jbs.f9389lr.tan()) {
                    AbstractC2860ri.this.jbs.f9389lr.m14399fi(true);
                    AbstractC2860ri.this.jbs.dzy.m12304bu();
                }
                C2858lr.fi fiVarM11043ri = AbstractC2860ri.this.m11043ri(5);
                fiVarM11043ri.f8428fi = true;
                AbstractC2860ri.this.xha.m10959ri(AbstractC2860ri.this, fiVarM11043ri);
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
            /* JADX INFO: renamed from: ri */
            public void mo6400ri(long j2, long j3) {
                if (!AbstractC2860ri.this.jbs.tnn && AbstractC2860ri.this.jbs.ihz.m12126di()) {
                    AbstractC2860ri.this.jbs.ihz.m12142lr(true);
                }
                if (AbstractC2860ri.this.jbs.jbs.get()) {
                    return;
                }
                if (j2 != AbstractC2860ri.this.jbs.ihz.bgr()) {
                    AbstractC2860ri.this.m11042nr();
                }
                if (!AbstractC2860ri.this.jbs.ihz.m12126di()) {
                    AbstractC2860ri.this.f8493ri.removeMessages(300);
                    return;
                }
                AbstractC2860ri.this.jbs.ihz.m12153ri(j2, j3);
                int i = (int) (j2 / 1000);
                if ((AbstractC2860ri.this.jbs.f9375bu.get() || AbstractC2860ri.this.jbs.f9399qt.get()) && AbstractC2860ri.this.jbs.ihz.m12126di()) {
                    AbstractC2860ri.this.jbs.ihz.m12168uq();
                }
                if (AbstractC2860ri.this.jbs.f9387ka) {
                    AbstractC2860ri.this.jbs.dzy.mo12218fi(i);
                }
                if (AbstractC2860ri.this.f8468di.m14383di() && AbstractC2860ri.this.jbs.f9374ay != null && AbstractC2860ri.this.jbs.f9374ay.m12263ri() != null) {
                    AbstractC2860ri.this.jbs.f9374ay.m12263ri().setTime(String.valueOf(AbstractC2860ri.this.f8490ik), i, 0, false);
                    AbstractC2860ri.this.jbs.f9374ay.m12263ri().m12249ri(j2, j3);
                }
                AbstractC2860ri.this.m11044ri((j2 * 1.0f) / j3);
                AbstractC2860ri.this.jbs.m12005ri(true);
            }
        };
        this.jbs.ihz.m12155ri(riVar);
        if (!this.f8468di.m14383di() && this.jbs.dzy.f9659vr != null) {
            this.jbs.dzy.f9659vr.m14010ri(riVar);
        }
        return this.jbs.ihz.m12164ri(j, z, mapM11041mj, this.f8492lr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: sf */
    public final void mo10581sf() {
        AbstractC2998lr abstractC2998lr = this.f8492lr;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.mo11729sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public final View slm() {
        return this.jbs.ihz.m12135jc();
    }

    /* JADX INFO: renamed from: su */
    public void m11048su() {
        m11032pc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    public void tan() {
        super.tan();
        AbstractC2998lr abstractC2998lr = this.f8492lr;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11744lr(this.f8472nr);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj
    /* JADX INFO: renamed from: uq */
    public boolean mo10796uq() {
        return this.jbs != null && this.jbs.ihz.m12170xd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: vr */
    public final void mo10584vr() {
        this.jbs.ihz.srn();
    }

    public void wjv() {
        this.xha.m10959ri(this, m11043ri(C3423lr.lr.f12375lr));
    }

    public abstract FrameLayout xha();

    /* JADX INFO: renamed from: zf */
    public void m11049zf() {
        if (this.jbs == null) {
            return;
        }
        this.jbs.ihz.slm();
    }
}
