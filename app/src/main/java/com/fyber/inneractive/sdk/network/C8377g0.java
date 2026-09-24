package com.fyber.inneractive.sdk.network;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.g0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8377g0 {

    /* JADX INFO: renamed from: c */
    public static final C8377g0 f18655c = new C8377g0();

    /* JADX INFO: renamed from: a */
    public final C8388k f18656a = new C8388k();

    /* JADX INFO: renamed from: b */
    public C8405p1 f18657b;

    /* JADX INFO: renamed from: a */
    public final InterfaceC8379h m20755a() {
        String property;
        if (this.f18657b == null) {
            try {
                property = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                property = "hurl";
            }
            if (property != null && property.equals("okhttp")) {
                try {
                    Class.forName("okhttp3.OkHttpClient");
                    this.f18657b = new C8405p1();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        C8405p1 c8405p1 = this.f18657b;
        return c8405p1 != null ? c8405p1 : this.f18656a;
    }
}
