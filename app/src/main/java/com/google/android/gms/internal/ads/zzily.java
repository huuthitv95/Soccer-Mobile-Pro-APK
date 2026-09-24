package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzily implements Iterator {
    int zza = 0;
    final /* synthetic */ zzilz zzb;

    zzily(zzilz zzilzVar) {
        this.zzb = zzilzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zza;
        zzilz zzilzVar = this.zzb;
        return i < zzilzVar.zza.size() || zzilzVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zza;
        zzilz zzilzVar = this.zzb;
        List list = zzilzVar.zza;
        if (i >= list.size()) {
            list.add(zzilzVar.zzb.next());
            return next();
        }
        int i2 = this.zza;
        this.zza = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
