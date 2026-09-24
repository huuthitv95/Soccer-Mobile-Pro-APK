package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnz extends zzhoq {
    private final int zza;
    private final int zzb;
    private final zzhny zzc;

    /* synthetic */ zzhnz(int i, int i2, zzhny zzhnyVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhnyVar;
    }

    public static zzhnx zzb() {
        return new zzhnx(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnz)) {
            return false;
        }
        zzhnz zzhnzVar = (zzhnz) obj;
        return zzhnzVar.zza == this.zza && zzhnzVar.zze() == zze() && zzhnzVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhnz.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = String.valueOf(strValueOf).length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzc != zzhny.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhny zzhnyVar = this.zzc;
        if (zzhnyVar == zzhny.zzd) {
            return this.zzb;
        }
        if (zzhnyVar == zzhny.zza || zzhnyVar == zzhny.zzb || zzhnyVar == zzhny.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhny zzf() {
        return this.zzc;
    }
}
