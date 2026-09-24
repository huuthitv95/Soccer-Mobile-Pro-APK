package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzta implements zzqn {
    final /* synthetic */ zztj zza;
    private final zzqy zzb;

    /* synthetic */ zzta(zztj zztjVar, zzqy zzqyVar, byte[] bArr) {
        Objects.requireNonNull(zztjVar);
        this.zza = zztjVar;
        this.zzb = zzqyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zza(long j) {
        zztj zztjVar = this.zza;
        if (equals(zztjVar.zzJ()) && zztjVar.zzK() != null) {
            zztp zztpVar = ((zzto) zztjVar.zzK()).zza;
            zztpVar.zzaC(true);
            zztpVar.zzaz().zzd(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzb() {
        zzmt zzmtVarZzbc;
        zztj zztjVar = this.zza;
        if (equals(zztjVar.zzJ()) && zztjVar.zzK() != null && zztjVar.zzO() && (zzmtVarZzbc = ((zzto) zztjVar.zzK()).zza.zzbc()) != null) {
            zzmtVarZzbc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzc() {
        zztj zztjVar = this.zza;
        if (equals(zztjVar.zzJ())) {
            zztjVar.zzN(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzd() {
        long jZzt;
        zztj zztjVar = this.zza;
        if (equals(zztjVar.zzJ()) && zztjVar.zzK() != null) {
            if (zztjVar.zzL().zzi() != -1) {
                long jZzi = zztjVar.zzL().zzj().zze / zztjVar.zzL().zzi();
                zzqp zzqpVarZzM = zztjVar.zzM();
                zzqpVarZzM.getClass();
                jZzt = zzfk.zzt(jZzi, zzqpVarZzM.zzi());
            } else {
                jZzt = -9223372036854775807L;
            }
            ((zzto) zztjVar.zzK()).zza.zzaz().zze(zztjVar.zzL().zzj().zze, zzfk.zzr(jZzt), SystemClock.elapsedRealtime() - zztjVar.zzP());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zze() {
        zztj.zza.getAndDecrement();
        zztj zztjVar = this.zza;
        if (zztjVar.zzK() != null) {
            zzqy zzqyVar = this.zzb;
            ((zzto) zztjVar.zzK()).zza.zzaz().zzl(new zzrq(zzqyVar.zza, zzqyVar.zzb, zzqyVar.zzc, false, false, zzqyVar.zze));
        }
    }
}
