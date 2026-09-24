package com.bytedance.sdk.component.p168ri;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ri.di */
/* JADX INFO: loaded from: classes3.dex */
class C2695di {

    /* JADX INFO: renamed from: mj */
    private final AbstractC2703ri f7708mj;

    /* JADX INFO: renamed from: ri */
    private final xha f7709ri;
    private final InterfaceC2704sf xha;

    /* JADX INFO: renamed from: lr */
    private final Map<String, AbstractC2699lr> f7707lr = new HashMap();

    /* JADX INFO: renamed from: ik */
    private final C2693bu<String, AbstractC2701nr> f7705ik = new C2693bu<>();

    /* JADX INFO: renamed from: ka */
    private final Map<String, AbstractC2697ik.lr> f7706ka = new HashMap();

    /* JADX INFO: renamed from: fi */
    private final List<bgr> f7704fi = new ArrayList();

    /* JADX INFO: renamed from: di */
    private final Set<AbstractC2697ik> f7703di = new HashSet();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ri.di$ri */
    static final class ri {

        /* JADX INFO: renamed from: lr */
        String f7713lr;

        /* JADX INFO: renamed from: ri */
        boolean f7714ri;

        private ri(boolean z, String str) {
            this.f7714ri = z;
            this.f7713lr = str;
        }
    }

    C2695di(jbs jbsVar, AbstractC2703ri abstractC2703ri) {
        this.f7708mj = abstractC2703ri;
        this.f7709ri = jbsVar.f7726ka;
        this.xha = jbsVar.f7728mj;
    }

    /* JADX INFO: renamed from: ri */
    private ri m10137ri(final bgr bgrVar, final AbstractC2697ik abstractC2697ik, C2696fi c2696fi) throws Exception {
        this.f7703di.add(abstractC2697ik);
        abstractC2697ik.m10156ri(m10140ri(bgrVar.f7689fi, abstractC2697ik), c2696fi, new AbstractC2697ik.ri() { // from class: com.bytedance.sdk.component.ri.di.1
            @Override // com.bytedance.sdk.component.p168ri.AbstractC2697ik.ri
            /* JADX INFO: renamed from: ri */
            public void mo10147ri(Object obj) {
                if (C2695di.this.f7708mj == null) {
                    return;
                }
                C2695di.this.f7708mj.m10177lr(tan.m10180ri(C2695di.this.f7709ri.m10195ri(obj), abstractC2697ik.m10167lr()), bgrVar);
                C2695di.this.f7703di.remove(abstractC2697ik);
            }

            @Override // com.bytedance.sdk.component.p168ri.AbstractC2697ik.ri
            /* JADX INFO: renamed from: ri */
            public void mo10148ri(Throwable th) {
                if (C2695di.this.f7708mj == null) {
                    return;
                }
                C2695di.this.f7708mj.m10177lr(tan.m10181ri(th), bgrVar);
                C2695di.this.f7703di.remove(abstractC2697ik);
            }
        });
        return new ri(false, tan.m10179ri());
    }

    /* JADX INFO: renamed from: ri */
    private ri m10138ri(bgr bgrVar, AbstractC2698ka abstractC2698ka, C2696fi c2696fi) throws Exception {
        return new ri(true, tan.m10180ri(this.f7709ri.m10195ri(abstractC2698ka.mo10166ri(bgrVar.f7691ka, m10140ri(bgrVar.f7689fi, (AbstractC2699lr) abstractC2698ka), c2696fi)), abstractC2698ka.m10167lr()));
    }

    /* JADX INFO: renamed from: ri */
    private Object m10140ri(String str, AbstractC2699lr abstractC2699lr) throws JSONException {
        return this.f7709ri.m10194ri(str, m10141ri(abstractC2699lr)[0]);
    }

    /* JADX INFO: renamed from: ri */
    private static Type[] m10141ri(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* JADX INFO: renamed from: ri */
    ri m10142ri(bgr bgrVar, C2696fi c2696fi) throws Exception {
        AbstractC2699lr abstractC2699lr = this.f7707lr.get(bgrVar.f7691ka);
        if (abstractC2699lr != null) {
            try {
                if (abstractC2699lr instanceof AbstractC2698ka) {
                    Objects.toString(bgrVar);
                    return m10138ri(bgrVar, (AbstractC2698ka) abstractC2699lr, c2696fi);
                }
            } catch (IllegalStateException unused) {
                Objects.toString(bgrVar);
                this.f7704fi.add(bgrVar);
                return new ri(false, tan.m10179ri());
            }
        }
        AbstractC2701nr abstractC2701nrM10132ri = this.f7705ik.m10132ri(bgrVar.f7691ka);
        if (abstractC2701nrM10132ri != null) {
            Objects.toString(bgrVar);
            return m10138ri(bgrVar, abstractC2701nrM10132ri, c2696fi);
        }
        AbstractC2697ik.lr lrVar = this.f7706ka.get(bgrVar.f7691ka);
        if (lrVar == null) {
            Objects.toString(bgrVar);
            return null;
        }
        AbstractC2697ik abstractC2697ikMo10158ri = lrVar.mo10158ri();
        abstractC2697ikMo10158ri.m10168ri(bgrVar.f7691ka);
        Objects.toString(bgrVar);
        return m10137ri(bgrVar, abstractC2697ikMo10158ri, c2696fi);
    }

    /* JADX INFO: renamed from: ri */
    void m10143ri() {
        Iterator<AbstractC2697ik> it = this.f7703di.iterator();
        while (it.hasNext()) {
            it.next().m10150fi();
        }
        this.f7703di.clear();
        this.f7707lr.clear();
        this.f7706ka.clear();
        this.f7705ik.m10133ri();
    }

    /* JADX INFO: renamed from: ri */
    void m10144ri(String str, AbstractC2697ik.lr lrVar) {
        this.f7706ka.put(str, lrVar);
    }

    /* JADX INFO: renamed from: ri */
    void m10145ri(String str, AbstractC2698ka<?, ?> abstractC2698ka) {
        abstractC2698ka.m10168ri(str);
        this.f7707lr.put(str, abstractC2698ka);
    }

    /* JADX INFO: renamed from: ri */
    void m10146ri(Set<String> set, AbstractC2701nr<?, ?> abstractC2701nr) {
        abstractC2701nr.m10170ri(set);
        this.f7705ik.m10134ri(set, abstractC2701nr);
        Objects.toString(set);
    }
}
