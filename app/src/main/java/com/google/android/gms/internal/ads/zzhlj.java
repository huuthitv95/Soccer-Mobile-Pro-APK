package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhlj {
    private final zziam zza;
    private final Class zzb;

    /* synthetic */ zzhlj(zziam zziamVar, Class cls, byte[] bArr) {
        this.zza = zziamVar;
        this.zzb = cls;
    }

    public static zzhlj zzd(zzhli zzhliVar, zziam zziamVar, Class cls) {
        return new zzhlh(zziamVar, cls, zzhliVar);
    }

    public abstract zzhdc zza(zzhnj zzhnjVar, @Nullable zzhdx zzhdxVar) throws GeneralSecurityException;

    public final zziam zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
