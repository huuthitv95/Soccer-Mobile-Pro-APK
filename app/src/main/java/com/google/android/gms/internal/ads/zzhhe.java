package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhhe {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhhd.zza, zzhgz.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhha.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhhb.zza, zzhgv.class, zzhne.class);
        zzf = zzhlj.zzd(zzhhc.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhgz zzhgzVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzhshVarZze.zzb(zzg(zzhgzVar).zzaM());
        zzhshVarZze.zzc(zzf(zzhgzVar.zzc()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhgz zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            return zzh(zzhta.zzc(zzhnfVar.zzc().zzb(), zzidb.zza()), zzhnfVar.zzc().zzc());
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhgv zzhgvVar, zzhdx zzhdxVar) {
        zzhsx zzhsxVarZzd = zzhsy.zzd();
        zzhsxVarZzd.zza(zzg(zzhgvVar.zze()));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhsy) zzhsxVarZzd.zzbu()).zzaM(), zzhse.REMOTE, zzf(zzhgvVar.zze().zzc()), zzhgvVar.zzb());
    }

    static /* synthetic */ zzhgv zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhsy zzhsyVarZzc = zzhsy.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzhsyVarZzc.zza() == 0) {
                return zzhgv.zzd(zzh(zzhsyVarZzc.zzb(), zzhneVar.zzd()), zzhneVar.zze());
            }
            String strValueOf = String.valueOf(zzhsyVarZzc);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    private static zzhtb zzf(zzhgy zzhgyVar) throws GeneralSecurityException {
        if (zzhgy.zza.equals(zzhgyVar)) {
            return zzhtb.TINK;
        }
        if (zzhgy.zzb.equals(zzhgyVar)) {
            return zzhtb.RAW;
        }
        String strValueOf = String.valueOf(zzhgyVar);
        String.valueOf(strValueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(strValueOf)));
    }

    private static zzhta zzg(zzhgz zzhgzVar) throws GeneralSecurityException {
        try {
            zzhsi zzhsiVarZzd = zzhsi.zzd(zzhdz.zza(zzhgzVar.zzd()), zzidb.zza());
            zzhsz zzhszVarZzd = zzhta.zzd();
            zzhszVarZzd.zza(zzhgzVar.zzb());
            zzhszVarZzd.zzb(zzhsiVarZzd);
            return (zzhta) zzhszVarZzd.zzbu();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzhgz zzh(zzhta zzhtaVar, zzhtb zzhtbVar) throws GeneralSecurityException {
        zzhgx zzhgxVar;
        zzhgy zzhgyVar;
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza(zzhtaVar.zzb().zza());
        zzhshVarZze.zzb(zzhtaVar.zzb().zzb());
        zzhshVarZze.zzc(zzhtb.RAW);
        zzhdt zzhdtVarZzb = zzhdz.zzb(((zzhsi) zzhshVarZze.zzbu()).zzaN());
        if (zzhdtVarZzb instanceof zzhfq) {
            zzhgxVar = zzhgx.zza;
        } else if (zzhdtVarZzb instanceof zzhgf) {
            zzhgxVar = zzhgx.zzc;
        } else if (zzhdtVarZzb instanceof zzhib) {
            zzhgxVar = zzhgx.zzb;
        } else if (zzhdtVarZzb instanceof zzhez) {
            zzhgxVar = zzhgx.zzd;
        } else if (zzhdtVarZzb instanceof zzhfh) {
            zzhgxVar = zzhgx.zze;
        } else {
            if (!(zzhdtVarZzb instanceof zzhfz)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzhdtVarZzb.toString()));
            }
            zzhgxVar = zzhgx.zzf;
        }
        zzhgw zzhgwVar = new zzhgw(null);
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            zzhgyVar = zzhgy.zza;
        } else {
            if (iOrdinal != 3) {
                int iZza = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhgyVar = zzhgy.zzb;
        }
        zzhgwVar.zza(zzhgyVar);
        zzhgwVar.zzb(zzhtaVar.zza());
        zzhgwVar.zzd((zzhel) zzhdtVarZzb);
        zzhgwVar.zzc(zzhgxVar);
        return zzhgwVar.zze();
    }
}
