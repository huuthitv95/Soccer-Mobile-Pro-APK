package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C8685b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.video.C8831c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8708o implements Parcelable {
    public static final Parcelable.Creator<C8708o> CREATOR = new C8707n();

    /* JADX INFO: renamed from: A */
    public int f20289A;

    /* JADX INFO: renamed from: a */
    public final String f20290a;

    /* JADX INFO: renamed from: b */
    public final int f20291b;

    /* JADX INFO: renamed from: c */
    public final String f20292c;

    /* JADX INFO: renamed from: d */
    public final C8685b f20293d;

    /* JADX INFO: renamed from: e */
    public final String f20294e;

    /* JADX INFO: renamed from: f */
    public final String f20295f;

    /* JADX INFO: renamed from: g */
    public final int f20296g;

    /* JADX INFO: renamed from: h */
    public final List f20297h;

    /* JADX INFO: renamed from: i */
    public final C8524d f20298i;

    /* JADX INFO: renamed from: j */
    public final int f20299j;

    /* JADX INFO: renamed from: k */
    public final int f20300k;

    /* JADX INFO: renamed from: l */
    public final float f20301l;

    /* JADX INFO: renamed from: m */
    public final int f20302m;

    /* JADX INFO: renamed from: n */
    public final float f20303n;

    /* JADX INFO: renamed from: o */
    public final int f20304o;

    /* JADX INFO: renamed from: p */
    public final byte[] f20305p;

    /* JADX INFO: renamed from: q */
    public final C8831c f20306q;

    /* JADX INFO: renamed from: r */
    public final int f20307r;

    /* JADX INFO: renamed from: s */
    public final int f20308s;

    /* JADX INFO: renamed from: t */
    public final int f20309t;

    /* JADX INFO: renamed from: u */
    public final int f20310u;

    /* JADX INFO: renamed from: v */
    public final int f20311v;

    /* JADX INFO: renamed from: w */
    public final long f20312w;

    /* JADX INFO: renamed from: x */
    public final int f20313x;

    /* JADX INFO: renamed from: y */
    public final String f20314y;

    /* JADX INFO: renamed from: z */
    public final int f20315z;

    public C8708o(Parcel parcel) {
        this.f20290a = parcel.readString();
        this.f20294e = parcel.readString();
        this.f20295f = parcel.readString();
        this.f20292c = parcel.readString();
        this.f20291b = parcel.readInt();
        this.f20296g = parcel.readInt();
        this.f20299j = parcel.readInt();
        this.f20300k = parcel.readInt();
        this.f20301l = parcel.readFloat();
        this.f20302m = parcel.readInt();
        this.f20303n = parcel.readFloat();
        this.f20305p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f20304o = parcel.readInt();
        this.f20306q = (C8831c) parcel.readParcelable(C8831c.class.getClassLoader());
        this.f20307r = parcel.readInt();
        this.f20308s = parcel.readInt();
        this.f20309t = parcel.readInt();
        this.f20310u = parcel.readInt();
        this.f20311v = parcel.readInt();
        this.f20313x = parcel.readInt();
        this.f20314y = parcel.readString();
        this.f20315z = parcel.readInt();
        this.f20312w = parcel.readLong();
        int i = parcel.readInt();
        this.f20297h = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f20297h.add(parcel.createByteArray());
        }
        this.f20298i = (C8524d) parcel.readParcelable(C8524d.class.getClassLoader());
        this.f20293d = (C8685b) parcel.readParcelable(C8685b.class.getClassLoader());
    }

    public C8708o(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C8831c c8831c, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, C8524d c8524d, C8685b c8685b) {
        this.f20290a = str;
        this.f20294e = str2;
        this.f20295f = str3;
        this.f20292c = str4;
        this.f20291b = i;
        this.f20296g = i2;
        this.f20299j = i3;
        this.f20300k = i4;
        this.f20301l = f;
        this.f20302m = i5;
        this.f20303n = f2;
        this.f20305p = bArr;
        this.f20304o = i6;
        this.f20306q = c8831c;
        this.f20307r = i7;
        this.f20308s = i8;
        this.f20309t = i9;
        this.f20310u = i10;
        this.f20311v = i11;
        this.f20313x = i12;
        this.f20314y = str5;
        this.f20315z = i13;
        this.f20312w = j;
        this.f20297h = list == null ? Collections.EMPTY_LIST : list;
        this.f20298i = c8524d;
        this.f20293d = c8685b;
    }

    /* JADX INFO: renamed from: a */
    public static C8708o m21262a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, C8524d c8524d, int i8, String str3, C8685b c8685b) {
        return new C8708o(str, null, str2, null, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str3, -1, Long.MAX_VALUE, list, c8524d, c8685b);
    }

    /* JADX INFO: renamed from: a */
    public static C8708o m21263a(String str, String str2, int i, int i2, int i3, int i4, List list, C8524d c8524d, String str3) {
        return m21262a(str, str2, i, i2, i3, i4, -1, -1, -1, list, c8524d, 0, str3, null);
    }

    /* JADX INFO: renamed from: a */
    public static C8708o m21264a(String str, String str2, int i, int i2, int i3, List list, int i4, float f, byte[] bArr, int i5, C8831c c8831c, C8524d c8524d) {
        return new C8708o(str, null, str2, null, -1, i, i2, i3, -1.0f, i4, f, bArr, i5, c8831c, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, c8524d, null);
    }

    /* JADX INFO: renamed from: a */
    public static C8708o m21265a(String str, String str2, int i, String str3, int i2, C8524d c8524d, long j, List list) {
        return new C8708o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i, str3, i2, j, list, c8524d, null);
    }

    /* JADX INFO: renamed from: a */
    public static C8708o m21266a(String str, String str2, C8524d c8524d) {
        return new C8708o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, c8524d, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m21267a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final MediaFormat m21268a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f20295f);
        String str = this.f20314y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m21267a(mediaFormat, "max-input-size", this.f20296g);
        m21267a(mediaFormat, "width", this.f20299j);
        m21267a(mediaFormat, "height", this.f20300k);
        float f = this.f20301l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        m21267a(mediaFormat, "rotation-degrees", this.f20302m);
        m21267a(mediaFormat, "channel-count", this.f20307r);
        m21267a(mediaFormat, "sample-rate", this.f20308s);
        m21267a(mediaFormat, "encoder-delay", this.f20310u);
        m21267a(mediaFormat, "encoder-padding", this.f20311v);
        for (int i = 0; i < this.f20297h.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC8673m.m21221a("csd-", i), ByteBuffer.wrap((byte[]) this.f20297h.get(i)));
        }
        C8831c c8831c = this.f20306q;
        if (c8831c != null) {
            m21267a(mediaFormat, "color-transfer", c8831c.f20719c);
            m21267a(mediaFormat, "color-standard", c8831c.f20717a);
            m21267a(mediaFormat, "color-range", c8831c.f20718b);
            byte[] bArr = c8831c.f20720d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: b */
    public final int m21269b() {
        int i;
        int i2 = this.f20299j;
        if (i2 == -1 || (i = this.f20300k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8708o.class == obj.getClass()) {
            C8708o c8708o = (C8708o) obj;
            if (this.f20291b == c8708o.f20291b && this.f20296g == c8708o.f20296g && this.f20299j == c8708o.f20299j && this.f20300k == c8708o.f20300k && this.f20301l == c8708o.f20301l && this.f20302m == c8708o.f20302m && this.f20303n == c8708o.f20303n && this.f20304o == c8708o.f20304o && this.f20307r == c8708o.f20307r && this.f20308s == c8708o.f20308s && this.f20309t == c8708o.f20309t && this.f20310u == c8708o.f20310u && this.f20311v == c8708o.f20311v && this.f20312w == c8708o.f20312w && this.f20313x == c8708o.f20313x && AbstractC8827z.m21386a(this.f20290a, c8708o.f20290a) && AbstractC8827z.m21386a(this.f20314y, c8708o.f20314y) && this.f20315z == c8708o.f20315z && AbstractC8827z.m21386a(this.f20294e, c8708o.f20294e) && AbstractC8827z.m21386a(this.f20295f, c8708o.f20295f) && AbstractC8827z.m21386a(this.f20292c, c8708o.f20292c) && AbstractC8827z.m21386a(this.f20298i, c8708o.f20298i) && AbstractC8827z.m21386a(this.f20293d, c8708o.f20293d) && AbstractC8827z.m21386a(this.f20306q, c8708o.f20306q) && Arrays.equals(this.f20305p, c8708o.f20305p) && this.f20297h.size() == c8708o.f20297h.size()) {
                for (int i = 0; i < this.f20297h.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f20297h.get(i), (byte[]) c8708o.f20297h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20289A == 0) {
            String str = this.f20290a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f20294e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f20295f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f20292c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f20291b) * 31) + this.f20299j) * 31) + this.f20300k) * 31) + this.f20307r) * 31) + this.f20308s) * 31;
            String str5 = this.f20314y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f20315z) * 31;
            C8524d c8524d = this.f20298i;
            int iHashCode6 = (iHashCode5 + (c8524d == null ? 0 : c8524d.hashCode())) * 31;
            C8685b c8685b = this.f20293d;
            this.f20289A = iHashCode6 + (c8685b != null ? Arrays.hashCode(c8685b.f20253a) : 0);
        }
        return this.f20289A;
    }

    public final String toString() {
        return "Format(" + this.f20290a + ", " + this.f20294e + ", " + this.f20295f + ", " + this.f20291b + ", " + this.f20314y + ", [" + this.f20299j + ", " + this.f20300k + ", " + this.f20301l + "], [" + this.f20307r + ", " + this.f20308s + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20290a);
        parcel.writeString(this.f20294e);
        parcel.writeString(this.f20295f);
        parcel.writeString(this.f20292c);
        parcel.writeInt(this.f20291b);
        parcel.writeInt(this.f20296g);
        parcel.writeInt(this.f20299j);
        parcel.writeInt(this.f20300k);
        parcel.writeFloat(this.f20301l);
        parcel.writeInt(this.f20302m);
        parcel.writeFloat(this.f20303n);
        parcel.writeInt(this.f20305p != null ? 1 : 0);
        byte[] bArr = this.f20305p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f20304o);
        parcel.writeParcelable(this.f20306q, i);
        parcel.writeInt(this.f20307r);
        parcel.writeInt(this.f20308s);
        parcel.writeInt(this.f20309t);
        parcel.writeInt(this.f20310u);
        parcel.writeInt(this.f20311v);
        parcel.writeInt(this.f20313x);
        parcel.writeString(this.f20314y);
        parcel.writeInt(this.f20315z);
        parcel.writeLong(this.f20312w);
        int size = this.f20297h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f20297h.get(i2));
        }
        parcel.writeParcelable(this.f20298i, 0);
        parcel.writeParcelable(this.f20293d, 0);
    }
}
