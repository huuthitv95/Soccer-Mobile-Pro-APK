package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzni {
    private final zzs zza;
    private final SparseArray zzb;

    public zzni(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i = 0; i < zzsVar.zzb(); i++) {
            int iZzc = zzsVar.zzc(i);
            zznh zznhVar = (zznh) sparseArray.get(iZzc);
            zznhVar.getClass();
            sparseArray2.append(iZzc, zznhVar);
        }
        this.zzb = sparseArray2;
    }

    public final zznh zza(int i) {
        zznh zznhVar = (zznh) this.zzb.get(i);
        zznhVar.getClass();
        return zznhVar;
    }

    public final boolean zzb(int i) {
        return this.zza.zza(i);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i) {
        return this.zza.zzc(i);
    }
}
