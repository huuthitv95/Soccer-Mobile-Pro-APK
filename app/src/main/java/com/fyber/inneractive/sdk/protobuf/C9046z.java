package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.z */
/* JADX INFO: loaded from: classes4.dex */
public final class C9046z extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public C9046z(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public C9046z(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
