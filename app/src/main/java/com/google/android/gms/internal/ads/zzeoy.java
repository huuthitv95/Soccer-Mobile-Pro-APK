package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeoy implements zzhaq {
    private final zzfoy zza;
    private final zzdch zzb;
    private final zzfrk zzc;
    private final zzfro zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcxk zzg;
    private final zzeor zzh;
    private final zzell zzi;
    private final Context zzj;
    private final zzfps zzk;
    private final zzeob zzl;
    private final zzdyu zzm;

    zzeoy(Context context, zzfoy zzfoyVar, zzeor zzeorVar, zzdch zzdchVar, zzfrk zzfrkVar, zzfro zzfroVar, zzcxk zzcxkVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzell zzellVar, zzfps zzfpsVar, zzeob zzeobVar, zzdyu zzdyuVar) {
        this.zzj = context;
        this.zza = zzfoyVar;
        this.zzh = zzeorVar;
        this.zzb = zzdchVar;
        this.zzc = zzfrkVar;
        this.zzd = zzfroVar;
        this.zzg = zzcxkVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzellVar;
        this.zzk = zzfpsVar;
        this.zzl = zzeobVar;
        this.zzm = zzdyuVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    static String zzb(zzfke zzfkeVar) {
        String string = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgB)).booleanValue() ? "No ad config." : "No fill.";
        zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
        int i = zzfjwVar.zzf;
        if (i == 0) {
            string = str;
        } else if (i >= 200 && i < 300) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgA)).booleanValue()) {
                string = str;
            }
        } else if (i < 300 || i >= 400) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
            sb.append("Received error HTTP response code: ");
            sb.append(i);
            string = sb.toString();
        } else {
            string = "No location header to follow redirect or too many redirects.";
        }
        zzfjv zzfjvVar = zzfjwVar.zzj;
        return zzfjvVar != null ? zzfjvVar.zza() : string;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzfke zzfkeVar = (zzfke) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && (bundle = zzfkeVar.zzb.zzd) != null) {
            this.zzm.zzg(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcO)).booleanValue()) {
            this.zzm.zzf(zzdyi.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String strZzb = zzb(zzfkeVar);
        zzell zzellVar = this.zzi;
        zzfkd zzfkdVar = zzfkeVar.zzb;
        zzfjw zzfjwVar = zzfkdVar.zzb;
        zzellVar.zza(zzfjwVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjA)).booleanValue() && (i = zzfjwVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzhbi.zzc(new zzeov(3, strZzb));
        }
        String str = zzfjwVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzew)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfjt zzfjtVar : zzfkdVar.zza) {
                zzellVar.zzb(zzfjtVar);
                Iterator it = zzfjtVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzellVar.zze(zzfjtVar, 0L, zzflo.zzd(1, null, null));
                        break;
                    }
                    zzelg zzelgVarZza = this.zzg.zza(zzfjtVar.zzb, (String) it.next());
                    if (zzelgVarZza != null && zzelgVarZza.zza(zzfkeVar, zzfjtVar)) {
                        break;
                    }
                }
            }
        } else {
            zzellVar.zzc(str, zzfkdVar.zza);
        }
        zzdch zzdchVar = this.zzb;
        zzctb zzctbVar = new zzctb(zzfkeVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdchVar.zzq(zzctbVar, executor);
        if (zzfjwVar.zzr > 1) {
            return this.zzl.zza(zzfkeVar);
        }
        String strZzb2 = zzb(zzfkeVar);
        zzfoy zzfoyVar = this.zza;
        zzfos zzfosVar = zzfos.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfoyVar);
        zzfof zzfofVarZzi = zzfoj.zza(zzhbi.zzc(new zzeov(3, strZzb2)), zzfosVar, zzfoyVar).zzi();
        final zzeor zzeorVar = this.zzh;
        zzeorVar.zza();
        int i2 = 0;
        for (final zzfjt zzfjtVar2 : zzfkdVar.zza) {
            for (String str2 : zzfjtVar2.zza) {
                final zzelg zzelgVarZza2 = this.zzg.zza(zzfjtVar2.zzb, str2);
                if (zzelgVarZza2 != null && zzelgVarZza2.zza(zzfkeVar, zzfjtVar2)) {
                    zzfop zzfopVarZza = zzfoyVar.zza(zzfos.RENDER_CONFIG_WATERFALL, zzfofVarZzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    zzfofVarZzi = zzfopVarZza.zza(sb.toString()).zzg(Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzeox
                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return this.zza.zzc(zzfjtVar2, zzfkeVar, zzelgVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i2++;
        }
        Objects.requireNonNull(zzeorVar);
        zzfofVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeow
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeorVar.zzb();
            }
        }, executor);
        return zzfofVarZzi;
    }

    final /* synthetic */ ListenableFuture zzc(zzfjt zzfjtVar, zzfke zzfkeVar, zzelg zzelgVar, Throwable th) {
        zzfpi zzfpiVarZzn = zzfpi.CC.zzn(this.zzj, 12);
        zzfpiVarZzn.zzi(zzfjtVar.zzE);
        zzfpiVarZzn.zza();
        ListenableFuture listenableFutureZzi = zzhbi.zzi(zzelgVar.zzb(zzfkeVar, zzfjtVar), zzfjtVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfkeVar, zzfjtVar, listenableFutureZzi, this.zzc);
        zzfpr.zzd(listenableFutureZzi, this.zzk, zzfpiVarZzn);
        return listenableFutureZzi;
    }
}
