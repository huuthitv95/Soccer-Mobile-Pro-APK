package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzanf implements zzafs {
    private final zzafs zzb;
    private final zzanc zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzanf(zzafs zzafsVar, zzanc zzancVar) {
        this.zzb = zzafsVar;
        this.zzc = zzancVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzahb zzu(int i, int i2) {
        if (i2 != 3 && i2 != 5) {
            this.zze = true;
        }
        if (i2 != 3) {
            return this.zzb.zzu(i, i2);
        }
        SparseArray sparseArray = this.zzd;
        zzanh zzanhVar = (zzanh) sparseArray.get(i);
        if (zzanhVar != null) {
            return zzanhVar;
        }
        zzanh zzanhVar2 = new zzanh(this.zzb.zzu(i, 3), this.zzc);
        sparseArray.put(i, zzanhVar2);
        return zzanhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzanh) sparseArray.valueAt(i)).zzf(true);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzw(zzags zzagsVar) {
        this.zzb.zzw(zzagsVar);
    }
}
