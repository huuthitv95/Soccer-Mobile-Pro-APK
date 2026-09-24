package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.rg */
/* JADX INFO: loaded from: classes6.dex */
public final class C12466rg implements InterfaceC11443G, InterfaceC11370Bg {

    /* JADX INFO: renamed from: a */
    private final C11707V0 f31851a;

    /* JADX INFO: renamed from: b */
    private final AbstractC12593x0 f31852b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12645zg f31853c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC11496Ig f31854d;

    /* JADX INFO: renamed from: e */
    private final AbstractC12555ug f31855e;

    /* JADX INFO: renamed from: f */
    private AbstractC11461H f31856f;

    /* JADX INFO: renamed from: g */
    private AbstractC11388Cg f31857g;

    /* JADX INFO: renamed from: h */
    private final List<AbstractC11353B> f31858h;

    /* JADX INFO: renamed from: i */
    private AbstractC11353B f31859i;

    /* JADX INFO: renamed from: j */
    private boolean f31860j;

    public C12466rg(C11707V0 adTools, AbstractC12593x0 adUnitData, boolean z, InterfaceC12645zg listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31851a = adTools;
        this.f31852b = adUnitData;
        this.f31853c = listener;
        this.f31854d = InterfaceC11496Ig.a.f24696a.m26146a(z, this);
        this.f31855e = AbstractC12555ug.f32581d.m33918a(adTools, adUnitData);
        this.f31858h = new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    private final List<AbstractC11353B> m33260f() {
        AbstractC11461H.c cVarM25957c;
        List<AbstractC11353B> listM25973d;
        AbstractC11461H abstractC11461H = this.f31856f;
        return (abstractC11461H == null || (cVarM25957c = abstractC11461H.m25957c()) == null || (listM25973d = cVarM25957c.m25973d()) == null) ? CollectionsKt.emptyList() : listM25973d;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m33261i() {
        return this.f31859i != null;
    }

    /* JADX INFO: renamed from: j */
    private final void m33262j() {
        AbstractC11461H abstractC11461H = this.f31856f;
        AbstractC11461H.b bVarM25958d = abstractC11461H != null ? abstractC11461H.m25958d() : null;
        if (bVarM25958d == null || bVarM25958d.m25965e()) {
            this.f31853c.mo32951a(509, "Mediation No fill");
            return;
        }
        if (!bVarM25958d.m25966f()) {
            Iterator<AbstractC11353B> it = bVarM25958d.m25960a().iterator();
            while (it.hasNext()) {
                it.next().m25337a(this);
            }
        } else {
            AbstractC11388Cg abstractC11388Cg = this.f31857g;
            if (abstractC11388Cg != null) {
                abstractC11388Cg.mo25587a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33265c() {
        this.f31854d.mo25803a();
    }

    /* JADX INFO: renamed from: d */
    public final void m33267d() {
        this.f31860j = true;
        AbstractC11353B abstractC11353B = this.f31859i;
        if (abstractC11353B != null) {
            abstractC11353B.mo25342b();
        }
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC11353B m33268e() {
        AbstractC11461H.c cVarM25957c;
        AbstractC11461H abstractC11461H = this.f31856f;
        if (abstractC11461H == null || (cVarM25957c = abstractC11461H.m25957c()) == null) {
            return null;
        }
        return cVarM25957c.m25972c();
    }

    /* JADX INFO: renamed from: g */
    public final EnumC11349Ad m33269g() {
        return this.f31854d.mo25805b();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m33270h() {
        Iterator<AbstractC11353B> it = this.f31858h.iterator();
        while (it.hasNext()) {
            if (it.next().m25365z()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC11443G
    /* JADX INFO: renamed from: b */
    public void mo25808b(AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f31860j || m33261i()) {
            instance.mo25343c();
            return;
        }
        AbstractC11388Cg abstractC11388Cg = this.f31857g;
        if (abstractC11388Cg != null) {
            abstractC11388Cg.mo25588a(instance);
        }
        this.f31858h.add(instance);
        if (this.f31858h.size() == 1) {
            AbstractC11388Cg abstractC11388Cg2 = this.f31857g;
            if (abstractC11388Cg2 != null) {
                abstractC11388Cg2.mo25591b(instance);
            }
            this.f31853c.mo32953b(instance);
            return;
        }
        AbstractC11461H abstractC11461H = this.f31856f;
        if (abstractC11461H == null || !abstractC11461H.m25954a(instance)) {
            return;
        }
        this.f31853c.mo32952a(instance);
    }

    /* JADX INFO: renamed from: c */
    public final void m33266c(AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        AbstractC11388Cg abstractC11388Cg = this.f31857g;
        if (abstractC11388Cg != null) {
            abstractC11388Cg.m25589a(instance, this.f31852b.m34082l(), this.f31852b.m34085o());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33263a(InterfaceC11407E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.f31855e.mo33727a(adInstanceFactory, new a());
    }

    /* JADX INFO: renamed from: com.ironsource.rg$a */
    public static final class a implements InterfaceC12573vg {
        a() {
        }

        @Override // com.ironsource.InterfaceC12573vg
        /* JADX INFO: renamed from: a */
        public void mo33272a(C12591wg waterfallInstances) {
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (C12466rg.this.f31860j) {
                return;
            }
            C12466rg.this.m33258a(waterfallInstances);
        }

        @Override // com.ironsource.InterfaceC12573vg
        /* JADX INFO: renamed from: a */
        public void mo33271a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            if (C12466rg.this.f31860j) {
                return;
            }
            C12466rg.this.f31853c.mo32951a(i, errorReason);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33264a(InterfaceC11515K adInstancePresenter, boolean z) {
        AbstractC11388Cg abstractC11388Cg;
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        AbstractC11353B abstractC11353BMo25806c = this.f31854d.mo25806c();
        if (abstractC11353BMo25806c != null) {
            this.f31854d.mo25804a(abstractC11353BMo25806c);
            if (!z && (abstractC11388Cg = this.f31857g) != null) {
                abstractC11388Cg.m25590a(abstractC11353BMo25806c, m33260f());
            }
            abstractC11353BMo25806c.mo25338a(adInstancePresenter);
        }
    }

    @Override // com.ironsource.InterfaceC11443G
    /* JADX INFO: renamed from: a */
    public void mo25807a(IronSourceError error, AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f31860j) {
            return;
        }
        m33262j();
    }

    @Override // com.ironsource.InterfaceC11370Bg
    /* JADX INFO: renamed from: b */
    public boolean mo25515b() {
        return !this.f31858h.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m33258a(C12591wg c12591wg) {
        AbstractC11461H abstractC11461HM25959a = AbstractC11461H.f24395c.m25959a(this.f31852b, c12591wg);
        this.f31856f = abstractC11461HM25959a;
        this.f31857g = AbstractC11388Cg.f24182c.m25593a(this.f31851a, this.f31852b, this.f31855e.mo33726a(), c12591wg, abstractC11461HM25959a);
        m33262j();
    }

    @Override // com.ironsource.InterfaceC11370Bg
    /* JADX INFO: renamed from: a */
    public void mo25514a(AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f31859i = instance;
        this.f31858h.remove(instance);
    }

    @Override // com.ironsource.InterfaceC11370Bg
    /* JADX INFO: renamed from: a */
    public void mo25513a() {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f31851a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        if (this.f31858h.isEmpty()) {
            return;
        }
        Iterator<T> it = this.f31858h.iterator();
        while (it.hasNext()) {
            ((AbstractC11353B) it.next()).mo25343c();
        }
        this.f31858h.clear();
        this.f31851a.m33047e().m34220h().m27963a();
    }

    @Override // com.ironsource.InterfaceC11370Bg
    /* JADX INFO: renamed from: a */
    public AbstractC11353B mo25512a(int i) {
        List<AbstractC11353B> listM33260f = m33260f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM33260f) {
            if (((AbstractC11353B) obj).m25362w()) {
                arrayList.add(obj);
            }
        }
        return (AbstractC11353B) CollectionsKt.getOrNull(arrayList, i);
    }
}
