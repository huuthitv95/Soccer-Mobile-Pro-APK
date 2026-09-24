package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhvx implements zzhnd {
    private static final zzhvx zza = new zzhvx();
    private static final zzhmx zzb = zzhmx.zzd(zzhvu.zza, zzhlr.class, zzhdv.class);

    zzhvx() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzhmg.zza().zzc(zza);
        zzhmg.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zza() {
        return zzhdv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zzb() {
        return zzhdv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final /* bridge */ /* synthetic */ Object zze(zzhdo zzhdoVar, zzhnc zzhncVar) throws GeneralSecurityException {
        zzhlu zzhluVar = (zzhlu) zzhdoVar.zzf(zzhlu.class);
        zzhlv zzhlvVarZza = (zzhluVar == null || zzhluVar.zza()) ? zzhly.zza : zzhme.zza().zzb().zza(zzhdoVar, zzhluVar, "public_key_sign", "sign");
        zzhdn zzhdnVar = (zzhdn) zzhdoVar;
        return new zzhvw(new zzhvv((zzhdv) zzhncVar.zza(zzhdnVar.zzc()), zzhdnVar.zzc().zzc()), zzhlvVarZza);
    }
}
