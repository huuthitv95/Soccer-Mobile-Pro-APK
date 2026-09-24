package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC8700o;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8685b implements Parcelable {
    public static final Parcelable.Creator<C8685b> CREATOR = new C8684a();

    /* JADX INFO: renamed from: a */
    public final AbstractC8700o[] f20253a;

    public C8685b(Parcel parcel) {
        this.f20253a = new AbstractC8700o[parcel.readInt()];
        int i = 0;
        while (true) {
            AbstractC8700o[] abstractC8700oArr = this.f20253a;
            if (i >= abstractC8700oArr.length) {
                return;
            }
            abstractC8700oArr[i] = (AbstractC8700o) parcel.readParcelable(AbstractC8700o.class.getClassLoader());
            i++;
        }
    }

    public C8685b(ArrayList arrayList) {
        AbstractC8700o[] abstractC8700oArr = new AbstractC8700o[arrayList.size()];
        this.f20253a = abstractC8700oArr;
        arrayList.toArray(abstractC8700oArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8685b.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20253a, ((C8685b) obj).f20253a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f20253a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20253a.length);
        for (AbstractC8700o abstractC8700o : this.f20253a) {
            parcel.writeParcelable(abstractC8700o, 0);
        }
    }
}
