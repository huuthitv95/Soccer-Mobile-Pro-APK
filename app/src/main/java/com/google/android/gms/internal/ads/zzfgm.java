package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfgm implements zzfhk {
    private zzdbn zza;
    private final Executor zzb = zzhbz.zza();

    public final zzdbn zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfhl zzfhlVar, zzfhj zzfhjVar, zzdbn zzdbnVar) {
        zzdbm zzdbmVarZza = zzfhjVar.zza(zzfhlVar.zzb);
        zzdbmVarZza.zzj(new zzfho(true));
        zzdbn zzdbnVar2 = (zzdbn) zzdbmVarZza.zzh();
        this.zza = zzdbnVar2;
        final zzcyl zzcylVarZza = zzdbnVar2.zza();
        final zzfmk zzfmkVar = new zzfmk();
        zzhba zzhbaVarZzw = zzhba.zzw(zzcylVarZza.zzb());
        zzhaq zzhaqVar = new zzhaq(this) { // from class: com.google.android.gms.internal.ads.zzfgl
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzfke zzfkeVar = (zzfke) obj;
                zzfmkVar.zzb = zzfkeVar;
                Iterator it = zzfkeVar.zzb.zza.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfjt) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzhbi.zza(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return zzcylVarZza.zzc(zzhbi.zza(zzfkeVar));
                }
                return zzhbi.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzhba) zzhbi.zzk((zzhba) zzhbi.zzj(zzhbaVarZzw, zzhaqVar, executor), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzfgk
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzfmk zzfmkVar2 = zzfmkVar;
                zzfmkVar2.zzc = (zzcxh) obj;
                return zzfmkVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfhl zzfhlVar, zzfhj zzfhjVar, Object obj) {
        return zzb(zzfhlVar, zzfhjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
