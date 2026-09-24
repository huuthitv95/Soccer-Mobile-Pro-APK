package com.bytedance.adsdk.p065lr.p074ri.p076ri;

import android.graphics.Path;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2072bu;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.tan;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2129aw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.ri.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2154nr implements AbstractC2139ri.ri, InterfaceC2144aw {

    /* JADX INFO: renamed from: di */
    private boolean f5301di;

    /* JADX INFO: renamed from: fi */
    private final C2129aw f5302fi;

    /* JADX INFO: renamed from: ik */
    private final boolean f5303ik;

    /* JADX INFO: renamed from: ka */
    private final jbs f5304ka;

    /* JADX INFO: renamed from: lr */
    private final String f5305lr;

    /* JADX INFO: renamed from: ri */
    private final Path f5306ri = new Path();
    private final C2152lr xha = new C2152lr();

    public C2154nr(jbs jbsVar, AbstractC2068ri abstractC2068ri, C2072bu c2072bu) {
        this.f5305lr = c2072bu.m6811ri();
        this.f5303ik = c2072bu.m6809ik();
        this.f5304ka = jbsVar;
        C2129aw c2129awMo6903ri = c2072bu.m6810lr().mo6903ri();
        this.f5302fi = c2129awMo6903ri;
        abstractC2068ri.m6793ri(c2129awMo6903ri);
        c2129awMo6903ri.m7111ri(this);
    }

    /* JADX INFO: renamed from: lr */
    private void m7165lr() {
        this.f5301di = false;
        this.f5304ka.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2144aw
    /* JADX INFO: renamed from: ka */
    public Path mo7131ka() {
        if (this.f5301di) {
            return this.f5306ri;
        }
        this.f5306ri.reset();
        if (this.f5303ik) {
            this.f5301di = true;
            return this.f5306ri;
        }
        Path pathXha = this.f5302fi.xha();
        if (pathXha == null) {
            return this.f5306ri;
        }
        this.f5306ri.set(pathXha);
        this.f5306ri.setFillType(Path.FillType.EVEN_ODD);
        this.xha.m7159ri(this.f5306ri);
        this.f5301di = true;
        return this.f5306ri;
    }

    @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo6789ri() {
        m7165lr();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik
    /* JADX INFO: renamed from: ri */
    public void mo6794ri(List<InterfaceC2150ik> list, List<InterfaceC2150ik> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            InterfaceC2150ik interfaceC2150ik = list.get(i);
            if (interfaceC2150ik instanceof ihz) {
                ihz ihzVar = (ihz) interfaceC2150ik;
                if (ihzVar.m7148lr() == tan.EnumC2085ri.SIMULTANEOUSLY) {
                    this.xha.m7160ri(ihzVar);
                    ihzVar.m7149ri(this);
                } else if (!(interfaceC2150ik instanceof tan)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((tan) interfaceC2150ik);
                }
            } else if (!(interfaceC2150ik instanceof tan)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((tan) interfaceC2150ik);
            }
        }
        this.f5302fi.m7084ri((List<tan>) arrayList);
    }
}
