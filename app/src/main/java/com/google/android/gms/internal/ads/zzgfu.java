package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgfu implements zzgfe {
    private final ExecutorService zza;
    private final zzimc zzb;
    private final zzimc zzc;
    private final zzgop zzd;
    private final zzimc zze;
    private final zzimx zzf;
    private final zzgco zzg;

    zzgfu(ExecutorService executorService, zzimc zzimcVar, zzimc zzimcVar2, zzgop zzgopVar, zzimc zzimcVar3, zzimx zzimxVar, zzgco zzgcoVar) {
        this.zza = executorService;
        this.zzb = zzimcVar;
        this.zzc = zzimcVar2;
        this.zzd = zzgopVar;
        this.zze = zzimcVar3;
        this.zzf = zzimxVar;
        this.zzg = zzgcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final String zza() {
        return "1.869425873";
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzb() {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgft
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzc(Context context) {
        zzggk zzggkVarZzh = ((zzggk) this.zzf.zzb()).zzh(context);
        zzggkVarZzh.zzd(this.zzd.zzb());
        zzggkVarZzh.zzc(zzayf.zzj());
        zzggkVarZzh.zzb(zzgdl.QUERY);
        return zzggkVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        zzggk zzggkVarZzh = ((zzggk) this.zzf.zzb()).zzh(context);
        zzggkVarZzh.zzg(view);
        zzggkVarZzh.zzf(activity);
        zzggkVarZzh.zze(true != this.zzg.zzh() ? "" : null);
        zzggkVarZzh.zzd(this.zzd.zzc(context, view));
        zzggkVarZzh.zzc(zzayf.zzj());
        zzggkVarZzh.zzb(zzgdl.VIEW);
        return zzggkVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        zzimc zzimcVar = this.zze;
        Map mapZzd = this.zzd.zzd();
        ((zzggc) zzimcVar.zzb()).zzb(mapZzd);
        zzggk zzggkVarZzh = ((zzggk) this.zzf.zzb()).zzh(context);
        zzggkVarZzh.zzg(view);
        zzggkVarZzh.zzf(null);
        zzggkVarZzh.zze(str);
        zzggkVarZzh.zzd(mapZzd);
        zzggkVarZzh.zzb(zzgdl.CLICK);
        zzggkVarZzh.zzc(zzayf.zzj());
        return zzggkVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzggc) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final int zzg() {
        return 2;
    }

    final /* synthetic */ Void zzh() {
        ((zzggn) this.zzc.zzb()).zza();
        ((zzghg) this.zzb.zzb()).zza();
        return null;
    }
}
