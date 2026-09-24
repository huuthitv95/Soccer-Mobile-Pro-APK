package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfh extends zzhel {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhfg zzd;

    /* synthetic */ zzhfh(int i, int i2, int i3, zzhfg zzhfgVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzhfgVar;
    }

    public static zzhff zzb() {
        return new zzhff(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhfh)) {
            return false;
        }
        zzhfh zzhfhVar = (zzhfh) obj;
        if (zzhfhVar.zza == this.zza && zzhfhVar.zzb == this.zzb) {
            int i = zzhfhVar.zzc;
            if (zzhfhVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzhfh.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = String.valueOf(strValueOf).length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i2).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte IV, 16-byte tag, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhfg.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhfg zze() {
        return this.zzd;
    }
}
