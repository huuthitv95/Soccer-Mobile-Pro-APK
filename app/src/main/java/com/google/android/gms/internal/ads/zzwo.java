package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzwo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzhi zzc;

    public zzwo(zzafv zzafvVar, zzanc zzancVar) {
    }

    public final void zza(zzhi zzhiVar) {
        if (zzhiVar != this.zzc) {
            this.zzc = zzhiVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
