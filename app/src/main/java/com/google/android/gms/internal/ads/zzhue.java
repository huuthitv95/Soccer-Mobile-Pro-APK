package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhue {
    private zzhuh zza = null;
    private zzhuf zzb = null;
    private zzhug zzc = null;
    private zzhui zzd = zzhui.zzd;

    private zzhue() {
    }

    /* synthetic */ zzhue(byte[] bArr) {
    }

    public final zzhue zza(zzhuh zzhuhVar) {
        this.zza = zzhuhVar;
        return this;
    }

    public final zzhue zzb(zzhuf zzhufVar) {
        this.zzb = zzhufVar;
        return this;
    }

    public final zzhue zzc(zzhug zzhugVar) {
        this.zzc = zzhugVar;
        return this;
    }

    public final zzhue zzd(zzhui zzhuiVar) {
        this.zzd = zzhuiVar;
        return this;
    }

    public final zzhuj zze() throws GeneralSecurityException {
        zzhuh zzhuhVar = this.zza;
        if (zzhuhVar == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        zzhuf zzhufVar = this.zzb;
        if (zzhufVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        zzhug zzhugVar = this.zzc;
        if (zzhugVar == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        zzhui zzhuiVar = this.zzd;
        if (zzhuiVar == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (zzhufVar == zzhuf.zza && zzhugVar != zzhug.zza) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (zzhufVar == zzhuf.zzb && zzhugVar != zzhug.zzb && zzhugVar != zzhug.zzc) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zzhufVar != zzhuf.zzc || zzhugVar == zzhug.zzc) {
            return new zzhuj(zzhuhVar, zzhufVar, zzhugVar, zzhuiVar, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }
}
