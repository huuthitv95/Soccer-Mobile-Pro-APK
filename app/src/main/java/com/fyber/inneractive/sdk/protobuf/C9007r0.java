package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.r0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9007r0 implements InterfaceC8913b2 {

    /* JADX INFO: renamed from: a */
    public static final C9007r0 f21099a = new C9007r0();

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8913b2
    /* JADX INFO: renamed from: a */
    public final boolean mo21519a(Class cls) {
        return AbstractC9047z0.class.isAssignableFrom(cls);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8913b2
    /* JADX INFO: renamed from: b */
    public final C9009r2 mo21520b(Class cls) {
        if (!AbstractC9047z0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (C9009r2) AbstractC9047z0.getDefaultInstance(cls.asSubclass(AbstractC9047z0.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
