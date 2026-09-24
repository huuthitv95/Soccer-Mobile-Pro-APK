package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhmx {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhmx(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhmx zzd(zzhmw zzhmwVar, Class cls, Class cls2) {
        return new zzhmv(cls, cls2, zzhmwVar);
    }

    public abstract Object zza(zzhdc zzhdcVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
