package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxv extends zzgvz {
    final /* synthetic */ zzgxw zza;

    zzgxv(zzgxw zzgxwVar) {
        Objects.requireNonNull(zzgxwVar);
        this.zza = zzgxwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzgxw zzgxwVar = this.zza;
        zzgsw.zzm(i, zzgxwVar.zzx(), "index");
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(zzgxwVar.zzw()[i2]), Objects.requireNonNull(zzgxwVar.zzw()[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public final boolean zzf() {
        return true;
    }
}
