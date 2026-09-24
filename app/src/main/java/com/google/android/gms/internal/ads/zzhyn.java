package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhyn {
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
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zziamVarZza;
        zziam zziamVarZza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zziamVarZza2;
        zzd = zzhmq.zzd(zzhym.zza, zzhwr.class, zzhnf.class);
        zze = zzhmn.zzd(zzhyh.zza, zziamVarZza, zzhnf.class);
        zzf = zzhlm.zzd(zzhyi.zza, zzhwv.class, zzhne.class);
        zzg = zzhlj.zzd(zzhyj.zza, zziamVarZza2, zzhne.class);
        zzh = zzhlm.zzd(zzhyk.zza, zzhwt.class, zzhne.class);
        zzi = zzhlj.zzd(zzhyl.zza, zziamVarZza, zzhne.class);
        zzhkx zzhkxVarZza = zzhky.zza();
        zzhkxVarZza.zza(zzhtb.RAW, zzhwq.zzd);
        zzhkxVarZza.zza(zzhtb.TINK, zzhwq.zza);
        zzhkxVarZza.zza(zzhtb.CRUNCHY, zzhwq.zzb);
        zzhkxVarZza.zza(zzhtb.LEGACY, zzhwq.zzc);
        zzj = zzhkxVarZza.zzb();
        zzhkx zzhkxVarZza2 = zzhky.zza();
        zzhkxVarZza2.zza(zzhrw.SHA256, zzhwp.zza);
        zzhkxVarZza2.zza(zzhrw.SHA384, zzhwp.zzb);
        zzhkxVarZza2.zza(zzhrw.SHA512, zzhwp.zzc);
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

    static /* synthetic */ zzhnf zzb(zzhwr zzhwrVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzhtm zzhtmVarZze = zzhtn.zze();
        zzhtmVarZze.zza(zzh(zzhwrVar));
        zzhtmVarZze.zzb(zzhwrVar.zzc());
        byte[] bArrZza = zzhkk.zza(zzhwrVar.zzd());
        zzicn zzicnVar = zzicn.zza;
        zzhtmVarZze.zzc(zzicn.zzt(bArrZza, 0, bArrZza.length));
        zzhshVarZze.zzb(((zzhtn) zzhtmVarZze.zzbu()).zzaM());
        zzhshVarZze.zzc((zzhtb) zzj.zzb(zzhwrVar.zze()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhwr zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhtn zzhtnVarZzd = zzhtn.zzd(zzhnfVar.zzc().zzb(), zzidb.zza());
            zzhwo zzhwoVarZzb = zzhwr.zzb();
            zzhky zzhkyVar = zzk;
            zzhwoVarZzb.zzd((zzhwp) zzhkyVar.zzc(zzhtnVarZzd.zza().zza()));
            zzhwoVarZzb.zze((zzhwp) zzhkyVar.zzc(zzhtnVarZzd.zza().zzb()));
            zzhwoVarZzb.zzb(new BigInteger(1, zzhtnVarZzd.zzc().zzA()));
            zzhwoVarZzb.zza(zzhtnVarZzd.zzb());
            zzhwoVarZzb.zzf(zzhtnVarZzd.zza().zzc());
            zzhwoVarZzb.zzc((zzhwq) zzj.zzc(zzhnfVar.zzc().zzc()));
            return zzhwoVarZzb.zzg();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhwv zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            String strZzg = zzhneVar.zzg();
            String.valueOf(strZzg);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzhtt zzhttVarZze = zzhtt.zze(zzhneVar.zzb(), zzidb.zza());
            if (zzhttVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhttVarZze.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            zzhwo zzhwoVarZzb = zzhwr.zzb();
            zzhky zzhkyVar = zzk;
            zzhwoVarZzb.zzd((zzhwp) zzhkyVar.zzc(zzhttVarZze.zzb().zza()));
            zzhwoVarZzb.zze((zzhwp) zzhkyVar.zzc(zzhttVarZze.zzb().zzb()));
            zzhwoVarZzb.zzb(new BigInteger(1, zzhttVarZze.zzd().zzA()));
            zzhwoVarZzb.zza(iBitLength);
            zzhwoVarZzb.zzf(zzhttVarZze.zzb().zzc());
            zzhwoVarZzb.zzc((zzhwq) zzj.zzc(zzhneVar.zzd()));
            zzhwr zzhwrVarZzg = zzhwoVarZzb.zzg();
            zzhwu zzhwuVarZzc = zzhwv.zzc();
            zzhwuVarZzc.zza(zzhwrVarZzg);
            zzhwuVarZzc.zzb(bigInteger);
            zzhwuVarZzc.zzc(zzhneVar.zze());
            return zzhwuVarZzc.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    static /* synthetic */ zzhne zzf(zzhwt zzhwtVar, zzhdx zzhdxVar) {
        zzhtq zzhtqVarZzk = zzhtr.zzk();
        zzhtqVarZzk.zza(0);
        zzhtqVarZzk.zzb(zzi(zzhwtVar.zze()));
        byte[] bArrZza = zzhkk.zza(zzhwtVar.zzi().zzb(zzhdxVar));
        zzicn zzicnVar = zzicn.zza;
        zzhtqVarZzk.zzc(zzicn.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhkk.zza(zzhwtVar.zzf().zzb(zzhdxVar));
        zzhtqVarZzk.zzd(zzicn.zzt(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhkk.zza(zzhwtVar.zzh().zzb(zzhdxVar));
        zzhtqVarZzk.zze(zzicn.zzt(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhkk.zza(zzhwtVar.zzj().zzb(zzhdxVar));
        zzhtqVarZzk.zzf(zzicn.zzt(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhkk.zza(zzhwtVar.zzk().zzb(zzhdxVar));
        zzhtqVarZzk.zzg(zzicn.zzt(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhkk.zza(zzhwtVar.zzl().zzb(zzhdxVar));
        zzhtqVarZzk.zzh(zzicn.zzt(bArrZza6, 0, bArrZza6.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhtr) zzhtqVarZzk.zzbu()).zzaM(), zzhse.ASYMMETRIC_PRIVATE, (zzhtb) zzj.zzb(zzhwtVar.zzd().zze()), zzhwtVar.zze().zzb());
    }

    static /* synthetic */ zzhwt zzg(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            String strZzg = zzhneVar.zzg();
            String.valueOf(strZzg);
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzhtr zzhtrVarZzj = zzhtr.zzj(zzhneVar.zzb(), zzidb.zza());
            if (zzhtrVarZzj.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhtt zzhttVarZzb = zzhtrVarZzj.zzb();
            if (zzhttVarZzb.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzhttVarZzb.zzc().zzA());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzhttVarZzb.zzd().zzA());
            zzhwo zzhwoVarZzb = zzhwr.zzb();
            zzhky zzhkyVar = zzk;
            zzhwoVarZzb.zzd((zzhwp) zzhkyVar.zzc(zzhttVarZzb.zzb().zza()));
            zzhwoVarZzb.zze((zzhwp) zzhkyVar.zzc(zzhttVarZzb.zzb().zzb()));
            zzhwoVarZzb.zzb(bigInteger2);
            zzhwoVarZzb.zza(iBitLength);
            zzhwoVarZzb.zzf(zzhttVarZzb.zzb().zzc());
            zzhwoVarZzb.zzc((zzhwq) zzj.zzc(zzhneVar.zzd()));
            zzhwr zzhwrVarZzg = zzhwoVarZzb.zzg();
            zzhwu zzhwuVarZzc = zzhwv.zzc();
            zzhwuVarZzc.zza(zzhwrVarZzg);
            zzhwuVarZzc.zzb(bigInteger);
            zzhwuVarZzc.zzc(zzhneVar.zze());
            zzhwv zzhwvVarZzd = zzhwuVarZzc.zzd();
            zzhws zzhwsVarZzc = zzhwt.zzc();
            zzhwsVarZzc.zza(zzhwvVarZzd);
            zzhwsVarZzc.zzb(zzj(zzhtrVarZzj.zzd(), zzhdxVar), zzj(zzhtrVarZzj.zze(), zzhdxVar));
            zzhwsVarZzc.zzc(zzj(zzhtrVarZzj.zzc(), zzhdxVar));
            zzhwsVarZzc.zzd(zzj(zzhtrVarZzj.zzg(), zzhdxVar), zzj(zzhtrVarZzj.zzh(), zzhdxVar));
            zzhwsVarZzc.zze(zzj(zzhtrVarZzj.zzi(), zzhdxVar));
            return zzhwsVarZzc.zzf();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static zzhtp zzh(zzhwr zzhwrVar) throws GeneralSecurityException {
        zzhto zzhtoVarZzd = zzhtp.zzd();
        zzhky zzhkyVar = zzk;
        zzhtoVarZzd.zza((zzhrw) zzhkyVar.zzb(zzhwrVar.zzf()));
        zzhtoVarZzd.zzb((zzhrw) zzhkyVar.zzb(zzhwrVar.zzg()));
        zzhtoVarZzd.zzc(zzhwrVar.zzh());
        return (zzhtp) zzhtoVarZzd.zzbu();
    }

    private static zzhtt zzi(zzhwv zzhwvVar) throws GeneralSecurityException {
        zzhts zzhtsVarZzg = zzhtt.zzg();
        zzhtsVarZzg.zzb(zzh(zzhwvVar.zzf()));
        byte[] bArrZza = zzhkk.zza(zzhwvVar.zzd());
        zzicn zzicnVar = zzicn.zza;
        zzhtsVarZzg.zzc(zzicn.zzt(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhkk.zza(zzhwvVar.zzf().zzd());
        zzhtsVarZzg.zzd(zzicn.zzt(bArrZza2, 0, bArrZza2.length));
        zzhtsVarZzg.zza(0);
        return (zzhtt) zzhtsVarZzg.zzbu();
    }

    private static zzian zzj(zzicn zzicnVar, zzhdx zzhdxVar) {
        return zzian.zza(new BigInteger(1, zzicnVar.zzA()), zzhdxVar);
    }
}
