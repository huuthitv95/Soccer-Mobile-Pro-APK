package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcuu extends zzbfw {
    private final zzcut zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzffs zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbs)).booleanValue();
    private final zzdyz zze;

    public zzcuu(zzcut zzcutVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzffs zzffsVar, zzdyz zzdyzVar) {
        this.zza = zzcutVar;
        this.zzb = zzbuVar;
        this.zzc = zzffsVar;
        this.zze = zzdyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzf(IObjectWrapper iObjectWrapper, zzbge zzbgeVar) {
        try {
            this.zzc.zzp(zzbgeVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbgeVar, this.zzd);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final com.google.android.gms.ads.internal.client.zzdx zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhI)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzh(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzr(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final long zzk() {
        zzcut zzcutVar = this.zza;
        if (zzcutVar == null || zzcutVar.zzo() == null) {
            return 0L;
        }
        return zzcutVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzl(long j) {
        zzcut zzcutVar = this.zza;
        if (zzcutVar == null || zzcutVar.zzo() == null) {
            return;
        }
        zzcutVar.zzo().zzb(j);
    }
}
