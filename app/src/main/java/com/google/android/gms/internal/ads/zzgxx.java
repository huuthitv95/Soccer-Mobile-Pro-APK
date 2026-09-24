package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxx extends zzgwj {
    private final transient zzgwc zza;
    private final transient zzgvz zzb;

    zzgxx(zzgwc zzgwcVar, zzgvz zzgvzVar) {
        this.zza = zzgwcVar;
        this.zzb = zzgvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgvv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgvv
    /* JADX INFO: renamed from: zza */
    public final zzgyn iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, com.google.android.gms.internal.ads.zzgvv
    public final zzgvz zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    final int zzg(Object[] objArr, int i) {
        return this.zzb.zzg(objArr, i);
    }
}
