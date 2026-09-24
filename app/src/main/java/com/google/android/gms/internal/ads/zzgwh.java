package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzgwh<K, V> extends zzgut<K, V> implements Serializable {
    final transient zzgwc<K, ? extends zzgvv<V>> map;
    final transient int size;

    zzgwh(zzgwc zzgwcVar, int i) {
        this.map = zzgwcVar;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgxh
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgxh
    @Deprecated
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxh
    @Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    final Set zzh() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    final /* synthetic */ Collection zzj() {
        return new zzgwg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    final Map zzl() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgus
    public final boolean zzr(Object obj) {
        return obj != null && super.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgxh
    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgxh
    public /* synthetic */ Map zzu() {
        return this.map;
    }
}
