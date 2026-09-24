package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C12434q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12335a {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.a$a */
    public static final class a implements InterfaceC12335a {

        /* JADX INFO: renamed from: a */
        private final List<C12434q2> f31089a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12335a
        /* JADX INFO: renamed from: a */
        public C12434q2 mo32355a(String instanceName) {
            Object next;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.f31089a.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((C12434q2) next).m33143c(), instanceName)) {
                    return (C12434q2) next;
                }
            }
            next = null;
            return (C12434q2) next;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12335a
        /* JADX INFO: renamed from: b */
        public String mo32357b() {
            if (this.f31089a.isEmpty()) {
                return "";
            }
            return "1" + ((C12434q2) CollectionsKt.first((List) this.f31089a)).m33143c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12335a
        public C12434q2 get(int i) {
            if (i < 0 || i >= this.f31089a.size()) {
                return null;
            }
            return this.f31089a.get(i);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12335a
        public boolean isEmpty() {
            return this.f31089a.isEmpty();
        }

        public a(List<C12434q2> waterfall) {
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.f31089a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12335a
        /* JADX INFO: renamed from: a */
        public List<C12434q2> mo32356a() {
            return this.f31089a;
        }

        public /* synthetic */ a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }
    }

    /* JADX INFO: renamed from: a */
    C12434q2 mo32355a(String str);

    /* JADX INFO: renamed from: a */
    List<C12434q2> mo32356a();

    /* JADX INFO: renamed from: b */
    String mo32357b();

    C12434q2 get(int i);

    boolean isEmpty();
}
