package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhvd extends zzhxb {
    private final zzhvb zza;
    private final zzhvc zzb;

    private zzhvd(zzhvb zzhvbVar, zzhvc zzhvcVar) {
        this.zza = zzhvbVar;
        this.zzb = zzhvcVar;
    }

    public static zzhvd zzb(zzhvb zzhvbVar, zzhvc zzhvcVar) {
        return new zzhvd(zzhvbVar, zzhvcVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvd)) {
            return false;
        }
        zzhvd zzhvdVar = (zzhvd) obj;
        return zzhvdVar.zza == this.zza && zzhvdVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhvd.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 47 + string2.length() + 1);
        sb.append("ML-DSA Parameters (ML-DSA instance: ");
        sb.append(string);
        sb.append(", variant: ");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdt
    public final boolean zza() {
        return this.zzb != zzhvc.zzb;
    }
}
