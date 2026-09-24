package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8702q extends AbstractC8700o {
    public static final Parcelable.Creator<C8702q> CREATOR = new C8701p();

    /* JADX INFO: renamed from: b */
    public final String f20283b;

    /* JADX INFO: renamed from: c */
    public final byte[] f20284c;

    public C8702q(Parcel parcel) {
        super("PRIV");
        this.f20283b = parcel.readString();
        this.f20284c = parcel.createByteArray();
    }

    public C8702q(String str, byte[] bArr) {
        super("PRIV");
        this.f20283b = str;
        this.f20284c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8702q.class == obj.getClass()) {
            C8702q c8702q = (C8702q) obj;
            if (AbstractC8827z.m21386a(this.f20283b, c8702q.f20283b) && Arrays.equals(this.f20284c, c8702q.f20284c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20283b;
        return Arrays.hashCode(this.f20284c) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20283b);
        parcel.writeByteArray(this.f20284c);
    }
}
