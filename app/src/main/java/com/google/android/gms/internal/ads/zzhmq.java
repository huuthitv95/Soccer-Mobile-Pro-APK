package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhmq {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhmq(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhmq zzd(zzhmp zzhmpVar, Class cls, Class cls2) {
        return new zzhmo(cls, cls2, zzhmpVar);
    }

    public abstract zzhnj zza(zzhdt zzhdtVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
