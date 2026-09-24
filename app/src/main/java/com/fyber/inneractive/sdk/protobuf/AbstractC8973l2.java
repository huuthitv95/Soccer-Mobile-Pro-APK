package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.l2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8973l2 {

    /* JADX INFO: renamed from: a */
    public static final C8967k2 f21066a;

    /* JADX INFO: renamed from: b */
    public static final C8967k2 f21067b;

    static {
        C8967k2 c8967k2 = null;
        try {
            c8967k2 = (C8967k2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f21066a = c8967k2;
        f21067b = new C8967k2();
    }
}
