package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhye {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zziam zzc;
    private static final zzhmq zzd;
    private static final zzhmn zze;
    private static final zzhlm zzf;
    private static final zzhlj zzg;
    private static final zzhlm zzh;
    private static final zzhlj zzi;
    private static final zzhky zzj;
    private static final zzhky zzk;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zziamVarZza;
        zziam zziamVarZza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zziamVarZza2;
        zzd = zzhmq.zzd(zzhyd.zza, zzhwf.class, zzhnf.class);
        zze = zzhmn.zzd(zzhxy.zza, zziamVarZza, zzhnf.class);
        zzf = zzhlm.zzd(zzhxz.zza, zzhwj.class, zzhne.class);
        zzg = zzhlj.zzd(zzhya.zza, zziamVarZza2, zzhne.class);
        zzh = zzhlm.zzd(zzhyb.zza, zzhwh.class, zzhne.class);
        zzi = zzhlj.zzd(zzhyc.zza, zziamVarZza, zzhne.class);
        zzhkx zzhkxVarZza = zzhky.zza();
        zzhkxVarZza.zza(zzhtb.RAW, zzhwe.zzd);
        zzhkxVarZza.zza(zzhtb.TINK, zzhwe.zza);
        zzhkxVarZza.zza(zzhtb.CRUNCHY, zzhwe.zzb);
        zzhkxVarZza.zza(zzhtb.LEGACY, zzhwe.zzc);
        zzj = zzhkxVarZza.zzb();
        zzhkx zzhkxVarZza2 = zzhky.zza();
        zzhkxVarZza2.zza(zzhrw.SHA256, zzhwd.zza);
        zzhkxVarZza2.zza(zzhrw.SHA384, zzhwd.zzb);
        zzhkxVarZza2.zza(zzhrw.SHA512, zzhwd.zzc);
        zzk = zzhkxVarZza2.zzb();
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzd);
        zzhmjVar.zze(zze);
        zzhmjVar.zzb(zzf);
        zzhmjVar.zzc(zzg);
        zzhmjVar.zzb(zzh);
        zzhmjVar.zzc(zzi);
    }

    static /* synthetic */ zzhnf zzb(zzhwf zzhwfVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzhte zzhteVarZze = zzhtf.zze();
        zzhteVarZze.zza(zzh(zzhwfVar));
        zzhteVarZze.zzb(zzhwfVar.zzc());
        byte[] bArrZza = zzhkk.zza(zzhwfVar.zzd());
        zzicn zzicnVar = zzicn.zza;
        zzhteVarZze.zzc(zzicn.zzt(bArrZza, 0, bArrZza.length));
        zzhshVarZze.zzb(((zzhtf) zzhteVarZze.zzbu()).zzaM());
        zzhshVarZze.zzc((zzhtb) zzj.zzb(zzhwfVar.zze()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhwf zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhtf zzhtfVarZzd = zzhtf.zzd(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhwc zzhwcVarZzb = zzhwf.zzb();
            zzhwcVarZzb.zzd((zzhwd) zzk.zzc(zzhtfVarZzd.zza().zza()));
            zzhwcVarZzb.zzb(new BigInteger(1, zzhtfVarZzd.zzc().zzA()));
            zzhwcVarZzb.zza(zzhtfVarZzd.zzb());
            zzhwcVarZzb.zzc((zzhwe) zzj.zzc(zzhnfVar.zzc().zzc()));
            return zzhwcVarZzb.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhwj zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            String strZzg = zzhneVar.zzg();
            String.valueOf(strZzg);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzhtl zzhtlVarZze = zzhtl.zze(zzhneVar.zzb(), zzidb.zza());
            if (zzhtlVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhtlVarZze.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            zzhwc zzhwcVarZzb = zzhwf.zzb();
            zzhwcVarZzb.zzd((zzhwd) zzk.zzc(zzhtlVarZze.zzb().zza()));
            zzhwcVarZzb.zzb(new BigInteger(1, zzhtlVarZze.zzd().zzA()));
            zzhwcVarZzb.zza(iBitLength);
            zzhwcVarZzb.zzc((zzhwe) zzj.zzc(zzhneVar.zzd()));
            zzhwf zzhwfVarZze = zzhwcVarZzb.zze();
            zzhwi zzhwiVarZzc = zzhwj.zzc();
            zzhwiVarZzc.zza(zzhwfVarZze);
            zzhwiVarZzc.zzb(bigInteger);
            zzhwiVarZzc.zzc(zzhneVar.zze());
            return zzhwiVarZzc.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    static /* synthetic */ zzhne zzf(zzhwh zzhwhVar, zzhdx zzhdxVar) {
        zzhti zzhtiVarZzk = zzhtj.zzk();
        zzhtiVarZzk.zza(0);
        zzhtiVarZzk.zzb(zzi(zzhwhVar.zze()));
        byte[] bArrZza = zzhkk.zza(zzhwhVar.zzi().zzb(zzhdxVar));
        zzicn zzicnVar = zzicn.zza;
        zzhtiVarZzk.zzc(zzicn.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhkk.zza(zzhwhVar.zzf().zzb(zzhdxVar));
        zzhtiVarZzk.zzd(zzicn.zzt(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhkk.zza(zzhwhVar.zzh().zzb(zzhdxVar));
        zzhtiVarZzk.zze(zzicn.zzt(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhkk.zza(zzhwhVar.zzj().zzb(zzhdxVar));
        zzhtiVarZzk.zzf(zzicn.zzt(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhkk.zza(zzhwhVar.zzk().zzb(zzhdxVar));
        zzhtiVarZzk.zzg(zzicn.zzt(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhkk.zza(zzhwhVar.zzl().zzb(zzhdxVar));
        zzhtiVarZzk.zzh(zzicn.zzt(bArrZza6, 0, bArrZza6.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhtj) zzhtiVarZzk.zzbu()).zzaM(), zzhse.ASYMMETRIC_PRIVATE, (zzhtb) zzj.zzb(zzhwhVar.zzd().zze()), zzhwhVar.zze().zzb());
    }

    static /* synthetic */ zzhwh zzg(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            String strZzg = zzhneVar.zzg();
            String.valueOf(strZzg);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzhtj zzhtjVarZzj = zzhtj.zzj(zzhneVar.zzb(), zzidb.zza());
            if (zzhtjVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhtl zzhtlVarZzb = zzhtjVarZzj.zzb();
            if (zzhtlVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhtlVarZzb.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhtlVarZzb.zzd().zzA());
            zzhwc zzhwcVarZzb = zzhwf.zzb();
            zzhwcVarZzb.zzd((zzhwd) zzk.zzc(zzhtlVarZzb.zzb().zza()));
            zzhwcVarZzb.zzb(bigInteger2);
            zzhwcVarZzb.zza(iBitLength);
            zzhwcVarZzb.zzc((zzhwe) zzj.zzc(zzhneVar.zzd()));
            zzhwf zzhwfVarZze = zzhwcVarZzb.zze();
            zzhwi zzhwiVarZzc = zzhwj.zzc();
            zzhwiVarZzc.zza(zzhwfVarZze);
            zzhwiVarZzc.zzb(bigInteger);
            zzhwiVarZzc.zzc(zzhneVar.zze());
            zzhwj zzhwjVarZzd = zzhwiVarZzc.zzd();
            zzhwg zzhwgVarZzc = zzhwh.zzc();
            zzhwgVarZzc.zza(zzhwjVarZzd);
            zzhwgVarZzc.zzb(zzj(zzhtjVarZzj.zzd(), zzhdxVar), zzj(zzhtjVarZzj.zze(), zzhdxVar));
            zzhwgVarZzc.zzc(zzj(zzhtjVarZzj.zzc(), zzhdxVar));
            zzhwgVarZzc.zzd(zzj(zzhtjVarZzj.zzg(), zzhdxVar), zzj(zzhtjVarZzj.zzh(), zzhdxVar));
            zzhwgVarZzc.zze(zzj(zzhtjVarZzj.zzi(), zzhdxVar));
            return zzhwgVarZzc.zzf();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static zzhth zzh(zzhwf zzhwfVar) throws GeneralSecurityException {
        zzhtg zzhtgVarZzb = zzhth.zzb();
        zzhtgVarZzb.zza((zzhrw) zzk.zzb(zzhwfVar.zzf()));
        return (zzhth) zzhtgVarZzb.zzbu();
    }

    private static zzhtl zzi(zzhwj zzhwjVar) throws GeneralSecurityException {
        zzhtk zzhtkVarZzg = zzhtl.zzg();
        zzhtkVarZzg.zza(zzh(zzhwjVar.zzf()));
        byte[] bArrZza = zzhkk.zza(zzhwjVar.zzd());
        zzicn zzicnVar = zzicn.zza;
        zzhtkVarZzg.zzb(zzicn.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhkk.zza(zzhwjVar.zzf().zzd());
        zzhtkVarZzg.zzc(zzicn.zzt(bArrZza2, 0, bArrZza2.length));
        return (zzhtl) zzhtkVarZzg.zzbu();
    }

    private static zzian zzj(zzicn zzicnVar, zzhdx zzhdxVar) {
        return zzian.zza(new BigInteger(1, zzicnVar.zzA()), zzhdxVar);
    }
}
