package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k1 */
/* JADX INFO: loaded from: classes6.dex */
public class C12275k1 implements InterfaceC12469s1 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12379n1 f30719a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11343A7 f30720b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11437Fb<Integer, Integer> f30721c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12400o4 f30722d;

    /* JADX INFO: renamed from: e */
    private List<InterfaceC12415p1> f30723e;

    public C12275k1(InterfaceC12379n1 eventBaseData, InterfaceC11343A7 eventsManager, InterfaceC11437Fb<Integer, Integer> eventsMapper, InterfaceC12400o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f30719a = eventBaseData;
        this.f30720b = eventsManager;
        this.f30721c = eventsMapper;
        this.f30722d = currentTimeProvider;
        this.f30723e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m31925a(List<InterfaceC12415p1> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f30723e = list;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC12415p1> m31927b() {
        return this.f30723e;
    }

    /* JADX INFO: renamed from: b */
    private final JSONObject m31922b(List<? extends InterfaceC12415p1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC12415p1> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo32858a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC12469s1
    /* JADX INFO: renamed from: a */
    public void mo31924a(int i, List<InterfaceC12415p1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            Iterator<T> it = this.f30719a.mo32125a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC12415p1) it.next());
            }
            Iterator<InterfaceC12415p1> it2 = this.f30723e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.f30720b.mo25281a(new C12580w5(this.f30721c.mo25577a(Integer.valueOf(i)).intValue(), this.f30722d.mo32926a(), m31922b(arrayList)));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            System.out.println((Object) ("LogRemote | Exception: " + e.getMessage()));
        }
    }

    public /* synthetic */ C12275k1(InterfaceC12379n1 interfaceC12379n1, InterfaceC11343A7 interfaceC11343A7, InterfaceC11437Fb interfaceC11437Fb, InterfaceC12400o4 interfaceC12400o4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC12379n1, interfaceC11343A7, interfaceC11437Fb, (i & 8) != 0 ? new InterfaceC12400o4.a() : interfaceC12400o4);
    }

    @Override // com.ironsource.InterfaceC12469s1
    /* JADX INFO: renamed from: a */
    public void mo31923a() {
        this.f30723e.clear();
    }

    @Override // com.ironsource.InterfaceC12469s1
    /* JADX INFO: renamed from: a */
    public void mo31926a(InterfaceC12415p1... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC12415p1 interfaceC12415p1 : analyticsEventEntity) {
            this.f30723e.add(interfaceC12415p1);
        }
    }
}
