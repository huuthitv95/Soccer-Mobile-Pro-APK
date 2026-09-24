package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhiz {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhiy.zza, zzhfz.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhiv.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhiw.zza, zzhfs.class, zzhne.class);
        zzf = zzhlj.zzd(zzhix.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhfz zzhfzVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhra zzhraVarZzd = zzhrb.zzd();
        zzhraVarZzd.zza(zzhfzVar.zzc());
        zzhshVarZze.zzb(((zzhrb) zzhraVarZzd.zzbu()).zzaM());
        zzhshVarZze.zzc(zzf(zzhfzVar.zzd()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhfz zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhrb zzhrbVarZzc = zzhrb.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzhrbVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhfx zzhfxVarZzb = zzhfz.zzb();
            zzhfxVarZzb.zza(zzhrbVarZzc.zza());
            zzhfxVarZzb.zzb(zzg(zzhnfVar.zzc().zzc()));
            return zzhfxVarZzb.zzc();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhfs zzhfsVar, zzhdx zzhdxVar) {
        zzhqy zzhqyVarZzd = zzhqz.zzd();
        byte[] bArrZzc = zzhfsVar.zze().zzc(zzhdxVar);
        zzhqyVarZzd.zza(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhqz) zzhqyVarZzd.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhfsVar.zzf().zzd()), zzhfsVar.zzb());
    }

    static /* synthetic */ zzhfs zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhqz zzhqzVarZzc = zzhqz.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzhqzVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhfx zzhfxVarZzb = zzhfz.zzb();
            zzhfxVarZzb.zza(zzhqzVarZzc.zzb().zzb());
            zzhfxVarZzb.zzb(zzg(zzhneVar.zzd()));
            zzhfz zzhfzVarZzc = zzhfxVarZzb.zzc();
            zzhfr zzhfrVarZzd = zzhfs.zzd();
            zzhfrVarZzd.zza(zzhfzVarZzc);
            zzhfrVarZzd.zzb(zziao.zza(zzhqzVarZzc.zzb().zzA(), zzhdxVar));
            zzhfrVarZzd.zzc(zzhneVar.zze());
            return zzhfrVarZzd.zzd();
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhtb zzf(zzhfy zzhfyVar) throws GeneralSecurityException {
        if (zzhfy.zza.equals(zzhfyVar)) {
            return zzhtb.TINK;
        }
        if (zzhfy.zzb.equals(zzhfyVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhfy.zzc.equals(zzhfyVar)) {
            return zzhtb.RAW;
        }
        String strValueOf = String.valueOf(zzhfyVar);
        String.valueOf(strValueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(strValueOf)));
    }

    private static zzhfy zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhfy.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhfy.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhfy.zzb;
    }
}
