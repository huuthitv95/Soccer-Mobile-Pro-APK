package com.google.android.gms.internal.ads;

import com.ironsource.C11341A5;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgwc<K, V> implements Map<K, V>, Serializable {
    private transient zzgwj zza;
    private transient zzgwj zzb;
    private transient zzgvv zzc;

    zzgwc() {
    }

    public static zzgwc zza() {
        return zzgxz.zza;
    }

    public static zzgwc zzb(Object obj, Object obj2) {
        zzguv.zza("dialog_not_shown_reason", obj2);
        return zzgxz.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgwc zzc(Map map) {
        if ((map instanceof zzgwc) && !(map instanceof SortedMap)) {
            zzgwc zzgwcVar = (zzgwc) map;
            zzgwcVar.zzj();
            return zzgwcVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgwb zzgwbVar = new zzgwb(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzgwbVar.zzb(setEntrySet);
        return zzgwbVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgxg.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgyj.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzguv.zzb(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(C11341A5.f23808U);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgwj entrySet() {
        zzgwj zzgwjVar = this.zza;
        if (zzgwjVar != null) {
            return zzgwjVar;
        }
        zzgwj zzgwjVarZze = zze();
        this.zza = zzgwjVarZze;
        return zzgwjVarZze;
    }

    abstract zzgwj zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgwj keySet() {
        zzgwj zzgwjVar = this.zzb;
        if (zzgwjVar != null) {
            return zzgwjVar;
        }
        zzgwj zzgwjVarZzg = zzg();
        this.zzb = zzgwjVarZzg;
        return zzgwjVarZzg;
    }

    abstract zzgwj zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgvv values() {
        zzgvv zzgvvVar = this.zzc;
        if (zzgvvVar != null) {
            return zzgvvVar;
        }
        zzgvv zzgvvVarZzi = zzi();
        this.zzc = zzgvvVarZzi;
        return zzgvvVarZzi;
    }

    abstract zzgvv zzi();

    abstract boolean zzj();
}
