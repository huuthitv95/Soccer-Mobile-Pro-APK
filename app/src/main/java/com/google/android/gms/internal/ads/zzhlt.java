package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhlt {
    private HashMap zza = new HashMap();

    public final zzhlu zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhlu zzhluVar = new zzhlu(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhluVar;
    }
}
