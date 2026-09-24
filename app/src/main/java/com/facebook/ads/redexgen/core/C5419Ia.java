package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ia */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5419Ia {
    public final int A00;
    public final long A01;

    public C5419Ia(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C5419Ia(int i, long j, C5418IZ c5418iz) {
        this(i, j);
    }

    public static C5419Ia A00(Parcel parcel) {
        return new C5419Ia(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
