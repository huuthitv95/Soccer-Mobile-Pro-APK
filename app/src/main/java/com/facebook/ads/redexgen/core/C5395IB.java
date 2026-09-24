package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.IB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5395IB implements Parcelable.Creator<ChapterTocFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ChapterTocFrame createFromParcel(Parcel parcel) {
        return new ChapterTocFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ChapterTocFrame[] newArray(int i) {
        return new ChapterTocFrame[i];
    }
}
