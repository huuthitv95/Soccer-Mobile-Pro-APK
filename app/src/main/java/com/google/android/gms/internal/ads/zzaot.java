package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaot implements Comparable {
    public final int zza;
    public final zzaoo zzb;

    public zzaot(int i, zzaoo zzaooVar) {
        this.zza = i;
        this.zzb = zzaooVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzaot) obj).zza);
    }
}
