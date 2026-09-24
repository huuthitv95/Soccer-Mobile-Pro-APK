package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzifq extends zzicg {
    final zzifs zza;
    zzici zzb;
    final /* synthetic */ zzift zzc;

    zzifq(zzift zziftVar) {
        Objects.requireNonNull(zziftVar);
        this.zzc = zziftVar;
        this.zza = new zzifs(zziftVar, null);
        this.zzb = zzb();
    }

    private final zzici zzb() {
        zzifs zzifsVar = this.zza;
        if (zzifsVar.hasNext()) {
            return zzifsVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzici
    public final byte zza() {
        zzici zziciVar = this.zzb;
        if (zziciVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zziciVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
