package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzhlo implements zzhdd {
    final String zza;
    final Class zzb;
    final zzhse zzc;

    zzhlo(String str, Class cls, zzhse zzhseVar, zzifk zzifkVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzhseVar;
    }

    public static zzhdd zze(String str, Class cls, zzhse zzhseVar, zzifk zzifkVar) {
        return new zzhlo(str, cls, zzhseVar, zzifkVar);
    }

    public static zzhdu zzf(String str, Class cls, zzifk zzifkVar) {
        return new zzhln(str, cls, zzifkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    public final Object zza(zzicn zzicnVar) throws GeneralSecurityException {
        return zzhmg.zza().zzd(zzhmj.zza().zzg(zzhne.zza(this.zza, zzicnVar, this.zzc, zzhtb.RAW, null), zzhda.zza()), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    public final zzhsf zzd(zzicn zzicnVar) throws GeneralSecurityException {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza(this.zza);
        zzhshVarZze.zzb(zzicnVar);
        zzhshVarZze.zzc(zzhtb.RAW);
        zzhne zzhneVar = (zzhne) zzhmj.zza().zzh(zzhma.zza().zzc(zzhmj.zza().zzj(zzhnf.zzb((zzhsi) zzhshVarZze.zzbu())), null), zzhne.class, zzhda.zza());
        zzhsd zzhsdVarZzd = zzhsf.zzd();
        zzhsdVarZzd.zza(zzhneVar.zzg());
        zzhsdVarZzd.zzb(zzhneVar.zzb());
        zzhsdVarZzd.zzc(zzhneVar.zzc());
        return (zzhsf) zzhsdVarZzd.zzbu();
    }
}
