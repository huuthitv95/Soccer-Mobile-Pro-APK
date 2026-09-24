package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhib extends zzhel {
    private final zzhia zza;

    private zzhib(zzhia zzhiaVar) {
        this.zza = zzhiaVar;
    }

    public static zzhib zzb(zzhia zzhiaVar) {
        return new zzhib(zzhiaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhib) && ((zzhib) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhib.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 40);
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhia.zzc;
    }

    public final zzhia zzc() {
        return this.zza;
    }
}
