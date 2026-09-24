package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziac implements zzhds {
    private static final byte[] zza = {0};
    private final zzhps zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zziac(zzhns zzhnsVar) throws GeneralSecurityException {
        this.zzb = zzhzz.zzb(zzhpq.zzc(zzhpr.zzb(zzhnsVar.zzf().zzc()), zzhnsVar.zzd()));
        this.zzc = zzhnsVar.zzf().zzd();
        this.zzd = zzhnsVar.zze().zzc();
        if (zzhnsVar.zzf().zzf().equals(zzhny.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzhds zza(zzhns zzhnsVar) throws GeneralSecurityException {
        return new zziac(zzhnsVar);
    }

    public static zzhds zzb(zzhoe zzhoeVar) throws GeneralSecurityException {
        return new zziac(zzhoeVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzhyy.zza(this.zzd, this.zzb.zza(zzhyy.zza(bArr, bArr2), this.zzc)) : zzhyy.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zziac(zzhoe zzhoeVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzhoeVar.zzf().zzg());
        String.valueOf(strValueOf);
        String strValueOf2 = String.valueOf(strValueOf);
        this.zzb = new zziab("HMAC".concat(strValueOf2), new SecretKeySpec(zzhoeVar.zzd().zzc(zzhda.zza()), "HMAC"));
        this.zzc = zzhoeVar.zzf().zzd();
        this.zzd = zzhoeVar.zze().zzc();
        if (zzhoeVar.zzf().zzf().equals(zzhom.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zziac(zzhps zzhpsVar, int i) throws GeneralSecurityException {
        this.zzb = zzhpsVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzhpsVar.zza(new byte[0], i);
    }
}
