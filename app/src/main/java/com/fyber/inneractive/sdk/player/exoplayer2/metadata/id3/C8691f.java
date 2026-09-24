package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8691f extends AbstractC8700o {
    public static final Parcelable.Creator<C8691f> CREATOR = new C8690e();

    /* JADX INFO: renamed from: b */
    public final String f20259b;

    /* JADX INFO: renamed from: c */
    public final int f20260c;

    /* JADX INFO: renamed from: d */
    public final int f20261d;

    /* JADX INFO: renamed from: e */
    public final long f20262e;

    /* JADX INFO: renamed from: f */
    public final long f20263f;

    /* JADX INFO: renamed from: g */
    public final AbstractC8700o[] f20264g;

    public C8691f(Parcel parcel) {
        super("CHAP");
        this.f20259b = parcel.readString();
        this.f20260c = parcel.readInt();
        this.f20261d = parcel.readInt();
        this.f20262e = parcel.readLong();
        this.f20263f = parcel.readLong();
        int i = parcel.readInt();
        this.f20264g = new AbstractC8700o[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f20264g[i2] = (AbstractC8700o) parcel.readParcelable(AbstractC8700o.class.getClassLoader());
        }
    }

    public C8691f(String str, int i, int i2, long j, long j2, AbstractC8700o[] abstractC8700oArr) {
        super("CHAP");
        this.f20259b = str;
        this.f20260c = i;
        this.f20261d = i2;
        this.f20262e = j;
        this.f20263f = j2;
        this.f20264g = abstractC8700oArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC8700o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8691f.class == obj.getClass()) {
            C8691f c8691f = (C8691f) obj;
            if (this.f20260c == c8691f.f20260c && this.f20261d == c8691f.f20261d && this.f20262e == c8691f.f20262e && this.f20263f == c8691f.f20263f && AbstractC8827z.m21386a(this.f20259b, c8691f.f20259b) && Arrays.equals(this.f20264g, c8691f.f20264g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f20260c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f20261d) * 31) + ((int) this.f20262e)) * 31) + ((int) this.f20263f)) * 31;
        String str = this.f20259b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20259b);
        parcel.writeInt(this.f20260c);
        parcel.writeInt(this.f20261d);
        parcel.writeLong(this.f20262e);
        parcel.writeLong(this.f20263f);
        parcel.writeInt(this.f20264g.length);
        for (AbstractC8700o abstractC8700o : this.f20264g) {
            parcel.writeParcelable(abstractC8700o, 0);
        }
    }
}
