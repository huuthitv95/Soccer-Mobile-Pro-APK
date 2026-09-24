package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8689d extends AbstractC8700o {
    public static final Parcelable.Creator<C8689d> CREATOR = new C8688c();

    /* JADX INFO: renamed from: b */
    public final byte[] f20258b;

    public C8689d(Parcel parcel) {
        super(parcel.readString());
        this.f20258b = parcel.createByteArray();
    }

    public C8689d(String str, byte[] bArr) {
        super(str);
        this.f20258b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8689d.class == obj.getClass()) {
            C8689d c8689d = (C8689d) obj;
            if (this.f20282a.equals(c8689d.f20282a) && Arrays.equals(this.f20258b, c8689d.f20258b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20258b) + ((this.f20282a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20282a);
        parcel.writeByteArray(this.f20258b);
    }
}
