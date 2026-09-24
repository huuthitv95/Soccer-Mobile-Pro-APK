package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.t0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9017t0 implements InterfaceC8919c2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC9047z0 f21117a;

    /* JADX INFO: renamed from: b */
    public AbstractC9047z0 f21118b;

    /* JADX INFO: renamed from: c */
    public boolean f21119c = false;

    public AbstractC9017t0(AbstractC9047z0 abstractC9047z0) {
        this.f21117a = abstractC9047z0;
        this.f21118b = (AbstractC9047z0) abstractC9047z0.dynamicMethod(EnumC9042y0.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static void m21748a(AbstractC9047z0 abstractC9047z0, AbstractC9047z0 abstractC9047z1) {
        C8997p2 c8997p2 = C8997p2.f21087c;
        c8997p2.getClass();
        c8997p2.m21698a(abstractC9047z0.getClass()).mo21637a(abstractC9047z0, abstractC9047z1);
    }

    /* JADX INFO: renamed from: a */
    public static void m21749a(Iterable iterable, List list) {
        Charset charset = AbstractC8972l1.f21064a;
        iterable.getClass();
        if (iterable instanceof InterfaceC9002q1) {
            List listMo21697b = ((InterfaceC9002q1) iterable).mo21697b();
            InterfaceC9002q1 interfaceC9002q1 = (InterfaceC9002q1) list;
            int size = list.size();
            for (Object obj : listMo21697b) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC9002q1.size() - size) + " is null.";
                    for (int size2 = interfaceC9002q1.size() - 1; size2 >= size; size2--) {
                        interfaceC9002q1.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC9011s) {
                    interfaceC9002q1.mo21696a((AbstractC9011s) obj);
                } else {
                    interfaceC9002q1.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC8985n2) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC9017t0 m21750a(AbstractC9031w abstractC9031w, C8947h0 c8947h0) throws IOException {
        m21753c();
        try {
            C8997p2 c8997p2 = C8997p2.f21087c;
            AbstractC9047z0 abstractC9047z0 = this.f21118b;
            c8997p2.getClass();
            InterfaceC9019t2 interfaceC9019t2M21698a = c8997p2.m21698a(abstractC9047z0.getClass());
            AbstractC9047z0 abstractC9047z1 = this.f21118b;
            C9036x c9036x = abstractC9031w.f21148d;
            if (c9036x == null) {
                c9036x = new C9036x(abstractC9031w);
            }
            interfaceC9019t2M21698a.mo21636a(abstractC9047z1, c9036x, c8947h0);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC9047z0 m21751a() {
        AbstractC9047z0 abstractC9047z0M21752b = m21752b();
        if (abstractC9047z0M21752b.isInitialized()) {
            return abstractC9047z0M21752b;
        }
        throw new C8980m3();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC9047z0 m21752b() {
        if (this.f21119c) {
            return this.f21118b;
        }
        this.f21118b.makeImmutable();
        this.f21119c = true;
        return this.f21118b;
    }

    /* JADX INFO: renamed from: c */
    public final void m21753c() {
        if (this.f21119c) {
            AbstractC9047z0 abstractC9047z0 = (AbstractC9047z0) this.f21118b.dynamicMethod(EnumC9042y0.NEW_MUTABLE_INSTANCE);
            m21748a(abstractC9047z0, this.f21118b);
            this.f21118b = abstractC9047z0;
            this.f21119c = false;
        }
    }

    public final Object clone() {
        AbstractC9017t0 abstractC9017t0NewBuilderForType = this.f21117a.newBuilderForType();
        AbstractC9047z0 abstractC9047z0M21752b = m21752b();
        abstractC9017t0NewBuilderForType.m21753c();
        m21748a(abstractC9017t0NewBuilderForType.f21118b, abstractC9047z0M21752b);
        return abstractC9017t0NewBuilderForType;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8931e2
    public final InterfaceC8925d2 getDefaultInstanceForType() {
        return this.f21117a;
    }
}
