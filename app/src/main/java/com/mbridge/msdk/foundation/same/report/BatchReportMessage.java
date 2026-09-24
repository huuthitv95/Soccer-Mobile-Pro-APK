package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new C13131a();

    /* JADX INFO: renamed from: a */
    private String f36073a;

    /* JADX INFO: renamed from: b */
    private long f36074b;

    /* JADX INFO: renamed from: c */
    private String f36075c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.BatchReportMessage$a */
    class C13131a implements Parcelable.Creator<BatchReportMessage> {
        C13131a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i) {
            return new BatchReportMessage[i];
        }
    }

    public BatchReportMessage(String str, String str2, long j) {
        this.f36075c = str;
        this.f36073a = str2;
        this.f36074b = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f36073a;
    }

    public long getTimestamp() {
        return this.f36074b;
    }

    public String getUuid() {
        return this.f36075c;
    }

    public void setReportMessage(String str) {
        this.f36073a = str;
    }

    public void setTimestamp(long j) {
        this.f36074b = j;
    }

    public void setUuid(String str) {
        this.f36075c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f36075c);
        parcel.writeString(this.f36073a);
        parcel.writeLong(this.f36074b);
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f36075c = parcel.readString();
        this.f36073a = parcel.readString();
        this.f36074b = parcel.readLong();
    }
}
