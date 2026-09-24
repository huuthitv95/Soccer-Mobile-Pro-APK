package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8522b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C8523c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C8523c[i];
    }
}
