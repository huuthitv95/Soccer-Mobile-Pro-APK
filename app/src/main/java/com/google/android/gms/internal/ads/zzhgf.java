package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgf extends zzhel {
    private final zzhge zza;

    private zzhgf(zzhge zzhgeVar) {
        this.zza = zzhgeVar;
    }

    public static zzhgf zzb(zzhge zzhgeVar) {
        return new zzhgf(zzhgeVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhgf) && ((zzhgf) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhgf.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhge.zzc;
    }

    public final zzhge zzc() {
        return this.zza;
    }
}
