package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgts {
    public static zzgto zza(zzgto zzgtoVar) {
        if ((zzgtoVar instanceof zzgtr) || (zzgtoVar instanceof zzgtp)) {
            return zzgtoVar;
        }
        return zzgtoVar instanceof Serializable ? new zzgtp(zzgtoVar) : new zzgtr(zzgtoVar);
    }
}
