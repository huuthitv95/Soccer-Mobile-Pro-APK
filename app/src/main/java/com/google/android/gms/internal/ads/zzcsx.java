package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcsx {
    zzbzo zza;
    zzbzo zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzelc zze;
    private final zzdwb zzf;
    private final zzhbs zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcsx(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzelc zzelcVar, zzdwb zzdwbVar, zzhbs zzhbsVar, zzhbs zzhbsVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzelcVar;
        this.zzf = zzdwbVar;
        this.zzg = zzhbsVar;
        this.zzh = zzhbsVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlB));
    }

    private final ListenableFuture zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlB)) || this.zzd.zzx()) {
                return zzhbi.zza(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlC), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzhba) zzhbi.zzh((zzhba) zzhbi.zzj(zzhba.zzw(this.zze.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcsr
                    @Override // com.google.android.gms.internal.ads.zzhaq
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcss
                    @Override // com.google.android.gms.internal.ads.zzhaq
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zzf(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlD), "11");
            return zzhbi.zza(builderBuildUpon.toString());
        } catch (Exception e) {
            return zzhbi.zzc(e);
        }
    }

    public final void zza(String str, zzfro zzfroVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzhbi.zzr(zzhbi.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlH)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcsq(this, zzfroVar, str, zzvVar), this.zzg);
    }

    public final ListenableFuture zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzhbi.zza(str) : zzhbi.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcsw
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ ListenableFuture zzd(String str, final Throwable th) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(th);
            }
        });
        return zzhbi.zza(str);
    }

    final /* synthetic */ ListenableFuture zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlD), "10");
            return zzhbi.zza(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlE), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlD), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlF))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlG));
        }
        return (zzhba) zzhbi.zzj(zzhba.zzw(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzcst
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlD);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzhbi.zza(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlD), "9");
        return zzhbi.zza(builder.toString());
    }

    final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlI)).booleanValue()) {
            zzbzo zzbzoVarZzc = zzbzm.zzc(this.zzc);
            this.zzb = zzbzoVarZzc;
            zzbzoVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbzo zzbzoVarZza = zzbzm.zza(this.zzc);
            this.zza = zzbzoVarZza;
            zzbzoVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlI)).booleanValue()) {
            zzbzo zzbzoVarZzc = zzbzm.zzc(this.zzc);
            this.zzb = zzbzoVarZzc;
            zzbzoVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbzo zzbzoVarZza = zzbzm.zza(this.zzc);
            this.zza = zzbzoVarZza;
            zzbzoVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzhbs zzj() {
        return this.zzg;
    }
}
