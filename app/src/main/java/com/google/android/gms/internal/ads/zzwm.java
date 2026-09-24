package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwm implements zzyw {
    private final zzgvz zza;
    private long zzb;

    public zzwm(List list, List list2) {
        int i = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        zzgsw.zza(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgvwVar.zzf(new zzwl((zzyw) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzgvwVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
        int i = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                return;
            }
            ((zzwl) zzgvzVar.get(i)).zzg(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                break;
            }
            zzwl zzwlVar = (zzwl) zzgvzVar.get(i);
            long jZzi = zzwlVar.zzi();
            if ((zzwlVar.zza().contains(1) || zzwlVar.zza().contains(2) || zzwlVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                break;
            }
            long jZzl = ((zzwl) zzgvzVar.get(i)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        boolean zZzm;
        boolean z = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zZzm = false;
            while (true) {
                zzgvz zzgvzVar = this.zza;
                if (i >= zzgvzVar.size()) {
                    break;
                }
                long jZzl2 = ((zzwl) zzgvzVar.get(i)).zzl();
                boolean z2 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzluVar.zza;
                if (jZzl2 == jZzl || z2) {
                    zZzm |= ((zzwl) zzgvzVar.get(i)).zzm(zzluVar);
                }
                i++;
            }
            z |= zZzm;
        } while (zZzm);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        int i = 0;
        while (true) {
            zzgvz zzgvzVar = this.zza;
            if (i >= zzgvzVar.size()) {
                return false;
            }
            if (((zzwl) zzgvzVar.get(i)).zzn()) {
                return true;
            }
            i++;
        }
    }
}
