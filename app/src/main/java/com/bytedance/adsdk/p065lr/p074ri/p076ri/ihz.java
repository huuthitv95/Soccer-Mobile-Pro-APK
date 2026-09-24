package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.tan;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ihz implements AbstractC2139ri.ri, InterfaceC2150ik {

    /* JADX INFO: renamed from: di */
    private final AbstractC2139ri<?, Float> f5262di;

    /* JADX INFO: renamed from: fi */
    private final AbstractC2139ri<?, Float> f5263fi;

    /* JADX INFO: renamed from: ik */
    private final List<AbstractC2139ri.ri> f5264ik = new ArrayList();

    /* JADX INFO: renamed from: ka */
    private final tan.EnumC2085ri f5265ka;

    /* JADX INFO: renamed from: lr */
    private final boolean f5266lr;

    /* JADX INFO: renamed from: ri */
    private final String f5267ri;
    private final AbstractC2139ri<?, Float> xha;

    public ihz(AbstractC2068ri abstractC2068ri, tan tanVar) {
        this.f5267ri = tanVar.m6888ri();
        this.f5266lr = tanVar.m6883di();
        this.f5265ka = tanVar.m6887lr();
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri = tanVar.m6886ka().mo6903ri();
        this.f5263fi = abstractC2139riMo6903ri;
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri2 = tanVar.m6885ik().mo6903ri();
        this.f5262di = abstractC2139riMo6903ri2;
        AbstractC2139ri<Float, Float> abstractC2139riMo6903ri3 = tanVar.m6884fi().mo6903ri();
        this.xha = abstractC2139riMo6903ri3;
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri2);
        abstractC2068ri.m6793ri(abstractC2139riMo6903ri3);
        abstractC2139riMo6903ri.m7111ri(this);
        abstractC2139riMo6903ri2.m7111ri(this);
        abstractC2139riMo6903ri3.m7111ri(this);
    }

    /* JADX INFO: renamed from: di */
    public boolean m7144di() {
        return this.f5266lr;
    }

    /* JADX INFO: renamed from: fi */
    public AbstractC2139ri<?, Float> m7145fi() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ik */
    public AbstractC2139ri<?, Float> m7146ik() {
        return this.f5263fi;
    }

    /* JADX INFO: renamed from: ka */
    public AbstractC2139ri<?, Float> m7147ka() {
        return this.f5262di;
    }

    /* JADX INFO: renamed from: lr */
    tan.EnumC2085ri m7148lr() {
        return this.f5265ka;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        for (int i = 0; i < this.f5264ik.size(); i++) {
            this.f5264ik.get(i).mo6789ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    void m7149ri(AbstractC2139ri.ri riVar) {
        this.f5264ik.add(riVar);
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
    }
}
