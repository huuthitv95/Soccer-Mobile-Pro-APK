package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2y */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C44762y {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public C44762y(C44752x c44752x) {
        byte[] bArrCopyOf;
        AbstractC45353y.A08((c44752x.A04 && c44752x.A00 == null) ? false : true);
        this.A05 = (UUID) AbstractC45353y.A01(c44752x.A03);
        this.A06 = this.A05;
        this.A00 = c44752x.A00;
        this.A04 = c44752x.A02;
        this.A03 = c44752x.A02;
        this.A08 = c44752x.A05;
        this.A07 = c44752x.A04;
        this.A09 = c44752x.A06;
        this.A02 = c44752x.A01;
        this.A01 = c44752x.A01;
        if (c44752x.A07 != null) {
            bArrCopyOf = Arrays.copyOf(c44752x.A07, c44752x.A07.length);
        } else {
            bArrCopyOf = null;
        }
        this.A0A = bArrCopyOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44762y)) {
            return false;
        }
        C44762y c44762y = (C44762y) obj;
        if (this.A05.equals(c44762y.A05) && AbstractC46115C.A1E(this.A00, c44762y.A00) && AbstractC46115C.A1E(this.A03, c44762y.A03) && this.A08 == c44762y.A08 && this.A07 == c44762y.A07 && this.A09 == c44762y.A09 && this.A01.equals(c44762y.A01) && Arrays.equals(this.A0A, c44762y.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
