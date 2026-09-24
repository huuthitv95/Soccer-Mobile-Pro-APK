package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C8704s extends AbstractC8700o {
    public static final Parcelable.Creator<C8704s> CREATOR = new C8703r();

    /* JADX INFO: renamed from: b */
    public final String f20285b;

    /* JADX INFO: renamed from: c */
    public final String f20286c;

    public C8704s(Parcel parcel) {
        super(parcel.readString());
        this.f20285b = parcel.readString();
        this.f20286c = parcel.readString();
    }

    public C8704s(String str, String str2, String str3) {
        super(str);
        this.f20285b = str2;
        this.f20286c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8704s.class == obj.getClass()) {
            C8704s c8704s = (C8704s) obj;
            if (this.f20282a.equals(c8704s.f20282a) && AbstractC8827z.m21386a(this.f20285b, c8704s.f20285b) && AbstractC8827z.m21386a(this.f20286c, c8704s.f20286c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f20282a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f20285b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20286c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20282a);
        parcel.writeString(this.f20285b);
        parcel.writeString(this.f20286c);
    }
}
