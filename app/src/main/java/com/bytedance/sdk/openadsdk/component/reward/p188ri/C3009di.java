package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.p125lr.bgr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.reward.C2993lr;
import com.bytedance.sdk.openadsdk.component.reward.view.C3069ik;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.jbs.jbs;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.C3143fi;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3009di {

    /* JADX INFO: renamed from: lr */
    private boolean f9315lr;

    /* JADX INFO: renamed from: ri */
    private C3022ri f9316ri;

    public C3009di(C3022ri c3022ri) {
        this.f9316ri = c3022ri;
    }

    /* JADX INFO: renamed from: lr */
    private void m11874lr() {
        jbs jbsVar = new jbs(this.f9316ri.f9384ig, this.f9316ri.f9389lr, this.f9316ri.f9381fi, C3571ig.m16470ri(this.f9316ri.f9381fi)) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.3
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
            /* JADX INFO: renamed from: ri */
            public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
                super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        jbsVar.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.4
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i) {
                C3009di.this.f9316ri.f9397qd.mo10614xd();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        if (this.f9316ri.f9410xe && this.f9316ri.ajz != null) {
            int i = this.f9316ri.ajz.f8475sf + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        jbsVar.m13536ri(map);
        C3235mj c3235mj = new C3235mj(this.f9316ri.f9384ig, this.f9316ri.f9389lr, this.f9316ri.f9381fi, C3571ig.m16470ri(this.f9316ri.f9381fi)) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.5
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3221ri, com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
            /* JADX INFO: renamed from: ri */
            public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(C3009di.this.f9316ri.ihz.m12122aw()));
                if (C3009di.this.f9316ri.ajz != null) {
                    C3009di.this.f9316ri.ajz.mo11019ri(map2, f, f2);
                }
                m13536ri(map2);
                super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
                C3009di.this.f9316ri.ihz.feb();
            }
        };
        c3235mj.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.6
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i2) {
                C3009di.this.f9316ri.f9397qd.mo10614xd();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        c3235mj.m13536ri(map2);
        this.f9316ri.f9374ay.m12270ri(jbsVar, c3235mj);
    }

    /* JADX INFO: renamed from: ri */
    public void m11876ri(C3022ri c3022ri) {
        this.f9316ri = c3022ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m11877ri(wjv wjvVar) {
        if (this.f9316ri.f9374ay != null) {
            C3069ik c3069ikM12263ri = this.f9316ri.f9374ay.m12263ri();
            ViewParent parent = c3069ikM12263ri.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c3069ikM12263ri);
            }
            this.f9316ri.dzy.mo12215di().addView(c3069ikM12263ri);
            if (!this.f9316ri.f9374ay.jbs()) {
                this.f9316ri.f9391nd.m11757ri(false);
            }
            this.f9316ri.f9374ay.m12272ri(wjvVar);
            m11874lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11878ri(float[] fArr) {
        this.f9315lr = true;
        Arrays.toString(fArr);
        this.f9316ri.f9374ay.m12267ri(new AdSlot.Builder().setCodeId(String.valueOf(this.f9316ri.f9389lr.m14545ur())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build(), this.f9316ri.dzy.f9659vr);
        if (this.f9316ri.f9394oh != null && this.f9316ri.f9374ay != null) {
            this.f9316ri.f9394oh.m11868ri(this.f9316ri.f9374ay.m12263ri());
        }
        this.f9316ri.f9374ay.m12271ri(new InterfaceC3247vr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: di */
            public void mo11539di() {
                C3009di.this.f9316ri.f9413zf.m11912ri(C3009di.this.f9316ri.f9391nd);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: fi */
            public int mo11540fi() {
                if (C3009di.this.f9316ri.f9374ay.m12257ik()) {
                    return 4;
                }
                if (C3009di.this.f9316ri.f9374ay.m12258ka()) {
                    return 5;
                }
                if (C3009di.this.f9316ri.ihz.m12148qt()) {
                    return 1;
                }
                if (C3009di.this.f9316ri.ihz.m12126di()) {
                    return 2;
                }
                C3009di.this.f9316ri.ihz.jbs();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ik */
            public long mo11541ik() {
                return C3009di.this.f9316ri.ihz.bgr();
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ka */
            public long mo11543ka() {
                return C3009di.this.f9316ri.ihz.m12149ri();
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: lr */
            public void mo11544lr() {
                if (C3009di.this.f9316ri.dzy == null || C3009di.this.f9316ri.dzy.mo12226qt() == null) {
                    return;
                }
                C3009di.this.f9316ri.dzy.mo12226qt().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: lr */
            public void mo11880lr(int i) {
                C3009di.this.f9316ri.f9380fe = i;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: lr */
            public boolean mo11881lr(JSONObject jSONObject) {
                return C2993lr.m11712ri(C3009di.this.f9316ri);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ri */
            public void mo11545ri() {
                C3009di.this.f9316ri.f9394oh.m11862ka();
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ri */
            public void mo11546ri(int i) {
                if (i != 1) {
                    if (i == 2) {
                        C3009di.this.f9316ri.ihz.m12146pv();
                        return;
                    }
                    if (i == 3) {
                        C3009di.this.f9316ri.ihz.m12157ri(C3009di.this.f9316ri.f9397qd);
                        return;
                    } else if (i == 4) {
                        C3009di.this.f9316ri.ihz.tan();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (C3009di.this.f9316ri.ihz.m12126di() || C3009di.this.f9316ri.ihz.jbs()) {
                    return;
                }
                C3009di.this.f9316ri.f9397qd.mo10580ri(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ri */
            public void mo11882ri(int i, bgr bgrVar) {
                C3009di.this.f9316ri.dzy.m12306ri(i, bgrVar);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ri */
            public void mo11547ri(int i, String str) {
                C3009di.this.f9316ri.ihz.m12151ri(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ri */
            public void mo11883ri(String str, JSONObject jSONObject) {
                if (C3009di.this.f9316ri == null || C3009di.this.f9316ri.f9397qd == null) {
                    return;
                }
                C3009di.this.f9316ri.f9397qd.mo10613ri(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ri */
            public void mo11884ri(boolean z, String str) {
                if (C3009di.this.f9316ri.zyn != z) {
                    C3009di.this.f9316ri.f9394oh.m11871ri(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
            /* JADX INFO: renamed from: ri */
            public boolean mo11551ri(JSONObject jSONObject) {
                if (C3009di.this.f9316ri == null || C3009di.this.f9316ri.ihz == null) {
                    return false;
                }
                return C3009di.this.f9316ri.ihz.m12165ri(jSONObject);
            }
        });
        this.f9316ri.f9374ay.m12268ri(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (C3009di.this.f9316ri == null || C3009di.this.f9316ri.f9389lr == null || !C3009di.this.f9316ri.f9389lr.zyu()) {
                    return;
                }
                C3009di.this.f9316ri.f9397qd.mo10614xd();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                boolean z = -1024 == i;
                C3009di.this.f9316ri.m12004ri(i, str, z ? 1002 : 1001);
                C3009di.this.f9316ri.f9402su.m11993ri();
                if (z) {
                    return;
                }
                if (!C3009di.this.f9316ri.f9389lr.vgs()) {
                    C3009di.this.f9316ri.ory.m12105ri(true);
                    C3009di.this.f9316ri.ory.m12080fi();
                }
                C3009di.this.f9316ri.f9374ay.m12256fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3009di.this.f9316ri.f9391nd.m11751ri(false, false, false, 90);
                    }
                });
                C3009di.this.f9316ri.dzy.mo12213aw();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                C3273ac c3273ac;
                if (!C3009di.this.f9316ri.f9389lr.vgs()) {
                    if (C3009di.this.f9316ri.f9374ay.jbs()) {
                        C3009di.this.f9316ri.f9391nd.m11757ri(true);
                        C3009di.this.f9316ri.ihz.m12136ka(false);
                    } else {
                        C3009di.this.f9316ri.ihz.m12136ka(true);
                    }
                    C3009di.this.f9316ri.dzy.mo12228ri(8);
                    C3009di.this.f9316ri.ory.m12105ri(true);
                    C3009di.this.f9316ri.ory.m12080fi();
                    if (C3009di.this.f9316ri.f9374ay.jbs()) {
                        C3009di.this.f9316ri.f9374ay.m12259lr().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        C3009di.this.f9316ri.f9391nd.mo11718ri(C3009di.this.f9316ri.dzy.mo12215di());
                    } else if (C3009di.this.f9316ri.f9389lr.m14389eu() != null && C3009di.this.f9316ri.f9391nd.m11758ri()) {
                        C3009di.this.f9316ri.f9403ta = true;
                    }
                }
                C3009di.this.f9316ri.f9391nd.m11740ay();
                if (C3273ac.m13965ik(C3009di.this.f9316ri.f9389lr) && (c3273ac = C3009di.this.f9316ri.dzy.f9659vr) != null) {
                    c3273ac.m14000ik();
                }
                C3009di.this.f9316ri.dzy.mo12213aw();
            }
        });
        m11874lr();
        FrameLayout.LayoutParams layoutParams = (this.f9316ri.f9389lr.vgs() || C3143fi.m13131ri(this.f9316ri.f9389lr.hpn()) || C3273ac.m13965ik(this.f9316ri.f9389lr)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f9316ri.dzy.mo12215di().addView(this.f9316ri.f9374ay.m12263ri(), layoutParams);
        if (!this.f9316ri.f9374ay.jbs()) {
            this.f9316ri.f9391nd.m11757ri(false);
        }
        this.f9316ri.f9374ay.bgr();
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11879ri() {
        return this.f9315lr;
    }
}
