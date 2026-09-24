package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhig {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhif.zza, zzhez.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhic.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhid.zza, zzher.class, zzhne.class);
        zzf = zzhlj.zzd(zzhie.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhez zzhezVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhqg zzhqgVarZzd = zzhqh.zzd();
        zzhqk zzhqkVarZzc = zzhql.zzc();
        zzhqm zzhqmVarZzb = zzhqn.zzb();
        zzhqmVarZzb.zza(zzhezVar.zzf());
        zzhqkVarZzc.zza((zzhqn) zzhqmVarZzb.zzbu());
        zzhqkVarZzc.zzb(zzhezVar.zzc());
        zzhqgVarZzd.zza((zzhql) zzhqkVarZzc.zzbu());
        zzhrz zzhrzVarZze = zzhsa.zze();
        zzhrzVarZze.zza(zzi(zzhezVar));
        zzhrzVarZze.zzb(zzhezVar.zzd());
        zzhqgVarZzd.zzb((zzhsa) zzhrzVarZze.zzbu());
        zzhshVarZze.zzb(((zzhqh) zzhqgVarZzd.zzbu()).zzaM());
        zzhshVarZze.zzc(zzf(zzhezVar.zzg()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhez zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhqh zzhqhVarZzc = zzhqh.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzhqhVarZzc.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhew zzhewVarZzb = zzhez.zzb();
            zzhewVarZzb.zza(zzhqhVarZzc.zza().zzb());
            zzhewVarZzb.zzb(zzhqhVarZzc.zzb().zzb());
            zzhewVarZzb.zzc(zzhqhVarZzc.zza().zza().zza());
            zzhewVarZzb.zzd(zzhqhVarZzc.zzb().zza().zzb());
            zzhewVarZzb.zzf(zzh(zzhqhVarZzc.zzb().zza().zza()));
            zzhewVarZzb.zze(zzg(zzhnfVar.zzc().zzc()));
            return zzhewVarZzb.zzg();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzher zzherVar, zzhdx zzhdxVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqi zzhqiVarZzd = zzhqj.zzd();
        zzhqm zzhqmVarZzb = zzhqn.zzb();
        zzhqmVarZzb.zza(zzherVar.zzg().zzf());
        zzhqiVarZzd.zza((zzhqn) zzhqmVarZzb.zzbu());
        byte[] bArrZzc = zzherVar.zze().zzc(zzhdxVar);
        zzhqiVarZzd.zzb(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        zzhqeVarZze.zza((zzhqj) zzhqiVarZzd.zzbu());
        zzhrx zzhrxVarZze = zzhry.zze();
        zzhrxVarZze.zza(zzi(zzherVar.zzg()));
        byte[] bArrZzc2 = zzherVar.zzf().zzc(zzhdxVar);
        zzhrxVarZze.zzb(zzicn.zzt(bArrZzc2, 0, bArrZzc2.length));
        zzhqeVarZze.zzb((zzhry) zzhrxVarZze.zzbu());
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhqf) zzhqeVarZze.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzherVar.zzg().zzg()), zzherVar.zzb());
    }

    static /* synthetic */ zzher zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhqf zzhqfVarZzd = zzhqf.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzhqfVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhqfVarZzd.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzhqfVarZzd.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzhew zzhewVarZzb = zzhez.zzb();
            zzhewVarZzb.zza(zzhqfVarZzd.zzb().zzc().zzb());
            zzhewVarZzb.zzb(zzhqfVarZzd.zzc().zzc().zzb());
            zzhewVarZzb.zzc(zzhqfVarZzd.zzb().zzb().zza());
            zzhewVarZzb.zzd(zzhqfVarZzd.zzc().zzb().zzb());
            zzhewVarZzb.zzf(zzh(zzhqfVarZzd.zzc().zzb().zza()));
            zzhewVarZzb.zze(zzg(zzhneVar.zzd()));
            zzhez zzhezVarZzg = zzhewVarZzb.zzg();
            zzheq zzheqVarZzd = zzher.zzd();
            zzheqVarZzd.zza(zzhezVarZzg);
            zzheqVarZzd.zzb(zziao.zza(zzhqfVarZzd.zzb().zzc().zzA(), zzhdxVar));
            zzheqVarZzd.zzc(zziao.zza(zzhqfVarZzd.zzc().zzc().zzA(), zzhdxVar));
            zzheqVarZzd.zzd(zzhneVar.zze());
            return zzheqVarZzd.zze();
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhtb zzf(zzhey zzheyVar) throws GeneralSecurityException {
        if (zzhey.zza.equals(zzheyVar)) {
            return zzhtb.TINK;
        }
        if (zzhey.zzb.equals(zzheyVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhey.zzc.equals(zzheyVar)) {
            return zzhtb.RAW;
        }
        String strValueOf = String.valueOf(zzheyVar);
        String.valueOf(strValueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(strValueOf)));
    }

    private static zzhey zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhey.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhey.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhey.zzb;
    }

    private static zzhex zzh(zzhrw zzhrwVar) throws GeneralSecurityException {
        int iOrdinal = zzhrwVar.ordinal();
        if (iOrdinal == 1) {
            return zzhex.zza;
        }
        if (iOrdinal == 2) {
            return zzhex.zzd;
        }
        if (iOrdinal == 3) {
            return zzhex.zzc;
        }
        if (iOrdinal == 4) {
            return zzhex.zze;
        }
        if (iOrdinal == 5) {
            return zzhex.zzb;
        }
        int iZza = zzhrwVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhsc zzi(zzhez zzhezVar) throws GeneralSecurityException {
        zzhrw zzhrwVar;
        zzhsb zzhsbVarZzc = zzhsc.zzc();
        zzhsbVarZzc.zzb(zzhezVar.zze());
        zzhex zzhexVarZzh = zzhezVar.zzh();
        if (zzhex.zza.equals(zzhexVarZzh)) {
            zzhrwVar = zzhrw.SHA1;
        } else if (zzhex.zzb.equals(zzhexVarZzh)) {
            zzhrwVar = zzhrw.SHA224;
        } else if (zzhex.zzc.equals(zzhexVarZzh)) {
            zzhrwVar = zzhrw.SHA256;
        } else if (zzhex.zzd.equals(zzhexVarZzh)) {
            zzhrwVar = zzhrw.SHA384;
        } else {
            if (!zzhex.zze.equals(zzhexVarZzh)) {
                String strValueOf = String.valueOf(zzhexVarZzh);
                String.valueOf(strValueOf);
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(strValueOf)));
            }
            zzhrwVar = zzhrw.SHA512;
        }
        zzhsbVarZzc.zza(zzhrwVar);
        return (zzhsc) zzhsbVarZzc.zzbu();
    }
}
