package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzgwm<K, V> extends zzgwh<K, V> implements zzgxh<K, V> {
    private final transient zzgwj<V> emptySet;
    private transient zzgwj zza;

    zzgwm(zzgwc zzgwcVar, int i, Comparator comparator) {
        super(zzgwcVar, i);
        this.emptySet = zzgya.zza;
    }

    public final zzgwj zza() {
        zzgwj zzgwjVar = this.zza;
        if (zzgwjVar != null) {
            return zzgwjVar;
        }
        zzgwl zzgwlVar = new zzgwl(this);
        this.zza = zzgwlVar;
        return zzgwlVar;
    }
}
