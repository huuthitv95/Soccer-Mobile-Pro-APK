package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaab extends zzaai implements Comparable {
    private final int zze;
    private final int zzf;

    public zzaab(int i, zzbg zzbgVar, int i2, zzaae zzaaeVar, int i3) {
        super(i, zzbgVar, i2);
        this.zze = zzmw.CC.zzac(i3, zzaaeVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaab zzaabVar) {
        return Integer.compare(this.zzf, zzaabVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        return false;
    }
}
