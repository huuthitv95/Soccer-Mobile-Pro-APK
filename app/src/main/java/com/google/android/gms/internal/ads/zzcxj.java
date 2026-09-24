package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxj implements zzcxk {
    private final Map zza;

    zzcxj(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final zzelg zza(int i, String str) {
        return (zzelg) this.zza.get(str);
    }
}
