package com.fyber.inneractive.sdk.protobuf;

import com.google.android.exoplayer2.C9415C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.l1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8972l1 {

    /* JADX INFO: renamed from: a */
    public static final Charset f21064a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f21065b;

    static {
        Charset.forName(C9415C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        f21065b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC9047z0 m21664a(Object obj, Object obj2) {
        InterfaceC8925d2 interfaceC8925d2 = (InterfaceC8925d2) obj2;
        AbstractC9017t0 abstractC9017t0 = (AbstractC9017t0) ((InterfaceC8925d2) obj).toBuilder();
        if (!abstractC9017t0.f21117a.getClass().isInstance(interfaceC8925d2)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC9017t0.m21753c();
        AbstractC9017t0.m21748a(abstractC9017t0.f21118b, (AbstractC9047z0) ((AbstractC8910b) interfaceC8925d2));
        return abstractC9017t0.m21752b();
    }

    /* JADX INFO: renamed from: a */
    public static String m21665a(byte[] bArr) {
        return new String(bArr, f21064a);
    }
}
