package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3k */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC45213k {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    C45193i A57(C45193i c45193i) throws C45203j;

    ByteBuffer A8d();

    boolean AAL();

    boolean AAP();

    void AHG();

    void AHH(ByteBuffer byteBuffer);

    void flush();
}
