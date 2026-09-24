package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfmc implements zzfmb {
    private final ConcurrentHashMap zza;
    private final zzfmi zzb;
    private final zzfme zzc = new zzfme();

    public zzfmc(zzfmi zzfmiVar) {
        this.zza = new ConcurrentHashMap(zzfmiVar.zzd);
        this.zzb = zzfmiVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfmi> creator = zzfmi.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhn)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfmi zzfmiVar = this.zzb;
            sb.append(zzfmiVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfml) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfma) entry.getValue()).zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int iZzc = ((zzfma) entry.getValue()).zzc(); iZzc < zzfmiVar.zzd; iZzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfma) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzfmiVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String string = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final synchronized zzfmk zza(zzfml zzfmlVar) {
        zzfmk zzfmkVarZzb;
        zzfma zzfmaVar = (zzfma) this.zza.get(zzfmlVar);
        if (zzfmaVar != null) {
            zzfmkVarZzb = zzfmaVar.zzb();
            if (zzfmkVarZzb == null) {
                this.zzc.zzb();
            }
            zzfmy zzfmyVarZzh = zzfmaVar.zzh();
            if (zzfmkVarZzb != null) {
                zzbhj.zzb.zzc zzcVarZzs = zzbhj.zzb.zzs();
                zzbhj.zzb.zza.C15495zza c15495zzaZzs = zzbhj.zzb.zza.zzs();
                c15495zzaZzs.zzc(zzbhj.zzb.zzd.IN_MEMORY);
                zzbhj.zzb.zze.zza zzaVarZzq = zzbhj.zzb.zze.zzq();
                zzaVarZzq.zzc(zzfmyVarZzh.zza);
                zzaVarZzq.zzg(zzfmyVarZzh.zzb);
                c15495zzaZzs.zzh(zzaVarZzq);
                zzcVarZzs.zzh(c15495zzaZzs);
                zzfmkVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzfmkVarZzb = null;
        }
        return zzfmkVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final synchronized boolean zzb(zzfml zzfmlVar, zzfmk zzfmkVar) {
        boolean zZza;
        ConcurrentHashMap concurrentHashMap = this.zza;
        zzfma zzfmaVar = (zzfma) concurrentHashMap.get(zzfmlVar);
        zzfmkVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (zzfmaVar == null) {
            zzfmi zzfmiVar = this.zzb;
            zzfma zzfmaVar2 = new zzfma(zzfmiVar.zzd, zzfmiVar.zze * 1000);
            if (concurrentHashMap.size() == zzfmiVar.zzc) {
                int i = zzfmiVar.zzg;
                int i2 = i - 1;
                zzfml zzfmlVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long jZzd = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((zzfma) entry.getValue()).zzd() < jZzd) {
                            jZzd = ((zzfma) entry.getValue()).zzd();
                            zzfmlVar2 = (zzfml) entry.getKey();
                        }
                    }
                    if (zzfmlVar2 != null) {
                        concurrentHashMap.remove(zzfmlVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        if (((zzfma) entry2.getValue()).zze() < jZzd) {
                            jZzd = ((zzfma) entry2.getValue()).zze();
                            zzfmlVar2 = (zzfml) entry2.getKey();
                        }
                    }
                    if (zzfmlVar2 != null) {
                        concurrentHashMap.remove(zzfmlVar2);
                    }
                } else if (i2 == 2) {
                    int iZzf = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                        if (((zzfma) entry3.getValue()).zzf() < iZzf) {
                            iZzf = ((zzfma) entry3.getValue()).zzf();
                            zzfmlVar2 = (zzfml) entry3.getKey();
                        }
                    }
                    if (zzfmlVar2 != null) {
                        concurrentHashMap.remove(zzfmlVar2);
                    }
                }
                this.zzc.zzd();
            }
            concurrentHashMap.put(zzfmlVar, zzfmaVar2);
            this.zzc.zzc();
            zzfmaVar = zzfmaVar2;
        }
        zZza = zzfmaVar.zza(zzfmkVar);
        zzfme zzfmeVar = this.zzc;
        zzfmeVar.zze();
        zzfmd zzfmdVarZzf = zzfmeVar.zzf();
        zzfmy zzfmyVarZzh = zzfmaVar.zzh();
        if (zzfmkVar != null) {
            zzbhj.zzb.zzc zzcVarZzs = zzbhj.zzb.zzs();
            zzbhj.zzb.zza.C15495zza c15495zzaZzs = zzbhj.zzb.zza.zzs();
            c15495zzaZzs.zzc(zzbhj.zzb.zzd.IN_MEMORY);
            zzbhj.zzb.zzg.zza zzaVarZzs = zzbhj.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzfmdVarZzf.zza);
            zzaVarZzs.zzg(zzfmdVarZzf.zzb);
            zzaVarZzs.zzk(zzfmyVarZzh.zzb);
            c15495zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c15495zzaZzs);
            zzfmkVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
        }
        zzf();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final synchronized boolean zzc(zzfml zzfmlVar) {
        zzfma zzfmaVar = (zzfma) this.zza.get(zzfmlVar);
        if (zzfmaVar == null) {
            return true;
        }
        return zzfmaVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    @Deprecated
    public final zzfml zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfmi zzfmiVar = this.zzb;
        return new zzfmm(zzmVar, str, new zzcau(zzfmiVar.zza).zza().zzj, zzfmiVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final zzfmi zze() {
        return this.zzb;
    }
}
