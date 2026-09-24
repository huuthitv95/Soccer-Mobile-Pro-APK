package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhlz implements zzhlf {
    static final /* synthetic */ zzhlz zza = new zzhlz();

    private /* synthetic */ zzhlz() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) throws GeneralSecurityException {
        int i = zzhma.zza;
        zzhsi zzhsiVarZzc = ((zzhls) zzhdtVar).zzb().zzc();
        zzhdd zzhddVarZzd = zzhlg.zza().zzd(zzhsiVarZzc.zza());
        if (!zzhlg.zza().zze(zzhsiVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhsf zzhsfVarZzd = zzhddVarZzd.zzd(zzhsiVarZzc.zzb());
        return new zzhlr(zzhne.zza(zzhsfVarZzd.zza(), zzhsfVarZzd.zzb(), zzhsfVarZzd.zzc(), zzhsiVarZzc.zzc(), num), zzhda.zza());
    }
}
