package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwg {

    @Nullable
    private zzhwj zza = null;

    @Nullable
    private zzian zzb = null;

    @Nullable
    private zzian zzc = null;

    @Nullable
    private zzian zzd = null;

    @Nullable
    private zzian zze = null;

    @Nullable
    private zzian zzf = null;

    @Nullable
    private zzian zzg = null;

    private zzhwg() {
    }

    /* synthetic */ zzhwg(byte[] bArr) {
    }

    public final zzhwg zza(zzhwj zzhwjVar) {
        this.zza = zzhwjVar;
        return this;
    }

    public final zzhwg zzb(zzian zzianVar, zzian zzianVar2) {
        this.zzc = zzianVar;
        this.zzd = zzianVar2;
        return this;
    }

    public final zzhwg zzc(zzian zzianVar) {
        this.zzb = zzianVar;
        return this;
    }

    public final zzhwg zzd(zzian zzianVar, zzian zzianVar2) {
        this.zze = zzianVar;
        this.zzf = zzianVar2;
        return this;
    }

    public final zzhwg zze(zzian zzianVar) {
        this.zzg = zzianVar;
        return this;
    }

    public final zzhwh zzf() throws GeneralSecurityException {
        zzhwj zzhwjVar = this.zza;
        if (zzhwjVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerZzd = zzhwjVar.zzf().zzd();
        BigInteger bigIntegerZzd2 = this.zza.zzd();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzhda.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzhda.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzhda.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzhda.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzhda.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzhda.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(BigInteger.ONE);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(BigInteger.ONE);
        if (!bigIntegerZzd.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(BigInteger.ONE)) {
            return new zzhwh(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
