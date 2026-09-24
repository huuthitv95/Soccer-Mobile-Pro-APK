package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhxk {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zziam zzc;
    private static final zzhmq zzd;
    private static final zzhmn zze;
    private static final zzhlm zzf;
    private static final zzhlj zzg;
    private static final zzhlm zzh;
    private static final zzhlj zzi;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zziamVarZza;
        zziam zziamVarZza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zziamVarZza2;
        zzd = zzhmq.zzd(zzhxj.zza, zzhuj.class, zzhnf.class);
        zze = zzhmn.zzd(zzhxe.zza, zziamVarZza, zzhnf.class);
        zzf = zzhlm.zzd(zzhxf.zza, zzhun.class, zzhne.class);
        zzg = zzhlj.zzd(zzhxg.zza, zziamVarZza2, zzhne.class);
        zzh = zzhlm.zzd(zzhxh.zza, zzhul.class, zzhne.class);
        zzi = zzhlj.zzd(zzhxi.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzd);
        zzhmjVar.zze(zze);
        zzhmjVar.zzb(zzf);
        zzhmjVar.zzc(zzg);
        zzhmjVar.zzb(zzh);
        zzhmjVar.zzc(zzi);
    }

    static /* synthetic */ zzhnf zzb(zzhuj zzhujVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzhrg zzhrgVarZzc = zzhrh.zzc();
        zzhrgVarZzc.zza(zzl(zzhujVar));
        zzhshVarZze.zzb(((zzhrh) zzhrgVarZzc.zzbu()).zzaM());
        zzhshVarZze.zzc(zzh(zzhujVar.zzf()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhuj zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhrh zzhrhVarZzb = zzhrh.zzb(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhue zzhueVarZzb = zzhuj.zzb();
            zzhueVarZzb.zzc(zzi(zzhrhVarZzb.zza().zza()));
            zzhueVarZzb.zza(zzo(zzhrhVarZzb.zza().zzh()));
            zzhueVarZzb.zzb(zzn(zzhrhVarZzb.zza().zzg()));
            zzhueVarZzb.zzd(zzj(zzhnfVar.zzc().zzc()));
            return zzhueVarZzb.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhun zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            String strZzg = zzhneVar.zzg();
            String.valueOf(strZzg);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzhrn zzhrnVarZze = zzhrn.zze(zzhneVar.zzb(), zzidb.zza());
            if (zzhrnVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhue zzhueVarZzb = zzhuj.zzb();
            zzhueVarZzb.zzc(zzi(zzhrnVarZze.zzb().zza()));
            zzhueVarZzb.zza(zzo(zzhrnVarZze.zzb().zzh()));
            zzhueVarZzb.zzb(zzn(zzhrnVarZze.zzb().zzg()));
            zzhueVarZzb.zzd(zzj(zzhneVar.zzd()));
            zzhuj zzhujVarZze = zzhueVarZzb.zze();
            zzhum zzhumVarZzc = zzhun.zzc();
            zzhumVarZzc.zza(zzhujVarZze);
            zzhumVarZzc.zzb(new ECPoint(new BigInteger(1, zzhrnVarZze.zzc().zzA()), new BigInteger(1, zzhrnVarZze.zzd().zzA())));
            zzhumVarZzc.zzc(zzhneVar.zze());
            return zzhumVarZzc.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    static /* synthetic */ zzhne zzf(zzhul zzhulVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        int iZzk = zzk(zzhulVar.zzd().zzd());
        zzhrk zzhrkVarZze = zzhrl.zze();
        zzhrkVarZze.zza(zzm(zzhulVar.zze()));
        byte[] bArrZzb = zzhkk.zzb(zzhulVar.zzf().zzb(zzhdxVar), iZzk);
        zzicn zzicnVar = zzicn.zza;
        zzhrkVarZze.zzb(zzicn.zzt(bArrZzb, 0, bArrZzb.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzhrl) zzhrkVarZze.zzbu()).zzaM(), zzhse.ASYMMETRIC_PRIVATE, zzh(zzhulVar.zzd().zzf()), zzhulVar.zze().zzb());
    }

    static /* synthetic */ zzhul zzg(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            String strZzg = zzhneVar.zzg();
            String.valueOf(strZzg);
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzhrl zzhrlVarZzd = zzhrl.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzhrlVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhrn zzhrnVarZzb = zzhrlVarZzd.zzb();
            if (zzhrnVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhue zzhueVarZzb = zzhuj.zzb();
            zzhueVarZzb.zzc(zzi(zzhrnVarZzb.zzb().zza()));
            zzhueVarZzb.zza(zzo(zzhrnVarZzb.zzb().zzh()));
            zzhueVarZzb.zzb(zzn(zzhrnVarZzb.zzb().zzg()));
            zzhueVarZzb.zzd(zzj(zzhneVar.zzd()));
            zzhuj zzhujVarZze = zzhueVarZzb.zze();
            zzhum zzhumVarZzc = zzhun.zzc();
            zzhumVarZzc.zza(zzhujVarZze);
            zzhumVarZzc.zzb(new ECPoint(new BigInteger(1, zzhrnVarZzb.zzc().zzA()), new BigInteger(1, zzhrnVarZzb.zzd().zzA())));
            zzhumVarZzc.zzc(zzhneVar.zze());
            zzhun zzhunVarZzd = zzhumVarZzc.zzd();
            zzhuk zzhukVarZzc = zzhul.zzc();
            zzhukVarZzc.zza(zzhunVarZzd);
            zzhukVarZzc.zzb(zzian.zza(new BigInteger(1, zzhrlVarZzd.zzc().zzA()), zzhdxVar));
            return zzhukVarZzc.zzc();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static zzhtb zzh(zzhui zzhuiVar) throws GeneralSecurityException {
        if (zzhui.zza.equals(zzhuiVar)) {
            return zzhtb.TINK;
        }
        if (zzhui.zzb.equals(zzhuiVar)) {
            return zzhtb.CRUNCHY;
        }
        if (zzhui.zzd.equals(zzhuiVar)) {
            return zzhtb.RAW;
        }
        if (zzhui.zzc.equals(zzhuiVar)) {
            return zzhtb.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhuiVar.toString()));
    }

    private static zzhug zzi(zzhrw zzhrwVar) throws GeneralSecurityException {
        int iOrdinal = zzhrwVar.ordinal();
        if (iOrdinal == 2) {
            return zzhug.zzb;
        }
        if (iOrdinal == 3) {
            return zzhug.zza;
        }
        if (iOrdinal == 4) {
            return zzhug.zzc;
        }
        int iZza = zzhrwVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhui zzj(zzhtb zzhtbVar) throws GeneralSecurityException {
        int iOrdinal = zzhtbVar.ordinal();
        if (iOrdinal == 1) {
            return zzhui.zza;
        }
        if (iOrdinal == 2) {
            return zzhui.zzc;
        }
        if (iOrdinal == 3) {
            return zzhui.zzd;
        }
        if (iOrdinal == 4) {
            return zzhui.zzb;
        }
        int iZza = zzhtbVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static int zzk(zzhuf zzhufVar) throws GeneralSecurityException {
        if (zzhuf.zza.equals(zzhufVar)) {
            return 33;
        }
        if (zzhuf.zzb.equals(zzhufVar)) {
            return 49;
        }
        if (zzhuf.zzc.equals(zzhufVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhufVar.toString()));
    }

    private static zzhrj zzl(zzhuj zzhujVar) throws GeneralSecurityException {
        zzhrw zzhrwVar;
        int i;
        zzhri zzhriVarZzb = zzhrj.zzb();
        zzhug zzhugVarZze = zzhujVar.zze();
        if (zzhug.zza.equals(zzhugVarZze)) {
            zzhrwVar = zzhrw.SHA256;
        } else if (zzhug.zzb.equals(zzhugVarZze)) {
            zzhrwVar = zzhrw.SHA384;
        } else {
            if (!zzhug.zzc.equals(zzhugVarZze)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zzhugVarZze.toString()));
            }
            zzhrwVar = zzhrw.SHA512;
        }
        zzhriVarZzb.zza(zzhrwVar);
        zzhuf zzhufVarZzd = zzhujVar.zzd();
        int i2 = 4;
        if (zzhuf.zza.equals(zzhufVarZzd)) {
            i = 4;
        } else if (zzhuf.zzb.equals(zzhufVarZzd)) {
            i = 5;
        } else {
            if (!zzhuf.zzc.equals(zzhufVarZzd)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzhufVarZzd.toString()));
            }
            i = 6;
        }
        zzhriVarZzb.zzb(i);
        zzhuh zzhuhVarZzc = zzhujVar.zzc();
        if (zzhuh.zza.equals(zzhuhVarZzc)) {
            i2 = 3;
        } else if (!zzhuh.zzb.equals(zzhuhVarZzc)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzhuhVarZzc.toString()));
        }
        zzhriVarZzb.zzc(i2);
        return (zzhrj) zzhriVarZzb.zzbu();
    }

    private static zzhrn zzm(zzhun zzhunVar) throws GeneralSecurityException {
        int iZzk = zzk(zzhunVar.zzf().zzd());
        ECPoint eCPointZzd = zzhunVar.zzd();
        zzhrm zzhrmVarZzg = zzhrn.zzg();
        zzhrmVarZzg.zza(zzl(zzhunVar.zzf()));
        byte[] bArrZzb = zzhkk.zzb(eCPointZzd.getAffineX(), iZzk);
        zzicn zzicnVar = zzicn.zza;
        zzhrmVarZzg.zzb(zzicn.zzt(bArrZzb, 0, bArrZzb.length));
        byte[] bArrZzb2 = zzhkk.zzb(eCPointZzd.getAffineY(), iZzk);
        zzhrmVarZzg.zzc(zzicn.zzt(bArrZzb2, 0, bArrZzb2.length));
        return (zzhrn) zzhrmVarZzg.zzbu();
    }

    private static zzhuf zzn(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return zzhuf.zza;
        }
        if (i2 == 3) {
            return zzhuf.zzb;
        }
        if (i2 == 4) {
            return zzhuf.zzc;
        }
        int iZza = zzhrv.zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 35);
        sb.append("Unable to parse EllipticCurveType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhuh zzo(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return zzhuh.zza;
        }
        if (i2 == 2) {
            return zzhuh.zzb;
        }
        int iZza = zzhro.zza(i);
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 40);
        sb.append("Unable to parse EcdsaSignatureEncoding: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }
}
