package com.facebook.ads.redexgen.core;

import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6857fz {
    public C6861g3 A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C6857fz A00(C6861g3 c6861g3) {
        this.A00 = c6861g3;
        return this;
    }

    public final C6857fz A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C6857fz A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C6857fz A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C6857fz A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C6858g0 A05() {
        return new C6858g0(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
