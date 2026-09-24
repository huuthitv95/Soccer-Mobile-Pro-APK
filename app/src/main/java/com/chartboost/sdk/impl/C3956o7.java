package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.o7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3956o7 implements InterfaceC3911m7, InterfaceC3888l7 {

    /* JADX INFO: renamed from: a */
    public Lazy f15635a;

    /* JADX INFO: renamed from: b */
    public Lazy f15636b;

    /* JADX INFO: renamed from: c */
    public Lazy f15637c;

    /* JADX INFO: renamed from: d */
    public Lazy f15638d;

    /* JADX INFO: renamed from: e */
    public Lazy f15639e;

    /* JADX INFO: renamed from: f */
    public Lazy f15640f;

    /* JADX INFO: renamed from: g */
    public final Map f15641g;

    /* JADX INFO: renamed from: h */
    public final Map f15642h;

    /* JADX INFO: renamed from: i */
    public final List f15643i;

    public C3956o7(Lazy config, Lazy throttler, Lazy requestBodyBuilder, Lazy privacyApi, Lazy trackingRequest, Lazy trackingEventCache) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(throttler, "throttler");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(trackingRequest, "trackingRequest");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        this.f15635a = config;
        this.f15636b = throttler;
        this.f15637c = requestBodyBuilder;
        this.f15638d = privacyApi;
        this.f15639e = trackingRequest;
        this.f15640f = trackingEventCache;
        this.f15641g = new LinkedHashMap();
        this.f15642h = new LinkedHashMap();
        this.f15643i = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final float m18880a(AbstractC3738ei abstractC3738ei) {
        if (!abstractC3738ei.m17582h()) {
            return abstractC3738ei.m17575b();
        }
        if (!abstractC3738ei.m17587m()) {
            return 0.0f;
        }
        try {
            AbstractC3738ei abstractC3738ei2 = (AbstractC3738ei) this.f15642h.remove(m18888e(abstractC3738ei));
            if (abstractC3738ei2 != null) {
                return (abstractC3738ei.m17583i() - abstractC3738ei2.m17583i()) / 1000.0f;
            }
            return -1.0f;
        } catch (Exception e) {
            C4048sb.m19407a("Cannot calculate latency", e);
            return -1.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3750f7 m18881a() {
        try {
            C3690cg c3690cgMo16842a = ((InterfaceC3644ag) this.f15637c.getValue()).mo16842a();
            return C3727e7.f14043a.m17514a(c3690cgMo16842a.m17187c(), c3690cgMo16842a.m17192h(), c3690cgMo16842a.m17191g().m18278c(), (C4117ve) this.f15638d.getValue(), c3690cgMo16842a.f13727h);
        } catch (Exception e) {
            C4048sb.m19407a("Cannot create environment data for tracking", e);
            return new C3750f7(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18882a(C4076th c4076th) {
        return c4076th.m19494e() + c4076th.m19493d();
    }

    /* JADX INFO: renamed from: a */
    public final String m18883a(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: a */
    public final void m18884a(List list) {
        ((C3876ki) this.f15639e.getValue()).m18432a(((C3692ci) this.f15635a.getValue()).m17198b(), list);
    }

    /* JADX INFO: renamed from: b */
    public final void m18885b(AbstractC3738ei abstractC3738ei) {
        Unit unit;
        if (abstractC3738ei != null) {
            try {
                if (((C3692ci) this.f15635a.getValue()).m17200d()) {
                    m18886c(abstractC3738ei);
                } else {
                    m18887d(abstractC3738ei);
                }
                unit = Unit.INSTANCE;
            } catch (Exception e) {
                C4048sb.m19407a("Cannot send tracking event", e);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Cannot save empty event", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18886c(AbstractC3738ei abstractC3738ei) {
        ((C3784gi) this.f15640f.getValue()).m17817a(abstractC3738ei, m18881a(), ((C3692ci) this.f15635a.getValue()).m17201e());
        if (abstractC3738ei.m17581g() == AbstractC3738ei.a.HIGH) {
            m18884a(((C3784gi) this.f15640f.getValue()).m17813a());
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f15642h.remove(m18883a(location, type));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei clearFromStorage(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        mo43985clearFromStorage(abstractC3738ei);
        return abstractC3738ei;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo43985clearFromStorage(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((C3784gi) this.f15640f.getValue()).m17815a(event);
    }

    /* JADX INFO: renamed from: d */
    public final void m18887d(AbstractC3738ei abstractC3738ei) {
        this.f15643i.add(abstractC3738ei);
        if (abstractC3738ei.m17581g() == AbstractC3738ei.a.HIGH) {
            m18884a(((C3784gi) this.f15640f.getValue()).m17814a(this.f15643i, m18881a()));
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m18888e(AbstractC3738ei abstractC3738ei) {
        return m18883a(abstractC3738ei.m17577c(), abstractC3738ei.m17570a());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18889f(AbstractC3738ei abstractC3738ei) {
        InterfaceC3807hi interfaceC3807hiM17580f = abstractC3738ei.m17580f();
        return interfaceC3807hiM17580f == InterfaceC3807hi.a.START || interfaceC3807hiM17580f == InterfaceC3807hi.i.START;
    }

    /* JADX INFO: renamed from: g */
    public final void m18890g(AbstractC3738ei abstractC3738ei) {
        abstractC3738ei.m17573a((C4076th) this.f15641g.get(m18888e(abstractC3738ei)));
        abstractC3738ei.m17571a(m18880a(abstractC3738ei));
        m18885b(abstractC3738ei);
        C4048sb.m19408a("Event: " + abstractC3738ei, (Throwable) null, 2, (Object) null);
        m18891h(abstractC3738ei);
    }

    /* JADX INFO: renamed from: h */
    public final void m18891h(AbstractC3738ei abstractC3738ei) {
        if (m18889f(abstractC3738ei)) {
            this.f15642h.put(m18888e(abstractC3738ei), abstractC3738ei);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei persist(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        mo43986persist(abstractC3738ei);
        return abstractC3738ei;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: persist */
    public void mo43986persist(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.m17573a((C4076th) this.f15641g.get(m18888e(event)));
        event.m17571a(m18880a(event));
        C4048sb.m19408a("Persist event: " + event, (Throwable) null, 2, (Object) null);
        ((C3784gi) this.f15640f.getValue()).m17816a(event, m18881a());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C3692ci refresh(C3692ci c3692ci) {
        Intrinsics.checkNotNullParameter(c3692ci, "<this>");
        mo43987refresh(c3692ci);
        return c3692ci;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: refresh */
    public void mo43987refresh(C3692ci config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f15635a = LazyKt.lazyOf(config);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public C4076th store(C4076th c4076th) {
        Intrinsics.checkNotNullParameter(c4076th, "<this>");
        mo43988store(c4076th);
        return c4076th;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: store */
    public void mo43988store(C4076th ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f15641g.put(m18882a(ad), ad);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3911m7
    public AbstractC3738ei track(AbstractC3738ei abstractC3738ei) {
        Intrinsics.checkNotNullParameter(abstractC3738ei, "<this>");
        mo43989track(abstractC3738ei);
        return abstractC3738ei;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3888l7
    /* JADX INFO: renamed from: track */
    public void mo43989track(AbstractC3738ei event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(event, "event");
        C3692ci c3692ci = (C3692ci) this.f15635a.getValue();
        if (!c3692ci.m17203g()) {
            C4048sb.m19408a("Tracking is disabled", (Throwable) null, 2, (Object) null);
            return;
        }
        if (c3692ci.m17197a().contains(event.m17580f())) {
            C4048sb.m19408a("Event name " + event.m17580f() + " is black-listed", (Throwable) null, 2, (Object) null);
            return;
        }
        AbstractC3738ei abstractC3738eiM18196e = ((C3842j7) this.f15636b.getValue()).m18196e(event);
        if (abstractC3738eiM18196e != null) {
            m18890g(abstractC3738eiM18196e);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Event is throttled " + event, (Throwable) null, 2, (Object) null);
        }
    }
}
