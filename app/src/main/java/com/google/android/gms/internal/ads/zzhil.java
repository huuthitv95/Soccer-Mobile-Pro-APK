package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhil {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhik.zza, zzhfh.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhih.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhii.zza, zzhfb.class, zzhne.class);
        zzf = zzhlj.zzd(zzhij.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhfh zzhfhVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzhqq zzhqqVarZzd = zzhqr.zzd();
        zzhqqVarZzd.zza(zzh(zzhfhVar));
        zzhqqVarZzd.zzb(zzhfhVar.zzc());
        zzhshVarZze.zzb(((zzhqr) zzhqqVarZzd.zzbu()).zzaM());
        zzhshVarZze.zzc(zzf(zzhfhVar.zze()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhfh zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhqr zzhqrVarZzc = zzhqr.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhff zzhffVarZzb = zzhfh.zzb();
            zzhffVarZzb.zza(zzhqrVarZzc.zzb());
            zzhffVarZzb.zzb(zzhqrVarZzc.zza().zza());
            zzhffVarZzb.zzc(16);
            zzhffVarZzb.zzd(zzg(zzhnfVar.zzc().zzc()));
            return zzhffVarZzb.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhfb zzhfbVar, zzhdx zzhdxVar) {
        zzhqo zzhqoVarZze = zzhqp.zze();
        zzhqoVarZze.zza(zzh(zzhfbVar.zzf()));
        byte[] bArrZzc = zzhfbVar.zze().zzc(zzhdxVar);
        zzhqoVarZze.zzb(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhqp) zzhqoVarZze.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhfbVar.zzf().zze()), zzhfbVar.zzb());
    }

    static /* synthetic */ zzhfb zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhqp zzhqpVarZzd = zzhqp.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzhqpVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhff zzhffVarZzb = zzhfh.zzb();
            zzhffVarZzb.zza(zzhqpVarZzd.zzc().zzb());
            zzhffVarZzb.zzb(zzhqpVarZzd.zzb().zza());
            zzhffVarZzb.zzc(16);
            zzhffVarZzb.zzd(zzg(zzhneVar.zzd()));
            zzhfh zzhfhVarZze = zzhffVarZzb.zze();
            zzhfa zzhfaVarZzd = zzhfb.zzd();
            zzhfaVarZzd.zza(zzhfhVarZze);
            zzhfaVarZzd.zzb(zziao.zza(zzhqpVarZzd.zzc().zzA(), zzhdxVar));
            zzhfaVarZzd.zzc(zzhneVar.zze());
            return zzhfaVarZzd.zzd();
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing AesEaxKey failed");
        }
    }

    private static zzhtb zzf(zzhfg zzhfgVar) throws GeneralSecurityException {
        if (zzhfg.zza.equals(zzhfgVar)) {
            return zzhtb.TINK;
        }
        if (zzhfg.zzb.equals(zzhfgVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhfg.zzc.equals(zzhfgVar)) {
            return zzhtb.RAW;
        }
        String strValueOf = String.valueOf(zzhfgVar);
        String.valueOf(strValueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(strValueOf)));
    }

    private static zzhfg zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhfg.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhfg.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhfg.zzb;
    }

    private static zzhqt zzh(zzhfh zzhfhVar) throws GeneralSecurityException {
        zzhqs zzhqsVarZzb = zzhqt.zzb();
        zzhqsVarZzb.zza(zzhfhVar.zzd());
        return (zzhqt) zzhqsVarZzb.zzbu();
    }
}
