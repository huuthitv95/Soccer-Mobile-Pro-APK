package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfro {
    private final Context zza;
    private final Executor zzb;
    private final zzhbt zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfrg zze;
    private final zzfpv zzf;
    private final zzcmu zzg;

    zzfro(Context context, Executor executor, zzhbt zzhbtVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfrg zzfrgVar, zzfpv zzfpvVar, zzcmu zzcmuVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzhbtVar;
        this.zzd = zzuVar;
        this.zze = zzfrgVar;
        this.zzf = zzfpvVar;
        this.zzg = zzcmuVar;
    }

    public final void zza(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfps zzfpsVar, zzdeu zzdeuVar) {
        ListenableFuture listenableFutureZzc;
        zzfpi zzfpiVarZzn = null;
        if (zzfpv.zza() && ((Boolean) zzbjx.zzd.zze()).booleanValue()) {
            zzfpiVarZzn = zzfpi.CC.zzn(this.zza, 14);
            zzfpiVarZzn.zza();
        }
        if (zzvVar != null) {
            listenableFutureZzc = new zzfrf(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            listenableFutureZzc = this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfrn
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzhbi.zzr(listenableFutureZzc, new zzfrm(this, zzfpiVarZzn, zzfpsVar, zzdeuVar), this.zzb);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkg)).booleanValue() || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzd.zzc(str, null);
        }
        String strZzb = this.zzg.zzb();
        HashMap map = new HashMap();
        if (strZzb != null) {
            map.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkh), strZzb);
        }
        return this.zzd.zzc(str, map);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    final /* synthetic */ zzfpv zze() {
        return this.zzf;
    }
}
