package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzejd implements zzfoz {
    private final zzeir zza;
    private final zzeiv zzb;

    zzejd(zzeir zzeirVar, zzeiv zzeivVar) {
        this.zza = zzeirVar;
        this.zzb = zzeivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdL(zzfos zzfosVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdM(zzfos zzfosVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhh)).booleanValue()) {
            if (zzfos.RENDERER == zzfosVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfos.PRELOADED_LOADER == zzfosVar || zzfos.SERVER_TRANSACTION == zzfosVar) {
                zzeir zzeirVar = this.zza;
                zzeirVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzeiv zzeivVar = this.zzb;
                final long jZzb = zzeirVar.zzb();
                zzeivVar.zza.zza(new zzfny() { // from class: com.google.android.gms.internal.ads.zzeiu
                    @Override // com.google.android.gms.internal.ads.zzfny
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeivVar.zzf()) {
                            return null;
                        }
                        long j = jZzb;
                        zzbhj.zzaf.zza.C15494zza c15494zzaZzz = zzbhj.zzaf.zza.zzz();
                        c15494zzaZzz.zzad(j);
                        byte[] bArrZzaN = c15494zzaZzz.zzbu().zzaN();
                        zzejc.zzf(sQLiteDatabase, false, false);
                        zzejc.zze(sQLiteDatabase, j, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdN(zzfos zzfosVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhh)).booleanValue() && zzfos.RENDERER == zzfosVar) {
            zzeir zzeirVar = this.zza;
            if (zzeirVar.zzh() != 0) {
                zzeirVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzeirVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoz
    public final void zzdO(zzfos zzfosVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhh)).booleanValue() && zzfos.RENDERER == zzfosVar) {
            zzeir zzeirVar = this.zza;
            if (zzeirVar.zzh() != 0) {
                zzeirVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzeirVar.zzh());
            }
        }
    }
}
