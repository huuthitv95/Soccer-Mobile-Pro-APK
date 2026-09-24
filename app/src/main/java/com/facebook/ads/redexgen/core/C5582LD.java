package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5582LD {
    public final int A00;
    public final String A01;
    public final List<C5581LC> A02;
    public final byte[] A03;

    public C5582LD(int i, String str, List<C5581LC> list, byte[] bArr) {
        List<C5581LC> listUnmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = listUnmodifiableList;
        this.A03 = bArr;
    }
}
