package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12616y5 implements InterfaceC11408E0 {

    /* JADX INFO: renamed from: a */
    private final IronSource.EnumC12328a f33206a;

    /* JADX INFO: renamed from: b */
    private final C11426F0 f33207b;

    /* JADX INFO: renamed from: c */
    private final List<InterfaceC11408E0> f33208c;

    /* JADX INFO: renamed from: d */
    private final C11715V8 f33209d;

    /* JADX INFO: renamed from: e */
    private final C12568vb f33210e;

    /* JADX INFO: renamed from: f */
    private final C11688Tf f33211f;

    /* JADX INFO: renamed from: g */
    private final C11674T1 f33212g;

    /* JADX INFO: renamed from: h */
    private final C11587O f33213h;

    /* JADX INFO: renamed from: i */
    private final C11756Xf f33214i;

    /* JADX INFO: renamed from: j */
    private final C11600Oc f33215j;

    public C12616y5(IronSource.EnumC12328a adFormat, C11426F0.b level, List<? extends InterfaceC11408E0> eventsInterfaces, AbstractC12295l3 abstractC12295l3) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.f33206a = adFormat;
        C11426F0 c11426f0 = new C11426F0(adFormat, level, this, abstractC12295l3);
        this.f33207b = c11426f0;
        this.f33208c = CollectionsKt.toMutableList((Collection) eventsInterfaces);
        C11715V8 c11715v8 = c11426f0.f24287e;
        Intrinsics.checkNotNullExpressionValue(c11715v8, "wrapper.init");
        this.f33209d = c11715v8;
        C12568vb c12568vb = c11426f0.f24288f;
        Intrinsics.checkNotNullExpressionValue(c12568vb, "wrapper.load");
        this.f33210e = c12568vb;
        C11688Tf c11688Tf = c11426f0.f24289g;
        Intrinsics.checkNotNullExpressionValue(c11688Tf, "wrapper.token");
        this.f33211f = c11688Tf;
        C11674T1 c11674t1 = c11426f0.f24290h;
        Intrinsics.checkNotNullExpressionValue(c11674t1, "wrapper.auction");
        this.f33212g = c11674t1;
        C11587O c11587o = c11426f0.f24291i;
        Intrinsics.checkNotNullExpressionValue(c11587o, "wrapper.adInteraction");
        this.f33213h = c11587o;
        C11756Xf c11756Xf = c11426f0.f24292j;
        Intrinsics.checkNotNullExpressionValue(c11756Xf, "wrapper.troubleshoot");
        this.f33214i = c11756Xf;
        C11600Oc c11600Oc = c11426f0.f24293k;
        Intrinsics.checkNotNullExpressionValue(c11600Oc, "wrapper.operational");
        this.f33215j = c11600Oc;
    }

    /* JADX INFO: renamed from: a */
    public final C11587O m34211a() {
        return this.f33213h;
    }

    /* JADX INFO: renamed from: b */
    public final C11674T1 m34214b() {
        return this.f33212g;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC11408E0> m34215c() {
        return this.f33208c;
    }

    /* JADX INFO: renamed from: d */
    public final C11715V8 m34216d() {
        return this.f33209d;
    }

    /* JADX INFO: renamed from: e */
    public final C12568vb m34217e() {
        return this.f33210e;
    }

    /* JADX INFO: renamed from: f */
    public final C11600Oc m34218f() {
        return this.f33215j;
    }

    /* JADX INFO: renamed from: g */
    public final C11688Tf m34219g() {
        return this.f33211f;
    }

    /* JADX INFO: renamed from: h */
    public final C11756Xf m34220h() {
        return this.f33214i;
    }

    @Override // com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        Iterator<InterfaceC11408E0> it = this.f33208c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapMo25594a = it.next().mo25594a(event);
            Intrinsics.checkNotNullExpressionValue(mapMo25594a, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapMo25594a);
        }
        return map;
    }

    public /* synthetic */ C12616y5(IronSource.EnumC12328a enumC12328a, C11426F0.b bVar, List list, AbstractC12295l3 abstractC12295l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC12328a, bVar, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : abstractC12295l3);
    }

    /* JADX INFO: renamed from: a */
    public final void m34212a(InterfaceC11408E0 eventInterface) {
        Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.f33208c.add(eventInterface);
    }

    /* JADX INFO: renamed from: a */
    public final void m34213a(boolean z) {
        if (z) {
            this.f33210e.m33953a(true);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f33206a == IronSource.EnumC12328a.BANNER) {
                this.f33210e.m33944a();
            } else {
                this.f33210e.m33953a(false);
            }
        }
    }
}
