package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import android.graphics.Path;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2097ri;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2086vr implements InterfaceC2076ik {

    /* JADX INFO: renamed from: di */
    private final boolean f5023di;

    /* JADX INFO: renamed from: fi */
    private final C2093ka f5024fi;

    /* JADX INFO: renamed from: ik */
    private final String f5025ik;

    /* JADX INFO: renamed from: ka */
    private final C2097ri f5026ka;

    /* JADX INFO: renamed from: lr */
    private final Path.FillType f5027lr;

    /* JADX INFO: renamed from: ri */
    private final boolean f5028ri;

    public C2086vr(String str, boolean z, Path.FillType fillType, C2097ri c2097ri, C2093ka c2093ka, boolean z2) {
        this.f5025ik = str;
        this.f5028ri = z;
        this.f5027lr = fillType;
        this.f5026ka = c2097ri;
        this.f5024fi = c2093ka;
        this.f5023di = z2;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m6890fi() {
        return this.f5023di;
    }

    /* JADX INFO: renamed from: ik */
    public C2093ka m6891ik() {
        return this.f5024fi;
    }

    /* JADX INFO: renamed from: ka */
    public Path.FillType m6892ka() {
        return this.f5027lr;
    }

    /* JADX INFO: renamed from: lr */
    public C2097ri m6893lr() {
        return this.f5026ka;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new com.bytedance.adsdk.p065lr.p074ri.p076ri.xha(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6894ri() {
        return this.f5025ik;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f5028ri + AbstractJsonLexerKt.END_OBJ;
    }
}
