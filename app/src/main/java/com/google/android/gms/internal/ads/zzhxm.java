package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhxm implements zzhdw {
    static final zzhky zza;
    static final zzhky zzb;
    static final zzhky zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zzhzf zzi;
    private final byte[] zzj;
    private final byte[] zzk;

    @Nullable
    private final Provider zzl;

    static {
        zzhkx zzhkxVarZza = zzhky.zza();
        zzhkxVarZza.zza(zzhzv.SHA256, zzhug.zza);
        zzhkxVarZza.zza(zzhzv.SHA384, zzhug.zzb);
        zzhkxVarZza.zza(zzhzv.SHA512, zzhug.zzc);
        zza = zzhkxVarZza.zzb();
        zzhkx zzhkxVarZza2 = zzhky.zza();
        zzhkxVarZza2.zza(zzhzf.IEEE_P1363, zzhuh.zza);
        zzhkxVarZza2.zza(zzhzf.DER, zzhuh.zzb);
        zzb = zzhkxVarZza2.zzb();
        zzhkx zzhkxVarZza3 = zzhky.zza();
        zzhkxVarZza3.zza(zzhze.NIST_P256, zzhuf.zza);
        zzhkxVarZza3.zza(zzhze.NIST_P384, zzhuf.zzb);
        zzhkxVarZza3.zza(zzhze.NIST_P521, zzhuf.zzc);
        zzc = zzhkxVarZza3.zzb();
    }

    private zzhxm(ECPublicKey eCPublicKey, zzhzv zzhzvVar, zzhzf zzhzfVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhkh.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zziaj.zza(zzhzvVar);
        this.zzg = eCPublicKey;
        this.zzi = zzhzfVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzhdw zzb(zzhun zzhunVar, @Nullable Provider provider) throws GeneralSecurityException {
        return new zzhxm((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzhzm.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhunVar.zzd(), zzhzg.zzb((zzhze) zzc.zzb(zzhunVar.zzf().zzd())))), (zzhzv) zza.zzb(zzhunVar.zzf().zze()), (zzhzf) zzb.zzb(zzhunVar.zzf().zzc()), zzhunVar.zze().zzc(), zzhunVar.zzf().zzf().equals(zzhui.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[RETURN] */
    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        byte b2;
        String str;
        Provider provider;
        Signature signature;
        byte[] bArr3;
        if (this.zzi == zzhzf.IEEE_P1363) {
            EllipticCurve curve = this.zzg.getParams().getCurve();
            int length = bArr.length;
            int iBitLength = (zzhkw.zzc(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != iBitLength + iBitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = zzhzg.zza(bArr);
        }
        int length2 = bArr.length;
        if (length2 >= 8 && bArr[0] == 48) {
            int i7 = bArr[1] & 255;
            if (i7 == 129) {
                i7 = bArr[2] & 255;
                if (i7 >= 128) {
                    i = 2;
                    if (i7 == (length2 - 1) - i && bArr[i + 1] == 2 && (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) < length2 && i2 != 0) {
                        b = bArr[i3];
                        if ((b & 255) < 128 && ((i2 <= 1 || b != 0 || (bArr[i + 4] & 255) >= 128) && bArr[i4] == 2)) {
                            i6 = bArr[i5] & 255;
                            if (i4 + 2 + i6 == length2 && i6 != 0) {
                                b2 = bArr[i + 5 + i2];
                                if ((b2 & 255) < 128 && (i6 <= 1 || b2 != 0 || (bArr[i + 6 + i2] & 255) >= 128)) {
                                    str = this.zzh;
                                    provider = this.zzl;
                                    if (provider != null) {
                                        signature = Signature.getInstance(str, provider);
                                    } else {
                                        signature = (Signature) zzhzm.zzc.zzb(str);
                                    }
                                    signature.initVerify(this.zzg);
                                    signature.update(bArr2);
                                    bArr3 = this.zzk;
                                    if (bArr3.length > 0) {
                                        signature.update(bArr3);
                                    }
                                    try {
                                        if (signature.verify(bArr)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i7 != 128 && i7 <= 129) {
                i = 1;
                if (i7 == (length2 - 1) - i) {
                    b = bArr[i3];
                    if ((b & 255) < 128) {
                        i6 = bArr[i5] & 255;
                        if (i4 + 2 + i6 == length2) {
                            b2 = bArr[i + 5 + i2];
                            if ((b2 & 255) < 128) {
                                str = this.zzh;
                                provider = this.zzl;
                                if (provider != null) {
                                    signature = Signature.getInstance(str, provider);
                                } else {
                                    signature = (Signature) zzhzm.zzc.zzb(str);
                                }
                                signature.initVerify(this.zzg);
                                signature.update(bArr2);
                                bArr3 = this.zzk;
                                if (bArr3.length > 0) {
                                    signature.update(bArr3);
                                }
                                if (signature.verify(bArr)) {
                                    return;
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhdw
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhnq.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
