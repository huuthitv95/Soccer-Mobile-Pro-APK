package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhwc {
    private static final BigInteger zze;
    private static final BigInteger zzf;

    @Nullable
    private Integer zza = null;

    @Nullable
    private BigInteger zzb = zzhwf.zza;

    @Nullable
    private zzhwd zzc = null;
    private zzhwe zzd = zzhwe.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zze = bigIntegerValueOf;
        zzf = bigIntegerValueOf.pow(256);
    }

    private zzhwc() {
    }

    public final zzhwc zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhwc zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhwc zzc(zzhwe zzhweVar) {
        this.zzd = zzhweVar;
        return this;
    }

    public final zzhwc zzd(zzhwd zzhwdVar) {
        this.zzc = zzhwdVar;
        return this;
    }

    public final zzhwf zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.zza));
        }
        BigInteger bigInteger = this.zzb;
        int iCompareTo = bigInteger.compareTo(zzhwf.zza);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zze).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzf) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhwf(this.zza.intValue(), this.zzb, this.zzd, this.zzc, null);
    }

    /* synthetic */ zzhwc(byte[] bArr) {
    }
}
