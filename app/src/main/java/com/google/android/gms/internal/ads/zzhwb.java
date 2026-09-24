package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwb implements zzhnd {
    private static final zzhwb zza = new zzhwb();
    private static final zzhmx zzb = zzhmx.zzd(zzhvy.zza, zzhlr.class, zzhdw.class);

    static void zzc() throws GeneralSecurityException {
        zzhmg.zza().zzc(zza);
        zzhmg.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zza() {
        return zzhdw.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zzb() {
        return zzhdw.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final /* bridge */ /* synthetic */ Object zze(zzhdo zzhdoVar, zzhnc zzhncVar) throws GeneralSecurityException {
        zziam zziamVarZzd;
        zzhms zzhmsVar = new zzhms();
        for (int i = 0; i < zzhdoVar.zzd(); i++) {
            zzhdl zzhdlVarZze = ((zzhdn) zzhdoVar).zze(i);
            if (zzhdlVarZze.zzb().equals(zzhde.zza)) {
                zzhdw zzhdwVar = (zzhdw) zzhncVar.zza(zzhdlVarZze);
                zzhdc zzhdcVarZza = zzhdlVarZze.zza();
                if (zzhdcVarZza instanceof zzhxd) {
                    zziamVarZzd = ((zzhxd) zzhdcVarZza).zze();
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
                zzhmsVar.zza(zziamVarZzd, new zzhvz(zzhdwVar, zzhdlVarZze.zzc()));
            }
        }
        zzhlu zzhluVar = (zzhlu) zzhdoVar.zzf(zzhlu.class);
        return new zzhwa(zzhmsVar.zzb(), (zzhluVar == null || zzhluVar.zza()) ? zzhly.zza : zzhme.zza().zzb().zza(zzhdoVar, zzhluVar, "public_key_verify", "verify"));
    }
}
