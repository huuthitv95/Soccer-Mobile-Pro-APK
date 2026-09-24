package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import android.graphics.Paint;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2097ri;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2143ac;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2081nr implements InterfaceC2076ik {

    /* JADX INFO: renamed from: di */
    private final C2094lr f4974di;

    /* JADX INFO: renamed from: fi */
    private final C2093ka f4975fi;

    /* JADX INFO: renamed from: ik */
    private final List<C2094lr> f4976ik;
    private final float jbs;

    /* JADX INFO: renamed from: ka */
    private final C2097ri f4977ka;

    /* JADX INFO: renamed from: lr */
    private final C2094lr f4978lr;

    /* JADX INFO: renamed from: mj */
    private final lr f4979mj;

    /* JADX INFO: renamed from: qt */
    private final boolean f4980qt;

    /* JADX INFO: renamed from: ri */
    private final String f4981ri;
    private final ri xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.nr$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: lr */
        static final /* synthetic */ int[] f4982lr;

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f4983ri;

        static {
            int[] iArr = new int[lr.values().length];
            f4982lr = iArr;
            try {
                iArr[lr.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4982lr[lr.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4982lr[lr.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ri.values().length];
            f4983ri = iArr2;
            try {
                iArr2[ri.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4983ri[ri.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4983ri[ri.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.nr$lr */
    public enum lr {
        MITER,
        ROUND,
        BEVEL;

        /* JADX INFO: renamed from: ri */
        public Paint.Join m6862ri() {
            int i = AnonymousClass1.f4982lr[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.nr$ri */
    public enum ri {
        BUTT,
        ROUND,
        UNKNOWN;

        /* JADX INFO: renamed from: ri */
        public Paint.Cap m6863ri() {
            int i = AnonymousClass1.f4983ri[ordinal()];
            if (i != 1) {
                return i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public C2081nr(String str, C2094lr c2094lr, List<C2094lr> list, C2097ri c2097ri, C2093ka c2093ka, C2094lr c2094lr2, ri riVar, lr lrVar, float f, boolean z) {
        this.f4981ri = str;
        this.f4978lr = c2094lr;
        this.f4976ik = list;
        this.f4977ka = c2097ri;
        this.f4975fi = c2093ka;
        this.f4974di = c2094lr2;
        this.xha = riVar;
        this.f4979mj = lrVar;
        this.jbs = f;
        this.f4980qt = z;
    }

    /* JADX INFO: renamed from: di */
    public C2094lr m6854di() {
        return this.f4978lr;
    }

    /* JADX INFO: renamed from: fi */
    public List<C2094lr> m6855fi() {
        return this.f4976ik;
    }

    /* JADX INFO: renamed from: ik */
    public C2093ka m6856ik() {
        return this.f4975fi;
    }

    public float jbs() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ka */
    public C2094lr m6857ka() {
        return this.f4974di;
    }

    /* JADX INFO: renamed from: lr */
    public C2097ri m6858lr() {
        return this.f4977ka;
    }

    /* JADX INFO: renamed from: mj */
    public lr m6859mj() {
        return this.f4979mj;
    }

    /* JADX INFO: renamed from: qt */
    public boolean m6860qt() {
        return this.f4980qt;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new C2143ac(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6861ri() {
        return this.f4981ri;
    }

    public ri xha() {
        return this.xha;
    }
}
