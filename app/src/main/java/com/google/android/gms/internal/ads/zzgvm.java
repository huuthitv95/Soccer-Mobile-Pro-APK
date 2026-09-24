package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgvm {
    private static final zzgvm zza = new zzgvk();
    private static final zzgvm zzb = new zzgvl(-1);
    private static final zzgvm zzc = new zzgvl(1);

    /* synthetic */ zzgvm(byte[] bArr) {
    }

    public static zzgvm zzg() {
        return zza;
    }

    public abstract zzgvm zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgvm zzb(int i, int i2);

    public abstract zzgvm zzc(boolean z, boolean z2);

    public abstract zzgvm zzd(boolean z, boolean z2);

    public abstract int zze();
}
