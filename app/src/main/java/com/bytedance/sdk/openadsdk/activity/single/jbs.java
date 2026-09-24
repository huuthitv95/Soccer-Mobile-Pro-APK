package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.component.reward.top.C3060ik;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3275ay;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p269vr.C3604ri;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.bgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class jbs extends AbstractC2854ik {

    /* JADX INFO: renamed from: aw */
    private C2858lr.lr f8302aw;
    private int bgr;

    /* JADX INFO: renamed from: bu */
    private int f8303bu;

    /* JADX INFO: renamed from: co */
    private C3195mj f8304co;

    /* JADX INFO: renamed from: di */
    public bgr f8305di;
    private C3604ri jbs;

    /* JADX INFO: renamed from: mj */
    private C3060ik f8306mj;

    /* JADX INFO: renamed from: nr */
    private boolean f8307nr;

    /* JADX INFO: renamed from: qt */
    private C3192ik f8308qt;

    /* JADX INFO: renamed from: sf */
    private C3192ik f8309sf;
    private AbstractC2859mj slm;

    /* JADX INFO: renamed from: vr */
    private C2853fi f8310vr;
    private final List<AbstractC2859mj> xha;

    public jbs(Activity activity, wjv wjvVar, C2858lr c2858lr) {
        super(activity, wjvVar, c2858lr);
        this.xha = new ArrayList();
        this.f8307nr = false;
        this.f8308qt = new C3192ik(activity);
        if (Build.VERSION.SDK_INT >= 35) {
            this.f8308qt.setFitsSystemWindows(true);
        }
        activity.setContentView(this.f8308qt);
    }

    private void ihz() {
        boolean zBgr = C3322sf.m14819lr().bgr(String.valueOf(this.f8300lr.m14545ur()));
        int iM10833lr = this.f8299ka.m10929di() ? m10833lr(0, zBgr) : 0;
        if (this.xha.isEmpty() && !C3279dw.m14090ik(this.f8300lr)) {
            int i = iM10833lr + 1;
            this.xha.add(m10836ri(this.f8299ka, this.f8300lr, iM10833lr, i, true));
            iM10833lr = i;
        }
        m10838ri(iM10833lr, zBgr);
    }

    /* JADX INFO: renamed from: ik */
    private void m10831ik(AbstractC2859mj abstractC2859mj) {
        try {
            this.f8304co.setText(this.f8301ri.getString(C2729uq.m10307lr(C3299nr.m14642ri(), "tt_multiple_ad_indicator"), new Object[]{Integer.valueOf(abstractC2859mj.f8475sf + 1), Integer.valueOf(this.bgr)}));
            this.f8304co.setVisibility(0);
        } catch (Throwable th) {
            C2707ac.m10206ri("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th);
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m10832ka(AbstractC2859mj abstractC2859mj) {
        C3604ri c3604ri = this.jbs;
        if (c3604ri != null) {
            C3583qd.xha(c3604ri);
            this.jbs = null;
        }
        C3060ik c3060ik = this.f8306mj;
        if (c3060ik != null) {
            C3583qd.xha(c3060ik);
            C3583qd.xha(this.f8306mj.getITopLayout());
            this.f8306mj = null;
        }
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar != null) {
            lrVar.m10986ik();
        }
        if (abstractC2859mj instanceof xha) {
            ((xha) abstractC2859mj).bnj();
        }
        bgr bgrVar = this.f8305di;
        if (bgrVar != null) {
            bgrVar.mo16370ik();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011c A[PHI: r11
  0x011c: PHI (r11v3 int) = (r11v2 int), (r11v4 int), (r11v2 int), (r11v2 int) binds: [B:28:0x00b7, B:42:0x0106, B:32:0x00c7, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: lr */
    private int m10833lr(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        List<wjv> listLsq = this.f8300lr.lsq();
        if (listLsq.isEmpty()) {
            return i;
        }
        int size = listLsq.size();
        this.bgr = size;
        int i5 = i;
        int i6 = 0;
        while (i6 < size) {
            boolean z2 = i6 == size + (-1);
            wjv wjvVar = listLsq.get(i6);
            if (wjvVar != null) {
                wjvVar.m14413ig(this.f8297fi);
            }
            if (C3279dw.m14092lr(wjvVar)) {
                if (C3279dw.m14090ik(wjvVar)) {
                    List<AbstractC2859mj> list = this.xha;
                    i2 = i5 + 1;
                    C2853fi c2853fi = new C2853fi(this.f8299ka, wjvVar, i5, i6, true, z2, false);
                    wjvVar = wjvVar;
                    list.add(c2853fi);
                    i4 = i2;
                } else {
                    this.xha.add(m10836ri(this.f8299ka, wjvVar, i5, i6, z2));
                    i3 = i5 + 2;
                    this.xha.add(new C2853fi(this.f8299ka, wjvVar, i5 + 1, i6, true, z2, false));
                    i4 = i3;
                }
            } else if (!C3273ac.m13961fi(wjvVar) && C3273ac.m13958di(wjvVar)) {
                this.xha.add(m10836ri(this.f8299ka, wjvVar, i5, i6, z2));
                i3 = i5 + 2;
                this.xha.add(new C2853fi(this.f8299ka, wjvVar, i5 + 1, i6, false, z2, false));
                i4 = i3;
            } else {
                i2 = i5 + 1;
                this.xha.add(m10836ri(this.f8299ka, wjvVar, i5, i6, z2));
                i4 = i2;
            }
            if (z) {
                boolean zM10967ri = this.f8299ka.m10967ri(wjvVar);
                if (z2) {
                    if (this.f8299ka.m10938ka() && zM10967ri && !C3279dw.m14092lr(wjvVar)) {
                        this.xha.add(new C2853fi(this.f8299ka, wjvVar, i4, i6, false, z2, false));
                        i4++;
                    }
                    if (TextUtils.isEmpty(wjvVar.m14446mj())) {
                        i5 = i4;
                    } else {
                        C2853fi c2853fi2 = new C2853fi(this.f8299ka, wjvVar, i4, i6, false, z2, true);
                        this.f8310vr = c2853fi2;
                        this.xha.add(c2853fi2);
                        i5 = i4 + 1;
                    }
                } else if (this.f8299ka.m10932fi() && zM10967ri) {
                    this.xha.add(new C2853fi(this.f8299ka, wjvVar, i4, i6, false, z2, false));
                    i5 = i4 + 1;
                } else {
                    i5 = i4;
                }
            } else {
                i5 = i4;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX INFO: renamed from: lr */
    private int m10834lr(AbstractC2859mj abstractC2859mj) {
        AbstractC2859mj abstractC2859mj2;
        boolean z;
        int iM14298ka = 0;
        for (int i = abstractC2859mj.f8473qt; i < this.xha.size() && (!((z = (abstractC2859mj2 = this.xha.get(i)) instanceof C2853fi)) || !((C2853fi) abstractC2859mj2).f8283ri); i++) {
            boolean z2 = abstractC2859mj2.slm;
            boolean zM13958di = C3273ac.m13958di(abstractC2859mj2.f8468di);
            boolean zM13961fi = C3273ac.m13961fi(abstractC2859mj2.f8468di);
            C3275ay c3275ayM14484ri = abstractC2859mj2.f8468di.m14484ri();
            int iM14019ik = c3275ayM14484ri != null ? c3275ayM14484ri.m14019ik() : 10;
            if (abstractC2859mj2 instanceof AbstractC2860ri) {
                if (zM13961fi) {
                    iM14298ka += iM14019ik;
                } else {
                    C1997lr c1997lrM14389eu = abstractC2859mj2.f8468di.m14389eu();
                    iM14298ka = c1997lrM14389eu != null ? (int) (((double) iM14298ka) + c1997lrM14389eu.m6339di()) : (int) (((long) iM14298ka) + 10);
                }
            } else if (z) {
                if (zM13958di) {
                    iM14298ka += iM14019ik;
                } else if (z2) {
                    if (abstractC2859mj2.f8468di.m14532tl()) {
                        iM14298ka += iM14019ik;
                    } else {
                        iM14298ka += C3279dw.ihz(abstractC2859mj2.f8468di) + C3279dw.m14089fr(abstractC2859mj2.f8468di);
                    }
                } else if (this.f8299ka.m10932fi() && abstractC2859mj2.f8468di != null && !abstractC2859mj2.f8468di.rbh()) {
                    iM14298ka += abstractC2859mj2.f8468di.dob().m14298ka();
                }
            }
        }
        return iM14298ka;
    }

    /* JADX INFO: renamed from: lr */
    private void m10835lr(AbstractC2859mj abstractC2859mj, AbstractC2859mj abstractC2859mj2, C2858lr.fi fiVar) {
        if (this.f8302aw == null) {
            if (abstractC2859mj2 == null || !abstractC2859mj2.mo10766c_()) {
                this.f8302aw = new C2858lr.ri(this.f8299ka, this.f8300lr, this.f8306mj);
            } else {
                this.f8302aw = new C2858lr.ka(this.f8299ka, this.f8300lr, this.f8306mj);
            }
        }
        this.f8302aw.m10989lr();
        int iM10834lr = m10834lr(abstractC2859mj2);
        boolean z = abstractC2859mj2 instanceof C2853fi;
        if (!z || ((C2853fi) abstractC2859mj2).f8283ri || abstractC2859mj2.slm || abstractC2859mj2.f8468di == null || !abstractC2859mj2.f8468di.rbh()) {
            this.f8302aw.mo10974ri(iM10834lr, abstractC2859mj2.f8468di);
            if (z && ((C2853fi) abstractC2859mj2).f8283ri) {
                m10832ka(abstractC2859mj);
            } else if (abstractC2859mj2.f8468di.m14532tl()) {
                boolean z2 = false;
                boolean z3 = (abstractC2859mj2 instanceof AbstractC2860ri) && C3273ac.m13961fi(abstractC2859mj2.f8468di);
                if (z && (abstractC2859mj2.slm || C3273ac.m13958di(abstractC2859mj2.f8468di))) {
                    z2 = true;
                }
                if (z3 || z2) {
                    this.f8302aw.m10995ri(abstractC2859mj2);
                }
            } else if (abstractC2859mj2.slm) {
                this.f8302aw.m10996ri(abstractC2859mj2.f8468di, abstractC2859mj2.f8466bu);
            } else if (z) {
                this.f8302aw.m10987ik(abstractC2859mj2.f8468di.dob().m14298ka());
            }
        } else {
            this.f8302aw.m10988ka();
        }
        bgr bgrVar = this.f8305di;
        if (bgrVar != null && abstractC2859mj == null) {
            bgrVar.mo16373ri(iM10834lr * 1000);
        }
        if (abstractC2859mj2 instanceof AbstractC2860ri) {
            this.f8303bu++;
            mo10813ri(0.0f);
            if (C3273ac.m13961fi(abstractC2859mj2.f8468di)) {
                this.f8304co.setVisibility(8);
                return;
            } else {
                m10831ik(abstractC2859mj2);
                return;
            }
        }
        if (z) {
            if (((C2853fi) abstractC2859mj2).f8283ri) {
                this.f8304co.setVisibility(8);
                return;
            }
            if (abstractC2859mj2.slm && C3279dw.m14090ik(abstractC2859mj2.f8468di)) {
                this.f8303bu++;
            }
            if (abstractC2859mj2.slm || C3273ac.m13958di(abstractC2859mj2.f8468di)) {
                this.f8304co.setVisibility(8);
            } else {
                m10831ik(abstractC2859mj2);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static AbstractC2859mj m10836ri(C2858lr c2858lr, wjv wjvVar, int i, int i2, boolean z) {
        boolean zM14472qa = wjvVar.m14472qa();
        AdSlot adSlotM14388eb = wjvVar.m14388eb();
        if (adSlotM14388eb != null) {
            zM14472qa = adSlotM14388eb.getDurationSlotType() == 7;
        }
        return zM14472qa ? new xha(c2858lr, wjvVar, i, i2, z) : new C2852di(c2858lr, wjvVar, i, i2, z);
    }

    /* JADX INFO: renamed from: ri */
    private void m10838ri(int i, boolean z) {
        if (bgr() == null && this.f8299ka.m10929di()) {
            m10839uq();
        }
    }

    /* JADX INFO: renamed from: uq */
    private void m10839uq() {
        this.f8305di = com.bytedance.sdk.openadsdk.utils.jbs.m16529ri(this.f8301ri, new com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.jbs.1
            @Override // com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri
            /* JADX INFO: renamed from: lr */
            public void mo10648lr() {
                if (jbs.this.f8306mj != null) {
                    jbs.this.f8306mj.setSkipInvisiable();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.jbs.InterfaceC3576ri
            /* JADX INFO: renamed from: ri */
            public View mo10649ri() {
                if (jbs.this.f8306mj != null) {
                    return jbs.this.f8306mj.getCloseButton();
                }
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: ac */
    public int m10840ac() {
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            return abstractC2859mj.f8473qt;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: aw */
    public AbstractC2859mj mo10799aw() {
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj == null) {
            return null;
        }
        int i = abstractC2859mj.f8473qt;
        while (true) {
            i++;
            if (i >= this.xha.size()) {
                return null;
            }
            AbstractC2859mj abstractC2859mj2 = this.xha.get(i);
            if ((abstractC2859mj2 instanceof AbstractC2860ri) || ((abstractC2859mj2 instanceof C2853fi) && C3279dw.m14090ik(abstractC2859mj2.f8468di) && abstractC2859mj2.slm)) {
                return abstractC2859mj2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    public C2853fi bgr() {
        C2853fi c2853fi = this.f8310vr;
        if (c2853fi != null) {
            return c2853fi;
        }
        AbstractC2859mj abstractC2859mj = this.slm;
        int i = abstractC2859mj != null ? abstractC2859mj.f8473qt : -1;
        for (int size = this.xha.size() - 1; size > i; size--) {
            AbstractC2859mj abstractC2859mj2 = this.xha.get(size);
            if (abstractC2859mj2 instanceof C2853fi) {
                C2853fi c2853fi2 = (C2853fi) abstractC2859mj2;
                if (c2853fi2.f8283ri) {
                    this.f8310vr = c2853fi2;
                    break;
                }
            }
        }
        return this.f8310vr;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: co */
    public C3060ik mo10801co() {
        return this.f8306mj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: di */
    public void mo10802di() {
        super.mo10802di();
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            abstractC2859mj.mo10786aw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ik */
    public void mo10804ik() {
        super.mo10804ik();
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            abstractC2859mj.bgr();
        }
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar != null) {
            lrVar.m10994ri(-1);
        }
        bgr bgrVar = this.f8305di;
        if (bgrVar != null) {
            bgrVar.mo16371lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    public void jbs() {
        super.jbs();
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            abstractC2859mj.mo10785ac();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ka */
    public boolean mo10805ka() {
        if (this.xha.isEmpty()) {
            return false;
        }
        List<AbstractC2859mj> list = this.xha;
        AbstractC2859mj abstractC2859mj = list.get(list.size() - 1);
        return (abstractC2859mj instanceof C2853fi) && ((C2853fi) abstractC2859mj).f8283ri;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: lr */
    public void mo10806lr() {
        super.mo10806lr();
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            abstractC2859mj.mo10788ik();
        }
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar != null) {
            lrVar.m10990lr(-1);
        }
        bgr bgrVar = this.f8305di;
        if (bgrVar != null) {
            bgrVar.mo16372ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: lr */
    public void mo10807lr(Activity activity) {
        super.mo10807lr(activity);
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            abstractC2859mj.mo10792ri(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: lr */
    public void mo10808lr(AbstractC2859mj abstractC2859mj, int i) {
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar == null) {
            return;
        }
        if (i == 2) {
            lrVar.m10994ri(i);
            bgr bgrVar = this.f8305di;
            if (bgrVar != null) {
                bgrVar.mo16371lr();
                return;
            }
            return;
        }
        if (i == 1) {
            lrVar.m10990lr(i);
            bgr bgrVar2 = this.f8305di;
            if (bgrVar2 != null) {
                bgrVar2.mo16372ri();
                return;
            }
            return;
        }
        if (i == 3 || i == 4) {
            try {
                this.slm.mo10787ay().ihz.m12145oh();
            } catch (Throwable th) {
                C2707ac.m10197ik("SeqSwitchLayoutManager", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: mj */
    public int mo10809mj() {
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar != null) {
            return lrVar.m10993ri();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: nr */
    public void mo10810nr() {
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar != null) {
            lrVar.m10992mj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: qt */
    public int mo10811qt() {
        return this.f8303bu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10812ri() {
        super.mo10812ri();
        ihz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10813ri(float f) {
        C3604ri c3604ri = this.jbs;
        if (c3604ri == null) {
            return;
        }
        c3604ri.setProgress(f);
        if (f == 0.0f && this.jbs.getVisibility() == 0) {
            this.jbs.setVisibility(4);
        } else {
            if (f <= 0.0f || this.jbs.getVisibility() == 0) {
                return;
            }
            this.jbs.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10814ri(int i) {
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar != null) {
            if (i == 2) {
                lrVar.m10994ri(2);
            } else if (i == 1) {
                lrVar.m10990lr(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10815ri(int i, int i2) {
        super.mo10815ri(i, i2);
        if (i < 0) {
            this.f8304co.setVisibility(8);
            return;
        }
        if (TextUtils.isEmpty(this.f8298ik)) {
            this.f8304co.setText(this.f8301ri.getString(C2729uq.m10307lr(C3299nr.m14642ri(), "tt_multiple_playable_wait_tips"), new Object[]{Integer.valueOf(i)}));
        } else {
            this.f8304co.setText(String.format(this.f8298ik, Integer.valueOf(i)));
        }
        this.f8304co.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10816ri(Activity activity) {
        super.mo10816ri(activity);
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            abstractC2859mj.m11011lr(activity);
        }
        int iM10840ac = m10840ac();
        for (AbstractC2859mj abstractC2859mj2 : this.xha) {
            if (abstractC2859mj2.f8473qt >= iM10840ac) {
                abstractC2859mj2.tan();
            }
        }
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar != null) {
            lrVar.m10986ik();
        }
        bgr bgrVar = this.f8305di;
        if (bgrVar != null) {
            bgrVar.mo16370ik();
        }
        AbstractC2859mj abstractC2859mj3 = this.slm;
        if (abstractC2859mj3 != null && !abstractC2859mj3.mo10796uq() && !this.f8300lr.m14367bl()) {
            C3332vr.m14978lr().post(new C2858lr.ik(this.f8300lr));
        }
        this.slm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10817ri(Bundle bundle) {
        super.mo10817ri(bundle);
        this.f8309sf = new C3192ik(this.f8301ri);
        this.f8308qt.addView(this.f8309sf, new FrameLayout.LayoutParams(-1, -1));
        this.jbs = new C3604ri(this.f8301ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C3583qd.m16589lr(this.f8301ri, 2.0f));
        layoutParams.gravity = 80;
        this.f8308qt.addView(this.jbs, layoutParams);
        C3195mj c3195mj = new C3195mj(this.f8301ri);
        this.f8304co = c3195mj;
        c3195mj.setTextColor(-1);
        this.f8304co.setTextSize(15.0f);
        this.f8304co.setShadowLayer(1.0f, 0.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C3583qd.m16589lr(this.f8301ri, 60.0f);
        layoutParams2.rightMargin = C3583qd.m16589lr(this.f8301ri, 16.0f);
        layoutParams2.gravity = 8388661;
        this.f8308qt.addView(this.f8304co, layoutParams2);
        C3060ik c3060ik = new C3060ik(this.f8301ri);
        this.f8306mj = c3060ik;
        this.f8308qt.addView(c3060ik, new FrameLayout.LayoutParams(-1, -2));
        this.f8306mj.m12212ri(this.f8300lr);
        this.f8306mj.setShowDislike(true);
        mo10822ri(null, null, new C2858lr.fi(1, null));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10818ri(View view) {
        super.mo10818ri(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f8309sf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10819ri(View view, boolean z) {
        super.mo10819ri(view, z);
        if (view.getParent() == null && this.f8309sf != null) {
            view.setVisibility(4);
            int childCount = this.f8309sf.getChildCount();
            if (z) {
                this.f8309sf.addView(view, 0);
            } else {
                this.f8309sf.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10820ri(AbstractC2859mj abstractC2859mj) {
        C2858lr.lr lrVar;
        super.mo10820ri(abstractC2859mj);
        if (abstractC2859mj == null) {
            return;
        }
        Objects.toString(abstractC2859mj);
        boolean z = abstractC2859mj.f8467co;
        if (abstractC2859mj.f8467co && (lrVar = this.f8302aw) != null) {
            lrVar.m10984di();
        }
        AbstractC2859mj abstractC2859mjMo10799aw = mo10799aw();
        if (abstractC2859mjMo10799aw instanceof AbstractC2860ri) {
            C3022ri c3022riMo10787ay = abstractC2859mjMo10799aw.mo10787ay();
            if (c3022riMo10787ay == null || !C3273ac.m13961fi(c3022riMo10787ay.f9389lr)) {
                ((AbstractC2860ri) abstractC2859mjMo10799aw).ihz();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10821ri(AbstractC2859mj abstractC2859mj, C2858lr.fi fiVar) {
        AbstractC2859mj abstractC2859mj2 = this.slm;
        if (abstractC2859mj2 == null || abstractC2859mj2 == abstractC2859mj) {
            if (abstractC2859mj2 != null && (abstractC2859mj2 instanceof AbstractC2860ri)) {
                final long jBgr = (abstractC2859mj2.mo10787ay() == null || this.slm.mo10787ay().ihz == null) ? 0L : this.slm.mo10787ay().ihz.bgr();
                final int i = this.slm.f8475sf + 1;
                C3414ik.m15532ri(System.currentTimeMillis(), this.slm.f8468di, this.slm.mo10767d_(), "dislike_skip", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.jbs.2
                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: lr */
                    public JSONObject mo10797lr() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", jBgr);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ri */
                    public JSONObject mo10798ri() {
                        return C3414ik.m15527ri(i);
                    }
                });
            }
            AbstractC2859mj abstractC2859mjMo10799aw = mo10799aw();
            if (abstractC2859mjMo10799aw == null) {
                abstractC2859mjMo10799aw = bgr();
            }
            mo10822ri(this.slm, abstractC2859mjMo10799aw, fiVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10822ri(AbstractC2859mj abstractC2859mj, AbstractC2859mj abstractC2859mj2, C2858lr.fi fiVar) {
        AbstractC2859mj abstractC2859mj3 = this.slm;
        if ((abstractC2859mj3 == null || abstractC2859mj3 == abstractC2859mj) && !C2722lr.m10243ri(this.f8301ri)) {
            m10840ac();
            if (abstractC2859mj2 == null) {
                AbstractC2859mj abstractC2859mj4 = this.slm;
                int i = abstractC2859mj4 != null ? abstractC2859mj4.f8473qt + 1 : 0;
                if (i < this.xha.size()) {
                    abstractC2859mj2 = this.xha.get(i);
                }
                if (abstractC2859mj2 == null) {
                    this.f8299ka.xha();
                    return;
                }
            }
            AbstractC2859mj abstractC2859mj5 = this.slm;
            if (abstractC2859mj5 != null) {
                if (abstractC2859mj5 == abstractC2859mj2) {
                    return;
                }
                abstractC2859mj5.bgr();
                this.slm.mo10770ka();
                C3072mj c3072mjMo10791ri = this.slm.mo10791ri();
                if (c3072mjMo10791ri != null) {
                    this.f8309sf.removeView(c3072mjMo10791ri);
                }
                this.slm.tan();
                this.slm.f8467co = false;
                if (this.f8299ka.m10932fi()) {
                    AbstractC2859mj abstractC2859mj6 = this.slm;
                    if (abstractC2859mj6 instanceof AbstractC2860ri) {
                        int i2 = abstractC2859mj6.f8473qt + 1;
                        AbstractC2859mj abstractC2859mj7 = i2 < this.xha.size() ? this.xha.get(i2) : null;
                        if ((abstractC2859mj7 instanceof C2853fi) && abstractC2859mj7 != abstractC2859mj2) {
                            C3072mj c3072mjMo10791ri2 = abstractC2859mj7.mo10791ri();
                            if (c3072mjMo10791ri2 != null && c3072mjMo10791ri2.getParent() != null && (c3072mjMo10791ri2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) c3072mjMo10791ri2.getParent()).removeView(c3072mjMo10791ri2);
                            }
                            abstractC2859mj7.tan();
                        }
                    }
                }
            }
            if (C2722lr.m10243ri(this.f8301ri)) {
                return;
            }
            abstractC2859mj2.f8467co = true;
            AbstractC2859mj abstractC2859mj8 = this.slm;
            this.slm = abstractC2859mj2;
            m10835lr(abstractC2859mj8, abstractC2859mj2, fiVar);
            abstractC2859mj2.m11012lr(this.f8301ri, fiVar);
            C3072mj c3072mjMo10791ri3 = abstractC2859mj2.mo10791ri();
            if (c3072mjMo10791ri3 != null) {
                ViewParent parent = c3072mjMo10791ri3.getParent();
                if (parent != null) {
                    if (parent == this.f8309sf) {
                        c3072mjMo10791ri3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(c3072mjMo10791ri3);
                    }
                }
                if (c3072mjMo10791ri3.getParent() == null) {
                    this.f8309sf.addView(c3072mjMo10791ri3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i3 = abstractC2859mj8 != null ? abstractC2859mj8.f8473qt : 0; i3 < this.xha.size(); i3++) {
                this.xha.get(i3).mo10795ri(abstractC2859mj8, this.slm, fiVar);
            }
            this.f8299ka.m10940lr(this.slm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10823ri(AbstractC2859mj abstractC2859mj, boolean z) {
        C2858lr.lr lrVar;
        super.mo10823ri(abstractC2859mj, z);
        if (abstractC2859mj == null) {
            return;
        }
        Objects.toString(abstractC2859mj);
        boolean z2 = abstractC2859mj.f8467co;
        if (!abstractC2859mj.f8467co || (lrVar = this.f8302aw) == null) {
            return;
        }
        lrVar.m10997ri(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10824ri(AbstractC2859mj abstractC2859mj, boolean z, boolean z2, boolean z3, int i) {
        C2853fi c2853fiBgr;
        AbstractC2859mj abstractC2859mj2 = this.slm;
        if ((abstractC2859mj2 == null || abstractC2859mj2 == abstractC2859mj) && (c2853fiBgr = bgr()) != null) {
            C2858lr.fi fiVar = new C2858lr.fi(i, abstractC2859mj != null ? abstractC2859mj.mo10787ay() : null);
            fiVar.f8432ri.putBoolean("isSkip", z);
            fiVar.f8432ri.putBoolean("force", z2);
            fiVar.f8432ri.putBoolean("isFromLandingPage", z3);
            mo10822ri(this.slm, c2853fiBgr, fiVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10825ri(AbstractC2860ri abstractC2860ri, boolean z) {
        C2858lr.lr lrVar;
        super.mo10825ri(abstractC2860ri, z);
        if (abstractC2860ri == null || abstractC2860ri != this.slm || (lrVar = this.f8302aw) == null) {
            return;
        }
        lrVar.m10991lr(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10827ri(boolean z) {
        super.mo10827ri(z);
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            abstractC2859mj.mo10789ik(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public boolean mo10828ri(AbstractC2859mj abstractC2859mj, int i) {
        return i == this.xha.size() - 1 && this.xha.get(i) != null && (this.xha.get(i) instanceof C2853fi);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: sf */
    public AbstractC2859mj mo10829sf() {
        return this.slm;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    public void tan() {
        C2858lr.lr lrVar = this.f8302aw;
        if (lrVar != null) {
            lrVar.jbs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: vr */
    public List<wjv> mo10830vr() {
        return this.f8300lr.lsq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    public void xha() {
        super.xha();
        AbstractC2859mj abstractC2859mj = this.slm;
        if (abstractC2859mj != null) {
            abstractC2859mj.mo10770ka();
        }
    }
}
