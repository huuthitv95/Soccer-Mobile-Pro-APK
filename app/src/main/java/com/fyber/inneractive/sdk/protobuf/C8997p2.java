package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.p2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8997p2 {

    /* JADX INFO: renamed from: c */
    public static final C8997p2 f21087c = new C8997p2();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f21089b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C9038x1 f21088a = new C9038x1();

    /* JADX INFO: renamed from: a */
    public final InterfaceC9019t2 m21698a(Class cls) {
        InterfaceC9019t2 interfaceC9019t2M21621a;
        Class cls2;
        Charset charset = AbstractC8972l1.f21064a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        InterfaceC9019t2 interfaceC9019t2 = (InterfaceC9019t2) this.f21089b.get(cls);
        if (interfaceC9019t2 != null) {
            return interfaceC9019t2;
        }
        C9038x1 c9038x1 = this.f21088a;
        c9038x1.getClass();
        Class cls3 = AbstractC9024u2.f21133a;
        if (!AbstractC9047z0.class.isAssignableFrom(cls) && (cls2 = AbstractC9024u2.f21133a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C9009r2 c9009r2Mo21520b = c9038x1.f21168a.mo21520b(cls);
        if ((c9009r2Mo21520b.f21104d & 2) == 2) {
            if (AbstractC9047z0.class.isAssignableFrom(cls)) {
                interfaceC9019t2M21621a = new C8961j2(AbstractC9024u2.f21136d, AbstractC8965k0.f21058a, c9009r2Mo21520b.f21101a);
            } else {
                C8992o3 c8992o3 = AbstractC9024u2.f21134b;
                C8959j0 c8959j0 = AbstractC8965k0.f21059b;
                if (c8959j0 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC9019t2M21621a = new C8961j2(c8992o3, c8959j0, c9009r2Mo21520b.f21101a);
            }
        } else if (AbstractC9047z0.class.isAssignableFrom(cls)) {
            interfaceC9019t2M21621a = ((c9009r2Mo21520b.f21104d & 1) == 1 ? EnumC8991o2.PROTO2 : EnumC8991o2.PROTO3) == EnumC8991o2.PROTO2 ? C8955i2.m21621a(c9009r2Mo21520b, AbstractC8973l2.f21067b, AbstractC9018t1.f21121b, AbstractC9024u2.f21136d, AbstractC8965k0.f21058a, AbstractC8907a2.f20980b) : C8955i2.m21621a(c9009r2Mo21520b, AbstractC8973l2.f21067b, AbstractC9018t1.f21121b, AbstractC9024u2.f21136d, (C8959j0) null, AbstractC8907a2.f20980b);
        } else {
            if (((c9009r2Mo21520b.f21104d & 1) == 1 ? EnumC8991o2.PROTO2 : EnumC8991o2.PROTO3) == EnumC8991o2.PROTO2) {
                C8967k2 c8967k2 = AbstractC8973l2.f21066a;
                C9008r1 c9008r1 = AbstractC9018t1.f21120a;
                C8992o3 c8992o4 = AbstractC9024u2.f21134b;
                C8959j0 c8959j1 = AbstractC8965k0.f21059b;
                if (c8959j1 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC9019t2M21621a = C8955i2.m21621a(c9009r2Mo21520b, c8967k2, c9008r1, c8992o4, c8959j1, AbstractC8907a2.f20979a);
            } else {
                interfaceC9019t2M21621a = C8955i2.m21621a(c9009r2Mo21520b, AbstractC8973l2.f21066a, AbstractC9018t1.f21120a, AbstractC9024u2.f21135c, (C8959j0) null, AbstractC8907a2.f20979a);
            }
        }
        InterfaceC9019t2 interfaceC9019t3 = (InterfaceC9019t2) this.f21089b.putIfAbsent(cls, interfaceC9019t2M21621a);
        return interfaceC9019t3 != null ? interfaceC9019t3 : interfaceC9019t2M21621a;
    }
}
