package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zznb {
    public static final zznb zza = new zznb(new zzna());
    public final zzgwj zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznb(zzna zznaVar) {
        this.zzb = zznaVar.zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznb)) {
            return false;
        }
        zznb zznbVar = (zznb) obj;
        if (!this.zzb.equals(zznbVar.zzb)) {
            return false;
        }
        boolean z = zznbVar.zzf;
        boolean z2 = zznbVar.zzi;
        Double d = zznbVar.zzc;
        Double d2 = zznbVar.zzd;
        boolean z3 = zznbVar.zze;
        boolean z4 = zznbVar.zzg;
        boolean z5 = zznbVar.zzh;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, true, true, true, true, true);
    }
}
