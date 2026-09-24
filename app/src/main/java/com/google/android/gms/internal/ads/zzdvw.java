package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdvw {
    private final Context zza;
    private final zzbai zzb;
    private final zzbjl zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbhd zzf;
    private final zzdfg zzg;
    private final zzekf zzh;
    private final zzfkq zzi;
    private final zzdyz zzj;
    private final zzcmh zzk;

    public zzdvw(zzcky zzckyVar, Context context, zzbai zzbaiVar, zzbjl zzbjlVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbhd zzbhdVar, zzdfg zzdfgVar, zzekf zzekfVar, zzfkq zzfkqVar, zzdyz zzdyzVar, zzcmh zzcmhVar) {
        this.zza = context;
        this.zzb = zzbaiVar;
        this.zzc = zzbjlVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbhdVar;
        this.zzg = zzdfgVar;
        this.zzh = zzekfVar;
        this.zzi = zzfkqVar;
        this.zzj = zzdyzVar;
        this.zzk = zzcmhVar;
    }

    public final zzcki zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfjt zzfjtVar, zzfjw zzfjwVar) throws zzckx {
        zzcms zzcmsVarZza = zzcms.zza(zzrVar);
        String str = zzrVar.zza;
        zzdvl zzdvlVar = new zzdvl(this);
        zzbai zzbaiVar = this.zzb;
        zzekf zzekfVar = this.zzh;
        zzcki zzckiVarZza = zzcky.zza(this.zza, zzcmsVarZza, str, false, false, zzbaiVar, this.zzc, this.zzd, null, zzdvlVar, this.zze, this.zzf, zzfjtVar, zzfjwVar, zzekfVar, this.zzi, this.zzj);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpx)).booleanValue()) {
            this.zzk.zza(zzckiVarZza.zzD());
        }
        return zzckiVarZza;
    }

    final /* synthetic */ zzdfg zzb() {
        return this.zzg;
    }
}
