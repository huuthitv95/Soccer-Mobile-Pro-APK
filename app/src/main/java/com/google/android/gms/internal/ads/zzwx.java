package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwx extends zzzh {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzwv zze;
    private zzwu zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzwx(zzxe zzxeVar, boolean z) {
        boolean z2;
        super(zzxeVar);
        if (z) {
            zzxeVar.zzI();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzxeVar.zzH();
        this.zze = zzwv.zzp(zzxeVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzwv.zzc)) ? obj : this.zze.zzs();
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        zzwu zzwuVar = this.zzf;
        int iZze = this.zze.zze(zzwuVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzwv zzwvVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzwvVar.zzd(iZze, zzbdVar, false);
        long j2 = zzbdVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzwuVar.zzo(j);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwb, com.google.android.gms.internal.ads.zzxe
    public final void zzA(zzak zzakVar) {
        if (this.zzi) {
            zzwv zzwvVar = this.zze;
            this.zze = zzwvVar.zzr(zzzd.zzp(zzwvVar.zzb, zzakVar));
        } else {
            this.zze = zzwv.zzp(zzakVar);
        }
        this.zza.zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzzh) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzh, com.google.android.gms.internal.ads.zzxe
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzwu zzG(zzxc zzxcVar, zzabd zzabdVar, long j) {
        zzwu zzwuVar = new zzwu(zzxcVar, zzabdVar, j);
        zzwuVar.zzr(this.zza);
        if (this.zzh) {
            zzwuVar.zzt(zzxcVar.zza(zzK(zzxcVar.zza)));
            return zzwuVar;
        }
        this.zzf = zzwuVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzzh) this).zza);
        }
        return zzwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzh, com.google.android.gms.internal.ads.zzxe
    public final void zzD(zzxa zzxaVar) {
        ((zzwu) zzxaVar).zzu();
        if (zzxaVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzzh
    protected final void zzE(zzbf zzbfVar) {
        long jZza;
        zzxc zzxcVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbfVar);
            zzwu zzwuVar = this.zzf;
            if (zzwuVar != null) {
                zzL(zzwuVar.zzq());
            }
        } else if (zzbfVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzwv.zzq(zzbfVar, zzbe.zza, zzwv.zzc);
        } else {
            zzbe zzbeVar = this.zzc;
            zzbfVar.zzb(0, zzbeVar, 0L);
            Object obj = zzbeVar.zzb;
            zzwu zzwuVar2 = this.zzf;
            if (zzwuVar2 != null) {
                jZza = zzwuVar2.zza();
                this.zze.zzo(zzwuVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbeVar, 0L);
                if (jZza == 0) {
                    jZza = 0;
                }
            } else {
                jZza = 0;
            }
            Pair pairZzm = zzbfVar.zzm(zzbeVar, this.zzd, 0, jZza);
            Object obj2 = pairZzm.first;
            long jLongValue = ((Long) pairZzm.second).longValue();
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzwv.zzq(zzbfVar, obj, obj2);
            zzwu zzwuVar3 = this.zzf;
            if (zzwuVar3 != null && zzL(jLongValue)) {
                zzxc zzxcVar = zzwuVar3.zza;
                zzxcVarZza = zzxcVar.zza(zzK(zzxcVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzxcVarZza != null) {
            zzwu zzwuVar4 = this.zzf;
            zzwuVar4.getClass();
            zzwuVar4.zzt(zzxcVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    protected final zzxc zzF(zzxc zzxcVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzxcVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzwv.zzc;
        }
        return zzxcVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzwb
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbf zzz() {
        return this.zze;
    }
}
