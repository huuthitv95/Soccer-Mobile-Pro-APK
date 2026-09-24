package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgxt implements Comparator {
    protected zzgxt() {
    }

    public static zzgxt zzb() {
        return zzgxr.zza;
    }

    public static zzgxt zzc(Comparator comparator) {
        return new zzgvi(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgxt zza() {
        return new zzgyc(this);
    }

    public final zzgxt zzd(zzgsn zzgsnVar) {
        return new zzguu(zzgsnVar, this);
    }
}
