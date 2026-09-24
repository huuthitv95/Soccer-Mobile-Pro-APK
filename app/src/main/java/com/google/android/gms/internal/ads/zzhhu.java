package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhhu extends zzhel {
    private final zzhht zza;
    private final int zzb;

    private zzhhu(zzhht zzhhtVar, int i) {
        this.zza = zzhhtVar;
        this.zzb = i;
    }

    public static zzhhu zzb(zzhht zzhhtVar, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhhu(zzhhtVar, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhu)) {
            return false;
        }
        zzhhu zzhhuVar = (zzhhu) obj;
        return zzhhuVar.zza == this.zza && zzhhuVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhhu.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(string);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zza != zzhht.zzb;
    }

    public final zzhht zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
