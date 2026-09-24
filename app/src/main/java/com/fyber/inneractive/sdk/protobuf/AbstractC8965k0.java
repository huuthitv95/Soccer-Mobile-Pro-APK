package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.k0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8965k0 {

    /* JADX INFO: renamed from: a */
    public static final C8959j0 f21058a = new C8959j0();

    /* JADX INFO: renamed from: b */
    public static final C8959j0 f21059b;

    static {
        C8959j0 c8959j0 = null;
        try {
            c8959j0 = (C8959j0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f21059b = c8959j0;
    }
}
