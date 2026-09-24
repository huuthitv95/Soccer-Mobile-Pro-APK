package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8523c implements Parcelable {
    public static final Parcelable.Creator<C8523c> CREATOR = new C8522b();

    /* JADX INFO: renamed from: a */
    public int f19107a;

    /* JADX INFO: renamed from: b */
    public final UUID f19108b;

    /* JADX INFO: renamed from: c */
    public final String f19109c;

    /* JADX INFO: renamed from: d */
    public final byte[] f19110d;

    /* JADX INFO: renamed from: e */
    public final boolean f19111e;

    public C8523c(Parcel parcel) {
        this.f19108b = new UUID(parcel.readLong(), parcel.readLong());
        this.f19109c = parcel.readString();
        this.f19110d = parcel.createByteArray();
        this.f19111e = parcel.readByte() != 0;
    }

    public C8523c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f19108b = uuid;
        this.f19109c = str;
        bArr.getClass();
        this.f19110d = bArr;
        this.f19111e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8523c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C8523c c8523c = (C8523c) obj;
        return this.f19109c.equals(c8523c.f19109c) && AbstractC8827z.m21386a(this.f19108b, c8523c.f19108b) && Arrays.equals(this.f19110d, c8523c.f19110d);
    }

    public final int hashCode() {
        if (this.f19107a == 0) {
            this.f19107a = Arrays.hashCode(this.f19110d) + ((this.f19109c.hashCode() + (this.f19108b.hashCode() * 31)) * 31);
        }
        return this.f19107a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f19108b.getMostSignificantBits());
        parcel.writeLong(this.f19108b.getLeastSignificantBits());
        parcel.writeString(this.f19109c);
        parcel.writeByteArray(this.f19110d);
        parcel.writeByte(this.f19111e ? (byte) 1 : (byte) 0);
    }
}
