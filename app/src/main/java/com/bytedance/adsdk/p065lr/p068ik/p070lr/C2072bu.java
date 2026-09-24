package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2095mj;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2154nr;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2072bu implements InterfaceC2076ik {

    /* JADX INFO: renamed from: ik */
    private final C2095mj f4921ik;

    /* JADX INFO: renamed from: ka */
    private final boolean f4922ka;

    /* JADX INFO: renamed from: lr */
    private final int f4923lr;

    /* JADX INFO: renamed from: ri */
    private final String f4924ri;

    public C2072bu(String str, int i, C2095mj c2095mj, boolean z) {
        this.f4924ri = str;
        this.f4923lr = i;
        this.f4921ik = c2095mj;
        this.f4922ka = z;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m6809ik() {
        return this.f4922ka;
    }

    /* JADX INFO: renamed from: lr */
    public C2095mj m6810lr() {
        return this.f4921ik;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new C2154nr(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6811ri() {
        return this.f4924ri;
    }

    public String toString() {
        return "ShapePath{name=" + this.f4924ri + ", index=" + this.f4923lr + AbstractJsonLexerKt.END_OBJ;
    }
}
