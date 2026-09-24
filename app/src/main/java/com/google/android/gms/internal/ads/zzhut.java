package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhut extends zzhxb {
    private final zzhus zza;

    private zzhut(zzhus zzhusVar) {
        this.zza = zzhusVar;
    }

    public static zzhut zzb(zzhus zzhusVar) {
        return new zzhut(zzhusVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhut) && ((zzhut) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhut.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhus.zzd;
    }

    public final zzhus zzc() {
        return this.zza;
    }
}
