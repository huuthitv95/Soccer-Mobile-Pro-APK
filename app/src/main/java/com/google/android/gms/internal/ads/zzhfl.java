package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhfl implements zzhlf {
    static final /* synthetic */ zzhfl zza = new zzhfl();

    private /* synthetic */ zzhfl() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) throws GeneralSecurityException {
        zzhfq zzhfqVar = (zzhfq) zzhdtVar;
        int i = zzhfn.zza;
        if (zzhfqVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhfi zzhfiVar = new zzhfi(null);
        zzhfiVar.zza(zzhfqVar);
        zzhfiVar.zzc(num);
        zzhfiVar.zzb(zziao.zzb(zzhfqVar.zzc()));
        return zzhfiVar.zzd();
    }
}
