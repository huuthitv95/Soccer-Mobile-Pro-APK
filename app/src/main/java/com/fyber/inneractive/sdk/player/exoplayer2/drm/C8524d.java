package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8524d implements Comparator, Parcelable {
    public static final Parcelable.Creator<C8524d> CREATOR = new C8521a();

    /* JADX INFO: renamed from: a */
    public final C8523c[] f19112a;

    /* JADX INFO: renamed from: b */
    public int f19113b;

    /* JADX INFO: renamed from: c */
    public final int f19114c;

    public C8524d(Parcel parcel) {
        C8523c[] c8523cArr = (C8523c[]) parcel.createTypedArray(C8523c.CREATOR);
        this.f19112a = c8523cArr;
        this.f19114c = c8523cArr.length;
    }

    public C8524d(boolean z, C8523c... c8523cArr) {
        c8523cArr = z ? (C8523c[]) c8523cArr.clone() : c8523cArr;
        Arrays.sort(c8523cArr, this);
        for (int i = 1; i < c8523cArr.length; i++) {
            if (c8523cArr[i - 1].f19108b.equals(c8523cArr[i].f19108b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + c8523cArr[i].f19108b);
            }
        }
        this.f19112a = c8523cArr;
        this.f19114c = c8523cArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C8523c c8523c = (C8523c) obj;
        C8523c c8523c2 = (C8523c) obj2;
        UUID uuid = AbstractC8515b.f19087b;
        if (uuid.equals(c8523c.f19108b)) {
            return uuid.equals(c8523c2.f19108b) ? 0 : 1;
        }
        return c8523c.f19108b.compareTo(c8523c2.f19108b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8524d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f19112a, ((C8524d) obj).f19112a);
    }

    public final int hashCode() {
        if (this.f19113b == 0) {
            this.f19113b = Arrays.hashCode(this.f19112a);
        }
        return this.f19113b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f19112a, 0);
    }
}
