package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgsu implements Serializable {
    zzgsu() {
    }

    public static zzgsu zzc() {
        return zzgsd.zza;
    }

    public static zzgsu zzd(Object obj) {
        return obj == null ? zzgsd.zza : new zzgtb(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgsu zzb(zzgsn zzgsnVar);
}
