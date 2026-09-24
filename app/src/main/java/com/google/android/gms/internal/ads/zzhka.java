package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhka {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhjz.zza, zzhib.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhjw.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhjx.zza, zzhhv.class, zzhne.class);
        zzf = zzhlj.zzd(zzhjy.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhib zzhibVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzhshVarZze.zzb(zzhud.zzc().zzaM());
        zzhshVarZze.zzc(zzf(zzhibVar.zzc()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhib zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            if (zzhud.zzb(zzhnfVar.zzc().zzb(), zzidb.zza()).zza() == 0) {
                return zzhib.zzb(zzg(zzhnfVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhhv zzhhvVar, zzhdx zzhdxVar) {
        zzhua zzhuaVarZzd = zzhub.zzd();
        byte[] bArrZzc = zzhhvVar.zze().zzc(zzhdxVar);
        zzhuaVarZzd.zza(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhub) zzhuaVarZzd.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhhvVar.zzf().zzc()), zzhhvVar.zzb());
    }

    static /* synthetic */ zzhhv zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhub zzhubVarZzc = zzhub.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzhubVarZzc.zza() == 0) {
                return zzhhv.zzd(zzg(zzhneVar.zzd()), zziao.zza(zzhubVarZzc.zzb().zzA(), zzhdxVar), zzhneVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhtb zzf(zzhia zzhiaVar) throws GeneralSecurityException {
        if (zzhia.zza.equals(zzhiaVar)) {
            return zzhtb.TINK;
        }
        if (zzhia.zzb.equals(zzhiaVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhia.zzc.equals(zzhiaVar)) {
            return zzhtb.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhiaVar.toString()));
    }

    private static zzhia zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhia.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhia.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhia.zzb;
    }
}
