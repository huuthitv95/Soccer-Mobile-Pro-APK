package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhfd implements zzhlf {
    static final /* synthetic */ zzhfd zza = new zzhfd();

    private /* synthetic */ zzhfd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhlf
    public final /* synthetic */ zzhdc zza(zzhdt zzhdtVar, Integer num) throws GeneralSecurityException {
        zzhfh zzhfhVar = (zzhfh) zzhdtVar;
        int i = zzhfe.zza;
        if (zzhfhVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
        }
        zzhfa zzhfaVar = new zzhfa(null);
        zzhfaVar.zza(zzhfhVar);
        zzhfaVar.zzc(num);
        zzhfaVar.zzb(zziao.zzb(zzhfhVar.zzc()));
        return zzhfaVar.zzd();
    }
}
