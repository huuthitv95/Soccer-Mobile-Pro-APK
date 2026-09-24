package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhgk implements zzhmw {
    static final /* synthetic */ zzhgk zza = new zzhgk();

    private /* synthetic */ zzhgk() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public final /* synthetic */ Object zza(zzhdc zzhdcVar) throws GeneralSecurityException {
        zzhgv zzhgvVar = (zzhgv) zzhdcVar;
        int i = zzhgm.zza;
        String strZzb = zzhgvVar.zze().zzb();
        zzhel zzhelVarZzd = zzhgvVar.zze().zzd();
        zzhcu zzhcuVarZzb = zzhdr.zza(strZzb).zzb();
        int i2 = zzhgj.zza;
        try {
            return zzhjn.zzc(new zzhgj(zzhsi.zzd(zzhdz.zza(zzhelVarZzd), zzidb.zza()), zzhcuVarZzb), zzhgvVar.zzc());
        } catch (zzieg e) {
            throw new GeneralSecurityException(e);
        }
    }
}
