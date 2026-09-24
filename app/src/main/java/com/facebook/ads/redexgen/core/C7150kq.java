package com.facebook.ads.redexgen.core;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7150kq implements InterfaceC5616Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C7150kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5616Ll
    public final void AGj(int i) throws C7147kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5616Ll
    public final void close() throws C7147kn {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5616Ll
    public final int length() throws C7147kn {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5616Ll
    public final int read(byte[] bArr) throws C7147kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
