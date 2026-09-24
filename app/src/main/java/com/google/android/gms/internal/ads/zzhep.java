package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhep implements zzhnd {
    private static final zzhep zza = new zzhep();
    private static final zzhmx zzb = zzhmx.zzd(zzhen.zza, zzhlr.class, zzhcu.class);

    zzhep() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzhmg.zza().zzc(zza);
        zzhmg.zza().zzb(zzb);
    }

    public static void zzd(zzhmy zzhmyVar) throws GeneralSecurityException {
        zzhmyVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zza() {
        return zzhcu.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zzb() {
        return zzhcu.class;
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
                zzhdc zzhdcVarZza = zzhdlVarZze.zza();
                if (zzhdcVarZza instanceof zzhek) {
                    zziamVarZzd = ((zzhek) zzhdcVarZza).zzc();
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
                zzhmsVar.zza(zziamVarZzd, new zzhem((zzhcu) zzhncVar.zza(zzhdlVarZze), zzhdlVarZze.zzc()));
            }
        }
        zzhlu zzhluVar = (zzhlu) zzhdoVar.zzf(zzhlu.class);
        if (zzhluVar == null || zzhluVar.zza()) {
            zzhlvVar = zzhly.zza;
            zzhlvVarZza = zzhlvVar;
        } else {
            zzhlw zzhlwVarZzb = zzhme.zza().zzb();
            zzhlv zzhlvVarZza2 = zzhlwVarZzb.zza(zzhdoVar, zzhluVar, "aead", "encrypt");
            zzhlvVarZza = zzhlwVarZzb.zza(zzhdoVar, zzhluVar, "aead", "decrypt");
            zzhlvVar = zzhlvVarZza2;
        }
        zzhdn zzhdnVar = (zzhdn) zzhdoVar;
        return new zzheo(new zzhem((zzhcu) zzhncVar.zza(zzhdnVar.zzc()), zzhdnVar.zzc().zzc()), zzhmsVar.zzb(), zzhlvVar, zzhlvVarZza, null);
    }
}
