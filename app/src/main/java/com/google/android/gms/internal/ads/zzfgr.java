package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfgr implements zzfhk {
    private final zzfhk zza;
    private final zzfhk zzb;
    private final zzfmx zzc;
    private final String zzd;
    private zzdbn zze;
    private final Executor zzf;

    public zzfgr(zzfhk zzfhkVar, zzfhk zzfhkVar2, zzfmx zzfmxVar, String str, Executor executor) {
        this.zza = zzfhkVar;
        this.zzb = zzfhkVar2;
        this.zzc = zzfmxVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfmk zzfmkVar, zzfhl zzfhlVar) {
        zzdbn zzdbnVar = zzfmkVar.zza;
        this.zze = zzdbnVar;
        if (zzfmkVar.zzc != null) {
            if (zzdbnVar.zzc() != null) {
                zzfmkVar.zzc.zzp().zzv(zzfmkVar.zza.zzc());
            }
            return zzhbi.zza(zzfmkVar.zzc);
        }
        zzdbnVar.zza().zzh(zzfmkVar.zzb);
        return ((zzfhb) this.zza).zzb(zzfhlVar, null, zzfmkVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdbn zzd() {
        return this.zze;
    }

    public final synchronized ListenableFuture zzb(final zzfhl zzfhlVar, final zzfhj zzfhjVar, zzdbn zzdbnVar) {
        zzdbm zzdbmVarZza = zzfhjVar.zza(zzfhlVar.zzb);
        zzdbmVarZza.zzi(new zzfgs(this.zzd));
        final zzdbn zzdbnVar2 = (zzdbn) zzdbmVarZza.zzh();
        zzdbnVar2.zzb();
        zzdbnVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzdbnVar2.zzb().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            zzfkm zzfkmVarZzb = zzdbnVar2.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzfkmVarZzb.zzd;
            String str = zzfkmVarZzb.zzg;
            com.google.android.gms.ads.internal.client.zzx zzxVar = zzfkmVarZzb.zzk;
            Executor executor = this.zzf;
            final zzfgq zzfgqVar = new zzfgq(zzfhjVar, zzfhlVar, zzmVar2, str, executor, zzxVar, null);
            return (zzhba) zzhbi.zzj(zzhba.zzw(((zzfgx) this.zzb).zza(zzfhlVar, zzfhjVar, zzdbnVar2)), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfgp
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zze(zzfhlVar, zzfgqVar, zzfhjVar, zzdbnVar2, (zzfgw) obj);
                }
            }, executor);
        }
        this.zze = zzdbnVar2;
        return ((zzfhb) this.zza).zzb(zzfhlVar, zzfhjVar, zzdbnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfhl zzfhlVar, zzfhj zzfhjVar, Object obj) {
        return zzb(zzfhlVar, zzfhjVar, null);
    }

    final /* synthetic */ ListenableFuture zze(zzfhl zzfhlVar, zzfgq zzfgqVar, zzfhj zzfhjVar, zzdbn zzdbnVar, zzfgw zzfgwVar) {
        if (zzfgwVar != null) {
            zzfgq zzfgqVar2 = new zzfgq(zzfgqVar.zza, zzfgqVar.zzb, zzfgqVar.zzc, zzfgqVar.zzd, zzfgqVar.zze, zzfgqVar.zzf, zzfgwVar.zza);
            zzfmk zzfmkVar = zzfgwVar.zzc;
            if (zzfmkVar != null) {
                this.zze = null;
                this.zzc.zza(zzfgqVar2);
                return zzg(zzfmkVar, zzfhlVar);
            }
            zzfmx zzfmxVar = this.zzc;
            ListenableFuture listenableFutureZzb = zzfmxVar.zzb(zzfgqVar2);
            if (listenableFutureZzb != null) {
                this.zze = null;
                return zzhbi.zzj(listenableFutureZzb, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfgo
                    @Override // com.google.android.gms.internal.ads.zzhaq
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zzf((zzfmt) obj);
                    }
                }, this.zzf);
            }
            zzfmxVar.zza(zzfgqVar2);
            zzfhlVar = new zzfhl(zzfhlVar.zzb, zzfgwVar.zzb);
        }
        ListenableFuture listenableFutureZzb2 = ((zzfhb) this.zza).zzb(zzfhlVar, zzfhjVar, zzdbnVar);
        this.zze = zzdbnVar;
        return listenableFutureZzb2;
    }

    final /* synthetic */ ListenableFuture zzf(zzfmt zzfmtVar) throws zzedr {
        zzfmk zzfmkVar;
        zzfmv zzfmvVar;
        if (zzfmtVar == null || (zzfmkVar = zzfmtVar.zza) == null || (zzfmvVar = zzfmtVar.zzb) == null) {
            throw new zzedr(1, "Empty prefetch");
        }
        zzbhj.zzb.zzc zzcVarZzs = zzbhj.zzb.zzs();
        zzbhj.zzb.zza.C15495zza c15495zzaZzs = zzbhj.zzb.zza.zzs();
        c15495zzaZzs.zzc(zzbhj.zzb.zzd.IN_MEMORY);
        c15495zzaZzs.zzg(zzbhj.zzb.zze.zzs());
        zzcVarZzs.zzh(c15495zzaZzs);
        zzfmkVar.zza.zza().zzd().zzl(zzcVarZzs.zzbu());
        return zzg(zzfmkVar, ((zzfgq) zzfmvVar).zzb);
    }
}
