package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzxy extends zzagf {
    private final zzyt zza;
    private final zzafm zzb;
    private final AtomicReference zzc;

    zzxy(zzyt zzytVar) {
        super(zzytVar);
        this.zza = zzytVar;
        this.zzb = new zzafm();
        this.zzc = new AtomicReference(zzxx.PASS_THROUGH);
    }

    private final zzahb zzh() {
        return this.zzc.get() == zzxx.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagf, com.google.android.gms.internal.ads.zzahb
    public final int zza(zzj zzjVar, int i, boolean z) throws IOException {
        return zzh().zza(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagf, com.google.android.gms.internal.ads.zzahb
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        return zzh().zzb(zzjVar, i, z, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagf, com.google.android.gms.internal.ads.zzahb
    public final void zzc(zzes zzesVar, int i) {
        zzh().zzc(zzesVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzagf, com.google.android.gms.internal.ads.zzahb
    public final void zzd(zzes zzesVar, int i, int i2) {
        zzh().zzd(zzesVar, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagf, com.google.android.gms.internal.ads.zzahb
    public final void zze(long j, int i, int i2, int i3, zzaha zzahaVar) {
        zzh().zze(j, i, i2, i3, zzahaVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzxx.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzxx.DISCARDING);
        }
    }

    final boolean zzf() {
        return this.zzc.get() == zzxx.PASS_THROUGH;
    }
}
