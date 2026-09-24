package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8687b extends AbstractC8700o {
    public static final Parcelable.Creator<C8687b> CREATOR = new C8686a();

    /* JADX INFO: renamed from: b */
    public final String f20254b;

    /* JADX INFO: renamed from: c */
    public final String f20255c;

    /* JADX INFO: renamed from: d */
    public final int f20256d;

    /* JADX INFO: renamed from: e */
    public final byte[] f20257e;

    public C8687b(Parcel parcel) {
        super("APIC");
        this.f20254b = parcel.readString();
        this.f20255c = parcel.readString();
        this.f20256d = parcel.readInt();
        this.f20257e = parcel.createByteArray();
    }

    public C8687b(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f20254b = str;
        this.f20255c = str2;
        this.f20256d = i;
        this.f20257e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8687b.class == obj.getClass()) {
            C8687b c8687b = (C8687b) obj;
            if (this.f20256d == c8687b.f20256d && AbstractC8827z.m21386a(this.f20254b, c8687b.f20254b) && AbstractC8827z.m21386a(this.f20255c, c8687b.f20255c) && Arrays.equals(this.f20257e, c8687b.f20257e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f20256d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f20254b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20255c;
        return Arrays.hashCode(this.f20257e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20254b);
        parcel.writeString(this.f20255c);
        parcel.writeInt(this.f20256d);
        parcel.writeByteArray(this.f20257e);
    }
}
