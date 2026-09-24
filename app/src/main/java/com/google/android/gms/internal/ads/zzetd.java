package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzetd {
    private final zzdpr zza;
    private final zzesq zzb;
    private final zzdci zzc;

    public zzetd(zzdpr zzdprVar, zzdyz zzdyzVar) {
        this.zza = zzdprVar;
        final zzesq zzesqVar = new zzesq(zzdyzVar);
        this.zzb = zzesqVar;
        final zzbry zzbryVarZze = zzdprVar.zze();
        this.zzc = new zzdci() { // from class: com.google.android.gms.internal.ads.zzetc
            @Override // com.google.android.gms.internal.ads.zzdci
            public final /* synthetic */ void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzesqVar.zzdJ(zzeVar);
                zzbry zzbryVar = zzbryVarZze;
                if (zzbryVar != null) {
                    try {
                        zzbryVar.zzg(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbryVar != null) {
                    try {
                        zzbryVar.zzf(zzeVar.zza);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzl(zzbhVar);
    }

    public final zzdnl zzb() {
        return new zzdnl(this.zza, this.zzb.zzi());
    }

    public final zzesq zzc() {
        return this.zzb;
    }

    public final zzddt zzd() {
        return this.zzb;
    }

    public final zzdci zze() {
        return this.zzc;
    }
}
