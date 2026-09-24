package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaae extends zzbl {
    public static final zzaae zzJ = new zzaae(new zzaad());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzfk.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    private zzaae(zzaad zzaadVar) {
        super(zzaadVar);
        this.zzK = zzaadVar.zzz();
        this.zzL = false;
        this.zzM = zzaadVar.zzA();
        this.zzN = false;
        this.zzO = zzaadVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzaadVar.zzC();
        this.zzU = zzaadVar.zzD();
        this.zzV = zzaadVar.zzE();
        this.zzW = false;
        this.zzX = zzaadVar.zzF();
        this.zzY = false;
        this.zzZ = zzaadVar.zzG();
        this.zzaa = zzaadVar.zzH();
    }

    /* synthetic */ zzaae(zzaad zzaadVar, byte[] bArr) {
        this(zzaadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaae zzaaeVar = (zzaae) obj;
            if (super.equals(zzaaeVar) && this.zzK == zzaaeVar.zzK && this.zzM == zzaaeVar.zzM && this.zzO == zzaaeVar.zzO && this.zzT == zzaaeVar.zzT && this.zzU == zzaaeVar.zzU && this.zzV == zzaaeVar.zzV && this.zzX == zzaaeVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzaaeVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.zzZ;
                    SparseArray sparseArray2 = zzaaeVar.zzZ;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzzf zzzfVar = (zzzf) entry.getKey();
                                        if (!map2.containsKey(zzzfVar) || !Objects.equals(entry.getValue(), map2.get(zzzfVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i) {
        return this.zzaa.get(i);
    }

    @Deprecated
    public final boolean zzb(int i, zzzf zzzfVar) {
        Map map = (Map) this.zzZ.get(i);
        return map != null && map.containsKey(zzzfVar);
    }

    @Deprecated
    public final zzaaf zzc(int i, zzzf zzzfVar) {
        Map map = (Map) this.zzZ.get(i);
        if (map != null) {
            return (zzaaf) map.get(zzzfVar);
        }
        return null;
    }

    public final zzaad zzd() {
        return new zzaad(this, null);
    }

    final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }
}
