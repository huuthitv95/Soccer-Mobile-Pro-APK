package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.bgr;
import com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2082qt implements InterfaceC2076ik {

    /* JADX INFO: renamed from: di */
    private final C2094lr f4992di;

    /* JADX INFO: renamed from: fi */
    private final C2094lr f4993fi;

    /* JADX INFO: renamed from: ik */
    private final C2094lr f4994ik;
    private final C2094lr jbs;

    /* JADX INFO: renamed from: ka */
    private final InterfaceC2088aw<PointF, PointF> f4995ka;

    /* JADX INFO: renamed from: lr */
    private final ri f4996lr;

    /* JADX INFO: renamed from: mj */
    private final C2094lr f4997mj;

    /* JADX INFO: renamed from: qt */
    private final boolean f4998qt;

    /* JADX INFO: renamed from: ri */
    private final String f4999ri;

    /* JADX INFO: renamed from: sf */
    private final boolean f5000sf;
    private final C2094lr xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.qt$ri */
    public enum ri {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: ik */
        private final int f5004ik;

        ri(int i) {
            this.f5004ik = i;
        }

        /* JADX INFO: renamed from: ri */
        public static ri m6873ri(int i) {
            for (ri riVar : values()) {
                if (riVar.f5004ik == i) {
                    return riVar;
                }
            }
            return null;
        }
    }

    public C2082qt(String str, ri riVar, C2094lr c2094lr, InterfaceC2088aw<PointF, PointF> interfaceC2088aw, C2094lr c2094lr2, C2094lr c2094lr3, C2094lr c2094lr4, C2094lr c2094lr5, C2094lr c2094lr6, boolean z, boolean z2) {
        this.f4999ri = str;
        this.f4996lr = riVar;
        this.f4994ik = c2094lr;
        this.f4995ka = interfaceC2088aw;
        this.f4993fi = c2094lr2;
        this.f4992di = c2094lr3;
        this.xha = c2094lr4;
        this.f4997mj = c2094lr5;
        this.jbs = c2094lr6;
        this.f4998qt = z;
        this.f5000sf = z2;
    }

    /* JADX INFO: renamed from: di */
    public C2094lr m6864di() {
        return this.f4992di;
    }

    /* JADX INFO: renamed from: fi */
    public C2094lr m6865fi() {
        return this.f4993fi;
    }

    /* JADX INFO: renamed from: ik */
    public C2094lr m6866ik() {
        return this.f4994ik;
    }

    public C2094lr jbs() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ka */
    public InterfaceC2088aw<PointF, PointF> m6867ka() {
        return this.f4995ka;
    }

    /* JADX INFO: renamed from: lr */
    public ri m6868lr() {
        return this.f4996lr;
    }

    /* JADX INFO: renamed from: mj */
    public C2094lr m6869mj() {
        return this.f4997mj;
    }

    /* JADX INFO: renamed from: qt */
    public boolean m6870qt() {
        return this.f4998qt;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new bgr(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6871ri() {
        return this.f4999ri;
    }

    /* JADX INFO: renamed from: sf */
    public boolean m6872sf() {
        return this.f5000sf;
    }

    public C2094lr xha() {
        return this.xha;
    }
}
