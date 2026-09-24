package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaqw implements zzafp {
    private final int zza;
    private final List zzb;
    private final zzes zzc;
    private final SparseIntArray zzd;
    private final zzaqz zze;
    private final zzanc zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaqs zzj;
    private zzaqr zzk;
    private zzafs zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i = zzaqv.zza;
    }

    @Deprecated
    public zzaqw() {
        this(1, 1, zzanc.zza, new zzfh(0L), new zzapj(0), 112800);
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final boolean zza(zzafq zzafqVar) throws IOException {
        byte[] bArrZzi = this.zzc.zzi();
        zzafg zzafgVar = (zzafg) zzafqVar;
        zzafgVar.zzh(bArrZzi, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    zzafgVar.zze(i, false);
                    return true;
                }
                if (bArrZzi[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ List zzb() {
        return zzgvz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzafs zzafsVar) {
        if (this.zza == 0) {
            zzafsVar = new zzanf(zzafsVar, this.zzf);
        }
        this.zzl = zzafsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        long j;
        long jZzo = zzafqVar.zzo();
        long j2 = -1;
        if (this.zzn) {
            if (jZzo != -1) {
                zzaqs zzaqsVar = this.zzj;
                if (!zzaqsVar.zza()) {
                    return zzaqsVar.zzb(zzafqVar, zzagpVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzaqs zzaqsVar2 = this.zzj;
                if (zzaqsVar2.zzc() != -9223372036854775807L) {
                    j = 0;
                    zzaqr zzaqrVar = new zzaqr(zzaqsVar2.zzd(), zzaqsVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzaqrVar;
                    this.zzl.zzw(zzaqrVar.zza());
                } else {
                    j = 0;
                    this.zzl.zzw(new zzagr(zzaqsVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j, j);
                if (zzafqVar.zzn() != j) {
                    zzagpVar.zza = j;
                    return 1;
                }
            }
            zzaqr zzaqrVar2 = this.zzk;
            if (zzaqrVar2 != null && zzaqrVar2.zzc()) {
                return zzaqrVar2.zzd(zzafqVar, zzagpVar);
            }
        } else {
            j2 = -1;
        }
        zzes zzesVar = this.zzc;
        byte[] bArrZzi = zzesVar.zzi();
        if (9400 - zzesVar.zzg() < 188) {
            int iZzd = zzesVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzesVar.zzg(), bArrZzi, 0, iZzd);
            }
            zzesVar.zzb(bArrZzi, iZzd);
        }
        while (zzesVar.zzd() < 188) {
            int iZze = zzesVar.zze();
            int iZza = zzafqVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzarb zzarbVar = (zzarb) sparseArray.valueAt(i);
                    if (zzarbVar instanceof zzaqf) {
                        zzaqf zzaqfVar = (zzaqf) zzarbVar;
                        if (zzaqfVar.zzd(false)) {
                            zzaqfVar.zzc(new zzes(), 1);
                        }
                    }
                    i++;
                }
            } else {
                zzesVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzesVar.zzg();
        int iZze2 = zzesVar.zze();
        int iZza2 = zzarc.zza(zzesVar.zzi(), iZzg, iZze2);
        zzesVar.zzh(iZza2);
        int i2 = iZza2 + 188;
        if (i2 > iZze2) {
            this.zzq += iZza2 - iZzg;
        } else {
            this.zzq = 0;
        }
        int iZze3 = zzesVar.zze();
        if (i2 > iZze3) {
            return 0;
        }
        int iZzB = zzesVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzesVar.zzh(i2);
            return 0;
        }
        int i3 = (4194304 & iZzB) != 0 ? 1 : 0;
        int i4 = iZzB & 32;
        int i5 = (iZzB >> 8) & 8191;
        zzarb zzarbVar2 = (iZzB & 16) != 0 ? (zzarb) this.zzg.get(i5) : null;
        if (zzarbVar2 == null) {
            zzesVar.zzh(i2);
            return 0;
        }
        int i6 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i7 = sparseIntArray.get(i5, i6 - 1);
        sparseIntArray.put(i5, i6);
        if (i7 == i6) {
            zzesVar.zzh(i2);
            return 0;
        }
        if (i6 != ((i7 + 1) & 15)) {
            zzarbVar2.zzb();
        }
        if (i4 != 0) {
            int iZzs = zzesVar.zzs();
            i3 |= (zzesVar.zzs() & 64) != 0 ? 2 : 0;
            zzesVar.zzk(iZzs - 1);
        }
        boolean z = this.zzn;
        if (z || !this.zzi.get(i5, false)) {
            zzesVar.zzf(i2);
            zzarbVar2.zzc(zzesVar, i3);
            zzesVar.zzf(iZze3);
        }
        if (!z && this.zzn && jZzo != j2) {
            this.zzp = true;
        }
        zzesVar.zzh(i2);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(long j, long j2) {
        zzaqr zzaqrVar;
        List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzfh zzfhVar = (zzfh) list.get(i);
            if (zzfhVar.zzc() != -9223372036854775807L) {
                long jZza = zzfhVar.zza();
                if (jZza != -9223372036854775807L && jZza != 0 && jZza != j2) {
                    zzfhVar.zzd(j2);
                }
            } else {
                zzfhVar.zzd(j2);
            }
        }
        if (j2 != 0 && (zzaqrVar = this.zzk) != null) {
            zzaqrVar.zzb(j2);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i2 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzarb) sparseArray.valueAt(i2)).zzb();
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public /* synthetic */ zzafp zzg() {
        return zzafp.CC.$default$zzg(this);
    }

    final /* synthetic */ List zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzaqz zzi() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ zzafs zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i) {
        this.zzm = i;
    }

    final /* synthetic */ void zzp(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i) {
        this.zzr = i;
    }

    public zzaqw(int i, int i2, zzanc zzancVar, zzfh zzfhVar, zzaqz zzaqzVar, int i3) {
        this.zze = zzaqzVar;
        this.zza = i2;
        this.zzf = zzancVar;
        this.zzb = Collections.singletonList(zzfhVar);
        this.zzc = new zzes(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaqs(112800);
        this.zzl = zzafs.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzaqzVar.zza();
        int size = sparseArrayZza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(sparseArrayZza.keyAt(i4), (zzarb) sparseArrayZza.valueAt(i4));
        }
        this.zzg.put(0, new zzaqn(new zzaqt(this)));
    }
}
