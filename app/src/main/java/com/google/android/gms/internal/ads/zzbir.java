package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbir {
    private final Map zza = new HashMap();
    private final zzbit zzb;

    public zzbir(zzbit zzbitVar) {
        this.zzb = zzbitVar;
    }

    public final void zza(String str, zzbiq zzbiqVar) {
        this.zza.put(str, zzbiqVar);
    }

    public final void zzb(String str, String str2, long j) {
        Map map = this.zza;
        zzbiq zzbiqVar = (zzbiq) map.get(str2);
        String[] strArr = {str};
        if (zzbiqVar != null) {
            this.zzb.zzb(zzbiqVar, j, strArr);
        }
        map.put(str, new zzbiq(j, null, null));
    }

    public final zzbit zzc() {
        return this.zzb;
    }
}
