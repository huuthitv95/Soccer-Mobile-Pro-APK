package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhon extends zzhoq {
    private final int zza;
    private final int zzb;
    private final zzhom zzc;
    private final zzhol zzd;

    /* synthetic */ zzhon(int i, int i2, zzhom zzhomVar, zzhol zzholVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhomVar;
        this.zzd = zzholVar;
    }

    public static zzhok zzb() {
        return new zzhok(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhon)) {
            return false;
        }
        zzhon zzhonVar = (zzhon) obj;
        return zzhonVar.zza == this.zza && zzhonVar.zze() == zze() && zzhonVar.zzc == this.zzc && zzhonVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhon.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhol zzholVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzholVar);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int i = this.zzb;
        int length3 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        sb.append("HMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzc != zzhom.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhom zzhomVar = this.zzc;
        if (zzhomVar == zzhom.zzd) {
            return this.zzb;
        }
        if (zzhomVar == zzhom.zza || zzhomVar == zzhom.zzb || zzhomVar == zzhom.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhom zzf() {
        return this.zzc;
    }

    public final zzhol zzg() {
        return this.zzd;
    }
}
