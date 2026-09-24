package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhjf {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhmq zzc;
    private static final zzhmn zzd;
    private static final zzhlm zze;
    private static final zzhlj zzf;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zziamVarZza;
        zzc = zzhmq.zzd(zzhje.zza, zzhgf.class, zzhnf.class);
        zzd = zzhmn.zzd(zzhjb.zza, zziamVarZza, zzhnf.class);
        zze = zzhlm.zzd(zzhjc.zza, zzhga.class, zzhne.class);
        zzf = zzhlj.zzd(zzhjd.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzc);
        zzhmjVar.zze(zzd);
        zzhmjVar.zzb(zze);
        zzhmjVar.zzc(zzf);
    }

    static /* synthetic */ zzhnf zzb(zzhgf zzhgfVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzhshVarZze.zzb(zzhrf.zzb().zzaM());
        zzhshVarZze.zzc(zzf(zzhgfVar.zzc()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhgf zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhrf.zza(zzhnfVar.zzc().zzb(), zzidb.zza());
            return zzhgf.zzb(zzg(zzhnfVar.zzc().zzc()));
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhga zzhgaVar, zzhdx zzhdxVar) {
        zzhrc zzhrcVarZzd = zzhrd.zzd();
        byte[] bArrZzc = zzhgaVar.zze().zzc(zzhdxVar);
        zzhrcVarZzd.zza(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhrd) zzhrcVarZzd.zzbu()).zzaM(), zzhse.SYMMETRIC, zzf(zzhgaVar.zzf().zzc()), zzhgaVar.zzb());
    }

    static /* synthetic */ zzhga zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhrd zzhrdVarZzc = zzhrd.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzhrdVarZzc.zza() == 0) {
                return zzhga.zzd(zzg(zzhneVar.zzd()), zziao.zza(zzhrdVarZzc.zzb().zzA(), zzhdxVar), zzhneVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhtb zzf(zzhge zzhgeVar) throws GeneralSecurityException {
        if (zzhge.zza.equals(zzhgeVar)) {
            return zzhtb.TINK;
        }
        if (zzhge.zzb.equals(zzhgeVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhge.zzc.equals(zzhgeVar)) {
            return zzhtb.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhgeVar.toString()));
    }

    private static zzhge zzg(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhge.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhge.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtbVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhge.zzb;
    }
}
