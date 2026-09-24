package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzguj extends zzguc implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzgup zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzguj(zzgup zzgupVar, SortedMap sortedMap) {
        super(zzgupVar, sortedMap);
        Objects.requireNonNull(zzgupVar);
        this.zze = zzgupVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzg().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzg().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzguj(this.zze, zzg().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzg().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzguj(this.zze, zzg().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzguj(this.zze, zzg().tailMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgxf
    /* JADX INFO: renamed from: zze */
    public SortedSet zzh() {
        return new zzguk(this.zze, zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzguc, com.google.android.gms.internal.ads.zzgxf, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetZzh = zzh();
        this.zzd = sortedSetZzh;
        return sortedSetZzh;
    }

    SortedMap zzg() {
        return (SortedMap) this.zza;
    }
}
