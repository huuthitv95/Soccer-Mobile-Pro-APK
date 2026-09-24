package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwr extends zzhxb {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhwq zzd;
    private final zzhwp zze;
    private final zzhwp zzf;
    private final int zzg;

    /* synthetic */ zzhwr(int i, BigInteger bigInteger, zzhwq zzhwqVar, zzhwp zzhwpVar, zzhwp zzhwpVar2, int i2, byte[] bArr) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzhwqVar;
        this.zze = zzhwpVar;
        this.zzf = zzhwpVar2;
        this.zzg = i2;
    }

    public static zzhwo zzb() {
        return new zzhwo(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwr)) {
            return false;
        }
        zzhwr zzhwrVar = (zzhwr) obj;
        return zzhwrVar.zzb == this.zzb && Objects.equals(zzhwrVar.zzc, this.zzc) && Objects.equals(zzhwrVar.zzd, this.zzd) && Objects.equals(zzhwrVar.zze, this.zze) && Objects.equals(zzhwrVar.zzf, this.zzf) && zzhwrVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzhwr.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhwp zzhwpVar = this.zzf;
        zzhwp zzhwpVar2 = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhwpVar2);
        String strValueOf3 = String.valueOf(zzhwpVar);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int i = this.zzg;
        int length4 = String.valueOf(i).length();
        int length5 = String.valueOf(strValueOf4).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i2).length() + 13);
        sb.append("RSA SSA PSS Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", signature hashType: ");
        sb.append(strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i2);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhwq.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhwq zze() {
        return this.zzd;
    }

    public final zzhwp zzf() {
        return this.zze;
    }

    public final zzhwp zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}
