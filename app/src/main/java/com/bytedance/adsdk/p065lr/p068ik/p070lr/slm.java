package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2151ka;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class slm implements InterfaceC2076ik {

    /* JADX INFO: renamed from: ik */
    private final boolean f5011ik;

    /* JADX INFO: renamed from: lr */
    private final List<InterfaceC2076ik> f5012lr;

    /* JADX INFO: renamed from: ri */
    private final String f5013ri;

    public slm(String str, List<InterfaceC2076ik> list, boolean z) {
        this.f5013ri = str;
        this.f5012lr = list;
        this.f5011ik = z;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m6880ik() {
        return this.f5011ik;
    }

    /* JADX INFO: renamed from: lr */
    public List<InterfaceC2076ik> m6881lr() {
        return this.f5012lr;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new C2151ka(jbsVar, abstractC2068ri, this, xhaVar);
    }

    /* JADX INFO: renamed from: ri */
    public String m6882ri() {
        return this.f5013ri;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f5013ri + "' Shapes: " + Arrays.toString(this.f5012lr.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
