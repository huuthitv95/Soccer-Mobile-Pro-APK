package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.activity.single.C2853fi;
import com.bytedance.sdk.openadsdk.component.reward.p187lr.AbstractC2998lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3020mj;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr;
import com.bytedance.sdk.openadsdk.component.reward.view.C3069ik;
import com.bytedance.sdk.openadsdk.core.C3365zf;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2951ri {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ri$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        void mo10587ri();

        /* JADX INFO: renamed from: ri */
        void mo10588ri(boolean z, int i);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11025ri(C3022ri c3022ri, View view);
    }

    /* JADX INFO: renamed from: ik */
    private static InterfaceC3061lr m11399ik(final bgr bgrVar) {
        final C3022ri c3022riM11256ri = bgrVar.m11256ri();
        final String strM11255lr = bgrVar.m11255lr();
        final lr lrVarM11254ka = bgrVar.m11254ka();
        final slm slmVarM11251di = bgrVar.m11251di();
        final boolean zM11252fi = bgrVar.m11252fi();
        return new InterfaceC3061lr() { // from class: com.bytedance.sdk.openadsdk.common.ri.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ik */
            public void mo10616ik(View view) {
                View viewMo12226qt;
                C3022ri c3022ri = c3022riM11256ri;
                if (c3022ri == null || c3022ri.dzy == null || (viewMo12226qt = c3022riM11256ri.dzy.mo12226qt()) == null) {
                    return;
                }
                viewMo12226qt.performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ka */
            public void mo10617ka(View view) {
                if (bgrVar.m11256ri() == null || bgrVar.xha() == null) {
                    return;
                }
                bgrVar.xha().mo11025ri(bgrVar.m11256ri(), view);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: lr */
            public void mo10618lr(View view) {
                C3022ri c3022ri = c3022riM11256ri;
                if (c3022ri == null || c3022ri.f9413zf == null || c3022riM11256ri.f9391nd == null) {
                    return;
                }
                c3022riM11256ri.f9413zf.m11912ri(c3022riM11256ri.f9391nd);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10619ri(View view) {
                if (C2951ri.m11403lr(slmVarM11251di, c3022riM11256ri, false, strM11255lr)) {
                    return;
                }
                if (zM11252fi && C2951ri.m11405lr(c3022riM11256ri, strM11255lr, lrVarM11254ka)) {
                    return;
                }
                C2951ri.m11407ri(c3022riM11256ri);
                C2951ri.m11408ri(c3022riM11256ri, lrVarM11254ka);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10620ri(View view, String str) {
                C3022ri c3022ri = c3022riM11256ri;
                if (c3022ri == null) {
                    return;
                }
                C2951ri.m11409ri(c3022ri, c3022ri.f9391nd, str);
            }
        };
    }

    /* JADX INFO: renamed from: ik */
    private static void m11400ik(C3022ri c3022ri) {
        C3283ka c3283kaM14473qc;
        if (c3022ri == null || c3022ri.f9389lr == null || (c3283kaM14473qc = c3022ri.f9389lr.m14473qc()) == null) {
            return;
        }
        C3097ka c3097kaM14188ri = c3283kaM14473qc.m14188ri();
        long jM12122aw = c3022ri.ihz.m12122aw();
        if (c3022ri.zyn) {
            c3097kaM14188ri.m12477mj(jM12122aw);
        } else {
            c3097kaM14188ri.jbs(jM12122aw);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m11401lr(bgr bgrVar) {
        m11406ri(bgrVar);
        bgrVar.m11256ri().f9394oh.m11869ri(m11399ik(bgrVar));
    }

    /* JADX INFO: renamed from: lr */
    public static void m11402lr(C3022ri c3022ri) {
        C3283ka c3283kaM14473qc;
        C3097ka c3097kaM14188ri;
        if (c3022ri == null) {
            return;
        }
        if (c3022ri.f9389lr != null && (c3283kaM14473qc = c3022ri.f9389lr.m14473qc()) != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
            long jM12122aw = c3022ri.ihz.m12122aw();
            c3097kaM14188ri.m12467di(jM12122aw);
            c3097kaM14188ri.m12469fi(jM12122aw);
        }
        C2889fi.m11114ri(c3022ri.f9389lr, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static boolean m11403lr(slm slmVar, C3022ri c3022ri, boolean z, String str) {
        if (slmVar == null) {
            return false;
        }
        boolean zM11431ri = slmVar.m11431ri(C3279dw.m14090ik(c3022ri.f9389lr), z, null);
        if (zM11431ri) {
            return true;
        }
        boolean z2 = c3022ri.ajz instanceof C2853fi;
        Boolean.valueOf(z2);
        Boolean.valueOf(zM11431ri);
        if (z2) {
            return ((C2853fi) c3022ri.ajz).m10790mj();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static boolean m11404lr(C3022ri c3022ri, View view) {
        if (!c3022ri.ory.m12072ac() || (!c3022ri.f9410xe && !c3022ri.jbs.get())) {
            return false;
        }
        boolean zM11820aw = c3022ri.hcw.m11820aw();
        c3022ri.ory.m12078di(zM11820aw);
        c3022ri.dzy.mo12216di(8);
        if (view instanceof C3193ka) {
            ((C3193ka) view).setImageResource(C2729uq.m10305ka(c3022ri.srn, "tt_close_btn"));
        }
        c3022ri.f9386jc.sendEmptyMessageDelayed(600, 5000L);
        return !wjv.m14334ik(c3022ri.f9389lr) || zM11820aw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static boolean m11405lr(C3022ri c3022ri, String str, lr lrVar) {
        if (c3022ri.ajz instanceof C2853fi) {
            lrVar.mo10587ri();
            return true;
        }
        boolean zM14093mj = C3279dw.m14093mj(c3022ri.f9389lr);
        boolean zM14086di = C3279dw.m14086di(c3022ri.f9389lr);
        boolean zM14088fi = C3279dw.m14088fi(c3022ri.f9389lr);
        if (!zM14086di && (!zM14088fi || !c3022ri.wjv.m11962ka(C3020mj.f9356lr))) {
            if (!C3273ac.m13987ri(c3022ri.f9389lr) || c3022ri.f9373aw.get()) {
                c3022ri.f9394oh.m11863ka(false);
                return false;
            }
            lrVar.mo10587ri();
            return true;
        }
        if (zM14093mj) {
            c3022ri.wjv.jbs();
        } else {
            View viewMo12226qt = c3022ri.dzy.mo12226qt();
            if (viewMo12226qt != null) {
                viewMo12226qt.performClick();
            } else {
                lrVar.mo10587ri();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11406ri(final bgr bgrVar) {
        final View viewMo12226qt;
        final C3022ri c3022riM11256ri = bgrVar.m11256ri();
        if (c3022riM11256ri == null || c3022riM11256ri.dzy == null || (viewMo12226qt = c3022riM11256ri.dzy.mo12226qt()) == null) {
            return;
        }
        final String strM11255lr = bgrVar.m11255lr();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ri.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C2951ri.m11404lr(c3022riM11256ri, viewMo12226qt)) {
                    return;
                }
                c3022riM11256ri.ory.ihz();
                c3022riM11256ri.hcw.m11831sf();
                c3022riM11256ri.f9402su.m11985di();
                slm slmVarM11251di = bgrVar.m11251di();
                if (slmVarM11251di == null || !C3279dw.m14091ka(c3022riM11256ri.f9389lr)) {
                    bgrVar.m11253ik().run();
                    return;
                }
                boolean zM11403lr = C2951ri.m11403lr(slmVarM11251di, c3022riM11256ri, true, strM11255lr);
                if (!(c3022riM11256ri.ajz instanceof C2853fi) || zM11403lr) {
                    return;
                }
                bgrVar.m11253ik().run();
            }
        };
        viewMo12226qt.setOnClickListener(onClickListener);
        viewMo12226qt.setTag(viewMo12226qt.getId(), onClickListener);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11407ri(C3022ri c3022ri) {
        if (c3022ri == null) {
            return;
        }
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15466lr(c3022ri.ihz.m12122aw());
        riVar.m15463ka(c3022ri.ihz.m12167su());
        riVar.m15459ik(c3022ri.ihz.m12124bu());
        riVar.m15458ik(3);
        riVar.m15462ka(c3022ri.ihz.m12131fr());
        riVar.m15472ri(c3022ri.ihz.m12139lr());
        C3413ri.m15493ri(c3022ri.ihz.m12143mj(), riVar, c3022ri.ihz.m12129fi());
        C3365zf.m15145ik(c3022ri.f9377di);
        c3022ri.ihz.m12160ri("skip", false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX INFO: renamed from: ri */
    public static void m11408ri(C3022ri c3022ri, lr lrVar) {
        if (!c3022ri.f9385ik) {
            lrVar.mo10587ri();
        } else if (C3273ac.m13965ik(c3022ri.f9389lr)) {
            C3069ik c3069ikM12263ri = c3022ri.f9374ay.m12263ri();
            if (c3069ikM12263ri == null || c3069ikM12263ri.f9592ka != 0) {
                lrVar.mo10588ri(true, 4);
            } else {
                lrVar.mo10587ri();
            }
        } else {
            lrVar.mo10588ri(true, 4);
            if (C3273ac.m13987ri(c3022ri.f9389lr) && !c3022ri.f9373aw.get()) {
                lrVar.mo10587ri();
            }
        }
        m11402lr(c3022ri);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11409ri(C3022ri c3022ri, AbstractC2998lr abstractC2998lr, String str) {
        if (c3022ri == null || c3022ri.f9391nd == null) {
            return;
        }
        c3022ri.zyn = !c3022ri.zyn;
        boolean z = c3022ri.ajz instanceof C2853fi;
        if (c3022ri.f9410xe && !z && c3022ri.f9374ay != null && c3022ri.f9374ay.m12263ri() != null) {
            c3022ri.f9374ay.m12263ri().setSoundMute(c3022ri.zyn);
        }
        c3022ri.ihz.m12163ri(c3022ri.zyn, str);
        c3022ri.ory.m12081fi(c3022ri.zyn);
        c3022ri.wjv.m11964lr(c3022ri.zyn);
        if (z) {
            return;
        }
        m11400ik(c3022ri);
    }
}
