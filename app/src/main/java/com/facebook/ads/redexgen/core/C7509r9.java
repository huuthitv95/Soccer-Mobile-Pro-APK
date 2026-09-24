package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7509r9 {
    public final InterfaceC7513rD A00;
    public final String A01;
    public final Collection<C7523rN> A02;
    public final Collection<C7523rN> A03;
    public final List<Rect> A04;

    public C7509r9(String str, InterfaceC7513rD interfaceC7513rD, List<Rect> rects, Collection<C7523rN> collection, Collection<C7523rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC7513rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
