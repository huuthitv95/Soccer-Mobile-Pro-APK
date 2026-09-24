package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.a2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8907a2 {

    /* JADX INFO: renamed from: a */
    public static final C9048z1 f20979a;

    /* JADX INFO: renamed from: b */
    public static final C9048z1 f20980b;

    static {
        C9048z1 c9048z1 = null;
        try {
            c9048z1 = (C9048z1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f20979a = c9048z1;
        f20980b = new C9048z1();
    }
}
