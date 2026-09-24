package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhou implements zzhnd {
    private static final zzhou zza = new zzhou();
    private static final zzhmx zzb = zzhmx.zzd(zzhor.zza, zzhlr.class, zzhds.class);

    zzhou() {
    }

    static void zzc() throws GeneralSecurityException {
        zzhmg.zza().zzc(zza);
        zzhmg.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zza() {
        return zzhds.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zzb() {
        return zzhds.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final /* bridge */ /* synthetic */ Object zze(zzhdo zzhdoVar, zzhnc zzhncVar) throws GeneralSecurityException {
        zzhlv zzhlvVar;
        zzhlv zzhlvVarZza;
        zziam zziamVarZzd;
        zzhms zzhmsVar = new zzhms();
        for (int i = 0; i < zzhdoVar.zzd(); i++) {
            zzhdl zzhdlVarZze = ((zzhdn) zzhdoVar).zze(i);
            if (zzhdlVarZze.zzb().equals(zzhde.zza)) {
                zzhds zzhdsVar = (zzhds) zzhncVar.zza(zzhdlVarZze);
                zzhdc zzhdcVarZza = zzhdlVarZze.zza();
                if (zzhdcVarZza instanceof zzhop) {
                    zziamVarZzd = ((zzhop) zzhdcVarZza).zze();
                } else {
                    if (!(zzhdcVarZza instanceof zzhlr)) {
                        String name = zzhdcVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhdcVarZza.zza());
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 59 + String.valueOf(strValueOf).length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(strValueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zziamVarZzd = ((zzhlr) zzhdcVarZza).zzd();
                }
                zzhmsVar.zza(zziamVarZzd, new zzhos(zzhdsVar, zzhdlVarZze.zzc()));
            }
        }
        zzhlu zzhluVar = (zzhlu) zzhdoVar.zzf(zzhlu.class);
        if (zzhluVar == null || zzhluVar.zza()) {
            zzhlvVar = zzhly.zza;
            zzhlvVarZza = zzhlvVar;
        } else {
            zzhlw zzhlwVarZzb = zzhme.zza().zzb();
            zzhlv zzhlvVarZza2 = zzhlwVarZzb.zza(zzhdoVar, zzhluVar, "mac", "compute");
            zzhlvVarZza = zzhlwVarZzb.zza(zzhdoVar, zzhluVar, "mac", "verify");
            zzhlvVar = zzhlvVarZza2;
        }
        zzhdn zzhdnVar = (zzhdn) zzhdoVar;
        return new zzhot(new zzhos((zzhds) zzhncVar.zza(zzhdnVar.zzc()), zzhdnVar.zzc().zzc()), zzhmsVar.zzb(), zzhlvVar, zzhlvVarZza, null);
    }
}
