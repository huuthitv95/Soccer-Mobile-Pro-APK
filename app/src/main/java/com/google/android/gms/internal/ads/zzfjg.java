package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfjg implements zzetg {
    private final Context zza;
    private final Executor zzb;
    private final zzcmx zzc;
    private final zzfix zzd;
    private final zzfhk zze;
    private final zzfkf zzf;
    private final zzfpv zzg;
    private final zzfkl zzh;
    private ListenableFuture zzi;

    public zzfjg(Context context, Executor executor, zzcmx zzcmxVar, zzfhk zzfhkVar, zzfix zzfixVar, zzfkl zzfklVar, zzfkf zzfkfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmxVar;
        this.zze = zzfhkVar;
        this.zzd = zzfixVar;
        this.zzh = zzfklVar;
        this.zzf = zzfkfVar;
        this.zzg = zzcmxVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzdve zze(zzfhi zzfhiVar) {
        zzdve zzdveVarZzp = this.zzc.zzp();
        zzdbo zzdboVar = new zzdbo();
        zzdboVar.zza(this.zza);
        zzdboVar.zzb(((zzfjf) zzfhiVar).zza);
        zzdboVar.zzf(this.zzf);
        zzdveVarZzp.zzd(zzdboVar.zze());
        zzdveVarZzp.zze(new zzdie().zzn());
        return zzdveVarZzp;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzete zzeteVar, zzetf zzetfVar) throws RemoteException {
        zzfps zzfpsVar;
        zzcbk zzcbkVar = new zzcbk(zzmVar, str);
        String str2 = zzcbkVar.zzb;
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfje
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            zzfhk zzfhkVar = this.zze;
            if (zzfhkVar.zzd() != null) {
                zzfps zzfpsVarZzd = ((zzdvf) zzfhkVar.zzd()).zzd();
                zzfpsVarZzd.zzi(5);
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzcbkVar.zza;
                zzfpsVarZzd.zzc(zzmVar2.zzp);
                zzfpsVarZzd.zzd(zzmVar2.zzm);
                zzfpsVar = zzfpsVarZzd;
            } else {
                zzfpsVar = null;
            }
        } else {
            zzfpsVar = null;
        }
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzcbkVar.zza;
        boolean z = zzmVar3.zzf;
        zzflj.zzb(context, z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkm)).booleanValue() && z) {
            this.zzc.zzw().zzc(true);
        }
        Bundle bundleZza = zzdyk.zza(new Pair(zzdyi.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar3.zzz)), new Pair(zzdyi.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfkl zzfklVar = this.zzh;
        zzfklVar.zzg(str2);
        zzfklVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzc());
        zzfklVar.zza(zzmVar3);
        zzfklVar.zzv(bundleZza);
        zzfkm zzfkmVarZzA = zzfklVar.zzA();
        zzfpi zzfpiVarZzo = zzfpi.CC.zzo(context, zzfpr.zzg(zzfkmVarZzA), 5, zzmVar3);
        zzfjf zzfjfVar = new zzfjf(null);
        zzfjfVar.zza = zzfkmVarZzA;
        ListenableFuture listenableFutureZzc = this.zze.zzc(new zzfhl(zzfjfVar, null), new zzfhj() { // from class: com.google.android.gms.internal.ads.zzfjd
            @Override // com.google.android.gms.internal.ads.zzfhj
            public final /* synthetic */ zzdbm zza(zzfhi zzfhiVar) {
                return this.zza.zzd(zzfhiVar);
            }
        }, null);
        this.zzi = listenableFutureZzc;
        zzhbi.zzr(listenableFutureZzc, new zzfjc(this, zzetfVar, zzfpsVar, zzfpiVarZzo, zzfjfVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zzb() {
        throw null;
    }

    final /* synthetic */ void zzc() {
        this.zzd.zzdJ(zzflo.zzd(6, null, null));
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzfix zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzfhk zzh() {
        return this.zze;
    }

    final /* synthetic */ zzfpv zzi() {
        return this.zzg;
    }

    final void zzj(int i) {
        this.zzh.zzj().zza(i);
    }
}
