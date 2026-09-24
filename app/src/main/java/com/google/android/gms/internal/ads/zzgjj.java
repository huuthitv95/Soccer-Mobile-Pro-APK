package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgjj implements zzgfe {
    private final zzimc zza;
    private final zzimc zzb;
    private final zzimc zzc;
    private final boolean zzd;
    private final long zze;

    zzgjj(zzimc zzimcVar, zzimc zzimcVar2, zzimc zzimcVar3, boolean z, long j) {
        this.zza = zzimcVar;
        this.zzb = zzimcVar2;
        this.zzc = zzimcVar3;
        this.zzd = z;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final String zza() {
        return ((zzgko) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzb() {
        if (this.zzd) {
            return (zzhba) zzhbi.zzj((zzhba) zzhbi.zzj((zzhba) zzhbi.zzg(zzhba.zzw(((zzgkb) this.zza.zzb()).zzb()), Throwable.class, zzgjf.zza, zzhbz.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgjg
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzj((zzgka) obj);
                }
            }, zzhbz.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgjh
                @Override // com.google.android.gms.internal.ads.zzhaq
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzk((Boolean) obj);
                }
            }, zzhbz.zza());
        }
        zzhba zzhbaVar = (zzhba) zzhbi.zzj((zzhba) zzhbi.zzg(zzhba.zzw(((zzgmi) this.zzc.zzb()).zza()), Throwable.class, zzgji.zza, zzhbz.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgjd
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh((Boolean) obj);
            }
        }, zzhbz.zza());
        zzhbaVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgje
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        }, zzhbz.zza());
        return zzhbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzc(Context context) {
        return ((zzgko) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        return ((zzgko) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        return ((zzgko) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final void zzf(InputEvent inputEvent) {
        ((zzgko) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final int zzg() {
        return ((zzgko) this.zzb.zzb()).zzg();
    }

    final /* synthetic */ ListenableFuture zzh(Boolean bool) {
        return ((zzgko) this.zzb.zzb()).zzb();
    }

    final /* synthetic */ void zzi() {
        ((zzgkb) this.zza.zzb()).zza(this.zze);
    }

    final /* synthetic */ ListenableFuture zzj(zzgka zzgkaVar) {
        return ((zzgmi) this.zzc.zzb()).zza();
    }

    final /* synthetic */ ListenableFuture zzk(Boolean bool) {
        return ((zzgko) this.zzb.zzb()).zzb();
    }
}
