package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzht extends zzgvp {
    private final Map zza;

    public zzht(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final Set entrySet() {
        return zzgyj.zzb(this.zza.entrySet(), zzhr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final int hashCode() {
        return super.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final Set keySet() {
        return zzgyj.zzb(this.zza.keySet(), zzhs.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgvp
    protected final Map zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvp, com.google.android.gms.internal.ads.zzgvq
    protected final /* synthetic */ Object zzb() {
        return this.zza;
    }
}
