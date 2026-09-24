package com.bytedance.sdk.openadsdk.component.reward.p187lr;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.view.C3067di;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3372lr;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p251qt.C3490ik;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC2998lr {

    /* JADX INFO: renamed from: aw */
    private final int f9208aw;
    private ViewGroup bgr;
    private String slm;

    /* JADX INFO: renamed from: vr */
    private C3067di f9209vr;

    public xha(C3022ri c3022ri) {
        super(c3022ri);
        this.slm = "fullscreen_interstitial_ad";
        this.f9208aw = this.f9204lr.m14552vz();
    }

    /* JADX INFO: renamed from: dw */
    private void m11759dw() {
        if (this.bgr == null) {
            return;
        }
        m11765ri((View) this.f9209vr);
    }

    private boolean hcw() {
        return this.f9204lr != null && this.f9204lr.ajz() == 2;
    }

    /* JADX INFO: renamed from: ik */
    private InterfaceC3370ik m11760ik(wjv wjvVar) {
        if (wjvVar.adz() == 4) {
            return new C3372lr(C3299nr.m14642ri(), this.slm);
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    private void m11761lr(wjv wjvVar) {
        if (wjvVar == null || this.f9209vr == null) {
            return;
        }
        ory();
        m11762ri((ImageView) this.f9209vr);
    }

    private void ory() {
        C3286nr c3286nr;
        List<C3286nr> listRbz = this.f9204lr.rbz();
        if (listRbz == null || listRbz.size() <= 0 || (c3286nr = listRbz.get(0)) == null) {
            return;
        }
        try {
            int iM14217lr = c3286nr.m14217lr();
            int iM14215ik = c3286nr.m14215ik();
            if (iM14217lr != 0 && iM14215ik != 0) {
                this.f9209vr.setRatio(iM14217lr / iM14215ik);
                return;
            }
            int i = this.f9208aw;
            if (i == 33) {
                this.f9209vr.setRatio(1.0f);
            } else if (i == 3) {
                this.f9209vr.setRatio(1.91f);
            } else {
                this.f9209vr.setRatio(0.56f);
            }
        } catch (Exception e) {
            C2707ac.m10196ik("TTAD.RFTI", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m11762ri(ImageView imageView) {
        List<C3286nr> listRbz;
        C3286nr c3286nr;
        if (this.f9204lr == null || (listRbz = this.f9204lr.rbz()) == null || listRbz.size() <= 0 || (c3286nr = listRbz.get(0)) == null) {
            return;
        }
        C3491ka.m15833ri(listRbz.get(0)).mo9652ik(1).mo9658ri(C3490ik.m15828ri(this.f9204lr, c3286nr.m14220ri(), imageView));
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m11763ri(wjv wjvVar) {
        return !wjv.m14332fi(wjvVar) && wjvVar.m14406gz() == 100.0f;
    }

    /* JADX INFO: renamed from: zf */
    private void m11764zf() {
        FrameLayout frameLayout = new FrameLayout(this.f9207ri.f9384ig);
        this.bgr = frameLayout;
        frameLayout.setId(slm.f13308vk);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.bgr.setLayoutParams(layoutParams);
        View viewMo12235sf = this.f9207ri.dzy.mo12235sf();
        if (viewMo12235sf != null) {
            layoutParams.bottomMargin = viewMo12235sf.getHeight();
        }
        C3067di c3067di = new C3067di(this.f9207ri.f9384ig);
        this.f9209vr = c3067di;
        c3067di.setId(slm.sez);
        FrameLayout.LayoutParams layoutParams2 = this.f9207ri.f9389lr.bbu() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        this.f9209vr.setLayoutParams(layoutParams2);
        this.bgr.addView(this.f9209vr);
        m11759dw();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: di */
    public void mo11715di() {
        if (C3273ac.m13971lr(this.f9204lr)) {
            this.f9200di.mo12223lr(8);
        }
        this.f9205mj.m11861ik(false);
        this.f9205mj.m11863ka(false);
        if (this.f9204lr.ajz() == 2) {
            this.f9205mj.m11873ri(false);
            this.f9200di.mo12216di(8);
            return;
        }
        this.f9205mj.m11873ri(this.f9204lr.nlk());
        if (this.f9207ri.f9412zb) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            C3022ri c3022ri = this.f9207ri;
            int iM12147qd = (int) (this.f9207ri.ihz.m12147qd() * 1000.0d);
            c3022ri.f9390mj = iM12147qd;
            messageObtain.arg1 = iM12147qd;
            this.f9207ri.f9386jc.sendMessage(messageObtain);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: fi */
    public boolean mo11716fi() {
        return hcw();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ka */
    public boolean mo11717ka() {
        return hcw();
    }

    /* JADX INFO: renamed from: ri */
    protected void m11765ri(View view) {
        C3220lr c3221ri;
        if (view == null || this.f9207ri.f9384ig == null || this.f9204lr == null) {
            return;
        }
        if (this.f9196sf == null) {
            Activity activity = this.f9207ri.f9384ig;
            wjv wjvVar = this.f9204lr;
            String str = this.slm;
            c3221ri = new C3221ri(activity, wjvVar, str, C3571ig.m16470ri(str));
            c3221ri.m13534ri(m11760ik(this.f9204lr));
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            c3221ri.m13536ri(map);
        } else {
            c3221ri = this.f9196sf;
        }
        if (this.f9207ri.f9384ig != null) {
            c3221ri.m13527ri(this.f9207ri.f9384ig);
        }
        view.setOnTouchListener(c3221ri);
        view.setOnClickListener(c3221ri);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ri */
    public void mo11718ri(FrameLayout frameLayout) {
        try {
            m11764zf();
            m11761lr(this.f9204lr);
            frameLayout.addView(this.bgr);
        } catch (Exception e) {
            Log.e("TTAD.RFTI", "bindAd: ", e);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr
    /* JADX INFO: renamed from: ri */
    public void mo11721ri(C3072mj c3072mj) {
        if (C3273ac.m13971lr(this.f9204lr)) {
            C2997ka.m11726ri(c3072mj, this.f9204lr);
            this.f9207ri.aac.mo16373ri((long) (this.f9207ri.ihz.m12147qd() * 1000.0d));
        } else {
            if (!C3273ac.m13968ka(this.f9204lr) && !C3273ac.xha(this.f9204lr)) {
                super.mo11721ri(c3072mj);
                return;
            }
            C2997ka.m11724lr(c3072mj, this.f9204lr);
            if (this.f9207ri.f9410xe) {
                return;
            }
            this.f9207ri.aac.mo16373ri((long) (this.f9207ri.ihz.m12147qd() * 1000.0d));
        }
    }
}
