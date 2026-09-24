package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmg {
    private static final zzhmg zza = new zzhmg();
    private final AtomicReference zzb = new AtomicReference(new zzhnb(new zzhmy(null), null));

    zzhmg() {
    }

    public static zzhmg zza() {
        return zza;
    }

    public final synchronized void zzb(zzhmx zzhmxVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhmy zzhmyVar = new zzhmy((zzhnb) atomicReference.get(), null);
        zzhmyVar.zza(zzhmxVar);
        atomicReference.set(new zzhnb(zzhmyVar, null));
    }

    public final synchronized void zzc(zzhnd zzhndVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhmy zzhmyVar = new zzhmy((zzhnb) atomicReference.get(), null);
        zzhmyVar.zzb(zzhndVar);
        atomicReference.set(new zzhnb(zzhmyVar, null));
    }

    public final Object zzd(zzhdc zzhdcVar, Class cls) throws GeneralSecurityException {
        return ((zzhnb) this.zzb.get()).zzb(zzhdcVar, cls);
    }

    public final Object zze(zzhdo zzhdoVar, Class cls) throws GeneralSecurityException {
        return ((zzhnb) this.zzb.get()).zzc(zzhdoVar, cls);
    }
}
