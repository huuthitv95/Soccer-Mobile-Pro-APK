package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.ihz;
import com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: loaded from: classes3.dex */
public class tan implements InterfaceC2076ik {

    /* JADX INFO: renamed from: di */
    private final boolean f5014di;

    /* JADX INFO: renamed from: fi */
    private final C2094lr f5015fi;

    /* JADX INFO: renamed from: ik */
    private final C2094lr f5016ik;

    /* JADX INFO: renamed from: ka */
    private final C2094lr f5017ka;

    /* JADX INFO: renamed from: lr */
    private final EnumC2085ri f5018lr;

    /* JADX INFO: renamed from: ri */
    private final String f5019ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.tan$ri */
    public enum EnumC2085ri {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* JADX INFO: renamed from: ri */
        public static EnumC2085ri m6889ri(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public tan(String str, EnumC2085ri enumC2085ri, C2094lr c2094lr, C2094lr c2094lr2, C2094lr c2094lr3, boolean z) {
        this.f5019ri = str;
        this.f5018lr = enumC2085ri;
        this.f5016ik = c2094lr;
        this.f5017ka = c2094lr2;
        this.f5015fi = c2094lr3;
        this.f5014di = z;
    }

    /* JADX INFO: renamed from: di */
    public boolean m6883di() {
        return this.f5014di;
    }

    /* JADX INFO: renamed from: fi */
    public C2094lr m6884fi() {
        return this.f5015fi;
    }

    /* JADX INFO: renamed from: ik */
    public C2094lr m6885ik() {
        return this.f5017ka;
    }

    /* JADX INFO: renamed from: ka */
    public C2094lr m6886ka() {
        return this.f5016ik;
    }

    /* JADX INFO: renamed from: lr */
    public EnumC2085ri m6887lr() {
        return this.f5018lr;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new ihz(abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6888ri() {
        return this.f5019ri;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f5016ik + ", end: " + this.f5017ka + ", offset: " + this.f5015fi + "}";
    }
}
