package com.google.android.gms.internal.nearby;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhy<T> implements Serializable {
    zzhy() {
    }

    public static <T> zzhy<T> zzc() {
        return zzhx.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();

    public static <T> zzhy<T> zzd(T t) {
        t.getClass();
        return new zzia(t);
    }
}
