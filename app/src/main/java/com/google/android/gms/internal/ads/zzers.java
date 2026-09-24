package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzers extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzetb zza;

    public zzers(Context context, zzcmx zzcmxVar, zzfkl zzfklVar, zzdpr zzdprVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzetd zzetdVar = new zzetd(zzdprVar, zzcmxVar.zzD());
        zzetdVar.zza(zzbhVar);
        this.zza = new zzetb(new zzetn(zzcmxVar, context, zzetdVar, zzfklVar), zzfklVar.zzh());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzb(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zza.zzb(zzmVar, i);
    }
}
