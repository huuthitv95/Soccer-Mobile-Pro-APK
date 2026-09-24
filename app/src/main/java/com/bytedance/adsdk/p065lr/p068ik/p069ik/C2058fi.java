package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import com.bytedance.adsdk.p065lr.p067fi.C2044qt;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2080mj;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2083ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2089co;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2096qt;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2098sf;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2058fi {

    /* JADX INFO: renamed from: ac */
    private final List<C2167ri<Float>> f4803ac;

    /* JADX INFO: renamed from: aw */
    private final float f4804aw;

    /* JADX INFO: renamed from: ay */
    private final C2044qt f4805ay;
    private final float bgr;

    /* JADX INFO: renamed from: bu */
    private final C2096qt f4806bu;

    /* JADX INFO: renamed from: co */
    private final int f4807co;

    /* JADX INFO: renamed from: di */
    private final long f4808di;

    /* JADX INFO: renamed from: fi */
    private final ri f4809fi;
    private final lr ihz;

    /* JADX INFO: renamed from: ik */
    private final String f4810ik;
    private final C2089co jbs;

    /* JADX INFO: renamed from: ka */
    private final long f4811ka;

    /* JADX INFO: renamed from: lr */
    private final xha f4812lr;

    /* JADX INFO: renamed from: mj */
    private final List<C2080mj> f4813mj;

    /* JADX INFO: renamed from: nr */
    private final C2098sf f4814nr;

    /* JADX INFO: renamed from: qt */
    private final int f4815qt;

    /* JADX INFO: renamed from: ri */
    private final List<InterfaceC2076ik> f4816ri;

    /* JADX INFO: renamed from: sf */
    private final int f4817sf;
    private final float slm;
    private final C2094lr tan;

    /* JADX INFO: renamed from: uq */
    private final boolean f4818uq;

    /* JADX INFO: renamed from: vr */
    private final float f4819vr;
    private final C2083ri wjv;
    private final String xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.fi$lr */
    public enum lr {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.fi$ri */
    public enum ri {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public C2058fi(List<InterfaceC2076ik> list, xha xhaVar, String str, long j, ri riVar, long j2, String str2, List<C2080mj> list2, C2089co c2089co, int i, int i2, int i3, float f, float f2, float f3, float f4, C2096qt c2096qt, C2098sf c2098sf, List<C2167ri<Float>> list3, lr lrVar, C2094lr c2094lr, boolean z, C2083ri c2083ri, C2044qt c2044qt) {
        this.f4816ri = list;
        this.f4812lr = xhaVar;
        this.f4810ik = str;
        this.f4811ka = j;
        this.f4809fi = riVar;
        this.f4808di = j2;
        this.xha = str2;
        this.f4813mj = list2;
        this.jbs = c2089co;
        this.f4815qt = i;
        this.f4817sf = i2;
        this.f4807co = i3;
        this.f4804aw = f;
        this.bgr = f2;
        this.f4819vr = f3;
        this.slm = f4;
        this.f4806bu = c2096qt;
        this.f4814nr = c2098sf;
        this.f4803ac = list3;
        this.ihz = lrVar;
        this.tan = c2094lr;
        this.f4818uq = z;
        this.wjv = c2083ri;
        this.f4805ay = c2044qt;
    }

    /* JADX INFO: renamed from: ac */
    C2098sf m6711ac() {
        return this.f4814nr;
    }

    /* JADX INFO: renamed from: aw */
    long m6712aw() {
        return this.f4808di;
    }

    /* JADX INFO: renamed from: ay */
    public C2044qt m6713ay() {
        return this.f4805ay;
    }

    List<InterfaceC2076ik> bgr() {
        return this.f4816ri;
    }

    /* JADX INFO: renamed from: bu */
    int m6714bu() {
        return this.f4817sf;
    }

    /* JADX INFO: renamed from: co */
    lr m6715co() {
        return this.ihz;
    }

    /* JADX INFO: renamed from: di */
    public String m6716di() {
        return this.f4810ik;
    }

    /* JADX INFO: renamed from: fi */
    public long m6717fi() {
        return this.f4811ka;
    }

    C2094lr ihz() {
        return this.tan;
    }

    /* JADX INFO: renamed from: ik */
    float m6718ik() {
        return this.bgr / this.f4812lr.m7181bu();
    }

    float jbs() {
        return this.slm;
    }

    /* JADX INFO: renamed from: ka */
    List<C2167ri<Float>> m6719ka() {
        return this.f4803ac;
    }

    /* JADX INFO: renamed from: lr */
    float m6720lr() {
        return this.f4804aw;
    }

    /* JADX INFO: renamed from: mj */
    float m6721mj() {
        return this.f4819vr;
    }

    /* JADX INFO: renamed from: nr */
    int m6722nr() {
        return this.f4815qt;
    }

    /* JADX INFO: renamed from: qt */
    List<C2080mj> m6723qt() {
        return this.f4813mj;
    }

    /* JADX INFO: renamed from: ri */
    xha m6724ri() {
        return this.f4812lr;
    }

    /* JADX INFO: renamed from: ri */
    public String m6725ri(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m6716di());
        sb.append("\n");
        C2058fi c2058fiM7194ri = this.f4812lr.m7194ri(m6712aw());
        if (c2058fiM7194ri != null) {
            sb.append("\t\tParents: ");
            sb.append(c2058fiM7194ri.m6716di());
            C2058fi c2058fiM7194ri2 = this.f4812lr.m7194ri(c2058fiM7194ri.m6712aw());
            while (c2058fiM7194ri2 != null) {
                sb.append("->");
                sb.append(c2058fiM7194ri2.m6716di());
                c2058fiM7194ri2 = this.f4812lr.m7194ri(c2058fiM7194ri2.m6712aw());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!m6723qt().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(m6723qt().size());
            sb.append("\n");
        }
        if (m6722nr() != 0 && m6714bu() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m6722nr()), Integer.valueOf(m6714bu()), Integer.valueOf(slm())));
        }
        if (!this.f4816ri.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (InterfaceC2076ik interfaceC2076ik : this.f4816ri) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(interfaceC2076ik);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: sf */
    public ri m6726sf() {
        return this.f4809fi;
    }

    int slm() {
        return this.f4807co;
    }

    C2096qt tan() {
        return this.f4806bu;
    }

    public String toString() {
        return m6725ri("");
    }

    /* JADX INFO: renamed from: uq */
    public boolean m6727uq() {
        return this.f4818uq;
    }

    /* JADX INFO: renamed from: vr */
    C2089co m6728vr() {
        return this.jbs;
    }

    public C2083ri wjv() {
        return this.wjv;
    }

    public String xha() {
        return this.xha;
    }
}
