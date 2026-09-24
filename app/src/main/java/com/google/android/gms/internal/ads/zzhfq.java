package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfq extends zzhel {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhfp zzd;

    /* synthetic */ zzhfq(int i, int i2, int i3, zzhfp zzhfpVar, byte[] bArr) {
        this.zza = i;
        this.zzd = zzhfpVar;
    }

    public static zzhfo zzb() {
        return new zzhfo(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhfq)) {
            return false;
        }
        zzhfq zzhfqVar = (zzhfq) obj;
        if (zzhfqVar.zza == this.zza) {
            int i = zzhfqVar.zzb;
            int i2 = zzhfqVar.zzc;
            if (zzhfqVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzhfq.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhfp.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhfp zzd() {
        return this.zzd;
    }
}
