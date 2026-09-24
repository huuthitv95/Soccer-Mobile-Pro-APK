package com.google.android.p279a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.a.c */
/* JADX INFO: compiled from: Codecs.java */
/* JADX INFO: loaded from: classes4.dex */
public final class C9392c {
    static {
        C9392c.class.getClassLoader();
    }

    private C9392c() {
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m22117a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m22118b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX INFO: renamed from: c */
    public static void m22119c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }
}
