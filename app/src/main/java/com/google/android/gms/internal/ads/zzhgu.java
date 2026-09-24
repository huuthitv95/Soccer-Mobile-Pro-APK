package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhgu {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhgt.zza, zzhgp.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhgq.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhgr.zza, zzhgn.class, zzhne.class);
        zzf = zzhlj.zzd(zzhgs.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhgp zzhgpVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhsv zzhsvVarZzc = zzhsw.zzc();
        zzhsvVarZzc.zza(zzhgpVar.zzc());
        zzhshVarZze.zzb(((zzhsw) zzhsvVarZzc.zzbu()).zzaM());
        zzhshVarZze.zzc(zzf(zzhgpVar.zzd()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhgp zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzhgp.zzb(zzhsw.zzb(zzhnfVar.zzc().zzb(), zzidb.zza()).zza(), zzg(zzhnfVar.zzc().zzc()));
            } catch (zzieg e) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        }
        String strZza = zzhnfVar.zzc().zza();
        String.valueOf(strZza);
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
    }

    static /* synthetic */ zzhne zzd(zzhgn zzhgnVar, zzhdx zzhdxVar) {
        zzhst zzhstVarZzd = zzhsu.zzd();
        zzhsv zzhsvVarZzc = zzhsw.zzc();
        zzhsvVarZzc.zza(zzhgnVar.zze().zzc());
        zzhstVarZzd.zza((zzhsw) zzhsvVarZzc.zzbu());
        return zzhne.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhsu) zzhstVarZzd.zzbu()).zzaM(), zzhse.REMOTE, zzf(zzhgnVar.zze().zzd()), zzhgnVar.zzb());
    }

    static /* synthetic */ zzhgn zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhsu zzhsuVarZzc = zzhsu.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzhsuVarZzc.zza() == 0) {
                return zzhgn.zzd(zzhgp.zzb(zzhsuVarZzc.zzb().zza(), zzg(zzhneVar.zzd())), zzhneVar.zze());
            }
            String strValueOf = String.valueOf(zzhsuVarZzc);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    private static zzhtb zzf(zzhgo zzhgoVar) throws GeneralSecurityException {
        if (zzhgo.zza.equals(zzhgoVar)) {
            return zzhtb.TINK;
        }
        if (zzhgo.zzb.equals(zzhgoVar)) {
            return zzhtb.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhgoVar.toString()));
    }

    private static zzhgo zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgo.zza;
        }
        if (iOrdinal == 3) {
            return zzhgo.zzb;
        }
        int iZza = zzhtbVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }
}
