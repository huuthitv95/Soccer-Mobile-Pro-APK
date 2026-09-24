package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhpf {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhpe.zza, zzhnz.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhpb.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhpc.zza, zzhns.class, zzhne.class);
        zzf = zzhlj.zzd(zzhpd.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhnz zzhnzVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhqa zzhqaVarZzd = zzhqb.zzd();
        zzhqaVarZzd.zzb(zzh(zzhnzVar));
        zzhqaVarZzd.zza(zzhnzVar.zzc());
        zzhshVarZze.zzb(((zzhqb) zzhqaVarZzd.zzbu()).zzaM());
        zzhshVarZze.zzc(zzf(zzhnzVar.zzf()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhnz zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhqb zzhqbVarZzc = zzhqb.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhnx zzhnxVarZzb = zzhnz.zzb();
            zzhnxVarZzb.zza(zzhqbVarZzc.zza());
            zzhnxVarZzb.zzb(zzhqbVarZzc.zzb().zza());
            zzhnxVarZzb.zzc(zzg(zzhnfVar.zzc().zzc()));
            return zzhnxVarZzb.zzd();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhns zzhnsVar, zzhdx zzhdxVar) {
        zzhpy zzhpyVarZze = zzhpz.zze();
        zzhpyVarZze.zzb(zzh(zzhnsVar.zzf()));
        byte[] bArrZzc = zzhnsVar.zzd().zzc(zzhdxVar);
        zzhpyVarZze.zza(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhpz) zzhpyVarZze.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhnsVar.zzf().zzf()), zzhnsVar.zzb());
    }

    static /* synthetic */ zzhns zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhpz zzhpzVarZzd = zzhpz.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzhpzVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhnx zzhnxVarZzb = zzhnz.zzb();
            zzhnxVarZzb.zza(zzhpzVarZzd.zzb().zzb());
            zzhnxVarZzb.zzb(zzhpzVarZzd.zzc().zza());
            zzhnxVarZzb.zzc(zzg(zzhneVar.zzd()));
            zzhnz zzhnzVarZzd = zzhnxVarZzb.zzd();
            zzhnr zzhnrVarZzc = zzhns.zzc();
            zzhnrVarZzc.zza(zzhnzVarZzd);
            zzhnrVarZzc.zzb(zziao.zza(zzhpzVarZzd.zzb().zzA(), zzhdxVar));
            zzhnrVarZzc.zzc(zzhneVar.zze());
            return zzhnrVarZzc.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhtb zzf(zzhny zzhnyVar) throws GeneralSecurityException {
        if (zzhny.zza.equals(zzhnyVar)) {
            return zzhtb.TINK;
        }
        if (zzhny.zzb.equals(zzhnyVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhny.zzd.equals(zzhnyVar)) {
            return zzhtb.RAW;
        }
        if (zzhny.zzc.equals(zzhnyVar)) {
            return zzhtb.LEGACY;
        }
        String strValueOf = String.valueOf(zzhnyVar);
        String.valueOf(strValueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(strValueOf)));
    }

    private static zzhny zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhny.zza;
        }
        if (iOrdinal == 2) {
            return zzhny.zzc;
        }
        if (iOrdinal == 3) {
            return zzhny.zzd;
        }
        if (iOrdinal == 4) {
            return zzhny.zzb;
        }
        int iZza = zzhtbVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhqd zzh(zzhnz zzhnzVar) {
        zzhqc zzhqcVarZzb = zzhqd.zzb();
        zzhqcVarZzb.zza(zzhnzVar.zzd());
        return (zzhqd) zzhqcVarZzb.zzbu();
    }
}
