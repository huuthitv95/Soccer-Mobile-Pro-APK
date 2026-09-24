package com.google.android.gms.internal.ads;

import androidx.core.app.FrameMetricsAggregator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakk {
    public final int zza;
    public final int zzb;
    public final float zzc;

    private zzakk(int i, int i2, float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
    }

    static /* synthetic */ zzakk zza(int i) {
        int i2 = i >> 13;
        if (i2 == 0) {
            return null;
        }
        return new zzakk(i2, (i >> 10) & 7, ((i & FrameMetricsAggregator.EVERY_DURATION) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakk)) {
            return false;
        }
        zzakk zzakkVar = (zzakk) obj;
        return this.zza == zzakkVar.zza && this.zzb == zzakkVar.zzb && Float.compare(this.zzc, zzakkVar.zzc) == 0;
    }

    public final int hashCode() {
        return (((this.zza * 31) + this.zzb) * 31) + Float.floatToIntBits(this.zzc);
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        float f = this.zzc;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f).length() + 1);
        sb.append("GainField{name=");
        sb.append(i);
        sb.append(", originator=");
        sb.append(i2);
        sb.append(", gain=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
