package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwd extends zzgyn {
    final Iterator zza;
    Object zzb;
    Iterator zzc;
    final /* synthetic */ zzgwh zzd;

    zzgwd(zzgwh zzgwhVar) {
        Objects.requireNonNull(zzgwhVar);
        this.zzd = zzgwhVar;
        this.zza = zzgwhVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = zzgwp.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzgvv) entry.getValue()).iterator();
        }
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(this.zzb), this.zzc.next());
    }
}
