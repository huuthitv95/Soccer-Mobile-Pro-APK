package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhes implements zzhlf {
    static final /* synthetic */ zzhes zza = new zzhes();

    private /* synthetic */ zzhes() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) throws GeneralSecurityException {
        zzhez zzhezVar = (zzhez) zzhdtVar;
        int i = zzhev.zza;
        if (zzhezVar.zzc() != 16 && zzhezVar.zzc() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        zzheq zzheqVar = new zzheq(null);
        zzheqVar.zza(zzhezVar);
        zzheqVar.zzd(num);
        zzheqVar.zzb(zziao.zzb(zzhezVar.zzc()));
        zzheqVar.zzc(zziao.zzb(zzhezVar.zzd()));
        return zzheqVar.zze();
    }
}
