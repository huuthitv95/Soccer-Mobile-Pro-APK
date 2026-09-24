package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8831c implements Parcelable {
    public static final Parcelable.Creator<C8831c> CREATOR = new C8830b();

    /* JADX INFO: renamed from: a */
    public final int f20717a;

    /* JADX INFO: renamed from: b */
    public final int f20718b;

    /* JADX INFO: renamed from: c */
    public final int f20719c;

    /* JADX INFO: renamed from: d */
    public final byte[] f20720d;

    /* JADX INFO: renamed from: e */
    public int f20721e;

    public C8831c(int i, int i2, int i3, byte[] bArr) {
        this.f20717a = i;
        this.f20718b = i2;
        this.f20719c = i3;
        this.f20720d = bArr;
    }

    public C8831c(Parcel parcel) {
        this.f20717a = parcel.readInt();
        this.f20718b = parcel.readInt();
        this.f20719c = parcel.readInt();
        this.f20720d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8831c.class == obj.getClass()) {
            C8831c c8831c = (C8831c) obj;
            if (this.f20717a == c8831c.f20717a && this.f20718b == c8831c.f20718b && this.f20719c == c8831c.f20719c && Arrays.equals(this.f20720d, c8831c.f20720d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20721e == 0) {
            this.f20721e = Arrays.hashCode(this.f20720d) + ((((((this.f20717a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f20718b) * 31) + this.f20719c) * 31);
        }
        return this.f20721e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f20717a);
        sb.append(", ");
        sb.append(this.f20718b);
        sb.append(", ");
        sb.append(this.f20719c);
        sb.append(", ");
        sb.append(this.f20720d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20717a);
        parcel.writeInt(this.f20718b);
        parcel.writeInt(this.f20719c);
        parcel.writeInt(this.f20720d != null ? 1 : 0);
        byte[] bArr = this.f20720d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
