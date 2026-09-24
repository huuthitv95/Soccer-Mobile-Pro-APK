package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2147co;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class jbs implements InterfaceC2076ik {

    /* JADX INFO: renamed from: ik */
    private final boolean f4949ik;

    /* JADX INFO: renamed from: lr */
    private final EnumC2077ri f4950lr;

    /* JADX INFO: renamed from: ri */
    private final String f4951ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.jbs$ri */
    public enum EnumC2077ri {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* JADX INFO: renamed from: ri */
        public static EnumC2077ri m6838ri(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i != 4) {
                return i != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public jbs(String str, EnumC2077ri enumC2077ri, boolean z) {
        this.f4951ri = str;
        this.f4950lr = enumC2077ri;
        this.f4949ik = z;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m6835ik() {
        return this.f4949ik;
    }

    /* JADX INFO: renamed from: lr */
    public EnumC2077ri m6836lr() {
        return this.f4950lr;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(com.bytedance.adsdk.p065lr.jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new C2147co(this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6837ri() {
        return this.f4951ri;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f4950lr + AbstractJsonLexerKt.END_OBJ;
    }
}
