package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzduj implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdyz zzc;
    private final zzeju zzd;
    private final Executor zze;
    private final zzbai zzf;
    private final VersionInfoParcel zzg;
    private final zzfro zzh;
    private final zzekf zzi;
    private final zzfkq zzj;

    public zzduj(Context context, Executor executor, zzbai zzbaiVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcky zzckyVar, zzeju zzejuVar, zzfro zzfroVar, zzdyz zzdyzVar, zzekf zzekfVar, zzfkq zzfkqVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzbaiVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzejuVar;
        this.zzh = zzfroVar;
        this.zzc = zzdyzVar;
        this.zzi = zzekfVar;
        this.zzj = zzfkqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdul zzdulVar = new zzdul(this);
        zzdulVar.zza();
        return zzdulVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    final /* synthetic */ zzdyz zzc() {
        return this.zzc;
    }

    final /* synthetic */ zzeju zzd() {
        return this.zzd;
    }

    final /* synthetic */ Executor zze() {
        return this.zze;
    }

    final /* synthetic */ zzbai zzf() {
        return this.zzf;
    }

    final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    final /* synthetic */ zzfro zzh() {
        return this.zzh;
    }

    final /* synthetic */ zzekf zzi() {
        return this.zzi;
    }

    final /* synthetic */ zzfkq zzj() {
        return this.zzj;
    }
}
