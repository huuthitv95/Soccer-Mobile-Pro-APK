package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhuj extends zzhxb {
    private final zzhuh zza;
    private final zzhuf zzb;
    private final zzhug zzc;
    private final zzhui zzd;

    /* synthetic */ zzhuj(zzhuh zzhuhVar, zzhuf zzhufVar, zzhug zzhugVar, zzhui zzhuiVar, byte[] bArr) {
        this.zza = zzhuhVar;
        this.zzb = zzhufVar;
        this.zzc = zzhugVar;
        this.zzd = zzhuiVar;
    }

    public static zzhue zzb() {
        return new zzhue(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhuj)) {
            return false;
        }
        zzhuj zzhujVar = (zzhuj) obj;
        return zzhujVar.zza == this.zza && zzhujVar.zzb == this.zzb && zzhujVar.zzc == this.zzc && zzhujVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhuj.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        sb.append("ECDSA Parameters (variant: ");
        sb.append(string);
        sb.append(", hashType: ");
        sb.append(string2);
        sb.append(", encoding: ");
        sb.append(string3);
        sb.append(", curve: ");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzd != zzhui.zzd;
    }

    public final zzhuh zzc() {
        return this.zza;
    }

    public final zzhuf zzd() {
        return this.zzb;
    }

    public final zzhug zze() {
        return this.zzc;
    }

    public final zzhui zzf() {
        return this.zzd;
    }
}
