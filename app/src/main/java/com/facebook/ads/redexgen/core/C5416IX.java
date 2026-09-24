package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.IX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5416IX {
    public final int A00;
    public final long A01;
    public final long A02;

    public C5416IX(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ C5416IX(int i, long j, long j2, C5415IW c5415iw) {
        this(i, j, j2);
    }

    public static C5416IX A00(Parcel parcel) {
        return new C5416IX(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
