package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfhw implements zzetg {
    private final Context zza;
    private final Executor zzb;
    private final zzcmx zzc;
    private final zzesq zzd;
    private final zzfix zze;
    private zzbiz zzf;
    private final zzfpv zzg;
    private final zzfkl zzh;
    private ListenableFuture zzi;

    public zzfhw(Context context, Executor executor, zzcmx zzcmxVar, zzesq zzesqVar, zzfix zzfixVar, zzfkl zzfklVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmxVar;
        this.zzd = zzesqVar;
        this.zzh = zzfklVar;
        this.zze = zzfixVar;
        this.zzg = zzcmxVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzete zzeteVar, zzetf zzetfVar) {
        zzdmu zzdmuVarZza;
        zzfps zzfpsVarZzc;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkm)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfhp) zzeteVar).zza;
        Bundle bundleZza = zzdyk.zza(new Pair(zzdyi.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdyi.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfkl zzfklVar = this.zzh;
        zzfklVar.zzg(str);
        zzfklVar.zzc(zzrVar);
        zzfklVar.zza(zzmVar);
        zzfklVar.zzv(bundleZza);
        Context context = this.zza;
        zzfkm zzfkmVarZzA = zzfklVar.zzA();
        zzfpi zzfpiVarZzo = zzfpi.CC.zzo(context, zzfpr.zzg(zzfkmVarZzA), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzju)).booleanValue()) {
            zzdmt zzdmtVarZzm = this.zzc.zzm();
            zzdbo zzdboVar = new zzdbo();
            zzdboVar.zza(context);
            zzdboVar.zzb(zzfkmVarZzA);
            zzdmtVarZzm.zze(zzdboVar.zze());
            zzdie zzdieVar = new zzdie();
            zzesq zzesqVar = this.zzd;
            Executor executor = this.zzb;
            zzdieVar.zzm(zzesqVar, executor);
            zzdieVar.zze(zzesqVar, executor);
            zzdmtVarZzm.zzf(zzdieVar.zzn());
            zzdmtVarZzm.zzd(new zzeqw(this.zzf));
            zzdmuVarZza = zzdmtVarZzm.zzh();
        } else {
            zzdie zzdieVar2 = new zzdie();
            zzfix zzfixVar = this.zze;
            if (zzfixVar != null) {
                Executor executor2 = this.zzb;
                zzdieVar2.zza(zzfixVar, executor2);
                zzdieVar2.zzb(zzfixVar, executor2);
                zzdieVar2.zzc(zzfixVar, executor2);
            }
            zzdmt zzdmtVarZzm2 = this.zzc.zzm();
            zzdbo zzdboVar2 = new zzdbo();
            zzdboVar2.zza(context);
            zzdboVar2.zzb(zzfkmVarZzA);
            zzdmtVarZzm2.zze(zzdboVar2.zze());
            zzesq zzesqVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdieVar2.zzm(zzesqVar2, executor3);
            zzdieVar2.zza(zzesqVar2, executor3);
            zzdieVar2.zzb(zzesqVar2, executor3);
            zzdieVar2.zzc(zzesqVar2, executor3);
            zzdieVar2.zzf(zzesqVar2, executor3);
            zzdieVar2.zzg(zzesqVar2, executor3);
            zzdieVar2.zze(zzesqVar2, executor3);
            zzdieVar2.zzk(zzesqVar2, executor3);
            zzdieVar2.zzd(zzesqVar2, executor3);
            zzdmtVarZzm2.zzf(zzdieVar2.zzn());
            zzdmtVarZzm2.zzd(new zzeqw(this.zzf));
            zzdmuVarZza = zzdmtVarZzm2.zzh();
        }
        zzdmu zzdmuVar = zzdmuVarZza;
        if (((Boolean) zzbjx.zzc.zze()).booleanValue()) {
            zzfpsVarZzc = zzdmuVar.zzc();
            zzfpsVarZzc.zzi(4);
            zzfpsVarZzc.zzc(zzmVar.zzp);
            zzfpsVarZzc.zzd(zzmVar.zzm);
        } else {
            zzfpsVarZzc = null;
        }
        zzcyl zzcylVarZzb = zzdmuVar.zzb();
        ListenableFuture listenableFutureZzc = zzcylVarZzb.zzc(zzcylVarZzb.zzb());
        this.zzi = listenableFutureZzc;
        zzhbi.zzr(listenableFutureZzc, new zzfhu(this, zzetfVar, zzfpsVarZzc, zzfpiVarZzo, zzdmuVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    public final void zzc(zzbiz zzbizVar) {
        this.zzf = zzbizVar;
    }

    final /* synthetic */ void zzd() {
        this.zzd.zzdJ(zzflo.zzd(6, null, null));
    }

    final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ zzesq zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfix zzg() {
        return this.zze;
    }

    final /* synthetic */ zzfpv zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(ListenableFuture listenableFuture) {
        this.zzi = null;
    }
}
