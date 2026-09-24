package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhlm {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhlm(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhlm zzd(zzhll zzhllVar, Class cls, Class cls2) {
        return new zzhlk(cls, cls2, zzhllVar);
    }

    public abstract zzhnj zza(zzhdc zzhdcVar, @Nullable zzhdx zzhdxVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
