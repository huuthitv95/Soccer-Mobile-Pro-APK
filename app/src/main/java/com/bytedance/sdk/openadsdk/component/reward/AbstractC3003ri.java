package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.AbstractC1993lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.bgr.C2901ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3331uq;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p195fi.C3113ri;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3281fr;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3550ka;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3003ri<L, A> {

    /* JADX INFO: renamed from: ka */
    protected AbstractRunnableC2676ik f9224ka;

    /* JADX INFO: renamed from: ri */
    protected final Context f9226ri;

    /* JADX INFO: renamed from: lr */
    protected final AtomicBoolean f9225lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ik */
    protected final List<AbstractC3003ri<L, A>.ka> f9223ik = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: fi */
    private final C2728su.ri f9222fi = new C2728su.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.6
        @Override // com.bytedance.sdk.component.utils.C2728su.ri
        /* JADX INFO: renamed from: ri */
        public void mo10299ri(Context context, Intent intent, boolean z, int i) {
            if (z && AbstractC3003ri.this.f9224ka == null) {
                AbstractC3003ri abstractC3003ri = AbstractC3003ri.this;
                AbstractC3003ri abstractC3003ri2 = AbstractC3003ri.this;
                abstractC3003ri.f9224ka = new lr("net connect task", abstractC3003ri2.f9223ik);
                com.bytedance.sdk.component.utils.jbs.m10235ri().post(AbstractC3003ri.this.f9224ka);
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri$ik */
    protected class ik {

        /* JADX INFO: renamed from: ik */
        protected final AtomicInteger f9249ik;

        /* JADX INFO: renamed from: ka */
        protected final C3289ri f9250ka;

        /* JADX INFO: renamed from: lr */
        protected final AtomicBoolean f9251lr;

        /* JADX INFO: renamed from: ri */
        protected final AbstractC3003ri<L, A>.ri f9252ri;

        private ik(AbstractC3003ri<L, A>.ri riVar, C3289ri c3289ri) {
            this.f9251lr = new AtomicBoolean(false);
            this.f9252ri = riVar;
            this.f9250ka = c3289ri;
            this.f9249ik = new AtomicInteger(m11801ri());
        }

        /* JADX INFO: renamed from: ri */
        private int m11801ri() {
            if (!this.f9250ka.m14249fi()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.f9250ka.m14252ka().size(); i2++) {
                wjv wjvVar = this.f9250ka.m14252ka().get(i2);
                if (wjvVar != null && !C3279dw.m14090ik(wjvVar) && wjvVar.m14389eu() != null) {
                    i++;
                }
            }
            return i;
        }

        /* JADX INFO: renamed from: ri */
        public void m11802ri(int i, String str) {
            if (this.f9249ik.decrementAndGet() > 0 || !this.f9251lr.compareAndSet(false, true)) {
                return;
            }
            this.f9252ri.m11804ri(i, str);
            C3521ka.m15952ri("choose_ad_load_error", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.ik.1
                @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                /* JADX INFO: renamed from: ri */
                public InterfaceC3530ik mo11574ri() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", ik.this.f9250ka.m14253lr());
                    return C3531ka.m15967lr().m15985ri("choose_ad_load_error").m15980lr(jSONObject.toString());
                }
            });
        }

        /* JADX INFO: renamed from: ri */
        public void m11803ri(A a2) {
            this.f9249ik.decrementAndGet();
            if (this.f9252ri == null || !this.f9251lr.compareAndSet(false, true)) {
                return;
            }
            this.f9252ri.m11805ri(a2);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri$ka */
    protected class ka extends AbstractRunnableC2676ik {

        /* JADX INFO: renamed from: ik */
        final C3289ri f9254ik;

        /* JADX INFO: renamed from: lr */
        final AdSlot f9256lr;

        /* JADX INFO: renamed from: ri */
        final wjv f9257ri;

        public ka(wjv wjvVar, AdSlot adSlot, C3289ri c3289ri) {
            super("VideoPreloadTask");
            this.f9257ri = wjvVar;
            this.f9256lr = adSlot;
            this.f9254ik = c3289ri;
        }

        @Override // java.lang.Runnable
        public void run() {
            wjv wjvVar = this.f9257ri;
            if (wjvVar == null || wjvVar.m14389eu() == null) {
                return;
            }
            C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(this.f9257ri.m14476qf()).mo6274ri(), this.f9257ri);
            c3126lrM14345ri.m6328ri("material_meta", this.f9257ri);
            c3126lrM14345ri.m6328ri("ad_slot", this.f9256lr);
            C3113ri.m12651ri(c3126lrM14345ri, new AbstractC1993lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.ka.1
                @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo6289ri(C1996ik c1996ik, int i) {
                    AbstractC3003ri.this.mo11643ri().m11634ri(ka.this.f9256lr, ka.this.f9254ik);
                }

                @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo6290ri(C1996ik c1996ik, int i, String str) {
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri$lr */
    protected class lr extends AbstractRunnableC2676ik {

        /* JADX INFO: renamed from: lr */
        private final List<AbstractC3003ri<L, A>.ka> f9259lr;

        public lr(String str, List<AbstractC3003ri<L, A>.ka> list) {
            super(str);
            this.f9259lr = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<AbstractC3003ri<L, A>.ka> list = this.f9259lr;
            if (list == null || list.isEmpty()) {
                AbstractC3003ri.this.f9224ka = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.f9259lr);
            this.f9259lr.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((ka) it.next()).run();
                } catch (Exception e) {
                    C2707ac.m10206ri("BVL", "continue download task error", e);
                }
            }
            AbstractC3003ri.this.f9224ka = null;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri$ri */
    protected class ri {

        /* JADX INFO: renamed from: ik */
        protected final L f9262ik;

        /* JADX INFO: renamed from: ka */
        protected final boolean f9263ka;

        /* JADX INFO: renamed from: lr */
        protected final C3289ri f9264lr;

        /* JADX INFO: renamed from: ri */
        protected final AdSlot f9265ri;

        public ri(AdSlot adSlot, C3289ri c3289ri, L l, boolean z) {
            this.f9265ri = adSlot;
            this.f9264lr = c3289ri;
            this.f9262ik = l;
            this.f9263ka = z;
        }

        /* JADX INFO: renamed from: ri */
        public void m11804ri(int i, String str) {
            L l = this.f9262ik;
            if (l != null) {
                AbstractC3003ri.this.mo11646ri(l, i, str);
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m11805ri(A a2) {
            AbstractC3003ri.this.m11794ri(this.f9265ri, this.f9264lr, this.f9262ik, a2, this.f9263ka);
        }
    }

    protected AbstractC3003ri(Context context) {
        this.f9226ri = context == null ? C3299nr.m14642ri() : context.getApplicationContext();
        m11790ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m11781ik(AdSlot adSlot) {
        mo11643ri().m11635ri(adSlot.getCodeId());
    }

    /* JADX INFO: renamed from: lr */
    private void m11782lr(final AdSlot adSlot) {
        C3299nr.m14638ik().mo12638ri(adSlot, m11792ri(adSlot, true), mo11640lr(), new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.1

            /* JADX INFO: renamed from: ri */
            boolean f9229ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public String mo11676ri() {
                return AbstractC3003ri.this.mo11643ri().m11632ri(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                if (this.f9229ri || c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
                    return;
                }
                AbstractC3003ri abstractC3003ri = AbstractC3003ri.this;
                AbstractC3003ri.this.m11799ri(c3289ri, abstractC3003ri.mo11644ri(abstractC3003ri.f9226ri, c3289ri, adSlot), adSlot, true, (Object) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public boolean mo11677ri(C3289ri c3289ri) {
                boolean zM11637ri = AbstractC3003ri.this.mo11643ri().m11637ri(c3289ri);
                this.f9229ri = zM11637ri;
                return zM11637ri;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    private void m11783lr(final AdSlot adSlot, final L l) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C3299nr.m14638ik().mo12638ri(adSlot, m11792ri(adSlot, false), mo11640lr(), new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.2

            /* JADX INFO: renamed from: ri */
            boolean f9234ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public String mo11676ri() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strM11632ri = AbstractC3003ri.this.mo11643ri().m11632ri(adSlot.getCodeId(), true);
                TextUtils.isEmpty(strM11632ri);
                if (TextUtils.isEmpty(strM11632ri)) {
                    return null;
                }
                return strM11632ri;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
                Object obj = l;
                if (obj != null) {
                    AbstractC3003ri.this.mo11646ri(obj, i, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                C3289ri c3289ri2;
                if (c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
                    Object obj = l;
                    if (obj != null) {
                        AbstractC3003ri.this.mo11646ri(obj, -3, com.bytedance.sdk.openadsdk.core.jbs.m13550ri(-3));
                        c3282ik.m14181ri(-3);
                        c3282ik.m14175ik(AbstractC3003ri.this.mo11639di());
                        C3282ik.m14172ri(c3282ik);
                        return;
                    }
                    return;
                }
                AbstractC3003ri abstractC3003ri = AbstractC3003ri.this;
                Object objMo11644ri = abstractC3003ri.mo11644ri(abstractC3003ri.f9226ri, c3289ri, adSlot);
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    C3550ka.m16268ri().m16271ri(c3289ri.m14252ka().isEmpty() ? null : c3289ri.m14252ka().get(0));
                    C3521ka.m15947ri(c3289ri.m14248di(), System.currentTimeMillis() - jCurrentTimeMillis);
                }
                if (l == null || C3299nr.m14639ka().m14896zf() != 0) {
                    c3289ri2 = c3289ri;
                } else {
                    AbstractC3003ri.this.m11794ri(adSlot, c3289ri, l, objMo11644ri, this.f9234ri);
                    c3289ri2 = c3289ri;
                    objMo11644ri = objMo11644ri;
                }
                AbstractC3003ri.this.m11799ri(c3289ri2, objMo11644ri, adSlot, false, l);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public boolean mo11677ri(C3289ri c3289ri) {
                this.f9234ri = AbstractC3003ri.this.mo11643ri().m11637ri(c3289ri);
                return this.f9234ri;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m11785ri(wjv wjvVar, final AdSlot adSlot, final C3289ri c3289ri, final A a2, final boolean z, final AbstractC3003ri<L, A>.ik ikVar) {
        C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(wjvVar.m14476qf()).mo6274ri(), wjvVar);
        c3126lrM14345ri.m6328ri("material_meta", wjvVar);
        c3126lrM14345ri.m6328ri("ad_slot", adSlot);
        C3113ri.m12651ri(c3126lrM14345ri, new AbstractC1993lr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6289ri(C1996ik c1996ik, int i) {
                AbstractC3003ri.this.mo11642lr(a2);
                if (z) {
                    AbstractC3003ri.this.mo11643ri().m11634ri(adSlot, c3289ri);
                } else if (AbstractC3003ri.this.m11786ri(ikVar)) {
                    ikVar.m11803ri(a2);
                }
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6290ri(C1996ik c1996ik, int i, String str) {
                if (AbstractC3003ri.this.m11786ri(ikVar)) {
                    ikVar.m11802ri(i, str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public boolean m11786ri(AbstractC3003ri<L, A>.ik ikVar) {
        return ikVar != null && C3299nr.m14639ka().m14896zf() == 1;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m11788ri(boolean z, wjv wjvVar, AdSlot adSlot) {
        if (z) {
            return !C3279dw.m14090ik(wjvVar) && wjv.m14332fi(wjvVar) && C3299nr.m14639ka().m14883su(adSlot.getCodeId()).f11591ka == 1 && !C2724nr.m10256ka(this.f9226ri);
        }
        return false;
    }

    /* JADX INFO: renamed from: di */
    protected abstract int mo11639di();

    /* JADX INFO: renamed from: fi */
    public void m11789fi() {
        try {
            mo11643ri().m11633ri();
        } catch (Throwable unused) {
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f9224ka != null) {
            try {
                com.bytedance.sdk.component.utils.jbs.m10235ri().removeCallbacks(this.f9224ka);
            } catch (Throwable unused) {
            }
            this.f9224ka = null;
        }
        m11791ka();
    }

    /* JADX INFO: renamed from: ik */
    protected void m11790ik() {
        if (this.f9225lr.get()) {
            return;
        }
        this.f9225lr.set(true);
        C2728su.m10298ri(this.f9222fi, this.f9226ri);
    }

    /* JADX INFO: renamed from: ka */
    protected void m11791ka() {
        if (this.f9225lr.get()) {
            this.f9225lr.set(false);
            try {
                C2728su.m10297ri(this.f9222fi);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    protected abstract int mo11640lr();

    /* JADX INFO: renamed from: lr */
    protected abstract void mo11642lr(A a2);

    /* JADX INFO: renamed from: ri */
    protected abstract bgr mo11643ri();

    /* JADX INFO: renamed from: ri */
    protected igq m11792ri(AdSlot adSlot, boolean z) {
        igq igqVar = new igq();
        if (adSlot != null && (C3299nr.m14639ka().m14836co(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd())) {
            igqVar.jbs = 2;
        }
        if (mo11640lr() == 7) {
            igqVar.f11280lr = z ? 2 : 1;
            return igqVar;
        }
        igqVar.f11278ik = z ? 2 : 1;
        return igqVar;
    }

    /* JADX INFO: renamed from: ri */
    protected abstract A mo11644ri(Context context, C3289ri c3289ri, AdSlot adSlot);

    /* JADX INFO: renamed from: ri */
    protected abstract Object mo11645ri(A a2);

    /* JADX INFO: renamed from: ri */
    public void m11793ri(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        m11782lr(adSlot);
    }

    /* JADX INFO: renamed from: ri */
    protected void m11794ri(final AdSlot adSlot, final C3289ri c3289ri, L l, A a2, final boolean z) {
        C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    AbstractC3003ri.this.m11781ik(adSlot);
                } else {
                    AbstractC3003ri.this.mo11643ri().m11634ri(adSlot, c3289ri);
                    AbstractC3003ri.this.m11781ik(adSlot);
                }
            }
        });
        if (l != null) {
            mo11647ri(l, mo11645ri(a2));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11795ri(AdSlot adSlot, L l) {
        Objects.toString(adSlot);
        Objects.toString(l);
        m11783lr(adSlot, l);
    }

    /* JADX INFO: renamed from: ri */
    protected void m11796ri(AbstractC3003ri<L, A>.ka kaVar) {
        if (kaVar == null) {
            return;
        }
        if (this.f9223ik.size() > 0) {
            this.f9223ik.remove(0);
        }
        this.f9223ik.add(kaVar);
    }

    /* JADX INFO: renamed from: ri */
    protected void m11797ri(C3289ri c3289ri) {
        C3281fr c3281frM14258qt = c3289ri.m14258qt();
        int iSlm = c3289ri.m14257mj() ? 10 : 1;
        if (c3281frM14258qt != null) {
            iSlm = c3281frM14258qt.slm();
        }
        for (final int i = 0; i < c3289ri.m14252ka().size() && i < iSlm; i++) {
            C3116ri.m12672ri().m12686ri(c3289ri.m14252ka().get(i), new C3116ri.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.3
                @Override // com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo11678ri(boolean z) {
                    C2707ac.m10205ri("BVL", "onCachedResponse: i=" + i + ", isSuccess=" + z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m11798ri(C3289ri c3289ri, wjv wjvVar, A a2, AdSlot adSlot, boolean z, AbstractC3003ri<L, A>.ik ikVar) {
        A a3;
        AbstractC3003ri<L, A>.ik ikVar2;
        if (m11788ri(z, wjvVar, adSlot)) {
            m11796ri((ka) new ka(wjvVar, adSlot, c3289ri));
            return;
        }
        boolean zM11786ri = m11786ri((ik) ikVar);
        if (C3279dw.m14090ik(wjvVar)) {
            a3 = a2;
            ikVar2 = ikVar;
            if (z) {
                mo11643ri().m11634ri(adSlot, c3289ri);
            }
        } else if (!wjv.m14332fi(wjvVar)) {
            a3 = a2;
            ikVar2 = ikVar;
            if (z) {
                mo11643ri().m11634ri(adSlot, c3289ri);
            }
        } else {
            if (wjvVar.m14389eu() == null) {
                return;
            }
            a3 = a2;
            ikVar2 = ikVar;
            m11785ri(wjvVar, adSlot, c3289ri, a3, z, ikVar2);
            zM11786ri = false;
        }
        if (zM11786ri) {
            ikVar2.m11803ri(a3);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m11799ri(C3289ri c3289ri, A a2, AdSlot adSlot, boolean z, L l) {
        if (!z) {
            C2901ri.m11167ri().m11178ri(c3289ri.m14248di());
        }
        AbstractC3003ri<L, A> abstractC3003ri = this;
        AdSlot adSlot2 = adSlot;
        AbstractC3003ri<L, A>.ik ikVar = new ik(abstractC3003ri.new ri(adSlot2, c3289ri, l, false), c3289ri);
        m11797ri(c3289ri);
        int i = 0;
        while (i < c3289ri.m14252ka().size()) {
            wjv wjvVar = c3289ri.m14252ka().get(i);
            int iM14453nd = wjvVar.m14453nd();
            if (i == 0 && iM14453nd == 43) {
                wjvVar.m14389eu().m6340di(0);
            }
            A a3 = a2;
            boolean z2 = z;
            AdSlot adSlot3 = adSlot2;
            abstractC3003ri.m11798ri(c3289ri, wjvVar, a3, adSlot3, z2, ikVar);
            adSlot2 = adSlot3;
            if (c3289ri.m14257mj() && iM14453nd != 43) {
                return;
            }
            i++;
            abstractC3003ri = this;
            a2 = a3;
            z = z2;
        }
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo11646ri(L l, int i, String str);

    /* JADX INFO: renamed from: ri */
    protected abstract void mo11647ri(L l, Object obj);

    /* JADX INFO: renamed from: ri */
    public void m11800ri(String str, wjv wjvVar) {
        mo11643ri().m11636ri(str, wjvVar);
    }
}
