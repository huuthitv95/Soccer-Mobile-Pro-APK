package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhoc implements zzhnd {
    private static final zzhoc zza = new zzhoc();

    private zzhoc() {
    }

    static void zzc() throws GeneralSecurityException {
        zzhmg.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zza() {
        return zzhoa.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final Class zzb() {
        return zzhoa.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhnd
    public final /* bridge */ /* synthetic */ Object zze(zzhdo zzhdoVar, zzhnc zzhncVar) throws GeneralSecurityException {
        zziam zziamVarZzd;
        zzhdn zzhdnVar = (zzhdn) zzhdoVar;
        zzhdl zzhdlVarZzc = zzhdnVar.zzc();
        zzhms zzhmsVar = new zzhms();
        for (int i = 0; i < zzhdoVar.zzd(); i++) {
            zzhdl zzhdlVarZze = zzhdnVar.zze(i);
            if (zzhdlVarZze.zzb().equals(zzhde.zza)) {
                zzhoa zzhoaVar = (zzhoa) zzhncVar.zza(zzhdlVarZze);
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
                zzhmsVar.zza(zziamVarZzd, zzhoaVar);
            }
        }
        return new zzhob(zzhmsVar.zzb(), (zzhoa) zzhncVar.zza(zzhdlVarZzc), null);
    }
}
