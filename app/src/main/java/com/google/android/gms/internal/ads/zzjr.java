package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjr {
    private final Map zza;
    private zzit zzb;

    /* synthetic */ zzjr(zzlb zzlbVar, int i, byte[] bArr) {
        Objects.requireNonNull(zzlbVar);
        this.zza = new HashMap();
        this.zzb = zzit.zza;
    }

    private static final zzit zzb(zzit zzitVar, List list) {
        zzis zzisVar = new zzis(zzitVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzitVar.zza()) {
            if (!hashSet.contains(str)) {
                zzisVar.zzf(str);
            }
        }
        return zzisVar.zzg();
    }

    final /* synthetic */ void zza(zzit zzitVar) {
        for (Map.Entry entry : new HashMap(this.zza).entrySet()) {
            zziu zziuVar = (zziu) entry.getKey();
            List list = (List) entry.getValue();
            if (!zzb(zzitVar, list).equals(zzb(this.zzb, list))) {
                zziuVar.zza();
            }
        }
        this.zzb = zzitVar;
    }
}
