package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhku {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhkn[][] zzd;
    static final zzhkn[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzg = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        zzh = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzi = bigIntegerModPow;
        zzhkt zzhktVar = new zzhkt(null);
        zzhktVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerZzc = zzhktVar.zzc();
        BigInteger bigIntegerMultiply = bigIntegerZzc.pow(2).subtract(BigInteger.ONE).multiply(bigIntegerMod.multiply(bigIntegerZzc.pow(2)).add(BigInteger.ONE).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzhktVar.zzb(bigIntegerModPow2);
        zza = zzhkz.zzg(zzb(bigIntegerMod));
        zzb = zzhkz.zzg(zzb(bigIntegerMod2));
        zzc = zzhkz.zzg(zzb(bigIntegerModPow));
        zzd = (zzhkn[][]) Array.newInstance((Class<?>) zzhkn.class, 32, 8);
        zzhkt zzhktVarZza = zzhktVar;
        for (int i = 0; i < 32; i++) {
            zzhkt zzhktVarZza2 = zzhktVarZza;
            for (int i2 = 0; i2 < 8; i2++) {
                zzd[i][i2] = zzc(zzhktVarZza2);
                zzhktVarZza2 = zza(zzhktVarZza2, zzhktVarZza);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                zzhktVarZza = zza(zzhktVarZza, zzhktVarZza);
            }
        }
        zzhkt zzhktVarZza3 = zza(zzhktVar, zzhktVar);
        zze = new zzhkn[8];
        for (int i4 = 0; i4 < 8; i4++) {
            zze[i4] = zzc(zzhktVar);
            zzhktVar = zza(zzhktVar, zzhktVarZza3);
        }
    }

    private static zzhkt zza(zzhkt zzhktVar, zzhkt zzhktVar2) {
        zzhkt zzhktVar3 = new zzhkt(null);
        BigInteger bigIntegerMultiply = zzg.multiply(zzhktVar.zza().multiply(zzhktVar2.zza()).multiply(zzhktVar.zzc()).multiply(zzhktVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        zzhktVar3.zzb(zzhktVar.zza().multiply(zzhktVar2.zzc()).add(zzhktVar2.zza().multiply(zzhktVar.zzc())).multiply(BigInteger.ONE.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        zzhktVar3.zzd(zzhktVar.zzc().multiply(zzhktVar2.zzc()).add(zzhktVar.zza().multiply(zzhktVar2.zza())).multiply(BigInteger.ONE.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return zzhktVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static zzhkn zzc(zzhkt zzhktVar) {
        BigInteger bigIntegerAdd = zzhktVar.zzc().add(zzhktVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhkn(zzhkz.zzg(zzb(bigIntegerAdd.mod(bigInteger))), zzhkz.zzg(zzb(zzhktVar.zzc().subtract(zzhktVar.zza()).mod(bigInteger))), zzhkz.zzg(zzb(zzh.multiply(zzhktVar.zza()).multiply(zzhktVar.zzc()).mod(bigInteger))));
    }
}
