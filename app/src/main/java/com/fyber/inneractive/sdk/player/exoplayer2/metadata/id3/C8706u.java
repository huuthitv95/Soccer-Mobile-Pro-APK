package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.u */
/* JADX INFO: loaded from: classes4.dex */
public final class C8706u extends AbstractC8700o {
    public static final Parcelable.Creator<C8706u> CREATOR = new C8705t();

    /* JADX INFO: renamed from: b */
    public final String f20287b;

    /* JADX INFO: renamed from: c */
    public final String f20288c;

    public C8706u(Parcel parcel) {
        super(parcel.readString());
        this.f20287b = parcel.readString();
        this.f20288c = parcel.readString();
    }

    public C8706u(String str, String str2, String str3) {
        super(str);
        this.f20287b = str2;
        this.f20288c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8706u.class == obj.getClass()) {
            C8706u c8706u = (C8706u) obj;
            if (this.f20282a.equals(c8706u.f20282a) && AbstractC8827z.m21386a(this.f20287b, c8706u.f20287b) && AbstractC8827z.m21386a(this.f20288c, c8706u.f20288c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f20282a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f20287b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20288c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20282a);
        parcel.writeString(this.f20287b);
        parcel.writeString(this.f20288c);
    }
}
