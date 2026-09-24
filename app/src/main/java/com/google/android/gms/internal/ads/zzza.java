package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzza {
    private int zza;
    private final SparseArray zzb;
    private final zzds zzc;

    public zzza() {
        this(zzyz.zza);
    }

    public final void zzb(int i, Object obj) {
        if (this.zza == -1) {
            zzgsw.zzi(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzgsw.zza(i >= iKeyAt);
            if (iKeyAt == i) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    public final Object zzc() {
        SparseArray sparseArray = this.zzb;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void zzd(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i2 >= sparseArray.size() - 1) {
                return;
            }
            int i3 = i2 + 1;
            if (i < sparseArray.keyAt(i3)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i4 = this.zza;
            if (i4 > 0) {
                this.zza = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final void zze() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i));
                i++;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzza(zzds zzdsVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdsVar;
        this.zza = -1;
    }

    public final Object zza(int i) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 <= 0 || i >= this.zzb.keyAt(i2)) {
                break;
            }
            this.zza--;
        }
        while (true) {
            int i3 = this.zza;
            sparseArray = this.zzb;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }
}
