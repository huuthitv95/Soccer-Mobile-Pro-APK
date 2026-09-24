package com.bytedance.sdk.openadsdk.component.reward.p187lr;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.activity.single.AbstractC2859mj;
import com.bytedance.sdk.openadsdk.activity.single.AbstractC2860ri;
import com.bytedance.sdk.openadsdk.activity.single.C2858lr;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3020mj;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.top.C3060ik;
import com.bytedance.sdk.openadsdk.component.reward.view.C3070ka;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.EnumC3106ri;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.xha;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.core.widget.C3337di;
import com.bytedance.sdk.openadsdk.core.widget.C3353sf;
import com.bytedance.sdk.openadsdk.core.widget.DialogC3342lr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2879di;
import com.bytedance.sdk.openadsdk.p236ka.C3423lr;
import com.bytedance.sdk.openadsdk.p236ka.C3429qt;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2998lr extends C2999ri {

    /* JADX INFO: renamed from: aw */
    private InterfaceC2879di f9194aw;

    /* JADX INFO: renamed from: co */
    public DialogC3342lr f9195co;

    /* JADX INFO: renamed from: sf */
    protected AbstractC3217fi f9196sf;

    public AbstractC2998lr(C3022ri c3022ri) {
        super(c3022ri);
    }

    /* JADX INFO: renamed from: ik */
    private void m11730ik(C3022ri c3022ri) {
        if (c3022ri.dzy == null || c3022ri.dzy.mo12226qt() == null) {
            return;
        }
        c3022ri.dzy.mo12226qt().performClick();
    }

    /* JADX INFO: renamed from: ka */
    private void m11731ka(C3022ri c3022ri) {
        if (c3022ri.f9394oh != null) {
            c3022ri.f9394oh.m11862ka();
        }
    }

    /* JADX INFO: renamed from: lr */
    private boolean m11732lr(C3022ri c3022ri) {
        return c3022ri.dzy != null && c3022ri.dzy.jbs();
    }

    /* JADX INFO: renamed from: ri */
    private int m11733ri(C3022ri c3022ri) {
        if (C3279dw.m14090ik(c3022ri.f9389lr)) {
            return c3022ri.f9389lr.m14563ye();
        }
        return c3022ri.f9387ka ? c3022ri.f9389lr.plm() : c3022ri.f9389lr.mhp();
    }

    /* JADX INFO: renamed from: ri */
    protected static FrameLayout m11734ri(Context context) {
        C3192ik c3192ik = new C3192ik(context);
        c3192ik.setId(slm.f13255aw);
        c3192ik.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        c3192ik.setLayoutParams(layoutParams);
        return c3192ik;
    }

    /* JADX INFO: renamed from: ri */
    private void m11735ri(long j, long j2) {
        long j3 = j2 - j;
        if (this.f9207ri.f9384ig instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) this.f9207ri.f9384ig).m10693ik(j3, j2);
        }
    }

    /* JADX INFO: renamed from: ri */
    static void m11736ri(FrameLayout frameLayout, final C3022ri c3022ri) {
        final C3193ka c3193ka;
        Context context = frameLayout.getContext();
        if (c3022ri.f9412zb) {
            C3192ik c3192ik = new C3192ik(context);
            c3192ik.setId(slm.f13259co);
            frameLayout.addView(c3192ik, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutM11734ri = m11734ri(context);
            String strM14220ri = "";
            if (wjv.m14332fi(c3022ri.f9389lr)) {
                C1997lr c1997lrM14389eu = c3022ri.f9389lr.m14389eu();
                if (c1997lrM14389eu != null) {
                    strM14220ri = c1997lrM14389eu.m6357qt();
                }
            } else {
                List<C3286nr> listRbz = c3022ri.f9389lr.rbz();
                if (listRbz != null && !listRbz.isEmpty()) {
                    strM14220ri = listRbz.get(0).m14220ri();
                }
            }
            if (TextUtils.isEmpty(strM14220ri)) {
                c3193ka = null;
            } else {
                c3193ka = new C3193ka(context);
                c3193ka.setId(slm.f13254ar);
                c3193ka.setTag(slm.f13254ar, strM14220ri);
                c3193ka.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutM11734ri.addView(c3193ka);
            }
            c3192ik.addView(frameLayoutM11734ri);
            c3192ik.addView(new C3353sf(context), new FrameLayout.LayoutParams(-1, -1));
            C3070ka c3070ka = new C3070ka(context);
            c3070ka.setId(slm.bgr);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(c3070ka, layoutParams);
            c3070ka.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.lr.lr.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = c3022ri.f9396pv.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = c3022ri.f9396pv.findViewById(slm.hqg);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = c3022ri.f9396pv.findViewById(slm.f13308vk);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    C3193ka c3193ka2 = c3193ka;
                    if (c3193ka2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = c3193ka2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            c3193ka.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            C3191fi c3191fi = new C3191fi(context);
            c3191fi.setId(slm.f13309vr);
            c3191fi.setOrientation(1);
            c3191fi.setVisibility(8);
            frameLayout.addView(c3191fi, new FrameLayout.LayoutParams(-1, -1));
        }
        if (c3022ri.f9388kt) {
            C2634di c2634di = new C2634di(context, true, C2634di.ik.ENDCARD);
            c2634di.setId(slm.slm);
            c2634di.setLayerType(2, null);
            c2634di.setVisibility(4);
            boolean zM13958di = C3273ac.m13958di(c3022ri.f9389lr);
            boolean zM13956co = C3273ac.m13956co(c3022ri.f9389lr);
            if (c3022ri.hpn || !(zM13958di || zM13956co)) {
                frameLayout.addView(c2634di, new FrameLayout.LayoutParams(-1, -1));
            } else {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = C3583qd.m16589lr(c3022ri.srn, 58.0f);
                frameLayout.addView(c2634di, layoutParams2);
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(slm.f13257bu);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (C3279dw.m14092lr(c3022ri.f9389lr)) {
                C3192ik c3192ik2 = new C3192ik(context);
                c3192ik2.setId(slm.cgm);
                c3192ik2.setVisibility(4);
                frameLayout.addView(c3192ik2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m11737ri(C3022ri c3022ri, int i) {
        if (i == -1) {
            return false;
        }
        return (!c3022ri.jbs.get() || C3279dw.m14090ik(c3022ri.f9389lr)) && ((c3022ri.ihz != null && (c3022ri.ihz.bgr() > (((long) i) * 1000) ? 1 : (c3022ri.ihz.bgr() == (((long) i) * 1000) ? 0 : -1)) >= 0) || (c3022ri.wjv != null && c3022ri.wjv.m11961ka()));
    }

    /* JADX INFO: renamed from: ac */
    public void m11738ac() {
        m11744lr(false);
    }

    /* JADX INFO: renamed from: aw */
    public void m11739aw() {
        if (this.f9207ri.xha()) {
            this.f9207ri.f9394oh.m11858fi();
            if (this.f9207ri.f9410xe && (this.f9207ri.ajz instanceof AbstractC2860ri)) {
                return;
            }
            this.f9207ri.dzy.mo12216di(0);
        }
    }

    /* JADX INFO: renamed from: ay */
    public void m11740ay() {
        if (!mo11716fi() && (this instanceof xha)) {
            this.f9207ri.f9402su.m11990lr();
            return;
        }
        if (!this.jbs.mo10580ri(this.f9201fi.m12169vr(), false)) {
            this.f9207ri.ihz.m12166sf();
            if (this.f9207ri.f9410xe && (this.f9207ri.ajz instanceof AbstractC2860ri)) {
                ((AbstractC2860ri) this.f9207ri.ajz).wjv();
            } else {
                m11748ri(C3423lr.lr.f12376ri);
                this.f9201fi.m12150ri(!this.f9201fi.m12132ig() ? 1 : 0, 4);
            }
        }
        if (this.f9207ri == null || this.f9207ri.f9389lr == null || this.f9207ri.aac == null || !this.f9207ri.f9389lr.vgs()) {
            return;
        }
        this.f9207ri.aac.mo16373ri(this.f9207ri.ihz.igq());
    }

    public void bgr() {
        if (this.f9206qt != null) {
            this.f9206qt.removeMessages(300);
        }
    }

    /* JADX INFO: renamed from: bu */
    public void m11741bu() {
        if (!this.f9207ri.f9399qt.get() && this.f9207ri.jbs.get() && this.f9207ri.f9393nr.getAndSet(false)) {
            if (this.f9207ri.xha >= 0 || this.f9207ri.xha == -1) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                messageObtain.arg1 = this.f9207ri.xha;
                this.f9207ri.f9386jc.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: renamed from: co */
    public void m11742co() {
        DialogC3342lr dialogC3342lr = this.f9195co;
        if (dialogC3342lr == null || !dialogC3342lr.isShowing()) {
            return;
        }
        this.f9195co.dismiss();
    }

    /* JADX INFO: renamed from: di */
    public abstract void mo11715di();

    /* JADX INFO: renamed from: fi */
    public abstract boolean mo11716fi();

    /* JADX INFO: renamed from: fr */
    public void m11743fr() {
        m11755ik();
        if (!this.f9207ri.f9389lr.m14576zz() && igq()) {
            m11752su();
        }
        if (igq()) {
            this.f9207ri.f9409xd.m11894lr();
        }
        if (C3273ac.m13968ka(this.f9207ri.f9389lr) || C3273ac.xha(this.f9207ri.f9389lr)) {
            this.f9206qt.sendEmptyMessageDelayed(500, 100L);
        }
        this.f9207ri.dzy.mo12233ri(this.f9207ri.siy == 100.0f);
        wjv();
        mo11715di();
    }

    protected boolean igq() {
        return true;
    }

    public void ihz() {
        if (!this.f9207ri.wjv.m11972sf() && C3299nr.m14639ka().ihz(String.valueOf(this.f9207ri.f9377di)) == 1) {
            int iM11733ri = m11733ri(this.f9207ri);
            if (m11732lr(this.f9207ri)) {
                m11730ik(this.f9207ri);
            } else if (m11737ri(this.f9207ri, iM11733ri)) {
                m11731ka(this.f9207ri);
            }
        }
    }

    public View jbs() {
        xha xhaVar;
        if (this.f9204lr.jxw() != 5) {
            xhaVar = new xha(this.f9207ri.f9384ig);
            xhaVar.setId(slm.ugd);
        } else {
            xhaVar = null;
        }
        Objects.toString(xhaVar);
        return xhaVar;
    }

    /* JADX INFO: renamed from: ka */
    public abstract boolean mo11717ka();

    /* JADX INFO: renamed from: lr */
    public void m11744lr(boolean z) {
        try {
            if (this.f9207ri.f9374ay != null && !z) {
                this.f9207ri.f9374ay.m12255di();
            }
            if (this.f9207ri.dzy != null) {
                this.f9207ri.dzy.bgr();
            }
            this.f9207ri.ihz.dzy();
            if (!mo11717ka()) {
                this.f9207ri.jbs.get();
            }
            if (this.f9207ri.ory != null) {
                this.f9207ri.ory.m12108sf();
            }
            if (this.f9207ri.wjv != null) {
                this.f9207ri.wjv.m11960ik(C3020mj.f9357ri);
            }
            if (this.f9207ri.dzy != null) {
                this.f9207ri.dzy.mo12214co();
            }
            if (this.f9207ri.f9409xd != null) {
                this.f9207ri.f9409xd.m11892ik();
            }
            if (this.f9207ri.aac != null) {
                this.f9207ri.aac.mo16370ik();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: mj */
    public View m11745mj() {
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial;
        C3192ik c3192ik = new C3192ik(this.f9207ri.f9384ig);
        c3192ik.setId(slm.udw);
        C3193ka c3193kaM14999lr = C3337di.m14999lr(this.f9207ri.f9384ig);
        c3193kaM14999lr.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = C3583qd.m16589lr(this.f9207ri.f9384ig, 20.0f);
        layoutParams.rightMargin = C3583qd.m16589lr(this.f9207ri.f9384ig, 16.0f);
        c3193kaM14999lr.setLayoutParams(layoutParams);
        c3193kaM14999lr.setContentDescription(C2729uq.m10311ri(this.f9207ri.f9384ig, "tt_ad_close_text"));
        c3193kaM14999lr.setVisibility(8);
        if (this.f9207ri.ajz == null || !this.f9207ri.ajz.m11008jc().m10969su()) {
            pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f9207ri.f9384ig, this.f9207ri.f9389lr);
            pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, C3583qd.m16589lr(this.f9207ri.f9384ig, 14.0f));
            layoutParams2.gravity = 8388691;
            pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            pAGLogoViewCreatePAGLogoViewByMaterial = null;
        }
        C3193ka c3193ka = new C3193ka(this.f9207ri.f9384ig);
        c3193ka.setId(slm.hqg);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C3583qd.m16589lr(this.f9207ri.f9384ig, 32.0f), C3583qd.m16589lr(this.f9207ri.f9384ig, 14.0f));
        layoutParams3.gravity = 8388693;
        c3193ka.setLayoutParams(layoutParams3);
        c3193ka.setPadding(C3583qd.m16589lr(this.f9207ri.f9384ig, 9.0f), 0, C3583qd.m16589lr(this.f9207ri.f9384ig, 9.0f), 0);
        c3193ka.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (pAGLogoViewCreatePAGLogoViewByMaterial != null) {
            c3192ik.addView(pAGLogoViewCreatePAGLogoViewByMaterial);
        }
        c3192ik.addView(c3193ka);
        if (!this.f9207ri.f9389lr.zyn() || !this.f9207ri.f9410xe || this.f9207ri.f9400ri != 1) {
            C3060ik c3060ik = new C3060ik(this.f9207ri.f9384ig);
            c3060ik.setId(slm.f13272gz);
            c3060ik.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            c3192ik.addView(c3060ik);
        }
        c3192ik.addView(c3193kaM14999lr);
        return c3192ik;
    }

    /* JADX INFO: renamed from: nr */
    public void m11746nr() {
        if (this.f9207ri == null) {
            return;
        }
        try {
            this.f9207ri.tnn = false;
            boolean z = this.f9207ri.tnn;
            boolean z2 = this.f9207ri.zyn;
            if (!this.f9207ri.f9399qt.get()) {
                this.f9207ri.ihz.slm();
            }
            bgr();
            this.f9207ri.ory.slm();
            this.f9207ri.wjv.m11966mj();
            this.f9207ri.tan.set(true);
            if (this.f9207ri.jbs.get()) {
                this.f9207ri.f9393nr.set(true);
            }
            if (this.f9207ri.aac != null) {
                this.f9207ri.aac.mo16371lr();
            }
            this.f9207ri.m11998fi();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: qt */
    public void m11747qt() {
        this.f9207ri.f9382fr.m12023ri(this.f9207ri.f9387ka);
        this.f9207ri.dzy.mo12222lr();
        this.f9207ri.f9409xd.m11896ri();
        if (!this.f9207ri.f9389lr.m14576zz()) {
            this.f9207ri.ory.m12095ri();
            this.f9207ri.hcw.m11829ri();
        }
        this.f9207ri.wjv.xha();
        this.f9207ri.f9394oh.m11866ri();
        if (C3279dw.m14086di(this.f9207ri.f9389lr)) {
            this.f9207ri.dzy.mo12220ka();
            C3583qd.m16612ri((View) this.f9207ri.ory.m12091mj(), 4);
        }
        if (C3273ac.m13968ka(this.f9207ri.f9389lr) || C3273ac.m13971lr(this.f9207ri.f9389lr) || C3273ac.xha(this.f9207ri.f9389lr)) {
            return;
        }
        this.f9207ri.dzy.mo12229ri(C3583qd.m16589lr(this.f9207ri.srn, this.f9207ri.whw), C3583qd.m16589lr(this.f9207ri.srn, this.f9207ri.f9411xm));
        this.f9207ri.f9406uq.m11946ri();
        if (this.f9207ri.f9404tw) {
            this.f9207ri.dzy.mo12228ri(0);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11748ri(int i) {
        this.f9201fi.m12121ac();
        m11751ri(false, true, false, i);
        if (this.f9207ri.f9387ka) {
            this.jbs.mo10610lr(10000);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11749ri(Message message) {
        C3097ka c3097kaM14188ri;
        int i = message.what;
        int i2 = message.what;
        if (i2 == 1) {
            m11753uq();
            return;
        }
        if (i2 == 300) {
            if (this.f9207ri.f9410xe && (this.f9207ri.ajz instanceof AbstractC2860ri)) {
                ((AbstractC2860ri) this.f9207ri.ajz).wjv();
            } else {
                m11748ri(C3423lr.lr.f12375lr);
                this.f9207ri.ihz.m12150ri(!this.f9207ri.ihz.m12132ig() ? 1 : 0, 1 ^ (this.f9207ri.ihz.m12132ig() ? 1 : 0));
            }
            C3429qt.m15620ri(this.f9207ri.f9389lr, "play_video_time_out", this.f9207ri.f9381fi, (String) null);
            C3283ka c3283kaM14473qc = this.f9207ri.f9389lr.m14473qc();
            if (c3283kaM14473qc != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                c3097kaM14188ri.m12484ri(EnumC3106ri.GENERAL_LINEAR_AD_ERROR);
            }
            if (this.f9207ri.dzy == null || this.f9207ri.dzy.f9659vr == null) {
                return;
            }
            this.f9207ri.dzy.f9659vr.m14005qt();
            return;
        }
        if (i2 == 400) {
            this.f9207ri.ihz.m12121ac();
            m11751ri(false, true, false, 3);
            return;
        }
        if (i2 == 500) {
            if (!C3279dw.m14088fi(this.f9207ri.f9389lr)) {
                this.f9207ri.f9394oh.m11861ik(false);
            }
            C2634di c2634diM12091mj = this.f9207ri.ory.m12091mj();
            if (c2634diM12091mj != null && c2634diM12091mj.getWebView() != null) {
                c2634diM12091mj.m9768aw();
                c2634diM12091mj.getWebView().resumeTimers();
            }
            if (this.f9207ri.ory.m12091mj() != null) {
                this.f9207ri.ory.m12096ri(1.0f);
                this.f9207ri.dzy.mo12227ri(1.0f);
            }
            if (!this.f9207ri.f9389lr.m14472qa() && this.f9207ri.ihz.m12126di() && this.f9207ri.f9407vr.get()) {
                this.f9207ri.ihz.m12121ac();
                return;
            }
            return;
        }
        if (i2 == 600) {
            m11739aw();
            return;
        }
        if (i2 == 700) {
            int i3 = message.arg1;
            if (this.f9207ri.f9393nr.get()) {
                return;
            }
            if (i3 <= 0) {
                this.f9206qt.removeMessages(700);
                if (!C3279dw.xha(this.f9204lr)) {
                    m11739aw();
                    return;
                } else if (this.f9207ri.wjv.m11965lr() || !this.f9207ri.ory.m12073aw()) {
                    m11739aw();
                    return;
                } else {
                    m11753uq();
                    return;
                }
            }
            this.f9207ri.f9394oh.m11864lr();
            this.f9207ri.f9394oh.m11870ri((CharSequence) ((i3 / 1000) + CmcdData.Factory.STREAMING_FORMAT_SS));
            this.f9207ri.f9394oh.m11859fi(false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 700;
            messageObtain.arg1 = i3 - 1000;
            this.f9207ri.xha -= 1000;
            this.f9206qt.sendMessageDelayed(messageObtain, 1000L);
            return;
        }
        if (i2 == 800) {
            if (!C3279dw.m14092lr(this.f9207ri.f9389lr)) {
                this.f9207ri.f9394oh.m11861ik(false);
            }
            this.f9207ri.dzy.mo12227ri(1.0f);
            if (!this.f9207ri.f9389lr.m14472qa() && this.f9207ri.ihz.m12126di() && this.f9207ri.f9407vr.get()) {
                this.f9207ri.ihz.m12121ac();
                return;
            }
            return;
        }
        if (i2 == 900 && !this.f9207ri.tan.get()) {
            int i4 = message.arg1;
            double dM12147qd = this.f9207ri.ihz.m12147qd();
            m11735ri(i4, (long) (1000.0d * dM12147qd));
            if (i4 <= 0) {
                this.f9206qt.removeMessages(900);
                m11739aw();
                AbstractC2859mj abstractC2859mj = this.f9207ri.ajz;
                if (this.f9207ri.f9410xe && (abstractC2859mj instanceof AbstractC2860ri)) {
                    abstractC2859mj.m11008jc().m10959ri(abstractC2859mj, new C2858lr.fi(5, this.f9207ri));
                    return;
                }
                return;
            }
            this.f9207ri.f9394oh.m11864lr();
            this.f9207ri.f9394oh.m11870ri((CharSequence) ((i4 / 1000) + CmcdData.Factory.STREAMING_FORMAT_SS));
            this.f9207ri.f9394oh.m11859fi(false);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 900;
            messageObtain2.arg1 = i4 - 1000;
            this.f9207ri.f9390mj = messageObtain2.arg1;
            this.f9206qt.sendMessageDelayed(messageObtain2, 1000L);
            if (this.f9207ri.f9410xe && (this.f9207ri.ajz instanceof AbstractC2860ri) && dM12147qd > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                ((AbstractC2860ri) this.f9207ri.ajz).m11044ri((float) (1.0d - (((double) (i4 / 1000.0f)) / dM12147qd)));
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public abstract void mo11718ri(FrameLayout frameLayout);

    /* JADX INFO: renamed from: ri */
    public void mo11721ri(C3072mj c3072mj) {
        m11736ri(c3072mj, this.f9207ri);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.C2999ri
    /* JADX INFO: renamed from: ri */
    public void mo11750ri(InterfaceC3118lr interfaceC3118lr, igq igqVar) {
        super.mo11750ri(interfaceC3118lr, igqVar);
        if (this.f9207ri.f9389lr.m14383di() && this.f9207ri.f9412zb) {
            this.f9207ri.ory.m12105ri(false);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11751ri(boolean z, boolean z2, boolean z3, int i) {
        this.f9207ri.f9409xd.m11902ri(z, z2, z3, this, i);
    }

    /* JADX INFO: renamed from: sf */
    public void mo11729sf() {
    }

    protected void slm() {
        m11741bu();
        if (this.f9207ri.f9390mj <= 0 || !this.f9207ri.tan.getAndSet(false)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 900;
        messageObtain.arg1 = this.f9207ri.f9390mj;
        this.f9207ri.f9386jc.sendMessage(messageObtain);
    }

    /* JADX INFO: renamed from: su */
    public final void m11752su() {
        if (this.f9207ri.f9384ig.isFinishing()) {
            return;
        }
        this.f9207ri.ory.m12094qt();
        String str = this.f9207ri.f9387ka ? "reward_endcard" : "fullscreen_endcard";
        this.f9207ri.ory.m12101ri(this.f9194aw, str, this.f9207ri.f9397qd);
        if (this.f9207ri.luy) {
            this.f9207ri.wjv.m11971ri(this.f9207ri.zyn);
        }
        this.f9207ri.ory.m12104ri(str, this.f9207ri.f9397qd);
        this.f9207ri.ory.m12080fi();
    }

    public void tan() {
        if (this.f9207ri == null) {
            return;
        }
        if (this.f9207ri.dzy != null) {
            this.f9207ri.dzy.slm();
        }
        boolean z = this.f9207ri.zyn;
        this.f9207ri.f9378dw.m11090ri();
        DeviceUtils.xha();
        this.f9207ri.ory.m12111vr();
        if (this.f9207ri.zyn) {
            this.f9207ri.f9384ig.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.lr.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    if (AbstractC2998lr.this.f9207ri.f9378dw.m11090ri() > 0) {
                        AbstractC2998lr.this.f9207ri.f9378dw.m11091ri(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: uq */
    public void m11753uq() {
        this.f9207ri.f9394oh.m11860ik();
        this.f9207ri.f9394oh.m11859fi(true);
    }

    /* JADX INFO: renamed from: vr */
    public void m11754vr() {
        if (this.f9207ri.ajz != null || ((!C3279dw.m14092lr(this.f9204lr) && !C3279dw.m14090ik(this.f9204lr)) || (C3279dw.m14093mj(this.f9204lr) && this.f9207ri.ory.m12112zf() && !this.f9207ri.ory.hcw()))) {
            slm();
        }
        if (this.f9207ri == null) {
            return;
        }
        if (this.f9207ri.aac != null) {
            this.f9207ri.aac.mo16372ri();
        }
        this.f9207ri.m12000ka();
    }

    public void wjv() {
        this.f9196sf = this.f9207ri.f9402su.m11987ik();
    }

    public RFEndCardBackUpLayout xha() {
        return new RFEndCardBackUpLayout(this.f9207ri.srn);
    }
}
