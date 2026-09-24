package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new C12786a();

    /* JADX INFO: renamed from: a */
    private long f34075a;

    /* JADX INFO: renamed from: b */
    private int f34076b;

    /* JADX INFO: renamed from: c */
    private long f34077c;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.DownloadProgress$a */
    class C12786a implements Parcelable.Creator<DownloadProgress> {
        C12786a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i) {
            return new DownloadProgress[i];
        }
    }

    public DownloadProgress(long j, long j2, int i) {
        this.f34075a = j;
        this.f34077c = j2;
        this.f34076b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f34075a;
    }

    public int getCurrentDownloadRate() {
        return this.f34076b;
    }

    public long getTotal() {
        return this.f34077c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f34075a);
        parcel.writeLong(this.f34077c);
        parcel.writeInt(this.f34076b);
    }

    protected DownloadProgress(Parcel parcel) {
        this.f34075a = parcel.readLong();
        this.f34077c = parcel.readLong();
        this.f34076b = parcel.readInt();
    }
}
