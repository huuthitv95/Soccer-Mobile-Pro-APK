package com.fyber.inneractive.sdk.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.x1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9038x1 {

    /* JADX INFO: renamed from: b */
    public static final C9028v1 f21167b = new C9028v1();

    /* JADX INFO: renamed from: a */
    public final InterfaceC8913b2 f21168a;

    public C9038x1() {
        InterfaceC8913b2 interfaceC8913b2;
        try {
            interfaceC8913b2 = (InterfaceC8913b2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC8913b2 = f21167b;
        }
        C9033w1 c9033w1 = new C9033w1(C9007r0.f21099a, interfaceC8913b2);
        Charset charset = AbstractC8972l1.f21064a;
        this.f21168a = c9033w1;
    }
}
