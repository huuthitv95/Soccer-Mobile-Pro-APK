package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgn extends zzhek {
    private final zzhgp zza;
    private final zziam zzb;

    @Nullable
    private final Integer zzc;

    private zzhgn(zzhgp zzhgpVar, zziam zziamVar, @Nullable Integer num) {
        this.zza = zzhgpVar;
        this.zzb = zziamVar;
        this.zzc = num;
    }

    public static zzhgn zzd(zzhgp zzhgpVar, @Nullable Integer num) throws GeneralSecurityException {
        zziam zziamVarZza;
        if (zzhgpVar.zzd() == zzhgo.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zziamVarZza = zziam.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzhgpVar.zzd() != zzhgo.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzhgpVar.zzd().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zziamVarZza = zziam.zza(new byte[0]);
        }
        return new zzhgn(zzhgpVar, zziamVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhek, com.google.android.gms.internal.ads.zzhdc
    public final /* synthetic */ zzhdt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final zziam zzc() {
        return this.zzb;
    }

    public final zzhgp zze() {
        return this.zza;
    }
}
