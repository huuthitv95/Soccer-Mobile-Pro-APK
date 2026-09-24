package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzicf extends zzicg {
    final /* synthetic */ zzicn zza;
    private int zzb;
    private final int zzc;

    zzicf(zzicn zzicnVar) {
        Objects.requireNonNull(zzicnVar);
        this.zza = zzicnVar;
        this.zzb = 0;
        this.zzc = zzicnVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzici
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zza(i);
    }
}
