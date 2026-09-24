package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8695j extends AbstractC8700o {
    public static final Parcelable.Creator<C8695j> CREATOR = new C8694i();

    /* JADX INFO: renamed from: b */
    public final String f20270b;

    /* JADX INFO: renamed from: c */
    public final String f20271c;

    /* JADX INFO: renamed from: d */
    public final String f20272d;

    public C8695j(Parcel parcel) {
        super("COMM");
        this.f20270b = parcel.readString();
        this.f20271c = parcel.readString();
        this.f20272d = parcel.readString();
    }

    public C8695j(String str, String str2, String str3) {
        super("COMM");
        this.f20270b = str;
        this.f20271c = str2;
        this.f20272d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8695j.class == obj.getClass()) {
            C8695j c8695j = (C8695j) obj;
            if (AbstractC8827z.m21386a(this.f20271c, c8695j.f20271c) && AbstractC8827z.m21386a(this.f20270b, c8695j.f20270b) && AbstractC8827z.m21386a(this.f20272d, c8695j.f20272d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20270b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f20271c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20272d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20282a);
        parcel.writeString(this.f20270b);
        parcel.writeString(this.f20272d);
    }
}
