package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8693h extends AbstractC8700o {
    public static final Parcelable.Creator<C8693h> CREATOR = new C8692g();

    /* JADX INFO: renamed from: b */
    public final String f20265b;

    /* JADX INFO: renamed from: c */
    public final boolean f20266c;

    /* JADX INFO: renamed from: d */
    public final boolean f20267d;

    /* JADX INFO: renamed from: e */
    public final String[] f20268e;

    /* JADX INFO: renamed from: f */
    public final AbstractC8700o[] f20269f;

    public C8693h(Parcel parcel) {
        super("CTOC");
        this.f20265b = parcel.readString();
        this.f20266c = parcel.readByte() != 0;
        this.f20267d = parcel.readByte() != 0;
        this.f20268e = parcel.createStringArray();
        int i = parcel.readInt();
        this.f20269f = new AbstractC8700o[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f20269f[i2] = (AbstractC8700o) parcel.readParcelable(AbstractC8700o.class.getClassLoader());
        }
    }

    public C8693h(String str, boolean z, boolean z2, String[] strArr, AbstractC8700o[] abstractC8700oArr) {
        super("CTOC");
        this.f20265b = str;
        this.f20266c = z;
        this.f20267d = z2;
        this.f20268e = strArr;
        this.f20269f = abstractC8700oArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8693h.class == obj.getClass()) {
            C8693h c8693h = (C8693h) obj;
            if (this.f20266c == c8693h.f20266c && this.f20267d == c8693h.f20267d && AbstractC8827z.m21386a(this.f20265b, c8693h.f20265b) && Arrays.equals(this.f20268e, c8693h.f20268e) && Arrays.equals(this.f20269f, c8693h.f20269f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f20266c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f20267d ? 1 : 0)) * 31;
        String str = this.f20265b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20265b);
        parcel.writeByte(this.f20266c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20267d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f20268e);
        parcel.writeInt(this.f20269f.length);
        int i2 = 0;
        while (true) {
            AbstractC8700o[] abstractC8700oArr = this.f20269f;
            if (i2 >= abstractC8700oArr.length) {
                return;
            }
            parcel.writeParcelable(abstractC8700oArr[i2], 0);
            i2++;
        }
    }
}
