package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgz extends zzhel {
    private final zzhgy zza;
    private final String zzb;
    private final zzhgx zzc;
    private final zzhel zzd;

    /* synthetic */ zzhgz(zzhgy zzhgyVar, String str, zzhgx zzhgxVar, zzhel zzhelVar, byte[] bArr) {
        this.zza = zzhgyVar;
        this.zzb = str;
        this.zzc = zzhgxVar;
        this.zzd = zzhelVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgz)) {
            return false;
        }
        zzhgz zzhgzVar = (zzhgz) obj;
        return zzhgzVar.zzc.equals(this.zzc) && zzhgzVar.zzd.equals(this.zzd) && zzhgzVar.zzb.equals(this.zzb) && zzhgzVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzhgz.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzhgy zzhgyVar = this.zza;
        zzhel zzhelVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhelVar);
        String strValueOf3 = String.valueOf(zzhgyVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + String.valueOf(strValueOf2).length() + 11 + String.valueOf(strValueOf3).length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(strValueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(strValueOf2);
        sb.append(", variant: ");
        sb.append(strValueOf3);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhgy.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzhgy zzc() {
        return this.zza;
    }

    public final zzhel zzd() {
        return this.zzd;
    }
}
