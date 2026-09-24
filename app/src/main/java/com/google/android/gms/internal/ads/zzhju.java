package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhju {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhjt.zza, zzhhu.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhjq.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhjr.zza, zzhhp.class, zzhne.class);
        zzf = zzhlj.zzd(zzhjs.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhhu zzhhuVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzhtw zzhtwVarZzd = zzhtx.zzd();
        zzhty zzhtyVarZzb = zzhtz.zzb();
        zzhtyVarZzb.zza(zzhhuVar.zzd());
        zzhtwVarZzd.zza((zzhtz) zzhtyVarZzb.zzbu());
        zzhshVarZze.zzb(((zzhtx) zzhtwVarZzd.zzbu()).zzaM());
        zzhshVarZze.zzc(zzf(zzhhuVar.zzc()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhhu zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhtx zzhtxVarZzc = zzhtx.zzc(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzhtxVarZzc.zza() == 0) {
                return zzhhu.zzb(zzg(zzhnfVar.zzc().zzc()), zzhtxVarZzc.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhhp zzhhpVar, zzhdx zzhdxVar) {
        zzhtu zzhtuVarZze = zzhtv.zze();
        byte[] bArrZzc = zzhhpVar.zze().zzc(zzhdxVar);
        zzhtuVarZze.zzb(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        zzhty zzhtyVarZzb = zzhtz.zzb();
        zzhtyVarZzb.zza(zzhhpVar.zzf().zzd());
        zzhtuVarZze.zza((zzhtz) zzhtyVarZzb.zzbu());
        return zzhne.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhtv) zzhtuVarZze.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhhpVar.zzf().zzc()), zzhhpVar.zzb());
    }

    static /* synthetic */ zzhhp zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhtv zzhtvVarZzd = zzhtv.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzhtvVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhtvVarZzd.zzc().zzb() == 32) {
                return zzhhp.zzd(zzhhu.zzb(zzg(zzhneVar.zzd()), zzhtvVarZzd.zzb().zza()), zziao.zza(zzhtvVarZzd.zzc().zzA(), zzhdxVar), zzhneVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhtb zzf(zzhht zzhhtVar) throws GeneralSecurityException {
        if (Objects.equals(zzhhtVar, zzhht.zza)) {
            return zzhtb.TINK;
        }
        if (Objects.equals(zzhhtVar, zzhht.zzb)) {
            return zzhtb.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhhtVar.toString()));
    }

    private static zzhht zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhht.zza;
        }
        if (iOrdinal == 3) {
            return zzhht.zzb;
        }
        int iZza = zzhtbVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }
}
