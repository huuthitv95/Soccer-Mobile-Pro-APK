package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8697l extends AbstractC8700o {
    public static final Parcelable.Creator<C8697l> CREATOR = new C8696k();

    /* JADX INFO: renamed from: b */
    public final String f20273b;

    /* JADX INFO: renamed from: c */
    public final String f20274c;

    /* JADX INFO: renamed from: d */
    public final String f20275d;

    /* JADX INFO: renamed from: e */
    public final byte[] f20276e;

    public C8697l(Parcel parcel) {
        super("GEOB");
        this.f20273b = parcel.readString();
        this.f20274c = parcel.readString();
        this.f20275d = parcel.readString();
        this.f20276e = parcel.createByteArray();
    }

    public C8697l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f20273b = str;
        this.f20274c = str2;
        this.f20275d = str3;
        this.f20276e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8697l.class == obj.getClass()) {
            C8697l c8697l = (C8697l) obj;
            if (AbstractC8827z.m21386a(this.f20273b, c8697l.f20273b) && AbstractC8827z.m21386a(this.f20274c, c8697l.f20274c) && AbstractC8827z.m21386a(this.f20275d, c8697l.f20275d) && Arrays.equals(this.f20276e, c8697l.f20276e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20273b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f20274c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20275d;
        return Arrays.hashCode(this.f20276e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20273b);
        parcel.writeString(this.f20274c);
        parcel.writeString(this.f20275d);
        parcel.writeByteArray(this.f20276e);
    }
}
