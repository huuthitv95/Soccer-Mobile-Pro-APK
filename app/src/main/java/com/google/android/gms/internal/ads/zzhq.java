package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhq implements zzhi {
    private zzih zzb;
    private String zzc;
    private boolean zzf;
    private final zzib zza = new zzib();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzhq zzb(String str) {
        this.zzc = str;
        return this;
    }

    public final zzhq zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzhq zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzhq zze(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzhq zzf(zzih zzihVar) {
        this.zzb = zzihVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhu zza() {
        zzhu zzhuVar = new zzhu(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzih zzihVar = this.zzb;
        if (zzihVar != null) {
            zzhuVar.zze(zzihVar);
        }
        return zzhuVar;
    }
}
