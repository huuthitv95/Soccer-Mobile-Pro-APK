package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaac implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzaac(zzv zzvVar, int i) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = zzmw.CC.zzac(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaac zzaacVar) {
        return zzgvm.zzg().zzd(this.zzb, zzaacVar.zzb).zzd(this.zza, zzaacVar.zza).zze();
    }
}
