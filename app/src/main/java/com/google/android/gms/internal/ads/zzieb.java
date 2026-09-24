package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzieb extends AbstractList {
    private final zzidz zza;
    private final zziea zzb;

    public zzieb(zzidz zzidzVar, zziea zzieaVar) {
        this.zza = zzidzVar;
        this.zzb = zzieaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzf(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
