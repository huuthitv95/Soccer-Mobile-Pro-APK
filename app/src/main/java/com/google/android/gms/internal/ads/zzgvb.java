package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgvb extends AbstractSet {
    final /* synthetic */ zzgvg zza;

    /* synthetic */ zzgvb(zzgvg zzgvgVar, byte[] bArr) {
        Objects.requireNonNull(zzgvgVar);
        this.zza = zzgvgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgvg zzgvgVar = this.zza;
        Map mapZzc = zzgvgVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzi = zzgvgVar.zzi(entry.getKey());
            if (iZzi != -1 && Objects.equals(zzgvgVar.zzp(iZzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgvg zzgvgVar = this.zza;
        Map mapZzc = zzgvgVar.zzc();
        return mapZzc != null ? mapZzc.entrySet().iterator() : new zzguz(zzgvgVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iZzh;
        int iZze;
        zzgvg zzgvgVar = this.zza;
        Map mapZzc = zzgvgVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgvgVar.zzb() || (iZze = zzgvh.zze(entry.getKey(), entry.getValue(), (iZzh = zzgvgVar.zzh()), zzgvgVar.zzk(), zzgvgVar.zzl(), zzgvgVar.zzm(), zzgvgVar.zzn())) == -1) {
            return false;
        }
        zzgvgVar.zze(iZze, iZzh);
        zzgvgVar.zzu(zzgvgVar.zzt() - 1);
        zzgvgVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
