package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhis {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhir.zza, zzhfq.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhio.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhip.zza, zzhfj.class, zzhne.class);
        zzf = zzhlj.zzd(zzhiq.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhfq zzhfqVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzhqw zzhqwVarZzd = zzhqx.zzd();
        zzhqwVarZzd.zza(zzhfqVar.zzc());
        zzhshVarZze.zzb(((zzhqx) zzhqwVarZzd.zzbu()).zzaM());
        zzhshVarZze.zzc(zzf(zzhfqVar.zzd()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhfq zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhqx zzhqxVarZzc = zzhqx.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzhqxVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhfo zzhfoVarZzb = zzhfq.zzb();
            zzhfoVarZzb.zza(zzhqxVarZzc.zza());
            zzhfoVarZzb.zzb(12);
            zzhfoVarZzb.zzc(16);
            zzhfoVarZzb.zzd(zzg(zzhnfVar.zzc().zzc()));
            return zzhfoVarZzb.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhfj zzhfjVar, zzhdx zzhdxVar) {
        zzhqu zzhquVarZzd = zzhqv.zzd();
        byte[] bArrZzc = zzhfjVar.zze().zzc(zzhdxVar);
        zzhquVarZzd.zza(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhqv) zzhquVarZzd.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhfjVar.zzf().zzd()), zzhfjVar.zzb());
    }

    static /* synthetic */ zzhfj zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhqv zzhqvVarZzc = zzhqv.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzhqvVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhfo zzhfoVarZzb = zzhfq.zzb();
            zzhfoVarZzb.zza(zzhqvVarZzc.zzb().zzb());
            zzhfoVarZzb.zzb(12);
            zzhfoVarZzb.zzc(16);
            zzhfoVarZzb.zzd(zzg(zzhneVar.zzd()));
            zzhfq zzhfqVarZze = zzhfoVarZzb.zze();
            zzhfi zzhfiVarZzd = zzhfj.zzd();
            zzhfiVarZzd.zza(zzhfqVarZze);
            zzhfiVarZzd.zzb(zziao.zza(zzhqvVarZzc.zzb().zzA(), zzhdxVar));
            zzhfiVarZzd.zzc(zzhneVar.zze());
            return zzhfiVarZzd.zzd();
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhtb zzf(zzhfp zzhfpVar) throws GeneralSecurityException {
        if (zzhfp.zza.equals(zzhfpVar)) {
            return zzhtb.TINK;
        }
        if (zzhfp.zzb.equals(zzhfpVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhfp.zzc.equals(zzhfpVar)) {
            return zzhtb.RAW;
        }
        String strValueOf = String.valueOf(zzhfpVar);
        String.valueOf(strValueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(strValueOf)));
    }

    private static zzhfp zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhfp.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhfp.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhfp.zzb;
    }
}
