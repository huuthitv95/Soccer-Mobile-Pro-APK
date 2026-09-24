package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaad extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzaad() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    protected final zzaad zzx(zzbl zzblVar) {
        super.zza(zzblVar);
        return this;
    }

    public final zzaad zzy(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i) == z) {
            return this;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
            return this;
        }
        sparseBooleanArray.delete(i);
        return this;
    }

    final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    /* synthetic */ zzaad(zzaae zzaaeVar, byte[] bArr) {
        super(zzaaeVar);
        this.zza = zzaaeVar.zzK;
        this.zzb = zzaaeVar.zzM;
        this.zzc = zzaaeVar.zzO;
        this.zzd = zzaaeVar.zzT;
        this.zze = zzaaeVar.zzU;
        this.zzf = zzaaeVar.zzV;
        this.zzg = zzaaeVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArrayZze = zzaaeVar.zze();
            if (i < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i), new HashMap((Map) sparseArrayZze.valueAt(i)));
                i++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzaaeVar.zzf().clone();
                return;
            }
        }
    }
}
