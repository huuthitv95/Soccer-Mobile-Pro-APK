package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhxt {
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

    static {
        zziam zziamVarZza = zzhnq.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zziamVarZza;
        zziam zziamVarZza2 = zzhnq.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zziamVarZza2;
        zzd = zzhmq.zzd(zzhxs.zza, zzhut.class, zzhnf.class);
        zze = zzhmn.zzd(zzhxn.zza, zziamVarZza, zzhnf.class);
        zzf = zzhlm.zzd(zzhxo.zza, zzhva.class, zzhne.class);
        zzg = zzhlj.zzd(zzhxp.zza, zziamVarZza2, zzhne.class);
        zzh = zzhlm.zzd(zzhxq.zza, zzhuu.class, zzhne.class);
        zzi = zzhlj.zzd(zzhxr.zza, zziamVarZza, zzhne.class);
        zzhkx zzhkxVarZza = zzhky.zza();
        zzhkxVarZza.zza(zzhtb.RAW, zzhus.zzd);
        zzhkxVarZza.zza(zzhtb.TINK, zzhus.zza);
        zzhkxVarZza.zza(zzhtb.CRUNCHY, zzhus.zzb);
        zzhkxVarZza.zza(zzhtb.LEGACY, zzhus.zzc);
        zzj = zzhkxVarZza.zzb();
    }

    public static void zza(zzhmj zzhmjVar) throws GeneralSecurityException {
        zzhmjVar.zzd(zzd);
        zzhmjVar.zze(zze);
        zzhmjVar.zzb(zzf);
        zzhmjVar.zzc(zzg);
        zzhmjVar.zzb(zzh);
        zzhmjVar.zzc(zzi);
    }

    static /* synthetic */ zzhnf zzb(zzhut zzhutVar) {
        zzhsh zzhshVarZze = zzhsi.zze();
        zzhshVarZze.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzhshVarZze.zzb(zzhrq.zzc().zzaM());
        zzhshVarZze.zzc((zzhtb) zzj.zzb(zzhutVar.zzc()));
        return zzhnf.zza((zzhsi) zzhshVarZze.zzbu());
    }

    static /* synthetic */ zzhut zzc(zzhnf zzhnfVar) throws GeneralSecurityException {
        if (!zzhnfVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            String strZza = zzhnfVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            if (zzhrq.zzb(zzhnfVar.zzc().zzb(), zzidb.zza()).zza() == 0) {
                return zzhut.zzb((zzhus) zzj.zzc(zzhnfVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg e) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e);
        }
    }

    static /* synthetic */ zzhva zze(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            String strZzg = zzhneVar.zzg();
            String.valueOf(strZzg);
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzhru zzhruVarZzc = zzhru.zzc(zzhneVar.zzb(), zzidb.zza());
            if (zzhruVarZzc.zza() == 0) {
                return zzhva.zzc((zzhus) zzj.zzc(zzhneVar.zzd()), zziam.zza(zzhruVarZzc.zzb().zzA()), zzhneVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    static /* synthetic */ zzhne zzf(zzhuu zzhuuVar, zzhdx zzhdxVar) {
        zzhrr zzhrrVarZze = zzhrs.zze();
        zzhrrVarZze.zzb(zzh(zzhuuVar.zze()));
        byte[] bArrZzc = zzhuuVar.zzf().zzc(zzhdxVar);
        zzhrrVarZze.zza(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhne.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzhrs) zzhrrVarZze.zzbu()).zzaM(), zzhse.ASYMMETRIC_PRIVATE, (zzhtb) zzj.zzb(zzhuuVar.zzd().zzc()), zzhuuVar.zze().zzb());
    }

    static /* synthetic */ zzhuu zzg(zzhne zzhneVar, zzhdx zzhdxVar) throws GeneralSecurityException {
        if (!zzhneVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            String strZzg = zzhneVar.zzg();
            String.valueOf(strZzg);
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzhrs zzhrsVarZzd = zzhrs.zzd(zzhneVar.zzb(), zzidb.zza());
            if (zzhrsVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhru zzhruVarZzc = zzhrsVarZzd.zzc();
            if (zzhruVarZzc.zza() == 0) {
                return zzhuu.zzc(zzhva.zzc((zzhus) zzj.zzc(zzhneVar.zzd()), zziam.zza(zzhruVarZzc.zzb().zzA()), zzhneVar.zze()), zziao.zza(zzhrsVarZzd.zzb().zzA(), zzhdxVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzieg unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static zzhru zzh(zzhva zzhvaVar) {
        zzhrt zzhrtVarZzd = zzhru.zzd();
        byte[] bArrZzc = zzhvaVar.zzd().zzc();
        zzhrtVarZzd.zza(zzicn.zzt(bArrZzc, 0, bArrZzc.length));
        return (zzhru) zzhrtVarZzd.zzbu();
    }
}
