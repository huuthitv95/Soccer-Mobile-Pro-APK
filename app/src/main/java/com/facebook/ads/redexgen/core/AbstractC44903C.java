package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3C */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC44903C {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AbstractC44903C(AbstractC44903C abstractC44903C) {
        this.A04 = abstractC44903C.A04;
        this.A00 = abstractC44903C.A00;
        this.A01 = abstractC44903C.A01;
        this.A03 = abstractC44903C.A03;
        this.A02 = abstractC44903C.A02;
    }

    public AbstractC44903C(Object obj) {
        this(obj, -1L);
    }

    public AbstractC44903C(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public AbstractC44903C(Object obj, int i, int i2, long j, int i3) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }

    public AbstractC44903C(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC44903C)) {
            return false;
        }
        AbstractC44903C abstractC44903C = (AbstractC44903C) obj;
        return this.A04.equals(abstractC44903C.A04) && this.A00 == abstractC44903C.A00 && this.A01 == abstractC44903C.A01 && this.A03 == abstractC44903C.A03 && this.A02 == abstractC44903C.A02;
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        int result4 = (((result2 + result3) * 31) + ((int) this.A03)) * 31;
        int result5 = this.A02;
        return result4 + result5;
    }
}
