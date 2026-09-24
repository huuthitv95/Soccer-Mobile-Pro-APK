package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.C2951ri;
import com.bytedance.sdk.openadsdk.common.bgr;
import com.bytedance.sdk.openadsdk.component.reward.C2985bu;
import com.bytedance.sdk.openadsdk.component.reward.C2987di;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.C2994di;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3019lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3020mj;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3023sf;
import com.bytedance.sdk.openadsdk.component.reward.slm;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3303qd;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.ory;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3423lr;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.utils.C3577ka;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3595vr;
import com.bytedance.sdk.openadsdk.utils.hcw;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements igq.InterfaceC2719ri, InterfaceC3118lr {

    /* JADX INFO: renamed from: ac */
    private int f7994ac;

    /* JADX INFO: renamed from: aw */
    protected boolean f7995aw;
    protected long bgr;

    /* JADX INFO: renamed from: bu */
    private boolean f7996bu;

    /* JADX INFO: renamed from: co */
    protected boolean f7997co;

    /* JADX INFO: renamed from: di */
    boolean f7998di;

    /* JADX INFO: renamed from: fi */
    int f7999fi;

    /* JADX INFO: renamed from: ik */
    protected AbstractC2998lr f8000ik;

    /* JADX INFO: renamed from: ka */
    final igq f8001ka;

    /* JADX INFO: renamed from: lr */
    C3022ri f8002lr;

    /* JADX INFO: renamed from: mj */
    int f8003mj;

    /* JADX INFO: renamed from: nr */
    private int f8004nr;

    /* JADX INFO: renamed from: ri */
    public final String f8005ri;

    /* JADX INFO: renamed from: sf */
    protected boolean f8006sf;
    private final AtomicBoolean slm;
    private final C3023sf.lr tan;

    /* JADX INFO: renamed from: vr */
    protected boolean f8007vr;
    protected hcw xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity$ri */
    private static class RunnableC2767ri implements Runnable {

        /* JADX INFO: renamed from: lr */
        AdSlot f8012lr;

        /* JADX INFO: renamed from: ri */
        boolean f8013ri;

        RunnableC2767ri(boolean z, AdSlot adSlot) {
            this.f8013ri = z;
            this.f8012lr = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8013ri) {
                if (C3578lr.m16535lr()) {
                    C2985bu.m11638ri(C3299nr.m14642ri()).m11793ri(this.f8012lr);
                    return;
                } else {
                    slm.m12192ri(C3299nr.m14642ri()).m12202ri(this.f8012lr);
                    return;
                }
            }
            if (C3578lr.m16535lr()) {
                com.bytedance.sdk.openadsdk.component.reward.xha.m12322ri(C3299nr.m14642ri()).m11793ri(this.f8012lr);
            } else {
                C2987di.m11663ri(C3299nr.m14642ri()).m11673ri(this.f8012lr);
            }
        }
    }

    public TTBaseVideoActivity() {
        this.f8005ri = mo10556ay() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.slm = new AtomicBoolean(false);
        this.f8001ka = new igq(Looper.getMainLooper(), this);
        this.f7996bu = false;
        this.f8004nr = 0;
        this.f8003mj = 1;
        this.tan = new C3023sf.lr();
        this.f8006sf = false;
        this.f7994ac = -1;
    }

    /* JADX INFO: renamed from: ig */
    private void m10550ig() {
        C3097ka c3097kaM14188ri;
        this.f8000ik.m11743fr();
        this.f7999fi = (int) this.f8002lr.ihz.m12147qd();
        if (this.f8007vr) {
            C2951ri.m11401lr(new bgr.C2930ri(this.f8002lr, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.finish();
                }
            }, new C2951ri.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.2
                @Override // com.bytedance.sdk.openadsdk.common.C2951ri.lr
                /* JADX INFO: renamed from: ri */
                public void mo10587ri() {
                    TTBaseVideoActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.common.C2951ri.lr
                /* JADX INFO: renamed from: ri */
                public void mo10588ri(boolean z, int i) {
                    TTBaseVideoActivity.this.m10577ri(z, i);
                }
            }).m11265ri(m10567mj()).m11264ri(jbs()).m11266ri());
        } else {
            wjv();
        }
        bgr();
        C3283ka c3283kaM14473qc = this.f8002lr.f9389lr.m14473qc();
        if (c3283kaM14473qc == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
            return;
        }
        c3097kaM14188ri.m12481ri(0L);
    }

    /* JADX INFO: renamed from: qd */
    private void m10551qd() {
        AbstractC2998lr abstractC2998lr;
        if (this.f8002lr == null || (abstractC2998lr = this.f8000ik) == null) {
            super.onBackPressed();
        } else {
            abstractC2998lr.ihz();
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m10553ri(wjv wjvVar, Bundle bundle) {
        C3022ri c3022ri = new C3022ri(this, this.f8001ka, wjvVar, this, 0, this.f7995aw);
        this.f8002lr = c3022ri;
        C3019lr.m11954ri(c3022ri, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            mo10574ri(intent);
            wjvVar.m14489ri(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.f8002lr.f9398qh) {
            mo10555aw();
        }
        AbstractC2998lr abstractC2998lrM11714ri = C2994di.m11714ri(this.f8002lr);
        this.f8000ik = abstractC2998lrM11714ri;
        this.f8002lr.f9391nd = abstractC2998lrM11714ri;
        C3595vr.m16669ri(this.f8002lr);
        Objects.toString(this.f8000ik);
    }

    private boolean srn() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f8002lr.jbs.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: ac */
    protected void mo10554ac() {
    }

    /* JADX INFO: renamed from: aw */
    protected abstract void mo10555aw();

    /* JADX INFO: renamed from: ay */
    public abstract boolean mo10556ay();

    protected void bgr() {
        if (C3279dw.m14090ik(this.f8002lr.f9389lr)) {
            m10577ri(false, C3423lr.lr.f12374ik);
            return;
        }
        AbstractC2998lr abstractC2998lr = this.f8000ik;
        if (abstractC2998lr != null) {
            abstractC2998lr.mo11718ri(this.f8002lr.dzy.mo12215di());
            this.f8000ik.m11740ay();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: bu */
    public void mo10557bu() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: co */
    public void mo10558co() {
        mo10581sf();
    }

    /* JADX INFO: renamed from: di */
    protected abstract void mo10559di();

    /* JADX INFO: renamed from: dw */
    protected void mo10560dw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: fi */
    public void mo10561fi() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f8002lr == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.igq.m16506fi()) {
            C3583qd.m16592lr((Activity) this);
        }
        if (!C3279dw.m14088fi(this.f8002lr.f9389lr) || this.f8002lr.wjv.m11962ka(C3020mj.f9356lr)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    /* JADX INFO: renamed from: fr */
    public abstract boolean mo10562fr();

    public abstract FrameLayout hcw();

    protected void igq() {
        ory oryVarCmy;
        C3022ri c3022ri = this.f8002lr;
        if (c3022ri == null || c3022ri.f9389lr == null || (oryVarCmy = this.f8002lr.f9389lr.cmy()) == null) {
            return;
        }
        if (oryVarCmy.m14238lr() == 1 || oryVarCmy.m14238lr() == 2) {
            C3022ri c3022ri2 = this.f8002lr;
            this.xha = new hcw(c3022ri2, c3022ri2.f9389lr);
            if (this.f8002lr.ihz != null) {
                this.f8002lr.ihz.m12158ri(this.xha);
            }
        }
    }

    protected void ihz() {
        Message message = new Message();
        message.what = 400;
        if (mo10556ay()) {
            mo10610lr(10000);
        }
        this.f8001ka.sendMessageDelayed(message, 2000L);
    }

    /* JADX INFO: renamed from: ik */
    protected void mo10563ik() {
        setContentView(this.f8002lr.f9396pv);
        this.f8002lr.f9396pv.m12295ri(this.f8000ik);
        this.f8000ik.mo11750ri(this, this.f8001ka);
        this.f8000ik.m11747qt();
    }

    protected abstract com.bytedance.sdk.openadsdk.common.slm jbs();

    /* JADX INFO: renamed from: ka */
    protected abstract void mo10564ka();

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ka */
    public void mo10565ka(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: lr */
    protected void mo10489lr() {
        m10551qd();
    }

    /* JADX INFO: renamed from: lr */
    protected void mo10566lr(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: mj */
    protected boolean m10567mj() {
        return !mo10556ay();
    }

    /* JADX INFO: renamed from: nr */
    protected abstract void mo10568nr();

    /* JADX INFO: renamed from: oh */
    public void mo10569oh() {
        if (!this.f8002lr.f9389lr.siy()) {
            if (!wjv.m14332fi(this.f8002lr.f9389lr)) {
                this.f8002lr.ihz.m12160ri("skip", true);
            }
            finish();
        } else if (!this.f8002lr.f9389lr.m14383di()) {
            this.f8002lr.f9394oh.m11860ik();
        } else if (this.f8002lr.f9374ay.m12274sf() == 1) {
            this.f8002lr.f9394oh.m11860ik();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3022ri c3022ri = this.f8002lr;
        if (c3022ri == null) {
            return;
        }
        c3022ri.f9382fr.m12021ri();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m10551qd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (bundle != null) {
            z = bundle.getBoolean("enable_new_arch", false);
        } else {
            z = getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        }
        this.f7997co = z;
        this.bgr = SystemClock.elapsedRealtime();
        C3299nr.m14641lr(getApplicationContext());
        if (!C3332vr.m14975fi()) {
            finish();
            return;
        }
        wjv wjvVarM11950ri = C3019lr.m11950ri(getIntent(), bundle, this);
        if (wjvVarM11950ri == null) {
            finish();
            return;
        }
        this.f8007vr = C3606fi.m16702qt();
        C3578lr.m16536ri(wjvVarM11950ri);
        this.f7995aw = C3606fi.m16703ri("adapt_decor_size", 0) == 1;
        wjvVarM11950ri.m14413ig(String.valueOf(hashCode()));
        this.f8003mj = wjvVarM11950ri.bbu();
        m10553ri(wjvVarM11950ri, bundle);
        if (bundle != null) {
            C3429qt.m15621ri(wjvVarM11950ri, "activity_recreate", wjvVarM11950ri.m14394fi(), "activity_recreate", null);
        }
        try {
            mo10563ik();
            m10550ig();
        } catch (Throwable th) {
            C2707ac.m10206ri("TTAD.BVA", "onCreate: ", th);
            C3429qt.m15620ri(wjvVarM11950ri, "show_ad_fail", this.f8005ri, "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        toString();
        C3022ri c3022ri = this.f8002lr;
        if (c3022ri == null || this.f8000ik == null) {
            return;
        }
        if (c3022ri.gcp > 0 && this.f8002lr.f9389lr != null && this.f8002lr.f9389lr.feb()) {
            C3414ik.m15564ri(String.valueOf(SystemClock.elapsedRealtime() - this.f8002lr.gcp), this.f8002lr.f9389lr, this.f8005ri, this.f8002lr.ihz.m12129fi());
            this.f8002lr.gcp = 0L;
        }
        this.f8002lr.f9413zf.m11910lr();
        this.f8001ka.removeCallbacksAndMessages(null);
        this.f8000ik.m11738ac();
        C2889fi.m11113ri(this.f8002lr.f9389lr);
        C2897ik.m11144lr(this.f8002lr.f9389lr);
        AdSlot adSlotM14388eb = this.f8002lr.f9389lr.m14388eb();
        if (!this.f8002lr.ihz.m12170xd() && adSlotM14388eb != null && TextUtils.isEmpty(adSlotM14388eb.getBidAdm()) && !this.f8002lr.f9389lr.m14367bl()) {
            C3332vr.m14978lr().post(new RunnableC2767ri(mo10556ay(), adSlotM14388eb));
        }
        C3595vr.m16668ri();
        hcw hcwVar = this.xha;
        if (hcwVar != null) {
            hcwVar.m16422fi();
            this.xha = null;
        }
        this.tan.m12025ri(this);
        C3303qd.m14658ri().m14662ri(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        toString();
        AbstractC2998lr abstractC2998lr = this.f8000ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11746nr();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        C3022ri c3022ri = this.f8002lr;
        if (c3022ri == null || c3022ri.f9389lr == null) {
            return;
        }
        wjv wjvVar = this.f8002lr.f9389lr;
        if (this.jbs && !wjvVar.ojh() && !TextUtils.isEmpty(wjv.m14346ri(this, wjvVar))) {
            finish();
        }
        if (wjvVar.ojh()) {
            wjvVar.m14549vr(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        AbstractC2998lr abstractC2998lr;
        super.onResume();
        toString();
        if (this.f8002lr == null || (abstractC2998lr = this.f8000ik) == null) {
            return;
        }
        abstractC2998lr.m11754vr();
        this.f8002lr.tnn = true;
        this.tan.m12026ri(this, this.f8002lr.bnj, this.f8002lr.siy, this.f7995aw);
        if (srn()) {
            this.f8002lr.f9394oh.m11873ri(this.f8002lr.f9389lr.nlk());
        }
        this.f8002lr.dzy.mo12236vr();
        this.f8002lr.ory.m12075bu();
        this.f8002lr.wjv.m11958fi();
        if (this.f8000ik.m11756lr()) {
            this.f8002lr.ihz.m12156ri(this.f8000ik);
            this.f8002lr.ihz.m12162ri(false, this, this.f8004nr != 0);
        }
        this.f8004nr++;
        tan();
        if (this.f8002lr.f9374ay != null) {
            this.f8002lr.f9374ay.xha();
        }
        this.f8002lr.f9382fr.m12022ri(this.f8001ka);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (this.f8002lr == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (!TextUtils.isEmpty(this.f7989qt)) {
            bundle.putString("single_process_listener_key", this.f7989qt);
        }
        bundle.putBoolean("enable_new_arch", this.f7997co);
        wjv wjvVar = this.f8002lr.f9389lr;
        int iM13348ri = wjvVar != null ? C3197dw.m13337ri().m13348ri(wjvVar) : -1;
        this.f7994ac = iM13348ri;
        C3019lr.m11955ri(this.f8002lr, bundle, iM13348ri);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        toString();
        if (this.f7994ac >= 0) {
            C3197dw.m13337ri().m13341ik(this.f7994ac);
            this.f7994ac = -1;
        }
        C3022ri c3022ri = this.f8002lr;
        if (c3022ri == null) {
            return;
        }
        c3022ri.ory.m12082fr();
        C3577ka.m16532ri(this, this.f8002lr.f9389lr);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        toString();
        AbstractC2998lr abstractC2998lr = this.f8000ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.tan();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C3022ri c3022ri = this.f8002lr;
        if (c3022ri == null || c3022ri.f9402su == null) {
            return;
        }
        this.f8002lr.f9402su.m11991lr(z);
        this.f8002lr.f9402su.m11988ik(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public void ory() {
        this.f8006sf = true;
    }

    /* JADX INFO: renamed from: pv */
    public Map<String, Object> mo10570pv() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: qh */
    public void mo10571qh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: qt */
    public final void mo10572qt() {
        C3022ri c3022ri = this.f8002lr;
        if (c3022ri == null || c3022ri.f9389lr == null || this.f8002lr.f9389lr.srn()) {
            return;
        }
        toString();
        this.f8002lr.f9389lr.m14449mj(true);
        mo10568nr();
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo10573ri(long j, long j2);

    /* JADX INFO: renamed from: ri */
    protected void mo10574ri(Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10575ri(Bundle bundle) {
        if (this.f7997co) {
            if (bundle != null) {
                this.f7989qt = bundle.getString("single_process_listener_key");
            } else if (getIntent() != null) {
                this.f7989qt = getIntent().getStringExtra("single_process_listener_key");
            } else {
                this.f7989qt = "";
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        AbstractC2998lr abstractC2998lr = this.f8000ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11749ri(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public void mo10576ri(boolean z) {
    }

    /* JADX INFO: renamed from: ri */
    public void m10577ri(boolean z, int i) {
        m10579ri(z, false, i);
    }

    /* JADX INFO: renamed from: ri */
    public void m10578ri(boolean z, boolean z2) {
        if (!this.f7997co || TextUtils.isEmpty(this.f7989qt)) {
            return;
        }
        C3197dw.m13337ri().m13357ri(this.f7989qt, z, z2);
    }

    /* JADX INFO: renamed from: ri */
    public void m10579ri(boolean z, boolean z2, int i) {
        AbstractC2998lr abstractC2998lr = this.f8000ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.m11751ri(z, z2, false, i);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: ri */
    protected boolean mo10491ri() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: ri */
    public boolean mo10580ri(long j, boolean z) {
        if (this.f8002lr == null) {
            return false;
        }
        this.slm.set(false);
        com.bytedance.sdk.openadsdk.p236ka.xha xhaVarM12002mj = this.f8002lr.m12002mj();
        FrameLayout frameLayoutHcw = hcw();
        if (frameLayoutHcw == null) {
            return false;
        }
        this.f8002lr.ihz.m12154ri(frameLayoutHcw, xhaVarM12002mj);
        Map<String, Object> mapMo10570pv = mo10570pv();
        InterfaceC1999ik.ri riVar = new InterfaceC1999ik.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.4
            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
            /* JADX INFO: renamed from: lr */
            public void mo6397lr(long j2, int i) {
                TTBaseVideoActivity.this.f8002lr.ihz.m12166sf();
                if (TTBaseVideoActivity.this.f8002lr.dzy != null && TTBaseVideoActivity.this.f8002lr.dzy.f9659vr != null) {
                    TTBaseVideoActivity.this.f8002lr.dzy.f9659vr.m14005qt();
                }
                if (TTBaseVideoActivity.this.f8002lr.ihz.m12126di()) {
                    TTBaseVideoActivity.this.ihz();
                    return;
                }
                TTBaseVideoActivity.this.f8002lr.ihz.m12121ac();
                TTBaseVideoActivity.this.mo10586zf();
                if (TTBaseVideoActivity.this.f8002lr.f9389lr.m14383di()) {
                    TTBaseVideoActivity.this.f8002lr.f9374ay.m12273ri(true);
                }
                if (!TTBaseVideoActivity.this.f8002lr.f9385ik) {
                    TTBaseVideoActivity.this.finish();
                } else {
                    TTBaseVideoActivity.this.m10579ri(false, true, 3);
                    TTBaseVideoActivity.this.f8002lr.ihz.m12150ri(1 ^ (TTBaseVideoActivity.this.f8002lr.ihz.m12132ig() ? 1 : 0), 2);
                }
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
            /* JADX INFO: renamed from: ri */
            public void mo6398ri() {
                TTBaseVideoActivity.this.f8002lr.ihz.m12166sf();
                TTBaseVideoActivity.this.m10583uq();
                TTBaseVideoActivity.this.mo10586zf();
                if (TTBaseVideoActivity.this.f8002lr.f9385ik) {
                    TTBaseVideoActivity.this.m10579ri(false, true, 6);
                } else {
                    TTBaseVideoActivity.this.finish();
                }
                TTBaseVideoActivity.this.f8002lr.ihz.m12150ri(!TTBaseVideoActivity.this.f8002lr.ihz.m12132ig() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.f8002lr.ihz.m12132ig() ? 1 : 0));
                TTBaseVideoActivity.this.f8002lr.ihz.m12121ac();
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
            /* JADX INFO: renamed from: ri */
            public void mo6399ri(long j2, int i) {
                TTBaseVideoActivity.this.slm.get();
                if (TTBaseVideoActivity.this.slm.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.slm.set(true);
                TTBaseVideoActivity.this.m10583uq();
                TTBaseVideoActivity.this.mo10586zf();
                TTBaseVideoActivity.this.f8002lr.ihz.m12153ri(j2, j2);
                if (TTBaseVideoActivity.this.mo10582su()) {
                    TTBaseVideoActivity.this.f8002lr.f9374ay.m12260lr(true);
                } else {
                    TTBaseVideoActivity.this.f8002lr.slm.set(true);
                }
                TTBaseVideoActivity.this.mo10560dw();
                if (TTBaseVideoActivity.this.f8002lr.f9389lr.m14453nd() == 36 && TTBaseVideoActivity.this.f8002lr.f9385ik) {
                    TTBaseVideoActivity.this.f8002lr.f9406uq.m11944ik().mo15239ri(TTBaseVideoActivity.this.f8002lr.f9389lr);
                    C3595vr.m16667lr();
                }
                if (!TTBaseVideoActivity.this.mo10582su() && TTBaseVideoActivity.this.f8002lr.f9389lr.ovz()) {
                    TTBaseVideoActivity.this.f8002lr.f9389lr.m14531ta(1);
                    TTBaseVideoActivity.this.f8002lr.dzy.m12304bu();
                }
                if (TTBaseVideoActivity.this.f8002lr.f9389lr.m14453nd() == 21 && !TTBaseVideoActivity.this.f8002lr.f9389lr.tan()) {
                    TTBaseVideoActivity.this.f8002lr.f9389lr.m14399fi(true);
                    TTBaseVideoActivity.this.f8002lr.dzy.m12304bu();
                }
                if (TTBaseVideoActivity.this.f8006sf && TTBaseVideoActivity.this.f8002lr.f9374ay.m12254co()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.mo10582su()) {
                    if (C3273ac.m13968ka(TTBaseVideoActivity.this.f8002lr.f9389lr) || C3273ac.m13971lr(TTBaseVideoActivity.this.f8002lr.f9389lr) || C3273ac.xha(TTBaseVideoActivity.this.f8002lr.f9389lr)) {
                        TTBaseVideoActivity.this.m10577ri(false, 5);
                        if (!C3273ac.m13971lr(TTBaseVideoActivity.this.f8002lr.f9389lr) || TTBaseVideoActivity.this.f8002lr.aac == null) {
                            return;
                        }
                        TTBaseVideoActivity.this.f8002lr.aac.mo16373ri(0L);
                        return;
                    }
                    if (C3273ac.m13987ri(TTBaseVideoActivity.this.f8002lr.f9389lr) && !TTBaseVideoActivity.this.f8002lr.f9373aw.get()) {
                        TTBaseVideoActivity.this.f8002lr.m12005ri(true);
                        TTBaseVideoActivity.this.f8002lr.f9394oh.m11859fi(true);
                        return;
                    }
                }
                if (!TTBaseVideoActivity.this.f8002lr.f9385ik) {
                    TTBaseVideoActivity.this.mo10569oh();
                    return;
                }
                if (TTBaseVideoActivity.this.f8002lr.f9389lr.siy()) {
                    if (!TTBaseVideoActivity.this.mo10582su()) {
                        TTBaseVideoActivity.this.f8002lr.f9394oh.m11860ik();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.f8002lr.f9374ay.m12274sf() == 1) {
                            TTBaseVideoActivity.this.f8002lr.f9394oh.m11860ik();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.m10577ri(false, 5);
                if (!TTBaseVideoActivity.this.mo10582su() && C3273ac.m13971lr(TTBaseVideoActivity.this.f8002lr.f9389lr) && TTBaseVideoActivity.this.f8002lr.aac != null) {
                    TTBaseVideoActivity.this.f8002lr.aac.mo16373ri(0L);
                }
                if (wjv.m14332fi(TTBaseVideoActivity.this.f8002lr.f9389lr)) {
                    return;
                }
                TTBaseVideoActivity.this.f8002lr.ihz.m12160ri("skip", true);
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.ri
            /* JADX INFO: renamed from: ri */
            public void mo6400ri(long j2, long j3) {
                if (!TTBaseVideoActivity.this.f8002lr.tnn && TTBaseVideoActivity.this.f8002lr.ihz.m12126di()) {
                    TTBaseVideoActivity.this.f8002lr.ihz.m12168uq();
                }
                if (TTBaseVideoActivity.this.f8002lr.jbs.get()) {
                    return;
                }
                if (j2 != TTBaseVideoActivity.this.f8002lr.ihz.bgr()) {
                    TTBaseVideoActivity.this.m10583uq();
                }
                if (TTBaseVideoActivity.this.mo10582su() && !TTBaseVideoActivity.this.f8002lr.ihz.m12126di()) {
                    TTBaseVideoActivity.this.f8001ka.removeMessages(300);
                    return;
                }
                TTBaseVideoActivity.this.f8002lr.ihz.m12153ri(j2, j3);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                long j4 = j2 / 1000;
                tTBaseVideoActivity.f7999fi = (int) (tTBaseVideoActivity.f8002lr.ihz.m12147qd() - j4);
                int i = (int) j4;
                if ((TTBaseVideoActivity.this.f8002lr.f9375bu.get() || TTBaseVideoActivity.this.f8002lr.f9399qt.get()) && TTBaseVideoActivity.this.f8002lr.ihz.m12126di()) {
                    TTBaseVideoActivity.this.f8002lr.ihz.m12168uq();
                }
                if (TTBaseVideoActivity.this.mo10556ay()) {
                    TTBaseVideoActivity.this.f8002lr.dzy.mo12218fi(i);
                }
                if (!TTBaseVideoActivity.this.mo10562fr()) {
                    TTBaseVideoActivity.this.mo10573ri(j2, j3);
                    return;
                }
                if (TTBaseVideoActivity.this.f8002lr.ihz.m12137ka()) {
                    if (TTBaseVideoActivity.this.xha != null) {
                        TTBaseVideoActivity.this.xha.m16426ri(j2);
                    }
                } else if (TTBaseVideoActivity.this.xha == null || !TTBaseVideoActivity.this.xha.m16427ri()) {
                    TTBaseVideoActivity.this.mo10573ri(j2, j3);
                }
            }
        };
        this.f8002lr.ihz.m12155ri(riVar);
        if (!this.f8002lr.f9389lr.m14383di() && this.f8002lr.dzy != null && this.f8002lr.dzy.f9659vr != null) {
            this.f8002lr.dzy.f9659vr.m14010ri(riVar);
        }
        boolean zM12164ri = this.f8002lr.ihz.m12164ri(j, z, mapMo10570pv, this.f8000ik);
        mo10566lr(zM12164ri, z);
        return zM12164ri;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public List<wjv> rzk() {
        return this.f8002lr.f9389lr.lsq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: sf */
    public void mo10581sf() {
        AbstractC2998lr abstractC2998lr = this.f8000ik;
        if (abstractC2998lr == null) {
            return;
        }
        abstractC2998lr.mo11729sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    public View slm() {
        return this.f8002lr.ihz.m12135jc();
    }

    /* JADX INFO: renamed from: su */
    public boolean mo10582su() {
        return false;
    }

    protected void tan() {
        if (mo10582su() && !this.f7996bu) {
            this.f7996bu = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.f8002lr.igq.m11878ri(TTBaseVideoActivity.this.f8002lr.f9382fr.m12024ri(TTBaseVideoActivity.this.f8003mj));
                    TTBaseVideoActivity.this.mo10554ac();
                }
            });
        }
    }

    /* JADX INFO: renamed from: uq */
    protected void m10583uq() {
        this.f8001ka.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: vr */
    public void mo10584vr() {
        this.f8002lr.ihz.srn();
    }

    protected abstract void wjv();

    protected void xha() {
        if (C3606fi.m16701mj() && isChangingConfigurations()) {
            C2707ac.m10205ri("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.f7998di) {
            C2707ac.m10205ri("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.f7998di = true;
        C3022ri c3022ri = this.f8002lr;
        wjv wjvVar = c3022ri != null ? c3022ri.f9389lr : null;
        if (wjvVar != null && !wjvVar.feb()) {
            long jJbs = wjvVar.jbs();
            if (jJbs > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jJbs;
                if (jElapsedRealtime > 0) {
                    wjvVar.m14439lr(jElapsedRealtime);
                }
            }
            this.f8002lr.m12004ri(BackupConstant.CLOSE_NOT_SHOW_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1003);
            this.f8002lr.f9402su.m11993ri();
        }
        mo10559di();
        mo10564ka();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr
    /* JADX INFO: renamed from: zb */
    public void mo10585zb() {
        this.f8002lr.f9402su.m11993ri();
    }

    /* JADX INFO: renamed from: zf */
    protected void mo10586zf() {
    }
}
