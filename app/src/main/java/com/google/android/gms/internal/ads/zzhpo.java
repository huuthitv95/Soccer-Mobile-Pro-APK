package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhpo {
    public static final /* synthetic */ int zza = 0;
    private static final zziam zzb;
    private static final zzhky zzc;
    private static final zzhky zzd;
    private static final zzhmq zze;
    private static final zzhmn zzf;
    private static final zzhlm zzg;
    private static final zzhlj zzh;

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zziamVarZza;
        zzhkx zzhkxVarZza = zzhky.zza();
        zzhkxVarZza.zza(zzhtb.RAW, zzhom.zzd);
        zzhkxVarZza.zza(zzhtb.TINK, zzhom.zza);
        zzhkxVarZza.zza(zzhtb.LEGACY, zzhom.zzc);
        zzhkxVarZza.zza(zzhtb.CRUNCHY, zzhom.zzb);
        zzc = zzhkxVarZza.zzb();
        zzhkx zzhkxVarZza2 = zzhky.zza();
        zzhkxVarZza2.zza(zzhrw.SHA1, zzhol.zza);
        zzhkxVarZza2.zza(zzhrw.SHA224, zzhol.zzb);
        zzhkxVarZza2.zza(zzhrw.SHA256, zzhol.zzc);
        zzhkxVarZza2.zza(zzhrw.SHA384, zzhol.zzd);
        zzhkxVarZza2.zza(zzhrw.SHA512, zzhol.zze);
        zzd = zzhkxVarZza2.zzb();
        zze = zzhmq.zzd(zzhpn.zza, zzhon.class, zzhnf.class);
        zzf = zzhmn.zzd(zzhpk.zza, zziamVarZza, zzhnf.class);
        zzg = zzhlm.zzd(zzhpl.zza, zzhoe.class, zzhne.class);
        zzh = zzhlj.zzd(zzhpm.zza, zziamVarZza, zzhne.class);
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zze);
        zzhmjVar.zze(zzf);
        zzhmjVar.zzb(zzg);
        zzhmjVar.zzc(zzh);
    }

    static /* synthetic */ zzhnf zzb(zzhon zzhonVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhrz zzhrzVarZze = zzhsa.zze();
        zzhrzVarZze.zza(zzf(zzhonVar));
        zzhrzVarZze.zzb(zzhonVar.zzc());
        zzhshVarZze.zzb(((zzhsa) zzhrzVarZze.zzbu()).zzaM());
        zzhshVarZze.zzc((zzhtb) zzc.zzb(zzhonVar.zzf()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhon zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhsa zzhsaVarZzd = zzhsa.zzd(zzhnfVar.zzc().zzb(), zzidb.zza());
            if (zzhsaVarZzd.zzc() != 0) {
                int iZzc = zzhsaVarZzd.zzc();
                StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(iZzc);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhok zzhokVarZzb = zzhon.zzb();
            zzhokVarZzb.zza(zzhsaVarZzd.zzb());
            zzhokVarZzb.zzb(zzhsaVarZzd.zza().zzb());
            zzhokVarZzb.zzd((zzhol) zzd.zzc(zzhsaVarZzd.zza().zza()));
            zzhokVarZzb.zzc((zzhom) zzc.zzc(zzhnfVar.zzc().zzc()));
            return zzhokVarZzb.zze();
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhne zzd(zzhoe zzhoeVar, zzhdx zzhdxVar) {
        zzhrx zzhrxVarZze = zzhry.zze();
        zzhrxVarZze.zza(zzf(zzhoeVar.zzf()));
        byte[] bArrZzc = zzhoeVar.zzd().zzc(zzhdxVar);
        zzhrxVarZze.zzb(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhry) zzhrxVarZze.zzbu()).zzaM(), zzhse.SYMMETRIC, (zzhtb) zzc.zzb(zzhoeVar.zzf().zzf()), zzhoeVar.zzb());
    }

    static /* synthetic */ zzhoe zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhry zzhryVarZzd = zzhry.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzhryVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhok zzhokVarZzb = zzhon.zzb();
            zzhokVarZzb.zza(zzhryVarZzd.zzc().zzb());
            zzhokVarZzb.zzb(zzhryVarZzd.zzb().zzb());
            zzhokVarZzb.zzd((zzhol) zzd.zzc(zzhryVarZzd.zzb().zza()));
            zzhokVarZzb.zzc((zzhom) zzc.zzc(zzhneVar.zzd()));
            zzhon zzhonVarZze = zzhokVarZzb.zze();
            zzhod zzhodVarZzc = zzhoe.zzc();
            zzhodVarZzc.zza(zzhonVarZze);
            zzhodVarZzc.zzb(zziao.zza(zzhryVarZzd.zzc().zzA(), zzhdxVar));
            zzhodVarZzc.zzc(zzhneVar.zze());
            return zzhodVarZzc.zzd();
        } catch (zzieg | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhsc zzf(zzhon zzhonVar) throws GeneralSecurityException {
        zzhsb zzhsbVarZzc = zzhsc.zzc();
        zzhsbVarZzc.zzb(zzhonVar.zzd());
        zzhsbVarZzc.zza((zzhrw) zzd.zzb(zzhonVar.zzg()));
        return (zzhsc) zzhsbVarZzc.zzbu();
    }
}
