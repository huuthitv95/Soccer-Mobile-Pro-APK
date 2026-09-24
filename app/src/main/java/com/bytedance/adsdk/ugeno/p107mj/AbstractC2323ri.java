package com.bytedance.adsdk.ugeno.p107mj;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2323ri implements Parcelable {

    /* JADX INFO: renamed from: lr */
    private final Parcelable f6004lr;

    /* JADX INFO: renamed from: ri */
    public static final AbstractC2323ri f6003ri = new AbstractC2323ri() { // from class: com.bytedance.adsdk.ugeno.mj.ri.1
    };
    public static final Parcelable.Creator<AbstractC2323ri> CREATOR = new Parcelable.ClassLoaderCreator<AbstractC2323ri>() { // from class: com.bytedance.adsdk.ugeno.mj.ri.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public AbstractC2323ri createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public AbstractC2323ri createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC2323ri.f6003ri;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public AbstractC2323ri[] newArray(int i) {
            return new AbstractC2323ri[i];
        }
    };

    private AbstractC2323ri() {
        this.f6004lr = null;
    }

    protected AbstractC2323ri(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f6004lr = parcelable == null ? f6003ri : parcelable;
    }

    protected AbstractC2323ri(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f6004lr = parcelable == f6003ri ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ri */
    public final Parcelable m7944ri() {
        return this.f6004lr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6004lr, i);
    }
}
