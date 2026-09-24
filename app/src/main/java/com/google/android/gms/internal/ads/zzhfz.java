package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfz extends zzhel {
    private final int zza;
    private final zzhfy zzb;

    /* synthetic */ zzhfz(int i, zzhfy zzhfyVar, byte[] bArr) {
        this.zza = i;
        this.zzb = zzhfyVar;
    }

    public static zzhfx zzb() {
        return new zzhfx(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhfz)) {
            return false;
        }
        zzhfz zzhfzVar = (zzhfz) obj;
        return zzhfzVar.zza == this.zza && zzhfzVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhfz.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = String.valueOf(strValueOf).length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzb != zzhfy.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhfy zzd() {
        return this.zzb;
    }
}
