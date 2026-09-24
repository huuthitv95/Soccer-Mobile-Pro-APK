package com.bykv.p028vk.openvk.preload.p029a.p031b;

import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.b.b */
/* JADX INFO: compiled from: EventListenerWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1884b extends AbstractC1883a {

    /* JADX INFO: renamed from: a */
    private List<AbstractC1883a> f4254a;

    public C1884b(AbstractC1883a... abstractC1883aArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f4254a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(abstractC1883aArr));
    }

    /* JADX INFO: renamed from: a */
    public final void m5844a(AbstractC1883a abstractC1883a) {
        if (abstractC1883a == null) {
            return;
        }
        this.f4254a.add(abstractC1883a);
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
    /* JADX INFO: renamed from: a */
    public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
        for (AbstractC1883a abstractC1883a : this.f4254a) {
            if (abstractC1883a != null) {
                abstractC1883a.mo5838a(interfaceC1882b, abstractC1886d);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
    /* JADX INFO: renamed from: a */
    public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
        for (AbstractC1883a abstractC1883a : this.f4254a) {
            if (abstractC1883a != null) {
                abstractC1883a.mo5839a(interfaceC1882b, abstractC1886d, th);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
    /* JADX INFO: renamed from: b */
    public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
        for (AbstractC1883a abstractC1883a : this.f4254a) {
            if (abstractC1883a != null) {
                abstractC1883a.mo5840b(interfaceC1882b, abstractC1886d);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
    /* JADX INFO: renamed from: b */
    public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
        for (AbstractC1883a abstractC1883a : this.f4254a) {
            if (abstractC1883a != null) {
                abstractC1883a.mo5841b(interfaceC1882b, abstractC1886d, th);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
    /* JADX INFO: renamed from: c */
    public final <T> void mo5842c(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
        for (AbstractC1883a abstractC1883a : this.f4254a) {
            if (abstractC1883a != null) {
                abstractC1883a.mo5842c(interfaceC1882b, abstractC1886d);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
    /* JADX INFO: renamed from: c */
    public final <T> void mo5843c(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
        for (AbstractC1883a abstractC1883a : this.f4254a) {
            if (abstractC1883a != null) {
                abstractC1883a.mo5843c(interfaceC1882b, abstractC1886d, th);
            }
        }
    }
}
