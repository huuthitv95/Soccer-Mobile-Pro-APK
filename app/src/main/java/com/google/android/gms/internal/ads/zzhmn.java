package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhmn {
    private final zziam zza;
    private final Class zzb;

    /* synthetic */ zzhmn(zziam zziamVar, Class cls, byte[] bArr) {
        this.zza = zziamVar;
        this.zzb = cls;
    }

    public static zzhmn zzd(zzhmm zzhmmVar, zziam zziamVar, Class cls) {
        return new zzhml(zziamVar, cls, zzhmmVar);
    }

    public abstract zzhdt zza(zzhnj zzhnjVar) throws GeneralSecurityException;

    public final zziam zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
