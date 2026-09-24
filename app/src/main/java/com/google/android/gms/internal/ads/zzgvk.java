package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgvk extends zzgvm {
    zzgvk() {
        super(null);
    }

    static final zzgvm zzf(int i) {
        if (i < 0) {
            return zzgvm.zzb;
        }
        return i > 0 ? zzgvm.zzc : zzgvm.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final zzgvm zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final int zze() {
        return 0;
    }
}
