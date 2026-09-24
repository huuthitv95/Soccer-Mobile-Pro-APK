package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmj {
    private static final zzhmj zza = (zzhmj) zzhnp.zza(zzhmi.zza);
    private final AtomicReference zzb = new AtomicReference(new zzhnn(new zzhnk(), null));

    public static zzhmj zza() {
        return zza;
    }

    public final synchronized void zzb(zzhlm zzhlmVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhnk zzhnkVar = new zzhnk((zzhnn) atomicReference.get());
        zzhnkVar.zza(zzhlmVar);
        atomicReference.set(new zzhnn(zzhnkVar, null));
    }

    public final synchronized void zzc(zzhlj zzhljVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhnk zzhnkVar = new zzhnk((zzhnn) atomicReference.get());
        zzhnkVar.zzb(zzhljVar);
        atomicReference.set(new zzhnn(zzhnkVar, null));
    }

    public final synchronized void zzd(zzhmq zzhmqVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhnk zzhnkVar = new zzhnk((zzhnn) atomicReference.get());
        zzhnkVar.zzc(zzhmqVar);
        atomicReference.set(new zzhnn(zzhnkVar, null));
    }

    public final synchronized void zze(zzhmn zzhmnVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhnk zzhnkVar = new zzhnk((zzhnn) atomicReference.get());
        zzhnkVar.zzd(zzhmnVar);
        atomicReference.set(new zzhnn(zzhnkVar, null));
    }

    public final boolean zzf(zzhnj zzhnjVar) {
        return ((zzhnn) this.zzb.get()).zza(zzhnjVar);
    }

    public final zzhdc zzg(zzhnj zzhnjVar, @Nullable zzhdx zzhdxVar) throws GeneralSecurityException {
        return ((zzhnn) this.zzb.get()).zzb(zzhnjVar, zzhdxVar);
    }

    public final zzhnj zzh(zzhdc zzhdcVar, Class cls, @Nullable zzhdx zzhdxVar) throws GeneralSecurityException {
        return ((zzhnn) this.zzb.get()).zzc(zzhdcVar, cls, zzhdxVar);
    }

    public final boolean zzi(zzhnj zzhnjVar) {
        return ((zzhnn) this.zzb.get()).zzd(zzhnjVar);
    }

    public final zzhdt zzj(zzhnj zzhnjVar) throws GeneralSecurityException {
        return ((zzhnn) this.zzb.get()).zze(zzhnjVar);
    }

    public final zzhnj zzk(zzhdt zzhdtVar, Class cls) throws GeneralSecurityException {
        return ((zzhnn) this.zzb.get()).zzf(zzhdtVar, cls);
    }
}
