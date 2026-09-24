package com.bytedance.sdk.component.adexpress.dynamic.p116fi;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2470di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2474lr;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.jbs;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2433fi {

    /* JADX INFO: renamed from: ik */
    private C2475mj f6560ik;

    /* JADX INFO: renamed from: ka */
    private ri f6561ka;

    /* JADX INFO: renamed from: lr */
    protected C2436lr f6562lr;

    /* JADX INFO: renamed from: ri */
    public C2474lr f6563ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.fi$ri */
    static class ri {

        /* JADX INFO: renamed from: ik */
        float f6564ik;

        /* JADX INFO: renamed from: lr */
        float f6565lr;

        /* JADX INFO: renamed from: ri */
        float f6566ri;

        ri() {
        }
    }

    public C2433fi(double d, int i, double d2, String str, C2500aw c2500aw) {
        this.f6562lr = new C2436lr(d, i, d2, str, c2500aw);
    }

    /* JADX INFO: renamed from: ri */
    private jbs m8364ri(C2470di c2470di, C2436lr.ik ikVar, C2436lr.ik ikVar2) {
        float fM8572ud = c2470di.m8572ud();
        float fQmx = c2470di.qmx();
        float fHpn = c2470di.hpn();
        float fM8505id = c2470di.m8505id();
        boolean zM8536nd = c2470di.m8536nd();
        boolean zM8586zb = c2470di.m8586zb();
        boolean zAac = c2470di.aac();
        boolean zM8583xe = c2470di.m8583xe();
        if (!zM8536nd) {
            if (zM8586zb) {
                fM8572ud = ((this.f6561ka.f6566ri != 0.0f ? Math.min(this.f6561ka.f6566ri, ikVar.f6575ri) : ikVar.f6575ri) - fHpn) - ikVar2.f6575ri;
            } else {
                fM8572ud = 0.0f;
            }
        }
        if (!zAac) {
            if (zM8583xe) {
                fQmx = ((this.f6561ka.f6565lr != 0.0f ? this.f6561ka.f6565lr : ikVar.f6574lr) - fM8505id) - ikVar2.f6574lr;
            } else {
                fQmx = 0.0f;
            }
        }
        return new jbs(fM8572ud, fQmx);
    }

    /* JADX INFO: renamed from: ri */
    private jbs m8365ri(C2474lr c2474lr, C2470di c2470di, float f, float f2) {
        float f3;
        float f4;
        float f5 = c2474lr.f6776ri;
        float f6 = c2474lr.f6773lr;
        float fM8572ud = c2470di.m8572ud();
        float fQmx = c2470di.qmx();
        float fHpn = c2470di.hpn();
        float fM8505id = c2470di.m8505id();
        boolean zM8536nd = c2470di.m8536nd();
        boolean zM8586zb = c2470di.m8586zb();
        boolean zAac = c2470di.aac();
        boolean zM8583xe = c2470di.m8583xe();
        String strM8571tw = c2470di.m8571tw();
        float f7 = c2474lr.f6771ik;
        float f8 = c2474lr.f6772ka;
        if (TextUtils.equals(strM8571tw, "0")) {
            if (zM8536nd) {
                f5 = c2474lr.f6776ri + fM8572ud;
            } else if (zM8586zb) {
                f5 = ((c2474lr.f6776ri + f7) - fHpn) - f;
            }
            if (zAac) {
                f4 = c2474lr.f6773lr;
                f6 = f4 + fQmx;
            } else if (zM8583xe) {
                f3 = c2474lr.f6773lr;
                f6 = ((f3 + f8) - fM8505id) - f2;
            }
        } else if (TextUtils.equals(strM8571tw, "1")) {
            f5 = c2474lr.f6776ri + ((f7 - f) / 2.0f);
            if (zAac) {
                f4 = c2474lr.f6773lr;
                f6 = f4 + fQmx;
            } else if (zM8583xe) {
                f3 = c2474lr.f6773lr;
                f6 = ((f3 + f8) - fM8505id) - f2;
            }
        } else if (TextUtils.equals(strM8571tw, "2")) {
            f6 = c2474lr.f6773lr + ((f8 - f2) / 2.0f);
            if (zM8536nd) {
                f5 = c2474lr.f6776ri + fM8572ud;
            } else if (zM8586zb) {
                f5 = ((c2474lr.f6776ri + f7) - fHpn) - f;
            }
        } else if (TextUtils.equals(strM8571tw, ExifInterface.GPS_MEASUREMENT_3D)) {
            f5 = c2474lr.f6776ri + ((f7 - f) / 2.0f);
            f6 = c2474lr.f6773lr + ((f8 - f2) / 2.0f);
        }
        return new jbs(f5, f6);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x033e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0217  */
    /* JADX INFO: renamed from: ri */
    public C2474lr m8366ri(C2474lr c2474lr, float f) {
        float fM8410ri;
        float fM8410ri2;
        float fM8410ri3;
        float fM8410ri4;
        float f2;
        C2475mj c2475mj = c2474lr.f6769di;
        if (c2475mj != null) {
            c2475mj.ihz();
            List<List<C2475mj>> listM8610bu = c2475mj.m8610bu();
            if (listM8610bu != null && listM8610bu.size() > 0) {
                C2470di c2470diM8592fi = c2475mj.m8627qt().m8592fi();
                float fM8472bu = c2470diM8592fi.m8472bu();
                float fSlm = c2470diM8592fi.slm();
                float fBgr = c2470diM8592fi.bgr();
                float fM8576vr = c2470diM8592fi.m8576vr();
                float fM8476co = c2470diM8592fi.m8476co();
                String strM8514jc = c2470diM8592fi.m8514jc();
                String strM8523kt = c2470diM8592fi.m8523kt();
                float f3 = c2474lr.f6776ri + fM8576vr;
                float f4 = c2474lr.f6773lr + fM8472bu;
                float f5 = (c2474lr.f6771ik - fM8576vr) - fSlm;
                float f6 = 2.0f;
                float f7 = fM8476co * 2.0f;
                float f8 = f5 - f7;
                float f9 = ((c2474lr.f6772ka - fM8472bu) - fBgr) - f7;
                jbs jbsVar = new jbs(f3, f4);
                if (c2474lr.xha == null) {
                    c2474lr.xha = new ArrayList();
                }
                Iterator<List<C2475mj>> it = listM8610bu.iterator();
                float f10 = 0.0f;
                while (it.hasNext()) {
                    float f11 = f6;
                    C2436lr.ik ikVarM8405ri = this.f6562lr.m8405ri(it.next());
                    if (ikVarM8405ri != null) {
                        f10 += ikVarM8405ri.f6574lr;
                    }
                    f6 = f11;
                }
                float f12 = f6;
                String str = "space-between";
                String str2 = "space-around";
                int i = 1;
                if (f10 >= f9) {
                    fM8410ri = 0.0f;
                    fM8410ri2 = 0.0f;
                } else {
                    if (TextUtils.equals(strM8523kt, "center")) {
                        fM8410ri2 = (f9 - f10) / f12;
                    } else if (TextUtils.equals(strM8523kt, "flex-end")) {
                        fM8410ri2 = f9 - f10;
                    } else if (TextUtils.equals(strM8523kt, "space-around")) {
                        fM8410ri2 = C2438qt.m8410ri((f9 - f10) / (listM8610bu.size() + 1));
                        fM8410ri = fM8410ri2;
                    } else {
                        if (!TextUtils.equals(strM8523kt, "space-between") || listM8610bu.size() <= 1) {
                            fM8410ri = 0.0f;
                        } else {
                            fM8410ri = C2438qt.m8410ri((f9 - f10) / (listM8610bu.size() - 1));
                        }
                        fM8410ri2 = 0.0f;
                    }
                    fM8410ri = 0.0f;
                }
                jbsVar.f6761lr += fM8410ri2;
                float f13 = f;
                int i2 = 0;
                while (i2 < listM8610bu.size()) {
                    List<C2475mj> list = listM8610bu.get(i2);
                    i2++;
                    int i3 = i;
                    if (i2 >= c2474lr.xha.size()) {
                        int i4 = 0;
                        for (int size = (i2 - c2474lr.xha.size()) + 1; i4 < size; size = size) {
                            c2474lr.xha.add(new ArrayList());
                            i4++;
                        }
                    }
                    Iterator<C2475mj> it2 = list.iterator();
                    float f14 = 0.0f;
                    while (true) {
                        it2 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        C2475mj next = it2.next();
                        C2470di c2470diM8592fi2 = next.m8627qt().m8592fi();
                        float f15 = f14;
                        String strM8587zf = c2470diM8592fi2.m8587zf();
                        float f16 = fM8410ri;
                        int iGcp = c2470diM8592fi2.gcp();
                        f13 = f13;
                        if (TextUtils.equals(strM8587zf, "flex") || iGcp == i3 || iGcp == 2) {
                            f14 = f15;
                        } else {
                            C2436lr.ik ikVarM8403ri = this.f6562lr.m8403ri(next);
                            f14 = ikVarM8403ri != null ? f15 + ikVarM8403ri.f6575ri : f15;
                        }
                        fM8410ri = f16;
                        i3 = 1;
                    }
                    float f17 = fM8410ri;
                    float f18 = f13;
                    float fMax = Math.max(f8 - f14, 0.0f);
                    Iterator<C2475mj> it3 = list.iterator();
                    float f19 = 0.0f;
                    while (it3.hasNext()) {
                        C2475mj next2 = it3.next();
                        C2470di c2470diM8592fi3 = next2.m8627qt().m8592fi();
                        it3 = it3;
                        float f20 = f19;
                        if (c2470diM8592fi3.gcp() == 1 || c2470diM8592fi3.gcp() == 2) {
                            f19 = f20;
                        } else {
                            C2436lr.ik ikVarM8403ri2 = this.f6562lr.m8403ri(next2);
                            f19 = ikVarM8403ri2 != null ? f20 + ikVarM8403ri2.f6575ri : f20;
                        }
                    }
                    float f21 = f19;
                    if (f21 >= f8) {
                        fM8410ri3 = 0.0f;
                        fM8410ri4 = 0.0f;
                    } else {
                        if (TextUtils.equals(strM8514jc, "center")) {
                            fM8410ri3 = (f8 - f21) / f12;
                        } else if (TextUtils.equals(strM8514jc, "flex-end")) {
                            fM8410ri3 = f8 - f21;
                        } else if (TextUtils.equals(strM8514jc, str2)) {
                            fM8410ri3 = C2438qt.m8410ri((f8 - f21) / (list.size() + 1));
                            fM8410ri4 = fM8410ri3;
                        } else if (!TextUtils.equals(strM8514jc, str) || list.size() <= 1) {
                            fM8410ri3 = 0.0f;
                        } else {
                            fM8410ri4 = C2438qt.m8410ri((f8 - f21) / (list.size() - 1.0f));
                            fM8410ri3 = 0.0f;
                        }
                        fM8410ri4 = 0.0f;
                    }
                    jbsVar.f6762ri += fM8410ri3;
                    Iterator<C2475mj> it4 = list.iterator();
                    float fMax2 = 0.0f;
                    while (it4.hasNext()) {
                        Iterator<C2475mj> it5 = it4;
                        C2475mj next3 = it4.next();
                        float f22 = fM8410ri4;
                        float f23 = this.f6562lr.m8403ri(next3) != null ? this.f6562lr.m8403ri(next3).f6574lr : 0.0f;
                        C2470di c2470diM8592fi4 = next3.m8627qt().m8592fi();
                        fMax2 = Math.max(fMax2, (c2470diM8592fi4.gcp() == 1 || c2470diM8592fi4.gcp() == 2) ? 0.0f : f23);
                        it4 = it5;
                        fM8410ri4 = f22;
                    }
                    float f24 = fM8410ri4;
                    Iterator<C2475mj> it6 = list.iterator();
                    while (it6.hasNext()) {
                        C2475mj next4 = it6.next();
                        Iterator<C2475mj> it7 = it6;
                        C2436lr.ik ikVarM8403ri3 = this.f6562lr.m8403ri(next4);
                        String str3 = str;
                        C2470di c2470diM8592fi5 = next4.m8627qt().m8592fi();
                        String str4 = strM8514jc;
                        float fTnn = c2470diM8592fi5.tnn();
                        float fBnj = c2470diM8592fi5.bnj();
                        float fM8492fe = c2470diM8592fi5.m8492fe();
                        float fM8570ta = c2470diM8592fi5.m8570ta();
                        float f25 = ikVarM8403ri3 == null ? 0.0f : ikVarM8403ri3.f6575ri;
                        float f26 = ikVarM8403ri3 == null ? 0.0f : ikVarM8403ri3.f6574lr;
                        float f27 = f25;
                        float f28 = TextUtils.equals(c2475mj.m8616ik(), "root") ? i2 : f18;
                        float f29 = fMax2;
                        jbs jbsVarM8364ri = c2470diM8592fi5.gcp() == 2 ? m8364ri(c2470diM8592fi5, this.f6562lr.m8403ri(this.f6560ik), new C2436lr.ik((f27 - fBnj) - fM8570ta, (f26 - fTnn) - fM8492fe)) : c2470diM8592fi5.gcp() == 1 ? m8365ri(c2474lr, c2470diM8592fi5, (f27 - fBnj) - fM8570ta, (f26 - fTnn) - fM8492fe) : jbsVar;
                        String strHws = c2470diM8592fi.hws();
                        if (f29 <= f26 || TextUtils.equals(strHws, "flex-start")) {
                            f2 = 0.0f;
                        } else {
                            strHws.hashCode();
                            if (strHws.equals("center")) {
                                f2 = (f29 - f26) / f12;
                            } else if (strHws.equals("flex-end")) {
                                f2 = f29 - f26;
                            } else {
                                f2 = 0.0f;
                            }
                        }
                        C2474lr c2474lr2 = new C2474lr();
                        c2474lr2.f6776ri = jbsVarM8364ri.f6762ri + fM8570ta;
                        c2474lr2.f6773lr = jbsVarM8364ri.f6761lr + fTnn + f2;
                        c2474lr2.f6771ik = (f27 - fBnj) - fM8570ta;
                        c2474lr2.f6772ka = (f26 - fTnn) - fM8492fe;
                        c2474lr2.f6770fi = c2474lr.f6770fi + "." + next4.m8616ik();
                        c2474lr2.f6774mj = c2474lr;
                        c2474lr2.f6769di = next4;
                        c2474lr2.jbs = fMax;
                        c2474lr2.f6775qt = list;
                        c2474lr2.f6769di.m8617ik(c2474lr2.f6776ri);
                        c2474lr2.f6769di.m8620ka(c2474lr2.f6773lr);
                        c2474lr2.f6769di.m8615fi(c2474lr2.f6771ik);
                        c2474lr2.f6769di.m8613di(c2474lr2.f6772ka);
                        c2474lr.xha.get(i2).add(m8366ri(c2474lr2, f28));
                        if (c2470diM8592fi5.gcp() != 1 && c2470diM8592fi5.gcp() != 2) {
                            jbsVar.f6762ri += f27 + f24;
                        }
                        f18 = f28;
                        strM8514jc = str4;
                        str = str3;
                        fMax2 = f29;
                        f8 = f8;
                        str2 = str2;
                        it6 = it7;
                    }
                    jbsVar.f6762ri = f3;
                    jbsVar.f6761lr += fMax2 + f17;
                    i = 1;
                    listM8610bu = listM8610bu;
                    f13 = f18;
                    fM8410ri = f17;
                }
            }
        }
        return c2474lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m8367ri() {
        this.f6562lr.m8406ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m8368ri(ri riVar) {
        this.f6561ka = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m8369ri(C2474lr c2474lr) {
        if (c2474lr == null) {
            return;
        }
        c2474lr.f6769di.m8627qt().m8596lr();
        float f = c2474lr.f6771ik;
        float f2 = c2474lr.f6772ka;
        float f3 = c2474lr.f6776ri;
        float f4 = c2474lr.f6773lr;
        List<List<C2474lr>> list = c2474lr.xha;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<C2474lr> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<C2474lr> it = list2.iterator();
                while (it.hasNext()) {
                    m8369ri(it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m8370ri(C2475mj c2475mj, float f, float f2) {
        if (c2475mj != null) {
            this.f6560ik = c2475mj;
        }
        C2475mj c2475mj2 = this.f6560ik;
        float fM8625mj = c2475mj2.m8625mj();
        float fJbs = c2475mj2.jbs();
        float f3 = TextUtils.equals(c2475mj2.m8627qt().m8592fi().igq(), "fixed") ? fJbs : 65536.0f;
        this.f6562lr.m8406ri();
        this.f6562lr.m8400ik(c2475mj2, fM8625mj, f3);
        C2436lr.ik ikVarM8403ri = this.f6562lr.m8403ri(c2475mj2);
        C2474lr c2474lr = new C2474lr();
        c2474lr.f6776ri = f;
        c2474lr.f6773lr = f2;
        if (ikVarM8403ri != null) {
            fM8625mj = ikVarM8403ri.f6575ri;
        }
        c2474lr.f6771ik = fM8625mj;
        if (ikVarM8403ri != null) {
            fJbs = ikVarM8403ri.f6574lr;
        }
        c2474lr.f6772ka = fJbs;
        c2474lr.f6770fi = "root";
        c2474lr.jbs = 1280.0f;
        c2474lr.f6769di = c2475mj2;
        c2474lr.f6769di.m8617ik(c2474lr.f6776ri);
        c2474lr.f6769di.m8620ka(c2474lr.f6773lr);
        c2474lr.f6769di.m8615fi(c2474lr.f6771ik);
        c2474lr.f6769di.m8613di(c2474lr.f6772ka);
        C2474lr c2474lrM8366ri = m8366ri(c2474lr, 0.0f);
        this.f6563ri = c2474lrM8366ri;
        m8369ri(c2474lrM8366ri);
    }
}
