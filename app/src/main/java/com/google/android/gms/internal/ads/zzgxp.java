package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxp extends zzgty {
    final transient zzgto zza;

    zzgxp(Map map, zzgto zzgtoVar) {
        super(map);
        this.zza = zzgtoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgty, com.google.android.gms.internal.ads.zzgup
    protected final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgus
    final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgus
    final Map zzl() {
        return zzm();
    }
}
